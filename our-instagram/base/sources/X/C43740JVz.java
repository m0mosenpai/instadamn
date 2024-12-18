package X;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.direct.ui.countertextview.CounterTextView;

/* renamed from: X.JVz, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43740JVz extends C3OO {
    public AnonymousClass441 A00;
    public C163107Rv A01;
    public final LayoutInflater A02;
    public final View A03;
    public final LinearLayout A04;
    public final LinearLayout A05;
    public final LinearLayout A06;
    public final TextView A07;
    public final InterfaceC11380iw A08;
    public final C7RB A09;
    public final C7S4 A0A;
    public final C7ZX A0B;
    public final CounterTextView A0C;
    public final boolean A0D;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, X.7S4] */
    public C43740JVz(LayoutInflater layoutInflater, View view, InterfaceC11380iw interfaceC11380iw, C7RB c7rb, C7ZX c7zx, boolean z) {
        super(view);
        AbstractC167007dF.A1F(view, 1, interfaceC11380iw);
        C14360o3.A0B(c7rb, 6);
        this.A03 = view;
        this.A02 = layoutInflater;
        this.A0D = z;
        this.A08 = interfaceC11380iw;
        this.A0B = c7zx;
        this.A09 = c7rb;
        this.A04 = (LinearLayout) AbstractC166997dE.A0R(view, R.id.message_single_reaction_pill_container);
        this.A05 = (LinearLayout) AbstractC166997dE.A0R(view, R.id.reaction);
        this.A06 = (LinearLayout) AbstractC166997dE.A0R(view, R.id.reactors);
        this.A07 = AbstractC166987dD.A0e(view, R.id.reactors_number);
        this.A0C = (CounterTextView) view.findViewById(R.id.reactors_number_counter);
        this.A0A = new Object();
    }
}
