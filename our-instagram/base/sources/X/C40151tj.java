package X;

import android.content.Context;
import com.instagram.common.gallery.metadata.MediaUploadMetadata;
import com.instagram.common.session.UserSession;
import com.instagram.pendingmedia.model.constants.ShareType;
import java.util.List;

/* renamed from: X.1tj, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C40151tj implements InterfaceC40171tl {
    public static final C1OZ A02 = new C1OZ() { // from class: X.1tn
        @Override // X.C1OZ
        public final /* bridge */ /* synthetic */ Object E3S(C16L c16l) {
            C14360o3.A0B(c16l, 0);
            C40151tj parseFromJson = AbstractC53890NsM.parseFromJson(c16l);
            C14360o3.A07(parseFromJson);
            return parseFromJson;
        }

        @Override // X.C1OZ
        public final void EOu(AnonymousClass182 anonymousClass182, Object obj) {
            C14360o3.A0B(anonymousClass182, 0);
            C14360o3.A0B(obj, 1);
            anonymousClass182.A0d();
            anonymousClass182.A0a();
        }
    };
    public int A00;
    public boolean A01;

    @Override // X.InterfaceC40181tm
    public final /* bridge */ /* synthetic */ Object AEm(C47Z c47z) {
        C14360o3.A0B(c47z, 0);
        return new C27826COp(c47z);
    }

    @Override // X.InterfaceC40171tl
    public final ShareType BuN() {
        return null;
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
    public final void DEN(InterfaceC40821up interfaceC40821up, UserSession userSession, C47Z c47z) {
        N3A n3a;
        C14360o3.A0B(userSession, 0);
        C14360o3.A0B(c47z, 1);
        C14360o3.A0B(interfaceC40821up, 2);
        C25671My A00 = AbstractC25651Mw.A00(userSession);
        C38321qM c38321qM = c47z.A1C;
        String errorMessage = interfaceC40821up.getErrorMessage();
        Integer num = null;
        if ((interfaceC40821up instanceof N3A) && (n3a = (N3A) interfaceC40821up) != null) {
            num = n3a.A02;
        }
        A00.E4s(new LYN(c38321qM, num, errorMessage));
    }

    @Override // X.InterfaceC40181tm
    public final C38321qM DqT(Context context, InterfaceC40821up interfaceC40821up, UserSession userSession, C47Z c47z) {
        N3A n3a;
        C14360o3.A0B(userSession, 0);
        C38321qM c38321qM = null;
        if ((interfaceC40821up instanceof N3A) && (n3a = (N3A) interfaceC40821up) != null) {
            c38321qM = n3a.A00;
        }
        AbstractC25651Mw.A00(userSession).E4s(new LYN(c38321qM, null, null));
        return c38321qM;
    }

    @Override // X.InterfaceC40181tm
    public final N3A E3U(C3JY c3jy, UserSession userSession) {
        C14360o3.A0B(c3jy, 1);
        return (N3A) new C56150OwG(C52073N1y.A00, new C55915Os7()).A00(c3jy);
    }

    @Override // X.InterfaceC40181tm
    public final void E4y(UserSession userSession, C47Z c47z, C54783OIx c54783OIx) {
    }

    @Override // X.C1OX
    public final String getTypeName() {
        return "UploadCutoutStickerTarget";
    }

    @Override // X.InterfaceC40181tm
    public final /* bridge */ /* synthetic */ C26461Qb AEa(Context context, C22P c22p, MediaUploadMetadata mediaUploadMetadata, UserSession userSession, ShareType shareType, Object obj, String str, String str2, String str3, String str4, String str5, String str6, String str7, List list, long j, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        C27826COp c27826COp = (C27826COp) obj;
        C14360o3.A0B(context, 0);
        C14360o3.A0B(userSession, 1);
        C14360o3.A0B(c27826COp, 2);
        C14360o3.A0B(str, 4);
        C14360o3.A0B(str2, 5);
        C14360o3.A0B(str3, 6);
        C14360o3.A0B(shareType, 9);
        C14360o3.A0B(mediaUploadMetadata, 12);
        C47Z c47z = c27826COp.A00;
        C26062Bfp c26062Bfp = new C26062Bfp(c47z.A0N, 1, c47z.A3t, c47z.A3h);
        C25621Ms c25621Ms = new C25621Ms(userSession, -2);
        c25621Ms.A05();
        c25621Ms.A0R = true;
        StringBuilder sb = new StringBuilder();
        EnumC53323Ni0.A09.A00(c25621Ms, userSession, sb);
        String obj2 = sb.toString();
        C14360o3.A07(obj2);
        c25621Ms.A0E = obj2;
        String str8 = c26062Bfp.A01;
        if (str8 != null) {
            c25621Ms.A9s("source_media_id", str8);
        }
        c25621Ms.A0D("upload_engine_config_enum", c26062Bfp.A00);
        c25621Ms.A9s("upload_id", c26062Bfp.A02);
        return c25621Ms.A0O();
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
