package X;

import com.facebook.R;
import com.instagram.api.schemas.MidCardLayoutType;
import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.Bja, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26267Bja extends C0T6 implements InterfaceC31075DlH {
    public final int A00;
    public final MidCardLayoutType A03;
    public final C5QE A04;
    public final ImageUrl A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final InterfaceC30894Di7 A0A;
    public final String A0B;
    public final boolean A0C;
    public final int A02 = R.dimen.ab_test_media_thumbnail_preview_item_internal_padding;
    public final int A01 = R.dimen.abc_edit_text_inset_bottom_material;
    public final boolean A09 = true;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C26267Bja) {
                C26267Bja c26267Bja = (C26267Bja) obj;
                if (!C14360o3.A0K(this.A0B, c26267Bja.A0B) || !C14360o3.A0K(this.A08, c26267Bja.A08) || !C14360o3.A0K(this.A07, c26267Bja.A07) || !C14360o3.A0K(this.A05, c26267Bja.A05) || this.A0C != c26267Bja.A0C || !C14360o3.A0K(this.A06, c26267Bja.A06) || !C14360o3.A0K(this.A04, c26267Bja.A04) || this.A02 != c26267Bja.A02 || this.A01 != c26267Bja.A01 || this.A00 != c26267Bja.A00 || this.A09 != c26267Bja.A09 || this.A03 != c26267Bja.A03 || !C14360o3.A0K(this.A0A, c26267Bja.A0A)) {
                }
            }
            return false;
        }
        return true;
    }

    public C26267Bja(MidCardLayoutType midCardLayoutType, C5QE c5qe, ImageUrl imageUrl, InterfaceC30894Di7 interfaceC30894Di7, String str, String str2, String str3, String str4, int i, boolean z) {
        this.A0B = str;
        this.A08 = str2;
        this.A07 = str3;
        this.A05 = imageUrl;
        this.A0C = z;
        this.A06 = str4;
        this.A04 = c5qe;
        this.A00 = i;
        this.A03 = midCardLayoutType;
        this.A0A = interfaceC30894Di7;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A0A, AbstractC166997dE.A0J(this.A03, AbstractC167007dF.A0D(this.A09, (((((((AbstractC166997dE.A0K(this.A06, AbstractC167007dF.A0D(this.A0C, ((((((AbstractC167017dG.A0O(this.A0B) * 31) + AbstractC167017dG.A0O(this.A08)) * 31) + AbstractC167017dG.A0O(this.A07)) * 31) + AbstractC167017dG.A0M(this.A05)) * 31)) + AbstractC166997dE.A0I(this.A04)) * 31) + this.A02) * 31) + this.A01) * 31) + this.A00) * 31)));
    }

    @Override // X.InterfaceC31075DlH
    public final int Aly() {
        return this.A00;
    }

    @Override // X.InterfaceC31075DlH
    public final String AoK() {
        return this.A06;
    }

    @Override // X.InterfaceC31075DlH
    public final int Atu() {
        return this.A01;
    }

    @Override // X.InterfaceC31075DlH
    public final ImageUrl BGt() {
        return this.A05;
    }

    @Override // X.InterfaceC31075DlH
    public final int BK7() {
        return this.A02;
    }

    @Override // X.InterfaceC31075DlH
    public final MidCardLayoutType BTl() {
        return this.A03;
    }

    @Override // X.InterfaceC31075DlH
    public final InterfaceC30894Di7 BaX() {
        return this.A0A;
    }

    @Override // X.InterfaceC31075DlH
    public final boolean CSi() {
        return this.A0C;
    }

    @Override // X.InterfaceC31075DlH
    public final String getMediaId() {
        return this.A0B;
    }
}
