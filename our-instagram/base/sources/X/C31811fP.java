package X;

import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;
import com.instagram.model.direct.DirectThreadKey;

/* renamed from: X.1fP, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C31811fP extends C1OW implements InterfaceC29171au {
    public static final C1OZ A01 = new C1OZ() { // from class: X.1fQ
        @Override // X.C1OZ
        public final void EOu(AnonymousClass182 anonymousClass182, Object obj) {
            C31811fP c31811fP = (C31811fP) obj;
            anonymousClass182.A0d();
            if (c31811fP.A00 != null) {
                anonymousClass182.A0r(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID);
                AbstractC83623o5.A00(anonymousClass182, c31811fP.A00);
            }
            AbstractC43669JTd.A00(anonymousClass182, c31811fP);
            anonymousClass182.A0a();
        }

        @Override // X.C1OZ
        public final /* bridge */ /* synthetic */ Object E3S(C16L c16l) {
            return F5M.parseFromJson(c16l);
        }
    };
    public DirectThreadKey A00;

    @Override // X.C1OW
    public final String A02() {
        return "accept_valued_request";
    }

    @Override // X.InterfaceC29171au
    public final DirectThreadKey C7Q() {
        return this.A00;
    }
}
