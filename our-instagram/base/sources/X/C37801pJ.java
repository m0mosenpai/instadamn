package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.ACRType;
import com.instagram.model.reels.ReelType;
import java.util.List;

/* renamed from: X.1pJ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C37801pJ extends C0T6 implements InterfaceC37821pL {
    public final ACRType A00;
    public final InterfaceC43521JKh A01;
    public final C38321qM A02;
    public final ReelType A03;
    public final Long A04;
    public final Long A05;
    public final Long A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final String A0B;
    public final String A0C;
    public final List A0D;

    @Override // X.InterfaceC37821pL
    public final C37801pJ F5H(C1DY c1dy) {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C37801pJ) {
                C37801pJ c37801pJ = (C37801pJ) obj;
                if (this.A00 != c37801pJ.A00 || !C14360o3.A0K(this.A04, c37801pJ.A04) || !C14360o3.A0K(this.A07, c37801pJ.A07) || !C14360o3.A0K(this.A08, c37801pJ.A08) || !C14360o3.A0K(this.A09, c37801pJ.A09) || !C14360o3.A0K(this.A0A, c37801pJ.A0A) || !C14360o3.A0K(this.A05, c37801pJ.A05) || !C14360o3.A0K(this.A02, c37801pJ.A02) || !C14360o3.A0K(this.A06, c37801pJ.A06) || this.A03 != c37801pJ.A03 || !C14360o3.A0K(this.A0D, c37801pJ.A0D) || !C14360o3.A0K(this.A0B, c37801pJ.A0B) || !C14360o3.A0K(this.A01, c37801pJ.A01) || !C14360o3.A0K(this.A0C, c37801pJ.A0C)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        ACRType aCRType = this.A00;
        int hashCode = (aCRType == null ? 0 : aCRType.hashCode()) * 31;
        Long l = this.A04;
        int hashCode2 = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        String str = this.A07;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.A08;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.A09;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.A0A;
        int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Long l2 = this.A05;
        int hashCode7 = (hashCode6 + (l2 == null ? 0 : l2.hashCode())) * 31;
        C38321qM c38321qM = this.A02;
        int hashCode8 = (hashCode7 + (c38321qM == null ? 0 : c38321qM.hashCode())) * 31;
        Long l3 = this.A06;
        int hashCode9 = (hashCode8 + (l3 == null ? 0 : l3.hashCode())) * 31;
        ReelType reelType = this.A03;
        int hashCode10 = (hashCode9 + (reelType == null ? 0 : reelType.hashCode())) * 31;
        List list = this.A0D;
        int hashCode11 = (hashCode10 + (list == null ? 0 : list.hashCode())) * 31;
        String str5 = this.A0B;
        int hashCode12 = (hashCode11 + (str5 == null ? 0 : str5.hashCode())) * 31;
        InterfaceC43521JKh interfaceC43521JKh = this.A01;
        int hashCode13 = (hashCode12 + (interfaceC43521JKh == null ? 0 : interfaceC43521JKh.hashCode())) * 31;
        String str6 = this.A0C;
        return hashCode13 + (str6 != null ? str6.hashCode() : 0);
    }

    @Override // X.InterfaceC37821pL
    public final ACRType AYG() {
        return this.A00;
    }

    @Override // X.InterfaceC37821pL
    public final Long AYJ() {
        return this.A04;
    }

    @Override // X.InterfaceC37821pL
    public final String AYe() {
        return this.A07;
    }

    @Override // X.InterfaceC37821pL
    public final String Aqt() {
        return this.A09;
    }

    @Override // X.InterfaceC37821pL
    public final String Ar0() {
        return this.A0A;
    }

    @Override // X.InterfaceC37821pL
    public final Long BF7() {
        return this.A05;
    }

    @Override // X.InterfaceC37821pL
    public final C38321qM Bft() {
        return this.A02;
    }

    @Override // X.InterfaceC37821pL
    public final Long Bly() {
        return this.A06;
    }

    @Override // X.InterfaceC37821pL
    public final ReelType Blz() {
        return this.A03;
    }

    @Override // X.InterfaceC37821pL
    public final List Byl() {
        return this.A0D;
    }

    @Override // X.InterfaceC37821pL
    public final InterfaceC43521JKh CAG() {
        return this.A01;
    }

    @Override // X.InterfaceC37821pL
    public final String CAR() {
        return this.A0C;
    }

    @Override // X.InterfaceC37821pL
    public final InterfaceC37821pL EBa(C1DY c1dy) {
        return this;
    }

    @Override // X.InterfaceC37821pL
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTAutoCreatedReelsNetegoInStory", I2T.A00(this));
    }

    @Override // X.InterfaceC37821pL
    public final String getAudioClusterId() {
        return this.A08;
    }

    @Override // X.InterfaceC37821pL
    public final String getTitle() {
        return this.A0B;
    }

    public C37801pJ(ACRType aCRType, InterfaceC43521JKh interfaceC43521JKh, C38321qM c38321qM, ReelType reelType, Long l, Long l2, Long l3, String str, String str2, String str3, String str4, String str5, String str6, List list) {
        this.A00 = aCRType;
        this.A04 = l;
        this.A07 = str;
        this.A08 = str2;
        this.A09 = str3;
        this.A0A = str4;
        this.A05 = l2;
        this.A02 = c38321qM;
        this.A06 = l3;
        this.A03 = reelType;
        this.A0D = list;
        this.A0B = str5;
        this.A01 = interfaceC43521JKh;
        this.A0C = str6;
    }
}
