package X;

import com.instagram.api.schemas.MediaDestinationEnum;

/* loaded from: classes7.dex */
public final class JAC extends C0YY implements InterfaceC16660sJ {
    public static final JAC A00 = new JAC();

    public JAC() {
        super(1);
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Object obj2 = MediaDestinationEnum.A01.get(obj);
        if (obj2 == null) {
            return MediaDestinationEnum.A07;
        }
        return obj2;
    }
}
