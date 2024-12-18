package X;

import android.content.Context;
import com.instagram.api.schemas.MediaCroppingCoordinates;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.pendingmedia.model.constants.ShareType;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.5Kx, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C115615Kx implements InterfaceC40171tl {
    public int A00;
    public MediaCroppingCoordinates A01;
    public String A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public final ShareType A06 = ShareType.A08;

    @Override // X.InterfaceC40181tm
    public final /* bridge */ /* synthetic */ Object AEm(C47Z c47z) {
        C14360o3.A0B(c47z, 0);
        return new O9U(c47z, this);
    }

    @Override // X.InterfaceC40181tm
    public final /* synthetic */ void DEN(InterfaceC40821up interfaceC40821up, UserSession userSession, C47Z c47z) {
    }

    @Override // X.InterfaceC40181tm
    public final C38321qM DqT(Context context, InterfaceC40821up interfaceC40821up, UserSession userSession, C47Z c47z) {
        C14360o3.A0B(userSession, 0);
        C14360o3.A0B(c47z, 1);
        C14360o3.A0B(context, 3);
        C14360o3.A0C(interfaceC40821up, "null cannot be cast to non-null type com.instagram.pendingmedia.configurehandler.response.ConfigureMediaResponse");
        C38321qM c38321qM = ((N3A) interfaceC40821up).A00;
        if (c38321qM != null) {
            List A00 = AbstractC186788Pv.A00(userSession).A00(c47z.A3t);
            if (A00 == null) {
                A00 = C16930sl.A00;
            }
            List<User> A3g = c38321qM.A3g();
            C28531Zo.A04.A0G(userSession, "CLIP", A3g, A00);
            for (User user : A3g) {
                if (AbstractC186788Pv.A01(userSession) || A00.contains(user.getId())) {
                    C28531Zo.A04.A0A(userSession, c38321qM, new DirectShareTarget(user));
                }
            }
            return c38321qM;
        }
        throw new IllegalStateException("Required value was null.");
    }

    @Override // X.InterfaceC40181tm
    public final N3A E3U(C3JY c3jy, UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        C14360o3.A0B(c3jy, 1);
        return (N3A) new C56150OwG(new C07510aQ(userSession), new C55926OsI()).A00(c3jy);
    }

    @Override // X.InterfaceC40181tm
    public final void E4y(UserSession userSession, C47Z c47z, C54783OIx c54783OIx) {
        C14360o3.A0B(userSession, 0);
        C14360o3.A0B(c47z, 1);
        C14360o3.A0B(c54783OIx, 2);
        c54783OIx.A00(c47z.A1C, c47z, false);
        AbstractC25651Mw.A00(userSession).E4s(new C70083Cs(c47z));
        AbstractC25651Mw.A00(userSession).E4s(new C154096wJ(userSession.userId, false, false));
    }

    @Override // X.C1OX
    public final String getTypeName() {
        return "ClipsVideoShareTarget";
    }

    @Override // X.InterfaceC40171tl
    public final ShareType BuN() {
        return this.A06;
    }

    @Override // X.InterfaceC40171tl
    public final int C3D() {
        return this.A00;
    }

    @Override // X.InterfaceC40171tl
    public final boolean CRc() {
        return this.A03;
    }

    @Override // X.InterfaceC40171tl
    public final boolean CUB() {
        return false;
    }

    @Override // X.InterfaceC40171tl
    public final boolean CUC() {
        return false;
    }

    @Override // X.InterfaceC40171tl
    public final boolean CVX() {
        if (this.A02 == null) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC40171tl
    public final void ERy(boolean z) {
        this.A03 = z;
    }

    @Override // X.InterfaceC40171tl
    public final void Ef4(int i) {
        this.A00 = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:521:0x09a5, code lost:
    
        if (r8.isEmpty() != false) goto L377;
     */
    /* JADX WARN: Code restructure failed: missing block: B:640:0x05e6, code lost:
    
        if (r0.A4c.size() <= 1) goto L229;
     */
    /* JADX WARN: Code restructure failed: missing block: B:685:0x00cc, code lost:
    
        if (r10.length() == 0) goto L20;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:487:0x0c1a. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:141:0x042d  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x06b7  */
    /* JADX WARN: Removed duplicated region for block: B:330:0x0be2  */
    /* JADX WARN: Removed duplicated region for block: B:338:0x0c9d  */
    /* JADX WARN: Removed duplicated region for block: B:343:0x0cb9  */
    /* JADX WARN: Removed duplicated region for block: B:353:0x0cfd  */
    /* JADX WARN: Removed duplicated region for block: B:356:0x0d12  */
    /* JADX WARN: Removed duplicated region for block: B:359:0x0d2c  */
    /* JADX WARN: Removed duplicated region for block: B:362:0x0d35  */
    /* JADX WARN: Removed duplicated region for block: B:365:0x0d4e  */
    /* JADX WARN: Removed duplicated region for block: B:372:0x0d63  */
    /* JADX WARN: Removed duplicated region for block: B:374:0x0d7d  */
    /* JADX WARN: Removed duplicated region for block: B:377:0x0d9f  */
    /* JADX WARN: Removed duplicated region for block: B:380:0x0db2  */
    /* JADX WARN: Removed duplicated region for block: B:383:0x0dc2  */
    /* JADX WARN: Removed duplicated region for block: B:386:0x0dcc  */
    /* JADX WARN: Removed duplicated region for block: B:389:0x0de4  */
    /* JADX WARN: Removed duplicated region for block: B:396:0x0dfd  */
    /* JADX WARN: Removed duplicated region for block: B:399:0x0e2a  */
    /* JADX WARN: Removed duplicated region for block: B:402:0x0e38  */
    /* JADX WARN: Removed duplicated region for block: B:408:0x0e4a  */
    /* JADX WARN: Removed duplicated region for block: B:414:0x0e60  */
    /* JADX WARN: Removed duplicated region for block: B:418:0x0e92  */
    /* JADX WARN: Removed duplicated region for block: B:424:0x0ea8  */
    /* JADX WARN: Removed duplicated region for block: B:427:0x0eb9  */
    /* JADX WARN: Removed duplicated region for block: B:430:0x0ec8  */
    /* JADX WARN: Removed duplicated region for block: B:433:0x0ed8  */
    /* JADX WARN: Removed duplicated region for block: B:436:0x0ee2  */
    /* JADX WARN: Removed duplicated region for block: B:439:0x0ef3  */
    /* JADX WARN: Removed duplicated region for block: B:442:0x0f1b  */
    /* JADX WARN: Removed duplicated region for block: B:445:0x0f29  */
    /* JADX WARN: Removed duplicated region for block: B:448:0x0f3f  */
    /* JADX WARN: Removed duplicated region for block: B:453:0x0f5b  */
    /* JADX WARN: Removed duplicated region for block: B:467:0x0f92  */
    /* JADX WARN: Removed duplicated region for block: B:477:0x0e84  */
    /* JADX WARN: Removed duplicated region for block: B:493:0x0c41  */
    /* JADX WARN: Removed duplicated region for block: B:498:0x0c54  */
    /* JADX WARN: Removed duplicated region for block: B:543:0x0700  */
    /* JADX WARN: Removed duplicated region for block: B:565:0x07ac  */
    /* JADX WARN: Type inference failed for: r2v162, types: [X.O3e, java.lang.Object] */
    @Override // X.InterfaceC40181tm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ X.C26461Qb AEa(android.content.Context r88, X.C22P r89, com.instagram.common.gallery.metadata.MediaUploadMetadata r90, com.instagram.common.session.UserSession r91, com.instagram.pendingmedia.model.constants.ShareType r92, java.lang.Object r93, java.lang.String r94, java.lang.String r95, java.lang.String r96, java.lang.String r97, java.lang.String r98, java.lang.String r99, java.lang.String r100, java.util.List r101, long r102, boolean r104, boolean r105, boolean r106, boolean r107, boolean r108) {
        /*
            Method dump skipped, instructions count: 4052
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C115615Kx.AEa(android.content.Context, X.22P, com.instagram.common.gallery.metadata.MediaUploadMetadata, com.instagram.common.session.UserSession, com.instagram.pendingmedia.model.constants.ShareType, java.lang.Object, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, long, boolean, boolean, boolean, boolean, boolean):X.1Qb");
    }
}
