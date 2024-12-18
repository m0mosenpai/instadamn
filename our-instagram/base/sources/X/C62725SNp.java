package X;

import com.google.common.collect.ImmutableList;

/* renamed from: X.SNp, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C62725SNp {
    public final ImmutableList A00;
    public final ImmutableList A01;
    public final String A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C62725SNp) {
                C62725SNp c62725SNp = (C62725SNp) obj;
                if (!C14360o3.A0K(this.A00, c62725SNp.A00) || !C14360o3.A0K(this.A02, c62725SNp.A02) || !C14360o3.A0K(this.A01, c62725SNp.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((AbstractC63311ShH.A02(this.A00) * 31) + AbstractC25235BEs.A06(this.A02)) * 31) + AbstractC25235BEs.A06(this.A01);
    }

    public C62725SNp(ImmutableList immutableList, ImmutableList immutableList2, String str) {
        this.A00 = immutableList;
        this.A02 = str;
        this.A01 = immutableList2;
    }
}
