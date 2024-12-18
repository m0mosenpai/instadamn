package com.instagram.creation.base.ui.mediaeditactionbar;

import X.AbstractC111324zv;
import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167007dF;
import X.AbstractC25651Mw;
import X.AbstractC31172DnG;
import X.AbstractC31173DnH;
import X.AbstractC31176DnK;
import X.AbstractC43591JPw;
import X.AbstractC43841Ja4;
import X.AbstractC53242c7;
import X.C05F;
import X.C0f9;
import X.C14360o3;
import X.C25671My;
import X.C30D;
import X.C3DW;
import X.C50693MZn;
import X.C50698MZt;
import X.EnumC53183Nff;
import X.InterfaceC189628ah;
import X.InterfaceC41501vz;
import X.InterfaceC57812Pke;
import X.InterfaceC57821Pkn;
import X.ViewOnClickListenerC55457OkB;
import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.ViewSwitcher;
import com.facebook.R;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.creation.activity.MediaCaptureActivity;
import com.instagram.ui.widget.trianglespinner.TriangleSpinner;

/* loaded from: classes9.dex */
public final class MediaEditActionBar extends ViewSwitcher implements InterfaceC41501vz {
    public InterfaceC57812Pke A00;
    public boolean A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public TextView A06;
    public boolean A07;
    public final View A08;
    public final View A09;
    public final LinearLayout A0A;
    public final TextView A0B;
    public final IgSimpleImageView A0C;
    public final TriangleSpinner A0D;
    public final Paint A0E;
    public final C25671My A0F;
    public final boolean A0G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public MediaEditActionBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C14360o3.A0B(context, 1);
        Context context2 = getContext();
        C14360o3.A0C(context2, AbstractC43591JPw.A00(1207));
        this.A0F = AbstractC25651Mw.A00(((InterfaceC189628ah) context2).CE4());
        View inflate = LayoutInflater.from(context).inflate(R.layout.media_edit_action_bar, this);
        C14360o3.A07(inflate);
        this.A08 = inflate;
        this.A0C = AbstractC31176DnK.A0T(this, R.id.button_back);
        TextView textView = null;
        setBackButtonClickListener(null);
        TextView A0T = AbstractC166997dE.A0T(this, R.id.action_bar_textview_title);
        this.A0B = A0T;
        this.A0D = (TriangleSpinner) findViewById(R.id.user_spinner);
        this.A09 = AbstractC43841Ja4.A00(null, this, C05F.A01, false);
        C14360o3.A07(context2);
        boolean A04 = AbstractC43841Ja4.A04(context2);
        this.A0G = A04;
        A0T.setAccessibilityHeading(true);
        Paint A0R = AbstractC166987dD.A0R();
        this.A0E = A0R;
        A0R.setColor(AbstractC53242c7.A0F(context2, R.attr.creationDividerColor));
        A0R.setStyle(Paint.Style.STROKE);
        A0R.setStrokeWidth(1.0f);
        if (!A04) {
            FrameLayout frameLayout = new FrameLayout(context2);
            View inflate2 = LayoutInflater.from(context).inflate(R.layout.accept_reject_edit_buttons_small, (ViewGroup) frameLayout, false);
            inflate2.setId(R.id.primary_accept_buttons);
            View inflate3 = LayoutInflater.from(context).inflate(R.layout.accept_reject_edit_buttons_small, (ViewGroup) frameLayout, false);
            inflate3.setId(R.id.secondary_accept_buttons);
            setupDividers(inflate2);
            setupDividers(inflate3);
            frameLayout.addView(inflate2);
            frameLayout.addView(inflate3);
            addView(frameLayout);
            textView = AbstractC166987dD.A0e(requireViewById(R.id.primary_accept_buttons), R.id.adjust_title);
        }
        this.A06 = textView;
        LinearLayout linearLayout = new LinearLayout(context2);
        this.A0A = linearLayout;
        linearLayout.setId(R.id.creation_secondary_actions);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -1, 1.0f);
        View childAt = getChildAt(0);
        C14360o3.A0C(childAt, AbstractC111324zv.A00(4));
        ((ViewGroup) childAt).addView(linearLayout, 1, layoutParams);
        A0T.setVisibility(8);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        C14360o3.A0B(canvas, 0);
        super.dispatchDraw(canvas);
        if (this.A01) {
            float bottom = getBottom() - 1;
            canvas.drawLine(getLeft(), bottom, getRight(), bottom, this.A0E);
        }
    }

    public final void setIsDarkModeEnabled(boolean z) {
        this.A02 = true;
    }

    public static /* synthetic */ void setBackButtonClickListener$default(MediaEditActionBar mediaEditActionBar, View.OnClickListener onClickListener, int i, Object obj) {
        if ((i & 1) != 0) {
            onClickListener = null;
        }
        mediaEditActionBar.setBackButtonClickListener(onClickListener);
    }

    public final void A01() {
        TextView textView;
        TriangleSpinner triangleSpinner;
        setupBackButton(EnumC53183Nff.A02);
        boolean z = this.A03;
        View view = this.A09;
        if (!z) {
            view.setVisibility(8);
            this.A05 = false;
        } else {
            view.setVisibility(0);
        }
        this.A0A.setVisibility(8);
        if (this.A04) {
            textView = this.A0B;
            textView.setText(2131968470);
            textView.setVisibility(0);
            triangleSpinner = this.A0D;
            if (triangleSpinner == null) {
                throw AbstractC166987dD.A14("Required value was null.");
            }
        } else {
            if (this.A05) {
                textView = this.A0B;
                textView.setVisibility(8);
                TriangleSpinner triangleSpinner2 = this.A0D;
                if (triangleSpinner2 != null) {
                    triangleSpinner2.setVisibility(0);
                    Context context = getContext();
                    int color = context.getColor(AbstractC53242c7.A07(context));
                    AbstractC31172DnG.A1B(context, this.A08, AbstractC53242c7.A0D(context));
                    IgSimpleImageView igSimpleImageView = this.A0C;
                    igSimpleImageView.setBackgroundResource(R.drawable.igds_action_bar_default_button_background);
                    textView.setTextColor(color);
                    igSimpleImageView.setColorFilter(color);
                }
                throw AbstractC166987dD.A14("Required value was null.");
            }
            boolean z2 = this.A07;
            textView = this.A0B;
            int i = 2131973680;
            if (z2) {
                i = 2131968471;
            }
            textView.setText(i);
            textView.setVisibility(0);
            triangleSpinner = this.A0D;
            if (triangleSpinner == null) {
                throw AbstractC166987dD.A14("Required value was null.");
            }
        }
        triangleSpinner.setVisibility(8);
        Context context2 = getContext();
        int color2 = context2.getColor(AbstractC53242c7.A07(context2));
        AbstractC31172DnG.A1B(context2, this.A08, AbstractC53242c7.A0D(context2));
        IgSimpleImageView igSimpleImageView2 = this.A0C;
        igSimpleImageView2.setBackgroundResource(R.drawable.igds_action_bar_default_button_background);
        textView.setTextColor(color2);
        igSimpleImageView2.setColorFilter(color2);
    }

    public final void A03(String str, boolean z) {
        TextView textView;
        if (!z) {
            if (!this.A01) {
                this.A01 = true;
                invalidate();
            }
            this.A09.setVisibility(8);
            TriangleSpinner triangleSpinner = this.A0D;
            if (triangleSpinner != null) {
                triangleSpinner.setVisibility(8);
            } else {
                throw AbstractC166987dD.A14("Required value was null.");
            }
        }
        if (this.A0G) {
            textView = this.A0B;
            textView.setText(str);
            textView.setVisibility(0);
            this.A0A.setVisibility(8);
            if (!this.A02) {
                return;
            }
        } else {
            TextView textView2 = this.A06;
            if (textView2 != null) {
                textView2.setText(str);
                if (str != null) {
                    setDisplayedChild(1);
                    if (!this.A02) {
                        return;
                    } else {
                        textView = this.A0B;
                    }
                } else {
                    setDisplayedChild(0);
                    return;
                }
            } else {
                throw AbstractC166987dD.A14("Required value was null.");
            }
        }
        Context context = getContext();
        AbstractC166987dD.A1O(context, textView, AbstractC53242c7.A0E(context));
    }

    public final LinearLayout getSecondaryActionsView() {
        return this.A0A;
    }

    public final TriangleSpinner getUserSpinner() {
        return this.A0D;
    }

    public final void setBackButtonClickListener(View.OnClickListener onClickListener) {
        ViewOnClickListenerC55457OkB A00 = ViewOnClickListenerC55457OkB.A00(this, 9);
        IgSimpleImageView igSimpleImageView = this.A0C;
        if (onClickListener == null) {
            onClickListener = A00;
        }
        igSimpleImageView.setOnClickListener(onClickListener);
    }

    public final void setBackButtonVisibility(int i) {
        this.A0C.setVisibility(i);
    }

    public final void setIsQuietPostingFlow(boolean z) {
        this.A07 = z;
        A01();
    }

    public final void setupBackButton(EnumC53183Nff enumC53183Nff) {
        IgSimpleImageView igSimpleImageView;
        Context context;
        int i;
        int A0H;
        if (enumC53183Nff != null) {
            int ordinal = enumC53183Nff.ordinal();
            if (ordinal != 0) {
                if (ordinal != 7) {
                    if (ordinal != 3) {
                        if (ordinal != 4) {
                            if (ordinal == 5) {
                                setBackButtonVisibility(8);
                            }
                        } else {
                            igSimpleImageView = this.A0C;
                            A0H = R.drawable.instagram_check_pano_filled_24;
                        }
                    } else {
                        igSimpleImageView = this.A0C;
                        A0H = R.drawable.instagram_x_pano_outline_24;
                    }
                    igSimpleImageView.setImageResource(A0H);
                } else {
                    igSimpleImageView = this.A0C;
                    context = getContext();
                    i = R.attr.backButtonCarrotIcon;
                }
            } else {
                igSimpleImageView = this.A0C;
                context = getContext();
                i = R.attr.backButtonIcon;
            }
            A0H = AbstractC53242c7.A0H(context, i);
            igSimpleImageView.setImageResource(A0H);
        }
        if (this.A02) {
            IgSimpleImageView igSimpleImageView2 = this.A0C;
            Context context2 = getContext();
            AbstractC31173DnH.A11(context2, igSimpleImageView2, AbstractC53242c7.A0A(context2));
        }
    }

    private final void setupDividers(View view) {
        View requireViewById = view.requireViewById(R.id.button_cancel_adjust);
        Context context = getContext();
        Resources.Theme theme = context.getTheme();
        C14360o3.A07(theme);
        Integer num = C05F.A00;
        requireViewById.setBackground(new C3DW(theme, num));
        View requireViewById2 = view.requireViewById(R.id.button_accept_adjust);
        Resources.Theme theme2 = context.getTheme();
        C14360o3.A07(theme2);
        requireViewById2.setBackground(new C3DW(theme2, num));
    }

    public final void A00() {
        Context context = getContext();
        int A09 = AbstractC167007dF.A09(context, R.attr.igds_color_media_background);
        C30D.A04((Activity) context, A09);
        this.A08.setBackgroundColor(A09);
        IgSimpleImageView igSimpleImageView = this.A0C;
        igSimpleImageView.setBackgroundResource(R.drawable.igds_action_bar_default_button_background_night);
        AbstractC31173DnH.A11(context, igSimpleImageView, AbstractC53242c7.A0A(context));
        this.A02 = true;
    }

    public final void A02(int i, boolean z) {
        setBackButtonVisibility(i);
        this.A0A.setVisibility(i);
        if (z) {
            this.A09.setVisibility(i);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        int A06 = C0f9.A06(1311023865);
        super.onAttachedToWindow();
        Object context = getContext();
        C14360o3.A0C(context, "null cannot be cast to non-null type com.instagram.creation.state.StateMachineProvider");
        MediaCaptureActivity mediaCaptureActivity = (MediaCaptureActivity) ((InterfaceC57821Pkn) context);
        C50693MZn c50693MZn = mediaCaptureActivity.A0A;
        if (c50693MZn == null) {
            mediaCaptureActivity.A0M.add(this);
        } else {
            c50693MZn.A01(this);
        }
        C0f9.A0D(-464394390, A06);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        int A06 = C0f9.A06(-49481709);
        super.onDetachedFromWindow();
        this.A0F.A02(this, C50698MZt.class);
        this.A00 = null;
        C0f9.A0D(-1598417570, A06);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0022, code lost:
    
        if (r7 == com.instagram.creation.state.CreationState.A02) goto L8;
     */
    @Override // X.InterfaceC41501vz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ void onEvent(java.lang.Object r9) {
        /*
            Method dump skipped, instructions count: 482
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creation.base.ui.mediaeditactionbar.MediaEditActionBar.onEvent(java.lang.Object):void");
    }

    public final void setIsDraftShare(boolean z) {
        this.A03 = z;
    }

    public final void setIsProfilePhoto(boolean z) {
        this.A04 = z;
    }

    public final void setListener(InterfaceC57812Pke interfaceC57812Pke) {
        this.A00 = interfaceC57812Pke;
    }

    public final void setShouldShowUserSpinner(boolean z) {
        this.A05 = z;
    }
}
