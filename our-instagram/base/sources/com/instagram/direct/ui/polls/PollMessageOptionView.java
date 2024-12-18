package com.instagram.direct.ui.polls;

import X.AbstractC167017dG;
import X.AbstractC31172DnG;
import X.C00O;
import X.C14360o3;
import X.InterfaceC50478MQg;
import X.JQ0;
import X.LO2;
import X.LQ3;
import X.ViewOnClickListenerC48062LPn;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.facebook.R;
import com.facebook.common.dextricks.Constants;
import com.instagram.common.ui.base.IgEditText;
import com.instagram.common.ui.widget.imageview.IgImageView;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes8.dex */
public final class PollMessageOptionView extends FrameLayout {
    public IgEditText A00;
    public InterfaceC50478MQg A01;
    public int A02;
    public IgImageView A03;
    public final View.OnFocusChangeListener A04;
    public final LO2 A05;

    public static final void A00(PollMessageOptionView pollMessageOptionView, boolean z) {
        IgImageView igImageView = pollMessageOptionView.A03;
        if (z) {
            if (igImageView != null) {
                igImageView.setVisibility(0);
                IgEditText igEditText = pollMessageOptionView.A00;
                if (igEditText != null) {
                    igEditText.setPaddingRelative(igEditText.getPaddingStart(), igEditText.getPaddingTop(), pollMessageOptionView.A02, igEditText.getPaddingBottom());
                    return;
                }
                C14360o3.A0F("editText");
            }
            C14360o3.A0F("removeButton");
        } else {
            if (igImageView != null) {
                igImageView.setVisibility(8);
                IgEditText igEditText2 = pollMessageOptionView.A00;
                if (igEditText2 != null) {
                    igEditText2.setPaddingRelative(igEditText2.getPaddingStart(), igEditText2.getPaddingTop(), 0, igEditText2.getPaddingBottom());
                    return;
                }
                C14360o3.A0F("editText");
            }
            C14360o3.A0F("removeButton");
        }
        throw C00O.createAndThrow();
    }

    public final void setText(String str) {
        C14360o3.A0B(str, 0);
        IgEditText igEditText = this.A00;
        if (igEditText == null) {
            C14360o3.A0F("editText");
            throw C00O.createAndThrow();
        }
        igEditText.setText(str);
        A00(this, false);
    }

    public final InterfaceC50478MQg getListener() {
        return this.A01;
    }

    public final void setListener(InterfaceC50478MQg interfaceC50478MQg) {
        this.A01 = interfaceC50478MQg;
    }

    public /* synthetic */ PollMessageOptionView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, JQ0.A0C(attributeSet, i2), JQ0.A03(i2, i));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PollMessageOptionView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C14360o3.A0B(context, 1);
        LO2 lo2 = new LO2(this, 12);
        this.A05 = lo2;
        LQ3 lq3 = new LQ3(this, 3);
        this.A04 = lq3;
        View.inflate(context, R.layout.direct_poll_message_option, this);
        this.A02 = AbstractC167017dG.A0B(context);
        IgEditText igEditText = (IgEditText) requireViewById(R.id.input);
        this.A00 = igEditText;
        String str = "editText";
        if (igEditText != null) {
            igEditText.addTextChangedListener(lo2);
            IgEditText igEditText2 = this.A00;
            if (igEditText2 != null) {
                igEditText2.setOnFocusChangeListener(lq3);
                IgImageView A0Z = AbstractC31172DnG.A0Z(this, R.id.remove_button);
                this.A03 = A0Z;
                if (A0Z == null) {
                    str = "removeButton";
                } else {
                    A0Z.setOnClickListener(new ViewOnClickListenerC48062LPn(this, 64));
                    setDescendantFocusability(Constants.LOAD_RESULT_DEX2OAT_TRY_PERIODIC_PGO_COMP_ATTEMPTED);
                    return;
                }
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PollMessageOptionView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C14360o3.A0B(context, 1);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PollMessageOptionView(Context context) {
        this(context, null, 0);
        C14360o3.A0B(context, 1);
    }
}
