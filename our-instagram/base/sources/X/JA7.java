package X;

import com.instagram.api.schemas.InspirationSignalType;

/* loaded from: classes7.dex */
public final class JA7 extends C0YY implements InterfaceC16660sJ {
    public static final JA7 A00 = new JA7();

    public JA7() {
        super(1);
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C14360o3.A0B(obj, 0);
        Object obj2 = InspirationSignalType.A01.get(obj);
        if (obj2 == null) {
            return InspirationSignalType.A0E;
        }
        return obj2;
    }
}
