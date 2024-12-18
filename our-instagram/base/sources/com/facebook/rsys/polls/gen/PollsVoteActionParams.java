package com.facebook.rsys.polls.gen;

import X.AnonymousClass001;
import X.C2N9;
import X.YAM;
import com.facebook.djinni.msys.infra.McfReference;

/* loaded from: classes12.dex */
public class PollsVoteActionParams {
    public static C2N9 CONVERTER = YAM.A00(35);
    public static long sMcfTypeId;
    public final String pollOptionId;

    public static native PollsVoteActionParams createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PollsVoteActionParams)) {
            return false;
        }
        return this.pollOptionId.equals(((PollsVoteActionParams) obj).pollOptionId);
    }

    public int hashCode() {
        return 527 + this.pollOptionId.hashCode();
    }

    public String toString() {
        return AnonymousClass001.A0g("PollsVoteActionParams{pollOptionId=", this.pollOptionId, "}");
    }

    public PollsVoteActionParams(String str) {
        str.getClass();
        this.pollOptionId = str;
    }
}
