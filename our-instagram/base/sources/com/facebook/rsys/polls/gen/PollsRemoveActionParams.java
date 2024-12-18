package com.facebook.rsys.polls.gen;

import X.AnonymousClass001;
import X.C2N9;
import X.YAM;
import com.facebook.djinni.msys.infra.McfReference;

/* loaded from: classes12.dex */
public class PollsRemoveActionParams {
    public static C2N9 CONVERTER = YAM.A00(33);
    public static long sMcfTypeId;
    public final String pollId;

    public static native PollsRemoveActionParams createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PollsRemoveActionParams)) {
            return false;
        }
        return this.pollId.equals(((PollsRemoveActionParams) obj).pollId);
    }

    public int hashCode() {
        return 527 + this.pollId.hashCode();
    }

    public String toString() {
        return AnonymousClass001.A0g("PollsRemoveActionParams{pollId=", this.pollId, "}");
    }

    public PollsRemoveActionParams(String str) {
        str.getClass();
        this.pollId = str;
    }
}
