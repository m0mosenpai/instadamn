package X;

import android.content.Context;
import android.media.AudioManager;
import com.facebook.rsys.audio.gen.AudioApi;
import com.facebook.rsys.audio.gen.AudioDeviceModule;
import com.facebook.rsys.audio.gen.AudioInputRoute;
import com.facebook.rsys.audio.gen.AudioOutputRoute;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import org.webrtc.MediaStreamTrack;

/* renamed from: X.Myi, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51996Myi extends AbstractC51997Myj {
    public AudioApi A00;
    public InterfaceC57907PmC A01;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public AudioDeviceModule A07;
    public Executor A08;
    public final C54580O9h A09;
    public final C55000OUz A0A;
    public final boolean A0C;
    public volatile AudioOutputRoute A0E;
    public final Object A0D = new Object();
    public final Collection A0B = Collections.synchronizedCollection(AbstractC166987dD.A1E());
    public String A02 = AudioOutputRoute.UNKNOWN.identifier;

    public final void A00(AudioOutputRoute audioOutputRoute) {
        C14360o3.A0B(audioOutputRoute, 0);
        C55000OUz c55000OUz = this.A0A;
        if (c55000OUz != null) {
            c55000OUz.A00(AnonymousClass001.A0R("product route update ", audioOutputRoute.name), new Object[0]);
        }
        this.A0E = audioOutputRoute;
        RunnableC56959PPa runnableC56959PPa = new RunnableC56959PPa(audioOutputRoute, this);
        if (this.A00 != null) {
            runnableC56959PPa.run();
        } else {
            this.A0B.add(runnableC56959PPa);
        }
    }

    @Override // com.facebook.rsys.audio.gen.AudioProxy
    public final void setApi(AudioApi audioApi) {
        C14360o3.A0B(audioApi, 0);
        this.A00 = audioApi;
        Collection collection = this.A0B;
        C14360o3.A06(collection);
        synchronized (collection) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
            collection.clear();
        }
    }

    @Override // com.facebook.rsys.audio.gen.AudioProxy
    public final void setAudioDeviceModule(AudioDeviceModule audioDeviceModule) {
        C14360o3.A0B(audioDeviceModule, 0);
        synchronized (this.A0D) {
            this.A07 = audioDeviceModule;
        }
    }

    @Override // com.facebook.rsys.audio.gen.AudioProxy
    public final void setAudioInputRoute(AudioInputRoute audioInputRoute) {
    }

    @Override // com.facebook.rsys.audio.gen.AudioProxy
    public final void setAudioOutputRoute(AudioOutputRoute audioOutputRoute, boolean z, boolean z2) {
        C14360o3.A0B(audioOutputRoute, 0);
        PS8 ps8 = new PS8(audioOutputRoute, this, z);
        Executor executor = this.A08;
        if (executor == null) {
            ps8.run();
        } else {
            executor.execute(ps8);
        }
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [X.Pq0, java.lang.Object] */
    public C51996Myi(Context context, InterfaceC57907PmC interfaceC57907PmC, C53738Npq c53738Npq, InterfaceC58103PpS interfaceC58103PpS, C55000OUz c55000OUz, C54156Nws c54156Nws, C1W6 c1w6, Integer num, Executor executor, ExecutorService executorService, C12W c12w, boolean z) {
        OMu n09;
        this.A08 = executor;
        this.A0C = z;
        this.A0A = c55000OUz;
        this.A01 = interfaceC57907PmC;
        C54757OHm c54757OHm = new C54757OHm(this);
        ?? obj = new Object();
        Object systemService = context.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
        C14360o3.A0C(systemService, "null cannot be cast to non-null type android.media.AudioManager");
        AudioManager audioManager = (AudioManager) systemService;
        C55100ObB c55100ObB = new C55100ObB(context, audioManager, c53738Npq, interfaceC58103PpS, c55000OUz, c12w);
        OMO omo = new OMO(audioManager);
        if (num.intValue() != 0) {
            if (c1w6 != null) {
                n09 = new N08(context, audioManager, c54757OHm, c55100ObB, interfaceC58103PpS, c55000OUz, omo, c54156Nws, c1w6, executorService);
            } else {
                throw AbstractC166987dD.A14("ConnectionServiceAudioOutputManagerImpl requires a CallAudioStateManager implementation");
            }
        } else {
            n09 = new N09(context, audioManager, c54757OHm, new C55038OZk(c55100ObB, interfaceC58103PpS, c55000OUz), c53738Npq, interfaceC58103PpS, c55000OUz, omo, c54156Nws, executorService, c12w);
        }
        this.A09 = new C54580O9h(n09, c55000OUz, new OWW(audioManager, c55000OUz, obj));
    }

    @Override // com.facebook.rsys.audio.gen.AudioProxy
    public final ArrayList createAvailableAudioInputRoutes() {
        return AbstractC16960so.A1M(AudioInputRoute.DEFAULT);
    }

    @Override // com.facebook.rsys.audio.gen.AudioProxy
    public final ArrayList createAvailableAudioOutputRoutes() {
        return AbstractC16960so.A1M(AudioOutputRoute.UNKNOWN, AudioOutputRoute.EARPIECE, AudioOutputRoute.SPEAKER, AudioOutputRoute.HEADSET, AudioOutputRoute.BLUETOOTH);
    }

    @Override // com.facebook.rsys.audio.gen.AudioProxy
    public final void setAudioOn(boolean z, boolean z2) {
        RunnableC56961PPc runnableC56961PPc = new RunnableC56961PPc(this, z);
        Executor executor = this.A08;
        if (executor == null) {
            runnableC56961PPc.run();
        } else {
            executor.execute(runnableC56961PPc);
        }
    }

    @Override // com.facebook.rsys.audio.gen.AudioProxy
    public final void setIsCallActive(boolean z) {
        RunnableC56962PPd runnableC56962PPd = new RunnableC56962PPd(this, z);
        Executor executor = this.A08;
        if (executor == null) {
            runnableC56962PPd.run();
        } else {
            executor.execute(runnableC56962PPd);
        }
    }
}
