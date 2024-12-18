package X;

import com.instagram.api.schemas.MusicPageTabType;
import com.instagram.music.common.model.MusicAssetModel;
import java.util.List;

/* renamed from: X.Gyu, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38653Gyu extends C0T6 {
    public final C51737MtK A00;
    public final C45116Jxl A01;
    public final C84023om A02;
    public final InterfaceC88553xD A03;
    public final MusicAssetModel A04;
    public final String A05;
    public final List A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;
    public final MusicPageTabType A0B;

    public C38653Gyu(C51737MtK c51737MtK, C45116Jxl c45116Jxl, MusicPageTabType musicPageTabType, C84023om c84023om, InterfaceC88553xD interfaceC88553xD, MusicAssetModel musicAssetModel, String str, List list, boolean z, boolean z2, boolean z3, boolean z4) {
        AbstractC25229BEm.A1J(list, 1, musicPageTabType);
        this.A06 = list;
        this.A08 = z;
        this.A0A = z2;
        this.A07 = z3;
        this.A03 = interfaceC88553xD;
        this.A05 = str;
        this.A09 = z4;
        this.A01 = c45116Jxl;
        this.A02 = c84023om;
        this.A0B = musicPageTabType;
        this.A00 = c51737MtK;
        this.A04 = musicAssetModel;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C38653Gyu) {
                C38653Gyu c38653Gyu = (C38653Gyu) obj;
                if (!C14360o3.A0K(this.A06, c38653Gyu.A06) || this.A08 != c38653Gyu.A08 || this.A0A != c38653Gyu.A0A || this.A07 != c38653Gyu.A07 || !C14360o3.A0K(this.A03, c38653Gyu.A03) || !C14360o3.A0K(this.A05, c38653Gyu.A05) || this.A09 != c38653Gyu.A09 || !C14360o3.A0K(this.A01, c38653Gyu.A01) || !C14360o3.A0K(this.A02, c38653Gyu.A02) || this.A0B != c38653Gyu.A0B || !C14360o3.A0K(this.A00, c38653Gyu.A00) || !C14360o3.A0K(this.A04, c38653Gyu.A04)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((AbstractC166997dE.A0J(this.A0B, (((AbstractC167007dF.A0D(this.A09, (((AbstractC167007dF.A0D(this.A07, AbstractC167007dF.A0D(this.A0A, AbstractC167007dF.A0D(this.A08, AbstractC166987dD.A0G(this.A06)))) + AbstractC167017dG.A0M(this.A03)) * 31) + AbstractC167017dG.A0O(this.A05)) * 31) + AbstractC167017dG.A0M(this.A01)) * 31) + AbstractC167017dG.A0M(this.A02)) * 31) + AbstractC167017dG.A0M(this.A00)) * 31) + AbstractC166997dE.A0I(this.A04);
    }
}
