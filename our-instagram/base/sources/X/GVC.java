package X;

import com.instagram.api.schemas.FBBioLinkSocialContextType;

/* loaded from: classes6.dex */
public final class GVC extends C0YY implements InterfaceC16660sJ {
    public static final GVC A00 = new GVC();

    public GVC() {
        super(1);
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Object obj2 = FBBioLinkSocialContextType.A01.get(obj);
        if (obj2 == null) {
            return FBBioLinkSocialContextType.A09;
        }
        return obj2;
    }
}
