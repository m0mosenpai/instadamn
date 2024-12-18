package X;

import com.facebook.R;
import com.instagram.api.schemas.MidCardClipsClickedAction;
import com.instagram.api.schemas.MidCardLayoutType;
import com.instagram.common.typedurl.ImageUrl;
import java.util.List;

/* renamed from: X.Bjb, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26268Bjb extends C0T6 implements InterfaceC31075DlH {
    public final int A00;
    public final MidCardClipsClickedAction A01;
    public final InterfaceC31122Dm5 A02;
    public final C26135BhM A03;
    public final C26135BhM A04;
    public final MidCardLayoutType A05;
    public final ImageUrl A06;
    public final Long A07;
    public final String A08;
    public final List A09;
    public final List A0A;
    public final C0UO A0B;
    public final InterfaceC30894Di7 A0E;
    public final String A0F;
    public final boolean A0G;
    public final int A0D = R.dimen.abc_select_dialog_padding_start_material;
    public final int A0C = R.dimen.account_discovery_bottom_gap;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C26268Bjb) {
                C26268Bjb c26268Bjb = (C26268Bjb) obj;
                if (!C14360o3.A0K(this.A07, c26268Bjb.A07) || !C14360o3.A0K(this.A09, c26268Bjb.A09) || !C14360o3.A0K(this.A0F, c26268Bjb.A0F) || !C14360o3.A0K(this.A06, c26268Bjb.A06) || this.A0G != c26268Bjb.A0G || !C14360o3.A0K(this.A08, c26268Bjb.A08) || !C14360o3.A0K(this.A0B, c26268Bjb.A0B) || this.A0D != c26268Bjb.A0D || this.A0C != c26268Bjb.A0C || this.A00 != c26268Bjb.A00 || this.A01 != c26268Bjb.A01 || !C14360o3.A0K(this.A02, c26268Bjb.A02) || this.A05 != c26268Bjb.A05 || !C14360o3.A0K(this.A0E, c26268Bjb.A0E) || !C14360o3.A0K(this.A04, c26268Bjb.A04) || !C14360o3.A0K(this.A03, c26268Bjb.A03) || !C14360o3.A0K(this.A0A, c26268Bjb.A0A)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((AbstractC166997dE.A0J(this.A0E, AbstractC166997dE.A0J(this.A05, (((((((((AbstractC166997dE.A0J(this.A0B, AbstractC166997dE.A0K(this.A08, AbstractC167007dF.A0D(this.A0G, ((((((AbstractC167017dG.A0M(this.A07) * 31) + AbstractC167017dG.A0M(this.A09)) * 31) + AbstractC167017dG.A0O(this.A0F)) * 31) + AbstractC167017dG.A0M(this.A06)) * 31))) + this.A0D) * 31) + this.A0C) * 31) + this.A00) * 31) + AbstractC167017dG.A0M(this.A01)) * 31) + AbstractC167017dG.A0M(this.A02)) * 31)) + AbstractC167017dG.A0M(this.A04)) * 31) + AbstractC167017dG.A0M(this.A03)) * 31) + AbstractC166997dE.A0I(this.A0A);
    }

    public C26268Bjb(MidCardClipsClickedAction midCardClipsClickedAction, InterfaceC31122Dm5 interfaceC31122Dm5, C26135BhM c26135BhM, C26135BhM c26135BhM2, MidCardLayoutType midCardLayoutType, ImageUrl imageUrl, InterfaceC30894Di7 interfaceC30894Di7, Long l, String str, String str2, List list, List list2, C0UO c0uo, int i, boolean z) {
        this.A07 = l;
        this.A09 = list;
        this.A0F = str;
        this.A06 = imageUrl;
        this.A0G = z;
        this.A08 = str2;
        this.A0B = c0uo;
        this.A00 = i;
        this.A01 = midCardClipsClickedAction;
        this.A02 = interfaceC31122Dm5;
        this.A05 = midCardLayoutType;
        this.A0E = interfaceC30894Di7;
        this.A04 = c26135BhM;
        this.A03 = c26135BhM2;
        this.A0A = list2;
    }

    @Override // X.InterfaceC31075DlH
    public final int Aly() {
        return this.A00;
    }

    @Override // X.InterfaceC31075DlH
    public final String AoK() {
        return this.A08;
    }

    @Override // X.InterfaceC31075DlH
    public final int Atu() {
        return this.A0C;
    }

    @Override // X.InterfaceC31075DlH
    public final ImageUrl BGt() {
        return this.A06;
    }

    @Override // X.InterfaceC31075DlH
    public final int BK7() {
        return this.A0D;
    }

    @Override // X.InterfaceC31075DlH
    public final MidCardLayoutType BTl() {
        return this.A05;
    }

    @Override // X.InterfaceC31075DlH
    public final InterfaceC30894Di7 BaX() {
        return this.A0E;
    }

    @Override // X.InterfaceC31075DlH
    public final boolean CSi() {
        return this.A0G;
    }

    @Override // X.InterfaceC31075DlH
    public final String getMediaId() {
        return this.A0F;
    }
}
