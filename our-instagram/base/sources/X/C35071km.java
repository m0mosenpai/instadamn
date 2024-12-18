package X;

import com.instagram.model.direct.DirectThreadKey;

/* renamed from: X.1km, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C35071km extends C1OW implements InterfaceC29171au {
    public static final C1OZ A02 = new C1OZ() { // from class: X.1kn
        @Override // X.C1OZ
        public final /* bridge */ /* synthetic */ Object E3S(C16L c16l) {
            C14360o3.A0B(c16l, 0);
            C35071km parseFromJson = F6W.parseFromJson(c16l);
            C14360o3.A07(parseFromJson);
            return parseFromJson;
        }

        @Override // X.C1OZ
        public final void EOu(AnonymousClass182 anonymousClass182, Object obj) {
            String str;
            C14360o3.A0B(anonymousClass182, 0);
            C14360o3.A0B(obj, 1);
            C35071km c35071km = (C35071km) obj;
            anonymousClass182.A0d();
            if (c35071km.A01 != null) {
                anonymousClass182.A0r("thread_key");
                DirectThreadKey directThreadKey = c35071km.A01;
                if (directThreadKey != null) {
                    AbstractC83623o5.A00(anonymousClass182, directThreadKey);
                    if (c35071km.A00 != null) {
                        anonymousClass182.A0r("nudge");
                        C9BO c9bo = c35071km.A00;
                        if (c9bo != null) {
                            AbstractC81653ka.A00(c9bo, anonymousClass182);
                            AbstractC43669JTd.A00(anonymousClass182, c35071km);
                            anonymousClass182.A0a();
                            return;
                        }
                    }
                    str = "nudgeMetadata";
                    C14360o3.A0F(str);
                    throw C00O.createAndThrow();
                }
            }
            str = "directThreadKey";
            C14360o3.A0F(str);
            throw C00O.createAndThrow();
        }
    };
    public C9BO A00;
    public DirectThreadKey A01;

    public C35071km() {
        super(null, null, 1);
    }

    @Override // X.C1OW
    public final String A02() {
        return "send_set_nudge";
    }

    @Override // X.InterfaceC29171au
    public final DirectThreadKey C7Q() {
        DirectThreadKey directThreadKey = this.A01;
        if (directThreadKey != null) {
            return directThreadKey;
        }
        C14360o3.A0F("directThreadKey");
        throw C00O.createAndThrow();
    }
}
