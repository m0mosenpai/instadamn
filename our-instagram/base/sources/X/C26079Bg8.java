package X;

import com.instagram.creatortools.api.schemas.EligibilityCriteria;
import java.util.List;

/* renamed from: X.Bg8, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26079Bg8 extends C0T6 {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final String A03;
    public final String A04;
    public final boolean A05;

    public C26079Bg8(AbstractC46437Kgx abstractC46437Kgx, C3o9 c3o9, String str, String str2, boolean z) {
        this.A00 = 6;
        AbstractC25234BEr.A1P(c3o9, str, abstractC46437Kgx);
        this.A02 = c3o9;
        this.A04 = str;
        this.A03 = str2;
        this.A01 = abstractC46437Kgx;
        this.A05 = z;
    }

    public static boolean A00(Object obj, int i) {
        if ((obj instanceof C26079Bg8) && ((C26079Bg8) obj).A00 == i) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x003e A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:55:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:76:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x000e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r3) {
        /*
            Method dump skipped, instructions count: 348
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26079Bg8.equals(java.lang.Object):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int hashCode() {
        /*
            Method dump skipped, instructions count: 308
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26079Bg8.hashCode():int");
    }

    public final String toString() {
        if (7 - this.A00 != 0) {
            return super.toString();
        }
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("IgFeedFundedIncentiveBannerSectionUiState(buyerIncentiveAdsInfo=");
        A1C.append(this.A02);
        A1C.append(", buyerIncentiveAdsInfoDescriptionText=");
        A1C.append(this.A04);
        A1C.append(", buyerIncentiveAdsInfoButtonText=");
        A1C.append(this.A03);
        A1C.append(AbstractC43591JPw.A00(23));
        A1C.append(this.A01);
        A1C.append(", isNewDesign=");
        return AbstractC25236BEt.A0a(A1C, this.A05);
    }

    public C26079Bg8(Object obj, Object obj2, String str, String str2, int i, boolean z) {
        this.A00 = i;
        this.A02 = obj;
        this.A04 = str;
        this.A03 = str2;
        this.A01 = obj2;
        this.A05 = z;
    }

    public C26079Bg8(EnumC27417C7u enumC27417C7u, Integer num, String str, String str2, boolean z) {
        this.A00 = 3;
        this.A02 = enumC27417C7u;
        this.A04 = str;
        this.A03 = str2;
        this.A05 = z;
        this.A01 = num;
    }

    public C26079Bg8(EligibilityCriteria eligibilityCriteria, String str, String str2, List list, boolean z) {
        this.A00 = 4;
        AbstractC167027dH.A13(str, str2, eligibilityCriteria);
        this.A03 = str;
        this.A04 = str2;
        this.A01 = eligibilityCriteria;
        this.A02 = list;
        this.A05 = z;
    }

    public C26079Bg8(String str, String str2, List list, List list2, boolean z) {
        this.A00 = 0;
        this.A04 = str;
        this.A03 = str2;
        this.A01 = list;
        this.A02 = list2;
        this.A05 = z;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C26079Bg8(Integer num, String str, InterfaceC16820sZ interfaceC16820sZ, int i) {
        this((i & 2) != 0 ? C05F.A00 : num, str, (i & 16) != 0 ? C29753DAx.A00 : interfaceC16820sZ, AbstractC167007dF.A1M(i & 8));
        this.A00 = 2;
    }

    public C26079Bg8(Integer num, String str, InterfaceC16820sZ interfaceC16820sZ, boolean z) {
        this.A00 = 2;
        C14360o3.A0B(str, 1);
        AbstractC167007dF.A1G(num, 2, interfaceC16820sZ);
        this.A04 = str;
        this.A02 = num;
        this.A03 = null;
        this.A05 = z;
        this.A01 = interfaceC16820sZ;
    }
}
