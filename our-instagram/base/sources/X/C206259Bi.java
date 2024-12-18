package X;

import android.text.Layout;

/* renamed from: X.9Bi, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C206259Bi extends C0T6 {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;

    public static boolean A00(Object obj, int i) {
        if ((obj instanceof C206259Bi) && ((C206259Bi) obj).A00 == i) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:89:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r3) {
        /*
            Method dump skipped, instructions count: 414
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C206259Bi.equals(java.lang.Object):boolean");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00f5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int hashCode() {
        /*
            Method dump skipped, instructions count: 406
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C206259Bi.hashCode():int");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    public final String toString() {
        StringBuilder sb;
        String str;
        Object obj;
        String str2;
        switch (this.A00) {
            case 3:
                sb = new StringBuilder();
                sb.append("GridSponsoredContent(discoverySection=");
                sb.append(this.A02);
                sb.append(", targetPositionGapRules=");
                sb.append(this.A04);
                sb.append(AbstractC111324zv.A00(562));
                Integer num = (Integer) this.A01;
                if (num != null) {
                    str = AbstractC37798GkD.A01(num);
                } else {
                    str = "null";
                }
                sb.append(str);
                sb.append(", pageIndex=");
                obj = this.A03;
                sb.append(obj);
                sb.append(')');
                return sb.toString();
            case 4:
            case 5:
            case 6:
            case 7:
            default:
                return super.toString();
            case 8:
                sb = new StringBuilder();
                sb.append("AudioOverlayUpdates(snippetStartTimeMs=");
                sb.append(this.A03);
                sb.append(MSV.A00(639));
                sb.append(this.A04);
                sb.append(MSV.A00(627));
                sb.append(this.A02);
                str2 = ", delete=";
                sb.append(str2);
                obj = this.A01;
                sb.append(obj);
                sb.append(')');
                return sb.toString();
            case 9:
                sb = new StringBuilder();
                sb.append("NewsfeedLoggingContext(contentId=");
                sb.append(this.A02);
                sb.append(", mentionedUserIds=");
                sb.append(this.A04);
                sb.append(", mentionedContentIds=");
                sb.append(this.A03);
                str2 = AbstractC58317Pt9.A00(150);
                sb.append(str2);
                obj = this.A01;
                sb.append(obj);
                sb.append(')');
                return sb.toString();
        }
    }

    public C206259Bi(int i, Object obj, Object obj2, Object obj3, Object obj4) {
        this.A00 = i;
        this.A03 = obj;
        this.A04 = obj2;
        this.A02 = obj3;
        this.A01 = obj4;
    }

    public C206259Bi(InterfaceC16820sZ interfaceC16820sZ, InterfaceC16660sJ interfaceC16660sJ, InterfaceC16660sJ interfaceC16660sJ2, InterfaceC16660sJ interfaceC16660sJ3) {
        this.A00 = 7;
        C14360o3.A0B(interfaceC16660sJ3, 4);
        this.A02 = interfaceC16820sZ;
        this.A01 = interfaceC16660sJ;
        this.A03 = interfaceC16660sJ2;
        this.A04 = interfaceC16660sJ3;
    }

    public C206259Bi(InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2, InterfaceC16660sJ interfaceC16660sJ, InterfaceC16600sD interfaceC16600sD) {
        this.A00 = 0;
        C14360o3.A0B(interfaceC16820sZ2, 3);
        C14360o3.A0B(interfaceC16600sD, 4);
        this.A04 = interfaceC16660sJ;
        this.A03 = interfaceC16820sZ;
        this.A01 = interfaceC16820sZ2;
        this.A02 = interfaceC16600sD;
    }

    public C206259Bi(InterfaceC75403a7 interfaceC75403a7, EnumC65592xv enumC65592xv, C76623c7 c76623c7, C75113Zb c75113Zb) {
        this.A00 = 6;
        this.A04 = interfaceC75403a7;
        this.A02 = c76623c7;
        this.A03 = c75113Zb;
        this.A01 = enumC65592xv;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C206259Bi(C83403nh c83403nh, C83403nh c83403nh2) {
        this((C50679MYx) null, c83403nh, c83403nh2, (C83403nh) null);
        this.A00 = 2;
    }

    public C206259Bi(C130455uq c130455uq, C671831j c671831j, Integer num, Integer num2, int i) {
        this.A00 = 3;
        num = (i & 4) != 0 ? null : num;
        num2 = (i & 8) != 0 ? -1 : num2;
        this.A00 = 3;
        C14360o3.A0B(c130455uq, 1);
        this.A02 = c130455uq;
        this.A04 = c671831j;
        this.A01 = num;
        this.A03 = num2;
    }

    public C206259Bi(C50679MYx c50679MYx, C83403nh c83403nh, C83403nh c83403nh2, C83403nh c83403nh3) {
        this.A00 = 2;
        this.A03 = c83403nh;
        this.A04 = c83403nh2;
        this.A01 = c83403nh3;
        this.A02 = c50679MYx;
    }

    public C206259Bi(Layout layout, C76623c7 c76623c7, C75113Zb c75113Zb, Integer num) {
        this.A00 = 4;
        this.A04 = c75113Zb;
        this.A02 = layout;
        this.A01 = num;
        this.A03 = c76623c7;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C206259Bi(java.lang.Boolean r9, java.lang.Integer r10, java.lang.Integer r11, java.lang.Integer r12, int r13) {
        /*
            r8 = this;
            r7 = r9
            r6 = r12
            r5 = r11
            r4 = r10
            r3 = 8
            r2 = r8
            r8.A00 = r3
            r0 = r13 & 1
            r1 = 0
            if (r0 == 0) goto Lf
            r4 = r1
        Lf:
            r0 = r13 & 2
            if (r0 == 0) goto L14
            r5 = r1
        L14:
            r0 = r13 & 4
            if (r0 == 0) goto L19
            r6 = r1
        L19:
            r0 = r13 & 8
            if (r0 == 0) goto L1e
            r7 = r1
        L1e:
            r2.<init>(r3, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C206259Bi.<init>(java.lang.Boolean, java.lang.Integer, java.lang.Integer, java.lang.Integer, int):void");
    }

    public C206259Bi(Integer num, Integer num2, Integer num3, Integer num4) {
        this.A00 = 1;
        this.A04 = num;
        this.A03 = num2;
        this.A02 = num3;
        this.A01 = num4;
    }
}
