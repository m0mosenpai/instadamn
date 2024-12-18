package X;

/* renamed from: X.87E, reason: invalid class name */
/* loaded from: classes4.dex */
public final /* synthetic */ class C87E extends C06840Yb implements InterfaceC16570sA {
    public static final C87E A00 = new C87E();

    public C87E() {
        super(6, C87F.class, "<init>", "<init>(FFFFF)V", 4);
    }

    @Override // X.InterfaceC16570sA
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        final float floatValue = ((Number) obj).floatValue();
        final float floatValue2 = ((Number) obj2).floatValue();
        final float floatValue3 = ((Number) obj3).floatValue();
        final float floatValue4 = ((Number) obj4).floatValue();
        final float floatValue5 = ((Number) obj5).floatValue();
        return new C0T6(floatValue, floatValue2, floatValue3, floatValue4, floatValue5) { // from class: X.87F
            public final float A00;
            public final float A01;
            public final float A02;
            public final float A03;
            public final float A04;

            public final boolean equals(Object obj7) {
                if (this != obj7) {
                    if (obj7 instanceof C87F) {
                        C87F c87f = (C87F) obj7;
                        if (Float.compare(this.A03, c87f.A03) != 0 || Float.compare(this.A00, c87f.A00) != 0 || Float.compare(this.A04, c87f.A04) != 0 || Float.compare(this.A01, c87f.A01) != 0 || Float.compare(this.A02, c87f.A02) != 0) {
                        }
                    }
                    return false;
                }
                return true;
            }

            public final int hashCode() {
                return (((((((Float.floatToIntBits(this.A03) * 31) + Float.floatToIntBits(this.A00)) * 31) + Float.floatToIntBits(this.A04)) * 31) + Float.floatToIntBits(this.A01)) * 31) + Float.floatToIntBits(this.A02);
            }

            {
                this.A03 = floatValue;
                this.A00 = floatValue2;
                this.A04 = floatValue3;
                this.A01 = floatValue4;
                this.A02 = floatValue5;
            }
        };
    }
}
