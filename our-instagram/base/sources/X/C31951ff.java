package X;

import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;
import com.instagram.model.direct.DirectThreadKey;

/* renamed from: X.1ff, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C31951ff extends C1OW implements InterfaceC29171au {
    public static final C1OZ A02 = new C1OZ() { // from class: X.1fg
        @Override // X.C1OZ
        public final void EOu(AnonymousClass182 anonymousClass182, Object obj) {
            C31951ff c31951ff = (C31951ff) obj;
            anonymousClass182.A0d();
            String str = c31951ff.A00;
            if (str != null) {
                anonymousClass182.A0S(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, str);
            }
            anonymousClass182.A0T("is_mentions_mute", c31951ff.A01);
            AbstractC43669JTd.A00(anonymousClass182, c31951ff);
            anonymousClass182.A0a();
        }

        @Override // X.C1OZ
        public final /* bridge */ /* synthetic */ Object E3S(C16L c16l) {
            return AbstractC34164F5o.parseFromJson(c16l);
        }
    };
    public String A00;
    public boolean A01;

    @Override // X.C1OW
    public final String A02() {
        return "send_mute_thread_mentions";
    }

    @Override // X.InterfaceC29171au
    public final DirectThreadKey C7Q() {
        return new DirectThreadKey(this.A00);
    }
}
