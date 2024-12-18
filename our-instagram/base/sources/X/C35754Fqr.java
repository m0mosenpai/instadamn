package X;

import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.actionbar.ActionButton;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.ui.widget.progressbutton.ProgressButton;
import com.instagram.ui.widget.searchedittext.SearchEditText;

/* renamed from: X.Fqr, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C35754Fqr implements TextView.OnEditorActionListener {
    public final int A00;
    public final Object A01;

    public C35754Fqr(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public static void A00(TextView textView, Object obj, int i) {
        textView.setOnEditorActionListener(new C35754Fqr(obj, i));
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        EL7 el7;
        ProgressButton progressButton;
        EK8 ek8;
        ProgressButton progressButton2;
        CharSequence text;
        SearchEditText searchEditText;
        boolean z;
        EVN evn;
        switch (this.A00) {
            case 0:
                if ((i == 6 || (keyEvent != null && keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66)) && (progressButton = (el7 = (EL7) this.A01).A01) != null && progressButton.isEnabled()) {
                    EL7.A00(el7);
                    return true;
                }
                return false;
            case 1:
                if (i == 6) {
                    ((View) this.A01).clearFocus();
                    return false;
                }
                return false;
            case 2:
                if (i == 6) {
                    C210989Uv c210989Uv = (C210989Uv) this.A01;
                    int i2 = C3OO.FLAG_ADAPTER_FULLUPDATE;
                    C211859aC c211859aC = c210989Uv.A00;
                    if (c211859aC != null && c211859aC.A03) {
                        C23630AdP.A00(c210989Uv.A02.A00);
                        return true;
                    }
                    throw AbstractC31172DnG.A0u();
                }
                return false;
            case 3:
                if (i == 4 || (keyEvent != null && keyEvent.getKeyCode() == 66)) {
                    C35149Fer.A00((C35149Fer) this.A01);
                    return false;
                }
                return false;
            case 4:
                if (i == 4 || (keyEvent != null && keyEvent.getKeyCode() == 66)) {
                    C35209Fg1.A00((C35209Fg1) this.A01);
                    return true;
                }
                return false;
            case 5:
                if (i == 6) {
                    EME eme = (EME) this.A01;
                    C14360o3.A0A(textView);
                    EME.A02(textView, eme);
                    return true;
                }
                return false;
            case 6:
                if (i == 2) {
                    EMQ emq = (EMQ) this.A01;
                    if (emq.A04.isEnabled()) {
                        emq.A01();
                        return true;
                    }
                    return true;
                }
                return false;
            case 7:
                if ((i == 6 || (keyEvent != null && keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66)) && (progressButton2 = (ek8 = (EK8) this.A01).A03) != null && progressButton2.isEnabled()) {
                    EV0.A01(ek8, AbstractC35276FhB.A0G(ek8.A02, AbstractC13880nE.A0J(ek8.A01)), 29);
                    return true;
                }
                return false;
            case 8:
                if (i != 5) {
                    return true;
                }
                ELH elh = (ELH) this.A01;
                if (elh.A0G.isEnabled()) {
                    elh.A05();
                    return false;
                }
                return false;
            case 9:
                ELC elc = (ELC) this.A01;
                if (i == 6) {
                    if (elc.A07.A00()) {
                        ELC.A02(elc);
                        return false;
                    }
                    return false;
                }
                return true;
            case 10:
                if (i == 2) {
                    C32271EJg c32271EJg = (C32271EJg) this.A01;
                    ActionButton actionButton = c32271EJg.A05;
                    if (actionButton != null && actionButton.isEnabled()) {
                        C32271EJg.A00(c32271EJg);
                        return true;
                    }
                    return true;
                }
                return false;
            case 11:
                C32267EJc c32267EJc = (C32267EJc) this.A01;
                ProgressButton progressButton3 = c32267EJc.A02;
                if (progressButton3 == null) {
                    C14360o3.A0F("nextButton");
                    throw C00O.createAndThrow();
                }
                if (progressButton3.isEnabled()) {
                    if (i == 6 || (keyEvent != null && keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66)) {
                        C32267EJc.A00(c32267EJc);
                        return true;
                    }
                    return false;
                }
                return false;
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                C14360o3.A0B(textView, 0);
                if ((i == 6 || (keyEvent != null && keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66)) && (text = textView.getText()) != null && text.length() != 0) {
                    C32262EIw.A00((C32262EIw) this.A01);
                    return true;
                }
                return false;
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                if (i == 5) {
                    EL9 el9 = (EL9) this.A01;
                    if (el9.A00) {
                        EL9.A02(el9);
                        return true;
                    }
                    EL9.A01(el9);
                    return true;
                }
                return false;
            case 14:
                if (i == 6 || (keyEvent != null && keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66)) {
                    EL3.A00((EL3) this.A01);
                    return false;
                }
                return false;
            case Process.SIGTERM /* 15 */:
                if (i == 6 || (keyEvent != null && keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66)) {
                    C32316ELf c32316ELf = (C32316ELf) this.A01;
                    String str = C32316ELf.A0X;
                    if (!AbstractC31179DnN.A1a(c32316ELf.A05) && !AbstractC31179DnN.A1a(c32316ELf.A03) && !c32316ELf.A0G) {
                        C32316ELf.A02(c32316ELf, true);
                        return true;
                    }
                    return false;
                }
                return false;
            case 16:
                if (5 == i && (searchEditText = ((EKC) this.A01).A0E) != null) {
                    searchEditText.requestFocus();
                    return true;
                }
                return false;
            case 17:
                if (i == 2 || i == 6 || i == 5) {
                    EKC ekc = (EKC) this.A01;
                    z = true;
                    if (ekc.CbE()) {
                        evn = ekc.A09;
                        break;
                    } else {
                        EKC.A02(ekc);
                        return true;
                    }
                } else {
                    return false;
                }
                break;
            case 18:
                if (i == 6) {
                    C32281EJs.A01((C32281EJs) this.A01);
                    return true;
                }
                return false;
            case Process.SIGSTOP /* 19 */:
                if (i == 2 || i == 6 || i == 5) {
                    evn = (EVN) this.A01;
                    z = true;
                    if (!evn.A01.CbE()) {
                        return false;
                    }
                } else {
                    return false;
                }
                break;
            case 20:
                if (i == 6 || (keyEvent != null && keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66)) {
                    C33157Ek0.A00((C33157Ek0) this.A01);
                    return true;
                }
                return false;
            case 21:
                if (i == 6 || (keyEvent != null && keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66)) {
                    C33158Ek1.A01((C33158Ek1) this.A01);
                    return true;
                }
                return false;
            default:
                return ((InterfaceC37212GaN) this.A01).DCu(i);
        }
        evn.A03(z);
        return z;
    }
}
