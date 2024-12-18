package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.pendingmedia.model.constants.ShareType;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.1u0, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C40321u0 implements InterfaceC40171tl {
    public static final C1OZ A04 = new C1OZ() { // from class: X.1u1
        @Override // X.C1OZ
        public final /* bridge */ /* synthetic */ Object E3S(C16L c16l) {
            C14360o3.A0B(c16l, 0);
            C40321u0 parseFromJson = AbstractC54074NvY.parseFromJson(c16l);
            C14360o3.A07(parseFromJson);
            return parseFromJson;
        }

        @Override // X.C1OZ
        public final void EOu(AnonymousClass182 anonymousClass182, Object obj) {
            C14360o3.A0B(anonymousClass182, 0);
            C14360o3.A0B(obj, 1);
            C40321u0 c40321u0 = (C40321u0) obj;
            anonymousClass182.A0d();
            anonymousClass182.A0Q("sub_share_id", c40321u0.A00);
            anonymousClass182.A0T("is_configured_in_server", c40321u0.A02);
            String str = c40321u0.A01;
            if (str != null) {
                anonymousClass182.A0S("group_destination_id", str);
            }
            anonymousClass182.A0a();
        }
    };
    public int A00;
    public String A01;
    public boolean A02;
    public final ShareType A03 = ShareType.A0H;

    @Override // X.InterfaceC40181tm
    public final /* bridge */ /* synthetic */ Object AEm(C47Z c47z) {
        C14360o3.A0B(c47z, 0);
        return new CPF(c47z);
    }

    @Override // X.InterfaceC40171tl
    public final boolean CUB() {
        return false;
    }

    @Override // X.InterfaceC40171tl
    public final boolean CUC() {
        return false;
    }

    @Override // X.InterfaceC40181tm
    public final /* synthetic */ void DEN(InterfaceC40821up interfaceC40821up, UserSession userSession, C47Z c47z) {
    }

    @Override // X.InterfaceC40181tm
    public C38321qM DqT(Context context, InterfaceC40821up interfaceC40821up, UserSession userSession, C47Z c47z) {
        C14360o3.A0B(userSession, 0);
        C14360o3.A0B(c47z, 1);
        C14360o3.A0B(context, 3);
        C14360o3.A0C(interfaceC40821up, "null cannot be cast to non-null type com.instagram.pendingmedia.configurehandler.response.ConfigureMediaResponse");
        C38321qM c38321qM = ((N3A) interfaceC40821up).A00;
        if (c38321qM != null) {
            String str = c47z.A3t;
            if (C28531Zo.A04 != null) {
                List A00 = AbstractC186788Pv.A00(userSession).A00(str);
                if (A00 == null) {
                    A00 = C16930sl.A00;
                }
                List<User> A3g = c38321qM.A3g();
                C28531Zo.A04.A0G(userSession, "FEED", A3g, A00);
                for (User user : A3g) {
                    DirectShareTarget directShareTarget = new DirectShareTarget(user);
                    if (AbstractC186788Pv.A01(userSession) || A00.contains(user.getId())) {
                        C28531Zo.A04.A0B(userSession, c38321qM, directShareTarget);
                    }
                }
            }
            return c38321qM;
        }
        throw new IllegalStateException("Required value was null.");
    }

    @Override // X.InterfaceC40181tm
    public N3A E3U(C3JY c3jy, UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        C14360o3.A0B(c3jy, 1);
        return (N3A) new C56150OwG(new C07510aQ(userSession), new C55920OsC()).A00(c3jy);
    }

    @Override // X.InterfaceC40181tm
    public final void E4y(UserSession userSession, C47Z c47z, C54783OIx c54783OIx) {
        C14360o3.A0B(userSession, 0);
        C14360o3.A0B(c47z, 1);
        C14360o3.A0B(c54783OIx, 2);
        C38321qM c38321qM = c47z.A1C;
        if (c38321qM != null) {
            if (c47z.A0t()) {
                List A0K = c47z.A0K();
                if (A0K.size() != c38321qM.A0p()) {
                    C0w9.A03("carousel_upload_size_mismatch", AbstractC13670mt.A06("pending media count:%d, uploaded media count:%d", Integer.valueOf(A0K.size()), Integer.valueOf(c38321qM.A0p())));
                }
                int i = 0;
                for (Object obj : A0K) {
                    int i2 = i + 1;
                    if (i < 0) {
                        AbstractC16960so.A1U();
                        throw C00O.createAndThrow();
                    }
                    c54783OIx.A00(c38321qM.A1e(i), (C47Z) obj, false);
                    i = i2;
                }
            } else {
                EnumC40111tc enumC40111tc = c47z.A1G;
                if (enumC40111tc != EnumC40111tc.A0X && enumC40111tc != EnumC40111tc.A0Y) {
                    c54783OIx.A00(c38321qM, c47z, false);
                }
            }
            User A2E = c38321qM.A2E(userSession);
            if (A2E != null) {
                A2E.A0X();
                Integer BQb = A2E.A03.BQb();
                if (BQb != null && BQb.intValue() == 1) {
                    AnonymousClass189.A00(userSession).A03(A2E);
                } else {
                    A2E.A0c(userSession);
                }
            }
            AbstractC25651Mw.A00(userSession).E4s(new C70083Cs(c47z));
        }
    }

    @Override // X.C1OX
    public final String getTypeName() {
        return "FollowersShareTarget";
    }

    @Override // X.InterfaceC40171tl
    public final ShareType BuN() {
        return this.A03;
    }

    @Override // X.InterfaceC40171tl
    public final int C3D() {
        return this.A00;
    }

    @Override // X.InterfaceC40171tl
    public final boolean CRc() {
        return this.A02;
    }

    @Override // X.InterfaceC40171tl
    public final boolean CVX() {
        if (this.A01 == null) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC40171tl
    public final void ERy(boolean z) {
        this.A02 = z;
    }

    @Override // X.InterfaceC40171tl
    public final void Ef4(int i) {
        this.A00 = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:188:0x05d7, code lost:
    
        if (X.C08730cb.A00(r49).A00().A0M() != X.C05F.A01) goto L216;
     */
    /* JADX WARN: Code restructure failed: missing block: B:192:0x05f2, code lost:
    
        if (X.C08730cb.A00(r49).A00().A0M() != X.C05F.A0C) goto L222;
     */
    /* JADX WARN: Code restructure failed: missing block: B:263:0x0781, code lost:
    
        if (r8.length() == 0) goto L292;
     */
    /* JADX WARN: Code restructure failed: missing block: B:391:0x0600, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, r49, 36312999299909204L) != false) goto L223;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x038f  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x03af  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x03dd  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x03eb  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x03f7  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0403  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x040d  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0416  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0450  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0466  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x04cb  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x04d9  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x04e7  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x04f3  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0513  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0591  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x05a9  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x077c  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x0789  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x0792  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x07a8  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x07c0  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x07d1  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x07e5  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x07f1  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x0813  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x0859  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x0862  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x0876  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x0889  */
    /* JADX WARN: Removed duplicated region for block: B:329:0x08d9  */
    /* JADX WARN: Removed duplicated region for block: B:332:0x08ed  */
    /* JADX WARN: Removed duplicated region for block: B:335:0x08fd  */
    /* JADX WARN: Removed duplicated region for block: B:337:0x0904  */
    /* JADX WARN: Removed duplicated region for block: B:345:0x0921  */
    /* JADX WARN: Removed duplicated region for block: B:348:0x092f  */
    /* JADX WARN: Removed duplicated region for block: B:351:0x0942  */
    /* JADX WARN: Removed duplicated region for block: B:383:0x0835 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:392:0x0567 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0355  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0366  */
    /* JADX WARN: Type inference failed for: r0v52, types: [X.O3e, java.lang.Object] */
    @Override // X.InterfaceC40181tm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ X.C26461Qb AEa(android.content.Context r46, X.C22P r47, com.instagram.common.gallery.metadata.MediaUploadMetadata r48, com.instagram.common.session.UserSession r49, com.instagram.pendingmedia.model.constants.ShareType r50, java.lang.Object r51, java.lang.String r52, java.lang.String r53, java.lang.String r54, java.lang.String r55, java.lang.String r56, java.lang.String r57, java.lang.String r58, java.util.List r59, long r60, boolean r62, boolean r63, boolean r64, boolean r65, boolean r66) {
        /*
            Method dump skipped, instructions count: 2902
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C40321u0.AEa(android.content.Context, X.22P, com.instagram.common.gallery.metadata.MediaUploadMetadata, com.instagram.common.session.UserSession, com.instagram.pendingmedia.model.constants.ShareType, java.lang.Object, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, long, boolean, boolean, boolean, boolean, boolean):X.1Qb");
    }
}
