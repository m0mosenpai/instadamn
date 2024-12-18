package X;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.widget.ListAdapter;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.genericsurvey.fragment.GenericSurveyFragment;
import com.instagram.model.reels.Reel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes7.dex */
public final class HEH extends C7E1 implements InterfaceC60602pj, InterfaceC65242xM, ListAdapter, InterfaceC65272xP, JGF {
    public boolean A00;
    public final C65322xU A01;
    public final C41131IIw A02;
    public final IMQ A03;
    public final List A04;
    public final Context A05;
    public final UserSession A06;
    public final C37443GeN A07;
    public final InterfaceC60442pS A08;
    public final C38990HEs A09;
    public final HF6 A0A;
    public final C38991HEt A0B;
    public final C38997HEz A0C;
    public final HFF A0D;
    public final Map A0E;

    public static final void A00(HEH heh) {
        InterfaceC65642y0 interfaceC65642y0;
        InterfaceC65642y0 interfaceC65642y02;
        Object obj;
        Object obj2;
        Object obj3;
        C3XG c3xg;
        heh.A00 = true;
        C65322xU c65322xU = heh.A01;
        UserSession userSession = heh.A06;
        ArrayList A1E = AbstractC166987dD.A1E();
        ArrayList A1E2 = AbstractC166987dD.A1E();
        Iterator A13 = AbstractC166997dE.A13(((AbstractC65332xV) c65322xU).A02);
        while (A13.hasNext()) {
            Object next = A13.next();
            if (C3YR.A00(userSession, (C3XG) next)) {
                A1E2.add(next);
            } else {
                A1E.add(next);
            }
        }
        Iterator it = A1E.iterator();
        while (it.hasNext()) {
            c65322xU.A0D(it.next());
        }
        AbstractC37302Gc3.A1Q(c65322xU, A1E2);
        heh.A06();
        List list = heh.A04;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            IKO iko = (IKO) list.get(i);
            int intValue = iko.A08.intValue();
            if (intValue != 0) {
                if (intValue != 2) {
                    if (intValue != 3) {
                        if (intValue != 4) {
                            if (intValue == 1) {
                                Object obj4 = iko.A05;
                                Object obj5 = obj4;
                                if (obj4 == null) {
                                    H6W h6w = iko.A01;
                                    obj5 = obj4;
                                    if (h6w != null) {
                                        C41222IMn c41222IMn = new C41222IMn(h6w);
                                        iko.A05 = c41222IMn;
                                        obj5 = c41222IMn;
                                    }
                                }
                                Object obj6 = heh.A03;
                                interfaceC65642y0 = heh.A0C;
                                obj3 = obj6;
                                obj2 = obj5;
                            }
                        } else {
                            Object obj7 = iko.A04;
                            heh.A03.A03 = C05F.A0Y;
                            interfaceC65642y02 = heh.A09;
                            obj = obj7;
                            heh.A08(interfaceC65642y02, obj);
                        }
                    } else {
                        C38321qM c38321qM = iko.A03;
                        if (c38321qM != null || ((c3xg = iko.A02) != null && (c38321qM = AbstractC37300Gc1.A0E(c3xg)) != null)) {
                            heh.BRZ(c38321qM).A0D(i);
                            IMQ imq = heh.A03;
                            imq.A03 = iko.A08;
                            Object obj8 = iko.A03;
                            if (obj8 == null) {
                                C3XG c3xg2 = iko.A02;
                                if (c3xg2 != null) {
                                    obj8 = AbstractC37300Gc1.A0E(c3xg2);
                                } else {
                                    obj8 = null;
                                }
                            }
                            heh.A09(heh.A0B, obj8, imq);
                        } else {
                            throw AbstractC166987dD.A14("Required value was null.");
                        }
                    }
                } else {
                    C37771pE c37771pE = iko.A07;
                    if (c37771pE != null) {
                        Reel A0I = C1OU.A04(userSession).A0I(c37771pE, false);
                        IMQ imq2 = heh.A03;
                        imq2.A03 = iko.A08;
                        C38321qM c38321qM2 = A0I.A0A(userSession, 0).A0b;
                        c38321qM2.getClass();
                        if (c38321qM2.Cff() && !imq2.A07 && heh.A0D.A01) {
                            C41131IIw c41131IIw = heh.A02;
                            C4S7 c4s7 = new C4S7(c38321qM2, 0);
                            C5TA c5ta = c41131IIw.A01;
                            c4s7.A00 = c5ta.A0D();
                            float f = 0.0f;
                            if (c5ta.A0D()) {
                                f = 1.0f;
                            }
                            c5ta.A08(c41131IIw.A00, c38321qM2.A2H(), c4s7, c38321qM2.A0M, "genericsurvey", f, -1, 0, true, true);
                            imq2.A07 = true;
                        }
                        interfaceC65642y0 = heh.A0D;
                        obj3 = imq2;
                        obj2 = A0I;
                    } else {
                        throw AbstractC166987dD.A14("Required value was null.");
                    }
                }
                heh.A09(interfaceC65642y0, obj2, obj3);
            } else if (AbstractC166987dD.A1b(((AbstractC65332xV) c65322xU).A01)) {
                C3XG c3xg3 = iko.A02;
                if (c3xg3 != null) {
                    C38321qM A0E = AbstractC37300Gc1.A0E(c3xg3);
                    if (A0E != null) {
                        C75113Zb BRZ = heh.BRZ(A0E);
                        BRZ.A0D(i);
                        heh.A03.A03 = iko.A08;
                        boolean A1Z = AbstractC166997dE.A1Z(c3xg3.A02, true);
                        Object A0E2 = AbstractC37300Gc1.A0E(c3xg3);
                        if (A1Z) {
                            interfaceC65642y02 = heh.A0A;
                            obj = A0E2;
                            heh.A08(interfaceC65642y02, obj);
                        } else {
                            interfaceC65642y0 = heh.A07;
                            obj3 = BRZ;
                            obj2 = A0E2;
                            heh.A09(interfaceC65642y0, obj2, obj3);
                        }
                    } else {
                        throw AbstractC166987dD.A14("Required value was null.");
                    }
                } else {
                    throw AbstractC166987dD.A14("Required value was null.");
                }
            } else {
                continue;
            }
        }
        heh.A07();
    }

    @Override // X.InterfaceC65282xQ
    public final /* synthetic */ void A8q(Object obj, int i) {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void ADK(View view) {
    }

    @Override // X.InterfaceC61772re, X.InterfaceC61782rf
    public final C75113Zb BRZ(C38321qM c38321qM) {
        C14360o3.A0B(c38321qM, 0);
        Map map = this.A0E;
        String id = c38321qM.getId();
        if (id != null) {
            Object obj = map.get(id);
            Object obj2 = obj;
            if (obj == null) {
                C75113Zb A0E = AbstractC37303Gc4.A0E(c38321qM);
                int i = -1;
                if (c38321qM.A5M()) {
                    i = 0;
                }
                A0E.A0B(i);
                AnonymousClass341 anonymousClass341 = AnonymousClass341.A05;
                C14360o3.A0B(anonymousClass341, 0);
                A0E.A0o = anonymousClass341;
                map.put(id, A0E);
                obj2 = A0E;
            }
            return (C75113Zb) obj2;
        }
        throw AbstractC166997dE.A0g();
    }

    @Override // X.InterfaceC65282xQ
    public final void Ct5() {
        this.A00 = false;
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void D8S(View view) {
    }

    @Override // X.JGF
    public final void Dcl(IMQ imq, int i) {
        if (1 == i) {
            A00(this);
        }
    }

    @Override // X.InterfaceC65272xP
    public final void ETA(InterfaceC686036x interfaceC686036x) {
        C14360o3.A0B(interfaceC686036x, 0);
        this.A07.A03(interfaceC686036x);
    }

    @Override // X.InterfaceC65272xP
    public final void EUR(C33P c33p) {
        C14360o3.A0B(c33p, 0);
        this.A07.A03 = c33p;
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onActivityResult(int i, int i2, Intent intent) {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onConfigurationChanged(Configuration configuration) {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onCreate() {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onDestroy() {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onDestroyView() {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onPause() {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onResume() {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onSaveInstanceState(Bundle bundle) {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onStart() {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onViewCreated(View view, Bundle bundle) {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onViewStateRestored(Bundle bundle) {
    }

    public HEH(FragmentActivity fragmentActivity, C61142qc c61142qc, C60972qL c60972qL, GenericSurveyFragment genericSurveyFragment) {
        boolean A1a = AbstractC31175DnJ.A1a(c61142qc);
        InterfaceC60442pS interfaceC60442pS = c60972qL.A02;
        this.A08 = interfaceC60442pS;
        Context context = c60972qL.A00;
        this.A05 = context;
        UserSession userSession = c60972qL.A01;
        this.A06 = userSession;
        C41131IIw c41131IIw = new C41131IIw(context, userSession, interfaceC60442pS);
        this.A02 = c41131IIw;
        C37443GeN c37443GeN = new C37443GeN(fragmentActivity, fragmentActivity, c61142qc, c60972qL, A1a, A1a);
        this.A07 = c37443GeN;
        C38997HEz c38997HEz = new C38997HEz(userSession, genericSurveyFragment);
        this.A0C = c38997HEz;
        HFF hff = new HFF(fragmentActivity, userSession, interfaceC60442pS, genericSurveyFragment, c41131IIw);
        this.A0D = hff;
        HF6 hf6 = new HF6(interfaceC60442pS, userSession, genericSurveyFragment);
        this.A0A = hf6;
        C38991HEt c38991HEt = new C38991HEt(interfaceC60442pS);
        this.A0B = c38991HEt;
        C38990HEs c38990HEs = new C38990HEs(interfaceC60442pS);
        this.A09 = c38990HEs;
        this.A0E = AbstractC166987dD.A1G();
        this.A04 = AbstractC166987dD.A1E();
        this.A01 = new C65322xU();
        this.A03 = new IMQ();
        A0B(c37443GeN, c38997HEz, hff, hf6, c38991HEt, c38990HEs);
    }

    @Override // X.InterfaceC65282xQ
    public final boolean CSO() {
        return this.A00;
    }

    @Override // X.InterfaceC65242xM
    public final /* bridge */ /* synthetic */ Object getAdapter() {
        return this;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final boolean isEmpty() {
        return this.A04.isEmpty();
    }

    @Override // X.InterfaceC60602pj
    public final void onStop() {
        C5TA c5ta = this.A02.A01;
        if (c5ta.A0D()) {
            c5ta.A03(-2);
            A00(this);
        }
    }

    public final void A0C(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C3XG c3xg = ((IKO) it.next()).A02;
            if (c3xg != null) {
                this.A01.A0A(c3xg);
            }
        }
        this.A03.A08.add(this);
        this.A04.addAll(list);
        A00(this);
    }

    @Override // X.InterfaceC65282xQ
    public final void AVK() {
        A00(this);
    }

    @Override // X.InterfaceC65282xQ
    public final /* synthetic */ List CCN() {
        return AbstractC166987dD.A1E();
    }

    @Override // X.InterfaceC65232xL
    public final void CtR(C38321qM c38321qM) {
        C0fA.A00(this, -2093862331);
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        A00(this);
    }

    @Override // X.InterfaceC65282xQ
    public final /* synthetic */ int BK6(String str) {
        return -1;
    }

    @Override // X.InterfaceC65282xQ
    public final /* synthetic */ Object EFR(int i) {
        return null;
    }
}
