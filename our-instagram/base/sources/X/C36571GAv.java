package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout;
import com.instagram.igds.components.headline.IgdsHeadline;
import com.instagram.igds.components.switchbutton.IgdsSwitch;
import com.instagram.ui.widget.progressbutton.ProgressButton;

/* renamed from: X.GAv, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36571GAv implements InterfaceC37217GaS {
    public View.OnClickListener A00;
    public View.OnClickListener A01;
    public View A02;
    public View A03;
    public ProgressBar A04;
    public TextView A05;
    public TextView A06;
    public CircularImageView A07;
    public IgdsBottomButtonLayout A08;
    public IgdsHeadline A09;
    public IgdsSwitch A0A;
    public ProgressButton A0B;
    public final AbstractC12990ll A0C;
    public final FRR A0D;
    public final InterfaceC37264GbH A0E;

    public C36571GAv(AbstractC12990ll abstractC12990ll, FRR frr, InterfaceC37264GbH interfaceC37264GbH) {
        C14360o3.A0B(abstractC12990ll, 1);
        this.A0C = abstractC12990ll;
        this.A0E = interfaceC37264GbH;
        this.A0D = frr;
    }

    @Override // X.InterfaceC37217GaS
    public final /* bridge */ /* synthetic */ void E0T(Context context, View view, Object obj) {
        C14360o3.A0B(view, 1);
        this.A04 = (ProgressBar) view.requireViewById(R.id.add_photo_progress_spinner);
        this.A03 = view.requireViewById(R.id.share_profile_photo_to_feed_container);
        this.A0A = (IgdsSwitch) view.requireViewById(R.id.share_profile_photo_to_feed_switch);
        this.A09 = AbstractC31179DnN.A0Q(view, R.id.field_title_igds);
        this.A07 = AbstractC31173DnH.A0T(view, R.id.add_photo_view);
        this.A0B = (ProgressButton) view.requireViewById(R.id.progress_button);
        this.A06 = AbstractC166997dE.A0T(view, R.id.skip_button);
        this.A05 = AbstractC166997dE.A0T(view, R.id.row_header);
        this.A02 = view.requireViewById(R.id.row_divider);
        this.A08 = AbstractC31172DnG.A0j(view, R.id.action_button);
        this.A01 = new ViewOnClickListenerC35667Fp2(this, 38);
        this.A00 = new ViewOnClickListenerC35667Fp2(this, 39);
        CircularImageView circularImageView = this.A07;
        String str = "avatarView";
        if (circularImageView != null) {
            circularImageView.setStrokeAlpha(0);
            CircularImageView circularImageView2 = this.A07;
            if (circularImageView2 != null) {
                View.OnClickListener onClickListener = this.A01;
                if (onClickListener != null) {
                    C0fQ.A00(onClickListener, circularImageView2);
                    boolean A0I = C14640oc.A0I(this.A0C);
                    str = "skipButton";
                    IgdsBottomButtonLayout igdsBottomButtonLayout = this.A08;
                    if (A0I) {
                        if (igdsBottomButtonLayout != null) {
                            View.OnClickListener onClickListener2 = this.A01;
                            if (onClickListener2 != null) {
                                igdsBottomButtonLayout.setPrimaryActionOnClickListener(onClickListener2);
                                IgdsBottomButtonLayout igdsBottomButtonLayout2 = this.A08;
                                if (igdsBottomButtonLayout2 != null) {
                                    igdsBottomButtonLayout2.setSecondaryActionOnClickListener(new ViewOnClickListenerC35667Fp2(this, 40));
                                    IgdsBottomButtonLayout igdsBottomButtonLayout3 = this.A08;
                                    if (igdsBottomButtonLayout3 != null) {
                                        igdsBottomButtonLayout3.setDividerVisible(true);
                                        ProgressButton progressButton = this.A0B;
                                        if (progressButton != null) {
                                            progressButton.setVisibility(8);
                                            TextView textView = this.A06;
                                            if (textView != null) {
                                                textView.setVisibility(8);
                                                return;
                                            }
                                        }
                                        C14360o3.A0F("progressButton");
                                    }
                                }
                            }
                        }
                        C14360o3.A0F("actionButtonLayout");
                    } else {
                        if (igdsBottomButtonLayout != null) {
                            igdsBottomButtonLayout.setVisibility(8);
                            ProgressButton progressButton2 = this.A0B;
                            if (progressButton2 != null) {
                                View.OnClickListener onClickListener3 = this.A01;
                                if (onClickListener3 != null) {
                                    C0fQ.A00(onClickListener3, progressButton2);
                                    TextView textView2 = this.A06;
                                    if (textView2 != null) {
                                        ViewOnClickListenerC35667Fp2.A00(textView2, 41, this);
                                        return;
                                    }
                                }
                            }
                            C14360o3.A0F("progressButton");
                        }
                        C14360o3.A0F("actionButtonLayout");
                    }
                    throw C00O.createAndThrow();
                }
                C14360o3.A0F("showCaptureFlowDialogClickListener");
                throw C00O.createAndThrow();
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC37217GaS
    public final /* bridge */ /* synthetic */ void CxX(Context context, Object obj) {
        ProgressBar progressBar = this.A04;
        if (progressBar == null) {
            C14360o3.A0F("addPhotoProgressSpinner");
            throw C00O.createAndThrow();
        }
        progressBar.setVisibility(8);
    }

    @Override // X.InterfaceC37217GaS
    public final /* bridge */ /* synthetic */ void D9w(Context context, Object obj) {
        String str;
        IgdsHeadline igdsHeadline = this.A09;
        if (igdsHeadline == null) {
            str = "headline";
        } else {
            igdsHeadline.setOnClickListener(null);
            ProgressButton progressButton = this.A0B;
            if (progressButton == null) {
                str = "progressButton";
            } else {
                progressButton.setOnClickListener(null);
                TextView textView = this.A06;
                if (textView == null) {
                    str = "skipButton";
                } else {
                    textView.setOnClickListener(null);
                    return;
                }
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC37217GaS
    public final /* bridge */ /* synthetic */ void FAR(Context context, Object obj) {
        IgdsBottomButtonLayout igdsBottomButtonLayout;
        String str;
        FO2 fo2 = (FO2) obj;
        C14360o3.A0B(fo2, 1);
        String str2 = "skipButton";
        int i = 0;
        String str3 = "sharePhotoToFeedContainer";
        if (fo2.A00 == null) {
            View view = this.A03;
            if (view != null) {
                view.setVisibility(8);
                CircularImageView circularImageView = this.A07;
                if (circularImageView != null) {
                    circularImageView.setBackgroundResource(R.drawable.reg_photo);
                    CircularImageView circularImageView2 = this.A07;
                    if (circularImageView2 != null) {
                        int A07 = AbstractC53242c7.A07(context);
                        AbstractC25231BEo.A0x(circularImageView2.getContext(), circularImageView2.getBackground().mutate(), A07);
                        if (C14640oc.A0I(this.A0C)) {
                            IgdsBottomButtonLayout igdsBottomButtonLayout2 = this.A08;
                            if (igdsBottomButtonLayout2 != null) {
                                igdsBottomButtonLayout2.setPrimaryActionText(context.getResources().getString(2131952345));
                                igdsBottomButtonLayout = this.A08;
                                if (igdsBottomButtonLayout != null) {
                                    str = context.getResources().getString(2131974123);
                                    igdsBottomButtonLayout.setSecondaryActionText(str);
                                    return;
                                }
                            }
                            C14360o3.A0F("actionButtonLayout");
                        } else {
                            ProgressButton progressButton = this.A0B;
                            if (progressButton != null) {
                                progressButton.setText(2131952345);
                                ProgressButton progressButton2 = this.A0B;
                                if (progressButton2 != null) {
                                    View.OnClickListener onClickListener = this.A01;
                                    if (onClickListener == null) {
                                        str2 = "showCaptureFlowDialogClickListener";
                                    } else {
                                        C0fQ.A00(onClickListener, progressButton2);
                                        TextView textView = this.A06;
                                        if (textView != null) {
                                            textView.setVisibility(0);
                                            return;
                                        }
                                    }
                                    C14360o3.A0F(str2);
                                }
                            }
                            C14360o3.A0F("progressButton");
                        }
                    }
                }
                C14360o3.A0F("avatarView");
            }
            C14360o3.A0F(str3);
        } else {
            CircularImageView circularImageView3 = this.A07;
            if (circularImageView3 != null) {
                circularImageView3.setBackground(null);
                View view2 = this.A03;
                if (view2 != null) {
                    boolean A1N = AbstractC167007dF.A1N(view2.getVisibility());
                    View view3 = this.A03;
                    if (view3 != null) {
                        boolean z = fo2.A03;
                        InterfaceC37264GbH interfaceC37264GbH = this.A0E;
                        if (!z && interfaceC37264GbH == null) {
                            i = 8;
                        }
                        view3.setVisibility(i);
                        if (!A1N) {
                            View view4 = this.A03;
                            if (view4 != null) {
                                if (view4.getVisibility() == 0) {
                                    IgdsSwitch igdsSwitch = this.A0A;
                                    if (igdsSwitch == null) {
                                        str2 = "sharePhotoToFeedSwitch";
                                        C14360o3.A0F(str2);
                                    } else {
                                        igdsSwitch.setChecked(true);
                                    }
                                }
                            }
                        }
                        str3 = "nextListener";
                        if (C14640oc.A0I(this.A0C)) {
                            IgdsBottomButtonLayout igdsBottomButtonLayout3 = this.A08;
                            if (igdsBottomButtonLayout3 != null) {
                                String string = context.getResources().getString(2131968535);
                                View.OnClickListener onClickListener2 = this.A00;
                                if (onClickListener2 != null) {
                                    igdsBottomButtonLayout3.setPrimaryAction(string, onClickListener2);
                                    igdsBottomButtonLayout = this.A08;
                                    if (igdsBottomButtonLayout != null) {
                                        str = "";
                                        igdsBottomButtonLayout.setSecondaryActionText(str);
                                        return;
                                    }
                                }
                            }
                            C14360o3.A0F("actionButtonLayout");
                        } else {
                            ProgressButton progressButton3 = this.A0B;
                            if (progressButton3 != null) {
                                progressButton3.setText(2131968535);
                                ProgressButton progressButton4 = this.A0B;
                                if (progressButton4 != null) {
                                    View.OnClickListener onClickListener3 = this.A00;
                                    if (onClickListener3 != null) {
                                        C0fQ.A00(onClickListener3, progressButton4);
                                        TextView textView2 = this.A06;
                                        if (textView2 != null) {
                                            textView2.setVisibility(8);
                                            return;
                                        }
                                        C14360o3.A0F(str2);
                                    }
                                }
                            }
                            C14360o3.A0F("progressButton");
                        }
                    }
                }
                C14360o3.A0F(str3);
            }
            C14360o3.A0F("avatarView");
        }
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC37217GaS
    public final /* bridge */ /* synthetic */ void FBq(Context context, Object obj) {
        FO2 fo2 = (FO2) obj;
        C14360o3.A0B(fo2, 1);
        CircularImageView circularImageView = this.A07;
        String str = "avatarView";
        if (circularImageView != null) {
            circularImageView.setImageBitmap(fo2.A00);
            Bitmap bitmap = fo2.A00;
            CircularImageView circularImageView2 = this.A07;
            if (bitmap != null) {
                if (circularImageView2 != null) {
                    circularImageView2.setStrokeAlpha(circularImageView2.A00);
                    return;
                }
            } else if (circularImageView2 != null) {
                circularImageView2.setStrokeAlpha(0);
                ProgressBar progressBar = this.A04;
                if (progressBar == null) {
                    str = "addPhotoProgressSpinner";
                } else {
                    progressBar.setVisibility(8);
                    return;
                }
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC37217GaS
    public final /* bridge */ /* synthetic */ void FCd(Context context, UserSession userSession, Object obj) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        FO2 fo2 = (FO2) obj;
        AbstractC167017dG.A1P(fo2, userSession);
        Bitmap bitmap = fo2.A00;
        String str = "headline";
        IgdsHeadline igdsHeadline = this.A09;
        if (bitmap != null) {
            if (igdsHeadline != null) {
                igdsHeadline.setHeadline(2131970225);
                IgdsHeadline igdsHeadline2 = this.A09;
                if (igdsHeadline2 != null) {
                    igdsHeadline2.setBody(0);
                    IgdsHeadline igdsHeadline3 = this.A09;
                    if (igdsHeadline3 != null) {
                        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.account_discovery_bottom_gap);
                        int A04 = AbstractC166997dE.A04(context, R.dimen.account_discovery_bottom_gap);
                        View A0S = AbstractC166997dE.A0S(igdsHeadline3, R.id.igds_headline_link);
                        ViewGroup.LayoutParams layoutParams = A0S.getLayoutParams();
                        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                            marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                            if (marginLayoutParams != null) {
                                marginLayoutParams.setMargins(0, dimensionPixelSize, 0, A04);
                            }
                        } else {
                            marginLayoutParams = null;
                        }
                        A0S.setLayoutParams(marginLayoutParams);
                        IgdsHeadline igdsHeadline4 = this.A09;
                        if (igdsHeadline4 != null) {
                            String string = context.getResources().getString(2131955024);
                            View.OnClickListener onClickListener = this.A01;
                            if (onClickListener == null) {
                                str = "showCaptureFlowDialogClickListener";
                            } else {
                                igdsHeadline4.setAction(string, onClickListener);
                                if (C18U.A06(C06090Tz.A06, userSession, 36315378712186030L)) {
                                    String A0p = AbstractC166997dE.A0p(context, 2131965052);
                                    android.net.Uri A0B = AbstractC25227BEk.A0B(AbstractC63260SgI.A01(context, "https://help.instagram.com/557544397610546?ref=igapp"));
                                    Spanned A0B2 = AbstractC31173DnH.A0B(context.getResources(), A0p, 2131952347);
                                    C14360o3.A07(A0B2);
                                    SpannableStringBuilder A0H = AbstractC25225BEi.A0H(SpannableString.valueOf(A0B2));
                                    AnonymousClass773.A05(A0H, new C50761MbS(A0B), A0p);
                                    TextView textView = this.A05;
                                    str = "headerView";
                                    if (textView != null) {
                                        textView.setText(A0H);
                                        TextView textView2 = this.A05;
                                        if (textView2 != null) {
                                            AbstractC25227BEk.A11(textView2);
                                            TextView textView3 = this.A05;
                                            if (textView3 != null) {
                                                textView3.setVisibility(0);
                                                View view = this.A02;
                                                if (view == null) {
                                                    str = "divider";
                                                } else {
                                                    view.setVisibility(0);
                                                    return;
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    return;
                                }
                            }
                        }
                    }
                }
            }
        } else if (igdsHeadline != null) {
            igdsHeadline.setHeadline(2131952349);
            IgdsHeadline igdsHeadline5 = this.A09;
            if (igdsHeadline5 != null) {
                igdsHeadline5.setBody(2131952348);
                IgdsHeadline igdsHeadline6 = this.A09;
                if (igdsHeadline6 != null) {
                    igdsHeadline6.setOnClickListener(null);
                    return;
                }
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }
}
