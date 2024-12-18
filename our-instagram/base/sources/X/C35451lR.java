package X;

import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;
import com.instagram.model.direct.DirectThreadKey;

/* renamed from: X.1lR, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C35451lR extends C1OW implements InterfaceC29171au {
    public static final C1OZ A05 = new C1OZ() { // from class: X.1lS
        @Override // X.C1OZ
        public final void EOu(AnonymousClass182 anonymousClass182, Object obj) {
            String str;
            C14360o3.A0B(anonymousClass182, 0);
            C14360o3.A0B(obj, 1);
            C35451lR c35451lR = (C35451lR) obj;
            anonymousClass182.A0d();
            anonymousClass182.A0Q("prompt_type", c35451lR.A00);
            String str2 = c35451lR.A03;
            if (str2 != null) {
                anonymousClass182.A0S(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, str2);
                String str3 = c35451lR.A02;
                if (str3 != null) {
                    anonymousClass182.A0S("prompt_id", str3);
                    String str4 = c35451lR.A01;
                    if (str4 != null) {
                        anonymousClass182.A0S("new_prompt_text", str4);
                        String str5 = c35451lR.A04;
                        if (str5 != null) {
                            anonymousClass182.A0S("trending_prompt_id", str5);
                        }
                        AbstractC43669JTd.A00(anonymousClass182, c35451lR);
                        anonymousClass182.A0a();
                        return;
                    }
                    str = "newPromptText";
                } else {
                    str = "promptId";
                }
            } else {
                str = "threadId";
            }
            C14360o3.A0F(str);
            throw C00O.createAndThrow();
        }

        @Override // X.C1OZ
        public final /* bridge */ /* synthetic */ Object E3S(C16L c16l) {
            C35451lR parseFromJson = AbstractC34150F5a.parseFromJson(c16l);
            C14360o3.A07(parseFromJson);
            return parseFromJson;
        }
    };
    public int A00;
    public String A01;
    public String A02;
    public String A03;
    public String A04;

    public C35451lR() {
        super(null, null, 1);
        this.A00 = 154;
    }

    @Override // X.C1OW
    public final String A02() {
        return "edit_add_yours";
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
