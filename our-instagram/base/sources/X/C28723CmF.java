package X;

import android.view.View;
import android.widget.Magnifier;

/* renamed from: X.CmF, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C28723CmF implements InterfaceC31112Dlu {
    public static final C28723CmF A00 = new Object();

    @Override // X.InterfaceC31112Dlu
    public final boolean Al8() {
        return true;
    }

    @Override // X.InterfaceC31112Dlu
    public final /* bridge */ /* synthetic */ InterfaceC30900DiD ALZ(View view, InterfaceC1128957x interfaceC1128957x, float f, float f2, float f3, long j, boolean z, boolean z2) {
        Magnifier build;
        if (z) {
            build = new Magnifier(view);
        } else {
            long F7k = interfaceC1128957x.F7k(j);
            float EqT = interfaceC1128957x.EqT(f);
            float EqT2 = interfaceC1128957x.EqT(f2);
            Magnifier.Builder builder = new Magnifier.Builder(view);
            if (F7k != 9205357640488583168L) {
                builder.setSize(C1H4.A01(C5YC.A02(F7k)), C1H4.A01(C5YC.A00(F7k)));
            }
            if (!Float.isNaN(EqT)) {
                builder.setCornerRadius(EqT);
            }
            if (!Float.isNaN(EqT2)) {
                builder.setElevation(EqT2);
            }
            if (!Float.isNaN(f3)) {
                builder.setInitialZoom(f3);
            }
            builder.setClippingEnabled(z2);
            build = builder.build();
        }
        return new C28721CmD(build);
    }
}
