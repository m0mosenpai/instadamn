package X;

import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;
import com.instagram.model.direct.DirectThreadKey;

/* renamed from: X.1gj, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C32591gj extends C1OW implements InterfaceC29171au {
    public static final C1OZ A02 = new C1OZ() { // from class: X.1gk
        @Override // X.C1OZ
        public final void EOu(AnonymousClass182 anonymousClass182, Object obj) {
            C14360o3.A0B(anonymousClass182, 0);
            C14360o3.A0B(obj, 1);
            C32591gj c32591gj = (C32591gj) obj;
            anonymousClass182.A0d();
            String str = c32591gj.A00;
            if (str != null) {
                anonymousClass182.A0S(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, str);
                AbstractC43669JTd.A00(anonymousClass182, c32591gj);
                anonymousClass182.A0a();
                return;
            }
            C14360o3.A0F("threadId");
            throw C00O.createAndThrow();
        }

        @Override // X.C1OZ
        public final /* bridge */ /* synthetic */ Object E3S(C16L c16l) {
            C32591gj parseFromJson = F5R.parseFromJson(c16l);
            C14360o3.A07(parseFromJson);
            return parseFromJson;
        }
    };
    public String A00;
    public boolean A01;

    public C32591gj() {
        super(null, null, 1);
    }

    @Override // X.C1OW
    public final String A02() {
        return "clips_together_activity";
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
