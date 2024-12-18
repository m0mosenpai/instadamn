package X;

/* renamed from: X.68y, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public class C1349968y implements InterfaceC56512ik {
    public int A00;
    public float[] A01;

    @Override // X.InterfaceC56512ik
    public final /* bridge */ /* synthetic */ Object COt(float f, Object obj, Object obj2) {
        int i;
        float[] fArr;
        C1349968y c1349968y = (C1349968y) obj;
        C1349968y c1349968y2 = (C1349968y) obj2;
        int i2 = this.A00;
        if (i2 == c1349968y.A00) {
            c1349968y2.A00 = i2;
            int i3 = 0;
            while (true) {
                i = this.A00;
                fArr = c1349968y2.A01;
                if (i3 >= i) {
                    break;
                }
                float f2 = c1349968y.A01[i3];
                float f3 = this.A01[i3];
                fArr[i3] = ((f2 - f3) * f) + f3;
                i3++;
            }
            int length = fArr.length;
            if (length > i) {
                while (i < length) {
                    fArr[i] = fArr[i - 1];
                    i++;
                }
            }
            return c1349968y2;
        }
        throw new IllegalArgumentException("cannot interpolate between mismatched lengths");
    }
}
