package com.instagram.rtc.rsys.models;

import X.AbstractC166987dD;
import X.AbstractC167017dG;
import X.AbstractC50523MSb;
import X.C2N9;
import X.JQ0;
import X.YAL;
import com.facebook.djinni.msys.infra.McfReference;
import java.util.Arrays;
import java.util.Map;

/* loaded from: classes12.dex */
public class ParsedMwsBinaryMessage {
    public static C2N9 CONVERTER = new YAL(16);
    public static long sMcfTypeId;
    public final Map collisionContext;
    public final byte[] data;
    public final DismissNotification dismissData;
    public final boolean isResponse;
    public final RingNotification ringData;

    public static native ParsedMwsBinaryMessage createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof ParsedMwsBinaryMessage)) {
                return false;
            }
            ParsedMwsBinaryMessage parsedMwsBinaryMessage = (ParsedMwsBinaryMessage) obj;
            if (Arrays.equals(this.data, parsedMwsBinaryMessage.data)) {
                RingNotification ringNotification = this.ringData;
                RingNotification ringNotification2 = parsedMwsBinaryMessage.ringData;
                if (ringNotification == null) {
                    if (ringNotification2 != null) {
                        return false;
                    }
                } else if (!ringNotification.equals(ringNotification2)) {
                    return false;
                }
                DismissNotification dismissNotification = this.dismissData;
                DismissNotification dismissNotification2 = parsedMwsBinaryMessage.dismissData;
                if (dismissNotification == null) {
                    if (dismissNotification2 != null) {
                        return false;
                    }
                } else if (!dismissNotification.equals(dismissNotification2)) {
                    return false;
                }
                Map map = this.collisionContext;
                Map map2 = parsedMwsBinaryMessage.collisionContext;
                if (map != null) {
                    if (!map.equals(map2)) {
                        return false;
                    }
                } else if (map2 != null) {
                    return false;
                }
                if (this.isResponse != parsedMwsBinaryMessage.isResponse) {
                    return false;
                }
            } else {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int i = 0;
        int A01 = (((JQ0.A01(Arrays.hashCode(this.data)) + AbstractC167017dG.A0M(this.ringData)) * 31) + AbstractC167017dG.A0M(this.dismissData)) * 31;
        Map map = this.collisionContext;
        if (map != null) {
            i = map.hashCode();
        }
        return ((A01 + i) * 31) + (this.isResponse ? 1 : 0);
    }

    public ParsedMwsBinaryMessage(byte[] bArr, RingNotification ringNotification, DismissNotification dismissNotification, Map map, boolean z) {
        bArr.getClass();
        this.data = bArr;
        this.ringData = ringNotification;
        this.dismissData = dismissNotification;
        this.collisionContext = map;
        this.isResponse = z;
    }

    public String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("ParsedMwsBinaryMessage{data=");
        A1C.append(this.data);
        A1C.append(",ringData=");
        A1C.append(this.ringData);
        A1C.append(",dismissData=");
        A1C.append(this.dismissData);
        A1C.append(",collisionContext=");
        A1C.append(this.collisionContext);
        A1C.append(",isResponse=");
        return AbstractC50523MSb.A0X(A1C, this.isResponse);
    }
}
