package X;

import android.text.TextUtils;
import android.text.TextWatcher;
import androidx.fragment.app.FragmentActivity;
import com.instagram.ui.widget.inlineerror.InlineErrorMessageView;
import com.instagram.ui.widget.progressbutton.ProgressButton;
import com.instagram.ui.widget.searchedittext.SearchEditText;

/* renamed from: X.ELj, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC32319ELj extends AbstractC59962oe implements InterfaceC60072op, InterfaceC37221GaW, GY6 {
    public static final String __redex_internal_original_name = "SimplePasswordCreationFragment";
    public EVN A00;
    public InlineErrorMessageView A01;
    public ProgressButton A02;
    public SearchEditText A03;
    public boolean A05;
    public final TextWatcher A06 = new Em2(this, 0);
    public boolean A04 = false;

    @Override // X.InterfaceC37221GaW
    public final void Dbn(boolean z) {
    }

    public abstract String getModuleName();

    @Override // X.InterfaceC37221GaW
    public final void APP() {
        this.A03.setEnabled(false);
    }

    @Override // X.InterfaceC37221GaW
    public final void ARU() {
        this.A03.setEnabled(true);
    }

    @Override // X.InterfaceC37221GaW
    public final EnumC33445EqI B75() {
        if (this instanceof C32119E9s) {
            return EnumC33445EqI.A07;
        }
        if (this instanceof C32120E9t) {
            return ((C32120E9t) this).A01.A01();
        }
        return null;
    }

    @Override // X.InterfaceC37221GaW
    public final EnumC31713DwI C0Q() {
        EnumC33523Erw enumC33523Erw;
        if (this instanceof C32119E9s) {
            enumC33523Erw = EnumC33523Erw.A0D;
        } else if (this instanceof C32120E9t) {
            enumC33523Erw = EnumC33523Erw.A0B;
        } else {
            if (this instanceof C32118E9r) {
                return EnumC31713DwI.A0Y;
            }
            return null;
        }
        return enumC33523Erw.A00;
    }

    @Override // X.InterfaceC37221GaW
    public final boolean CbE() {
        String A0J = AbstractC13880nE.A0J(this.A03);
        if (!TextUtils.isEmpty(A0J) && A0J.length() >= 6 && this.A05) {
            return true;
        }
        return false;
    }

    @Override // X.GY6
    public final void Eks(String str, Integer num) {
        InlineErrorMessageView inlineErrorMessageView = this.A01;
        inlineErrorMessageView.getClass();
        inlineErrorMessageView.A04(str);
        ProgressButton progressButton = this.A02;
        progressButton.getClass();
        progressButton.setShowProgressBar(false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0104, code lost:
    
        if (X.C1AD.A06(X.C06090Tz.A06, 18298033854743665L) != false) goto L35;
     */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View onCreateView(android.view.LayoutInflater r10, android.view.ViewGroup r11, android.os.Bundle r12) {
        /*
            Method dump skipped, instructions count: 297
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC32319ELj.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(1418512526);
        super.onDestroyView();
        this.A03.removeTextChangedListener(this.A06);
        this.A03 = null;
        this.A02 = null;
        this.A01 = null;
        unregisterLifecycleListener(this.A00);
        C0f9.A09(-528660448, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        int A02 = C0f9.A02(-2001062649);
        super.onResume();
        this.A03.requestFocus();
        AbstractC13880nE.A0R(this.A03);
        FragmentActivity activity = getActivity();
        if (activity != null && activity.getWindow() != null) {
            AbstractC31180DnO.A1A(this);
        }
        C0f9.A09(973628855, A02);
    }
}
