package com.facebook.cameracore.mediapipeline.services.audio.implementation;

import X.AXC;
import X.AXF;
import X.AnonymousClass906;
import X.InterfaceC179337xj;
import com.facebook.cameracore.audiograph.AudioGraphClientProvider;
import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.ServiceConfiguration;
import com.facebook.cameracore.musiceffect.AudioServiceConfigurationAnnouncer;
import com.facebook.cameracore.util.Reference;
import com.facebook.jni.HybridData;
import java.lang.ref.WeakReference;

/* loaded from: classes4.dex */
public class AudioServiceConfigurationHybrid extends ServiceConfiguration {
    public final AnonymousClass906 mConfiguration;
    public final InterfaceC179337xj mPlatformReleaser = new AXF(this);

    private native HybridData initHybrid(boolean z);

    public Reference createAudioPlatform() {
        AudioPlatformComponentHostImpl audioPlatformComponentHostImpl = new AudioPlatformComponentHostImpl(this.mConfiguration.A06, null);
        AnonymousClass906 anonymousClass906 = this.mConfiguration;
        audioPlatformComponentHostImpl.setMuted(anonymousClass906.A05);
        audioPlatformComponentHostImpl.mExternalAudioProvider = anonymousClass906.A01;
        audioPlatformComponentHostImpl.mAudioLogger = anonymousClass906.A03;
        anonymousClass906.A04 = new WeakReference(audioPlatformComponentHostImpl);
        return new AXC(this.mPlatformReleaser, audioPlatformComponentHostImpl);
    }

    public AudioGraphClientProvider getAudioGraphClientProvider() {
        return this.mConfiguration.A00;
    }

    public AudioServiceConfigurationAnnouncer getAudioServiceConfigurationAnnouncer() {
        return this.mConfiguration.A02;
    }

    public AudioServiceConfigurationHybrid(AnonymousClass906 anonymousClass906) {
        this.mHybridData = initHybrid(anonymousClass906.A07);
        this.mConfiguration = anonymousClass906;
    }
}
