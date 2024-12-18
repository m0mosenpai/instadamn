package X;

import android.os.Bundle;
import com.instagram.common.session.UserSession;

/* renamed from: X.Mdh, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50850Mdh extends C9U7 {
    public final Bundle A00;
    public final InterfaceC11380iw A01;

    public C50850Mdh(Bundle bundle, InterfaceC08430c6 interfaceC08430c6, InterfaceC11380iw interfaceC11380iw) {
        super(bundle, interfaceC08430c6);
        this.A01 = interfaceC11380iw;
        this.A00 = bundle;
    }

    @Override // X.C9U7
    public final AbstractC52922bZ A02(C152406tQ c152406tQ, Class cls, String str) {
        AbstractC167017dG.A1P(cls, c152406tQ);
        UserSession A06 = C023409i.A0A.A06(this.A00);
        InterfaceC11380iw interfaceC11380iw = this.A01;
        P4X p4x = new P4X(interfaceC11380iw, A06);
        if (cls.isAssignableFrom(C50949MfI.class)) {
            return new C50949MfI(c152406tQ, A06, p4x);
        }
        if (cls.isAssignableFrom(C51011MgI.class)) {
            return new C51011MgI(c152406tQ, A06, p4x);
        }
        if (cls.isAssignableFrom(C51009MgG.class)) {
            return new C51009MgG(c152406tQ, A06, p4x);
        }
        if (cls.isAssignableFrom(C51038Mgo.class)) {
            return new C51038Mgo(c152406tQ, A06, p4x);
        }
        if (cls.isAssignableFrom(C50932Mf1.class)) {
            return new C50932Mf1(c152406tQ, A06, p4x);
        }
        if (cls.isAssignableFrom(C50933Mf2.class)) {
            return new C50933Mf2(c152406tQ, A06, p4x);
        }
        if (cls.isAssignableFrom(C51021MgT.class)) {
            return new C51021MgT(c152406tQ, A06, p4x);
        }
        if (cls.isAssignableFrom(C50963MfW.class)) {
            return new C50963MfW(c152406tQ, A06, p4x);
        }
        if (cls.isAssignableFrom(C50964MfX.class)) {
            return new C50964MfX(c152406tQ, interfaceC11380iw, A06);
        }
        if (cls.isAssignableFrom(C50921Meq.class)) {
            return new C50921Meq(c152406tQ, A06);
        }
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("viewModel ");
        A1C.append(cls);
        throw AbstractC166987dD.A12(AbstractC166997dE.A0x(" is not supported in LeadGenViewModelFactoryV2", A1C));
    }
}
