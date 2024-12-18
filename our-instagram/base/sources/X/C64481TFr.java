package X;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import com.instagram.common.notifications.push.intf.PushChannelType;

/* renamed from: X.TFr, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64481TFr implements C3UN {
    public final Context A00;

    public C64481TFr(Context context) {
        C14360o3.A0B(context, 1);
        this.A00 = context;
    }

    @Override // X.C3UN
    public final void DQQ() {
    }

    @Override // X.C3UN
    public final /* synthetic */ PushChannelType B4M() {
        return PushChannelType.A0D;
    }

    @Override // X.C3UN
    public final PushChannelType BjD() {
        return PushChannelType.A04;
    }

    @Override // X.C3UN
    public final void CNt(C1WZ c1wz, String str, boolean z) {
        Context context = this.A00;
        ComponentName componentName = new ComponentName(context, "com.instagram.notifications.push.ADMMessageHandler$Receiver");
        PackageManager packageManager = context.getPackageManager();
        componentName.getClassName();
        packageManager.setComponentEnabledSetting(componentName, 1, 1);
    }

    @Override // X.C3UN
    public final void Ctp(C62450SCd c62450SCd, Integer num) {
        c62450SCd.A00.DO6(false);
    }

    @Override // X.C3UN
    public final void ED2(Integer num) {
        new com.amazon.device.messaging.ADM(this.A00).startRegister();
    }
}
