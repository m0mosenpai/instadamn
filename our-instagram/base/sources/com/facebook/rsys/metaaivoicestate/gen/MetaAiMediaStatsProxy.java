package com.facebook.rsys.metaaivoicestate.gen;

import X.C2N9;
import X.YAM;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;

/* loaded from: classes12.dex */
public abstract class MetaAiMediaStatsProxy {
    public static C2N9 CONVERTER = YAM.A00(7);

    /* loaded from: classes12.dex */
    public final class CProxy extends MetaAiMediaStatsProxy {
        public static long sMcfTypeId;
        public final NativeHolder mNativeHolder;

        public static native MetaAiMediaStatsProxy createFromMcfType(McfReference mcfReference);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        public native int hashCode();

        @Override // com.facebook.rsys.metaaivoicestate.gen.MetaAiMediaStatsProxy
        public native void onCreatorBotClientReadyMessage(CreatorBotClientReadyMessage creatorBotClientReadyMessage);

        @Override // com.facebook.rsys.metaaivoicestate.gen.MetaAiMediaStatsProxy
        public native void onGenAiMediaStats(GenAiMediaStats genAiMediaStats);

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && (obj instanceof MetaAiMediaStatsProxy)) {
                return nativeEquals(obj);
            }
            return false;
        }

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }
    }

    public abstract void onCreatorBotClientReadyMessage(CreatorBotClientReadyMessage creatorBotClientReadyMessage);

    public abstract void onGenAiMediaStats(GenAiMediaStats genAiMediaStats);
}
