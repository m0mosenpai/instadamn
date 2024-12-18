package X;

import com.instagram.api.schemas.ThumbnailInteractionType;

/* loaded from: classes7.dex */
public final class JCV extends C0YY implements InterfaceC16660sJ {
    public static final JCV A00 = new JCV();

    public JCV() {
        super(1);
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Object obj2 = ThumbnailInteractionType.A01.get(obj);
        if (obj2 == null) {
            return ThumbnailInteractionType.A05;
        }
        return obj2;
    }
}
