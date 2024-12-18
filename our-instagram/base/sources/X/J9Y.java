package X;

import com.instagram.api.schemas.CreatorViewerSignalType;

/* loaded from: classes7.dex */
public final class J9Y extends C0YY implements InterfaceC16660sJ {
    public static final J9Y A00 = new J9Y();

    public J9Y() {
        super(1);
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Object obj2 = CreatorViewerSignalType.A01.get(obj);
        if (obj2 == null) {
            return CreatorViewerSignalType.A09;
        }
        return obj2;
    }
}
