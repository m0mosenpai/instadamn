package X;

import java.util.ArrayList;

/* loaded from: classes6.dex */
public class EDX extends C40781ul {
    public String A00;
    public String A01;
    public String A02;
    public ArrayList A03;
    public boolean A04;

    @Override // X.C40781ul, X.InterfaceC40821up
    public String getErrorMessage() {
        return this.A00;
    }

    @Override // X.C40781ul, X.C40791um, X.InterfaceC40801un
    public final boolean isOk() {
        boolean z;
        if (super.isOk()) {
            if (this instanceof EfW) {
                z = true;
            } else {
                z = this.A04;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }
}
