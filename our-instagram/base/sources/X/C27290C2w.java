package X;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: X.C2w, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27290C2w extends CAT {
    public final float A02 = 1.0f;
    public final Integer A03 = 3;
    public final double A01 = 0.5d;
    public final double A00 = 0.5d;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C27290C2w) {
                C27290C2w c27290C2w = (C27290C2w) obj;
                if (Float.compare(this.A02, c27290C2w.A02) != 0 || !C14360o3.A0K(this.A03, c27290C2w.A03) || Double.compare(this.A01, c27290C2w.A01) != 0 || Double.compare(this.A00, c27290C2w.A00) != 0) {
                }
            }
            return false;
        }
        return true;
    }

    public /* synthetic */ C27290C2w(Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, DefaultConstructorMarker defaultConstructorMarker, double d, double d2, float f, int i, boolean z, boolean z2) {
    }

    public final int hashCode() {
        int A02 = AbstractC25235BEs.A02(this.A02);
        int A00 = AbstractC53644Nnp.A00();
        return (AbstractC28006CWd.A01(this.A00, AbstractC28006CWd.A01(this.A01, (AbstractC25225BEi.A05(A02, A00) + AbstractC167017dG.A0M(this.A03)) * 31)) * 31 * 31 * 31 * 31) + A00;
    }

    public C27290C2w() {
    }
}
