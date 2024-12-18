package X;

import com.instagram.api.schemas.CreatorViewerContextCTATarget;

/* loaded from: classes7.dex */
public final class J9U extends C0YY implements InterfaceC16660sJ {
    public static final J9U A00 = new J9U();

    public J9U() {
        super(1);
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Object obj2 = CreatorViewerContextCTATarget.A01.get(obj);
        if (obj2 == null) {
            return CreatorViewerContextCTATarget.A04;
        }
        return obj2;
    }
}
