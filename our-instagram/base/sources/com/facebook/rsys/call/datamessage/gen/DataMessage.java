package com.facebook.rsys.call.datamessage.gen;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC31180DnO;
import X.AbstractC72049XLp;
import X.C2N9;
import X.JQ0;
import X.YAN;
import com.facebook.djinni.msys.infra.McfReference;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes12.dex */
public class DataMessage {
    public static C2N9 CONVERTER = YAN.A00(17);
    public static long sMcfTypeId;
    public final byte[] payload;
    public final ArrayList recipients;
    public final String topic;

    public static native DataMessage createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DataMessage)) {
            return false;
        }
        DataMessage dataMessage = (DataMessage) obj;
        return this.recipients.equals(dataMessage.recipients) && this.topic.equals(dataMessage.topic) && Arrays.equals(this.payload, dataMessage.payload);
    }

    public int hashCode() {
        return AbstractC166997dE.A0K(this.topic, AbstractC72049XLp.A02(this.recipients)) + Arrays.hashCode(this.payload);
    }

    public DataMessage(ArrayList arrayList, String str, byte[] bArr) {
        AbstractC31180DnO.A1U(arrayList, str, bArr);
        this.recipients = arrayList;
        this.topic = str;
        this.payload = bArr;
    }

    public String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("DataMessage{recipients=");
        A1C.append(this.recipients);
        A1C.append(",topic=");
        A1C.append(this.topic);
        A1C.append(",payload=");
        return JQ0.A0l(this.payload, A1C);
    }
}
