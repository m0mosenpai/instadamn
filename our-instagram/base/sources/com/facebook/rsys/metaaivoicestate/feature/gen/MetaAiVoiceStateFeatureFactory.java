package com.facebook.rsys.metaaivoicestate.feature.gen;

import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.rsys.base.gen.FeatureHolder;
import com.facebook.rsys.metaaivoicestate.gen.MetaAiMediaStatsProxy;
import com.facebook.rsys.metaaivoicestate.gen.MetaAiVoiceStateProxy;

/* loaded from: classes9.dex */
public abstract class MetaAiVoiceStateFeatureFactory {

    /* loaded from: classes9.dex */
    public final class CProxy extends MetaAiVoiceStateFeatureFactory {
        public static native FeatureHolder create(MetaAiVoiceStateProxy metaAiVoiceStateProxy, MetaAiMediaStatsProxy metaAiMediaStatsProxy);

        public static native MetaAiVoiceStateFeatureFactory createFromMcfType(McfReference mcfReference);

        public static native long nativeGetMcfTypeId();
    }
}
