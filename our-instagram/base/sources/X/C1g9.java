package X;

import com.instagram.model.direct.DirectThreadKey;

/* renamed from: X.1g9, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1g9 extends C1OW implements InterfaceC29171au {
    public static final C1OZ A01 = new C1OZ() { // from class: X.1gA
        @Override // X.C1OZ
        public final /* bridge */ /* synthetic */ Object E3S(C16L c16l) {
            C14360o3.A0B(c16l, 0);
            C1g9 parseFromJson = F5X.parseFromJson(c16l);
            C14360o3.A07(parseFromJson);
            return parseFromJson;
        }

        @Override // X.C1OZ
        public final void EOu(AnonymousClass182 anonymousClass182, Object obj) {
            C14360o3.A0B(anonymousClass182, 0);
            C14360o3.A0B(obj, 1);
            C1g9 c1g9 = (C1g9) obj;
            anonymousClass182.A0d();
            if (c1g9.A00 != null) {
                anonymousClass182.A0r("thread_key");
                DirectThreadKey directThreadKey = c1g9.A00;
                if (directThreadKey != null) {
                    AbstractC83623o5.A00(anonymousClass182, directThreadKey);
                    AbstractC43669JTd.A00(anonymousClass182, c1g9);
                    anonymousClass182.A0a();
                    return;
                }
            }
            C14360o3.A0F("directThreadKey");
            throw C00O.createAndThrow();
        }
    };
    public DirectThreadKey A00;

    public C1g9() {
        super(null, null, 1);
    }

    @Override // X.C1OW
    public final String A02() {
        return "delete_thread";
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
