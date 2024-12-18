package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;

/* renamed from: X.1Op, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C26081Op extends C1OW {
    public static final C1OZ A06 = new C1OZ() { // from class: X.1Oq
        @Override // X.C1OZ
        public final void EOu(AnonymousClass182 anonymousClass182, Object obj) {
            C26081Op c26081Op = (C26081Op) obj;
            anonymousClass182.A0d();
            String str = c26081Op.A00;
            if (str != null) {
                anonymousClass182.A0S("media_id", str);
            }
            String str2 = c26081Op.A03;
            if (str2 != null) {
                anonymousClass182.A0S("question_id", str2);
            }
            String str3 = c26081Op.A01;
            if (str3 != null) {
                anonymousClass182.A0S("music_browse_session_id", str3);
            }
            String str4 = c26081Op.A02;
            if (str4 != null) {
                anonymousClass182.A0S("audio_asset_id", str4);
            }
            String str5 = c26081Op.A04;
            if (str5 != null) {
                anonymousClass182.A0S(PublicKeyCredentialControllerUtility.JSON_KEY_RESPONSE, str5);
            }
            String str6 = c26081Op.A05;
            if (str6 != null) {
                anonymousClass182.A0S("tray_session_id", str6);
            }
            AbstractC43669JTd.A00(anonymousClass182, c26081Op);
            anonymousClass182.A0a();
        }

        @Override // X.C1OZ
        public final /* bridge */ /* synthetic */ Object E3S(C16L c16l) {
            return A25.parseFromJson(c16l);
        }
    };
    public String A00;
    public String A01;
    public String A02;
    public String A03;
    public String A04;
    public String A05;

    @Override // X.C1OW
    public final String A02() {
        return "reels_send_question_music_response";
    }
}
