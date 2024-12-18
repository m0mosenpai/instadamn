package com.facebook.rsys.polls.gen;

import X.AbstractC167017dG;
import X.AnonymousClass001;
import X.C2N9;
import X.YAM;
import com.facebook.djinni.msys.infra.McfReference;

/* loaded from: classes12.dex */
public class PollOptionContentModel {
    public static C2N9 CONVERTER = YAM.A00(27);
    public static long sMcfTypeId;
    public final String text;

    public static native PollOptionContentModel createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof PollOptionContentModel)) {
                return false;
            }
            String str = this.text;
            String str2 = ((PollOptionContentModel) obj).text;
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
        return 527 + AbstractC167017dG.A0O(this.text);
    }

    public String toString() {
        return AnonymousClass001.A0g("PollOptionContentModel{text=", this.text, "}");
    }

    public PollOptionContentModel(String str) {
        this.text = str;
    }
}
