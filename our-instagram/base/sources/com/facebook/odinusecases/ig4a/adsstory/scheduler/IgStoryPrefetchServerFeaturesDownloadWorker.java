package com.facebook.odinusecases.ig4a.adsstory.scheduler;

import X.AD6;
import X.AbstractC1114350h;
import X.AbstractC166987dD;
import X.AbstractC167017dG;
import X.AbstractC43591JPw;
import X.C00O;
import X.C023409i;
import X.C03250Di;
import X.C0JM;
import X.C0K8;
import X.C1114250g;
import X.C14360o3;
import X.C3RT;
import X.C3RU;
import X.C3SN;
import X.C51A;
import X.C54658OCk;
import X.C57545PgJ;
import X.C94E;
import X.C94J;
import X.InterfaceC73603Rm;
import android.content.Context;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import com.facebook.odin.model.Example;
import com.instagram.common.session.UserSession;
import java.util.List;

/* loaded from: classes4.dex */
public final class IgStoryPrefetchServerFeaturesDownloadWorker extends Worker {
    public C0JM A00;
    public InterfaceC73603Rm A01;
    public C94E A02;
    public C3RU A03;
    public UserSession A04;
    public final Context A05;

    @Override // androidx.work.Worker
    public final AbstractC1114350h doWork() {
        String str;
        UserSession userSession;
        try {
            UserSession A08 = C023409i.A0A.A08(this);
            this.A04 = A08;
            this.A00 = C03250Di.A00;
            str = "userSession";
            this.A03 = new C3RT(A08);
            userSession = this.A04;
        } catch (UnsupportedOperationException e) {
            String message = e.getMessage();
            if (message == null) {
                message = AbstractC43591JPw.A00(619);
            }
            C0K8.A05(IgStoryPrefetchServerFeaturesDownloadWorker.class, message, e);
        }
        if (userSession != null) {
            this.A02 = C94J.A00(userSession).A00;
            UserSession userSession2 = this.A04;
            if (userSession2 != null) {
                this.A01 = (InterfaceC73603Rm) ((C54658OCk) userSession2.A01(C54658OCk.class, new C57545PgJ(userSession2, 10))).A03.getValue();
                C94E c94e = this.A02;
                if (c94e == null) {
                    str = "igStoryPrefetchServerFeatureFetcher";
                } else {
                    C3RU c3ru = this.A03;
                    if (c3ru == null) {
                        str = "igStoryPrefetchPredictorConfig";
                    } else {
                        C3SN A00 = c94e.A00(AD6.A00(c3ru));
                        if (A00.A02) {
                            List list = (List) A00.A00;
                            if (!list.isEmpty()) {
                                Example example = (Example) AbstractC166987dD.A16(list);
                                InterfaceC73603Rm interfaceC73603Rm = this.A01;
                                if (interfaceC73603Rm == null) {
                                    str = "igStoryPrefetchServerFeatureStore";
                                } else {
                                    C0JM c0jm = this.A00;
                                    if (c0jm == null) {
                                        str = "clock";
                                    } else {
                                        interfaceC73603Rm.Eot(example, "IG_ADS_PREFETCH", c0jm.now());
                                        return new C51A();
                                    }
                                }
                            }
                        }
                        return new C1114250g();
                    }
                }
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IgStoryPrefetchServerFeaturesDownloadWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        AbstractC167017dG.A1P(context, workerParameters);
        this.A05 = context;
    }
}
