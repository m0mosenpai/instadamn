package X;

import android.graphics.drawable.GradientDrawable;
import com.instagram.ui.text.TextColorScheme;
import java.io.IOException;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public abstract class A2W {
    /* JADX WARN: Type inference failed for: r1v0, types: [com.instagram.ui.text.TextColorScheme, java.lang.Object] */
    public static TextColorScheme parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? obj = new Object();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("text_colors".equals(A0s)) {
                    obj.A02 = c16l.A1D();
                } else if ("hint_text_colors".equals(A0s)) {
                    obj.A04 = AEY.parseFromJson(c16l);
                } else if ("emphasis_color".equals(A0s)) {
                    obj.A01 = c16l.A1D();
                } else {
                    ArrayList arrayList = null;
                    if (AbstractC111324zv.A00(176).equals(A0s)) {
                        if (c16l.A11() == C16R.A0C) {
                            arrayList = AbstractC166987dD.A1E();
                            while (c16l.A1J() != C16R.A08) {
                                Integer A0h = AbstractC166997dE.A0h(c16l);
                                if (A0h != null) {
                                    arrayList.add(A0h);
                                }
                            }
                        }
                        obj.A07 = arrayList;
                    } else if ("background_gradient_enum".equals(A0s)) {
                        obj.A05 = AEX.A00(c16l.A1P());
                    } else if ("background_opacity".equals(A0s)) {
                        obj.A00 = (float) c16l.A0U();
                    } else if ("orientation".equals(A0s)) {
                        obj.A03 = GradientDrawable.Orientation.valueOf(c16l.A1Q());
                    } else if (AbstractC111324zv.A00(350).equals(A0s)) {
                        obj.A06 = AbstractC167017dG.A0m(c16l);
                    }
                }
                c16l.A0z();
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
