package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.text.Editable;
import android.text.InputFilter;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgEditText;
import com.instagram.model.reels.Reel;
import com.instagram.user.model.User;

/* renamed from: X.6dW, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C143316dW implements InterfaceC143326dX, InterfaceC145136gY {
    public int A00;
    public long A01;
    public IgEditText A02;
    public C57012jc A03;
    public C148396m9 A04;
    public C45078Jx7 A05;
    public C5SW A06;
    public C41181vS A07;
    public C41551w4 A08;
    public C148376m7 A09;
    public C141596ac A0A;
    public User A0B;
    public Integer A0C;
    public Long A0D;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;
    public boolean A0K;
    public boolean A0L;
    public boolean A0M;
    public boolean A0N;
    public boolean A0O;
    public boolean A0P;
    public boolean A0Q;
    public C148386m8 A0R;
    public User A0S;
    public String A0T;
    public String A0U;
    public final Activity A0V;
    public final Context A0W;
    public final View A0X;
    public final View A0Y;
    public final View A0Z;
    public final View A0a;
    public final TextView A0b;
    public final AbstractC59962oe A0c;
    public final InterfaceC11380iw A0d;
    public final UserSession A0e;
    public final C57012jc A0f;
    public final C57012jc A0g;
    public final C57012jc A0h;
    public final C57012jc A0i;
    public final InterfaceC56392iX A0j;
    public final C150866ql A0k;
    public final InterfaceC148366m6 A0l;
    public final C149596oC A0m;
    public final C3G2 A0n;
    public final ViewOnKeyListenerC148356m5 A0o;
    public final InterfaceC09390do A0p;
    public final AbstractC018607g A0q;
    public final InterfaceC02550Ad A0r;
    public final C2DS A0s;
    public final boolean A0t;

    public C143316dW(Activity activity, View view, AbstractC018607g abstractC018607g, InterfaceC02550Ad interfaceC02550Ad, AbstractC59962oe abstractC59962oe, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C149596oC c149596oC, C2DS c2ds, C3G2 c3g2, ViewOnKeyListenerC148356m5 viewOnKeyListenerC148356m5, String str, String str2) {
        ViewStub viewStub;
        ViewStub viewStub2;
        ViewStub viewStub3;
        ViewStub viewStub4;
        C14360o3.A0B(userSession, 2);
        C14360o3.A0B(c3g2, 3);
        C14360o3.A0B(interfaceC02550Ad, 4);
        C14360o3.A0B(str, 5);
        C14360o3.A0B(str2, 6);
        this.A0Z = view;
        this.A0e = userSession;
        this.A0n = c3g2;
        this.A0r = interfaceC02550Ad;
        this.A0d = interfaceC11380iw;
        this.A0o = viewOnKeyListenerC148356m5;
        this.A0V = activity;
        this.A0c = abstractC59962oe;
        this.A0q = abstractC018607g;
        this.A0s = c2ds;
        this.A0m = c149596oC;
        this.A0k = new C150866ql(userSession);
        Context context = view.getContext();
        this.A0W = context;
        View requireViewById = view.requireViewById(R.id.reel_viewer_message_composer);
        C14360o3.A07(requireViewById);
        this.A0X = requireViewById;
        View requireViewById2 = view.requireViewById(R.id.reel_viewer_message_composer_container);
        C14360o3.A07(requireViewById2);
        this.A0Y = requireViewById2;
        View requireViewById3 = view.requireViewById(R.id.reel_reaction_toolbar);
        C14360o3.A07(requireViewById3);
        this.A0a = requireViewById3;
        View findViewById = view.findViewById(R.id.reel_viewer_composer_user_active_now_stub);
        if (findViewById instanceof ViewStub) {
            viewStub = (ViewStub) findViewById;
        } else {
            viewStub = null;
        }
        this.A0g = new C57012jc(viewStub);
        this.A0j = AbstractC56372iV.A01(view.requireViewById(R.id.reel_e2ee_indicator_stub), !AbstractC25351Lp.A00(userSession).A01(), false);
        View findViewById2 = requireViewById2.findViewById(R.id.reel_viewer_message_composer_gallery_button_stub);
        if (findViewById2 instanceof ViewStub) {
            viewStub2 = (ViewStub) findViewById2;
        } else {
            viewStub2 = null;
        }
        this.A0h = new C57012jc(viewStub2);
        View findViewById3 = requireViewById2.findViewById(R.id.reel_viewer_message_composer_camera_button_stub);
        if (findViewById3 instanceof ViewStub) {
            viewStub3 = (ViewStub) findViewById3;
        } else {
            viewStub3 = null;
        }
        this.A0f = new C57012jc(viewStub3);
        C06090Tz c06090Tz = C06090Tz.A05;
        boolean A06 = C18U.A06(c06090Tz, userSession, 36320691586343732L);
        this.A0t = A06;
        this.A0l = new InterfaceC148366m6() { // from class: X.6dY
            @Override // X.InterfaceC148366m6
            public final void CMc() {
            }

            @Override // X.InterfaceC148366m6
            public final void DWN() {
            }

            @Override // X.InterfaceC148366m6
            public final void DOh() {
                C143316dW.this.A0o.A07.EJE("opening_learn_more");
            }

            @Override // X.InterfaceC148366m6
            public final void DWL() {
                C143316dW c143316dW = C143316dW.this;
                c143316dW.A0V.runOnUiThread(new M2Y(c143316dW));
            }
        };
        this.A0p = AbstractC09440dt.A01(new C9E5(this, 21));
        if (A06) {
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.add_to_story_dual_destination_share_sheet_avatar_icon_size);
            ViewGroup.LayoutParams layoutParams = requireViewById.getLayoutParams();
            C14360o3.A0C(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            ((C56302iJ) layoutParams).A0e = dimensionPixelSize;
            requireViewById.setMinimumHeight(dimensionPixelSize);
        }
        IgEditText igEditText = (IgEditText) view.requireViewById(R.id.reel_viewer_message_composer_text);
        igEditText.setShowSoftInputOnFocus(false);
        igEditText.setHintTextColor(-1);
        igEditText.setFilters(new InputFilter[]{new InputFilter.LengthFilter(igEditText.getContext().getResources().getInteger(R.integer.max_message_length))});
        igEditText.setOnKeyListener(new ViewOnKeyListenerC43616JQz(this));
        igEditText.addTextChangedListener(new JR0(this));
        this.A02 = igEditText;
        TextView textView = (TextView) view.requireViewById(R.id.reel_viewer_message_composer_text_send_btn);
        Context context2 = textView.getContext();
        C14360o3.A07(context2);
        textView.setTypeface(AbstractC15960qq.A00(context2).A02(EnumC15950qp.A13));
        this.A0b = textView;
        View findViewById4 = view.findViewById(R.id.story_smashable_send_button_stub);
        C57012jc c57012jc = new C57012jc(findViewById4 instanceof ViewStub ? (ViewStub) findViewById4 : null);
        this.A0i = c57012jc;
        this.A0J = A06();
        this.A0N = C18U.A06(c06090Tz, userSession, 36313557645658207L);
        this.A0L = C18U.A06(c06090Tz, userSession, 36314987869834179L);
        this.A0H = A05();
        if (this.A0J) {
            View findViewById5 = this.A0Y.findViewById(R.id.reel_viewer_message_composer_gif_button_stub);
            if (findViewById5 instanceof ViewStub) {
                viewStub4 = (ViewStub) findViewById5;
            } else {
                viewStub4 = null;
            }
            C57012jc c57012jc2 = new C57012jc(viewStub4);
            this.A03 = c57012jc2;
            c57012jc2.A02 = new C48555Lds(this);
        }
        A09();
        if (this.A0L) {
            this.A0h.A03(0);
        }
        A01();
        C14360o3.A07(context);
        this.A09 = new C148376m7(context, interfaceC11380iw, userSession);
        this.A0R = new C148386m8(context, userSession);
        boolean z = (this.A0J || this.A0L || this.A0H || this.A0M || this.A0O || !C18U.A06(c06090Tz, userSession, 36320476838109723L)) ? false : true;
        this.A0P = z;
        if (z) {
            View A01 = c57012jc.A01();
            C14360o3.A0C(A01, "null cannot be cast to non-null type android.view.ViewGroup");
            C148396m9 c148396m9 = new C148396m9((ViewGroup) A01);
            this.A04 = c148396m9;
            c148396m9.A00(context.getColor(AbstractC53242c7.A0H(context, R.attr.igds_color_icon_on_media)), false);
        }
    }

    @Override // X.InterfaceC143326dX
    public final boolean CPd() {
        return false;
    }

    @Override // X.InterfaceC143326dX
    public final void D5W(C8BD c8bd) {
    }

    @Override // X.InterfaceC145136gY
    public final void D8t(C41181vS c41181vS, C41551w4 c41551w4, InterfaceC143576dw interfaceC143576dw, C141596ac c141596ac) {
        C14360o3.A0B(interfaceC143576dw, 0);
        C14360o3.A0B(c41181vS, 1);
        C14360o3.A0B(c141596ac, 2);
        C14360o3.A0B(c41551w4, 3);
        TextView textView = this.A0b;
        textView.setOnClickListener(null);
        textView.setEnabled(false);
        if (this.A0P) {
            this.A0i.A01().setOnClickListener(null);
            Editable text = this.A02.getText();
            C14360o3.A07(text);
            boolean A0T = AbstractC001900j.A0T(text);
            C148396m9 c148396m9 = this.A04;
            if (A0T) {
                if (c148396m9 != null) {
                    c148396m9.A01(null, false, false);
                }
            } else if (c148396m9 != null) {
                c148396m9.A01(null, true, false);
            }
        }
        this.A07 = c41181vS;
        this.A08 = c41551w4;
        this.A0A = c141596ac;
        boolean z = false;
        if (!c41551w4.A0H.A1Q && !this.A0I) {
            z = C18U.A06(C06090Tz.A06, this.A0e, 36314987870030789L);
            C14360o3.A0A(Boolean.valueOf(z));
        }
        this.A0M = z;
        C41551w4 c41551w42 = this.A08;
        boolean z2 = false;
        if ((c41551w42 == null || !c41551w42.A0H.A1T) && !this.A0I) {
            z2 = C18U.A06(C06090Tz.A06, this.A0e, 36314987870555081L);
            C14360o3.A0A(Boolean.valueOf(z2));
        }
        this.A0O = z2;
        this.A0H = A05();
        A01();
        if (this.A0K) {
            this.A0Y.setVisibility(8);
            AbstractC13880nE.A0O(this.A02);
        } else {
            A03(this);
        }
    }

    @Override // X.InterfaceC145136gY
    public final /* synthetic */ void DNK(Reel reel) {
    }

    @Override // X.InterfaceC145136gY
    public final /* synthetic */ void DOJ(int i) {
    }

    @Override // X.InterfaceC145136gY
    public final /* synthetic */ void DPQ() {
    }

    @Override // X.InterfaceC145136gY
    public final /* synthetic */ void DPR() {
    }

    @Override // X.InterfaceC143326dX
    public final void DWb(C8BD c8bd) {
    }

    @Override // X.InterfaceC145136gY
    public final /* synthetic */ void DWn() {
    }

    @Override // X.InterfaceC145136gY
    public final /* synthetic */ void DXv(String str) {
    }

    @Override // X.InterfaceC145136gY
    public final /* synthetic */ void DhB() {
    }

    @Override // X.InterfaceC145136gY
    public final /* synthetic */ void Djr(int i) {
    }

    @Override // X.InterfaceC145136gY
    public final /* synthetic */ void Djs(int i, int i2) {
    }

    @Override // X.InterfaceC145136gY
    public final /* synthetic */ void Dju(int i, int i2) {
    }

    @Override // X.InterfaceC145136gY
    public final /* synthetic */ void Djv() {
    }

    @Override // X.InterfaceC145136gY
    public final /* synthetic */ void Dyy() {
    }

    @Override // X.InterfaceC145136gY
    public final /* synthetic */ void Dz0() {
    }

    @Override // X.InterfaceC145136gY
    public final /* synthetic */ void Dz7() {
    }

    @Override // X.InterfaceC145136gY
    public final /* synthetic */ void E00(C41181vS c41181vS, InterfaceC143586dx interfaceC143586dx) {
    }

    @Override // X.InterfaceC145136gY
    public final /* synthetic */ void onActivityResult(int i, int i2, Intent intent) {
    }

    @Override // X.InterfaceC145136gY
    public final /* synthetic */ void onDestroy() {
    }

    public static final C81663kb A00(C143316dW c143316dW) {
        User user;
        User user2;
        C2DS c2ds = c143316dW.A0s;
        if (c2ds == null || (user = c143316dW.A0S) == null) {
            return null;
        }
        C41181vS c41181vS = c143316dW.A07;
        if (c41181vS != null) {
            user2 = c41181vS.A0i;
        } else {
            user2 = null;
        }
        if (!C14360o3.A0K(user2, user)) {
            return null;
        }
        return c2ds.B3U(AbstractC140386Ws.A00(user, false).A00());
    }

    private final void A01() {
        if (this.A0H) {
            C57012jc c57012jc = this.A0f;
            C0fQ.A00(new LOU(this), c57012jc.A01());
            c57012jc.A02 = new C48554Ldr(this);
            c57012jc.A03(0);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x00f6, code lost:
    
        if (r7 != false) goto L51;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0067  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A02(X.C143316dW r16) {
        /*
            Method dump skipped, instructions count: 298
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C143316dW.A02(X.6dW):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0022, code lost:
    
        if (r5 != false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002c, code lost:
    
        if (r5 != false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0034, code lost:
    
        if (r5 != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x003c, code lost:
    
        if (r5 == false) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A03(X.C143316dW r10) {
        /*
            com.instagram.common.ui.base.IgEditText r0 = r10.A02
            android.text.Editable r0 = r0.getText()
            X.C14360o3.A07(r0)
            boolean r0 = X.AbstractC001900j.A0T(r0)
            r5 = 1
            if (r0 == 0) goto L11
            r5 = 0
        L11:
            X.1w4 r1 = r10.A08
            r0 = 0
            if (r1 == 0) goto L17
            r0 = 1
        L17:
            boolean r1 = r10.A06()
            r10.A0J = r1
            if (r1 == 0) goto Lc3
            if (r0 == 0) goto L24
            r4 = 1
            if (r5 == 0) goto L25
        L24:
            r4 = 0
        L25:
            r2 = r4 ^ 1
        L27:
            boolean r0 = r10.A0H
            if (r0 == 0) goto L2e
            r9 = 1
            if (r5 == 0) goto L2f
        L2e:
            r9 = 0
        L2f:
            boolean r0 = r10.A0L
            if (r0 == 0) goto L36
            r8 = 1
            if (r5 == 0) goto L37
        L36:
            r8 = 0
        L37:
            boolean r6 = r10.A0P
            if (r6 == 0) goto L3e
            r7 = 1
            if (r5 != 0) goto L3f
        L3e:
            r7 = 0
        L3f:
            r3 = 0
            if (r1 == 0) goto L4c
            android.widget.TextView r1 = r10.A0b
            r0 = 8
            if (r2 == 0) goto L49
            r0 = 0
        L49:
            r1.setVisibility(r0)
        L4c:
            X.2jc r1 = r10.A03
            if (r1 == 0) goto L58
            r0 = 8
            if (r4 == 0) goto L55
            r0 = 0
        L55:
            r1.A03(r0)
        L58:
            X.2jc r0 = r10.A0f
            android.view.View r0 = r0.A01()
            X.C14360o3.A07(r0)
            r4 = 8
            r2 = 1062836634(0x3f59999a, float:0.85)
            if (r9 == 0) goto L6b
            r4 = 0
            r2 = 1065353216(0x3f800000, float:1.0)
        L6b:
            X.5le r1 = X.AbstractC125325le.A01(r0, r3)
            r1.A0G()
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            r1.A0P(r2, r0)
            r1.A0Q(r2, r0)
            r1.A03 = r4
            X.2hf r0 = X.AbstractC84863qa.A00
            X.5le r0 = r1.A0E(r0)
            r2 = 1
            X.5le r0 = r0.A0F(r2)
            r0.A0H()
            if (r6 == 0) goto Lb5
            X.6m9 r1 = r10.A04
            if (r7 == 0) goto Lae
            if (r1 == 0) goto L96
            r0 = 0
            r1.A01(r0, r2, r2)
        L96:
            X.2jc r0 = r10.A0i
            android.view.View r1 = r0.A01()
            X.JR1 r0 = new X.JR1
            r0.<init>(r10)
            X.C0fQ.A00(r0, r1)
        La4:
            X.2jc r0 = r10.A0h
            if (r8 != 0) goto Laa
            r3 = 8
        Laa:
            r0.A03(r3)
            return
        Lae:
            if (r1 == 0) goto L96
            r0 = 0
            r1.A01(r0, r3, r2)
            goto L96
        Lb5:
            android.widget.TextView r1 = r10.A0b
            X.JR6 r0 = new X.JR6
            r0.<init>(r10)
            X.C0fQ.A00(r0, r1)
            r1.setEnabled(r5)
            goto La4
        Lc3:
            r4 = 0
            r2 = 0
            goto L27
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C143316dW.A03(X.6dW):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x012c, code lost:
    
        if (X.C141446aN.A01(r7, r3) == false) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0163, code lost:
    
        if (X.C6XB.A00.A00(r13, r2) == false) goto L76;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A04(X.C143316dW r18, java.lang.Integer r19) {
        /*
            Method dump skipped, instructions count: 897
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C143316dW.A04(X.6dW, java.lang.Integer):void");
    }

    private final boolean A05() {
        if (!this.A0M && !this.A0O) {
            if (!this.A0I) {
                if (!C18U.A06(C06090Tz.A05, this.A0e, 36314987869965252L)) {
                    return false;
                }
            } else {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0011, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, r4.A0e, 36313750920104167L) == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean A06() {
        /*
            r4 = this;
            boolean r0 = r4.A0I
            if (r0 == 0) goto L15
            com.instagram.common.session.UserSession r3 = r4.A0e
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36313750920104167(0x81032a000e08e7, double:3.028300533387541E-306)
            boolean r0 = X.C18U.A06(r2, r3, r0)
            if (r0 != 0) goto L15
        L13:
            r1 = 0
        L14:
            return r1
        L15:
            com.instagram.common.session.UserSession r3 = r4.A0e
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36318788915829225(0x8107bf000019e9, double:3.031486582170448E-306)
            boolean r0 = X.C18U.A06(r2, r3, r0)
            r1 = 1
            if (r0 == 0) goto L14
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C143316dW.A06():boolean");
    }

    public final void A07() {
        ViewGroup.LayoutParams layoutParams = this.A0a.getLayoutParams();
        C14360o3.A0C(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = 0;
        this.A0f.A03(0);
        this.A02.setVisibility(0);
        this.A0X.setVisibility(0);
    }

    public final void A09() {
        if (this.A0J) {
            C57012jc c57012jc = this.A03;
            if (c57012jc != null) {
                c57012jc.A03(0);
            }
            this.A0b.setVisibility(8);
            return;
        }
        if (!this.A0P) {
            this.A0b.setVisibility(0);
        }
        C57012jc c57012jc2 = this.A03;
        if (c57012jc2 == null) {
            return;
        }
        c57012jc2.A03(8);
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0062, code lost:
    
        if (X.C148376m7.A01(r3, "story_remix_reply") == true) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0064, code lost:
    
        r6.A02.requestFocus();
        r3.A03(new X.C49568LvN(r6, r7), r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0071, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00a8, code lost:
    
        if (r1 != false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00bc, code lost:
    
        if (X.C148376m7.A01(r3, "story_selfie_reply") == true) goto L36;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0A(java.lang.Integer r7) {
        /*
            r6 = this;
            X.1vS r2 = r6.A07
            r0 = 0
            if (r2 == 0) goto L4a
            java.lang.String r1 = r2.A0j
        L7:
            r6.A0T = r1
            if (r2 == 0) goto L48
            com.instagram.user.model.User r1 = r2.A0i
            if (r1 == 0) goto L48
            java.lang.String r1 = r1.getId()
        L13:
            r6.A0U = r1
            X.1vS r1 = r6.A07
            if (r1 == 0) goto L1b
            com.instagram.user.model.User r0 = r1.A0i
        L1b:
            r6.A0S = r0
            com.instagram.common.session.UserSession r5 = r6.A0e
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36320790371181465(0x81099100092399, double:3.032752310594419E-306)
            boolean r0 = X.C18U.A06(r2, r5, r0)
            if (r0 == 0) goto L37
            X.6oC r1 = r6.A0m
            if (r1 == 0) goto L37
            X.3kb r0 = A00(r6)
            r1.A03(r0)
        L37:
            X.6m8 r0 = r6.A0R
            java.lang.String r2 = "Required value was null."
            r4 = 1
            if (r0 == 0) goto L4c
            X.1vS r0 = r6.A07
            if (r0 != 0) goto L4c
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r2)
            throw r0
        L48:
            r1 = r0
            goto L13
        L4a:
            r1 = r0
            goto L7
        L4c:
            boolean r0 = r6.A0M
            if (r0 == 0) goto L72
            X.6m7 r3 = r6.A09
            java.lang.String r1 = "story_remix_reply"
            if (r3 == 0) goto L72
            X.1w4 r0 = r6.A08
            if (r0 == 0) goto Lc5
            X.1vS r0 = r6.A07
            if (r0 == 0) goto Lbf
            boolean r0 = X.C148376m7.A01(r3, r1)
            if (r0 != r4) goto L72
        L64:
            com.instagram.common.ui.base.IgEditText r0 = r6.A02
            r0.requestFocus()
            X.LvN r0 = new X.LvN
            r0.<init>(r6, r7)
            r3.A03(r0, r1)
            return
        L72:
            X.1w4 r0 = r6.A08
            if (r0 == 0) goto L80
            com.instagram.model.reels.Reel r0 = r0.A0H
            boolean r0 = r0.A1T
            if (r0 != r4) goto L80
        L7c:
            A04(r6, r7)
            return
        L80:
            boolean r0 = r6.A0I
            if (r0 != 0) goto L7c
            X.0Tz r3 = X.C06090Tz.A06
            r0 = 36314987870620618(0x81044a000d0bca, double:3.029082785874945E-306)
            boolean r1 = X.C18U.A06(r3, r5, r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            X.C14360o3.A0A(r0)
            if (r1 != 0) goto Laa
            r0 = 36314987870555081(0x81044a000c0bc9, double:3.029082785833499E-306)
            boolean r1 = X.C18U.A06(r3, r5, r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            X.C14360o3.A0A(r0)
            if (r1 == 0) goto L7c
        Laa:
            X.6m7 r3 = r6.A09
            java.lang.String r1 = "story_selfie_reply"
            if (r3 == 0) goto L7c
            X.1w4 r0 = r6.A08
            if (r0 == 0) goto Ld1
            X.1vS r0 = r6.A07
            if (r0 == 0) goto Lcb
            boolean r0 = X.C148376m7.A01(r3, r1)
            if (r0 != r4) goto L7c
            goto L64
        Lbf:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r2)
            throw r0
        Lc5:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r2)
            throw r0
        Lcb:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r2)
            throw r0
        Ld1:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C143316dW.A0A(java.lang.Integer):void");
    }

    public final boolean A0B() {
        Boolean bool;
        C5SW c5sw = this.A06;
        if (c5sw != null && c5sw.A09()) {
            return true;
        }
        C148376m7 c148376m7 = this.A09;
        if (c148376m7 != null) {
            C5SW c5sw2 = c148376m7.A00;
            if (c5sw2 != null) {
                bool = Boolean.valueOf(c5sw2.A09());
            } else {
                bool = null;
            }
            if (C14360o3.A0K(bool, true)) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // X.InterfaceC143326dX
    public final /* synthetic */ C8BD AYo() {
        return null;
    }

    @Override // X.InterfaceC145136gY
    public final /* synthetic */ boolean BWM() {
        return false;
    }

    @Override // X.InterfaceC145136gY
    public final /* synthetic */ int Bs6() {
        return 0;
    }

    @Override // X.InterfaceC145136gY
    public final /* synthetic */ boolean Buz() {
        return false;
    }

    @Override // X.InterfaceC143326dX
    public final /* synthetic */ boolean CKf() {
        return false;
    }

    @Override // X.InterfaceC145136gY
    public final /* synthetic */ boolean Cc5() {
        return false;
    }

    @Override // X.InterfaceC145136gY
    public final /* synthetic */ boolean DrR() {
        return false;
    }

    @Override // X.InterfaceC145136gY
    public final /* synthetic */ boolean Dra() {
        return false;
    }

    @Override // X.InterfaceC145136gY
    public final /* synthetic */ boolean DsD() {
        return false;
    }

    @Override // X.InterfaceC145136gY
    public final void onDestroyView() {
        AbstractC125325le.A01(this.A0Y, 0).A0G();
        this.A02.setOnKeyListener(null);
    }

    public final void A08() {
        A07();
        IgEditText igEditText = this.A02;
        igEditText.requestFocus();
        AbstractC13880nE.A0R(igEditText);
    }
}
