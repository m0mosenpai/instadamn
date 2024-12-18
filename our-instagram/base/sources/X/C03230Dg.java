package X;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import java.util.ArrayList;

/* renamed from: X.0Dg, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C03230Dg implements InterfaceC08240bm {
    @Override // X.InterfaceC08240bm
    public final ArrayList BIr() {
        ArrayList arrayList = new ArrayList();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.PACKAGE_FULLY_REMOVED");
        intentFilter.addAction("android.intent.action.PACKAGE_REMOVED");
        intentFilter.addAction("android.intent.action.PACKAGE_CHANGED");
        intentFilter.addDataScheme("package");
        arrayList.add(intentFilter);
        return arrayList;
    }

    @Override // X.InterfaceC08240bm
    public final void Dd8(Context context, Intent intent, InterfaceC08190bh interfaceC08190bh) {
        android.net.Uri data = intent.getData();
        if (data != null) {
            C0JS.A03.remove(data.getSchemeSpecificPart());
        }
    }
}
