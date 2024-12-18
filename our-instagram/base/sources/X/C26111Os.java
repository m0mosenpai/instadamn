package X;

/* renamed from: X.1Os, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C26111Os extends C1OW {
    public static final C1OZ A0A = new C1OZ() { // from class: X.1Ot
        @Override // X.C1OZ
        public final /* bridge */ /* synthetic */ Object E3S(C16L c16l) {
            C14360o3.A0B(c16l, 0);
            C26111Os parseFromJson = AbstractC47095Krq.parseFromJson(c16l);
            C14360o3.A07(parseFromJson);
            return parseFromJson;
        }

        @Override // X.C1OZ
        public final void EOu(AnonymousClass182 anonymousClass182, Object obj) {
            C14360o3.A0B(anonymousClass182, 0);
            C14360o3.A0B(obj, 1);
            C26111Os c26111Os = (C26111Os) obj;
            anonymousClass182.A0d();
            anonymousClass182.A0S("media_id", c26111Os.A03);
            anonymousClass182.A0S("question_id", c26111Os.A04);
            anonymousClass182.A0S("reel_viewer_module_name", c26111Os.A05);
            anonymousClass182.A0S("media_delivery_class", c26111Os.A02);
            anonymousClass182.A0S("tray_session_id", c26111Os.A07);
            anonymousClass182.A0T("is_clips_media", c26111Os.A09);
            anonymousClass182.A0S("upload_id", c26111Os.A08);
            anonymousClass182.A0Q("media_type", c26111Os.A00);
            anonymousClass182.A0S("response_type", c26111Os.A06);
            anonymousClass182.A0Q("tray_position", c26111Os.A01);
            AbstractC43669JTd.A00(anonymousClass182, c26111Os);
            anonymousClass182.A0a();
        }
    };
    public int A00;
    public int A01;
    public String A02;
    public String A03;
    public String A04;
    public String A05;
    public String A06;
    public String A07;
    public String A08;
    public boolean A09;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C26111Os(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, int i2) {
        super(null, null, 1);
        C14360o3.A0B(str, 1);
        C14360o3.A0B(str2, 2);
        C14360o3.A0B(str3, 3);
        C14360o3.A0B(str4, 4);
        C14360o3.A0B(str5, 5);
        C14360o3.A0B(str6, 7);
        C14360o3.A0B(str7, 9);
        this.A03 = str;
        this.A04 = str2;
        this.A05 = str3;
        this.A02 = str4;
        this.A07 = str5;
        this.A09 = false;
        this.A08 = str6;
        this.A00 = i;
        this.A06 = str7;
        this.A01 = i2;
    }

    @Override // X.C1OW
    public final String A02() {
        return "reels_send_question_photo_video_response";
    }

    public C26111Os() {
        this("", "", "", "", "", "", "", 1, -1);
    }
}
