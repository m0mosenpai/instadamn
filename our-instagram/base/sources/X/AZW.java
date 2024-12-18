package X;

import android.view.View;
import java.util.List;

/* loaded from: classes4.dex */
public final class AZW implements InterfaceC178677wf {
    public final /* synthetic */ C179887ye A00;

    @Override // X.InterfaceC178677wf
    public final void Dah(C176507t8 c176507t8) {
        C14360o3.A0B(c176507t8, 0);
        if (c176507t8.A00() != null) {
            List list = this.A00.A03.A00;
            C14360o3.A07(list);
            if (0 < list.size()) {
                list.get(0);
                throw AbstractC166987dD.A15("onSurfaceCreated");
            }
        }
    }

    @Override // X.InterfaceC178677wf
    public final void Dai(C176507t8 c176507t8) {
        C14360o3.A0B(c176507t8, 0);
        if (c176507t8.A00() != null) {
            List list = this.A00.A03.A00;
            C14360o3.A07(list);
            if (0 < list.size()) {
                list.get(0);
                throw AbstractC166987dD.A15("onSurfaceDestroyed");
            }
        }
    }

    @Override // X.InterfaceC178677wf
    public final void Daj(C176507t8 c176507t8, int i, int i2) {
        C14360o3.A0B(c176507t8, 0);
        if (c176507t8.A00() != null) {
            List list = this.A00.A03.A00;
            C14360o3.A07(list);
            if (0 < list.size()) {
                list.get(0);
                throw AbstractC166987dD.A15("onSurfaceChanged");
            }
        }
    }

    @Override // X.InterfaceC178677wf
    public final void Dan(View view) {
    }

    public AZW(C179887ye c179887ye) {
        this.A00 = c179887ye;
    }
}
