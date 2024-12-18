package com.facebook.rsys.polls.gen;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC31180DnO;
import X.AbstractC50523MSb;
import X.C2N9;
import X.JQ0;
import X.YAM;
import com.facebook.djinni.msys.infra.McfReference;
import java.util.ArrayList;

/* loaded from: classes12.dex */
public class PollsCreateActionParams {
    public static C2N9 CONVERTER = YAM.A00(31);
    public static long sMcfTypeId;
    public final ArrayList options;
    public final String pollId;
    public final PollPermissionsModel pollPermissions;
    public final int pollType;
    public final String title;

    public static native PollsCreateActionParams createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PollsCreateActionParams)) {
            return false;
        }
        PollsCreateActionParams pollsCreateActionParams = (PollsCreateActionParams) obj;
        return this.pollId.equals(pollsCreateActionParams.pollId) && this.title.equals(pollsCreateActionParams.title) && this.options.equals(pollsCreateActionParams.options) && this.pollType == pollsCreateActionParams.pollType && this.pollPermissions.equals(pollsCreateActionParams.pollPermissions);
    }

    public int hashCode() {
        return AbstractC166987dD.A0I(this.pollPermissions, (AbstractC166997dE.A0J(this.options, AbstractC166997dE.A0K(this.title, AbstractC50523MSb.A02(this.pollId))) + this.pollType) * 31);
    }

    public PollsCreateActionParams(String str, String str2, ArrayList arrayList, int i, PollPermissionsModel pollPermissionsModel) {
        AbstractC31180DnO.A1U(str, str2, arrayList);
        pollPermissionsModel.getClass();
        this.pollId = str;
        this.title = str2;
        this.options = arrayList;
        this.pollType = i;
        this.pollPermissions = pollPermissionsModel;
    }

    public String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("PollsCreateActionParams{pollId=");
        A1C.append(this.pollId);
        A1C.append(",title=");
        A1C.append(this.title);
        A1C.append(",options=");
        A1C.append(this.options);
        A1C.append(",pollType=");
        A1C.append(this.pollType);
        A1C.append(",pollPermissions=");
        return JQ0.A0l(this.pollPermissions, A1C);
    }
}
