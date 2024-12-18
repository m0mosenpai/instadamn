package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.model.reels.netego.ShoppingNetegoInStoryIconType;
import com.instagram.model.reels.netego.ShoppingNetegoInStorySuggestionType;
import com.instagram.model.reels.netego.ShoppingNetegoType;
import java.util.List;

/* renamed from: X.1po, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C38041po extends C0T6 implements InterfaceC38061pq {
    public final C38813H7d A00;
    public final C38813H7d A01;
    public final C38813H7d A02;
    public final C38813H7d A03;
    public final C38813H7d A04;
    public final ShoppingNetegoInStoryIconType A05;
    public final ShoppingNetegoInStorySuggestionType A06;
    public final ShoppingNetegoType A07;
    public final Boolean A08;
    public final Integer A09;
    public final Long A0A;
    public final String A0B;
    public final String A0C;
    public final List A0D;
    public final List A0E;

    @Override // X.InterfaceC38061pq
    public final C38041po F5e(C1DY c1dy) {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C38041po) {
                C38041po c38041po = (C38041po) obj;
                if (!C14360o3.A0K(this.A00, c38041po.A00) || !C14360o3.A0K(this.A01, c38041po.A01) || !C14360o3.A0K(this.A02, c38041po.A02) || !C14360o3.A0K(this.A09, c38041po.A09) || this.A05 != c38041po.A05 || !C14360o3.A0K(this.A0A, c38041po.A0A) || !C14360o3.A0K(this.A08, c38041po.A08) || this.A07 != c38041po.A07 || !C14360o3.A0K(this.A0D, c38041po.A0D) || !C14360o3.A0K(this.A0E, c38041po.A0E) || !C14360o3.A0K(this.A03, c38041po.A03) || this.A06 != c38041po.A06 || !C14360o3.A0K(this.A04, c38041po.A04) || !C14360o3.A0K(this.A0B, c38041po.A0B) || !C14360o3.A0K(this.A0C, c38041po.A0C)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        C38813H7d c38813H7d = this.A00;
        int hashCode = (c38813H7d == null ? 0 : c38813H7d.hashCode()) * 31;
        C38813H7d c38813H7d2 = this.A01;
        int hashCode2 = (hashCode + (c38813H7d2 == null ? 0 : c38813H7d2.hashCode())) * 31;
        C38813H7d c38813H7d3 = this.A02;
        int hashCode3 = (hashCode2 + (c38813H7d3 == null ? 0 : c38813H7d3.hashCode())) * 31;
        Integer num = this.A09;
        int hashCode4 = (hashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        ShoppingNetegoInStoryIconType shoppingNetegoInStoryIconType = this.A05;
        int hashCode5 = (hashCode4 + (shoppingNetegoInStoryIconType == null ? 0 : shoppingNetegoInStoryIconType.hashCode())) * 31;
        Long l = this.A0A;
        int hashCode6 = (hashCode5 + (l == null ? 0 : l.hashCode())) * 31;
        Boolean bool = this.A08;
        int hashCode7 = (hashCode6 + (bool == null ? 0 : bool.hashCode())) * 31;
        ShoppingNetegoType shoppingNetegoType = this.A07;
        int hashCode8 = (hashCode7 + (shoppingNetegoType == null ? 0 : shoppingNetegoType.hashCode())) * 31;
        List list = this.A0D;
        int hashCode9 = (hashCode8 + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.A0E;
        int hashCode10 = (hashCode9 + (list2 == null ? 0 : list2.hashCode())) * 31;
        C38813H7d c38813H7d4 = this.A03;
        int hashCode11 = (hashCode10 + (c38813H7d4 == null ? 0 : c38813H7d4.hashCode())) * 31;
        ShoppingNetegoInStorySuggestionType shoppingNetegoInStorySuggestionType = this.A06;
        int hashCode12 = (hashCode11 + (shoppingNetegoInStorySuggestionType == null ? 0 : shoppingNetegoInStorySuggestionType.hashCode())) * 31;
        C38813H7d c38813H7d5 = this.A04;
        int hashCode13 = (hashCode12 + (c38813H7d5 == null ? 0 : c38813H7d5.hashCode())) * 31;
        String str = this.A0B;
        int hashCode14 = (hashCode13 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.A0C;
        return hashCode14 + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // X.InterfaceC38061pq
    public final /* bridge */ /* synthetic */ JLG AhX() {
        return this.A00;
    }

    @Override // X.InterfaceC38061pq
    public final /* bridge */ /* synthetic */ JLG Awr() {
        return this.A01;
    }

    @Override // X.InterfaceC38061pq
    public final /* bridge */ /* synthetic */ JLG Aws() {
        return this.A02;
    }

    @Override // X.InterfaceC38061pq
    public final Integer Azg() {
        return this.A09;
    }

    @Override // X.InterfaceC38061pq
    public final ShoppingNetegoInStoryIconType BEh() {
        return this.A05;
    }

    @Override // X.InterfaceC38061pq
    public final Long BF7() {
        return this.A0A;
    }

    @Override // X.InterfaceC38061pq
    public final ShoppingNetegoType BWd() {
        return this.A07;
    }

    @Override // X.InterfaceC38061pq
    public final List BhR() {
        return this.A0D;
    }

    @Override // X.InterfaceC38061pq
    public final List Bup() {
        return this.A0E;
    }

    @Override // X.InterfaceC38061pq
    public final /* bridge */ /* synthetic */ JLG C3d() {
        return this.A03;
    }

    @Override // X.InterfaceC38061pq
    public final ShoppingNetegoInStorySuggestionType C3w() {
        return this.A06;
    }

    @Override // X.InterfaceC38061pq
    public final /* bridge */ /* synthetic */ JLG C8s() {
        return this.A04;
    }

    @Override // X.InterfaceC38061pq
    public final String CAR() {
        return this.A0B;
    }

    @Override // X.InterfaceC38061pq
    public final String CCG() {
        return this.A0C;
    }

    @Override // X.InterfaceC38061pq
    public final Boolean Cf0() {
        return this.A08;
    }

    @Override // X.InterfaceC38061pq
    public final InterfaceC38061pq EBj(C1DY c1dy) {
        return this;
    }

    @Override // X.InterfaceC38061pq
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTShoppingNetegoInStory", I33.A00(this));
    }

    public C38041po(C38813H7d c38813H7d, C38813H7d c38813H7d2, C38813H7d c38813H7d3, C38813H7d c38813H7d4, C38813H7d c38813H7d5, ShoppingNetegoInStoryIconType shoppingNetegoInStoryIconType, ShoppingNetegoInStorySuggestionType shoppingNetegoInStorySuggestionType, ShoppingNetegoType shoppingNetegoType, Boolean bool, Integer num, Long l, String str, String str2, List list, List list2) {
        this.A00 = c38813H7d;
        this.A01 = c38813H7d2;
        this.A02 = c38813H7d3;
        this.A09 = num;
        this.A05 = shoppingNetegoInStoryIconType;
        this.A0A = l;
        this.A08 = bool;
        this.A07 = shoppingNetegoType;
        this.A0D = list;
        this.A0E = list2;
        this.A03 = c38813H7d4;
        this.A06 = shoppingNetegoInStorySuggestionType;
        this.A04 = c38813H7d5;
        this.A0B = str;
        this.A0C = str2;
    }
}
