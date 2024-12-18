package X;

import android.app.Activity;
import android.os.Build;
import java.util.Map;

/* renamed from: X.LYw, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48298LYw implements InterfaceC23471Cj {
    public boolean A02;
    public boolean A03;
    public final Activity A04;
    public InterfaceC16820sZ A01 = MF0.A00;
    public InterfaceC16820sZ A00 = C50192MEz.A00;

    @Override // X.InterfaceC23471Cj
    public final void DYE(Map map) {
        InterfaceC16820sZ interfaceC16820sZ;
        C14360o3.A0B(map, 0);
        boolean z = false;
        this.A03 = false;
        EnumC172127lh A00 = AbstractC93174Ft.A00(map);
        if (A00 == EnumC172127lh.A04) {
            z = true;
        }
        this.A02 = z;
        if (A00 != EnumC172127lh.A05 && !AbstractC93174Ft.A03(this.A04)) {
            interfaceC16820sZ = this.A00;
        } else {
            interfaceC16820sZ = this.A01;
        }
        interfaceC16820sZ.invoke();
    }

    public final String A00() {
        Activity activity;
        int i;
        if (Build.VERSION.SDK_INT >= 33) {
            activity = this.A04;
            if (activity.getApplicationInfo().targetSdkVersion >= 33) {
                i = 2131963113;
                return AbstractC31177DnL.A0b(activity, AbstractC25227BEk.A0u(activity, i), 2131963122);
            }
        }
        int i2 = Build.VERSION.SDK_INT;
        activity = this.A04;
        i = 2131963121;
        if (i2 >= 30) {
            i = 2131963085;
        }
        return AbstractC31177DnL.A0b(activity, AbstractC25227BEk.A0u(activity, i), 2131963122);
    }

    public C48298LYw(Activity activity) {
        this.A04 = activity;
    }
}
