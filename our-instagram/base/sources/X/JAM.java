package X;

import com.instagram.api.schemas.NoteActivationType;

/* loaded from: classes7.dex */
public final class JAM extends C0YY implements InterfaceC16660sJ {
    public static final JAM A00 = new JAM();

    public JAM() {
        super(1);
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Object obj2 = NoteActivationType.A01.get(obj);
        if (obj2 == null) {
            return NoteActivationType.A08;
        }
        return obj2;
    }
}
