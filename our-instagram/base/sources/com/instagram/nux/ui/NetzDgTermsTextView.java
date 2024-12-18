package com.instagram.nux.ui;

import X.AbstractC12990ll;
import X.AbstractC31181DnP;
import X.C06090Tz;
import X.C14360o3;
import X.C1AD;
import X.C1Q2;
import X.C3WF;
import X.ViewOnClickListenerC35687FpM;
import android.content.Context;
import android.util.AttributeSet;
import java.util.Locale;

/* loaded from: classes6.dex */
public final class NetzDgTermsTextView extends C3WF {
    public String A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NetzDgTermsTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C14360o3.A0B(context, 1);
        AbstractC31181DnP.A0O(context, attributeSet, this);
    }

    public final void A00(AbstractC12990ll abstractC12990ll) {
        C06090Tz c06090Tz = C06090Tz.A05;
        if (!C1AD.A06(c06090Tz, 18306164227908268L) ? C1AD.A06(c06090Tz, 18306164227842731L) : Locale.GERMANY.getCountry().equalsIgnoreCase(C1Q2.A02().getCountry()) || Locale.GERMANY.getCountry().equalsIgnoreCase(C1Q2.A03().getCountry())) {
            setVisibility(0);
            setClickable(true);
            setOnClickListener(new ViewOnClickListenerC35687FpM(6, abstractC12990ll, this));
            return;
        }
        setVisibility(8);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NetzDgTermsTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C14360o3.A0B(context, 1);
        AbstractC31181DnP.A0O(context, attributeSet, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NetzDgTermsTextView(Context context) {
        super(context, null);
        C14360o3.A0B(context, 1);
        AbstractC31181DnP.A0O(context, null, this);
    }
}
