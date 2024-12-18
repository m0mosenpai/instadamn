package X;

import android.content.Context;
import com.instagram.common.gallery.metadata.MediaUploadMetadata;
import com.instagram.common.session.UserSession;
import com.instagram.pendingmedia.model.constants.ShareType;
import java.util.List;

/* renamed from: X.1tu, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C40261tu implements InterfaceC40171tl {
    public static final C1OZ A03 = new C1OZ() { // from class: X.1tv
        @Override // X.C1OZ
        public final /* bridge */ /* synthetic */ Object E3S(C16L c16l) {
            C14360o3.A0B(c16l, 0);
            C40261tu parseFromJson = NvB.parseFromJson(c16l);
            C14360o3.A07(parseFromJson);
            return parseFromJson;
        }

        @Override // X.C1OZ
        public final void EOu(AnonymousClass182 anonymousClass182, Object obj) {
            C14360o3.A0B(anonymousClass182, 0);
            C14360o3.A0B(obj, 1);
            C40261tu c40261tu = (C40261tu) obj;
            anonymousClass182.A0d();
            anonymousClass182.A0Q("sub_share_id", c40261tu.A00);
            anonymousClass182.A0T("is_configured_in_server", c40261tu.A01);
            anonymousClass182.A0a();
        }
    };
    public int A00;
    public boolean A01;
    public final ShareType A02 = ShareType.A0L;

    @Override // X.InterfaceC40181tm
    public final /* bridge */ /* synthetic */ Object AEm(C47Z c47z) {
        C14360o3.A0B(c47z, 0);
        return new CPD(c47z);
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
        return false;
    }

    @Override // X.InterfaceC40181tm
    public final /* synthetic */ void DEN(InterfaceC40821up interfaceC40821up, UserSession userSession, C47Z c47z) {
    }

    @Override // X.InterfaceC40181tm
    public final C38321qM DqT(Context context, InterfaceC40821up interfaceC40821up, UserSession userSession, C47Z c47z) {
        C14360o3.A0B(c47z, 1);
        C14360o3.A0C(interfaceC40821up, "null cannot be cast to non-null type com.instagram.pendingmedia.configurehandler.response.ConfigureMediaResponse");
        C38321qM c38321qM = ((N3A) interfaceC40821up).A00;
        c47z.A1C = c38321qM;
        return c38321qM;
    }

    @Override // X.InterfaceC40181tm
    public final N3A E3U(C3JY c3jy, UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        C14360o3.A0B(c3jy, 1);
        return (N3A) new C56150OwG(new C07510aQ(userSession), new C55919OsB()).A00(c3jy);
    }

    @Override // X.InterfaceC40181tm
    public final void E4y(UserSession userSession, C47Z c47z, C54783OIx c54783OIx) {
        C14360o3.A0B(c47z, 1);
        C14360o3.A0B(c54783OIx, 2);
        c54783OIx.A00(c47z.A1C, c47z, c47z.A11());
    }

    @Override // X.C1OX
    public final String getTypeName() {
        return "MediaKitShareTarget";
    }

    @Override // X.InterfaceC40181tm
    public final /* bridge */ /* synthetic */ C26461Qb AEa(Context context, C22P c22p, MediaUploadMetadata mediaUploadMetadata, UserSession userSession, ShareType shareType, Object obj, String str, String str2, String str3, String str4, String str5, String str6, String str7, List list, long j, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        CPD cpd = (CPD) obj;
        C14360o3.A0B(context, 0);
        C14360o3.A0B(userSession, 1);
        C14360o3.A0B(cpd, 2);
        C14360o3.A0B(str, 4);
        C14360o3.A0B(str2, 5);
        C14360o3.A0B(str3, 6);
        C14360o3.A0B(shareType, 9);
        C14360o3.A0B(mediaUploadMetadata, 12);
        EnumC53323Ni0 enumC53323Ni0 = EnumC53323Ni0.A0D;
        String A00 = C16030qx.A00(context);
        C14360o3.A07(A00);
        C25621Ms A01 = C55230Of1.A01(c22p, mediaUploadMetadata, userSession, enumC53323Ni0, str, str4, A00, str6, null, list, z, z2, z3, false);
        C55230Of1.A0J(A01, userSession, AbstractC54080Nve.A00(cpd.A00), j, z);
        int i = 1;
        if (z) {
            i = 2;
        }
        A01.A0D("media_type", i);
        return A01.A0O();
    }

    @Override // X.InterfaceC40171tl
    public final ShareType BuN() {
        return this.A02;
    }

    @Override // X.InterfaceC40171tl
    public final int C3D() {
        return this.A00;
    }

    @Override // X.InterfaceC40171tl
    public final boolean CRc() {
        return this.A01;
    }

    @Override // X.InterfaceC40171tl
    public final void ERy(boolean z) {
        this.A01 = z;
    }

    @Override // X.InterfaceC40171tl
    public final void Ef4(int i) {
        this.A00 = i;
    }
}
