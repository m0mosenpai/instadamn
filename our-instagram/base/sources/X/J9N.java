package X;

import com.instagram.api.schemas.MediaType;

/* loaded from: classes7.dex */
public final class J9N extends C0YY implements InterfaceC16660sJ {
    public static final J9N A00 = new J9N();

    public J9N() {
        super(1);
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Object obj2 = MediaType.A01.get(obj);
        if (obj2 == null) {
            return MediaType.A06;
        }
        return obj2;
    }
}
