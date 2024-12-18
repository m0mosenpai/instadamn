package X;

import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;
import com.instagram.model.direct.DirectThreadKey;

/* renamed from: X.1g3, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1g3 extends C1OW implements InterfaceC29171au {
    public static final C1OZ A02 = new C1OZ() { // from class: X.1g4
        @Override // X.C1OZ
        public final /* bridge */ /* synthetic */ Object E3S(C16L c16l) {
            C14360o3.A0B(c16l, 0);
            C1g3 parseFromJson = F5P.parseFromJson(c16l);
            C14360o3.A07(parseFromJson);
            return parseFromJson;
        }

        @Override // X.C1OZ
        public final void EOu(AnonymousClass182 anonymousClass182, Object obj) {
            C14360o3.A0B(anonymousClass182, 0);
            C14360o3.A0B(obj, 1);
            C1g3 c1g3 = (C1g3) obj;
            anonymousClass182.A0d();
            String str = c1g3.A00;
            if (str != null) {
                anonymousClass182.A0S(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, str);
            }
            anonymousClass182.A0T("approval_required_for_new_members", c1g3.A01);
            AbstractC43669JTd.A00(anonymousClass182, c1g3);
            anonymousClass182.A0a();
        }
    };
    public String A00;
    public boolean A01;

    public C1g3() {
        super(null, null, 1);
        this.A00 = "";
    }

    @Override // X.C1OW
    public final String A02() {
        return "send_admin_approval";
    }

    @Override // X.InterfaceC29171au
    public final DirectThreadKey C7Q() {
        return new DirectThreadKey(this.A00);
    }
}
