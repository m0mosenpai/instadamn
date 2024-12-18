package X;

import com.facebook.android.maps.model.CameraPosition;
import com.facebook.quicklog.reliability.UserFlowLogger;
import com.instagram.archive.fragment.ArchiveReelMapFragment;

/* renamed from: X.WTg, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70378WTg implements InterfaceC71889X8w {
    public final int A00;
    public final Object A01;

    public C70378WTg(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.InterfaceC71889X8w
    public final void D1N(CameraPosition cameraPosition) {
        if (this.A00 != 0) {
            C69717VuC c69717VuC = (C69717VuC) this.A01;
            if (!c69717VuC.A03.A0I.A0W) {
                C70397WTz c70397WTz = c69717VuC.A06;
                int i = c69717VuC.A00;
                VJ6 vj6 = c70397WTz.A0A;
                UserFlowLogger userFlowLogger = vj6.A01;
                if (userFlowLogger != null) {
                    userFlowLogger.markPointWithEditor(vj6.A00, "cluster_end").addPointData("is_interactive", true).addPointData("reclusterCount", i).markerEditingCompleted();
                }
                c69717VuC.A00 = 0;
                return;
            }
            return;
        }
        ((ArchiveReelMapFragment) this.A01).A02.A01(cameraPosition);
    }
}
