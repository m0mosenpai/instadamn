package com.facebook.rsys.polls.gen;

import X.AnonymousClass001;
import X.C2N9;
import X.YAM;
import com.facebook.djinni.msys.infra.McfReference;

/* loaded from: classes12.dex */
public class PollPermissionsModel {
    public static C2N9 CONVERTER = YAM.A00(29);
    public static long sMcfTypeId;
    public final boolean canRemove;

    public static native PollPermissionsModel createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof PollPermissionsModel) && this.canRemove == ((PollPermissionsModel) obj).canRemove;
        }
        return true;
    }

    public int hashCode() {
        return 527 + (this.canRemove ? 1 : 0);
    }

    public String toString() {
        return AnonymousClass001.A1B("PollPermissionsModel{canRemove=", "}", this.canRemove);
    }

    public PollPermissionsModel(boolean z) {
        this.canRemove = z;
    }
}
