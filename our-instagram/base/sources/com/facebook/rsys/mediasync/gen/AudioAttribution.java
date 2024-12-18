package com.facebook.rsys.mediasync.gen;

import X.AbstractC25226BEj;
import X.AbstractC50523MSb;
import X.AnonymousClass001;
import X.C2N9;
import X.C55648OnZ;
import com.facebook.djinni.msys.infra.McfReference;

/* loaded from: classes9.dex */
public class AudioAttribution {
    public static C2N9 CONVERTER = C55648OnZ.A00(40);
    public static long sMcfTypeId;
    public final String artistName;
    public final String songTitle;

    public static native AudioAttribution createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AudioAttribution)) {
            return false;
        }
        AudioAttribution audioAttribution = (AudioAttribution) obj;
        return this.artistName.equals(audioAttribution.artistName) && this.songTitle.equals(audioAttribution.songTitle);
    }

    public int hashCode() {
        return AbstractC25226BEj.A03(this.songTitle, AbstractC50523MSb.A02(this.artistName));
    }

    public String toString() {
        return AnonymousClass001.A11("AudioAttribution{artistName=", this.artistName, ",songTitle=", this.songTitle, "}");
    }

    public AudioAttribution(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.artistName = str;
        this.songTitle = str2;
    }
}
