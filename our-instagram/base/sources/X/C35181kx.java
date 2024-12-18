package X;

import com.instagram.model.direct.DirectThreadKey;

/* renamed from: X.1kx, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C35181kx extends C1OW implements InterfaceC29171au {
    public static final C1OZ A08 = new C1OZ() { // from class: X.1ky
        @Override // X.C1OZ
        public final /* bridge */ /* synthetic */ Object E3S(C16L c16l) {
            C14360o3.A0B(c16l, 0);
            C35181kx parseFromJson = AbstractC46943KpO.parseFromJson(c16l);
            C14360o3.A07(parseFromJson);
            return parseFromJson;
        }

        @Override // X.C1OZ
        public final void EOu(AnonymousClass182 anonymousClass182, Object obj) {
            C14360o3.A0B(anonymousClass182, 0);
            C14360o3.A0B(obj, 1);
            C35181kx c35181kx = (C35181kx) obj;
            anonymousClass182.A0d();
            if (c35181kx.A01 != null) {
                anonymousClass182.A0r("thread_key");
                AbstractC83623o5.A00(anonymousClass182, c35181kx.A01);
            }
            String str = c35181kx.A02;
            if (str != null) {
                anonymousClass182.A0S("message_id", str);
            }
            String str2 = c35181kx.A05;
            if (str2 != null) {
                anonymousClass182.A0S("message_client_context", str2);
            }
            String str3 = c35181kx.A04;
            if (str3 != null) {
                anonymousClass182.A0S("object_id", str3);
            }
            String str4 = c35181kx.A03;
            if (str4 != null) {
                anonymousClass182.A0S("mime_type", str4);
            }
            anonymousClass182.A0T("is_ae", c35181kx.A06);
            anonymousClass182.A0T("is_ae_open_eb", c35181kx.A07);
            EnumC159397Cz enumC159397Cz = c35181kx.A00;
            if (enumC159397Cz != null) {
                anonymousClass182.A0Q("send_mode", enumC159397Cz.A00);
                AbstractC43669JTd.A00(anonymousClass182, c35181kx);
                anonymousClass182.A0a();
                return;
            }
            C14360o3.A0F("sendMode");
            throw C00O.createAndThrow();
        }
    };
    public EnumC159397Cz A00;
    public DirectThreadKey A01;
    public String A02;
    public String A03;
    public String A04;
    public String A05;
    public boolean A06;
    public boolean A07;

    public C35181kx() {
        super(null, null, 1);
    }

    @Override // X.C1OW
    public final String A02() {
        return "send_visual_item_replayed_marker";
    }

    @Override // X.InterfaceC29171au
    public final DirectThreadKey C7Q() {
        return this.A01;
    }
}
