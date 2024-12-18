package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.ui.base.IgTextView;

/* renamed from: X.Mia, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51131Mia extends C2UU {
    public final C54427O3h A00;
    public final OAW[] A01;
    public final boolean A02;

    public C51131Mia(C54427O3h c54427O3h, OAW[] oawArr, boolean z) {
        C14360o3.A0B(oawArr, 1);
        this.A01 = oawArr;
        this.A02 = z;
        this.A00 = c54427O3h;
    }

    @Override // X.C2UU
    public final void onBindViewHolder(C3OO c3oo, int i) {
        C14360o3.A0B(c3oo, 0);
        C51305MlS c51305MlS = (C51305MlS) c3oo;
        OAW oaw = this.A01[i];
        AbstractC167007dF.A1K(c51305MlS, oaw);
        c51305MlS.A01.setImageResource(oaw.A00);
        IgTextView igTextView = c51305MlS.A02;
        int i2 = oaw.A01;
        igTextView.setText(i2);
        View view = c51305MlS.A00;
        AbstractC166997dE.A18(view.getContext(), view, i2);
        AbstractC56952jT.A01(view);
        ViewOnClickListenerC55458OkC.A01(view, this, i, 10);
    }

    @Override // X.C2UU
    public final C3OO onCreateViewHolder(ViewGroup viewGroup, int i) {
        Context A06 = AbstractC31173DnH.A06(viewGroup, 0);
        boolean z = this.A02;
        LayoutInflater from = LayoutInflater.from(A06);
        int i2 = R.layout.music_search_control_bar_item;
        if (z) {
            i2 = R.layout.music_search_control_bar_overflow_scroll_item;
        }
        return new C51305MlS(AbstractC25227BEk.A0D(from, viewGroup, i2, false));
    }

    @Override // X.C2UU
    public final int getItemCount() {
        int A03 = C0f9.A03(-825022729);
        int length = this.A01.length;
        C0f9.A0A(1988259123, A03);
        return length;
    }
}
