package X;

import com.instagram.camera.effect.models.CameraAREffect;
import java.util.AbstractCollection;
import java.util.List;

/* loaded from: classes9.dex */
public final class MUG extends C0T6 {
    public Object A00;
    public boolean A01;
    public final int A02;
    public final Object A03;

    public static void A01(Integer num, Object obj, AbstractCollection abstractCollection, int i) {
        abstractCollection.add(new MUG(num, new C50161MDo(obj, i)));
    }

    public static boolean A02(Object obj, int i) {
        if ((obj instanceof MUG) && ((MUG) obj).A02 == i) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:104:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:110:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:116:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:60:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:84:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x015c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r3) {
        /*
            Method dump skipped, instructions count: 482
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.MUG.equals(java.lang.Object):boolean");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0125  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int hashCode() {
        /*
            Method dump skipped, instructions count: 432
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.MUG.hashCode():int");
    }

    public final String toString() {
        if (3 - this.A02 != 0) {
            return super.toString();
        }
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("PivotPageDefaultClipsGridModel(clipsGridItems=");
        A1C.append(this.A03);
        A1C.append(AbstractC43591JPw.A00(228));
        A1C.append(this.A01);
        A1C.append(", emptyGridStatePlaceholderContentRes=");
        return AbstractC167017dG.A0o(this.A00, A1C);
    }

    public static final MUG A00(List list, List list2, boolean z) {
        AbstractC167017dG.A1P(list, list2);
        return new MUG(z, list, list2, 11);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MUG() {
        this((C26016Bf5) null, C6R.A03, false);
        this.A02 = 9;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public MUG(int r4) {
        /*
            r3 = this;
            r3.A02 = r4
            int r4 = 1 - r4
            if (r4 == 0) goto Ld
            r2 = 0
            r1 = 0
            r0 = 7
        L9:
            r3.<init>(r2, r2, r0, r1)
            return
        Ld:
            X.0sl r2 = X.C16930sl.A00
            r1 = 0
            r0 = 1
            goto L9
        */
        throw new UnsupportedOperationException("Method not decompiled: X.MUG.<init>(int):void");
    }

    public MUG(int i, Object obj, Object obj2, boolean z) {
        this.A02 = i;
        this.A03 = obj;
        this.A00 = obj2;
        this.A01 = z;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MUG(C76733cL c76733cL, CharSequence charSequence) {
        this(14, (Object) c76733cL, (Object) charSequence, false);
        this.A02 = 14;
    }

    public MUG(InterfaceC99494dO interfaceC99494dO, C5Hc c5Hc, boolean z) {
        this.A02 = 24;
        C14360o3.A0B(c5Hc, 1);
        this.A03 = c5Hc;
        this.A00 = interfaceC99494dO;
        this.A01 = z;
    }

    public MUG(C5C8 c5c8, C5C8 c5c82, int i) {
        this.A02 = 17;
        c5c82 = (i & 2) != 0 ? c5c8 : c5c82;
        this.A02 = 17;
        C14360o3.A0B(c5c8, 1);
        C14360o3.A0B(c5c82, 2);
        this.A00 = c5c8;
        this.A03 = c5c82;
        this.A01 = false;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MUG(C5QE c5qe, C5QE c5qe2, int i) {
        this((i & 2) != 0 ? MVZ.A00("") : c5qe, (i & 4) != 0 ? MVZ.A00("") : c5qe2, false);
        this.A02 = 10;
    }

    public MUG(C5QE c5qe, C5QE c5qe2, boolean z) {
        this.A02 = 10;
        AbstractC167017dG.A1R(c5qe, c5qe2);
        this.A01 = z;
        this.A03 = c5qe;
        this.A00 = c5qe2;
    }

    public MUG(EnumC193878i8 enumC193878i8, EnumC27379C6i enumC27379C6i, boolean z) {
        this.A02 = 5;
        this.A00 = enumC193878i8;
        this.A03 = enumC27379C6i;
        this.A01 = z;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MUG(C9BO c9bo, C9BO c9bo2) {
        this(c9bo, c9bo2, false);
        this.A02 = 16;
    }

    public MUG(C9BO c9bo, C9BO c9bo2, boolean z) {
        this.A02 = 16;
        this.A03 = c9bo;
        this.A00 = c9bo2;
        this.A01 = z;
    }

    public MUG(C26016Bf5 c26016Bf5, C6R c6r, boolean z) {
        this.A02 = 9;
        this.A01 = z;
        this.A03 = c6r;
        this.A00 = c26016Bf5;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MUG(C38071Gp0 c38071Gp0, OKv oKv) {
        this(c38071Gp0, oKv, false);
        this.A02 = 15;
    }

    public MUG(C38071Gp0 c38071Gp0, OKv oKv, boolean z) {
        this.A02 = 15;
        C14360o3.A0B(oKv, 1);
        this.A03 = oKv;
        this.A00 = c38071Gp0;
        this.A01 = z;
    }

    public MUG(C38688GzT c38688GzT, List list, boolean z) {
        this.A02 = 6;
        this.A01 = z;
        this.A00 = c38688GzT;
        this.A03 = list;
    }

    public MUG(C51759Mti c51759Mti, Integer num, boolean z) {
        this.A02 = 19;
        C14360o3.A0B(c51759Mti, 1);
        this.A00 = c51759Mti;
        this.A01 = z;
        this.A03 = num;
    }

    public MUG(C56803PIu c56803PIu, Integer num) {
        this.A02 = 21;
        this.A02 = 21;
        this.A03 = c56803PIu;
        this.A01 = false;
        this.A00 = num;
    }

    public MUG(EnumC61149RgA enumC61149RgA) {
        this.A02 = 0;
        EnumC61149RgA enumC61149RgA2 = EnumC61149RgA.A03;
        this.A02 = 0;
        this.A03 = enumC61149RgA;
        this.A00 = enumC61149RgA2;
        this.A01 = false;
    }

    public MUG(C69749Vuj c69749Vuj, List list, int i, boolean z) {
        this.A02 = i;
        if (3 - i != 0) {
            C14360o3.A0B(list, 1);
        }
        this.A03 = list;
        this.A01 = z;
        this.A00 = c69749Vuj;
    }

    public MUG(CameraAREffect cameraAREffect, EnumC1810181d enumC1810181d, boolean z) {
        this.A02 = 22;
        C14360o3.A0B(enumC1810181d, 2);
        this.A01 = z;
        this.A03 = enumC1810181d;
        this.A00 = cameraAREffect;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MUG(Integer num, InterfaceC16820sZ interfaceC16820sZ) {
        this(num, interfaceC16820sZ, true);
        this.A02 = 8;
    }

    public MUG(Integer num, InterfaceC16820sZ interfaceC16820sZ, boolean z) {
        this.A02 = 8;
        this.A03 = num;
        this.A01 = z;
        this.A00 = interfaceC16820sZ;
    }

    public MUG(Integer num, List list, boolean z) {
        this.A02 = 20;
        this.A00 = list;
        this.A03 = num;
        this.A01 = z;
    }

    public MUG(List list, List list2, int i, boolean z) {
        this.A02 = i;
        switch (i) {
            case 1:
            case 23:
                AbstractC167017dG.A1P(list, list2);
                this.A03 = list;
                this.A00 = list2;
                break;
            case 7:
                this.A00 = list;
                this.A03 = list2;
                break;
            default:
                C14360o3.A0B(list, 1);
                this.A03 = list;
                this.A00 = list2;
                break;
        }
        this.A01 = z;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public MUG(java.util.List r4, java.util.List r5, kotlin.jvm.internal.DefaultConstructorMarker r6, int r7, int r8, boolean r9) {
        /*
            r3 = this;
            r2 = 2
            r3.A02 = r2
            X.0sl r1 = X.C16930sl.A00
            r0 = 0
            r3.<init>(r1, r0, r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.MUG.<init>(java.util.List, java.util.List, kotlin.jvm.internal.DefaultConstructorMarker, int, int, boolean):void");
    }

    public MUG(List list, java.util.Set set, boolean z) {
        this.A02 = 12;
        this.A00 = set;
        this.A03 = list;
        this.A01 = z;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MUG(List list, boolean z) {
        this((C69749Vuj) null, list, 3, z);
        this.A02 = 3;
    }

    public MUG(List list, boolean z, List list2, int i) {
        this.A02 = 2;
        C14360o3.A0B(list, 1);
        this.A00 = list;
        this.A01 = z;
        this.A03 = list2;
    }

    public MUG(boolean z, List list, List list2, int i) {
        this.A02 = 11;
        this.A01 = z;
        this.A00 = list;
        this.A03 = list2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public MUG(boolean r4, java.util.List r5, java.util.List r6, int r7, kotlin.jvm.internal.DefaultConstructorMarker r8, int r9) {
        /*
            r3 = this;
            r2 = 11
            r3.A02 = r2
            r1 = 0
            X.0sl r0 = X.C16930sl.A00
            r3.<init>(r1, r0, r0, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.MUG.<init>(boolean, java.util.List, java.util.List, int, kotlin.jvm.internal.DefaultConstructorMarker, int):void");
    }
}
