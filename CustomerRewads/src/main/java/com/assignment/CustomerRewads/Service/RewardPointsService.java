package com.assignment.CustomerRewads.Service;

import org.springframework.stereotype.Service;

import com.assignment.CustomerRewads.DAO.RewardPoints;
import com.assignment.CustomerRewads.DAO.Transaction;

@Service
public class RewardPointsService {
	
	public RewardPoints calculateRewardPoints(Transaction transaction) {
        double amount = transaction.getAmount();
        int points = 0;

        if (amount > 100) {
            points += 2 * (int) (amount - 100);
        }
        if (amount > 50) {
            points += (int) Math.min(amount, 100) - 50;
        }

        RewardPoints rewardPoints = new RewardPoints(null, points);
        rewardPoints.setCustomerName(transaction.getCustomerName());
        rewardPoints.setTotalPoints(points);

        return rewardPoints;
    }

}
