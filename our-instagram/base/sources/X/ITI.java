package X;

import com.instagram.api.schemas.OriginalAudioSubtype;
import com.instagram.api.schemas.OriginalSoundConsumptionInfoIntf;
import com.instagram.api.schemas.OriginalSoundDataIntf;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.List;

/* loaded from: classes7.dex */
public abstract class ITI {
    public static final void A01(String str, UserSession userSession, C38321qM c38321qM) {
        C14360o3.A0B(userSession, 2);
        if (c38321qM != null) {
            C3x9 A0u = AbstractC25226BEj.A0u(c38321qM);
            if (A0u != null) {
                C128865s0 c128865s0 = new C128865s0(A0u);
                OriginalSoundDataIntf BZw = A0u.BZw();
                if (BZw != null) {
                    boolean allowCreatorToRename = BZw.getAllowCreatorToRename();
                    String audioAssetId = BZw.getAudioAssetId();
                    Integer Adg = BZw.Adg();
                    List Ado = BZw.Ado();
                    List Adv = BZw.Adv();
                    List Adw = BZw.Adw();
                    Boolean Akf = BZw.Akf();
                    Boolean Akg = BZw.Akg();
                    OriginalSoundConsumptionInfoIntf AqX = BZw.AqX();
                    String dashManifest = BZw.getDashManifest();
                    Integer Azi = BZw.Azi();
                    String formattedClipsMediaCount = BZw.getFormattedClipsMediaCount();
                    boolean hideRemixing = BZw.getHideRemixing();
                    User BFU = BZw.BFU();
                    boolean isAudioAutomaticallyAttributed = BZw.isAudioAutomaticallyAttributed();
                    Boolean CT1 = BZw.CT1();
                    Boolean CTb = BZw.CTb();
                    boolean isExplicit = BZw.isExplicit();
                    Boolean CZr = BZw.CZr();
                    Boolean Cc7 = BZw.Cc7();
                    Boolean CgF = BZw.CgF();
                    String musicCanonicalId = BZw.getMusicCanonicalId();
                    Boolean BYR = BZw.BYR();
                    OriginalAudioSubtype BZj = BZw.BZj();
                    BZw.getOriginalAudioTitle();
                    String originalMediaId = BZw.getOriginalMediaId();
                    Integer BaR = BZw.BaR();
                    Integer Bg7 = BZw.Bg7();
                    String progressiveDownloadUrl = BZw.getProgressiveDownloadUrl();
                    boolean shouldMuteAudio = BZw.getShouldMuteAudio();
                    c128865s0.A09 = AbstractC40127Hqu.A00(BZj, AqX, BZw, BZw.CIV(), BFU, Akf, Akg, CT1, CTb, CZr, Cc7, CgF, BYR, Adg, Azi, BaR, Bg7, BZw.C8O(), BZw.CAx(), audioAssetId, dashManifest, formattedClipsMediaCount, musicCanonicalId, str, originalMediaId, progressiveDownloadUrl, Ado, Adv, Adw, allowCreatorToRename, hideRemixing, isAudioAutomaticallyAttributed, isExplicit, shouldMuteAudio);
                    c38321qM.A43(c128865s0.A00());
                }
            }
            c38321qM.AEH(userSession);
        }
    }

    public static final void A00(C38321qM c38321qM) {
        C3x9 A0u;
        if (c38321qM != null && (A0u = AbstractC25226BEj.A0u(c38321qM)) != null) {
            C128865s0 c128865s0 = new C128865s0(A0u);
            OriginalSoundDataIntf BZw = A0u.BZw();
            if (BZw != null) {
                BZw.getAllowCreatorToRename();
                String audioAssetId = BZw.getAudioAssetId();
                Integer Adg = BZw.Adg();
                List Ado = BZw.Ado();
                List Adv = BZw.Adv();
                List Adw = BZw.Adw();
                Boolean Akf = BZw.Akf();
                Boolean Akg = BZw.Akg();
                OriginalSoundConsumptionInfoIntf AqX = BZw.AqX();
                String dashManifest = BZw.getDashManifest();
                Integer Azi = BZw.Azi();
                String formattedClipsMediaCount = BZw.getFormattedClipsMediaCount();
                boolean hideRemixing = BZw.getHideRemixing();
                User BFU = BZw.BFU();
                boolean isAudioAutomaticallyAttributed = BZw.isAudioAutomaticallyAttributed();
                Boolean CT1 = BZw.CT1();
                Boolean CTb = BZw.CTb();
                boolean isExplicit = BZw.isExplicit();
                Boolean CZr = BZw.CZr();
                Boolean Cc7 = BZw.Cc7();
                Boolean CgF = BZw.CgF();
                String musicCanonicalId = BZw.getMusicCanonicalId();
                Boolean BYR = BZw.BYR();
                OriginalAudioSubtype BZj = BZw.BZj();
                String originalAudioTitle = BZw.getOriginalAudioTitle();
                String originalMediaId = BZw.getOriginalMediaId();
                c128865s0.A09 = AbstractC40127Hqu.A00(BZj, AqX, BZw, BZw.CIV(), BFU, Akf, Akg, CT1, CTb, CZr, Cc7, CgF, BYR, Adg, Azi, BZw.BaR(), BZw.Bg7(), BZw.C8O(), BZw.CAx(), audioAssetId, dashManifest, formattedClipsMediaCount, musicCanonicalId, originalAudioTitle, originalMediaId, BZw.getProgressiveDownloadUrl(), Ado, Adv, Adw, false, hideRemixing, isAudioAutomaticallyAttributed, isExplicit, BZw.getShouldMuteAudio());
                c38321qM.A43(c128865s0.A00());
            }
        }
    }
}
