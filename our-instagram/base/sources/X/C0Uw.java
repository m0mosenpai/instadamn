package X;

import com.facebook.profilo.ipc.TraceContext;
import java.io.File;

/* renamed from: X.0Uw, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0Uw {
    public File A00;
    public String A01;
    public boolean A02;
    public boolean A03;
    public final InterfaceC20060yb A04 = new AbstractC09940fw() { // from class: X.0RE
        @Override // X.AbstractC09940fw, X.InterfaceC20060yb
        public final boolean AGE(TraceContext traceContext, File file) {
            boolean z;
            String str = traceContext.A0D;
            C0Uw c0Uw = C0Uw.this;
            if (!str.equals(c0Uw.A01)) {
                return true;
            }
            synchronized (c0Uw) {
                c0Uw.A02 = true;
                c0Uw.A00 = file;
                c0Uw.notifyAll();
                C20020yW.A00().A07(this);
                z = c0Uw.A03;
            }
            return z;
        }

        @Override // X.AbstractC09940fw, X.InterfaceC06430Vk
        public final void DuU(TraceContext traceContext, int i) {
            C0Uw c0Uw = C0Uw.this;
            synchronized (c0Uw) {
                c0Uw.A02 = true;
                c0Uw.notifyAll();
                C20020yW.A00().A07(this);
            }
        }
    };

    public final synchronized void A00() {
        File file;
        if (!this.A03) {
            C20020yW A00 = C20020yW.A00();
            this.A03 = true;
            if (this.A02 && (file = this.A00) != null) {
                A00.A01.A04(file, true);
                A00.A05();
            }
        }
    }

    public C0Uw(String str) {
        this.A01 = str;
    }
}
