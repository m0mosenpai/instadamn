package X;

import android.content.Context;
import com.facebook.secure.securewebview.SecureWebView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: X.SaE, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C62990SaE {
    public final List A01 = AbstractC166987dD.A1E();
    public final List A00 = AbstractC166987dD.A1E();

    public static Context A00(Context context, SecureWebView secureWebView) {
        C62990SaE c62990SaE = new C62990SaE();
        c62990SaE.A03();
        secureWebView.A01 = c62990SaE.A01();
        secureWebView.A02 = "SecureWebView";
        return context.getApplicationContext();
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [X.0bW, java.lang.Object] */
    public final C62732SNx A01() {
        return new C62732SNx(new Object(), new S1I(), this.A01, this.A00);
    }

    public final void A02() {
        List list = this.A00;
        ArrayList A17 = AbstractC25225BEi.A17(4);
        List asList = Arrays.asList("http", "https");
        if (!asList.isEmpty()) {
            A17.add(new R7S(asList));
            AbstractC08800ci A00 = S1J.A00(A17);
            C14360o3.A07(A00);
            list.add(A00);
            return;
        }
        throw AbstractC166987dD.A12("Cannot set 0 schemes");
    }

    public final void A03() {
        List list = this.A00;
        ArrayList A17 = AbstractC25225BEi.A17(4);
        List asList = Arrays.asList("https");
        if (!asList.isEmpty()) {
            A17.add(new R7S(asList));
            AbstractC08800ci A00 = S1J.A00(A17);
            C14360o3.A07(A00);
            list.add(A00);
            return;
        }
        throw AbstractC166987dD.A12("Cannot set 0 schemes");
    }
}
