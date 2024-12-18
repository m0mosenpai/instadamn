package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.5Vf, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC117955Vf {
    public static final C5UP A00 = new C5UQ(C117965Vg.A00);

    public static final void A00(C5Tl c5Tl, InterfaceC16620sF interfaceC16620sF, int i) {
        int i2;
        C14360o3.A0B(interfaceC16620sF, 0);
        c5Tl.Enr(820577390);
        if ((i & 6) == 0) {
            int i3 = 2;
            if (c5Tl.AH6(interfaceC16620sF)) {
                i3 = 4;
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(-212137391, "com.meta.compose.resources.ProvideCachingResourceResolver (ProvideResourcesCache.kt:18)");
            }
            C117505Tk c117505Tk = (C117505Tk) c5Tl;
            final Context context = (Context) C5UT.A01(AndroidCompositionLocals_androidKt.A01, C117505Tk.A04(c117505Tk));
            Object A01 = C5UT.A01(AndroidCompositionLocals_androidKt.A00, C117505Tk.A04(c117505Tk));
            Resources.Theme theme = context.getTheme();
            c5Tl.Eno(-1666340002);
            boolean AH4 = c5Tl.AH4(A01) | c5Tl.AH4(theme);
            Object EEc = c5Tl.EEc();
            if (AH4 || EEc == C5UI.A00) {
                EEc = new InterfaceC117985Vi(context) { // from class: X.5Vh
                    public final Context A00;
                    public final Map A01 = new LinkedHashMap();
                    public final Map A02 = new LinkedHashMap();

                    @Override // X.InterfaceC117985Vi
                    public final Drawable AR6(Context context2, int i4) {
                        Drawable newDrawable;
                        C14360o3.A0B(context2, 0);
                        if (context2 != this.A00) {
                            return context2.getDrawable(i4);
                        }
                        Map map = this.A01;
                        Integer valueOf = Integer.valueOf(i4);
                        Drawable.ConstantState constantState = (Drawable.ConstantState) map.get(valueOf);
                        if (constantState != null && (newDrawable = constantState.newDrawable(context2.getResources())) != null) {
                            return newDrawable;
                        }
                        Drawable drawable = context2.getDrawable(i4);
                        if (drawable == null) {
                            return drawable;
                        }
                        map.put(valueOf, drawable.getConstantState());
                        return drawable;
                    }

                    @Override // X.InterfaceC117985Vi
                    public final String Ep0(Context context2, int i4) {
                        C14360o3.A0B(context2, 0);
                        if (context2 == this.A00) {
                            Map map = this.A02;
                            Integer valueOf = Integer.valueOf(i4);
                            Object obj = map.get(valueOf);
                            if (obj == null) {
                                obj = context2.getString(i4);
                                C14360o3.A07(obj);
                                map.put(valueOf, obj);
                            }
                            return (String) obj;
                        }
                        String string = context2.getString(i4);
                        C14360o3.A0A(string);
                        return string;
                    }

                    {
                        this.A00 = context;
                    }
                };
                c117505Tk.A0Q(EEc);
            }
            C117505Tk.A0L(c117505Tk, false);
            AbstractC117695Ue.A00(c5Tl, A00.A02(EEc), interfaceC16620sF, ((i2 << 3) & 112) | 8);
            if (C0fH.A02()) {
                C0fH.A00(235370032);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new C207089En(interfaceC16620sF, i, 4);
        }
    }
}
