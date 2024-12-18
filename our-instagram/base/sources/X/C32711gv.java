package X;

import com.instagram.model.direct.DirectThreadKey;

/* renamed from: X.1gv, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C32711gv extends C1OW implements InterfaceC29171au {
    public static final C1OZ A04 = new C1OZ() { // from class: X.1gw
        @Override // X.C1OZ
        public final void EOu(AnonymousClass182 anonymousClass182, Object obj) {
            C32711gv c32711gv = (C32711gv) obj;
            anonymousClass182.A0d();
            if (c32711gv.A01 != null) {
                anonymousClass182.A0r("thead_key");
                AbstractC83623o5.A00(anonymousClass182, c32711gv.A01);
            }
            String str = c32711gv.A03;
            if (str != null) {
                anonymousClass182.A0S("message_id", str);
            }
            anonymousClass182.A0Q("selected_option_index", c32711gv.A00);
            String str2 = c32711gv.A02;
            if (str2 != null) {
                anonymousClass182.A0S("client_context", str2);
            }
            AbstractC43669JTd.A00(anonymousClass182, c32711gv);
            anonymousClass182.A0a();
        }

        @Override // X.C1OZ
        public final /* bridge */ /* synthetic */ Object E3S(C16L c16l) {
            return AbstractC46969Kpo.parseFromJson(c16l);
        }
    };
    public int A00;
    public DirectThreadKey A01;
    public String A02;
    public String A03;

    @Override // X.C1OW
    public final String A02() {
        return "send_poll_vote";
    }

    @Override // X.InterfaceC29171au
    public final DirectThreadKey C7Q() {
        return this.A01;
    }
}
