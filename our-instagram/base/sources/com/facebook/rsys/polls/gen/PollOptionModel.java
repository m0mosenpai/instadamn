package com.facebook.rsys.polls.gen;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC31180DnO;
import X.C2N9;
import X.JQ0;
import X.LSW;
import X.MSV;
import com.facebook.djinni.msys.infra.McfReference;
import java.util.ArrayList;

/* loaded from: classes8.dex */
public class PollOptionModel {
    public static C2N9 CONVERTER = new LSW(11);
    public static long sMcfTypeId;
    public final PollOptionContentModel content;
    public final String id;
    public final PollOptionPermissionsModel permissions;
    public final float voteFraction;
    public final ArrayList voters;

    public static native PollOptionModel createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PollOptionModel)) {
            return false;
        }
        PollOptionModel pollOptionModel = (PollOptionModel) obj;
        return this.id.equals(pollOptionModel.id) && this.content.equals(pollOptionModel.content) && this.voters.equals(pollOptionModel.voters) && this.voteFraction == pollOptionModel.voteFraction && this.permissions.equals(pollOptionModel.permissions);
    }

    public int hashCode() {
        return AbstractC166987dD.A0I(this.permissions, AbstractC166997dE.A00(AbstractC166997dE.A0J(this.voters, AbstractC166997dE.A0J(this.content, JQ0.A01(this.id.hashCode()))), this.voteFraction));
    }

    public PollOptionModel(String str, PollOptionContentModel pollOptionContentModel, ArrayList arrayList, float f, PollOptionPermissionsModel pollOptionPermissionsModel) {
        AbstractC31180DnO.A1U(str, pollOptionContentModel, arrayList);
        pollOptionPermissionsModel.getClass();
        this.id = str;
        this.content = pollOptionContentModel;
        this.voters = arrayList;
        this.voteFraction = f;
        this.permissions = pollOptionPermissionsModel;
    }

    public String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("PollOptionModel{id=");
        A1C.append(this.id);
        A1C.append(MSV.A00(302));
        A1C.append(this.content);
        A1C.append(",voters=");
        A1C.append(this.voters);
        A1C.append(",voteFraction=");
        A1C.append(this.voteFraction);
        A1C.append(",permissions=");
        return JQ0.A0l(this.permissions, A1C);
    }
}
