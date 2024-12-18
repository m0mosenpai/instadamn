package X;

import com.facebook.rsys.audiomodule.gen.AudioModule;
import com.facebook.rsys.audiomodule.gen.AudioModuleFeatureFactory;
import com.facebook.rsys.connectfunnel.gen.ConnectFunnelFeatureFactory;
import com.facebook.rsys.metaaivoicestate.feature.gen.MetaAiVoiceStateFeatureFactory;
import com.facebook.rsys.metaaivoicestate.gen.MetaAiVoiceStateProxy;
import com.instagram.common.session.UserSession;
import com.instagram.rtc.rsys.proxies.IGRTCFeatureProviderProxy;
import java.util.ArrayList;

/* loaded from: classes9.dex */
public final class NUB extends IGRTCFeatureProviderProxy {
    public final AudioModule A00;
    public final MetaAiVoiceStateProxy A01;
    public final UserSession A02;

    public NUB(AudioModule audioModule, MetaAiVoiceStateProxy metaAiVoiceStateProxy, UserSession userSession) {
        C14360o3.A0B(metaAiVoiceStateProxy, 3);
        this.A02 = userSession;
        this.A00 = audioModule;
        this.A01 = metaAiVoiceStateProxy;
    }

    @Override // com.instagram.rtc.rsys.proxies.IGRTCFeatureProviderProxy
    public final ArrayList createFeatureHolders() {
        return AbstractC16960so.A1M(AudioModuleFeatureFactory.CProxy.create(this.A00, true, true), ConnectFunnelFeatureFactory.CProxy.create(new C52008Mz7(this.A02), false), MetaAiVoiceStateFeatureFactory.CProxy.create(this.A01, null));
    }
}
