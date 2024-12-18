package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.9Fn, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C207349Fn extends C0YY implements InterfaceC16820sZ {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;
    public final Object A07;
    public final Object A08;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C207349Fn(int i, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8) {
        super(0);
        this.A00 = i;
        this.A05 = obj;
        this.A08 = obj2;
        this.A04 = obj3;
        this.A03 = obj4;
        this.A02 = obj5;
        this.A06 = obj6;
        this.A01 = obj7;
        this.A07 = obj8;
    }

    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.A00) {
            case 0:
                AnonymousClass982 anonymousClass982 = (AnonymousClass982) this.A08;
                FragmentActivity requireActivity = anonymousClass982.A00.requireActivity();
                AbstractC59962oe abstractC59962oe = (AbstractC59962oe) this.A04;
                UserSession userSession = anonymousClass982.A01;
                InterfaceC08830cm interfaceC08830cm = (InterfaceC08830cm) this.A02;
                return new G4F(requireActivity, abstractC59962oe, userSession, (LEK) ((InterfaceC09390do) this.A03).getValue(), (C7XR) this.A01, (C163867Va) this.A05, interfaceC08830cm, (InterfaceC08830cm) this.A07, (InterfaceC08830cm) this.A06);
            case 1:
                AbstractC59962oe abstractC59962oe2 = (AbstractC59962oe) this.A05;
                AnonymousClass982 anonymousClass9822 = (AnonymousClass982) this.A08;
                UserSession userSession2 = anonymousClass9822.A01;
                C7XQ c7xq = (C7XQ) this.A04;
                JQK jqk = new JQK(c7xq, 6);
                InterfaceC08830cm interfaceC08830cm2 = (InterfaceC08830cm) this.A03;
                C34587FLw c34587FLw = new C34587FLw(abstractC59962oe2, userSession2, interfaceC08830cm2, jqk);
                C164497Xo c164497Xo = (C164497Xo) c7xq.A0N.getValue();
                InterfaceC165207a9 interfaceC165207a9 = (InterfaceC165207a9) ((InterfaceC09390do) this.A02).getValue();
                C49087LnD c49087LnD = (C49087LnD) ((InterfaceC09390do) this.A06).getValue();
                return new G4X(anonymousClass9822.A00.requireActivity(), (InterfaceC11380iw) this.A01, userSession2, c34587FLw, c164497Xo, c49087LnD, interfaceC165207a9, interfaceC08830cm2, (InterfaceC16820sZ) this.A07);
            case 2:
                AnonymousClass982 anonymousClass9823 = (AnonymousClass982) this.A08;
                UserSession userSession3 = anonymousClass9823.A01;
                FragmentActivity requireActivity2 = anonymousClass9823.A00.requireActivity();
                InterfaceC08830cm interfaceC08830cm3 = (InterfaceC08830cm) this.A03;
                InterfaceC08830cm interfaceC08830cm4 = (InterfaceC08830cm) this.A07;
                return new C49083Ln9(requireActivity2, (InterfaceC11380iw) this.A01, userSession3, (FPB) ((InterfaceC09390do) this.A05).getValue(), (LEK) ((InterfaceC09390do) this.A04).getValue(), (C7XR) this.A02, (C163867Va) this.A06, interfaceC08830cm3, interfaceC08830cm4);
            default:
                AnonymousClass982 anonymousClass9824 = (AnonymousClass982) this.A08;
                UserSession userSession4 = anonymousClass9824.A01;
                FragmentActivity requireActivity3 = anonymousClass9824.A00.requireActivity();
                InterfaceC08830cm interfaceC08830cm5 = (InterfaceC08830cm) this.A03;
                InterfaceC08830cm interfaceC08830cm6 = (InterfaceC08830cm) this.A07;
                return new LnQ(requireActivity3, (InterfaceC11380iw) this.A01, userSession4, (FPB) ((InterfaceC09390do) this.A06).getValue(), (LEK) ((InterfaceC09390do) this.A05).getValue(), (InterfaceC165087Zx) ((InterfaceC09390do) this.A02).getValue(), interfaceC08830cm5, interfaceC08830cm6, new M8T(this.A04, 8));
        }
    }
}
