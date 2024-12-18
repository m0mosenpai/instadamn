package X;

import com.google.android.gms.common.api.internal.BasePendingResult;

/* renamed from: X.Rq8, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC61584Rq8 {
    public final void A02(InterfaceC65403Tja interfaceC65403Tja) {
        BasePendingResult basePendingResult = (BasePendingResult) this;
        synchronized (basePendingResult.A07) {
            if (AbstractC167007dF.A1N((basePendingResult.A0A.getCount() > 0L ? 1 : (basePendingResult.A0A.getCount() == 0L ? 0 : -1)))) {
                interfaceC65403Tja.D6T(basePendingResult.A01);
            } else {
                basePendingResult.A09.add(interfaceC65403Tja);
            }
        }
    }
}
