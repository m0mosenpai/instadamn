package org.webrtc;

import X.AbstractC166987dD;
import X.AbstractC25226BEj;
import X.AbstractC58318PtA;
import X.AbstractC58319PtB;
import X.AnonymousClass001;
import java.util.List;

/* loaded from: classes12.dex */
public class MediaConstraints {
    public final List mandatory = AbstractC166987dD.A1E();
    public final List optional = AbstractC166987dD.A1E();

    /* loaded from: classes10.dex */
    public class KeyValuePair {
        public final String key;
        public final String value;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj == null || getClass() != obj.getClass()) {
                    return false;
                }
                KeyValuePair keyValuePair = (KeyValuePair) obj;
                if (!this.key.equals(keyValuePair.key) || !this.value.equals(keyValuePair.value)) {
                    return false;
                }
            }
            return true;
        }

        public String getKey() {
            return this.key;
        }

        public String getValue() {
            return this.value;
        }

        public int hashCode() {
            return AbstractC25226BEj.A03(this.value, this.key.hashCode());
        }

        public String toString() {
            return AnonymousClass001.A0g(this.key, ": ", this.value);
        }

        public KeyValuePair(String str, String str2) {
            this.key = str;
            this.value = str2;
        }
    }

    public static String stringifyKeyValuePairList(List list) {
        StringBuilder sb = new StringBuilder("[");
        for (Object obj : list) {
            if (sb.length() > 1) {
                sb.append(", ");
            }
            AbstractC58318PtA.A1V(sb, obj);
        }
        return AbstractC58319PtB.A0w(sb);
    }

    public String toString() {
        return AnonymousClass001.A0u("mandatory: ", stringifyKeyValuePairList(this.mandatory), ", optional: ", stringifyKeyValuePairList(this.optional));
    }

    public List getMandatory() {
        return this.mandatory;
    }

    public List getOptional() {
        return this.optional;
    }
}
