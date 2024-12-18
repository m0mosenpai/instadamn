package X;

import android.opengl.GLES30;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: classes4.dex */
public final class AZB implements InterfaceC179087xK, InterfaceC179117xN, BER {
    public C199468rn A00;
    public C179107xM A01;
    public C178907x2 A02;
    public InterfaceC179037xF A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public int A07;
    public int A08;
    public int A09;
    public int A0A;
    public boolean A0B;
    public final C178747wm A0C;
    public final Map A0F = new TreeMap(new C9J7(3));
    public final Map A0E = AbstractC166987dD.A1G();
    public final C179427xs[] A0G = new C179427xs[2];
    public final C22981ABg A0D = new C22981ABg(this);

    @Override // X.InterfaceC179077xJ
    public final /* synthetic */ InterfaceC179467xw EGc(InterfaceC179467xw interfaceC179467xw, InterfaceC179437xt interfaceC179437xt, InterfaceC179037xF interfaceC179037xF, Long l) {
        return interfaceC179467xw;
    }

    @Override // X.InterfaceC179077xJ
    public final void FBm(int i, int i2, int i3, boolean z, int i4, int i5) {
        this.A08 = i2;
        this.A07 = i3;
        this.A0A = i4;
        this.A09 = i5;
        this.A0B = true;
        Iterator A16 = AbstractC166997dE.A16(this.A0F);
        while (A16.hasNext()) {
            ((InterfaceC179077xJ) A16.next()).FBm(i, i2, i3, z, i4, i5);
        }
        C179107xM c179107xM = this.A01;
        if (c179107xM != null) {
            c179107xM.FBm(i, i2, i3, z, i4, i5);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.RuntimeException, X.B4J] */
    private InterfaceC179467xw A00(InterfaceC179467xw interfaceC179467xw, InterfaceC179077xJ interfaceC179077xJ, InterfaceC179037xF interfaceC179037xF, Long l, boolean z) {
        InterfaceC179437xt interfaceC179437xt;
        try {
            AbstractC1808580n.A03("CompositeMediaGraph.renderMediaGraph");
            if (interfaceC179467xw == null) {
                interfaceC179467xw = (InterfaceC179467xw) interfaceC179037xF.BHy(interfaceC179077xJ.AwF());
            }
            if (z && interfaceC179037xF.B9y(0) == 1) {
                List B9z = interfaceC179037xF.B9z(0);
                synchronized (B9z) {
                    interfaceC179437xt = (InterfaceC179437xt) B9z.get(0);
                }
                if (interfaceC179437xt != null) {
                    C22981ABg c22981ABg = this.A0D;
                    c22981ABg.A00 = interfaceC179467xw.C8d();
                    interfaceC179437xt.EZs(c22981ABg);
                }
            } else {
                interfaceC179437xt = null;
            }
            interfaceC179467xw = interfaceC179077xJ.EGc(interfaceC179467xw, interfaceC179437xt, interfaceC179037xF, l);
            if (z && interfaceC179437xt != null) {
                interfaceC179437xt.EZs(null);
            }
        } finally {
            try {
                return interfaceC179467xw;
            } finally {
            }
        }
        return interfaceC179467xw;
    }

    public final void A01(EnumC222969sb enumC222969sb, InterfaceC179077xJ interfaceC179077xJ) {
        this.A0F.put(enumC222969sb, interfaceC179077xJ);
        if (this.A0B) {
            interfaceC179077xJ.FBm(0, this.A08, this.A07, false, this.A0A, this.A09);
        }
    }

    @Override // X.BER
    public final void A8K(C23504AbK c23504AbK) {
        InterfaceC179077xJ interfaceC179077xJ = c23504AbK.A01;
        interfaceC179077xJ.FBm(0, this.A08, this.A07, false, this.A0A, this.A09);
        EnumC222969sb enumC222969sb = c23504AbK.A00;
        EnumC222969sb enumC222969sb2 = EnumC222969sb.A06;
        Map map = this.A0F;
        if (enumC222969sb != enumC222969sb2) {
            map.put(enumC222969sb, interfaceC179077xJ);
        } else {
            map.put(enumC222969sb2, interfaceC179077xJ);
        }
    }

    @Override // X.InterfaceC179087xK
    public final void ACv(InterfaceC180227zC interfaceC180227zC) {
        Iterator A16 = AbstractC166997dE.A16(this.A0F);
        while (A16.hasNext()) {
            ((InterfaceC179087xK) A16.next()).ACv(interfaceC180227zC);
        }
        C179107xM c179107xM = this.A01;
        if (c179107xM != null) {
            c179107xM.ACv(interfaceC180227zC);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    @Override // X.InterfaceC179077xJ
    public final int AlT() {
        boolean A1W = AbstractC167007dF.A1W(this.A01);
        Iterator A16 = AbstractC166997dE.A16(this.A0F);
        ?? r2 = A1W;
        while (A16.hasNext()) {
            r2 |= ((InterfaceC179077xJ) A16.next()).AlT();
        }
        return r2;
    }

    @Override // X.InterfaceC179077xJ
    public final /* synthetic */ int AwF() {
        return 0;
    }

    @Override // X.InterfaceC179077xJ
    public final boolean CLu() {
        Iterator A16 = AbstractC166997dE.A16(this.A0F);
        while (A16.hasNext()) {
            if (((InterfaceC179077xJ) A16.next()).CLu()) {
                return true;
            }
        }
        C179107xM c179107xM = this.A01;
        if (c179107xM != null && c179107xM.CLu()) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC179087xK
    public final void CNk(C178907x2 c178907x2) {
        this.A02 = c178907x2;
        Iterator A16 = AbstractC166997dE.A16(this.A0F);
        while (A16.hasNext()) {
            ((InterfaceC179087xK) A16.next()).CNk(c178907x2);
        }
        C179107xM c179107xM = this.A01;
        if (c179107xM != null) {
            c179107xM.CNk(c178907x2);
        }
    }

    @Override // X.InterfaceC179077xJ
    public final /* synthetic */ boolean Cbr() {
        return false;
    }

    @Override // X.InterfaceC179117xN
    public final void E6I(InterfaceC179247xa interfaceC179247xa, InterfaceC179577y7 interfaceC179577y7) {
        C179107xM c179107xM = this.A01;
        if (c179107xM != null) {
            C179107xM.A05(c179107xM, interfaceC179247xa, interfaceC179577y7);
        }
    }

    @Override // X.BER
    public final void EFD(C23504AbK c23504AbK) {
        this.A0F.remove(c23504AbK.A00);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x00f4, code lost:
    
        if (r22.A03 != null) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0102, code lost:
    
        if (r7.size() != r22.A0E.size()) goto L69;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 15, insn: 0x0259: IGET (r2 I:X.7x2) = (r15 I:X.AZB) A[Catch: all -> 0x0269, TRY_ENTER] (LINE:601) X.AZB.A02 X.7x2, block:B:150:0x0259 */
    /* JADX WARN: Removed duplicated region for block: B:25:0x022e A[Catch: all -> 0x0258, LOOP:0: B:23:0x0228->B:25:0x022e, LOOP_END, TryCatch #0 {all -> 0x0258, blocks: (B:3:0x0002, B:5:0x000e, B:7:0x001a, B:8:0x001f, B:10:0x0025, B:12:0x002b, B:14:0x00ea, B:16:0x00ee, B:18:0x00f2, B:20:0x00f6, B:22:0x0224, B:23:0x0228, B:25:0x022e, B:27:0x024b, B:29:0x024f, B:33:0x0104, B:34:0x0115, B:37:0x010c, B:41:0x0126, B:42:0x012a, B:44:0x0130, B:46:0x0222, B:47:0x0220, B:48:0x013e, B:49:0x0154, B:52:0x015b, B:54:0x0161, B:56:0x0177, B:59:0x017a, B:60:0x0183, B:64:0x01e7, B:65:0x01ef, B:67:0x01f2, B:68:0x018c, B:70:0x0193, B:72:0x0197, B:74:0x01bb, B:76:0x01fe, B:78:0x0202, B:80:0x0035, B:81:0x003d, B:83:0x0043, B:86:0x004b, B:89:0x0051, B:95:0x0054, B:97:0x0058, B:99:0x005e, B:100:0x0060, B:101:0x0067, B:103:0x006d, B:106:0x0075, B:110:0x0081, B:113:0x0087, B:117:0x009d, B:120:0x00ab, B:123:0x00b1, B:136:0x00bb, B:137:0x00c1, B:139:0x00c5, B:141:0x00cb, B:144:0x00d0, B:147:0x00e0), top: B:2:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x024f A[Catch: all -> 0x0258, TRY_LEAVE, TryCatch #0 {all -> 0x0258, blocks: (B:3:0x0002, B:5:0x000e, B:7:0x001a, B:8:0x001f, B:10:0x0025, B:12:0x002b, B:14:0x00ea, B:16:0x00ee, B:18:0x00f2, B:20:0x00f6, B:22:0x0224, B:23:0x0228, B:25:0x022e, B:27:0x024b, B:29:0x024f, B:33:0x0104, B:34:0x0115, B:37:0x010c, B:41:0x0126, B:42:0x012a, B:44:0x0130, B:46:0x0222, B:47:0x0220, B:48:0x013e, B:49:0x0154, B:52:0x015b, B:54:0x0161, B:56:0x0177, B:59:0x017a, B:60:0x0183, B:64:0x01e7, B:65:0x01ef, B:67:0x01f2, B:68:0x018c, B:70:0x0193, B:72:0x0197, B:74:0x01bb, B:76:0x01fe, B:78:0x0202, B:80:0x0035, B:81:0x003d, B:83:0x0043, B:86:0x004b, B:89:0x0051, B:95:0x0054, B:97:0x0058, B:99:0x005e, B:100:0x0060, B:101:0x0067, B:103:0x006d, B:106:0x0075, B:110:0x0081, B:113:0x0087, B:117:0x009d, B:120:0x00ab, B:123:0x00b1, B:136:0x00bb, B:137:0x00c1, B:139:0x00c5, B:141:0x00cb, B:144:0x00d0, B:147:0x00e0), top: B:2:0x0002 }] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.RuntimeException, X.B4J] */
    /* JADX WARN: Type inference failed for: r15v0, types: [X.AZB] */
    @Override // X.InterfaceC179077xJ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void EGd(X.InterfaceC179037xF r23, java.lang.Long r24) {
        /*
            Method dump skipped, instructions count: 622
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AZB.EGd(X.7xF, java.lang.Long):void");
    }

    @Override // X.BER
    public final void EZt(InterfaceC25162BBi interfaceC25162BBi) {
        this.A0D.A01 = interfaceC25162BBi;
    }

    @Override // X.InterfaceC179077xJ
    public final void FDL(int i, Object obj) {
        Iterator A16 = AbstractC166997dE.A16(this.A0F);
        while (A16.hasNext()) {
            ((InterfaceC179077xJ) A16.next()).FDL(i, obj);
        }
        C179107xM c179107xM = this.A01;
        if (c179107xM != null) {
            c179107xM.FDL(i, obj);
        }
    }

    @Override // X.InterfaceC179087xK
    public final void detach() {
        Iterator A16 = AbstractC166997dE.A16(this.A0F);
        while (A16.hasNext()) {
            ((InterfaceC179087xK) A16.next()).detach();
        }
        C179107xM c179107xM = this.A01;
        if (c179107xM != null) {
            c179107xM.detach();
        }
        C22981ABg c22981ABg = this.A0D;
        Long l = c22981ABg.A02;
        if (l != null) {
            GLES30.glDeleteSync(l.longValue());
            c22981ABg.A02 = null;
        }
    }

    @Override // X.InterfaceC179087xK
    public final void release() {
        Iterator A16 = AbstractC166997dE.A16(this.A0F);
        while (A16.hasNext()) {
            ((InterfaceC179087xK) A16.next()).release();
        }
        C179107xM c179107xM = this.A01;
        if (c179107xM != null) {
            c179107xM.release();
        }
    }

    public AZB(C178747wm c178747wm) {
        this.A0C = c178747wm;
    }

    @Override // X.InterfaceC179117xN
    public final void E6H(InterfaceC179247xa interfaceC179247xa) {
        EnumC179217xX CBM = interfaceC179247xa.CBM();
        if (CBM != EnumC179217xX.A07 && CBM != EnumC179217xX.A0m) {
            C179107xM c179107xM = this.A01;
            if (c179107xM != null) {
                C179107xM.A05(c179107xM, interfaceC179247xa, null);
                return;
            }
            return;
        }
        Iterator A16 = AbstractC166997dE.A16(this.A0F);
        while (A16.hasNext()) {
            InterfaceC179077xJ interfaceC179077xJ = (InterfaceC179077xJ) A16.next();
            if (interfaceC179077xJ instanceof InterfaceC179117xN) {
                ((InterfaceC179117xN) interfaceC179077xJ).E6H(interfaceC179247xa);
            }
        }
    }
}
