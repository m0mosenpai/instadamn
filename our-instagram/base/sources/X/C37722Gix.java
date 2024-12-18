package X;

import android.content.Context;
import com.facebook.R;
import com.instagram.api.schemas.MusicInfo;
import com.instagram.api.schemas.OriginalSoundDataIntf;
import com.instagram.common.session.UserSession;
import com.instagram.music.common.model.AudioOverlayTrack;
import com.instagram.music.common.model.MusicAssetModel;

/* renamed from: X.Gix, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37722Gix {
    public static final C37722Gix A00 = new Object();

    public final C92584Cs A03(Context context, C120985dq c120985dq, C3x9 c3x9, UserSession userSession, C38321qM c38321qM, MusicAssetModel musicAssetModel) {
        String str;
        EnumC37735GjA enumC37735GjA;
        EnumC37735GjA enumC37735GjA2;
        MusicInfo musicInfo;
        MusicInfo musicInfo2;
        boolean z;
        boolean z2;
        InterfaceC84033on AZi;
        C14360o3.A0B(c38321qM, 1);
        C14360o3.A0B(c120985dq, 2);
        C14360o3.A0B(userSession, 5);
        C3XR musicMetadata = c38321qM.A0C.getMusicMetadata();
        C3x9 clipsMetadata = c38321qM.A0C.getClipsMetadata();
        if (clipsMetadata != null && (AZi = clipsMetadata.AZi()) != null) {
            str = AZi.getAdditionalAudioUsername();
        } else {
            str = null;
        }
        if (musicAssetModel != null) {
            String str2 = musicAssetModel.A0D;
            C14360o3.A07(str2);
            String str3 = musicAssetModel.A0I;
            C14360o3.A07(str3);
            boolean z3 = musicAssetModel.A0S;
            Boolean bool = musicAssetModel.A08;
            C14360o3.A07(bool);
            return new C92584Cs(null, null, str2, str3, R.dimen.add_payment_bottom_sheet_row_subtitle_size, false, z3, bool.booleanValue(), true, true, true, false, false, false);
        }
        C38321qM c38321qM2 = c120985dq.A02;
        if (c38321qM2 != null) {
            enumC37735GjA = AbstractC37655Gho.A00(c38321qM2);
        } else {
            enumC37735GjA = null;
        }
        if (enumC37735GjA == EnumC37735GjA.A06 && c3x9 != null && (c3x9.BVc() != null || c3x9.BZw() != null)) {
            String A07 = AbstractC76643c9.A07(c3x9);
            String A06 = AbstractC76643c9.A06(c3x9);
            C14360o3.A07(A06);
            return new C92584Cs(AbstractC76643c9.A00(c3x9.BZw()), c3x9.AZi(), A07, A06, R.dimen.add_payment_bottom_sheet_row_subtitle_size, false, AbstractC76643c9.A0D(c3x9), AbstractC76643c9.A0E(c3x9), true, true, true, AbstractC76643c9.A0H(userSession, c38321qM), AbstractC92574Cr.A03(c3x9), false);
        }
        java.util.Set set = AbstractC37655Gho.A01;
        C38321qM c38321qM3 = c120985dq.A02;
        if (c38321qM3 != null) {
            enumC37735GjA2 = AbstractC37655Gho.A00(c38321qM3);
        } else {
            enumC37735GjA2 = null;
        }
        if (AbstractC001800i.A0u(set, enumC37735GjA2) && musicMetadata != null && (musicMetadata.BVc() != null || musicMetadata.BZw() != null)) {
            C88543xC A1Q = c38321qM.A1Q();
            OriginalSoundDataIntf A1K = c38321qM.A1K();
            if (A1Q != null) {
                musicInfo = A1Q.A00;
            } else {
                musicInfo = null;
            }
            String A05 = AbstractC76643c9.A05(musicInfo, A1K);
            if (A1Q != null) {
                musicInfo2 = A1Q.A00;
            } else {
                musicInfo2 = null;
            }
            String A04 = AbstractC76643c9.A04(musicInfo2, A1K);
            C14360o3.A07(A04);
            if (A1Q != null) {
                z = A1Q.A00.BVV().isExplicit();
                z2 = A1Q.Ceq();
            } else if (A1K != null) {
                z = A1K.isExplicit();
                z2 = A1K.AqX().isTrendingInClips();
            } else {
                z = false;
                z2 = false;
            }
            return new C92584Cs(AbstractC76643c9.A00(A1K), null, A05, A04, R.dimen.add_payment_bottom_sheet_row_subtitle_size, false, z, z2, true, true, true, AbstractC76643c9.A0H(userSession, c38321qM), AbstractC92574Cr.A03(c38321qM.A0C.getClipsMetadata()), false);
        }
        if (!c120985dq.CdW() || str == null || str.length() == 0) {
            return null;
        }
        C38321qM c38321qM4 = c120985dq.A02;
        String string = context.getResources().getString(2131969269);
        C14360o3.A07(string);
        return new C92584Cs(null, null, str, string, R.dimen.add_payment_bottom_sheet_row_subtitle_size, false, false, false, true, true, true, AbstractC76643c9.A0H(userSession, c38321qM4), false, false);
    }

    public static final C92584Cs A00(AudioOverlayTrack audioOverlayTrack) {
        MusicAssetModel musicAssetModel = audioOverlayTrack.A08;
        if (musicAssetModel == null) {
            return null;
        }
        String str = musicAssetModel.A0D;
        C14360o3.A07(str);
        String str2 = musicAssetModel.A0I;
        C14360o3.A07(str2);
        return new C92584Cs(null, null, str, str2, R.dimen.add_payment_bottom_sheet_row_subtitle_size, false, musicAssetModel.A0S, false, true, false, true, false, false, true);
    }

    public static final C92584Cs A01(AudioOverlayTrack audioOverlayTrack) {
        MusicAssetModel musicAssetModel;
        if (audioOverlayTrack != null && (musicAssetModel = audioOverlayTrack.A08) != null) {
            String str = musicAssetModel.A0D;
            C14360o3.A07(str);
            String str2 = musicAssetModel.A0I;
            C14360o3.A07(str2);
            boolean z = musicAssetModel.A0S;
            Boolean bool = musicAssetModel.A08;
            C14360o3.A07(bool);
            return new C92584Cs(null, null, str, str2, R.dimen.add_payment_bottom_sheet_row_subtitle_size, false, z, bool.booleanValue(), true, true, false, false, false, false);
        }
        return null;
    }

    public static final boolean A02(Context context, C38321qM c38321qM) {
        InterfaceC88553xD interfaceC88553xD;
        C88543xC A1Q;
        C3x9 A0u = AbstractC25226BEj.A0u(c38321qM);
        if (A0u != null) {
            interfaceC88553xD = AbstractC117245Sj.A01(A0u);
        } else {
            interfaceC88553xD = null;
        }
        if (interfaceC88553xD != null || ((A1Q = c38321qM.A1Q()) != null && A1Q.AD3(context).length() > 0)) {
            return true;
        }
        return false;
    }
}
