package X;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: X.47m, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C915647m {
    public int A00 = 100;
    public int A01 = 0;
    public List A02;
    public List A03;

    public final boolean equals(Object obj) {
        Class<?> cls;
        int i;
        int i2;
        List unmodifiableList;
        List unmodifiableList2;
        if (this == obj) {
            return true;
        }
        Class<?> cls2 = getClass();
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!C14360o3.A0K(cls2, cls)) {
            return false;
        }
        C14360o3.A0C(obj, "null cannot be cast to non-null type com.instagram.pendingmedia.model.VideoFilterSetting");
        C915647m c915647m = (C915647m) obj;
        if (this.A00 == c915647m.A00 && this.A01 == c915647m.A01) {
            List list = c915647m.A03;
            if (list != null && (unmodifiableList2 = Collections.unmodifiableList(list)) != null) {
                i = unmodifiableList2.size();
            } else {
                i = 0;
            }
            List list2 = this.A03;
            if (list2 != null && (unmodifiableList = Collections.unmodifiableList(list2)) != null) {
                i2 = unmodifiableList.size();
            } else {
                i2 = 0;
            }
            if (i == i2) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        List unmodifiableList;
        Integer valueOf = Integer.valueOf(this.A00);
        Integer valueOf2 = Integer.valueOf(this.A01);
        List list = this.A03;
        if (list != null && (unmodifiableList = Collections.unmodifiableList(list)) != null) {
            i = unmodifiableList.size();
        } else {
            i = 0;
        }
        return Arrays.hashCode(new Object[]{valueOf, valueOf2, Integer.valueOf(i)});
    }
}
