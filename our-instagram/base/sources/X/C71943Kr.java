package X;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.RegularImmutableMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/* renamed from: X.3Kr, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C71943Kr {
    public final C71933Kq A00;
    public final List A01;
    public final Map A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || !C14360o3.A0K(getClass(), obj.getClass())) {
                return false;
            }
            C71943Kr c71943Kr = (C71943Kr) obj;
            if (!C14360o3.A0K(this.A00, c71943Kr.A00) || !C14360o3.A0K(this.A01, c71943Kr.A01) || !C14360o3.A0K(this.A02, c71943Kr.A02)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A00, this.A01, this.A02});
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DirectBadgeInfo{badgeCount=");
        sb.append(this.A00);
        sb.append(", threadBadgeInfoList=");
        sb.append(this.A01);
        sb.append(", accountUnreadFolderCountMap=");
        sb.append(this.A02);
        sb.append('}');
        return sb.toString();
    }

    public C71943Kr(C71933Kq c71933Kq, List list, Map map) {
        List list2;
        ImmutableMap immutableMap;
        this.A00 = c71933Kq;
        if (list != null) {
            list2 = ImmutableList.copyOf((Collection) list);
            C14360o3.A07(list2);
        } else {
            list2 = C16930sl.A00;
        }
        this.A01 = list2;
        if (map != null) {
            immutableMap = ImmutableMap.copyOf(map);
        } else {
            immutableMap = RegularImmutableMap.A02;
        }
        this.A02 = immutableMap;
    }
}
