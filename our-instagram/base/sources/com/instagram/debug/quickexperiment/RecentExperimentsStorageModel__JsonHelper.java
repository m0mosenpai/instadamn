package com.instagram.debug.quickexperiment;

import X.AbstractC166997dE;
import X.AbstractC167017dG;
import X.AbstractC167027dH;
import X.AbstractC221915u;
import X.AnonymousClass182;
import X.C16L;
import X.C16R;
import X.C16V;
import X.C17z;
import X.C1EH;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes11.dex */
public final class RecentExperimentsStorageModel__JsonHelper {
    public static RecentExperimentsStorageModel parseFromJson(C16L c16l) {
        return (RecentExperimentsStorageModel) C16V.A01(c16l, new C1EH() { // from class: com.instagram.debug.quickexperiment.RecentExperimentsStorageModel__JsonHelper.1
            @Override // X.C1EH
            public RecentExperimentsStorageModel invoke(C16L c16l2) {
                return RecentExperimentsStorageModel__JsonHelper.unsafeParseFromJson(c16l2);
            }

            @Override // X.C1EH
            public /* bridge */ /* synthetic */ Object invoke(C16L c16l2) {
                return RecentExperimentsStorageModel__JsonHelper.unsafeParseFromJson(c16l2);
            }
        });
    }

    public static boolean processSingleField(RecentExperimentsStorageModel recentExperimentsStorageModel, String str, C16L c16l) {
        ArrayList arrayList = null;
        if ("parameterNames".equals(str)) {
            if (c16l.A11() == C16R.A0C) {
                arrayList = new ArrayList();
                while (c16l.A1J() != C16R.A08) {
                    AbstractC167027dH.A0w(c16l, arrayList);
                }
            }
            recentExperimentsStorageModel.recentExperimentParameterNames = arrayList;
            return true;
        }
        if ("universeNames".equals(str)) {
            if (c16l.A11() == C16R.A0C) {
                arrayList = new ArrayList();
                while (c16l.A1J() != C16R.A08) {
                    AbstractC167027dH.A0w(c16l, arrayList);
                }
            }
            recentExperimentsStorageModel.recentUniverseNames = arrayList;
            return true;
        }
        return false;
    }

    public static void serializeToJson(AnonymousClass182 anonymousClass182, RecentExperimentsStorageModel recentExperimentsStorageModel, boolean z) {
        if (z) {
            anonymousClass182.A0d();
        }
        if (recentExperimentsStorageModel.recentExperimentParameterNames != null) {
            C16V.A03(anonymousClass182, "parameterNames");
            Iterator it = recentExperimentsStorageModel.recentExperimentParameterNames.iterator();
            while (it.hasNext()) {
                AbstractC167017dG.A1F(anonymousClass182, it);
            }
            anonymousClass182.A0Z();
        }
        if (recentExperimentsStorageModel.recentUniverseNames != null) {
            C16V.A03(anonymousClass182, "universeNames");
            Iterator it2 = recentExperimentsStorageModel.recentUniverseNames.iterator();
            while (it2.hasNext()) {
                AbstractC167017dG.A1F(anonymousClass182, it2);
            }
            anonymousClass182.A0Z();
        }
        if (z) {
            anonymousClass182.A0a();
        }
    }

    public static RecentExperimentsStorageModel unsafeParseFromJson(C16L c16l) {
        RecentExperimentsStorageModel recentExperimentsStorageModel = new RecentExperimentsStorageModel();
        if (c16l.A11() != C16R.A0D) {
            c16l.A0z();
            return null;
        }
        while (c16l.A1J() != C16R.A09) {
            processSingleField(recentExperimentsStorageModel, AbstractC166997dE.A0s(c16l), c16l);
            c16l.A0z();
        }
        recentExperimentsStorageModel.postprocess();
        return recentExperimentsStorageModel;
    }

    public static RecentExperimentsStorageModel parseFromJson(String str) {
        return parseFromJson(C16V.A00(str));
    }

    public static String serializeToJson(RecentExperimentsStorageModel recentExperimentsStorageModel) {
        StringWriter stringWriter = new StringWriter();
        C17z A0A = AbstractC221915u.A00.A0A(stringWriter);
        serializeToJson(A0A, recentExperimentsStorageModel, true);
        A0A.close();
        return stringWriter.toString();
    }
}
