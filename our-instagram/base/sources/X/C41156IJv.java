package X;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.igds.components.button.IgdsRadioButton;

/* renamed from: X.IJv, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C41156IJv {
    public final View A00;
    public final View A01;
    public final View A02;
    public final ImageView A03;
    public final TextView A04;
    public final TextView A05;
    public final IgdsRadioButton A06;

    public C41156IJv(View view) {
        C14360o3.A0B(view, 1);
        this.A04 = AbstractC166987dD.A0e(view, R.id.text);
        this.A05 = AbstractC166987dD.A0e(view, R.id.serial);
        this.A01 = view.findViewById(R.id.serial_layout);
        this.A06 = (IgdsRadioButton) view.findViewById(R.id.button);
        this.A03 = (ImageView) view.findViewById(R.id.selected);
        this.A00 = view.findViewById(R.id.answer_container);
        this.A02 = view.findViewById(R.id.serial_layout_extra_margin);
    }
}
