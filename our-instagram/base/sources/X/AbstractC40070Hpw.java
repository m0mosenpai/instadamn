package X;

import com.instagram.api.schemas.GalleryMediaFolderEnum;
import com.instagram.api.schemas.MediaDestinationEnum;
import java.io.IOException;

/* renamed from: X.Hpw, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40070Hpw {
    public static H4D parseFromJson(C16L c16l) {
        String A00;
        String A1P;
        String A1P2;
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            MediaDestinationEnum mediaDestinationEnum = null;
            GalleryMediaFolderEnum galleryMediaFolderEnum = null;
            String str = null;
            String str2 = null;
            while (true) {
                C16R A1J = c16l.A1J();
                C16R c16r = C16R.A09;
                A00 = AbstractC111324zv.A00(2701);
                if (A1J == c16r) {
                    break;
                }
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("gallery_media_folder".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P2 = null;
                    } else {
                        A1P2 = c16l.A1P();
                    }
                    galleryMediaFolderEnum = (GalleryMediaFolderEnum) GalleryMediaFolderEnum.A01.get(A1P2);
                    if (galleryMediaFolderEnum == null) {
                        galleryMediaFolderEnum = GalleryMediaFolderEnum.A05;
                    }
                } else if (A00.equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    mediaDestinationEnum = (MediaDestinationEnum) MediaDestinationEnum.A01.get(A1P);
                    if (mediaDestinationEnum == null) {
                        mediaDestinationEnum = MediaDestinationEnum.A07;
                    }
                } else if (AbstractC37300Gc1.A1L(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if (AbstractC31171DnF.A1a(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str2 = null;
                    } else {
                        str2 = c16l.A1P();
                    }
                }
                c16l.A0z();
            }
            if (mediaDestinationEnum == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V(A00, c16l, "MediaSelectionDestinationTargetImpl");
                throw C00O.createAndThrow();
            }
            return new H4D(galleryMediaFolderEnum, mediaDestinationEnum, str, str2);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
