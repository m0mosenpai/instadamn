package X;

import android.content.Context;
import android.content.ServiceConnection;
import com.google.android.finsky.externalreferrer.IGetInstallReferrerService;

/* renamed from: X.SWc, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C62896SWc {
    public int A00;
    public ServiceConnection A01;
    public IGetInstallReferrerService A02;
    public final Context A03;

    public C62896SWc(Context context) {
        this.A00 = 0;
        this.A03 = context.getApplicationContext();
    }

    public C62896SWc() {
    }
}
