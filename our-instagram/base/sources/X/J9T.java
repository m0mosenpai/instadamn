package X;

import com.instagram.api.schemas.CreatorViewerContextCTAType;

/* loaded from: classes7.dex */
public final class J9T extends C0YY implements InterfaceC16660sJ {
    public static final J9T A00 = new J9T();

    public J9T() {
        super(1);
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Object obj2 = CreatorViewerContextCTAType.A01.get(obj);
        if (obj2 == null) {
            return CreatorViewerContextCTAType.A09;
        }
        return obj2;
    }
}
