package X;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;

/* renamed from: X.GEc, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36656GEc implements GYB {
    public final Dialog A00;
    public final Context A01;
    public final C193328hC A02;

    @Override // X.GYB
    public final void CJ8(android.net.Uri uri, Bundle bundle) {
        C0fJ.A00(this.A00);
    }

    public C36656GEc(Context context) {
        this.A01 = context;
        C193328hC A0I = AbstractC31171DnF.A0I(context);
        this.A02 = A0I;
        AbstractC31172DnG.A1C(context, A0I, 2131960805);
        AbstractC31173DnH.A16(context, A0I, 2131960804);
        A0I.A0d(new DialogInterfaceOnClickListenerC35301Fha(13), AbstractC166997dE.A0p(context, 2131960803));
        this.A00 = A0I.A02();
    }
}
