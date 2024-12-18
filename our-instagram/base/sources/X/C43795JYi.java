package X;

import android.view.View;
import android.widget.TextView;
import com.facebook.R;

/* renamed from: X.JYi, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43795JYi extends C3OO {
    public final TextView A00;
    public final TextView A01;
    public final View A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C43795JYi(View view) {
        super(view);
        C14360o3.A0B(view, 1);
        this.A02 = view;
        this.A00 = AbstractC167007dF.A0N(view, R.id.inbox_header_pill_text);
        this.A01 = AbstractC167007dF.A0N(view, R.id.inbox_header_pill_unread_count);
    }

    public final void A00(C43792JYf c43792JYf, InterfaceC16820sZ interfaceC16820sZ, boolean z) {
        C14360o3.A0B(c43792JYf, 0);
        this.A00.setText(((AbstractC43793JYg) c43792JYf).A01);
        this.itemView.setSelected(z);
        this.itemView.setEnabled(c43792JYf.A02);
        ViewOnClickListenerC48072LPx.A01(this.itemView, 58, interfaceC16820sZ);
        CharSequence charSequence = c43792JYf.A01;
        if (charSequence != null) {
            TextView textView = this.A01;
            textView.setText(charSequence);
            textView.setVisibility(0);
            return;
        }
        this.A01.setVisibility(8);
    }
}
