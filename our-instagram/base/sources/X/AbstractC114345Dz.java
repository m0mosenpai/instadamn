package X;

import android.view.KeyEvent;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.5Dz, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC114345Dz extends C5AY implements C5DX, InterfaceC1130758u, InterfaceC114285Ds, C58L, C5DY {
    public static final C5Zl A0H = new Object();
    public InterfaceC118065Vq A00;
    public C28733CmR A01;
    public C5XO A02;
    public C5XO A03;
    public C28734CmS A04;
    public C6KM A05;
    public C58K A06;
    public InterfaceC16820sZ A07;
    public boolean A08;
    public boolean A09;
    public C5XQ A0B;
    public String A0C;
    public final C5Zn A0E;
    public final Object A0F;
    public final C5Zm A0D = new C58J();
    public final Map A0G = new LinkedHashMap();
    public long A0A = 0;

    @Override // X.C58L
    public final boolean BvB() {
        return true;
    }

    @Override // X.InterfaceC114285Ds
    public final boolean Da7(KeyEvent keyEvent) {
        return false;
    }

    public static final void A00(AbstractC114345Dz abstractC114345Dz) {
        InterfaceC118065Vq interfaceC118065Vq;
        if (abstractC114345Dz.A06 == null && (interfaceC118065Vq = abstractC114345Dz.A00) != null) {
            C5XO c5xo = abstractC114345Dz.A02;
            if (c5xo == null) {
                c5xo = new C5XN();
                abstractC114345Dz.A02 = c5xo;
            }
            abstractC114345Dz.A0E.A0H(c5xo);
            C5XO c5xo2 = abstractC114345Dz.A02;
            C14360o3.A0A(c5xo2);
            C58K AL3 = interfaceC118065Vq.AL3(c5xo2);
            abstractC114345Dz.A0F(AL3);
            abstractC114345Dz.A06 = AL3;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x003b, code lost:
    
        if (r2 != false) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A0H(X.C6KN r11, X.InterfaceC23621Ds r12) {
        /*
            r10 = this;
            boolean r0 = r10 instanceof X.C5Zj
            r4 = r11
            r5 = r12
            if (r0 == 0) goto L40
            r3 = r10
            X.5Zj r3 = (X.C5Zj) r3
            boolean r2 = r3.A08
            r1 = 0
            if (r2 == 0) goto L3a
            X.0sZ r0 = r3.A01
            if (r0 == 0) goto L3a
            r0 = 6
            X.9Dx r6 = new X.9Dx
            r6.<init>(r3, r0)
        L18:
            X.0sZ r0 = r3.A02
            if (r0 == 0) goto L3e
            r0 = 7
            X.9Dx r7 = new X.9Dx
            r7.<init>(r3, r0)
        L22:
            r0 = 1
            X.9D8 r9 = new X.9D8
            r9.<init>(r3, r1, r0)
            r0 = 8
            X.9Dx r8 = new X.9Dx
            r8.<init>(r3, r0)
            java.lang.Object r1 = androidx.compose.foundation.gestures.TapGestureDetectorKt.A03(r4, r5, r6, r7, r8, r9)
        L33:
            X.1JX r0 = X.C1JX.A02
            if (r1 == r0) goto L39
            X.0eB r1 = X.C0eB.A00
        L39:
            return r1
        L3a:
            r6 = r1
            if (r2 == 0) goto L3e
            goto L18
        L3e:
            r7 = r1
            goto L22
        L40:
            r1 = 0
            r0 = 0
            X.9D8 r2 = new X.9D8
            r2.<init>(r10, r1, r0)
            r1 = 5
            X.9Dx r0 = new X.9Dx
            r0.<init>(r10, r1)
            java.lang.Object r1 = androidx.compose.foundation.gestures.TapGestureDetectorKt.A04(r11, r12, r0, r2)
            goto L33
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC114345Dz.A0H(X.6KN, X.1Ds):java.lang.Object");
    }

    public final void A0I() {
        C5XO c5xo = this.A02;
        if (c5xo != null) {
            C28734CmS c28734CmS = this.A04;
            if (c28734CmS != null) {
                ((C5XN) c5xo).A00.F8m(new C28737CmV(c28734CmS));
            }
            C28733CmR c28733CmR = this.A01;
            if (c28733CmR != null) {
                ((C5XN) c5xo).A00.F8m(new C28736CmU(c28733CmR));
            }
            Iterator it = this.A0G.values().iterator();
            while (it.hasNext()) {
                ((C5XN) c5xo).A00.F8m(new C28737CmV((C28734CmS) it.next()));
            }
        }
        this.A04 = null;
        this.A01 = null;
        this.A0G.clear();
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0061, code lost:
    
        if (r4.A00 == null) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x006d, code lost:
    
        if (r4.A06 == null) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x006f, code lost:
    
        r0 = r4.A06;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0071, code lost:
    
        if (r0 != null) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0073, code lost:
    
        if (r2 != false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0075, code lost:
    
        r4.A06 = null;
        A00(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x007b, code lost:
    
        r4.A0E.A0H(r4.A02);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0082, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0083, code lost:
    
        A0G(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0087, code lost:
    
        if (r3 != false) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0J(X.InterfaceC118065Vq r5, X.C5XO r6, X.C5XQ r7, java.lang.String r8, X.InterfaceC16820sZ r9, boolean r10) {
        /*
            r4 = this;
            X.5XO r0 = r4.A03
            boolean r0 = X.C14360o3.A0K(r0, r6)
            if (r0 != 0) goto L96
            r4.A0I()
            r4.A03 = r6
            r4.A02 = r6
            r3 = 1
        L10:
            X.5Vq r0 = r4.A00
            boolean r0 = X.C14360o3.A0K(r0, r5)
            if (r0 != 0) goto L1b
            r4.A00 = r5
            r3 = 1
        L1b:
            boolean r0 = r4.A08
            if (r0 == r10) goto L34
            X.5Zm r0 = r4.A0D
            if (r10 == 0) goto L8a
            r4.A0F(r0)
            X.5Zn r0 = r4.A0E
            r4.A0F(r0)
        L2b:
            X.599 r0 = X.AbstractC114335Dx.A02(r4)
            r0.A0M()
            r4.A08 = r10
        L34:
            java.lang.String r0 = r4.A0C
            boolean r0 = X.C14360o3.A0K(r0, r8)
            if (r0 != 0) goto L45
            r4.A0C = r8
            X.599 r0 = X.AbstractC114335Dx.A02(r4)
            r0.A0M()
        L45:
            X.5XQ r0 = r4.A0B
            boolean r0 = X.C14360o3.A0K(r0, r7)
            if (r0 != 0) goto L56
            r4.A0B = r7
            X.599 r0 = X.AbstractC114335Dx.A02(r4)
            r0.A0M()
        L56:
            r4.A07 = r9
            boolean r2 = r4.A09
            X.5XO r0 = r4.A03
            if (r0 != 0) goto L63
            X.5Vq r1 = r4.A00
            r0 = 1
            if (r1 != 0) goto L64
        L63:
            r0 = 0
        L64:
            if (r2 == r0) goto L87
            r4.A09 = r0
            r2 = r0
            if (r0 != 0) goto L87
            X.58K r0 = r4.A06
            if (r0 != 0) goto L87
        L6f:
            X.58K r0 = r4.A06
            if (r0 != 0) goto L83
            if (r2 != 0) goto L7b
        L75:
            r0 = 0
            r4.A06 = r0
            A00(r4)
        L7b:
            X.5Zn r1 = r4.A0E
            X.5XO r0 = r4.A02
            r1.A0H(r0)
            return
        L83:
            r4.A0G(r0)
            goto L75
        L87:
            if (r3 == 0) goto L7b
            goto L6f
        L8a:
            r4.A0G(r0)
            X.5Zn r0 = r4.A0E
            r4.A0G(r0)
            r4.A0I()
            goto L2b
        L96:
            r3 = 0
            goto L10
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC114345Dz.A0J(X.5Vq, X.5XO, X.5XQ, java.lang.String, X.0sZ, boolean):void");
    }

    public void A0K(InterfaceC113515Ao interfaceC113515Ao) {
        if (this instanceof C5Zj) {
            C5Zj c5Zj = (C5Zj) this;
            if (c5Zj.A02 != null) {
                interfaceC113515Ao.EOx(AbstractC120875de.A0C, new C120895dg(c5Zj.A00, new C9EV(c5Zj, 2)));
            }
        }
    }

    @Override // X.C58L
    public final void ACC(InterfaceC113515Ao interfaceC113515Ao) {
        C5XQ c5xq = this.A0B;
        if (c5xq != null) {
            AbstractC113575Au.A02(interfaceC113515Ao, c5xq.A00);
        }
        AbstractC113575Au.A04(interfaceC113515Ao, this.A0C, new C9EV(this, 1));
        if (this.A08) {
            this.A0E.ACC(interfaceC113515Ao);
        } else {
            interfaceC113515Ao.EOx(AbstractC113545Ar.A03, C0eB.A00);
        }
        A0K(interfaceC113515Ao);
    }

    @Override // X.C58L
    public final /* synthetic */ boolean Buw() {
        return false;
    }

    @Override // X.InterfaceC1130758u
    public final Object CAp() {
        return this.A0F;
    }

    @Override // X.C5DX
    public final /* synthetic */ boolean COp() {
        return false;
    }

    @Override // X.C5DX
    /* renamed from: D1u, reason: merged with bridge method [inline-methods] */
    public final void E0S() {
        C28733CmR c28733CmR;
        C5XO c5xo = this.A02;
        if (c5xo != null && (c28733CmR = this.A01) != null) {
            ((C5XN) c5xo).A00.F8m(new C28736CmU(c28733CmR));
        }
        this.A01 = null;
        C6KM c6km = this.A05;
        if (c6km != null) {
            c6km.E0S();
        }
    }

    @Override // X.C5DX
    public final void DZQ(C6KW c6kw, EnumC25334BJd enumC25334BJd, long j) {
        C19L A05;
        int i;
        long j2 = (((j << 32) >> 33) & 4294967295L) | ((j >> 33) << 32);
        this.A0A = AbstractC119395aw.A00((int) (j2 >> 32), (int) (j2 & 4294967295L));
        A00(this);
        if (this.A08 && enumC25334BJd == EnumC25334BJd.Main) {
            int i2 = c6kw.A00;
            if (i2 == 4) {
                A05 = A05();
                i = 0;
            } else if (i2 == 5) {
                A05 = A05();
                i = 1;
            }
            AbstractC23641Du.A03(C05F.A00, AnonymousClass191.A00, new C206629Ct(this, null, i), A05);
        }
        C6KM c6km = this.A05;
        if (c6km == null) {
            C9D3 c9d3 = new C9D3(this, null, 2);
            C6KW c6kw2 = C6KX.A00;
            c6km = new C6KL(null, null, c9d3);
            A0F(c6km);
            this.A05 = c6km;
        }
        c6km.DZQ(c6kw, enumC25334BJd, j);
    }

    @Override // X.C5DX
    public final /* synthetic */ boolean Ehx() {
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0031, code lost:
    
        if (r2.A00 == null) goto L6;
     */
    /* JADX WARN: Type inference failed for: r0v0, types: [X.58J, X.5Zm] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public AbstractC114345Dz(X.InterfaceC118065Vq r3, X.C5XO r4, X.C5XQ r5, java.lang.String r6, X.InterfaceC16820sZ r7, boolean r8) {
        /*
            r2 = this;
            r2.<init>()
            r2.A02 = r4
            r2.A00 = r3
            r2.A0C = r6
            r2.A0B = r5
            r2.A08 = r8
            r2.A07 = r7
            X.5Zm r0 = new X.5Zm
            r0.<init>()
            r2.A0D = r0
            X.5Zn r0 = new X.5Zn
            r0.<init>(r4)
            r2.A0E = r0
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            r2.A0G = r0
            r0 = 0
            r2.A0A = r0
            X.5XO r0 = r2.A02
            r2.A03 = r0
            if (r0 != 0) goto L33
            X.5Vq r1 = r2.A00
            r0 = 1
            if (r1 != 0) goto L34
        L33:
            r0 = 0
        L34:
            r2.A09 = r0
            X.5Zl r0 = X.AbstractC114345Dz.A0H
            r2.A0F = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC114345Dz.<init>(X.5Vq, X.5XO, X.5XQ, java.lang.String, X.0sZ, boolean):void");
    }

    @Override // X.C5DY
    public final void DHg(InterfaceC118945aB interfaceC118945aB) {
        if (interfaceC118945aB.CV1()) {
            A00(this);
        }
        if (this.A08) {
            this.A0E.DHg(interfaceC118945aB);
        }
    }

    @Override // X.InterfaceC114285Ds
    public final boolean DOF(KeyEvent keyEvent) {
        int keyCode;
        int keyCode2;
        A00(this);
        if (this.A08) {
            long j = AbstractC27737CLe.A00;
            if (CBJ.A00(keyEvent) == 2 && ((keyCode2 = (int) ((keyEvent.getKeyCode() << 32) >> 32)) == 23 || keyCode2 == 66 || keyCode2 == 160)) {
                Map map = this.A0G;
                if (!map.containsKey(new AHB(keyEvent.getKeyCode() << 32))) {
                    Object obj = new Object();
                    map.put(new AHB(keyEvent.getKeyCode() << 32), obj);
                    if (this.A02 == null) {
                        return true;
                    }
                    AbstractC23641Du.A05(AnonymousClass191.A00, new D52(this, obj, (InterfaceC23621Ds) null, 0), A05());
                    return true;
                }
                return false;
            }
        }
        if (this.A08) {
            long j2 = AbstractC27737CLe.A00;
            if (CBJ.A00(keyEvent) == 1 && ((keyCode = (int) ((keyEvent.getKeyCode() << 32) >> 32)) == 23 || keyCode == 66 || keyCode == 160)) {
                Object remove = this.A0G.remove(new AHB(keyEvent.getKeyCode() << 32));
                if (remove != null && this.A02 != null) {
                    AbstractC23641Du.A05(AnonymousClass191.A00, new D52(this, remove, (InterfaceC23621Ds) null, 1), A05());
                }
                this.A07.invoke();
                return true;
            }
        }
        return false;
    }
}
