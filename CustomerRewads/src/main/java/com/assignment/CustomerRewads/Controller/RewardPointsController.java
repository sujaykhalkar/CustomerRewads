package com.assignment.CustomerRewads.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.assignment.CustomerRewads.DAO.RewardPoints;
import com.assignment.CustomerRewads.DAO.Transaction;
import com.assignment.CustomerRewads.Service.RewardPointsService;

@RestController
@RequestMapping("/api/reward-points")
public class RewardPointsController {

	 @Autowired
	    private RewardPointsService rewardPointsService;

	    @PostMapping("/calculate")
	    public ResponseEntity<RewardPoints> calculateRewardPoints(@RequestBody Transaction transaction) {
	        RewardPoints rewardPoints = rewardPointsService.calculateRewardPoints(transaction);
	        return ResponseEntity.ok(rewardPoints);
	    }
}
