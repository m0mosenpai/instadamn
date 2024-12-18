package X;

import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;
import com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment;
import com.instagram.model.direct.DirectThreadKey;

/* renamed from: X.1h6, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C32821h6 extends C1OW implements InterfaceC29171au {
    public static final C1OZ A02 = new C1OZ() { // from class: X.1h7
        @Override // X.C1OZ
        public final /* bridge */ /* synthetic */ Object E3S(C16L c16l) {
            C14360o3.A0B(c16l, 0);
            C32821h6 parseFromJson = F5Y.parseFromJson(c16l);
            C14360o3.A07(parseFromJson);
            return parseFromJson;
        }

        @Override // X.C1OZ
        public final void EOu(AnonymousClass182 anonymousClass182, Object obj) {
            String str;
            C14360o3.A0B(anonymousClass182, 0);
            C14360o3.A0B(obj, 1);
            C32821h6 c32821h6 = (C32821h6) obj;
            anonymousClass182.A0d();
            String str2 = c32821h6.A00;
            if (str2 != null) {
                anonymousClass182.A0S(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, str2);
                String str3 = c32821h6.A01;
                if (str3 != null) {
                    anonymousClass182.A0S(CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID, str3);
                    AbstractC43669JTd.A00(anonymousClass182, c32821h6);
                    anonymousClass182.A0a();
                    return;
                }
                str = "userId";
            } else {
                str = "threadId";
            }
            C14360o3.A0F(str);
            throw C00O.createAndThrow();
        }
    };
    public String A00;
    public String A01;

    public C32821h6() {
        super(null, null, 1);
    }

    @Override // X.C1OW
    public final String A02() {
        return "thread_deny_request";
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
