package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.0Wt, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C06610Wt {
    public final InterfaceC06770Xt A00;
    public volatile C0Ws A01;

    public static boolean A00(C0XP c0xp, RunnableC16080r6 runnableC16080r6) {
        if (runnableC16080r6 != null) {
            if (!runnableC16080r6.A0O) {
                if (c0xp.A04(runnableC16080r6.A0F, runnableC16080r6.getMarkerId(), runnableC16080r6.A01)) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    public final RunnableC16080r6 A01(C0X2 c0x2, long j) {
        return this.A00.AXc(c0x2, j);
    }

    public final void A02(RunnableC16080r6 runnableC16080r6, long j) {
        InterfaceC06770Xt interfaceC06770Xt = this.A00;
        interfaceC06770Xt.E73(null, runnableC16080r6, j);
        C0Ws c0Ws = this.A01;
        if (c0Ws != null) {
            AtomicInteger atomicInteger = c0Ws.A03;
            if (atomicInteger.incrementAndGet() >= c0Ws.A00) {
                int Em3 = interfaceC06770Xt.Em3(null);
                atomicInteger.set(0);
                C10390h6 c10390h6 = c0Ws.A02;
                long j2 = c0Ws.A01;
                C023509j c023509j = c10390h6.A00;
                if (C023509j.A05(c023509j)) {
                    RunnableC16080r6 A02 = C023509j.A02(c023509j, TimeUnit.MILLISECONDS, 27791726, Em3, j2);
                    A02.ABZ(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "MARKER_COUNT");
                    A02.A0W.A05("marker_count", Em3);
                    c023509j.A00.execute(A02);
                    c023509j.A01.set(false);
                }
            }
        }
    }

    public final boolean A03(C0X2 c0x2, C0XP c0xp, long j) {
        return A00(c0xp, this.A00.AXc(c0x2, j));
    }

    public C06610Wt(InterfaceC06770Xt interfaceC06770Xt) {
        this.A00 = interfaceC06770Xt;
    }
}
