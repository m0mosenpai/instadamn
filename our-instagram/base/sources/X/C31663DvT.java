package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.model.direct.threadkey.impl.MsysThreadId;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.DvT, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31663DvT implements InterfaceC37228Gad {
    public final Context A00;
    public final UserSession A01;
    public final C31661DvR A02;
    public final InterfaceC37228Gad A03;

    public C31663DvT(Context context, UserSession userSession, C31661DvR c31661DvR, InterfaceC37228Gad interfaceC37228Gad) {
        this.A00 = context;
        this.A01 = userSession;
        this.A02 = c31661DvR;
        this.A03 = interfaceC37228Gad;
    }

    public static final void A00(List list, List list2, List list3) {
        for (Object obj : list) {
            if (obj instanceof DirectThreadKey) {
                list2.add(obj);
            } else if (obj instanceof MsysThreadId) {
                list3.add(obj);
            }
        }
    }

    public static final void A01(Map map, Map map2, Map map3) {
        Iterator A15 = AbstractC166997dE.A15(map);
        while (A15.hasNext()) {
            Map.Entry A1K = AbstractC166987dD.A1K(A15);
            Object key = A1K.getKey();
            Object value = A1K.getValue();
            if (key instanceof DirectThreadKey) {
                map2.put(key, value);
            } else if (key instanceof MsysThreadId) {
                map3.put(key, value);
            }
        }
    }

    @Override // X.InterfaceC37228Gad
    public final void AOn(List list) {
        ArrayList A1E = AbstractC166987dD.A1E();
        ArrayList A1E2 = AbstractC166987dD.A1E();
        A00(list, A1E, A1E2);
        this.A02.AOn(A1E);
        this.A03.AOn(A1E2);
    }

    @Override // X.InterfaceC37228Gad
    public final void AVz(Map map) {
        HashMap A1G = AbstractC166987dD.A1G();
        HashMap A1G2 = AbstractC166987dD.A1G();
        A01(map, A1G, A1G2);
        this.A02.AVz(A1G);
        this.A03.AVz(A1G2);
    }

    @Override // X.InterfaceC37228Gad
    public final void CnJ(Map map) {
        HashMap A1G = AbstractC166987dD.A1G();
        HashMap A1G2 = AbstractC166987dD.A1G();
        A01(map, A1G, A1G2);
        this.A02.CnJ(A1G);
        this.A03.CnJ(A1G2);
    }

    @Override // X.InterfaceC37228Gad
    public final void Cpw(C32071E6x c32071E6x, Map map) {
        HashMap A1G = AbstractC166987dD.A1G();
        HashMap A1G2 = AbstractC166987dD.A1G();
        A01(map, A1G, A1G2);
        this.A02.Cpw(c32071E6x, A1G);
        this.A03.Cpw(c32071E6x, A1G2);
    }

    @Override // X.InterfaceC37228Gad
    public final void CqF(List list) {
        ArrayList A1E = AbstractC166987dD.A1E();
        ArrayList A1E2 = AbstractC166987dD.A1E();
        A00(list, A1E, A1E2);
        this.A02.CqF(A1E);
        this.A03.CqF(A1E2);
    }

    @Override // X.InterfaceC37228Gad
    public final void CqI(List list) {
        ArrayList A1E = AbstractC166987dD.A1E();
        ArrayList A1E2 = AbstractC166987dD.A1E();
        A00(list, A1E, A1E2);
        this.A02.CqI(A1E);
        this.A03.CqI(A1E2);
    }

    @Override // X.InterfaceC37228Gad
    public final void CqN(List list) {
        ArrayList A1E = AbstractC166987dD.A1E();
        ArrayList A1E2 = AbstractC166987dD.A1E();
        A00(list, A1E, A1E2);
        this.A02.CqN(A1E);
        this.A03.CqN(A1E2);
    }

    @Override // X.InterfaceC37228Gad
    public final void F9A(Map map) {
        HashMap A1G = AbstractC166987dD.A1G();
        HashMap A1G2 = AbstractC166987dD.A1G();
        A01(map, A1G, A1G2);
        this.A02.F9A(A1G);
        this.A03.F9A(A1G2);
    }

    @Override // X.InterfaceC37228Gad
    public final void F9N(List list) {
        ArrayList A1E = AbstractC166987dD.A1E();
        ArrayList A1E2 = AbstractC166987dD.A1E();
        A00(list, A1E, A1E2);
        this.A02.F9N(A1E);
        this.A03.F9N(A1E2);
    }

    @Override // X.InterfaceC37228Gad
    public final void F9P(List list) {
        ArrayList A1E = AbstractC166987dD.A1E();
        ArrayList A1E2 = AbstractC166987dD.A1E();
        A00(list, A1E, A1E2);
        this.A02.F9P(A1E);
        this.A03.F9P(A1E2);
    }

    @Override // X.InterfaceC37228Gad
    public final void F9S(List list) {
        ArrayList A1E = AbstractC166987dD.A1E();
        ArrayList A1E2 = AbstractC166987dD.A1E();
        A00(list, A1E, A1E2);
        this.A02.F9S(A1E);
        this.A03.F9S(A1E2);
    }
}
