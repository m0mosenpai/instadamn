package X;

import android.content.Context;
import com.instagram.api.schemas.RepostRestrictedReason;
import com.instagram.common.session.UserSession;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.YDx, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C73454YDx implements C5yI {
    public final Context A00;
    public final C5yI A01;
    public final CQ8 A02;
    public final C44508JmE A03;

    public C73454YDx(Context context, InterfaceC132365yF interfaceC132365yF, L3A l3a, CQ8 cq8, C44508JmE c44508JmE, UserSession userSession, InterfaceC60442pS interfaceC60442pS, InterfaceC16660sJ interfaceC16660sJ, boolean z) {
        AbstractC25234BEr.A0k(4, cq8, l3a, context, userSession);
        C14360o3.A0B(interfaceC60442pS, 8);
        this.A01 = new C70593WdX(context, interfaceC132365yF, l3a, userSession, interfaceC60442pS, interfaceC16660sJ, z);
        this.A03 = c44508JmE;
        this.A02 = cq8;
        this.A00 = context;
    }

    public static C5yI A00(C73454YDx c73454YDx, Object obj) {
        C14360o3.A0B(obj, 0);
        return c73454YDx.A01;
    }

    @Override // X.C5yI
    public final void Cui(AbstractC136536Gh abstractC136536Gh, C136546Gi c136546Gi, String str, String str2, String str3, String str4, int i, boolean z) {
        AbstractC25234BEr.A0k(0, str, abstractC136536Gh, c136546Gi, str4);
        this.A01.Cui(abstractC136536Gh, c136546Gi, str, str2, str3, str4, i, z);
    }

    @Override // X.C5yI
    public final void D5q(String str, String str2, String str3, String str4, String str5, int i, boolean z) {
        AbstractC167017dG.A1O(str, str3);
        this.A01.D5q(str, str2, str3, str4, str5, i, z);
    }

    @Override // X.C5yI
    public final void D6A(String str, String str2, String str3, String str4, String str5, boolean z, String str6) {
        AbstractC167017dG.A1N(str, str2);
        this.A01.D6A(str, str2, str3, str4, str5, z, str6);
    }

    @Override // X.C5yI
    public final void D86(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        AbstractC167027dH.A12(str, str2, str3);
        if (!z) {
            CQ8 cq8 = this.A02;
            Context context = this.A00;
            C19L c19l = cq8.A01;
            AbstractC23641Du.A05(AnonymousClass191.A00, new MCJ(context, cq8, null, 32), c19l);
            return;
        }
        this.A01.D86(str, str2, str3, str4, str5, str6, str7, str8, z, z2, z3, z4, z5);
    }

    @Override // X.C5yI
    public final void DF6(String str) {
        C14360o3.A0B(str, 0);
        L5V l5v = this.A03.A03;
        AtomicBoolean atomicBoolean = C38321qM.A0i;
        Long A0j = AbstractC25231BEo.A0j(0, C38801rC.A06(str));
        if (A0j != null) {
            String str2 = C1QM.A00.A02.A00;
            UserSession userSession = l5v.A0A;
            InterfaceC60442pS interfaceC60442pS = l5v.A0C;
            if (str2 == null) {
                str2 = "";
            }
            InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A01(interfaceC60442pS, userSession), "barcelona_inline_reply_expand_tap");
            if (A0f.isSampled()) {
                AbstractC37300Gc1.A0h(A0f, A0j);
                AbstractC72046XLm.A0n(A0f, interfaceC60442pS);
                A0f.AAP("nav_chain", str2);
                A0f.Cht();
            }
        }
        C19L c19l = l5v.A0F;
        AbstractC23641Du.A05(AnonymousClass191.A00, new C50120MBu(l5v, str, null, 17), c19l);
    }

    @Override // X.C5yI
    public final void DGV(boolean z) {
        this.A01.DGV(z);
    }

    @Override // X.C5yI
    public final void DHx(C19260xA c19260xA, String str, String str2, String str3, String str4, boolean z, boolean z2) {
        AbstractC167017dG.A1N(str, str2);
        this.A01.DHx(c19260xA, str, str2, str3, str4, z, z2);
    }

    @Override // X.C5yI
    public final void DKg(String str) {
        C14360o3.A0B(str, 0);
    }

    @Override // X.C5yI
    public final void DMw() {
        this.A01.DMw();
    }

    @Override // X.C5yI
    public final void DOy(Boolean bool, String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z) {
        A00(this, str).DOy(bool, str, str2, str3, str4, str5, str6, str7, z);
    }

    @Override // X.C5yI
    public final void DRL(C51729Mt8 c51729Mt8, Integer num, String str, String str2, String str3, String str4) {
        AbstractC167017dG.A1N(str, str2);
        this.A01.DRL(c51729Mt8, num, str, str2, str3, str4);
    }

    @Override // X.C5yI
    public final void DZt(String str, String str2, String str3, String str4, String str5, String str6, List list) {
        AbstractC167017dG.A1O(str, str3);
        this.A01.DZt(str, str2, str3, str4, str5, str6, list);
    }

    @Override // X.C5yI
    public final void DbY(String str, String str2, String str3, String str4, String str5) {
        AbstractC167017dG.A1N(str, str2);
        this.A01.DbY(str, str2, str3, str4, str5);
    }

    @Override // X.C5yI
    public final void Dcw(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i) {
        AbstractC167017dG.A1O(str, str3);
        C14360o3.A0B(str4, 3);
        this.A01.Dcw(str, str2, str3, str4, str5, str6, str7, i);
    }

    @Override // X.C5yI
    public final void Dfi(RepostRestrictedReason repostRestrictedReason, String str, String str2, String str3, boolean z, boolean z2) {
        A00(this, str).Dfi(repostRestrictedReason, str, str2, str3, z, z2);
    }

    @Override // X.C5yI
    public final void DhO(String str) {
        C14360o3.A0B(str, 0);
    }

    @Override // X.C5yI
    public final void DjU(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        AbstractC167017dG.A1N(str, str2);
        this.A01.DjU(str, str2, str3, str4, str5, str6, str7);
    }

    @Override // X.C5yI
    public final void DwJ(String str) {
        C14360o3.A0B(str, 0);
    }

    @Override // X.C5yI
    public final void DxR() {
        this.A01.DxR();
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
        this.A01.DCr(str, str2);
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
    public final void DMQ(String str, String str2) {
        AbstractC167017dG.A1N(str, str2);
        this.A01.DMQ(str, str2);
    }

    @Override // X.C5yI
    public final void DMR(String str, String str2) {
        AbstractC167017dG.A1N(str, str2);
        this.A01.DMR(str, str2);
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
        this.A01.DQK(str, str2, str3);
    }

    @Override // X.C5yI
    public final void DS9(String str, String str2, String str3) {
        AbstractC167027dH.A12(str, str2, str3);
        this.A01.DS9(str, str2, str3);
    }

    @Override // X.C5yI
    public final void DSg(String str, String str2, boolean z, String str3) {
        AbstractC167017dG.A1O(str, str2);
        this.A01.DSg(str, str2, z, str3);
    }

    @Override // X.C5yI
    public final void DZZ(String str, String str2, int i) {
        AbstractC167017dG.A1N(str, str2);
        this.A01.DZZ(str, str2, i);
    }

    @Override // X.C5yI
    public final void Daa(String str, String str2) {
        AbstractC167017dG.A1N(str, str2);
        this.A01.Daa(str, str2);
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
        this.A01.Dcv(str, str2);
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
    public final void Dii(String str, long j) {
        A00(this, str).Dii(str, j);
    }

    @Override // X.C5yI
    public final void DjJ(String str, String str2, String str3) {
        AbstractC167027dH.A12(str, str2, str3);
        this.A01.DjJ(str, str2, str3);
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
        this.A01.Dry(str, str2);
    }

    @Override // X.C5yI
    public final void Drz(String str, String str2, String str3, String str4) {
        AbstractC167017dG.A1N(str, str2);
        this.A01.Drz(str, str2, str3, str4);
    }

    @Override // X.C5yI
    public final void Dtd(String str, String str2) {
        AbstractC167017dG.A1N(str, str2);
        this.A01.Dtd(str, str2);
    }

    @Override // X.C5yI
    public final void DwI(String str, String str2, String str3) {
        A00(this, str).DwI(str, str2, str3);
    }

    @Override // X.C5yI
    public final void Dx7(EnumC132255y4 enumC132255y4, String str, int i) {
        AbstractC167017dG.A1O(str, enumC132255y4);
        this.A01.Dx7(enumC132255y4, str, i);
    }

    @Override // X.C5yI
    public final void DxK(String str) {
        A00(this, str).DxK(str);
    }

    @Override // X.C5yI
    public final void E2m(String str, String str2) {
        AbstractC167017dG.A1N(str, str2);
        this.A01.E2m(str, str2);
    }
}
