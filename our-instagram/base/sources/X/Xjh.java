package X;

import com.instagram.clips.intf.ClipsWatchAndBrowseData;

/* loaded from: classes12.dex */
public abstract class Xjh {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static final ClipsWatchAndBrowseData A00(C39448Hba c39448Hba) {
        Integer num;
        Integer num2;
        C14360o3.A0B(c39448Hba, 0);
        if (c39448Hba instanceof C72309Xb6) {
            C72309Xb6 c72309Xb6 = (C72309Xb6) c39448Hba;
            int i = c72309Xb6.A0A;
            float f = c72309Xb6.A06;
            int i2 = c72309Xb6.A09;
            Integer num3 = c72309Xb6.A00;
            Integer num4 = c72309Xb6.A01;
            String str = c72309Xb6.A0E;
            switch (str.hashCode()) {
                case -632085587:
                    if (str.equals("collapse")) {
                        num = C05F.A0C;
                        break;
                    }
                    num = C05F.A00;
                    break;
                case 601417728:
                    if (str.equals(AbstractC111324zv.A00(2080))) {
                        num = C05F.A0N;
                        break;
                    }
                    num = C05F.A00;
                    break;
                case 1623862570:
                    if (str.equals(AbstractC111324zv.A00(2287))) {
                        num = C05F.A0Y;
                        break;
                    }
                    num = C05F.A00;
                    break;
                case 1671672458:
                    if (str.equals("dismiss")) {
                        num = C05F.A01;
                        break;
                    }
                    num = C05F.A00;
                    break;
                default:
                    num = C05F.A00;
                    break;
            }
            String str2 = c72309Xb6.A0F;
            switch (str2.hashCode()) {
                case 707032707:
                    if (str2.equals(AbstractC111324zv.A00(2325))) {
                        num2 = C05F.A0C;
                        break;
                    }
                    num2 = C05F.A00;
                    break;
                case 1148006762:
                    if (str2.equals(AbstractC111324zv.A00(4396))) {
                        num2 = C05F.A0N;
                        break;
                    }
                    num2 = C05F.A00;
                    break;
                case 1671672458:
                    if (str2.equals("dismiss")) {
                        num2 = C05F.A01;
                        break;
                    }
                    num2 = C05F.A00;
                    break;
                default:
                    num2 = C05F.A00;
                    break;
            }
            boolean z = c72309Xb6.A0M;
            boolean z2 = c72309Xb6.A0H;
            float f2 = c72309Xb6.A05;
            boolean z3 = c72309Xb6.A0I;
            boolean z4 = c72309Xb6.A0S;
            boolean z5 = c72309Xb6.A0P;
            boolean z6 = c72309Xb6.A0R;
            boolean z7 = c72309Xb6.A0K;
            boolean z8 = c72309Xb6.A0L;
            boolean z9 = c72309Xb6.A0O;
            boolean z10 = c72309Xb6.A0W;
            boolean z11 = c72309Xb6.A0N;
            boolean z12 = c72309Xb6.A0V;
            boolean z13 = c72309Xb6.A0Q;
            boolean z14 = c72309Xb6.A0G;
            return new ClipsWatchAndBrowseData(num3, num4, num, num2, c72309Xb6.A02, c72309Xb6.A04, c72309Xb6.A03, f, f2, 0.45f, c72309Xb6.A08, c72309Xb6.A07, i, i2, z, z2, z3, z4, z5, z6, z7, z8, z10, z11, z9, z12, z13, z14, false, c72309Xb6.A0J, c72309Xb6.A0U, c72309Xb6.A0T);
        }
        return null;
    }
}
