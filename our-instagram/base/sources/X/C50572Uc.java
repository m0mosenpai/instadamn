package X;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.facebook.video.heroplayer.service.HeroKeepAliveService;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: X.2Uc, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C50572Uc {
    public static C50572Uc A05;
    public static final C50582Ud A06 = new Object();
    public static volatile boolean A07;
    public final Context A00;
    public volatile Intent A02;
    public volatile Boolean A04;
    public volatile ServiceConnection A03 = new ServiceConnection() { // from class: X.4JG
        @Override // android.content.ServiceConnection
        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            AbstractC459729h.A01("HeroKeepAliveService.Client", "Service Connected", new Object[0]);
        }

        @Override // android.content.ServiceConnection
        public final void onServiceDisconnected(ComponentName componentName) {
            AbstractC459729h.A01("HeroKeepAliveService.Client", "Service Disconnected", new Object[0]);
        }
    };
    public final AtomicLong A01 = new AtomicLong();

    public C50572Uc(Context context) {
        this.A00 = context;
        this.A02 = new Intent(context, (Class<?>) HeroKeepAliveService.class);
    }
}
