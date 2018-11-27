package com.enis.dataset.services;

import com.enis.dataset.GraphManipulation.GraphStats.BUNetStats;
import com.enis.dataset.GraphManipulation.GraphStats.SocialMediaStats;
import com.enis.dataset.GraphManipulation.GraphStats.Statistics;
import com.enis.dataset.repositories.StatsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

/**
 * Created by amina on 16/11/2018.
 */
@Service
public class StatsService {
    @Autowired
    StatsRepository datasetRep;

    public BUNetStats getStatistics(){
        BUNetStats datasetStats = new BUNetStats();
        Collection<SocialMediaStats> labelsStats;
        Statistics stats;
        labelsStats=datasetRep.getNodeLabelsStats();
        stats=datasetRep.getDatasetStats();
        datasetStats.setStats(stats);
        datasetStats.setLabelStats(labelsStats);
        return datasetStats;
    }

}