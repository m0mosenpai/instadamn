package X;

import android.os.Handler;
import android.os.Looper;
import com.google.gson.Gson;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import java.io.IOException;
import java.util.Map;

/* renamed from: X.1wJ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C41691wJ implements InterfaceC13380mO, InterfaceC41671wH {
    public final UserSession A00;
    public final C13400mQ A01;
    public final C18240vB A02;
    public final C41751wP A03;
    public final Handler A04;

    @Override // X.InterfaceC41671wH
    public final synchronized boolean Cbf(Reel reel, C41181vS c41181vS) {
        String id;
        boolean z;
        C38321qM c38321qM;
        if (reel.A0l() && (c38321qM = c41181vS.A0b) != null && c38321qM.getId() != null) {
            z = this.A03.A03(reel.getId(), c38321qM.getId());
        } else {
            C41751wP c41751wP = this.A03;
            if (reel.A1P) {
                id = "NUX";
            } else {
                id = reel.getId();
            }
            long A02 = c41751wP.A02(id);
            z = false;
            if (A02 >= c41181vS.A03()) {
                z = true;
            }
        }
        return z;
    }

    public final synchronized String toString() {
        String str;
        try {
            str = AbstractC41731wN.A00(this.A03);
        } catch (IOException e) {
            C0w9.A06("LocalReelSeenStateStore#toString", "Failed to serialize seen state to json", e.getCause());
            str = "";
        }
        return str;
    }

    @Override // X.InterfaceC13380mO
    public final /* bridge */ /* synthetic */ void onDebouncedValue(Object obj) {
        final C41751wP c41751wP;
        C41751wP c41751wP2 = this.A03;
        synchronized (c41751wP2) {
            c41751wP = new C41751wP();
            c41751wP.A02.addAll(c41751wP2.A02);
            c41751wP.A01.putAll(c41751wP2.A01);
            c41751wP.A03.addAll(c41751wP2.A03);
            for (Map.Entry entry : c41751wP2.A04.entrySet()) {
                c41751wP2.A00.put((String) entry.getKey(), new Gson().A0B(entry.getValue()));
            }
        }
        this.A02.ATO(new AbstractRunnableC14200nk() { // from class: X.4DJ
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(321);
            }

            @Override // java.lang.Runnable
            public final void run() {
                C41691wJ c41691wJ = this;
                try {
                    String A00 = AbstractC41731wN.A00(c41751wP);
                    C23031Ai A002 = AbstractC23021Ah.A00(c41691wJ.A00);
                    A002.A7f.Egi(A002, A00, C23031Ai.A8c[65]);
                } catch (IOException e) {
                    C0K8.A05(C41691wJ.class, "failed to save LocalReelSeenState json", e);
                }
            }
        });
    }

    public C41691wJ(UserSession userSession, C41751wP c41751wP) {
        Handler handler = new Handler(Looper.getMainLooper());
        this.A04 = handler;
        C0o0 A00 = AbstractC14350nz.A00();
        A00.A01 = "LocalReelSeenStateSerialize";
        this.A02 = new C18240vB(A00);
        this.A00 = userSession;
        this.A03 = c41751wP;
        this.A01 = new C13400mQ(handler, this, 100L);
    }
}
