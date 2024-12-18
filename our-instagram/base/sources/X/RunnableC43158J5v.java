package X;

import android.view.ViewGroup;

/* renamed from: X.J5v, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class RunnableC43158J5v implements Runnable {
    public final /* synthetic */ long A00;
    public final /* synthetic */ ViewGroup A01;
    public final /* synthetic */ C33F A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ InterfaceC16820sZ A04;
    public final /* synthetic */ boolean A05;

    public RunnableC43158J5v(ViewGroup viewGroup, C33F c33f, String str, InterfaceC16820sZ interfaceC16820sZ, long j, boolean z) {
        this.A02 = c33f;
        this.A04 = interfaceC16820sZ;
        this.A01 = viewGroup;
        this.A03 = str;
        this.A00 = j;
        this.A05 = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        EnumC58132lV enumC58132lV;
        C5SV c5sv;
        C33F c33f = this.A02;
        InterfaceC116795Qi interfaceC116795Qi = (InterfaceC116795Qi) this.A04.invoke();
        ViewGroup viewGroup = this.A01;
        String str = this.A03;
        long j = this.A00;
        boolean z = this.A05;
        C5SU c5su = new C5SU(AbstractC166997dE.A0L(viewGroup), viewGroup, new C149686oL(str));
        C14360o3.A0B(interfaceC116795Qi, 0);
        c5su.A03 = interfaceC116795Qi;
        C33C c33c = c33f.A03;
        if (c33c.Elq()) {
            enumC58132lV = EnumC58132lV.A02;
        } else {
            enumC58132lV = EnumC58132lV.A03;
        }
        c5su.A05 = enumC58132lV;
        if (c33c.Elr()) {
            c5sv = C5SV.A07;
        } else {
            c5sv = C5SV.A06;
        }
        c5su.A07(c5sv);
        c5su.A0A = false;
        c5su.A0B = z;
        c5su.A04 = c33f.A04;
        C5SW A00 = c5su.A00();
        J4Z j4z = c33f.A00;
        if (j4z != null) {
            c33f.A01.removeCallbacks(j4z);
            C5SW c5sw = j4z.A00;
            if (c5sw.A09()) {
                c5sw.A08(false);
            }
        }
        J4Z j4z2 = new J4Z(c33f.A02, A00);
        c33f.A01.postDelayed(j4z2, j);
        c33f.A00 = j4z2;
    }
}
