package X;

import android.text.Editable;
import android.text.NoCopySpan;
import android.text.TextWatcher;
import android.view.View;
import android.widget.TextView;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.common.ui.base.IgEditText;
import com.instagram.react.modules.base.IgReactQEModule;

/* loaded from: classes8.dex */
public final class LO2 implements NoCopySpan, TextWatcher {
    public final int A00;
    public final Object A01;

    public LO2(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public static void A00(TextView textView, Object obj, int i) {
        textView.addTextChangedListener(new LO2(obj, i));
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        String str;
        String str2;
        String obj;
        String str3;
        C42221xC A00;
        C41761wQ c41761wQ;
        InterfaceC42241xE interfaceC42241xE;
        String obj2;
        String str4;
        switch (this.A00) {
            case 2:
                C48592LeU.A01((C48592LeU) this.A01);
                return;
            case 3:
                if (editable == null || (str4 = editable.toString()) == null) {
                    str4 = "";
                }
                C44458JlQ c44458JlQ = (C44458JlQ) ((C45816KPv) this.A01).A08.getValue();
                StringBuilder A1C = AbstractC166987dD.A1C();
                int length = str4.length();
                for (int i = 0; i < length; i++) {
                    char charAt = str4.charAt(i);
                    if (Character.isDigit(charAt)) {
                        A1C.append(charAt);
                    }
                }
                String A19 = AbstractC166987dD.A19(A1C);
                C05A c05a = c44458JlQ.A0G;
                if (C14360o3.A0K(c05a.getValue(), A19)) {
                    return;
                }
                c05a.Egh(A19);
                if (A19.length() > 0) {
                    c44458JlQ.A0D.F8m(null);
                }
                String str5 = (String) c05a.getValue();
                if (str5 == null || str5.length() != 6) {
                    return;
                }
                c44458JlQ.A06.A05("OTC_ENTER_PIN_CODE_ENTERED");
                c44458JlQ.A0F.F8m(new C47317KvS(true));
                c44458JlQ.A07.A04 = true;
                A00 = C43597JQd.A00(c44458JlQ.A02, c44458JlQ, 9);
                c41761wQ = c44458JlQ.A03;
                interfaceC42241xE = C49737Ly6.A00;
                c41761wQ.A02(A00, interfaceC42241xE);
                return;
            case 4:
                C44460JlS c44460JlS = (C44460JlS) ((C45815KPu) this.A01).A0E.getValue();
                if (editable != null && (obj2 = editable.toString()) != null) {
                    StringBuilder A1C2 = AbstractC166987dD.A1C();
                    int length2 = obj2.length();
                    for (int i2 = 0; i2 < length2; i2++) {
                        char charAt2 = obj2.charAt(i2);
                        if (Character.isDigit(charAt2)) {
                            A1C2.append(charAt2);
                        }
                    }
                    str3 = AbstractC166987dD.A19(A1C2);
                } else {
                    str3 = "";
                }
                C05A c05a2 = c44460JlS.A0P;
                if (C14360o3.A0K(c05a2.getValue(), str3)) {
                    return;
                }
                c44460JlS.A0N.Egh(EnumC46158Kbw.A05);
                c44460JlS.A0L.Egh(BHS.A00(new Object[0], 2131969651));
                c05a2.Egh(str3);
                String str6 = (String) c05a2.getValue();
                if (str6 == null || str6.length() != 6) {
                    return;
                }
                AbstractC166997dE.A1Y(c44460JlS.A0Q, true);
                AbstractC43593JPy.A1S(c44460JlS, null, AbstractC141776au.A00(c44460JlS), 40);
                c44460JlS.A08.A05("PIN_RESTORE_ATTEMPT");
                A00 = C43597JQd.A00(c44460JlS.A03, c44460JlS, 10);
                c41761wQ = c44460JlS.A04;
                interfaceC42241xE = C49739Ly8.A00;
                c41761wQ.A02(A00, interfaceC42241xE);
                return;
            case 5:
                C44464JlW c44464JlW = (C44464JlW) ((C45817KPw) this.A01).A08.getValue();
                if (editable != null && (obj = editable.toString()) != null) {
                    StringBuilder A1C3 = AbstractC166987dD.A1C();
                    int length3 = obj.length();
                    for (int i3 = 0; i3 < length3; i3++) {
                        char charAt3 = obj.charAt(i3);
                        if (Character.isDigit(charAt3)) {
                            A1C3.append(charAt3);
                        }
                    }
                    str2 = AbstractC166987dD.A19(A1C3);
                } else {
                    str2 = "";
                }
                C05A c05a3 = c44464JlW.A0K;
                if (C14360o3.A0K(c05a3.getValue(), str2)) {
                    return;
                }
                c05a3.Egh(str2);
                c44464JlW.A0J.Egh(null);
                String str7 = (String) c05a3.getValue();
                if (str7 == null || str7.length() != 6) {
                    return;
                }
                C05A c05a4 = c44464JlW.A0M;
                int ordinal = ((EnumC46139Kbd) c05a4.getValue()).ordinal();
                if (ordinal != 0) {
                    if (ordinal == 1) {
                        if (C14360o3.A0K(c44464JlW.A00, c05a3.getValue())) {
                            AbstractC166997dE.A1Y(c44464JlW.A0L, true);
                            c44464JlW.A09.A02 = true;
                            c44464JlW.A05.A02(C42221xC.A01(new JYF(c44464JlW, 0), c44464JlW.A03, c44464JlW.A04), C49740Ly9.A00);
                            AbstractC43593JPy.A1S(c44464JlW, null, AbstractC141776au.A00(c44464JlW), 43);
                            return;
                        }
                        c44464JlW.A08.A05("CONFIRM_PIN_WRONG_PIN");
                        C44464JlW.A00(BHS.A00(new Object[0], 2131961772), c44464JlW);
                        return;
                    }
                    throw B4Z.A00();
                }
                c44464JlW.A00 = (String) c05a3.getValue();
                KPI kpi = c44464JlW.A08;
                kpi.A05("CREATE_PIN_ENTERED");
                EnumC46139Kbd enumC46139Kbd = EnumC46139Kbd.A02;
                kpi.A05("CONFIRM_PIN_IMPRESSION");
                c05a4.Egh(enumC46139Kbd);
                c05a3.Egh("");
                return;
            case 6:
            case 10:
            case 11:
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
            case 16:
            default:
                return;
            case 7:
                C48787Lhu c48787Lhu = ((KD8) this.A01).A03;
                String str8 = null;
                if (c48787Lhu == null) {
                    str = "controller";
                    C14360o3.A0F(str);
                    throw C00O.createAndThrow();
                }
                if (editable != null) {
                    str8 = editable.toString();
                }
                c48787Lhu.A00 = str8;
                C48787Lhu.A01(c48787Lhu);
                return;
            case 8:
                C45466KBb c45466KBb = (C45466KBb) this.A01;
                IgEditText igEditText = c45466KBb.A0I;
                if (igEditText != null) {
                    C45466KBb.A05(editable, igEditText, c45466KBb);
                    if (!c45466KBb.A12) {
                        return;
                    }
                    String valueOf = String.valueOf(editable);
                    String str9 = c45466KBb.A0r;
                    int A0A = AbstractC167007dF.A0A(str9);
                    int A0A2 = AbstractC167007dF.A0A(valueOf);
                    if (!C14360o3.A0K(str9, valueOf) && A0A - A0A2 == 1) {
                        IgEditText igEditText2 = c45466KBb.A0I;
                        if (igEditText2 != null) {
                            igEditText2.getText().clear();
                        }
                    }
                    c45466KBb.A12 = false;
                    return;
                }
                str = "noteEditText";
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            case 9:
                C45466KBb c45466KBb2 = (C45466KBb) this.A01;
                Jn6 A02 = C45466KBb.A02(c45466KBb2);
                IgEditText igEditText3 = c45466KBb2.A0J;
                if (igEditText3 == null) {
                    str = "promptEditText";
                    C14360o3.A0F(str);
                    throw C00O.createAndThrow();
                }
                String A03 = C45466KBb.A03(editable, igEditText3, c45466KBb2);
                if (C14360o3.A0K(A02.A06, A03) || A02.A07 != null) {
                    return;
                }
                A02.A06 = A03;
                Jn6.A00(A02);
                Jn6.A01(A02, A02.A06);
                return;
            case 14:
                View view = (View) this.A01;
                boolean z = true;
                if (editable == null || editable.length() == 0) {
                    z = false;
                }
                view.setEnabled(z);
                return;
            case Process.SIGTERM /* 15 */:
                JQC A0k = AbstractC43592JPx.A0k(((KDY) this.A01).A0B);
                String valueOf2 = String.valueOf(editable);
                C14360o3.A0B(valueOf2, 0);
                A0k.A0O(new C50361MLn(valueOf2, 36));
                return;
            case 17:
                C14360o3.A0B(editable, 0);
                C43755JWt c43755JWt = (C43755JWt) this.A01;
                C43755JWt.A05(c43755JWt);
                boolean z2 = !AbstractC001900j.A0T(editable);
                C47767L7o c47767L7o = c43755JWt.A07;
                if (z2) {
                    if (c47767L7o == null) {
                        return;
                    }
                    c47767L7o.A00(false);
                    return;
                } else {
                    if (c47767L7o == null) {
                        return;
                    }
                    c47767L7o.A00(true);
                    return;
                }
            case 18:
                AbstractC166987dD.A1Y(this.A01);
                return;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x009f, code lost:
    
        if (X.AbstractC001900j.A0T(r5) != false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00c3, code lost:
    
        if (r0.length() == 0) goto L51;
     */
    @Override // android.text.TextWatcher
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onTextChanged(java.lang.CharSequence r5, int r6, int r7, int r8) {
        /*
            r4 = this;
            int r0 = r4.A00
            switch(r0) {
                case 0: goto L63;
                case 1: goto L94;
                case 2: goto L5;
                case 3: goto L5;
                case 4: goto L5;
                case 5: goto L5;
                case 6: goto Laa;
                case 7: goto L5;
                case 8: goto L5;
                case 9: goto L5;
                case 10: goto Lb2;
                case 11: goto L6;
                case 12: goto L30;
                case 13: goto L4a;
                case 14: goto L5;
                case 15: goto L5;
                case 16: goto Lcb;
                default: goto L5;
            }
        L5:
            return
        L6:
            java.lang.Object r2 = r4.A01
            X.KBX r2 = (X.KBX) r2
            com.instagram.ui.widget.textview.ComposerAutoCompleteTextView r0 = r2.A06
            if (r0 != 0) goto L18
            java.lang.String r0 = "editText"
            X.C14360o3.A0F(r0)
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        L18:
            java.lang.String r1 = X.AbstractC167007dF.A0g(r0)
            int r0 = r1.length()
            boolean r0 = X.AbstractC167007dF.A1O(r0)
            X.KBX.A00(r2, r0)
            X.L1i r0 = r2.A05
            if (r0 == 0) goto L5
            X.Jf2 r0 = r0.A00
            r0.A03 = r1
            return
        L30:
            java.lang.Object r2 = r4.A01
            com.instagram.direct.ui.polls.PollMessageOptionView r2 = (com.instagram.direct.ui.polls.PollMessageOptionView) r2
            r1 = 1
            if (r5 == 0) goto L48
            int r0 = r5.length()
            if (r0 <= 0) goto L48
        L3d:
            com.instagram.direct.ui.polls.PollMessageOptionView.A00(r2, r1)
            X.MQg r0 = r2.A01
            if (r0 == 0) goto L5
            r0.Dsb(r2, r5)
            return
        L48:
            r1 = 0
            goto L3d
        L4a:
            java.lang.Object r0 = r4.A01
            com.instagram.direct.visual.DirectVisualMessageViewerController r0 = (com.instagram.direct.visual.DirectVisualMessageViewerController) r0
            android.view.View r2 = r0.textSendButton
            if (r2 == 0) goto L5
            java.lang.String r0 = com.instagram.direct.visual.DirectVisualMessageViewerController.A05(r0)
            int r1 = r0.length()
            r0 = 0
            if (r1 != 0) goto L5f
            r0 = 8
        L5f:
            r2.setVisibility(r0)
            return
        L63:
            if (r5 == 0) goto L7c
            boolean r0 = X.AbstractC001900j.A0T(r5)
            if (r0 != 0) goto L7c
            java.lang.Object r0 = r4.A01
            X.KCK r0 = (X.KCK) r0
            X.KCK.A02(r0, r5)
            X.0mQ r1 = r0.A0A
            java.lang.String r0 = r5.toString()
            r1.A01(r0)
            return
        L7c:
            java.lang.Object r3 = r4.A01
            X.KCK r3 = (X.KCK) r3
            r2 = 0
            X.2iS r1 = X.C56352iT.A0t
            androidx.fragment.app.FragmentActivity r0 = r3.requireActivity()
            X.2iT r0 = r1.A03(r0)
            r0.EkG(r2)
            X.0mQ r0 = r3.A0A
            r0.A00()
            return
        L94:
            java.lang.Object r3 = r4.A01
            X.6m9 r3 = (X.C148396m9) r3
            if (r5 == 0) goto La1
            boolean r1 = X.AbstractC001900j.A0T(r5)
            r0 = 0
            if (r1 == 0) goto La2
        La1:
            r0 = 1
        La2:
            r2 = r0 ^ 1
            r1 = 0
            r0 = 0
            r3.A01(r1, r2, r0)
            return
        Laa:
            java.lang.Object r0 = r4.A01
            X.KCL r0 = (X.KCL) r0
            X.KCL.A02(r0)
            return
        Lb2:
            java.lang.Object r2 = r4.A01
            X.LLB r2 = (X.LLB) r2
            if (r5 == 0) goto Lc5
            java.lang.CharSequence r0 = X.AbstractC001900j.A0B(r5)
            if (r0 == 0) goto Lc5
            int r0 = r0.length()
            r1 = 0
            if (r0 != 0) goto Lc6
        Lc5:
            r1 = 1
        Lc6:
            r0 = 1
            X.LLB.A03(r2, r1, r0)
            return
        Lcb:
            java.lang.Object r1 = r4.A01
            X.0sJ r1 = (X.InterfaceC16660sJ) r1
            java.lang.String r0 = java.lang.String.valueOf(r5)
            r1.invoke(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.LO2.onTextChanged(java.lang.CharSequence, int, int, int):void");
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
