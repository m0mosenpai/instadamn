package X;

/* renamed from: X.2ip, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C56562ip implements InterfaceC56512ik {
    public int A00;
    public int A01;
    public byte[] A02;
    public float[] A03;

    @Override // X.InterfaceC56512ik
    public final /* bridge */ /* synthetic */ Object COt(float f, Object obj, Object obj2) {
        int i;
        C56562ip c56562ip = (C56562ip) obj;
        C56562ip c56562ip2 = (C56562ip) obj2;
        int i2 = this.A00;
        if (i2 == c56562ip.A00 && (i = this.A01) == c56562ip.A01) {
            for (int i3 = 0; i3 < i2; i3++) {
                byte b = this.A02[i3];
                if (b == c56562ip.A02[i3]) {
                    c56562ip2.A02[i3] = b;
                } else {
                    throw new IllegalArgumentException("paths must be equivalent for interpolation");
                }
            }
            c56562ip2.A00 = i2;
            for (int i4 = 0; i4 < i; i4++) {
                float[] fArr = c56562ip2.A03;
                float f2 = c56562ip.A03[i4];
                float f3 = this.A03[i4];
                fArr[i4] = ((f2 - f3) * f) + f3;
            }
            return c56562ip2;
        }
        throw new IllegalArgumentException("paths must be equivalent for interpolation");
    }
}
