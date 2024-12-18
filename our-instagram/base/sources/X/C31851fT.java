package X;

import com.instagram.model.direct.DirectThreadKey;

/* renamed from: X.1fT, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C31851fT extends C1OW implements InterfaceC29171au {
    public static final C1OZ A02 = new C1OZ() { // from class: X.1fU
        @Override // X.C1OZ
        public final void EOu(AnonymousClass182 anonymousClass182, Object obj) {
            C31851fT c31851fT = (C31851fT) obj;
            anonymousClass182.A0d();
            if (c31851fT.A00 != null) {
                anonymousClass182.A0r("thread_key");
                AbstractC83623o5.A00(anonymousClass182, c31851fT.A00);
            }
            anonymousClass182.A0T("mark_as_unread", c31851fT.A01);
            AbstractC43669JTd.A00(anonymousClass182, c31851fT);
            anonymousClass182.A0a();
        }

        @Override // X.C1OZ
        public final /* bridge */ /* synthetic */ Object E3S(C16L c16l) {
            return AbstractC34162F5m.parseFromJson(c16l);
        }
    };
    public DirectThreadKey A00;
    public boolean A01;

    @Override // X.C1OW
    public final String A02() {
        return "send_mark_unread";
    }

    @Override // X.InterfaceC29171au
    public final DirectThreadKey C7Q() {
        return this.A00;
    }
}
