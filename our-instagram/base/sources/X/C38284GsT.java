package X;

import android.content.Context;
import android.view.View;
import android.widget.ListAdapter;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.common.session.UserSession;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

/* renamed from: X.GsT, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38284GsT extends HY4 implements ListAdapter, InterfaceC58046PoX, InterfaceC161877Mx, InterfaceC65302xS {
    public View A00;
    public Hd8 A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public final UserSession A05;
    public final C65672y3 A06;
    public final C66772zu A07;
    public final InterfaceC60442pS A08;
    public final List A09;
    public final Map A0A;
    public final Map A0B;
    public final java.util.Set A0C;
    public final java.util.Set A0D;
    public final Context A0E;
    public final C65662y2 A0F;
    public final C65622xy A0G;
    public final C66682zl A0H;
    public final AnonymousClass341 A0I;
    public final C66612zd A0J;
    public final C32469ERv A0K;
    public final C66002yc A0L;
    public final C152996uT A0M;
    public final InterfaceC62602sz A0N;
    public final C65842yM A0O;
    public final C3YR A0P;
    public final HashSet A0Q;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, X.2zd] */
    /* JADX WARN: Type inference failed for: r7v0, types: [X.2y2, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C38284GsT(androidx.fragment.app.Fragment r28, androidx.fragment.app.FragmentActivity r29, X.C62862tP r30, X.C65672y3 r31, X.C61142qc r32, X.C60972qL r33, X.InterfaceC64612wK r34, X.AnonymousClass341 r35, X.InterfaceC63342uH r36, X.InterfaceC64632wM r37, X.InterfaceC62602sz r38, X.C1M1 r39, X.C3YR r40) {
        /*
            Method dump skipped, instructions count: 280
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C38284GsT.<init>(androidx.fragment.app.Fragment, androidx.fragment.app.FragmentActivity, X.2tP, X.2y3, X.2qc, X.2qL, X.2wK, X.341, X.2uH, X.2wM, X.2sz, X.1M1, X.3YR):void");
    }

    @Override // X.InterfaceC58046PoX
    public final void AI2() {
        this.A00 = null;
    }

    @Override // X.InterfaceC61772re, X.InterfaceC61782rf
    public final C75113Zb BRZ(C38321qM c38321qM) {
        boolean z;
        C14360o3.A0B(c38321qM, 0);
        Map map = this.A0B;
        C75113Zb c75113Zb = (C75113Zb) map.get(c38321qM.getId());
        if (c75113Zb == null) {
            c75113Zb = new C75113Zb(c38321qM.A0p(), c38321qM.A4w());
            AnonymousClass341 anonymousClass341 = this.A0I;
            if (anonymousClass341 != null) {
                c75113Zb.A0o = anonymousClass341;
            }
            if (this.A03 && (c38321qM.A5i() || !c38321qM.A4S())) {
                z = true;
            } else {
                z = false;
            }
            c75113Zb.A37 = z;
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
        this.A04 = false;
    }

    @Override // X.InterfaceC65272xP
    public final void ETA(InterfaceC686036x interfaceC686036x) {
        C14360o3.A0B(interfaceC686036x, 0);
        C65672y3 c65672y3 = this.A06;
        if (c65672y3 != null) {
            c65672y3.A08(interfaceC686036x);
        }
        C65622xy c65622xy = this.A0G;
        if (c65622xy != null) {
            c65622xy.A02(interfaceC686036x);
        }
    }

    @Override // X.InterfaceC65272xP
    public final void EUR(C33P c33p) {
        C14360o3.A0B(c33p, 0);
        C65672y3 c65672y3 = this.A06;
        if (c65672y3 != null) {
            c65672y3.A03 = c33p;
        }
        C65622xy c65622xy = this.A0G;
        if (c65622xy != null) {
            c65622xy.A01 = c33p;
        }
    }

    @Override // X.C2UU
    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        C14360o3.A0B(recyclerView, 0);
        C66772zu c66772zu = this.A07;
        if (c66772zu != null) {
            c66772zu.A00 = recyclerView;
        }
    }

    @Override // X.C2US
    public final void onBindViewHolder(C3OQ c3oq, int i) {
        C14360o3.A0B(c3oq, 0);
        C66772zu c66772zu = this.A07;
        if (c66772zu != null) {
            C14360o3.A06(c3oq.itemView);
            java.util.Set set = C66772zu.A05;
        }
        super.onBindViewHolder(c3oq, i);
        if (c66772zu != null) {
            c66772zu.A01(AbstractC31171DnF.A06(c3oq));
        }
    }

    @Override // X.C2UU
    public final void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        C14360o3.A0B(recyclerView, 0);
        C66772zu c66772zu = this.A07;
        if (c66772zu != null) {
            c66772zu.A00 = null;
        }
    }

    @Override // X.C2US
    public final void onViewRecycled(C3OQ c3oq) {
        C14360o3.A0B(c3oq, 0);
        super.onViewRecycled(c3oq);
        if (this.A07 != null) {
            C66772zu.A00(AbstractC31171DnF.A06(c3oq));
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:21:0x0089. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c2 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A00(X.C38284GsT r19) {
        /*
            Method dump skipped, instructions count: 396
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C38284GsT.A00(X.GsT):void");
    }

    @Override // X.InterfaceC65302xS
    public final View C13() {
        return this.A00;
    }

    @Override // X.InterfaceC65282xQ
    public final boolean CSO() {
        return this.A04;
    }

    @Override // X.InterfaceC65252xN
    public final void EVk(int i) {
        this.A0F.A03 = i;
        A00(this);
    }

    @Override // X.InterfaceC65242xM
    public final /* bridge */ /* synthetic */ Object getAdapter() {
        return this;
    }

    @Override // X.C2US
    public final AnonymousClass302 getLithoPrepareHelperCallback() {
        C66772zu c66772zu = this.A07;
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

    @Override // X.InterfaceC65222xK
    public final List BRE() {
        return C3XH.A03(A03());
    }

    @Override // X.InterfaceC65232xL
    public final void CtR(C38321qM c38321qM) {
        A00(this);
    }

    @Override // X.InterfaceC58046PoX
    public final void Eet(View view) {
        this.A00 = view;
    }
}
