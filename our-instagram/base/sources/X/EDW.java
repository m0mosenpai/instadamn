package X;

import android.text.TextUtils;

/* loaded from: classes6.dex */
public class EDW extends C40781ul {
    public C35002FbZ A00;
    public String A01;
    public boolean A02;

    @Override // X.C40781ul, X.InterfaceC40821up
    public String getErrorMessage() {
        if (TextUtils.isEmpty(this.A01)) {
            return this.mErrorMessage;
        }
        return this.A01;
    }

    @Override // X.C40781ul, X.C40791um, X.InterfaceC40801un
    public final boolean isOk() {
        if (((this instanceof EfT) || this.A02) && super.isOk()) {
            return true;
        }
        return false;
    }
}
