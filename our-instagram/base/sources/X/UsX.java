package X;

import android.os.Bundle;
import android.view.View;

/* loaded from: classes11.dex */
public final class UsX extends C66375UEj {
    public final /* synthetic */ UDV A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UsX(View view, UDV udv, int i, boolean z) {
        super(view, i, z);
        this.A00 = udv;
    }

    @Override // X.C66375UEj, X.C02V
    public final boolean A0V(View view, int i, Bundle bundle) {
        if (i == 16) {
            UDV udv = this.A00;
            int length = udv.getText().length();
            if (length > 0) {
                udv.setSelection(length);
            }
            return UDV.A02(udv);
        }
        return super.A0V(view, i, bundle);
    }
}
