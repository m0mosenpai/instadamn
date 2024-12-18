package X;

import android.content.Context;
import android.widget.Toast;
import com.instagram.zero.main.IgZeroMain;

/* renamed from: X.3Q1, reason: invalid class name */
/* loaded from: classes2.dex */
public abstract class C3Q1 {
    public static C54950OSa A00;

    public static final void A02(Context context) {
        if (A00 != null) {
            Toast.makeText(context, "Placeholder clicked", 0).show();
        }
    }

    public static final C0UO A00() {
        IgZeroMain igZeroMain;
        O9O o9o;
        if (A00 != null && (igZeroMain = IgZeroMain.A09) != null && (o9o = igZeroMain.A01) != null) {
            return o9o.A01;
        }
        return null;
    }

    public static final void A01() {
        IgZeroMain igZeroMain;
        if (A00 != null && (igZeroMain = IgZeroMain.A09) != null) {
            AbstractC23641Du.A05(AnonymousClass191.A00, new PYu(igZeroMain, null, 48), AbstractC24771Iv.A02(273884380, 3));
        }
    }

    public static final boolean A03() {
        IgZeroMain igZeroMain;
        Object obj;
        if (A00 != null && (igZeroMain = IgZeroMain.A09) != null && igZeroMain.A03 && igZeroMain.A05) {
            O9O o9o = igZeroMain.A01;
            if (o9o != null) {
                obj = o9o.A01.getValue();
            } else {
                obj = null;
            }
            if (obj == C3Q2.A02) {
                return true;
            }
        }
        return false;
    }

    public static final boolean A04() {
        boolean z;
        if (A00 != null) {
            IgZeroMain igZeroMain = IgZeroMain.A09;
            if (igZeroMain != null) {
                z = igZeroMain.A03;
            } else {
                z = false;
            }
            if (!z || igZeroMain == null || !igZeroMain.A05) {
                return false;
            }
            return true;
        }
        return false;
    }
}
