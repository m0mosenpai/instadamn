package X;

/* renamed from: X.8u2, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C200598u2 {
    public C200648u7 A00;
    public AnonymousClass818 A01;
    public InterfaceC179187xU A02;
    public boolean A03;
    public final C200608u3 A04;
    public final C81A A05;
    public final boolean A06;
    public final boolean A07;
    public volatile boolean A08;

    /* JADX WARN: Multi-variable type inference failed */
    public C200598u2(C81A c81a) {
        C200608u3 c200608u3;
        if (c81a instanceof C200608u3) {
            c200608u3 = (C200608u3) c81a;
        } else if (c81a instanceof AnonymousClass818) {
            AnonymousClass818 anonymousClass818 = (AnonymousClass818) c81a;
            c200608u3 = anonymousClass818.A0A;
            if (c200608u3 == null) {
                c200608u3 = new C200608u3(new C200618u4(anonymousClass818));
                anonymousClass818.A0A = c200608u3;
            }
        } else {
            c200608u3 = null;
        }
        this.A08 = true;
        c81a.getClass();
        this.A05 = c81a;
        this.A04 = c200608u3;
        boolean z = c81a instanceof AnonymousClass818;
        if (z) {
            this.A01 = (AnonymousClass818) c81a;
        }
        this.A00 = new C200648u7();
        this.A06 = c81a instanceof AnonymousClass819;
        this.A07 = z;
    }
}
