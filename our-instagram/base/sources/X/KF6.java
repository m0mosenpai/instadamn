package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.text.TextWatcher;
import android.view.View;
import com.instagram.ui.widget.edittext.ConfirmationCodeEditText;

/* loaded from: classes8.dex */
public final class KF6 extends AbstractC65806TuP {
    /* JADX WARN: Removed duplicated region for block: B:11:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0057  */
    @Override // X.AbstractC65806TuP
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ java.lang.Object A0K(android.view.View r16, X.C6FG r17, X.C102884kP r18, java.lang.Object r19) {
        /*
            r15 = this;
            r14 = r16
            com.instagram.ui.widget.edittext.ConfirmationCodeEditText r14 = (com.instagram.ui.widget.edittext.ConfirmationCodeEditText) r14
            r11 = r17
            r12 = r18
            java.lang.Object r2 = X.AnonymousClass634.A06(r11, r12)
            X.KuT r2 = (X.C47256KuT) r2
            if (r2 == 0) goto L99
            java.lang.String r0 = r12.A0J()
            r8 = 0
            if (r0 == 0) goto L27
            float r0 = X.C6BE.A01(r0)     // Catch: X.C41M -> L21
            int r0 = (int) r0     // Catch: X.C41M -> L21
            java.lang.Integer r7 = java.lang.Integer.valueOf(r0)     // Catch: X.C41M -> L21
            goto L28
        L21:
            r1 = move-exception
            java.lang.String r0 = "ConfirmationCodeTextInputNode"
            X.AbstractC25241Le.A03(r0, r1)
        L27:
            r7 = r8
        L28:
            r0 = 35
            r6 = 1
            int r4 = r12.A03(r0, r6)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)
            r1 = 36
            boolean r0 = r12.A0S(r1, r6)
            r3 = 0
            r14.A05(r7, r5, r0, r3)
            boolean r0 = r12.A0S(r1, r6)
            r14.A04(r4, r0)
            r1 = 33
            r0 = -1
            int r0 = r12.A03(r1, r0)
            r14.setId(r0)
            r0 = 38
            X.4lE r1 = r12.A0B(r0)
            r10 = r15
            if (r1 == 0) goto L61
            X.KaP r0 = new X.KaP
            r0.<init>(r15, r11, r12, r1)
            r2.A00 = r0
            r14.addTextChangedListener(r0)
        L61:
            r0 = 40
            X.4lE r13 = r12.A0B(r0)
            X.LRM r9 = new X.LRM
            r9.<init>(r10, r11, r12, r13, r14)
            r14.setOnEditorActionListener(r9)
            android.content.IntentFilter r2 = new android.content.IntentFilter
            r2.<init>()
            r0 = 254(0xfe, float:3.56E-43)
            java.lang.String r0 = X.AbstractC58317Pt9.A00(r0)
            r2.addAction(r0)
            X.T1h r0 = new X.T1h
            r0.<init>(r2, r15, r14, r4)
            X.0bm[] r0 = new X.InterfaceC08240bm[]{r0}
            X.0QS r1 = new X.0QS
            r1.<init>(r0)
            android.content.BroadcastReceiver r0 = r14.A05
            if (r0 != 0) goto L98
            r14.A05 = r1
            android.content.Context r0 = r14.getContext()
            X.C0DJ.A03(r1, r0, r2, r3)
        L98:
            return r8
        L99:
            java.lang.String r0 = "A controller was defined for this component but none was found"
            java.lang.RuntimeException r0 = X.AbstractC166987dD.A18(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.KF6.A0K(android.view.View, X.6FG, X.4kP, java.lang.Object):java.lang.Object");
    }

    @Override // X.AbstractC65806TuP
    public final /* bridge */ /* synthetic */ void A0M(View view, C6FG c6fg, C102884kP c102884kP, Object obj, Object obj2) {
        ConfirmationCodeEditText confirmationCodeEditText = (ConfirmationCodeEditText) view;
        C47256KuT c47256KuT = (C47256KuT) AnonymousClass634.A06(c6fg, c102884kP);
        if (c47256KuT != null) {
            TextWatcher textWatcher = c47256KuT.A00;
            if (textWatcher != null) {
                confirmationCodeEditText.removeTextChangedListener(textWatcher);
                c47256KuT.A00 = null;
            }
            AbstractC31171DnF.A14(confirmationCodeEditText);
            confirmationCodeEditText.setOnEditorActionListener(null);
            BroadcastReceiver broadcastReceiver = confirmationCodeEditText.A05;
            if (broadcastReceiver != null) {
                confirmationCodeEditText.getContext().unregisterReceiver(broadcastReceiver);
                confirmationCodeEditText.A05 = null;
                return;
            }
            return;
        }
        throw AbstractC166987dD.A18("A controller was defined for this component but none was found");
    }

    @Override // X.InterfaceC50822Vd
    public final /* bridge */ /* synthetic */ Object ALq(Context context) {
        ConfirmationCodeEditText confirmationCodeEditText = new ConfirmationCodeEditText(context);
        confirmationCodeEditText.setOnLongClickListener(new ViewOnLongClickListenerC35705Fpf(3, confirmationCodeEditText, confirmationCodeEditText));
        return confirmationCodeEditText;
    }

    @Override // X.AbstractC65806TuP
    public final /* bridge */ /* synthetic */ View A0J(Context context) {
        throw C00O.createAndThrow();
    }

    public KF6(C6FG c6fg, C102884kP c102884kP) {
        super(c6fg, c102884kP);
    }
}
