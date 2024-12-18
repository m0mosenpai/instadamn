package X;

import com.instagram.api.schemas.TIFUAppDestinationEnum;

/* loaded from: classes5.dex */
public final class DL1 extends C0YY implements InterfaceC16660sJ {
    public static final DL1 A00 = new DL1();

    public DL1() {
        super(1);
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Object obj2 = TIFUAppDestinationEnum.A01.get(obj);
        if (obj2 == null) {
            return TIFUAppDestinationEnum.A07;
        }
        return obj2;
    }
}
