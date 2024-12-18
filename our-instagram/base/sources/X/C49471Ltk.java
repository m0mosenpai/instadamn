package X;

import android.webkit.MimeTypeMap;
import com.instagram.common.session.UserSession;
import com.instagram.direct.send.MsysAvatarStickerSender$sendSecureAvatarStickerMessage$1;
import com.instagram.model.direct.threadkey.impl.MsysThreadId;
import java.io.File;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.Ltk, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49471Ltk implements C74M {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ C148286ly A01;
    public final /* synthetic */ AnonymousClass442 A02;
    public final /* synthetic */ C44139Jf4 A03;
    public final /* synthetic */ C3o9 A04;

    @Override // X.C74M
    public final /* synthetic */ void DIW(InterfaceC71992XEf interfaceC71992XEf, String str, String str2) {
    }

    @Override // X.C74M
    public final void DQ3(XEC xec, String str, String str2) {
        String str3;
        C14360o3.A0B(str2, 2);
        JSONObject A0q = AbstractC31171DnF.A0q();
        JSONObject A0q2 = AbstractC31171DnF.A0q();
        try {
            A0q2.put("is_avatar_sticker", AbstractC166997dE.A0b());
        } catch (JSONException unused) {
        }
        try {
            A0q.put("ig_avatar_sticker", A0q2);
        } catch (JSONException unused2) {
        }
        UserSession userSession = this.A00;
        userSession.A01(C47408Kwx.class, new C50160MDn(userSession, 21));
        File A11 = AbstractC166987dD.A11(str2);
        C148286ly c148286ly = this.A01;
        int i = (int) c148286ly.A01;
        int i2 = (int) c148286ly.A00;
        String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(MimeTypeMap.getFileExtensionFromUrl(AbstractC43592JPx.A0w(c148286ly.A0H)));
        if (mimeTypeFromExtension == null) {
            mimeTypeFromExtension = "image/webp";
        }
        AnonymousClass442 anonymousClass442 = this.A02;
        if (anonymousClass442 != null) {
            str3 = anonymousClass442.A0T;
        } else {
            str3 = null;
        }
        MsysThreadId A03 = JRE.A03(this.A04);
        C14360o3.A0B(A03, 9);
        AbstractC166987dD.A1Z(new MsysAvatarStickerSender$sendSecureAvatarStickerMessage$1(userSession, A03, A11, mimeTypeFromExtension, str3, null, null, null, i2, i), AbstractC24771Iv.A01(988639276, 3));
    }

    @Override // X.C74M
    public final /* synthetic */ void DQ4(XEC xec, String str, String str2, String str3) {
    }

    @Override // X.C74M
    public final void Dbm(String str, float f) {
    }

    @Override // X.C74M
    public final void onError(String str) {
    }

    public C49471Ltk(UserSession userSession, C148286ly c148286ly, AnonymousClass442 anonymousClass442, C44139Jf4 c44139Jf4, C3o9 c3o9) {
        this.A00 = userSession;
        this.A01 = c148286ly;
        this.A03 = c44139Jf4;
        this.A02 = anonymousClass442;
        this.A04 = c3o9;
    }

    @Override // X.C74M
    public final /* synthetic */ boolean EiZ() {
        return false;
    }
}
