package X;

import java.util.List;

/* renamed from: X.1lx, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C35771lx extends C1OW implements InterfaceC35701lq {
    public static final C1OZ A01 = new C1OZ() { // from class: X.1ly
        @Override // X.C1OZ
        public final /* bridge */ /* synthetic */ Object E3S(C16L c16l) {
            C14360o3.A0B(c16l, 0);
            C35771lx parseFromJson = AbstractC34154F5e.parseFromJson(c16l);
            C14360o3.A07(parseFromJson);
            return parseFromJson;
        }

        @Override // X.C1OZ
        public final void EOu(AnonymousClass182 anonymousClass182, Object obj) {
            C14360o3.A0B(anonymousClass182, 0);
            C14360o3.A0B(obj, 1);
            C35771lx c35771lx = (C35771lx) obj;
            anonymousClass182.A0d();
            if (c35771lx.A00 != null) {
                C16V.A03(anonymousClass182, "folder_sequence");
                List<String> list = c35771lx.A00;
                if (list != null) {
                    for (String str : list) {
                        if (str != null) {
                            anonymousClass182.A0u(str);
                        }
                    }
                    anonymousClass182.A0Z();
                    AbstractC43669JTd.A00(anonymousClass182, c35771lx);
                    anonymousClass182.A0a();
                    return;
                }
            }
            C14360o3.A0F("folderSequence");
            throw C00O.createAndThrow();
        }
    };
    public List A00;

    public C35771lx() {
        super(null, null, 1);
    }

    @Override // X.C1OW
    public final String A02() {
        return "folder_update_sequence";
    }

    @Override // X.InterfaceC35701lq
    public final String BKd() {
        List list = this.A00;
        if (list != null) {
            return AbstractC001800i.A0P("_", "", "", list, null);
        }
        C14360o3.A0F("folderSequence");
        throw C00O.createAndThrow();
    }
}
