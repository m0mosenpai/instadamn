package X;

import java.util.Collections;
import java.util.List;

/* renamed from: X.8PM, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8PM {
    public List A00 = Collections.unmodifiableList(Collections.emptyList());
    public String A01;

    public final String A00() {
        if (!this.A00.isEmpty()) {
            return toString();
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8PM)) {
            return false;
        }
        return this.A00.equals(((C8PM) obj).A00);
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final String toString() {
        String str = this.A01;
        if (str == null) {
            StringBuilder sb = new StringBuilder();
            int size = this.A00.size();
            for (int i = 0; i < size; i++) {
                sb.append((String) this.A00.get(i));
                if (i < size - 1) {
                    sb.append(" ");
                }
            }
            String obj = sb.toString();
            this.A01 = obj;
            return obj;
        }
        return str;
    }
}
