package X;

import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;
import com.instagram.model.direct.DirectThreadKey;

/* renamed from: X.1k9, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C34681k9 extends C1OW implements InterfaceC29171au {
    public static final C1OZ A04 = new C1OZ() { // from class: X.1kA
        @Override // X.C1OZ
        public final /* bridge */ /* synthetic */ Object E3S(C16L c16l) {
            C14360o3.A0B(c16l, 0);
            C34681k9 parseFromJson = F5N.parseFromJson(c16l);
            C14360o3.A07(parseFromJson);
            return parseFromJson;
        }

        @Override // X.C1OZ
        public final void EOu(AnonymousClass182 anonymousClass182, Object obj) {
            String str;
            C14360o3.A0B(anonymousClass182, 0);
            C14360o3.A0B(obj, 1);
            C34681k9 c34681k9 = (C34681k9) obj;
            anonymousClass182.A0d();
            String str2 = c34681k9.A02;
            if (str2 != null) {
                anonymousClass182.A0S(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, str2);
                String str3 = c34681k9.A00;
                if (str3 != null) {
                    anonymousClass182.A0S("item_id", str3);
                    String str4 = c34681k9.A01;
                    if (str4 != null) {
                        anonymousClass182.A0S("original_message_client_context", str4);
                    }
                    anonymousClass182.A0T("is_paid_partnership", c34681k9.A03);
                    AbstractC43669JTd.A00(anonymousClass182, c34681k9);
                    anonymousClass182.A0a();
                    return;
                }
                str = "itemId";
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
    public boolean A03;

    public C34681k9() {
        super(null, null, 1);
    }

    @Override // X.C1OW
    public final String A02() {
        return "add_paid_partnership_label";
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
