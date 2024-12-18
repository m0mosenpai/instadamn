package X;

import java.util.List;

/* renamed from: X.1lh, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C35611lh extends C1OW {
    public static final C1OZ A01 = new C1OZ() { // from class: X.1li
        @Override // X.C1OZ
        public final /* bridge */ /* synthetic */ Object E3S(C16L c16l) {
            C14360o3.A0B(c16l, 0);
            C35611lh parseFromJson = AbstractC34179F6d.parseFromJson(c16l);
            C14360o3.A07(parseFromJson);
            return parseFromJson;
        }

        @Override // X.C1OZ
        public final void EOu(AnonymousClass182 anonymousClass182, Object obj) {
            C14360o3.A0B(anonymousClass182, 0);
            C14360o3.A0B(obj, 1);
            C35611lh c35611lh = (C35611lh) obj;
            anonymousClass182.A0d();
            if (c35611lh.A00 != null) {
                C16V.A03(anonymousClass182, "thread_ids");
                List<String> list = c35611lh.A00;
                if (list != null) {
                    for (String str : list) {
                        if (str != null) {
                            anonymousClass182.A0u(str);
                        }
                    }
                    anonymousClass182.A0Z();
                    AbstractC43669JTd.A00(anonymousClass182, c35611lh);
                    anonymousClass182.A0a();
                    return;
                }
            }
            C14360o3.A0F("threadIds");
            throw C00O.createAndThrow();
        }
    };
    public List A00;

    public C35611lh() {
        super(null, null, 1);
    }

    @Override // X.C1OW
    public final String A02() {
        return "thread_dyi_deletion";
    }
}
