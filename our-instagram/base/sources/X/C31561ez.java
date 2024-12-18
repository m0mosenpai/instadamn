package X;

import com.instagram.model.direct.DirectThreadKey;

/* renamed from: X.1ez, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C31561ez extends C1OW implements InterfaceC29171au {
    public static final C1OZ A07 = new C1OZ() { // from class: X.1f0
        @Override // X.C1OZ
        public final void EOu(AnonymousClass182 anonymousClass182, Object obj) {
            C31561ez c31561ez = (C31561ez) obj;
            anonymousClass182.A0d();
            if (c31561ez.A01 != null) {
                anonymousClass182.A0r("thread_key");
                AbstractC83623o5.A00(anonymousClass182, c31561ez.A01);
            }
            String str = c31561ez.A03;
            if (str != null) {
                anonymousClass182.A0S("item_id", str);
            }
            String str2 = c31561ez.A02;
            if (str2 != null) {
                anonymousClass182.A0S("original_message_client_context", str2);
            }
            anonymousClass182.A0T("is_shh_mode_message", c31561ez.A06);
            anonymousClass182.A0T("is_ae", c31561ez.A05);
            anonymousClass182.A0T("is_ae_open_eb", c31561ez.A04);
            EnumC159397Cz enumC159397Cz = c31561ez.A00;
            if (enumC159397Cz != null) {
                anonymousClass182.A0Q("send_mode", enumC159397Cz.A00);
            }
            AbstractC43669JTd.A00(anonymousClass182, c31561ez);
            anonymousClass182.A0a();
        }

        @Override // X.C1OZ
        public final /* bridge */ /* synthetic */ Object E3S(C16L c16l) {
            return AbstractC46984Kq3.parseFromJson(c16l);
        }
    };
    public EnumC159397Cz A00;
    public DirectThreadKey A01;
    public String A02;
    public String A03;

    @Deprecated
    public boolean A04 = false;

    @Deprecated
    public boolean A05;
    public boolean A06;

    @Override // X.C1OW
    public final String A02() {
        return "unsend_message";
    }

    @Override // X.C1OW
    public final DirectThreadKey A01() {
        return this.A01;
    }

    @Override // X.InterfaceC29171au
    public final DirectThreadKey C7Q() {
        return this.A01;
    }
}
