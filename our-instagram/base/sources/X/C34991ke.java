package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectThreadKey;

/* renamed from: X.1ke, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C34991ke extends C1OW implements InterfaceC29171au {
    public static final C1OZ A03 = new C1OZ() { // from class: X.1kf
        @Override // X.C1OZ
        public final /* bridge */ /* synthetic */ Object E3S(C16L c16l) {
            C14360o3.A0B(c16l, 0);
            C34991ke parseFromJson = AbstractC46983Kq2.parseFromJson(c16l);
            C14360o3.A07(parseFromJson);
            return parseFromJson;
        }

        @Override // X.C1OZ
        public final void EOu(AnonymousClass182 anonymousClass182, Object obj) {
            String str;
            C14360o3.A0B(anonymousClass182, 0);
            C14360o3.A0B(obj, 1);
            C34991ke c34991ke = (C34991ke) obj;
            anonymousClass182.A0d();
            if (c34991ke.A01 != null) {
                anonymousClass182.A0r("thread_key");
                DirectThreadKey directThreadKey = c34991ke.A01;
                if (directThreadKey != null) {
                    AbstractC83623o5.A00(anonymousClass182, directThreadKey);
                    String str2 = c34991ke.A02;
                    if (str2 != null) {
                        anonymousClass182.A0S("sticker_id", str2);
                        AbstractC43669JTd.A00(anonymousClass182, c34991ke);
                        anonymousClass182.A0a();
                        return;
                    } else {
                        str = "stickerId";
                        C14360o3.A0F(str);
                        throw C00O.createAndThrow();
                    }
                }
            }
            str = "key";
            C14360o3.A0F(str);
            throw C00O.createAndThrow();
        }
    };
    public UserSession A00;
    public DirectThreadKey A01;
    public String A02;

    public C34991ke() {
        super(null, null, 1);
    }

    @Override // X.C1OW
    public final String A02() {
        return "unsave_sticker";
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
