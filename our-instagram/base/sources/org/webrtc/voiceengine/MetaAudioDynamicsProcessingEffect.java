package org.webrtc.voiceengine;

import X.AbstractC72048XLo;
import android.media.audiofx.DynamicsProcessing;
import org.webrtc.Logging;

/* loaded from: classes12.dex */
public class MetaAudioDynamicsProcessingEffect {
    public static final String TAG = "MetaAudioDynamicsProcessingEffect";
    public int audioSessionId;
    public DynamicsProcessing dp;

    /* loaded from: classes12.dex */
    public class MetaDynamicsProcessingEffectConfig {
        public DynamicsProcessing.Config metaConfig;
    }

    public MetaAudioDynamicsProcessingEffect(int i, DynamicsProcessing.Config config) {
        String str;
        this.audioSessionId = i;
        if (WebRtcAudioEffects.canUseDynamicsProcessing()) {
            try {
                this.dp = new DynamicsProcessing(0, this.audioSessionId, config);
                boolean z = Logging.loggingEnabled;
                DynamicsProcessing.Eq preEq = config.getChannelByChannelIndex(0).getPreEq();
                preEq.isEnabled();
                for (int i2 = 0; i2 < preEq.getBandCount(); i2++) {
                    DynamicsProcessing.EqBand band = preEq.getBand(i2);
                    band.getCutoffFrequency();
                    band.getGain();
                }
                DynamicsProcessing.Mbc A03 = AbstractC72048XLo.A03(config);
                A03.isEnabled();
                for (int i3 = 0; i3 < A03.getBandCount(); i3++) {
                    DynamicsProcessing.MbcBand band2 = A03.getBand(i3);
                    band2.getCutoffFrequency();
                    band2.getAttackTime();
                    band2.getReleaseTime();
                    band2.getThreshold();
                    band2.getRatio();
                    band2.getKneeWidth();
                    band2.getNoiseGateThreshold();
                    band2.getExpanderRatio();
                    band2.getPreGain();
                    band2.getPostGain();
                }
                DynamicsProcessing.Eq postEq = config.getChannelByChannelIndex(0).getPostEq();
                postEq.isEnabled();
                for (int i4 = 0; i4 < postEq.getBandCount(); i4++) {
                    DynamicsProcessing.EqBand band3 = postEq.getBand(i4);
                    band3.getCutoffFrequency();
                    band3.getGain();
                }
                DynamicsProcessing.Limiter limiter = config.getChannelByChannelIndex(0).getLimiter();
                limiter.isEnabled();
                limiter.getAttackTime();
                limiter.getReleaseTime();
                limiter.getThreshold();
                limiter.getPostGain();
                limiter.getRatio();
                limiter.getLinkGroup();
            } catch (Exception e) {
                e = e;
                str = "MetaAudioDynamicsProcessingEffect failed to create";
                Logging.e(TAG, str, e);
            } catch (NoClassDefFoundError e2) {
                e = e2;
                str = "MetaAudioDynamicsProcessingEffect creation encountered NoClassDefFoundError";
                Logging.e(TAG, str, e);
            }
        }
    }

    public void enable(boolean z) {
        DynamicsProcessing dynamicsProcessing = this.dp;
        if (dynamicsProcessing != null) {
            dynamicsProcessing.getEnabled();
            if (this.dp.setEnabled(z) != 0) {
                boolean z2 = Logging.loggingEnabled;
            }
            this.dp.getEnabled();
            boolean z3 = Logging.loggingEnabled;
        }
    }

    public void release() {
        DynamicsProcessing dynamicsProcessing = this.dp;
        if (dynamicsProcessing != null) {
            dynamicsProcessing.release();
            this.dp = null;
        }
    }
}
