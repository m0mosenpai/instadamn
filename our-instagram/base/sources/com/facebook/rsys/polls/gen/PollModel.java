package com.facebook.rsys.polls.gen;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC31180DnO;
import X.AbstractC43591JPw;
import X.AbstractC50523MSb;
import X.C2N9;
import X.JQ0;
import X.YAM;
import com.facebook.djinni.msys.infra.McfReference;
import java.util.ArrayList;

/* loaded from: classes12.dex */
public class PollModel {
    public static C2N9 CONVERTER = YAM.A00(26);
    public static long sMcfTypeId;
    public final PollParticipantModel creator;
    public final String id;
    public final ArrayList options;
    public final PollPermissionsModel permissions;
    public final int state;
    public final String title;
    public final int type;

    public static native PollModel createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PollModel)) {
            return false;
        }
        PollModel pollModel = (PollModel) obj;
        return this.id.equals(pollModel.id) && this.creator.equals(pollModel.creator) && this.options.equals(pollModel.options) && this.title.equals(pollModel.title) && this.type == pollModel.type && this.state == pollModel.state && this.permissions.equals(pollModel.permissions);
    }

    public int hashCode() {
        return AbstractC166987dD.A0I(this.permissions, (((AbstractC166997dE.A0K(this.title, AbstractC166997dE.A0J(this.options, AbstractC166997dE.A0J(this.creator, AbstractC50523MSb.A02(this.id)))) + this.type) * 31) + this.state) * 31);
    }

    public PollModel(String str, PollParticipantModel pollParticipantModel, ArrayList arrayList, String str2, int i, int i2, PollPermissionsModel pollPermissionsModel) {
        AbstractC31180DnO.A1U(str, pollParticipantModel, arrayList);
        str2.getClass();
        pollPermissionsModel.getClass();
        this.id = str;
        this.creator = pollParticipantModel;
        this.options = arrayList;
        this.title = str2;
        this.type = i;
        this.state = i2;
        this.permissions = pollPermissionsModel;
    }

    public String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("PollModel{id=");
        A1C.append(this.id);
        A1C.append(",creator=");
        A1C.append(this.creator);
        A1C.append(",options=");
        A1C.append(this.options);
        A1C.append(",title=");
        A1C.append(this.title);
        A1C.append(",type=");
        A1C.append(this.type);
        A1C.append(",state=");
        A1C.append(this.state);
        A1C.append(AbstractC43591JPw.A00(520));
        return JQ0.A0l(this.permissions, A1C);
    }
}
