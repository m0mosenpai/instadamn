package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;
import java.util.List;

/* renamed from: X.Dzv, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31889Dzv extends C2UU {
    public InterfaceC37126GXn A00;
    public final List A01 = AbstractC166987dD.A1E();

    /* JADX WARN: Type inference failed for: r1v1, types: [X.3OO, X.E0h] */
    @Override // X.C2UU
    public final /* bridge */ /* synthetic */ C3OO onCreateViewHolder(ViewGroup viewGroup, int i) {
        View inflate = AbstractC31177DnL.A0E(viewGroup, 0).inflate(R.layout.action_sheet_row, viewGroup, false);
        int i2 = C3OO.FLAG_ADAPTER_FULLUPDATE;
        C14360o3.A0B(inflate, 1);
        ?? c3oo = new C3OO(inflate);
        c3oo.A00 = AbstractC167007dF.A0N(inflate, R.id.action_sheet_row_text_view);
        return c3oo;
    }

    @Override // X.C2UU
    public final /* bridge */ /* synthetic */ void onBindViewHolder(C3OO c3oo, int i) {
        int i2;
        C31901E0h c31901E0h = (C31901E0h) c3oo;
        C14360o3.A0B(c31901E0h, 0);
        Context A05 = AbstractC31172DnG.A05(c31901E0h);
        getItemViewType(i);
        List list = this.A01;
        C50676MYu c50676MYu = (C50676MYu) list.get(i);
        int i3 = c50676MYu.A02;
        TextView textView = c31901E0h.A00;
        if (i3 != 0) {
            textView.setText(i3);
        } else {
            textView.setText(c50676MYu.A04);
        }
        AbstractC166987dD.A1O(A05, textView, ((C50676MYu) list.get(i)).A08);
        if (i == getItemCount() - 1) {
            i2 = AbstractC167017dG.A0F(A05);
        } else {
            i2 = 0;
        }
        AbstractC13880nE.A0U(textView, i2);
        textView.setMaxLines(c50676MYu.A01);
        textView.setAlpha(c50676MYu.A07);
        if (this.A00 != null) {
            AbstractC56952jT.A01(textView);
            ViewOnClickListenerC35668Fp3.A00(textView, this, i, 4);
        }
    }

    @Override // X.C2UU
    public final int getItemCount() {
        int A03 = C0f9.A03(-1182979538);
        int size = this.A01.size();
        C0f9.A0A(-1397289239, A03);
        return size;
    }

    @Override // X.C2UU, android.widget.Adapter
    public final int getItemViewType(int i) {
        C0f9.A0A(-2128965550, C0f9.A03(-490792699));
        return 0;
    }
}
