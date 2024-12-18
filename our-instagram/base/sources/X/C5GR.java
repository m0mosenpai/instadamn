package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.RectF;
import android.util.DisplayMetrics;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.5GR, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5GR extends C1I2 implements InterfaceC12870lZ {
    public final int A00 = 399507460;
    public final DisplayMetrics A01;
    public final C006802i A02;

    public C5GR(Context context) {
        DisplayMetrics displayMetrics;
        C006802i c006802i = C006802i.A0p;
        C14360o3.A07(c006802i);
        this.A02 = c006802i;
        Resources resources = context.getResources();
        if (resources != null) {
            displayMetrics = resources.getDisplayMetrics();
        } else {
            displayMetrics = null;
        }
        this.A01 = displayMetrics;
    }

    @Override // X.InterfaceC12870lZ
    public final void onAppBackgrounded() {
        int A03 = C0f9.A03(548996925);
        this.A02.markerEnd(this.A00, (short) 630);
        C218914p.A06(this);
        C0f9.A0A(-123672528, A03);
    }

    @Override // X.InterfaceC12870lZ
    public final void onAppForegrounded() {
        C0f9.A0A(-160456696, C0f9.A03(162525419));
    }

    @Override // X.C1I2
    public final void onScroll(C3FQ c3fq, int i, int i2, int i3, int i4, int i5) {
        int A03 = C0f9.A03(-1940822656);
        C14360o3.A0B(c3fq, 0);
        if (c3fq.CFj() instanceof RecyclerView) {
            ViewGroup CFj = c3fq.CFj();
            C14360o3.A0C(CFj, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
            RecyclerView recyclerView = (RecyclerView) CFj;
            recyclerView.computeVerticalScrollRange();
            recyclerView.computeVerticalScrollOffset();
            recyclerView.computeVerticalScrollExtent();
            if (this.A01 != null) {
                RectF rectF = AbstractC13880nE.A01;
            }
            AbstractC70663Fe abstractC70663Fe = recyclerView.A0D;
            C2UU c2uu = recyclerView.A0A;
            if (c2uu != null && abstractC70663Fe != null) {
                c2uu.getItemCount();
                AbstractC72193Ls.A02(abstractC70663Fe);
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("Could not get ");
                sb.append(this);
                sb.append(".analyticsModuleName RecyclerView item count because of NPE");
                C0w9.A03("TailFetchPerfLogger", sb.toString());
            }
        }
        C0f9.A0A(820607194, A03);
    }

    @Override // X.C1I2
    public final void onScrollStateChanged(C3FQ c3fq, int i) {
        C0f9.A0A(-390228073, C0f9.A03(390555118));
    }
}
