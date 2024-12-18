package X;

import android.content.Context;
import android.text.Editable;
import android.text.InputFilter;
import android.text.SpannableStringBuilder;
import android.text.TextWatcher;
import android.view.View;
import android.view.ViewStub;
import android.view.inputmethod.InputMethodManager;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider;
import com.instagram.ui.text.ConstrainedEditText;
import com.instagram.user.model.User;
import java.util.List;

/* loaded from: classes4.dex */
public final class APn implements TextWatcher, View.OnFocusChangeListener, InterfaceC190578cF, InterfaceC60152ox, InterfaceC25184BCh, InterfaceC190628cK {
    public View A00;
    public View A01;
    public RecyclerView A02;
    public IgSimpleImageView A03;
    public IgSimpleImageView A04;
    public C190438c1 A05;
    public ConstrainedEditText A06;
    public User A07;
    public List A08;
    public boolean A09;
    public int A0C;
    public View A0D;
    public C2GT A0E;
    public AbstractC59962oe A0F;
    public InterfaceC11380iw A0G;
    public final Context A0H;
    public final View A0I;
    public final FragmentActivity A0J;
    public final UserSession A0K;
    public final TargetViewSizeProvider A0L;
    public final InterfaceC1810081c A0M;
    public final C8NX A0N;
    public final boolean A0O;
    public final int A0P;
    public final int A0Q;
    public final ViewStub A0R;
    public final C3I9 A0T;
    public final C8O8 A0U;
    public final AnonymousClass840 A0V;
    public final C190588cG A0W;
    public final C190448c2 A0X;
    public final C190458c3 A0Y;
    public final C190388bw A0Z;
    public final boolean A0a;
    public final boolean A0b;
    public final boolean A0c;
    public boolean A0A = false;
    public boolean A0B = false;
    public final InterfaceC58362lv A0S = new C208309Jp(this, 2);

    @Override // X.InterfaceC190628cK
    public final void DOI() {
    }

    @Override // X.InterfaceC190578cF
    public final void DSl(final User user, final int i) {
        if (!user.A2D()) {
            FragmentActivity fragmentActivity = this.A0J;
            UserSession userSession = this.A0K;
            AbstractC167017dG.A1P(fragmentActivity, userSession);
            AbstractC35239FgY.A02(fragmentActivity, fragmentActivity, userSession, user, null, "story", null, null);
            FDR.A00(AbstractC12220kQ.A01(null, userSession), userSession, user, "story", "click", AbstractC111324zv.A00(67));
            return;
        }
        Integer num = C05F.A0C;
        if (IAS.A00(user, num) != null) {
            this.A0B = true;
            Runnable runnable = new Runnable() { // from class: X.Axr
                @Override // java.lang.Runnable
                public final void run() {
                    APn aPn = APn.this;
                    User user2 = user;
                    int i2 = i;
                    aPn.A0B = false;
                    aPn.A0M.E4u(new Object());
                    APn.A01(aPn, user2, i2);
                }
            };
            ITB.A01(this.A0J, IAS.A00(user, num), this.A0K, user, runnable);
            return;
        }
        A01(this, user, i);
    }

    @Override // X.InterfaceC190628cK
    public final boolean DdB(C05R c05r) {
        return false;
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x003e, code lost:
    
        if (r6.A0N.AG1() == false) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A00(X.APn r6) {
        /*
            com.instagram.common.session.UserSession r3 = r6.A0K
            X.WhU r0 = X.VWS.A00(r3)
            java.util.List r5 = r0.A00()
            com.instagram.ui.text.ConstrainedEditText r0 = r6.A06
            android.text.Editable r0 = r0.getText()
            int r0 = r0.length()
            r4 = 1
            if (r0 <= r4) goto L4e
            X.0Tz r2 = X.AbstractC166997dE.A0U(r3)
            r0 = 36325197007041391(0x810d930000336f, double:3.035539084856334E-306)
            boolean r0 = X.C18U.A06(r2, r3, r0)
            if (r0 == 0) goto L4e
        L26:
            X.8cG r3 = r6.A0W
            if (r4 == 0) goto L31
            r0 = 1
            r3.A02 = r0
        L2d:
            r3.A03(r5)
            return
        L31:
            java.util.List r2 = r6.A08
            boolean r0 = r6.A09
            if (r0 == 0) goto L40
            X.8NX r0 = r6.A0N
            boolean r1 = r0.AG1()
            r0 = 1
            if (r1 != 0) goto L41
        L40:
            r0 = 0
        L41:
            r3.A01 = r0
            java.util.List r0 = r3.A06
            r0.clear()
            if (r2 == 0) goto L2d
            r0.addAll(r2)
            goto L2d
        L4e:
            r4 = 0
            goto L26
        */
        throw new UnsupportedOperationException("Method not decompiled: X.APn.A00(X.APn):void");
    }

    public static void A01(APn aPn, User user, int i) {
        String str;
        String BjQ;
        InterfaceC169517hR interfaceC169517hR = aPn.A0W.A05;
        if (interfaceC169517hR != null && (BjQ = interfaceC169517hR.BjQ()) != null && BjQ.length() != 0) {
            str = AbstractC002300n.A0d(BjQ, "@", "", false);
        } else {
            str = "";
        }
        aPn.A07 = user;
        aPn.A06.getText().replace(0, aPn.A06.getText().length(), user.getUsername());
        aPn.A0M.E4u(new Object());
        VWS.A00(aPn.A0K).A01(user);
        aPn.A0Y.A02(user.getId(), str, i);
    }

    public static void A02(APn aPn, boolean z) {
        C214699f7 c214699f7 = new C214699f7();
        C189448aO c189448aO = new C189448aO(aPn.A0K);
        c189448aO.A0U = new PHZ(1, aPn, z);
        C189478aR A00 = c189448aO.A00();
        c214699f7.A00 = new A75(aPn, A00);
        A00.A02(aPn.A0J, c214699f7);
    }

    public final void A03() {
        UserSession userSession = this.A0K;
        C23031Ai A00 = AbstractC23021Ah.A00(userSession);
        InterfaceC19630xq interfaceC19630xq = A00.A01;
        int i = interfaceC19630xq.getInt("mention_sharing_privacy_toast_seen_count", 0);
        if (!this.A0A && i < 3 && this.A0c && !A00.A1i() && C18U.A06(C06090Tz.A05, userSession, 36319235592428647L)) {
            C41451vu c41451vu = C41451vu.A01;
            C146106i8 c146106i8 = new C146106i8();
            Context context = this.A0H;
            c146106i8.A0D = context.getString(2131966299);
            c146106i8.A01 = 5000;
            c146106i8.A0J = true;
            c146106i8.A02 = context.getResources().getDimensionPixelSize(R.dimen.audio_dubbing_gen_ai_gif_size);
            c146106i8.A0R = true;
            c146106i8.A0D(context.getString(2131973348));
            c146106i8.A0A(new C23960Aju(this, 1));
            c146106i8.A01();
            AbstractC166997dE.A1O(c41451vu, c146106i8.A00());
            this.A0A = true;
            AbstractC167017dG.A1L(interfaceC19630xq.ARD(), interfaceC19630xq, "mention_sharing_privacy_toast_seen_count", 0);
        }
    }

    public final void A04() {
        boolean z;
        SpannableStringBuilder A01;
        EnumC15950qp enumC15950qp;
        if (this.A00 == null) {
            View inflate = this.A0R.inflate();
            this.A00 = inflate;
            inflate.getClass();
            this.A0D = AbstractC167017dG.A0U(inflate, R.id.mention_sharing_privacy_message_stub);
            View view = this.A00;
            view.getClass();
            this.A06 = (ConstrainedEditText) view.requireViewById(R.id.mention_composer);
            View view2 = this.A00;
            view2.getClass();
            this.A03 = (IgSimpleImageView) view2.requireViewById(R.id.valentines_left_heart);
            View view3 = this.A00;
            view3.getClass();
            this.A04 = (IgSimpleImageView) view3.requireViewById(R.id.valentines_right_heart);
            this.A06.A07.add(this);
            this.A06.addTextChangedListener(new C23190APm(false));
            this.A06.addTextChangedListener(this);
            UserSession userSession = this.A0K;
            if (!AbstractC172687md.A01(userSession)) {
                this.A06.setFilters(new InputFilter[]{new InputFilter.AllCaps()});
            }
            ConstrainedEditText constrainedEditText = this.A06;
            Context context = this.A0H;
            constrainedEditText.setHint(AbstractC202818xz.A02(context, userSession));
            this.A06.setOnFocusChangeListener(this);
            ConstrainedEditText constrainedEditText2 = this.A06;
            AbstractC167007dF.A1K(context, userSession);
            if (AbstractC172687md.A01(userSession)) {
                A01 = AMr.A00(AbstractC166997dE.A0M(context), AbstractC167007dF.A09(context, R.attr.igds_color_creation_tools_orange), AbstractC167007dF.A09(context, R.attr.igds_color_text_on_white));
            } else if (AbstractC166997dE.A0c(C06090Tz.A05, userSession, 36322963624045330L).booleanValue()) {
                A01 = AbstractC202818xz.A00(context, "");
            } else {
                A01 = AbstractC202818xz.A01(context, "");
            }
            constrainedEditText2.setText(A01);
            ConstrainedEditText constrainedEditText3 = this.A06;
            boolean A012 = AbstractC172687md.A01(userSession);
            C15980qs A00 = AbstractC15960qq.A00(context);
            if (A012) {
                enumC15950qp = EnumC15950qp.A0Y;
            } else {
                enumC15950qp = EnumC15950qp.A0V;
            }
            constrainedEditText3.setTypeface(A00.A02(enumC15950qp));
            AbstractC139116Rs.A00(this.A06, AbstractC167017dG.A0F(context), false);
            if (C18U.A06(C06090Tz.A05, userSession, 36322963624045330L)) {
                this.A03.setVisibility(0);
                this.A04.setVisibility(0);
            }
            View view4 = this.A00;
            view4.getClass();
            this.A01 = view4.requireViewById(R.id.mention_tagging_container);
            View view5 = this.A00;
            view5.getClass();
            RecyclerView recyclerView = (RecyclerView) view5.requireViewById(R.id.mention_tagging_recycler_view);
            this.A02 = recyclerView;
            recyclerView.setLayoutManager(new LinearLayoutManager(context, 0, false));
            if (this.A0O) {
                View view6 = this.A00;
                view6.getClass();
                this.A05 = new C190438c1(view6.requireViewById(R.id.mention_sharing_privacy_setting_toggle), userSession, 2131966297);
            }
        }
        View view7 = this.A0I;
        View view8 = this.A00;
        view8.getClass();
        AbstractC125325le.A04(null, new View[]{view7, view8, this.A01}, false);
        if (!this.A0b && (!this.A0a || AbstractC23021Ah.A00(this.A0K).A1i())) {
            z = true;
        } else {
            z = false;
        }
        UserSession userSession2 = this.A0K;
        C1AU A013 = C1AT.A01(userSession2);
        C1AV c1av = C1AV.A36;
        Class<?> cls = getClass();
        boolean z2 = A013.A04(c1av, cls).getBoolean("has_seen_mention_sharing_enabled_nux", false);
        if (z && !z2 && C18U.A06(C06090Tz.A05, userSession2, 36319235592428647L)) {
            View view9 = this.A0D;
            view9.getClass();
            AbstractC125325le.A01(view9, 1).A0C(750L);
            View view10 = this.A0D;
            view10.getClass();
            AbstractC125325le.A02(view10, 3000L);
            InterfaceC19610xo ARD = C1AT.A01(userSession2).A04(c1av, cls).ARD();
            ARD.E77("has_seen_mention_sharing_enabled_nux", true);
            ARD.apply();
        }
        this.A06.requestFocus();
        this.A02.setAdapter(this.A0W);
        C190438c1 c190438c1 = this.A05;
        if (c190438c1 != null) {
            c190438c1.A01.setChecked(AbstractC23021Ah.A00(c190438c1.A00).A1i());
        }
        C190458c3 c190458c3 = this.A0Y;
        c190458c3.A00 = false;
        c190458c3.A01 = false;
        c190458c3.A00();
        C190448c2 c190448c2 = this.A0X;
        c190448c2.A01 = false;
        C190438c1 c190438c12 = this.A05;
        if (c190438c12 != null) {
            c190448c2.A00(c190438c12.A01, C05F.A01, true);
        }
        this.A09 = C18U.A06(C06090Tz.A05, userSession2, 36317427411195036L);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x00ac, code lost:
    
        if (r6.A0N.AG1() == false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00cd, code lost:
    
        if (X.C18U.A06(X.AbstractC166997dE.A0U(r3), r3, 36325197007041391L) != false) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00be  */
    @Override // X.InterfaceC25184BCh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void DDv(java.lang.Object r7) {
        /*
            r6 = this;
            boolean r0 = r6.A0c
            if (r0 == 0) goto Ld4
            com.instagram.common.session.UserSession r3 = r6.A0K
            X.1Ai r0 = X.AbstractC23021Ah.A00(r3)
            boolean r0 = r0.A1i()
            if (r0 != 0) goto Ld4
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36319235592428647(0x81082700001c67, double:3.031769062250545E-306)
            boolean r0 = X.C18U.A06(r2, r3, r0)
            if (r0 == 0) goto Ld4
            X.1AU r2 = X.C1AT.A01(r3)
            X.1AV r1 = X.C1AV.A36
            java.lang.Class r0 = r6.getClass()
            X.0xq r2 = r2.A04(r1, r0)
            r1 = 0
            java.lang.String r0 = "has_seen_mention_sharing_privacy_nux"
            boolean r0 = r2.getBoolean(r0, r1)
            if (r0 != 0) goto Ld4
            androidx.fragment.app.FragmentActivity r0 = r6.A0J
            X.8hC r3 = new X.8hC
            r3.<init>(r0)
            r0 = 2131966288(0x7f133950, float:1.956941E38)
            r3.A0A(r0)
            r0 = 2131966287(0x7f13394f, float:1.9569408E38)
            r3.A09(r0)
            r1 = 1
            X.AP9 r0 = new X.AP9
            r0.<init>(r6, r1)
            r3.A0h(r0)
            r2 = 2131963271(0x7f132d87, float:1.956329E38)
            r1 = 4
            X.AOD r0 = new X.AOD
            r0.<init>(r6, r1)
            r3.A0J(r0, r2)
            r2 = 2131968948(0x7f1343b4, float:1.9574805E38)
            r1 = 5
            X.AOD r0 = new X.AOD
            r0.<init>(r6, r1)
            r3.A0I(r0, r2)
            X.AbstractC166987dD.A1W(r3)
        L6b:
            X.8O8 r1 = r6.A0U
            X.6lx r0 = X.C148276lx.A0a
            java.lang.String r0 = "mention_sticker_id"
            r1.Dom(r0)
            boolean r0 = r6.A09
            if (r0 == 0) goto L9f
            X.8NX r0 = r6.A0N
            boolean r0 = r0.AG1()
            if (r0 == 0) goto L9f
            X.8bw r1 = r6.A0Z
            X.840 r0 = r6.A0V
            X.83z r0 = r0.A02
            X.83h r0 = r0.A01
            java.lang.String r0 = r0.A05()
            X.0xP r1 = r1.A00(r0)
            X.191 r0 = X.AnonymousClass191.A00
            androidx.lifecycle.CoroutineLiveData r2 = X.AbstractC58232lf.A00(r0, r1)
            r6.A0E = r2
            androidx.fragment.app.FragmentActivity r1 = r6.A0J
            X.2lv r0 = r6.A0S
            r2.A06(r1, r0)
        L9f:
            X.8cG r5 = r6.A0W
            boolean r0 = r6.A09
            if (r0 == 0) goto Lae
            X.8NX r0 = r6.A0N
            boolean r1 = r0.AG1()
            r0 = 1
            if (r1 != 0) goto Laf
        Lae:
            r0 = 0
        Laf:
            r5.A01 = r0
            com.instagram.ui.text.ConstrainedEditText r0 = r6.A06
            android.text.Editable r0 = r0.getText()
            int r0 = r0.length()
            r4 = 1
            if (r0 <= r4) goto Ld2
            com.instagram.common.session.UserSession r3 = r6.A0K
            X.0Tz r2 = X.AbstractC166997dE.A0U(r3)
            r0 = 36325197007041391(0x810d930000336f, double:3.035539084856334E-306)
            boolean r0 = X.C18U.A06(r2, r3, r0)
            if (r0 == 0) goto Ld2
        Lcf:
            r5.A02 = r4
            return
        Ld2:
            r4 = 0
            goto Lcf
        Ld4:
            r6.A04()
            goto L6b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.APn.DDv(java.lang.Object):void");
    }

    @Override // X.InterfaceC25184BCh
    public final void DEy() {
        if (!this.A0B) {
            this.A0N.Dog(new C217889kL(null, this.A07, AbstractC167007dF.A0g(this.A06), this.A06.getTextSize(), InterfaceC1812882f.A00(this.A0L)), "mention_sticker");
            View view = this.A00;
            if (view != null) {
                C150956qv.A08(new View[]{this.A0I, view, this.A01}, false);
                this.A06.clearFocus();
                this.A06.getText().replace(0, this.A06.getText().length(), "");
                this.A07 = null;
            }
            C8O8 c8o8 = this.A0U;
            C148276lx c148276lx = C148276lx.A0a;
            c8o8.Doh("mention_sticker_id");
            C2GT c2gt = this.A0E;
            if (this.A09 && c2gt != null) {
                c2gt.A08(this.A0S);
            }
        }
    }

    @Override // X.InterfaceC190578cF
    public final void DJn() {
        this.A0M.E4u(new C8VE(null));
    }

    @Override // X.InterfaceC190578cF
    public final void DJp(C217859kI c217859kI) {
        this.A0M.E4u(new C8VE(c217859kI));
    }

    @Override // X.InterfaceC190578cF
    public final void DN8() {
        View currentFocus;
        Context context = this.A0H;
        UserSession userSession = this.A0K;
        if (C54P.A01(context, userSession)) {
            boolean A06 = C18U.A06(C06090Tz.A05, userSession, 36325197007106928L);
            EnumC33510Erj enumC33510Erj = EnumC33510Erj.STORY_POST_CAPTURE_FLOW;
            AbstractC35249Fgi.A06(enumC33510Erj, userSession, true);
            CJA.A00(this.A0J, enumC33510Erj, userSession, false, A06);
        } else {
            EnumC33510Erj enumC33510Erj2 = EnumC33510Erj.STORY_POST_CAPTURE_FLOW;
            AbstractC35249Fgi.A06(enumC33510Erj2, userSession, false);
            AbstractC35249Fgi.A03(enumC33510Erj2, EnumC33500ErZ.SYSTEM_SHARE_SHEET, userSession, false);
            AbstractC31510Dsu.A0T(this.A0F, enumC33510Erj2, this.A0G, userSession, EnumC33425Epw.A0J, new Runnable() { // from class: X.Ap8
                @Override // java.lang.Runnable
                public final void run() {
                }
            });
        }
        InputMethodManager inputMethodManager = (InputMethodManager) context.getSystemService("input_method");
        if (inputMethodManager != null && inputMethodManager.isActive() && (currentFocus = this.A0J.getCurrentFocus()) != null) {
            inputMethodManager.hideSoftInputFromWindow(currentFocus.getWindowToken(), 0);
        }
    }

    @Override // X.InterfaceC60152ox
    public final void DOK(int i, boolean z) {
        if (this.A0C > i) {
            this.A06.clearFocus();
            InterfaceC1810081c.A00(this.A0M);
        }
        this.A0C = i;
        this.A06.DOK(i, z);
        int i2 = C1812982h.A00;
        View view = this.A01;
        int i3 = 0;
        if (z) {
            i3 = i - i2;
        }
        AbstractC13880nE.A0U(view, i3);
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        if (!this.A0B) {
            C3I9 c3i9 = this.A0T;
            if (z) {
                c3i9.A9e(this);
                AbstractC13880nE.A0R(view);
            } else {
                c3i9.EFx(this);
                AbstractC13880nE.A0O(view);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0046, code lost:
    
        if (r19 == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public APn(android.view.View r6, androidx.fragment.app.FragmentActivity r7, X.AbstractC59962oe r8, com.instagram.common.session.UserSession r9, X.C3I9 r10, X.C8O8 r11, com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider r12, X.AnonymousClass840 r13, X.InterfaceC1810081c r14, X.C8NX r15, X.C190388bw r16, X.InterfaceC169517hR r17, boolean r18, boolean r19) {
        /*
            r5 = this;
            r5.<init>()
            r3 = 0
            r5.A0A = r3
            r5.A0B = r3
            r1 = 2
            X.9Jp r0 = new X.9Jp
            r0.<init>(r5, r1)
            r5.A0S = r0
            r5.A0J = r7
            android.content.Context r2 = r6.getContext()
            r5.A0H = r2
            r5.A0T = r10
            r5.A0V = r13
            r0 = r16
            r5.A0Z = r0
            r5.A0U = r11
            r5.A0G = r8
            r5.A0F = r8
            X.8cG r1 = new X.8cG
            r0 = r17
            r1.<init>(r8, r9, r5, r0)
            r5.A0W = r1
            r0 = 1
            r1.setHasStableIds(r0)
            r5.A0M = r14
            r5.A0K = r9
            r5.A0N = r15
            r5.A0L = r12
            r0 = r18
            r5.A0b = r0
            r1 = r19
            r5.A0a = r1
            if (r18 != 0) goto L48
            r0 = 1
            if (r19 != 0) goto L49
        L48:
            r0 = 0
        L49:
            r5.A0c = r0
            if (r0 == 0) goto L5b
            X.0Tz r4 = X.C06090Tz.A05
            r0 = 36319235592428647(0x81082700001c67, double:3.031769062250545E-306)
            boolean r0 = X.C18U.A06(r4, r9, r0)
            if (r0 != 0) goto L5b
            r3 = 1
        L5b:
            r5.A0O = r3
            X.0iw r1 = r5.A0G
            X.8c3 r0 = new X.8c3
            r0.<init>(r1, r9)
            r5.A0Y = r0
            X.8c2 r0 = new X.8c2
            r0.<init>(r7, r9)
            r5.A0X = r0
            android.content.res.Resources r2 = r2.getResources()
            int r0 = X.AbstractC166997dE.A0E(r2)
            r5.A0P = r0
            int r1 = X.InterfaceC1812882f.A00(r12)
            int r0 = X.AbstractC166997dE.A0C(r2)
            int r0 = r0 * 4
            int r1 = r1 - r0
            r5.A0Q = r1
            r0 = 2131442703(0x7f0b3c0f, float:1.8507453E38)
            android.view.View r0 = r6.requireViewById(r0)
            r5.A0I = r0
            r0 = 2131436155(0x7f0b227b, float:1.8494172E38)
            android.view.View r0 = r6.requireViewById(r0)
            android.view.ViewStub r0 = (android.view.ViewStub) r0
            r5.A0R = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.APn.<init>(android.view.View, androidx.fragment.app.FragmentActivity, X.2oe, com.instagram.common.session.UserSession, X.3I9, X.8O8, com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider, X.840, X.81c, X.8NX, X.8bw, X.7hR, boolean, boolean):void");
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        int length = editable.length();
        ConstrainedEditText constrainedEditText = this.A06;
        if (length > 0) {
            constrainedEditText.setHint("");
            this.A0W.A02(editable);
            this.A0Y.A01();
        } else {
            constrainedEditText.setHint(AbstractC202818xz.A02(this.A0H, this.A0K));
            this.A0W.A02 = false;
            A00(this);
        }
        AbstractC202818xz.A06(this.A06, this.A0P, this.A0Q);
    }

    @Override // X.InterfaceC190628cK
    public final void DkM(ConstrainedEditText constrainedEditText, int i, int i2) {
        AbstractC167027dH.A0q(constrainedEditText, i, i2);
    }
}
