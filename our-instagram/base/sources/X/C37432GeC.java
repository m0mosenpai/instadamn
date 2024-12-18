package X;

import android.content.Context;
import android.view.View;
import android.widget.ListAdapter;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.common.session.UserSession;
import com.instagram.search.common.analytics.SearchContext;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: X.GeC, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37432GeC extends HY4 implements ListAdapter, InterfaceC58046PoX, InterfaceC161877Mx {
    public boolean A00;
    public boolean A01;
    public boolean A02;
    public final Context A03;
    public final Fragment A04;
    public final UserSession A05;
    public final C65672y3 A06;
    public final C60972qL A07;
    public final C65602xw A08;
    public final InterfaceC60442pS A09;
    public final SearchContext A0A;
    public final String A0B;
    public final ArrayList A0C;
    public final InterfaceC09390do A0D;
    public final InterfaceC09390do A0E;
    public final InterfaceC09390do A0F;
    public final boolean A0G;
    public final boolean A0H;
    public final C65662y2 A0I;
    public final C65662y2 A0J;
    public final InterfaceC61352qx A0K;
    public final C155376yQ A0L;
    public final AnonymousClass341 A0M;
    public final C57462kL A0N;
    public final C66722zp A0O;
    public final C66062yi A0P;
    public final C5GV A0Q;
    public final C152996uT A0R;
    public final InterfaceC62602sz A0S;
    public final C65842yM A0T;
    public final String A0U;
    public final Map A0V;
    public final boolean A0W;
    public final boolean A0X;

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00b4, code lost:
    
        if (r10 == false) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A00(X.C37432GeC r12) {
        /*
            Method dump skipped, instructions count: 262
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C37432GeC.A00(X.GeC):void");
    }

    @Override // X.InterfaceC58046PoX
    public final void AI2() {
    }

    @Override // X.InterfaceC61772re, X.InterfaceC61782rf
    public final C75113Zb BRZ(C38321qM c38321qM) {
        boolean z;
        C84923qg A1V;
        C14360o3.A0B(c38321qM, 0);
        Map map = this.A0V;
        C75113Zb c75113Zb = (C75113Zb) map.get(c38321qM.getId());
        if (c75113Zb == null) {
            c75113Zb = new C75113Zb(c38321qM.A0p(), c38321qM.A4w());
            AnonymousClass341 anonymousClass341 = this.A0M;
            if (anonymousClass341 != null) {
                c75113Zb.A0o = anonymousClass341;
            }
            if (this.A01 && (c38321qM.A5i() || !c38321qM.A4S())) {
                z = true;
            } else {
                z = false;
            }
            c75113Zb.A37 = z;
            UserSession userSession = this.A05;
            if (AbstractC75343a1.A08(userSession, c38321qM)) {
                C14360o3.A0B(userSession, 0);
                if (!C18U.A06(C06090Tz.A05, userSession, 2342165869759113931L) || c38321qM.A1V() == null || ((A1V = c38321qM.A1V()) != null && !A1V.A0i)) {
                    c75113Zb.A0N(EnumC75183Zl.A06);
                }
            }
            String id = c38321qM.getId();
            if (id != null) {
                map.put(id, c75113Zb);
            } else {
                throw new IllegalStateException("Required value was null.");
            }
        }
        return c75113Zb;
    }

    @Override // X.InterfaceC65282xQ
    public final void Ct5() {
        this.A02 = false;
    }

    @Override // X.InterfaceC65272xP
    public final void ETA(InterfaceC686036x interfaceC686036x) {
        C14360o3.A0B(interfaceC686036x, 0);
        C37443GeN c37443GeN = (C37443GeN) this.A0F.getValue();
        if (c37443GeN != null) {
            c37443GeN.A03(interfaceC686036x);
        }
        C65622xy c65622xy = (C65622xy) this.A0D.getValue();
        if (c65622xy != null) {
            c65622xy.A02(interfaceC686036x);
        }
        C65672y3 c65672y3 = this.A06;
        if (c65672y3 != null) {
            c65672y3.A08(interfaceC686036x);
        }
    }

    @Override // X.InterfaceC65272xP
    public final void EUR(C33P c33p) {
        C14360o3.A0B(c33p, 0);
        C37443GeN c37443GeN = (C37443GeN) this.A0F.getValue();
        if (c37443GeN != null) {
            c37443GeN.A03 = c33p;
        }
        C65672y3 c65672y3 = this.A06;
        if (c65672y3 != null) {
            c65672y3.A03 = c33p;
        }
        C65622xy c65622xy = (C65622xy) this.A0D.getValue();
        if (c65622xy != null) {
            c65622xy.A01 = c33p;
        }
    }

    @Override // X.InterfaceC58046PoX
    public final void Eet(View view) {
    }

    @Override // X.C2UU
    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        C14360o3.A0B(recyclerView, 0);
        C66772zu c66772zu = (C66772zu) this.A0E.getValue();
        if (c66772zu != null) {
            c66772zu.A00 = recyclerView;
        }
    }

    @Override // X.C2US
    public final void onBindViewHolder(C3OQ c3oq, int i) {
        C14360o3.A0B(c3oq, 0);
        InterfaceC09390do interfaceC09390do = this.A0E;
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
        C66772zu c66772zu = (C66772zu) this.A0E.getValue();
        if (c66772zu != null) {
            c66772zu.A00 = null;
        }
    }

    @Override // X.C2US
    public final void onViewRecycled(C3OQ c3oq) {
        C14360o3.A0B(c3oq, 0);
        super.onViewRecycled(c3oq);
        if (this.A0E.getValue() != null) {
            C66772zu.A00(AbstractC31171DnF.A06(c3oq));
        }
    }

    @Override // X.InterfaceC65222xK
    public final List BRE() {
        return ((AbstractC65332xV) ((AbstractC65202xI) this).A00).A01;
    }

    @Override // X.InterfaceC65282xQ
    public final boolean CSO() {
        return this.A02;
    }

    @Override // X.InterfaceC65232xL
    public final void CtR(C38321qM c38321qM) {
        if (c38321qM != null && AbstractC31177DnL.A1b(c38321qM.A0C.BBi())) {
            notifyItemChanged(c38321qM);
        }
        A00(this);
    }

    @Override // X.InterfaceC65252xN
    public final void EVk(int i) {
        this.A0J.A03 = i;
        A00(this);
    }

    @Override // X.InterfaceC65242xM
    public final /* bridge */ /* synthetic */ Object getAdapter() {
        return this;
    }

    @Override // X.C2US
    public final AnonymousClass302 getLithoPrepareHelperCallback() {
        C66772zu c66772zu = (C66772zu) this.A0E.getValue();
        if (c66772zu != null) {
            return c66772zu.A01;
        }
        return null;
    }

    @Override // X.C2UT, android.widget.Adapter
    public final boolean isEmpty() {
        if (((AbstractC65332xV) ((AbstractC65202xI) this).A00).A02() != 0) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC65282xQ
    public final void AVK() {
        A00(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x00ad, code lost:
    
        if (r47 != false) goto L9;
     */
    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Type inference failed for: r3v3, types: [X.2y2, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v1, types: [X.2xz, X.2y2, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C37432GeC(androidx.fragment.app.Fragment r25, androidx.fragment.app.FragmentActivity r26, X.C62862tP r27, X.C65672y3 r28, X.C61142qc r29, X.InterfaceC61352qx r30, X.C155376yQ r31, X.C60972qL r32, X.AnonymousClass341 r33, X.C5GV r34, com.instagram.search.common.analytics.SearchContext r35, X.C38U r36, X.InterfaceC62602sz r37, X.C1M1 r38, java.lang.Integer r39, java.lang.String r40, java.lang.String r41, boolean r42, boolean r43, boolean r44, boolean r45, boolean r46, boolean r47, boolean r48, boolean r49) {
        /*
            Method dump skipped, instructions count: 366
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C37432GeC.<init>(androidx.fragment.app.Fragment, androidx.fragment.app.FragmentActivity, X.2tP, X.2y3, X.2qc, X.2qx, X.6yQ, X.2qL, X.341, X.5GV, com.instagram.search.common.analytics.SearchContext, X.38U, X.2sz, X.1M1, java.lang.Integer, java.lang.String, java.lang.String, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean):void");
    }
}
