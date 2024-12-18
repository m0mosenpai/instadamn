package com.instagram.direct.msys.plugins.msyscomponentloggerplugin;

import X.AbstractC16960so;
import X.AnonymousClass001;
import X.C006802i;
import X.C14360o3;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class MCIBootstrapAttributionLoggerSessionless extends Sessionless {
    public final List markers = AbstractC16960so.A1Q(20131727, 20127832, 20127518);
    public final C006802i qpl;

    @Override // com.instagram.direct.msys.plugins.msyscomponentloggerplugin.Sessionless
    public void MCIComponentLogger_MCIComponentLoggerExtensionAnnotateBool(int i, int i2, String str, boolean z) {
        C14360o3.A0B(str, 2);
        if (i2 == 3) {
            Iterator it = this.markers.iterator();
            while (it.hasNext()) {
                this.qpl.markerAnnotate(((Number) it.next()).intValue(), i, AnonymousClass001.A0R("xplat_", str), z);
            }
        }
    }

    @Override // com.instagram.direct.msys.plugins.msyscomponentloggerplugin.Sessionless
    public void MCIComponentLogger_MCIComponentLoggerExtensionAnnotateDouble(int i, int i2, String str, double d) {
        C14360o3.A0B(str, 2);
        if (i2 == 3) {
            Iterator it = this.markers.iterator();
            while (it.hasNext()) {
                this.qpl.markerAnnotate(((Number) it.next()).intValue(), i, AnonymousClass001.A0R("xplat_", str), d);
            }
        }
    }

    @Override // com.instagram.direct.msys.plugins.msyscomponentloggerplugin.Sessionless
    public void MCIComponentLogger_MCIComponentLoggerExtensionAnnotateInt(int i, int i2, String str, long j) {
        C14360o3.A0B(str, 2);
        if (i2 == 3) {
            Iterator it = this.markers.iterator();
            while (it.hasNext()) {
                this.qpl.markerAnnotate(((Number) it.next()).intValue(), i, AnonymousClass001.A0R("xplat_", str), j);
            }
        }
    }

    @Override // com.instagram.direct.msys.plugins.msyscomponentloggerplugin.Sessionless
    public void MCIComponentLogger_MCIComponentLoggerExtensionAnnotateString(int i, int i2, String str, String str2) {
        C14360o3.A0B(str, 2);
        C14360o3.A0B(str2, 3);
        if (i2 == 3) {
            Iterator it = this.markers.iterator();
            while (it.hasNext()) {
                this.qpl.markerAnnotate(((Number) it.next()).intValue(), i, AnonymousClass001.A0R("xplat_", str), str2);
            }
        }
    }

    @Override // com.instagram.direct.msys.plugins.msyscomponentloggerplugin.Sessionless
    public void MCIComponentLogger_MCIComponentLoggerExtensionEnd(int i, int i2) {
        if (i2 == 3) {
            Iterator it = this.markers.iterator();
            while (it.hasNext()) {
                this.qpl.markerPoint(((Number) it.next()).intValue(), i, "xplat_mci_bootstrap_end");
            }
        }
    }

    @Override // com.instagram.direct.msys.plugins.msyscomponentloggerplugin.Sessionless
    public void MCIComponentLogger_MCIComponentLoggerExtensionPoint(int i, int i2, String str) {
        C14360o3.A0B(str, 2);
        if (i2 == 3) {
            Iterator it = this.markers.iterator();
            while (it.hasNext()) {
                this.qpl.markerPoint(((Number) it.next()).intValue(), i, AnonymousClass001.A0R("xplat_", str));
            }
        }
    }

    @Override // com.instagram.direct.msys.plugins.msyscomponentloggerplugin.Sessionless
    public void MCIComponentLogger_MCIComponentLoggerExtensionStart(int i, int i2) {
        if (i2 == 3) {
            Iterator it = this.markers.iterator();
            while (it.hasNext()) {
                this.qpl.markerPoint(((Number) it.next()).intValue(), i, "xplat_mci_bootstrap_start");
            }
        }
    }

    public MCIBootstrapAttributionLoggerSessionless() {
        C006802i c006802i = C006802i.A0p;
        C14360o3.A07(c006802i);
        this.qpl = c006802i;
    }
}
