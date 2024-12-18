package X;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

/* renamed from: X.HEh, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38979HEh extends C2US implements InterfaceC65242xM, InterfaceC65272xP {
    public boolean A00;
    public final UserSession A01;
    public final C37443GeN A02;
    public final InterfaceC60442pS A03;
    public final C66732zq A04;
    public final Map A05;
    public final InterfaceC09390do A06;
    public final Context A07;
    public final C65662y2 A08;
    public final InterfaceC62602sz A09;
    public final C65842yM A0A;
    public final Map A0B;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r2v1, types: [X.2y2, java.lang.Object, X.2y0] */
    public C38979HEh(FragmentActivity fragmentActivity, C61142qc c61142qc, C60972qL c60972qL, InterfaceC64872wl interfaceC64872wl, InterfaceC62602sz interfaceC62602sz) {
        super(false);
        AbstractC25234BEr.A0j(2, c60972qL, c61142qc, interfaceC62602sz, interfaceC64872wl);
        this.A09 = interfaceC62602sz;
        Context context = c60972qL.A00;
        this.A07 = context;
        UserSession userSession = c60972qL.A01;
        this.A01 = userSession;
        InterfaceC60442pS interfaceC60442pS = c60972qL.A02;
        this.A03 = interfaceC60442pS;
        ?? obj = new Object();
        this.A08 = obj;
        C37443GeN c37443GeN = new C37443GeN(fragmentActivity, fragmentActivity, c61142qc, c60972qL, true, true);
        this.A02 = c37443GeN;
        C66732zq c66732zq = new C66732zq(context, interfaceC60442pS, userSession, interfaceC64872wl, C05F.A0B, true);
        this.A04 = c66732zq;
        C65842yM c65842yM = new C65842yM(context);
        this.A0A = c65842yM;
        this.A06 = C43205J8c.A00(this, 38);
        this.A0B = AbstractC166987dD.A1G();
        this.A05 = AbstractC166987dD.A1G();
        init(c65842yM, obj, c37443GeN, c66732zq);
    }

    public final void A00() {
        String str;
        this.A00 = true;
        clear();
        if (!isEmpty()) {
            HashSet A1H = AbstractC166987dD.A1H();
            int i = 0;
            for (Object obj : ((C42748Ivm) this.A06.getValue()).A01) {
                int i2 = i + 1;
                if (i < 0) {
                    AbstractC16960so.A1U();
                    throw C00O.createAndThrow();
                }
                if (obj instanceof C38321qM) {
                    C38321qM c38321qM = (C38321qM) obj;
                    C75113Zb BRZ = BRZ(c38321qM);
                    BRZ.A0D(i);
                    addModel(c38321qM, BRZ, this.A02);
                    if (BRZ.A0m == EnumC75193Zm.A0F) {
                        continue;
                    } else {
                        String id = c38321qM.getId();
                        if (id != null) {
                            A1H.add(id);
                        } else {
                            throw AbstractC166997dE.A0g();
                        }
                    }
                } else if (obj instanceof C99134ca) {
                    C99134ca c99134ca = (C99134ca) obj;
                    Map map = this.A05;
                    String str2 = c99134ca.A05;
                    Object obj2 = map.get(str2);
                    if (obj2 == null) {
                        obj2 = new IJ0(c99134ca, i);
                        map.put(str2, obj2);
                    }
                    String str3 = c99134ca.A07;
                    String str4 = null;
                    if (str3 != null && (str = c99134ca.A06) != null) {
                        C38801rC c38801rC = C38321qM.A0h;
                        str4 = AbstractC37301Gc2.A0p(str3, str);
                    }
                    if (!AbstractC001800i.A0u(A1H, str4)) {
                        addModel(c99134ca, obj2, this.A04);
                    }
                }
                i = i2;
            }
        }
        InterfaceC62602sz interfaceC62602sz = this.A09;
        if (interfaceC62602sz.CLJ() || interfaceC62602sz.CUG() || interfaceC62602sz.isLoading()) {
            addModel(interfaceC62602sz, this.A0A);
        }
        notifyDataSetChanged();
    }

    @Override // X.InterfaceC65282xQ
    public final /* synthetic */ void A8q(Object obj, int i) {
    }

    @Override // X.InterfaceC61772re, X.InterfaceC61782rf
    public final C75113Zb BRZ(C38321qM c38321qM) {
        C14360o3.A0B(c38321qM, 0);
        Map map = this.A0B;
        Object obj = map.get(c38321qM);
        Object obj2 = obj;
        if (obj == null) {
            C75113Zb A0E = AbstractC37303Gc4.A0E(c38321qM);
            A0E.A0A(AbstractC76283bY.A00(c38321qM));
            map.put(c38321qM, A0E);
            obj2 = A0E;
        }
        return (C75113Zb) obj2;
    }

    @Override // X.InterfaceC65282xQ
    public final void Ct5() {
        this.A00 = false;
    }

    @Override // X.InterfaceC65272xP
    public final void ETA(InterfaceC686036x interfaceC686036x) {
        C14360o3.A0B(interfaceC686036x, 0);
        this.A02.A03(interfaceC686036x);
    }

    @Override // X.InterfaceC65272xP
    public final void EUR(C33P c33p) {
        C14360o3.A0B(c33p, 0);
        this.A02.A03 = c33p;
    }

    public final void A01(List list) {
        InterfaceC09390do interfaceC09390do = this.A06;
        C42748Ivm c42748Ivm = (C42748Ivm) interfaceC09390do.getValue();
        c42748Ivm.A04.clear();
        c42748Ivm.A05.clear();
        InterfaceC61752rc interfaceC61752rc = c42748Ivm.A00;
        if (interfaceC61752rc != null) {
            interfaceC61752rc.DNz();
        }
        ((C42748Ivm) interfaceC09390do.getValue()).A03(list);
        ((C42748Ivm) interfaceC09390do.getValue()).A02();
        A00();
    }

    @Override // X.InterfaceC65282xQ
    public final boolean CSO() {
        return this.A00;
    }

    @Override // X.InterfaceC65242xM
    public final /* bridge */ /* synthetic */ Object getAdapter() {
        return this;
    }

    @Override // X.C2UT, android.widget.Adapter
    public final boolean isEmpty() {
        return AbstractC167007dF.A1N(((C42748Ivm) this.A06.getValue()).A01.size());
    }

    @Override // X.InterfaceC65282xQ
    public final void AVK() {
        A00();
    }

    @Override // X.InterfaceC65282xQ
    public final /* synthetic */ List CCN() {
        return AbstractC166987dD.A1E();
    }

    @Override // X.InterfaceC65282xQ
    public final /* synthetic */ int BK6(String str) {
        return -1;
    }

    @Override // X.InterfaceC65232xL
    public final void CtR(C38321qM c38321qM) {
        A00();
    }

    @Override // X.InterfaceC65282xQ
    public final /* synthetic */ Object EFR(int i) {
        return null;
    }
}
