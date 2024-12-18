package X;

import android.app.Activity;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.common.api.Status;
import java.util.concurrent.TimeUnit;

/* loaded from: classes10.dex */
public final class TGX implements InterfaceC65457TkT {
    public final Object A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    @Override // X.InterfaceC65457TkT
    public final void D6e(Object obj) {
        final C63179See c63179See = (C63179See) this.A00;
        InterfaceC37174GZl interfaceC37174GZl = (InterfaceC37174GZl) this.A01;
        final Activity activity = (Activity) this.A02;
        final InterfaceC65457TkT interfaceC65457TkT = (InterfaceC65457TkT) this.A03;
        AbstractC1335861e abstractC1335861e = (AbstractC1335861e) obj;
        abstractC1335861e.getClass();
        Credential credential = ((TGT) interfaceC37174GZl).A00;
        C3U5.A03(credential, "credential must not be null");
        abstractC1335861e.A07(new RL1(credential, abstractC1335861e)).A07(new InterfaceC65404Tjb() { // from class: X.T58
            @Override // X.InterfaceC65404Tjb
            public final void Dgz(C61j c61j) {
                Activity activity2 = activity;
                activity2.runOnUiThread(new TQI(activity2, interfaceC65457TkT, Boolean.valueOf(AbstractC31175DnJ.A1S(((Status) c61j).A00))));
            }
        }, TimeUnit.MILLISECONDS, C63179See.A05);
    }

    public TGX(Object obj, Object obj2, Object obj3, Object obj4) {
        this.A00 = obj3;
        this.A01 = obj2;
        this.A02 = obj;
        this.A03 = obj4;
    }
}
