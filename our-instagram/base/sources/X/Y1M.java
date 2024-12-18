package X;

import com.google.common.collect.ImmutableList;
import java.util.Collection;
import java.util.List;

/* loaded from: classes12.dex */
public final class Y1M {
    public static final Y1M A01 = new Y1M(ImmutableList.of());
    public final ImmutableList A00;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return this.A00.equals(((Y1M) obj).A00);
        }
        return false;
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public Y1M(List list) {
        this.A00 = ImmutableList.copyOf((Collection) list);
    }
}
