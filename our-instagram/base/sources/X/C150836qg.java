package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.facebook.cameracore.mediapipeline.services.music.MusicItem;
import com.facebook.cameracore.mediapipeline.services.music.MusicServiceDataSource;
import com.facebook.native_bridge.NativeDataPromise;

/* renamed from: X.6qg, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C150836qg implements MusicServiceDataSource {
    public static final String[] A0E = {"com.android.music.metachanged", "com.android.music.playstatechanged", "com.android.music.updateprogress", "com.htc.music.metachanged", "com.htc.music.playstatechanged", "fm.last.android.metachanged", "fm.last.android.playstatechanged", "com.amazon.mp3.metachanged", "com.amazon.mp3.playstatechanged", "com.real.IMP.metachanged", "com.real.IMP.playstatechanged", "com.sonyericsson.music.metachanged", "com.sonyericsson.music.playstatechanged", "com.spotify.music.metadatachanged", "com.spotify.music.playbackstatechanged", "com.samsung.sec.android.MusicPlayer.playstatechanged", "com.samsung.sec.android.MusicPlayer.metachanged"};
    public MusicItem A01;
    public String A02;
    public String A03;
    public String A04;
    public boolean A05;
    public NativeDataPromise A06;
    public NativeDataPromise A07;
    public NativeDataPromise A08;
    public NativeDataPromise A09;
    public NativeDataPromise A0A;
    public final BroadcastReceiver A0B;
    public final Context A0C;
    public int A00 = -1;
    public final IntentFilter A0D = new IntentFilter();

    public static void A00(C150836qg c150836qg) {
        NativeDataPromise nativeDataPromise;
        NativeDataPromise nativeDataPromise2;
        NativeDataPromise nativeDataPromise3;
        NativeDataPromise nativeDataPromise4;
        NativeDataPromise nativeDataPromise5;
        if (!c150836qg.A05) {
            c150836qg.A05 = true;
            C0DJ.A03(c150836qg.A0B, c150836qg.A0C, c150836qg.A0D, true);
        }
        String str = c150836qg.A04;
        if (str != null && (nativeDataPromise5 = c150836qg.A0A) != null) {
            nativeDataPromise5.setValue(str);
            c150836qg.A0A = null;
        }
        String str2 = c150836qg.A02;
        if (str2 != null && (nativeDataPromise4 = c150836qg.A07) != null) {
            nativeDataPromise4.setValue(str2);
            c150836qg.A07 = null;
        }
        String str3 = c150836qg.A03;
        if (str3 != null && (nativeDataPromise3 = c150836qg.A08) != null) {
            nativeDataPromise3.setValue(str3);
            c150836qg.A08 = null;
        }
        int i = c150836qg.A00;
        if (i != -1 && (nativeDataPromise2 = c150836qg.A09) != null) {
            nativeDataPromise2.setValue(Integer.valueOf(i));
            c150836qg.A09 = null;
        }
        MusicItem musicItem = c150836qg.A01;
        if (musicItem != null && (nativeDataPromise = c150836qg.A06) != null) {
            nativeDataPromise.setValue(musicItem);
            c150836qg.A06 = null;
        }
    }

    @Override // com.facebook.cameracore.mediapipeline.services.music.MusicServiceDataSource
    public final void getCurrentPlayingItem(NativeDataPromise nativeDataPromise) {
        this.A06 = nativeDataPromise;
        A00(this);
    }

    @Override // com.facebook.cameracore.mediapipeline.services.music.MusicServiceDataSource
    public final void getCurrentSongArtist(NativeDataPromise nativeDataPromise) {
        this.A07 = nativeDataPromise;
        A00(this);
    }

    @Override // com.facebook.cameracore.mediapipeline.services.music.MusicServiceDataSource
    public final void getCurrentSongGenre(NativeDataPromise nativeDataPromise) {
        this.A08 = nativeDataPromise;
        A00(this);
    }

    @Override // com.facebook.cameracore.mediapipeline.services.music.MusicServiceDataSource
    public final void getCurrentSongPlaybackTimeMs(NativeDataPromise nativeDataPromise) {
        this.A09 = nativeDataPromise;
        A00(this);
    }

    @Override // com.facebook.cameracore.mediapipeline.services.music.MusicServiceDataSource
    public final void getCurrentSongTitle(NativeDataPromise nativeDataPromise) {
        this.A0A = nativeDataPromise;
        A00(this);
    }

    @Override // com.facebook.cameracore.mediapipeline.services.music.MusicServiceDataSource
    public final void stop() {
        if (this.A05) {
            this.A0C.unregisterReceiver(this.A0B);
        }
        this.A05 = false;
    }

    public C150836qg(Context context) {
        this.A0C = context;
        String[] strArr = A0E;
        int i = 0;
        do {
            this.A0D.addAction(strArr[i]);
            i++;
        } while (i < 17);
        this.A0B = new BroadcastReceiver() { // from class: X.6qi
            @Override // android.content.BroadcastReceiver
            public final void onReceive(Context context2, Intent intent) {
                int i2;
                int A01 = C0f9.A01(-524264249);
                C0fM.A01(this, context2, intent);
                if (!C08310bt.A02().A00(context2, intent, this)) {
                    i2 = -1898751302;
                } else {
                    C150836qg c150836qg = C150836qg.this;
                    c150836qg.A04 = intent.getStringExtra("track");
                    c150836qg.A02 = intent.getStringExtra("artist");
                    c150836qg.A03 = intent.getStringExtra("genre");
                    c150836qg.A00 = intent.getIntExtra("position", -1);
                    c150836qg.A01 = new MusicItem(c150836qg.A04, c150836qg.A02, c150836qg.A03);
                    C150836qg.A00(c150836qg);
                    i2 = 1226960225;
                }
                C0f9.A0E(i2, A01, intent);
            }
        };
    }
}
