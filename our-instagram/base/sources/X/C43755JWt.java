package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.google.common.collect.ImmutableList;
import com.instagram.clips.intf.ClipsViewerSource;
import com.instagram.clips.model.ClipsReplyBarData;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.ConstrainedImageView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.ui.widget.textview.ComposerAutoCompleteTextView;
import com.instagram.user.model.User;
import instagram.features.clips.viewer.controller.EmojiReactionTrayView;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.JWt, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43755JWt extends AbstractC43757JWv implements InterfaceC60152ox {
    public View A00;
    public View A01;
    public ViewGroup A02;
    public IgImageView A03;
    public C2DS A04;
    public ComposerAutoCompleteTextView A05;
    public C43754JWs A06;
    public C47767L7o A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public TextWatcher A0B;
    public View A0C;
    public ImmutableList A0D;
    public IgTextView A0E;
    public IgTextView A0F;
    public final FragmentActivity A0G;
    public final ClipsViewerSource A0H;
    public final ClipsReplyBarData A0I;
    public final UserSession A0J;
    public final JX0 A0K;
    public final InterfaceC60442pS A0L;
    public final MVF A0M;
    public final C43756JWu A0N;
    public final List A0O;
    public final InterfaceC09390do A0P;
    public final InterfaceC09390do A0Q;
    public final InterfaceC09390do A0R;
    public final boolean A0S;
    public final boolean A0T;
    public final boolean A0U;
    public final C3I9 A0V;
    public final AbstractC37552Gg8 A0W;
    public final C37546Gg2 A0X;
    public final C37851Gl5 A0Y;

    public C43755JWt(FragmentActivity fragmentActivity, ClipsViewerSource clipsViewerSource, ClipsReplyBarData clipsReplyBarData, UserSession userSession, InterfaceC60442pS interfaceC60442pS, AbstractC37552Gg8 abstractC37552Gg8, C37546Gg2 c37546Gg2, MVF mvf, C37851Gl5 c37851Gl5, C43756JWu c43756JWu, boolean z) {
        boolean z2;
        AbstractC25234BEr.A1R(c37546Gg2, userSession, interfaceC60442pS, fragmentActivity, abstractC37552Gg8);
        C14360o3.A0B(clipsViewerSource, 10);
        this.A0I = clipsReplyBarData;
        this.A0X = c37546Gg2;
        this.A0J = userSession;
        this.A0L = interfaceC60442pS;
        this.A0G = fragmentActivity;
        this.A0W = abstractC37552Gg8;
        this.A0N = c43756JWu;
        this.A0Y = c37851Gl5;
        this.A0T = z;
        this.A0H = clipsViewerSource;
        this.A0M = mvf;
        this.A0O = AbstractC166987dD.A1E();
        this.A0K = C36911no.A00().E6g(userSession);
        this.A0V = C3I7.A01(this, false, true);
        ImmutableList of = ImmutableList.of();
        C14360o3.A07(of);
        this.A0D = of;
        ClipsViewerSource clipsViewerSource2 = ClipsViewerSource.A0C;
        if (clipsViewerSource != clipsViewerSource2 && !clipsReplyBarData.A0F && (C7M3.A01(userSession) || C7M3.A00(userSession) || C7M3.A02(userSession))) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.A0U = z2;
        this.A0S = clipsViewerSource == clipsViewerSource2;
        this.A0P = AbstractC09440dt.A01(new BQP(this, 17));
        EnumC09460dv enumC09460dv = EnumC09460dv.A02;
        this.A0Q = AbstractC09440dt.A00(enumC09460dv, new BQP(this, 18));
        this.A0R = AbstractC09440dt.A00(enumC09460dv, new BQP(this, 19));
    }

    /* JADX WARN: Code restructure failed: missing block: B:104:0x00e3, code lost:
    
        if (r2 != false) goto L7;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void A04(int r8) {
        /*
            Method dump skipped, instructions count: 366
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C43755JWt.A04(int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x009d, code lost:
    
        if (r8.A0G != false) goto L23;
     */
    @Override // X.AbstractC37623GhI, X.InterfaceC60602pj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r25, android.os.Bundle r26) {
        /*
            Method dump skipped, instructions count: 768
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C43755JWt.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    private final ImmutableList A01() {
        ImmutableList of;
        C2DS c2ds;
        C81663kb C76;
        UserSession userSession = this.A0J;
        C18A A00 = AnonymousClass189.A00(userSession);
        String str = this.A0I.A0B;
        if (str != null && (c2ds = this.A04) != null && (C76 = c2ds.C76(str)) != null) {
            DirectThreadKey BKb = C76.BKb();
            C2DS c2ds2 = this.A04;
            ArrayList arrayList = null;
            if (c2ds2 != null) {
                ArrayList CD3 = c2ds2.CD3(BKb);
                arrayList = AbstractC167017dG.A0q(CD3);
                Iterator it = CD3.iterator();
                while (it.hasNext()) {
                    C83403nh A0e = AbstractC43592JPx.A0e(it);
                    User A02 = A00.A02(A0e.A1u);
                    User A022 = A00.A02(userSession.userId);
                    if (A022 != null) {
                        C9BN c9bn = new C9BN(A0e.C8i(), A02, 1);
                        String A0h = A0e.A0h();
                        String str2 = "";
                        if (A0h == null) {
                            A0h = "";
                        }
                        String A0g = A0e.A0g();
                        if (A0g != null) {
                            str2 = A0g;
                        }
                        arrayList.add(new C9CG(c9bn, A0h, str2, A0e.A0s(A022)));
                    } else {
                        throw AbstractC166997dE.A0g();
                    }
                }
            }
            of = ImmutableList.copyOf((Collection) arrayList);
        } else {
            of = ImmutableList.of();
        }
        C14360o3.A07(of);
        return of;
    }

    public static final C120985dq A02(C43755JWt c43755JWt) {
        int A03;
        C37556GgC c37556GgC = ((AbstractC37623GhI) c43755JWt).A02;
        if (c37556GgC == null || (A03 = c37556GgC.A03()) < 0) {
            return null;
        }
        AbstractC37552Gg8 abstractC37552Gg8 = c43755JWt.A0X.A0A;
        if (A03 >= abstractC37552Gg8.A0B()) {
            return null;
        }
        return abstractC37552Gg8.A0F(A03);
    }

    private final void A03() {
        IgImageView igImageView;
        if (AbstractC167007dF.A1Z(this.A0Q)) {
            ComposerAutoCompleteTextView composerAutoCompleteTextView = this.A05;
            if (composerAutoCompleteTextView != null) {
                composerAutoCompleteTextView.setHintTextColor(AbstractC166997dE.A03(this.A0G.getApplicationContext()));
            }
            ViewGroup viewGroup = this.A02;
            if (viewGroup != null) {
                AbstractC31173DnH.A0z(this.A0G.getApplicationContext(), viewGroup, R.drawable.clips_reply_message_composer_background_v2);
            }
        }
        if (AbstractC167007dF.A1Z(this.A0R) && (igImageView = this.A03) != null) {
            AbstractC31173DnH.A11(this.A0G.getApplicationContext(), igImageView, R.color.design_dark_default_color_on_background);
        }
    }

    public static final void A05(C43755JWt c43755JWt) {
        Editable editable;
        int i;
        ComposerAutoCompleteTextView composerAutoCompleteTextView = c43755JWt.A05;
        if (composerAutoCompleteTextView != null) {
            editable = composerAutoCompleteTextView.getText();
        } else {
            editable = null;
        }
        String valueOf = String.valueOf(editable);
        C37556GgC c37556GgC = ((AbstractC37623GhI) c43755JWt).A02;
        if (c37556GgC != null) {
            i = c37556GgC.A03();
        } else {
            i = 0;
        }
        if (c43755JWt.A09 || (i != 0 && !c43755JWt.A0S && (!c43755JWt.A0U || c43755JWt.A0A))) {
            IgTextView igTextView = c43755JWt.A0E;
            if (igTextView != null) {
                igTextView.setVisibility(0);
            }
            IgTextView igTextView2 = c43755JWt.A0E;
            if (igTextView2 != null) {
                igTextView2.setEnabled(AbstractC25225BEi.A1Y(valueOf));
                return;
            }
            return;
        }
        AbstractC167007dF.A0x(c43755JWt.A0E);
    }

    @Override // X.InterfaceC60152ox
    public final void DOK(int i, boolean z) {
        View view;
        IgTextView igTextView;
        Drawable background;
        IgTextView igTextView2;
        String str;
        C38321qM c38321qM;
        float f;
        Context context;
        Drawable background2;
        View view2;
        boolean z2 = this.A09;
        this.A09 = AbstractC25230BEn.A1S(i, C30D.A01);
        ClipsReplyBarData clipsReplyBarData = this.A0I;
        boolean z3 = clipsReplyBarData.A0F;
        if (!z3 && (view2 = this.A01) != null) {
            view2.setTranslationY(-i);
        }
        UserSession userSession = this.A0J;
        InterfaceC60442pS interfaceC60442pS = this.A0L;
        C18920wW A01 = AbstractC12220kQ.A01(interfaceC60442pS, userSession);
        AbstractC43758JWw.A00(userSession);
        boolean z4 = this.A09;
        AbstractC37552Gg8 abstractC37552Gg8 = this.A0W;
        if (z4) {
            abstractC37552Gg8.A0Y(true);
            A0C();
            IgImageView igImageView = this.A03;
            if (igImageView != null) {
                igImageView.setVisibility(8);
            }
            View view3 = this.A0C;
            if (view3 != null) {
                view3.setVisibility(8);
            }
            Iterator it = this.A0O.iterator();
            while (it.hasNext()) {
                ((View) it.next()).setVisibility(8);
            }
            View view4 = this.A00;
            if (view4 != null) {
                view4.setAlpha(1.0f);
            }
            ViewGroup viewGroup = this.A02;
            if (viewGroup != null && (background2 = viewGroup.getBackground()) != null) {
                background2.setAlpha(255);
            }
            if ((clipsReplyBarData.A0G || this.A0U) && clipsReplyBarData.A0H && (igTextView2 = this.A0F) != null) {
                igTextView2.setVisibility(0);
            }
            C47767L7o c47767L7o = this.A07;
            if (c47767L7o != null) {
                c47767L7o.A00(true);
            }
            C47767L7o c47767L7o2 = this.A07;
            if (c47767L7o2 != null) {
                C14360o3.A0B(interfaceC60442pS, 0);
                L0U l0u = c47767L7o2.A03;
                l0u.A00 = interfaceC60442pS;
                List A02 = AbstractC47991LKc.A02(c47767L7o2.A02);
                ArrayList A0q = AbstractC167017dG.A0q(A02);
                Iterator it2 = A02.iterator();
                while (it2.hasNext()) {
                    A0q.add(C168157fA.A01((String) it2.next()));
                }
                EmojiReactionTrayView emojiReactionTrayView = c47767L7o2.A01;
                if (emojiReactionTrayView != null) {
                    emojiReactionTrayView.A00 = l0u;
                    List list = emojiReactionTrayView.A02;
                    if (list.isEmpty()) {
                        int i2 = 0;
                        do {
                            context = emojiReactionTrayView.getContext();
                            C14360o3.A07(context);
                            ConstrainedImageView constrainedImageView = new ConstrainedImageView(context);
                            emojiReactionTrayView.addView(constrainedImageView);
                            ViewGroup.LayoutParams layoutParams = constrainedImageView.getLayoutParams();
                            Context context2 = constrainedImageView.getContext();
                            layoutParams.width = context2.getResources().getDimensionPixelSize(R.dimen.abc_dropdownitem_icon_width);
                            constrainedImageView.getLayoutParams().height = context2.getResources().getDimensionPixelSize(R.dimen.abc_dropdownitem_icon_width);
                            list.add(constrainedImageView);
                            i2++;
                        } while (i2 < 5);
                        View inflate = LayoutInflater.from(context).inflate(R.layout.emoji_reaction_see_more_button, (ViewGroup) emojiReactionTrayView, false);
                        C14360o3.A0C(inflate, AbstractC111324zv.A00(69));
                        ImageView imageView = (ImageView) inflate;
                        Drawable mutate = imageView.getDrawable().mutate();
                        C14360o3.A07(mutate);
                        AbstractC25231BEo.A0x(context, mutate, AbstractC53242c7.A0H(context, R.attr.igdsSecondaryIcon));
                        imageView.setImageDrawable(mutate);
                        C3P9 A0s = AbstractC166987dD.A0s(imageView);
                        A0s.A07 = true;
                        A0s.A0D = true;
                        A0s.A06 = false;
                        A0s.A04 = new KKr(l0u, 2);
                        A0s.A00();
                        emojiReactionTrayView.addView(imageView);
                    }
                    List list2 = emojiReactionTrayView.A03;
                    list2.clear();
                    list2.addAll(AbstractC001800i.A0d(A0q, 5));
                    if (list2.size() == list.size()) {
                        int measuredWidth = emojiReactionTrayView.getMeasuredWidth();
                        int i3 = (measuredWidth - ((int) (measuredWidth * 0.4f))) / 2;
                        float f2 = emojiReactionTrayView.A01;
                        int size = list2.size() + 1;
                        for (int i4 = 0; i4 < size; i4++) {
                            int i5 = i4 % 3;
                            if (AbstractC13620mo.A02(emojiReactionTrayView.getContext())) {
                                float f3 = i5 * f2;
                                f = (((measuredWidth - i3) - f2) - f3) - f3;
                            } else {
                                float f4 = i5 * f2;
                                f = i3 + f4 + f4;
                            }
                            float f5 = (i4 / 3) * f2;
                            emojiReactionTrayView.getChildAt(i4).setX(f);
                            emojiReactionTrayView.getChildAt(i4).setY(f5 + f5);
                        }
                        int size2 = list2.size();
                        for (int i6 = 0; i6 < size2; i6++) {
                            C148336m3 c148336m3 = (C148336m3) list2.get(i6);
                            IgImageView igImageView2 = (IgImageView) list.get(i6);
                            if (!C14360o3.A0K(c148336m3, igImageView2.getTag())) {
                                C168157fA c168157fA = C148336m3.A04;
                                String str2 = c148336m3.A02;
                                igImageView2.setUrl(c168157fA.A04(str2), interfaceC60442pS);
                                igImageView2.setTag(c148336m3);
                                igImageView2.setContentDescription(str2);
                                C3P9 c3p9 = new C3P9(igImageView2);
                                c3p9.A07 = true;
                                c3p9.A0D = true;
                                c3p9.A04 = new KKs(c148336m3, l0u);
                                c3p9.A00();
                            }
                        }
                    } else {
                        throw AbstractC31172DnG.A0u();
                    }
                }
            }
            String moduleName = interfaceC60442pS.getModuleName();
            String str3 = clipsReplyBarData.A0A;
            C120985dq A022 = A02(this);
            if (A022 == null || (c38321qM = A022.A02) == null || (str = c38321qM.getId()) == null) {
                str = "";
            }
            LJI.A02(A01, moduleName, str3, str, clipsReplyBarData.A0B, clipsReplyBarData.A05);
        } else {
            abstractC37552Gg8.A0Y(false);
            if (this.A0S) {
                view = this.A0C;
            } else {
                view = this.A03;
            }
            if (view != null) {
                int i7 = 8;
                if (!z3) {
                    i7 = 0;
                }
                view.setVisibility(i7);
            }
            for (View view5 : this.A0O) {
                int i8 = 8;
                if (!z3) {
                    i8 = 0;
                }
                view5.setVisibility(i8);
            }
            View view6 = this.A00;
            if (view6 != null) {
                view6.setAlpha(0.0f);
            }
            ViewGroup viewGroup2 = this.A02;
            if (viewGroup2 != null && (background = viewGroup2.getBackground()) != null) {
                background.setAlpha(204);
            }
            if ((clipsReplyBarData.A0G || this.A0U) && clipsReplyBarData.A0H && (igTextView = this.A0F) != null) {
                igTextView.setVisibility(8);
            }
            C47767L7o c47767L7o3 = this.A07;
            if (c47767L7o3 != null) {
                c47767L7o3.A00(false);
            }
            if (z2) {
                LJI.A00(A01, interfaceC60442pS.getModuleName(), clipsReplyBarData.A0A, "direct_reply_bar_tap");
            }
        }
        A05(this);
    }

    @Override // X.AbstractC37623GhI, X.InterfaceC60602pj
    public final void onPause() {
        ComposerAutoCompleteTextView composerAutoCompleteTextView = this.A05;
        if (composerAutoCompleteTextView != null) {
            composerAutoCompleteTextView.removeTextChangedListener(this.A0B);
        }
        this.A0B = null;
    }

    @Override // X.AbstractC37623GhI, X.InterfaceC60602pj
    public final void onResume() {
        LO2 lo2 = new LO2(this, 17);
        this.A0B = lo2;
        ComposerAutoCompleteTextView composerAutoCompleteTextView = this.A05;
        if (composerAutoCompleteTextView != null) {
            composerAutoCompleteTextView.addTextChangedListener(lo2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.C9CG A00(X.C43755JWt r8) {
        /*
            X.5dq r7 = A02(r8)
            r2 = 0
            if (r7 == 0) goto L91
            com.instagram.clips.intf.ClipsViewerSource r1 = r8.A0H
            com.instagram.clips.intf.ClipsViewerSource r0 = com.instagram.clips.intf.ClipsViewerSource.A0C
            if (r1 == r0) goto L91
            boolean r6 = r8.A0T
            r5 = 1
            r4 = 0
            java.lang.String r3 = "reshareInfoStore"
            if (r6 != 0) goto L47
            X.JWs r1 = r8.A06
            if (r1 == 0) goto L89
            int r0 = r1.A00
            if (r0 != 0) goto L47
            com.google.common.collect.ImmutableList r0 = r1.A03()
            int r0 = r0.size()
            if (r0 != r5) goto L47
            X.JWs r0 = r8.A06
            if (r0 == 0) goto L89
            X.9CG r3 = r0.A01(r4)
        L2f:
            if (r3 != 0) goto L46
            X.0wb r2 = X.C18950wb.A01
            r1 = 817902720(0x30c03480, float:1.398476E-9)
            java.lang.String r0 = "ClipsViewerReplyBarController"
            X.0f5 r2 = r2.AEp(r0, r1)
            java.lang.String r1 = "message"
            java.lang.String r0 = "ClipsReshareInfo was null"
            r2.ABW(r1, r0)
            r2.report()
        L46:
            return r3
        L47:
            java.lang.String r2 = "Required value was null."
            if (r6 == 0) goto L7b
            com.google.common.collect.ImmutableList r0 = r8.A0D
            int r0 = r0.size()
            if (r0 != r5) goto L60
            com.google.common.collect.ImmutableList r0 = r8.A0D
            java.lang.Object r3 = r0.get(r4)
            if (r3 != 0) goto L78
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A14(r2)
            throw r0
        L60:
            com.google.common.collect.ImmutableList r1 = r8.A0D
            X.GgC r0 = r8.A02
            if (r0 == 0) goto L84
            int r0 = r0.A03()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            if (r0 == 0) goto L84
            int r0 = r0.intValue()
            java.lang.Object r3 = r1.get(r0)
        L78:
            X.9CG r3 = (X.C9CG) r3
            goto L2f
        L7b:
            X.JWs r0 = r8.A06
            if (r0 == 0) goto L89
            X.9CG r3 = r0.A02(r7)
            goto L2f
        L84:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A14(r2)
            throw r0
        L89:
            X.C14360o3.A0F(r3)
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        L91:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C43755JWt.A00(X.JWt):X.9CG");
    }

    @Override // X.C38Y
    public final void DXa(int i, int i2) {
        A04(i);
        A05(this);
        A0C();
        A03();
    }

    @Override // X.AbstractC37623GhI, X.InterfaceC60602pj
    public final void onDestroyView() {
        super.onDestroyView();
        A0C();
        this.A05 = null;
        this.A0E = null;
        this.A03 = null;
        this.A01 = null;
        this.A00 = null;
        this.A0F = null;
        if (this.A09) {
            UserSession userSession = this.A0J;
            InterfaceC60442pS interfaceC60442pS = this.A0L;
            C18920wW A01 = AbstractC12220kQ.A01(interfaceC60442pS, userSession);
            AbstractC43758JWw.A00(userSession);
            LJI.A00(A01, interfaceC60442pS.getModuleName(), this.A0I.A0A, "direct_reply_bar_tap");
        }
        C3I9 c3i9 = this.A0V;
        c3i9.onStop();
        c3i9.EFx(this);
    }
}
