package X;

import com.instagram.api.schemas.ShopManagementAccessState;

/* loaded from: classes5.dex */
public final class DPL extends C0YY implements InterfaceC16660sJ {
    public static final DPL A00 = new DPL();

    public DPL() {
        super(1);
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Object obj2 = ShopManagementAccessState.A01.get(obj);
        if (obj2 == null) {
            return ShopManagementAccessState.A08;
        }
        return obj2;
    }
}
