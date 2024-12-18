package X;

import com.instagram.common.typedurl.ImageUrl;
import java.util.HashSet;

/* renamed from: X.9C3, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9C3 extends C0T6 {
    public Object A00;
    public String A01;
    public boolean A02;
    public final int A03;
    public final Object A04;

    public C9C3(C206209Bd c206209Bd, ImageUrl imageUrl, String str, boolean z) {
        this.A03 = 3;
        this.A02 = z;
        this.A04 = imageUrl;
        this.A01 = str;
        this.A00 = c206209Bd;
    }

    public static boolean A00(Object obj, int i) {
        if ((obj instanceof C9C3) && ((C9C3) obj).A03 == i) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r3) {
        /*
            Method dump skipped, instructions count: 270
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C9C3.equals(java.lang.Object):boolean");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int i;
        int i2;
        int i3;
        int hashCode3;
        int i4;
        Object obj;
        int hashCode4;
        int hashCode5;
        switch (this.A03) {
            case 0:
                String str = this.A01;
                int i5 = 0;
                if (str == null) {
                    hashCode = 0;
                } else {
                    hashCode = str.hashCode();
                }
                int i6 = hashCode * 31;
                Object obj2 = this.A04;
                if (obj2 == null) {
                    hashCode2 = 0;
                } else {
                    hashCode2 = obj2.hashCode();
                }
                int i7 = (i6 + hashCode2) * 31;
                Object obj3 = this.A00;
                if (obj3 != null) {
                    i5 = obj3.hashCode();
                }
                i = (i7 + i5) * 31;
                i2 = 1237;
                if (this.A02) {
                    i2 = 1231;
                }
                return i2 + i;
            case 1:
                int i8 = 1237;
                if (this.A02) {
                    i8 = 1231;
                }
                int i9 = i8 * 31;
                String str2 = this.A01;
                i3 = 0;
                if (str2 == null) {
                    hashCode3 = 0;
                } else {
                    hashCode3 = str2.hashCode();
                }
                i4 = (i9 + hashCode3) * 31;
                Object obj4 = this.A04;
                if (obj4 != null) {
                    i3 = obj4.hashCode();
                }
                i = (i4 + i3) * 31;
                obj = this.A00;
                i2 = obj.hashCode();
                return i2 + i;
            case 2:
                int hashCode6 = this.A01.hashCode() * 31;
                int i10 = 1237;
                if (this.A02) {
                    i10 = 1231;
                }
                i3 = (hashCode6 + i10) * 31;
                i4 = this.A04.hashCode();
                i = (i4 + i3) * 31;
                obj = this.A00;
                i2 = obj.hashCode();
                return i2 + i;
            case 3:
                int i11 = 1237;
                if (this.A02) {
                    i11 = 1231;
                }
                int i12 = i11 * 31;
                Object obj5 = this.A04;
                if (obj5 == null) {
                    hashCode4 = 0;
                } else {
                    hashCode4 = obj5.hashCode();
                }
                i3 = (i12 + hashCode4) * 31;
                i4 = this.A01.hashCode();
                i = (i4 + i3) * 31;
                obj = this.A00;
                i2 = obj.hashCode();
                return i2 + i;
            case 4:
                Object obj6 = this.A00;
                i = 0;
                if (obj6 == null) {
                    hashCode5 = 0;
                } else {
                    hashCode5 = obj6.hashCode();
                }
                int i13 = hashCode5 * 31;
                int i14 = 1237;
                if (this.A02) {
                    i14 = 1231;
                }
                i2 = (i13 + i14) * 31;
                String str3 = this.A01;
                if (str3 != null) {
                    i = str3.hashCode();
                }
                return i2 + i;
            case 5:
            default:
                return super.hashCode();
            case 6:
                int hashCode7 = ((this.A00.hashCode() * 31) + this.A01.hashCode()) * 31;
                int i15 = 1237;
                if (this.A02) {
                    i15 = 1231;
                }
                i = (hashCode7 + i15) * 31;
                obj = this.A04;
                i2 = obj.hashCode();
                return i2 + i;
        }
    }

    public final String toString() {
        if (6 - this.A03 != 0) {
            return super.toString();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Interrupt(event=");
        sb.append(this.A00);
        sb.append(", reason=");
        sb.append(this.A01);
        sb.append(", preventSuccess=");
        sb.append(this.A02);
        sb.append(", trigger=");
        sb.append(this.A04);
        sb.append(')');
        return sb.toString();
    }

    public C9C3(C206259Bi c206259Bi, C75113Zb c75113Zb, String str, boolean z) {
        this.A03 = 2;
        this.A01 = str;
        this.A02 = z;
        this.A04 = c75113Zb;
        this.A00 = c206259Bi;
    }

    public C9C3(C1KP c1kp, String str, boolean z) {
        C1KP c1kp2;
        this.A03 = 6;
        if (!(c1kp instanceof C93714Jb) && !(c1kp instanceof C54H) && (c1kp instanceof C1KR)) {
            c1kp2 = ((C1KR) c1kp).A00;
        } else {
            c1kp2 = c1kp;
        }
        this.A03 = 6;
        this.A00 = c1kp;
        this.A01 = str;
        this.A02 = z;
        this.A04 = c1kp2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C9C3(java.lang.Long r9, java.lang.Long r10, java.lang.String r11, int r12) {
        /*
            r8 = this;
            r4 = r10
            r3 = r9
            r6 = 0
            r2 = r8
            r8.A03 = r6
            r0 = r12 & 2
            r1 = 0
            if (r0 == 0) goto Lc
            r3 = r1
        Lc:
            r0 = r12 & 4
            if (r0 == 0) goto L11
            r4 = r1
        L11:
            r5 = r11
            r7 = r6
            r2.<init>(r3, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C9C3.<init>(java.lang.Long, java.lang.Long, java.lang.String, int):void");
    }

    public C9C3(Object obj, Object obj2, String str, int i, boolean z) {
        this.A03 = i;
        this.A04 = obj;
        this.A02 = z;
        this.A00 = obj2;
        this.A01 = str;
    }

    public C9C3() {
        this.A03 = 4;
        this.A03 = 4;
        this.A00 = null;
        this.A02 = false;
        this.A01 = null;
        this.A04 = new HashSet();
    }
}
