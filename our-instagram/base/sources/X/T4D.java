package X;

import android.content.Context;
import android.content.IntentFilter;
import android.media.AudioManager;
import android.os.Handler;
import org.webrtc.MediaStreamTrack;

/* loaded from: classes10.dex */
public final class T4D implements C5PX {
    public int A00;
    public int A01;
    public Q1h A02;
    public boolean A03;
    public final Handler A04;
    public final Context A05;
    public final AudioManager A06;
    public final C5P9 A07;

    public static void A00(T4D t4d) {
        int streamMaxVolume;
        AudioManager audioManager = t4d.A06;
        int i = t4d.A00;
        try {
            streamMaxVolume = audioManager.getStreamVolume(i);
        } catch (RuntimeException e) {
            AbstractC46512Bo.A06("StreamVolumeManager", AnonymousClass001.A0O("Could not retrieve stream volume for stream type ", i), e);
            streamMaxVolume = audioManager.getStreamMaxVolume(i);
        }
        boolean isStreamMute = audioManager.isStreamMute(t4d.A00);
        if (t4d.A01 != streamMaxVolume || t4d.A03 != isStreamMute) {
            t4d.A01 = streamMaxVolume;
            t4d.A03 = isStreamMute;
            C5P4 c5p4 = ((C5P5) t4d.A07).A00;
            C5P4 c5p42 = C5P4.$redex_init_class;
            C5PE c5pe = c5p4.A0h;
            c5pe.A02(new InterfaceC116555Pk() { // from class: X.T4i
                @Override // X.InterfaceC116555Pk
                public final void CP5(Object obj) {
                }
            }, 30);
            c5pe.A01();
        }
    }

    @Override // X.C5PX
    public final int BQA() {
        return this.A06.getStreamMaxVolume(this.A00);
    }

    @Override // X.C5PX
    public final int BU2() {
        return this.A06.getStreamMinVolume(this.A00);
    }

    @Override // X.C5PX
    public final void Ef0(int i) {
        if (this.A00 != i) {
            this.A00 = i;
            A00(this);
            C5P4 c5p4 = ((C5P5) this.A07).A00;
            C5PX c5px = c5p4.A0d;
            final C116465Pb c116465Pb = new C116465Pb(c5px.BU2(), c5px.BQA());
            if (!c116465Pb.equals(c5p4.A09)) {
                c5p4.A09 = c116465Pb;
                C5PE c5pe = c5p4.A0h;
                c5pe.A02(new InterfaceC116555Pk() { // from class: X.T4j
                    @Override // X.InterfaceC116555Pk
                    public final void CP5(Object obj) {
                    }
                }, 29);
                c5pe.A01();
            }
        }
    }

    @Override // X.C5PX
    public final void release() {
        Q1h q1h = this.A02;
        if (q1h != null) {
            try {
                this.A05.unregisterReceiver(q1h);
            } catch (RuntimeException e) {
                AbstractC46512Bo.A06("StreamVolumeManager", "Error unregistering stream volume receiver", e);
            }
            this.A02 = null;
        }
    }

    public T4D(Context context, Handler handler, C5P9 c5p9) {
        int streamMaxVolume;
        Context applicationContext = context.getApplicationContext();
        this.A05 = applicationContext;
        this.A04 = handler;
        this.A07 = c5p9;
        Object systemService = applicationContext.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
        C4B8.A01(systemService);
        AudioManager audioManager = (AudioManager) systemService;
        this.A06 = audioManager;
        this.A00 = 3;
        try {
            streamMaxVolume = audioManager.getStreamVolume(3);
        } catch (RuntimeException e) {
            AbstractC46512Bo.A06("StreamVolumeManager", AnonymousClass001.A0O("Could not retrieve stream volume for stream type ", 3), e);
            streamMaxVolume = audioManager.getStreamMaxVolume(3);
        }
        this.A01 = streamMaxVolume;
        this.A03 = audioManager.isStreamMute(3);
        Q1h q1h = new Q1h(this);
        try {
            applicationContext.registerReceiver(q1h, new IntentFilter("android.media.VOLUME_CHANGED_ACTION"));
            this.A02 = q1h;
        } catch (RuntimeException e2) {
            AbstractC46512Bo.A06("StreamVolumeManager", "Error registering stream volume receiver", e2);
        }
    }
}
