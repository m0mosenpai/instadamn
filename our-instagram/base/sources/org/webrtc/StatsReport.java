package org.webrtc;

import X.AbstractC166987dD;
import X.AnonymousClass001;

/* loaded from: classes9.dex */
public class StatsReport {
    public final String id;
    public final double timestamp;
    public final String type;
    public final Value[] values;

    /* loaded from: classes10.dex */
    public class Value {
        public final String name;
        public final String value;

        public String toString() {
            return AnonymousClass001.A11("[", this.name, ": ", this.value, "]");
        }

        public Value(String str, String str2) {
            this.name = str;
            this.value = str2;
        }
    }

    public StatsReport(String str, String str2, double d, Value[] valueArr) {
        this.id = str;
        this.type = str2;
        this.timestamp = d;
        this.values = valueArr;
    }

    public String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("id: ");
        A1C.append(this.id);
        A1C.append(", type: ");
        A1C.append(this.type);
        A1C.append(", timestamp: ");
        A1C.append(this.timestamp);
        A1C.append(", values: ");
        int i = 0;
        while (true) {
            Value[] valueArr = this.values;
            if (i < valueArr.length) {
                A1C.append(valueArr[i].toString());
                A1C.append(", ");
                i++;
            } else {
                return A1C.toString();
            }
        }
    }
}
