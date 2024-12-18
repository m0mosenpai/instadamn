package X;

import com.google.common.collect.ImmutableList;

/* loaded from: classes12.dex */
public final class Y1Q {
    public static final Y1Q A02 = new Y1Q(new AbstractC72455Xe1[0]);
    public int A00;
    public final ImmutableList A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            return obj != null && getClass() == obj.getClass() && this.A01.equals(((Y1Q) obj).A01);
        }
        return true;
    }

    public final int hashCode() {
        int i = this.A00;
        if (i == 0) {
            int hashCode = this.A01.hashCode();
            this.A00 = hashCode;
            return hashCode;
        }
        return i;
    }

    public Y1Q(AbstractC72455Xe1... abstractC72455Xe1Arr) {
        this.A01 = ImmutableList.copyOf(abstractC72455Xe1Arr);
        int i = 0;
        while (true) {
            ImmutableList immutableList = this.A01;
            if (i < immutableList.size()) {
                int i2 = i + 1;
                if (i2 < immutableList.size()) {
                    immutableList.get(i);
                    immutableList.get(i2);
                    throw AbstractC166987dD.A15("equals");
                }
                i = i2;
            } else {
                return;
            }
        }
    }
}
