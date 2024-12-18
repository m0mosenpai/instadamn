package X;

import com.instagram.common.typedurl.ImageUrl;
import com.instagram.shopping.model.taggingfeed.SourceType;
import com.instagram.user.model.ProductCollectionImpl;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.GzR, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38686GzR extends C0T6 {
    public Object A00;
    public Object A01;
    public String A02;
    public String A03;
    public String A04;
    public final int A05;

    public static void A00(InterfaceC02590Ai interfaceC02590Ai, C38686GzR c38686GzR) {
        interfaceC02590Ai.AAP("source_type", c38686GzR.A01.toString());
        interfaceC02590Ai.AAP("source_id", c38686GzR.A03);
        interfaceC02590Ai.AAP("source_name", c38686GzR.A04);
    }

    public static boolean A01(Object obj, int i) {
        if ((obj instanceof C38686GzR) && ((C38686GzR) obj).A05 == i) {
            return true;
        }
        return false;
    }

    public final boolean A02() {
        List list = (List) this.A01;
        if ((list == null || list.isEmpty()) && this.A03 == null) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:121:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:137:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:40:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:61:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:78:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r3) {
        /*
            Method dump skipped, instructions count: 524
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C38686GzR.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int A0O;
        int A0I;
        Object obj;
        String str;
        int A0J;
        int A07;
        switch (this.A05) {
            case 0:
                A0I = AbstractC166997dE.A0J(this.A00, AbstractC166997dE.A0J(this.A01, AbstractC166997dE.A0K(this.A03, AbstractC166987dD.A0J(this.A04))));
                A0O = AbstractC167017dG.A0O(this.A02);
                break;
            case 1:
                A0O = ((((((AbstractC167017dG.A0M(this.A01) * 31) + AbstractC167017dG.A0M(this.A00)) * 31) + AbstractC167017dG.A0O(this.A03)) * 31) + AbstractC167017dG.A0O(this.A02)) * 31;
                str = this.A04;
                A0I = AbstractC25227BEk.A07(str);
                break;
            case 2:
                A0J = ((AbstractC167017dG.A0O(this.A02) * 31) + AbstractC167017dG.A0O(this.A03)) * 31;
                A07 = AbstractC166997dE.A0I(this.A00);
                A0I = AbstractC166997dE.A0J(this.A01, (A0J + A07) * 31);
                A0O = this.A04.hashCode();
                break;
            case 3:
                A0J = (AbstractC166987dD.A0J(this.A02) + AbstractC167017dG.A0M(this.A00)) * 31;
                A07 = AbstractC25227BEk.A07(this.A03);
                A0I = AbstractC166997dE.A0J(this.A01, (A0J + A07) * 31);
                A0O = this.A04.hashCode();
                break;
            case 4:
                A0O = ((((((AbstractC167017dG.A0M(this.A01) * 31) + AbstractC167017dG.A0O(this.A03)) * 31) + AbstractC167017dG.A0M(this.A00)) * 31) + AbstractC167017dG.A0O(this.A04)) * 31;
                str = this.A02;
                A0I = AbstractC25227BEk.A07(str);
                break;
            case 5:
                A0I = AbstractC166997dE.A0K(this.A04, AbstractC166997dE.A0K(this.A03, AbstractC166987dD.A0J(this.A02)));
                obj = this.A01;
                A0O = obj.hashCode();
                break;
            case 6:
                A0O = (((((AbstractC166987dD.A0G(this.A00) + AbstractC167017dG.A0O(this.A03)) * 31) + AbstractC167017dG.A0O(this.A04)) * 31) + AbstractC167017dG.A0O(this.A02)) * 31;
                A0I = AbstractC166997dE.A0I(this.A01);
                break;
            case 7:
                A0O = ((((((AbstractC167017dG.A0M(this.A00) * 31) + AbstractC167017dG.A0O(this.A04)) * 31) + AbstractC167017dG.A0O(this.A03)) * 31) + AbstractC167017dG.A0O(this.A02)) * 31;
                A0I = AbstractC166997dE.A0I(this.A01);
                break;
            case 8:
                A0O = ((((((AbstractC167017dG.A0O(this.A03) * 31) + AbstractC167017dG.A0O(this.A04)) * 31) + AbstractC167017dG.A0O(this.A02)) * 31) + AbstractC167017dG.A0M(this.A01)) * 31;
                A0I = AbstractC166997dE.A0I(this.A00);
                break;
            default:
                A0I = AbstractC166997dE.A0K(this.A04, AbstractC166997dE.A0K(this.A03, (AbstractC166987dD.A0G(this.A00) + AbstractC167017dG.A0O(this.A02)) * 31));
                obj = this.A01;
                A0O = obj.hashCode();
                break;
        }
        return A0I + A0O;
    }

    public final String toString() {
        if (5 - this.A05 != 0) {
            return super.toString();
        }
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("ClipsSfxCategory(id=");
        A1C.append(this.A02);
        A1C.append(", title=");
        A1C.append(this.A03);
        A1C.append(", type=");
        A1C.append(this.A04);
        A1C.append(", previewItems=");
        return AbstractC167017dG.A0o(this.A01, A1C);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C38686GzR() {
        this(null, null, null, null, null, 4);
        this.A05 = 4;
        this.A05 = 4;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C38686GzR(ProductCollectionImpl productCollectionImpl, String str, String str2, List list) {
        this(productCollectionImpl, list, str2, str, null, 4);
        this.A05 = 4;
    }

    public C38686GzR(Boolean bool, String str, String str2, String str3, List list) {
        this.A05 = 6;
        this.A00 = list;
        this.A03 = str;
        this.A04 = str2;
        this.A02 = str3;
        this.A01 = bool;
    }

    public C38686GzR(SourceType sourceType, String str, String str2, String str3, List list) {
        this.A05 = 9;
        AbstractC25234BEr.A0j(1, list, str2, str3, sourceType);
        this.A00 = list;
        this.A02 = str;
        this.A03 = str2;
        this.A04 = str3;
        this.A01 = sourceType;
    }

    public C38686GzR(User user, String str, String str2, String str3, List list) {
        this.A05 = 2;
        AbstractC167007dF.A1G(list, 4, str3);
        this.A02 = str;
        this.A03 = str2;
        this.A00 = user;
        this.A01 = list;
        this.A04 = str3;
    }

    public C38686GzR(ImageUrl imageUrl, User user, String str, String str2, String str3) {
        this.A05 = 3;
        AbstractC25233BEq.A0x(1, str, user, str3);
        this.A02 = str;
        this.A00 = imageUrl;
        this.A03 = str2;
        this.A01 = user;
        this.A04 = str3;
    }

    public C38686GzR(C161957Nf c161957Nf, C161957Nf c161957Nf2, String str, String str2, String str3) {
        this.A05 = 0;
        AbstractC167017dG.A1Q(str, c161957Nf);
        this.A04 = str;
        this.A03 = str2;
        this.A01 = c161957Nf;
        this.A00 = c161957Nf2;
        this.A02 = str3;
    }

    public C38686GzR(Object obj, Object obj2, String str, String str2, String str3, int i) {
        this.A05 = i;
        this.A00 = obj;
        this.A04 = str;
        this.A03 = str2;
        this.A02 = str3;
        this.A01 = obj2;
    }

    public C38686GzR(String str, String str2, String str3, List list) {
        this.A05 = 5;
        AbstractC167027dH.A0a(1, str, str2, str3, list);
        this.A02 = str;
        this.A03 = str2;
        this.A04 = str3;
        this.A01 = list;
        this.A00 = AbstractC09440dt.A01(new C57521Pfv(this, 30));
    }
}
