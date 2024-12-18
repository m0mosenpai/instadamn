package X;

/* renamed from: X.1OV, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1OV extends C1OW {
    public static final C1OZ A0B = new C1OZ() { // from class: X.1OY
        @Override // X.C1OZ
        public final void EOu(AnonymousClass182 anonymousClass182, Object obj) {
            C1OV c1ov = (C1OV) obj;
            anonymousClass182.A0d();
            String str = c1ov.A04;
            if (str != null) {
                anonymousClass182.A0S("media_id", str);
            }
            String str2 = c1ov.A05;
            if (str2 != null) {
                anonymousClass182.A0S("poll_id", str2);
            }
            Integer num = c1ov.A02;
            if (num != null) {
                anonymousClass182.A0Q("viewer_vote", num.intValue());
            }
            Integer num2 = c1ov.A01;
            if (num2 != null) {
                anonymousClass182.A0Q("pre_viewer_voted_poll_option_index", num2.intValue());
            }
            String str3 = c1ov.A06;
            if (str3 != null) {
                anonymousClass182.A0S("radio_type", str3);
            }
            String str4 = c1ov.A07;
            if (str4 != null) {
                anonymousClass182.A0S("reel_viewer_module_name", str4);
            }
            String str5 = c1ov.A03;
            if (str5 != null) {
                anonymousClass182.A0S("media_delivery_class", str5);
            }
            String str6 = c1ov.A08;
            if (str6 != null) {
                anonymousClass182.A0S("tray_session_id", str6);
            }
            anonymousClass182.A0Q("tray_position", c1ov.A00);
            anonymousClass182.A0T("allow_vote_change", c1ov.A09);
            anonymousClass182.A0T("is_poll_vote_deletion_request", c1ov.A0A);
            AbstractC43669JTd.A00(anonymousClass182, c1ov);
            anonymousClass182.A0a();
        }

        @Override // X.C1OZ
        public final /* bridge */ /* synthetic */ Object E3S(C16L c16l) {
            return AbstractC47094Krp.parseFromJson(c16l);
        }
    };
    public int A00 = -1;
    public Integer A01;
    public Integer A02;
    public String A03;
    public String A04;
    public String A05;
    public String A06;
    public String A07;
    public String A08;
    public boolean A09;
    public boolean A0A;

    @Override // X.C1OW
    public final String A02() {
        if (this.A0A) {
            return "poll_vote_deletion";
        }
        return "reels_send_poll_vote";
    }
}
