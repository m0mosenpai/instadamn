package X;

import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.List;

/* renamed from: X.BgB, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26082BgB extends C0T6 {
    public Object A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public final int A05;

    public static boolean A00(Object obj, int i) {
        if ((obj instanceof C26082BgB) && ((C26082BgB) obj).A05 == i) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:101:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x018f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r3) {
        /*
            Method dump skipped, instructions count: 482
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26082BgB.equals(java.lang.Object):boolean");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    public final int hashCode() {
        int A0J;
        Object obj;
        int A00;
        int A002;
        int A0J2;
        Object obj2;
        int hashCode;
        switch (this.A05) {
            case 0:
                A0J = AbstractC166997dE.A0J(this.A03, AbstractC166997dE.A0J(this.A02, ((AbstractC167017dG.A0M(this.A01) * 31) + AbstractC166997dE.A0I(this.A00)) * 31));
                obj = this.A04;
                hashCode = obj.hashCode();
                return hashCode + A0J;
            case 1:
                int A0G = AbstractC166987dD.A0G(this.A00);
                Integer num = (Integer) this.A01;
                if (num == null) {
                    A00 = 0;
                } else {
                    A00 = AbstractC27606CGc.A00(num);
                }
                A0J = AbstractC166997dE.A0J(this.A03, AbstractC166997dE.A0J(this.A02, (A0G + A00) * 31));
                obj = this.A04;
                hashCode = obj.hashCode();
                return hashCode + A0J;
            case 2:
                A0J = AbstractC166997dE.A0J(this.A00, AbstractC166997dE.A0J(this.A01, AbstractC166997dE.A0J(this.A03, AbstractC166987dD.A0G(this.A02))));
                obj = this.A04;
                hashCode = obj.hashCode();
                return hashCode + A0J;
            case 3:
                A002 = (((((AbstractC27578CEx.A00((Integer) this.A04) * 31) + AbstractC27578CEx.A00((Integer) this.A03)) * 31) + AbstractC167017dG.A0M(this.A01)) * 31) + AbstractC166997dE.A0I(this.A02);
                A0J = A002 * 31;
                obj = this.A00;
                hashCode = obj.hashCode();
                return hashCode + A0J;
            case 4:
            case 8:
                A0J2 = AbstractC166997dE.A0J(this.A02, AbstractC166997dE.A0J(this.A04, AbstractC166987dD.A0G(this.A03)));
                obj2 = this.A01;
                A002 = AbstractC166987dD.A0I(obj2, A0J2);
                A0J = A002 * 31;
                obj = this.A00;
                hashCode = obj.hashCode();
                return hashCode + A0J;
            case 5:
                A0J = AbstractC166997dE.A0J(this.A01, AbstractC166997dE.A0J(this.A04, AbstractC166997dE.A0J(this.A00, AbstractC166987dD.A0G(this.A02))));
                obj = this.A03;
                hashCode = obj.hashCode();
                return hashCode + A0J;
            case 6:
                A0J2 = AbstractC166997dE.A0J(this.A04, AbstractC166997dE.A0J(this.A03, AbstractC166987dD.A0G(this.A01)));
                obj2 = this.A02;
                A002 = AbstractC166987dD.A0I(obj2, A0J2);
                A0J = A002 * 31;
                obj = this.A00;
                hashCode = obj.hashCode();
                return hashCode + A0J;
            case 7:
                A0J = AbstractC166997dE.A0J(this.A02, AbstractC166997dE.A0J(this.A03, AbstractC166997dE.A0J(this.A04, AbstractC166987dD.A0G(this.A00))));
                obj = this.A01;
                hashCode = obj.hashCode();
                return hashCode + A0J;
            case 9:
            default:
                return super.hashCode();
            case 10:
                hashCode = ((((((AbstractC167017dG.A0M(this.A00) * 31) + AbstractC167017dG.A0M(this.A01)) * 31) + AbstractC167017dG.A0M(this.A02)) * 31) + AbstractC167017dG.A0M(this.A03)) * 31;
                A0J = AbstractC166997dE.A0I(this.A04);
                return hashCode + A0J;
        }
    }

    public final String toString() {
        StringBuilder A1C;
        Object obj;
        switch (this.A05) {
            case 4:
                A1C = AbstractC166987dD.A1C();
                A1C.append("MediaOverlayCTAUiActions(shouldHide=");
                A1C.append(this.A03);
                A1C.append(", shouldLogImpression=");
                A1C.append(this.A04);
                A1C.append(", reportMediaOverlayImpression=");
                A1C.append(this.A02);
                A1C.append(", onMediaOverlayCTAClick=");
                A1C.append(this.A01);
                A1C.append(", getOverlayInfo=");
                obj = this.A00;
                break;
            case 5:
            case 6:
            default:
                return super.toString();
            case 7:
                A1C = AbstractC166987dD.A1C();
                A1C.append("MediaGuideUiActions(getMediaTagIndicatorOnClickListener=");
                A1C.append(this.A00);
                A1C.append(", onSingleTapMedia=");
                A1C.append(this.A04);
                A1C.append(", onMediaBoundToView=");
                A1C.append(this.A03);
                A1C.append(", onImageViewLoaded=");
                A1C.append(this.A02);
                A1C.append(", onFallbackViewLoaded=");
                obj = this.A01;
                break;
        }
        return AbstractC167017dG.A0o(obj, A1C);
    }

    public C26082BgB(C6R c6r, C6R c6r2, C5Hc c5Hc, C5Hc c5Hc2, C5Hc c5Hc3) {
        this.A05 = 2;
        C14360o3.A0B(c5Hc, 1);
        AbstractC25234BEr.A0j(2, c5Hc2, c5Hc3, c6r, c6r2);
        this.A02 = c5Hc;
        this.A03 = c5Hc2;
        this.A01 = c5Hc3;
        this.A00 = c6r;
        this.A04 = c6r2;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C26082BgB() {
        this(10, null, null, null, null, null);
        this.A05 = 10;
        this.A05 = 10;
    }

    public C26082BgB(Integer num, Integer num2, Integer num3, Integer num4, C5Hc c5Hc) {
        this.A05 = 3;
        this.A04 = num;
        this.A03 = num2;
        this.A01 = num3;
        this.A02 = num4;
        this.A00 = c5Hc;
    }

    public C26082BgB(C206289Bl c206289Bl, Integer num, LinkedHashMap linkedHashMap, List list, List list2) {
        this.A05 = 0;
        this.A01 = c206289Bl;
        this.A00 = num;
        this.A02 = list;
        this.A03 = list2;
        this.A04 = linkedHashMap;
    }

    public C26082BgB(EnumC85043qs enumC85043qs, C38321qM c38321qM, Integer num, WeakReference weakReference, InterfaceC16660sJ interfaceC16660sJ) {
        this.A05 = 1;
        this.A00 = weakReference;
        this.A01 = num;
        this.A02 = c38321qM;
        this.A03 = enumC85043qs;
        this.A04 = interfaceC16660sJ;
    }

    public C26082BgB(AbstractC55145Od4 abstractC55145Od4, AbstractC55145Od4 abstractC55145Od42, EnumC72392Xce enumC72392Xce, List list, List list2) {
        this.A05 = 9;
        this.A03 = enumC72392Xce;
        this.A04 = abstractC55145Od4;
        this.A01 = abstractC55145Od42;
        this.A02 = list;
        this.A00 = list2;
    }

    public C26082BgB(int i, Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        this.A05 = i;
        this.A00 = obj;
        this.A01 = obj2;
        this.A02 = obj3;
        this.A03 = obj4;
        this.A04 = obj5;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C26082BgB(AbstractC55145Od4 abstractC55145Od4, EnumC72392Xce enumC72392Xce, List list, List list2) {
        this((AbstractC55145Od4) null, abstractC55145Od4, enumC72392Xce, list, list2);
        this.A05 = 9;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C26082BgB(X.C6R r2, X.C6R r3, kotlin.jvm.internal.DefaultConstructorMarker r4, X.C5Hc r5, X.C5Hc r6, X.C5Hc r7, int r8, int r9) {
        /*
            r1 = this;
            r0 = 2
            r1.A05 = r0
            X.5HZ r4 = X.C5HZ.A01
            X.C6R r2 = X.C6R.A04
            X.C6R r3 = X.C6R.A03
            r5 = r4
            r6 = r4
            r1.<init>(r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26082BgB.<init>(X.C6R, X.C6R, kotlin.jvm.internal.DefaultConstructorMarker, X.5Hc, X.5Hc, X.5Hc, int, int):void");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C26082BgB(Integer num, Integer num2, Integer num3) {
        this(C05F.A01, num, num2, num3, C5HZ.A01);
        this.A05 = 3;
    }
}
