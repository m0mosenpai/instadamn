package X;

import com.google.common.collect.ImmutableList;

/* renamed from: X.4WU, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4WU {
    public static final C4WU A03 = new C4WU(new C4WV[0]);
    public int A00;
    public final int A01;
    public final ImmutableList A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C4WU c4wu = (C4WU) obj;
            if (this.A01 != c4wu.A01 || !this.A02.equals(c4wu.A02)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = this.A00;
        if (i == 0) {
            int hashCode = this.A02.hashCode();
            this.A00 = hashCode;
            return hashCode;
        }
        return i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C4WU(C4WV... c4wvArr) {
        this.A02 = ImmutableList.copyOf(c4wvArr);
        this.A01 = c4wvArr.length;
        int i = 0;
        while (true) {
            ImmutableList immutableList = this.A02;
            if (i < immutableList.size()) {
                int i2 = i + 1;
                for (int i3 = i2; i3 < immutableList.size(); i3++) {
                    if (immutableList.get(i).equals(immutableList.get(i3))) {
                        AbstractC46512Bo.A05("TrackGroupArray", "", new IllegalArgumentException("Multiple identical TrackGroups added to one TrackGroupArray."));
                    }
                }
                i = i2;
            } else {
                return;
            }
        }
    }
}
