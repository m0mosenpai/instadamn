package X;

import com.instagram.common.gallery.metadata.MediaUploadMetadata;
import com.instagram.common.typedurl.ImageUrl;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: X.Jxs, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45123Jxs extends C0T6 {
    public Object A00;
    public Object A01;
    public String A02;
    public String A03;
    public String A04;
    public String A05;
    public final int A06;

    public static boolean A00(Object obj, int i) {
        if ((obj instanceof C45123Jxs) && ((C45123Jxs) obj).A06 == i) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r3) {
        /*
            Method dump skipped, instructions count: 428
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C45123Jxs.equals(java.lang.Object):boolean");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    public final int hashCode() {
        int A0K;
        Object obj;
        int hashCode;
        String str;
        switch (this.A06) {
            case 1:
                hashCode = (((AbstractC166997dE.A0K(this.A03, ((AbstractC167017dG.A0M(this.A00) * 31) + AbstractC167017dG.A0O(this.A02)) * 31) + AbstractC167017dG.A0O(this.A04)) * 31) + AbstractC167017dG.A0O(this.A05)) * 31;
                A0K = AbstractC166997dE.A0I(this.A01);
                return hashCode + A0K;
            case 2:
                A0K = AbstractC166997dE.A0K(this.A04, AbstractC166997dE.A0K(this.A03, AbstractC166997dE.A0K(this.A02, ((AbstractC167017dG.A0M(this.A00) * 31) + AbstractC166997dE.A0I(this.A01)) * 31)));
                str = this.A05;
                hashCode = str.hashCode();
                return hashCode + A0K;
            case 3:
                A0K = (((AbstractC166997dE.A0K(this.A03, AbstractC166997dE.A0K(this.A05, AbstractC166987dD.A0J(this.A04))) + AbstractC167017dG.A0M(this.A00)) * 31) + AbstractC166997dE.A0I(this.A01)) * 31;
                str = this.A02;
                hashCode = str.hashCode();
                return hashCode + A0K;
            case 4:
                A0K = AbstractC166997dE.A0K(this.A05, ((((((AbstractC167017dG.A0O(this.A02) * 31) + AbstractC167017dG.A0M(this.A00)) * 31) + AbstractC167017dG.A0M(this.A01)) * 31) + AbstractC25227BEk.A07(this.A04)) * 31);
                str = this.A03;
                hashCode = str.hashCode();
                return hashCode + A0K;
            case 5:
                A0K = AbstractC166997dE.A0J(this.A00, (AbstractC166997dE.A0K(this.A04, AbstractC166997dE.A0K(this.A05, AbstractC166987dD.A0J(this.A03))) + AbstractC167017dG.A0O(this.A02)) * 31);
                obj = this.A01;
                hashCode = obj.hashCode();
                return hashCode + A0K;
            case 6:
            default:
                return super.hashCode();
            case 7:
                A0K = (((AbstractC166997dE.A0K(this.A04, AbstractC166997dE.A0K(this.A03, AbstractC166987dD.A0J(this.A02))) + AbstractC167017dG.A0O(this.A05)) * 31) + AbstractC166997dE.A0I(this.A01)) * 31;
                obj = this.A00;
                hashCode = obj.hashCode();
                return hashCode + A0K;
        }
    }

    public C45123Jxs(Float f, Integer num, String str, String str2, String str3, String str4) {
        this.A06 = 1;
        C14360o3.A0B(str2, 3);
        this.A00 = f;
        this.A02 = str;
        this.A03 = str2;
        this.A04 = str3;
        this.A05 = str4;
        this.A01 = num;
    }

    public C45123Jxs(ImageUrl imageUrl, ImageUrl imageUrl2, String str, String str2, String str3, String str4) {
        this.A06 = 4;
        AbstractC167017dG.A1T(str3, str4);
        this.A02 = str;
        this.A00 = imageUrl;
        this.A01 = imageUrl2;
        this.A04 = str2;
        this.A05 = str3;
        this.A03 = str4;
    }

    public C45123Jxs(UPJ upj, String str, String str2, String str3, String str4, List list) {
        this.A06 = 2;
        AbstractC25233BEq.A0x(3, str, str2, str3);
        C14360o3.A0B(str4, 6);
        this.A00 = list;
        this.A01 = upj;
        this.A02 = str;
        this.A03 = str2;
        this.A04 = str3;
        this.A05 = str4;
    }

    public C45123Jxs(Integer num, String str, String str2, String str3) {
        this.A06 = 0;
        AbstractC167027dH.A13(str, str2, str3);
        this.A03 = str;
        this.A05 = str2;
        this.A04 = str3;
        this.A01 = num;
        this.A02 = null;
        this.A00 = null;
    }

    public C45123Jxs(String str, String str2, String str3, String str4, Map map, Map map2) {
        this.A06 = 5;
        AbstractC167027dH.A13(str, str2, str3);
        AbstractC25229BEm.A1I(map, 5, map2);
        this.A03 = str;
        this.A05 = str2;
        this.A04 = str3;
        this.A02 = str4;
        this.A00 = map;
        this.A01 = map2;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C45123Jxs(Integer num, String str, String str2, String str3, String str4, List list, DefaultConstructorMarker defaultConstructorMarker, int i, int i2) {
        this(num, str, str2, str3);
        this.A06 = 0;
    }

    public C45123Jxs(Long l, Long l2, String str, String str2, String str3, String str4) {
        this.A06 = 3;
        this.A04 = str;
        this.A05 = str2;
        this.A03 = str3;
        this.A00 = l;
        this.A01 = l2;
        this.A02 = str4;
    }

    public C45123Jxs(MediaUploadMetadata mediaUploadMetadata, Boolean bool, String str, String str2, String str3) {
        this.A06 = 6;
        this.A05 = str;
        this.A04 = str2;
        this.A02 = str3;
        this.A03 = null;
        this.A00 = bool;
        this.A01 = mediaUploadMetadata;
    }

    public C45123Jxs() {
        this.A06 = 7;
        this.A06 = 7;
        C45116Jxl c45116Jxl = new C45116Jxl(null, 7, 19);
        this.A06 = 7;
        this.A02 = "";
        this.A03 = "";
        this.A04 = "";
        this.A05 = null;
        this.A01 = null;
        this.A00 = c45116Jxl;
    }
}
