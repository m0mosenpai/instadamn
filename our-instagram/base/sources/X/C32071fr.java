package X;

import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;
import com.instagram.model.direct.DirectThreadKey;

/* renamed from: X.1fr, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C32071fr extends C1OW implements InterfaceC29171au {
    public static final C1OZ A03 = new C1OZ() { // from class: X.1fs
        @Override // X.C1OZ
        public final void EOu(AnonymousClass182 anonymousClass182, Object obj) {
            C32071fr c32071fr = (C32071fr) obj;
            anonymousClass182.A0d();
            String str = c32071fr.A01;
            if (str != null) {
                anonymousClass182.A0S(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, str);
            }
            anonymousClass182.A0T("vc_mute", c32071fr.A02);
            Integer num = c32071fr.A00;
            if (num != null) {
                anonymousClass182.A0Q("mute_seconds", num.intValue());
            }
            AbstractC43669JTd.A00(anonymousClass182, c32071fr);
            anonymousClass182.A0a();
        }

        @Override // X.C1OZ
        public final /* bridge */ /* synthetic */ Object E3S(C16L c16l) {
            return AbstractC34167F5r.parseFromJson(c16l);
        }
    };
    public Integer A00;
    public String A01;
    public boolean A02;

    @Override // X.C1OW
    public final String A02() {
        return "send_mute_video_call";
    }

    @Override // X.InterfaceC29171au
    public final DirectThreadKey C7Q() {
        return new DirectThreadKey(this.A01);
    }
}
