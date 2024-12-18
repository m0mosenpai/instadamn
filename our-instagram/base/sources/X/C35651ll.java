package X;

import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;
import com.instagram.model.direct.DirectThreadKey;

/* renamed from: X.1ll, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C35651ll extends C1OW implements InterfaceC29171au {
    public static final C1OZ A04 = new C1OZ() { // from class: X.1lm
        @Override // X.C1OZ
        public final void EOu(AnonymousClass182 anonymousClass182, Object obj) {
            String str;
            C14360o3.A0B(anonymousClass182, 0);
            C14360o3.A0B(obj, 1);
            C35651ll c35651ll = (C35651ll) obj;
            anonymousClass182.A0d();
            String str2 = c35651ll.A03;
            if (str2 != null) {
                anonymousClass182.A0S(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, str2);
                String str3 = c35651ll.A00;
                if (str3 != null) {
                    anonymousClass182.A0S("client_context", str3);
                    String str4 = c35651ll.A01;
                    if (str4 != null) {
                        anonymousClass182.A0S("creator_id", str4);
                        String str5 = c35651ll.A02;
                        if (str5 != null) {
                            anonymousClass182.A0S("prompt_id", str5);
                            AbstractC43669JTd.A00(anonymousClass182, c35651ll);
                            anonymousClass182.A0a();
                            return;
                        }
                        str = "promptId";
                    } else {
                        str = "creatorId";
                    }
                } else {
                    str = "clientContext";
                }
            } else {
                str = "threadId";
            }
            C14360o3.A0F(str);
            throw C00O.createAndThrow();
        }

        @Override // X.C1OZ
        public final /* bridge */ /* synthetic */ Object E3S(C16L c16l) {
            C35651ll parseFromJson = AbstractC34177F6b.parseFromJson(c16l);
            C14360o3.A07(parseFromJson);
            return parseFromJson;
        }
    };
    public String A00;
    public String A01;
    public String A02;
    public String A03;

    public C35651ll() {
        super(null, null, 1);
    }

    @Override // X.C1OW
    public final String A02() {
        return "stop_recurring_prompt";
    }

    @Override // X.InterfaceC29171au
    public final DirectThreadKey C7Q() {
        String str = this.A03;
        if (str != null) {
            return new DirectThreadKey(str);
        }
        C14360o3.A0F("threadId");
        throw C00O.createAndThrow();
    }
}
