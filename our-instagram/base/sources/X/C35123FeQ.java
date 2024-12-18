package X;

import android.content.Context;
import android.content.DialogInterface;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.FeQ, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C35123FeQ {
    public final Context A00;
    public final InterfaceC11380iw A01;
    public final UserSession A02;
    public final C7TS A03;

    public static void A00(final InterfaceC37210GaL interfaceC37210GaL, final GZ6 gz6, final C35123FeQ c35123FeQ, C193328hC c193328hC, C3o9 c3o9, Map map, int i, int i2, final int i3, int i4, boolean z) {
        int i5;
        c193328hC.A0t(false);
        c193328hC.A0s(true);
        Context context = c35123FeQ.A00;
        if (z) {
            boolean A00 = C7NG.A00(i2);
            int i6 = 2131960505;
            if (A00) {
                i6 = 2131960504;
            }
            c193328hC.A0Z(new DialogInterfaceOnClickListenerC35375Fiq(interfaceC37210GaL, gz6, c35123FeQ, c3o9, map, i3, i4, 0), EnumC193348hE.A03, context.getString(i6), true);
            if (A00) {
                i5 = 2131959746;
            } else {
                i5 = 2131960626;
                if (i == 0) {
                    i5 = 2131959755;
                }
            }
            c193328hC.A0X(new DialogInterfaceOnClickListenerC35364Fif(i, i2, 0, interfaceC37210GaL, c35123FeQ, c3o9), EnumC193348hE.A06, context.getString(i5), true);
            c193328hC.A0D(new DialogInterface.OnClickListener() { // from class: X.FiO
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i7) {
                    int i8 = i3;
                    InterfaceC37210GaL interfaceC37210GaL2 = interfaceC37210GaL;
                    GZ6 gz62 = gz6;
                    interfaceC37210GaL2.onCancel();
                    gz62.D1h(i8);
                }
            });
            c193328hC.A0C(new DialogInterface.OnCancelListener() { // from class: X.FhW
                @Override // android.content.DialogInterface.OnCancelListener
                public final void onCancel(DialogInterface dialogInterface) {
                    int i7 = i3;
                    InterfaceC37210GaL interfaceC37210GaL2 = interfaceC37210GaL;
                    GZ6 gz62 = gz6;
                    interfaceC37210GaL2.onCancel();
                    gz62.D1h(i7);
                }
            });
        } else {
            c193328hC.A0e(new DialogInterfaceOnClickListenerC35375Fiq(interfaceC37210GaL, gz6, c35123FeQ, c3o9, map, i3, i4, 1), context.getString(2131968948));
        }
        AbstractC166987dD.A1W(c193328hC);
        if (i4 == 1) {
            A01(c35123FeQ, c3o9, map, i3);
        }
        interfaceC37210GaL.Dm8();
    }

    public C35123FeQ(Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C7TS c7ts) {
        this.A00 = context;
        this.A02 = userSession;
        this.A03 = c7ts;
        this.A01 = interfaceC11380iw;
    }

    public static void A01(C35123FeQ c35123FeQ, C3o9 c3o9, Map map, int i) {
        ArrayList A1F = AbstractC166987dD.A1F(map.keySet());
        if (i != 0) {
            UserSession userSession = c35123FeQ.A02;
            C36278FzV c36278FzV = (C36278FzV) userSession.A01(C36278FzV.class, new C50159MDm(userSession, 5));
            C14360o3.A0B(c36278FzV, 0);
            String A07 = JRE.A07(c3o9);
            if (A07 != null) {
                Iterator it = A1F.iterator();
                while (it.hasNext()) {
                    String A1B = AbstractC166987dD.A1B(it);
                    synchronized (c36278FzV) {
                        C14360o3.A0B(A1B, 1);
                        java.util.Set set = c36278FzV.A01;
                        set.add(AnonymousClass001.A0T(A07, A1B, '.'));
                        if (c36278FzV.A02) {
                            c36278FzV.A00.A00(set);
                        }
                    }
                }
                return;
            }
            return;
        }
        UserSession userSession2 = c35123FeQ.A02;
        C36277FzU c36277FzU = (C36277FzU) userSession2.A01(C36277FzU.class, new C50159MDm(userSession2, 4));
        C14360o3.A0B(c36277FzU, 0);
        String A072 = JRE.A07(c3o9);
        if (A072 != null) {
            Iterator it2 = A1F.iterator();
            while (it2.hasNext()) {
                String A1B2 = AbstractC166987dD.A1B(it2);
                synchronized (c36277FzU) {
                    C14360o3.A0B(A1B2, 1);
                    java.util.Set set2 = c36277FzU.A01;
                    if (set2.add(AnonymousClass001.A0T(A072, A1B2, '.'))) {
                        c36277FzU.A00.A00(set2);
                    }
                }
            }
        }
    }
}
