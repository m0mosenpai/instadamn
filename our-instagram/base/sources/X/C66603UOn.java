package X;

import java.nio.ByteBuffer;

/* renamed from: X.UOn, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C66603UOn extends AbstractC56612iu implements X98 {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.X98
    public final void ANn(ByteBuffer byteBuffer, int i) {
        String[] strArr;
        int i2 = 0;
        int A01 = WGe.A01(byteBuffer, i, 0);
        if (A01 != 0) {
            i2 = byteBuffer.getInt(A01);
        }
        this.A0M = i2;
        WGe.A05(byteBuffer, i, 1);
        int A012 = WGe.A01(byteBuffer, i, 2);
        if (A012 == 0) {
            strArr = null;
        } else {
            int i3 = byteBuffer.getInt(byteBuffer.getInt(A012) + A012);
            int i4 = A012 + byteBuffer.getInt(A012) + 4;
            strArr = new String[i3];
            for (int i5 = 0; i5 < i3; i5++) {
                int i6 = (i5 * 4) + i4;
                int i7 = byteBuffer.getInt(i6);
                if (i7 != 0) {
                    strArr[i5] = WGe.A04(byteBuffer, i6 + i7);
                }
            }
        }
        this.A0z = strArr;
        this.A0W = (AbstractC56612iu) WGe.A02(C66603UOn.class, byteBuffer, i, 3);
        this.A0x = (AbstractC56612iu[]) WGe.A09(C66603UOn.class, byteBuffer, i, 4);
        int i8 = -1;
        int A013 = WGe.A01(byteBuffer, i, 5);
        if (A013 != 0) {
            i8 = byteBuffer.getInt(A013);
        }
        this.A0N = i8;
        this.A10 = WGe.A08(byteBuffer, i, 6);
        int i9 = -1;
        int A014 = WGe.A01(byteBuffer, i, 7);
        if (A014 != 0) {
            i9 = byteBuffer.getInt(A014);
        }
        this.A0P = i9;
        int A015 = WGe.A01(byteBuffer, i, 8);
        if (A015 != 0) {
            byteBuffer.get(A015);
        }
        this.A04 = WGe.A00(byteBuffer, i, 9);
        float f = 1.0f;
        int A016 = WGe.A01(byteBuffer, i, 10);
        if (A016 != 0) {
            f = byteBuffer.getFloat(A016);
        }
        this.A0E = f;
        this.A07 = WGe.A00(byteBuffer, i, 11);
        this.A0g = (C3LS) WGe.A03(C66606UOq.class, byteBuffer, i, 12);
        this.A0X = (AbstractC1348868e) WGe.A02(C66594UOe.class, byteBuffer, i, 13);
        this.A0I = WGe.A00(byteBuffer, i, 14);
        this.A0p = (C68i) WGe.A02(C66608UOs.class, byteBuffer, i, 15);
        this.A0J = WGe.A00(byteBuffer, i, 16);
        this.A0q = (C68i) WGe.A02(C66608UOs.class, byteBuffer, i, 17);
        this.A0b = (AbstractC1348868e) WGe.A02(C66593UOd.class, byteBuffer, i, 18);
        this.A08 = WGe.A00(byteBuffer, i, 19);
        this.A0k = (C68i) WGe.A02(C66608UOs.class, byteBuffer, i, 20);
        this.A0h = (C3LS) WGe.A03(C66606UOq.class, byteBuffer, i, 21);
        this.A0c = (AbstractC1348868e) WGe.A02(C66594UOe.class, byteBuffer, i, 22);
        float f2 = 1.0f;
        int A017 = WGe.A01(byteBuffer, i, 23);
        if (A017 != 0) {
            f2 = byteBuffer.getFloat(A017);
        }
        this.A06 = f2;
        this.A0j = (C68i) WGe.A02(C66608UOs.class, byteBuffer, i, 24);
        this.A0f = (C56562ip) WGe.A02(C66605UOp.class, byteBuffer, i, 25);
        this.A0a = (AbstractC1348868e) WGe.A02(C66593UOd.class, byteBuffer, i, 26);
        this.A0H = WGe.A00(byteBuffer, i, 27);
        this.A0o = (C68i) WGe.A02(C66608UOs.class, byteBuffer, i, 28);
        this.A0F = WGe.A00(byteBuffer, i, 29);
        this.A0m = (C68i) WGe.A02(C66608UOs.class, byteBuffer, i, 30);
        this.A0G = WGe.A00(byteBuffer, i, 31);
        this.A0n = (C68i) WGe.A02(C66608UOs.class, byteBuffer, i, 32);
        this.A0S = (C56502ij) WGe.A03(C66599UOj.class, byteBuffer, i, 33);
        this.A0Z = (AbstractC1348868e) WGe.A02(C66591UOb.class, byteBuffer, i, 34);
        this.A0V = (AbstractC1348968m) WGe.A02(C66602UOm.class, byteBuffer, i, 35);
        this.A0T = (C56502ij) WGe.A03(C66599UOj.class, byteBuffer, i, 36);
        this.A0d = (AbstractC1348868e) WGe.A02(C66591UOb.class, byteBuffer, i, 37);
        this.A09 = WGe.A00(byteBuffer, i, 38);
        this.A0l = (C68i) WGe.A02(C66608UOs.class, byteBuffer, i, 39);
        byte b = 0;
        int A018 = WGe.A01(byteBuffer, i, 40);
        if (A018 != 0) {
            b = byteBuffer.get(A018);
        }
        this.A00 = b;
        byte b2 = 0;
        int A019 = WGe.A01(byteBuffer, i, 41);
        if (A019 != 0) {
            b2 = byteBuffer.get(A019);
        }
        this.A01 = b2;
        float f3 = -1.0f;
        int A0110 = WGe.A01(byteBuffer, i, 42);
        if (A0110 != 0) {
            f3 = byteBuffer.getFloat(A0110);
        }
        this.A05 = f3;
        this.A0i = (C68i) WGe.A02(C66608UOs.class, byteBuffer, i, 43);
        byte b3 = 0;
        int A0111 = WGe.A01(byteBuffer, i, 44);
        if (A0111 != 0) {
            b3 = byteBuffer.get(A0111);
        }
        this.A03 = b3;
        this.A0e = (C56562ip) WGe.A02(C66605UOp.class, byteBuffer, i, 45);
        this.A0Y = (AbstractC1348868e) WGe.A02(C66593UOd.class, byteBuffer, i, 46);
        boolean z = false;
        int A0112 = WGe.A01(byteBuffer, i, 47);
        if (A0112 != 0 && byteBuffer.get(A0112) == 1) {
            z = true;
        }
        this.A0u = z;
        byte b4 = 0;
        int A0113 = WGe.A01(byteBuffer, i, 48);
        if (A0113 != 0) {
            b4 = byteBuffer.get(A0113);
        }
        this.A02 = b4;
        int i10 = -1;
        int A0114 = WGe.A01(byteBuffer, i, 49);
        if (A0114 != 0) {
            i10 = byteBuffer.getInt(A0114);
        }
        this.A0O = i10;
        int i11 = -1;
        int A0115 = WGe.A01(byteBuffer, i, 50);
        if (A0115 != 0) {
            i11 = byteBuffer.getInt(A0115);
        }
        this.A0L = i11;
        this.A0w = WGe.A07(byteBuffer, i, 51);
        this.A0y = (C68i[]) WGe.A09(C66608UOs.class, byteBuffer, i, 52);
        int i12 = -1;
        int A0116 = WGe.A01(byteBuffer, i, 53);
        if (A0116 != 0) {
            i12 = byteBuffer.getInt(A0116);
        }
        this.A0K = i12;
        this.A0s = WGe.A05(byteBuffer, i, 57);
        WGe.A05(byteBuffer, i, 58);
        this.A0C = WGe.A00(byteBuffer, i, 59);
        this.A0U = (C56502ij) WGe.A03(C66599UOj.class, byteBuffer, i, 60);
        this.A0A = WGe.A00(byteBuffer, i, 61);
        int A0117 = WGe.A01(byteBuffer, i, 62);
        if (A0117 != 0) {
            byteBuffer.getFloat(A0117);
        }
        this.A0D = WGe.A00(byteBuffer, i, 63);
        this.A0B = WGe.A00(byteBuffer, i, 64);
        boolean z2 = false;
        int A0118 = WGe.A01(byteBuffer, i, 65);
        if (A0118 != 0 && byteBuffer.get(A0118) == 1) {
            z2 = true;
        }
        this.A0v = z2;
        this.A0R = (WWS) WGe.A03(WWS.class, byteBuffer, i, 66);
        this.A0r = (AbstractC56602it) WGe.A03(UOv.class, byteBuffer, i, 67);
        boolean z3 = false;
        int A0119 = WGe.A01(byteBuffer, i, 68);
        if (A0119 != 0 && byteBuffer.get(A0119) == 1) {
            z3 = true;
        }
        this.A0t = z3;
        this.A0Q = (WWQ) WGe.A02(WWQ.class, byteBuffer, i, 122);
    }
}
