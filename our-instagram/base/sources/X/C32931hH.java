package X;

import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;
import com.instagram.direct.model.DirectThreadThemeInfo;
import com.instagram.model.direct.DirectThreadKey;

/* renamed from: X.1hH, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C32931hH extends C1OW implements InterfaceC29171au {
    public static final C1OZ A03 = new C1OZ() { // from class: X.1hI
        @Override // X.C1OZ
        public final void EOu(AnonymousClass182 anonymousClass182, Object obj) {
            C32931hH c32931hH = (C32931hH) obj;
            anonymousClass182.A0d();
            String str = c32931hH.A02;
            if (str != null) {
                anonymousClass182.A0S(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, str);
            }
            String str2 = c32931hH.A01;
            if (str2 != null) {
                anonymousClass182.A0S("theme_id", str2);
            }
            if (c32931hH.A00 != null) {
                anonymousClass182.A0r("theme_info");
                AbstractC127235p1.A00(anonymousClass182, c32931hH.A00);
            }
            AbstractC43669JTd.A00(anonymousClass182, c32931hH);
            anonymousClass182.A0a();
        }

        @Override // X.C1OZ
        public final /* bridge */ /* synthetic */ Object E3S(C16L c16l) {
            return F6X.parseFromJson(c16l);
        }
    };
    public DirectThreadThemeInfo A00;
    public String A01;
    public String A02;

    @Override // X.C1OW
    public final String A02() {
        return "set_thread_theme";
    }

    @Override // X.InterfaceC29171au
    public final DirectThreadKey C7Q() {
        return new DirectThreadKey(this.A02);
    }
}
