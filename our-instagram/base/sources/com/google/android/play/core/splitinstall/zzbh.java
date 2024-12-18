package com.google.android.play.core.splitinstall;

import X.AbstractC25228BEl;
import X.AbstractC58318PtA;
import X.C0f9;
import X.C2KP;
import X.C58411Pup;
import android.os.Bundle;
import com.google.android.play.core.splitinstall.internal.zzbp;
import com.google.android.play.core.splitinstall.internal.zzl;
import java.util.List;

/* loaded from: classes10.dex */
public abstract class zzbh extends zzbp {
    public final C58411Pup A00;
    public final /* synthetic */ C2KP A01;

    public zzbh(C58411Pup c58411Pup, C2KP c2kp) {
        this.A01 = c2kp;
        int A03 = C0f9.A03(1902545579);
        this.A00 = c58411Pup;
        C0f9.A0A(-2036981912, A03);
    }

    public void FFr(int i, Bundle bundle) {
        int A00 = zzl.A00(this, 1275983726);
        C2KP.A02.A03("onCancelInstall(%d)", AbstractC25228BEl.A1Y(i));
        C0f9.A0A(1659203996, A00);
    }

    public void FGF(Bundle bundle) {
        int A00 = zzl.A00(this, -1264042034);
        C2KP.A02.A03("onDeferredInstall", AbstractC58318PtA.A1b());
        C0f9.A0A(1820937059, A00);
    }

    public void FGY(Bundle bundle) {
        int A00 = zzl.A00(this, 969156116);
        C2KP.A02.A03("onDeferredUninstall", AbstractC58318PtA.A1b());
        C0f9.A0A(1935872819, A00);
    }

    public void FGg(List list) {
        int A00 = zzl.A00(this, 1015286713);
        C2KP.A02.A03("onGetSessionStates", AbstractC58318PtA.A1b());
        C0f9.A0A(1705113819, A00);
    }

    public void FGn(int i, Bundle bundle) {
        int A00 = zzl.A00(this, 1096559467);
        C2KP.A02.A03("onStartInstall(%d)", AbstractC25228BEl.A1Y(i));
        C0f9.A0A(-914453389, A00);
    }
}
