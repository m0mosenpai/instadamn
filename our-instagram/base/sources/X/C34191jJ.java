package X;

import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;
import com.instagram.model.direct.DirectThreadKey;

/* renamed from: X.1jJ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C34191jJ extends C1OW implements InterfaceC29171au {
    public static final C1OZ A04 = new C1OZ() { // from class: X.1jK
        @Override // X.C1OZ
        public final /* bridge */ /* synthetic */ Object E3S(C16L c16l) {
            C14360o3.A0B(c16l, 0);
            C34191jJ parseFromJson = AbstractC34078F2g.parseFromJson(c16l);
            C14360o3.A07(parseFromJson);
            return parseFromJson;
        }

        @Override // X.C1OZ
        public final void EOu(AnonymousClass182 anonymousClass182, Object obj) {
            C34191jJ c34191jJ;
            String str;
            C14360o3.A0B(anonymousClass182, 0);
            C14360o3.A0B(obj, 1);
            if (obj instanceof C34191jJ) {
                c34191jJ = (C34191jJ) obj;
            } else {
                c34191jJ = null;
            }
            anonymousClass182.A0d();
            String str2 = c34191jJ.A02;
            if (str2 != null) {
                anonymousClass182.A0S("token_ent_id_string", str2);
                String str3 = c34191jJ.A01;
                if (str3 != null) {
                    anonymousClass182.A0S("thread_key_string", str3);
                    String str4 = c34191jJ.A03;
                    if (str4 != null) {
                        anonymousClass182.A0S("user_action_type", str4);
                        String str5 = c34191jJ.A00;
                        if (str5 != null) {
                            anonymousClass182.A0S(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, str5);
                            AbstractC43669JTd.A00(anonymousClass182, c34191jJ);
                            anonymousClass182.A0a();
                            return;
                        }
                        str = "threadId";
                    } else {
                        str = "userActionType";
                    }
                } else {
                    str = "threadKeyString";
                }
            } else {
                str = "tokenEntIdString";
            }
            C14360o3.A0F(str);
            throw C00O.createAndThrow();
        }
    };
    public String A00;
    public String A01;
    public String A02;
    public String A03;

    public C34191jJ() {
        super(null, null, 1);
    }

    @Override // X.C1OW
    public final String A02() {
        return "ig_notification_messages";
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
