package com.facebook.rsys.metaaivoicestate.gen;

import X.AbstractC25226BEj;
import X.AbstractC50523MSb;
import X.AnonymousClass001;
import X.C2N9;
import X.YAM;
import com.facebook.djinni.msys.infra.McfReference;

/* loaded from: classes12.dex */
public class MetaAiCaption {
    public static C2N9 CONVERTER = YAM.A00(6);
    public static long sMcfTypeId;
    public final String language;
    public final String text;

    public static native MetaAiCaption createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MetaAiCaption)) {
            return false;
        }
        MetaAiCaption metaAiCaption = (MetaAiCaption) obj;
        return this.text.equals(metaAiCaption.text) && this.language.equals(metaAiCaption.language);
    }

    public int hashCode() {
        return AbstractC25226BEj.A03(this.language, AbstractC50523MSb.A02(this.text));
    }

    public String toString() {
        return AnonymousClass001.A11("MetaAiCaption{text=", this.text, ",language=", this.language, "}");
    }

    public MetaAiCaption(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.text = str;
        this.language = str2;
    }
}
