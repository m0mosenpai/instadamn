package X;

import android.os.RemoteException;

/* renamed from: X.SqK, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63612SqK implements InterfaceC58362lv {
    public final C2GT A00;
    public final InterfaceC16660sJ A01;

    @Override // X.InterfaceC58362lv
    public final void onChanged(Object obj) {
        try {
            this.A01.invoke(obj);
        } catch (RemoteException e) {
            android.util.Log.wtf("com.facebook.fbpay.w3c.FBPayObservable", "Callback invocation failed", e);
            this.A00.A08(this);
        }
    }

    public C63612SqK(C2GT c2gt, InterfaceC16660sJ interfaceC16660sJ) {
        this.A00 = c2gt;
        this.A01 = interfaceC16660sJ;
    }
}
