package X;

import com.instagram.api.schemas.BrandedContentProjectAction;
import com.instagram.api.schemas.BrandedContentProjectMetadataIntf;
import com.instagram.brandedcontent.disclosure.BrandedContentDisclosureArgs;
import com.instagram.brandedcontent.project.BrandedContentProjectRepository;
import com.instagram.brandedcontent.repository.BrandedContentApi;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.Mgz, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51047Mgz extends AbstractC52922bZ {
    public final BrandedContentDisclosureArgs A00;
    public final BrandedContentProjectRepository A01;
    public final BrandedContentApi A02;
    public final InterfaceC11380iw A03;
    public final UserSession A04;
    public final String A05;
    public final List A06;
    public final List A07;
    public final Map A08;
    public final Map A09;
    public final InterfaceC09390do A0A;
    public final InterfaceC24731Iq A0B;
    public final InterfaceC19390xP A0C;
    public final boolean A0D;

    /* JADX WARN: Code restructure failed: missing block: B:49:0x0208, code lost:
    
        if (r3 != false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x028e, code lost:
    
        if (r3 != false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0111, code lost:
    
        if (r0 != false) goto L28;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x02a8  */
    /* JADX WARN: Type inference failed for: r17v0, types: [X.0sZ] */
    /* JADX WARN: Type inference failed for: r18v0, types: [X.0sZ] */
    /* JADX WARN: Type inference failed for: r22v0, types: [X.0sZ] */
    /* JADX WARN: Type inference failed for: r3v45, types: [X.MHW] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.ArrayList A05(X.C54380O1m r25, com.instagram.user.model.User r26) {
        /*
            Method dump skipped, instructions count: 750
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C51047Mgz.A05(X.O1m, com.instagram.user.model.User):java.util.ArrayList");
    }

    public C51047Mgz(BrandedContentDisclosureArgs brandedContentDisclosureArgs, BrandedContentProjectRepository brandedContentProjectRepository, BrandedContentApi brandedContentApi, InterfaceC11380iw interfaceC11380iw, UserSession userSession) {
        AbstractC167027dH.A13(userSession, interfaceC11380iw, brandedContentDisclosureArgs);
        C14360o3.A0B(brandedContentProjectRepository, 5);
        this.A04 = userSession;
        this.A03 = interfaceC11380iw;
        this.A00 = brandedContentDisclosureArgs;
        this.A02 = brandedContentApi;
        this.A01 = brandedContentProjectRepository;
        this.A05 = brandedContentDisclosureArgs.A03;
        this.A0D = brandedContentDisclosureArgs.A05;
        this.A09 = AbstractC166987dD.A1I();
        this.A07 = AbstractC166987dD.A1E();
        this.A06 = AbstractC166987dD.A1E();
        this.A08 = AbstractC166987dD.A1I();
        this.A0A = AbstractC09440dt.A01(new C50150MDd(this, 39));
        C24721Ip A0s = MSY.A0s();
        this.A0B = A0s;
        this.A0C = AbstractC07080Za.A03(A0s);
        BrandedContentDisclosureArgs brandedContentDisclosureArgs2 = this.A00;
        List list = brandedContentDisclosureArgs2.A04;
        ArrayList A1E = AbstractC166987dD.A1E();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            User user = MSW.A0n(it).A00;
            if (user != null) {
                A1E.add(user);
            }
        }
        Iterator it2 = A1E.iterator();
        while (it2.hasNext()) {
            User A15 = AbstractC25226BEj.A15(it2);
            this.A08.put(A15.getId(), A15);
        }
        BrandedContentProjectMetadataIntf brandedContentProjectMetadataIntf = brandedContentDisclosureArgs2.A01;
        if (brandedContentProjectMetadataIntf != null) {
            String BiT = brandedContentProjectMetadataIntf.BiT();
            String BiU = brandedContentProjectMetadataIntf.BiU();
            BiU = BiU == null ? "" : BiU;
            String Ahu = brandedContentProjectMetadataIntf.Ahu();
            Ahu = Ahu == null ? "" : Ahu;
            String Ai2 = brandedContentProjectMetadataIntf.Ai2();
            C51675Ms6 c51675Ms6 = new C51675Ms6(brandedContentProjectMetadataIntf.AaB(), AbstractC167007dF.A0d(), BiT, BiU, Ahu, Ai2 == null ? "" : Ai2, brandedContentProjectMetadataIntf.AkC(), brandedContentProjectMetadataIntf.AkB(), null);
            this.A09.put(c51675Ms6.A00(), c51675Ms6);
            if (brandedContentProjectMetadataIntf.AYK() == BrandedContentProjectAction.A04) {
                this.A08.put(c51675Ms6.A00().getId(), c51675Ms6.A00());
            }
        }
        MSY.A1M(this, AbstractC141776au.A00(this), 15);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0030, code lost:
    
        if (r3.A1s() != false) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.C65954Twz A00(X.C51047Mgz r2, com.instagram.user.model.User r3) {
        /*
            com.instagram.common.session.UserSession r0 = r2.A04
            boolean r0 = X.C4A4.A02(r0)
            if (r0 == 0) goto Le
            X.Twz r2 = new X.Twz
            r2.<init>()
            return r2
        Le:
            java.util.Map r1 = r2.A08
            java.lang.String r0 = r3.getId()
            boolean r0 = r1.containsKey(r0)
            X.Twz r2 = new X.Twz
            if (r0 == 0) goto L3d
            r2.<init>()
            X.17P r0 = r3.A03
            com.instagram.api.schemas.BrandedContentBrandTaggingRequestApprovalStatus r1 = r0.AcS()
            com.instagram.api.schemas.BrandedContentBrandTaggingRequestApprovalStatus r0 = com.instagram.api.schemas.BrandedContentBrandTaggingRequestApprovalStatus.A07
            if (r1 == r0) goto L32
            boolean r1 = r3.A1s()
            r0 = 2131969455(0x7f1345af, float:1.9575833E38)
            if (r1 == 0) goto L35
        L32:
            r0 = 2131952460(0x7f13034c, float:1.9541363E38)
        L35:
            X.AbstractC50523MSb.A1J(r2, r0)
            X.4do r0 = X.EnumC99704do.A06
        L3a:
            r2.A03 = r0
            return r2
        L3d:
            r2.<init>()
            r0 = 2131952265(0x7f130289, float:1.9540968E38)
            X.AbstractC50523MSb.A1J(r2, r0)
            X.4do r0 = X.EnumC99704do.A03
            goto L3a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C51047Mgz.A00(X.Mgz, com.instagram.user.model.User):X.Twz");
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x008b, code lost:
    
        if (r8.A03.AcS() == com.instagram.api.schemas.BrandedContentBrandTaggingRequestApprovalStatus.A07) goto L24;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [X.NKo, X.MZs] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.util.List, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r6v3, types: [X.0sl] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A01(com.instagram.api.schemas.BrandedContentProjectMetadataIntf r18, X.C51047Mgz r19) {
        /*
            Method dump skipped, instructions count: 323
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C51047Mgz.A01(com.instagram.api.schemas.BrandedContentProjectMetadataIntf, X.Mgz):void");
    }

    private final void A04(User user, boolean z) {
        String str;
        if (z) {
            str = "added";
        } else {
            str = "removed";
        }
        UserSession userSession = this.A04;
        LL0.A04(this.A03, userSession, C05F.A0D, userSession.userId, AbstractC25232BEp.A1F("has_brand_approval", String.valueOf(user.A1s()), AbstractC166987dD.A1L("brand_id", user.getId()), AbstractC166987dD.A1L("action_type", str)));
    }

    public static final void A02(C51047Mgz c51047Mgz, C66183U2y c66183U2y, Integer num, String str, String str2, List list, boolean z) {
        C51760Mtj A02;
        boolean z2 = true;
        if (!list.isEmpty()) {
            int i = 3;
            if (z && list.size() > 3) {
                C14360o3.A0B(str, 0);
                A02 = new C51760Mtj(new BQO(str), C05F.A0C, num);
            } else {
                z2 = false;
                A02 = OY6.A02(str);
            }
            AbstractC50523MSb.A1I(c66183U2y, A02);
            if (str2 != null) {
                c66183U2y.A03(C05F.A00, new C51760Mtj(str2, (CharSequence) null, (CharSequence) null, 47));
            }
            if (!z2) {
                i = list.size();
            }
            Iterator it = AbstractC001800i.A0d(list, i).iterator();
            while (it.hasNext()) {
                User A15 = AbstractC25226BEj.A15(it);
                c66183U2y.A02(A00(c51047Mgz, A15), new C65741TtG(A15));
            }
        }
    }

    public static final void A03(C51047Mgz c51047Mgz, InterfaceC57804PkW... interfaceC57804PkWArr) {
        AbstractC166987dD.A1Z(new PYh(interfaceC57804PkWArr, c51047Mgz, null, 0), AbstractC141776au.A00(c51047Mgz));
    }
}
