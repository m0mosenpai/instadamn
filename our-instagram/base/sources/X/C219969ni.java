package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.facebook.R;
import com.facebook.common.messagingui.observableverticaloffsetlayout.ObservableVerticalOffsetFrameLayout;

/* renamed from: X.9ni, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C219969ni extends C7RX {
    public final C7R8 A00;

    public C219969ni(C7R8 c7r8) {
        super(null, null, null, null, null, null, null, null, null, null, null, c7r8, null, null, null, null, null, null, null, null, null, null, false);
        this.A00 = c7r8;
    }

    @Override // X.C7RX
    public final C7SP A00(LayoutInflater layoutInflater, ViewGroup viewGroup, C7QD c7qd) {
        C14360o3.A0B(viewGroup, 0);
        AbstractC167017dG.A1P(layoutInflater, c7qd);
        View inflate = layoutInflater.inflate(R.layout.common_decorated_metadata_message_root_frame_layout, viewGroup, false);
        C14360o3.A0C(inflate, AbstractC111324zv.A00(4972));
        ObservableVerticalOffsetFrameLayout observableVerticalOffsetFrameLayout = (ObservableVerticalOffsetFrameLayout) inflate;
        LinearLayout linearLayout = (LinearLayout) AbstractC166997dE.A0R(observableVerticalOffsetFrameLayout, R.id.message_container);
        linearLayout.addView(c7qd.BKF());
        C7R8 c7r8 = this.A00;
        return A01(linearLayout, new C163027Rn(linearLayout, observableVerticalOffsetFrameLayout), new C162957Rg(observableVerticalOffsetFrameLayout, c7r8.A00, c7r8.A02), null, c7qd);
    }
}
