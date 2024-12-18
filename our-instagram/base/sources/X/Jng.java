package X;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;
import java.util.List;

/* loaded from: classes8.dex */
public final class Jng extends C2UU {
    public C47295Kv6 A00;
    public List A01 = AbstractC166987dD.A1E();
    public final Context A02;

    @Override // X.C2UU
    public final void onBindViewHolder(C3OO c3oo, int i) {
        int i2;
        C14360o3.A0B(c3oo, 0);
        if (c3oo instanceof C44610JpG) {
            C44610JpG c44610JpG = (C44610JpG) c3oo;
            C51758Mth c51758Mth = (C51758Mth) this.A01.get(i);
            C47295Kv6 c47295Kv6 = this.A00;
            C14360o3.A0B(c51758Mth, 0);
            TextView A0e = AbstractC166987dD.A0e(c44610JpG.itemView, R.id.category_title);
            switch (AbstractC166987dD.A0H(c51758Mth.A00)) {
                case 0:
                    i2 = 2131963251;
                    break;
                case 1:
                    i2 = 2131963249;
                    break;
                case 2:
                    i2 = 2131963250;
                    break;
                case 3:
                    i2 = 2131963252;
                    break;
                case 4:
                    i2 = 2131963248;
                    break;
                case 5:
                    i2 = 2131963246;
                    break;
                case 6:
                    i2 = 2131963247;
                    break;
                default:
                    throw B4Z.A00();
            }
            Context context = c44610JpG.A00;
            A0e.setText(AbstractC166997dE.A0q(context.getResources(), i2));
            View view = c44610JpG.itemView;
            Resources A0M = AbstractC166997dE.A0M(context);
            boolean z = c51758Mth.A01;
            int i3 = R.color.grey_1_15_transparent;
            if (z) {
                i3 = R.color.grey_0_40_transparent;
            }
            view.setBackgroundColor(A0M.getColor(i3, null));
            ViewOnClickListenerC48066LPr.A00(c44610JpG.itemView, 38, c51758Mth, c47295Kv6);
        }
    }

    public Jng(Context context) {
        this.A02 = context;
    }

    @Override // X.C2UU
    public final int getItemCount() {
        int A03 = C0f9.A03(1342224698);
        int size = this.A01.size();
        C0f9.A0A(1559447011, A03);
        return size;
    }

    @Override // X.C2UU
    public final C3OO onCreateViewHolder(ViewGroup viewGroup, int i) {
        boolean A1Y = AbstractC43592JPx.A1Y(viewGroup);
        Context context = this.A02;
        return new C44610JpG(context, AbstractC25226BEj.A0R(LayoutInflater.from(context), viewGroup, R.layout.giphy_clips_category_item, A1Y));
    }
}
