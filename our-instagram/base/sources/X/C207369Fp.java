package X;

import android.content.Context;
import android.os.Handler;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.9Fp, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C207369Fp extends C0YY implements InterfaceC16820sZ {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;
    public final Object A07;
    public final Object A08;
    public final Object A09;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C207369Fp(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, int i) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
        this.A04 = obj2;
        this.A02 = obj3;
        this.A09 = obj4;
        this.A05 = obj5;
        this.A08 = obj6;
        this.A07 = obj7;
        this.A06 = obj8;
        this.A03 = obj9;
    }

    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.A00) {
            case 0:
                AbstractC59962oe abstractC59962oe = (AbstractC59962oe) this.A03;
                UserSession userSession = ((AnonymousClass982) this.A09).A01;
                Handler handler = (Handler) this.A08;
                C164197Wi c164197Wi = (C164197Wi) this.A02;
                return new C49044LmW(handler, abstractC59962oe, userSession, c164197Wi.A0D, c164197Wi.A0I, new B41((InterfaceC16820sZ) this.A05), (C7VS) this.A06, c164197Wi.A0P, (InterfaceC08830cm) this.A01, (InterfaceC08830cm) this.A07, new C1577876m((InterfaceC16820sZ) this.A04), new M8T(c164197Wi, 7));
            case 1:
                final C2XI c2xi = (C2XI) this.A04;
                final C2XI c2xi2 = (C2XI) this.A05;
                final C2XI c2xi3 = (C2XI) this.A01;
                C25237BEv c25237BEv = new C25237BEv(c2xi, c2xi2, c2xi3, 2);
                final C2XI c2xi4 = (C2XI) this.A07;
                final C2XI c2xi5 = (C2XI) this.A08;
                final C76223bS c76223bS = (C76223bS) this.A06;
                final C2XI c2xi6 = (C2XI) this.A03;
                final C51762Yz c51762Yz = (C51762Yz) this.A02;
                InterfaceC74263Vh interfaceC74263Vh = new InterfaceC74263Vh() { // from class: X.3ic
                    @Override // X.InterfaceC74263Vh
                    public final void Cwm(C37905Gm2 c37905Gm2, float f, float f2, float f3, float f4) {
                        C2XI c2xi7 = c2xi;
                        Float valueOf = Float.valueOf(f);
                        c2xi7.A00(valueOf);
                        c2xi2.A00(valueOf);
                        c2xi3.A00(Float.valueOf(f4));
                        c2xi4.A00(Float.valueOf(AbstractC41371ISy.A01(c37905Gm2)));
                        C2XI c2xi8 = c2xi5;
                        Context context = c76223bS.A05.A0C;
                        C14360o3.A07(context);
                        c2xi8.A00(Float.valueOf(AbstractC41371ISy.A00(context, c37905Gm2, f2)));
                        c2xi6.A00(Float.valueOf(f3));
                    }

                    @Override // X.InterfaceC74263Vh
                    public final void E4K() {
                        C51762Yz c51762Yz2 = c51762Yz;
                        C41612Ib2 c41612Ib2 = C41612Ib2.A00;
                        Context context = c76223bS.A05.A0C;
                        C14360o3.A07(context);
                        c51762Yz2.A01(c41612Ib2.A00(context));
                    }
                };
                C80373iS c80373iS = (C80373iS) this.A09;
                C75113Zb c75113Zb = c80373iS.A00;
                c75113Zb.A0T(c25237BEv);
                c75113Zb.A0X(interfaceC74263Vh);
                return new C79353gg(new C29900DGo(6, c25237BEv, c80373iS, interfaceC74263Vh));
            case 2:
                C65122xA c65122xA = (C65122xA) this.A09;
                if (AbstractC65512xn.A00(c65122xA.A00).A07(c65122xA.A01.getModuleName())) {
                    return null;
                }
                FragmentActivity fragmentActivity = (FragmentActivity) this.A01;
                Fragment fragment = (Fragment) this.A05;
                C65612xx c65612xx = new C65612xx(fragment, fragmentActivity);
                C60972qL c60972qL = (C60972qL) this.A04;
                C61142qc c61142qc = (C61142qc) this.A02;
                return new C65622xy(fragmentActivity, fragment, c65612xx, (C62862tP) this.A06, c61142qc, c60972qL, (C57332k8) this.A07, (C1M1) this.A08, "main_feed", false, false, false);
            default:
                FragmentActivity fragmentActivity2 = (FragmentActivity) this.A01;
                C60972qL c60972qL2 = (C60972qL) this.A04;
                C61142qc c61142qc2 = (C61142qc) this.A02;
                C1M1 c1m1 = (C1M1) this.A09;
                Fragment fragment2 = (Fragment) this.A05;
                C57332k8 c57332k8 = (C57332k8) this.A08;
                InterfaceC63362uJ interfaceC63362uJ = (InterfaceC63362uJ) this.A07;
                return new C65672y3(fragmentActivity2, fragment2, new C65612xx(fragment2, fragmentActivity2), (C62862tP) this.A06, c61142qc2, interfaceC63362uJ, c60972qL2, c57332k8, c1m1, "main_feed");
        }
    }
}
