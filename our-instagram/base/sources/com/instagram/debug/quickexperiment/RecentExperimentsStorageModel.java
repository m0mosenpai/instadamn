package com.instagram.debug.quickexperiment;

import X.AbstractC20080yf;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes11.dex */
public final class RecentExperimentsStorageModel {
    public List recentExperimentParameterNames;
    public List recentExperimentParameters;
    public List recentUniverseNames;

    public List getRecentExperimentParameters() {
        return new ArrayList(this.recentExperimentParameters);
    }

    public RecentExperimentsStorageModel postprocess() {
        this.recentExperimentParameters = new ArrayList();
        for (int i = 0; i < this.recentExperimentParameterNames.size(); i++) {
            String str = (String) this.recentExperimentParameterNames.get(i);
            String str2 = (String) this.recentUniverseNames.get(i);
            Iterator it = QuickExperimentHelper.getAllExperiments().iterator();
            while (true) {
                if (it.hasNext()) {
                    AbstractC20080yf abstractC20080yf = (AbstractC20080yf) it.next();
                    if (str.equals(abstractC20080yf.name) && str2.equals(abstractC20080yf.universeName)) {
                        this.recentExperimentParameters.add(abstractC20080yf);
                        break;
                    }
                }
            }
        }
        return this;
    }

    public RecentExperimentsStorageModel(List list) {
        this.recentExperimentParameters = new ArrayList();
        this.recentExperimentParameterNames = new ArrayList();
        this.recentUniverseNames = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AbstractC20080yf abstractC20080yf = (AbstractC20080yf) it.next();
            this.recentExperimentParameterNames.add(abstractC20080yf.name);
            this.recentUniverseNames.add(abstractC20080yf.universeName);
        }
    }

    public RecentExperimentsStorageModel() {
        this.recentExperimentParameters = new ArrayList();
    }
}
