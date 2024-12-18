package X;

import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;
import com.instagram.model.direct.DirectThreadKey;

/* renamed from: X.1h1, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C32771h1 extends C1OW implements InterfaceC29171au {
    public static final C1OZ A03 = new C1OZ() { // from class: X.1h2
        @Override // X.C1OZ
        public final void EOu(AnonymousClass182 anonymousClass182, Object obj) {
            C32771h1 c32771h1 = (C32771h1) obj;
            anonymousClass182.A0d();
            String str = c32771h1.A02;
            if (str != null) {
                anonymousClass182.A0S(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, str);
            }
            anonymousClass182.A0Q("folder", c32771h1.A00);
            String str2 = c32771h1.A01;
            if (str2 != null) {
                anonymousClass182.A0S("custom_folder_id", str2);
            }
            AbstractC43669JTd.A00(anonymousClass182, c32771h1);
            anonymousClass182.A0a();
        }

        @Override // X.C1OZ
        public final /* bridge */ /* synthetic */ Object E3S(C16L c16l) {
            return AbstractC34163F5n.parseFromJson(c16l);
        }
    };
    public int A00;
    public String A01;
    public String A02;

    @Override // X.C1OW
    public final String A02() {
        return "thread_move_folder";
    }

    @Override // X.InterfaceC29171au
    public final DirectThreadKey C7Q() {
        return new DirectThreadKey(this.A02);
    }
}
