package X;

import android.animation.Animator;
import android.content.Context;
import android.os.Handler;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;

/* renamed from: X.9Fm, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C207339Fm extends C0YY implements InterfaceC16820sZ {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;
    public final Object A07;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C207339Fm(int i, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
        this.A04 = obj2;
        this.A07 = obj3;
        this.A05 = obj4;
        this.A06 = obj5;
        this.A03 = obj6;
        this.A02 = obj7;
    }

    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.A00) {
            case 0:
                UserSession userSession = ((AnonymousClass982) this.A07).A01;
                C163867Va c163867Va = (C163867Va) this.A05;
                InterfaceC16820sZ interfaceC16820sZ = (InterfaceC16820sZ) this.A06;
                C2d4 c2d4 = (C2d4) this.A01;
                C50249MHe c50249MHe = new C50249MHe(this.A03, 45);
                return new C1575275m(c2d4, userSession, c163867Va, (C7W4) this.A02, (InterfaceC164927Zh) ((InterfaceC09390do) this.A04).getValue(), interfaceC16820sZ, c50249MHe);
            case 1:
                UserSession userSession2 = ((AnonymousClass982) this.A07).A01;
                return new C49096LnM((AbstractC59962oe) this.A04, userSession2, (C163867Va) this.A06, (C7XR) this.A01, (InterfaceC16820sZ) this.A05, new C50165MDs(this.A03, 0), new C50165MDs(this.A02, 1));
            case 2:
                AnonymousClass982 anonymousClass982 = (AnonymousClass982) this.A07;
                return new C36415G4q(anonymousClass982.A00.requireActivity(), (InterfaceC11380iw) this.A01, anonymousClass982.A01, (InterfaceC08830cm) this.A02, new C1577876m((InterfaceC16820sZ) this.A04), (InterfaceC08830cm) this.A05, new C9GX(this.A03, 9), (InterfaceC08830cm) this.A06);
            case 3:
                if (((Boolean) ((C51762Yz) this.A05).A03).booleanValue()) {
                    C51762Yz c51762Yz = (C51762Yz) this.A03;
                    if (!((Boolean) c51762Yz.A03).booleanValue()) {
                        c51762Yz.A00();
                        AbstractC85353rQ.A02((Handler) this.A02, ((C84913qf) this.A07).A00, new C29210CuF((Animator) this.A01, (Animator) this.A04, (C51762Yz) this.A06, c51762Yz));
                    }
                }
                return new C79353gg(new C206939Dy(this.A02, 30));
            default:
                Context context = (Context) this.A01;
                Fragment fragment = (Fragment) this.A04;
                C65122xA c65122xA = (C65122xA) this.A07;
                UserSession userSession3 = c65122xA.A00;
                InterfaceC63682up interfaceC63682up = (InterfaceC63682up) this.A05;
                C63712us c63712us = (C63712us) this.A06;
                return new C65732yB(context, fragment, c65122xA.A01, userSession3, interfaceC63682up, (InterfaceC63682up) this.A03, c63712us, ((C63372uK) this.A02).A01, true);
        }
    }
}
