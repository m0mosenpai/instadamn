package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import com.instagram.api.schemas.MusicInfo;
import com.instagram.api.schemas.MusicMuteAudioReason;
import com.instagram.api.schemas.OriginalAudioPartMetadataIntf;
import com.instagram.api.schemas.OriginalAudioSubtype;
import com.instagram.api.schemas.OriginalSoundConsumptionInfoIntf;
import com.instagram.api.schemas.OriginalSoundDataIntf;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.music.common.model.MusicConsumptionModel;
import com.instagram.music.common.model.OriginalPartsAttributionModel;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.3c9, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC76643c9 {
    public static final C31349DqE A01(Context context, UserSession userSession, ImageUrl imageUrl, InterfaceC16820sZ interfaceC16820sZ, boolean z) {
        C14360o3.A0B(userSession, 0);
        C146106i8 c146106i8 = new C146106i8();
        Resources resources = context.getResources();
        int i = 2131972704;
        if (z) {
            i = 2131976204;
        }
        c146106i8.A0D = resources.getString(i);
        if (imageUrl != null) {
            c146106i8.A09 = imageUrl;
        } else {
            c146106i8.A04 = new ColorDrawable(0);
        }
        c146106i8.A03();
        if (!z && !C18U.A06(C06090Tz.A05, userSession, 36325733878084923L)) {
            String string = context.getString(2131972705);
            C14360o3.A07(string);
            c146106i8.A0G = string;
            c146106i8.A0A(new C23958Ajs(interfaceC16820sZ));
            c146106i8.A01();
        }
        return c146106i8.A00();
    }

    public static final String A03(Context context, UserSession userSession, C38321qM c38321qM) {
        OriginalSoundDataIntf A1K;
        OriginalSoundConsumptionInfoIntf AqX;
        MusicMuteAudioReason BvC;
        int i;
        C14360o3.A0B(context, 0);
        C14360o3.A0B(userSession, 2);
        C88543xC A1Q = c38321qM.A1Q();
        if ((A1Q != null && (BvC = A1Q.BvC()) != null) || ((A1K = c38321qM.A1K()) != null && (AqX = A1K.AqX()) != null && (BvC = AqX.BvC()) != null)) {
            int ordinal = BvC.ordinal();
            if (ordinal != 3) {
                if (ordinal == 1) {
                    i = 2131953331;
                }
            } else {
                i = 2131953330;
            }
            String string = context.getString(i);
            C14360o3.A07(string);
            return string;
        }
        String A08 = A08(userSession, c38321qM);
        if (A08 == null) {
            i = 2131953327;
            String string2 = context.getString(i);
            C14360o3.A07(string2);
            return string2;
        }
        return A08;
    }

    public static final String A08(UserSession userSession, C38321qM c38321qM) {
        InterfaceC88563xE A02;
        C14360o3.A0B(userSession, 1);
        if (c38321qM == null || (A02 = A02(userSession, c38321qM)) == null) {
            return null;
        }
        return A02.getShouldMuteAudioReason();
    }

    public static final boolean A0B(OriginalAudioSubtype originalAudioSubtype, UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        if (originalAudioSubtype == OriginalAudioSubtype.A06 && C18U.A06(C06090Tz.A05, userSession, 36321353011504468L)) {
            return true;
        }
        return false;
    }

    public static final boolean A0C(C120985dq c120985dq, UserSession userSession) {
        InterfaceC43583JMr BVT;
        C14360o3.A0B(userSession, 1);
        if (c120985dq == null) {
            return false;
        }
        if (AbstractC37647Ghg.A01(c120985dq.A01)) {
            InterfaceC104924o5 interfaceC104924o5 = c120985dq.A06().A0I;
            if (interfaceC104924o5 == null || (BVT = interfaceC104924o5.BVT()) == null || BVT.getProgressiveDownloadUrl() == null) {
                C38321qM c38321qM = c120985dq.A02;
                if (c38321qM == null || !c38321qM.Cff()) {
                    return false;
                }
            }
            return true;
        }
        if (!c120985dq.A0V || A0H(userSession, c120985dq.A02)) {
            return false;
        }
        return true;
    }

    public static final boolean A0G(UserSession userSession, C38321qM c38321qM) {
        C14360o3.A0B(userSession, 1);
        if (A0H(userSession, c38321qM) && C18U.A06(C06090Tz.A05, userSession, 36323466136530204L)) {
            return true;
        }
        return false;
    }

    public static final boolean A0H(UserSession userSession, C38321qM c38321qM) {
        C14360o3.A0B(userSession, 1);
        if (c38321qM == null) {
            return false;
        }
        if (c38321qM.A5p() && c38321qM.A0C.Ai4() != null) {
            return true;
        }
        InterfaceC88563xE A02 = A02(userSession, c38321qM);
        if (A02 == null) {
            return false;
        }
        return A02.Ej0();
    }

    public static final boolean A0I(UserSession userSession, C38321qM c38321qM) {
        if (!c38321qM.A4z()) {
            return false;
        }
        if (c38321qM.A1K() != null) {
            C06090Tz c06090Tz = C06090Tz.A05;
            if (!C18U.A06(c06090Tz, userSession, 36324977963840125L) && !C18U.A06(c06090Tz, userSession, 36324977964036736L)) {
                return false;
            }
        }
        if (c38321qM.A5M() && !c38321qM.A4i()) {
            User A2E = c38321qM.A2E(userSession);
            boolean A4i = c38321qM.A4i();
            if (A4i) {
                return false;
            }
            if (!C36A.A0H(userSession, A2E)) {
                C18U.A06(C06090Tz.A05, userSession, 36313974258534756L);
                return C36A.A0J(userSession, A2E, A4i);
            }
            return true;
        }
        if (c38321qM.A5M()) {
            return C36A.A07(userSession);
        }
        if (!C36A.A0H(userSession, c38321qM.A2E(userSession))) {
            return C18U.A06(C06090Tz.A05, userSession, 36313974257617243L);
        }
        return true;
    }

    public static final boolean A0J(UserSession userSession, C38321qM c38321qM, EnumC76383bi enumC76383bi) {
        C3x9 clipsMetadata;
        OriginalSoundDataIntf BZw;
        C14360o3.A0B(enumC76383bi, 0);
        EnumC76383bi enumC76383bi2 = EnumC76383bi.A04;
        if ((enumC76383bi != enumC76383bi2 && enumC76383bi != EnumC76383bi.A08) || !c38321qM.A5P() || (clipsMetadata = c38321qM.A0C.getClipsMetadata()) == null || (BZw = clipsMetadata.BZw()) == null) {
            return true;
        }
        if (enumC76383bi != enumC76383bi2 || C18U.A06(C06090Tz.A05, userSession, 36326468317362064L)) {
            return !BZw.getOriginalMediaId().equals(c38321qM.A2u());
        }
        return false;
    }

    public static final C206239Bg A00(OriginalSoundDataIntf originalSoundDataIntf) {
        if (originalSoundDataIntf != null) {
            return new C206239Bg(originalSoundDataIntf.BZj(), A0A(originalSoundDataIntf.Adv()), A0A(originalSoundDataIntf.Adw()), originalSoundDataIntf.isAudioAutomaticallyAttributed());
        }
        return null;
    }

    public static final String A04(MusicInfo musicInfo, OriginalSoundDataIntf originalSoundDataIntf) {
        if (musicInfo == null) {
            return originalSoundDataIntf != null ? originalSoundDataIntf.getOriginalAudioTitle() : "";
        }
        String title = musicInfo.BVV().getTitle();
        if (title != null && title.length() != 0) {
            return title;
        }
        C0w9.A01.EmN("ClipsAudioUtil", AnonymousClass001.A0R("title is empty. audio_asset_id = ", musicInfo.BVV().getId()));
        return "";
    }

    public static final String A05(MusicInfo musicInfo, OriginalSoundDataIntf originalSoundDataIntf) {
        if (musicInfo != null) {
            String displayArtist = musicInfo.BVV().getDisplayArtist();
            if (displayArtist != null) {
                return displayArtist;
            }
        } else if (originalSoundDataIntf != null) {
            return originalSoundDataIntf.BFU().getUsername();
        }
        return "";
    }

    public static final String A09(C38321qM c38321qM) {
        String audioAssetId;
        if (c38321qM != null) {
            C88543xC A1Q = c38321qM.A1Q();
            if (A1Q == null || (audioAssetId = A1Q.getAudioAssetId()) == null) {
                OriginalSoundDataIntf A1K = c38321qM.A1K();
                if (A1K != null) {
                    return A1K.getAudioAssetId();
                }
                return null;
            }
            return audioAssetId;
        }
        return null;
    }

    public static final List A0A(List list) {
        if (list != null) {
            ArrayList arrayList = new ArrayList(AbstractC06950Ym.A1E(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                OriginalAudioPartMetadataIntf originalAudioPartMetadataIntf = (OriginalAudioPartMetadataIntf) it.next();
                arrayList.add(new OriginalPartsAttributionModel(originalAudioPartMetadataIntf.C88(), originalAudioPartMetadataIntf.getDisplayArtist(), originalAudioPartMetadataIntf.getDisplayTitle(), originalAudioPartMetadataIntf.isExplicit()));
            }
            return arrayList;
        }
        return C16930sl.A00;
    }

    public static final boolean A0E(C3x9 c3x9) {
        int i;
        MusicInfo BVc;
        MusicConsumptionModel BVa;
        Boolean Cer;
        OriginalSoundDataIntf BZw;
        OriginalSoundConsumptionInfoIntf AqX;
        InterfaceC88553xD A01;
        if (c3x9 != null && (A01 = AbstractC117245Sj.A01(c3x9)) != null) {
            i = A01.Ae7().ordinal();
        } else {
            i = -1;
        }
        if (i != 0) {
            if (i != 1 || c3x9 == null || (BZw = c3x9.BZw()) == null || (AqX = BZw.AqX()) == null) {
                return false;
            }
            return AqX.isTrendingInClips();
        }
        if (c3x9 == null || (BVc = c3x9.BVc()) == null || (BVa = BVc.BVa()) == null || (Cer = BVa.Cer()) == null) {
            return false;
        }
        return Cer.booleanValue();
    }

    public static final InterfaceC88563xE A02(UserSession userSession, C38321qM c38321qM) {
        boolean A0I;
        OriginalSoundDataIntf BZw;
        MusicConsumptionModel BVa;
        if (c38321qM.A5P()) {
            C3x9 clipsMetadata = c38321qM.A0C.getClipsMetadata();
            if (clipsMetadata == null) {
                return null;
            }
            if (clipsMetadata.BVc() != null) {
                MusicInfo BVc = clipsMetadata.BVc();
                if (BVc == null || (BVa = BVc.BVa()) == null) {
                    return null;
                }
                return new C92564Cq(BVa);
            }
            if (clipsMetadata.BZw() == null || (BZw = clipsMetadata.BZw()) == null) {
                return null;
            }
            return new C117235Si(BZw);
        }
        User CDj = c38321qM.A0C.CDj();
        C88543xC A1Q = c38321qM.A1Q();
        OriginalSoundDataIntf A1K = c38321qM.A1K();
        boolean A5M = c38321qM.A5M();
        boolean A4i = c38321qM.A4i();
        boolean z = false;
        if (A5M) {
            if (!A4i) {
                A0I = C36A.A0J(userSession, CDj, false);
            } else {
                A0I = C36A.A07(userSession);
            }
        } else {
            A0I = C36A.A0I(userSession, CDj);
        }
        if (A0I && C36A.A0G(userSession)) {
            z = true;
        }
        if (A1Q != null && A0I) {
            MusicConsumptionModel BVa2 = A1Q.A00.BVa();
            C14360o3.A0B(BVa2, 0);
            return new C92564Cq(BVa2);
        }
        if (A1K != null && z) {
            return new C117235Si(A1K);
        }
        return null;
    }

    public static final String A06(C3x9 c3x9) {
        return A04(c3x9.BVc(), c3x9.BZw());
    }

    public static final String A07(C3x9 c3x9) {
        return A05(c3x9.BVc(), c3x9.BZw());
    }

    public static final boolean A0D(C3x9 c3x9) {
        MusicInfo BVc = c3x9.BVc();
        OriginalSoundDataIntf BZw = c3x9.BZw();
        if (BVc != null) {
            return BVc.BVV().isExplicit();
        }
        if (BZw != null) {
            return BZw.isExplicit();
        }
        return false;
    }

    public static final boolean A0F(UserSession userSession, C38321qM c38321qM) {
        OriginalSoundConsumptionInfoIntf AqX;
        MusicMuteAudioReason BvC;
        if (A0H(userSession, c38321qM)) {
            MusicMuteAudioReason musicMuteAudioReason = null;
            if (c38321qM != null) {
                C88543xC A1Q = c38321qM.A1Q();
                if (A1Q != null && (BvC = A1Q.BvC()) != null) {
                    musicMuteAudioReason = BvC;
                } else {
                    OriginalSoundDataIntf A1K = c38321qM.A1K();
                    if (A1K != null && (AqX = A1K.AqX()) != null) {
                        musicMuteAudioReason = AqX.BvC();
                    }
                }
            }
            if (musicMuteAudioReason == MusicMuteAudioReason.A05) {
                return true;
            }
        }
        return false;
    }

    public static final boolean A0K(C38321qM c38321qM) {
        OriginalAudioSubtype originalAudioSubtype;
        OriginalSoundDataIntf A1K = c38321qM.A1K();
        if (A1K != null) {
            originalAudioSubtype = A1K.BZj();
        } else {
            originalAudioSubtype = null;
        }
        if (originalAudioSubtype != OriginalAudioSubtype.A06) {
            return false;
        }
        return true;
    }
}
