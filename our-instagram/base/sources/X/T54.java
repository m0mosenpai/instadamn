package X;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;

/* loaded from: classes10.dex */
public final class T54 implements InterfaceC65403Tja {
    public final /* synthetic */ BasePendingResult A00;
    public final /* synthetic */ AnonymousClass643 A01;

    public T54(BasePendingResult basePendingResult, AnonymousClass643 anonymousClass643) {
        this.A01 = anonymousClass643;
        this.A00 = basePendingResult;
    }

    @Override // X.InterfaceC65403Tja
    public final void D6T(Status status) {
        this.A01.A00.remove(this.A00);
    }
}
