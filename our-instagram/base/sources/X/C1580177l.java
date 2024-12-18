package X;

import android.view.View;

/* renamed from: X.77l, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1580177l implements C7QB {
    public final boolean A00;
    public final C162897Ra A01;
    public final C7Q6 A02;
    public final C7Q8 A03;
    public final C7QA A04;
    public final InterfaceC165507ad A05;
    public final AnonymousClass988 A06;
    public final C1580277m A07;

    public C1580177l(C7Q6 c7q6, C7Q8 c7q8, C7QA c7qa, InterfaceC165507ad interfaceC165507ad, AnonymousClass988 anonymousClass988) {
        this(null, c7q6, c7q8, c7qa, interfaceC165507ad, anonymousClass988, null, false);
    }

    private final void A00(C7QD c7qd) {
        C7Q6 c7q6 = this.A02;
        C7Q8 c7q8 = this.A03;
        C7QA c7qa = this.A04;
        C162897Ra c162897Ra = this.A01;
        C1580277m c1580277m = this.A07;
        InterfaceC165507ad interfaceC165507ad = this.A05;
        View BKF = c7qd.BKF();
        C14360o3.A07(BKF);
        AnonymousClass988 anonymousClass988 = this.A06;
        C7QF c7qf = new C7QF(BKF, c162897Ra, c7q6, c7q8, c7qa, interfaceC165507ad, c1580277m, c7qd, anonymousClass988.A1U, true, ((Boolean) anonymousClass988.A0d.getValue()).booleanValue());
        ((C7QE) c7qd).EZu(c7qf);
        c7qd.BKF().setOnTouchListener(c7qf);
    }

    @Override // X.C7QB
    public final /* bridge */ /* synthetic */ void CzN(Object obj, Object obj2) {
        C7QD c7qd = (C7QD) obj;
        C14360o3.A0B(c7qd, 0);
        C14360o3.A0B(obj2, 1);
        if (this.A00) {
            A00(c7qd);
        }
        C7QH BYl = ((C7QE) c7qd).BYl();
        if (BYl != null) {
            ((C7QG) BYl).A00 = obj2;
        }
    }

    @Override // X.C7QB
    public final /* bridge */ /* synthetic */ void D8a(Object obj) {
        C7QD c7qd = (C7QD) obj;
        C14360o3.A0B(c7qd, 0);
        if (!this.A00) {
            A00(c7qd);
        }
    }

    @Override // X.C7QB
    public final /* bridge */ /* synthetic */ void Dw5(Object obj) {
        C7QD c7qd = (C7QD) obj;
        C14360o3.A0B(c7qd, 0);
        C7QH BYl = ((C7QE) c7qd).BYl();
        if (BYl != null) {
            ((C7QG) BYl).A00 = null;
        }
    }

    public C1580177l(C162897Ra c162897Ra, C7Q6 c7q6, C7Q8 c7q8, C7QA c7qa, InterfaceC165507ad interfaceC165507ad, AnonymousClass988 anonymousClass988, C1580277m c1580277m, boolean z) {
        C14360o3.A0B(interfaceC165507ad, 1);
        this.A05 = interfaceC165507ad;
        this.A06 = anonymousClass988;
        this.A02 = c7q6;
        this.A03 = c7q8;
        this.A04 = c7qa;
        this.A01 = c162897Ra;
        this.A07 = c1580277m;
        this.A00 = z;
    }
}
