package com.instagram.profile.intf.tabs;

import X.AbstractC56372iV;
import X.AbstractC56952jT;
import X.C00O;
import X.C14360o3;
import X.C14740om;
import X.F9O;
import X.InterfaceC154386wo;
import X.InterfaceC56392iX;
import X.InterfaceC69513Al;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.ui.colorfilter.ColorFilterAlphaImageView;
import com.instagram.profile.intf.tabs.ProfileIconTabView;

/* loaded from: classes3.dex */
public final class ProfileIconTabView extends FrameLayout implements InterfaceC154386wo {
    public int A00;
    public Drawable A01;
    public Drawable A02;
    public ColorFilterAlphaImageView A03;
    public InterfaceC56392iX A04;
    public InterfaceC56392iX A05;
    public InterfaceC56392iX A06;
    public boolean A07;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProfileIconTabView(Context context) {
        super(context);
        C14360o3.A0B(context, 1);
        A00(context);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        C14360o3.A0B(accessibilityNodeInfo, 0);
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClickable(false);
    }

    @Override // X.InterfaceC154386wo
    public void setTitle(String str) {
    }

    @Override // X.InterfaceC154386wo
    public void setTitleDrawable(Drawable drawable) {
    }

    @Override // X.InterfaceC154386wo
    public View getView() {
        return this;
    }

    @Override // X.InterfaceC154386wo
    public void setActiveColor(int i) {
        String str;
        this.A00 = i;
        ColorFilterAlphaImageView colorFilterAlphaImageView = this.A03;
        if (colorFilterAlphaImageView == null) {
            str = "iconView";
        } else {
            colorFilterAlphaImageView.setActiveColor(i);
            InterfaceC56392iX interfaceC56392iX = this.A05;
            if (interfaceC56392iX == null) {
                str = "endIconView";
            } else {
                ColorFilterAlphaImageView colorFilterAlphaImageView2 = (ColorFilterAlphaImageView) interfaceC56392iX.E3q();
                if (colorFilterAlphaImageView2 != null) {
                    colorFilterAlphaImageView2.setActiveColor(i);
                    return;
                }
                return;
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC154386wo
    public void setActiveIcon(Drawable drawable) {
        if (drawable != null) {
            this.A01 = drawable;
            ColorFilterAlphaImageView colorFilterAlphaImageView = this.A03;
            if (colorFilterAlphaImageView == null) {
                C14360o3.A0F("iconView");
                throw C00O.createAndThrow();
            }
            colorFilterAlphaImageView.setImageDrawable(C14740om.A02(this.A02, drawable));
        }
    }

    @Override // X.InterfaceC154386wo
    public void setBadgeCount(int i) {
        String str;
        String str2;
        int i2 = 0;
        if (this.A07) {
            str = "badgeCountHolder";
            InterfaceC56392iX interfaceC56392iX = this.A04;
            if (i > 0) {
                if (interfaceC56392iX != null) {
                    interfaceC56392iX.setVisibility(0);
                    InterfaceC56392iX interfaceC56392iX2 = this.A04;
                    if (interfaceC56392iX2 != null) {
                        TextView textView = (TextView) interfaceC56392iX2.getView();
                        if (i < 100) {
                            str2 = String.valueOf(i);
                        } else {
                            str2 = "•••";
                        }
                        F9O.A00(textView, str2);
                        return;
                    }
                }
            } else if (interfaceC56392iX != null) {
                interfaceC56392iX.setVisibility(8);
                return;
            }
        } else {
            InterfaceC56392iX interfaceC56392iX3 = this.A06;
            if (interfaceC56392iX3 == null) {
                str = "ledNotificationHolder";
            } else {
                if (i <= 0) {
                    i2 = 8;
                }
                interfaceC56392iX3.setVisibility(i2);
                return;
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // android.view.View
    public void setContentDescription(CharSequence charSequence) {
        ColorFilterAlphaImageView colorFilterAlphaImageView = this.A03;
        if (colorFilterAlphaImageView == null) {
            C14360o3.A0F("iconView");
            throw C00O.createAndThrow();
        }
        colorFilterAlphaImageView.setContentDescription(charSequence);
    }

    @Override // X.InterfaceC154386wo
    public void setEndIcon(Drawable drawable) {
        String str = "endIconView";
        if (drawable == null) {
            InterfaceC56392iX interfaceC56392iX = this.A05;
            if (interfaceC56392iX != null) {
                interfaceC56392iX.setVisibility(8);
                return;
            }
        } else {
            InterfaceC56392iX interfaceC56392iX2 = this.A05;
            if (interfaceC56392iX2 != null) {
                interfaceC56392iX2.setVisibility(0);
                InterfaceC56392iX interfaceC56392iX3 = this.A05;
                if (interfaceC56392iX3 != null) {
                    ((ImageView) interfaceC56392iX3.getView()).setImageDrawable(drawable);
                    int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R.dimen.abc_action_bar_elevation_material);
                    InterfaceC56392iX interfaceC56392iX4 = this.A05;
                    if (interfaceC56392iX4 != null) {
                        View view = interfaceC56392iX4.getView();
                        ColorFilterAlphaImageView colorFilterAlphaImageView = this.A03;
                        if (colorFilterAlphaImageView == null) {
                            str = "iconView";
                        } else {
                            view.setPaddingRelative(colorFilterAlphaImageView.getDrawable().getIntrinsicWidth() + (dimensionPixelSize * 2) + drawable.getIntrinsicWidth(), 0, 0, 0);
                            return;
                        }
                    }
                }
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC154386wo
    public void setIcon(Drawable drawable) {
        if (drawable != null) {
            this.A02 = drawable;
            ColorFilterAlphaImageView colorFilterAlphaImageView = this.A03;
            if (colorFilterAlphaImageView == null) {
                C14360o3.A0F("iconView");
                throw C00O.createAndThrow();
            }
            colorFilterAlphaImageView.setImageDrawable(C14740om.A02(drawable, this.A01));
        }
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        ColorFilterAlphaImageView colorFilterAlphaImageView = this.A03;
        if (colorFilterAlphaImageView == null) {
            C14360o3.A0F("iconView");
            throw C00O.createAndThrow();
        }
        colorFilterAlphaImageView.setOnClickListener(onClickListener);
    }

    private final void A00(Context context) {
        String str;
        View.inflate(context, R.layout.profile_icon_tab_view, this);
        ColorFilterAlphaImageView colorFilterAlphaImageView = (ColorFilterAlphaImageView) requireViewById(R.id.profile_tab_icon_view);
        this.A03 = colorFilterAlphaImageView;
        if (colorFilterAlphaImageView == null) {
            str = "iconView";
        } else {
            AbstractC56952jT.A03(colorFilterAlphaImageView, context.getString(2131975126));
            this.A04 = AbstractC56372iV.A01(findViewById(R.id.profile_tab_badge_count_view_stub), false, false);
            this.A06 = AbstractC56372iV.A01(findViewById(R.id.profile_tab_led_notification_stub), false, false);
            InterfaceC56392iX A01 = AbstractC56372iV.A01(findViewById(R.id.profile_tab_icon_end_layout_view_stub), false, false);
            this.A05 = A01;
            if (A01 == null) {
                str = "endIconView";
            } else {
                A01.EZv(new InterfaceC69513Al() { // from class: X.6wq
                    @Override // X.InterfaceC69513Al
                    public final /* bridge */ /* synthetic */ void DLu(View view) {
                        ColorFilterAlphaImageView colorFilterAlphaImageView2 = (ColorFilterAlphaImageView) view;
                        C14360o3.A0B(colorFilterAlphaImageView2, 0);
                        colorFilterAlphaImageView2.setActiveColor(ProfileIconTabView.this.A00);
                    }
                });
                return;
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC154386wo
    public final void EJ3(boolean z) {
        this.A07 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProfileIconTabView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C14360o3.A0B(context, 1);
        A00(context);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProfileIconTabView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C14360o3.A0B(context, 1);
        A00(context);
    }
}
