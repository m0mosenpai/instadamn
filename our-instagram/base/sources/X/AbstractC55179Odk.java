package X;

import com.instagram.api.schemas.BrandedContentGatingInfo;
import com.instagram.api.schemas.BrandedContentProjectMetadata;
import com.instagram.api.schemas.MediaGenAIDetectionMethod;
import com.instagram.api.schemas.MusicProduct;
import com.instagram.model.venue.LocationDict;
import com.instagram.model.venue.Venue;
import com.instagram.music.common.model.AudioOverlayTrack;
import com.instagram.music.common.model.MusicAssetModel;
import com.instagram.music.common.model.MusicOverlayStickerModel;
import com.instagram.pendingmedia.model.BrandedContentTag;
import com.instagram.pendingmedia.model.ClipInfo;
import com.instagram.shopping.model.taggingfeed.ProductCollectionFeedTaggingMeta;
import com.instagram.user.model.UpcomingEvent;
import com.instagram.user.model.UpcomingEventImpl;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Odk, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC55179Odk {
    /* JADX WARN: Type inference failed for: r6v2, types: [com.instagram.model.venue.Venue, java.lang.Object] */
    public static final C51754Mtd A00(C47Z c47z) {
        Venue venue;
        AudioOverlayTrack audioOverlayTrack;
        C14360o3.A0B(c47z, 0);
        String str = c47z.A35;
        ArrayList arrayList = c47z.A40;
        List list = c47z.A4L;
        String str2 = c47z.A2d;
        C51695MsQ c51695MsQ = new C51695MsQ(c47z.A1o, c47z.A41, c47z.A43, c47z.A4X, c47z.A48);
        ClipInfo clipInfo = c47z.A1N;
        List A0K = c47z.A0K();
        ArrayList A0q = AbstractC167017dG.A0q(A0K);
        Iterator it = A0K.iterator();
        while (it.hasNext()) {
            A0q.add(A00(AbstractC43592JPx.A0l(it)));
        }
        LocationDict locationDict = c47z.A1H;
        if (locationDict != null) {
            ?? obj = new Object();
            obj.A00 = locationDict;
            venue = obj;
        } else {
            venue = null;
        }
        C09530e4 A1L = AbstractC166987dD.A1L(Double.valueOf(c47z.A00), Double.valueOf(c47z.A01));
        MusicOverlayStickerModel musicOverlayStickerModel = c47z.A1J;
        if (musicOverlayStickerModel != null) {
            MusicAssetModel A03 = MusicAssetModel.A03(musicOverlayStickerModel);
            Integer num = musicOverlayStickerModel.A0K;
            if (num != null) {
                int intValue = num.intValue();
                Integer num2 = musicOverlayStickerModel.A0O;
                if (num2 != null) {
                    audioOverlayTrack = new AudioOverlayTrack(A03, intValue, num2.intValue());
                } else {
                    throw AbstractC166987dD.A14("Required value was null.");
                }
            } else {
                throw AbstractC166987dD.A14("Required value was null.");
            }
        } else {
            audioOverlayTrack = null;
        }
        boolean z = c47z.A67;
        C38709H2v c38709H2v = c47z.A0v;
        boolean z2 = c47z.A5a;
        boolean z3 = c47z.A5s;
        EnumC76383bi enumC76383bi = c47z.A1F;
        String str3 = c47z.A13.A03;
        UpcomingEventImpl upcomingEventImpl = c47z.A1p;
        String str4 = c47z.A3F;
        boolean z4 = c47z.A5f;
        C51685MsG c51685MsG = c47z.A1B;
        MediaGenAIDetectionMethod mediaGenAIDetectionMethod = c47z.A0w;
        List list2 = c47z.A4F;
        boolean A0n = c47z.A0n();
        C54632OBh c54632OBh = new C54632OBh();
        List list3 = c47z.A4C;
        if (list3 != null) {
            c54632OBh.A02 = list3;
        }
        c54632OBh.A00 = c47z.A0s;
        c54632OBh.A03 = c47z.A5i;
        c54632OBh.A01 = c47z.A0t;
        return new C51754Mtd(null, null, null, new C50627MWo(44, c54632OBh, c47z.A07()), null, null, null, null, c38709H2v, mediaGenAIDetectionMethod, c51685MsG, c51695MsQ, enumC76383bi, c47z.A1G, venue, audioOverlayTrack, clipInfo, null, upcomingEventImpl, str, "", str2, null, null, null, null, str3, str4, arrayList, list, list2, null, A0q, null, A1L, c47z.A04, true, A0n, false, false, z, false, z2, z3, false, true, false, z4, true, true);
    }

    public static final void A01(C51754Mtd c51754Mtd, C47Z c47z) {
        List A1E;
        ArrayList arrayList;
        List list;
        ProductCollectionFeedTaggingMeta productCollectionFeedTaggingMeta;
        double A00;
        boolean z;
        BrandedContentTag brandedContentTag;
        C54632OBh c54632OBh;
        BrandedContentProjectMetadata brandedContentProjectMetadata;
        C54632OBh c54632OBh2;
        BrandedContentGatingInfo brandedContentGatingInfo;
        C54632OBh c54632OBh3;
        MusicAssetModel musicAssetModel;
        Object obj;
        C14360o3.A0B(c51754Mtd, 1);
        List list2 = c51754Mtd.A0W;
        if (list2 != null) {
            ArrayList A1F = AbstractC166987dD.A1F(list2);
            C14360o3.A0B(A1F, 0);
            c47z.A40 = A1F;
        }
        C51695MsQ c51695MsQ = c51754Mtd.A0B;
        if (c51695MsQ == null || (A1E = c51695MsQ.A03) == null) {
            A1E = AbstractC166987dD.A1E();
        }
        c47z.A48 = A1E;
        if (c51695MsQ != null) {
            ArrayList arrayList2 = c51695MsQ.A01;
            if (arrayList2 != null) {
                if (c47z.A0o() && arrayList2.isEmpty() && !c47z.A5i) {
                    c47z.A0s = null;
                }
                c47z.A41 = arrayList2;
            }
            arrayList = c51695MsQ.A02;
        } else {
            arrayList = null;
        }
        c47z.A43 = arrayList;
        if (c51695MsQ != null) {
            list = c51695MsQ.A04;
        } else {
            list = null;
        }
        c47z.A4X = list;
        ClipInfo clipInfo = c51754Mtd.A0G;
        if (clipInfo != null) {
            c47z.A1N = clipInfo;
        }
        if (c51695MsQ != null) {
            productCollectionFeedTaggingMeta = c51695MsQ.A00;
        } else {
            productCollectionFeedTaggingMeta = null;
        }
        c47z.A1o = productCollectionFeedTaggingMeta;
        c47z.A4L = c51754Mtd.A0V;
        c47z.A2d = c51754Mtd.A0M;
        List<C51754Mtd> list3 = c51754Mtd.A0S;
        if (list3 != null) {
            ArrayList A1E2 = AbstractC166987dD.A1E();
            for (C51754Mtd c51754Mtd2 : list3) {
                Iterator A0o = MSX.A0o(c47z);
                while (true) {
                    if (A0o.hasNext()) {
                        obj = A0o.next();
                        if (C14360o3.A0K(((C47Z) obj).A35, c51754Mtd2.A0N)) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                C47Z c47z2 = (C47Z) obj;
                if (c47z2 != null) {
                    A01(c51754Mtd2, c47z2);
                    A1E2.add(C0eB.A00);
                }
            }
        }
        c47z.A0U(c51754Mtd.A0E);
        C09530e4 c09530e4 = c51754Mtd.A0Y;
        if (c09530e4 == null) {
            A00 = 0.0d;
            c47z.A00 = 0.0d;
        } else {
            c47z.A00 = MSW.A00(c09530e4.A00);
            A00 = MSW.A00(c09530e4.A01);
        }
        c47z.A01 = A00;
        AudioOverlayTrack audioOverlayTrack = c51754Mtd.A0F;
        if (audioOverlayTrack != null && (musicAssetModel = audioOverlayTrack.A08) != null) {
            c47z.A1J = AbstractC50522MSa.A0Y(MusicProduct.A0G, audioOverlayTrack, musicAssetModel, null);
        }
        c47z.A67 = c51754Mtd.A0j;
        c47z.A0v = c51754Mtd.A08;
        c47z.A5a = c51754Mtd.A0b;
        c47z.A5s = c51754Mtd.A0c;
        EnumC76383bi enumC76383bi = c51754Mtd.A0C;
        if (enumC76383bi == null) {
            enumC76383bi = EnumC76383bi.A06;
        }
        c47z.A1F = enumC76383bi;
        UpcomingEvent upcomingEvent = c51754Mtd.A0I;
        UpcomingEventImpl upcomingEventImpl = null;
        if (upcomingEvent != null) {
            upcomingEventImpl = upcomingEvent.F7b(null);
        }
        c47z.A1p = upcomingEventImpl;
        c47z.A3F = c51754Mtd.A0P;
        c47z.A5f = c51754Mtd.A0g;
        c47z.A1B = c51754Mtd.A0A;
        c47z.A0w = c51754Mtd.A09;
        c47z.A4F = c51754Mtd.A0T;
        c47z.A65 = c51754Mtd.A0i;
        C50627MWo c50627MWo = c51754Mtd.A03;
        if (c50627MWo != null && (c54632OBh3 = (C54632OBh) c50627MWo.A01) != null) {
            z = c54632OBh3.A03;
        } else {
            z = false;
        }
        c47z.A5i = z;
        List list4 = null;
        if (c50627MWo != null) {
            C54632OBh c54632OBh4 = (C54632OBh) c50627MWo.A01;
            if (c54632OBh4 != null && (brandedContentGatingInfo = c54632OBh4.A00) != null) {
                c47z.A0s = brandedContentGatingInfo;
            }
            brandedContentTag = (BrandedContentTag) c50627MWo.A00;
        } else {
            brandedContentTag = null;
        }
        c47z.A1M = brandedContentTag;
        if (c50627MWo != null && (c54632OBh2 = (C54632OBh) c50627MWo.A01) != null) {
            list4 = c54632OBh2.A02;
        }
        c47z.A4C = list4;
        if (c50627MWo != null && (c54632OBh = (C54632OBh) c50627MWo.A01) != null && (brandedContentProjectMetadata = c54632OBh.A01) != null) {
            c47z.A0t = brandedContentProjectMetadata;
        }
    }

    public static final boolean A02(C51754Mtd c51754Mtd) {
        ArrayList arrayList;
        C14360o3.A0B(c51754Mtd, 0);
        if (c51754Mtd.A0D == EnumC40111tc.A09) {
            List list = c51754Mtd.A0S;
            if (list == null) {
                return false;
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (A02((C51754Mtd) it.next())) {
                    return true;
                }
            }
            return false;
        }
        C51695MsQ c51695MsQ = c51754Mtd.A0B;
        if (c51695MsQ == null || (arrayList = c51695MsQ.A01) == null || !AbstractC25226BEj.A1b(arrayList)) {
            return false;
        }
        return true;
    }

    public static final boolean A03(C51754Mtd c51754Mtd) {
        C14360o3.A0B(c51754Mtd, 0);
        List list = c51754Mtd.A0V;
        if ((list != null && AbstractC166987dD.A1b(list)) || c51754Mtd.A0M != null) {
            return true;
        }
        List<C51754Mtd> list2 = c51754Mtd.A0S;
        if (list2 != null) {
            if ((list2 instanceof Collection) && list2.isEmpty()) {
                return false;
            }
            for (C51754Mtd c51754Mtd2 : list2) {
                List list3 = c51754Mtd2.A0V;
                if ((list3 != null && AbstractC166987dD.A1b(list3)) || c51754Mtd2.A0M != null) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public static final boolean A04(C51754Mtd c51754Mtd) {
        C14360o3.A0B(c51754Mtd, 0);
        EnumC40111tc enumC40111tc = c51754Mtd.A0D;
        if (enumC40111tc == EnumC40111tc.A09) {
            List list = c51754Mtd.A0S;
            if (list == null) {
                return true;
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (((C51754Mtd) it.next()).A0D == EnumC40111tc.A0a) {
                }
            }
            return true;
        }
        if (enumC40111tc != EnumC40111tc.A0a) {
            return true;
        }
        return false;
    }

    public static final boolean A05(C51754Mtd c51754Mtd) {
        EnumC40111tc enumC40111tc = c51754Mtd.A0D;
        if (enumC40111tc == EnumC40111tc.A09) {
            List list = c51754Mtd.A0S;
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    if (((C51754Mtd) it.next()).A0D != EnumC40111tc.A0a) {
                        return false;
                    }
                }
                return true;
            }
            return true;
        }
        if (enumC40111tc != EnumC40111tc.A0a) {
            return false;
        }
        return true;
    }
}
