package com.instagram.bugreporter;

import X.AbstractC166987dD;
import X.AbstractC25225BEi;
import X.AbstractC31172DnG;
import X.C14360o3;
import X.C189448aO;
import X.C189478aR;
import X.C52774NXf;
import X.JQ0;
import X.MSX;
import X.OHF;
import X.PHZ;
import X.ViewOnClickListenerC55464OkJ;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.igds.components.switchbutton.IgdsSwitch;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes9.dex */
public final class BugReportSevereSwitchView extends RelativeLayout {
    public View A00;
    public IgSimpleImageView A01;
    public IgTextView A02;
    public IgTextView A03;
    public IgTextView A04;
    public IgdsSwitch A05;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BugReportSevereSwitchView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C14360o3.A0B(context, 1);
        View inflate = View.inflate(context, R.layout.bugreporter_row_option_layout, this);
        this.A00 = inflate;
        this.A04 = AbstractC31172DnG.A0X(inflate, R.id.option_row_title_text_view);
        this.A03 = AbstractC31172DnG.A0X(inflate, R.id.option_row_subtitle_text_view);
        this.A05 = (IgdsSwitch) inflate.requireViewById(R.id.option_row_ig_switch);
        this.A01 = MSX.A0I(inflate, R.id.option_row_info_icon);
        this.A02 = AbstractC31172DnG.A0X(inflate, R.id.option_row_description);
    }

    public final IgTextView getOptionRowDescription() {
        return this.A02;
    }

    public final IgSimpleImageView getOptionRowInfoIcon() {
        return this.A01;
    }

    public final IgTextView getOptionRowSubtitleTextView() {
        return this.A03;
    }

    public final IgdsSwitch getOptionRowSwitch() {
        return this.A05;
    }

    public final IgTextView getOptionRowTitleTextView() {
        return this.A04;
    }

    public final View getOptionRowView() {
        return this.A00;
    }

    public static final Activity A00(BugReportSevereSwitchView bugReportSevereSwitchView) {
        for (Context context = bugReportSevereSwitchView.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
        }
        throw AbstractC166987dD.A14("Unable to get activity");
    }

    public static final boolean A01(BugReportSevereSwitchView bugReportSevereSwitchView, UserSession userSession, OHF ohf, boolean z) {
        C189448aO A0y = AbstractC25225BEi.A0y(userSession);
        A0y.A0U = new PHZ(0, bugReportSevereSwitchView, z);
        C189478aR A00 = A0y.A00();
        ViewOnClickListenerC55464OkJ viewOnClickListenerC55464OkJ = new ViewOnClickListenerC55464OkJ(16, bugReportSevereSwitchView, ohf);
        ViewOnClickListenerC55464OkJ viewOnClickListenerC55464OkJ2 = new ViewOnClickListenerC55464OkJ(15, bugReportSevereSwitchView, ohf);
        Bundle A0b = AbstractC166987dD.A0b();
        A0b.putBoolean("SevereBugDescriptionBottomSheetFragment.ARGUMENT_INCLUDE_BUTTONS", z);
        C52774NXf c52774NXf = new C52774NXf();
        c52774NXf.setArguments(A0b);
        c52774NXf.A00 = viewOnClickListenerC55464OkJ2;
        c52774NXf.A01 = viewOnClickListenerC55464OkJ;
        A00.A02(A00(bugReportSevereSwitchView), c52774NXf);
        return true;
    }

    public final void setOptionRowDescription(IgTextView igTextView) {
        this.A02 = igTextView;
    }

    public final void setOptionRowInfoIcon(IgSimpleImageView igSimpleImageView) {
        this.A01 = igSimpleImageView;
    }

    public final void setOptionRowSubtitleTextView(IgTextView igTextView) {
        this.A03 = igTextView;
    }

    public final void setOptionRowSwitch(IgdsSwitch igdsSwitch) {
        this.A05 = igdsSwitch;
    }

    public final void setOptionRowTitleTextView(IgTextView igTextView) {
        this.A04 = igTextView;
    }

    public final void setOptionRowView(View view) {
        this.A00 = view;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BugReportSevereSwitchView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C14360o3.A0B(context, 1);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BugReportSevereSwitchView(Context context) {
        this(context, null, 0);
        C14360o3.A0B(context, 1);
    }

    public /* synthetic */ BugReportSevereSwitchView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, JQ0.A0C(attributeSet, i2), JQ0.A03(i2, i));
    }
}
