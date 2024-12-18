package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.EPb, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32400EPb extends C7E1 {
    public final ES1 A00;
    public final List A01 = AbstractC166987dD.A1E();
    public final Context A02;
    public final EQO A03;

    /* JADX WARN: Type inference failed for: r0v1, types: [X.EQO, java.lang.Object, X.2y0] */
    public C32400EPb(Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession, InterfaceC37224GaZ interfaceC37224GaZ) {
        this.A02 = context;
        ?? obj = new Object();
        obj.A00 = context;
        this.A03 = obj;
        ES1 es1 = new ES1(context, interfaceC11380iw, userSession, interfaceC37224GaZ, false);
        this.A00 = es1;
        A0B(obj, es1);
    }

    public final void A0C() {
        A06();
        List list = this.A01;
        if (!list.isEmpty()) {
            A08(this.A03, this.A02.getString(2131974901));
        }
        for (int i = 0; i < list.size(); i++) {
            A09(this.A00, list.get(i), Integer.valueOf(i));
        }
        A07();
    }
}
