package X;

/* renamed from: X.1lp, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C35691lp extends C1OW implements InterfaceC35701lq {
    public static final C1OZ A02 = new C1OZ() { // from class: X.1lr
        @Override // X.C1OZ
        public final /* bridge */ /* synthetic */ Object E3S(C16L c16l) {
            C14360o3.A0B(c16l, 0);
            C35691lp parseFromJson = AbstractC34153F5d.parseFromJson(c16l);
            C14360o3.A07(parseFromJson);
            return parseFromJson;
        }

        @Override // X.C1OZ
        public final void EOu(AnonymousClass182 anonymousClass182, Object obj) {
            String str;
            C14360o3.A0B(anonymousClass182, 0);
            C14360o3.A0B(obj, 1);
            C35691lp c35691lp = (C35691lp) obj;
            anonymousClass182.A0d();
            String str2 = c35691lp.A00;
            if (str2 != null) {
                anonymousClass182.A0S("folder_id", str2);
                String str3 = c35691lp.A01;
                if (str3 != null) {
                    anonymousClass182.A0S("folder_name", str3);
                    AbstractC43669JTd.A00(anonymousClass182, c35691lp);
                    anonymousClass182.A0a();
                    return;
                }
                str = "folderName";
            } else {
                str = "folderId";
            }
            C14360o3.A0F(str);
            throw C00O.createAndThrow();
        }
    };
    public String A00;
    public String A01;

    public C35691lp() {
        super(null, null, 1);
    }

    @Override // X.C1OW
    public final String A02() {
        return "folder_update_name";
    }

    @Override // X.InterfaceC35701lq
    public final String BKd() {
        String str = this.A00;
        if (str != null) {
            return str;
        }
        C14360o3.A0F("folderId");
        throw C00O.createAndThrow();
    }
}
