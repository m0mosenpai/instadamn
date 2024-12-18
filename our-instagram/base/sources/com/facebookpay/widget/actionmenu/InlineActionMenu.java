package com.facebookpay.widget.actionmenu;

import X.AbstractC167017dG;
import X.AbstractC69838VwO;
import X.AbstractC70177WFc;
import X.C00O;
import X.C05F;
import X.C14360o3;
import X.VEP;
import X.WF7;
import X.WFM;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.facebook.R;

/* loaded from: classes11.dex */
public final class InlineActionMenu extends FrameLayout {
    public TextView A00;
    public TextView A01;
    public TextView A02;
    public final int A03;
    public final int A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InlineActionMenu(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C14360o3.A0B(context, 1);
        this.A03 = AbstractC167017dG.A06(context);
        this.A04 = AbstractC167017dG.A05(context);
        View.inflate(context, R.layout.fbpay_ui_inline_action_menu, this);
        this.A01 = (TextView) findViewById(R.id.fbpay_inline_action_menu_edit_view);
        this.A02 = (TextView) findViewById(R.id.fbpay_inline_action_menu_remove_view);
        this.A00 = (TextView) findViewById(R.id.fbpay_inline_action_menu_divider_view);
        TextView textView = this.A01;
        String str = "editView";
        if (textView != null) {
            textView.setText(2131962353);
            TextView textView2 = this.A01;
            if (textView2 != null) {
                VEP vep = VEP.A04;
                WF7.A02(textView2, vep);
                TextView textView3 = this.A01;
                if (textView3 != null) {
                    AbstractC70177WFc.A02(textView3, 4, 11, 11, 4);
                    TextView textView4 = this.A02;
                    str = "removeView";
                    if (textView4 != null) {
                        textView4.setText(2131962354);
                        TextView textView5 = this.A02;
                        if (textView5 != null) {
                            WF7.A02(textView5, vep);
                            TextView textView6 = this.A02;
                            if (textView6 != null) {
                                AbstractC70177WFc.A02(textView6, 4, 11, 11, 4);
                                TextView textView7 = this.A00;
                                str = "dividerView";
                                if (textView7 != null) {
                                    textView7.setText("|");
                                    TextView textView8 = this.A00;
                                    if (textView8 != null) {
                                        WF7.A02(textView8, VEP.A14);
                                        TextView textView9 = this.A00;
                                        if (textView9 != null) {
                                            Integer valueOf = Integer.valueOf(this.A03);
                                            WFM.A03(textView9, valueOf, valueOf, 0, 0);
                                            return;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    public final void setEditAccessibility(String str) {
        C14360o3.A0B(str, 0);
        TextView textView = this.A01;
        if (textView == null) {
            C14360o3.A0F("editView");
            throw C00O.createAndThrow();
        }
        AbstractC69838VwO.A01(textView, C05F.A01, str);
    }

    public final void setRemoveAccessibility(String str) {
        C14360o3.A0B(str, 0);
        TextView textView = this.A02;
        if (textView == null) {
            C14360o3.A0F("removeView");
            throw C00O.createAndThrow();
        }
        AbstractC69838VwO.A01(textView, C05F.A01, str);
    }

    public final void A00() {
        String str;
        TextView textView = this.A01;
        if (textView == null) {
            str = "editView";
        } else {
            textView.setVisibility(8);
            TextView textView2 = this.A02;
            if (textView2 == null) {
                str = "removeView";
            } else {
                textView2.setVisibility(8);
                TextView textView3 = this.A00;
                if (textView3 == null) {
                    str = "dividerView";
                } else {
                    textView3.setVisibility(8);
                    return;
                }
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    public final void A01() {
        String str;
        TextView textView = this.A01;
        if (textView == null) {
            str = "editView";
        } else {
            textView.setVisibility(0);
            TextView textView2 = this.A02;
            if (textView2 == null) {
                str = "removeView";
            } else {
                textView2.setVisibility(8);
                TextView textView3 = this.A00;
                if (textView3 == null) {
                    str = "dividerView";
                } else {
                    textView3.setVisibility(8);
                    return;
                }
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    public final void setEditComponentListener(View.OnClickListener onClickListener) {
        TextView textView = this.A01;
        if (textView == null) {
            C14360o3.A0F("editView");
            throw C00O.createAndThrow();
        }
        textView.setOnClickListener(onClickListener);
    }

    public final void setRemoveComponentListener(View.OnClickListener onClickListener) {
        TextView textView = this.A02;
        if (textView == null) {
            C14360o3.A0F("removeView");
            throw C00O.createAndThrow();
        }
        textView.setOnClickListener(onClickListener);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public InlineActionMenu(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C14360o3.A0B(context, 1);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public InlineActionMenu(Context context) {
        this(context, null);
        C14360o3.A0B(context, 1);
    }
}
