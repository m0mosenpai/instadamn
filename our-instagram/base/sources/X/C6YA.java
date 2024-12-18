package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.6YA, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6YA extends AbstractC70903Gc {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public boolean A04;
    public final UserSession A05;
    public final InterfaceC60442pS A06;
    public final C3G2 A07;
    public final C1PY A08;
    public final boolean A09;
    public final InterfaceC101974iC A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final boolean A0D;

    @Override // X.AbstractC70903Gc, X.InterfaceC669530m
    public final boolean A7S(AnonymousClass320 anonymousClass320, InterfaceC669830p interfaceC669830p, InterfaceC670130s interfaceC670130s) {
        C14360o3.A0B(interfaceC670130s, 0);
        C14360o3.A0B(interfaceC669830p, 1);
        C14360o3.A0B(anonymousClass320, 2);
        if (this.A0C) {
            this.A00 = anonymousClass320.A01;
        }
        return super.A7S(anonymousClass320, interfaceC669830p, interfaceC670130s);
    }

    public C6YA(Context context, AbstractC018607g abstractC018607g, UserSession userSession, AnonymousClass318 anonymousClass318, InterfaceC60442pS interfaceC60442pS, C3G2 c3g2, C3GY c3gy, InterfaceC101944i9 interfaceC101944i9, C26191Pa c26191Pa, C31G c31g, C1PY c1py, InterfaceC61432r6 interfaceC61432r6, C1M1 c1m1, String str, boolean z, boolean z2, boolean z3) {
        super(context, abstractC018607g, userSession, anonymousClass318, c3g2, c3gy, interfaceC101944i9, c26191Pa, c31g, interfaceC61432r6, c1m1, str, z, z2, z3);
        this.A05 = userSession;
        this.A07 = c3g2;
        this.A08 = c1py;
        this.A06 = interfaceC60442pS;
        this.A0D = z3;
        C06090Tz c06090Tz = C06090Tz.A05;
        this.A09 = C18U.A06(c06090Tz, userSession, 36310538287579298L);
        this.A0B = C18U.A06(c06090Tz, userSession, 36326863454484648L);
        InterfaceC101974iC interfaceC101974iC = new InterfaceC101974iC() { // from class: X.6YB
            @Override // X.InterfaceC101974iC
            public final void DZa(int i, int i2) {
                C6YA c6ya = C6YA.this;
                c6ya.A02 = i2;
                if (!c6ya.A09) {
                    C6YA.A00(c6ya);
                }
            }
        };
        this.A0A = interfaceC101974iC;
        List list = c1py.A00;
        if (!list.contains(interfaceC101974iC)) {
            list.add(interfaceC101974iC);
        }
        this.A04 = C18U.A06(c06090Tz, userSession, 36310538286334102L);
        this.A0C = C18U.A06(c06090Tz, userSession, 36310538288038056L);
    }

    public static final boolean A00(C6YA c6ya) {
        boolean z = false;
        if (!((AbstractC70903Gc) c6ya).A06.get() || c6ya.A04) {
            return false;
        }
        C3GY c3gy = c6ya.A0H;
        int B0B = c3gy.B0B();
        c6ya.A01 = B0B;
        int AaC = c3gy.AaC();
        int i = c6ya.A03;
        int i2 = c6ya.A00;
        int i3 = i2 - (((AbstractC70903Gc) c6ya).A01 - ((AbstractC70903Gc) c6ya).A00);
        c6ya.A03 = i3;
        if (c6ya.A0D && c6ya.A0B && i2 > 0 && ((AbstractC70903Gc) c6ya).A07) {
            c6ya.A01 = 1;
            B0B = 1;
            AaC = 0;
        }
        if (c6ya.A02 <= AaC && i2 >= B0B && ((AbstractC70903Gc) c6ya).A03 == C05F.A00) {
            if (c6ya.A0M) {
                c6ya.CoN(i3);
            } else {
                c6ya.A07(i3, false);
            }
            z = true;
        }
        if (c6ya.A03 != i) {
            C1PY c1py = c6ya.A08;
            if (!c1py.A02.isEmpty()) {
                String moduleName = AbstractC138346Oq.A00(c6ya.A06, ((C41551w4) c1py.A00().BUM()).A0H, c6ya.A07).getModuleName();
                C18920wW A01 = AbstractC12220kQ.A01(new C19270xB(moduleName), c6ya.A05);
                InterfaceC02590Ai A00 = A01.A00(A01.A00, "inventory_based_request_status");
                A00.A8p("ads_pool_threshold_for_next_request", Integer.valueOf(AaC));
                A00.A8p("earliest_request_position", Integer.valueOf(c6ya.A01));
                A00.A7v("is_request_sent", Boolean.valueOf(z));
                A00.A8p("num_items_in_pool", Integer.valueOf(c6ya.A02));
                A00.A8p("reel_position", Integer.valueOf(c6ya.A00));
                A00.Cht();
            }
        }
        return true;
    }

    @Override // X.AbstractC70903Gc
    public final String A06() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.A06());
        sb.append(", numAdsInPool:");
        sb.append(this.A02);
        sb.append(", earliestRequestPosition:");
        sb.append(this.A01);
        sb.append(", currentIndex:");
        sb.append(this.A00);
        return sb.toString();
    }

    @Override // X.AbstractC70903Gc
    public final void A07(int i, boolean z) {
        if (this.A0D && this.A0B && i == 0) {
            return;
        }
        super.A07(i, z);
    }

    @Override // X.InterfaceC669530m
    public final boolean D7a(int i, int i2) {
        this.A00 = i;
        this.A04 = false;
        return A00(this);
    }

    @Override // X.AbstractC70903Gc, X.InterfaceC669530m
    public final void Dtv(int i) {
        if (this.A09) {
            this.A02 = i;
            A00(this);
        }
    }

    @Override // X.AbstractC70903Gc
    public final C85653ru A05(boolean z) {
        C85653ru A05 = super.A05(z);
        A05.A00 = this.A01;
        A05.A0I = true;
        A05.A02 = this.A00;
        if (!z) {
            A05.A03 = this.A02;
        }
        return A05;
    }

    @Override // X.AbstractC70903Gc, X.InterfaceC669530m
    public final void deactivate() {
        super.deactivate();
        C1PY c1py = this.A08;
        c1py.A00.remove(this.A0A);
    }
}
