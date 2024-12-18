package X;

import android.view.View;
import com.facebook.R;

/* renamed from: X.Vz2, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC69983Vz2 {
    public static final boolean A01(View view, String str) {
        AbstractC125325le abstractC125325le;
        C14360o3.A0B(view, 0);
        Object tag = view.getTag(R.id.view_animator);
        if ((tag instanceof AbstractC125325le) && (abstractC125325le = (AbstractC125325le) tag) != null && C14360o3.A0K(abstractC125325le.A08, str) && abstractC125325le.A0W()) {
            return true;
        }
        return false;
    }

    public static final AbstractC125325le A00(View view, InterfaceC143526dr interfaceC143526dr) {
        C14360o3.A0B(view, 0);
        AbstractC125325le A01 = AbstractC125325le.A01(view, 0);
        A01.A07 = interfaceC143526dr;
        A01.A0G();
        return A01.A0A().A0E(C55942hf.A03(5.0d, 10.0d));
    }
}
