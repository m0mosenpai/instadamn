package X;

import android.view.animation.AnimationUtils;
import java.util.ArrayList;

/* loaded from: classes11.dex */
public final class UK8 extends AbstractC66027TyP implements XE4, C3M7 {
    public boolean A00;
    public C65726Tt0 A03;
    public Runnable A04;
    public boolean A05;
    public final /* synthetic */ AbstractC66024TyM A07;
    public long A02 = -1;
    public int A01 = 0;
    public final C69043Vgk A06 = new C69043Vgk();

    public final void A03() {
        this.A00 = true;
        int i = this.A01;
        if (i == 1) {
            this.A01 = 0;
            ABO();
        } else {
            if (i != 2) {
                return;
            }
            this.A01 = 0;
            ABP(this.A04);
        }
    }

    @Override // X.AbstractC66027TyP, X.XE3
    public final void DvN(AbstractC66024TyM abstractC66024TyM) {
        this.A05 = true;
    }

    public UK8(AbstractC66024TyM abstractC66024TyM) {
        this.A07 = abstractC66024TyM;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [X.Tt0, X.Tsp] */
    private void A00() {
        float signum;
        float f;
        if (this.A03 == null) {
            C69043Vgk c69043Vgk = this.A06;
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            float f2 = (float) this.A02;
            int i = (c69043Vgk.A00 + 1) % 20;
            c69043Vgk.A00 = i;
            long[] jArr = c69043Vgk.A02;
            jArr[i] = currentAnimationTimeMillis;
            float[] fArr = c69043Vgk.A01;
            fArr[i] = f2;
            ?? abstractC65716Tsp = new AbstractC65716Tsp(new C3M5());
            abstractC65716Tsp.A01 = null;
            abstractC65716Tsp.A00 = Float.MAX_VALUE;
            abstractC65716Tsp.A02 = false;
            this.A03 = abstractC65716Tsp;
            C65717Tsq c65717Tsq = new C65717Tsq();
            c65717Tsq.A01(1.0f);
            c65717Tsq.A02(200.0f);
            abstractC65716Tsp.A01 = c65717Tsq;
            abstractC65716Tsp.A03 = f2;
            abstractC65716Tsp.A07 = true;
            abstractC65716Tsp.A06(this);
            C65726Tt0 c65726Tt0 = this.A03;
            int i2 = c69043Vgk.A00;
            if (i2 != 0 || jArr[i2] != Long.MIN_VALUE) {
                long j = jArr[i2];
                int i3 = 0;
                long j2 = j;
                while (true) {
                    long j3 = jArr[i2];
                    if (j3 == Long.MIN_VALUE) {
                        break;
                    }
                    float f3 = (float) (j - j3);
                    float abs = (float) Math.abs(j3 - j2);
                    if (f3 > 100.0f || abs > 40.0f) {
                        break;
                    }
                    if (i2 == 0) {
                        i2 = 20;
                    }
                    i2--;
                    i3++;
                    if (i3 >= 20) {
                        break;
                    } else {
                        j2 = j3;
                    }
                }
                if (i3 >= 2) {
                    if (i3 == 2) {
                        int i4 = i2 - 1;
                        if (i2 == 0) {
                            i4 = 19;
                        }
                        float f4 = (float) (j - jArr[i4]);
                        if (f4 != 0.0f) {
                            signum = (fArr[i2] - fArr[i4]) / f4;
                        }
                    } else {
                        int i5 = (((i2 - i3) + 20) + 1) % 20;
                        int i6 = ((i2 + 1) + 20) % 20;
                        long j4 = jArr[i5];
                        float f5 = fArr[i5];
                        int i7 = i5 + 1;
                        float f6 = 0.0f;
                        for (int i8 = i7 % 20; i8 != i6; i8 = (i8 + 1) % 20) {
                            long j5 = jArr[i8];
                            float f7 = (float) (j5 - j4);
                            if (f7 != 0.0f) {
                                float f8 = fArr[i8];
                                float f9 = (f8 - f5) / f7;
                                f6 += (f9 - ((float) (Math.signum(f6) * Math.sqrt(Math.abs(f6) * 2.0f)))) * Math.abs(f9);
                                if (i8 == i7) {
                                    f6 *= 0.5f;
                                }
                                f5 = f8;
                                j4 = j5;
                            }
                        }
                        signum = (float) (Math.signum(f6) * Math.sqrt(Math.abs(f6) * 2.0f));
                    }
                    f = signum * 1000.0f;
                    c65726Tt0.A04 = f;
                    ((AbstractC65716Tsp) c65726Tt0).A00 = (float) (this.A07.A04 + 1);
                    ((AbstractC65716Tsp) c65726Tt0).A01 = -1.0f;
                    ((AbstractC65716Tsp) c65726Tt0).A02 = 4.0f;
                    c65726Tt0.A03(4.0f * 0.75f);
                    c65726Tt0.A05(new C3M6() { // from class: X.WQW
                        @Override // X.C3M6
                        public final void Cwa(AbstractC65716Tsp abstractC65716Tsp2, float f10, float f11, boolean z) {
                            UK8.this.A04(z, f10);
                        }
                    });
                }
            }
            f = 0.0f;
            c65726Tt0.A04 = f;
            ((AbstractC65716Tsp) c65726Tt0).A00 = (float) (this.A07.A04 + 1);
            ((AbstractC65716Tsp) c65726Tt0).A01 = -1.0f;
            ((AbstractC65716Tsp) c65726Tt0).A02 = 4.0f;
            c65726Tt0.A03(4.0f * 0.75f);
            c65726Tt0.A05(new C3M6() { // from class: X.WQW
                @Override // X.C3M6
                public final void Cwa(AbstractC65716Tsp abstractC65716Tsp2, float f10, float f11, boolean z) {
                    UK8.this.A04(z, f10);
                }
            });
        }
    }

    public final void A02() {
        AbstractC66024TyM abstractC66024TyM = this.A07;
        long j = 0;
        if (abstractC66024TyM.A04 == 0) {
            j = 1;
        }
        abstractC66024TyM.A0M(j, this.A02);
        this.A02 = j;
    }

    public final /* synthetic */ void A04(boolean z, float f) {
        AbstractC66024TyM abstractC66024TyM;
        XFY xfy;
        boolean z2;
        AbstractC66024TyM abstractC66024TyM2;
        if (!z) {
            if (f < 1.0f) {
                AbstractC66024TyM abstractC66024TyM3 = this.A07;
                long j = abstractC66024TyM3.A04;
                ArrayList arrayList = ((UK2) abstractC66024TyM3).A02;
                if (0 >= arrayList.size()) {
                    abstractC66024TyM2 = null;
                } else {
                    abstractC66024TyM2 = (AbstractC66024TyM) arrayList.get(0);
                }
                abstractC66024TyM = abstractC66024TyM2.A09;
                abstractC66024TyM2.A09 = null;
                abstractC66024TyM3.A0M(-1L, this.A02);
                abstractC66024TyM3.A0M(j, -1L);
                this.A02 = j;
                Runnable runnable = this.A04;
                if (runnable != null) {
                    runnable.run();
                }
                abstractC66024TyM3.A0E.clear();
                if (abstractC66024TyM != null) {
                    xfy = XFY.A01;
                    z2 = true;
                } else {
                    return;
                }
            } else {
                abstractC66024TyM = this.A07;
                xfy = XFY.A01;
                z2 = false;
            }
            AbstractC66024TyM.A04(xfy, abstractC66024TyM, abstractC66024TyM, z2);
        }
    }

    @Override // X.XE4
    public final void ABO() {
        if (!this.A00) {
            this.A01 = 1;
            this.A04 = null;
        } else {
            A00();
            this.A03.A09((float) (this.A07.A04 + 1));
        }
    }

    @Override // X.XE4
    public final void ABP(Runnable runnable) {
        this.A04 = runnable;
        if (!this.A00) {
            this.A01 = 2;
        } else {
            A00();
            this.A03.A09(0.0f);
        }
    }

    @Override // X.XE4
    public final long Azl() {
        return this.A07.A04;
    }

    @Override // X.XE4
    public final boolean CbZ() {
        return this.A00;
    }

    @Override // X.C3M7
    public final void Cwj(AbstractC65716Tsp abstractC65716Tsp, float f, float f2) {
        AbstractC66024TyM abstractC66024TyM = this.A07;
        long max = Math.max(-1L, Math.min(abstractC66024TyM.A04 + 1, Math.round(f)));
        abstractC66024TyM.A0M(max, this.A02);
        this.A02 = max;
    }

    @Override // X.XE4
    public final void ESg(long j) {
        if (this.A03 == null) {
            long j2 = this.A02;
            if (j != j2 && this.A00) {
                if (!this.A05) {
                    if (j == 0 && j2 > 0) {
                        j = -1;
                    } else {
                        long j3 = this.A07.A04;
                        if (j == j3 && j2 < j3) {
                            j = j3 + 1;
                        }
                    }
                    if (j != j2) {
                        this.A07.A0M(j, j2);
                        this.A02 = j;
                    }
                }
                C69043Vgk c69043Vgk = this.A06;
                long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                int i = (c69043Vgk.A00 + 1) % 20;
                c69043Vgk.A00 = i;
                c69043Vgk.A02[i] = currentAnimationTimeMillis;
                c69043Vgk.A01[i] = (float) j;
                return;
            }
            return;
        }
        throw new IllegalStateException("setCurrentPlayTimeMillis() called after animation has been started");
    }
}
