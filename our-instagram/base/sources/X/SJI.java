package X;

import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Handler;
import com.facebook.react.bridge.Callback;

/* loaded from: classes10.dex */
public final class SJI {
    public Location A00;
    public boolean A01;
    public final long A02;
    public final LocationManager A04;
    public final Callback A06;
    public final Callback A07;
    public final String A09;
    public final Handler A05 = new Handler();
    public final Runnable A08 = new RunnableC64574TKl(this);
    public final LocationListener A03 = new C63453SkW(this);

    public SJI(LocationManager locationManager, Callback callback, Callback callback2, String str, long j) {
        this.A04 = locationManager;
        this.A09 = str;
        this.A02 = j;
        this.A07 = callback;
        this.A06 = callback2;
    }
}
