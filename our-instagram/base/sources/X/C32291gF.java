package X;

import com.instagram.model.direct.DirectThreadKey;

/* renamed from: X.1gF, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C32291gF extends C1OW implements InterfaceC29171au {
    public static final C1OZ A01 = new C1OZ() { // from class: X.1gG
        @Override // X.C1OZ
        public final /* bridge */ /* synthetic */ Object E3S(C16L c16l) {
            C14360o3.A0B(c16l, 0);
            C32291gF parseFromJson = AbstractC34159F5j.parseFromJson(c16l);
            C14360o3.A07(parseFromJson);
            return parseFromJson;
        }

        @Override // X.C1OZ
        public final void EOu(AnonymousClass182 anonymousClass182, Object obj) {
            C14360o3.A0B(anonymousClass182, 0);
            C14360o3.A0B(obj, 1);
            C32291gF c32291gF = (C32291gF) obj;
            anonymousClass182.A0d();
            if (c32291gF.A00 != null) {
                anonymousClass182.A0r("thread_key");
                DirectThreadKey directThreadKey = c32291gF.A00;
                if (directThreadKey != null) {
                    AbstractC83623o5.A00(anonymousClass182, directThreadKey);
                    AbstractC43669JTd.A00(anonymousClass182, c32291gF);
                    anonymousClass182.A0a();
                    return;
                }
            }
            C14360o3.A0F("key");
            throw C00O.createAndThrow();
        }
    };
    public DirectThreadKey A00;

    public C32291gF() {
        super(null, null, 1);
    }

    @Override // X.C1OW
    public final String A02() {
        return "leave_thread";
    }

    @Override // X.InterfaceC29171au
    public final DirectThreadKey C7Q() {
        DirectThreadKey directThreadKey = this.A00;
        if (directThreadKey != null) {
            return directThreadKey;
        }
        C14360o3.A0F("key");
        throw C00O.createAndThrow();
    }
}
