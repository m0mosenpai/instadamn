package X;

/* renamed from: X.MwG, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51872MwG extends C0T6 implements InterfaceC57855PlL {
    public String A00;
    public long A01;
    public String A02;
    public final Boolean A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C51872MwG) {
                C51872MwG c51872MwG = (C51872MwG) obj;
                if (!C14360o3.A0K(this.A02, c51872MwG.A02) || !C14360o3.A0K(this.A00, c51872MwG.A00) || this.A01 != c51872MwG.A01 || !C14360o3.A0K(this.A03, c51872MwG.A03)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC25236BEt.A01(this.A01, ((AbstractC167017dG.A0O(this.A02) * 31) + AbstractC167017dG.A0O(this.A00)) * 31) + AbstractC166997dE.A0I(this.A03);
    }

    public C51872MwG(Boolean bool, String str, String str2, long j) {
        this.A02 = str;
        this.A00 = str2;
        this.A01 = j;
        this.A03 = bool;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("RtcScreenCaptureModel(actorId=");
        A1C.append(this.A02);
        A1C.append(", username=");
        A1C.append(this.A00);
        A1C.append(", actionTimeMs=");
        A1C.append(this.A01);
        A1C.append(AbstractC111324zv.A00(3388));
        return AbstractC167017dG.A0o(this.A03, A1C);
    }
}
