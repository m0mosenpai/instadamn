package X;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;
import java.util.List;

/* renamed from: X.Dzi, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31876Dzi extends C2UU {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public C31876Dzi(int i, Object obj, Object obj2, Object obj3) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj;
        this.A03 = obj3;
    }

    @Override // X.C2UU
    public final int getItemCount() {
        int A03;
        int size;
        int i;
        if (this.A00 != 0) {
            A03 = C0f9.A03(247116821);
            size = ((List) this.A03).size();
            i = 1167249860;
        } else {
            A03 = C0f9.A03(780541276);
            size = ((List) this.A03).size();
            i = -1439972312;
        }
        C0f9.A0A(i, A03);
        return size;
    }

    @Override // X.C2UU
    public final void onBindViewHolder(C3OO c3oo, int i) {
        if (this.A00 != 0) {
            String A1I = AbstractC25226BEj.A1I((List) this.A03, i);
            if (c3oo instanceof C31925E1f) {
                ViewOnClickListenerC35581FnY viewOnClickListenerC35581FnY = new ViewOnClickListenerC35581FnY(this, A1I, i);
                C31925E1f c31925E1f = (C31925E1f) c3oo;
                C14360o3.A0B(c31925E1f, 0);
                c31925E1f.A00.setText(A1I);
                C0fQ.A00(viewOnClickListenerC35581FnY, c31925E1f.itemView);
                return;
            }
            return;
        }
        String A1I2 = AbstractC25226BEj.A1I((List) this.A03, i);
        ((TextView) c3oo.itemView).setText(A1I2);
        C0fQ.A00(new ViewOnClickListenerC35671Fp6(A1I2, this, 12), c3oo.itemView);
    }

    @Override // X.C2UU
    public final C3OO onCreateViewHolder(ViewGroup viewGroup, int i) {
        if (this.A00 != 0) {
            return new C31925E1f(AbstractC25227BEk.A0D(AbstractC31177DnL.A0E(viewGroup, 0), viewGroup, R.layout.username_suggestion_row_view, false));
        }
        Context context = (Context) this.A02;
        TextView textView = new TextView(context);
        textView.setTextSize(2, context.getResources().getDimension(R.dimen.add_payment_bottom_sheet_row_subtitle_size) / AbstractC167007dF.A0K(context).density);
        textView.setBackgroundResource(R.drawable.reg_username_suggestion_button);
        AbstractC31177DnL.A0y(textView, context);
        return new E42(textView, 1, this);
    }
}
