package X;

import android.app.Activity;
import com.google.common.collect.ImmutableMap;

/* loaded from: classes11.dex */
public final class U4P implements InterfaceC60152ox {
    public final /* synthetic */ C72743Nv A00;

    public U4P(C72743Nv c72743Nv) {
        this.A00 = c72743Nv;
    }

    @Override // X.InterfaceC60152ox
    public final void DOK(int i, boolean z) {
        int A0G;
        C72743Nv c72743Nv = this.A00;
        ImmutableMap immutableMap = C72743Nv.A0U;
        if (c72743Nv.mView != null && c72743Nv.getRootActivity() != null && c72743Nv.getRootActivity().getWindow() != null) {
            boolean A1P = AbstractC167007dF.A1P(c72743Nv.getRootActivity().getWindow().getAttributes().softInputMode & 240, 16);
            if (!C72743Nv.A06(c72743Nv) && A1P && AbstractC13880nE.A0y(c72743Nv.getRootActivity())) {
                if (c72743Nv.A09.A0l) {
                    Activity rootActivity = c72743Nv.getRootActivity();
                    if (rootActivity == null) {
                        A0G = 0;
                    } else {
                        A0G = AbstractC53242c7.A0G(rootActivity, AbstractC57322k7.A01(c72743Nv.A0D));
                    }
                    i -= A0G;
                }
                AbstractC13880nE.A0Y(c72743Nv.mView, Math.max(i, 0));
            }
        }
    }
}
