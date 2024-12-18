package X;

import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;
import com.instagram.model.direct.DirectThreadKey;

/* renamed from: X.1h9, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C32851h9 extends C1OW implements InterfaceC29171au {
    public static final C1OZ A04 = new C1OZ() { // from class: X.1hA
        @Override // X.C1OZ
        public final void EOu(AnonymousClass182 anonymousClass182, Object obj) {
            C32851h9 c32851h9 = (C32851h9) obj;
            anonymousClass182.A0d();
            String str = c32851h9.A00;
            if (str != null) {
                anonymousClass182.A0S(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, str);
            }
            anonymousClass182.A0T("shh_mode_enabled", c32851h9.A03);
            String str2 = c32851h9.A02;
            if (str2 != null) {
                anonymousClass182.A0S("shh_mode_toggler_user_id", str2);
            }
            AbstractC43669JTd.A00(anonymousClass182, c32851h9);
            anonymousClass182.A0a();
        }

        @Override // X.C1OZ
        public final /* bridge */ /* synthetic */ Object E3S(C16L c16l) {
            return AbstractC34185F6j.parseFromJson(c16l);
        }
    };
    public String A00;
    public String A01;
    public String A02;
    public boolean A03;

    @Override // X.C1OW
    public final String A02() {
        return "thread_toggle_shh_mode";
    }

    @Override // X.InterfaceC29171au
    public final DirectThreadKey C7Q() {
        return new DirectThreadKey(this.A00);
    }
}
