package X;

import android.content.Context;
import android.widget.ListAdapter;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: X.HEf, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38977HEf extends C2US implements InterfaceC65242xM, InterfaceC65252xN, ListAdapter, InterfaceC65272xP, InterfaceC161877Mx {
    public ES5 A00;
    public C65622xy A01;
    public C31369DqY A02;
    public boolean A03;
    public final C155946zO A04;
    public final C65602xw A05;
    public final InterfaceC60442pS A06;
    public final Map A07;
    public final InterfaceC09390do A08;
    public final Context A09;
    public final Fragment A0A;
    public final C65662y2 A0B;
    public final C65662y2 A0C;
    public final UserSession A0D;
    public final C37443GeN A0E;
    public final C155376yQ A0F;
    public final C152976uR A0G;
    public final C168737g7 A0H;
    public final InterfaceC62602sz A0I;
    public final C65842yM A0J;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [X.2y2, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [X.2y2, java.lang.Object] */
    public C38977HEf(Fragment fragment, FragmentActivity fragmentActivity, C62862tP c62862tP, C61142qc c61142qc, C155376yQ c155376yQ, C60972qL c60972qL, C38N c38n, C38O c38o, InterfaceC37216GaR interfaceC37216GaR, C38U c38u, InterfaceC62602sz interfaceC62602sz, C1M1 c1m1, InterfaceC16660sJ interfaceC16660sJ, int i, boolean z, boolean z2, boolean z3, boolean z4) {
        super(false);
        C31369DqY c31369DqY;
        C14360o3.A0B(c61142qc, 4);
        C14360o3.A0B(c38u, 16);
        this.A0A = fragment;
        this.A0F = c155376yQ;
        UserSession userSession = c60972qL.A01;
        this.A0D = userSession;
        InterfaceC60442pS interfaceC60442pS = c60972qL.A02;
        this.A06 = interfaceC60442pS;
        Context context = c60972qL.A00;
        this.A09 = context;
        ?? obj = new Object();
        this.A0C = obj;
        ?? obj2 = new Object();
        this.A0B = obj2;
        this.A07 = AbstractC166987dD.A1G();
        this.A04 = new C155946zO(null, c38u, C05F.A00);
        this.A0I = interfaceC62602sz;
        this.A05 = new C65602xw(userSession);
        this.A08 = C43203J8a.A00(this, 20);
        if (i != 0 && interfaceC16660sJ != null) {
            this.A00 = new ES5(i, interfaceC16660sJ);
        }
        C57342k9 c57342k9 = C57332k8.A0m;
        this.A01 = new C65622xy(fragmentActivity, fragment, (C2d4) fragmentActivity, c62862tP, c61142qc, c60972qL, c57342k9.A00(context, userSession), c1m1, null, z3, z, z2);
        C37443GeN c37443GeN = new C37443GeN(fragmentActivity, fragment, c62862tP, null, null, c61142qc, null, c60972qL, null, c57342k9.A00(context, userSession), null, c1m1, C05F.A01, C05F.A0C, null, z3, true, false, z, z4, z2, false);
        this.A0E = c37443GeN;
        C65842yM c65842yM = new C65842yM(context);
        this.A0J = c65842yM;
        C168737g7 c168737g7 = new C168737g7(context);
        this.A0H = c168737g7;
        if (interfaceC37216GaR != null && c38o != null) {
            c31369DqY = new C31369DqY(context, interfaceC60442pS, userSession, c38o, interfaceC37216GaR, false, false, false);
        } else {
            c31369DqY = null;
        }
        this.A02 = c31369DqY;
        C152976uR c152976uR = new C152976uR(interfaceC60442pS, userSession, null, c38n, c38u, null, null);
        this.A0G = c152976uR;
        ArrayList A1E = AbstractC166987dD.A1E();
        ES5 es5 = this.A00;
        if (es5 != null) {
            A1E.add(es5);
        }
        A1E.add(obj);
        C65622xy c65622xy = this.A01;
        if (c65622xy != null) {
            A1E.add(c65622xy);
        }
        A1E.add(c37443GeN);
        A1E.add(c65842yM);
        C31369DqY c31369DqY2 = this.A02;
        if (c31369DqY2 != null) {
            A1E.add(c31369DqY2);
        }
        AbstractC37301Gc2.A1S(c168737g7, c152976uR, obj2, A1E);
        init(A1E);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [X.2xy] */
    /* JADX WARN: Type inference failed for: r1v3, types: [X.GeN] */
    /* JADX WARN: Type inference failed for: r1v4 */
    public static final void A00(C38977HEf c38977HEf) {
        c38977HEf.A03 = true;
        C155946zO c155946zO = c38977HEf.A04;
        c155946zO.A08(c38977HEf.A0F);
        c38977HEf.clear();
        ES5 es5 = c38977HEf.A00;
        if (es5 != null) {
            c38977HEf.addModel(null, es5);
        }
        c38977HEf.addModel(null, c38977HEf.A0C);
        int size = ((AbstractC65332xV) c155946zO).A01.size();
        for (int i = 0; i < size; i++) {
            C38321qM c38321qM = (C38321qM) ((AbstractC65332xV) c155946zO).A01.get(i);
            C75113Zb BRZ = c38977HEf.BRZ(c38321qM);
            BRZ.A0D(i);
            ?? r1 = c38977HEf.A01;
            if (r1 == 0 || AbstractC56862jK.A00(c38977HEf.A09) || !r1.A03(c38321qM)) {
                r1 = c38977HEf.A0E;
            }
            c38977HEf.addModel(c38321qM, BRZ, (InterfaceC65642y0) r1);
        }
        c38977HEf.addModel(c38977HEf.A0I, c38977HEf.A0J);
        c38977HEf.updateListView();
    }

    @Override // X.InterfaceC65282xQ
    public final /* synthetic */ void A8q(Object obj, int i) {
    }

    @Override // X.InterfaceC161877Mx
    public final boolean AJn(String str) {
        C14360o3.A0B(str, 0);
        C155946zO c155946zO = this.A04;
        int size = ((AbstractC65332xV) c155946zO).A01.size();
        for (int i = 0; i < size; i++) {
            User A2E = ((C38321qM) ((AbstractC65332xV) c155946zO).A01.get(i)).A2E(this.A0D);
            if (A2E != null && C14360o3.A0K(A2E.getId(), str)) {
                return true;
            }
        }
        return false;
    }

    @Override // X.InterfaceC61772re, X.InterfaceC61782rf
    public final C75113Zb BRZ(C38321qM c38321qM) {
        C14360o3.A0B(c38321qM, 0);
        Map map = this.A07;
        C75113Zb c75113Zb = (C75113Zb) map.get(c38321qM.getId());
        if (c75113Zb == null) {
            c75113Zb = AbstractC37303Gc4.A0E(c38321qM);
            String id = c38321qM.getId();
            if (id != null) {
                map.put(id, c75113Zb);
            } else {
                throw AbstractC166997dE.A0g();
            }
        }
        UserSession userSession = this.A0D;
        if (C3YS.A00(userSession).A00(c38321qM) != -1) {
            EnumC75193Zm enumC75193Zm = EnumC75193Zm.values()[C3YS.A00(userSession).A00(c38321qM)];
            C14360o3.A0B(enumC75193Zm, 0);
            c75113Zb.A0m = enumC75193Zm;
        }
        return c75113Zb;
    }

    @Override // X.InterfaceC65282xQ
    public final void Ct5() {
        this.A03 = false;
    }

    @Override // X.InterfaceC65272xP
    public final void ETA(InterfaceC686036x interfaceC686036x) {
        C14360o3.A0B(interfaceC686036x, 0);
        this.A0E.A03(interfaceC686036x);
        C65622xy c65622xy = this.A01;
        if (c65622xy != null) {
            c65622xy.A02(interfaceC686036x);
        }
    }

    @Override // X.InterfaceC65272xP
    public final void EUR(C33P c33p) {
        C14360o3.A0B(c33p, 0);
        this.A0E.A03 = c33p;
        C65622xy c65622xy = this.A01;
        if (c65622xy != null) {
            c65622xy.A01 = c33p;
        }
    }

    @Override // X.C2UU
    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        C14360o3.A0B(recyclerView, 0);
        C66772zu c66772zu = (C66772zu) this.A08.getValue();
        if (c66772zu != null) {
            c66772zu.A00 = recyclerView;
        }
    }

    @Override // X.C2US
    public final void onBindViewHolder(C3OQ c3oq, int i) {
        C14360o3.A0B(c3oq, 0);
        InterfaceC09390do interfaceC09390do = this.A08;
        if (interfaceC09390do.getValue() != null) {
            C14360o3.A06(c3oq.itemView);
            java.util.Set set = C66772zu.A05;
        }
        super.onBindViewHolder(c3oq, i);
        C66772zu c66772zu = (C66772zu) interfaceC09390do.getValue();
        if (c66772zu != null) {
            c66772zu.A01(AbstractC31171DnF.A06(c3oq));
        }
    }

    @Override // X.C2UU
    public final void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        C14360o3.A0B(recyclerView, 0);
        C66772zu c66772zu = (C66772zu) this.A08.getValue();
        if (c66772zu != null) {
            c66772zu.A00 = null;
        }
    }

    @Override // X.C2US
    public final void onViewRecycled(C3OQ c3oq) {
        C14360o3.A0B(c3oq, 0);
        super.onViewRecycled(c3oq);
        if (this.A08.getValue() != null) {
            C66772zu.A00(AbstractC31171DnF.A06(c3oq));
        }
    }

    @Override // X.InterfaceC65282xQ
    public final boolean CSO() {
        return this.A03;
    }

    @Override // X.InterfaceC65252xN
    public final void EVk(int i) {
        this.A0C.A03 = i;
        A00(this);
    }

    @Override // X.InterfaceC65242xM
    public final /* bridge */ /* synthetic */ Object getAdapter() {
        return this;
    }

    @Override // X.C2US
    public final AnonymousClass302 getLithoPrepareHelperCallback() {
        C66772zu c66772zu = (C66772zu) this.A08.getValue();
        if (c66772zu != null) {
            return c66772zu.A01;
        }
        return null;
    }

    @Override // X.C2UT, android.widget.Adapter
    public final boolean isEmpty() {
        if (this.A04.A02() != 0) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC65282xQ
    public final void AVK() {
        A00(this);
    }

    @Override // X.InterfaceC65282xQ
    public final /* synthetic */ List CCN() {
        return AbstractC166987dD.A1E();
    }

    @Override // X.InterfaceC161877Mx
    public final void FAg() {
        notifyDataSetChangedSmart();
    }

    @Override // X.InterfaceC65282xQ
    public final /* synthetic */ int BK6(String str) {
        return -1;
    }

    @Override // X.InterfaceC65232xL
    public final void CtR(C38321qM c38321qM) {
        notifyDataSetChanged();
    }

    @Override // X.InterfaceC65282xQ
    public final /* synthetic */ Object EFR(int i) {
        return null;
    }
}
