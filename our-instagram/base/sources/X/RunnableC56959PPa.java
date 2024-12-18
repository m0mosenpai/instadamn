package X;

import com.facebook.rsys.audio.gen.AudioApi;
import com.facebook.rsys.audio.gen.AudioOutputRoute;

/* renamed from: X.PPa, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class RunnableC56959PPa implements Runnable {
    public final /* synthetic */ AudioOutputRoute A00;
    public final /* synthetic */ C51996Myi A01;

    public RunnableC56959PPa(AudioOutputRoute audioOutputRoute, C51996Myi c51996Myi) {
        this.A01 = c51996Myi;
        this.A00 = audioOutputRoute;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC57907PmC interfaceC57907PmC;
        C51996Myi c51996Myi = this.A01;
        AudioApi audioApi = c51996Myi.A00;
        if (audioApi != null) {
            audioApi.setAudioOutputRoute(this.A00);
        }
        if (C14360o3.A0K(AudioOutputRoute.UNKNOWN, this.A00) && (interfaceC57907PmC = c51996Myi.A01) != null) {
            interfaceC57907PmC.Cy5();
        }
    }
}
