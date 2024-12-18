package X;

import com.instagram.api.schemas.GalleryMediaFolderEnum;

/* loaded from: classes7.dex */
public final class JAB extends C0YY implements InterfaceC16660sJ {
    public static final JAB A00 = new JAB();

    public JAB() {
        super(1);
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Object obj2 = GalleryMediaFolderEnum.A01.get(obj);
        if (obj2 == null) {
            return GalleryMediaFolderEnum.A05;
        }
        return obj2;
    }
}
