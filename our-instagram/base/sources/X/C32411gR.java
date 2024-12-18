package X;

import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;
import com.instagram.model.direct.DirectThreadKey;

/* renamed from: X.1gR, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C32411gR extends C1OW implements InterfaceC29171au {
    public static final C1OZ A02 = new C1OZ() { // from class: X.1gS
        @Override // X.C1OZ
        public final /* bridge */ /* synthetic */ Object E3S(C16L c16l) {
            C14360o3.A0B(c16l, 0);
            C32411gR parseFromJson = F5Q.parseFromJson(c16l);
            C14360o3.A07(parseFromJson);
            return parseFromJson;
        }

        @Override // X.C1OZ
        public final void EOu(AnonymousClass182 anonymousClass182, Object obj) {
            String str;
            C14360o3.A0B(anonymousClass182, 0);
            C14360o3.A0B(obj, 1);
            C32411gR c32411gR = (C32411gR) obj;
            anonymousClass182.A0d();
            String str2 = c32411gR.A01;
            if (str2 != null) {
                anonymousClass182.A0S(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, str2);
                String str3 = c32411gR.A00;
                if (str3 != null) {
                    anonymousClass182.A0S("new_title", str3);
                    AbstractC43669JTd.A00(anonymousClass182, c32411gR);
                    anonymousClass182.A0a();
                    return;
                }
                str = "newTitle";
            } else {
                str = "threadId";
            }
            C14360o3.A0F(str);
            throw C00O.createAndThrow();
        }
    };
    public String A00;
    public String A01;

    public C32411gR() {
        super(null, null, 1);
    }

    @Override // X.C1OW
    public final String A02() {
        return "change_thread_title";
    }

    public final C83693oE A03() {
        String str = this.A01;
        if (str != null) {
            return new C83693oE(str);
        }
        C14360o3.A0F("threadId");
        throw C00O.createAndThrow();
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
