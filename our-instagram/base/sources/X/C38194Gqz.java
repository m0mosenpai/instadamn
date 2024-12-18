package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.common.session.UserSession;

/* renamed from: X.Gqz, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38194Gqz extends C30O {
    public final UserSession A00;
    public final InterfaceC08830cm A01;
    public final InterfaceC08830cm A02;
    public final InterfaceC08830cm A03;

    public C38194Gqz(UserSession userSession, InterfaceC60442pS interfaceC60442pS, String str, InterfaceC08830cm interfaceC08830cm, InterfaceC08830cm interfaceC08830cm2, InterfaceC08830cm interfaceC08830cm3) {
        super(userSession, interfaceC60442pS, str, false);
        this.A00 = userSession;
        this.A01 = interfaceC08830cm;
        this.A02 = interfaceC08830cm2;
        this.A03 = interfaceC08830cm3;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, X.4Sf] */
    @Override // X.C30P
    public final void A0A(C19280xC c19280xC, C4SW c4sw) {
        C14360o3.A0B(c19280xC, 0);
        this.A01.get();
        ?? obj = new Object();
        C38167GqY c38167GqY = (C38167GqY) ((C46h) this.A02.get()).A04();
        if (c38167GqY != null) {
            C5qT c5qT = c38167GqY.A01;
            String A01 = AbstractC154266wb.A01(c5qT.A01, c5qT.A00);
            obj.A0V = A01;
            c19280xC.A0C("position", A01);
            C127915qK c127915qK = c38167GqY.A02;
            String A012 = AbstractC154266wb.A01(c127915qK.A03, c127915qK.A01);
            obj.A0W = A012;
            c19280xC.A0C("size", A012);
            Long valueOf = Long.valueOf(c38167GqY.A00);
            obj.A0P = valueOf;
            if (valueOf != null) {
                c19280xC.A0B(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, valueOf);
            }
            String str = c38167GqY.A03;
            if (str != null) {
                obj.A0Z = str;
                c19280xC.A0C("subtype", str);
            }
        }
        C38321qM c38321qM = (C38321qM) ((C46h) this.A03.get()).A04();
        if (c38321qM != null) {
            String mezqlToken = c38321qM.A0C.getMezqlToken();
            if (mezqlToken != null) {
                c19280xC.A0C("mezql_token", mezqlToken);
            }
            String A1G = AbstractC25226BEj.A1G(c38321qM);
            if (A1G != null) {
                c19280xC.A0C("ranking_info_token", A1G);
            }
        }
        if (c4sw != null) {
            c4sw.A07 = obj;
        }
    }

    @Override // X.C30O
    public final C95804So A0C(C38321qM c38321qM) {
        C14360o3.A0B(c38321qM, 0);
        C38167GqY c38167GqY = (C38167GqY) ((C46h) this.A02.get()).A04();
        C95804So A01 = A01(this.A00, c38321qM);
        if (c38167GqY != null) {
            String str = c38167GqY.A03;
            A01.A06("subtype", str);
            String id = c38321qM.getId();
            C4S0 c4s0 = C4S0.A05;
            if (C4S0.A03() && id != null) {
                c4s0.A04(id, str);
            }
        }
        return A01;
    }

    @Override // X.C30P
    public final Integer A08() {
        return C05F.A15;
    }

    @Override // X.C30O
    public final C4T2 A0D(C4T2 c4t2, C38321qM c38321qM) {
        AbstractC167017dG.A1N(c38321qM, c4t2);
        super.A0D(c4t2, c38321qM);
        C38167GqY c38167GqY = (C38167GqY) ((C46h) this.A02.get()).A04();
        if (c38167GqY != null) {
            c4t2.A05("instagram_grid_item_type", Long.valueOf(c38167GqY.A00));
        }
        return c4t2;
    }
}
