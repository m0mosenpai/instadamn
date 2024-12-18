package X;

import android.view.View;

/* loaded from: classes12.dex */
public final class YGY implements Runnable {
    public final /* synthetic */ C86903u3 A00;

    public YGY(C86903u3 c86903u3) {
        this.A00 = c86903u3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        EnumC116885Qs enumC116885Qs;
        C86903u3 c86903u3 = this.A00;
        View A00 = c86903u3.A03.A00();
        C86883u1 c86883u1 = c86903u3.A04;
        if (c86883u1.A02) {
            boolean A06 = C18U.A06(C06090Tz.A05, c86903u3.A01, 36325334446060546L);
            InterfaceC16620sF interfaceC16620sF = (InterfaceC16620sF) c86883u1.A00.A07;
            if (A06) {
                enumC116885Qs = EnumC116885Qs.A05;
            } else {
                enumC116885Qs = null;
            }
            interfaceC16620sF.invoke(A00, enumC116885Qs);
            return;
        }
        ((InterfaceC16620sF) c86883u1.A00.A04).invoke("continue_watching", A00);
    }
}
