package X;

import android.content.Context;
import android.os.Bundle;
import android.view.ViewParent;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.common.session.UserSession;
import com.instagram.modal.TransparentModalActivity;
import com.instagram.model.reels.Reel;
import com.instagram.reels.store.ReelStore;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.2vI, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C63972vI extends AbstractC60592pi implements InterfaceC11380iw, InterfaceC60602pj, InterfaceC63982vJ, InterfaceC63992vK {
    public static final String __redex_internal_original_name = "ReelNetegoController";
    public AbstractC149546o6 A00;
    public AbstractC140596Xn A01;
    public C140626Xq A02;
    public final AbstractC60672pq A03;
    public final UserSession A04;
    public final InterfaceC61352qx A05;
    public final InterfaceC60442pS A06;
    public final C64012vM A07;
    public final C64022vN A08 = new C64022vN();
    public final C1M1 A09;
    public final C61842rl A0A;
    public final C61252qn A0B;

    public C63972vI(AbstractC60672pq abstractC60672pq, UserSession userSession, InterfaceC61352qx interfaceC61352qx, InterfaceC60442pS interfaceC60442pS, C61252qn c61252qn, C1M1 c1m1, C61842rl c61842rl) {
        this.A04 = userSession;
        this.A06 = interfaceC60442pS;
        this.A0B = c61252qn;
        this.A03 = abstractC60672pq;
        this.A05 = interfaceC61352qx;
        this.A09 = c1m1;
        this.A0A = c61842rl;
        this.A07 = new C64012vM(this, userSession, null, null, null);
    }

    public final void A04(RecyclerView recyclerView, Reel reel, Integer num, String str, String str2, List list, float f, int i, int i2, boolean z) {
        C14360o3.A0B(recyclerView, 5);
        if (C1OU.A09(reel, this.A02)) {
            C140626Xq c140626Xq = this.A02;
            if (c140626Xq != null) {
                c140626Xq.A05(C05F.A0C);
            }
            AbstractC70663Fe abstractC70663Fe = recyclerView.A0D;
            if (abstractC70663Fe != null) {
                abstractC70663Fe.A1T(null, recyclerView, i);
            }
            int i3 = 0;
            boolean z2 = false;
            if (recyclerView.A0V(i) != null) {
                z2 = true;
            }
            RunnableC57086PTz runnableC57086PTz = new RunnableC57086PTz(recyclerView, reel, this, num, str, str2, list, f, i, i2, z);
            if (!z2) {
                i3 = 100;
            }
            recyclerView.postDelayed(runnableC57086PTz, i3);
        }
    }

    @Override // X.InterfaceC64002vL
    public final void CMu(String str) {
    }

    @Override // X.InterfaceC64002vL
    public final void D1e(Reel reel) {
    }

    @Override // X.InterfaceC63982vJ
    public final /* synthetic */ void DHC(Reel reel, C6X4 c6x4) {
    }

    @Override // X.InterfaceC64002vL
    public final void DJt() {
    }

    @Override // X.InterfaceC64002vL
    public final /* synthetic */ void DSa() {
    }

    @Override // X.InterfaceC64002vL
    public final void DVW() {
    }

    @Override // X.InterfaceC64002vL
    public final void DXO() {
    }

    @Override // X.InterfaceC63982vJ
    public final /* synthetic */ void Ddi(Reel reel) {
    }

    @Override // X.InterfaceC64002vL
    public final void De5(EnumC53202Nfy enumC53202Nfy, String str) {
        C14360o3.A0B(enumC53202Nfy, 0);
        int ordinal = enumC53202Nfy.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                new C684436h(this.A03.requireActivity(), this.A04).Cgk(EnumC33409Epg.UNKNOWN, false, false);
            }
        } else {
            UserSession userSession = this.A04;
            Bundle bundle = new Bundle();
            AbstractC60672pq abstractC60672pq = this.A03;
            C6XJ.A02(abstractC60672pq.requireActivity(), bundle, userSession, TransparentModalActivity.class, AbstractC111324zv.A00(31)).A0C(abstractC60672pq.requireActivity());
        }
    }

    @Override // X.InterfaceC64002vL
    public final void De6(Reel reel, C70873Fz c70873Fz, int i) {
        C14360o3.A0B(reel, 0);
        C14360o3.A0B(c70873Fz, 2);
        this.A07.A02(reel, c70873Fz, null, true, null, i);
    }

    @Override // X.InterfaceC64002vL
    public final /* synthetic */ void De7(C3OO c3oo, InterfaceC73233Pz interfaceC73233Pz, Integer num, String str, String str2, List list, int i, boolean z) {
        C14360o3.A0B(str, 1);
        C14360o3.A0B(list, 3);
        C14360o3.A0B(c3oo, 4);
        De8(c3oo, interfaceC73233Pz, num, str, str2, "", list, 0.0f, i, 0, z);
    }

    @Override // X.InterfaceC64002vL
    public final void De8(C3OO c3oo, InterfaceC73233Pz interfaceC73233Pz, Integer num, String str, String str2, String str3, List list, float f, int i, int i2, boolean z) {
        String CAR;
        String id;
        Long l;
        C14360o3.A0B(str, 0);
        C14360o3.A0B(list, 2);
        C14360o3.A0B(c3oo, 3);
        C14360o3.A0B(str3, 10);
        UserSession userSession = this.A04;
        Reel A0M = ReelStore.A03(userSession).A0M(str);
        if (A0M != null) {
            if (c3oo.itemView.getParent() instanceof RecyclerView) {
                ViewParent parent = c3oo.itemView.getParent();
                C14360o3.A0C(parent, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
                A04((RecyclerView) parent, A0M, num, str2, str3, list, f, i, i2, z);
            } else {
                A01(c3oo, A0M, num, str2, str3, list, f, i2, z);
            }
            if (interfaceC73233Pz != null && (CAR = interfaceC73233Pz.CAR()) != null && (id = interfaceC73233Pz.getId()) != null) {
                String obj = interfaceC73233Pz.B5n().toString();
                if (interfaceC73233Pz.BWa() != null) {
                    l = Long.valueOf(r0.intValue());
                } else {
                    l = null;
                }
                C3R6.A05(this, userSession, l, obj, id, AbstractC111324zv.A00(4217), CAR);
            }
        }
    }

    @Override // X.InterfaceC64002vL
    public final void DeA(Reel reel, C70873Fz c70873Fz, Integer num, int i) {
        C14360o3.A0B(reel, 0);
        C14360o3.A0B(c70873Fz, 2);
        this.A07.A02(reel, c70873Fz, null, null, num, i);
    }

    @Override // X.InterfaceC64002vL
    public final void DeC(List list, int i, String str) {
    }

    @Override // X.InterfaceC64002vL
    public final void DeF(String str) {
    }

    @Override // X.InterfaceC63982vJ
    public final /* synthetic */ void DeI(Reel reel) {
    }

    @Override // X.InterfaceC64002vL
    public final void Dvg(int i) {
    }

    @Override // X.InterfaceC64002vL
    public final void E1q(C3OO c3oo, Reel reel, Integer num, String str, String str2, List list) {
        C14360o3.A0B(c3oo, 0);
        C14360o3.A0B(reel, 1);
        C14360o3.A0B(list, 2);
        C14360o3.A0B(str2, 5);
        A01(c3oo, reel, num, str, str2, list, 0.0f, 0, false);
    }

    public static final ArrayList A00(C63972vI c63972vI, List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Reel A0M = ReelStore.A03(c63972vI.A04).A0M((String) it.next());
            if (A0M != null) {
                arrayList.add(A0M);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void A01(C3OO c3oo, Reel reel, Integer num, String str, String str2, List list, float f, int i, boolean z) {
        if (C1OU.A09(reel, this.A02)) {
            C140626Xq c140626Xq = this.A02;
            if (c140626Xq != null) {
                c140626Xq.A05(C05F.A0C);
            }
            if (c3oo instanceof InterfaceC72953Ov) {
                A02(null, reel, (InterfaceC72953Ov) c3oo, this, num, str, str2, list, f, i, z);
                return;
            }
            if (!(c3oo instanceof C51332Mlt)) {
                return;
            }
            C51332Mlt c51332Mlt = (C51332Mlt) c3oo;
            Context context = c51332Mlt.A00.getContext();
            UserSession userSession = this.A04;
            C14360o3.A0B(userSession, 0);
            C140626Xq A03 = C1OU.A03(context, userSession, reel, new P8S(new P8Q(reel, c51332Mlt, this, num, str2, str, list)), AbstractC82003lM.A00(userSession), this.A06.getModuleName(), -1);
            A03.A04();
            this.A05.EDY(A03);
            this.A02 = A03;
        }
    }

    public static final void A02(RecyclerView recyclerView, Reel reel, InterfaceC72953Ov interfaceC72953Ov, C63972vI c63972vI, Integer num, String str, String str2, List list, float f, int i, boolean z) {
        Context context = interfaceC72953Ov.BlH().getContext();
        UserSession userSession = c63972vI.A04;
        C1OU c1ou = C1OU.$redex_init_class;
        C14360o3.A0B(userSession, 0);
        C140626Xq A03 = C1OU.A03(context, userSession, reel, new C6X7(new P8R(recyclerView, reel, interfaceC72953Ov, c63972vI, num, str, str2, list, f, i, z), interfaceC72953Ov.Blo(), reel.A1P), AbstractC82003lM.A00(userSession), c63972vI.A06.getModuleName(), -1);
        A03.A04();
        interfaceC72953Ov.EcK(A03);
        c63972vI.A05.EDY(A03);
        c63972vI.A02 = A03;
    }

    public static final void A03(C63972vI c63972vI) {
        C64022vN c64022vN = c63972vI.A08;
        C64022vN A04 = c64022vN.A04();
        c64022vN.A05();
        C57652ke.A00(c63972vI.A04).A0L(A04);
    }

    public final void A05(RecyclerView recyclerView, Integer num, String str, String str2, boolean z) {
        String str3 = str;
        C2UU c2uu = recyclerView.A0A;
        if (c2uu != null) {
            C69523Am c69523Am = (C69523Am) c2uu;
            List list = ((AbstractC69533An) c69523Am).A04;
            for (int i = 0; i < list.size(); i++) {
                C3G4 c3g4 = (C3G4) list.get(i);
                if (!c3g4.A03.A0d() && !c3g4.A03.A1a) {
                    UserSession userSession = c69523Am.A0A;
                    if ((c69523Am.A00(userSession).A01.A01.A01 == 0 && c3g4.A04(userSession)) || !c3g4.A04(userSession)) {
                        C140626Xq c140626Xq = this.A02;
                        if (c140626Xq != null) {
                            Reel reel = c3g4.A03;
                            if (str == null) {
                                str3 = "";
                            }
                            c140626Xq.A05(C05F.A0C);
                            C2UU c2uu2 = recyclerView.A0A;
                            C14360o3.A0C(c2uu2, "null cannot be cast to non-null type com.instagram.reels.ui.ScrollableReelTrayAdapter");
                            C69523Am c69523Am2 = (C69523Am) c2uu2;
                            int CNP = c69523Am2.CNP(reel);
                            if (recyclerView.A0V(CNP) != null) {
                                List list2 = ((AbstractC69533An) c69523Am2).A03;
                                C14360o3.A07(list2);
                                A04(recyclerView, reel, num, str3, str2, list2, 0.0f, CNP, 0, z);
                                return;
                            } else {
                                recyclerView.A14(new C51197Mjh(reel, c69523Am2, this, num, str3, str2, CNP, z));
                                AbstractC70663Fe abstractC70663Fe = recyclerView.A0D;
                                C14360o3.A0C(abstractC70663Fe, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
                                if (CNP <= ((LinearLayoutManager) abstractC70663Fe).A1d()) {
                                    CNP = Math.max(CNP - 1, 0);
                                }
                                recyclerView.A0o(CNP);
                                return;
                            }
                        }
                        return;
                    }
                }
            }
        }
    }

    @Override // X.InterfaceC64002vL
    public final /* synthetic */ int C9u() {
        return 0;
    }

    @Override // X.InterfaceC63992vK
    public final void Ddr(int i) {
        this.A07.A01(i);
    }

    @Override // X.InterfaceC63992vK
    public final void EI4(long j, int i) {
        C64012vM c64012vM = this.A07;
        UserSession userSession = this.A04;
        c64012vM.A04(new C70873Fz(userSession, C1OU.A04(userSession).A0U(false)), this.A0B, C05F.A0u, i, j, false);
    }

    @Override // X.InterfaceC63992vK
    public final void EI5(long j) {
        C64012vM c64012vM = this.A07;
        UserSession userSession = this.A04;
        c64012vM.A03(new C70873Fz(userSession, C1OU.A04(userSession).A0U(false)), this.A0B, null, C05F.A0u, j, false);
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return this.A06.getModuleName();
    }

    @Override // X.AbstractC60592pi, X.InterfaceC60602pj
    public final void onDestroyView() {
        A03(this);
        C140626Xq c140626Xq = this.A02;
        if (c140626Xq != null) {
            this.A05.F9f(c140626Xq);
        }
        this.A00 = null;
        this.A01 = null;
    }

    @Override // X.AbstractC60592pi, X.InterfaceC60602pj
    public final void onPause() {
        A03(this);
        C140626Xq c140626Xq = this.A02;
        if (c140626Xq != null) {
            c140626Xq.A05(C05F.A0N);
        }
        FragmentActivity requireActivity = this.A03.requireActivity();
        C1OU c1ou = C1OU.$redex_init_class;
        C3M4 A05 = C3M4.A05(requireActivity);
        if (A05 != null) {
            A05.A0T();
        }
    }
}
