package X;

import androidx.window.sidecar.SidecarDisplayFeature;

/* loaded from: classes5.dex */
public final class DK5 extends C0YY implements InterfaceC16660sJ {
    public static final DK5 A00 = new DK5();

    public DK5() {
        super(1);
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        SidecarDisplayFeature sidecarDisplayFeature = (SidecarDisplayFeature) obj;
        C14360o3.A0B(sidecarDisplayFeature, 0);
        boolean z = true;
        if (sidecarDisplayFeature.getType() != 1 && sidecarDisplayFeature.getType() != 2) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
