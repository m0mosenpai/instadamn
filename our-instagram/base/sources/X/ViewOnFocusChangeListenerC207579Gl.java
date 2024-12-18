package X;

import android.content.Context;
import android.text.TextWatcher;
import android.view.View;
import android.view.ViewStub;
import android.widget.EditText;
import android.widget.TextView;
import com.instagram.common.session.UserSession;
import com.instagram.reels.interactive.view.AvatarView;

/* renamed from: X.9Gl, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class ViewOnFocusChangeListenerC207579Gl extends C3PD implements TextWatcher, View.OnFocusChangeListener, InterfaceC195198kL {
    public int A00;
    public View A01;
    public View A02;
    public View A03;
    public EditText A04;
    public TextView A05;
    public TextView A06;
    public C57012jc A07;
    public AvatarView A08;
    public AlD A09;
    public JFZ A0A;
    public String A0B;
    public String A0C;
    public boolean A0D;
    public TextView A0E;
    public CharSequence A0F;
    public final Context A0G;
    public final UserSession A0H;
    public final String A0I;
    public final String A0J;
    public final ViewStub A0K;
    public final C149646oH A0L;
    public final InterfaceC25200BCy A0M;
    public final C195208kM A0N;
    public final Runnable A0O;

    public ViewOnFocusChangeListenerC207579Gl(ViewStub viewStub, UserSession userSession, C3I9 c3i9, C149646oH c149646oH, InterfaceC25200BCy interfaceC25200BCy, String str, String str2) {
        AbstractC167027dH.A0a(1, viewStub, c3i9, userSession, c149646oH);
        AbstractC167017dG.A1U(str, str2);
        this.A0K = viewStub;
        Context A0L = AbstractC166997dE.A0L(viewStub);
        this.A0G = A0L;
        this.A0N = new C195208kM(A0L, c3i9, this);
        this.A0H = userSession;
        this.A0L = c149646oH;
        this.A0M = interfaceC25200BCy;
        this.A0O = new Runnable() { // from class: X.9Gm
            @Override // java.lang.Runnable
            public final void run() {
                ViewOnFocusChangeListenerC207579Gl.A01(ViewOnFocusChangeListenerC207579Gl.this);
            }
        };
        this.A0F = "";
        this.A0I = str;
        this.A0J = str2;
        this.A00 = -1;
        this.A0B = "unknown";
    }

    /* JADX WARN: Code restructure failed: missing block: B:138:0x016a, code lost:
    
        if (r1 != true) goto L54;
     */
    /* JADX WARN: Removed duplicated region for block: B:122:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x023a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A02(android.view.View r10, X.AlD r11, X.JFZ r12, X.C17N r13, java.lang.String r14, java.lang.String r15, int r16) {
        /*
            Method dump skipped, instructions count: 722
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ViewOnFocusChangeListenerC207579Gl.A02(android.view.View, X.AlD, X.JFZ, X.17N, java.lang.String, java.lang.String, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0027, code lost:
    
        if (r1 != true) goto L14;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [X.1Ok, X.1OW] */
    @Override // X.C3PD, X.C3PE
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean DsE(android.view.View r17) {
        /*
            Method dump skipped, instructions count: 241
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ViewOnFocusChangeListenerC207579Gl.DsE(android.view.View):boolean");
    }

    @Override // X.InterfaceC195198kL
    public final void E0p(int i, int i2) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0066, code lost:
    
        if (r1 == 0) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x008c, code lost:
    
        if (r1 != true) goto L45;
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
            android.widget.EditText r0 = r7.A04
            if (r0 == 0) goto L4d
            int r1 = r0.getLineCount()
            r0 = 3
            if (r1 <= r0) goto L4d
            int r1 = r8.length()
            java.lang.CharSequence r0 = r7.A0F
            r8.replace(r2, r1, r0)
        L18:
            r7.A00()
            android.view.View r0 = r7.A01
            if (r0 == 0) goto La4
            android.widget.EditText r0 = r7.A04
            if (r0 == 0) goto L4b
            android.text.Editable r0 = r0.getText()
        L27:
            java.lang.String r6 = java.lang.String.valueOf(r0)
            int r5 = r6.length()
            r3 = 1
            int r5 = r5 - r3
            r4 = 0
            r1 = 0
        L33:
            if (r2 > r5) goto L55
            r0 = r5
            if (r1 != 0) goto L39
            r0 = r2
        L39:
            boolean r0 = X.AbstractC167027dH.A19(r6, r0)
            if (r1 != 0) goto L46
            if (r0 != 0) goto L43
            r1 = 1
            goto L33
        L43:
            int r2 = r2 + 1
            goto L33
        L46:
            if (r0 == 0) goto L55
            int r5 = r5 + (-1)
            goto L33
        L4b:
            r0 = 0
            goto L27
        L4d:
            android.text.SpannableStringBuilder r0 = new android.text.SpannableStringBuilder
            r0.<init>(r8)
            r7.A0F = r0
            goto L18
        L55:
            int r0 = r5 + 1
            java.lang.CharSequence r0 = r6.subSequence(r2, r0)
            java.lang.String r0 = r0.toString()
            if (r0 == 0) goto L68
            int r1 = r0.length()
            r0 = 0
            if (r1 != 0) goto L69
        L68:
            r0 = 1
        L69:
            r1 = r0 ^ 1
            android.widget.TextView r0 = r7.A05
            if (r0 == 0) goto L76
            if (r1 != 0) goto L73
            r4 = 8
        L73:
            r0.setVisibility(r4)
        L76:
            android.widget.TextView r0 = r7.A05
            if (r0 == 0) goto L7d
            r0.setEnabled(r1)
        L7d:
            android.widget.TextView r2 = r7.A05
            if (r2 == 0) goto L94
            X.AlD r0 = r7.A09
            if (r0 == 0) goto L8e
            boolean r1 = r0.A08()
            r0 = 2131969757(0x7f1346dd, float:1.9576446E38)
            if (r1 == r3) goto L91
        L8e:
            r0 = 2131973280(0x7f1354a0, float:1.9583591E38)
        L91:
            r2.setText(r0)
        L94:
            boolean r0 = r7.A0D
            android.widget.TextView r2 = r7.A05
            if (r0 == 0) goto La5
            if (r2 == 0) goto La4
            android.content.Context r1 = r7.A0G
            r0 = 2131099990(0x7f060156, float:1.7812349E38)
        La1:
            X.AbstractC166987dD.A1O(r1, r2, r0)
        La4:
            return
        La5:
            if (r2 == 0) goto La4
            android.content.Context r1 = r7.A0G
            r0 = 2131099690(0x7f06002a, float:1.781174E38)
            goto La1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ViewOnFocusChangeListenerC207579Gl.afterTextChanged(android.text.Editable):void");
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

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0013, code lost:
    
        if (r1 == 0) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void A00() {
        /*
            r3 = this;
            android.view.View r0 = r3.A01
            if (r0 == 0) goto L26
            android.widget.EditText r0 = r3.A04
            if (r0 == 0) goto L15
            android.text.Editable r0 = r0.getText()
            if (r0 == 0) goto L15
            int r1 = r0.length()
            r0 = 0
            if (r1 != 0) goto L16
        L15:
            r0 = 1
        L16:
            r2 = r0 ^ 1
            android.widget.EditText r1 = r3.A04
            if (r1 == 0) goto L26
            r0 = 8388611(0x800003, float:1.1754948E-38)
            if (r2 == 0) goto L23
            r0 = 17
        L23:
            r1.setGravity(r0)
        L26:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ViewOnFocusChangeListenerC207579Gl.A00():void");
    }

    public static final void A01(ViewOnFocusChangeListenerC207579Gl viewOnFocusChangeListenerC207579Gl) {
        EditText editText;
        View view = viewOnFocusChangeListenerC207579Gl.A01;
        if (view != null) {
            view.setVisibility(8);
            if (viewOnFocusChangeListenerC207579Gl.A01 != null && (editText = viewOnFocusChangeListenerC207579Gl.A04) != null) {
                editText.setText("");
            }
            EditText editText2 = viewOnFocusChangeListenerC207579Gl.A04;
            if (editText2 != null) {
                editText2.clearFocus();
            }
            TextView textView = viewOnFocusChangeListenerC207579Gl.A05;
            if (textView != null) {
                textView.removeCallbacks(viewOnFocusChangeListenerC207579Gl.A0O);
            }
            viewOnFocusChangeListenerC207579Gl.A0L.A00 = false;
            viewOnFocusChangeListenerC207579Gl.A0M.Dci();
        }
    }

    @Override // X.InterfaceC195198kL
    public final void DOI() {
        TextView textView = this.A06;
        if (textView != null) {
            textView.clearFocus();
        }
        A01(this);
    }
}
