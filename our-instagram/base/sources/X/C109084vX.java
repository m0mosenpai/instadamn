package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.List;

/* renamed from: X.4vX, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C109084vX extends C0T6 implements InterfaceC109094vY {
    public final C109854xD A00;
    public final C109874xF A01;
    public final C914346k A02;
    public final C914346k A03;
    public final C914346k A04;
    public final Integer A05;
    public final Integer A06;
    public final Integer A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final String A0B;
    public final String A0C;
    public final List A0D;

    @Override // X.InterfaceC109094vY
    public final C109084vX EwP() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C109084vX) {
                C109084vX c109084vX = (C109084vX) obj;
                if (!C14360o3.A0K(this.A00, c109084vX.A00) || !C14360o3.A0K(this.A02, c109084vX.A02) || !C14360o3.A0K(this.A03, c109084vX.A03) || !C14360o3.A0K(this.A0D, c109084vX.A0D) || !C14360o3.A0K(this.A08, c109084vX.A08) || !C14360o3.A0K(this.A01, c109084vX.A01) || !C14360o3.A0K(this.A05, c109084vX.A05) || !C14360o3.A0K(this.A06, c109084vX.A06) || !C14360o3.A0K(this.A04, c109084vX.A04) || !C14360o3.A0K(this.A07, c109084vX.A07) || !C14360o3.A0K(this.A09, c109084vX.A09) || !C14360o3.A0K(this.A0A, c109084vX.A0A) || !C14360o3.A0K(this.A0B, c109084vX.A0B) || !C14360o3.A0K(this.A0C, c109084vX.A0C)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        C109854xD c109854xD = this.A00;
        int hashCode = (c109854xD == null ? 0 : c109854xD.hashCode()) * 31;
        C914346k c914346k = this.A02;
        int hashCode2 = (hashCode + (c914346k == null ? 0 : c914346k.hashCode())) * 31;
        C914346k c914346k2 = this.A03;
        int hashCode3 = (hashCode2 + (c914346k2 == null ? 0 : c914346k2.hashCode())) * 31;
        List list = this.A0D;
        int hashCode4 = (hashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.A08;
        int hashCode5 = (hashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        C109874xF c109874xF = this.A01;
        int hashCode6 = (hashCode5 + (c109874xF == null ? 0 : c109874xF.hashCode())) * 31;
        Integer num = this.A05;
        int hashCode7 = (hashCode6 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.A06;
        int hashCode8 = (hashCode7 + (num2 == null ? 0 : num2.hashCode())) * 31;
        C914346k c914346k3 = this.A04;
        int hashCode9 = (hashCode8 + (c914346k3 == null ? 0 : c914346k3.hashCode())) * 31;
        Integer num3 = this.A07;
        int hashCode10 = (hashCode9 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str2 = this.A09;
        int hashCode11 = (hashCode10 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.A0A;
        int hashCode12 = (hashCode11 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.A0B;
        int hashCode13 = (hashCode12 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.A0C;
        return hashCode13 + (str5 != null ? str5.hashCode() : 0);
    }

    @Override // X.InterfaceC109094vY
    public final /* bridge */ /* synthetic */ C69728VuN AKQ() {
        return new C69728VuN(this);
    }

    @Override // X.InterfaceC109094vY
    public final /* bridge */ /* synthetic */ InterfaceC109864xE AfL() {
        return this.A00;
    }

    @Override // X.InterfaceC109094vY
    public final C914346k AfM() {
        return this.A02;
    }

    @Override // X.InterfaceC109094vY
    public final C914346k AgU() {
        return this.A03;
    }

    @Override // X.InterfaceC109094vY
    public final List AjH() {
        return this.A0D;
    }

    @Override // X.InterfaceC109094vY
    public final /* bridge */ /* synthetic */ InterfaceC109884xG BEg() {
        return this.A01;
    }

    @Override // X.InterfaceC109094vY
    public final Integer BUD() {
        return this.A05;
    }

    @Override // X.InterfaceC109094vY
    public final Integer BaV() {
        return this.A06;
    }

    @Override // X.InterfaceC109094vY
    public final C914346k BaW() {
        return this.A04;
    }

    @Override // X.InterfaceC109094vY
    public final Integer BaY() {
        return this.A07;
    }

    @Override // X.InterfaceC109094vY
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTMediaOverlayPayloadSchema", AbstractC69869Vwu.A01(this));
    }

    @Override // X.InterfaceC109094vY
    public final String getDescription() {
        return this.A08;
    }

    @Override // X.InterfaceC109094vY
    public final String getOverlayType() {
        return this.A09;
    }

    @Override // X.InterfaceC109094vY
    public final String getSessionId() {
        return this.A0A;
    }

    @Override // X.InterfaceC109094vY
    public final String getSubCategory() {
        return this.A0B;
    }

    @Override // X.InterfaceC109094vY
    public final String getTitle() {
        return this.A0C;
    }

    public C109084vX(C109854xD c109854xD, C109874xF c109874xF, C914346k c914346k, C914346k c914346k2, C914346k c914346k3, Integer num, Integer num2, Integer num3, String str, String str2, String str3, String str4, String str5, List list) {
        this.A00 = c109854xD;
        this.A02 = c914346k;
        this.A03 = c914346k2;
        this.A0D = list;
        this.A08 = str;
        this.A01 = c109874xF;
        this.A05 = num;
        this.A06 = num2;
        this.A04 = c914346k3;
        this.A07 = num3;
        this.A09 = str2;
        this.A0A = str3;
        this.A0B = str4;
        this.A0C = str5;
    }
}
