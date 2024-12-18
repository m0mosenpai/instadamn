package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;

/* loaded from: classes10.dex */
public abstract class S6A {
    public static volatile boolean A00 = true;

    public static Drawable A00(Context context, Context context2, Resources.Theme theme, int i) {
        try {
            if (A00) {
                Context context3 = context2;
                if (theme != null) {
                    context3 = new C52182aJ(context2, theme);
                }
                return C71x.A00(context3, i);
            }
        } catch (Resources.NotFoundException unused) {
        } catch (IllegalStateException e) {
            if (!context.getPackageName().equals(context2.getPackageName())) {
                return context2.getDrawable(i);
            }
            throw e;
        } catch (NoClassDefFoundError unused2) {
            A00 = false;
        }
        if (theme == null) {
            theme = context2.getTheme();
        }
        return context2.getResources().getDrawable(i, theme);
    }
}
