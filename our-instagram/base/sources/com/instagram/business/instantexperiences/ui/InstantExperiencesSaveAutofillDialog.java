package com.instagram.business.instantexperiences.ui;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167007dF;
import X.AbstractC58321PtD;
import X.C14360o3;
import X.SCH;
import X.ViewOnClickListenerC63504SoX;
import X.ViewOnClickListenerC63508Sob;
import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.facebook.R;
import java.util.List;

/* loaded from: classes10.dex */
public class InstantExperiencesSaveAutofillDialog extends RelativeLayout {
    public Button A00;
    public Button A01;
    public SCH A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InstantExperiencesSaveAutofillDialog(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C14360o3.A0B(context, 1);
        A00(context);
        Resources resources = getResources();
        AbstractC167007dF.A0N(this, R.id.instant_experiences_confirm_dialog_title).setText(resources.getString(2131953427));
        String string = resources.getString(2131953424);
        Button button = this.A00;
        C14360o3.A0A(button);
        button.setText(string);
        String string2 = resources.getString(2131953425);
        Button button2 = this.A01;
        C14360o3.A0A(button2);
        button2.setText(string2);
    }

    private final void A00(Context context) {
        View.inflate(context, R.layout.instant_experiences_confirmation_dialog, this);
        Button button = (Button) requireViewById(R.id.instant_experiences_confirm_dialog_decline_button);
        this.A01 = button;
        C14360o3.A0A(button);
        button.setOnClickListener(ViewOnClickListenerC63508Sob.A00(this, 67));
        Button button2 = (Button) requireViewById(R.id.instant_experiences_confirm_dialog_accept_button);
        this.A00 = button2;
        C14360o3.A0A(button2);
        button2.setOnClickListener(ViewOnClickListenerC63508Sob.A00(this, 68));
    }

    public final void setDetailItems(List list) {
        View A0S = AbstractC166997dE.A0S(this, R.id.instant_experiences_confirm_dialog_details);
        if (list != null && !list.isEmpty()) {
            TextView A0N = AbstractC167007dF.A0N(this, R.id.instant_experiences_confirm_dialog_detail_clickable);
            ViewGroup viewGroup = (ViewGroup) AbstractC166997dE.A0R(this, R.id.instant_experiences_confirm_dialog_detail_info_container);
            AbstractC167007dF.A0N(this, R.id.instant_experiences_confirm_dialog_detail_string).setText(AbstractC58321PtD.A0i(list, 0));
            if (list.size() == 1) {
                A0N.setVisibility(8);
                viewGroup.setVisibility(8);
            } else {
                A0N.setVisibility(0);
                A0N.setText(getResources().getString(2131953428));
                A0N.setOnClickListener(new ViewOnClickListenerC63504SoX(5, A0N, viewGroup, this));
                viewGroup.removeAllViews();
                int size = list.size();
                for (int i = 1; i < size; i++) {
                    Context context = getContext();
                    TextView textView = new TextView(context);
                    textView.setText(AbstractC58321PtD.A0i(list, i));
                    AbstractC166987dD.A1O(context, textView, R.color.grey_5);
                    viewGroup.addView(textView);
                }
            }
            A0S.setVisibility(0);
            return;
        }
        A0S.setVisibility(8);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InstantExperiencesSaveAutofillDialog(Context context) {
        super(context);
        C14360o3.A0B(context, 1);
        A00(context);
    }
}
