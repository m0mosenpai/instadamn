package com.instagram.business.instantexperiences.ui;

import X.AbstractC166997dE;
import X.InterfaceC65451TkN;
import X.ViewOnClickListenerC63504SoX;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.facebook.R;
import com.facebook.android.instantexperiences.autofill.model.BrowserExtensionsAutofillData;
import com.facebook.android.instantexperiences.autofill.model.FbAutofillData;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes10.dex */
public class InstantExperiencesAutofillBar extends RelativeLayout {
    private void setAutofillSelectedOnClickListener(View view, InterfaceC65451TkN interfaceC65451TkN, BrowserExtensionsAutofillData browserExtensionsAutofillData) {
        view.setOnClickListener(new ViewOnClickListenerC63504SoX(4, interfaceC65451TkN, this, browserExtensionsAutofillData));
    }

    public final void A00(InterfaceC65451TkN interfaceC65451TkN, List list) {
        ViewGroup viewGroup = (ViewGroup) requireViewById(R.id.autofill_bar_container);
        viewGroup.removeAllViews();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            BrowserExtensionsAutofillData browserExtensionsAutofillData = (BrowserExtensionsAutofillData) ((FbAutofillData) it.next());
            View inflate = LayoutInflater.from(getContext()).inflate(R.layout.instant_experiences_browser_autofill_bar_list_entry, (ViewGroup) null, false);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            layoutParams.setMargins(0, 0, 20, 0);
            inflate.setLayoutParams(layoutParams);
            TextView A0T = AbstractC166997dE.A0T(inflate, R.id.autofill_bar_list_entry_text);
            A0T.setText(browserExtensionsAutofillData.A00());
            setAutofillSelectedOnClickListener(A0T, interfaceC65451TkN, browserExtensionsAutofillData);
            viewGroup.addView(inflate);
        }
    }

    public InstantExperiencesAutofillBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public InstantExperiencesAutofillBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public InstantExperiencesAutofillBar(Context context) {
        super(context);
    }
}
