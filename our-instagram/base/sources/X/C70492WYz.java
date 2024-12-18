package X;

import java.io.File;
import java.util.List;

/* renamed from: X.WYz, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70492WYz implements XES {
    public C69568VrX A00;
    public XES A01;

    @Override // X.XES
    public final void D21(C70129W5q c70129W5q) {
        XES xes = this.A01;
        if (xes != null) {
            xes.D21(c70129W5q);
        }
    }

    @Override // X.XES
    public final void D6f(List list) {
        C69568VrX c69568VrX = this.A00;
        if (c69568VrX != null) {
            XC1 xc1 = c69568VrX.A01;
            AbstractC68335VMv.A00(xc1, null, "media_upload_process_success", c69568VrX.A02, xc1.now() - c69568VrX.A00);
        }
        XES xes = this.A01;
        if (xes != null) {
            xes.D6f(list);
        }
    }

    @Override // X.XES
    public final /* bridge */ /* synthetic */ void DEg(C70129W5q c70129W5q, Object obj) {
        Exception exc;
        Exception exc2 = (Exception) obj;
        C69568VrX c69568VrX = this.A00;
        if (c69568VrX != null) {
            if (exc2 instanceof C105764pn) {
                exc = exc2;
            } else {
                exc = new Exception(AnonymousClass001.A0g("Failed to resize video (", exc2.getMessage(), ")"), exc2);
            }
            c69568VrX.A00(exc);
        }
        XES xes = this.A01;
        if (xes != null) {
            xes.DEg(c70129W5q, exc2);
        }
    }

    @Override // X.XES
    public final void Dbq(double d) {
        XES xes = this.A01;
        if (xes != null) {
            xes.Dbq(d);
        }
    }

    @Override // X.XES
    public final void Dk4(File file, long j) {
        XES xes = this.A01;
        if (xes != null) {
            xes.Dk4(file, j);
        }
    }

    @Override // X.XES
    public final void Dk6(C55176Odf c55176Odf) {
        XES xes = this.A01;
        if (xes != null) {
            xes.Dk6(c55176Odf);
        }
    }

    @Override // X.XES
    public final void onStart() {
        C69568VrX c69568VrX = this.A00;
        if (c69568VrX != null) {
            XC1 xc1 = c69568VrX.A01;
            c69568VrX.A00 = xc1.now();
            AbstractC68335VMv.A00(xc1, null, "media_upload_process_start", c69568VrX.A02, -1L);
        }
        XES xes = this.A01;
        if (xes != null) {
            xes.onStart();
        }
    }
}
