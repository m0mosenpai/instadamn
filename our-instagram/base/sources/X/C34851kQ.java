package X;

import com.instagram.model.direct.DirectThreadKey;

/* renamed from: X.1kQ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C34851kQ extends C1OW implements InterfaceC29171au {
    public static final C1OZ A08 = new C1OZ() { // from class: X.1kR
        @Override // X.C1OZ
        public final /* bridge */ /* synthetic */ Object E3S(C16L c16l) {
            C14360o3.A0B(c16l, 0);
            C34851kQ parseFromJson = AbstractC46938KpJ.parseFromJson(c16l);
            C14360o3.A07(parseFromJson);
            return parseFromJson;
        }

        @Override // X.C1OZ
        public final void EOu(AnonymousClass182 anonymousClass182, Object obj) {
            String str;
            C14360o3.A0B(anonymousClass182, 0);
            C14360o3.A0B(obj, 1);
            C34851kQ c34851kQ = (C34851kQ) obj;
            anonymousClass182.A0d();
            if (c34851kQ.A02 != null) {
                anonymousClass182.A0r("thread_key");
                DirectThreadKey directThreadKey = c34851kQ.A02;
                if (directThreadKey != null) {
                    AbstractC83623o5.A00(anonymousClass182, directThreadKey);
                    String str2 = c34851kQ.A05;
                    if (str2 != null) {
                        anonymousClass182.A0S("message_id", str2);
                        c34851kQ.A04();
                        anonymousClass182.A0S("original_message_client_context", c34851kQ.A04());
                        String str3 = c34851kQ.A04;
                        if (str3 != null) {
                            anonymousClass182.A0S("edited_text", str3);
                            anonymousClass182.A0Q("edit_count", c34851kQ.A00);
                            anonymousClass182.A0T("is_ae", c34851kQ.A07);
                            anonymousClass182.A0T("is_ae_open_eb", c34851kQ.A06);
                            c34851kQ.A03();
                            anonymousClass182.A0Q("send_mode", c34851kQ.A03().A00);
                            AbstractC43669JTd.A00(anonymousClass182, c34851kQ);
                            anonymousClass182.A0a();
                            return;
                        }
                        str = "editedText";
                    } else {
                        str = "messageId";
                    }
                    C14360o3.A0F(str);
                    throw C00O.createAndThrow();
                }
            }
            str = "key";
            C14360o3.A0F(str);
            throw C00O.createAndThrow();
        }
    };
    public int A00;
    public EnumC159397Cz A01;
    public DirectThreadKey A02;
    public String A03;
    public String A04;
    public String A05;
    public boolean A06;
    public boolean A07;

    public C34851kQ() {
        super(null, null, 1);
    }

    @Override // X.C1OW
    public final String A02() {
        return "edit_message";
    }

    @Override // X.C1OW
    public final DirectThreadKey A01() {
        DirectThreadKey directThreadKey = this.A02;
        if (directThreadKey != null) {
            return directThreadKey;
        }
        C14360o3.A0F("key");
        throw C00O.createAndThrow();
    }

    public final EnumC159397Cz A03() {
        EnumC159397Cz enumC159397Cz = this.A01;
        if (enumC159397Cz != null) {
            return enumC159397Cz;
        }
        C14360o3.A0F("sendMode");
        throw C00O.createAndThrow();
    }

    public final String A04() {
        String str = this.A03;
        if (str != null) {
            return str;
        }
        C14360o3.A0F("clientContext");
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC29171au
    public final DirectThreadKey C7Q() {
        DirectThreadKey directThreadKey = this.A02;
        if (directThreadKey != null) {
            return directThreadKey;
        }
        C14360o3.A0F("key");
        throw C00O.createAndThrow();
    }
}
