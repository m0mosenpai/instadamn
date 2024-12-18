package X;

import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.typedurl.SimpleImageUrl;

/* renamed from: X.BuO, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26921BuO extends AbstractC29162CtT {
    public final ImageUrl A00;
    public final EnumC25546BRi A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C26921BuO) {
                C26921BuO c26921BuO = (C26921BuO) obj;
                if (this.A01 != c26921BuO.A01 || !C14360o3.A0K(this.A02, c26921BuO.A02) || !C14360o3.A0K(this.A03, c26921BuO.A03) || !C14360o3.A0K(this.A04, c26921BuO.A04) || !C14360o3.A0K(this.A05, c26921BuO.A05) || !C14360o3.A0K(this.A00, c26921BuO.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public /* synthetic */ C26921BuO(EnumC25546BRi enumC25546BRi) {
        SimpleImageUrl A0t = AbstractC25225BEi.A0t("");
        this.A01 = enumC25546BRi;
        this.A02 = "CLIPS_LAYOUT";
        this.A03 = "";
        this.A04 = "";
        this.A05 = "";
        this.A00 = A0t;
    }

    public final int hashCode() {
        return AbstractC25236BEt.A05(this.A00, AbstractC166997dE.A0K(this.A05, AbstractC166997dE.A0K(this.A04, AbstractC166997dE.A0K(this.A03, AbstractC166997dE.A0K(this.A02, AbstractC166987dD.A0G(this.A01))))));
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("RecipeLayout(attributedCameraTools=");
        A1C.append(this.A01);
        A1C.append(", id=");
        AbstractC29162CtT.A01(A1C, this.A02);
        AbstractC29162CtT.A03(A1C, this.A03);
        AbstractC29162CtT.A02(A1C, this.A04);
        AbstractC25235BEs.A1K(A1C, this.A05);
        A1C.append(this.A00);
        A1C.append(", isChecked=");
        return AbstractC25236BEt.A0a(A1C, false);
    }
}
