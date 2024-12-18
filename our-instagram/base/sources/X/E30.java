package X;

import android.view.View;
import android.widget.TextView;
import com.facebook.R;

/* loaded from: classes6.dex */
public final class E30 extends C3OO {
    public final View A00;
    public final TextView A01;
    public final InterfaceC56392iX A02;
    public final C8SB A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E30(View view, C8SB c8sb) {
        super(view);
        C14360o3.A0B(view, 1);
        this.A00 = view;
        this.A03 = c8sb;
        this.A01 = AbstractC167007dF.A0N(view, R.id.pill_text);
        this.A02 = AbstractC166997dE.A0X(view, R.id.pill_icon_stub);
        if (c8sb != null) {
            view.setOnLongClickListener(new ViewOnLongClickListenerC35705Fpf(1, this, c8sb));
        }
    }
}
