package com.facebook.rsys.metaaivoicestate.gen;

import X.AbstractC166987dD;
import X.AbstractC167017dG;
import X.AbstractC25227BEk;
import X.AbstractC50523MSb;
import X.C2N9;
import X.C55648OnZ;
import X.JQ0;
import com.facebook.djinni.msys.infra.McfReference;

/* loaded from: classes9.dex */
public class MetaAiBotContent {
    public static C2N9 CONVERTER = C55648OnZ.A00(53);
    public static long sMcfTypeId;
    public final MetaAiCaption caption;
    public final String llmResponseContents;

    public static native MetaAiBotContent createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof MetaAiBotContent)) {
                return false;
            }
            MetaAiBotContent metaAiBotContent = (MetaAiBotContent) obj;
            MetaAiCaption metaAiCaption = this.caption;
            MetaAiCaption metaAiCaption2 = metaAiBotContent.caption;
            if (metaAiCaption == null) {
                if (metaAiCaption2 != null) {
                    return false;
                }
            } else if (!metaAiCaption.equals(metaAiCaption2)) {
                return false;
            }
            String str = this.llmResponseContents;
            String str2 = metaAiBotContent.llmResponseContents;
            if (str != null) {
                if (!str.equals(str2)) {
                    return false;
                }
            } else if (str2 != null) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return JQ0.A01(AbstractC167017dG.A0M(this.caption)) + AbstractC25227BEk.A07(this.llmResponseContents);
    }

    public MetaAiBotContent(MetaAiCaption metaAiCaption, String str) {
        this.caption = metaAiCaption;
        this.llmResponseContents = str;
    }

    public String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("MetaAiBotContent{caption=");
        A1C.append(this.caption);
        A1C.append(",llmResponseContents=");
        return AbstractC50523MSb.A0W(this.llmResponseContents, A1C);
    }
}
