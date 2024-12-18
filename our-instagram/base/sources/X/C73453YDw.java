package X;

import android.content.Context;
import com.instagram.api.schemas.RepostRestrictedReason;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.YDw, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C73453YDw implements C5yI {
    public final C5yI A00;
    public final C44463JlV A01;

    public C73453YDw(Context context, C44463JlV c44463JlV, InterfaceC132365yF interfaceC132365yF, L3A l3a, UserSession userSession, InterfaceC60442pS interfaceC60442pS, InterfaceC16660sJ interfaceC16660sJ) {
        AbstractC25234BEr.A0k(4, l3a, userSession, interfaceC60442pS, context);
        this.A00 = new C70593WdX(context, interfaceC132365yF, l3a, userSession, interfaceC60442pS, interfaceC16660sJ, false);
        this.A01 = c44463JlV;
    }

    public static C5yI A00(C73453YDw c73453YDw, Object obj) {
        C14360o3.A0B(obj, 0);
        return c73453YDw.A00;
    }

    @Override // X.C5yI
    public final void Cui(AbstractC136536Gh abstractC136536Gh, C136546Gi c136546Gi, String str, String str2, String str3, String str4, int i, boolean z) {
        AbstractC25234BEr.A0k(0, str, abstractC136536Gh, c136546Gi, str4);
        this.A00.Cui(abstractC136536Gh, c136546Gi, str, str2, str3, str4, i, z);
    }

    @Override // X.C5yI
    public final void D5q(String str, String str2, String str3, String str4, String str5, int i, boolean z) {
        AbstractC167017dG.A1O(str, str3);
        this.A00.D5q(str, str2, str3, str4, str5, i, z);
    }

    @Override // X.C5yI
    public final void D6A(String str, String str2, String str3, String str4, String str5, boolean z, String str6) {
        AbstractC167017dG.A1N(str, str2);
        this.A00.D6A(str, str2, str3, str4, str5, z, str6);
    }

    @Override // X.C5yI
    public final void D86(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        AbstractC167027dH.A12(str, str2, str3);
        this.A00.D86(str, str2, str3, str4, str5, str6, str7, str8, z, z2, z3, z4, z5);
    }

    @Override // X.C5yI
    public final void DGV(boolean z) {
        this.A00.DGV(z);
    }

    @Override // X.C5yI
    public final void DHx(C19260xA c19260xA, String str, String str2, String str3, String str4, boolean z, boolean z2) {
        AbstractC167017dG.A1N(str, str2);
        this.A00.DHx(c19260xA, str, str2, str3, str4, z, z2);
    }

    @Override // X.C5yI
    public final void DMw() {
        this.A00.DMw();
    }

    @Override // X.C5yI
    public final void DOy(Boolean bool, String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z) {
        C14360o3.A0B(str, 0);
        C44463JlV c44463JlV = this.A01;
        C38321qM A02 = c44463JlV.A05.A02(str);
        if (A02 != null) {
            Context applicationContext = c44463JlV.A0D().getApplicationContext();
            C14360o3.A07(applicationContext);
            XiA.A00(applicationContext, c44463JlV.A04, null, A02, c44463JlV.A06, null, null, null, 0, z, false);
            C44463JlV.A03(c44463JlV, A02);
        }
    }

    @Override // X.C5yI
    public final void DRL(C51729Mt8 c51729Mt8, Integer num, String str, String str2, String str3, String str4) {
        AbstractC167017dG.A1N(str, str2);
        this.A00.DRL(c51729Mt8, num, str, str2, str3, str4);
    }

    @Override // X.C5yI
    public final void DZt(String str, String str2, String str3, String str4, String str5, String str6, List list) {
        AbstractC167017dG.A1O(str, str3);
        this.A00.DZt(str, str2, str3, str4, str5, str6, list);
    }

    @Override // X.C5yI
    public final void DbY(String str, String str2, String str3, String str4, String str5) {
        AbstractC167017dG.A1N(str, str2);
        this.A00.DbY(str, str2, str3, str4, str5);
    }

    @Override // X.C5yI
    public final void Dcw(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i) {
        AbstractC167017dG.A1O(str, str3);
        C14360o3.A0B(str4, 3);
        this.A00.Dcw(str, str2, str3, str4, str5, str6, str7, i);
    }

    @Override // X.C5yI
    public final void Dfi(RepostRestrictedReason repostRestrictedReason, String str, String str2, String str3, boolean z, boolean z2) {
        A00(this, str).Dfi(repostRestrictedReason, str, str2, str3, z, z2);
    }

    @Override // X.C5yI
    public final void DjU(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        AbstractC167017dG.A1N(str, str2);
        this.A00.DjU(str, str2, str3, str4, str5, str6, str7);
    }

    @Override // X.C5yI
    public final void DxR() {
        this.A00.DxR();
    }

    @Override // X.C5yI
    public final void CvA(C38641Gyi c38641Gyi) {
        A00(this, c38641Gyi).CvA(c38641Gyi);
    }

    @Override // X.C5yI
    public final void D7q(String str, String str2, long j) {
        A00(this, str).D7q(str, str2, j);
    }

    @Override // X.C5yI
    public final void D9n(String str) {
        A00(this, str).D9n(str);
    }

    @Override // X.C5yI
    public final void DCr(String str, String str2) {
        AbstractC167017dG.A1N(str, str2);
        this.A00.DCr(str, str2);
    }

    @Override // X.C5yI
    public final void DF6(String str) {
        A00(this, str).DF6(str);
    }

    @Override // X.C5yI
    public final void DJ5(String str) {
        A00(this, str).DJ5(str);
    }

    @Override // X.C5yI
    public final void DJ6(String str) {
        A00(this, str).DJ6(str);
    }

    @Override // X.C5yI
    public final void DKg(String str) {
        A00(this, str).DKg(str);
    }

    @Override // X.C5yI
    public final void DMQ(String str, String str2) {
        AbstractC167017dG.A1N(str, str2);
        this.A00.DMQ(str, str2);
    }

    @Override // X.C5yI
    public final void DMR(String str, String str2) {
        AbstractC167017dG.A1N(str, str2);
        this.A00.DMR(str, str2);
    }

    @Override // X.C5yI
    public final void DMS(String str) {
        A00(this, str).DMS(str);
    }

    @Override // X.C5yI
    public final void DQJ(String str) {
        A00(this, str).DQJ(str);
    }

    @Override // X.C5yI
    public final void DQK(String str, String str2, String str3) {
        AbstractC167027dH.A12(str, str2, str3);
        this.A00.DQK(str, str2, str3);
    }

    @Override // X.C5yI
    public final void DS9(String str, String str2, String str3) {
        AbstractC167027dH.A12(str, str2, str3);
        this.A00.DS9(str, str2, str3);
    }

    @Override // X.C5yI
    public final void DSg(String str, String str2, boolean z, String str3) {
        AbstractC167017dG.A1O(str, str2);
        this.A00.DSg(str, str2, z, str3);
    }

    @Override // X.C5yI
    public final void DZZ(String str, String str2, int i) {
        AbstractC167017dG.A1N(str, str2);
        this.A00.DZZ(str, str2, i);
    }

    @Override // X.C5yI
    public final void Daa(String str, String str2) {
        AbstractC167017dG.A1N(str, str2);
        this.A00.Daa(str, str2);
    }

    @Override // X.C5yI
    public final void Daz(String str, boolean z) {
        A00(this, str).Daz(str, z);
    }

    @Override // X.C5yI
    public final void Dcu(String str) {
        A00(this, str).Dcu(str);
    }

    @Override // X.C5yI
    public final void Dcv(String str, String str2) {
        AbstractC167017dG.A1N(str, str2);
        this.A00.Dcv(str, str2);
    }

    @Override // X.C5yI
    public final void Dfj(RepostRestrictedReason repostRestrictedReason, String str, String str2, boolean z) {
        A00(this, str).Dfj(repostRestrictedReason, str, str2, z);
    }

    @Override // X.C5yI
    public final void DhI(String str) {
        A00(this, str).DhI(str);
    }

    @Override // X.C5yI
    public final void DhO(String str) {
        A00(this, str).DhO(str);
    }

    @Override // X.C5yI
    public final void Dii(String str, long j) {
        A00(this, str).Dii(str, j);
    }

    @Override // X.C5yI
    public final void DjJ(String str, String str2, String str3) {
        AbstractC167027dH.A12(str, str2, str3);
        this.A00.DjJ(str, str2, str3);
    }

    @Override // X.C5yI
    public final void Djq(String str) {
        A00(this, str).Djq(str);
    }

    @Override // X.C5yI
    public final void DlT(String str, String str2, String str3) {
        A00(this, str).DlT(str, str2, str3);
    }

    @Override // X.C5yI
    public final void DlX(String str, String str2, String str3) {
        A00(this, str).DlX(str, str2, str3);
    }

    @Override // X.C5yI
    public final void Dry(String str, String str2) {
        AbstractC167017dG.A1N(str, str2);
        this.A00.Dry(str, str2);
    }

    @Override // X.C5yI
    public final void Drz(String str, String str2, String str3, String str4) {
        AbstractC167017dG.A1N(str, str2);
        this.A00.Drz(str, str2, str3, str4);
    }

    @Override // X.C5yI
    public final void Dtd(String str, String str2) {
        AbstractC167017dG.A1N(str, str2);
        this.A00.Dtd(str, str2);
    }

    @Override // X.C5yI
    public final void DwI(String str, String str2, String str3) {
        A00(this, str).DwI(str, str2, str3);
    }

    @Override // X.C5yI
    public final void DwJ(String str) {
        A00(this, str).DwJ(str);
    }

    @Override // X.C5yI
    public final void Dx7(EnumC132255y4 enumC132255y4, String str, int i) {
        AbstractC167017dG.A1O(str, enumC132255y4);
        this.A00.Dx7(enumC132255y4, str, i);
    }

    @Override // X.C5yI
    public final void DxK(String str) {
        A00(this, str).DxK(str);
    }

    @Override // X.C5yI
    public final void E2m(String str, String str2) {
        AbstractC167017dG.A1N(str, str2);
        this.A00.E2m(str, str2);
    }
}
