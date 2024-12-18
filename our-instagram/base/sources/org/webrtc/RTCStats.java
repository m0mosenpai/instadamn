package org.webrtc;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC31172DnG;
import X.AbstractC43591JPw;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes9.dex */
public class RTCStats {
    public final String id;
    public final Map members;
    public final long timestampUs;
    public final String type;

    public static void appendValue(StringBuilder sb, Object obj) {
        char c;
        if (obj instanceof Object[]) {
            Object[] objArr = (Object[]) obj;
            sb.append('[');
            for (int i = 0; i < objArr.length; i++) {
                if (i != 0) {
                    sb.append(", ");
                }
                appendValue(sb, objArr[i]);
            }
            c = ']';
        } else if (obj instanceof String) {
            c = '\"';
            sb.append('\"');
            sb.append(obj);
        } else {
            sb.append(obj);
            return;
        }
        sb.append(c);
    }

    public static RTCStats create(long j, String str, String str2, Map map) {
        return new RTCStats(j, str, str2, map);
    }

    public String getId() {
        return this.id;
    }

    public Map getMembers() {
        return this.members;
    }

    public double getTimestampUs() {
        return this.timestampUs;
    }

    public String getType() {
        return this.type;
    }

    public RTCStats(long j, String str, String str2, Map map) {
        this.timestampUs = j;
        this.type = str;
        this.id = str2;
        this.members = map;
    }

    public String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append(AbstractC43591JPw.A00(1451));
        A1C.append(this.timestampUs);
        A1C.append(", type: ");
        A1C.append(this.type);
        A1C.append(", id: ");
        A1C.append(this.id);
        Iterator A15 = AbstractC166997dE.A15(this.members);
        while (A15.hasNext()) {
            Map.Entry A1K = AbstractC166987dD.A1K(A15);
            A1C.append(", ");
            A1C.append(AbstractC31172DnG.A17(A1K));
            A1C.append(": ");
            appendValue(A1C, A1K.getValue());
        }
        return AbstractC166997dE.A0x(" }", A1C);
    }
}
