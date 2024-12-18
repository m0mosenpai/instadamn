package X;

import java.io.File;
import java.util.concurrent.ExecutorService;

/* renamed from: X.NGp, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52394NGp extends AbstractRunnableC14200nk {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ int A03;
    public final /* synthetic */ WDI A04;
    public final /* synthetic */ X9U A05;
    public final /* synthetic */ InterfaceC58036PoM A06;
    public final /* synthetic */ C115525Km A07;
    public final /* synthetic */ C187058Qy A08;
    public final /* synthetic */ File A09;
    public final /* synthetic */ ExecutorService A0A;
    public final /* synthetic */ boolean A0B;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C52394NGp(WDI wdi, X9U x9u, InterfaceC58036PoM interfaceC58036PoM, C115525Km c115525Km, C187058Qy c187058Qy, File file, ExecutorService executorService, int i, int i2, int i3, int i4, boolean z) {
        super(90, 4, false, false);
        this.A09 = file;
        this.A02 = i;
        this.A03 = i2;
        this.A0B = z;
        this.A04 = wdi;
        this.A01 = i3;
        this.A00 = i4;
        this.A07 = c115525Km;
        this.A08 = c187058Qy;
        this.A0A = executorService;
        this.A05 = x9u;
        this.A06 = interfaceC58036PoM;
    }

    @Override // java.lang.Runnable
    public final void run() {
        File file = this.A09;
        int A01 = ALf.A01(file.getAbsolutePath());
        int i = this.A02;
        if (A01 > i) {
            A01 = i;
        }
        int i2 = this.A03;
        int i3 = A01 - i2;
        if (this.A0B) {
            WDI wdi = this.A04;
            float f = this.A01;
            float f2 = this.A00;
            C115525Km c115525Km = this.A07;
            wdi.A0E = AbstractC53907Nsg.A00(f, f2, c115525Km.A09, c115525Km.A05);
        }
        try {
            C11T.A02(new RunnableC57062PTb(this.A06, OXi.A01(this.A08.A0B, null, this.A04, this.A05, null, file, this.A0A, i2, i, 1, false, false, false, false), this.A01, this.A00, i3));
        } catch (C8CK e) {
            C11T.A02(new PQE(e, this.A06));
        }
    }
}
