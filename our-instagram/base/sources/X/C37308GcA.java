package X;

/* renamed from: X.GcA, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37308GcA implements C1OZ {
    @Override // X.C1OZ
    public final /* bridge */ /* synthetic */ Object E3S(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        C35271l9 parseFromJson = AbstractC40589Hz9.parseFromJson(c16l);
        C14360o3.A07(parseFromJson);
        return parseFromJson;
    }

    @Override // X.C1OZ
    public final void EOu(AnonymousClass182 anonymousClass182, Object obj) {
        AbstractC167017dG.A1N(anonymousClass182, obj);
        C35271l9 c35271l9 = (C35271l9) obj;
        anonymousClass182.A0d();
        String str = c35271l9.A00;
        if (str != null) {
            anonymousClass182.A0S("media_id", str);
            String str2 = c35271l9.A01;
            if (str2 != null) {
                anonymousClass182.A0S("reply_text", str2);
            }
            AbstractC47856LCb.A00(anonymousClass182, c35271l9);
            anonymousClass182.A0a();
            return;
        }
        C14360o3.A0F("mediaId");
        throw C00O.createAndThrow();
    }
}
