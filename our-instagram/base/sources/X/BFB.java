package X;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import java.util.List;
import java.util.ListIterator;

/* loaded from: classes5.dex */
public abstract class BFB {
    public static final PorterDuff.Mode A00 = PorterDuff.Mode.SRC_OVER;
    public static final PorterDuffColorFilter A01 = new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_ATOP);

    public static final InterfaceC109864xE A00(InterfaceC109094vY interfaceC109094vY) {
        List AjH = interfaceC109094vY.AjH();
        Object obj = null;
        if (AjH == null) {
            return null;
        }
        ListIterator listIterator = AjH.listIterator(AjH.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                break;
            }
            Object previous = listIterator.previous();
            if (AbstractC28293Cdf.A02((InterfaceC109864xE) previous) == C05F.A0C) {
                obj = previous;
                break;
            }
        }
        return (InterfaceC109864xE) obj;
    }

    public static final InterfaceC109864xE A01(InterfaceC109094vY interfaceC109094vY) {
        List AjH = interfaceC109094vY.AjH();
        Object obj = null;
        if (AjH == null) {
            return null;
        }
        ListIterator listIterator = AjH.listIterator(AjH.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                break;
            }
            Object previous = listIterator.previous();
            if (AbstractC28293Cdf.A02((InterfaceC109864xE) previous) == C05F.A0N) {
                obj = previous;
                break;
            }
        }
        return (InterfaceC109864xE) obj;
    }

    public static final InterfaceC109864xE A02(InterfaceC109094vY interfaceC109094vY) {
        List AjH = interfaceC109094vY.AjH();
        Object obj = null;
        if (AjH == null) {
            return null;
        }
        ListIterator listIterator = AjH.listIterator(AjH.size());
        while (listIterator.hasPrevious()) {
            Object previous = listIterator.previous();
            InterfaceC109864xE interfaceC109864xE = (InterfaceC109864xE) previous;
            if (AbstractC28293Cdf.A02(interfaceC109864xE) == C05F.A00 || AbstractC28293Cdf.A02(interfaceC109864xE) == C05F.A01) {
                obj = previous;
                break;
            }
        }
        return (InterfaceC109864xE) obj;
    }

    public static final Integer A03(InterfaceC109094vY interfaceC109094vY) {
        int i;
        int i2;
        Integer BaY = interfaceC109094vY.BaY();
        if (BaY != null) {
            i = BaY.intValue();
        } else {
            i = -1;
        }
        for (Integer num : C05F.A00(4)) {
            switch (num.intValue()) {
                case 1:
                    i2 = 1;
                    break;
                case 2:
                    i2 = 2;
                    break;
                case 3:
                    i2 = 5;
                    break;
                default:
                    i2 = 0;
                    break;
            }
            if (i2 == i) {
                return num;
            }
        }
        return null;
    }

    public static final boolean A04(InterfaceC109094vY interfaceC109094vY) {
        if (A03(interfaceC109094vY) != C05F.A01 && A03(interfaceC109094vY) != C05F.A0C) {
            return false;
        }
        return true;
    }
}
