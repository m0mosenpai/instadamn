package X;

import com.instagram.ui.widget.textview.ComposerAutoCompleteTextView;

/* loaded from: classes8.dex */
public final /* synthetic */ class M4N implements Runnable {
    public final /* synthetic */ C47629L1o A00;
    public final /* synthetic */ C160007Fm A01;

    public /* synthetic */ M4N(C47629L1o c47629L1o, C160007Fm c160007Fm) {
        this.A01 = c160007Fm;
        this.A00 = c47629L1o;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C160007Fm c160007Fm = this.A01;
        C47629L1o c47629L1o = this.A00;
        ComposerAutoCompleteTextView composerAutoCompleteTextView = c160007Fm.A0S;
        AbstractC31171DnF.A14(composerAutoCompleteTextView);
        composerAutoCompleteTextView.setSelection(0);
        if (c47629L1o != null) {
            C159737El c159737El = c47629L1o.A00;
            String[] split = c47629L1o.A01.split(c47629L1o.A02);
            int length = split.length;
            while (true) {
                length--;
                if (length < 0) {
                    break;
                }
                if (!split[length].trim().isEmpty()) {
                    c159737El.A1T(split[length].trim());
                    if (length <= 0) {
                        break;
                    } else {
                        c159737El.A1Q(EnumC160197Gf.A03);
                    }
                }
            }
            C160007Fm c160007Fm2 = c159737El.A0b;
            c160007Fm2.A0E = false;
            C7ON c7on = c160007Fm2.A0B;
            if (c7on != null) {
                c7on.A03 = false;
            }
        }
    }
}
