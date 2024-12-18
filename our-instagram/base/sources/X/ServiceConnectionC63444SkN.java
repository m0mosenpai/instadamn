package X;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.google.android.gms.internal.play_billing.zzr;
import java.util.concurrent.Callable;

/* renamed from: X.SkN, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class ServiceConnectionC63444SkN implements ServiceConnection {
    public InterfaceC65468Tkk A00;
    public final /* synthetic */ C63373Sif A03;
    public final Object A02 = AbstractC58318PtA.A0b();
    public boolean A01 = false;

    public /* synthetic */ ServiceConnectionC63444SkN(C63373Sif c63373Sif, InterfaceC65468Tkk interfaceC65468Tkk) {
        this.A03 = c63373Sif;
        this.A00 = interfaceC65468Tkk;
    }

    public static final void A00(SYG syg, ServiceConnectionC63444SkN serviceConnectionC63444SkN) {
        synchronized (serviceConnectionC63444SkN.A02) {
            InterfaceC65468Tkk interfaceC65468Tkk = serviceConnectionC63444SkN.A00;
            if (interfaceC65468Tkk != null) {
                interfaceC65468Tkk.CzM(syg);
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        AbstractC63398SjT.A09("BillingClient", "Billing service connected.");
        C63373Sif c63373Sif = this.A03;
        c63373Sif.A0K = zzr.A00(iBinder);
        Callable callable = new Callable() { // from class: X.TTs
            /* JADX WARN: Code restructure failed: missing block: B:26:0x005b, code lost:
            
                if (r1 >= 3) goto L27;
             */
            /* JADX WARN: Code restructure failed: missing block: B:42:0x00a1, code lost:
            
                if (r8 >= 21) goto L47;
             */
            /* JADX WARN: Code restructure failed: missing block: B:50:0x00bd, code lost:
            
                if (r8 >= 17) goto L56;
             */
            /* JADX WARN: Code restructure failed: missing block: B:60:0x00e1, code lost:
            
                if (r8 >= 10) goto L67;
             */
            /* JADX WARN: Code restructure failed: missing block: B:92:0x0160, code lost:
            
                if (r7 != 0) goto L110;
             */
            @Override // java.util.concurrent.Callable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object call() {
                /*
                    Method dump skipped, instructions count: 399
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.CallableC64780TTs.call():java.lang.Object");
            }
        };
        if (C63373Sif.A02(C63373Sif.A00(c63373Sif), c63373Sif, new Runnable() { // from class: X.TJU
            @Override // java.lang.Runnable
            public final void run() {
                ServiceConnectionC63444SkN serviceConnectionC63444SkN = ServiceConnectionC63444SkN.this;
                C63373Sif c63373Sif2 = serviceConnectionC63444SkN.A03;
                c63373Sif2.A0I = 0;
                c63373Sif2.A0K = null;
                InterfaceC65616To7 interfaceC65616To7 = c63373Sif2.A02;
                SYG syg = SA6.A0E;
                AbstractC58319PtB.A1E(syg, interfaceC65616To7, 24, 6);
                ServiceConnectionC63444SkN.A00(syg, serviceConnectionC63444SkN);
            }
        }, callable, 30000L) == null) {
            SYG A01 = C63373Sif.A01(c63373Sif);
            AbstractC58319PtB.A1E(A01, c63373Sif.A02, 25, 6);
            A00(A01, this);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        AbstractC63398SjT.A0A("BillingClient", "Billing service disconnected.");
        C63373Sif c63373Sif = this.A03;
        InterfaceC65616To7 interfaceC65616To7 = c63373Sif.A02;
        ROR A00 = ROR.A00();
        C63714SsU c63714SsU = (C63714SsU) interfaceC65616To7;
        if (A00 != null) {
            try {
                ROP A002 = ROZ.A00();
                ROU rou = c63714SsU.A01;
                if (rou != null) {
                    A002.A09(rou);
                }
                A002.A0B(A00);
                c63714SsU.A00.A00((ROZ) A002.A01());
            } catch (Throwable th) {
                AbstractC63398SjT.A0B("BillingLogger", "Unable to log.", th);
            }
        }
        c63373Sif.A0K = null;
        c63373Sif.A0I = 0;
        synchronized (this.A02) {
            InterfaceC65468Tkk interfaceC65468Tkk = this.A00;
            if (interfaceC65468Tkk != null) {
                interfaceC65468Tkk.CzL();
            }
        }
    }
}
