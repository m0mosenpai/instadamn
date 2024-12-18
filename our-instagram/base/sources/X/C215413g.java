package X;

import android.content.Context;
import android.content.res.Resources;
import com.facebook.R;

/* renamed from: X.13g, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C215413g extends AbstractC211911v {
    public int A00;
    public final Context A01;

    @Override // X.AbstractC211911v
    public final String A06() {
        return "ThemeInitializer";
    }

    @Override // X.AbstractC211911v
    public final void A07() {
        Context context = this.A01;
        context.setTheme(this.A00);
        C1H6.A00 = new InterfaceC08830cm() { // from class: X.1R5
            @Override // X.InterfaceC08830cm
            public final /* bridge */ /* synthetic */ Object get() {
                C215413g c215413g = C215413g.this;
                Context context2 = c215413g.A01;
                Resources.Theme theme = context2.getTheme();
                int i = c215413g.A00;
                theme.applyStyle(i, true);
                context2.getTheme().applyStyle(R.style.IgdsSemanticColors, true);
                return new int[]{i, R.style.IgdsSemanticColors};
            }
        };
        int i = context.getResources().getConfiguration().uiMode & 48;
        if (i == 16 || i == 32) {
            InterfaceC19610xo ARD = C1H6.A00().ARD();
            ARD.E7D("KEY_CONFIG_UI_MODE", i);
            ARD.E7D("KEY_CONFIG_CURRENT_SYSTEM_UI_MODE", i);
            ARD.apply();
        }
    }

    public C215413g(Context context) {
        C14360o3.A0B(context, 1);
        this.A01 = context;
        this.A00 = R.style.IgPanorama;
    }
}
