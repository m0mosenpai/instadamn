package com.facebook.rsys.metaaivoicestate.gen;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167017dG;
import X.C2N9;
import X.C55648OnZ;
import X.JQ0;
import com.facebook.djinni.msys.infra.McfReference;

/* loaded from: classes9.dex */
public class MetaAiVoiceState {
    public static C2N9 CONVERTER = C55648OnZ.A00(55);
    public static long sMcfTypeId;
    public final MetaAiBotContent botContent;
    public final int state;
    public final MetaAiUserContent userContent;

    public static native MetaAiVoiceState createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof MetaAiVoiceState)) {
                return false;
            }
            MetaAiVoiceState metaAiVoiceState = (MetaAiVoiceState) obj;
            if (this.state == metaAiVoiceState.state) {
                MetaAiBotContent metaAiBotContent = this.botContent;
                MetaAiBotContent metaAiBotContent2 = metaAiVoiceState.botContent;
                if (metaAiBotContent == null) {
                    if (metaAiBotContent2 != null) {
                        return false;
                    }
                } else if (!metaAiBotContent.equals(metaAiBotContent2)) {
                    return false;
                }
                MetaAiUserContent metaAiUserContent = this.userContent;
                MetaAiUserContent metaAiUserContent2 = metaAiVoiceState.userContent;
                if (metaAiUserContent != null) {
                    if (!metaAiUserContent.equals(metaAiUserContent2)) {
                        return false;
                    }
                } else if (metaAiUserContent2 != null) {
                    return false;
                }
            } else {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return ((JQ0.A01(this.state) + AbstractC167017dG.A0M(this.botContent)) * 31) + AbstractC166997dE.A0I(this.userContent);
    }

    public MetaAiVoiceState(int i, MetaAiBotContent metaAiBotContent, MetaAiUserContent metaAiUserContent) {
        this.state = i;
        this.botContent = metaAiBotContent;
        this.userContent = metaAiUserContent;
    }

    public String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("MetaAiVoiceState{state=");
        A1C.append(this.state);
        A1C.append(",botContent=");
        A1C.append(this.botContent);
        A1C.append(",userContent=");
        return JQ0.A0l(this.userContent, A1C);
    }
}
