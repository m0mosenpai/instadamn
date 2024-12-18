package X;

import java.util.List;

/* loaded from: classes11.dex */
public final class UPL extends C0T6 {
    public List A05 = null;
    public float A02 = 0.0f;
    public float A03 = 0.0f;
    public float A00 = 0.0f;
    public float A01 = 0.0f;
    public List A06 = null;
    public String A04 = "";

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof UPL) {
                UPL upl = (UPL) obj;
                if (!C14360o3.A0K(this.A05, upl.A05) || Float.compare(this.A02, upl.A02) != 0 || Float.compare(this.A03, upl.A03) != 0 || Float.compare(this.A00, upl.A00) != 0 || Float.compare(this.A01, upl.A01) != 0 || !C14360o3.A0K(this.A06, upl.A06) || !C14360o3.A0K(this.A04, upl.A04)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = 0;
        int A00 = AbstractC166997dE.A00(AbstractC166997dE.A00(AbstractC166997dE.A00(AbstractC166997dE.A00(AbstractC167017dG.A0M(this.A05) * 31, this.A02), this.A03), this.A00), this.A01);
        List list = this.A06;
        if (list != null) {
            i = list.hashCode();
        }
        return ((A00 + i) * 31) + this.A04.hashCode();
    }
}
