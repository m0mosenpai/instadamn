package X;

import android.content.Context;
import androidx.fragment.app.Fragment;
import com.instagram.registration.model.RegFlowExtras;

/* renamed from: X.Fen, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C35146Fen {
    public static C35146Fen A01;
    public C25301Lk A00;

    /* JADX WARN: Type inference failed for: r4v2, types: [X.Fen, java.lang.Object] */
    public static synchronized C35146Fen A00(Context context) {
        C35146Fen c35146Fen;
        synchronized (C35146Fen.class) {
            C35146Fen c35146Fen2 = A01;
            c35146Fen = c35146Fen2;
            if (c35146Fen2 == null) {
                Context applicationContext = context.getApplicationContext();
                ?? obj = new Object();
                obj.A00 = new C25301Lk(applicationContext, new C36033FvV(obj, 1), "registration_flow_extras");
                C41451vu.A01.A02(new C36155FxU((Object) obj, 6), C022308u.class);
                A01 = obj;
                c35146Fen = obj;
            }
        }
        return c35146Fen;
    }

    public static C35146Fen A01(Fragment fragment, EnumC33523Erw enumC33523Erw, RegFlowExtras regFlowExtras) {
        regFlowExtras.A0N = enumC33523Erw.A00.name();
        regFlowExtras.A03(regFlowExtras.A01());
        return A00(fragment.getContext());
    }

    public static void A02(Context context) {
        A00(context).A00.A04("reg_flow_extras_serialize_key");
    }

    public final void A03(AbstractC12990ll abstractC12990ll, RegFlowExtras regFlowExtras) {
        String str;
        regFlowExtras.A00 = System.currentTimeMillis();
        RegFlowExtras A0B = AbstractC31181DnP.A0B(regFlowExtras);
        String str2 = null;
        A0B.A0P = null;
        this.A00.A05("reg_flow_extras_serialize_key", A0B);
        EnumC33445EqI A012 = A0B.A01();
        EnumC31713DwI enumC31713DwI = null;
        try {
            String str3 = A0B.A0N;
            if (str3 != null) {
                enumC31713DwI = EnumC31713DwI.valueOf(str3);
            }
        } catch (IllegalArgumentException unused) {
        }
        double A013 = AbstractC31171DnF.A01();
        double A00 = AbstractC31171DnF.A00();
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A02(abstractC12990ll), "reg_flow_extras_cached");
        AbstractC31179DnN.A18(A0f, A013, A00);
        AbstractC31175DnJ.A0y(A0f);
        if (A012 != null) {
            str = A012.A00;
        } else {
            str = null;
        }
        AbstractC35274Fh9.A0D(A0f, "flow", str);
        AbstractC35274Fh9.A0C(A0f, abstractC12990ll, "module", "waterfall_log_in");
        if (enumC31713DwI != null) {
            str2 = enumC31713DwI.A01;
        }
        AbstractC31171DnF.A1A(A0f, str2);
        A0f.Cht();
    }
}
