package X;

import com.instagram.model.direct.DirectThreadKey;

/* renamed from: X.1f3, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C31601f3 extends AbstractC31611f4 {
    public static final C1OZ A04 = new C1OZ() { // from class: X.1f5
        @Override // X.C1OZ
        public final void EOu(AnonymousClass182 anonymousClass182, Object obj) {
            C31601f3 c31601f3 = (C31601f3) obj;
            anonymousClass182.A0d();
            if (c31601f3.A00 != null) {
                anonymousClass182.A0r("seen_marker");
                AbstractC80983jS.A00(anonymousClass182, c31601f3.A00);
            }
            String str = c31601f3.A02;
            if (str != null) {
                anonymousClass182.A0S("message_user_id", str);
            }
            String str2 = c31601f3.A01;
            if (str2 != null) {
                anonymousClass182.A0S("last_seen_shh_message_id", str2);
            }
            anonymousClass182.A0T("is_advancing_shh_seen_marker", c31601f3.A03);
            AbstractC43669JTd.A00(anonymousClass182, c31601f3);
            anonymousClass182.A0a();
        }

        @Override // X.C1OZ
        public final /* bridge */ /* synthetic */ Object E3S(C16L c16l) {
            return AbstractC34161F5l.parseFromJson(c16l);
        }
    };
    public C80993jT A00;
    public String A01;
    public String A02;
    public boolean A03 = true;

    @Override // X.C1OW
    public final String A02() {
        return "send_thread_seen_marker";
    }

    @Override // X.AbstractC31611f4
    public final /* bridge */ /* synthetic */ AbstractC81003jU A03() {
        return this.A00;
    }

    @Override // X.InterfaceC29171au
    public final DirectThreadKey C7Q() {
        String str = this.A00.A04;
        str.getClass();
        return new DirectThreadKey(str);
    }
}
