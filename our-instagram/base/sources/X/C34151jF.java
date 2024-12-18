package X;

import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;
import com.instagram.model.direct.DirectThreadKey;

/* renamed from: X.1jF, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C34151jF extends C1OW implements InterfaceC29171au {
    public static final C1OZ A02 = new C1OZ() { // from class: X.1jG
        @Override // X.C1OZ
        public final /* bridge */ /* synthetic */ Object E3S(C16L c16l) {
            C34151jF parseFromJson = AbstractC34178F6c.parseFromJson(c16l);
            C14360o3.A07(parseFromJson);
            return parseFromJson;
        }

        @Override // X.C1OZ
        public final void EOu(AnonymousClass182 anonymousClass182, Object obj) {
            String str;
            C14360o3.A0C(obj, "null cannot be cast to non-null type com.instagram.direct.send.mutation.model.DirectSubscribeToContentMutation");
            C34151jF c34151jF = (C34151jF) obj;
            anonymousClass182.A0d();
            String str2 = c34151jF.A01;
            if (str2 != null) {
                anonymousClass182.A0S(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, str2);
                String str3 = c34151jF.A00;
                if (str3 != null) {
                    anonymousClass182.A0S("message_id", str3);
                    AbstractC43669JTd.A00(anonymousClass182, c34151jF);
                    anonymousClass182.A0a();
                    return;
                }
                str = "messageId";
            } else {
                str = "threadId";
            }
            C14360o3.A0F(str);
            throw C00O.createAndThrow();
        }
    };
    public String A00;
    public String A01;

    public C34151jF() {
        super(null, null, 1);
    }

    @Override // X.C1OW
    public final String A02() {
        return "thread_subscribe_to_content";
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
