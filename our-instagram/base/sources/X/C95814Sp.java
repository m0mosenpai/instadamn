package X;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.4Sp, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C95814Sp {
    public final String A00;
    public final List A01;
    public final boolean A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C95814Sp c95814Sp = (C95814Sp) obj;
            if (this.A02 == c95814Sp.A02 && this.A01.equals(c95814Sp.A01)) {
                String str = this.A00;
                String str2 = c95814Sp.A00;
                if (str == null) {
                    return str2 == null;
                }
                if (!str.equals(str2)) {
                    return false;
                }
            } else {
                return false;
            }
        }
        return true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CaptionsState{availableTextLanguages=");
        sb.append(this.A01);
        sb.append(", selectedTextLanguage='");
        sb.append(this.A00);
        sb.append('\'');
        sb.append(MSV.A00(631));
        sb.append(this.A02);
        sb.append('}');
        return sb.toString();
    }

    public C95814Sp(String str, List list, boolean z) {
        this.A01 = new ArrayList(list);
        this.A00 = str;
        this.A02 = z;
    }

    public C95814Sp() {
        this(null, Collections.emptyList(), false);
    }
}
