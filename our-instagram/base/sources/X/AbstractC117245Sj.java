package X;

import com.instagram.api.schemas.MusicInfo;
import com.instagram.api.schemas.OriginalAudioPartMetadataIntf;
import com.instagram.api.schemas.OriginalAudioSubtype;
import com.instagram.api.schemas.OriginalSoundConsumptionInfoIntf;
import com.instagram.api.schemas.OriginalSoundDataIntf;
import com.instagram.api.schemas.TrackData;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.music.common.model.MusicConsumptionModel;
import com.instagram.music.common.model.OriginalPartsAttributionModel;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.5Sj, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC117245Sj {
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0042, code lost:
    
        if (java.lang.Integer.valueOf(r9) != null) goto L7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.instagram.music.common.config.MusicAttributionConfig A03(X.C3x9 r19) {
        /*
            Method dump skipped, instructions count: 245
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC117245Sj.A03(X.3x9):com.instagram.music.common.config.MusicAttributionConfig");
    }

    public static final ArrayList A07(C3x9 c3x9) {
        List<OriginalAudioPartMetadataIntf> Adv;
        ArrayList arrayList = new ArrayList();
        OriginalSoundDataIntf BZw = c3x9.BZw();
        if (BZw != null && A00(c3x9) != null && ((A00(c3x9) == OriginalAudioSubtype.A06 || A00(c3x9) == OriginalAudioSubtype.A04) && (Adv = BZw.Adv()) != null)) {
            for (OriginalAudioPartMetadataIntf originalAudioPartMetadataIntf : Adv) {
                arrayList.add(new OriginalPartsAttributionModel(originalAudioPartMetadataIntf.C88(), originalAudioPartMetadataIntf.getDisplayArtist(), originalAudioPartMetadataIntf.getDisplayTitle(), originalAudioPartMetadataIntf.isExplicit()));
            }
        }
        return arrayList;
    }

    public static final OriginalAudioSubtype A00(C3x9 c3x9) {
        OriginalSoundDataIntf BZw = c3x9.BZw();
        if (BZw != null) {
            return BZw.BZj();
        }
        return null;
    }

    public static final InterfaceC88553xD A01(C3x9 c3x9) {
        InterfaceC88553xD interfaceC88553xD;
        MusicInfo BVc = c3x9.BVc();
        if (BVc != null) {
            interfaceC88553xD = new C88543xC(BVc);
        } else {
            OriginalSoundDataIntf BZw = c3x9.BZw();
            if (BZw != null) {
                interfaceC88553xD = new C117235Si(BZw);
            } else {
                interfaceC88553xD = null;
            }
        }
        return interfaceC88553xD;
    }

    public static final ImageUrl A02(C3x9 c3x9) {
        User BFU;
        TrackData BVV;
        ImageUrl AsF;
        MusicInfo BVc = c3x9.BVc();
        if (BVc == null || (BVV = BVc.BVV()) == null || (AsF = BVV.AsF()) == null) {
            OriginalSoundDataIntf BZw = c3x9.BZw();
            if (BZw != null && (BFU = BZw.BFU()) != null) {
                return BFU.A0C();
            }
            return null;
        }
        return AsF;
    }

    public static final Long A04(C3x9 c3x9) {
        InterfaceC88553xD A01 = A01(c3x9);
        if (A01 != null) {
            return Long.valueOf(A01.Adf());
        }
        return null;
    }

    public static final String A05(C3x9 c3x9) {
        User BFU;
        TrackData BVV;
        String displayArtist;
        MusicInfo BVc = c3x9.BVc();
        if (BVc == null || (BVV = BVc.BVV()) == null || (displayArtist = BVV.getDisplayArtist()) == null) {
            OriginalSoundDataIntf BZw = c3x9.BZw();
            if (BZw != null && (BFU = BZw.BFU()) != null) {
                return BFU.getUsername();
            }
            return "";
        }
        return displayArtist;
    }

    public static final String A06(C3x9 c3x9) {
        TrackData BVV;
        String title;
        MusicInfo BVc = c3x9.BVc();
        if (BVc == null || (BVV = BVc.BVV()) == null || (title = BVV.getTitle()) == null) {
            OriginalSoundDataIntf BZw = c3x9.BZw();
            if (BZw != null) {
                return BZw.getOriginalAudioTitle();
            }
            C0w9.A03("ClipsMetadata", "Audio track has no title");
            return "";
        }
        return title;
    }

    public static final boolean A08(C3x9 c3x9) {
        OriginalSoundConsumptionInfoIntf AqX;
        MusicConsumptionModel BVa;
        Boolean CQj;
        MusicInfo BVc = c3x9.BVc();
        if (BVc != null && (BVa = BVc.BVa()) != null && (CQj = BVa.CQj()) != null) {
            return CQj.booleanValue();
        }
        OriginalSoundDataIntf BZw = c3x9.BZw();
        if (BZw != null && (AqX = BZw.AqX()) != null) {
            return AqX.isBookmarked();
        }
        return false;
    }
}
