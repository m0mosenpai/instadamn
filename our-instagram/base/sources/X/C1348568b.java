package X;

import java.nio.ByteBuffer;

/* renamed from: X.68b, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1348568b extends AbstractC56612iu implements C68Y {
    public byte[] A00;
    public C1349068n[] A01;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C68Y
    public final void ANn(ByteBuffer byteBuffer, int i) {
        C56502ij c56502ij;
        AbstractC56602it abstractC56602it;
        int i2 = 0;
        int A00 = AbstractC1348468a.A00(byteBuffer, i, 0);
        if (A00 != 0) {
            i2 = byteBuffer.getInt(A00);
        }
        this.A0M = i2;
        this.A0x = (AbstractC56612iu[]) AbstractC1348468a.A06(C1348568b.class, byteBuffer, i, 1);
        float f = 0.0f;
        int A002 = AbstractC1348468a.A00(byteBuffer, i, 2);
        if (A002 != 0) {
            f = byteBuffer.getFloat(A002);
        }
        this.A04 = f;
        float f2 = 1.0f;
        int A003 = AbstractC1348468a.A00(byteBuffer, i, 3);
        if (A003 != 0) {
            f2 = byteBuffer.getFloat(A003);
        }
        this.A0E = f2;
        AbstractC1348768d abstractC1348768d = (AbstractC1348768d) AbstractC1348468a.A01(C1348668c.class, byteBuffer, i, 4);
        if (abstractC1348768d != null) {
            this.A0g = (C3LS) abstractC1348768d.A00;
            if (((AbstractC1348868e) abstractC1348768d).A00 != null) {
                this.A0X = abstractC1348768d;
            }
        }
        C68h c68h = (C68h) AbstractC1348468a.A01(C68h.class, byteBuffer, i, 5);
        if (c68h != null) {
            float f3 = c68h.A00;
            if (f3 == -1.0f) {
                f3 = 0.0f;
            }
            this.A0I = f3;
            if (((C68i) c68h).A00 != null) {
                this.A0p = c68h;
            }
        }
        C68h c68h2 = (C68h) AbstractC1348468a.A01(C68h.class, byteBuffer, i, 6);
        if (c68h2 != null) {
            float f4 = c68h2.A00;
            if (f4 == -1.0f) {
                f4 = 0.0f;
            }
            this.A0J = f4;
            if (((C68i) c68h2).A00 != null) {
                this.A0q = c68h2;
            }
        }
        C68h c68h3 = (C68h) AbstractC1348468a.A01(C68h.class, byteBuffer, i, 7);
        if (c68h3 != null) {
            float f5 = c68h3.A00;
            if (f5 == -1.0f) {
                f5 = 0.0f;
            }
            this.A08 = f5;
            if (((C68i) c68h3).A00 != null) {
                this.A0k = c68h3;
            }
        }
        AbstractC1348768d abstractC1348768d2 = (AbstractC1348768d) AbstractC1348468a.A01(C1348668c.class, byteBuffer, i, 8);
        if (abstractC1348768d2 != null) {
            this.A0h = (C3LS) abstractC1348768d2.A00;
            if (((AbstractC1348868e) abstractC1348768d2).A00 != null) {
                this.A0c = abstractC1348768d2;
            }
        }
        AbstractC1348768d abstractC1348768d3 = (AbstractC1348768d) AbstractC1348468a.A01(C68j.class, byteBuffer, i, 9);
        if (abstractC1348768d3 != null) {
            this.A0f = (C56562ip) abstractC1348768d3.A00;
            if (((AbstractC1348868e) abstractC1348768d3).A00 != null) {
                this.A0a = abstractC1348768d3;
            }
        }
        C68h c68h4 = (C68h) AbstractC1348468a.A01(C68h.class, byteBuffer, i, 10);
        if (c68h4 != null) {
            float f6 = c68h4.A00;
            if (f6 == -1.0f) {
                f6 = 0.0f;
            }
            this.A06 = f6;
            if (((C68i) c68h4).A00 != null) {
                this.A0j = c68h4;
            }
        } else {
            this.A06 = 1.0f;
        }
        AbstractC1348768d abstractC1348768d4 = (AbstractC1348768d) AbstractC1348468a.A01(C68k.class, byteBuffer, i, 11);
        if (abstractC1348768d4 != null) {
            this.A0S = (C56502ij) abstractC1348768d4.A00;
            if (((AbstractC1348868e) abstractC1348768d4).A00 != null) {
                this.A0Z = abstractC1348768d4;
            }
        }
        AbstractC1348768d abstractC1348768d5 = (AbstractC1348768d) AbstractC1348468a.A01(C68k.class, byteBuffer, i, 12);
        if (abstractC1348768d5 != null) {
            this.A0T = (C56502ij) abstractC1348768d5.A00;
            if (((AbstractC1348868e) abstractC1348768d5).A00 != null) {
                this.A0d = abstractC1348768d5;
            }
        }
        C68h c68h5 = (C68h) AbstractC1348468a.A01(C68h.class, byteBuffer, i, 13);
        if (c68h5 != null) {
            float f7 = c68h5.A00;
            if (f7 == -1.0f) {
                f7 = 0.0f;
            }
            this.A09 = f7;
            if (((C68i) c68h5).A00 != null) {
                this.A0l = c68h5;
            }
        }
        byte b = 0;
        int A004 = AbstractC1348468a.A00(byteBuffer, i, 14);
        if (A004 != 0) {
            b = byteBuffer.get(A004);
        }
        super.A00 = b;
        this.A0V = (AbstractC1348968m) AbstractC1348468a.A01(C68l.class, byteBuffer, i, 15);
        byte b2 = 0;
        int A005 = AbstractC1348468a.A00(byteBuffer, i, 16);
        if (A005 != 0) {
            b2 = byteBuffer.get(A005);
        }
        super.A01 = b2;
        C68h c68h6 = (C68h) AbstractC1348468a.A01(C68h.class, byteBuffer, i, 17);
        if (c68h6 != null) {
            this.A05 = c68h6.A00;
            if (((C68i) c68h6).A00 != null) {
                this.A0i = c68h6;
            }
        } else {
            this.A05 = -1.0f;
        }
        int i3 = -1;
        int A006 = AbstractC1348468a.A00(byteBuffer, i, 18);
        if (A006 != 0) {
            i3 = byteBuffer.getInt(A006);
        }
        this.A0L = i3;
        this.A0K = -1;
        int i4 = -1;
        int A007 = AbstractC1348468a.A00(byteBuffer, i, 19);
        if (A007 != 0) {
            i4 = byteBuffer.getInt(A007);
        }
        this.A0N = i4;
        this.A01 = (C1349068n[]) AbstractC1348468a.A06(C1349068n.class, byteBuffer, i, 20);
        float f8 = 0.0f;
        int A008 = AbstractC1348468a.A00(byteBuffer, i, 21);
        if (A008 != 0) {
            f8 = byteBuffer.getFloat(A008);
        }
        this.A07 = f8;
        AbstractC1348768d abstractC1348768d6 = (AbstractC1348768d) AbstractC1348468a.A01(C68j.class, byteBuffer, i, 22);
        if (abstractC1348768d6 != null) {
            this.A0e = (C56562ip) abstractC1348768d6.A00;
            if (((AbstractC1348868e) abstractC1348768d6).A00 != null) {
                this.A0Y = abstractC1348768d6;
            }
        }
        this.A0b = (AbstractC1348868e) AbstractC1348468a.A01(C68j.class, byteBuffer, i, 23);
        boolean z = false;
        int A009 = AbstractC1348468a.A00(byteBuffer, i, 24);
        if (A009 != 0 && byteBuffer.get(A009) == 1) {
            z = true;
        }
        this.A0u = z;
        byte b3 = 0;
        int A0010 = AbstractC1348468a.A00(byteBuffer, i, 25);
        if (A0010 != 0) {
            b3 = byteBuffer.get(A0010);
        }
        this.A02 = b3;
        byte b4 = 0;
        int A0011 = AbstractC1348468a.A00(byteBuffer, i, 26);
        if (A0011 != 0) {
            b4 = byteBuffer.get(A0011);
        }
        this.A03 = b4;
        this.A0t = true;
        this.A0s = AbstractC1348468a.A03(byteBuffer, i, 27);
        AbstractC1348468a.A03(byteBuffer, i, 28);
        float f9 = 0.0f;
        int A0012 = AbstractC1348468a.A00(byteBuffer, i, 29);
        if (A0012 != 0) {
            f9 = byteBuffer.getFloat(A0012);
        }
        this.A0C = f9;
        int A0013 = AbstractC1348468a.A00(byteBuffer, i, 30);
        if (A0013 != 0) {
            C68Y c68y = (C68Y) C68o.class.newInstance();
            c68y.ANn(byteBuffer, A0013);
            c56502ij = c68y;
        } else {
            c56502ij = null;
        }
        this.A0U = c56502ij;
        float f10 = 0.0f;
        int A0014 = AbstractC1348468a.A00(byteBuffer, i, 31);
        if (A0014 != 0) {
            f10 = byteBuffer.getFloat(A0014);
        }
        this.A0A = f10;
        int A0015 = AbstractC1348468a.A00(byteBuffer, i, 32);
        if (A0015 != 0) {
            byteBuffer.getFloat(A0015);
        }
        float f11 = 0.0f;
        int A0016 = AbstractC1348468a.A00(byteBuffer, i, 33);
        if (A0016 != 0) {
            f11 = byteBuffer.getFloat(A0016);
        }
        this.A0D = f11;
        float f12 = 0.0f;
        int A0017 = AbstractC1348468a.A00(byteBuffer, i, 34);
        if (A0017 != 0) {
            f12 = byteBuffer.getFloat(A0017);
        }
        this.A0B = f12;
        boolean z2 = false;
        int A0018 = AbstractC1348468a.A00(byteBuffer, i, 35);
        if (A0018 != 0 && byteBuffer.get(A0018) == 1) {
            z2 = true;
        }
        this.A0v = z2;
        int A0019 = AbstractC1348468a.A00(byteBuffer, i, 37);
        if (A0019 != 0) {
            C68Y c68y2 = (C68Y) C68Z.class.newInstance();
            c68y2.ANn(byteBuffer, A0019);
            abstractC56602it = c68y2;
        } else {
            abstractC56602it = null;
        }
        this.A0r = abstractC56602it;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0162, code lost:
    
        if (r2.equals("Sound") == false) goto L11;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:9:0x0031. Please report as an issue. */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A01(X.C68W r15, X.C68X r16, java.lang.String[] r17) {
        /*
            Method dump skipped, instructions count: 590
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1348568b.A01(X.68W, X.68X, java.lang.String[]):void");
    }
}
