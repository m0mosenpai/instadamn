package X;

import java.util.HashSet;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: X.9BS, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9BS extends C0T6 {
    public Object A00;
    public boolean A01;
    public boolean A02;
    public final int A03;

    public C9BS(EnumC53325Ni3 enumC53325Ni3) {
        this.A03 = 1;
        this.A03 = 1;
        this.A00 = enumC53325Ni3;
        this.A02 = true;
        this.A01 = true;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            int r0 = r2.A03
            switch(r0) {
                case 0: goto La;
                case 1: goto Le;
                case 2: goto L2e;
                case 3: goto L5;
                case 4: goto L46;
                default: goto L5;
            }
        L5:
            boolean r0 = super.equals(r3)
            return r0
        La:
            if (r2 == r3) goto L6b
            r1 = 0
            goto L49
        Le:
            if (r2 == r3) goto L6b
            r1 = 1
            boolean r0 = r3 instanceof X.C9BS
            if (r0 == 0) goto L69
            X.9BS r3 = (X.C9BS) r3
            int r0 = r3.A03
            if (r0 != r1) goto L69
            java.lang.Object r1 = r2.A00
            java.lang.Object r0 = r3.A00
            if (r1 != r0) goto L69
            boolean r1 = r2.A02
            boolean r0 = r3.A02
            if (r1 != r0) goto L69
            boolean r1 = r2.A01
            boolean r0 = r3.A01
            if (r1 == r0) goto L6b
            goto L69
        L2e:
            if (r2 == r3) goto L6b
            r1 = 2
            boolean r0 = r3 instanceof X.C9BS
            if (r0 == 0) goto L69
            X.9BS r3 = (X.C9BS) r3
            int r0 = r3.A03
            if (r0 != r1) goto L69
            boolean r1 = r2.A02
            boolean r0 = r3.A02
            if (r1 != r0) goto L69
            boolean r1 = r2.A01
            boolean r0 = r3.A01
            goto L5d
        L46:
            if (r2 == r3) goto L6b
            r1 = 4
        L49:
            boolean r0 = r3 instanceof X.C9BS
            if (r0 == 0) goto L69
            X.9BS r3 = (X.C9BS) r3
            int r0 = r3.A03
            if (r0 != r1) goto L69
            boolean r1 = r2.A01
            boolean r0 = r3.A01
            if (r1 != r0) goto L69
            boolean r1 = r2.A02
            boolean r0 = r3.A02
        L5d:
            if (r1 != r0) goto L69
            java.lang.Object r1 = r2.A00
            java.lang.Object r0 = r3.A00
            boolean r0 = X.C14360o3.A0K(r1, r0)
            if (r0 != 0) goto L6b
        L69:
            r0 = 0
            return r0
        L6b:
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C9BS.equals(java.lang.Object):boolean");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    public final int hashCode() {
        int i;
        int i2;
        Object obj;
        switch (this.A03) {
            case 0:
            case 4:
                int i3 = 1237;
                if (this.A01) {
                    i3 = 1231;
                }
                int i4 = i3 * 31;
                int i5 = 1237;
                if (this.A02) {
                    i5 = 1231;
                }
                i = (i4 + i5) * 31;
                obj = this.A00;
                i2 = obj.hashCode();
                return i + i2;
            case 1:
                int hashCode = this.A00.hashCode() * 31;
                int i6 = 1237;
                if (this.A02) {
                    i6 = 1231;
                }
                i = (hashCode + i6) * 31;
                i2 = 1237;
                if (this.A01) {
                    i2 = 1231;
                }
                return i + i2;
            case 2:
                int i7 = 1237;
                if (this.A02) {
                    i7 = 1231;
                }
                int i8 = i7 * 31;
                int i9 = 1237;
                if (this.A01) {
                    i9 = 1231;
                }
                i = (i8 + i9) * 31;
                obj = this.A00;
                if (obj == null) {
                    i2 = 0;
                    return i + i2;
                }
                i2 = obj.hashCode();
                return i + i2;
            case 3:
            default:
                return super.hashCode();
        }
    }

    public final String toString() {
        if (this.A03 != 0) {
            return super.toString();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("SubtitlesState(enabled=");
        sb.append(this.A01);
        sb.append(AbstractC111324zv.A00(1467));
        sb.append(this.A02);
        sb.append(", cues=");
        sb.append(this.A00);
        sb.append(')');
        return sb.toString();
    }

    public C9BS(Object obj, int i, boolean z, boolean z2) {
        this.A03 = i;
        this.A01 = z;
        this.A02 = z2;
        this.A00 = obj;
    }

    public C9BS(java.util.Set set, DefaultConstructorMarker defaultConstructorMarker, int i, int i2, boolean z, boolean z2) {
        this.A03 = 3;
        HashSet hashSet = new HashSet();
        this.A03 = 3;
        this.A00 = hashSet;
        this.A01 = false;
        this.A02 = false;
    }

    public C9BS() {
        this.A03 = 3;
        this.A03 = 3;
        HashSet hashSet = new HashSet();
        this.A03 = 3;
        this.A00 = hashSet;
        this.A01 = false;
        this.A02 = false;
    }

    public C9BS(List list, boolean z, boolean z2) {
        this.A03 = 0;
        this.A01 = z;
        this.A02 = z2;
        this.A00 = list;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C9BS(Integer num, int i, boolean z) {
        this((i & 4) != 0 ? null : num, 2, false, z);
        this.A03 = 2;
    }
}
