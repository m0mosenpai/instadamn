package X;

import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;
import com.instagram.model.direct.DirectThreadKey;

/* renamed from: X.1at, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C29161at extends C1OW implements InterfaceC29171au {
    public static final C1OZ A02 = new C1OZ() { // from class: X.1aw
        @Override // X.C1OZ
        public final /* bridge */ /* synthetic */ Object E3S(C16L c16l) {
            C29161at parseFromJson = F5O.parseFromJson(c16l);
            C14360o3.A07(parseFromJson);
            return parseFromJson;
        }

        @Override // X.C1OZ
        public final void EOu(AnonymousClass182 anonymousClass182, Object obj) {
            C14360o3.A0C(obj, "null cannot be cast to non-null type com.instagram.direct.send.mutation.model.DirectAddThreadToInboxMutation");
            C29161at c29161at = (C29161at) obj;
            anonymousClass182.A0d();
            String str = c29161at.A00;
            if (str != null) {
                anonymousClass182.A0S(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, str);
                anonymousClass182.A0T("is_adding", c29161at.A01);
                AbstractC43669JTd.A00(anonymousClass182, c29161at);
                anonymousClass182.A0a();
                return;
            }
            C14360o3.A0F("threadId");
            throw C00O.createAndThrow();
        }
    };
    public String A00;
    public boolean A01;

    public C29161at() {
        super(null, null, 1);
    }

    @Override // X.C1OW
    public final String A02() {
        return "add_thread_to_inbox";
    }

    @Override // X.InterfaceC29171au
    public final DirectThreadKey C7Q() {
        String str = this.A00;
        if (str != null) {
            return new DirectThreadKey(str);
        }
        C14360o3.A0F("threadId");
        throw C00O.createAndThrow();
    }
}
