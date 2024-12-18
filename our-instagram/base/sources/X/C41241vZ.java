package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;
import android.provider.Settings;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.1vZ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C41241vZ implements InterfaceC13000lm {
    public static volatile C41241vZ A0E;
    public int A00;
    public int A01;
    public Boolean A02;
    public WeakReference A03;
    public final BroadcastReceiver A04;
    public final Context A05;
    public final AudioManager A06;
    public final Handler A07;
    public final C41271vc A08;
    public final C14280ns A09;
    public final java.util.Set A0A;
    public final AtomicBoolean A0B;
    public volatile int A0C;
    public volatile int A0D;

    public static final void A00(C41241vZ c41241vZ) {
        if (C14360o3.A0K(c41241vZ.A02, true)) {
            AtomicBoolean atomicBoolean = c41241vZ.A0B;
            if (atomicBoolean.get()) {
                c41241vZ.A02 = false;
                try {
                    Context context = c41241vZ.A05;
                    context.getContentResolver().unregisterContentObserver(c41241vZ.A08);
                    if (atomicBoolean.get()) {
                        context.unregisterReceiver(c41241vZ.A04);
                        atomicBoolean.set(false);
                    }
                } catch (IllegalStateException e) {
                    C0K8.A0F("IgSystemAudioVolumeObserver", "Observer/listener not registered", e);
                }
            }
        }
    }

    public static final void A01(C41241vZ c41241vZ) {
        int i;
        C11T.A05("This operation can't be run on UI thread.");
        try {
            AudioManager audioManager = c41241vZ.A06;
            if (audioManager != null) {
                c41241vZ.A01 = audioManager.getStreamVolume(3);
                c41241vZ.A00 = audioManager.getStreamMaxVolume(3);
            }
        } catch (NullPointerException e) {
            C0w9.A07("IgSystemAudioVolumeObserver_updateAudioVolume", e);
        }
        int i2 = c41241vZ.A00;
        if (i2 == 0) {
            i = 0;
        } else {
            i = (c41241vZ.A01 * 100) / i2;
        }
        c41241vZ.A0C = i;
    }

    public final void A02() {
        this.A07.post(new Runnable() { // from class: X.3VE
            @Override // java.lang.Runnable
            public final void run() {
                C41241vZ.A01(C41241vZ.this);
            }
        });
        this.A09.execute(new Runnable() { // from class: X.3VF
            @Override // java.lang.Runnable
            public final void run() {
                C41241vZ c41241vZ = C41241vZ.this;
                try {
                    C41241vZ.A00(c41241vZ);
                    Context context = c41241vZ.A05;
                    context.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, c41241vZ.A08);
                    c41241vZ.A02 = true;
                    AtomicBoolean atomicBoolean = c41241vZ.A0B;
                    if (!atomicBoolean.get()) {
                        IntentFilter intentFilter = new IntentFilter();
                        intentFilter.addAction("android.media.RINGER_MODE_CHANGED");
                        intentFilter.addAction("android.intent.action.HEADSET_PLUG");
                        C0DJ.A03(c41241vZ.A04, context, intentFilter, true);
                        atomicBoolean.set(true);
                    }
                } catch (IllegalStateException e) {
                    C0K8.A0F("IgSystemAudioVolumeObserver", "Unable to register observer/listener", e);
                }
            }
        });
    }

    @Override // X.InterfaceC13000lm
    public final void onSessionWillEnd() {
        this.A09.execute(new PLO(this));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.1vc] */
    public C41241vZ(Context context, AudioManager audioManager) {
        this.A05 = context;
        this.A06 = audioManager;
        final Handler handler = new Handler(C1CG.A00());
        this.A07 = handler;
        this.A08 = new ContentObserver(handler) { // from class: X.1vc
            @Override // android.database.ContentObserver
            public final void onChange(boolean z, android.net.Uri uri) {
                InterfaceC95144Qa interfaceC95144Qa;
                super.onChange(z, uri);
                C41241vZ c41241vZ = this;
                C11T.A05("This operation can't be run on UI thread.");
                int i = c41241vZ.A0C;
                C41241vZ.A01(c41241vZ);
                if (c41241vZ.A0C != i && (interfaceC95144Qa = (InterfaceC95144Qa) c41241vZ.A03.get()) != null) {
                    C11T.A07(false, new PSE(interfaceC95144Qa, c41241vZ, i));
                }
            }
        };
        this.A04 = new BroadcastReceiver() { // from class: X.1vd
            @Override // android.content.BroadcastReceiver
            public final void onReceive(Context context2, Intent intent) {
                int i;
                int A01 = C0f9.A01(-220798960);
                C0fM.A01(this, context2, intent);
                C14360o3.A0B(context2, 0);
                C14360o3.A0B(intent, 1);
                String action = intent.getAction();
                if (action != null) {
                    int hashCode = action.hashCode();
                    if (hashCode != -1676458352) {
                        if (hashCode == 2070024785 && action.equals("android.media.RINGER_MODE_CHANGED")) {
                            C41241vZ c41241vZ = C41241vZ.this;
                            AudioManager audioManager2 = c41241vZ.A06;
                            if (audioManager2 != null) {
                                c41241vZ.A0D = audioManager2.getRingerMode();
                            }
                            i = -1879735727;
                        }
                    } else if (action.equals("android.intent.action.HEADSET_PLUG")) {
                        final C41241vZ c41241vZ2 = C41241vZ.this;
                        final boolean z = false;
                        if (intent.getIntExtra(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATE, 0) == 1) {
                            z = true;
                        }
                        c41241vZ2.A07.post(new Runnable() { // from class: X.5EU
                            @Override // java.lang.Runnable
                            public final void run() {
                                final C41241vZ c41241vZ3 = C41241vZ.this;
                                C41241vZ.A01(c41241vZ3);
                                final boolean z2 = z;
                                C11T.A02(new Runnable() { // from class: X.5EV
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        for (TextureViewSurfaceTextureListenerC147506ka textureViewSurfaceTextureListenerC147506ka : C41241vZ.this.A0A) {
                                            if (z2) {
                                                textureViewSurfaceTextureListenerC147506ka.A15.set(true);
                                                TextureViewSurfaceTextureListenerC147506ka.A0C(textureViewSurfaceTextureListenerC147506ka, AbstractC41221vX.A00().A0C, 100, -6);
                                            }
                                        }
                                    }
                                });
                            }
                        });
                        i = -1879735727;
                    }
                    C0f9.A0E(i, A01, intent);
                }
                i = 14097428;
                C0f9.A0E(i, A01, intent);
            }
        };
        this.A0B = new AtomicBoolean(false);
        this.A03 = new WeakReference(null);
        java.util.Set newSetFromMap = Collections.newSetFromMap(new WeakHashMap());
        C14360o3.A07(newSetFromMap);
        this.A0A = newSetFromMap;
        this.A09 = new C14280ns(1359827262, true);
        this.A01 = -1;
        this.A00 = -1;
        this.A0C = -1;
        this.A0D = -1;
    }
}
