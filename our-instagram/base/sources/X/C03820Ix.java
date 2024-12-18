package X;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import java.util.ArrayList;

/* renamed from: X.0Ix, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C03820Ix implements InterfaceC08240bm {
    @Override // X.InterfaceC08240bm
    public final ArrayList BIr() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new IntentFilter("android.intent.action.BOOT_COMPLETED"));
        arrayList.add(new IntentFilter("com.facebook.android.intent.action.BOOT_COMPLETED"));
        arrayList.add(new IntentFilter("com.instagram.android.intent.action.BOOT_COMPLETED"));
        return arrayList;
    }

    @Override // X.InterfaceC08240bm
    public final void Dd8(Context context, Intent intent, InterfaceC08190bh interfaceC08190bh) {
        C0NN.A00(context).A02("last_boot_completed_s", Long.toString(System.currentTimeMillis() / 1000));
    }
}
