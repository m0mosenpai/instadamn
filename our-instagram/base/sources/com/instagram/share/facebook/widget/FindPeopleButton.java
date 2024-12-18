package com.instagram.share.facebook.widget;

import X.AbstractC13880nE;
import X.AbstractC166997dE;
import X.AbstractC167007dF;
import X.AbstractC167017dG;
import X.AbstractC25228BEl;
import X.AbstractC31172DnG;
import X.AbstractC31173DnH;
import X.AbstractC31177DnL;
import X.AbstractC53242c7;
import X.AbstractC55922hc;
import X.AbstractC56952jT;
import X.AnonymousClass001;
import X.C00O;
import X.C14360o3;
import X.C1QI;
import X.InterfaceC11380iw;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.R;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;

/* loaded from: classes6.dex */
public class FindPeopleButton extends LinearLayout {
    public int A00;
    public ImageView A01;
    public ImageView A02;
    public LinearLayout A03;
    public TextView A04;
    public TextView A05;
    public TextView A06;
    public CircularImageView A07;
    public GradientSpinnerAvatarView A08;
    public String A09;
    public String A0A;
    public String A0B;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FindPeopleButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C14360o3.A0B(context, 1);
        A01(context, attributeSet);
    }

    public final void setActionButtonOnClickListener(View.OnClickListener onClickListener) {
        C14360o3.A0B(onClickListener, 0);
        LinearLayout linearLayout = this.A03;
        if (linearLayout == null) {
            C14360o3.A0F("container");
            throw C00O.createAndThrow();
        }
        linearLayout.setOnClickListener(onClickListener);
    }

    public final void setAvatar(ImageUrl imageUrl, InterfaceC11380iw interfaceC11380iw) {
        String str;
        AbstractC167007dF.A1K(imageUrl, interfaceC11380iw);
        CircularImageView circularImageView = this.A07;
        if (circularImageView == null) {
            str = PublicKeyCredentialControllerUtility.JSON_KEY_ICON;
        } else {
            circularImageView.setVisibility(8);
            GradientSpinnerAvatarView gradientSpinnerAvatarView = this.A08;
            str = "avatar";
            if (gradientSpinnerAvatarView != null) {
                gradientSpinnerAvatarView.A0F(null, interfaceC11380iw, imageUrl);
                GradientSpinnerAvatarView gradientSpinnerAvatarView2 = this.A08;
                if (gradientSpinnerAvatarView2 != null) {
                    gradientSpinnerAvatarView2.A07();
                    GradientSpinnerAvatarView gradientSpinnerAvatarView3 = this.A08;
                    if (gradientSpinnerAvatarView3 != null) {
                        gradientSpinnerAvatarView3.setVisibility(0);
                        return;
                    }
                }
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    public final void setDismissButtonOnClickListener(View.OnClickListener onClickListener) {
        C14360o3.A0B(onClickListener, 0);
        ImageView imageView = this.A02;
        if (imageView == null) {
            C14360o3.A0F("dismissButton");
            throw C00O.createAndThrow();
        }
        imageView.setOnClickListener(onClickListener);
    }

    private final void A00() {
        String str;
        LinearLayout linearLayout = this.A03;
        if (linearLayout == null) {
            str = "container";
        } else {
            String str2 = this.A0B;
            if (str2 == null) {
                str = "defaultTitle";
            } else {
                String str3 = this.A0A;
                if (str3 == null) {
                    str = "defaultSubtitle";
                } else {
                    linearLayout.setContentDescription(AnonymousClass001.A0g(str2, ", ", str3));
                    return;
                }
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    public final void setChevronButtonVisibility(int i) {
        ImageView imageView = this.A01;
        if (imageView == null) {
            C14360o3.A0F("chevronButton");
            throw C00O.createAndThrow();
        }
        imageView.setVisibility(i);
    }

    public final void setDismissButtonEnabled(boolean z) {
        ImageView imageView = this.A02;
        if (imageView == null) {
            C14360o3.A0F("dismissButton");
            throw C00O.createAndThrow();
        }
        imageView.setVisibility(AbstractC167007dF.A05(z ? 1 : 0));
    }

    public final void setIcon(int i) {
        CircularImageView circularImageView = this.A07;
        if (circularImageView == null) {
            C14360o3.A0F(PublicKeyCredentialControllerUtility.JSON_KEY_ICON);
            throw C00O.createAndThrow();
        }
        AbstractC166997dE.A19(getContext(), circularImageView, i);
    }

    private final void A01(Context context, AttributeSet attributeSet) {
        int resourceId;
        int resourceId2;
        View inflate = AbstractC25228BEl.A0P(this).inflate(R.layout.layout_find_people_button, this);
        this.A03 = AbstractC31172DnG.A0B(inflate, R.id.layout_container_main);
        this.A07 = AbstractC31173DnH.A0T(inflate, R.id.find_people_imageview);
        this.A08 = (GradientSpinnerAvatarView) inflate.requireViewById(R.id.find_people_avatarview);
        this.A06 = AbstractC166997dE.A0T(inflate, R.id.find_people_title);
        this.A05 = AbstractC166997dE.A0T(inflate, R.id.find_people_subtitle);
        this.A04 = AbstractC166997dE.A0T(inflate, R.id.find_people_action_button);
        this.A02 = AbstractC31173DnH.A0I(inflate, R.id.find_people_dismiss_button);
        this.A01 = AbstractC31173DnH.A0I(inflate, R.id.find_people_chevron_button);
        this.A0B = "";
        this.A0A = "";
        this.A09 = "";
        String str = "actionButton";
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC55922hc.A0m);
            C14360o3.A07(obtainStyledAttributes);
            if (obtainStyledAttributes.hasValue(3)) {
                CircularImageView circularImageView = this.A07;
                if (circularImageView != null) {
                    circularImageView.setImageDrawable(obtainStyledAttributes.getDrawable(3));
                }
                C14360o3.A0F(PublicKeyCredentialControllerUtility.JSON_KEY_ICON);
                throw C00O.createAndThrow();
            }
            this.A00 = obtainStyledAttributes.getColor(4, AbstractC53242c7.A01(context));
            int color = obtainStyledAttributes.getColor(6, 0);
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(7, 0);
            CircularImageView circularImageView2 = this.A07;
            if (circularImageView2 != null) {
                circularImageView2.A0H(dimensionPixelSize, color);
                if (obtainStyledAttributes.hasValue(2) && (resourceId2 = obtainStyledAttributes.getResourceId(2, 0)) != 0) {
                    this.A0B = context.getString(resourceId2);
                }
                if (obtainStyledAttributes.hasValue(1) && (resourceId = obtainStyledAttributes.getResourceId(1, 0)) != 0) {
                    this.A0A = context.getString(resourceId);
                }
                if (obtainStyledAttributes.hasValue(0)) {
                    int resourceId3 = obtainStyledAttributes.getResourceId(0, 0);
                    if (resourceId3 != 0) {
                        this.A09 = context.getString(resourceId3);
                    }
                } else {
                    TextView textView = this.A04;
                    if (textView != null) {
                        textView.setVisibility(8);
                    }
                    C14360o3.A0F(str);
                    throw C00O.createAndThrow();
                }
                if (obtainStyledAttributes.hasValue(5)) {
                    int dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(5, 0);
                    CircularImageView circularImageView3 = this.A07;
                    if (circularImageView3 != null) {
                        circularImageView3.setPadding(dimensionPixelSize2, dimensionPixelSize2, dimensionPixelSize2, dimensionPixelSize2);
                    }
                }
                obtainStyledAttributes.recycle();
            }
            C14360o3.A0F(PublicKeyCredentialControllerUtility.JSON_KEY_ICON);
            throw C00O.createAndThrow();
        }
        int A03 = AbstractC167017dG.A03(context);
        TextView textView2 = this.A04;
        if (textView2 != null) {
            AbstractC13880nE.A0i(textView2, A03, A03);
            LinearLayout linearLayout = this.A03;
            if (linearLayout == null) {
                str = "container";
            } else {
                AbstractC56952jT.A01(linearLayout);
                A00();
                TextView textView3 = this.A04;
                if (textView3 != null) {
                    C1QI.A0G(textView3, textView3);
                    return;
                }
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        TextView textView = this.A06;
        String str = DialogModule.KEY_TITLE;
        if (textView != null) {
            Context context = getContext();
            AbstractC31177DnL.A0z(textView, context);
            TextView textView2 = this.A06;
            if (textView2 != null) {
                textView2.getPaint().setFakeBoldText(true);
                TextView textView3 = this.A05;
                String str2 = "subtitle";
                if (textView3 != null) {
                    AbstractC31177DnL.A0y(textView3, context);
                    TextView textView4 = this.A06;
                    if (textView4 != null) {
                        String str3 = this.A0B;
                        if (str3 == null) {
                            str = "defaultTitle";
                        } else {
                            textView4.setText(str3);
                            TextView textView5 = this.A05;
                            if (textView5 != null) {
                                String str4 = this.A0A;
                                if (str4 == null) {
                                    str = "defaultSubtitle";
                                } else {
                                    textView5.setText(str4);
                                    TextView textView6 = this.A04;
                                    if (textView6 == null) {
                                        str2 = "actionButton";
                                    } else {
                                        String str5 = this.A09;
                                        if (str5 == null) {
                                            str = "defaultActionText";
                                        } else {
                                            textView6.setText(str5);
                                            CircularImageView circularImageView = this.A07;
                                            str = PublicKeyCredentialControllerUtility.JSON_KEY_ICON;
                                            if (circularImageView != null) {
                                                if (circularImageView.getDrawable() != null) {
                                                    CircularImageView circularImageView2 = this.A07;
                                                    if (circularImageView2 != null) {
                                                        AbstractC166997dE.A1F(circularImageView2.getDrawable().mutate(), this.A00);
                                                        return;
                                                    }
                                                } else {
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
                C14360o3.A0F(str2);
                throw C00O.createAndThrow();
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    public final void setButtonText(int i) {
        this.A09 = getContext().getString(i);
        TextView textView = this.A04;
        if (textView != null) {
            textView.setText(i);
            TextView textView2 = this.A04;
            if (textView2 != null) {
                textView2.setVisibility(0);
                A00();
                return;
            }
        }
        C14360o3.A0F("actionButton");
        throw C00O.createAndThrow();
    }

    public final void setSubtitle(int i) {
        this.A0A = getContext().getString(i);
        TextView textView = this.A05;
        if (textView == null) {
            C14360o3.A0F("subtitle");
            throw C00O.createAndThrow();
        }
        textView.setText(i);
        A00();
    }

    public final void setTitle(int i) {
        this.A0B = getContext().getString(i);
        TextView textView = this.A06;
        if (textView == null) {
            C14360o3.A0F(DialogModule.KEY_TITLE);
            throw C00O.createAndThrow();
        }
        textView.setText(i);
        A00();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FindPeopleButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C14360o3.A0B(context, 1);
        A01(context, attributeSet);
    }

    public final void setButtonText(String str) {
        C14360o3.A0B(str, 0);
        this.A09 = str;
        TextView textView = this.A04;
        if (textView != null) {
            textView.setText(str);
            TextView textView2 = this.A04;
            if (textView2 != null) {
                textView2.setVisibility(0);
                A00();
                return;
            }
        }
        C14360o3.A0F("actionButton");
        throw C00O.createAndThrow();
    }

    public final void setSubtitle(String str) {
        C14360o3.A0B(str, 0);
        this.A0A = str;
        TextView textView = this.A05;
        if (textView == null) {
            C14360o3.A0F("subtitle");
            throw C00O.createAndThrow();
        }
        textView.setText(str);
        A00();
    }

    public final void setTitle(String str) {
        C14360o3.A0B(str, 0);
        this.A0B = str;
        TextView textView = this.A06;
        if (textView == null) {
            C14360o3.A0F(DialogModule.KEY_TITLE);
            throw C00O.createAndThrow();
        }
        textView.setText(str);
        A00();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FindPeopleButton(Context context) {
        super(context);
        C14360o3.A0B(context, 1);
        A01(context, null);
    }
}
