package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.7Dp, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C159547Dp implements InterfaceC159557Dq {
    public C7IK A00;
    public L9B A01;
    public C7CC A02;
    public Integer A03;
    public final View A04;
    public final View A05;
    public final RecyclerView A06;
    public final InterfaceC11380iw A07;

    public C159547Dp(View view, View view2, RecyclerView recyclerView, InterfaceC11380iw interfaceC11380iw) {
        C14360o3.A0B(view, 1);
        C14360o3.A0B(view2, 2);
        C14360o3.A0B(recyclerView, 3);
        C14360o3.A0B(interfaceC11380iw, 4);
        this.A05 = view;
        this.A04 = view2;
        this.A06 = recyclerView;
        this.A07 = interfaceC11380iw;
    }

    public final boolean A01() {
        L9B l9b = this.A01;
        if (l9b != null && l9b.A03.getVisibility() == 0) {
            l9b.A03.setVisibility(8);
            l9b.A01(C16930sl.A00);
            return true;
        }
        return false;
    }

    public final void A00(int i) {
        this.A03 = Integer.valueOf(i);
        L9B l9b = this.A01;
        if (l9b != null) {
            l9b.A00(i);
        }
    }

    @Override // X.InterfaceC159557Dq
    public final boolean onBackPressed() {
        return A01();
    }
}
