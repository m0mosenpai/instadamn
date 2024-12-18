package X;

import com.instagram.model.direct.DirectThreadKey;

/* renamed from: X.1gX, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C32471gX extends C1OW implements InterfaceC29171au {
    public static final C1OZ A02 = new C1OZ() { // from class: X.1gY
        @Override // X.C1OZ
        public final void EOu(AnonymousClass182 anonymousClass182, Object obj) {
            C32471gX c32471gX = (C32471gX) obj;
            anonymousClass182.A0d();
            if (c32471gX.A00 != null) {
                anonymousClass182.A0r("thread_key");
                AbstractC83623o5.A00(anonymousClass182, c32471gX.A00);
            }
            anonymousClass182.A0T("is_starred", c32471gX.A01);
            AbstractC43669JTd.A00(anonymousClass182, c32471gX);
            anonymousClass182.A0a();
        }

        @Override // X.C1OZ
        public final /* bridge */ /* synthetic */ Object E3S(C16L c16l) {
            return AbstractC34176F6a.parseFromJson(c16l);
        }
    };
    public DirectThreadKey A00;
    public boolean A01;

    @Override // X.C1OW
    public final String A02() {
        return "star_thread";
    }

    @Override // X.InterfaceC29171au
    public final DirectThreadKey C7Q() {
        return this.A00;
    }
}
