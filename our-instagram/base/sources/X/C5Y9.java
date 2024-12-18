package X;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;

/* renamed from: X.5Y9, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C5Y9 {
    public static final InterfaceC09390do A00 = AbstractC09440dt.A00(EnumC09460dv.A02, C5YA.A00);

    public static final C2DC A00(Drawable drawable, C5Tl c5Tl) {
        Object c5y8;
        c5Tl.Enp(1756822313);
        if (C0fH.A02()) {
            C0fH.A01(-1246235708, "com.google.accompanist.drawablepainter.rememberDrawablePainter (DrawablePainter.kt:151)");
        }
        c5Tl.Enp(-1791785024);
        boolean AH4 = c5Tl.AH4(drawable);
        Object EEc = c5Tl.EEc();
        if (AH4 || EEc == C5UI.A00) {
            if (drawable == null) {
                EEc = C25771BaA.A00;
            } else {
                if (drawable instanceof ColorDrawable) {
                    long j = C1132359l.A01;
                    c5y8 = new C25770Ba9(((ColorDrawable) drawable).getColor() << 32);
                } else {
                    Drawable mutate = drawable.mutate();
                    C14360o3.A07(mutate);
                    c5y8 = new C5Y8(mutate);
                }
                EEc = (C2DC) c5y8;
            }
            c5Tl.FBy(EEc);
        }
        C2DC c2dc = (C2DC) EEc;
        C117505Tk c117505Tk = (C117505Tk) c5Tl;
        C117505Tk.A0L(c117505Tk, false);
        if (C0fH.A02()) {
            C0fH.A00(1538635476);
        }
        C117505Tk.A0L(c117505Tk, false);
        return c2dc;
    }
}
