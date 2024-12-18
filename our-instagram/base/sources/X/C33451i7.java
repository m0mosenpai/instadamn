package X;

import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;
import com.instagram.model.direct.DirectThreadKey;

/* renamed from: X.1i7, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C33451i7 extends C1OW implements InterfaceC29171au {
    public static final C1OZ A03 = new C1OZ() { // from class: X.1i8
        @Override // X.C1OZ
        public final /* bridge */ /* synthetic */ Object E3S(C16L c16l) {
            C14360o3.A0B(c16l, 0);
            C33451i7 parseFromJson = F8C.parseFromJson(c16l);
            C14360o3.A07(parseFromJson);
            return parseFromJson;
        }

        @Override // X.C1OZ
        public final void EOu(AnonymousClass182 anonymousClass182, Object obj) {
            String str;
            C14360o3.A0B(anonymousClass182, 0);
            C14360o3.A0B(obj, 1);
            C33451i7 c33451i7 = (C33451i7) obj;
            anonymousClass182.A0d();
            String str2 = c33451i7.A02;
            if (str2 != null) {
                anonymousClass182.A0S(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, str2);
                String str3 = c33451i7.A01;
                if (str3 != null) {
                    anonymousClass182.A0S("referral_param", str3);
                    String str4 = c33451i7.A00;
                    str = "recipientId";
                    if (str4 != null) {
                        anonymousClass182.A0S("recipientId", str4);
                        AbstractC43669JTd.A00(anonymousClass182, c33451i7);
                        anonymousClass182.A0a();
                        return;
                    }
                } else {
                    str = "referralParam";
                }
            } else {
                str = "threadId";
            }
            C14360o3.A0F(str);
            throw C00O.createAndThrow();
        }
    };
    public String A00;
    public String A01;
    public String A02;

    public C33451i7() {
        super(null, null, 1);
    }

    @Override // X.C1OW
    public final String A02() {
        return "ig_me_referral";
    }

    @Override // X.InterfaceC29171au
    public final DirectThreadKey C7Q() {
        String str = this.A02;
        if (str != null) {
            return new DirectThreadKey(str);
        }
        C14360o3.A0F("threadId");
        throw C00O.createAndThrow();
    }
}
