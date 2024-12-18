package X;

/* renamed from: X.DnT, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31184DnT implements C1OZ {
    @Override // X.C1OZ
    public final /* bridge */ /* synthetic */ Object E3S(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        C35301lC parseFromJson = AbstractC34170F5u.parseFromJson(c16l);
        C14360o3.A07(parseFromJson);
        return parseFromJson;
    }

    @Override // X.C1OZ
    public final void EOu(AnonymousClass182 anonymousClass182, Object obj) {
        AbstractC167017dG.A1N(anonymousClass182, obj);
        C35301lC c35301lC = (C35301lC) obj;
        anonymousClass182.A0d();
        String str = c35301lC.A00;
        if (str != null) {
            anonymousClass182.A0S(AbstractC43591JPw.A00(36), str);
            String str2 = c35301lC.A01;
            if (str2 != null) {
                anonymousClass182.A0S("reshare_text", str2);
            }
            AbstractC47856LCb.A00(anonymousClass182, c35301lC);
            anonymousClass182.A0a();
            return;
        }
        C14360o3.A0F("containerId");
        throw C00O.createAndThrow();
    }
}
