package X;

import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;
import com.instagram.model.direct.DirectThreadKey;

/* renamed from: X.1ld, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C35571ld extends C1OW implements InterfaceC29171au {
    public static final C1OZ A02 = new C1OZ() { // from class: X.1le
        @Override // X.C1OZ
        public final /* bridge */ /* synthetic */ Object E3S(C16L c16l) {
            C14360o3.A0B(c16l, 0);
            C35571ld parseFromJson = AbstractC34183F6h.parseFromJson(c16l);
            C14360o3.A07(parseFromJson);
            return parseFromJson;
        }

        @Override // X.C1OZ
        public final void EOu(AnonymousClass182 anonymousClass182, Object obj) {
            C14360o3.A0B(anonymousClass182, 0);
            C14360o3.A0B(obj, 1);
            C35571ld c35571ld = (C35571ld) obj;
            anonymousClass182.A0d();
            String str = c35571ld.A01;
            if (str != null) {
                anonymousClass182.A0S(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, str);
                anonymousClass182.A0Q("notification_preview_controls", c35571ld.A00);
                AbstractC43669JTd.A00(anonymousClass182, c35571ld);
                anonymousClass182.A0a();
                return;
            }
            C14360o3.A0F("threadId");
            throw C00O.createAndThrow();
        }
    };
    public int A00;
    public String A01;

    public C35571ld() {
        super(null, null, 1);
    }

    @Override // X.C1OW
    public final String A02() {
        return "thread_toggle_notification_preview_control";
    }

    @Override // X.InterfaceC29171au
    public final DirectThreadKey C7Q() {
        String str = this.A01;
        if (str != null) {
            return new DirectThreadKey(str);
        }
        C14360o3.A0F("threadId");
        throw C00O.createAndThrow();
    }
}
