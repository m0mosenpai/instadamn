package X;

/* renamed from: X.5gn, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC122525gn {
    public static final C118125Vw A00(C118125Vw c118125Vw, AnonymousClass583 anonymousClass583) {
        int i;
        int i2;
        float f;
        C118125Vw c118125Vw2 = C118125Vw.A03;
        C5W3 c5w3 = c118125Vw.A02;
        C5W2 c5w2 = C5WT.A03;
        C5W2 c5w22 = c5w3.A0C;
        if (c5w22.equals(C5W1.A00)) {
            c5w22 = C5WT.A03;
        }
        long j = c5w3.A01;
        if (AbstractC118155Vz.A02(j)) {
            j = C5WT.A01;
        }
        C5W5 c5w5 = c5w3.A08;
        if (c5w5 == null) {
            c5w5 = C5W5.A04;
        }
        C122165gC c122165gC = c5w3.A06;
        if (c122165gC != null) {
            i = c122165gC.A00;
        } else {
            i = 0;
        }
        C122165gC c122165gC2 = new C122165gC(i);
        C122175gD c122175gD = c5w3.A07;
        if (c122175gD != null) {
            i2 = c122175gD.A00;
        } else {
            i2 = 1;
        }
        C122175gD c122175gD2 = new C122175gD(i2);
        AbstractC119845bi abstractC119845bi = c5w3.A05;
        if (abstractC119845bi == null) {
            abstractC119845bi = AbstractC119845bi.A01;
        }
        String str = c5w3.A0E;
        if (str == null) {
            str = "";
        }
        long j2 = c5w3.A02;
        if (AbstractC118155Vz.A02(j2)) {
            j2 = C5WT.A02;
        }
        C122185gE c122185gE = c5w3.A0A;
        if (c122185gE != null) {
            f = c122185gE.A00;
        } else {
            f = 0.0f;
        }
        C122185gE c122185gE2 = new C122185gE(f);
        C122195gF c122195gF = c5w3.A0D;
        if (c122195gF == null) {
            c122195gF = C122195gF.A02;
        }
        C114095Cv c114095Cv = c5w3.A09;
        if (c114095Cv == null) {
            C114095Cv c114095Cv2 = C114095Cv.A02;
            c114095Cv = AbstractC122545gp.A00.Au7();
        }
        long j3 = c5w3.A00;
        if (j3 == 16) {
            j3 = C5WT.A00;
        }
        C122205gG c122205gG = c5w3.A0B;
        if (c122205gG == null) {
            c122205gG = C122205gG.A02;
        }
        C122215gH c122215gH = c5w3.A03;
        if (c122215gH == null) {
            c122215gH = C122215gH.A03;
        }
        AbstractC119825bg abstractC119825bg = c5w3.A04;
        if (abstractC119825bg == null) {
            abstractC119825bg = C119815bf.A00;
        }
        C122215gH c122215gH2 = c122215gH;
        AbstractC119825bg abstractC119825bg2 = abstractC119825bg;
        AbstractC119845bi abstractC119845bi2 = abstractC119845bi;
        C5W3 c5w32 = new C5W3(c122215gH2, abstractC119825bg2, abstractC119845bi2, c122165gC2, c122175gD2, c5w5, c114095Cv, c122185gE2, c122205gG, c5w22, c122195gF, str, j, j2, j3);
        C5W4 c5w4 = c118125Vw.A00;
        long j4 = C5WX.A00;
        int i3 = c5w4.A02;
        if (i3 == Integer.MIN_VALUE) {
            i3 = 5;
        }
        int i4 = c5w4.A03;
        boolean z = false;
        if (i4 == 3) {
            z = true;
        }
        if (z) {
            int ordinal = anonymousClass583.ordinal();
            if (ordinal != 0) {
                if (ordinal == 1) {
                    i4 = 5;
                } else {
                    throw new RuntimeException();
                }
            } else {
                i4 = 4;
            }
        } else if (i4 == Integer.MIN_VALUE) {
            int ordinal2 = anonymousClass583.ordinal();
            if (ordinal2 != 0) {
                if (ordinal2 == 1) {
                    i4 = 2;
                } else {
                    throw new RuntimeException();
                }
            } else {
                i4 = 1;
            }
        }
        long j5 = c5w4.A04;
        if (AbstractC118155Vz.A02(j5)) {
            j5 = C5WX.A00;
        }
        C122225gI c122225gI = c5w4.A06;
        if (c122225gI == null) {
            c122225gI = C122225gI.A02;
        }
        C118115Vv c118115Vv = c5w4.A05;
        int i5 = c5w4.A01;
        if (i5 == 0) {
            i5 = 66305;
        }
        int i6 = c5w4.A00;
        if (i6 == Integer.MIN_VALUE) {
            i6 = 1;
        }
        C122235gJ c122235gJ = c5w4.A07;
        if (c122235gJ == null) {
            c122235gJ = C122235gJ.A02;
        }
        return new C118125Vw(new C5W4(c118115Vv, c122225gI, c122235gJ, i3, i4, i5, i6, j5), c118125Vw.A01, c5w32);
    }
}
