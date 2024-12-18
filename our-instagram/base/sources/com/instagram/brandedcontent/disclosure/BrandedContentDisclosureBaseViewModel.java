package com.instagram.brandedcontent.disclosure;

import X.AbstractC001800i;
import X.AbstractC07080Za;
import X.AbstractC141776au;
import X.AbstractC166987dD;
import X.AbstractC172137li;
import X.AbstractC25229BEm;
import X.AbstractC25651Mw;
import X.AbstractC31172DnG;
import X.AbstractC37300Gc1;
import X.AbstractC43593JPy;
import X.AbstractC52922bZ;
import X.C14360o3;
import X.C16930sl;
import X.C24721Ip;
import X.C38321qM;
import X.C50120MBu;
import X.C56023Otu;
import X.InterfaceC02590Ai;
import X.InterfaceC11380iw;
import X.InterfaceC19390xP;
import X.InterfaceC24731Iq;
import X.InterfaceC38831rF;
import X.InterfaceC43551JLl;
import X.MSW;
import X.MSY;
import com.instagram.api.schemas.BrandedContentGatingInfo;
import com.instagram.brandedcontent.ads.repository.BrandedContentAdsApi;
import com.instagram.common.session.UserSession;
import com.instagram.pendingmedia.model.BrandedContentTag;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes9.dex */
public abstract class BrandedContentDisclosureBaseViewModel extends AbstractC52922bZ {
    public InterfaceC43551JLl A00;
    public BrandedContentGatingInfo A01;
    public BrandedContentGatingInfo A02;
    public String A03;
    public String A04;
    public String A05;
    public List A06;
    public List A07;
    public List A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public final BrandedContentAdsApi A0F;
    public final InterfaceC24731Iq A0G;
    public final InterfaceC19390xP A0H;
    public final UserSession A0I;

    public BrandedContentDisclosureBaseViewModel(BrandedContentAdsApi brandedContentAdsApi, UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A0I = userSession;
        this.A0F = brandedContentAdsApi;
        C24721Ip A0s = MSY.A0s();
        this.A0G = A0s;
        this.A0H = AbstractC07080Za.A03(A0s);
        this.A06 = AbstractC166987dD.A1E();
        this.A01 = new BrandedContentGatingInfo(null, null, null, null, null);
        C16930sl c16930sl = C16930sl.A00;
        this.A07 = c16930sl;
        this.A08 = c16930sl;
        this.A02 = new BrandedContentGatingInfo(null, null, null, null, null);
        this.A05 = "feed";
        this.A03 = "";
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0028, code lost:
    
        if (r2.A0E == false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A04() {
        /*
            Method dump skipped, instructions count: 434
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.brandedcontent.disclosure.BrandedContentDisclosureBaseViewModel.A04():void");
    }

    public final void A05(User user) {
        List list = this.A06;
        ArrayList A1E = AbstractC166987dD.A1E();
        for (Object obj : list) {
            AbstractC43593JPy.A1R(((BrandedContentTag) obj).A01, user.getId(), obj, A1E);
        }
        Iterator it = A1E.iterator();
        while (it.hasNext()) {
            this.A06.remove(it.next());
        }
        if (this.A06.size() == 1) {
            ((BrandedContentTag) this.A06.get(0)).A04 = AbstractC172137li.A06(A02(), this.A05, this.A0D, this.A09);
        }
        A04();
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0088, code lost:
    
        if (r2 > 2) goto L27;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A06(java.util.List r14) {
        /*
            Method dump skipped, instructions count: 252
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.brandedcontent.disclosure.BrandedContentDisclosureBaseViewModel.A06(java.util.List):void");
    }

    public final boolean A07(InterfaceC11380iw interfaceC11380iw, String str) {
        String str2;
        BrandedContentTag brandedContentTag;
        if (!this.A0D) {
            this.A0B = true;
            A04();
            AbstractC25651Mw.A00(A02()).E4s(new C56023Otu(true));
            return true;
        }
        if (str == null) {
            return false;
        }
        this.A0B = true;
        this.A0C = true;
        A04();
        C50120MBu.A01(this, str, AbstractC141776au.A00(this), 19);
        if (AbstractC166987dD.A1b(this.A06) && (brandedContentTag = (BrandedContentTag) AbstractC001800i.A0O(this.A06, 0)) != null) {
            str2 = brandedContentTag.A01;
        } else {
            str2 = null;
        }
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC31172DnG.A0Q(interfaceC11380iw, A02(), 0), "instagram_bc_boost_code_access_token_enable");
        AbstractC37300Gc1.A0n(A0f, null);
        MSW.A1S(A0f, str);
        A0f.AAP("sponsor_igid", str2);
        A0f.Cht();
        return true;
    }

    public static final void A00(BrandedContentDisclosureBaseViewModel brandedContentDisclosureBaseViewModel) {
        C38321qM A0h;
        List list;
        String str = brandedContentDisclosureBaseViewModel.A04;
        if (str != null && (A0h = AbstractC25229BEm.A0h(brandedContentDisclosureBaseViewModel.A02(), str)) != null) {
            InterfaceC43551JLl interfaceC43551JLl = brandedContentDisclosureBaseViewModel.A00;
            InterfaceC38831rF interfaceC38831rF = A0h.A0C;
            if (interfaceC43551JLl != null) {
                list = AbstractC166987dD.A1J(interfaceC43551JLl);
            } else {
                list = null;
            }
            interfaceC38831rF.EQU(list);
        }
    }

    public final UserSession A02() {
        if (this instanceof BrandedContentDisclosureViewModel) {
            return ((BrandedContentDisclosureViewModel) this).A02;
        }
        return ((BrandedContentDisclosureMenuViewModel) this).A05;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A03(X.InterfaceC23621Ds r8) {
        /*
            r7 = this;
            r3 = 9
            boolean r0 = X.MAG.A01(r8, r3)
            if (r0 == 0) goto La1
            r6 = r8
            X.MAG r6 = (X.MAG) r6
            int r2 = r6.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto La1
            int r2 = r2 - r1
            r6.A00 = r2
        L16:
            java.lang.Object r1 = r6.A02
            X.1JX r5 = X.C1JX.A02
            int r0 = r6.A00
            r4 = 1
            if (r0 == 0) goto L6d
            if (r0 != r4) goto Lb1
            java.lang.Object r6 = r6.A01
            com.instagram.brandedcontent.disclosure.BrandedContentDisclosureBaseViewModel r6 = (com.instagram.brandedcontent.disclosure.BrandedContentDisclosureBaseViewModel) r6
            X.AbstractC09560e7.A00(r1)
        L28:
            X.3NY r1 = (X.C3NY) r1
            boolean r0 = r1 instanceof X.C3NX
            if (r0 == 0) goto La8
            X.3NX r1 = (X.C3NX) r1
            java.lang.Object r0 = r1.A00
            X.PrM r0 = (X.InterfaceC58216PrM) r0
            X.Muh r0 = (X.C51777Muh) r0
            java.util.List r0 = r0.A00
            java.util.ArrayList r5 = X.AbstractC167017dG.A0q(r0)
            java.util.Iterator r4 = r0.iterator()
        L40:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto Lb6
            java.lang.Object r1 = r4.next()
            X.4ip r1 = (X.InterfaceC102194ip) r1
            com.instagram.user.model.User r3 = r1.BzF()
            java.lang.Boolean r0 = r1.BcT()
            boolean r2 = X.AbstractC167007dF.A1T(r0)
            java.lang.Boolean r0 = r1.Ca9()
            if (r0 == 0) goto L6b
            boolean r1 = r0.booleanValue()
        L62:
            com.instagram.pendingmedia.model.BrandedContentTag r0 = new com.instagram.pendingmedia.model.BrandedContentTag
            r0.<init>(r3, r2, r1)
            r5.add(r0)
            goto L40
        L6b:
            r1 = 1
            goto L62
        L6d:
            X.AbstractC09560e7.A00(r1)
            com.instagram.common.session.UserSession r0 = r7.A02()
            com.instagram.brandedcontent.repository.BrandedContentApi r3 = new com.instagram.brandedcontent.repository.BrandedContentApi
            r3.<init>(r0)
            java.util.List r0 = r7.A08
            java.util.ArrayList r2 = X.AbstractC166987dD.A1E()
            java.util.Iterator r1 = r0.iterator()
        L83:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L95
            com.instagram.pendingmedia.model.BrandedContentTag r0 = X.MSW.A0n(r1)
            java.lang.String r0 = r0.A01
            if (r0 == 0) goto L83
            r2.add(r0)
            goto L83
        L95:
            r6.A01 = r7
            r6.A00 = r4
            java.lang.Object r1 = r3.A09(r2, r6)
            if (r1 == r5) goto Lc1
            r6 = r7
            goto L28
        La1:
            X.MAG r6 = new X.MAG
            r6.<init>(r7, r8, r3)
            goto L16
        La8:
            boolean r0 = r1 instanceof X.C194848jk
            if (r0 != 0) goto Lbf
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        Lb1:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        Lb6:
            java.util.ArrayList r0 = X.AbstractC001800i.A0U(r5)
            r6.A06 = r0
            r6.A04()
        Lbf:
            X.0eB r5 = X.C0eB.A00
        Lc1:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.brandedcontent.disclosure.BrandedContentDisclosureBaseViewModel.A03(X.1Ds):java.lang.Object");
    }

    public final boolean A08(boolean z) {
        if (!this.A06.isEmpty()) {
            ((BrandedContentTag) AbstractC166987dD.A16(this.A06)).A04 = z;
        }
        A04();
        return true;
    }
}
