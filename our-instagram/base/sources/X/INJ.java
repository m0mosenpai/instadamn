package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.facebook.R;
import com.instagram.igds.components.button.IgdsButton;

/* loaded from: classes7.dex */
public final class INJ {
    public final LinearLayout A00;
    public final boolean A01;

    public INJ(LinearLayout linearLayout, boolean z) {
        C14360o3.A0B(linearLayout, 1);
        this.A00 = linearLayout;
        this.A01 = z;
        linearLayout.setVisibility(z ? 8 : 4);
    }

    public final void A01(Context context, EnumC33416Epn enumC33416Epn, InterfaceC43452JHq interfaceC43452JHq) {
        String string;
        int i;
        C14360o3.A0B(enumC33416Epn, 1);
        if (enumC33416Epn == EnumC33416Epn.A05) {
            A00(context, new ViewOnClickListenerC42033Ik2(interfaceC43452JHq, 12), context.getString(2131976205));
            string = context.getString(2131972732);
            i = 13;
        } else {
            A00(context, new ViewOnClickListenerC42033Ik2(interfaceC43452JHq, 14), context.getString(2131972240));
            string = context.getString(2131966909);
            i = 15;
        }
        A00(context, new ViewOnClickListenerC42033Ik2(interfaceC43452JHq, i), string);
    }

    public final void A02(boolean z) {
        LinearLayout linearLayout = this.A00;
        int childCount = linearLayout.getChildCount();
        for (int i = 0; i < childCount; i++) {
            linearLayout.getChildAt(i).setEnabled(z);
        }
    }

    public final void A00(Context context, View.OnClickListener onClickListener, String str) {
        LayoutInflater from = LayoutInflater.from(context);
        ViewGroup viewGroup = this.A00;
        View inflate = from.inflate(R.layout.save_collection_bulk_edit_button, viewGroup, false);
        C14360o3.A0C(inflate, MSV.A00(239));
        IgdsButton igdsButton = (IgdsButton) inflate;
        igdsButton.setText(str);
        igdsButton.setEnabled(false);
        C0fQ.A00(onClickListener, igdsButton);
        viewGroup.addView(igdsButton);
    }
}
