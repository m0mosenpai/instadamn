package X;

import android.os.Handler;
import java.io.File;
import java.util.ArrayList;
import java.util.NavigableSet;

/* renamed from: X.2QD, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2QD implements C2QE {
    public final C2QG A00;
    public final Object A01;
    public final boolean A02;
    public final boolean A03;

    public C2QD(Handler handler, InterfaceC46402Bc interfaceC46402Bc, File file, ArrayList arrayList, int i, long j, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        C2QG c2qf;
        this.A02 = z5;
        this.A03 = z4;
        if (z5) {
            c2qf = new R84(interfaceC46402Bc, new C63017Sah(file), file, arrayList, j, z, z2);
        } else {
            c2qf = new C2QF(handler, interfaceC46402Bc, file, arrayList, i, j, z, z2, z3);
        }
        this.A00 = c2qf;
        this.A01 = this;
    }

    public static void A00(C2QG c2qg, C49802Qq c49802Qq, String str) {
        String str2;
        C106704rS c106704rS;
        String str3;
        c2qg.A0A(c49802Qq);
        for (InterfaceC46402Bc interfaceC46402Bc : c2qg.A02) {
            if (interfaceC46402Bc instanceof C106664rO) {
                C106664rO c106664rO = (C106664rO) interfaceC46402Bc;
                if (c106664rO.A01 != null && (str2 = c49802Qq.A06) != null) {
                    String str4 = "UNKNOWN";
                    C106694rR c106694rR = c106664rO.A00;
                    synchronized (c106694rR) {
                        c106704rS = (C106704rS) c106694rR.A00.get((C49802Qq) c106694rR.A01.floor(c49802Qq));
                    }
                    if (c106704rS != null) {
                        C92304Bk c92304Bk = c106704rS.A00;
                        str3 = c92304Bk.A03;
                        str4 = c92304Bk.A00.name();
                    } else {
                        str3 = "unknown";
                    }
                    c106664rO.A01.A01.add(new C106724rU(EnumC106714rT.SPAN_REMOVED, str3, str4, str2, str, "unknown", c49802Qq.A04, c49802Qq.A03, 0L, 0L));
                }
            }
        }
    }

    public final C49802Qq A01(Integer num, String str, long j) {
        C49802Qq Enm;
        synchronized (this.A01) {
            Enm = this.A00.Enm(num, str, j, -1L);
        }
        return Enm;
    }

    public final C49802Qq A02(Integer num, String str, long j) {
        C49802Qq Enn;
        synchronized (this.A01) {
            Enn = this.A00.Enn(num, str, j, -1L);
        }
        return Enn;
    }

    public final void A03(C49802Qq c49802Qq, String str) {
        synchronized (this.A01) {
            C2QG c2qg = this.A00;
            c2qg.EGK(c49802Qq);
            A00(c2qg, c49802Qq, str);
        }
    }

    public final void A04(String str, long j) {
        synchronized (this.A01) {
            this.A00.A0B(str, j);
        }
    }

    @Override // X.C2QE
    public final NavigableSet A9D(InterfaceC46412Bd interfaceC46412Bd, String str) {
        NavigableSet A9D;
        synchronized (this.A01) {
            A9D = this.A00.A9D(interfaceC46412Bd, str);
        }
        return A9D;
    }

    @Override // X.C2QE
    public final void A9J(String str) {
        synchronized (this.A01) {
            this.A00.A9J(str);
        }
    }

    @Override // X.C2QE
    public final void AC5(SEO seo, String str) {
        synchronized (this.A01) {
            this.A00.AC5(seo, str);
        }
    }

    @Override // X.C2QE
    public final void AId(File file, long j) {
        synchronized (this.A01) {
            this.A00.AId(file, j);
        }
    }

    @Override // X.C2QE
    public final long Aja() {
        long Aja;
        synchronized (this.A01) {
            Aja = this.A00.Aja();
        }
        return Aja;
    }

    @Override // X.C2QE
    public final long Ajd(long j, String str, long j2) {
        long Ajd;
        synchronized (this.A01) {
            Ajd = this.A00.Ajd(j, str, j2);
        }
        return Ajd;
    }

    @Override // X.C2QE
    public final NavigableSet Ajh(String str) {
        NavigableSet Ajh;
        synchronized (this.A01) {
            Ajh = this.A00.Ajh(str);
        }
        return Ajh;
    }

    @Override // X.C2QE
    public final InterfaceC65245Tgb Ar2(String str) {
        InterfaceC65245Tgb Ar2;
        synchronized (this.A01) {
            Ar2 = this.A00.Ar2(str);
        }
        return Ar2;
    }

    @Override // X.C2QE
    public final java.util.Set BKo() {
        java.util.Set BKo;
        synchronized (this.A01) {
            BKo = this.A00.BKo();
        }
        return BKo;
    }

    @Override // X.C2QE
    public final boolean CR2(String str, long j, long j2) {
        boolean CR2;
        synchronized (this.A01) {
            CR2 = this.A00.CR2(str, 0L, j2);
        }
        return CR2;
    }

    @Override // X.C2QE
    public final boolean CR5(String str, long j, long j2) {
        return this.A00.CR5(str, j, j2);
    }

    @Override // X.C2QE
    public final boolean CXn(String str) {
        boolean CXn;
        synchronized (this.A01) {
            CXn = this.A00.CXn(str);
        }
        return CXn;
    }

    @Override // X.C2QE
    public final void EEJ(C49802Qq c49802Qq) {
        synchronized (this.A01) {
            this.A00.EEJ(c49802Qq);
        }
    }

    @Override // X.C2QE
    public final void EFe(InterfaceC46412Bd interfaceC46412Bd, String str) {
        synchronized (this.A01) {
            this.A00.EFe(interfaceC46412Bd, str);
        }
    }

    @Override // X.C2QE
    public final void EGD(String str) {
        synchronized (this.A01) {
            this.A00.EGD(str);
        }
    }

    @Override // X.C2QE
    public final void EGK(C49802Qq c49802Qq) {
        synchronized (this.A01) {
            A03(c49802Qq, "not_provided");
        }
    }

    @Override // X.C2QE
    public final File EnK(String str, long j, long j2) {
        File EnK;
        synchronized (this.A01) {
            EnK = this.A00.EnK(str, j, j2);
            AbstractC05810Sj.A00(EnK);
        }
        return EnK;
    }

    @Override // X.C2QE
    public final C49802Qq Enm(Integer num, String str, long j, long j2) {
        C49802Qq Enm;
        if (!this.A03) {
            synchronized (this.A01) {
                Enm = this.A00.Enm(num, str, j, j2);
            }
            return Enm;
        }
        return this.A00.Enm(num, str, j, j2);
    }

    @Override // X.C2QE
    public final C49802Qq Enn(Integer num, String str, long j, long j2) {
        C49802Qq Enn;
        synchronized (this.A01) {
            Enn = this.A00.Enn(num, str, j, j2);
        }
        return Enn;
    }

    @Override // X.C2QE
    public final void release() {
        synchronized (this.A01) {
            this.A00.release();
        }
    }
}
