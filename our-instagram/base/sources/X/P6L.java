package X;

import android.content.Context;
import com.instagram.api.schemas.MediaCroppingCoordinates;
import com.instagram.common.session.UserSession;
import com.instagram.igtv.uploadflow.metadata.shopping.model.IGTVShoppingMetadata;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.model.fundraiser.NewFundraiserInfo;
import com.instagram.pendingmedia.model.constants.ShareType;
import com.instagram.user.model.User;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes9.dex */
public class P6L implements InterfaceC40171tl {
    public int A00;
    public MediaCroppingCoordinates A01;
    public MediaCroppingCoordinates A02;
    public IGTVShoppingMetadata A03;
    public C54424O3e A04;
    public NewFundraiserInfo A05;
    public String A06;
    public String A07;
    public String A08;
    public String A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;

    @Deprecated
    public boolean A0F;

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
        return false;
    }

    @Override // X.InterfaceC40181tm
    public final /* synthetic */ void DEN(InterfaceC40821up interfaceC40821up, UserSession userSession, C47Z c47z) {
    }

    @Override // X.InterfaceC40181tm
    public final /* bridge */ /* synthetic */ Object AEm(C47Z c47z) {
        return new O81(this, c47z);
    }

    @Override // X.InterfaceC40171tl
    public final ShareType BuN() {
        if (this instanceof NNM) {
            return ((NNM) this).A00;
        }
        return ShareType.A0J;
    }

    @Override // X.InterfaceC40171tl
    public final int C3D() {
        return this.A00;
    }

    @Override // X.InterfaceC40171tl
    public final boolean CRc() {
        return this.A0B;
    }

    @Override // X.InterfaceC40181tm
    public final N3A E3U(C3JY c3jy, UserSession userSession) {
        return (N3A) new C56150OwG(new C07510aQ(userSession), new C55918OsA()).A00(c3jy);
    }

    @Override // X.InterfaceC40181tm
    public final void E4y(UserSession userSession, C47Z c47z, C54783OIx c54783OIx) {
        C38321qM c38321qM = c47z.A1C;
        c38321qM.A0C.EYo(new C88293wg(this.A01, this.A02, null));
        c54783OIx.A00(c38321qM, c47z, false);
    }

    @Override // X.C1OX
    public final String getTypeName() {
        if (this instanceof NNM) {
            return "PostLiveIGTVShareTarget";
        }
        return "IGTVVideoShareTarget";
    }

    @Override // X.InterfaceC40181tm
    public final C38321qM DqT(Context context, InterfaceC40821up interfaceC40821up, UserSession userSession, C47Z c47z) {
        interfaceC40821up.getClass();
        C38321qM c38321qM = ((N3A) interfaceC40821up).A00;
        List A00 = AbstractC186788Pv.A00(userSession).A00(c47z.A3t);
        List A3g = c38321qM.A3g();
        C28531Zo.A04.A0G(userSession, "FEED", A3g, A00);
        Iterator it = A3g.iterator();
        while (it.hasNext()) {
            User A15 = AbstractC25226BEj.A15(it);
            if (AbstractC186788Pv.A01(userSession) || (A00 != null && AbstractC31175DnJ.A1X(A15, A00))) {
                C28531Zo.A04.A0B(userSession, c38321qM, new DirectShareTarget(A15));
            }
        }
        return c38321qM;
    }

    @Override // X.InterfaceC40171tl
    public final void ERy(boolean z) {
        this.A0B = z;
    }

    @Override // X.InterfaceC40171tl
    public final void Ef4(int i) {
        this.A00 = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x008c, code lost:
    
        if (r8.A2q == null) goto L9;
     */
    @Override // X.InterfaceC40181tm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ X.C26461Qb AEa(android.content.Context r25, X.C22P r26, com.instagram.common.gallery.metadata.MediaUploadMetadata r27, com.instagram.common.session.UserSession r28, com.instagram.pendingmedia.model.constants.ShareType r29, java.lang.Object r30, java.lang.String r31, java.lang.String r32, java.lang.String r33, java.lang.String r34, java.lang.String r35, java.lang.String r36, java.lang.String r37, java.util.List r38, long r39, boolean r41, boolean r42, boolean r43, boolean r44, boolean r45) {
        /*
            Method dump skipped, instructions count: 414
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.P6L.AEa(android.content.Context, X.22P, com.instagram.common.gallery.metadata.MediaUploadMetadata, com.instagram.common.session.UserSession, com.instagram.pendingmedia.model.constants.ShareType, java.lang.Object, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, long, boolean, boolean, boolean, boolean, boolean):X.1Qb");
    }
}
