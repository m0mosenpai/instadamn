package X;

import android.content.Context;
import android.util.LongSparseArray;

/* renamed from: X.Txe, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC65985Txe {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x000a. Please report as an issue. */
    public static final C6B0 A00(C6B0 c6b0, String str) {
        C14360o3.A0B(c6b0, 1);
        if (str != null) {
            switch (str.hashCode()) {
                case -1881872635:
                    if (str.equals("stretch")) {
                        return C6B0.STRETCH;
                    }
                    break;
                case -1364013995:
                    if (str.equals("center")) {
                        return C6B0.CENTER;
                    }
                    break;
                case 100571:
                    if (str.equals("end")) {
                        return C6B0.FLEX_END;
                    }
                    break;
                case 109757538:
                    if (str.equals("start")) {
                        return C6B0.FLEX_START;
                    }
                    break;
            }
        }
        return c6b0;
    }

    public static final U48 A01(U4K u4k, C78473fD c78473fD, C102884kP c102884kP, int i, int i2) {
        C136416Fu c136416Fu;
        LongSparseArray longSparseArray;
        LongSparseArray longSparseArray2;
        C14360o3.A0B(c102884kP, 2);
        C103054kg A00 = AbstractC103044kf.A00();
        long j = c102884kP.A04;
        LongSparseArray longSparseArray3 = u4k.A01;
        U48 u48 = (U48) longSparseArray3.get(j);
        if (A00 == null) {
            C135266Ab c135266Ab = null;
            if (u48 != null || ((longSparseArray2 = u4k.A00) != null && (u48 = (U48) longSparseArray2.get(j)) != null)) {
                c135266Ab = u48.A00.A01();
            }
            Context context = c78473fD.A04;
            C6AY c6ay = new C6AY(c102884kP, null, null);
            Object obj = c78473fD.A05;
            AbstractC79173gO[] A002 = AbstractC135256Aa.A00((C6FG) obj);
            int i3 = c78473fD.A03;
            long A003 = AbstractC78403f6.A00(i, i2);
            c136416Fu = new C136416Fu(c135266Ab, new U4J(context, c135266Ab, c6ay, obj, A002, i3, A003), A003);
        } else {
            C135266Ab c135266Ab2 = null;
            if (u48 != null || ((longSparseArray = u4k.A00) != null && (u48 = (U48) longSparseArray.get(j)) != null)) {
                c135266Ab2 = u48.A00.A01();
            }
            C140056Vj c140056Vj = null;
            C135266Ab c135266Ab3 = null;
            if (c135266Ab2 != null) {
                c135266Ab3 = c135266Ab2;
                c140056Vj = (C140056Vj) c135266Ab2.A02;
            }
            long A004 = AbstractC78403f6.A00(i, i2);
            c136416Fu = new C136416Fu(c135266Ab3, new CallableC71670WyN(c78473fD.A04, c135266Ab3, (C6FG) c78473fD.A05, c102884kP, A00, c140056Vj, c78473fD.A03, A004), A004);
        }
        U48 u482 = new U48(c136416Fu, c102884kP);
        longSparseArray3.put(j, u482);
        return u482;
    }

    public static final Integer A02(C102884kP c102884kP) {
        Integer num = C05F.A00;
        String A0L = c102884kP.A0L(96);
        C102884kP A08 = c102884kP.A08(94);
        if (A0L != null && A08 != null) {
            if (A0L.equals("grid")) {
                if (A08.A05 == 16373) {
                    return C05F.A01;
                }
                throw new IllegalArgumentException("CollectionLayoutUtils: requested \"grid\" layout_config_type, but provided layout_config doesn't match bk.types.GridCollectionLayoutConfig");
            }
            if (!A0L.equals("staggered_grid")) {
                return num;
            }
            if (A08.A05 == 16483) {
                return C05F.A0C;
            }
            throw new IllegalArgumentException("CollectionLayoutUtils: requested \"staggered_grid\" layout_config_type, but provided layout_config doesn't match bk.types.StaggeredGridCollectionLayoutConfig");
        }
        return num;
    }
}
