package X;

import android.widget.TextView;
import com.instagram.ui.widget.editphonenumber.EditPhoneNumberView;

/* renamed from: X.GHm, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36743GHm implements InterfaceC37212GaN {
    public final /* synthetic */ TextView A00;
    public final /* synthetic */ C81413kB A01;
    public final /* synthetic */ C66112yn A02;

    @Override // X.InterfaceC37212GaN
    public final void CxI() {
    }

    @Override // X.InterfaceC37212GaN
    public final boolean DCu(int i) {
        if (i == 2) {
            TextView textView = this.A00;
            if (textView != null) {
                textView.performClick();
                return true;
            }
            throw AbstractC166997dE.A0g();
        }
        return false;
    }

    @Override // X.InterfaceC37212GaN
    public final void DYO() {
    }

    @Override // X.InterfaceC37212GaN
    public final void DyV() {
    }

    public C36743GHm(TextView textView, C81413kB c81413kB, C66112yn c66112yn) {
        this.A00 = textView;
        this.A01 = c81413kB;
        this.A02 = c66112yn;
    }

    @Override // X.InterfaceC37212GaN
    public final void Dx4() {
        C34515FJb A00;
        EditPhoneNumberView editPhoneNumberView = this.A01.A01;
        if (editPhoneNumberView != null && (A00 = FAN.A00(this.A02.A00, editPhoneNumberView)) != null) {
            A00.A00 = true;
        }
    }
}
