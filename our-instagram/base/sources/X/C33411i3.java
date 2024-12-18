package X;

import com.instagram.model.direct.DirectThreadKey;

/* renamed from: X.1i3, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C33411i3 extends C1OW implements InterfaceC29171au {
    public static final C1OZ A01 = new C1OZ() { // from class: X.1i4
        @Override // X.C1OZ
        public final void EOu(AnonymousClass182 anonymousClass182, Object obj) {
            C14360o3.A0B(anonymousClass182, 0);
            C14360o3.A0B(obj, 1);
            C33411i3 c33411i3 = (C33411i3) obj;
            anonymousClass182.A0d();
            if (c33411i3.A00 != null) {
                anonymousClass182.A0r("thread_key");
                DirectThreadKey directThreadKey = c33411i3.A00;
                if (directThreadKey != null) {
                    AbstractC83623o5.A00(anonymousClass182, directThreadKey);
                    AbstractC43669JTd.A00(anonymousClass182, c33411i3);
                    anonymousClass182.A0a();
                    return;
                }
            }
            C14360o3.A0F("directThreadKey");
            throw C00O.createAndThrow();
        }

        @Override // X.C1OZ
        public final /* bridge */ /* synthetic */ Object E3S(C16L c16l) {
            C33411i3 parseFromJson = AbstractC34181F6f.parseFromJson(c16l);
            C14360o3.A07(parseFromJson);
            return parseFromJson;
        }
    };
    public DirectThreadKey A00;

    public C33411i3() {
        super(null, null, 1);
    }

    @Override // X.C1OW
    public final String A02() {
        return "group_invite_link_reset";
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
