package X;

import android.content.Context;
import android.content.Intent;

/* renamed from: X.0Qc, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C05300Qc extends C07980bI {
    @Override // X.C07980bI
    public final /* bridge */ /* synthetic */ C07980bI A06(String str) {
        return new C07980bI(this.A01, str, this.A03, this.A04);
    }

    @Override // X.C07980bI
    public final boolean A0G(Context context, Intent intent) {
        InterfaceC07800ax interfaceC07800ax = this.A00;
        if (interfaceC07800ax != null) {
            interfaceC07800ax.DOS(intent);
        }
        return super.A0G(context, intent);
    }
}
