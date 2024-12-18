package com.instagram.igds.components.textcell;

import X.AbstractC13880nE;
import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167007dF;
import X.AbstractC25227BEk;
import X.AbstractC25228BEl;
import X.AbstractC31172DnG;
import X.AbstractC31173DnH;
import X.AbstractC31174DnI;
import X.AbstractC43592JPx;
import X.AbstractC50522MSa;
import X.AbstractC53182c0;
import X.AbstractC53242c7;
import X.AbstractC55922hc;
import X.AbstractC56862jK;
import X.AbstractC56932jR;
import X.B4Z;
import X.C00O;
import X.C14360o3;
import X.C50784Mbs;
import X.EnumC53106NeJ;
import X.EnumC53160NfF;
import X.EnumC53237Nga;
import X.InterfaceC190658cN;
import X.JQ0;
import X.ViewOnClickListenerC55455Ok9;
import X.ViewOnClickListenerC55465OkK;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.text.method.MovementMethod;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.facebook.R;
import com.instagram.common.ui.base.IgProgressBar;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.igds.components.button.IgdsRadioButton;
import com.instagram.igds.components.checkbox.IgdsCheckBox;
import com.instagram.igds.components.switchbutton.IgdsSwitch;
import java.util.Arrays;
import kotlin.Deprecated;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes9.dex */
public final class IgdsListCell extends LinearLayout {
    public View.OnClickListener A00;
    public ViewGroup A01;
    public FrameLayout A02;
    public IgProgressBar A03;
    public IgTextView A04;
    public IgTextView A05;
    public IgTextView A06;
    public IgTextView A07;
    public IgImageView A08;
    public IgImageView A09;
    public IgImageView A0A;
    public IgImageView A0B;
    public IgdsRadioButton A0C;
    public IgdsCheckBox A0D;
    public IgdsCheckBox A0E;
    public IgdsSwitch A0F;
    public EnumC53237Nga A0G;
    public boolean A0H;
    public CompoundButton A0I;
    public CharSequence A0J;
    public boolean A0K;
    public boolean A0L;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public IgdsListCell(Context context) {
        this(context, null);
        C14360o3.A0B(context, 1);
    }

    public final void A04() {
        String str;
        setEnabled(true);
        this.A0L = true;
        IgImageView igImageView = this.A0B;
        if (igImageView == null) {
            str = "iconView";
        } else {
            AbstractC13880nE.A0P(igImageView);
            IgTextView igTextView = this.A06;
            if (igTextView == null) {
                str = "subtitleView";
            } else {
                AbstractC13880nE.A0P(igTextView);
                IgImageView igImageView2 = this.A08;
                if (igImageView2 == null) {
                    str = "badgeView";
                } else {
                    AbstractC13880nE.A0P(igImageView2);
                    IgTextView igTextView2 = this.A04;
                    if (igTextView2 == null) {
                        str = "detailView";
                    } else {
                        AbstractC13880nE.A0P(igTextView2);
                        FrameLayout frameLayout = this.A02;
                        if (frameLayout == null) {
                            str = "rightAddOnContainer";
                        } else {
                            frameLayout.setOnClickListener(null);
                            CompoundButton compoundButton = this.A0I;
                            if (compoundButton != null) {
                                compoundButton.setOnCheckedChangeListener(null);
                            }
                            IgTextView igTextView3 = this.A07;
                            if (igTextView3 == null) {
                                str = "titleView";
                            } else {
                                setContentDescription(igTextView3.getText());
                                setAccessibilityDelegate(null);
                                A03();
                                return;
                            }
                        }
                    }
                }
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    public final void A09(Drawable drawable) {
        C14360o3.A0B(drawable, 0);
        Context context = getContext();
        A0A(drawable, AbstractC31174DnI.A0q(context, AbstractC53242c7.A08(context)));
    }

    public final void A0A(Drawable drawable, Integer num) {
        IgImageView igImageView = this.A0B;
        if (igImageView == null) {
            C14360o3.A0F("iconView");
            throw C00O.createAndThrow();
        }
        igImageView.setVisibility(0);
        igImageView.setImageDrawable(drawable);
        if (num != null) {
            igImageView.setColorFilter(num.intValue());
        }
    }

    public final void A0C(View.OnClickListener onClickListener) {
        String str;
        C14360o3.A0B(onClickListener, 0);
        setOnClickListener(onClickListener);
        IgTextView igTextView = this.A06;
        if (igTextView == null) {
            str = "subtitleView";
        } else {
            igTextView.setOnClickListener(ViewOnClickListenerC55465OkK.A00(onClickListener, this, 35));
            IgImageView igImageView = this.A08;
            if (igImageView == null) {
                str = "badgeView";
            } else {
                igImageView.setOnClickListener(onClickListener);
                IgTextView igTextView2 = this.A04;
                if (igTextView2 == null) {
                    str = "detailView";
                } else {
                    igTextView2.setOnClickListener(onClickListener);
                    FrameLayout frameLayout = this.A02;
                    if (frameLayout == null) {
                        str = "rightAddOnContainer";
                    } else {
                        frameLayout.setOnClickListener(onClickListener);
                        return;
                    }
                }
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    public final void A0F(EnumC53160NfF enumC53160NfF) {
        IgImageView igImageView;
        Context context;
        int i;
        int i2;
        int i3;
        int A05 = AbstractC25227BEk.A05(enumC53160NfF, 0);
        if (A05 != 1) {
            if (A05 != 2) {
                if (A05 != 3) {
                    if (A05 != 0) {
                        if (A05 == 4) {
                            igImageView = this.A08;
                            if (igImageView != null) {
                                i3 = R.drawable.red_dot_medium;
                                igImageView.setImageResource(i3);
                                igImageView.setColorFilter((ColorFilter) null);
                            }
                        } else {
                            throw B4Z.A00();
                        }
                    } else {
                        igImageView = this.A08;
                        if (igImageView != null) {
                            i3 = R.drawable.blue_dot_medium;
                            igImageView.setImageResource(i3);
                            igImageView.setColorFilter((ColorFilter) null);
                        }
                    }
                    igImageView.setVisibility(0);
                }
                igImageView = this.A08;
                if (igImageView != null) {
                    igImageView.setImageResource(R.drawable.instagram_error_pano_filled_24);
                    context = getContext();
                    i = R.attr.igds_color_error_or_destructive;
                    i2 = AbstractC53242c7.A0H(context, i);
                }
            } else {
                igImageView = this.A08;
                if (igImageView != null) {
                    igImageView.setImageResource(R.drawable.instagram_warning_pano_filled_24);
                    context = getContext();
                    i2 = R.color.activator_card_progress_bad;
                }
            }
            C14360o3.A0F("badgeView");
            throw C00O.createAndThrow();
        }
        igImageView = this.A08;
        if (igImageView != null) {
            igImageView.setImageResource(R.drawable.instagram_circle_check_pano_filled_24);
            context = getContext();
            i = R.attr.igds_color_success;
            i2 = AbstractC53242c7.A0H(context, i);
        }
        C14360o3.A0F("badgeView");
        throw C00O.createAndThrow();
        AbstractC31173DnH.A11(context, igImageView, i2);
        igImageView.setVisibility(0);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:9:0x001d. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00a5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0G(X.EnumC53237Nga r5, boolean r6) {
        /*
            r4 = this;
            r3 = 0
            r4.A0K = r6
            com.instagram.igds.components.checkbox.IgdsCheckBox r0 = r4.A0E
            if (r0 != 0) goto L11
            java.lang.String r2 = "leftAlignedCheckBox"
        L9:
            X.C14360o3.A0F(r2)
        Lc:
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        L11:
            X.AbstractC13880nE.A0P(r0)
            r4.A03()
            int r0 = r5.ordinal()
            java.lang.String r2 = "rightAddOnContainer"
            switch(r0) {
                case 1: goto L5f;
                case 2: goto L93;
                case 3: goto L41;
                case 4: goto L84;
                case 5: goto L26;
                case 6: goto L2d;
                default: goto L20;
            }
        L20:
            boolean r0 = r4.A0K
            r4.setEnabled(r0)
            return
        L26:
            com.instagram.common.ui.base.IgProgressBar r0 = r4.A03
            if (r0 != 0) goto L9e
            java.lang.String r1 = "igProgressBar"
            goto L8a
        L2d:
            com.instagram.common.ui.widget.imageview.IgImageView r0 = r4.A0A
            if (r0 != 0) goto L34
            java.lang.String r1 = "dismissView"
            goto L8a
        L34:
            r0.setVisibility(r3)
            android.widget.FrameLayout r1 = r4.A02
            if (r1 == 0) goto L9
            r1.setVisibility(r3)
            r0 = 14
            goto L7c
        L41:
            r4.setTextCellAccessibilityDelegate(r3)
            com.instagram.igds.components.checkbox.IgdsCheckBox r0 = r4.A0D
            java.lang.String r1 = "checkBox"
            if (r0 == 0) goto L8a
            r4.A0I = r0
            r0.setVisibility(r3)
            android.widget.FrameLayout r1 = r4.A02
            if (r1 == 0) goto L9
            r1.setVisibility(r3)
            boolean r0 = r0.isEnabled()
            if (r0 == 0) goto L20
            r0 = 13
            goto L7c
        L5f:
            r4.setTextCellAccessibilityDelegate(r3)
            com.instagram.igds.components.switchbutton.IgdsSwitch r0 = r4.A0F
            java.lang.String r1 = "igSwitch"
            if (r0 == 0) goto L8a
            r4.A0I = r0
            r0.setVisibility(r3)
            android.widget.FrameLayout r1 = r4.A02
            if (r1 == 0) goto L9
            r1.setVisibility(r3)
            boolean r0 = r0.isEnabled()
            if (r0 == 0) goto L20
            r0 = 12
        L7c:
            X.Ok9 r0 = X.ViewOnClickListenerC55455Ok9.A00(r4, r0)
            r1.setOnClickListener(r0)
            goto L20
        L84:
            com.instagram.common.ui.widget.imageview.IgImageView r0 = r4.A09
            if (r0 != 0) goto L8f
            java.lang.String r1 = "chevronView"
        L8a:
            X.C14360o3.A0F(r1)
            goto Lc
        L8f:
            r0.setVisibility(r3)
            goto La1
        L93:
            r4.setTextCellAccessibilityDelegate(r3)
            com.instagram.igds.components.button.IgdsRadioButton r0 = r4.A0C
            java.lang.String r1 = "igdsRadioButton"
            if (r0 == 0) goto L8a
            r4.A0I = r0
        L9e:
            r0.setVisibility(r3)
        La1:
            android.widget.FrameLayout r0 = r4.A02
            if (r0 == 0) goto L9
            r0.setVisibility(r3)
            goto L20
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.igds.components.textcell.IgdsListCell.A0G(X.Nga, boolean):void");
    }

    public final void A0H(CharSequence charSequence) {
        C14360o3.A0B(charSequence, 0);
        if (!AbstractC167007dF.A1N(charSequence.length())) {
            IgTextView igTextView = this.A06;
            if (igTextView != null) {
                igTextView.setVisibility(0);
                igTextView.setText(charSequence);
                A00();
                return;
            }
        } else {
            IgTextView igTextView2 = this.A06;
            if (igTextView2 != null) {
                igTextView2.setVisibility(8);
                return;
            }
        }
        C14360o3.A0F("subtitleView");
        throw C00O.createAndThrow();
    }

    public final void A0I(CharSequence charSequence) {
        C14360o3.A0B(charSequence, 0);
        IgTextView igTextView = this.A07;
        if (igTextView == null) {
            C14360o3.A0F("titleView");
            throw C00O.createAndThrow();
        }
        igTextView.setText(charSequence);
        A00();
    }

    public final void A0J(CharSequence charSequence, CharSequence charSequence2, boolean z) {
        C14360o3.A0B(charSequence, 0);
        this.A0J = charSequence2;
        String str = "detailView";
        if (!AbstractC167007dF.A1N(charSequence.length())) {
            A03();
            IgTextView igTextView = this.A04;
            if (igTextView != null) {
                igTextView.setText(charSequence);
                A00();
                igTextView.setVisibility(0);
                if (z) {
                    A0F(EnumC53160NfF.A02);
                    return;
                }
                return;
            }
        } else {
            IgTextView igTextView2 = this.A04;
            if (igTextView2 != null) {
                igTextView2.setVisibility(8);
                IgImageView igImageView = this.A08;
                if (igImageView == null) {
                    str = "badgeView";
                } else {
                    igImageView.setVisibility(8);
                    return;
                }
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    public final void A0K(CharSequence charSequence, boolean z) {
        C14360o3.A0B(charSequence, 0);
        A0J(charSequence, charSequence, z);
    }

    public void setCheckBoxAlignmentContrib(EnumC53106NeJ enumC53106NeJ) {
        C14360o3.A0B(enumC53106NeJ, 0);
        if (this.A0I instanceof IgdsCheckBox) {
            if (this.A0G == EnumC53237Nga.A03) {
                FrameLayout frameLayout = this.A02;
                String str = "rightAddOnContainer";
                if (frameLayout != null) {
                    AbstractC13880nE.A0P(frameLayout);
                    A03();
                    IgdsCheckBox igdsCheckBox = this.A0E;
                    if (igdsCheckBox == null) {
                        str = "leftAlignedCheckBox";
                    } else {
                        AbstractC13880nE.A0P(igdsCheckBox);
                        setTextCellAccessibilityDelegate(false);
                        if (enumC53106NeJ == EnumC53106NeJ.A02) {
                            this.A0I = igdsCheckBox;
                            igdsCheckBox.setVisibility(0);
                            return;
                        }
                        IgdsCheckBox igdsCheckBox2 = this.A0D;
                        str = "checkBox";
                        if (igdsCheckBox2 != null) {
                            this.A0I = igdsCheckBox2;
                            frameLayout.setVisibility(0);
                            igdsCheckBox2.setVisibility(0);
                            if (!igdsCheckBox2.isEnabled()) {
                                return;
                            }
                            frameLayout.setOnClickListener(ViewOnClickListenerC55455Ok9.A00(this, 9));
                            return;
                        }
                    }
                }
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            }
            return;
        }
        throw AbstractC166987dD.A14("You cannot set CheckBoxAlignment until you specify the TextCell type as TextCellType.TYPE_CHECKBOX.Please call setTextCellType before calling setCheckBoxAlignment.");
    }

    public final void setCompoundButtonClickListener(View.OnClickListener onClickListener) {
        C14360o3.A0B(onClickListener, 0);
        CompoundButton compoundButton = this.A0I;
        if (compoundButton != null) {
            compoundButton.setOnClickListener(onClickListener);
            return;
        }
        throw AbstractC166987dD.A14("You cannot set a listener until you specify the Textcell type.Please call setTextCellType before calling setOnCheckedChangeListener.");
    }

    public final void setTextCellType(EnumC53237Nga enumC53237Nga) {
        C14360o3.A0B(enumC53237Nga, 0);
        this.A0G = enumC53237Nga;
        A0G(enumC53237Nga, this.A0K);
    }

    private final void A00() {
        String str;
        IgTextView igTextView = this.A07;
        if (igTextView == null) {
            str = "titleView";
        } else {
            CharSequence text = igTextView.getText();
            IgTextView igTextView2 = this.A06;
            if (igTextView2 == null) {
                str = "subtitleView";
            } else {
                CharSequence text2 = igTextView2.getText();
                CharSequence charSequence = this.A0J;
                if (charSequence == null) {
                    IgTextView igTextView3 = this.A04;
                    if (igTextView3 == null) {
                        str = "detailView";
                    } else {
                        charSequence = igTextView3.getText();
                    }
                }
                setContentDescription(AbstractC56932jR.A00(text, text2, charSequence));
                return;
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    public static final void A01(IgdsListCell igdsListCell, boolean z) {
        CompoundButton compoundButton = igdsListCell.A0I;
        if (compoundButton != null) {
            igdsListCell.setTextCellAccessibilityDelegate(z);
            if (compoundButton instanceof IgdsSwitch) {
                IgdsSwitch igdsSwitch = igdsListCell.A0F;
                if (igdsSwitch == null) {
                    C14360o3.A0F("igSwitch");
                    throw C00O.createAndThrow();
                }
                igdsSwitch.setCheckedAnimated(z);
                return;
            }
            compoundButton.setChecked(z);
        }
    }

    public final void A03() {
        String str;
        AbstractC13880nE.A0P(this.A0I);
        IgdsSwitch igdsSwitch = this.A0F;
        if (igdsSwitch == null) {
            str = "igSwitch";
        } else {
            AbstractC13880nE.A0P(igdsSwitch);
            IgdsCheckBox igdsCheckBox = this.A0D;
            if (igdsCheckBox == null) {
                str = "checkBox";
            } else {
                AbstractC13880nE.A0P(igdsCheckBox);
                IgdsRadioButton igdsRadioButton = this.A0C;
                if (igdsRadioButton == null) {
                    str = "igdsRadioButton";
                } else {
                    AbstractC13880nE.A0P(igdsRadioButton);
                    IgImageView igImageView = this.A09;
                    if (igImageView == null) {
                        str = "chevronView";
                    } else {
                        AbstractC13880nE.A0P(igImageView);
                        IgProgressBar igProgressBar = this.A03;
                        if (igProgressBar == null) {
                            str = "igProgressBar";
                        } else {
                            AbstractC13880nE.A0P(igProgressBar);
                            IgImageView igImageView2 = this.A0A;
                            if (igImageView2 == null) {
                                str = "dismissView";
                            } else {
                                AbstractC13880nE.A0P(igImageView2);
                                return;
                            }
                        }
                    }
                }
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    public final void A05(int i) {
        if (i != 0) {
            IgImageView igImageView = this.A0B;
            if (igImageView == null) {
                C14360o3.A0F("iconView");
                throw C00O.createAndThrow();
            }
            igImageView.setImageResource(i);
            Context context = getContext();
            AbstractC31173DnH.A11(context, igImageView, AbstractC53242c7.A08(context));
            igImageView.setVisibility(0);
        }
    }

    public final void A06(int i) {
        IgTextView igTextView = this.A07;
        if (igTextView == null) {
            C14360o3.A0F("titleView");
            throw C00O.createAndThrow();
        }
        igTextView.setText(i);
        A00();
    }

    public final void A07(int i, int i2) {
        IgTextView igTextView = this.A06;
        if (igTextView == null) {
            C14360o3.A0F("subtitleView");
            throw C00O.createAndThrow();
        }
        igTextView.setTextAppearance(i);
        AbstractC166987dD.A1O(getContext(), igTextView, i2);
    }

    public final void A08(int i, int i2) {
        IgTextView igTextView = this.A07;
        if (igTextView == null) {
            C14360o3.A0F("titleView");
            throw C00O.createAndThrow();
        }
        igTextView.setTextAppearance(i);
        AbstractC166987dD.A1O(getContext(), igTextView, i2);
    }

    public final void A0B(MovementMethod movementMethod) {
        IgTextView igTextView = this.A06;
        if (igTextView == null) {
            C14360o3.A0F("subtitleView");
            throw C00O.createAndThrow();
        }
        igTextView.setMovementMethod(movementMethod);
    }

    public final void A0D(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        CompoundButton compoundButton = this.A0I;
        if (compoundButton != null) {
            compoundButton.setOnCheckedChangeListener(onCheckedChangeListener);
            if (compoundButton.isEnabled() && this.A0L) {
                A0C(ViewOnClickListenerC55455Ok9.A00(this, 10));
                return;
            }
            return;
        }
        throw AbstractC166987dD.A14("You cannot set a listener until you specify the Textcell type.Please call setTextCellType before calling setOnCheckedChangeListener.");
    }

    public final void A0E(InterfaceC190658cN interfaceC190658cN) {
        if (this.A0I instanceof IgdsSwitch) {
            IgdsSwitch igdsSwitch = this.A0F;
            if (igdsSwitch == null) {
                C14360o3.A0F("igSwitch");
                throw C00O.createAndThrow();
            }
            igdsSwitch.A07 = interfaceC190658cN;
            if (igdsSwitch.isEnabled()) {
                A0C(ViewOnClickListenerC55455Ok9.A00(this, 11));
                return;
            }
            return;
        }
        throw AbstractC166987dD.A14("You cannot set a ToggleListener until you specify the Textcell type as TextCellType.TYPE_SWITCH.Please call setTextCellType before calling setSwitchToggleListener.");
    }

    public final void A0L(boolean z) {
        CompoundButton compoundButton = this.A0I;
        if (compoundButton != null) {
            setTextCellAccessibilityDelegate(z);
            if (compoundButton instanceof IgdsSwitch) {
                IgdsSwitch igdsSwitch = this.A0F;
                if (igdsSwitch == null) {
                    C14360o3.A0F("igSwitch");
                    throw C00O.createAndThrow();
                }
                igdsSwitch.setCheckedAnimated(z);
                return;
            }
            compoundButton.setChecked(z);
        }
    }

    public final IgTextView getDetailView() {
        IgTextView igTextView = this.A04;
        if (igTextView == null) {
            C14360o3.A0F("detailView");
            throw C00O.createAndThrow();
        }
        return igTextView;
    }

    public final IgTextView getSubtitleView() {
        IgTextView igTextView = this.A06;
        if (igTextView == null) {
            C14360o3.A0F("subtitleView");
            throw C00O.createAndThrow();
        }
        return igTextView;
    }

    public final EnumC53237Nga getTextCellType() {
        return this.A0G;
    }

    public final ViewGroup getTextCellView() {
        ViewGroup viewGroup = this.A01;
        if (viewGroup == null) {
            C14360o3.A0F("textCellView");
            throw C00O.createAndThrow();
        }
        return viewGroup;
    }

    public final IgTextView getTitleView() {
        IgTextView igTextView = this.A07;
        if (igTextView == null) {
            C14360o3.A0F("titleView");
            throw C00O.createAndThrow();
        }
        return igTextView;
    }

    @Deprecated(message = "Please do not use this method. We are deprecating this functionality. Use [IgdsListCell#setEnabled(boolean)] instead.")
    public final void setButtonUIEnabled(boolean z) {
        this.A0K = z;
        CompoundButton compoundButton = this.A0I;
        if (compoundButton != null) {
            setEnabled(z);
            FrameLayout frameLayout = this.A02;
            if (frameLayout == null) {
                C14360o3.A0F("rightAddOnContainer");
                throw C00O.createAndThrow();
            }
            frameLayout.setEnabled(z);
            if (!(compoundButton instanceof IgdsSwitch)) {
                float f = 0.3f;
                if (z) {
                    f = 1.0f;
                }
                compoundButton.setAlpha(f);
            }
        }
    }

    public final void setChecked(boolean z) {
        this.A0H = z;
        A01(this, z);
    }

    public void setIconColorContrib(int i) {
        IgImageView igImageView = this.A0B;
        if (igImageView == null) {
            C14360o3.A0F("iconView");
            throw C00O.createAndThrow();
        }
        AbstractC31173DnH.A11(getContext(), igImageView, i);
    }

    public final void setIndex(int i) {
        IgTextView igTextView = this.A05;
        if (igTextView == null) {
            C14360o3.A0F("indexView");
            throw C00O.createAndThrow();
        }
        igTextView.setVisibility(0);
        igTextView.setText(AbstractC166997dE.A0z("%d.", Arrays.copyOf(AbstractC25228BEl.A1Y(i + 1), 1)));
    }

    public final void setSubtitleMaxLine(int i) {
        if (i > 0) {
            IgTextView igTextView = this.A06;
            if (igTextView == null) {
                C14360o3.A0F("subtitleView");
                throw C00O.createAndThrow();
            }
            igTextView.setMaxLines(i);
            igTextView.setEllipsize(TextUtils.TruncateAt.END);
        }
    }

    public final void setTitleMaxLines(int i) {
        if (i > 0) {
            IgTextView igTextView = this.A07;
            if (igTextView == null) {
                C14360o3.A0F("titleView");
                throw C00O.createAndThrow();
            }
            igTextView.setMaxLines(i);
            igTextView.setEllipsize(TextUtils.TruncateAt.END);
        }
    }

    public void setTitleTextColorContrib(int i) {
        IgTextView igTextView = this.A07;
        if (igTextView == null) {
            C14360o3.A0F("titleView");
            throw C00O.createAndThrow();
        }
        AbstractC166987dD.A1O(getContext(), igTextView, i);
    }

    public final void setTitleTextSize(float f) {
        IgTextView igTextView = this.A07;
        if (igTextView == null) {
            C14360o3.A0F("titleView");
            throw C00O.createAndThrow();
        }
        igTextView.setTextSize(0, f);
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x000f, code lost:
    
        if (r3 == false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void setToggleIcon(boolean r3) {
        /*
            r2 = this;
            android.widget.CompoundButton r1 = r2.A0I
            boolean r0 = r1 instanceof com.instagram.igds.components.switchbutton.IgdsSwitch
            if (r0 == 0) goto L14
            com.instagram.igds.components.switchbutton.IgdsSwitch r1 = (com.instagram.igds.components.switchbutton.IgdsSwitch) r1
            if (r1 == 0) goto L14
            boolean r0 = com.instagram.igds.components.switchbutton.IgdsSwitch.A0O
            if (r0 == 0) goto L11
            r0 = 1
            if (r3 != 0) goto L12
        L11:
            r0 = 0
        L12:
            r1.A0A = r0
        L14:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.igds.components.textcell.IgdsListCell.setToggleIcon(boolean):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setTextCellAccessibilityDelegate(boolean z) {
        if (AbstractC56862jK.A00(getContext())) {
            setAccessibilityDelegate(new C50784Mbs(this, z));
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        String str;
        super.setEnabled(z);
        this.A0K = z;
        IgTextView igTextView = this.A06;
        if (igTextView == null) {
            str = "subtitleView";
        } else {
            igTextView.setEnabled(z);
            IgImageView igImageView = this.A08;
            if (igImageView == null) {
                str = "badgeView";
            } else {
                igImageView.setEnabled(z);
                IgTextView igTextView2 = this.A04;
                if (igTextView2 == null) {
                    str = "detailView";
                } else {
                    igTextView2.setEnabled(z);
                    IgImageView igImageView2 = this.A0B;
                    if (igImageView2 == null) {
                        str = "iconView";
                    } else {
                        igImageView2.setEnabled(z);
                        CompoundButton compoundButton = this.A0I;
                        if (compoundButton != null) {
                            compoundButton.setEnabled(z);
                            FrameLayout frameLayout = this.A02;
                            if (frameLayout == null) {
                                str = "rightAddOnContainer";
                            } else {
                                frameLayout.setEnabled(z);
                                if (!(compoundButton instanceof IgdsSwitch) && !AbstractC53182c0.A01(true)) {
                                    float f = 0.3f;
                                    if (z) {
                                        f = 1.0f;
                                    }
                                    compoundButton.setAlpha(f);
                                    return;
                                }
                                return;
                            }
                        } else {
                            return;
                        }
                    }
                }
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    public final void setCheckedChangeEnabled(boolean z) {
        this.A0L = z;
    }

    public final void setToggleEnabledClick(boolean z) {
        setEnabled(z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IgdsListCell(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C14360o3.A0B(context, 1);
        this.A0K = true;
        this.A0G = EnumC53237Nga.A09;
        this.A0L = true;
        CompoundButton compoundButton = this.A0I;
        this.A0H = compoundButton != null ? compoundButton.isChecked() : false;
        CompoundButton compoundButton2 = this.A0I;
        if (compoundButton2 != null) {
            compoundButton2.isEnabled();
        }
        View inflate = AbstractC25228BEl.A0P(this).inflate(R.layout.igds_textcell_layout, this);
        AbstractC43592JPx.A1T(inflate);
        ViewGroup viewGroup = (ViewGroup) inflate;
        this.A01 = viewGroup;
        String str = "textCellView";
        if (viewGroup != null) {
            AbstractC50522MSa.A0y(viewGroup);
            Resources resources = getResources();
            setMinimumHeight((int) resources.getDimension(R.dimen.abc_alert_dialog_button_dimen));
            ViewGroup viewGroup2 = this.A01;
            if (viewGroup2 != null) {
                AbstractC13880nE.A0a(viewGroup2, resources.getDimensionPixelSize(R.dimen.ab_test_media_thumbnail_preview_item_internal_padding));
                ViewGroup viewGroup3 = this.A01;
                if (viewGroup3 != null) {
                    AbstractC13880nE.A0c(viewGroup3, resources.getDimensionPixelSize(R.dimen.ab_test_media_thumbnail_preview_item_internal_padding));
                    ViewGroup viewGroup4 = this.A01;
                    if (viewGroup4 != null) {
                        viewGroup4.setImportantForAccessibility(1);
                        ViewGroup viewGroup5 = this.A01;
                        if (viewGroup5 != null) {
                            viewGroup5.setDescendantFocusability(393216);
                            ViewGroup viewGroup6 = this.A01;
                            if (viewGroup6 != null) {
                                this.A02 = (FrameLayout) viewGroup6.requireViewById(R.id.textcell_add_on_button_container);
                                ViewGroup viewGroup7 = this.A01;
                                if (viewGroup7 != null) {
                                    this.A07 = AbstractC31172DnG.A0X(viewGroup7, R.id.igds_textcell_title);
                                    ViewGroup viewGroup8 = this.A01;
                                    if (viewGroup8 != null) {
                                        this.A06 = AbstractC31172DnG.A0X(viewGroup8, R.id.igds_textcell_subtitle);
                                        ViewGroup viewGroup9 = this.A01;
                                        if (viewGroup9 != null) {
                                            this.A0F = (IgdsSwitch) viewGroup9.requireViewById(R.id.igds_textcell_switch);
                                            ViewGroup viewGroup10 = this.A01;
                                            if (viewGroup10 != null) {
                                                this.A0C = (IgdsRadioButton) viewGroup10.requireViewById(R.id.igds_textcell_radio);
                                                ViewGroup viewGroup11 = this.A01;
                                                if (viewGroup11 != null) {
                                                    this.A03 = (IgProgressBar) viewGroup11.requireViewById(R.id.igds_textcell_progress);
                                                    ViewGroup viewGroup12 = this.A01;
                                                    if (viewGroup12 != null) {
                                                        this.A0D = (IgdsCheckBox) viewGroup12.requireViewById(R.id.igds_textcell_checkbox);
                                                        ViewGroup viewGroup13 = this.A01;
                                                        if (viewGroup13 != null) {
                                                            this.A09 = AbstractC31172DnG.A0Z(viewGroup13, R.id.igds_textcell_chevron);
                                                            ViewGroup viewGroup14 = this.A01;
                                                            if (viewGroup14 != null) {
                                                                this.A0A = AbstractC31172DnG.A0Z(viewGroup14, R.id.igds_textcell_dismiss);
                                                                ViewGroup viewGroup15 = this.A01;
                                                                if (viewGroup15 != null) {
                                                                    this.A0B = AbstractC31172DnG.A0Z(viewGroup15, R.id.igds_textcell_icon);
                                                                    ViewGroup viewGroup16 = this.A01;
                                                                    if (viewGroup16 != null) {
                                                                        this.A08 = AbstractC31172DnG.A0Z(viewGroup16, R.id.igds_textcell_badge);
                                                                        ViewGroup viewGroup17 = this.A01;
                                                                        if (viewGroup17 != null) {
                                                                            this.A04 = AbstractC31172DnG.A0X(viewGroup17, R.id.igds_textcell_detail);
                                                                            ViewGroup viewGroup18 = this.A01;
                                                                            if (viewGroup18 != null) {
                                                                                this.A0E = (IgdsCheckBox) viewGroup18.requireViewById(R.id.igds_textcell_left_checkbox);
                                                                                ViewGroup viewGroup19 = this.A01;
                                                                                if (viewGroup19 != null) {
                                                                                    this.A05 = AbstractC31172DnG.A0X(viewGroup19, R.id.igds_textcell_index);
                                                                                    if (attributeSet != null) {
                                                                                        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC55922hc.A1V);
                                                                                        C14360o3.A07(obtainStyledAttributes);
                                                                                        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
                                                                                        if (resourceId != 0) {
                                                                                            A05(resourceId);
                                                                                        }
                                                                                        int resourceId2 = obtainStyledAttributes.getResourceId(2, 0);
                                                                                        if (resourceId2 != 0) {
                                                                                            A0I(AbstractC166997dE.A0p(context, resourceId2));
                                                                                        }
                                                                                        int resourceId3 = obtainStyledAttributes.getResourceId(1, 0);
                                                                                        if (resourceId3 != 0) {
                                                                                            A0H(AbstractC166997dE.A0p(context, resourceId3));
                                                                                        }
                                                                                        obtainStyledAttributes.recycle();
                                                                                    }
                                                                                    IgTextView igTextView = this.A06;
                                                                                    if (igTextView == null) {
                                                                                        str = "subtitleView";
                                                                                    } else {
                                                                                        igTextView.setImportantForAccessibility(2);
                                                                                        FrameLayout frameLayout = this.A02;
                                                                                        if (frameLayout != null) {
                                                                                            frameLayout.setImportantForAccessibility(4);
                                                                                            return;
                                                                                        }
                                                                                        str = "rightAddOnContainer";
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
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

    public /* synthetic */ IgdsListCell(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, JQ0.A0C(attributeSet, i));
    }
}
