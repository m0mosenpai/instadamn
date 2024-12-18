package X;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import java.util.List;

/* renamed from: X.Cwu, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C29361Cwu implements BE3 {
    public int A00;
    public int A01;
    public int A02;
    public boolean A03;
    public boolean A04;
    public C25905Bd8 A05;
    public List A06;
    public boolean A07;
    public final int A08;
    public final int A09;
    public final Context A0A;
    public final View.OnTouchListener A0B;
    public final View A0C;
    public final LinearLayoutManager A0D;
    public final RecyclerView A0E;
    public final InterfaceC189998bI A0F;
    public final int A0G;
    public final int A0H;
    public final C1I4 A0I;
    public final C2n2 A0J;
    public final C25895Bcw A0K;
    public final BYG A0L;
    public final BYJ A0M;

    public C29361Cwu(View view, C190018bK c190018bK, boolean z) {
        C14360o3.A0B(c190018bK, 2);
        this.A0I = new C25908BdB(this, 1);
        this.A0B = new ViewOnTouchListenerC28679ClR(this, 1);
        this.A0J = C29077Cs4.A00;
        this.A06 = AbstractC166987dD.A1E();
        Context context = view.getContext();
        this.A0A = context;
        Resources resources = context.getResources();
        View A0S = AbstractC166997dE.A0S(view, R.id.scrubber);
        if (z) {
            ViewGroup.LayoutParams layoutParams = A0S.getLayoutParams();
            C14360o3.A0C(layoutParams, AbstractC111324zv.A00(0));
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.bottomMargin = resources.getDimensionPixelSize(R.dimen.action_bar_immersive_gradient_height);
            A0S.setLayoutParams(marginLayoutParams);
        }
        this.A08 = resources.getDimensionPixelSize(R.dimen.messaging_ads_multi_suggestions_thumbnail_height);
        this.A0H = resources.getDimensionPixelSize(R.dimen.abc_action_bar_elevation_material);
        this.A0G = resources.getDimensionPixelSize(R.dimen.abc_action_bar_elevation_material);
        this.A09 = AbstractC13880nE.A0A(context);
        c190018bK.A02.add(this);
        this.A0F = new C24027AlK(c190018bK);
        View requireViewById = A0S.requireViewById(R.id.scrubber_focus_box_background_view);
        this.A0C = requireViewById;
        BYG byg = new BYG(context);
        this.A0L = byg;
        requireViewById.setBackground(byg);
        AbstractC166997dE.A18(context, requireViewById, 2131967977);
        View A0S2 = AbstractC166997dE.A0S(A0S, R.id.scrbber_focus_box_ring_view);
        BYJ byj = new BYJ(context);
        this.A0M = byj;
        A0S2.setBackground(byj);
        RecyclerView recyclerView = (RecyclerView) A0S.requireViewById(R.id.scrubber_recycler_view);
        this.A0E = recyclerView;
        recyclerView.setNestedScrollingEnabled(false);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context, 0, false);
        this.A0D = linearLayoutManager;
        recyclerView.setLayoutManager(linearLayoutManager);
        C25895Bcw c25895Bcw = new C25895Bcw();
        this.A0K = c25895Bcw;
        recyclerView.setAdapter(c25895Bcw);
    }

    private final void A00() {
        LinearLayoutManager linearLayoutManager = this.A0D;
        int i = this.A01;
        int i2 = this.A00 / 15;
        int i3 = 1000;
        if (1000 < i2) {
            i3 = i2;
        }
        int i4 = i / i3;
        int i5 = this.A09;
        int i6 = this.A08;
        int i7 = 1000;
        if (1000 < i2) {
            i7 = i2;
        }
        int A00 = AbstractC25233BEq.A00(i5, i6);
        float f = (i % i7) / i7;
        int i8 = 1000;
        if (1000 < i2) {
            i8 = i2;
        }
        linearLayoutManager.A1p(i4, A00 - ((int) (f * ((int) ((i8 / r8) * i6)))));
    }

    private final void A01() {
        C25905Bd8 c25905Bd8 = this.A05;
        if (c25905Bd8 != null) {
            this.A0E.A11(c25905Bd8);
        }
        RecyclerView recyclerView = this.A0E;
        Context A0L = AbstractC166997dE.A0L(recyclerView);
        int i = this.A09;
        int i2 = this.A08;
        int A00 = AbstractC25233BEq.A00(i, i2);
        int i3 = this.A00;
        int i4 = this.A0G;
        int i5 = i3 / 15;
        int i6 = 1000;
        if (1000 < i5) {
            i6 = i5;
        }
        float f = i2;
        int i7 = ((int) ((i6 / i3) * f)) - i4;
        int i8 = this.A02;
        int i9 = 1000;
        if (1000 < i5) {
            i9 = i5;
        }
        double d = (i8 % i9) / i9;
        int i10 = 1000;
        if (1000 < i5) {
            i10 = i5;
        }
        C25905Bd8 c25905Bd82 = new C25905Bd8(A0L, A00, i7, ((int) (d * ((int) ((i10 / r10) * f)))) - i4);
        recyclerView.A10(c25905Bd82);
        this.A05 = c25905Bd82;
        this.A0K.notifyDataSetChanged();
    }

    private final void A02(int i) {
        float A00 = AbstractC13600mm.A00((i - this.A01) / this.A00, 0.0f, 1.0f);
        BYG byg = this.A0L;
        byg.A00.mutate().setLevel((int) (A00 * 10000.0f));
        byg.invalidateSelf();
    }

    public static final void A03(C29361Cwu c29361Cwu, boolean z) {
        C2n2 c2n2 = c29361Cwu.A0J;
        LinearLayoutManager linearLayoutManager = c29361Cwu.A0D;
        int A1a = linearLayoutManager.A1a();
        int A1b = linearLayoutManager.A1b();
        if (A1a <= A1b) {
            while (true) {
                C3OO A0V = c29361Cwu.A0E.A0V(A1a);
                if (A0V != null) {
                    c2n2.apply(A0V);
                }
                if (A1a == A1b) {
                    break;
                } else {
                    A1a++;
                }
            }
        }
        BYJ byj = c29361Cwu.A0M;
        byj.A00 = z;
        BYJ.A00(byj);
        if (z && !c29361Cwu.A07) {
            C2UY.A01.A03();
        }
        c29361Cwu.A07 = z;
    }

    public final boolean A04() {
        LinearLayoutManager linearLayoutManager = this.A0D;
        int A1a = linearLayoutManager.A1a();
        int A1b = linearLayoutManager.A1b();
        if (A1a > A1b) {
            return false;
        }
        while (true) {
            C3OO A0V = this.A0E.A0V(A1a);
            if (A0V != null && this.A0K.A02.contains(Integer.valueOf(A1a))) {
                int i = this.A09;
                int i2 = this.A08;
                int i3 = this.A0H;
                View view = A0V.itemView;
                C14360o3.A06(view);
                int A00 = AbstractC25233BEq.A00(i, i2);
                if (view.getLeft() < i3 + A00 && view.getRight() > A00) {
                    return true;
                }
            }
            if (A1a != A1b) {
                A1a++;
            } else {
                return false;
            }
        }
    }

    @Override // X.BE3
    public final void CO5(List list, int i, int i2, int i3) {
        this.A02 = i;
        this.A00 = i2;
        this.A01 = i3;
        this.A06 = list;
        RecyclerView recyclerView = this.A0E;
        AbstractC13880nE.A0r(recyclerView, new D1A(this));
        AbstractC13880nE.A0n(recyclerView, recyclerView);
        recyclerView.A14(this.A0I);
        recyclerView.setOnTouchListener(this.A0B);
        this.A0K.A00(this.A06, this.A02, this.A00);
        A01();
        A00();
        A02(this.A01);
    }

    @Override // X.BE3
    public final void DnB(int i) {
        this.A00 = i;
        this.A0K.A00(this.A06, this.A02, i);
        A01();
    }

    @Override // X.BE3
    public final void DnC(int i) {
        this.A01 = i;
        A00();
    }

    @Override // X.BE3
    public final void DUm(int i) {
        A02(i);
    }
}
