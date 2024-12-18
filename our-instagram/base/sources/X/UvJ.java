package X;

/* loaded from: classes11.dex */
public final class UvJ extends AbstractC129435t5 {
    public final int A00;
    public final int A01;
    public final int[] A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UvJ(String str, int[] iArr, int i, int i2, int i3, boolean z, boolean z2) {
        super(i, z, z2);
        C14360o3.A0B(iArr, 6);
        this.A00 = i2;
        if (str != null) {
            this.A05.A0B(str);
        }
        this.A02 = iArr;
        this.A01 = i3;
        this.A04.put(i, str);
    }

    @Override // X.AbstractC129435t5
    public final boolean A0H() {
        C14360o3.A0C(this.A04.get(super.A02), "null cannot be cast to non-null type kotlin.String");
        return !C14360o3.A0K(r1, this.A05.A02());
    }
}
