package X;

import android.app.Application;
import androidx.paging.PageFetcher;
import androidx.paging.PagingConfig;
import com.instagram.api.schemas.OriginalAudioSubtype;
import com.instagram.api.schemas.OriginalSoundDataIntf;
import com.instagram.api.schemas.TrackData;
import com.instagram.api.schemas.TrackMetadata;
import com.instagram.api.schemas.TrackOrOriginalSoundSchema;
import com.instagram.api.schemas.TrackOrOriginalSoundSchemaIntf;
import com.instagram.clips.model.metadata.AudioPageMetadata;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.music.common.model.AudioType;
import com.instagram.music.common.model.MusicDataSource;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes7.dex */
public class Gt5 extends C193578hc {
    public C31349DqE A00;
    public String A01;
    public InterfaceC19390xP A02;
    public ArrayList A03;
    public final TrackOrOriginalSoundSchema A04;
    public final UserSession A05;
    public final C52678NSa A06;
    public final EnumC39549HdL A07;
    public final InterfaceC24731Iq A08;
    public final InterfaceC19390xP A09;
    public final HYD A0A;
    public final String A0B;

    public /* synthetic */ void A0I() {
    }

    public final void A0J(HYM hym) {
        boolean A1a = AbstractC37304Gc5.A1a(this.A06, hym.A07, false);
        C42815Iwr c42815Iwr = new C42815Iwr(hym, this, A1a);
        AbstractC166987dD.A1Z(new C50533MSm(hym, c42815Iwr, this, null, 24, A1a), AbstractC141776au.A00(this));
    }

    public final HYM A0E(TrackOrOriginalSoundSchemaIntf trackOrOriginalSoundSchemaIntf, Integer num, String str, boolean z) {
        String str2;
        List Adv;
        List Adv2;
        String str3;
        String str4;
        Integer num2;
        Boolean Cer;
        Integer num3 = num;
        TrackMetadata BTR = trackOrOriginalSoundSchemaIntf.BTR();
        boolean z2 = true;
        boolean z3 = false;
        if (BTR == null || !BTR.isBookmarked()) {
            z2 = false;
        }
        if (trackOrOriginalSoundSchemaIntf.CA8() != null) {
            TrackData CA8 = trackOrOriginalSoundSchemaIntf.CA8();
            if (CA8 != null) {
                UserSession userSession = this.A05;
                boolean A06 = C18U.A06(AbstractC25225BEi.A0j(userSession, 0), userSession, 36328302268661186L);
                String audioClusterId = CA8.getAudioClusterId();
                if (audioClusterId != null) {
                    String title = CA8.getTitle();
                    if (title == null) {
                        title = "";
                    }
                    String displayArtist = CA8.getDisplayArtist();
                    if (displayArtist == null) {
                        displayArtist = "";
                    }
                    TrackMetadata BTR2 = trackOrOriginalSoundSchemaIntf.BTR();
                    Integer num4 = null;
                    if (BTR2 != null) {
                        str3 = BTR2.getFormattedClipsMediaCount();
                    } else {
                        str3 = null;
                    }
                    if (str3 != null && !A06) {
                        displayArtist = A0D().getApplicationContext().getResources().getString(2131964621, displayArtist, str3);
                        C14360o3.A07(displayArtist);
                    }
                    if (A06) {
                        Integer Azi = CA8.Azi();
                        if (Azi != null) {
                            str4 = AbstractC189358aC.A01(Azi.intValue());
                        } else {
                            str4 = null;
                        }
                    } else {
                        str4 = null;
                    }
                    ImageUrl AsE = CA8.AsE();
                    if (AsE == null) {
                        AsE = AbstractC25225BEi.A0t("");
                    }
                    boolean isExplicit = CA8.isExplicit();
                    TrackMetadata BTR3 = trackOrOriginalSoundSchemaIntf.BTR();
                    if (BTR3 != null && (Cer = BTR3.Cer()) != null) {
                        z3 = Cer.booleanValue();
                    }
                    Integer num5 = null;
                    MusicDataSource musicDataSource = new MusicDataSource(null, AudioType.A03, CA8.getProgressiveDownloadUrl(), CA8.getDashManifest(), CA8.getId(), CA8.getArtistId());
                    List BE6 = CA8.BE6();
                    C52678NSa c52678NSa = this.A06;
                    String audioClusterId2 = CA8.getAudioClusterId();
                    if (audioClusterId2 != null) {
                        AudioPageMetadata A03 = AbstractC41763Iee.A03(CA8, AbstractC37304Gc5.A1a(c52678NSa, audioClusterId2, z2));
                        if (num == null) {
                            TrackMetadata BTR4 = trackOrOriginalSoundSchemaIntf.BTR();
                            if (BTR4 != null) {
                                num5 = BTR4.CAx();
                            }
                        } else {
                            num5 = num3;
                        }
                        TrackMetadata BTR5 = trackOrOriginalSoundSchemaIntf.BTR();
                        if (BTR5 != null) {
                            num2 = BTR5.CAx();
                        } else {
                            num2 = null;
                        }
                        TrackMetadata BTR6 = trackOrOriginalSoundSchemaIntf.BTR();
                        if (BTR6 != null) {
                            num4 = BTR6.Bg7();
                        }
                        return new HYM(A03, AsE, musicDataSource, num5, num2, num4, audioClusterId, title, displayArtist, str4, str, CA8.getAudioAssetId(), BE6, isExplicit, z3, z, false);
                    }
                    throw AbstractC166987dD.A14("Required value was null.");
                }
                throw AbstractC166987dD.A14("Required value was null.");
            }
            throw AbstractC166987dD.A14("Required value was null.");
        }
        if (trackOrOriginalSoundSchemaIntf.BZv() != null) {
            OriginalSoundDataIntf BZv = trackOrOriginalSoundSchemaIntf.BZv();
            if (BZv != null) {
                UserSession userSession2 = this.A05;
                boolean A062 = C18U.A06(AbstractC25225BEi.A0j(userSession2, 0), userSession2, 36328302268661186L);
                String audioAssetId = BZv.getAudioAssetId();
                String originalAudioTitle = BZv.getOriginalAudioTitle();
                String username = BZv.BFU().getUsername();
                String formattedClipsMediaCount = BZv.getFormattedClipsMediaCount();
                if (formattedClipsMediaCount != null && !A062) {
                    username = A0D().getApplicationContext().getResources().getString(2131964621, username, formattedClipsMediaCount);
                    C14360o3.A07(username);
                }
                if (A062) {
                    Integer Azi2 = BZv.Azi();
                    str2 = Azi2 != null ? AbstractC189358aC.A01(Azi2.intValue()) : null;
                } else {
                    str2 = null;
                    if (BZv.BZj() == OriginalAudioSubtype.A04 && (Adv = BZv.Adv()) != null && !Adv.isEmpty() && (Adv2 = BZv.Adv()) != null) {
                        str2 = AbstractC41656Ibo.A00(AbstractC166987dD.A0O(A0D()), Adv2).toString();
                    }
                }
                ImageUrl Bhu = BZv.BFU().Bhu();
                boolean isExplicit2 = BZv.isExplicit();
                boolean isTrendingInClips = BZv.AqX().isTrendingInClips();
                MusicDataSource musicDataSource2 = new MusicDataSource(null, AudioType.A04, BZv.getProgressiveDownloadUrl(), BZv.getDashManifest(), BZv.getAudioAssetId(), BZv.BFU().getId());
                List A1J = AbstractC166987dD.A1J(0);
                AudioPageMetadata A01 = AbstractC41763Iee.A01(null, BZv, AbstractC37304Gc5.A1a(this.A06, BZv.getAudioAssetId(), z2));
                if (num == null) {
                    num3 = BZv.CAx();
                }
                return new HYM(A01, Bhu, musicDataSource2, num3, BZv.CAx(), BZv.Bg7(), audioAssetId, originalAudioTitle, username, str2, str, null, A1J, isExplicit2, isTrendingInClips, z, true);
            }
            throw AbstractC166987dD.A14("Required value was null.");
        }
        throw AbstractC166987dD.A12("TrackOrOriginalSoundSchema does not contain track or original sound");
    }

    public ArrayList A0F() {
        return this.A03;
    }

    public InterfaceC19390xP A0G() {
        HYD hyd = this.A0A;
        String str = this.A0B;
        String str2 = this.A01;
        int A01 = AbstractC167027dH.A01(hyd.A02);
        return AbstractC53649Nnu.A00(AbstractC141776au.A00(this), new MWG(25, this, new MWG(24, this, new PageFetcher(new PagingConfig(A01, AbstractC167027dH.A01(hyd.A03), A01 * 3, false), new C29637D3x(new DH5(hyd, str2, str, 38), null, 1)).A03)));
    }

    public /* synthetic */ InterfaceC19390xP A0H() {
        return null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Gt5(Application application, TrackOrOriginalSoundSchema trackOrOriginalSoundSchema, UserSession userSession, C52678NSa c52678NSa, EnumC39549HdL enumC39549HdL, HYD hyd, String str, String str2) {
        super(application);
        AbstractC167027dH.A13(application, hyd, c52678NSa);
        this.A0A = hyd;
        this.A06 = c52678NSa;
        this.A05 = userSession;
        this.A0B = str;
        this.A04 = trackOrOriginalSoundSchema;
        this.A07 = enumC39549HdL;
        this.A01 = str2;
        this.A02 = A0G();
        C24721Ip c24721Ip = new C24721Ip(Integer.MAX_VALUE);
        this.A08 = c24721Ip;
        this.A09 = AbstractC07080Za.A03(c24721Ip);
        this.A03 = AbstractC166987dD.A1E();
    }
}
