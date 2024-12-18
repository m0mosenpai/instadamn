package X;

import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;

/* renamed from: X.JXf, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43766JXf implements InterfaceC92864Ec {
    public C07T A00;
    public C0eR A01;
    public C43995Jci A02;
    public C4FT A03;
    public final Fragment A04;
    public final InterfaceC11380iw A05;
    public final UserSession A06;
    public final C4F7 A07;
    public final InterfaceC09390do A08;
    public final InterfaceC19960yQ A09;
    public final C4F8 A0A;

    public C43766JXf(Fragment fragment, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C43995Jci c43995Jci) {
        this.A06 = userSession;
        this.A05 = interfaceC11380iw;
        this.A04 = fragment;
        this.A02 = c43995Jci;
        C0eR c0eR = new C0eR(this);
        this.A01 = c0eR;
        this.A00 = c0eR;
        C50246MHb c50246MHb = new C50246MHb(this, 46);
        InterfaceC09390do A00 = AbstractC09440dt.A00(EnumC09460dv.A02, new C50246MHb(new C50246MHb(fragment, 47), 48));
        C60842q8 A0a = AbstractC25225BEi.A0a(new C50246MHb(A00, 49), c50246MHb, new C50170MDx(35, null, A00), AbstractC25225BEi.A1D(C92874Ed.class));
        this.A08 = A0a;
        this.A09 = new JRY(this, 41);
        C92874Ed c92874Ed = (C92874Ed) A0a.getValue();
        C4FT c4ft = this.A03;
        C14360o3.A0B(c92874Ed, 0);
        C4F6 c4f6 = new C4F6(c92874Ed, c4ft);
        this.A07 = c4f6;
        this.A0A = new C4F8(fragment, interfaceC11380iw, userSession, c4f6, null, false);
        AbstractC44023JdA.A00(fragment, new MCO(this, (InterfaceC23621Ds) null, 3));
        AbstractC44023JdA.A00(fragment, new MCO(this, (InterfaceC23621Ds) null, 4));
        AbstractC44023JdA.A00(fragment, new MCO(this, (InterfaceC23621Ds) null, 5));
        AbstractC44023JdA.A00(fragment, new MCO(this, (InterfaceC23621Ds) null, 6));
        AbstractC44023JdA.A00(fragment, new MCO(this, (InterfaceC23621Ds) null, 7));
    }

    public static C92874Ed A00(C43766JXf c43766JXf) {
        return (C92874Ed) c43766JXf.A08.getValue();
    }

    @Override // X.InterfaceC92864Ec
    public final C4F8 Amm() {
        return this.A0A;
    }

    @Override // X.InterfaceC92864Ec
    public final C4F7 BXL() {
        return this.A07;
    }

    @Override // X.InterfaceC92864Ec
    public final void EdB(C4FT c4ft) {
        this.A03 = c4ft;
    }

    @Override // X.InterfaceC92864Ec
    public final void FAD(C4F5 c4f5, boolean z) {
        if (C4AC.A0F(this.A06)) {
            A00(this).A04(c4f5, z);
        }
    }

    @Override // X.InterfaceC92864Ec, X.C07X
    public final C07T getLifecycle() {
        return this.A00;
    }

    @Override // X.InterfaceC92864Ec
    public final boolean E4X() {
        return A00(this).A06();
    }
}
