package X;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.form.IgFormField;

/* renamed from: X.Fl8, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C35472Fl8 implements TextWatcher {
    public final /* synthetic */ IgFormField A00;
    public final /* synthetic */ C32366ENp A01;
    public final /* synthetic */ C35008Fbf A02;
    public final /* synthetic */ C14510oO A03;
    public final /* synthetic */ C15100pQ A04;

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        C14360o3.A0B(editable, 0);
        if (this.A04.A00 >= 1 && editable.length() == 0) {
            this.A03.A00 = false;
            C32366ENp c32366ENp = this.A01;
            C35008Fbf c35008Fbf = this.A02;
            IgFormField igFormField = this.A00;
            UserSession session = c32366ENp.getSession();
            if (C18U.A06(AbstractC25225BEi.A0j(session, 0), session, 36330840594138159L)) {
                c35008Fbf.A01(c32366ENp.getSession());
                EditText mEditText = igFormField.getMEditText();
                C32024E5c c32024E5c = c35008Fbf.A01;
                String str = c35008Fbf.A00.A02;
                c32024E5c.A02 = str;
                mEditText.setHint(str);
            }
            View view = c32366ENp.A00;
            if (view == null) {
                C14360o3.A0F("editBioCtaShuffleContainer");
                throw C00O.createAndThrow();
            }
            view.setVisibility(0);
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        C14360o3.A0B(charSequence, 0);
        this.A04.A00 = charSequence.length();
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        C14360o3.A0B(charSequence, 0);
        if (charSequence.length() != 0) {
            View view = this.A01.A00;
            if (view == null) {
                C14360o3.A0F("editBioCtaShuffleContainer");
                throw C00O.createAndThrow();
            }
            view.setVisibility(8);
        }
    }

    public C35472Fl8(IgFormField igFormField, C32366ENp c32366ENp, C35008Fbf c35008Fbf, C14510oO c14510oO, C15100pQ c15100pQ) {
        this.A04 = c15100pQ;
        this.A01 = c32366ENp;
        this.A03 = c14510oO;
        this.A02 = c35008Fbf;
        this.A00 = igFormField;
    }
}
