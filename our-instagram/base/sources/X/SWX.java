package X;

import android.net.ConnectivityManager;
import com.facebook.msys.mci.NetworkSession;

/* loaded from: classes10.dex */
public final class SWX {
    public static final C62271S4q A03 = new Object();
    public static volatile SWX A04;
    public final ConnectivityManager.NetworkCallback A00 = new Q2Z(this, 1);
    public final NetworkSession A01;
    public volatile boolean A02;

    public SWX(NetworkSession networkSession) {
        this.A01 = networkSession;
    }
}
