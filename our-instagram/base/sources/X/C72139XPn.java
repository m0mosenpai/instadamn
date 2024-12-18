package X;

/* renamed from: X.XPn, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C72139XPn extends C5Ti {
    public static final C72139XPn A00 = new C72139XPn();

    public C72139XPn() {
        super(3, 0);
    }

    @Override // X.C5Ti
    public final String A00(int i) {
        if (i == 0) {
            return "from";
        }
        if (i == 1) {
            return "to";
        }
        if (i == 2) {
            return "count";
        }
        return super.A00(i);
    }

    @Override // X.C5Ti
    public final void A02(C5TZ c5tz, C5Z3 c5z3, C117565Tr c117565Tr, C5Z5 c5z5) {
        C5Z4 c5z4 = (C5Z4) c5z5;
        int[] iArr = c5z4.A03.A05;
        int i = c5z4.A00;
        ((AnonymousClass599) ((C5TY) c5tz).A00).A0U(iArr[i], iArr[i + 1], iArr[i + 2]);
    }
}
