package X;

import android.animation.Animator;
import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.text.Spannable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextSwitcher;
import android.widget.TextView;
import com.facebook.R;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.colorfilter.ColorFilterAlphaImageView;
import com.instagram.ui.widget.framelayout.MediaFrameLayout;
import com.instagram.ui.widget.spinner.SpinnerImageView;
import java.util.List;

/* renamed from: X.3k7, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C81373k7 extends C3OO implements C33R {
    public long A00;
    public TextView A01;
    public TextView A02;
    public InterfaceC41501vz A03;
    public IgSimpleImageView A04;
    public IgSimpleImageView A05;
    public IgTextView A06;
    public IgTextView A07;
    public C5LT A08;
    public C75113Zb A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public final long A0F;
    public final Context A0G;
    public final View A0H;
    public final View A0I;
    public final ViewGroup A0J;
    public final TextSwitcher A0K;
    public final TextView A0L;
    public final TextView A0M;
    public final UserSession A0N;
    public final IgSimpleImageView A0O;
    public final ColorFilterAlphaImageView A0P;
    public final C57012jc A0Q;
    public final InterfaceC76813cT A0R;
    public final C92524Cj A0S;
    public final InterfaceC92464Cd A0T;
    public final C92534Ck A0U;
    public final C92494Cg A0V;
    public final InterfaceC60442pS A0W;
    public final C908843f A0X;
    public final MediaFrameLayout A0Y;
    public final SpinnerImageView A0Z;
    public final boolean A0a;

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0010, code lost:
    
        if (r3.A0C == false) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A01(X.C38321qM r4, X.C75113Zb r5) {
        /*
            r3 = this;
            r0 = 1
            X.C14360o3.A0B(r5, r0)
            if (r4 == 0) goto L18
            java.lang.String r0 = r4.A2s()
        La:
            r2 = 1
            if (r0 == 0) goto L12
            boolean r0 = r3.A0C
            r1 = 1
            if (r0 != 0) goto L13
        L12:
            r1 = 0
        L13:
            boolean r0 = r3.A0B
            if (r0 == 0) goto L1a
            return r1
        L18:
            r0 = 0
            goto La
        L1a:
            boolean r0 = r5.A1i
            if (r0 == 0) goto L25
            boolean r0 = r3.A0A
            if (r0 == 0) goto L25
            if (r1 == 0) goto L25
            return r2
        L25:
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C81373k7.A01(X.1qM, X.3Zb):boolean");
    }

    @Override // X.C33R
    public final void DSJ(C75113Zb c75113Zb, int i) {
        TextView textView;
        int i2;
        C5LS c5ls;
        InterfaceC16660sJ interfaceC16660sJ;
        String str;
        C38321qM c38321qM;
        boolean z;
        int i3;
        View view;
        int i4;
        C2Fb c2Fb;
        Integer num;
        String str2;
        InterfaceC107114sH AtW;
        C14360o3.A0B(c75113Zb, 0);
        C5LU c5lu = null;
        C38321qM c38321qM2 = null;
        C38321qM c38321qM3 = null;
        if (i != 4) {
            if (i != 5) {
                if (i != 14) {
                    if (i != 26) {
                        if (i != 56) {
                            if (i == 76) {
                                Context context = this.A0G;
                                C5LT c5lt = this.A08;
                                if (c5lt != null && this.A0C && this.A0A) {
                                    if (c75113Zb.A1i) {
                                        InterfaceC87803vo BUx = c5lt.A02.A0C.BUx();
                                        if (BUx != null && (AtW = BUx.AtW()) != null) {
                                            str2 = AtW.Aya();
                                        } else {
                                            str2 = null;
                                        }
                                        if (this.A0a) {
                                            CharSequence charSequence = (CharSequence) c5lt.A00.A03.invoke(context);
                                            ViewGroup viewGroup = this.A0J;
                                            Context context2 = viewGroup.getContext();
                                            int dimensionPixelSize = context2.getResources().getDimensionPixelSize(R.dimen.account_group_management_title_text_horizontal_padding);
                                            int dimensionPixelSize2 = context2.getResources().getDimensionPixelSize(R.dimen.container_height);
                                            C14360o3.A0B(charSequence, 0);
                                            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                                            TextView textView2 = this.A02;
                                            textView2.getPaint().setFakeBoldText(!(charSequence instanceof Spannable));
                                            textView2.setText(charSequence);
                                            IgTextView igTextView = this.A07;
                                            igTextView.setText(str2);
                                            Resources resources = viewGroup.getResources();
                                            igTextView.setTextSize(0, resources.getDimensionPixelSize(R.dimen.add_payment_bottom_sheet_row_subtitle_size));
                                            igTextView.setTextAppearance(R.style.PrivacyTextStyle);
                                            AbstractC13880nE.A0Y(igTextView, resources.getDimensionPixelSize(R.dimen.album_music_sticker_text_vertical_padding));
                                            textView2.setAlpha(0.0f);
                                            igTextView.setAlpha(0.0f);
                                            textView2.setVisibility(0);
                                            igTextView.setVisibility(0);
                                            ofFloat.addUpdateListener(new ANQ(this, dimensionPixelSize, dimensionPixelSize2));
                                            ofFloat.addListener(new AbstractC87373uv() { // from class: X.9qM
                                                @Override // X.AbstractC87373uv, android.animation.Animator.AnimatorListener
                                                public final void onAnimationEnd(Animator animator) {
                                                    C81373k7 c81373k7 = C81373k7.this;
                                                    TextView textView3 = c81373k7.A01;
                                                    textView3.setVisibility(8);
                                                    IgTextView igTextView2 = c81373k7.A06;
                                                    igTextView2.setVisibility(8);
                                                    textView3.setAlpha(1.0f);
                                                    igTextView2.setAlpha(1.0f);
                                                }
                                            });
                                            ofFloat.setDuration(this.A0F).start();
                                            return;
                                        }
                                        C5LS c5ls2 = c5lt.A00;
                                        A00(c5lt.A01, c75113Zb, (CharSequence) c5ls2.A03.invoke(context), str2, (List) c5ls2.A00.invoke(), this.A0A, c5lt.A0B);
                                        return;
                                    }
                                    CharSequence charSequence2 = (CharSequence) c5lt.A00.A03.invoke(context);
                                    C14360o3.A0B(charSequence2, 0);
                                    this.A02.setVisibility(8);
                                    this.A07.setVisibility(8);
                                    this.A0K.setVisibility(8);
                                    TextView textView3 = this.A01;
                                    textView3.setText(charSequence2);
                                    textView3.setVisibility(0);
                                    ViewGroup viewGroup2 = this.A0J;
                                    viewGroup2.getLayoutParams().height = viewGroup2.getContext().getResources().getDimensionPixelSize(R.dimen.account_group_management_title_text_horizontal_padding);
                                    C75113Zb c75113Zb2 = this.A09;
                                    if (c75113Zb2 == null) {
                                        return;
                                    }
                                    c75113Zb2.A1C = null;
                                    c75113Zb2.A1f = null;
                                    c75113Zb2.A1E = null;
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        C5LT c5lt2 = this.A08;
                        if (c5lt2 == null) {
                            return;
                        }
                        C92494Cg c92494Cg = this.A0V;
                        C38321qM c38321qM4 = c5lt2.A02;
                        C14360o3.A0B(c38321qM4, 1);
                        c92494Cg.A01(DCP.A00);
                        C006802i c006802i = c92494Cg.A00;
                        if (c006802i != null) {
                            c006802i.markerStart(1056313521);
                            c006802i.markerAnnotate(1056313521, AbstractC111324zv.A00(1353), "NATIVE");
                        }
                        C92494Cg.A00(c92494Cg, c38321qM4);
                        Integer num2 = c75113Zb.A12;
                        if (num2 == null) {
                            return;
                        }
                        int intValue = num2.intValue();
                        if (intValue != 0) {
                            i3 = 8;
                            if (intValue != 1) {
                                if (intValue != 2) {
                                    return;
                                } else {
                                    view = this.A0I;
                                }
                            } else {
                                this.A0I.setVisibility(8);
                                C75113Zb c75113Zb3 = this.A09;
                                if (c75113Zb3 != null && (num = c75113Zb3.A11) != null) {
                                    int intValue2 = num.intValue();
                                    if (intValue2 != 0) {
                                        if (intValue2 == 1) {
                                            c2Fb = C2Fb.A3G;
                                        }
                                    } else {
                                        c2Fb = C2Fb.A3H;
                                    }
                                    c5lt2.A00.A0B.invoke(this.A0T, c75113Zb, c2Fb, this, c75113Zb.A0e);
                                    return;
                                }
                                C0f5 AEp = C18950wb.A01.AEp(AbstractC111324zv.A00(1659), 817903741);
                                AEp.ABW(DialogModule.KEY_MESSAGE, AbstractC111324zv.A00(2586));
                                AEp.report();
                                c2Fb = C2Fb.A3F;
                                c5lt2.A00.A0B.invoke(this.A0T, c75113Zb, c2Fb, this, c75113Zb.A0e);
                                return;
                            }
                        } else {
                            View view2 = this.A0I;
                            view2.setVisibility(0);
                            C92534Ck c92534Ck = this.A0U;
                            boolean z2 = c75113Zb.A28;
                            C92524Cj c92524Cj = c92534Ck.A00;
                            if (z2) {
                                i4 = c92524Cj.A07;
                            } else {
                                i4 = c92524Cj.A08;
                            }
                            view2.setBackgroundColor(i4);
                            return;
                        }
                    } else {
                        i3 = 8;
                        if (c75113Zb.A1t) {
                            this.A0J.setOnTouchListener(null);
                            this.A0P.setVisibility(8);
                            this.A0Z.setVisibility(0);
                            return;
                        }
                        this.A0P.setVisibility(0);
                        view = this.A0Z;
                    }
                    view.setVisibility(i3);
                    return;
                }
                if (!c75113Zb.A28) {
                    return;
                }
                ArgbEvaluator argbEvaluator = AbstractC92514Ci.A00;
                C92524Cj c92524Cj2 = this.A0S;
                C5LT c5lt3 = this.A08;
                if (c5lt3 != null) {
                    c38321qM2 = c5lt3.A02;
                }
                AbstractC92514Ci.A02(c92524Cj2, c38321qM2, new C9EL(this, 47), c75113Zb.A01, c75113Zb.A0S, c75113Zb.A0B);
                return;
            }
            boolean z3 = c75113Zb.A28;
            boolean z4 = true;
            boolean z5 = !c75113Zb.A2O;
            C5LT c5lt4 = this.A08;
            if (c5lt4 != null) {
                if (!c5lt4.A0A) {
                    c38321qM3 = c5lt4.A02;
                }
                AbstractC115685Le.A01(this, z3, z5, z4);
                return;
            }
            if (!A01(c38321qM3, c75113Zb)) {
                z4 = false;
            }
            AbstractC115685Le.A01(this, z3, z5, z4);
            return;
        }
        AbstractC115755Ll.A00().A00();
        C5LT c5lt5 = this.A08;
        if (c5lt5 != null && (c38321qM = c5lt5.A02) != null) {
            InterfaceC76813cT interfaceC76813cT = this.A0R;
            Context context3 = this.A01.getContext();
            C14360o3.A07(context3);
            UserSession userSession = this.A0N;
            CharSequence C5v = interfaceC76813cT.C5v(context3, userSession, c38321qM, c75113Zb);
            C5LT c5lt6 = this.A08;
            if (c5lt6 != null) {
                c5lu = c5lt6.A01;
            }
            CharSequence Brc = interfaceC76813cT.Brc(context3, userSession, c38321qM, this.A0W, c75113Zb);
            List Bre = interfaceC76813cT.Bre(c38321qM, c75113Zb);
            C75113Zb c75113Zb4 = this.A09;
            C5LT c5lt7 = this.A08;
            if (c5lt7 != null) {
                z = c5lt7.A0A;
            } else {
                z = false;
            }
            A00(c5lu, c75113Zb4, C5v, Brc, Bre, z, false);
        } else {
            C0w9.A03("MediaCTABarViewBinder", "Unable to update CTAText because media might be null");
        }
        C5LT c5lt8 = this.A08;
        if (c5lt8 != null && (c5ls = c5lt8.A00) != null && (interfaceC16660sJ = c5ls.A02) != null && (str = (String) interfaceC16660sJ.invoke(this.A0G)) != null) {
            textView = this.A0M;
            textView.setText(str);
            i2 = 0;
        } else {
            textView = this.A0M;
            i2 = 8;
        }
        textView.setVisibility(i2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00e2, code lost:
    
        if ((r16 instanceof X.C123415iG) != false) goto L38;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A00(X.C5LU r16, X.C75113Zb r17, java.lang.CharSequence r18, java.lang.CharSequence r19, java.util.List r20, boolean r21, boolean r22) {
        /*
            Method dump skipped, instructions count: 449
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C81373k7.A00(X.5LU, X.3Zb, java.lang.CharSequence, java.lang.CharSequence, java.util.List, boolean, boolean):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C81373k7(Context context, View view, View view2, View view3, ViewGroup viewGroup, TextSwitcher textSwitcher, TextView textView, TextView textView2, TextView textView3, TextView textView4, UserSession userSession, IgSimpleImageView igSimpleImageView, IgSimpleImageView igSimpleImageView2, IgSimpleImageView igSimpleImageView3, IgTextView igTextView, IgTextView igTextView2, ColorFilterAlphaImageView colorFilterAlphaImageView, C57012jc c57012jc, InterfaceC76813cT interfaceC76813cT, InterfaceC92464Cd interfaceC92464Cd, C92494Cg c92494Cg, InterfaceC60442pS interfaceC60442pS, C908843f c908843f, MediaFrameLayout mediaFrameLayout, SpinnerImageView spinnerImageView) {
        super(view);
        C14360o3.A0B(viewGroup, 7);
        C14360o3.A0B(view2, 8);
        C14360o3.A0B(textView, 9);
        C14360o3.A0B(textView2, 10);
        C14360o3.A0B(textView3, 11);
        C14360o3.A0B(textSwitcher, 12);
        C14360o3.A0B(igTextView, 13);
        C14360o3.A0B(igTextView2, 14);
        C14360o3.A0B(textView4, 16);
        C14360o3.A0B(colorFilterAlphaImageView, 17);
        C14360o3.A0B(spinnerImageView, 18);
        C14360o3.A0B(igSimpleImageView, 19);
        C14360o3.A0B(igSimpleImageView2, 21);
        C14360o3.A0B(igSimpleImageView3, 22);
        C14360o3.A0B(c92494Cg, 25);
        this.A0G = context;
        this.A0N = userSession;
        this.A0W = interfaceC60442pS;
        this.A0R = interfaceC76813cT;
        this.A0T = interfaceC92464Cd;
        this.A0J = viewGroup;
        this.A0I = view2;
        this.A01 = textView;
        this.A02 = textView2;
        this.A0L = textView3;
        this.A0K = textSwitcher;
        this.A06 = igTextView;
        this.A07 = igTextView2;
        this.A0Q = c57012jc;
        this.A0M = textView4;
        this.A0P = colorFilterAlphaImageView;
        this.A0Z = spinnerImageView;
        this.A0O = igSimpleImageView;
        this.A0H = view3;
        this.A04 = igSimpleImageView2;
        this.A05 = igSimpleImageView3;
        this.A0Y = mediaFrameLayout;
        this.A0X = c908843f;
        this.A0V = c92494Cg;
        viewGroup.getContext().getResources().getDimensionPixelSize(R.dimen.account_group_management_title_text_horizontal_padding);
        this.A0S = AbstractC92514Ci.A01(context);
        this.A0U = new C92534Ck(context);
        this.A00 = 4000L;
        C06090Tz c06090Tz = C06090Tz.A05;
        this.A0a = C18U.A06(c06090Tz, userSession, 2342169511891253165L);
        this.A0F = (long) C18U.A00(c06090Tz, userSession, 37170927607611930L);
        this.A01.getPaint().setFakeBoldText(true);
        textView3.getPaint().setFakeBoldText(true);
    }
}
