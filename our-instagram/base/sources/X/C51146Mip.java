package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;
import java.util.List;

/* renamed from: X.Mip, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51146Mip extends C2UU {
    public InterfaceC57953Pmz A00;
    public C31335Dq0 A01;
    public List A02;

    @Override // X.C2UU
    public final /* bridge */ /* synthetic */ void onBindViewHolder(C3OO c3oo, int i) {
        C51226MkB c51226MkB = (C51226MkB) c3oo;
        if (getItemViewType(i) != 0) {
            this.A02.getClass();
            UQE uqe = (UQE) this.A02.get(i - (AbstractC167007dF.A1W(this.A01) ? 1 : 0));
            AbstractC167017dG.A1N(c51226MkB, uqe);
            c51226MkB.A01 = uqe;
            c51226MkB.A00.setText(uqe.A01);
            return;
        }
        final TextView textView = c51226MkB.A00;
        C31335Dq0 c31335Dq0 = this.A01;
        c31335Dq0.getClass();
        c31335Dq0.A04(textView);
        textView.post(new Runnable() { // from class: X.PMu
            @Override // java.lang.Runnable
            public final void run() {
                final View view = textView;
                AbstractC56932jR.A02(view);
                view.post(new Runnable() { // from class: X.PMv
                    @Override // java.lang.Runnable
                    public final void run() {
                        view.sendAccessibilityEvent(8);
                    }
                });
            }
        });
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [X.3OO, X.MkB] */
    /* JADX WARN: Type inference failed for: r3v1, types: [X.3OO, X.MkB, java.lang.Object] */
    @Override // X.C2UU
    public final /* bridge */ /* synthetic */ C3OO onCreateViewHolder(ViewGroup viewGroup, int i) {
        if (i != 0) {
            InterfaceC57953Pmz interfaceC57953Pmz = this.A00;
            interfaceC57953Pmz.getClass();
            View inflate = AbstractC31177DnL.A0E(viewGroup, 0).inflate(R.layout.igtv_series_selection_sheet_row, viewGroup, false);
            AbstractC56952jT.A01(inflate);
            int i2 = C3OO.FLAG_ADAPTER_FULLUPDATE;
            C14360o3.A0A(inflate);
            C14360o3.A0B(inflate, 1);
            ?? c3oo = new C3OO(inflate);
            c3oo.A00 = AbstractC166997dE.A0T(inflate, R.id.selection_sheet_row_text_view);
            ViewOnClickListenerC55465OkK.A01(inflate, 36, interfaceC57953Pmz, c3oo);
            Context A05 = AbstractC31172DnG.A05(c3oo);
            if (A05 != null) {
                c3oo.A00.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, C3LQ.A05(A05, R.drawable.chevron_right, AbstractC53242c7.A0F(A05, R.attr.glyphColorSecondary)), (Drawable) null);
            }
            return c3oo;
        }
        View inflate2 = AbstractC31177DnL.A0E(viewGroup, 0).inflate(R.layout.selection_sheet_header, viewGroup, false);
        AbstractC56952jT.A04(inflate2, C05F.A00);
        int i3 = C3OO.FLAG_ADAPTER_FULLUPDATE;
        C14360o3.A0A(inflate2);
        C14360o3.A0B(inflate2, 1);
        ?? c3oo2 = new C3OO(inflate2);
        c3oo2.A00 = AbstractC166997dE.A0T(inflate2, R.id.selection_sheet_header_text_view);
        return c3oo2;
    }

    @Override // X.C2UU
    public final int getItemCount() {
        int A03 = C0f9.A03(-1753950823);
        boolean A1W = AbstractC167007dF.A1W(this.A01);
        List list = this.A02;
        if (list == null) {
            C0f9.A0A(-1808033900, A03);
            return A1W ? 1 : 0;
        }
        int size = list.size() + (A1W ? 1 : 0);
        C0f9.A0A(1262984808, A03);
        return size;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000f, code lost:
    
        if (r4.A01 == null) goto L6;
     */
    @Override // X.C2UU, android.widget.Adapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int getItemViewType(int r5) {
        /*
            r4 = this;
            r0 = 1346429853(0x5040e39d, float:1.2944569E10)
            int r3 = X.C0f9.A03(r0)
            if (r5 != 0) goto L11
            X.Dq0 r2 = r4.A01
            r1 = 0
            r0 = -1216320737(0xffffffffb7806b1f, float:-1.5308671E-5)
            if (r2 != 0) goto L15
        L11:
            r1 = 1
            r0 = 854333702(0x32ec1906, float:2.7485395E-8)
        L15:
            X.C0f9.A0A(r0, r3)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C51146Mip.getItemViewType(int):int");
    }
}
