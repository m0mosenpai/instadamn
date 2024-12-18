package X;

import android.content.Context;
import android.os.Looper;
import java.util.List;

/* renamed from: X.Kqt, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC47036Kqt {
    public static final InterfaceC224417g A00(Context context, List list, int i, int i2) {
        AbstractC167007dF.A1E(context, 0, list);
        if (!C14360o3.A0K(Looper.myLooper(), Looper.getMainLooper())) {
            if (!AbstractC93174Ft.A03(context)) {
                return D38.A00;
            }
            C188998Yp c188998Yp = new C188998Yp(context);
            C15370ps A1F = AbstractC25225BEi.A1F();
            A1F.A00 = C16930sl.A00;
            return AbstractC224517h.A07(AbstractC224717j.A0B(new C57251PbZ(1, new C29728D8y(A1F, c188998Yp, new Object(), EnumC188968Ym.A02, list, context, i2, 0), A1F)), i);
        }
        throw AbstractC166987dD.A14("SuggestionsMediaRepository: Cannot call loadMedia on main thread");
    }
}
