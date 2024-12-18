package X;

/* renamed from: X.Ab2, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23487Ab2 implements C4X1 {
    @Override // X.C4X1
    public final float BWk(C441321v c441321v, float f, int i) {
        int i2 = c441321v.A0A;
        int i3 = i - i2;
        boolean z = false;
        if (Math.abs(i3) <= c441321v.A0B) {
            z = true;
        }
        if (z) {
            return 1.0f;
        }
        if (i3 >= c441321v.A09 || i2 - i >= c441321v.A08) {
            if (i > i2) {
                return ((float) c441321v.A03) + 1.0f;
            }
            return 1.0f - ((float) c441321v.A04);
        }
        return f;
    }
}
