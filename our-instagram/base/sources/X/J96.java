package X;

import com.instagram.api.schemas.MediaType;

/* loaded from: classes7.dex */
public final class J96 extends C0YY implements InterfaceC16660sJ {
    public static final J96 A00 = new J96();

    public J96() {
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
