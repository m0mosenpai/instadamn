package X;

import java.util.LinkedHashSet;

/* renamed from: X.9BR, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9BR extends C0T6 {
    public final int A00;
    public final Object A01;
    public final boolean A02;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C9BR(InterfaceC54232eZ interfaceC54232eZ) {
        this(interfaceC54232eZ, false);
        this.A00 = 8;
    }

    public static boolean A00(Object obj, int i) {
        if ((obj instanceof C9BR) && ((C9BR) obj).A00 == i) {
            return true;
        }
        return false;
    }

    public final boolean A01() {
        switch (((Number) this.A01).intValue()) {
            case 0:
            case 1:
            case 4:
            case 5:
                return true;
            case 2:
                if (!this.A02) {
                    return true;
                }
            case 3:
            default:
                return false;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0021 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x000f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            int r0 = r2.A00
            switch(r0) {
                case 0: goto L23;
                case 1: goto L27;
                case 2: goto L2b;
                case 3: goto L3d;
                case 4: goto L41;
                case 5: goto L45;
                case 6: goto L49;
                case 7: goto L4d;
                case 8: goto L51;
                case 9: goto L6f;
                case 10: goto L74;
                default: goto L5;
            }
        L5:
            if (r2 == r3) goto L79
            r0 = 11
        L9:
            boolean r0 = A00(r3, r0)
            if (r0 == 0) goto L21
            X.9BR r3 = (X.C9BR) r3
            boolean r1 = r2.A02
            boolean r0 = r3.A02
            if (r1 != r0) goto L21
            java.lang.Object r1 = r2.A01
            java.lang.Object r0 = r3.A01
            boolean r0 = X.C14360o3.A0K(r1, r0)
            if (r0 != 0) goto L79
        L21:
            r0 = 0
            return r0
        L23:
            if (r2 == r3) goto L79
            r0 = 0
            goto L55
        L27:
            if (r2 == r3) goto L79
            r0 = 1
            goto L2e
        L2b:
            if (r2 == r3) goto L79
            r0 = 2
        L2e:
            boolean r0 = A00(r3, r0)
            if (r0 == 0) goto L21
            X.9BR r3 = (X.C9BR) r3
            java.lang.Object r1 = r2.A01
            java.lang.Object r0 = r3.A01
            if (r1 == r0) goto L68
            goto L21
        L3d:
            if (r2 == r3) goto L79
            r0 = 3
            goto L9
        L41:
            if (r2 == r3) goto L79
            r0 = 4
            goto L55
        L45:
            if (r2 == r3) goto L79
            r0 = 5
            goto L55
        L49:
            if (r2 == r3) goto L79
            r0 = 6
            goto L55
        L4d:
            if (r2 == r3) goto L79
            r0 = 7
            goto L9
        L51:
            if (r2 == r3) goto L79
            r0 = 8
        L55:
            boolean r0 = A00(r3, r0)
            if (r0 == 0) goto L21
            X.9BR r3 = (X.C9BR) r3
            java.lang.Object r1 = r2.A01
            java.lang.Object r0 = r3.A01
            boolean r0 = X.C14360o3.A0K(r1, r0)
            if (r0 != 0) goto L68
            goto L21
        L68:
            boolean r1 = r2.A02
            boolean r0 = r3.A02
            if (r1 == r0) goto L79
            goto L21
        L6f:
            if (r2 == r3) goto L79
            r0 = 9
            goto L9
        L74:
            if (r2 == r3) goto L79
            r0 = 10
            goto L9
        L79:
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C9BR.equals(java.lang.Object):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int hashCode() {
        /*
            r3 = this;
            int r0 = r3.A00
            switch(r0) {
                case 1: goto L37;
                case 2: goto L17;
                case 3: goto L63;
                case 4: goto L5;
                case 5: goto L5;
                case 6: goto L5;
                case 7: goto L53;
                case 8: goto L5;
                case 9: goto L63;
                case 10: goto L53;
                case 11: goto L53;
                default: goto L5;
            }
        L5:
            java.lang.Object r0 = r3.A01
            int r0 = r0.hashCode()
        Lb:
            int r2 = r0 * 31
            boolean r1 = r3.A02
            r0 = 1237(0x4d5, float:1.733E-42)
            if (r1 == 0) goto L15
            r0 = 1231(0x4cf, float:1.725E-42)
        L15:
            int r2 = r2 + r0
            return r2
        L17:
            java.lang.Object r0 = r3.A01
            java.lang.Number r0 = (java.lang.Number) r0
            int r1 = r0.intValue()
            switch(r1) {
                case 1: goto L25;
                case 2: goto L28;
                case 3: goto L2b;
                case 4: goto L2e;
                case 5: goto L31;
                case 6: goto L34;
                default: goto L22;
            }
        L22:
            java.lang.String r0 = "KEEP_IN_CHAT_UNSEEN"
            goto L44
        L25:
            java.lang.String r0 = "KEEP_IN_CHAT_SEEN"
            goto L44
        L28:
            java.lang.String r0 = "VIEW_ONCE_UNSEEN"
            goto L44
        L2b:
            java.lang.String r0 = "VIEW_ONCE_SEEN"
            goto L44
        L2e:
            java.lang.String r0 = "REPLAYABLE_UNSEEN"
            goto L44
        L31:
            java.lang.String r0 = "REPLAYABLE_SEEN"
            goto L44
        L34:
            java.lang.String r0 = "REPLAYABLE_EXPIRED"
            goto L44
        L37:
            java.lang.Object r0 = r3.A01
            java.lang.Number r0 = (java.lang.Number) r0
            int r1 = r0.intValue()
            switch(r1) {
                case 1: goto L4a;
                case 2: goto L4d;
                case 3: goto L50;
                default: goto L42;
            }
        L42:
            java.lang.String r0 = "NOT_READY"
        L44:
            int r0 = r0.hashCode()
            int r0 = r0 + r1
            goto Lb
        L4a:
            java.lang.String r0 = "READY"
            goto L44
        L4d:
            java.lang.String r0 = "UNAVAILABLE"
            goto L44
        L50:
            java.lang.String r0 = "DISMISSED"
            goto L44
        L53:
            boolean r1 = r3.A02
            r0 = 1237(0x4d5, float:1.733E-42)
            if (r1 == 0) goto L5b
            r0 = 1231(0x4cf, float:1.725E-42)
        L5b:
            int r2 = r0 * 31
            java.lang.Object r0 = r3.A01
            if (r0 != 0) goto L6f
            r0 = 0
            goto L15
        L63:
            boolean r1 = r3.A02
            r0 = 1237(0x4d5, float:1.733E-42)
            if (r1 == 0) goto L6b
            r0 = 1231(0x4cf, float:1.725E-42)
        L6b:
            int r2 = r0 * 31
            java.lang.Object r0 = r3.A01
        L6f:
            int r0 = r0.hashCode()
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C9BR.hashCode():int");
    }

    public final String toString() {
        if (3 - this.A00 != 0) {
            return super.toString();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("MediaOverlayCTAUiState(isMediaCovered=");
        sb.append(this.A02);
        sb.append(", actions=");
        sb.append(this.A01);
        sb.append(')');
        return sb.toString();
    }

    public C9BR(int i, Object obj, boolean z) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = z;
    }

    public C9BR(Integer num, int i, boolean z) {
        this.A00 = i;
        this.A01 = num;
        this.A02 = z;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C9BR() {
        this(new LinkedHashSet(), false);
        this.A00 = 9;
    }

    public C9BR(C38321qM c38321qM, int i, boolean z) {
        this.A00 = i;
        this.A01 = c38321qM;
        this.A02 = z;
    }

    public C9BR(C103514lR c103514lR, boolean z) {
        this.A00 = 0;
        this.A01 = c103514lR;
        this.A02 = z;
    }

    public C9BR(InterfaceC54232eZ interfaceC54232eZ, boolean z) {
        this.A00 = 8;
        C14360o3.A0B(interfaceC54232eZ, 1);
        this.A01 = interfaceC54232eZ;
        this.A02 = z;
    }

    public C9BR(LinkedHashSet linkedHashSet, boolean z) {
        this.A00 = 9;
        this.A02 = z;
        this.A01 = linkedHashSet;
    }
}
