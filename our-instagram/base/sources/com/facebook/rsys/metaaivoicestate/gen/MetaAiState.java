package com.facebook.rsys.metaaivoicestate.gen;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167017dG;
import X.JQ0;
import com.facebook.djinni.msys.infra.McfReference;

/* loaded from: classes9.dex */
public class MetaAiState {
    public final MetaAiBotContent botContent;
    public final int state;
    public final MetaAiUserContent userContent;

    public static native MetaAiState createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof MetaAiState)) {
                return false;
            }
            MetaAiState metaAiState = (MetaAiState) obj;
            if (this.state == metaAiState.state) {
                MetaAiBotContent metaAiBotContent = this.botContent;
                MetaAiBotContent metaAiBotContent2 = metaAiState.botContent;
                if (metaAiBotContent == null) {
                    if (metaAiBotContent2 != null) {
                        return false;
                    }
                } else if (!metaAiBotContent.equals(metaAiBotContent2)) {
                    return false;
                }
                MetaAiUserContent metaAiUserContent = this.userContent;
                MetaAiUserContent metaAiUserContent2 = metaAiState.userContent;
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

    public final int hashCode() {
        return ((JQ0.A01(this.state) + AbstractC167017dG.A0M(this.botContent)) * 31) + AbstractC166997dE.A0I(this.userContent);
    }

    public MetaAiState(int i, MetaAiBotContent metaAiBotContent, MetaAiUserContent metaAiUserContent) {
        this.state = i;
        this.botContent = metaAiBotContent;
        this.userContent = metaAiUserContent;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("MetaAiState{state=");
        A1C.append(this.state);
        A1C.append(",botContent=");
        A1C.append(this.botContent);
        A1C.append(",userContent=");
        return JQ0.A0l(this.userContent, A1C);
    }
}
