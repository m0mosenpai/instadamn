package X;

import android.graphics.Shader;
import java.util.List;

/* renamed from: X.Ba5, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25766Ba5 extends C62Y {
    public final int A00;
    public final long A01;
    public final long A02;
    public final List A03;
    public final List A04;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C25766Ba5) {
                C25766Ba5 c25766Ba5 = (C25766Ba5) obj;
                if (!C14360o3.A0K(this.A03, c25766Ba5.A03) || !C14360o3.A0K(this.A04, c25766Ba5.A04) || this.A02 != c25766Ba5.A02 || this.A01 != c25766Ba5.A01 || this.A00 != c25766Ba5.A00) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.C62Y
    public final Shader A01(long j) {
        long j2 = this.A02;
        float A01 = C119365at.A01(j2);
        if (A01 == Float.POSITIVE_INFINITY) {
            A01 = C5YC.A02(j);
        }
        float A02 = C119365at.A02(j2);
        if (A02 == Float.POSITIVE_INFINITY) {
            A02 = C5YC.A00(j);
        }
        long j3 = this.A01;
        float A012 = C119365at.A01(j3);
        if (A012 == Float.POSITIVE_INFINITY) {
            A012 = C5YC.A02(j);
        }
        float A022 = C119365at.A02(j3);
        if (A022 == Float.POSITIVE_INFINITY) {
            A022 = C5YC.A00(j);
        }
        return AbstractC25292BHl.A00(this.A03, this.A04, this.A00, AbstractC119395aw.A00(A01, A02), AbstractC119395aw.A00(A012, A022));
    }

    public final int hashCode() {
        return AbstractC167007dF.A07(this.A01, AbstractC167007dF.A07(this.A02, (AbstractC166987dD.A0G(this.A03) + AbstractC25235BEs.A06(this.A04)) * 31)) + this.A00;
    }

    public final String toString() {
        String str;
        String str2;
        long j = this.A02;
        String str3 = "";
        if (!AbstractC119395aw.A01(j)) {
            str = "";
        } else {
            StringBuilder A1C = AbstractC166987dD.A1C();
            A1C.append("start=");
            AbstractC25235BEs.A1B(j, A1C);
            str = AbstractC166997dE.A0x(", ", A1C);
        }
        long j2 = this.A01;
        if (AbstractC119395aw.A01(j2)) {
            StringBuilder A1C2 = AbstractC166987dD.A1C();
            A1C2.append("end=");
            AbstractC25235BEs.A1B(j2, A1C2);
            str3 = AbstractC166997dE.A0x(", ", A1C2);
        }
        StringBuilder A1C3 = AbstractC166987dD.A1C();
        A1C3.append("LinearGradient(colors=");
        A1C3.append(this.A03);
        A1C3.append(", stops=");
        A1C3.append(this.A04);
        A1C3.append(", ");
        A1C3.append(str);
        A1C3.append(str3);
        A1C3.append("tileMode=");
        int i = this.A00;
        if (i == 0) {
            str2 = "Clamp";
        } else if (i == 1) {
            str2 = "Repeated";
        } else if (i == 2) {
            str2 = "Mirror";
        } else {
            str2 = "Decal";
        }
        return AbstractC167017dG.A0o(str2, A1C3);
    }

    public C25766Ba5(List list, List list2, int i, long j, long j2) {
        this.A03 = list;
        this.A04 = list2;
        this.A02 = j;
        this.A01 = j2;
        this.A00 = i;
    }
}
