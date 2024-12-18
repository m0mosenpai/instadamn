package X;

import com.instagram.model.direct.DirectThreadKey;

/* renamed from: X.1lF, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C35331lF extends C1OW implements InterfaceC29171au {
    public static final C1OZ A07 = new C1OZ() { // from class: X.1lG
        @Override // X.C1OZ
        public final /* bridge */ /* synthetic */ Object E3S(C16L c16l) {
            C14360o3.A0B(c16l, 0);
            C35331lF parseFromJson = AbstractC47013KqW.parseFromJson(c16l);
            C14360o3.A07(parseFromJson);
            return parseFromJson;
        }

        @Override // X.C1OZ
        public final void EOu(AnonymousClass182 anonymousClass182, Object obj) {
            C14360o3.A0B(anonymousClass182, 0);
            C14360o3.A0B(obj, 1);
            C35331lF c35331lF = (C35331lF) obj;
            anonymousClass182.A0d();
            String str = "key";
            if (c35331lF.A01 != null) {
                anonymousClass182.A0r("key");
                DirectThreadKey directThreadKey = c35331lF.A01;
                if (directThreadKey != null) {
                    AbstractC83623o5.A00(anonymousClass182, directThreadKey);
                    String str2 = c35331lF.A04;
                    if (str2 != null) {
                        anonymousClass182.A0S("message_id", str2);
                        String str3 = c35331lF.A02;
                        if (str3 != null) {
                            anonymousClass182.A0S("client_context", str3);
                            String str4 = c35331lF.A03;
                            if (str4 != null) {
                                anonymousClass182.A0S("media_id", str4);
                                anonymousClass182.A0Q("media_intervention_type", c35331lF.A00);
                                anonymousClass182.A0T("is_instamadillo", c35331lF.A06);
                                anonymousClass182.A0T("is_ae_open_eb", c35331lF.A05);
                                AbstractC43669JTd.A00(anonymousClass182, c35331lF);
                                anonymousClass182.A0a();
                                return;
                            }
                            str = "mediaId";
                        } else {
                            str = "clientContext";
                        }
                    } else {
                        str = "messageId";
                    }
                }
            }
            C14360o3.A0F(str);
            throw C00O.createAndThrow();
        }
    };
    public int A00;
    public DirectThreadKey A01;
    public String A02;
    public String A03;
    public String A04;
    public boolean A05;
    public boolean A06;

    public C35331lF() {
        super(null, null, 1);
        this.A00 = -1;
    }

    @Override // X.C1OW
    public final String A02() {
        return "send_client_side_inference";
    }

    @Override // X.InterfaceC29171au
    public final DirectThreadKey C7Q() {
        DirectThreadKey directThreadKey = this.A01;
        if (directThreadKey != null) {
            return directThreadKey;
        }
        C14360o3.A0F("key");
        throw C00O.createAndThrow();
    }
}
