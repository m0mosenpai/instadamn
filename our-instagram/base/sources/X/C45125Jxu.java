package X;

import android.view.View;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.direct.msys.subtype.MsysThreadSubtype;
import java.util.List;
import java.util.Map;

/* renamed from: X.Jxu, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45125Jxu extends C0T6 {
    public Object A00;
    public Object A01;
    public boolean A02;
    public final int A03;
    public final Object A04;

    public final List A01(EnumC39623HeX enumC39623HeX) {
        Object obj;
        int A05 = AbstractC25227BEk.A05(enumC39623HeX, 0);
        if (A05 != 0) {
            if (A05 != 1) {
                if (A05 != 3 && A05 != 2) {
                    throw B4Z.A00();
                }
                obj = this.A01;
            } else {
                obj = this.A04;
            }
        } else {
            obj = this.A00;
        }
        return (List) obj;
    }

    public static boolean A00(Object obj, int i) {
        if ((obj instanceof C45125Jxu) && ((C45125Jxu) obj).A03 == i) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:154:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:80:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:81:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r3) {
        /*
            Method dump skipped, instructions count: 510
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C45125Jxu.equals(java.lang.Object):boolean");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int hashCode() {
        /*
            Method dump skipped, instructions count: 312
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C45125Jxu.hashCode():int");
    }

    public final String toString() {
        StringBuilder A1C;
        Object obj;
        switch (this.A03) {
            case 6:
                A1C = AbstractC166987dD.A1C();
                A1C.append("AdUniversalCTAUiState(isCarousel=");
                A1C.append(this.A02);
                A1C.append(", mediaState=");
                A1C.append(this.A01);
                A1C.append(", modelWithMedia=");
                A1C.append(this.A04);
                A1C.append(", actions=");
                obj = this.A00;
                break;
            case 7:
            case 8:
            default:
                return super.toString();
            case 9:
                A1C = AbstractC166987dD.A1C();
                A1C.append("RecentlyUpdatedItemsFeed(cartFeed=");
                A1C.append(this.A00);
                A1C.append(", wishListFeed=");
                A1C.append(this.A04);
                A1C.append(", likedAndRecentlyViewedFeed=");
                obj = this.A01;
                break;
        }
        return AbstractC167017dG.A0o(obj, A1C);
    }

    public C45125Jxu(C37995Gng c37995Gng, InterfaceC38371qR interfaceC38371qR, C37994Gnf c37994Gnf, boolean z) {
        this.A03 = 6;
        this.A02 = z;
        this.A01 = c37994Gnf;
        this.A04 = interfaceC38371qR;
        this.A00 = c37995Gng;
    }

    public C45125Jxu(View.OnClickListener onClickListener, Integer num, List list, boolean z) {
        this.A03 = 4;
        this.A02 = z;
        this.A01 = list;
        this.A00 = num;
        this.A04 = onClickListener;
    }

    public C45125Jxu(C26041BfU c26041BfU, C5Hc c5Hc, C5Hc c5Hc2, boolean z) {
        this.A03 = 11;
        C14360o3.A0B(c5Hc2, 3);
        this.A04 = c26041BfU;
        this.A00 = c5Hc;
        this.A01 = c5Hc2;
        this.A02 = z;
    }

    public C45125Jxu(Integer num, Integer num2, Integer num3, boolean z) {
        this.A03 = 10;
        this.A00 = num;
        this.A04 = num2;
        this.A01 = num3;
        this.A02 = z;
    }

    public C45125Jxu(C146106i8 c146106i8, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2, boolean z) {
        this.A03 = 8;
        AbstractC25233BEq.A0w(1, c146106i8, interfaceC16820sZ, interfaceC16820sZ2);
        this.A00 = c146106i8;
        this.A02 = z;
        this.A04 = interfaceC16820sZ;
        this.A01 = interfaceC16820sZ2;
    }

    public C45125Jxu(IMN imn, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2, boolean z) {
        this.A03 = 7;
        AbstractC25233BEq.A0w(1, imn, interfaceC16820sZ, interfaceC16820sZ2);
        this.A00 = imn;
        this.A02 = z;
        this.A01 = interfaceC16820sZ;
        this.A04 = interfaceC16820sZ2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C45125Jxu(boolean r3) {
        /*
            r2 = this;
            r0 = 11
            r2.A03 = r0
            X.BfU r1 = new X.BfU
            r1.<init>()
            X.5HZ r0 = X.C5HZ.A01
            r2.<init>(r1, r0, r0, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C45125Jxu.<init>(boolean):void");
    }

    public C45125Jxu(C45118Jxn c45118Jxn, Map map, java.util.Set set, boolean z) {
        this.A03 = 3;
        AbstractC25234BEr.A1P(c45118Jxn, map, set);
        this.A00 = c45118Jxn;
        this.A04 = map;
        this.A02 = z;
        this.A01 = set;
    }

    public C45125Jxu(C45127Jxw c45127Jxw, Integer num, List list, boolean z) {
        this.A03 = 1;
        AbstractC167007dF.A1F(list, 1, num);
        this.A04 = list;
        this.A02 = z;
        this.A01 = c45127Jxw;
        this.A00 = num;
    }

    public C45125Jxu(C45114Jxj c45114Jxj, ImageUrl imageUrl, ImageUrl imageUrl2, boolean z) {
        this.A03 = 2;
        C14360o3.A0B(c45114Jxj, 1);
        AbstractC167007dF.A1E(imageUrl, 2, imageUrl2);
        this.A01 = c45114Jxj;
        this.A00 = imageUrl;
        this.A04 = imageUrl2;
        this.A02 = z;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C45125Jxu() {
        /*
            r1 = this;
            r0 = 9
            r1.A03 = r0
            X.0sl r0 = X.C16930sl.A00
            r1.<init>(r0, r0, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C45125Jxu.<init>():void");
    }

    public C45125Jxu(Integer num, List list) {
        this.A03 = 0;
        this.A04 = list;
        this.A01 = null;
        this.A02 = true;
        this.A00 = num;
    }

    public C45125Jxu(C7TT c7tt, InterfaceC50507MRk interfaceC50507MRk, MsysThreadSubtype msysThreadSubtype) {
        this.A03 = 5;
        this.A04 = msysThreadSubtype;
        this.A01 = c7tt;
        this.A02 = false;
        this.A00 = interfaceC50507MRk;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x001e, code lost:
    
        if (r5.isEmpty() == false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C45125Jxu(java.util.List r3, java.util.List r4, java.util.List r5) {
        /*
            r2 = this;
            r0 = 9
            r2.A03 = r0
            r2.<init>()
            r2.A00 = r3
            r2.A04 = r4
            r2.A01 = r5
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto L20
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto L20
            boolean r1 = r5.isEmpty()
            r0 = 1
            if (r1 != 0) goto L21
        L20:
            r0 = 0
        L21:
            r2.A02 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C45125Jxu.<init>(java.util.List, java.util.List, java.util.List):void");
    }
}
