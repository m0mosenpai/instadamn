package X;

import android.content.BroadcastReceiver;
import android.content.IntentFilter;

/* renamed from: X.07q, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C019607q {
    public boolean A00;
    public final BroadcastReceiver A01;
    public final IntentFilter A02;

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("Receiver{");
        sb.append(this.A01);
        sb.append(" filter=");
        sb.append(this.A02);
        sb.append("}");
        return sb.toString();
    }

    public C019607q(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        this.A02 = intentFilter;
        this.A01 = broadcastReceiver;
    }
}
