package X;

import com.instagram.api.schemas.IGLiveNotificationPreference;

/* loaded from: classes5.dex */
public final class DPI extends C0YY implements InterfaceC16660sJ {
    public static final DPI A00 = new DPI();

    public DPI() {
        super(1);
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Object obj2 = IGLiveNotificationPreference.A01.get(obj);
        if (obj2 == null) {
            return IGLiveNotificationPreference.A07;
        }
        return obj2;
    }
}
