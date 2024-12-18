package X;

/* renamed from: X.1m7, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C35871m7 extends AbstractC29011ae {
    public static final C1OZ A02 = new C1OZ() { // from class: X.1m8
        @Override // X.C1OZ
        public final /* bridge */ /* synthetic */ Object E3S(C16L c16l) {
            C14360o3.A0B(c16l, 0);
            C35871m7 parseFromJson = AbstractC46953KpY.parseFromJson(c16l);
            C14360o3.A07(parseFromJson);
            return parseFromJson;
        }

        @Override // X.C1OZ
        public final void EOu(AnonymousClass182 anonymousClass182, Object obj) {
            C14360o3.A0B(anonymousClass182, 0);
            C14360o3.A0B(obj, 1);
            C35871m7 c35871m7 = (C35871m7) obj;
            anonymousClass182.A0d();
            String str = c35871m7.A01;
            if (str != null) {
                anonymousClass182.A0S("text", str);
                anonymousClass182.A0R("scheduled_timestamp", c35871m7.A00);
                AbstractC47856LCb.A00(anonymousClass182, c35871m7);
                anonymousClass182.A0a();
                return;
            }
            C14360o3.A0F("text");
            throw C00O.createAndThrow();
        }
    };
    public long A00;
    public String A01;

    @Override // X.C1OW
    public final String A02() {
        return "send_scheduled_message";
    }

    @Override // X.AbstractC29011ae
    public final /* bridge */ /* synthetic */ Object A05() {
        String str = this.A01;
        if (str != null) {
            return str;
        }
        C14360o3.A0F("text");
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC29021af
    public final C2EY Ar9() {
        return C2EY.A1i;
    }
}
