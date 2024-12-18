package X;

import com.instagram.common.gallery.Medium;
import com.instagram.common.session.UserSession;
import com.instagram.share.handleractivity.BaseShareHandlerActivity;
import com.instagram.share.handleractivity.ShareHandlerActivity;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/* renamed from: X.PFx, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56729PFx implements InterfaceC25201BCz {
    public final /* synthetic */ C198278pc A00;
    public final /* synthetic */ BaseShareHandlerActivity A01;

    public C56729PFx(C198278pc c198278pc, BaseShareHandlerActivity baseShareHandlerActivity) {
        this.A01 = baseShareHandlerActivity;
        this.A00 = c198278pc;
    }

    @Override // X.InterfaceC25201BCz
    public final void onFailure(Exception exc) {
        C0K8.A0G("BaseShareHandlerActivity", "Unable to load assets to share", exc);
        BaseShareHandlerActivity baseShareHandlerActivity = this.A01;
        baseShareHandlerActivity.A02(exc);
        C9GR.A01(baseShareHandlerActivity, "share_intent_media_inaccessible", 2131973678, 1);
        UserSession A01 = baseShareHandlerActivity.A01();
        if (A01 != null) {
            AbstractC54199Nxd.A00(A01).A00("io_exception");
        }
        baseShareHandlerActivity.A03(true);
    }

    @Override // X.InterfaceC25201BCz
    public final void onSuccess() {
        boolean z;
        C06090Tz c06090Tz;
        long j;
        BaseShareHandlerActivity baseShareHandlerActivity = this.A01;
        if (baseShareHandlerActivity instanceof ShareHandlerActivity) {
            UserSession A01 = baseShareHandlerActivity.A01();
            z = false;
            if (A01 != null) {
                if (C14360o3.A0K(MSX.A0c(baseShareHandlerActivity), "android.intent.action.SEND")) {
                    c06090Tz = C06090Tz.A05;
                    j = 36323848387309194L;
                } else if (C14360o3.A0K(MSX.A0c(baseShareHandlerActivity), "android.intent.action.SEND_MULTIPLE")) {
                    c06090Tz = C06090Tz.A05;
                    j = 36323848387505805L;
                }
                z = C18U.A06(c06090Tz, A01, j);
            }
        } else {
            z = false;
        }
        if (z) {
            UserSession A012 = baseShareHandlerActivity.A01();
            List<Medium> list = this.A00.A09;
            if (A012 != null && !list.isEmpty()) {
                int i = 3;
                if (list.size() < 3) {
                    i = list.size();
                }
                ExecutorService newFixedThreadPool = Executors.newFixedThreadPool(i);
                C14360o3.A0A(newFixedThreadPool);
                C14360o3.A0B(newFixedThreadPool, 3);
                for (Medium medium : list) {
                    if (medium.A05()) {
                        newFixedThreadPool.execute(new KM7(medium, new CallableC209819Pr(baseShareHandlerActivity, medium.A02(), null, A012, false)));
                    }
                }
                newFixedThreadPool.shutdown();
                try {
                    newFixedThreadPool.awaitTermination(C18U.A01(C06090Tz.A05, A012, 36605323364406526L), TimeUnit.SECONDS);
                } catch (InterruptedException e) {
                    C0K8.A0G("BaseShareHandlerActivity", "Unable to load assets to share", e);
                    baseShareHandlerActivity.A02(e);
                    C9GR.A01(baseShareHandlerActivity, "share_intent_media_inaccessible", 2131973678, 1);
                }
            } else {
                C9GR.A01(baseShareHandlerActivity, "share_intent_app_not_supported", 2131973677, 1);
                baseShareHandlerActivity.A03(true);
                return;
            }
        }
        baseShareHandlerActivity.A03(false);
    }
}
