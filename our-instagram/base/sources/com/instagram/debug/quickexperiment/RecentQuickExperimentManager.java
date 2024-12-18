package com.instagram.debug.quickexperiment;

import X.AbstractC20080yf;
import X.AbstractC31171DnF;
import X.C0K8;
import X.C14360o3;
import X.C16V;
import X.C17280tP;
import X.MSX;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes11.dex */
public final class RecentQuickExperimentManager {
    public static final RecentQuickExperimentManager INSTANCE = new Object();
    public static final int NUM_RECENT_EXPERIMENTS = 5;
    public static final Class TAG = RecentQuickExperimentManager.class;

    public static final void markRecentExperimentParameter(AbstractC20080yf abstractC20080yf) {
        C14360o3.A0B(abstractC20080yf, 0);
        RecentQuickExperimentManager recentQuickExperimentManager = INSTANCE;
        List recentExperimentParameters = getRecentExperimentParameters();
        recentExperimentParameters.remove(abstractC20080yf);
        if (recentExperimentParameters.size() == 5) {
            recentExperimentParameters.remove(4);
        }
        recentExperimentParameters.add(0, abstractC20080yf);
        recentQuickExperimentManager.save(recentExperimentParameters);
    }

    public static final List getRecentExperimentParameters() {
        List arrayList;
        C17280tP A00 = C17280tP.A4E.A00();
        String A0j = MSX.A0j(A00, A00.A2R, C17280tP.A4G, 135);
        if (A0j != null) {
            try {
                arrayList = RecentExperimentsStorageModel__JsonHelper.parseFromJson(C16V.A00(A0j)).recentExperimentParameters;
            } catch (IOException unused) {
                arrayList = new ArrayList();
            }
            C14360o3.A0A(arrayList);
            return arrayList;
        }
        return new ArrayList();
    }

    private final void save(List list) {
        RecentExperimentsStorageModel recentExperimentsStorageModel = new RecentExperimentsStorageModel(list);
        try {
            C17280tP A00 = C17280tP.A4E.A00();
            AbstractC31171DnF.A1S(A00, RecentExperimentsStorageModel__JsonHelper.serializeToJson(recentExperimentsStorageModel), A00.A2R, C17280tP.A4G, 135);
        } catch (IOException e) {
            C0K8.A05(TAG, "failed to save Recent Experiments json", e);
        }
    }
}
