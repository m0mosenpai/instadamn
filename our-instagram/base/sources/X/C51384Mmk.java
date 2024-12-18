package X;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.common.staggeredgrid.HorizontalStaggeredLayoutManager;
import java.util.List;

/* renamed from: X.Mmk, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51384Mmk extends RecyclerView {
    public int A00;
    public boolean A01;
    public AnonymousClass195 A02;
    public final long A03;
    public final long A04;
    public final Context A05;
    public final List A06;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C51384Mmk(Context context, List list, int i, long j, long j2, boolean z) {
        super(context, null);
        C14360o3.A0B(list, 4);
        this.A05 = context;
        this.A00 = i;
        this.A01 = z;
        this.A06 = list;
        this.A04 = j;
        this.A03 = j2;
        setLayoutManager(new HorizontalStaggeredLayoutManager(context, new C51752Mtb(list, AbstractC167017dG.A0A(context), AbstractC167017dG.A06(context), 1), i));
    }

    public static final void A00(C51384Mmk c51384Mmk) {
        if (c51384Mmk.A01) {
            AnonymousClass195 anonymousClass195 = c51384Mmk.A02;
            C23671Dx c23671Dx = null;
            if (anonymousClass195 != null) {
                anonymousClass195.AGH(null);
            }
            C07X A00 = AbstractC55832hO.A00(c51384Mmk);
            if (A00 != null) {
                c23671Dx = AbstractC25226BEj.A1L(new PZE(c51384Mmk, null, 17), AbstractC25229BEm.A0a(A00));
            }
            c51384Mmk.A02 = c23671Dx;
        }
    }

    public final int getRowCount() {
        return this.A00;
    }

    public final void setIsScrollAnimationEnabled(boolean z) {
        boolean z2 = this.A01;
        this.A01 = z;
        if (!z2 && z) {
            A00(this);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        int A06 = C0f9.A06(1017596271);
        super.onAttachedToWindow();
        setOnTouchListener(new ViewOnTouchListenerC50553MTk(this, 19));
        A00(this);
        C0f9.A0D(85768917, A06);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        int A06 = C0f9.A06(1240686372);
        super.onDetachedFromWindow();
        AnonymousClass195 anonymousClass195 = this.A02;
        if (anonymousClass195 != null) {
            anonymousClass195.AGH(null);
        }
        this.A02 = null;
        setOnTouchListener(null);
        C0f9.A0D(-964732344, A06);
    }

    public final void setRowCount(int i) {
        this.A00 = i;
    }

    public final void setScrollAnimationEnabled(boolean z) {
        this.A01 = z;
    }
}
