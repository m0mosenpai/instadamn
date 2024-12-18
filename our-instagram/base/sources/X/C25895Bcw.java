package X;

import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Bcw, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25895Bcw extends C2UU {
    public int A00;
    public int A01;
    public final java.util.Set A02 = AbstractC166987dD.A1H();

    @Override // X.C2UU
    public final /* bridge */ /* synthetic */ C3OO onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C25945Bdn(AbstractC25226BEj.A0R(AbstractC25231BEo.A0O(viewGroup), viewGroup, R.layout.equalizer_bar_item, false));
    }

    public final void A00(List list, int i, int i2) {
        this.A01 = i;
        this.A00 = i2;
        java.util.Set set = this.A02;
        set.clear();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int A0B = AbstractC167007dF.A0B(it);
                int i3 = i2 / 15;
                int i4 = 1000;
                if (1000 < i3) {
                    i4 = i3;
                }
                set.add(Integer.valueOf(A0B / i4));
            }
        }
        notifyDataSetChanged();
    }

    @Override // X.C2UU
    public final /* bridge */ /* synthetic */ void onBindViewHolder(C3OO c3oo, int i) {
        C25945Bdn c25945Bdn = (C25945Bdn) c3oo;
        C14360o3.A0B(c25945Bdn, 0);
        boolean contains = this.A02.contains(Integer.valueOf(i));
        BYL byl = c25945Bdn.A00;
        float f = 0.3f;
        if (i % 2 == 0) {
            f = 0.54f;
        }
        if (byl.A00 != f) {
            byl.A00 = f;
            BYL.A00(byl);
        }
        if (byl.A02 != contains) {
            byl.A02 = contains;
            BYL.A00(byl);
        }
        if (c25945Bdn.itemView.isLaidOut()) {
            c25945Bdn.A00();
            return;
        }
        View view = c25945Bdn.itemView;
        C14360o3.A06(view);
        AbstractC13880nE.A0r(view, new D19(c25945Bdn));
    }

    @Override // X.C2UU
    public final int getItemCount() {
        int i;
        int A03 = C0f9.A03(-736866976);
        int i2 = this.A01;
        int i3 = this.A00;
        if (i2 > 0) {
            int i4 = i3 / 15;
            int i5 = 1000;
            if (1000 < i4) {
                i5 = i4;
            }
            i = (i2 / i5) + 1;
        } else {
            i = 0;
        }
        C0f9.A0A(1104334087, A03);
        return i;
    }
}
