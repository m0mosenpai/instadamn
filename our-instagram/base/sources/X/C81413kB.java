package X;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.ui.widget.editphonenumber.EditPhoneNumberView;

/* renamed from: X.3kB, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C81413kB extends C3OO {
    public TextView A00;
    public EditPhoneNumberView A01;
    public final ViewStub A02;
    public final ImageView A03;
    public final TextView A04;
    public final TextView A05;
    public final ViewGroup A06;

    public C81413kB(View view) {
        super(view);
        View requireViewById = view.requireViewById(R.id.dismiss_button);
        C14360o3.A07(requireViewById);
        ImageView imageView = (ImageView) requireViewById;
        this.A03 = imageView;
        imageView.getDrawable().mutate().setColorFilter(C3DY.A00(view.getContext().getColor(R.color.grey_5)));
        this.A05 = (TextView) view.requireViewById(R.id.title);
        this.A04 = (TextView) view.requireViewById(R.id.message);
        this.A02 = (ViewStub) view.requireViewById(R.id.inline_edit_view);
        View requireViewById2 = view.requireViewById(R.id.megaphone_content);
        C14360o3.A07(requireViewById2);
        View requireViewById3 = view.requireViewById(R.id.button_placeholder);
        C14360o3.A07(requireViewById3);
        ViewGroup A00 = VVS.A00((ViewGroup) requireViewById2, (ViewGroup) requireViewById3, null, null, VE7.A05);
        this.A06 = A00;
        this.A00 = A00 != null ? (TextView) A00.findViewById(R.id.primary_button) : null;
    }
}
