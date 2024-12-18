package X;

import android.app.Activity;
import android.content.Context;
import android.location.Location;
import android.os.Handler;
import com.instagram.common.gallery.Medium;
import com.instagram.common.gallery.model.GalleryItem;
import com.instagram.common.session.UserSession;
import com.instagram.creation.activity.MediaCaptureActivity;
import com.instagram.creation.base.CreationSession;
import com.instagram.creation.base.MediaSession;
import com.instagram.creation.base.PhotoSession;
import com.instagram.creation.capture.gallery.GalleryPreviewInfo;
import com.instagram.creation.photo.util.ExifImageData;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.Jab, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43871Jab {
    public A5B A00;
    public Map A01;
    public Map A02;
    public boolean A03;
    public boolean A04;
    public AtomicInteger A05;
    public final Context A06;
    public final AbstractC018607g A07;
    public final C22P A08;
    public final UserSession A09;
    public final MN3 A0A;
    public final C43870Jaa A0B;
    public final AnonymousClass841 A0C;
    public final InterfaceC58286Pse A0D;
    public final InterfaceC189598ae A0E;
    public final int A0F;
    public final Handler A0G;
    public final AnonymousClass840 A0H;

    public C43871Jab(Context context, AbstractC018607g abstractC018607g, C22P c22p, UserSession userSession, MN3 mn3, C43870Jaa c43870Jaa, AnonymousClass840 anonymousClass840, InterfaceC58286Pse interfaceC58286Pse, InterfaceC189598ae interfaceC189598ae, int i) {
        AbstractC167007dF.A1G(abstractC018607g, 3, c22p);
        this.A06 = context;
        this.A09 = userSession;
        this.A07 = abstractC018607g;
        this.A0H = anonymousClass840;
        this.A08 = c22p;
        this.A0E = interfaceC189598ae;
        this.A0D = interfaceC58286Pse;
        this.A0A = mn3;
        this.A0B = c43870Jaa;
        this.A0F = i;
        this.A0C = anonymousClass840.A00();
        this.A0G = AbstractC167007dF.A0J();
        this.A02 = AbstractC166987dD.A1G();
        this.A01 = AbstractC166987dD.A1G();
    }

    /* JADX WARN: Removed duplicated region for block: B:130:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x024e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0220 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x002a A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v22, types: [java.lang.Object, X.OL6] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A05(X.EnumC114925Hg r33, X.A5B r34, java.lang.Integer r35, java.util.List r36, java.util.Map r37, java.util.Map r38, float r39, boolean r40, boolean r41, boolean r42) {
        /*
            Method dump skipped, instructions count: 946
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C43871Jab.A05(X.5Hg, X.A5B, java.lang.Integer, java.util.List, java.util.Map, java.util.Map, float, boolean, boolean, boolean):void");
    }

    private final C47Z A00(GalleryItem galleryItem) {
        Map map = this.A01;
        String str = galleryItem.A0A;
        if (map.containsKey(str)) {
            return (C47Z) this.A01.get(str);
        }
        if (galleryItem.A09 == C05F.A01) {
            return AbstractC43593JPy.A0h(this.A09, str);
        }
        return null;
    }

    public static final void A01(GalleryItem galleryItem, C43871Jab c43871Jab, C47Z c47z, String str, List list) {
        Location location;
        String str2;
        Map map = c43871Jab.A02;
        String str3 = galleryItem.A0A;
        Object obj = map.get(str3);
        if (obj != null) {
            GalleryPreviewInfo galleryPreviewInfo = (GalleryPreviewInfo) obj;
            ExifImageData exifImageData = galleryPreviewInfo.A01;
            if (exifImageData != null) {
                String str4 = null;
                if (exifImageData.A01 != null && exifImageData.A02 != null) {
                    location = new Location("photo");
                    Double d = exifImageData.A01;
                    if (d != null) {
                        location.setLatitude(d.doubleValue());
                        Double d2 = exifImageData.A02;
                        if (d2 != null) {
                            location.setLongitude(d2.doubleValue());
                        } else {
                            throw AbstractC166987dD.A14("Required value was null.");
                        }
                    } else {
                        throw AbstractC166987dD.A14("Required value was null.");
                    }
                } else {
                    location = null;
                }
                C47Z A00 = c43871Jab.A00(galleryItem);
                if (A00 == null) {
                    A00 = AbstractC43593JPy.A0h(c43871Jab.A09, AbstractC31171DnF.A0h(galleryPreviewInfo.A02, ((MX5) c43871Jab.A0C).A01.A0P));
                    if (A00 == null) {
                        A00 = AbstractC209399Nx.A01(AbstractC43593JPy.A0x());
                    }
                }
                String str5 = galleryPreviewInfo.A02;
                if (str5 == null) {
                    AbstractC12120kG.A07("GalleryAlbumController_importLoadedPhotoToAlbum", "info.imagePath is null", null);
                    A02(c43871Jab);
                    return;
                }
                AnonymousClass841 anonymousClass841 = c43871Jab.A0C;
                CreationSession creationSession = ((MX5) anonymousClass841).A01;
                if (creationSession.A03(str5) == null) {
                    int A002 = LBS.A00(c43871Jab.A08, AbstractC166987dD.A1J(galleryItem));
                    Medium medium = galleryItem.A00;
                    if (medium != null) {
                        str4 = medium.A0W;
                    }
                    anonymousClass841.A9Y(str5, str4, false);
                    creationSession.A02 = A002;
                    MediaSession mediaSession = (MediaSession) AbstractC001800i.A0L(anonymousClass841.CpK());
                    if (mediaSession != null) {
                        mediaSession.EYz(A002);
                    }
                }
                PhotoSession A03 = creationSession.A03(str5);
                if (A03 != null) {
                    A03.A0A = A00.A35;
                    A03.A05 = galleryPreviewInfo.A00;
                    A03.A04 = location;
                    ((C56216OxP) A03.A0D).A00.A01 = exifImageData.A00;
                    A00.A30 = str3;
                    A00.A3O = c47z.A35;
                    Medium medium2 = galleryItem.A00;
                    if (medium2 != null) {
                        AbstractC188508Wp.A05(A00, medium2.A0X);
                        medium2 = galleryItem.A00;
                        if (medium2 != null) {
                            A00.A3L = medium2.A0X;
                            A00.A3M = medium2.A0W;
                        } else {
                            throw AbstractC166987dD.A14("Required value was null.");
                        }
                    }
                    if (str != null) {
                        A00.A3K = str;
                    }
                    if (medium2 != null) {
                        str2 = medium2.A0Y;
                    } else {
                        str2 = null;
                    }
                    A00.A3h = str2;
                    A00.A44 = exifImageData.A03;
                    LBS.A01(galleryItem, c43871Jab.A09, A00);
                    list.add(A00);
                    A04(c43871Jab, c47z, list);
                    return;
                }
                throw AbstractC166987dD.A14("Required value was null.");
            }
            throw AbstractC166987dD.A14("Required value was null.");
        }
        throw AbstractC166987dD.A14("Required value was null.");
    }

    public static final void A02(C43871Jab c43871Jab) {
        MXB mxb;
        if (c43871Jab.A05 != null) {
            c43871Jab.A05 = null;
            InterfaceC58286Pse interfaceC58286Pse = c43871Jab.A0D;
            if (interfaceC58286Pse != null && (mxb = ((MediaCaptureActivity) interfaceC58286Pse).A07) != null) {
                mxb.A08(C05F.A00);
            }
            c43871Jab.A0C.EPV(null);
            C9GR.A0C(AbstractC25225BEi.A0F(c43871Jab.A09), "import_album_failed");
        }
    }

    public static final void A03(C43871Jab c43871Jab, C47Z c47z, List list) {
        C40131tg c40131tg = C40121td.A0G;
        UserSession userSession = c43871Jab.A09;
        c40131tg.A01(AbstractC25225BEi.A0F(userSession), userSession).A0F(c47z, list);
        LBU.A01((Activity) AbstractC13320mI.A01(c43871Jab.A06, Activity.class), c43871Jab.A08, userSession, c43871Jab.A0H, c43871Jab.A0F);
    }

    public static final void A04(C43871Jab c43871Jab, C47Z c47z, List list) {
        boolean z = !((MX5) c43871Jab.A0C).A01.A0O.isEmpty();
        AtomicInteger atomicInteger = c43871Jab.A05;
        if (atomicInteger != null && atomicInteger.decrementAndGet() == 0) {
            c43871Jab.A0G.post(new M6B(c43871Jab, c47z, list, z));
            c43871Jab.A05 = null;
        }
    }
}
