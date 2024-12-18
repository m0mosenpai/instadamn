package X;

/* renamed from: X.7bc, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C166087bc extends AbstractC166097bd {
    public final C166077bb A00;
    public final String A01;
    public final java.util.Set A02;
    public final boolean A03;
    public final boolean A04;
    public final boolean A05;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C166087bc) {
                C166087bc c166087bc = (C166087bc) obj;
                if (!C14360o3.A0K(this.A00, c166087bc.A00) || !C14360o3.A0K(this.A01, c166087bc.A01) || this.A03 != c166087bc.A03 || this.A04 != c166087bc.A04 || this.A05 != c166087bc.A05) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C166087bc(X.C166077bb r3, java.lang.String r4, boolean r5, boolean r6, boolean r7) {
        /*
            r2 = this;
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "parent_comment_head_loading_state_"
            r1.append(r0)
            r1.append(r4)
            java.lang.Integer r0 = r3.A03
            if (r0 == 0) goto L38
            java.lang.String r0 = X.AbstractC166107be.A01(r0)
        L15:
            r1.append(r0)
            X.7ba r0 = r3.A02
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r2.<init>(r0)
            r2.A00 = r3
            r2.A01 = r4
            r2.A03 = r5
            r2.A04 = r6
            r2.A05 = r7
            java.util.concurrent.ConcurrentHashMap$KeySetView r0 = java.util.concurrent.ConcurrentHashMap.newKeySet()
            X.C14360o3.A07(r0)
            r2.A02 = r0
            return
        L38:
            java.lang.String r0 = "null"
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C166087bc.<init>(X.7bb, java.lang.String, boolean, boolean, boolean):void");
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.A00.hashCode() * 31;
        String str = this.A01;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i = (hashCode2 + hashCode) * 31;
        int i2 = 1237;
        if (this.A03) {
            i2 = 1231;
        }
        int i3 = (i + i2) * 31;
        int i4 = 1237;
        if (this.A04) {
            i4 = 1231;
        }
        int i5 = (i3 + i4) * 31;
        int i6 = 1237;
        if (this.A05) {
            i6 = 1231;
        }
        return i5 + i6;
    }
}
