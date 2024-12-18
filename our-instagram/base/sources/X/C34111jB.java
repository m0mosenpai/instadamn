package X;

import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;
import com.instagram.model.direct.DirectThreadKey;

/* renamed from: X.1jB, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C34111jB extends C1OW implements InterfaceC29171au {
    public static final C1OZ A02 = new C1OZ() { // from class: X.1jC
        @Override // X.C1OZ
        public final /* bridge */ /* synthetic */ Object E3S(C16L c16l) {
            C34111jB parseFromJson = F5Z.parseFromJson(c16l);
            C14360o3.A07(parseFromJson);
            return parseFromJson;
        }

        @Override // X.C1OZ
        public final void EOu(AnonymousClass182 anonymousClass182, Object obj) {
            C14360o3.A0C(obj, "null cannot be cast to non-null type com.instagram.direct.send.mutation.model.DirectDismissInboxNudgeMutation");
            C34111jB c34111jB = (C34111jB) obj;
            anonymousClass182.A0d();
            String str = c34111jB.A00;
            if (str != null) {
                anonymousClass182.A0S(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, str);
                anonymousClass182.A0T("is_nudge_seen_dismissed", c34111jB.A01);
                AbstractC43669JTd.A00(anonymousClass182, c34111jB);
                anonymousClass182.A0a();
                return;
            }
            C14360o3.A0F("threadId");
            throw C00O.createAndThrow();
        }
    };
    public String A00;
    public boolean A01;

    public C34111jB() {
        super(null, null, 1);
    }

    @Override // X.C1OW
    public final String A02() {
        return "dismiss_inbox_nudge";
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
