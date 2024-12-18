package X;

import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;
import com.instagram.model.direct.DirectThreadKey;

/* renamed from: X.1fZ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C31891fZ extends C1OW implements InterfaceC29171au {
    public static final C1OZ A03 = new C1OZ() { // from class: X.1fa
        @Override // X.C1OZ
        public final void EOu(AnonymousClass182 anonymousClass182, Object obj) {
            C31891fZ c31891fZ = (C31891fZ) obj;
            anonymousClass182.A0d();
            String str = c31891fZ.A01;
            if (str != null) {
                anonymousClass182.A0S(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, str);
            }
            anonymousClass182.A0T("is_mute", c31891fZ.A02);
            Integer num = c31891fZ.A00;
            if (num != null) {
                anonymousClass182.A0Q("mute_seconds", num.intValue());
            }
            AbstractC43669JTd.A00(anonymousClass182, c31891fZ);
            anonymousClass182.A0a();
        }

        @Override // X.C1OZ
        public final /* bridge */ /* synthetic */ Object E3S(C16L c16l) {
            return AbstractC34165F5p.parseFromJson(c16l);
        }
    };
    public Integer A00;
    public String A01;
    public boolean A02;

    @Override // X.C1OW
    public final String A02() {
        return "send_mute_thread";
    }

    @Override // X.InterfaceC29171au
    public final DirectThreadKey C7Q() {
        return new DirectThreadKey(this.A01);
    }
}
