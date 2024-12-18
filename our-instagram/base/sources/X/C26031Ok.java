package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;

/* renamed from: X.1Ok, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C26031Ok extends C1OW {
    public static final C1OZ A08 = new C1OZ() { // from class: X.1Ol
        @Override // X.C1OZ
        public final void EOu(AnonymousClass182 anonymousClass182, Object obj) {
            C26031Ok c26031Ok = (C26031Ok) obj;
            anonymousClass182.A0d();
            String str = c26031Ok.A02;
            if (str != null) {
                anonymousClass182.A0S("media_id", str);
            }
            String str2 = c26031Ok.A03;
            if (str2 != null) {
                anonymousClass182.A0S("question_id", str2);
            }
            String str3 = c26031Ok.A05;
            if (str3 != null) {
                anonymousClass182.A0S(PublicKeyCredentialControllerUtility.JSON_KEY_RESPONSE, str3);
            }
            String str4 = c26031Ok.A04;
            if (str4 != null) {
                anonymousClass182.A0S("reel_viewer_module_name", str4);
            }
            String str5 = c26031Ok.A01;
            if (str5 != null) {
                anonymousClass182.A0S("media_delivery_class", str5);
            }
            String str6 = c26031Ok.A06;
            if (str6 != null) {
                anonymousClass182.A0S("tray_session_id", str6);
            }
            anonymousClass182.A0Q("tray_position", c26031Ok.A00);
            anonymousClass182.A0T("is_clips_media", c26031Ok.A07);
            AbstractC43669JTd.A00(anonymousClass182, c26031Ok);
            anonymousClass182.A0a();
        }

        @Override // X.C1OZ
        public final /* bridge */ /* synthetic */ Object E3S(C16L c16l) {
            return A26.parseFromJson(c16l);
        }
    };
    public int A00;
    public String A01;
    public String A02;
    public String A03;
    public String A04;
    public String A05;
    public String A06;
    public boolean A07;

    @Override // X.C1OW
    public final String A02() {
        return "reels_send_question_text_response";
    }
}
