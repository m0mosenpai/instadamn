package X;

import android.text.Editable;
import com.instagram.ui.widget.textview.ComposerAutoCompleteTextView;

/* renamed from: X.7Fy, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C160127Fy implements InterfaceC160037Fp {
    public String A00;
    public final ComposerAutoCompleteTextView A01;

    public C160127Fy(ComposerAutoCompleteTextView composerAutoCompleteTextView) {
        C14360o3.A0B(composerAutoCompleteTextView, 1);
        this.A01 = composerAutoCompleteTextView;
        this.A00 = "";
    }

    @Override // X.InterfaceC160037Fp
    public final String Auv() {
        return this.A00;
    }

    @Override // X.InterfaceC160037Fp
    public final Editable B0K() {
        return this.A01.getText();
    }
}
