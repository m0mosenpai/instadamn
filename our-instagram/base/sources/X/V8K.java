package X;

/* loaded from: classes11.dex */
public final class V8K extends C1I2 {
    public final /* synthetic */ C5GN A00;

    public V8K(C5GN c5gn) {
        this.A00 = c5gn;
    }

    @Override // X.C1I2
    public final void onScroll(C3FQ c3fq, int i, int i2, int i3, int i4, int i5) {
        C0f9.A0A(878845863, C0f9.A03(529949084));
    }

    @Override // X.C1I2
    public final void onScrollStateChanged(C3FQ c3fq, int i) {
        Integer num;
        int A03 = C0f9.A03(1937596015);
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    num = C05F.A0N;
                } else {
                    num = C05F.A0C;
                }
            } else {
                num = C05F.A00;
            }
        } else {
            num = C05F.A01;
        }
        this.A00.A02.Diz(num);
        C0f9.A0A(961687273, A03);
    }
}
