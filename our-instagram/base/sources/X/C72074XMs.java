package X;

/* renamed from: X.XMs, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C72074XMs extends C5Ti {
    public static final C72074XMs A00 = new C72074XMs();

    public C72074XMs() {
        super(2, 0);
    }

    @Override // X.C5Ti
    public final String A00(int i) {
        if (i == 0) {
            return "removeIndex";
        }
        if (i == 1) {
            return "count";
        }
        return super.A00(i);
    }

    @Override // X.C5Ti
    public final void A02(C5TZ c5tz, C5Z3 c5z3, C117565Tr c117565Tr, C5Z5 c5z5) {
        C5Z4 c5z4 = (C5Z4) c5z5;
        int[] iArr = c5z4.A03.A05;
        int i = c5z4.A00;
        ((AnonymousClass599) ((C5TY) c5tz).A00).A0T(iArr[i], iArr[i + 1]);
    }
}
