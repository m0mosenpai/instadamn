package X;

import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.ui.widget.imageview.CircularImageView;

/* renamed from: X.6tC, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C152266tC extends C3OO {
    public ViewGroup A00;
    public final View A01;
    public final InterfaceC156156zj A02;

    public C152266tC(View view, InterfaceC156156zj interfaceC156156zj) {
        super(view);
        this.A02 = interfaceC156156zj;
        ViewStub viewStub = (ViewStub) view.requireViewById(R.id.create_highlight_button_view_stub);
        C14360o3.A0B(viewStub, 0);
        View inflate = viewStub.inflate();
        C14360o3.A0A(inflate);
        inflate.setTag(new C152276tD(inflate));
        this.A01 = inflate;
        inflate.setContentDescription(view.getResources().getString(2131956956));
        AbstractC56952jT.A04(inflate, C05F.A01);
        Object tag = this.A01.getTag();
        tag.getClass();
        C152276tD c152276tD = (C152276tD) tag;
        C152286tE c152286tE = new C152286tE(this);
        C14360o3.A0B(c152276tD, 0);
        ImageView imageView = c152276tD.A01;
        imageView.setImageResource(R.drawable.highlights_tray_plus);
        imageView.setVisibility(0);
        CircularImageView circularImageView = c152276tD.A03;
        circularImageView.A0H(2, R.color.black);
        circularImageView.setImageDrawable(new ColorDrawable(circularImageView.getContext().getColor(R.color.fds_transparent)));
        TextView textView = c152276tD.A02;
        textView.setText(2131956543);
        textView.setVisibility(0);
        c152276tD.A04.setVisibility(8);
        View view2 = c152276tD.itemView;
        C14360o3.A06(view2);
        C3P9 c3p9 = new C3P9(view2);
        c3p9.A0D = true;
        c3p9.A07 = true;
        c3p9.A04 = new JZ9(c152286tE, c152276tD);
        c3p9.A00();
        this.A00 = (ViewGroup) view.requireViewById(R.id.tray_empty_state_container);
    }
}
