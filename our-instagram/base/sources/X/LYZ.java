package X;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.facebook.R;
import com.facebook.litho.LithoView;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;
import com.instagram.ui.widget.textview.ComposerAutoCompleteTextView;
import com.instagram.ui.widget.textview.IgAutoCompleteTextView;
import com.instagram.user.model.User;
import java.util.List;
import java.util.Map;

/* loaded from: classes8.dex */
public final class LYZ implements InterfaceC60602pj, InterfaceC168087f3, InterfaceC58140Pq5, InterfaceC58139Pq4, C7OC {
    public int A00;
    public C168077f2 A01;
    public L8I A02;
    public C38321qM A03;
    public TextWatcher A04;
    public View A05;
    public boolean A06;
    public final int A07;
    public final int A08;
    public final int A09;
    public final Context A0A;
    public final View.OnLayoutChangeListener A0B;
    public final AbstractC59962oe A0C;
    public final InterfaceC58139Pq4 A0D;
    public final UserSession A0E;
    public final AbstractC13100lw A0F;
    public final C84923qg A0G;
    public final InterfaceC60442pS A0H;
    public final C57382kD A0I;
    public final C1M1 A0J;
    public final boolean A0K;
    public final C675432t A0L;
    public final FQP A0M;
    public final C41761wQ A0N;
    public final CharSequence A0O;
    public final String A0P;
    public final boolean A0Q;

    public LYZ(Context context, AbstractC59962oe abstractC59962oe, C675432t c675432t, InterfaceC58139Pq4 interfaceC58139Pq4, UserSession userSession, C84923qg c84923qg, InterfaceC60442pS interfaceC60442pS, C1M1 c1m1, CharSequence charSequence, String str, int i, int i2, int i3, boolean z, boolean z2) {
        C14360o3.A0B(userSession, 2);
        this.A0A = context;
        this.A0E = userSession;
        this.A0C = abstractC59962oe;
        this.A0P = str;
        this.A0D = interfaceC58139Pq4;
        this.A0H = interfaceC60442pS;
        this.A0L = c675432t;
        this.A0J = c1m1;
        this.A0O = charSequence;
        this.A0Q = z;
        this.A0K = z2;
        this.A08 = i;
        this.A07 = i2;
        this.A09 = i3;
        this.A0I = new C57382kD(userSession);
        this.A0N = AbstractC31173DnH.A0S();
        this.A0B = new LQ9(this, 1);
        this.A0F = new NG3(this, 0);
        this.A0M = new FQP(userSession, this);
        this.A0G = c84923qg;
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x01c0, code lost:
    
        if (r3.isSponsoredEligible() == false) goto L69;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A03(X.LYZ r38) {
        /*
            Method dump skipped, instructions count: 875
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.LYZ.A03(X.LYZ):void");
    }

    public final boolean A08() {
        A06(false);
        if (TextUtils.getTrimmedLength(A07()) == 0) {
            L8I l8i = this.A02;
            if (l8i != null) {
                View view = l8i.A00;
                if (view != null) {
                    view.setEnabled(false);
                }
                l8i.A08.setEnabled(false);
                return false;
            }
        } else {
            L8I l8i2 = this.A02;
            if (l8i2 != null) {
                View view2 = l8i2.A00;
                if (view2 != null) {
                    if (view2.getVisibility() == 8) {
                        if (C18U.A06(C06090Tz.A05, l8i2.A0B, 36322967919012627L)) {
                            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                            C14360o3.A0C(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
                            layoutParams2.gravity = 80;
                            ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin = (int) AbstractC13690mv.A00(AbstractC166997dE.A0L(view2), 10.0f);
                            view2.setLayoutParams(layoutParams2);
                        }
                        if (view2 instanceof IgSimpleImageView) {
                            ImageView imageView = (ImageView) view2;
                            Drawable drawable = imageView.getDrawable();
                            Context A0L = AbstractC166997dE.A0L(imageView);
                            drawable.setTint(C1QI.A0C(A0L, null).getDefaultColor());
                            imageView.setBackgroundTintList(C1QI.A0B(A0L, null));
                        }
                        AbstractC125325le A01 = AbstractC125325le.A01(view2, 0);
                        A01.A0U(0.75f, 1.0f, -1.0f);
                        A01.A0V(0.75f, 1.0f, -1.0f);
                        A01.A0F(true).A0E(C55942hf.A04(90.0d, 1.0d)).A0H();
                    }
                    view2.setVisibility(0);
                }
                L8I l8i3 = this.A02;
                if (l8i3 != null) {
                    View view3 = l8i3.A00;
                    if (view3 != null) {
                        view3.setEnabled(true);
                    }
                    l8i3.A08.setEnabled(true);
                    return true;
                }
            }
        }
        C14360o3.A0F("viewHolder");
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void ADK(View view) {
    }

    @Override // X.InterfaceC60602pj
    public final void D8S(View view) {
        C14360o3.A0B(view, 0);
        UserSession userSession = this.A0E;
        this.A02 = new L8I(view, this.A0C, userSession, this);
        LXG lxg = new LXG(this);
        Context context = this.A0A;
        InterfaceC60442pS interfaceC60442pS = this.A0H;
        this.A01 = new C168077f2(context, new C168067f1(interfaceC60442pS, userSession), lxg, userSession, this.A0J, new C50368MLv(this, 16), new C30712DfA(this, 37));
        this.A04 = new C168107f5(new LXF(this));
        L8I l8i = this.A02;
        if (l8i != null) {
            l8i.A0D.setOnEditorActionListener(new LRL(this, 0));
            L8I l8i2 = this.A02;
            if (l8i2 != null) {
                l8i2.A0D.setSingleLine(true);
                L8I l8i3 = this.A02;
                if (l8i3 != null) {
                    AbstractC168117f6.A00(userSession, l8i3.A0D);
                    L8I l8i4 = this.A02;
                    if (l8i4 != null) {
                        l8i4.A0D.setText(this.A0O);
                        L8I l8i5 = this.A02;
                        if (l8i5 != null) {
                            l8i5.A0D.setDropDownWidth(AbstractC13880nE.A0A(context));
                            L8I l8i6 = this.A02;
                            if (l8i6 != null) {
                                l8i6.A0D.setDropDownVerticalOffset(-C3HB.A00(context));
                                L8I l8i7 = this.A02;
                                if (l8i7 != null) {
                                    ComposerAutoCompleteTextView composerAutoCompleteTextView = l8i7.A0D;
                                    composerAutoCompleteTextView.A07 = true;
                                    composerAutoCompleteTextView.setDropDownBackgroundResource(AbstractC53242c7.A0D(context));
                                    C106904rr A00 = C106904rr.A00(userSession);
                                    L8I l8i8 = this.A02;
                                    if (l8i8 != null) {
                                        l8i8.A0D.addTextChangedListener(A00);
                                        L8I l8i9 = this.A02;
                                        if (l8i9 != null) {
                                            ViewOnClickListenerC48064LPp.A00(l8i9.A08, 52, this);
                                            L8I l8i10 = this.A02;
                                            if (l8i10 != null) {
                                                GradientSpinnerAvatarView gradientSpinnerAvatarView = l8i10.A03;
                                                if (gradientSpinnerAvatarView != null) {
                                                    gradientSpinnerAvatarView.A0F(null, interfaceC60442pS, AbstractC166987dD.A10(userSession).Bhu());
                                                    gradientSpinnerAvatarView.setGradientSpinnerVisible(false);
                                                }
                                                L8I l8i11 = this.A02;
                                                if (l8i11 != null) {
                                                    ((IgAutoCompleteTextView) l8i11.A0D).A02 = 1;
                                                    if (this.A0I.A00()) {
                                                        L8I l8i12 = this.A02;
                                                        if (l8i12 != null) {
                                                            l8i12.A0D.setOnFocusChangeListener(new LQ3(this, 0));
                                                        }
                                                    }
                                                    L8I l8i13 = this.A02;
                                                    if (l8i13 != null) {
                                                        l8i13.A0D.setDropDownAnchor(R.id.action_bar_wrapper);
                                                        L8I l8i14 = this.A02;
                                                        if (l8i14 != null) {
                                                            l8i14.A06.addOnLayoutChangeListener(this.A0B);
                                                            A02(this);
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
                    }
                }
            }
        }
        C14360o3.A0F("viewHolder");
        throw C00O.createAndThrow();
    }

    @Override // X.C7OC
    public final void DDL(Drawable drawable, View view, C148336m3 c148336m3) {
        C14360o3.A0B(c148336m3, 0);
        A05(this, c148336m3.A02);
    }

    @Override // X.InterfaceC58139Pq4
    public final void DZu() {
    }

    @Override // X.InterfaceC58139Pq4
    public final void DZv(C84923qg c84923qg, Map map) {
    }

    @Override // X.InterfaceC58139Pq4
    public final void DZw(C84923qg c84923qg, boolean z) {
    }

    @Override // X.InterfaceC58139Pq4
    public final void DZx(C84923qg c84923qg, String str) {
    }

    @Override // X.InterfaceC58140Pq5
    public final void Dex() {
    }

    @Override // X.InterfaceC58140Pq5
    public final void Dey() {
    }

    @Override // X.InterfaceC58140Pq5
    public final void Dez() {
    }

    @Override // X.InterfaceC58140Pq5
    public final void Df0(EnumC53178Nfa enumC53178Nfa, String str, List list, List list2, java.util.Set set) {
    }

    @Override // X.InterfaceC168087f3
    public final void E5z(C9ZB c9zb) {
    }

    @Override // X.InterfaceC168087f3
    public final String EH3(String str) {
        C14360o3.A0B(str, 0);
        C168077f2 c168077f2 = this.A01;
        if (c168077f2 == null) {
            C14360o3.A0F("mentionThumbnailSelectionDelegate");
            throw C00O.createAndThrow();
        }
        return c168077f2.EH3(str);
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onActivityResult(int i, int i2, Intent intent) {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onConfigurationChanged(Configuration configuration) {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onCreate() {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onDestroy() {
    }

    @Override // X.InterfaceC60602pj
    public final void onDestroyView() {
        this.A05 = null;
        L8I l8i = this.A02;
        if (l8i != null) {
            l8i.A06.removeOnLayoutChangeListener(this.A0B);
            L8I l8i2 = this.A02;
            if (l8i2 != null) {
                l8i2.A0D.setOnEditorActionListener(null);
                L8I l8i3 = this.A02;
                if (l8i3 != null) {
                    l8i3.A0D.setOnFocusChangeListener(null);
                    L8I l8i4 = this.A02;
                    if (l8i4 != null) {
                        l8i4.A0D.setAdapter(null);
                        L8I l8i5 = this.A02;
                        if (l8i5 != null) {
                            l8i5.A08.setOnClickListener(null);
                            L8I l8i6 = this.A02;
                            if (l8i6 != null) {
                                IgImageView igImageView = l8i6.A02;
                                if (igImageView != null) {
                                    igImageView.setOnClickListener(null);
                                }
                                C106904rr A00 = C106904rr.A00(this.A0E);
                                L8I l8i7 = this.A02;
                                if (l8i7 != null) {
                                    l8i7.A0D.removeTextChangedListener(A00);
                                    this.A0N.A01();
                                    return;
                                }
                            }
                        }
                    }
                }
            }
        }
        C14360o3.A0F("viewHolder");
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onSaveInstanceState(Bundle bundle) {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onStart() {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onStop() {
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    @Override // X.InterfaceC60602pj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r10, android.os.Bundle r11) {
        /*
            Method dump skipped, instructions count: 316
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.LYZ.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onViewStateRestored(Bundle bundle) {
    }

    public static final Editable A00(LYZ lyz, String str, int i, int i2) {
        String str2 = null;
        L8I l8i = lyz.A02;
        if (i > i2) {
            if (l8i != null) {
                Editable text = l8i.A0D.getText();
                L8I l8i2 = lyz.A02;
                if (l8i2 != null) {
                    int length = l8i2.A0D.length();
                    L8I l8i3 = lyz.A02;
                    if (l8i3 != null) {
                        Editable replace = text.replace(length, l8i3.A0D.length(), str);
                        C38321qM c38321qM = lyz.A03;
                        if (c38321qM != null) {
                            str2 = c38321qM.getId();
                        }
                        C0f5 AEp = C18950wb.A01.AEp("Exception handling onEmojiSelect - start index is greater than end index", 817896325);
                        if (str2 != null) {
                            AEp.ABW("Media Id", str2);
                        }
                        AEp.report();
                        return replace;
                    }
                }
            }
        } else if (l8i != null) {
            return l8i.A0D.getText().replace(i, i2, str);
        }
        C14360o3.A0F("viewHolder");
        throw C00O.createAndThrow();
    }

    public static final void A01(LYZ lyz) {
        L8I l8i = lyz.A02;
        if (l8i != null) {
            int height = lyz.A00 - l8i.A06.getHeight();
            if (height > 0) {
                L8I l8i2 = lyz.A02;
                if (l8i2 != null) {
                    l8i2.A0D.setDropDownHeight(height);
                    return;
                }
            } else {
                return;
            }
        }
        C14360o3.A0F("viewHolder");
        throw C00O.createAndThrow();
    }

    public static final void A02(LYZ lyz) {
        C38321qM c38321qM = lyz.A03;
        if (c38321qM != null && !lyz.A06) {
            L8I l8i = lyz.A02;
            if (l8i == null) {
                C14360o3.A0F("viewHolder");
                throw C00O.createAndThrow();
            }
            AbstractC99834e5.A01(l8i.A07, lyz.A0E, c38321qM, lyz.A0H, false);
            lyz.A06 = true;
        }
    }

    public static final void A04(LYZ lyz) {
        View view;
        ViewStub A07;
        C167987et c167987et;
        C38321qM c38321qM = lyz.A03;
        if (c38321qM != null) {
            C84923qg c84923qg = lyz.A0G;
            if (c84923qg != null) {
                c84923qg.A01(c38321qM);
            }
            String str = null;
            if (c84923qg == null) {
                L8I l8i = lyz.A02;
                if (l8i != null) {
                    Integer num = C05F.A00;
                    String A2u = c38321qM.A2u();
                    if (A2u != null) {
                        l8i.A00(num, A2u);
                    } else {
                        throw AbstractC166987dD.A14("Required value was null.");
                    }
                }
                C14360o3.A0F("viewHolder");
                throw C00O.createAndThrow();
            }
            UserSession userSession = lyz.A0E;
            if (C2TN.A02(userSession, c38321qM) && lyz.A05 != null) {
                C06090Tz c06090Tz = C06090Tz.A05;
                if (C18U.A06(c06090Tz, userSession, 36323809732603509L) || (C14360o3.A0K(lyz.A0P, AbstractC111324zv.A00(165)) && C18U.A06(c06090Tz, userSession, 36323809732669046L))) {
                    View view2 = lyz.A05;
                    if (view2 != null && (A07 = AbstractC31171DnF.A07(view2, R.id.layout_comment_composer_quick_replies_stub)) != null) {
                        view = A07.inflate();
                        AbstractC167007dF.A0w(view);
                    } else {
                        view = null;
                    }
                    LithoView lithoView = new LithoView(lyz.A0A);
                    C50368MLv c50368MLv = new C50368MLv(lyz, 17);
                    String str2 = c84923qg.A0G;
                    String A2u2 = c38321qM.A2u();
                    User A14 = AbstractC25226BEj.A14(c38321qM);
                    if (A14 != null) {
                        str = A14.getId();
                    }
                    lithoView.setComponent(new C26421Bm4(userSession, str2, A2u2, str, c50368MLv));
                    C14360o3.A0C(view, "null cannot be cast to non-null type com.instagram.common.ui.base.IgFrameLayout");
                    ((ViewGroup) view).addView(lithoView);
                }
            }
            L8I l8i2 = lyz.A02;
            if (l8i2 != null) {
                ComposerAutoCompleteTextView composerAutoCompleteTextView = l8i2.A0D;
                C168617fv c168617fv = C168607fu.A0I;
                Context context = lyz.A0A;
                UserSession userSession2 = lyz.A0E;
                composerAutoCompleteTextView.setAdapter(c168617fv.A00(context, lyz, lyz.A0H, new C61972ry(context, AbstractC018607g.A00(lyz.A0C), null), userSession2, null, c38321qM, null, null, "comment_composer_page", C3YV.A04(c38321qM), true, true, false, false));
                if (new C57382kD(userSession2).A02(c38321qM)) {
                    C167977es A00 = AbstractC167967er.A00(userSession2);
                    String id = c38321qM.getId();
                    if (id != null) {
                        C9CG c9cg = (C9CG) A00.A00.get(id);
                        if (c9cg != null && (c167987et = (C167987et) c9cg.A00) != null) {
                            lyz.Dgr(c167987et);
                            return;
                        }
                        return;
                    }
                    throw AbstractC166987dD.A14("Required value was null.");
                }
                return;
            }
            C14360o3.A0F("viewHolder");
            throw C00O.createAndThrow();
        }
    }

    public static final void A05(LYZ lyz, String str) {
        L8I l8i = lyz.A02;
        if (l8i != null) {
            int selectionStart = l8i.A0D.getSelectionStart();
            if (selectionStart < 0) {
                selectionStart = 0;
            }
            L8I l8i2 = lyz.A02;
            if (l8i2 != null) {
                int selectionEnd = l8i2.A0D.getSelectionEnd();
                if (selectionEnd < 0) {
                    selectionEnd = 0;
                }
                A00(lyz, str, selectionStart, selectionEnd);
                return;
            }
        }
        C14360o3.A0F("viewHolder");
        throw C00O.createAndThrow();
    }

    private final void A06(boolean z) {
        C38321qM c38321qM;
        if (this.A0I.A00() && (c38321qM = this.A03) != null) {
            String A2u = c38321qM.A1g(this.A0E).A2u();
            if (A2u != null) {
                AKB(null, A2u, z);
                return;
            }
            throw AbstractC166997dE.A0g();
        }
    }

    public final CharSequence A07() {
        CharSequence charSequence;
        L8I l8i = this.A02;
        if (l8i == null) {
            C14360o3.A0F("viewHolder");
            throw C00O.createAndThrow();
        }
        ComposerAutoCompleteTextView composerAutoCompleteTextView = l8i.A0D;
        if (composerAutoCompleteTextView == null || (charSequence = composerAutoCompleteTextView.getText()) == null) {
            charSequence = "";
        }
        return charSequence;
    }

    @Override // X.InterfaceC168087f3
    public final void AKB(C9ZB c9zb, String str, boolean z) {
        C168077f2 c168077f2 = this.A01;
        if (c168077f2 == null) {
            C14360o3.A0F("mentionThumbnailSelectionDelegate");
            throw C00O.createAndThrow();
        }
        c168077f2.AKB(c9zb, str, z);
    }

    @Override // X.InterfaceC168087f3
    public final C167987et Bxl() {
        C168077f2 c168077f2 = this.A01;
        if (c168077f2 == null) {
            C14360o3.A0F("mentionThumbnailSelectionDelegate");
            throw C00O.createAndThrow();
        }
        return c168077f2.A00;
    }

    @Override // X.InterfaceC168087f3
    public final void D6I() {
        C168077f2 c168077f2 = this.A01;
        if (c168077f2 == null) {
            C14360o3.A0F("mentionThumbnailSelectionDelegate");
            throw C00O.createAndThrow();
        }
        c168077f2.D6I();
    }

    @Override // X.InterfaceC168087f3
    public final void Dgr(C167987et c167987et) {
        C168077f2 c168077f2 = this.A01;
        if (c168077f2 == null) {
            C14360o3.A0F("mentionThumbnailSelectionDelegate");
            throw C00O.createAndThrow();
        }
        c168077f2.A00 = c167987et;
    }

    @Override // X.InterfaceC168087f3
    public final void Dt5(C9ZB c9zb) {
        if (this.A0I.A00()) {
            C168077f2 c168077f2 = this.A01;
            if (c168077f2 == null) {
                C14360o3.A0F("mentionThumbnailSelectionDelegate");
                throw C00O.createAndThrow();
            }
            c168077f2.Dt5(c9zb);
        }
    }

    @Override // X.InterfaceC168087f3
    public final void EkZ(C38321qM c38321qM) {
        C168077f2 c168077f2 = this.A01;
        if (c168077f2 == null) {
            C14360o3.A0F("mentionThumbnailSelectionDelegate");
            throw C00O.createAndThrow();
        }
        c168077f2.EkZ(c38321qM);
    }

    @Override // X.InterfaceC60602pj
    public final void onPause() {
        L8I l8i = this.A02;
        String str = "viewHolder";
        if (l8i != null) {
            l8i.A0D.removeTextChangedListener(this.A0F);
            L8I l8i2 = this.A02;
            if (l8i2 != null) {
                ComposerAutoCompleteTextView composerAutoCompleteTextView = l8i2.A0D;
                TextWatcher textWatcher = this.A04;
                if (textWatcher == null) {
                    str = "carouselTagDeletionTextWatcher";
                } else {
                    composerAutoCompleteTextView.removeTextChangedListener(textWatcher);
                    return;
                }
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC60602pj
    public final void onResume() {
        L8I l8i = this.A02;
        String str = "viewHolder";
        if (l8i != null) {
            l8i.A0D.addTextChangedListener(this.A0F);
            if (this.A0I.A00()) {
                L8I l8i2 = this.A02;
                if (l8i2 != null) {
                    ComposerAutoCompleteTextView composerAutoCompleteTextView = l8i2.A0D;
                    TextWatcher textWatcher = this.A04;
                    if (textWatcher == null) {
                        str = "carouselTagDeletionTextWatcher";
                    } else {
                        composerAutoCompleteTextView.addTextChangedListener(textWatcher);
                        return;
                    }
                }
            } else {
                return;
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }
}
