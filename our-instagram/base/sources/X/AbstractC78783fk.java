package X;

import android.text.TextUtils;
import java.util.Locale;

/* renamed from: X.3fk, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC78783fk implements InterfaceC78793fl {
    public final InterfaceC78813fn A00;

    @Override // X.InterfaceC78793fl
    public final boolean CcD(CharSequence charSequence, int i, int i2) {
        AbstractC78783fk abstractC78783fk;
        if (i2 >= 0 && charSequence.length() - i2 >= 0) {
            InterfaceC78813fn interfaceC78813fn = this.A00;
            if (interfaceC78813fn == null) {
                abstractC78783fk = this;
                if (!(this instanceof C78773fj)) {
                    if (TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1) {
                        return true;
                    }
                    return false;
                }
            } else {
                int AHF = interfaceC78813fn.AHF(charSequence, 0, i2);
                if (AHF != 0) {
                    if (AHF != 1) {
                        abstractC78783fk = this;
                        if (!(this instanceof C78773fj)) {
                            if (TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1) {
                                return true;
                            }
                            return false;
                        }
                    } else {
                        return false;
                    }
                } else {
                    return true;
                }
            }
            return ((C78773fj) abstractC78783fk).A00;
        }
        throw new IllegalArgumentException();
    }

    public AbstractC78783fk(InterfaceC78813fn interfaceC78813fn) {
        this.A00 = interfaceC78813fn;
    }
}
