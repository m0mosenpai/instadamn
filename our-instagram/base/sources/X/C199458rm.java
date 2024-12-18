package X;

/* renamed from: X.8rm, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C199458rm implements InterfaceC179077xJ {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public C178907x2 A04;
    public C179427xs A05;
    public C179427xs A06;
    public InterfaceC179037xF A07;
    public InterfaceC179037xF A08;
    public boolean A09;
    public final C178747wm A0A;
    public final C199478ro A0B;
    public final InterfaceC179077xJ A0C;
    public final InterfaceC179077xJ A0D;
    public final boolean A0E;
    public final C199468rn A0F;
    public final InterfaceC179077xJ[] A0G;

    @Override // X.InterfaceC179087xK
    public final void ACv(InterfaceC180227zC interfaceC180227zC) {
        C14360o3.A0B(interfaceC180227zC, 0);
        this.A09 = true;
        for (InterfaceC179077xJ interfaceC179077xJ : this.A0G) {
            interfaceC179077xJ.ACv(interfaceC180227zC);
        }
    }

    @Override // X.InterfaceC179087xK
    public final void CNk(C178907x2 c178907x2) {
        C14360o3.A0B(c178907x2, 0);
        this.A04 = c178907x2;
        for (InterfaceC179077xJ interfaceC179077xJ : this.A0G) {
            interfaceC179077xJ.CNk(c178907x2);
        }
    }

    @Override // X.InterfaceC179077xJ
    public final /* synthetic */ InterfaceC179467xw EGc(InterfaceC179467xw interfaceC179467xw, InterfaceC179437xt interfaceC179437xt, InterfaceC179037xF interfaceC179037xF, Long l) {
        return interfaceC179467xw;
    }

    @Override // X.InterfaceC179077xJ
    public final void EGd(InterfaceC179037xF interfaceC179037xF, Long l) {
        String str;
        C14360o3.A0B(interfaceC179037xF, 0);
        if (interfaceC179037xF.CWg(0) && !interfaceC179037xF.B9z(0).isEmpty()) {
            if (this.A09) {
                C178747wm c178747wm = this.A0A;
                C179427xs c179427xs = new C179427xs(c178747wm, new C179387xo(), new C179417xr(), true);
                this.A06 = c179427xs;
                C179027xE BET = interfaceC179037xF.BET();
                this.A08 = BET;
                BET.A8h(c179427xs, 0);
                C179427xs c179427xs2 = this.A06;
                if (c179427xs2 != null) {
                    C1809380v c1809380v = new C1809380v(c178747wm, c179427xs2);
                    if (this.A0E) {
                        C179027xE BEU = interfaceC179037xF.BEU();
                        this.A07 = BEU;
                        BEU.EWA(c1809380v, 0);
                    } else {
                        C178907x2 c178907x2 = this.A04;
                        if (c178907x2 != null) {
                            C179027xE c179027xE = new C179027xE(c178747wm, null, c178907x2);
                            this.A07 = c179027xE;
                            c179027xE.EWA(c1809380v, 0);
                            C179427xs c179427xs3 = new C179427xs(c178747wm, new C179387xo(), new C179417xr(), true);
                            this.A05 = c179427xs3;
                            InterfaceC179037xF interfaceC179037xF2 = this.A07;
                            if (interfaceC179037xF2 != null) {
                                interfaceC179037xF2.A8h(c179427xs3, 0);
                            }
                            str = "igluIo";
                            C14360o3.A0F(str);
                            throw C00O.createAndThrow();
                        }
                        str = "glHost";
                        C14360o3.A0F(str);
                        throw C00O.createAndThrow();
                    }
                    this.A09 = false;
                }
                str = "intermediateFramebuffer";
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            }
            C199468rn c199468rn = this.A0F;
            if (c199468rn != null) {
                Object BHy = interfaceC179037xF.BHy(0);
                C14360o3.A07(BHy);
                AnonymousClass810 texture = ((InterfaceC179467xw) BHy).getTexture();
                if (texture != null) {
                    c199468rn.A00(texture);
                }
            }
            boolean z = false;
            int BaJ = ((InterfaceC179437xt) interfaceC179037xF.B9z(0).get(0)).BaJ();
            C179427xs c179427xs4 = this.A06;
            if (c179427xs4 != null) {
                c179427xs4.A02(BaJ);
                C179427xs c179427xs5 = this.A06;
                if (c179427xs5 != null) {
                    c179427xs5.A03(this.A01, this.A00, 0);
                    if (interfaceC179037xF.CWg(500)) {
                        Object BHy2 = interfaceC179037xF.BHy(500);
                        C14360o3.A07(BHy2);
                        z = ((Boolean) BHy2).booleanValue();
                    }
                    InterfaceC179077xJ interfaceC179077xJ = this.A0C;
                    if (interfaceC179077xJ == null || !z) {
                        interfaceC179077xJ = this.A0B;
                    }
                    InterfaceC179037xF interfaceC179037xF3 = this.A08;
                    if (interfaceC179037xF3 != null) {
                        interfaceC179077xJ.EGd(interfaceC179037xF3, l);
                        InterfaceC179077xJ interfaceC179077xJ2 = this.A0D;
                        if (interfaceC179077xJ2 != null) {
                            C179427xs c179427xs6 = this.A05;
                            if (c179427xs6 != null) {
                                c179427xs6.A03(this.A03, this.A02, 0);
                            }
                            InterfaceC179037xF interfaceC179037xF4 = this.A07;
                            if (interfaceC179037xF4 != null) {
                                if (interfaceC179037xF != interfaceC179037xF4) {
                                    AbstractC199718sN.A00(interfaceC179037xF, interfaceC179037xF4, 1011);
                                    AbstractC199718sN.A00(interfaceC179037xF, interfaceC179037xF4, 1012);
                                }
                                InterfaceC179037xF interfaceC179037xF5 = this.A07;
                                if (interfaceC179037xF5 != null) {
                                    interfaceC179077xJ2.EGd(interfaceC179037xF5, l);
                                    C179427xs c179427xs7 = this.A05;
                                    if (c179427xs7 != null) {
                                        ((C179027xE) interfaceC179037xF).A07.A01(c179427xs7.A0A, null);
                                        return;
                                    }
                                    return;
                                }
                            }
                            str = "igluIo";
                            C14360o3.A0F(str);
                            throw C00O.createAndThrow();
                        }
                        return;
                    }
                    str = "intermediateIo";
                    C14360o3.A0F(str);
                    throw C00O.createAndThrow();
                }
            }
            str = "intermediateFramebuffer";
            C14360o3.A0F(str);
            throw C00O.createAndThrow();
        }
    }

    @Override // X.InterfaceC179077xJ
    public final void FBm(int i, int i2, int i3, boolean z, int i4, int i5) {
        this.A01 = i2;
        this.A00 = i3;
        this.A03 = i4;
        this.A02 = i5;
        InterfaceC179077xJ interfaceC179077xJ = this.A0C;
        if (interfaceC179077xJ != null) {
            interfaceC179077xJ.FBm(i, i2, i3, z, i2, i3);
        }
        InterfaceC179077xJ interfaceC179077xJ2 = this.A0D;
        if (interfaceC179077xJ2 != null) {
            interfaceC179077xJ2.FBm(i, i2, i3, z, i4, i5);
        }
    }

    @Override // X.InterfaceC179077xJ
    public final void FDL(int i, Object obj) {
        C14360o3.A0B(obj, 1);
        for (InterfaceC179077xJ interfaceC179077xJ : this.A0G) {
            interfaceC179077xJ.FDL(i, obj);
        }
    }

    @Override // X.InterfaceC179077xJ
    public final int AlT() {
        int i = 0;
        for (InterfaceC179077xJ interfaceC179077xJ : this.A0G) {
            i |= interfaceC179077xJ.AlT();
        }
        return i;
    }

    @Override // X.InterfaceC179077xJ
    public final /* synthetic */ int AwF() {
        return 0;
    }

    @Override // X.InterfaceC179077xJ
    public final boolean CLu() {
        for (InterfaceC179077xJ interfaceC179077xJ : this.A0G) {
            if (interfaceC179077xJ.CLu()) {
                return true;
            }
        }
        return false;
    }

    @Override // X.InterfaceC179077xJ
    public final /* synthetic */ boolean Cbr() {
        return false;
    }

    @Override // X.InterfaceC179087xK
    public final void detach() {
        for (InterfaceC179077xJ interfaceC179077xJ : this.A0G) {
            interfaceC179077xJ.detach();
        }
    }

    @Override // X.InterfaceC179087xK
    public final void release() {
        for (InterfaceC179077xJ interfaceC179077xJ : this.A0G) {
            interfaceC179077xJ.release();
        }
    }

    public C199458rm(C199468rn c199468rn, C179107xM c179107xM, C178747wm c178747wm, InterfaceC179077xJ interfaceC179077xJ, boolean z, boolean z2) {
        InterfaceC179077xJ interfaceC179077xJ2;
        this.A0D = interfaceC179077xJ;
        this.A0A = c178747wm;
        this.A0E = z;
        this.A0F = c199468rn;
        if (z2 && c179107xM != null) {
            interfaceC179077xJ2 = new C208849Ls(c179107xM);
        } else {
            interfaceC179077xJ2 = c179107xM;
        }
        InterfaceC179077xJ interfaceC179077xJ3 = interfaceC179077xJ2;
        this.A0C = interfaceC179077xJ3;
        C199478ro c199478ro = new C199478ro(c178747wm);
        this.A0B = c199478ro;
        this.A0G = (InterfaceC179077xJ[]) AbstractC009903n.A0I(new InterfaceC179077xJ[]{interfaceC179077xJ3, interfaceC179077xJ, c199478ro}).toArray(new InterfaceC179077xJ[0]);
        this.A09 = true;
    }
}
