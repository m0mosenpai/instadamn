package X;

import org.json.JSONObject;

/* renamed from: X.OLv, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C54836OLv {
    public final int A00;
    public final int A01;
    public final String A02;
    public final String A03;
    public final JSONObject A04;
    public final JSONObject A05;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C54836OLv) {
                C54836OLv c54836OLv = (C54836OLv) obj;
                if (!C14360o3.A0K(this.A03, c54836OLv.A03) || !C14360o3.A0K(this.A04, c54836OLv.A04) || !C14360o3.A0K(this.A05, c54836OLv.A05) || !C14360o3.A0K(this.A02, c54836OLv.A02) || this.A00 != c54836OLv.A00 || this.A01 != c54836OLv.A01) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((AbstractC166997dE.A0K(this.A02, AbstractC166997dE.A0J(this.A05, AbstractC166997dE.A0J(this.A04, AbstractC166987dD.A0J(this.A03)))) + this.A00) * 31) + this.A01;
    }

    public C54836OLv(String str, String str2, JSONObject jSONObject, JSONObject jSONObject2, int i, int i2) {
        this.A03 = str;
        this.A04 = jSONObject;
        this.A05 = jSONObject2;
        this.A02 = str2;
        this.A00 = i;
        this.A01 = i2;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("TemplateInfo(templateId=");
        A1C.append(this.A03);
        A1C.append(", camera=");
        A1C.append(this.A04);
        A1C.append(", lights=");
        A1C.append(this.A05);
        A1C.append(", pose=");
        A1C.append(this.A02);
        A1C.append(", fps=");
        A1C.append(this.A00);
        A1C.append(AbstractC43591JPw.A00(510));
        return AbstractC25236BEt.A0Z(A1C, this.A01);
    }
}
