package com.facebook.rsys.polls.gen;

import X.AbstractC167017dG;
import X.AnonymousClass001;
import X.C2N9;
import X.YAM;
import com.facebook.djinni.msys.infra.McfReference;

/* loaded from: classes12.dex */
public class PollParticipantModel {
    public static C2N9 CONVERTER = YAM.A00(28);
    public static long sMcfTypeId;
    public final String fbid;

    public static native PollParticipantModel createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof PollParticipantModel)) {
                return false;
            }
            String str = this.fbid;
            String str2 = ((PollParticipantModel) obj).fbid;
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
        return 527 + AbstractC167017dG.A0O(this.fbid);
    }

    public String toString() {
        return AnonymousClass001.A0g("PollParticipantModel{fbid=", this.fbid, "}");
    }

    public PollParticipantModel(String str) {
        this.fbid = str;
    }
}
