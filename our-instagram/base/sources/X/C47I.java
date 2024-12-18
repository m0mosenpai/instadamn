package X;

/* renamed from: X.47I, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C47I extends C0T6 {
    public final C54M A00;
    public final C54M A01;
    public final C54M A02;
    public final C54M A03;
    public final C54M A04;
    public final InterfaceC39571se A05;
    public final C47G A06;
    public final Integer A07;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C47I) {
                C47I c47i = (C47I) obj;
                if (!C14360o3.A0K(this.A07, c47i.A07) || !C14360o3.A0K(this.A05, c47i.A05) || !C14360o3.A0K(this.A00, c47i.A00) || !C14360o3.A0K(this.A01, c47i.A01) || !C14360o3.A0K(this.A02, c47i.A02) || !C14360o3.A0K(this.A03, c47i.A03) || !C14360o3.A0K(this.A04, c47i.A04) || !C14360o3.A0K(this.A06, c47i.A06)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        Integer num = this.A07;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        InterfaceC39571se interfaceC39571se = this.A05;
        int hashCode2 = (hashCode + (interfaceC39571se == null ? 0 : interfaceC39571se.hashCode())) * 31;
        C54M c54m = this.A00;
        int hashCode3 = (hashCode2 + (c54m == null ? 0 : c54m.hashCode())) * 31;
        C54M c54m2 = this.A01;
        int hashCode4 = (hashCode3 + (c54m2 == null ? 0 : c54m2.hashCode())) * 31;
        C54M c54m3 = this.A02;
        int hashCode5 = (hashCode4 + (c54m3 == null ? 0 : c54m3.hashCode())) * 31;
        C54M c54m4 = this.A03;
        int hashCode6 = (hashCode5 + (c54m4 == null ? 0 : c54m4.hashCode())) * 31;
        C54M c54m5 = this.A04;
        int hashCode7 = (hashCode6 + (c54m5 == null ? 0 : c54m5.hashCode())) * 31;
        C47G c47g = this.A06;
        return hashCode7 + (c47g != null ? c47g.hashCode() : 0);
    }

    public C47I(C54M c54m, C54M c54m2, C54M c54m3, C54M c54m4, C54M c54m5, InterfaceC39571se interfaceC39571se, C47G c47g, Integer num) {
        this.A07 = num;
        this.A05 = interfaceC39571se;
        this.A00 = c54m;
        this.A01 = c54m2;
        this.A02 = c54m3;
        this.A03 = c54m4;
        this.A04 = c54m5;
        this.A06 = c47g;
    }
}
