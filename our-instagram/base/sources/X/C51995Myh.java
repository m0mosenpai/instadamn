package X;

import com.facebook.rsys.audio.gen.AudioApi;
import com.facebook.rsys.audio.gen.AudioDeviceModule;
import com.facebook.rsys.audio.gen.AudioInputRoute;
import com.facebook.rsys.audio.gen.AudioOutputRoute;
import com.facebook.rsys.audio.gen.AudioProxy;
import java.util.ArrayList;

/* renamed from: X.Myh, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51995Myh extends AbstractC51997Myj {
    public final AudioProxy A00;

    @Override // com.facebook.rsys.audio.gen.AudioProxy
    public final void setApi(AudioApi audioApi) {
        C14360o3.A0B(audioApi, 0);
        this.A00.setApi(audioApi);
    }

    @Override // com.facebook.rsys.audio.gen.AudioProxy
    public final void setAudioDeviceModule(AudioDeviceModule audioDeviceModule) {
        C14360o3.A0B(audioDeviceModule, 0);
        this.A00.setAudioDeviceModule(audioDeviceModule);
    }

    @Override // com.facebook.rsys.audio.gen.AudioProxy
    public final void setAudioInputRoute(AudioInputRoute audioInputRoute) {
        C14360o3.A0B(audioInputRoute, 0);
        this.A00.setAudioInputRoute(audioInputRoute);
    }

    @Override // com.facebook.rsys.audio.gen.AudioProxy
    public final void setAudioOutputRoute(AudioOutputRoute audioOutputRoute, boolean z, boolean z2) {
        C14360o3.A0B(audioOutputRoute, 0);
        this.A00.setAudioOutputRoute(audioOutputRoute, z, z2);
    }

    @Override // com.facebook.rsys.audio.gen.AudioProxy
    public final ArrayList createAvailableAudioInputRoutes() {
        ArrayList createAvailableAudioInputRoutes = this.A00.createAvailableAudioInputRoutes();
        C14360o3.A07(createAvailableAudioInputRoutes);
        return createAvailableAudioInputRoutes;
    }

    @Override // com.facebook.rsys.audio.gen.AudioProxy
    public final ArrayList createAvailableAudioOutputRoutes() {
        ArrayList createAvailableAudioOutputRoutes = this.A00.createAvailableAudioOutputRoutes();
        C14360o3.A07(createAvailableAudioOutputRoutes);
        return createAvailableAudioOutputRoutes;
    }

    @Override // com.facebook.rsys.audio.gen.AudioProxy
    public final void setAudioOn(boolean z, boolean z2) {
        this.A00.setAudioOn(z, z2);
    }

    @Override // com.facebook.rsys.audio.gen.AudioProxy
    public final void setIsCallActive(boolean z) {
        this.A00.setIsCallActive(z);
    }

    public C51995Myh(AudioProxy audioProxy) {
        this.A00 = audioProxy;
    }
}
