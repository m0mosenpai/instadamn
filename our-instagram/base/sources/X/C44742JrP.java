package X;

import android.view.View;
import com.facebook.R;

/* renamed from: X.JrP, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44742JrP extends C3OO {
    public C7S9 A00;
    public C44782Js3 A01;
    public final View A02;
    public final C57012jc A03;
    public final InterfaceC56392iX A04;
    public final KS7 A05;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v2, types: [X.75a, X.KS7] */
    public C44742JrP(View view) {
        super(view);
        C14360o3.A0B(view, 1);
        this.A05 = new C1574475a(AbstractC166997dE.A0S(view, R.id.message_action_log));
        this.A04 = AbstractC166997dE.A0X(view, R.id.poll_stub);
        this.A02 = AbstractC166997dE.A0S(view, R.id.error_icon);
        this.A03 = AbstractC31177DnL.A0U(view, R.id.message_footer_label);
    }
}
