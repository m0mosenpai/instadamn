package X;

import android.content.Context;
import com.facebook.common.build.BuildConstants;
import com.facebook.fixie.fixes.memory.limitnativestack.LimitNativeStackSize;

/* renamed from: X.1Ss, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1Ss extends C0R8 {
    @Override // X.InterfaceC05710Rv
    public final String getName() {
        return "LimitNativeStackSizeFixer";
    }

    @Override // X.InterfaceC05710Rv
    public final void CNZ() {
        if (A05(C10420hA.class) != null && (!BuildConstants.A02())) {
            if (!C20150ym.A07(AbstractC20070ye.A00(18300791224339555L))) {
                Context context = AbstractC12290kX.A00;
                C14360o3.A07(context);
                if (C06580Wl.A01(C20150ym.A03(AbstractC20070ye.A00(18863741177233566L)), C06580Wl.A00(context))) {
                    return;
                }
            }
            int A01 = ((int) C20150ym.A01(AbstractC20100yh.A00(36595011147597821L))) * 1024;
            if (A01 > 0) {
                LimitNativeStackSize.limitNativeStackSize(A01);
                A08();
            }
        }
    }
}
