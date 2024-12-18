package com.facebook.rsys.audio.gen;

import X.AbstractC25226BEj;
import X.AbstractC50523MSb;
import X.AnonymousClass001;
import X.C2N9;
import X.YAN;
import com.facebook.djinni.msys.infra.McfReference;

/* loaded from: classes12.dex */
public class AudioInputRoute {
    public static long sMcfTypeId;
    public final String identifier;
    public final String name;
    public static final AudioInputRoute DEFAULT = new AudioInputRoute("default_audio_input_route", "Default audio input route");
    public static C2N9 CONVERTER = YAN.A00(6);

    public static native AudioInputRoute createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AudioInputRoute)) {
            return false;
        }
        AudioInputRoute audioInputRoute = (AudioInputRoute) obj;
        return this.identifier.equals(audioInputRoute.identifier) && this.name.equals(audioInputRoute.name);
    }

    public int hashCode() {
        return AbstractC25226BEj.A03(this.name, AbstractC50523MSb.A02(this.identifier));
    }

    public String toString() {
        return AnonymousClass001.A11("AudioInputRoute{identifier=", this.identifier, ",name=", this.name, "}");
    }

    public AudioInputRoute(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.identifier = str;
        this.name = str2;
    }
}
