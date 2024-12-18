package com.facebook.rsys.metaaivoicestate.gen;

import X.AbstractC166987dD;
import X.AbstractC167017dG;
import X.C2N9;
import X.C55648OnZ;
import X.JQ0;
import com.facebook.djinni.msys.infra.McfReference;

/* loaded from: classes9.dex */
public class MetaAiUserContent {
    public static C2N9 CONVERTER = C55648OnZ.A00(54);
    public static long sMcfTypeId;
    public final MetaAiCaption caption;

    public static native MetaAiUserContent createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof MetaAiUserContent)) {
                return false;
            }
            MetaAiCaption metaAiCaption = this.caption;
            MetaAiCaption metaAiCaption2 = ((MetaAiUserContent) obj).caption;
            if (metaAiCaption != null) {
                if (!metaAiCaption.equals(metaAiCaption2)) {
                    return false;
                }
            } else if (metaAiCaption2 != null) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return 527 + AbstractC167017dG.A0M(this.caption);
    }

    public MetaAiUserContent(MetaAiCaption metaAiCaption) {
        this.caption = metaAiCaption;
    }

    public String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("MetaAiUserContent{caption=");
        return JQ0.A0l(this.caption, A1C);
    }
}
