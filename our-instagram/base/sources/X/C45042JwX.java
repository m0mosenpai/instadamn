package X;

import java.util.Arrays;

/* renamed from: X.JwX, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45042JwX extends C0T6 {
    public final int A00;
    public final int A01;
    public final long A02;
    public final String A03;
    public final byte[] A04;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (C14360o3.A0K(getClass(), AbstractC43593JPy.A0o(obj))) {
                C14360o3.A0C(obj, "null cannot be cast to non-null type com.instagram.direct.inbox.notes.persistence.NoteEntity");
                C45042JwX c45042JwX = (C45042JwX) obj;
                if (!C14360o3.A0K(this.A03, c45042JwX.A03) || !Arrays.equals(this.A04, c45042JwX.A04) || this.A00 != c45042JwX.A00 || this.A01 != c45042JwX.A01 || this.A02 != c45042JwX.A02) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((((AbstractC166987dD.A0J(this.A03) + Arrays.hashCode(this.A04)) * 31) + this.A00) * 31) + this.A01) * 31) + AbstractC25228BEl.A03(this.A02);
    }

    public C45042JwX(String str, byte[] bArr, int i, int i2, long j) {
        AbstractC167017dG.A1P(str, bArr);
        this.A03 = str;
        this.A04 = bArr;
        this.A00 = i;
        this.A01 = i2;
        this.A02 = j;
    }
}
