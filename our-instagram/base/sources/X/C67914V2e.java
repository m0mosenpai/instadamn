package X;

import android.content.Context;
import com.facebook.R;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.V2e, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C67914V2e extends C7E1 {
    public String A00;
    public String A01;
    public final EQR A04;
    public final C32464ERq A05;
    public final V3P A06;
    public final V3L A07;
    public final List A03 = new ArrayList();
    public final List A02 = new ArrayList();

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, X.EQR, X.2y0] */
    public C67914V2e(Context context, InterfaceC11380iw interfaceC11380iw, GYX gyx, InterfaceC37204GaF interfaceC37204GaF) {
        V3L v3l = new V3L(context);
        this.A07 = v3l;
        V3P v3p = new V3P(context, null);
        this.A06 = v3p;
        ?? obj = new Object();
        obj.A00 = gyx;
        this.A04 = obj;
        C32464ERq c32464ERq = new C32464ERq(interfaceC11380iw, interfaceC37204GaF, false, false);
        this.A05 = c32464ERq;
        A0B(v3l, v3p, obj, c32464ERq);
    }

    public static void A00(C67914V2e c67914V2e) {
        c67914V2e.A06();
        String str = c67914V2e.A01;
        if (str != null) {
            c67914V2e.A09(c67914V2e.A07, str, new C69312VlK(null, null, null, null, false));
        }
        String str2 = c67914V2e.A00;
        if (str2 != null) {
            c67914V2e.A09(c67914V2e.A06, str2, new C69312VlK(Integer.valueOf(R.dimen.action_bar_item_spacing_left), Integer.valueOf(R.dimen.abc_control_corner_material), null, null, false));
        }
        c67914V2e.A08(c67914V2e.A04, null);
        for (User user : c67914V2e.A03) {
            c67914V2e.A08(c67914V2e.A05, new FNI(user, user.getUsername(), user.getFullName(), null, c67914V2e.A02.contains(user)));
        }
        c67914V2e.A07();
    }
}
