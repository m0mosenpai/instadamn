package X;

import android.app.Activity;
import android.content.IntentSender;
import java.util.List;

/* renamed from: X.T6q, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64266T6q implements YO0 {
    public final int A00;
    public final Object A01;

    public C64266T6q(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.YO0
    public final void D6a(C5KS c5ks) {
        InterfaceC23621Ds interfaceC23621Ds;
        Object c09540e5;
        switch (this.A00) {
            case 0:
                C14360o3.A0B(c5ks, 0);
                if (c5ks.A05) {
                    C72123XOu c72123XOu = (C72123XOu) this.A01;
                    c72123XOu.A03 = true;
                    C72126XOy c72126XOy = c72123XOu.A00;
                    if (c72126XOy == null || !c72126XOy.A00.cancel(true)) {
                        return;
                    }
                    c72123XOu.A02 = null;
                    c72123XOu.A00 = null;
                    c72123XOu.A01 = null;
                    return;
                }
                if (c5ks.A0F()) {
                    ((C72123XOu) this.A01).A00(c5ks.A06());
                    return;
                }
                Exception A05 = c5ks.A05();
                if (A05 != null) {
                    ((C72123XOu) this.A01).A01(A05);
                    return;
                }
                throw AbstractC58318PtA.A0Z();
            case 1:
                if (c5ks.A0F()) {
                    List list = (List) c5ks.A06();
                    C48262Jq c48262Jq = ((RunnableC58639PzC) this.A01).A00;
                    for (int i = 0; i < list.size(); i++) {
                        C48262Jq.A02(c48262Jq, (AbstractC62642SJz) list.get(i), false);
                    }
                }
                C48262Jq c48262Jq2 = ((RunnableC58639PzC) this.A01).A00;
                synchronized (c48262Jq2) {
                    c48262Jq2.A07 = true;
                    c48262Jq2.A02 = false;
                    c48262Jq2.A05 = false;
                }
                C48262Jq.A01(c48262Jq2);
                return;
            case 2:
                C14360o3.A0B(c5ks, 0);
                ((InterfaceC23621Ds) this.A01).resumeWith(c5ks);
                return;
            case 3:
                C14360o3.A0B(c5ks, 0);
                if (c5ks.A0F()) {
                    return;
                }
                Exception A052 = c5ks.A05();
                if (!(A052 instanceof RGN)) {
                    return;
                }
                try {
                    ((Rk3) A052).A00.A00((Activity) this.A01, 23107);
                    return;
                } catch (IntentSender.SendIntentException e) {
                    C0w9.A07("AymhErrorSaveSmartLock", e);
                    return;
                }
            case 4:
                C23031Ai c23031Ai = ((NTS) this.A01).A07;
                long currentTimeMillis = System.currentTimeMillis();
                InterfaceC19610xo ARD = c23031Ai.A01.ARD();
                ARD.E7G("previous_in_app_review_prompt_time", currentTimeMillis);
                ARD.apply();
                return;
            default:
                Exception A053 = c5ks.A05();
                if (A053 == null) {
                    boolean z = c5ks.A05;
                    Object obj = this.A01;
                    if (z) {
                        ((InterfaceC24901Jp) obj).AGJ(null);
                        return;
                    } else {
                        interfaceC23621Ds = (InterfaceC23621Ds) obj;
                        c09540e5 = c5ks.A06();
                    }
                } else {
                    interfaceC23621Ds = (InterfaceC23621Ds) this.A01;
                    c09540e5 = new C09540e5(A053);
                }
                interfaceC23621Ds.resumeWith(c09540e5);
                return;
        }
    }
}
