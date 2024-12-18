package com.facebook.browser.lite.extensions.autofill.instagram;

import X.AbstractC43592JPx;
import X.C0f9;
import X.C58883QEt;
import X.QF6;
import X.STG;
import X.TNG;
import X.TNH;
import android.content.Context;
import com.facebook.browser.lite.ipc.AutofillOptOutCallback;
import java.util.Map;

/* loaded from: classes10.dex */
public final class AutofillController$InstagramAutofillOptOutCallbackHandler extends AutofillOptOutCallback.Stub {
    public final Context A00;
    public final C58883QEt A01;
    public final QF6 A02;
    public final Map A03;
    public final boolean A04;

    public AutofillController$InstagramAutofillOptOutCallbackHandler(Context context, C58883QEt c58883QEt, QF6 qf6, Map map, boolean z) {
        int A03 = C0f9.A03(1865864625);
        this.A00 = context;
        this.A01 = c58883QEt;
        this.A04 = z;
        this.A02 = qf6;
        this.A03 = map;
        C0f9.A0A(-590519486, A03);
        C0f9.A0A(2031910769, C0f9.A03(2019492565));
    }

    @Override // com.facebook.browser.lite.ipc.AutofillOptOutCallback
    public final void D1E(String str, boolean z) {
        int A03 = C0f9.A03(-1443480586);
        AbstractC43592JPx.A1W(str, this.A03, z);
        if (this.A04) {
            STG.A00(new TNG(this, z));
        }
        if (!z) {
            STG.A00(new TNH(this, str));
        }
        C0f9.A0A(-250285624, A03);
    }
}
