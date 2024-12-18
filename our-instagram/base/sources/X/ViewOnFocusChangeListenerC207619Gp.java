package X;

import android.content.Context;
import android.text.TextWatcher;
import android.view.View;
import android.view.ViewStub;
import android.widget.EditText;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.reels.interactive.view.AvatarView;
import java.util.ArrayList;

/* renamed from: X.9Gp, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class ViewOnFocusChangeListenerC207619Gp extends C3PD implements TextWatcher, View.OnFocusChangeListener, InterfaceC195198kL {
    public int A00;
    public View A01;
    public View A02;
    public View A03;
    public View A04;
    public EditText A05;
    public TextView A06;
    public TextView A07;
    public TextView A08;
    public InterfaceC56392iX A09;
    public AvatarView A0A;
    public AlD A0B;
    public C17N A0C;
    public String A0D;
    public String A0E;
    public boolean A0F;
    public CharSequence A0G;
    public final Context A0H;
    public final ViewStub A0I;
    public final FragmentActivity A0J;
    public final UserSession A0K;
    public final C149646oH A0L;
    public final InterfaceC25200BCy A0M;
    public final C195208kM A0N;
    public final String A0O;
    public final String A0P;
    public final ArrayList A0Q;
    public final Runnable A0R;

    public ViewOnFocusChangeListenerC207619Gp(ViewStub viewStub, FragmentActivity fragmentActivity, UserSession userSession, C3I9 c3i9, C149646oH c149646oH, InterfaceC25200BCy interfaceC25200BCy, String str, String str2) {
        AbstractC167027dH.A0a(1, viewStub, c3i9, userSession, c149646oH);
        AbstractC167017dG.A1U(str, str2);
        this.A0I = viewStub;
        this.A0K = userSession;
        this.A0L = c149646oH;
        this.A0M = interfaceC25200BCy;
        this.A0O = str;
        this.A0P = str2;
        this.A0J = fragmentActivity;
        Context A0L = AbstractC166997dE.A0L(viewStub);
        this.A0H = A0L;
        this.A0N = new C195208kM(A0L, c3i9, this);
        this.A0R = new Runnable() { // from class: X.9Gq
            @Override // java.lang.Runnable
            public final void run() {
                ViewOnFocusChangeListenerC207619Gp.A01(ViewOnFocusChangeListenerC207619Gp.this, true);
            }
        };
        this.A0Q = AbstractC166987dD.A1E();
        this.A0G = "";
        this.A0D = "unknown";
        this.A00 = -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0033, code lost:
    
        if (r1 == false) goto L21;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [X.1Ok, X.1OW] */
    @Override // X.C3PD, X.C3PE
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean DsE(android.view.View r11) {
        /*
            r10 = this;
            r1 = 0
            X.C14360o3.A0B(r11, r1)
            android.widget.TextView r0 = r10.A06
            if (r0 != 0) goto L12
            java.lang.String r4 = "cancelButton"
        La:
            X.C14360o3.A0F(r4)
        Ld:
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        L12:
            r7 = 1
            if (r11 != r0) goto L19
            A01(r10, r7)
        L18:
            return r7
        L19:
            android.widget.TextView r0 = r10.A07
            java.lang.String r4 = "sendButton"
            if (r0 == 0) goto La
            if (r11 != r0) goto L18
            r0.setEnabled(r1)
            android.widget.TextView r2 = r10.A07
            if (r2 == 0) goto La
            X.AlD r0 = r10.A0B
            if (r0 == 0) goto L35
            boolean r1 = r0.A08()
            r0 = 2131971220(0x7f134c94, float:1.9579413E38)
            if (r1 != 0) goto L38
        L35:
            r0 = 2131971236(0x7f134ca4, float:1.9579446E38)
        L38:
            r2.setText(r0)
            boolean r0 = r10.A0F
            if (r0 == 0) goto L4b
            android.widget.TextView r2 = r10.A07
            if (r2 == 0) goto La
            android.content.Context r1 = r10.A0H
            r0 = 2131100693(0x7f060415, float:1.7813775E38)
            X.AbstractC166987dD.A1O(r1, r2, r0)
        L4b:
            android.widget.TextView r3 = r10.A07
            if (r3 == 0) goto La
            java.lang.Runnable r2 = r10.A0R
            r0 = 750(0x2ee, double:3.705E-321)
            r3.postDelayed(r2, r0)
            X.AlD r0 = r10.A0B
            if (r0 == 0) goto Lb9
            boolean r0 = r0.A08()
            if (r0 == 0) goto Lb9
        L60:
            X.AlD r0 = r10.A0B
            if (r0 == 0) goto L18
            java.lang.String r3 = "stickerModel"
            X.URE r0 = r0.A00
            java.lang.String r0 = r0.A08
            if (r0 == 0) goto L18
            java.lang.String r0 = r10.A0E
            if (r0 == 0) goto L18
            android.widget.EditText r0 = r10.A05
            if (r0 != 0) goto L7a
            java.lang.String r3 = "stickerAnswerView"
        L76:
            X.C14360o3.A0F(r3)
            goto Ld
        L7a:
            java.lang.String r9 = X.AbstractC167007dF.A0g(r0)
            java.lang.String r8 = r10.A0E
            java.lang.String r2 = "Required value was null."
            if (r8 == 0) goto Ld1
            X.AlD r1 = r10.A0B
            if (r1 == 0) goto L76
            X.URE r0 = r1.A00
            java.lang.String r6 = r0.A08
            if (r6 == 0) goto Lcc
            java.lang.String r5 = r10.A0O
            java.lang.String r4 = r10.A0D
            java.lang.String r3 = r10.A0P
            int r2 = r10.A00
            boolean r0 = r1.A08()
            X.1Ok r1 = new X.1Ok
            r1.<init>()
            r1.A02 = r8
            r1.A03 = r6
            r1.A05 = r9
            r1.A04 = r5
            r1.A01 = r4
            r1.A06 = r3
            r1.A00 = r2
            r1.A07 = r0
            com.instagram.common.session.UserSession r0 = r10.A0K
            X.1Ov r0 = X.C26141Ov.A01(r0)
            r0.A0B(r1)
            return r7
        Lb9:
            com.instagram.common.session.UserSession r0 = r10.A0K
            X.0xq r0 = X.AbstractC166987dD.A0x(r0)
            X.0xo r1 = r0.ARD()
            java.lang.String r0 = "has_ever_responded_to_story_question"
            r1.E77(r0, r7)
            r1.apply()
            goto L60
        Lcc:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A14(r2)
            throw r0
        Ld1:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A14(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ViewOnFocusChangeListenerC207619Gp.DsE(android.view.View):boolean");
    }

    @Override // X.InterfaceC195198kL
    public final void E0p(int i, int i2) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0083, code lost:
    
        if (r1 == false) goto L39;
     */
    @Override // android.text.TextWatcher
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void afterTextChanged(android.text.Editable r8) {
        /*
            r7 = this;
            r2 = 0
            X.C14360o3.A0B(r8, r2)
            android.widget.EditText r0 = r7.A05
            if (r0 == 0) goto Ld9
            int r1 = r0.getLineCount()
            r0 = 3
            if (r1 <= r0) goto L47
            int r1 = r8.length()
            java.lang.CharSequence r0 = r7.A0G
            r8.replace(r2, r1, r0)
        L18:
            A00(r7)
            android.view.View r0 = r7.A01
            if (r0 == 0) goto L9b
            android.widget.EditText r0 = r7.A05
            if (r0 == 0) goto Ld9
            java.lang.String r6 = X.AbstractC167007dF.A0g(r0)
            int r5 = r6.length()
            r4 = 1
            int r5 = r5 - r4
            r3 = 0
            r1 = 0
        L2f:
            if (r2 > r5) goto L4f
            r0 = r5
            if (r1 != 0) goto L35
            r0 = r2
        L35:
            boolean r0 = X.AbstractC167027dH.A19(r6, r0)
            if (r1 != 0) goto L42
            if (r0 != 0) goto L3f
            r1 = 1
            goto L2f
        L3f:
            int r2 = r2 + 1
            goto L2f
        L42:
            if (r0 == 0) goto L4f
            int r5 = r5 + (-1)
            goto L2f
        L47:
            android.text.SpannableStringBuilder r0 = new android.text.SpannableStringBuilder
            r0.<init>(r8)
            r7.A0G = r0
            goto L18
        L4f:
            int r0 = r5 + 1
            java.lang.CharSequence r0 = r6.subSequence(r2, r0)
            java.lang.String r0 = r0.toString()
            int r0 = r0.length()
            if (r0 > 0) goto L60
            r4 = 0
        L60:
            android.widget.TextView r0 = r7.A07
            java.lang.String r5 = "sendButton"
            if (r0 == 0) goto Ldb
            if (r4 != 0) goto L6a
            r3 = 8
        L6a:
            r0.setVisibility(r3)
            android.widget.TextView r0 = r7.A07
            if (r0 == 0) goto Ldb
            r0.setEnabled(r4)
            android.widget.TextView r2 = r7.A07
            if (r2 == 0) goto Ldb
            X.AlD r0 = r7.A0B
            if (r0 == 0) goto L85
            boolean r1 = r0.A08()
            r0 = 2131969757(0x7f1346dd, float:1.9576446E38)
            if (r1 != 0) goto L88
        L85:
            r0 = 2131973280(0x7f1354a0, float:1.9583591E38)
        L88:
            r2.setText(r0)
            boolean r0 = r7.A0F
            android.widget.TextView r2 = r7.A07
            if (r0 == 0) goto Ld0
            if (r2 == 0) goto Ldb
            android.content.Context r1 = r7.A0H
            r0 = 2131099990(0x7f060156, float:1.7812349E38)
        L98:
            X.AbstractC166987dD.A1O(r1, r2, r0)
        L9b:
            android.view.View r0 = r7.A01
            if (r0 == 0) goto Ld8
            android.widget.EditText r0 = r7.A05
            if (r0 == 0) goto Ld9
            java.lang.String r0 = X.AbstractC167007dF.A0g(r0)
            java.lang.CharSequence r0 = X.AbstractC001900j.A0B(r0)
            java.lang.String r0 = r0.toString()
            boolean r0 = X.AbstractC001900j.A0T(r0)
            r3 = r0 ^ 1
            java.util.ArrayList r0 = r7.A0Q
            java.util.Iterator r2 = X.AbstractC166997dE.A13(r0)
        Lbb:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto Ld8
            java.lang.Object r1 = X.AbstractC166997dE.A0l(r2)
            android.view.View r1 = (android.view.View) r1
            r0 = 0
            if (r3 == 0) goto Lcc
            r0 = 8
        Lcc:
            r1.setVisibility(r0)
            goto Lbb
        Ld0:
            if (r2 == 0) goto Ldb
            android.content.Context r1 = r7.A0H
            r0 = 2131099690(0x7f06002a, float:1.781174E38)
            goto L98
        Ld8:
            return
        Ld9:
            java.lang.String r5 = "stickerAnswerView"
        Ldb:
            X.C14360o3.A0F(r5)
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ViewOnFocusChangeListenerC207619Gp.afterTextChanged(android.text.Editable):void");
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        C14360o3.A0B(view, 0);
        C195208kM c195208kM = this.A0N;
        C3I9 c3i9 = c195208kM.A07;
        if (z) {
            c3i9.A9e(c195208kM);
            AbstractC13880nE.A0R(view);
        } else {
            c3i9.EFx(c195208kM);
            AbstractC13880nE.A0O(view);
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0016, code lost:
    
        if (r0 == null) goto L7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A00(X.ViewOnFocusChangeListenerC207619Gp r5) {
        /*
            android.view.View r0 = r5.A01
            if (r0 == 0) goto L57
            java.util.ArrayList r0 = r5.A0Q
            boolean r0 = r0.isEmpty()
            r4 = 1
            r1 = r0 ^ 1
            r3 = 8388611(0x800003, float:1.1754948E-38)
            java.lang.String r2 = "stickerAnswerView"
            android.widget.EditText r0 = r5.A05
            if (r1 == 0) goto L20
            if (r0 != 0) goto L54
        L18:
            X.C14360o3.A0F(r2)
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        L20:
            if (r0 == 0) goto L18
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            java.lang.String r0 = "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams"
            X.C14360o3.A0C(r1, r0)
            android.widget.FrameLayout$LayoutParams r1 = (android.widget.FrameLayout.LayoutParams) r1
            r1.gravity = r4
            android.widget.EditText r0 = r5.A05
            if (r0 == 0) goto L18
            r0.setLayoutParams(r1)
            android.widget.EditText r0 = r5.A05
            if (r0 == 0) goto L18
            java.lang.String r0 = X.AbstractC167007dF.A0g(r0)
            java.lang.CharSequence r0 = X.AbstractC001900j.A0B(r0)
            java.lang.String r0 = r0.toString()
            boolean r0 = X.AbstractC001900j.A0T(r0)
            r1 = r0 ^ 1
            android.widget.EditText r0 = r5.A05
            if (r0 == 0) goto L18
            if (r1 == 0) goto L54
            r3 = 17
        L54:
            r0.setGravity(r3)
        L57:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ViewOnFocusChangeListenerC207619Gp.A00(X.9Gp):void");
    }

    public static final void A01(ViewOnFocusChangeListenerC207619Gp viewOnFocusChangeListenerC207619Gp, boolean z) {
        String str;
        View view = viewOnFocusChangeListenerC207619Gp.A01;
        if (view != null) {
            view.setVisibility(8);
            if (z && viewOnFocusChangeListenerC207619Gp.A01 != null) {
                EditText editText = viewOnFocusChangeListenerC207619Gp.A05;
                if (editText != null) {
                    editText.setText("");
                }
                str = "stickerAnswerView";
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            }
            EditText editText2 = viewOnFocusChangeListenerC207619Gp.A05;
            if (editText2 != null) {
                editText2.clearFocus();
                TextView textView = viewOnFocusChangeListenerC207619Gp.A07;
                if (textView == null) {
                    str = "sendButton";
                    C14360o3.A0F(str);
                    throw C00O.createAndThrow();
                }
                textView.removeCallbacks(viewOnFocusChangeListenerC207619Gp.A0R);
                viewOnFocusChangeListenerC207619Gp.A0L.A00 = false;
                viewOnFocusChangeListenerC207619Gp.A0M.Dci();
                return;
            }
            str = "stickerAnswerView";
            C14360o3.A0F(str);
            throw C00O.createAndThrow();
        }
    }

    @Override // X.InterfaceC195198kL
    public final void DOI() {
        TextView textView = this.A08;
        if (textView == null) {
            C14360o3.A0F("stickerQuestionView");
            throw C00O.createAndThrow();
        }
        textView.clearFocus();
        A01(this, false);
    }
}
