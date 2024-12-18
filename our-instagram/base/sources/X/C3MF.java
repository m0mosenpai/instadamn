package X;

import android.content.Context;
import android.os.Bundle;
import android.util.SparseArray;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: X.3MF, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3MF {
    public static C66201U3x A00;
    public static C66273U6s A01;
    public static C62862tP A02;
    public static AbstractC12990ll A03;
    public static C3MF A04;
    public static final C3MG A06 = new Object();
    public static HashMap A05 = new HashMap();

    public static final void A00(Context context, UserSession userSession, C38321qM c38321qM, JGP jgp, String str) {
        String str2;
        String str3;
        String str4;
        InterfaceC39541sb injected;
        C62862tP c62862tP;
        C14360o3.A0B(context, 0);
        C14360o3.A0B(userSession, 1);
        if (context instanceof FragmentActivity) {
            C14360o3.A07(((FragmentActivity) context).getSupportFragmentManager().A0U.A04());
            if (!r0.isEmpty()) {
                Bundle bundle = new Bundle();
                bundle.putString("IgSessionManager.SESSION_TOKEN_KEY", userSession.token);
                C3MG c3mg = A06;
                A03 = C023409i.A0A.A04(bundle);
                String A2u = c38321qM.A2u();
                if (A2u != null) {
                    User CDj = c38321qM.A0C.CDj();
                    if (CDj != null) {
                        str2 = CDj.getId();
                    } else {
                        str2 = null;
                    }
                    InterfaceC39541sb injected2 = c38321qM.A0C.getInjected();
                    if (injected2 != null) {
                        str3 = injected2.AZE();
                    } else {
                        str3 = null;
                    }
                    InterfaceC39541sb injected3 = c38321qM.A0C.getInjected();
                    if (injected3 != null) {
                        str4 = injected3.CAR();
                    } else {
                        str4 = null;
                    }
                    ArrayList arrayList = new ArrayList();
                    HashMap hashMap = new HashMap();
                    hashMap.put("media_id", A2u);
                    hashMap.put("injection_trigger", str);
                    InterfaceC39541sb injected4 = c38321qM.A0C.getInjected();
                    if ((injected4 != null && C14360o3.A0K(injected4.CdF(), true)) || ((injected = c38321qM.A0C.getInjected()) != null && C14360o3.A0K(injected.CQW(), true))) {
                        if (str2 != null) {
                            hashMap.put("media_owner_id", str2);
                        }
                        if (str3 != null) {
                            hashMap.put("ad_id", str3);
                        }
                        if (str4 != null) {
                            hashMap.put("ad_tracking_token", str4);
                        }
                    }
                    A01 = new C66273U6s(null, null, "com.instagram.bloks.feed.injected_units.products_entrypoint", null, null, hashMap, arrayList, null, null, null, 0, false);
                    c3mg.A01("started", userSession, c38321qM);
                    AbstractC12990ll abstractC12990ll = A03;
                    if (abstractC12990ll != null && A01 != null && (c62862tP = A02) != null) {
                        C14360o3.A0C(abstractC12990ll, AbstractC58317Pt9.A00(46));
                        C14360o3.A0B(abstractC12990ll, 1);
                        C66201U3x A002 = C66201U3x.A00(context, new SparseArray(), A01, null, c62862tP, new C191778eZ(abstractC12990ll, false, false, false));
                        A00 = A002;
                        A002.A08(context, new C42085Iks(userSession, c38321qM));
                        A05.put(A2u, A002.A04(context).first);
                        jgp.Dwz();
                        return;
                    }
                    return;
                }
                throw new IllegalStateException("Required value was null.");
            }
        }
    }
}
