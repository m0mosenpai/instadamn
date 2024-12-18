package X;

import com.instagram.model.direct.DirectThreadKey;

/* renamed from: X.1gN, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C32371gN extends C1OW implements InterfaceC29171au {
    public static final C1OZ A02 = new C1OZ() { // from class: X.1gO
        @Override // X.C1OZ
        public final void EOu(AnonymousClass182 anonymousClass182, Object obj) {
            String str;
            C14360o3.A0B(anonymousClass182, 0);
            C14360o3.A0B(obj, 1);
            C32371gN c32371gN = (C32371gN) obj;
            anonymousClass182.A0d();
            if (c32371gN.A00 != null) {
                anonymousClass182.A0r("thread_key");
                DirectThreadKey directThreadKey = c32371gN.A00;
                if (directThreadKey != null) {
                    AbstractC83623o5.A00(anonymousClass182, directThreadKey);
                    String str2 = c32371gN.A01;
                    if (str2 != null) {
                        anonymousClass182.A0S("session_id_from_call", str2);
                        AbstractC43669JTd.A00(anonymousClass182, c32371gN);
                        anonymousClass182.A0a();
                        return;
                    } else {
                        str = "sessionIdFromCall";
                        C14360o3.A0F(str);
                        throw C00O.createAndThrow();
                    }
                }
            }
            str = "directThreadKey";
            C14360o3.A0F(str);
            throw C00O.createAndThrow();
        }

        @Override // X.C1OZ
        public final /* bridge */ /* synthetic */ Object E3S(C16L c16l) {
            C32371gN parseFromJson = AbstractC34151F5b.parseFromJson(c16l);
            C14360o3.A07(parseFromJson);
            return parseFromJson;
        }
    };
    public DirectThreadKey A00;
    public String A01;

    public C32371gN() {
        super(null, null, 1);
    }

    @Override // X.C1OW
    public final String A02() {
        return "end_group_chat";
    }

    @Override // X.InterfaceC29171au
    public final DirectThreadKey C7Q() {
        DirectThreadKey directThreadKey = this.A00;
        if (directThreadKey != null) {
            return directThreadKey;
        }
        C14360o3.A0F("directThreadKey");
        throw C00O.createAndThrow();
    }
}
