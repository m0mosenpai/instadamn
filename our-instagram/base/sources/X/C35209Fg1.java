package X;

import android.content.Context;
import android.view.View;
import com.instagram.ui.widget.textview.ComposerAutoCompleteTextView;

/* renamed from: X.Fg1, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C35209Fg1 {
    public ComposerAutoCompleteTextView A00;
    public View A01;
    public View A02;
    public boolean A03;
    public final Context A04;
    public final InterfaceC37155GYs A05;
    public final String A06;
    public final boolean A07;
    public final boolean A08;

    public C35209Fg1(Context context, InterfaceC37155GYs interfaceC37155GYs, boolean z) {
        this.A04 = context;
        this.A05 = interfaceC37155GYs;
        this.A06 = null;
        this.A08 = false;
        this.A07 = z;
    }

    public static final void A00(C35209Fg1 c35209Fg1) {
        if (c35209Fg1.A05.DkY(c35209Fg1.A02(), c35209Fg1.A08)) {
            ComposerAutoCompleteTextView composerAutoCompleteTextView = c35209Fg1.A00;
            if (composerAutoCompleteTextView == null) {
                C14360o3.A0F("messageEditText");
                throw C00O.createAndThrow();
            }
            AbstractC31171DnF.A14(composerAutoCompleteTextView);
            A01(c35209Fg1);
        }
    }

    public final String A02() {
        ComposerAutoCompleteTextView composerAutoCompleteTextView = this.A00;
        if (composerAutoCompleteTextView == null) {
            C14360o3.A0F("messageEditText");
            throw C00O.createAndThrow();
        }
        String A0g = AbstractC167007dF.A0g(composerAutoCompleteTextView);
        int length = A0g.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            int i2 = length;
            if (!z) {
                i2 = i;
            }
            boolean A19 = AbstractC167027dH.A19(A0g, i2);
            if (!z) {
                if (!A19) {
                    z = true;
                } else {
                    i++;
                }
            } else {
                if (!A19) {
                    break;
                }
                length--;
            }
        }
        return AbstractC31177DnL.A0g(A0g, length, i);
    }

    public final void A03() {
        ComposerAutoCompleteTextView composerAutoCompleteTextView = this.A00;
        if (composerAutoCompleteTextView == null) {
            C14360o3.A0F("messageEditText");
            throw C00O.createAndThrow();
        }
        AbstractC13880nE.A0O(composerAutoCompleteTextView);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000d, code lost:
    
        if (r1 == 0) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A01(X.C35209Fg1 r5) {
        /*
            java.lang.String r0 = r5.A02()
            r4 = 1
            r3 = 0
            if (r0 == 0) goto Lf
            int r1 = r0.length()
            r0 = 0
            if (r1 != 0) goto L10
        Lf:
            r0 = 1
        L10:
            java.lang.String r2 = "sendButton"
            if (r0 != 0) goto L31
            android.view.View r0 = r5.A02
            if (r0 == 0) goto L4f
            r0.setVisibility(r3)
            android.view.View r0 = r5.A02
            if (r0 == 0) goto L4f
            r0.setClickable(r4)
            android.view.View r1 = r5.A02
            if (r1 == 0) goto L4f
            r0 = 1065353216(0x3f800000, float:1.0)
            r1.setAlpha(r0)
            X.GYs r0 = r5.A05
            r0.D6m()
            return
        L31:
            boolean r0 = r5.A03
            android.view.View r1 = r5.A02
            if (r0 == 0) goto L47
            if (r1 == 0) goto L4f
            r1.setClickable(r3)
            android.view.View r1 = r5.A02
            if (r1 == 0) goto L4f
            r0 = 1050253722(0x3e99999a, float:0.3)
            r1.setAlpha(r0)
            return
        L47:
            if (r1 == 0) goto L4f
            r0 = 8
            r1.setVisibility(r0)
            return
        L4f:
            X.C14360o3.A0F(r2)
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C35209Fg1.A01(X.Fg1):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A04(android.view.View r8) {
        /*
            r7 = this;
            r0 = 2131440577(0x7f0b33c1, float:1.8503141E38)
            android.view.View r2 = r8.requireViewById(r0)
            r7.A01 = r2
            boolean r0 = r7.A08
            java.lang.String r6 = "messageComposer"
            r5 = 0
            if (r0 == 0) goto Lc0
            if (r2 == 0) goto Lcb
            android.content.Context r1 = r2.getContext()
            r0 = 2131231634(0x7f080392, float:1.8079355E38)
        L19:
            X.AbstractC31173DnH.A0z(r1, r2, r0)
            r0 = 2131440579(0x7f0b33c3, float:1.8503145E38)
            android.view.View r2 = r8.requireViewById(r0)
            com.instagram.ui.widget.textview.ComposerAutoCompleteTextView r2 = (com.instagram.ui.widget.textview.ComposerAutoCompleteTextView) r2
            r7.A00 = r2
            java.lang.String r1 = r7.A06
            java.lang.String r0 = "private_reply_message"
            boolean r0 = r0.equals(r1)
            java.lang.String r6 = "messageEditText"
            if (r0 == 0) goto Lb1
            if (r2 == 0) goto Lcb
            r0 = 2131959945(0x7f132089, float:1.9556545E38)
        L38:
            r2.setHint(r0)
        L3b:
            com.instagram.ui.widget.textview.ComposerAutoCompleteTextView r2 = r7.A00
            if (r2 == 0) goto Lcb
            android.content.Context r0 = r7.A04
            android.content.res.Resources r1 = r0.getResources()
            r0 = 2131492892(0x7f0c001c, float:1.8609249E38)
            int r1 = r1.getInteger(r0)
            android.text.InputFilter$LengthFilter r0 = new android.text.InputFilter$LengthFilter
            r0.<init>(r1)
            android.text.InputFilter[] r0 = new android.text.InputFilter[]{r0}
            r2.setFilters(r0)
            boolean r0 = r7.A07
            java.lang.String r4 = "sendButton"
            if (r0 == 0) goto La7
            r0 = 2131440570(0x7f0b33ba, float:1.8503127E38)
            android.view.View r3 = r8.requireViewById(r0)
            r7.A02 = r3
            if (r3 == 0) goto Lcf
            boolean r0 = r3 instanceof com.instagram.common.ui.base.IgSimpleImageView
            if (r0 == 0) goto L89
            android.widget.ImageView r3 = (android.widget.ImageView) r3
            android.graphics.drawable.Drawable r2 = r3.getDrawable()
            android.content.Context r1 = X.AbstractC166997dE.A0L(r3)
            android.content.res.ColorStateList r0 = X.C1QI.A0C(r1, r5)
            int r0 = r0.getDefaultColor()
            r2.setTint(r0)
            android.content.res.ColorStateList r0 = X.C1QI.A0B(r1, r5)
            r3.setBackgroundTintList(r0)
        L89:
            android.view.View r1 = r7.A02
            if (r1 == 0) goto Lcf
            r0 = 23
            X.ViewOnClickListenerC35691FpR.A01(r1, r0, r7)
            com.instagram.ui.widget.textview.ComposerAutoCompleteTextView r1 = r7.A00
            if (r1 == 0) goto Lcb
            r0 = 12
            X.C35469Fl4.A00(r1, r7, r0)
            com.instagram.ui.widget.textview.ComposerAutoCompleteTextView r1 = r7.A00
            if (r1 == 0) goto Lcb
            r0 = 4
            X.C35754Fqr.A00(r1, r7, r0)
            A01(r7)
            return
        La7:
            r0 = 2131440569(0x7f0b33b9, float:1.8503125E38)
            android.view.View r0 = r8.requireViewById(r0)
            r7.A02 = r0
            goto L89
        Lb1:
            java.lang.String r0 = "message_merchant"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L3b
            if (r2 == 0) goto Lcb
            r0 = 2131959944(0x7f132088, float:1.9556543E38)
            goto L38
        Lc0:
            if (r2 == 0) goto Lcb
            android.content.Context r1 = r8.getContext()
            r0 = 2131231633(0x7f080391, float:1.8079353E38)
            goto L19
        Lcb:
            X.C14360o3.A0F(r6)
            goto Ld2
        Lcf:
            X.C14360o3.A0F(r4)
        Ld2:
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C35209Fg1.A04(android.view.View):void");
    }

    public C35209Fg1(Context context, InterfaceC37155GYs interfaceC37155GYs, String str, boolean z, boolean z2) {
        this.A04 = context;
        this.A05 = interfaceC37155GYs;
        this.A06 = str;
        this.A08 = z;
        this.A03 = z2;
        this.A07 = false;
    }
}
