package X;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: X.C2y, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27292C2y extends CAT {
    public final double A00;
    public final double A01;
    public final float A02;
    public final Integer A03;
    public final Integer A04;
    public final Integer A05;
    public final Integer A06;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C27292C2y() {
        /*
            r15 = this;
            r12 = 0
            r14 = 0
            r1 = 0
            r8 = 0
            r13 = 1023(0x3ff, float:1.434E-42)
            r0 = r15
            r2 = r1
            r3 = r1
            r4 = r1
            r5 = r1
            r6 = r1
            r7 = r1
            r10 = r8
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r10, r12, r13, r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C27292C2y.<init>():void");
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C27292C2y) {
                C27292C2y c27292C2y = (C27292C2y) obj;
                if (Float.compare(this.A02, c27292C2y.A02) != 0 || !C14360o3.A0K(this.A04, c27292C2y.A04) || !C14360o3.A0K(this.A03, c27292C2y.A03) || Double.compare(this.A01, c27292C2y.A01) != 0 || Double.compare(this.A00, c27292C2y.A00) != 0 || !C14360o3.A0K(this.A05, c27292C2y.A05) || !C14360o3.A0K(this.A06, c27292C2y.A06)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC25225BEi.A05((AbstractC28006CWd.A01(this.A00, AbstractC28006CWd.A01(this.A01, (((((AbstractC25235BEs.A02(this.A02) + AbstractC53644Nnp.A00()) * 31) + AbstractC167017dG.A0M(this.A04)) * 31) + AbstractC167017dG.A0M(this.A03)) * 31)) + AbstractC167017dG.A0M(this.A05)) * 31, AbstractC167017dG.A0M(this.A06));
    }

    public /* synthetic */ C27292C2y(Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, DefaultConstructorMarker defaultConstructorMarker, double d, double d2, float f, int i, boolean z) {
        this.A02 = 0.2f;
        this.A04 = 2;
        this.A03 = 1;
        this.A01 = 0.5d;
        this.A00 = 0.5d;
        this.A05 = 2;
        this.A06 = 2;
    }
}
