package X;

import android.os.Parcelable;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.AdModelType;
import com.instagram.api.schemas.AppInstallCTAInfo;
import com.instagram.api.schemas.AppInstallCTAInfoIntf;
import com.instagram.api.schemas.AppstoreMetadataDict;
import com.instagram.api.schemas.AppstoreMetadataDictImpl;
import com.instagram.api.schemas.AudienceListIntf;
import com.instagram.api.schemas.BoostUpsellBannerPayloadSchema;
import com.instagram.api.schemas.BoostUpsellBannerPayloadSchemaImpl;
import com.instagram.api.schemas.BrandSafetyContentBlocklistBitmapQLObj;
import com.instagram.api.schemas.BrandSafetyContentBlocklistBitmapQLObjImpl;
import com.instagram.api.schemas.BrandedContentGatingInfo;
import com.instagram.api.schemas.BrandedContentGatingInfoIntf;
import com.instagram.api.schemas.BrandedContentProjectMetadata;
import com.instagram.api.schemas.BrandedContentProjectMetadataIntf;
import com.instagram.api.schemas.ClipsMashupFollowButtonInfo;
import com.instagram.api.schemas.ClipsMashupFollowButtonInfoImpl;
import com.instagram.api.schemas.ClipsTrialDict;
import com.instagram.api.schemas.ClipsTrialDictImpl;
import com.instagram.api.schemas.CollabFollowButtonInfo;
import com.instagram.api.schemas.CollabFollowButtonInfoImpl;
import com.instagram.api.schemas.CollectionMediaRole;
import com.instagram.api.schemas.CommentGiphyMediaInfo;
import com.instagram.api.schemas.CommentGiphyMediaInfoIntf;
import com.instagram.api.schemas.CreatorDigestSignalInfo;
import com.instagram.api.schemas.CreatorDigestSignalInfoImpl;
import com.instagram.api.schemas.FileCandidate;
import com.instagram.api.schemas.GoalsToastInfo;
import com.instagram.api.schemas.GoalsToastInfoImpl;
import com.instagram.api.schemas.IABPostClickDataDict;
import com.instagram.api.schemas.IABPostClickDataDictImpl;
import com.instagram.api.schemas.IGCommentSheetMoreInfo;
import com.instagram.api.schemas.IGCommentSheetMoreInfoImpl;
import com.instagram.api.schemas.ImmutablePandoAppInstallCTAInfo;
import com.instagram.api.schemas.ImmutablePandoAppstoreMetadataDict;
import com.instagram.api.schemas.ImmutablePandoAudienceList;
import com.instagram.api.schemas.ImmutablePandoBoostUpsellBannerPayloadSchema;
import com.instagram.api.schemas.ImmutablePandoBrandSafetyContentBlocklistBitmapQLObj;
import com.instagram.api.schemas.ImmutablePandoBrandedContentGatingInfo;
import com.instagram.api.schemas.ImmutablePandoBrandedContentProjectMetadata;
import com.instagram.api.schemas.ImmutablePandoClipsMashupFollowButtonInfo;
import com.instagram.api.schemas.ImmutablePandoClipsTrialDict;
import com.instagram.api.schemas.ImmutablePandoCollabFollowButtonInfo;
import com.instagram.api.schemas.ImmutablePandoCommentGiphyMediaInfo;
import com.instagram.api.schemas.ImmutablePandoCreatorDigestSignalInfo;
import com.instagram.api.schemas.ImmutablePandoFileCandidate;
import com.instagram.api.schemas.ImmutablePandoGoalsToastInfo;
import com.instagram.api.schemas.ImmutablePandoIABPostClickDataDict;
import com.instagram.api.schemas.ImmutablePandoIGCommentSheetMoreInfo;
import com.instagram.api.schemas.ImmutablePandoMediaReminder;
import com.instagram.api.schemas.ImmutablePandoMetaPlaceDict;
import com.instagram.api.schemas.ImmutablePandoStorySmbSupportStickerObject;
import com.instagram.api.schemas.ImmutablePandoStoryUnlockableStickerTappableObject;
import com.instagram.api.schemas.ImmutablePandoTopic;
import com.instagram.api.schemas.ImmutablePandoWhatsAppChannelShareToIgStoryStickerTappableObject;
import com.instagram.api.schemas.ImmutablePandoXDTLazyFloatingContextItem;
import com.instagram.api.schemas.ImmutablePandoXDTMetaAIMediaSuggestedPromptInfo;
import com.instagram.api.schemas.MediaCommentAudienceControlType;
import com.instagram.api.schemas.MediaReminder;
import com.instagram.api.schemas.MediaReminderImpl;
import com.instagram.api.schemas.MetaPlaceDict;
import com.instagram.api.schemas.MetaPlaceDictImpl;
import com.instagram.api.schemas.MomentAdsTypeEnum;
import com.instagram.api.schemas.OpenCarouselSubmissionState;
import com.instagram.api.schemas.OrganicCTAType;
import com.instagram.api.schemas.StorySmbSupportStickerObject;
import com.instagram.api.schemas.StoryUnlockableStickerTappableObject;
import com.instagram.api.schemas.StoryUnlockableStickerTappableObjectImpl;
import com.instagram.api.schemas.ThumbnailInteractionType;
import com.instagram.api.schemas.TopicIntf;
import com.instagram.api.schemas.WhatsAppChannelShareToIgStoryStickerTappableObject;
import com.instagram.api.schemas.XDTLazyFloatingContextItem;
import com.instagram.api.schemas.XDTMetaAIMediaSuggestedPromptInfo;
import com.instagram.feed.audio.Audio;
import com.instagram.feed.audio.AudioIntf;
import com.instagram.feed.audio.ImmutablePandoAudio;
import com.instagram.feed.media.CreativeConfig;
import com.instagram.feed.media.CreativeConfigIntf;
import com.instagram.feed.media.ImmutablePandoCreativeConfig;
import com.instagram.feed.media.ImmutablePandoMediaDict;
import com.instagram.feed.media.ImmutablePandoReelCTA;
import com.instagram.feed.media.ReelCTAIntf;
import com.instagram.model.androidlink.AndroidLink;
import com.instagram.model.androidlink.ImmutablePandoAndroidLink;
import com.instagram.model.hashtag.Hashtag;
import com.instagram.model.hashtag.HashtagImpl;
import com.instagram.model.hashtag.ImmutablePandoHashtag;
import com.instagram.model.mediasize.ImageInfo;
import com.instagram.model.mediasize.ImageInfoImpl;
import com.instagram.model.mediasize.ImmutablePandoImageInfo;
import com.instagram.model.mediasize.ImmutablePandoSpritesheetInfo;
import com.instagram.model.mediasize.ImmutablePandoVideoVersion;
import com.instagram.model.mediasize.SpritesheetInfo;
import com.instagram.model.mediasize.SpritesheetInfoImpl;
import com.instagram.model.mediasize.VideoVersionIntf;
import com.instagram.model.reels.sponsored.AutoGeneratedCardType;
import com.instagram.model.shopping.clips.IGTVShoppingInfo;
import com.instagram.model.shopping.clips.IGTVShoppingInfoIntf;
import com.instagram.model.shopping.clips.ImmutablePandoIGTVShoppingInfo;
import com.instagram.model.showreel.IgShowreelComposition;
import com.instagram.model.showreel.IgShowreelCompositionImpl;
import com.instagram.model.showreel.ImmutablePandoIgShowreelComposition;
import com.instagram.model.showreelnative.IgShowreelNativeAnimation;
import com.instagram.model.showreelnative.IgShowreelNativeAnimationIntf;
import com.instagram.model.showreelnative.ImmutablePandoIgShowreelNativeAnimation;
import com.instagram.model.venue.ImmutablePandoLocationDict;
import com.instagram.model.venue.LocationDict;
import com.instagram.model.venue.LocationDictIntf;
import com.instagram.reels.question.model.ImmutablePandoQuestionResponsesModel;
import com.instagram.reels.question.model.QuestionResponsesModelIntf;
import com.instagram.user.model.ImmutablePandoUpcomingEvent;
import com.instagram.user.model.ImmutablePandoUserDict;
import com.instagram.user.model.UpcomingEvent;
import com.instagram.user.model.UpcomingEventImpl;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.3pr, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C84483pr implements InterfaceC38831rF {
    public AnonymousClass520 A00;
    public JMR A01;
    public JM3 A02;
    public InterfaceC120925dk A03;
    public InterfaceC111164zd A04;
    public JMT A05;
    public InterfaceC84363pT A06;
    public InterfaceC31134DmH A07;
    public C3XR A08;
    public InterfaceC106814ri A09;
    public JML A0A;
    public InterfaceC102674k2 A0B;
    public InterfaceC37269GbM A0C;
    public InterfaceC105004oG A0D;
    public InterfaceC84523py A0E;
    public InterfaceC43580JMo A0F;
    public InterfaceC31131DmE A0G;
    public InterfaceC84163p3 A0H;
    public C3x9 A0I;
    public InterfaceC38901rP A0J;
    public InterfaceC38901rP A0K;
    public CreativeConfigIntf A0L;
    public JMF A0M;
    public InterfaceC31132DmF A0N;
    public JMX A0O;
    public ImmutablePandoMediaDict A0P;
    public InterfaceC31135DmI A0Q;
    public InterfaceC39541sb A0R;
    public InterfaceC99334d2 A0S;
    public InterfaceC39751sy A0T;
    public IGTVShoppingInfoIntf A0U;
    public InterfaceC43547JLh A0V;
    public UpcomingEvent A0W;
    public User A0X;
    public User A0Y;
    public User A0Z;
    public User A0a;
    public User A0b;
    public User A0c;
    public User A0d;
    public User A0e;
    public List A0f;
    public List A0g;
    public List A0h;
    public List A0i;
    public List A0j;
    public List A0k;
    public List A0l;
    public List A0m;
    public List A0n;
    public List A0o;
    public List A0p;
    public List A0q;
    public List A0r;
    public List A0s;
    public List A0t;
    public List A0u;
    public List A0v;
    public List A0w;
    public List A0x;
    public List A0y;
    public List A0z;
    public List A10;
    public List A11;
    public List A12;
    public List A13;
    public List A14;
    public List A15;
    public List A16;
    public List A17;
    public List A18;
    public List A19;
    public List A1A;
    public List A1B;
    public List A1C;
    public List A1D;
    public List A1E;
    public List A1F;
    public List A1G;
    public List A1H;
    public List A1I;
    public List A1J;
    public List A1K;
    public List A1L;
    public List A1M;
    public List A1N;
    public List A1O;
    public List A1P;
    public List A1Q;
    public List A1R;
    public List A1S;
    public List A1T;
    public List A1U;
    public List A1V;
    public List A1W;
    public List A1X;
    public List A1Y;
    public List A1Z;
    public List A1a;
    public List A1b;
    public List A1c;
    public List A1d;
    public List A1e;
    public List A1f;
    public List A1g;
    public List A1h;
    public List A1i;
    public List A1j;
    public List A1k;
    public List A1l;
    public List A1m;
    public List A1n;
    public List A1o;
    public List A1p;
    public List A1q;
    public List A1r;
    public List A1s;
    public List A1t;
    public List A1u;
    public List A1v;
    public List A1w;
    public List A1x;
    public List A1y;
    public List A1z;
    public List A20;
    public List A21;
    public List A22;
    public List A23;
    public List A24;
    public List A25;
    public List A26;
    public List A27;
    public boolean A28;
    public final Map A29;

    public C84483pr(ImmutablePandoMediaDict immutablePandoMediaDict) {
        C14360o3.A0B(immutablePandoMediaDict, 1);
        this.A29 = new LinkedHashMap();
        this.A0P = immutablePandoMediaDict;
    }

    @Override // X.InterfaceC38831rF
    public final void ERG(String str) {
        if (this.A28) {
            this.A29.put("carousel_parent_id", null);
        } else {
            TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
            this.A0P = (ImmutablePandoMediaDict) new TreeUpdaterJNI(AbstractC16850sd.A0M(new C09530e4("carousel_parent_id", null)), this.A0P).applyToTree(this.A0P);
        }
    }

    @Override // X.InterfaceC38831rF
    public final void Eck(JML jml) {
        if (this.A28) {
            this.A29.put("repost_info", null);
            return;
        }
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        this.A0P = (ImmutablePandoMediaDict) new TreeUpdaterJNI(AbstractC16850sd.A0M(new C09530e4("repost_info", null)), this.A0P).applyToTree(this.A0P);
        this.A0A = null;
    }

    @Override // X.InterfaceC38831rF
    public final void En4() {
        this.A28 = true;
    }

    @Override // X.InterfaceC38831rF
    public final C38821rE F4n(C1DV c1dv) {
        return F4m(new C1DY(c1dv, 6, false));
    }

    @Override // X.InterfaceC38831rF
    public final String AXw() {
        return this.A0P.A0i(-363605003);
    }

    @Override // X.InterfaceC38831rF
    public final InterfaceC43539JKz AYF() {
        return (InterfaceC43539JKz) this.A0P.A05(1001495785, C39237HQp.class);
    }

    @Override // X.InterfaceC38831rF
    public final String AYw() {
        return this.A0P.A0j(-1340482847);
    }

    @Override // X.InterfaceC38831rF
    public final String AZ3() {
        return this.A0P.A0i(243470802);
    }

    @Override // X.InterfaceC38831rF
    public final InterfaceC84443pn AZA() {
        return (InterfaceC84443pn) this.A0P.A05(-1053684431, C27243C0e.class);
    }

    @Override // X.InterfaceC38831rF
    public final InterfaceC104764ng AZB() {
        return (InterfaceC104764ng) this.A0P.A05(-1593201482, HWb.class);
    }

    @Override // X.InterfaceC38831rF
    public final List AZJ() {
        return this.A0P.A08(-1041590325, C0S.class);
    }

    @Override // X.InterfaceC38831rF
    public final AdModelType AZK() {
        return (AdModelType) this.A0P.A0N(526468140, DOG.A00);
    }

    @Override // X.InterfaceC38831rF
    public final Integer AZP() {
        return this.A0P.getOptionalIntValueByHashCode(1992010402);
    }

    @Override // X.InterfaceC38831rF
    public final InterfaceC87713vf AZQ() {
        return (InterfaceC87713vf) this.A0P.A05(-1422642818, C39216HOz.class);
    }

    @Override // X.InterfaceC38831rF
    public final InterfaceC109904xI AaN() {
        return (InterfaceC109904xI) this.A0P.A05(-1521819552, C39182HMl.class);
    }

    @Override // X.InterfaceC38831rF
    public final List Ab8() {
        return this.A0f;
    }

    @Override // X.InterfaceC38831rF
    public final List Abm() {
        return this.A0P.A08(-683992599, ImmutablePandoAndroidLink.class);
    }

    @Override // X.InterfaceC38831rF
    public final AppInstallCTAInfoIntf AcI() {
        return (AppInstallCTAInfoIntf) this.A0P.A05(-145039873, ImmutablePandoAppInstallCTAInfo.class);
    }

    @Override // X.InterfaceC38831rF
    public final AppstoreMetadataDict AcT() {
        return (AppstoreMetadataDict) this.A0P.A05(160943406, ImmutablePandoAppstoreMetadataDict.class);
    }

    @Override // X.InterfaceC38831rF
    public final Long AcY() {
        return this.A0P.A0L(86950409);
    }

    @Override // X.InterfaceC38831rF
    public final Long AcZ() {
        return this.A0P.A0L(78024734);
    }

    @Override // X.InterfaceC38831rF
    public final Boolean Acc() {
        return this.A0P.getOptionalBooleanValueByHashCode(1801790983);
    }

    @Override // X.InterfaceC38831rF
    public final List Ad8() {
        return this.A0P.A08(-738997328, HUu.class);
    }

    @Override // X.InterfaceC38831rF
    public final C5L2 AdA() {
        return (C5L2) this.A0P.A05(-309882753, HQr.class);
    }

    @Override // X.InterfaceC38831rF
    public final String AdE() {
        return this.A0P.A0i(-1519424279);
    }

    @Override // X.InterfaceC38831rF
    public final List AdX() {
        return this.A0P.A08(1940397466, ImmutablePandoAudienceList.class);
    }

    @Override // X.InterfaceC38831rF
    public final AudioIntf Add() {
        return (AudioIntf) this.A0P.A05(93166550, ImmutablePandoAudio.class);
    }

    @Override // X.InterfaceC38831rF
    public final AutoGeneratedCardType AeF() {
        return (AutoGeneratedCardType) this.A0P.A0N(-122941262, JCS.A00);
    }

    @Override // X.InterfaceC38831rF
    public final List AeH() {
        return this.A0P.A08(50050287, HN3.class);
    }

    @Override // X.InterfaceC38831rF
    public final List Aeh() {
        List list = this.A0g;
        if (list == null) {
            return this.A0P.A08(-1735392516, HTE.class);
        }
        return list;
    }

    @Override // X.InterfaceC38831rF
    public final Integer Afm() {
        return this.A0P.getOptionalIntValueByHashCode(-1528215024);
    }

    @Override // X.InterfaceC38831rF
    public final List AgH() {
        List list = this.A0h;
        if (list == null) {
            return this.A0P.A08(815249345, Eh3.class);
        }
        return list;
    }

    @Override // X.InterfaceC38831rF
    public final Boolean Agh() {
        return this.A0P.getOptionalBooleanValueByHashCode(-2048758110);
    }

    @Override // X.InterfaceC38831rF
    public final Boolean Agj() {
        return this.A0P.getOptionalBooleanValueByHashCode(-2114699394);
    }

    @Override // X.InterfaceC38831rF
    public final List Agk() {
        return this.A0P.getOptionalStringListByHashCode(-1627152477);
    }

    @Override // X.InterfaceC38831rF
    public final BoostUpsellBannerPayloadSchema AhI() {
        return (BoostUpsellBannerPayloadSchema) this.A0P.A05(1169465841, ImmutablePandoBoostUpsellBannerPayloadSchema.class);
    }

    @Override // X.InterfaceC38831rF
    public final String AhJ() {
        return this.A0P.A0j(1834642781);
    }

    @Override // X.InterfaceC38831rF
    public final List Ai3() {
        List list = this.A0i;
        if (list == null) {
            return this.A0P.A08(1974739535, HN7.class);
        }
        return list;
    }

    @Override // X.InterfaceC38831rF
    public final BrandedContentProjectMetadataIntf Ai4() {
        return (BrandedContentProjectMetadataIntf) this.A0P.A05(1841151060, ImmutablePandoBrandedContentProjectMetadata.class);
    }

    @Override // X.InterfaceC38831rF
    public final BrandSafetyContentBlocklistBitmapQLObj AiW() {
        return (BrandSafetyContentBlocklistBitmapQLObj) this.A0P.A05(-612473699, ImmutablePandoBrandSafetyContentBlocklistBitmapQLObj.class);
    }

    @Override // X.InterfaceC38831rF
    public final Long AiX() {
        return this.A0P.A0L(1515781529);
    }

    @Override // X.InterfaceC38831rF
    public final Long AiY() {
        return this.A0P.A0L(-383562417);
    }

    @Override // X.InterfaceC38831rF
    public final JM2 AjO() {
        return (JM2) this.A0P.A05(-26036274, HNJ.class);
    }

    @Override // X.InterfaceC38831rF
    public final Boolean AkV() {
        return this.A0P.getOptionalBooleanValueByHashCode(-126765611);
    }

    @Override // X.InterfaceC38831rF
    public final Boolean AkX() {
        return this.A0P.getOptionalBooleanValueByHashCode(-1740988645);
    }

    @Override // X.InterfaceC38831rF
    public final Boolean Aki() {
        return this.A0P.getOptionalBooleanValueByHashCode(373873083);
    }

    @Override // X.InterfaceC38831rF
    public final Boolean Akk() {
        return this.A0P.getOptionalBooleanValueByHashCode(-1482588131);
    }

    @Override // X.InterfaceC38831rF
    public final Boolean Akp() {
        return this.A0P.getOptionalBooleanValueByHashCode(-1503770365);
    }

    @Override // X.InterfaceC38831rF
    public final Boolean AlH() {
        return this.A0P.getOptionalBooleanValueByHashCode(1051141294);
    }

    @Override // X.InterfaceC38831rF
    public final Boolean AlI() {
        return this.A0P.getOptionalBooleanValueByHashCode(-283088485);
    }

    @Override // X.InterfaceC38831rF
    public final InterfaceC38901rP Alb() {
        InterfaceC38901rP interfaceC38901rP = this.A0J;
        if (interfaceC38901rP == null) {
            return (InterfaceC38901rP) this.A0P.A05(552573414, C37956Gmy.class);
        }
        return interfaceC38901rP;
    }

    @Override // X.InterfaceC38831rF
    public final AnonymousClass520 Ald() {
        AnonymousClass520 anonymousClass520 = this.A00;
        if (anonymousClass520 == null) {
            return (AnonymousClass520) this.A0P.A05(-118047050, AnonymousClass533.class);
        }
        return anonymousClass520;
    }

    @Override // X.InterfaceC38831rF
    public final Boolean Alo() {
        return this.A0P.getOptionalBooleanValueByHashCode(-344802875);
    }

    @Override // X.InterfaceC38831rF
    public final List AmB() {
        return this.A0j;
    }

    @Override // X.InterfaceC38831rF
    public final Integer AmC() {
        return this.A0P.getOptionalIntValueByHashCode(253909141);
    }

    @Override // X.InterfaceC38831rF
    public final Integer AmE() {
        return this.A0P.getOptionalIntValueByHashCode(-2015236462);
    }

    @Override // X.InterfaceC38831rF
    public final String AmI() {
        return this.A0P.A0j(1498535089);
    }

    @Override // X.InterfaceC38831rF
    public final String AmM() {
        return this.A0P.A0j(-1451270920);
    }

    @Override // X.InterfaceC38831rF
    public final ImageInfo AmQ() {
        return (ImageInfo) this.A0P.A05(758740173, ImmutablePandoImageInfo.class);
    }

    @Override // X.InterfaceC38831rF
    public final C44Q An4() {
        return (C44Q) this.A0P.A05(-1052491541, Eh5.class);
    }

    @Override // X.InterfaceC38831rF
    public final List AnT() {
        return this.A0k;
    }

    @Override // X.InterfaceC38831rF
    public final String Anl() {
        return this.A0P.A0j(906452786);
    }

    @Override // X.InterfaceC38831rF
    public final InterfaceC37265GbI Ano() {
        return (InterfaceC37265GbI) this.A0P.A05(-1410844203, C33016EhJ.class);
    }

    @Override // X.InterfaceC38831rF
    public final String Ant() {
        return this.A0P.A0i(-906308293);
    }

    @Override // X.InterfaceC38831rF
    public final Float Ao2() {
        return this.A0P.A0K(2112594119);
    }

    @Override // X.InterfaceC38831rF
    public final InterfaceC43530JKq Ao5() {
        return (InterfaceC43530JKq) this.A0P.A05(-1332305988, C39193HNa.class);
    }

    @Override // X.InterfaceC38831rF
    public final InterfaceC31131DmE AoB() {
        InterfaceC31131DmE interfaceC31131DmE = this.A0G;
        if (interfaceC31131DmE == null) {
            return (InterfaceC31131DmE) this.A0P.A05(-1785566710, C1M.class);
        }
        return interfaceC31131DmE;
    }

    @Override // X.InterfaceC38831rF
    public final List AoD() {
        List list = this.A0l;
        if (list == null) {
            return this.A0P.A08(1362025471, HTK.class);
        }
        return list;
    }

    @Override // X.InterfaceC38831rF
    public final InterfaceC83933od AoF() {
        return (InterfaceC83933od) this.A0P.A05(-2085085191, HNf.class);
    }

    @Override // X.InterfaceC38831rF
    public final InterfaceC84443pn AoG() {
        return (InterfaceC84443pn) this.A0P.A05(-1436962255, C27243C0e.class);
    }

    @Override // X.InterfaceC38831rF
    public final List AoQ() {
        List list = this.A0m;
        if (list == null) {
            return this.A0P.A08(-28006033, C39231HQi.class);
        }
        return list;
    }

    @Override // X.InterfaceC38831rF
    public final ClipsMashupFollowButtonInfo AoR() {
        return (ClipsMashupFollowButtonInfo) this.A0P.A05(-472432436, ImmutablePandoClipsMashupFollowButtonInfo.class);
    }

    @Override // X.InterfaceC38831rF
    public final InterfaceC104934o6 AoT() {
        return (InterfaceC104934o6) this.A0P.A05(-726460565, C14.class);
    }

    @Override // X.InterfaceC38831rF
    public final List AoX() {
        return this.A0P.A08(-356109792, C39197HNl.class);
    }

    @Override // X.InterfaceC38831rF
    public final List AoY() {
        return this.A0P.A08(-540293, C39199HNn.class);
    }

    @Override // X.InterfaceC38831rF
    public final InterfaceC31132DmF AoZ() {
        InterfaceC31132DmF interfaceC31132DmF = this.A0N;
        if (interfaceC31132DmF == null) {
            return (InterfaceC31132DmF) this.A0P.A05(1377047637, C1P.class);
        }
        return interfaceC31132DmF;
    }

    @Override // X.InterfaceC38831rF
    public final Integer Aob() {
        return this.A0P.getOptionalIntValueByHashCode(-1471805179);
    }

    @Override // X.InterfaceC38831rF
    public final List Aoc() {
        return this.A0P.A0n(2007135493);
    }

    @Override // X.InterfaceC38831rF
    public final List Aod() {
        List list = this.A0n;
        if (list == null) {
            return this.A0P.A08(-1895222071, HVF.class);
        }
        return list;
    }

    @Override // X.InterfaceC38831rF
    public final ClipsTrialDict Aog() {
        return (ClipsTrialDict) this.A0P.A05(1378030330, ImmutablePandoClipsTrialDict.class);
    }

    @Override // X.InterfaceC38831rF
    public final Boolean Aoo() {
        return this.A0P.getOptionalBooleanValueByHashCode(6469871);
    }

    @Override // X.InterfaceC38831rF
    public final CollabFollowButtonInfo Aos() {
        return (CollabFollowButtonInfo) this.A0P.A05(-757942401, ImmutablePandoCollabFollowButtonInfo.class);
    }

    @Override // X.InterfaceC38831rF
    public final String Ap2() {
        return this.A0P.A0i(-1133898784);
    }

    @Override // X.InterfaceC38831rF
    public final List Ap5() {
        return this.A0p;
    }

    @Override // X.InterfaceC38831rF
    public final CollectionMediaRole Ap7() {
        return (CollectionMediaRole) this.A0P.A0N(-684519374, JCT.A00);
    }

    @Override // X.InterfaceC38831rF
    public final Integer Ap8() {
        return this.A0P.getOptionalIntValueByHashCode(-684450058);
    }

    @Override // X.InterfaceC38831rF
    public final String ApA() {
        return this.A0P.A0j(323103855);
    }

    @Override // X.InterfaceC38831rF
    public final Integer ApY() {
        return this.A0P.getOptionalIntValueByHashCode(-1120985297);
    }

    @Override // X.InterfaceC38831rF
    public final InterfaceC38941rT Apc() {
        return (InterfaceC38941rT) this.A0P.A05(127934722, C37949Gmr.class);
    }

    @Override // X.InterfaceC38831rF
    public final IGCommentSheetMoreInfo Apg() {
        return (IGCommentSheetMoreInfo) this.A0P.A05(-1399143784, ImmutablePandoIGCommentSheetMoreInfo.class);
    }

    @Override // X.InterfaceC38831rF
    public final Boolean Apl() {
        return this.A0P.getOptionalBooleanValueByHashCode(536742607);
    }

    @Override // X.InterfaceC38831rF
    public final List Apm() {
        List list = this.A0q;
        if (list == null) {
            return this.A0P.A08(-602415628, C37956Gmy.class);
        }
        return list;
    }

    @Override // X.InterfaceC38831rF
    public final Boolean Apn() {
        return this.A0P.getOptionalBooleanValueByHashCode(536608871);
    }

    @Override // X.InterfaceC38831rF
    public final String App() {
        return this.A0P.A0i(-2041258099);
    }

    @Override // X.InterfaceC38831rF
    public final InterfaceC43506JJs AqQ() {
        return (InterfaceC43506JJs) this.A0P.A05(-1248396905, HPg.class);
    }

    @Override // X.InterfaceC38831rF
    public final JKD Ar6() {
        return (JKD) this.A0P.A05(663558324, HOA.class);
    }

    @Override // X.InterfaceC38831rF
    public final JMR ArZ() {
        JMR jmr = this.A01;
        if (jmr == null) {
            return (JMR) this.A0P.A05(-1068340300, HOE.class);
        }
        return jmr;
    }

    @Override // X.InterfaceC38831rF
    public final JM3 Arn() {
        JM3 jm3 = this.A02;
        if (jm3 == null) {
            return (JM3) this.A0P.A05(867506662, HOF.class);
        }
        return jm3;
    }

    @Override // X.InterfaceC38831rF
    public final InterfaceC120925dk AsX() {
        InterfaceC120925dk interfaceC120925dk = this.A03;
        if (interfaceC120925dk == null) {
            return (InterfaceC120925dk) this.A0P.A05(557393094, HOG.class);
        }
        return interfaceC120925dk;
    }

    @Override // X.InterfaceC38831rF
    public final Boolean Asd() {
        return this.A0P.getOptionalBooleanValueByHashCode(-195982014);
    }

    @Override // X.InterfaceC38831rF
    public final CreativeConfigIntf Asm() {
        CreativeConfigIntf creativeConfigIntf = this.A0L;
        if (creativeConfigIntf == null) {
            return (CreativeConfigIntf) this.A0P.A05(-1502552622, ImmutablePandoCreativeConfig.class);
        }
        return creativeConfigIntf;
    }

    @Override // X.InterfaceC38831rF
    public final InterfaceC104804nl Aso() {
        return (InterfaceC104804nl) this.A0P.A05(1963095235, HOI.class);
    }

    @Override // X.InterfaceC38831rF
    public final CreatorDigestSignalInfo Asu() {
        return (CreatorDigestSignalInfo) this.A0P.A05(-1575179043, ImmutablePandoCreatorDigestSignalInfo.class);
    }

    @Override // X.InterfaceC38831rF
    public final List At7() {
        return this.A0P.A08(-875271851, HON.class);
    }

    @Override // X.InterfaceC38831rF
    public final List AtP() {
        return this.A0P.getOptionalStringListByHashCode(1398214880);
    }

    @Override // X.InterfaceC38831rF
    public final JLN AtQ() {
        return (JLN) this.A0P.A05(-1066362962, HOW.class);
    }

    @Override // X.InterfaceC38831rF
    public final List Atw() {
        return this.A0P.getOptionalStringListByHashCode(-1198606503);
    }

    @Override // X.InterfaceC38831rF
    public final C46p Atz() {
        return (C46p) this.A0P.A05(1239998880, HOX.class);
    }

    @Override // X.InterfaceC38831rF
    public final String Au2() {
        return this.A0P.A0i(30735651);
    }

    @Override // X.InterfaceC38831rF
    public final List AvR() {
        return this.A0P.A08(773495299, HOZ.class);
    }

    @Override // X.InterfaceC38831rF
    public final List AvS() {
        return this.A0P.A08(-2112149527, HOY.class);
    }

    @Override // X.InterfaceC38831rF
    public final Integer Awg() {
        return this.A0P.getOptionalIntValueByHashCode(2138226986);
    }

    @Override // X.InterfaceC38831rF
    public final String AxV() {
        return this.A0P.A0j(-338558095);
    }

    @Override // X.InterfaceC38831rF
    public final Long Axc() {
        return this.A0P.A0L(-778586043);
    }

    @Override // X.InterfaceC38831rF
    public final String Axf() {
        return this.A0P.A0i(-1640928317);
    }

    @Override // X.InterfaceC38831rF
    public final Boolean Axw() {
        return this.A0P.getOptionalBooleanValueByHashCode(1367641622);
    }

    @Override // X.InterfaceC38831rF
    public final String AyB() {
        return this.A0P.A0i(432371099);
    }

    @Override // X.InterfaceC38831rF
    public final InterfaceC43547JLh Ayz() {
        InterfaceC43547JLh interfaceC43547JLh = this.A0V;
        if (interfaceC43547JLh == null) {
            return (InterfaceC43547JLh) this.A0P.A05(-1412160885, HXO.class);
        }
        return interfaceC43547JLh;
    }

    @Override // X.InterfaceC38831rF
    public final Integer Azw() {
        return this.A0P.getOptionalIntValueByHashCode(-1455474081);
    }

    @Override // X.InterfaceC38831rF
    public final User Azy() {
        return this.A0X;
    }

    @Override // X.InterfaceC38831rF
    public final String Azz() {
        return this.A0P.A0j(-1541911372);
    }

    @Override // X.InterfaceC38831rF
    public final String B01() {
        return this.A0P.A0j(986649031);
    }

    @Override // X.InterfaceC38831rF
    public final Integer B03() {
        return this.A0P.getOptionalIntValueByHashCode(1975633250);
    }

    @Override // X.InterfaceC38831rF
    public final List B07() {
        return this.A0r;
    }

    @Override // X.InterfaceC38831rF
    public final Boolean B1W() {
        return this.A0P.getOptionalBooleanValueByHashCode(-416533547);
    }

    @Override // X.InterfaceC38831rF
    public final Boolean B1Z() {
        return this.A0P.getOptionalBooleanValueByHashCode(-545107410);
    }

    @Override // X.InterfaceC38831rF
    public final Boolean B1l() {
        return this.A0P.getOptionalBooleanValueByHashCode(-1341343804);
    }

    @Override // X.InterfaceC38831rF
    public final JKG B2f() {
        return (JKG) this.A0P.A05(433558974, HOl.class);
    }

    @Override // X.InterfaceC38831rF
    public final Long B3E() {
        return this.A0P.A0L(31792438);
    }

    @Override // X.InterfaceC38831rF
    public final InterfaceC88353wq B3J() {
        return (InterfaceC88353wq) this.A0P.A05(-1309148525, C39211HOn.class);
    }

    @Override // X.InterfaceC38831rF
    public final String B3K() {
        return this.A0P.A0i(-2014276605);
    }

    @Override // X.InterfaceC38831rF
    public final InterfaceC84443pn B3L() {
        return (InterfaceC84443pn) this.A0P.A05(-64566079, C27243C0e.class);
    }

    @Override // X.InterfaceC38831rF
    public final String B3P() {
        return this.A0P.A0i(-1494861055);
    }

    @Override // X.InterfaceC38831rF
    public final List B47() {
        return this.A0s;
    }

    @Override // X.InterfaceC38831rF
    public final Integer B4a() {
        return this.A0P.getOptionalIntValueByHashCode(-728103700);
    }

    @Override // X.InterfaceC38831rF
    public final Integer B4k() {
        return this.A0P.getOptionalIntValueByHashCode(198726090);
    }

    @Override // X.InterfaceC38831rF
    public final String B4v() {
        return this.A0P.A0i(266416098);
    }

    @Override // X.InterfaceC38831rF
    public final Integer B4w() {
        return this.A0P.getOptionalIntValueByHashCode(-1392753753);
    }

    @Override // X.InterfaceC38831rF
    public final InterfaceC39001rZ B57() {
        return (InterfaceC39001rZ) this.A0P.A05(-875432886, HOt.class);
    }

    @Override // X.InterfaceC38831rF
    public final Integer B58() {
        return this.A0P.getOptionalIntValueByHashCode(-477331643);
    }

    @Override // X.InterfaceC38831rF
    public final String B5E() {
        return this.A0P.A0j(3136215);
    }

    @Override // X.InterfaceC38831rF
    public final List B5P() {
        List list = this.A0t;
        if (list == null) {
            return this.A0P.A08(-363400619, C39301HWq.class);
        }
        return list;
    }

    @Override // X.InterfaceC38831rF
    public final JLW B5Q() {
        return (JLW) this.A0P.A05(644378918, C39257HSu.class);
    }

    @Override // X.InterfaceC38831rF
    public final JKH B5e() {
        return (JKH) this.A0P.A05(-597943359, C39213HOw.class);
    }

    @Override // X.InterfaceC38831rF
    public final C3XK B5f() {
        return (C3XK) this.A0P.A05(-813354252, C39215HOy.class);
    }

    @Override // X.InterfaceC38831rF
    public final InterfaceC84443pn B5g() {
        return (InterfaceC84443pn) this.A0P.A05(1604778262, C27243C0e.class);
    }

    @Override // X.InterfaceC38831rF
    public final InterfaceC104834np B5i() {
        return (InterfaceC104834np) this.A0P.A05(518596130, C33013EhC.class);
    }

    @Override // X.InterfaceC38831rF
    public final InterfaceC43558JLs B5l() {
        return (InterfaceC43558JLs) this.A0P.A05(-1249826898, C39228HQf.class);
    }

    @Override // X.InterfaceC38831rF
    public final InterfaceC104934o6 B5q() {
        return (InterfaceC104934o6) this.A0P.A05(1636259750, C14.class);
    }

    @Override // X.InterfaceC38831rF
    public final InterfaceC84443pn B5w() {
        return (InterfaceC84443pn) this.A0P.A05(390919056, C27243C0e.class);
    }

    @Override // X.InterfaceC38831rF
    public final JMF B5y() {
        JMF jmf = this.A0M;
        if (jmf == null) {
            return (JMF) this.A0P.A05(-2018769517, C39294HVx.class);
        }
        return jmf;
    }

    @Override // X.InterfaceC38831rF
    public final String B5z() {
        return this.A0P.A0j(1888886538);
    }

    @Override // X.InterfaceC38831rF
    public final List B6I() {
        return this.A0P.A08(-258333186, ImmutablePandoFileCandidate.class);
    }

    @Override // X.InterfaceC38831rF
    public final List B74() {
        List list = this.A0u;
        if (list == null) {
            return this.A0P.A08(1657575607, ImmutablePandoXDTLazyFloatingContextItem.class);
        }
        return list;
    }

    @Override // X.InterfaceC38831rF
    public final Hashtag B7K() {
        return (Hashtag) this.A0P.A05(725899023, ImmutablePandoHashtag.class);
    }

    @Override // X.InterfaceC38831rF
    public final InterfaceC39031rc B99() {
        return (InterfaceC39031rc) this.A0P.A05(-2145222042, C37950Gms.class);
    }

    @Override // X.InterfaceC38831rF
    public final InterfaceC39061rf B9X() {
        return (InterfaceC39061rf) this.A0P.A05(-1145007197, C37942Gmg.class);
    }

    @Override // X.InterfaceC38831rF
    public final InterfaceC105354oy B9d() {
        return (InterfaceC105354oy) this.A0P.A05(-1225461739, C72244Xa0.class);
    }

    @Override // X.InterfaceC38831rF
    public final CommentGiphyMediaInfoIntf B9s() {
        return (CommentGiphyMediaInfoIntf) this.A0P.A05(-1436406007, ImmutablePandoCommentGiphyMediaInfo.class);
    }

    @Override // X.InterfaceC38831rF
    public final GoalsToastInfo BAB() {
        return (GoalsToastInfo) this.A0P.A05(-2015403611, ImmutablePandoGoalsToastInfo.class);
    }

    @Override // X.InterfaceC38831rF
    public final User BAR() {
        return this.A0Y;
    }

    @Override // X.InterfaceC38831rF
    public final List BAb() {
        List list = this.A0v;
        if (list == null) {
            return this.A0P.A08(984005001, C39261HTa.class);
        }
        return list;
    }

    @Override // X.InterfaceC38831rF
    public final JMX BAo() {
        JMX jmx = this.A0O;
        if (jmx == null) {
            return (JMX) this.A0P.A05(2128416018, HVy.class);
        }
        return jmx;
    }

    @Override // X.InterfaceC38831rF
    public final InterfaceC1816483t BAr() {
        return (InterfaceC1816483t) this.A0P.A05(-47685686, HPL.class);
    }

    @Override // X.InterfaceC38831rF
    public final Boolean BB7() {
        return this.A0P.getOptionalBooleanValueByHashCode(53851633);
    }

    @Override // X.InterfaceC38831rF
    public final Boolean BBC() {
        return this.A0P.getOptionalBooleanValueByHashCode(1995222060);
    }

    @Override // X.InterfaceC38831rF
    public final Boolean BBQ() {
        return this.A0P.getOptionalBooleanValueByHashCode(907460721);
    }

    @Override // X.InterfaceC38831rF
    public final Boolean BBg() {
        return this.A0P.getOptionalBooleanValueByHashCode(1880618633);
    }

    @Override // X.InterfaceC38831rF
    public final Boolean BBi() {
        return this.A0P.getOptionalBooleanValueByHashCode(-648860137);
    }

    @Override // X.InterfaceC38831rF
    public final Boolean BBn() {
        return this.A0P.getOptionalBooleanValueByHashCode(494877882);
    }

    @Override // X.InterfaceC38831rF
    public final Boolean BBq() {
        return this.A0P.getOptionalBooleanValueByHashCode(-488463036);
    }

    @Override // X.InterfaceC38831rF
    public final Boolean BBr() {
        return this.A0P.getOptionalBooleanValueByHashCode(185864850);
    }

    @Override // X.InterfaceC38831rF
    public final Boolean BC1() {
        return this.A0P.getOptionalBooleanValueByHashCode(63659464);
    }

    @Override // X.InterfaceC38831rF
    public final Boolean BCD() {
        return this.A0P.getOptionalBooleanValueByHashCode(1242246392);
    }

    @Override // X.InterfaceC38831rF
    public final Boolean BCa() {
        return this.A0P.getOptionalBooleanValueByHashCode(947254380);
    }

    @Override // X.InterfaceC38831rF
    public final Integer BCe() {
        return this.A0P.getOptionalIntValueByHashCode(2132958763);
    }

    @Override // X.InterfaceC38831rF
    public final Integer BCf() {
        return this.A0P.getOptionalIntValueByHashCode(160186751);
    }

    @Override // X.InterfaceC38831rF
    public final Boolean BCq() {
        return this.A0P.getOptionalBooleanValueByHashCode(1572653997);
    }

    @Override // X.InterfaceC38831rF
    public final Boolean BCr() {
        return this.A0P.getOptionalBooleanValueByHashCode(-1472279412);
    }

    @Override // X.InterfaceC38831rF
    public final Boolean BCz() {
        return this.A0P.getOptionalBooleanValueByHashCode(-971305057);
    }

    @Override // X.InterfaceC38831rF
    public final Boolean BD0() {
        return this.A0P.getOptionalBooleanValueByHashCode(410543582);
    }

    @Override // X.InterfaceC38831rF
    public final InterfaceC38901rP BDL() {
        InterfaceC38901rP interfaceC38901rP = this.A0K;
        if (interfaceC38901rP == null) {
            return (InterfaceC38901rP) this.A0P.A05(-1115058732, C37956Gmy.class);
        }
        return interfaceC38901rP;
    }

    @Override // X.InterfaceC38831rF
    public final Boolean BDv() {
        return this.A0P.getOptionalBooleanValueByHashCode(1469007609);
    }

    @Override // X.InterfaceC38831rF
    public final List BE4() {
        return this.A0P.A0n(1890857534);
    }

    @Override // X.InterfaceC38831rF
    public final InterfaceC107774tM BEB() {
        return (InterfaceC107774tM) this.A0P.A05(-610819410, C27247C0k.class);
    }

    @Override // X.InterfaceC38831rF
    public final List BEL() {
        return this.A0w;
    }

    @Override // X.InterfaceC38831rF
    public final String BEO() {
        return this.A0P.A0i(-132744907);
    }

    @Override // X.InterfaceC38831rF
    public final InterfaceC88253wa BEY() {
        return (InterfaceC88253wa) this.A0P.A05(-1799481222, C39238HQt.class);
    }

    @Override // X.InterfaceC38831rF
    public final IABPostClickDataDict BFg() {
        return (IABPostClickDataDict) this.A0P.A05(-1831851926, ImmutablePandoIABPostClickDataDict.class);
    }

    @Override // X.InterfaceC38831rF
    public final Integer BFk() {
        return this.A0P.getOptionalIntValueByHashCode(-36069336);
    }

    @Override // X.InterfaceC38831rF
    public final Boolean BG2() {
        return this.A0P.getOptionalBooleanValueByHashCode(-959391301);
    }

    @Override // X.InterfaceC38831rF
    public final Integer BG9() {
        return this.A0P.getOptionalIntValueByHashCode(-1627549179);
    }

    @Override // X.InterfaceC38831rF
    public final InterfaceC84473pq BGH() {
        return (InterfaceC84473pq) this.A0P.A05(-508781350, HPZ.class);
    }

    @Override // X.InterfaceC38831rF
    public final JLR BGK() {
        return (JLR) this.A0P.A05(-754836452, HQW.class);
    }

    @Override // X.InterfaceC38831rF
    public final JLS BGO() {
        return (JLS) this.A0P.A05(1576405975, HQX.class);
    }

    @Override // X.InterfaceC38831rF
    public final IGTVShoppingInfoIntf BGP() {
        IGTVShoppingInfoIntf iGTVShoppingInfoIntf = this.A0U;
        if (iGTVShoppingInfoIntf == null) {
            return (IGTVShoppingInfoIntf) this.A0P.A05(611464006, ImmutablePandoIGTVShoppingInfo.class);
        }
        return iGTVShoppingInfoIntf;
    }

    @Override // X.InterfaceC38831rF
    public final ImageInfo BGx() {
        return (ImageInfo) this.A0P.A05(-1876344045, ImmutablePandoImageInfo.class);
    }

    @Override // X.InterfaceC38831rF
    public final InterfaceC43507JJt BH4() {
        return (InterfaceC43507JJt) this.A0P.A05(-1267043538, C39227HQb.class);
    }

    @Override // X.InterfaceC38831rF
    public final String BHD() {
        return this.A0P.A0i(-1245297597);
    }

    @Override // X.InterfaceC38831rF
    public final C5H8 BHc() {
        return (C5H8) this.A0P.A05(-143133398, C68059V8l.class);
    }

    @Override // X.InterfaceC38831rF
    public final String BHp() {
        return this.A0P.A0i(-2006428187);
    }

    @Override // X.InterfaceC38831rF
    public final Float BHq() {
        return this.A0P.A0K(-9999968);
    }

    @Override // X.InterfaceC38831rF
    public final String BIK() {
        return this.A0P.A0i(-993672649);
    }

    @Override // X.InterfaceC38831rF
    public final String BIt() {
        return this.A0P.A0i(-1142947031);
    }

    @Override // X.InterfaceC38831rF
    public final String BJN() {
        return this.A0P.A0i(-1799467938);
    }

    @Override // X.InterfaceC38831rF
    public final List BJQ() {
        return this.A0x;
    }

    @Override // X.InterfaceC38831rF
    public final InterfaceC39571se BJz() {
        return (InterfaceC39571se) this.A0P.A05(91831942, HSR.class);
    }

    @Override // X.InterfaceC38831rF
    public final JM0 BL5() {
        return (JM0) this.A0P.A05(-2027308811, C39297HWe.class);
    }

    @Override // X.InterfaceC38831rF
    public final Long BLz() {
        return this.A0P.A0L(1180743147);
    }

    @Override // X.InterfaceC38831rF
    public final Float BM8() {
        return this.A0P.A0K(106911);
    }

    @Override // X.InterfaceC38831rF
    public final YQS BMk() {
        return (YQS) this.A0P.A05(-1232334165, C72245Xa1.class);
    }

    @Override // X.InterfaceC38831rF
    public final InterfaceC108064tp BMr() {
        return (InterfaceC108064tp) this.A0P.A05(1810752271, HPp.class);
    }

    @Override // X.InterfaceC38831rF
    public final Boolean BNB() {
        return this.A0P.getOptionalBooleanValueByHashCode(-1301662067);
    }

    @Override // X.InterfaceC38831rF
    public final Integer BNC() {
        return this.A0P.getOptionalIntValueByHashCode(-792455577);
    }

    @Override // X.InterfaceC38831rF
    public final InterfaceC43570JMe BNF() {
        return (InterfaceC43570JMe) this.A0P.A05(2103878726, C39233HQk.class);
    }

    @Override // X.InterfaceC38831rF
    public final String BNL() {
        return this.A0P.A0i(3321850);
    }

    @Override // X.InterfaceC38831rF
    public final String BNP() {
        return this.A0P.A0i(-1410034208);
    }

    @Override // X.InterfaceC38831rF
    public final List BNS() {
        return this.A0P.getOptionalStringListByHashCode(-2090459114);
    }

    @Override // X.InterfaceC38831rF
    public final String BNT() {
        return this.A0P.A0i(-1624294830);
    }

    @Override // X.InterfaceC38831rF
    public final Float BO9() {
        return this.A0P.A0K(107301);
    }

    @Override // X.InterfaceC38831rF
    public final LocationDictIntf BOL() {
        return (LocationDictIntf) this.A0P.A05(1901043637, ImmutablePandoLocationDict.class);
    }

    @Override // X.InterfaceC38831rF
    public final InterfaceC43508JJu BPR() {
        return (InterfaceC43508JJu) this.A0P.A05(-1536237344, C39236HQo.class);
    }

    @Override // X.InterfaceC38831rF
    public final String BPW() {
        return this.A0P.A0j(840689681);
    }

    @Override // X.InterfaceC38831rF
    public final InterfaceC84163p3 BPh() {
        InterfaceC84163p3 interfaceC84163p3 = this.A0H;
        if (interfaceC84163p3 == null) {
            return (InterfaceC84163p3) this.A0P.A05(-1255143223, C37966Gn8.class);
        }
        return interfaceC84163p3;
    }

    @Override // X.InterfaceC38831rF
    public final JKO BQQ() {
        return (JKO) this.A0P.A05(1707368972, HQq.class);
    }

    @Override // X.InterfaceC38831rF
    public final C46j BQT() {
        return (C46j) this.A0P.A05(1758667881, C1C.class);
    }

    @Override // X.InterfaceC38831rF
    public final InterfaceC88303wh BQc() {
        return (InterfaceC88303wh) this.A0P.A05(104103344, C37975GnH.class);
    }

    @Override // X.InterfaceC38831rF
    public final C914346k BQd() {
        return null;
    }

    @Override // X.InterfaceC38831rF
    public final BrandedContentGatingInfoIntf BQl() {
        return (BrandedContentGatingInfoIntf) this.A0P.A05(24203242, ImmutablePandoBrandedContentGatingInfo.class);
    }

    @Override // X.InterfaceC38831rF
    public final Integer BR9() {
        return this.A0P.getOptionalIntValueByHashCode(1079361543);
    }

    @Override // X.InterfaceC38831rF
    public final MediaCommentAudienceControlType BRD() {
        return (MediaCommentAudienceControlType) this.A0P.A0N(484037292, DOH.A00);
    }

    @Override // X.InterfaceC38831rF
    public final C52O BRH() {
        return (C52O) this.A0P.A05(1853785056, C27252C0s.class);
    }

    @Override // X.InterfaceC38831rF
    public final InterfaceC84363pT BRI() {
        InterfaceC84363pT interfaceC84363pT = this.A06;
        if (interfaceC84363pT == null) {
            return (InterfaceC84363pT) this.A0P.A05(763558, C25599BTm.class);
        }
        return interfaceC84363pT;
    }

    @Override // X.InterfaceC38831rF
    public final JM6 BRJ() {
        return (JM6) this.A0P.A05(23673747, C39239HQv.class);
    }

    @Override // X.InterfaceC38831rF
    public final InterfaceC109094vY BRN() {
        return (InterfaceC109094vY) this.A0P.A05(-1513490504, C68055V8h.class);
    }

    @Override // X.InterfaceC38831rF
    public final InterfaceC31134DmH BRQ() {
        InterfaceC31134DmH interfaceC31134DmH = this.A07;
        if (interfaceC31134DmH == null) {
            return (InterfaceC31134DmH) this.A0P.A05(-1333549622, C39241HQx.class);
        }
        return interfaceC31134DmH;
    }

    @Override // X.InterfaceC38831rF
    public final Integer BRq() {
        return this.A0P.getOptionalIntValueByHashCode(1939875509);
    }

    @Override // X.InterfaceC38831rF
    public final JKU BS1() {
        return (JKU) this.A0P.A05(1939898463, C39253HSn.class);
    }

    @Override // X.InterfaceC38831rF
    public final Boolean BSN() {
        return this.A0P.getOptionalBooleanValueByHashCode(-954145143);
    }

    @Override // X.InterfaceC38831rF
    public final List BT5() {
        List list = this.A0y;
        if (list == null) {
            return this.A0P.A08(-1214754393, HTK.class);
        }
        return list;
    }

    @Override // X.InterfaceC38831rF
    public final List BTE() {
        return this.A0P.A08(836827158, ImmutablePandoXDTMetaAIMediaSuggestedPromptInfo.class);
    }

    @Override // X.InterfaceC38831rF
    public final MetaPlaceDict BTL() {
        return (MetaPlaceDict) this.A0P.A05(1208154701, ImmutablePandoMetaPlaceDict.class);
    }

    @Override // X.InterfaceC38831rF
    public final MomentAdsTypeEnum BUm() {
        return (MomentAdsTypeEnum) this.A0P.A0N(1230482632, JCU.A00);
    }

    @Override // X.InterfaceC38831rF
    public final Boolean BUu() {
        return this.A0P.getOptionalBooleanValueByHashCode(1655419129);
    }

    @Override // X.InterfaceC38831rF
    public final InterfaceC87803vo BUx() {
        return (InterfaceC87803vo) this.A0P.A05(1813098328, C11.class);
    }

    @Override // X.InterfaceC38831rF
    public final JMJ BVD() {
        return (JMJ) this.A0P.A05(-346898653, HRE.class);
    }

    @Override // X.InterfaceC38831rF
    public final List BVM() {
        return this.A0P.getOptionalStringListByHashCode(477739665);
    }

    @Override // X.InterfaceC38831rF
    public final String BW0() {
        return this.A0P.A0i(1422949584);
    }

    @Override // X.InterfaceC38831rF
    public final Boolean BWK() {
        return this.A0P.getOptionalBooleanValueByHashCode(-940244591);
    }

    @Override // X.InterfaceC38831rF
    public final JKM BYh() {
        return (JKM) this.A0P.A05(-438213353, HQV.class);
    }

    @Override // X.InterfaceC38831rF
    public final InterfaceC114655Fv BYz() {
        return (InterfaceC114655Fv) this.A0P.A05(-1562871028, HW5.class);
    }

    @Override // X.InterfaceC38831rF
    public final Boolean BZ2() {
        return this.A0P.getOptionalBooleanValueByHashCode(-2051778936);
    }

    @Override // X.InterfaceC38831rF
    public final String BZ4() {
        return this.A0P.A0i(-1087068107);
    }

    @Override // X.InterfaceC38831rF
    public final OpenCarouselSubmissionState BZ5() {
        return (OpenCarouselSubmissionState) this.A0P.A0N(-354157272, C38012Gny.A00);
    }

    @Override // X.InterfaceC38831rF
    public final String BZD() {
        return this.A0P.A0i(-1704258212);
    }

    @Override // X.InterfaceC38831rF
    public final JLT BZV() {
        return (JLT) this.A0P.A05(-1088565167, HRS.class);
    }

    @Override // X.InterfaceC38831rF
    public final OrganicCTAType BZW() {
        return (OrganicCTAType) this.A0P.A0N(-1088226595, C38000Gnl.A00);
    }

    @Override // X.InterfaceC38831rF
    public final String BZb() {
        return this.A0P.A0j(1678213062);
    }

    @Override // X.InterfaceC38831rF
    public final String BZn() {
        return this.A0P.A0i(-1174104782);
    }

    @Override // X.InterfaceC38831rF
    public final Integer BZo() {
        return this.A0P.getOptionalIntValueByHashCode(-636516523);
    }

    @Override // X.InterfaceC38831rF
    public final Boolean BZt() {
        return this.A0P.getOptionalBooleanValueByHashCode(-750990338);
    }

    @Override // X.InterfaceC38831rF
    public final Integer Ba2() {
        return this.A0P.getOptionalIntValueByHashCode(1933097432);
    }

    @Override // X.InterfaceC38831rF
    public final String Baa() {
        return this.A0P.A0i(924848935);
    }

    @Override // X.InterfaceC38831rF
    public final String Bab() {
        return this.A0P.A0i(285928380);
    }

    @Override // X.InterfaceC38831rF
    public final InterfaceC37266GbJ Bar() {
        return (InterfaceC37266GbJ) this.A0P.A05(2109037186, C33026EhW.class);
    }

    @Override // X.InterfaceC38831rF
    public final String BcQ() {
        return this.A0P.A0i(668433131);
    }

    @Override // X.InterfaceC38831rF
    public final Boolean Bcr() {
        return this.A0P.getOptionalBooleanValueByHashCode(1690439780);
    }

    @Override // X.InterfaceC38831rF
    public final Integer Bdm() {
        return this.A0P.getOptionalIntValueByHashCode(1911031876);
    }

    @Override // X.InterfaceC38831rF
    public final Long Bdu() {
        return this.A0P.A0L(-1729694999);
    }

    @Override // X.InterfaceC38831rF
    public final String Bed() {
        return this.A0P.A0i(1065866756);
    }

    @Override // X.InterfaceC38831rF
    public final JKR Beu() {
        return (JKR) this.A0P.A05(1368503668, HRo.class);
    }

    @Override // X.InterfaceC38831rF
    public final Integer Bey() {
        return this.A0P.getOptionalIntValueByHashCode(194771224);
    }

    @Override // X.InterfaceC38831rF
    public final String Bf7() {
        return this.A0P.A0i(1092231610);
    }

    @Override // X.InterfaceC38831rF
    public final InterfaceC31135DmI BfC() {
        InterfaceC31135DmI interfaceC31135DmI = this.A0Q;
        if (interfaceC31135DmI == null) {
            return (InterfaceC31135DmI) this.A0P.A05(-2060318524, C1Q.class);
        }
        return interfaceC31135DmI;
    }

    @Override // X.InterfaceC38831rF
    public final JK3 BfE() {
        return (JK3) this.A0P.A05(-1856112574, HW2.class);
    }

    @Override // X.InterfaceC38831rF
    public final InterfaceC131055vt BfV() {
        return (InterfaceC131055vt) this.A0P.A05(1512748781, C39248HRq.class);
    }

    @Override // X.InterfaceC38831rF
    public final InterfaceC106814ri BfZ() {
        InterfaceC106814ri interfaceC106814ri = this.A09;
        if (interfaceC106814ri == null) {
            return (InterfaceC106814ri) this.A0P.A05(413243079, HRr.class);
        }
        return interfaceC106814ri;
    }

    @Override // X.InterfaceC38831rF
    public final List Bfl() {
        List list = this.A0z;
        if (list == null) {
            return this.A0P.A08(371453067, C37956Gmy.class);
        }
        return list;
    }

    @Override // X.InterfaceC38831rF
    public final User Bg6() {
        return this.A0Z;
    }

    @Override // X.InterfaceC38831rF
    public final JMT Bgt() {
        JMT jmt = this.A05;
        if (jmt == null) {
            return (JMT) this.A0P.A05(-439786551, HP1.class);
        }
        return jmt;
    }

    @Override // X.InterfaceC38831rF
    public final List BhK() {
        List list = this.A10;
        if (list == null) {
            return this.A0P.A08(-1752124513, HS4.class);
        }
        return list;
    }

    @Override // X.InterfaceC38831rF
    public final InterfaceC111164zd BhM() {
        InterfaceC111164zd interfaceC111164zd = this.A04;
        if (interfaceC111164zd == null) {
            return (InterfaceC111164zd) this.A0P.A05(1014553961, HP0.class);
        }
        return interfaceC111164zd;
    }

    @Override // X.InterfaceC38831rF
    public final Boolean Bhl() {
        return this.A0P.getOptionalBooleanValueByHashCode(-43457476);
    }

    @Override // X.InterfaceC38831rF
    public final JKS BjJ() {
        return (JKS) this.A0P.A05(1166266867, HSS.class);
    }

    @Override // X.InterfaceC38831rF
    public final List Bjd() {
        return this.A0P.A08(-958861155, HSU.class);
    }

    @Override // X.InterfaceC38831rF
    public final String Bk6() {
        return this.A0P.A0i(1582405670);
    }

    @Override // X.InterfaceC38831rF
    public final Long Bk8() {
        return this.A0P.A0L(-636642521);
    }

    @Override // X.InterfaceC38831rF
    public final Float BkJ() {
        return this.A0P.A0K(-1548326239);
    }

    @Override // X.InterfaceC38831rF
    public final Integer Bke() {
        return this.A0P.getOptionalIntValueByHashCode(467831673);
    }

    @Override // X.InterfaceC38831rF
    public final List Bkk() {
        return this.A0P.A08(-1122997398, HSX.class);
    }

    @Override // X.InterfaceC38831rF
    public final List Bl2() {
        List list = this.A11;
        if (list == null) {
            return this.A0P.A08(-1876959521, HOO.class);
        }
        return list;
    }

    @Override // X.InterfaceC38831rF
    public final String Bl8() {
        return this.A0P.A0i(767120496);
    }

    @Override // X.InterfaceC38831rF
    public final C46j Ble() {
        return (C46j) this.A0P.A05(1754751982, C1C.class);
    }

    @Override // X.InterfaceC38831rF
    public final List Blj() {
        List list = this.A12;
        if (list == null) {
            return this.A0P.A08(-301386674, HR3.class);
        }
        return list;
    }

    @Override // X.InterfaceC38831rF
    public final InterfaceC31130DmD Bm3() {
        return (InterfaceC31130DmD) this.A0P.A05(1883023793, C1D.class);
    }

    @Override // X.InterfaceC38831rF
    public final MediaReminder BmO() {
        return (MediaReminder) this.A0P.A05(-954870693, ImmutablePandoMediaReminder.class);
    }

    @Override // X.InterfaceC38831rF
    public final JML Bns() {
        JML jml = this.A0A;
        if (jml == null) {
            return (JML) this.A0P.A05(640623642, HSd.class);
        }
        return jml;
    }

    @Override // X.InterfaceC38831rF
    public final Integer BoO() {
        return this.A0P.getOptionalIntValueByHashCode(1456374940);
    }

    @Override // X.InterfaceC38831rF
    public final User BoT() {
        return this.A0a;
    }

    @Override // X.InterfaceC38831rF
    public final User BoU() {
        return this.A0b;
    }

    @Override // X.InterfaceC38831rF
    public final User BoV() {
        return this.A0c;
    }

    @Override // X.InterfaceC38831rF
    public final JLV BpH() {
        return (JLV) this.A0P.A05(27230811, HSf.class);
    }

    @Override // X.InterfaceC38831rF
    public final InterfaceC37274GbR BpQ() {
        return (InterfaceC37274GbR) this.A0P.A05(-847496409, C33033Ehf.class);
    }

    @Override // X.InterfaceC38831rF
    public final Integer BqH() {
        return this.A0P.getOptionalIntValueByHashCode(1397728205);
    }

    @Override // X.InterfaceC38831rF
    public final List BqM() {
        return this.A0P.A0n(-243648945);
    }

    @Override // X.InterfaceC38831rF
    public final String Br9() {
        return this.A0P.A0i(-659357102);
    }

    @Override // X.InterfaceC38831rF
    public final C5H7 Brw() {
        return (C5H7) this.A0P.A05(-776209025, C39252HSm.class);
    }

    @Override // X.InterfaceC38831rF
    public final List Bs0() {
        return this.A0P.A0n(1902822812);
    }

    @Override // X.InterfaceC38831rF
    public final String BsX() {
        return this.A0P.A0j(-616714632);
    }

    @Override // X.InterfaceC38831rF
    public final List BtM() {
        return this.A13;
    }

    @Override // X.InterfaceC38831rF
    public final String Bu3() {
        return this.A0P.A0i(-1980443649);
    }

    @Override // X.InterfaceC38831rF
    public final Boolean Bu7() {
        return this.A0P.getOptionalBooleanValueByHashCode(1638686732);
    }

    @Override // X.InterfaceC38831rF
    public final User BuM() {
        return this.A0d;
    }

    @Override // X.InterfaceC38831rF
    public final List BuR() {
        return this.A0P.A0m(1928650089);
    }

    @Override // X.InterfaceC38831rF
    public final InterfaceC39681sr BuT() {
        return (InterfaceC39681sr) this.A0P.A05(-1363086160, C37961Gn3.class);
    }

    @Override // X.InterfaceC38831rF
    public final String Bua() {
        return this.A0P.A0i(-863963772);
    }

    @Override // X.InterfaceC38831rF
    public final InterfaceC104964oB But() {
        return (InterfaceC104964oB) this.A0P.A05(1710237709, HQU.class);
    }

    @Override // X.InterfaceC38831rF
    public final Boolean BvE() {
        return this.A0P.getOptionalBooleanValueByHashCode(749011199);
    }

    @Override // X.InterfaceC38831rF
    public final Boolean BvR() {
        return this.A0P.getOptionalBooleanValueByHashCode(-2041628044);
    }

    @Override // X.InterfaceC38831rF
    public final Boolean BwC() {
        return this.A0P.getOptionalBooleanValueByHashCode(2024939549);
    }

    @Override // X.InterfaceC38831rF
    public final Boolean BwO() {
        return this.A0P.getOptionalBooleanValueByHashCode(-1782008060);
    }

    @Override // X.InterfaceC38831rF
    public final Boolean BwY() {
        return this.A0P.getOptionalBooleanValueByHashCode(1102388088);
    }

    @Override // X.InterfaceC38831rF
    public final Boolean Bwf() {
        return this.A0P.getOptionalBooleanValueByHashCode(915636663);
    }

    @Override // X.InterfaceC38831rF
    public final Boolean Bwv() {
        return this.A0P.getOptionalBooleanValueByHashCode(-151750197);
    }

    @Override // X.InterfaceC38831rF
    public final List Bx3() {
        return this.A14;
    }

    @Override // X.InterfaceC38831rF
    public final IgShowreelNativeAnimationIntf Bx7() {
        return (IgShowreelNativeAnimationIntf) this.A0P.A05(-824538620, ImmutablePandoIgShowreelNativeAnimation.class);
    }

    @Override // X.InterfaceC38831rF
    public final IgShowreelComposition Bx8() {
        return (IgShowreelComposition) this.A0P.A05(1494713099, ImmutablePandoIgShowreelComposition.class);
    }

    @Override // X.InterfaceC38831rF
    public final List ByK() {
        List list = this.A15;
        if (list == null) {
            return this.A0P.A08(-823445795, BU7.class);
        }
        return list;
    }

    @Override // X.InterfaceC38831rF
    public final Integer Byu() {
        return this.A0P.getOptionalIntValueByHashCode(-84625186);
    }

    @Override // X.InterfaceC38831rF
    public final Boolean C0k() {
        return this.A0P.getOptionalBooleanValueByHashCode(1088798118);
    }

    @Override // X.InterfaceC38831rF
    public final List C0s() {
        return this.A0P.A08(-1407490688, C39235HQm.class);
    }

    @Override // X.InterfaceC38831rF
    public final InterfaceC43566JMa C0t() {
        return (InterfaceC43566JMa) this.A0P.A05(1866750646, C39235HQm.class);
    }

    @Override // X.InterfaceC38831rF
    public final Integer C0u() {
        return this.A0P.getOptionalIntValueByHashCode(-737858055);
    }

    @Override // X.InterfaceC38831rF
    public final List C15() {
        List list = this.A17;
        if (list == null) {
            return this.A0P.A08(-1296948496, HT9.class);
        }
        return list;
    }

    @Override // X.InterfaceC38831rF
    public final C40C C16() {
        return (C40C) this.A0P.A05(-2032452484, HPV.class);
    }

    @Override // X.InterfaceC38831rF
    public final InterfaceC39751sy C17() {
        InterfaceC39751sy interfaceC39751sy = this.A0T;
        if (interfaceC39751sy == null) {
            return (InterfaceC39751sy) this.A0P.A05(779041318, C39299HWg.class);
        }
        return interfaceC39751sy;
    }

    @Override // X.InterfaceC38831rF
    public final List C18() {
        List list = this.A18;
        if (list == null) {
            return this.A0P.A08(1486703590, HTA.class);
        }
        return list;
    }

    @Override // X.InterfaceC38831rF
    public final List C19() {
        List list = this.A19;
        if (list == null) {
            return this.A0P.A08(-1125789342, HTC.class);
        }
        return list;
    }

    @Override // X.InterfaceC38831rF
    public final JMM C1A() {
        return (JMM) this.A0P.A05(675283991, HTD.class);
    }

    @Override // X.InterfaceC38831rF
    public final List C1D() {
        List list = this.A1A;
        if (list == null) {
            return this.A0P.A08(2006132535, C39279HUa.class);
        }
        return list;
    }

    @Override // X.InterfaceC38831rF
    public final List C1E() {
        return this.A0P.A08(-232732464, HTF.class);
    }

    @Override // X.InterfaceC38831rF
    public final List C1F() {
        List list = this.A1B;
        if (list == null) {
            return this.A0P.A08(564544978, HTG.class);
        }
        return list;
    }

    @Override // X.InterfaceC38831rF
    public final List C1G() {
        List list = this.A1C;
        if (list == null) {
            return this.A0P.A08(2040319440, HTH.class);
        }
        return list;
    }

    @Override // X.InterfaceC38831rF
    public final List C1I() {
        List list = this.A1D;
        if (list == null) {
            return this.A0P.A08(169939895, HTJ.class);
        }
        return list;
    }

    @Override // X.InterfaceC38831rF
    public final List C1K() {
        List list = this.A1E;
        if (list == null) {
            return this.A0P.A08(-930617263, HTK.class);
        }
        return list;
    }

    @Override // X.InterfaceC38831rF
    public final List C1L() {
        List list = this.A1F;
        if (list == null) {
            return this.A0P.A08(-2045617666, C37956Gmy.class);
        }
        return list;
    }

    @Override // X.InterfaceC38831rF
    public final List C1M() {
        List list = this.A1G;
        if (list == null) {
            return this.A0P.A08(-673377812, HTL.class);
        }
        return list;
    }

    @Override // X.InterfaceC38831rF
    public final List C1N() {
        List list = this.A1H;
        if (list == null) {
            return this.A0P.A08(1710761926, ImmutablePandoReelCTA.class);
        }
        return list;
    }

    @Override // X.InterfaceC38831rF
    public final List C1R() {
        List list = this.A1I;
        if (list == null) {
            return this.A0P.A08(-126306446, HTN.class);
        }
        return list;
    }

    @Override // X.InterfaceC38831rF
    public final C40I C1S() {
        return (C40I) this.A0P.A05(161790302, C39298HWf.class);
    }

    @Override // X.InterfaceC38831rF
    public final List C1T() {
        List list = this.A1J;
        if (list == null) {
            return this.A0P.A08(-208973886, HOp.class);
        }
        return list;
    }

    @Override // X.InterfaceC38831rF
    public final List C1U() {
        List list = this.A1K;
        if (list == null) {
            return this.A0P.A08(1322756046, HTP.class);
        }
        return list;
    }

    @Override // X.InterfaceC38831rF
    public final List C1V() {
        List list = this.A1L;
        if (list == null) {
            return this.A0P.A08(-4846001, HTQ.class);
        }
        return list;
    }

    @Override // X.InterfaceC38831rF
    public final List C1W() {
        List list = this.A1M;
        if (list == null) {
            return this.A0P.A08(1518882930, HTS.class);
        }
        return list;
    }

    @Override // X.InterfaceC38831rF
    public final List C1X() {
        List list = this.A1N;
        if (list == null) {
            return this.A0P.A08(-1095329344, HTT.class);
        }
        return list;
    }

    @Override // X.InterfaceC38831rF
    public final List C1Y() {
        List list = this.A1O;
        if (list == null) {
            return this.A0P.A08(933243789, HTW.class);
        }
        return list;
    }

    @Override // X.InterfaceC38831rF
    public final List C1Z() {
        List list = this.A1P;
        if (list == null) {
            return this.A0P.A08(-847098274, HTV.class);
        }
        return list;
    }

    @Override // X.InterfaceC38831rF
    public final List C1a() {
        List list = this.A1Q;
        if (list == null) {
            return this.A0P.A08(-625916542, HTX.class);
        }
        return list;
    }

    @Override // X.InterfaceC38831rF
    public final List C1b() {
        List list = this.A1R;
        if (list == null) {
            return this.A0P.A08(272605310, HTY.class);
        }
        return list;
    }

    @Override // X.InterfaceC38831rF
    public final Boolean C1c() {
        return this.A0P.getOptionalBooleanValueByHashCode(-1725930739);
    }

    @Override // X.InterfaceC38831rF
    public final List C1d() {
        List list = this.A1S;
        if (list == null) {
            return this.A0P.A08(-1294058959, C39263HTc.class);
        }
        return list;
    }

    @Override // X.InterfaceC38831rF
    public final List C1e() {
        List list = this.A1T;
        if (list == null) {
            return this.A0P.A08(1561034635, C39264HTd.class);
        }
        return list;
    }

    @Override // X.InterfaceC38831rF
    public final List C1f() {
        List list = this.A1U;
        if (list == null) {
            return this.A0P.A08(1110981966, C39265HTe.class);
        }
        return list;
    }

    @Override // X.InterfaceC38831rF
    public final Boolean C1g() {
        return this.A0P.getOptionalBooleanValueByHashCode(1510592481);
    }

    @Override // X.InterfaceC38831rF
    public final List C1i() {
        List list = this.A1V;
        if (list == null) {
            return this.A0P.A08(1762620337, C39266HTg.class);
        }
        return list;
    }

    @Override // X.InterfaceC38831rF
    public final List C1j() {
        List list = this.A1W;
        if (list == null) {
            return this.A0P.A08(1308187796, HW4.class);
        }
        return list;
    }

    @Override // X.InterfaceC38831rF
    public final InterfaceC37269GbM C1k() {
        InterfaceC37269GbM interfaceC37269GbM = this.A0C;
        if (interfaceC37269GbM == null) {
            return (InterfaceC37269GbM) this.A0P.A05(1804853661, C33035Ehh.class);
        }
        return interfaceC37269GbM;
    }

    @Override // X.InterfaceC38831rF
    public final List C1l() {
        List list = this.A1X;
        if (list == null) {
            return this.A0P.A08(858223008, C39269HTj.class);
        }
        return list;
    }

    @Override // X.InterfaceC38831rF
    public final List C1m() {
        List list = this.A1Y;
        if (list == null) {
            return this.A0P.A08(1049605402, HSb.class);
        }
        return list;
    }

    @Override // X.InterfaceC38831rF
    public final List C1n() {
        List list = this.A1Z;
        if (list == null) {
            return this.A0P.A08(-631801264, C39270HTm.class);
        }
        return list;
    }

    @Override // X.InterfaceC38831rF
    public final List C1o() {
        List list = this.A1a;
        if (list == null) {
            return this.A0P.A08(-382777286, C39271HTn.class);
        }
        return list;
    }

    @Override // X.InterfaceC38831rF
    public final List C1p() {
        List list = this.A1b;
        if (list == null) {
            return this.A0P.A08(-827337423, C39273HTp.class);
        }
        return list;
    }

    @Override // X.InterfaceC38831rF
    public final List C1q() {
        List list = this.A1c;
        if (list == null) {
            return this.A0P.A08(981516677, C39274HTq.class);
        }
        return list;
    }

    @Override // X.InterfaceC38831rF
    public final List C1r() {
        List list = this.A1d;
        if (list == null) {
            return this.A0P.A08(245917471, C39275HTr.class);
        }
        return list;
    }

    @Override // X.InterfaceC38831rF
    public final List C1s() {
        List list = this.A1e;
        if (list == null) {
            return this.A0P.A08(1490848472, C33048Ehv.class);
        }
        return list;
    }

    @Override // X.InterfaceC38831rF
    public final List C1t() {
        List list = this.A1f;
        if (list == null) {
            return this.A0P.A08(-918392630, C39276HTs.class);
        }
        return list;
    }

    @Override // X.InterfaceC38831rF
    public final List C1u() {
        List list = this.A1g;
        if (list == null) {
            return this.A0P.A08(2119426726, C39277HTu.class);
        }
        return list;
    }

    @Override // X.InterfaceC38831rF
    public final List C1v() {
        List list = this.A1h;
        if (list == null) {
            return this.A0P.A08(2128300741, C39278HTv.class);
        }
        return list;
    }

    @Override // X.InterfaceC38831rF
    public final List C1x() {
        List list = this.A1i;
        if (list == null) {
            return this.A0P.A08(757656494, HU0.class);
        }
        return list;
    }

    @Override // X.InterfaceC38831rF
    public final List C1y() {
        List list = this.A1j;
        if (list == null) {
            return this.A0P.A08(-2018333115, HTz.class);
        }
        return list;
    }

    @Override // X.InterfaceC38831rF
    public final List C1z() {
        List list = this.A1k;
        if (list == null) {
            return this.A0P.A08(-989899414, HSQ.class);
        }
        return list;
    }

    @Override // X.InterfaceC38831rF
    public final List C20() {
        List list = this.A1l;
        if (list == null) {
            return this.A0P.A08(-180194119, ImmutablePandoQuestionResponsesModel.class);
        }
        return list;
    }

    @Override // X.InterfaceC38831rF
    public final List C21() {
        List list = this.A1m;
        if (list == null) {
            return this.A0P.A08(723142275, HU1.class);
        }
        return list;
    }

    @Override // X.InterfaceC38831rF
    public final JKW C22() {
        return (JKW) this.A0P.A05(681026506, HU2.class);
    }

    @Override // X.InterfaceC38831rF
    public final List C23() {
        List list = this.A1n;
        if (list == null) {
            return this.A0P.A08(-546458471, HU5.class);
        }
        return list;
    }

    @Override // X.InterfaceC38831rF
    public final List C24() {
        List list = this.A1o;
        if (list == null) {
            return this.A0P.A08(-917292812, HU7.class);
        }
        return list;
    }

    @Override // X.InterfaceC38831rF
    public final List C26() {
        List list = this.A1p;
        if (list == null) {
            return this.A0P.A08(-757070241, C33036Ehi.class);
        }
        return list;
    }

    @Override // X.InterfaceC38831rF
    public final List C27() {
        List list = this.A1q;
        if (list == null) {
            return this.A0P.A08(2125349730, HU8.class);
        }
        return list;
    }

    @Override // X.InterfaceC38831rF
    public final List C2B() {
        List list = this.A1r;
        if (list == null) {
            return this.A0P.A08(-133989276, HSe.class);
        }
        return list;
    }

    @Override // X.InterfaceC38831rF
    public final List C2C() {
        List list = this.A1s;
        if (list == null) {
            return this.A0P.A08(492391483, HU9.class);
        }
        return list;
    }

    @Override // X.InterfaceC38831rF
    public final List C2D() {
        List list = this.A1t;
        if (list == null) {
            return this.A0P.A08(-640823660, HUB.class);
        }
        return list;
    }

    @Override // X.InterfaceC38831rF
    public final List C2F() {
        List list = this.A1u;
        if (list == null) {
            return this.A0P.A08(-1590071686, HUD.class);
        }
        return list;
    }

    @Override // X.InterfaceC38831rF
    public final List C2G() {
        List list = this.A1v;
        if (list == null) {
            return this.A0P.A08(466583144, HUC.class);
        }
        return list;
    }

    @Override // X.InterfaceC38831rF
    public final List C2H() {
        List list = this.A1w;
        if (list == null) {
            return this.A0P.A08(1600111719, ImmutablePandoStorySmbSupportStickerObject.class);
        }
        return list;
    }

    @Override // X.InterfaceC38831rF
    public final List C2I() {
        List list = this.A1x;
        if (list == null) {
            return this.A0P.A08(299456281, HSb.class);
        }
        return list;
    }

    @Override // X.InterfaceC38831rF
    public final List C2L() {
        List list = this.A1y;
        if (list == null) {
            return this.A0P.A08(1285614450, HUG.class);
        }
        return list;
    }

    @Override // X.InterfaceC38831rF
    public final List C2M() {
        List list = this.A1z;
        if (list == null) {
            return this.A0P.A08(353770633, HSb.class);
        }
        return list;
    }

    @Override // X.InterfaceC38831rF
    public final InterfaceC43513JJz C2O() {
        return (InterfaceC43513JJz) this.A0P.A05(1440195804, HUY.class);
    }

    @Override // X.InterfaceC38831rF
    public final StoryUnlockableStickerTappableObject C2P() {
        return (StoryUnlockableStickerTappableObject) this.A0P.A05(2054416679, ImmutablePandoStoryUnlockableStickerTappableObject.class);
    }

    @Override // X.InterfaceC38831rF
    public final List C2Q() {
        List list = this.A20;
        if (list == null) {
            return this.A0P.A08(189260370, C39283HUg.class);
        }
        return list;
    }

    @Override // X.InterfaceC38831rF
    public final List C2S() {
        List list = this.A21;
        if (list == null) {
            return this.A0P.A08(-1931276005, C39289HVa.class);
        }
        return list;
    }

    @Override // X.InterfaceC38831rF
    public final List C2T() {
        List list = this.A22;
        if (list == null) {
            return this.A0P.A08(-952835651, C39285HUi.class);
        }
        return list;
    }

    @Override // X.InterfaceC38831rF
    public final List C2V() {
        return this.A0P.A08(131529241, HUk.class);
    }

    @Override // X.InterfaceC38831rF
    public final Boolean C3P() {
        return this.A0P.getOptionalBooleanValueByHashCode(-1784633906);
    }

    @Override // X.InterfaceC38831rF
    public final List C3X() {
        List list = this.A23;
        if (list == null) {
            return this.A0P.A08(2112460369, HUI.class);
        }
        return list;
    }

    @Override // X.InterfaceC38831rF
    public final Boolean C4G() {
        return this.A0P.getOptionalBooleanValueByHashCode(-2059763040);
    }

    @Override // X.InterfaceC38831rF
    public final Long C5A() {
        return this.A0P.A0L(-643954005);
    }

    @Override // X.InterfaceC38831rF
    public final Float C5C() {
        return this.A0P.A0K(458041893);
    }

    @Override // X.InterfaceC38831rF
    public final InterfaceC102674k2 C5N() {
        InterfaceC102674k2 interfaceC102674k2 = this.A0B;
        if (interfaceC102674k2 == null) {
            return (InterfaceC102674k2) this.A0P.A05(1318038232, C39256HSr.class);
        }
        return interfaceC102674k2;
    }

    @Override // X.InterfaceC38831rF
    public final InterfaceC107194sQ C6O() {
        return (InterfaceC107194sQ) this.A0P.A05(1590396334, C39300HWh.class);
    }

    @Override // X.InterfaceC38831rF
    public final InterfaceC99334d2 C6Y() {
        InterfaceC99334d2 interfaceC99334d2 = this.A0S;
        if (interfaceC99334d2 == null) {
            return (InterfaceC99334d2) this.A0P.A05(-1198382791, V97.class);
        }
        return interfaceC99334d2;
    }

    @Override // X.InterfaceC38831rF
    public final List C6g() {
        List list = this.A24;
        if (list == null) {
            return this.A0P.A08(-235485270, HVD.class);
        }
        return list;
    }

    @Override // X.InterfaceC38831rF
    public final List C6n() {
        return this.A0P.getOptionalStringListByHashCode(1809512549);
    }

    @Override // X.InterfaceC38831rF
    public final InterfaceC43520JKg C6q() {
        return (InterfaceC43520JKg) this.A0P.A05(1854819208, HVI.class);
    }

    @Override // X.InterfaceC38831rF
    public final ThumbnailInteractionType C86() {
        return (ThumbnailInteractionType) this.A0P.A0N(-1854931910, JCV.A00);
    }

    @Override // X.InterfaceC38831rF
    public final SpritesheetInfo C8E() {
        return (SpritesheetInfo) this.A0P.A05(-1703162617, ImmutablePandoSpritesheetInfo.class);
    }

    @Override // X.InterfaceC38831rF
    public final InterfaceC99494dO C8I() {
        return (InterfaceC99494dO) this.A0P.A05(-2083703389, C1K.class);
    }

    @Override // X.InterfaceC38831rF
    public final List C8a() {
        return this.A0P.A0n(-815903539);
    }

    @Override // X.InterfaceC38831rF
    public final List C9Y() {
        return this.A0P.getOptionalStringListByHashCode(-852740542);
    }

    @Override // X.InterfaceC38831rF
    public final List C9g() {
        return this.A0P.A08(-868034268, ImmutablePandoTopic.class);
    }

    @Override // X.InterfaceC38831rF
    public final Integer C9l() {
        return this.A0P.getOptionalIntValueByHashCode(-247788880);
    }

    @Override // X.InterfaceC38831rF
    public final Integer C9z() {
        return this.A0P.getOptionalIntValueByHashCode(919047613);
    }

    @Override // X.InterfaceC38831rF
    public final List CAU() {
        return this.A0P.A08(-1611417801, C39259HSy.class);
    }

    @Override // X.InterfaceC38831rF
    public final List CAf() {
        return this.A0P.A08(630344494, HVW.class);
    }

    @Override // X.InterfaceC38831rF
    public final String CBA() {
        return this.A0P.A0j(-2064382341);
    }

    @Override // X.InterfaceC38831rF
    public final String CBB() {
        return this.A0P.A0i(403610603);
    }

    @Override // X.InterfaceC38831rF
    public final Boolean CCK() {
        return this.A0P.getOptionalBooleanValueByHashCode(-153997515);
    }

    @Override // X.InterfaceC38831rF
    public final UpcomingEvent CD4() {
        UpcomingEvent upcomingEvent = this.A0W;
        if (upcomingEvent == null) {
            return (UpcomingEvent) this.A0P.A05(-2094458441, ImmutablePandoUpcomingEvent.class);
        }
        return upcomingEvent;
    }

    @Override // X.InterfaceC38831rF
    public final Long CDR() {
        return this.A0P.A0L(1218147454);
    }

    @Override // X.InterfaceC38831rF
    public final JM9 CDS() {
        return (JM9) this.A0P.A05(116083, C39258HSx.class);
    }

    @Override // X.InterfaceC38831rF
    public final InterfaceC105004oG CDT() {
        InterfaceC105004oG interfaceC105004oG = this.A0D;
        if (interfaceC105004oG == null) {
            return (InterfaceC105004oG) this.A0P.A05(1238212428, HVO.class);
        }
        return interfaceC105004oG;
    }

    @Override // X.InterfaceC38831rF
    public final User CDj() {
        return this.A0e;
    }

    @Override // X.InterfaceC38831rF
    public final InterfaceC84523py CEF() {
        InterfaceC84523py interfaceC84523py = this.A0E;
        if (interfaceC84523py == null) {
            return (InterfaceC84523py) this.A0P.A05(-265534876, C38005Gnq.class);
        }
        return interfaceC84523py;
    }

    @Override // X.InterfaceC38831rF
    public final InterfaceC43523JKj CF0() {
        return (InterfaceC43523JKj) this.A0P.A05(-1220809526, HVU.class);
    }

    @Override // X.InterfaceC38831rF
    public final Float CF6() {
        return this.A0P.A0K(706299096);
    }

    @Override // X.InterfaceC38831rF
    public final List CF8() {
        return this.A0P.A08(-1921505591, HVV.class);
    }

    @Override // X.InterfaceC38831rF
    public final String CFB() {
        return this.A0P.A0i(1974901084);
    }

    @Override // X.InterfaceC38831rF
    public final List CFT() {
        return this.A0P.getOptionalStringListByHashCode(705492115);
    }

    @Override // X.InterfaceC38831rF
    public final Float CFU() {
        return this.A0P.A0K(686233394);
    }

    @Override // X.InterfaceC38831rF
    public final Boolean CFV() {
        return this.A0P.getOptionalBooleanValueByHashCode(685298585);
    }

    @Override // X.InterfaceC38831rF
    public final Boolean CFW() {
        return this.A0P.getOptionalBooleanValueByHashCode(2147173644);
    }

    @Override // X.InterfaceC38831rF
    public final String CFX() {
        return this.A0P.A0i(500587266);
    }

    @Override // X.InterfaceC38831rF
    public final Boolean CFY() {
        return this.A0P.getOptionalBooleanValueByHashCode(-709649780);
    }

    @Override // X.InterfaceC38831rF
    public final List CFe() {
        return this.A0P.A08(713258463, ImmutablePandoVideoVersion.class);
    }

    @Override // X.InterfaceC38831rF
    public final Integer CFm() {
        return this.A0P.getOptionalIntValueByHashCode(-1534353675);
    }

    @Override // X.InterfaceC38831rF
    public final Integer CFr() {
        return this.A0P.getOptionalIntValueByHashCode(1496409374);
    }

    @Override // X.InterfaceC38831rF
    public final Boolean CG2() {
        return this.A0P.getOptionalBooleanValueByHashCode(1569386526);
    }

    @Override // X.InterfaceC38831rF
    public final Integer CG5() {
        return this.A0P.getOptionalIntValueByHashCode(479826082);
    }

    @Override // X.InterfaceC38831rF
    public final String CG7() {
        return this.A0P.A0i(1995163171);
    }

    @Override // X.InterfaceC38831rF
    public final InterfaceC43524JKk CGF() {
        return (InterfaceC43524JKk) this.A0P.A05(352259510, HVX.class);
    }

    @Override // X.InterfaceC38831rF
    public final List CGP() {
        return this.A25;
    }

    @Override // X.InterfaceC38831rF
    public final String CGd() {
        return this.A0P.A0i(1941332754);
    }

    @Override // X.InterfaceC38831rF
    public final List CGm() {
        List list = this.A26;
        if (list == null) {
            return this.A0P.A08(-2066840604, HR2.class);
        }
        return list;
    }

    @Override // X.InterfaceC38831rF
    public final AnonymousClass924 CGu() {
        return (AnonymousClass924) this.A0P.A05(1960598564, C220639on.class);
    }

    @Override // X.InterfaceC38831rF
    public final String CHB() {
        return this.A0P.A0i(-432702711);
    }

    @Override // X.InterfaceC38831rF
    public final Boolean CHD() {
        return this.A0P.getOptionalBooleanValueByHashCode(-314528552);
    }

    @Override // X.InterfaceC38831rF
    public final InterfaceC43580JMo CHL() {
        InterfaceC43580JMo interfaceC43580JMo = this.A0F;
        if (interfaceC43580JMo == null) {
            return (InterfaceC43580JMo) this.A0P.A05(-1667152236, HVb.class);
        }
        return interfaceC43580JMo;
    }

    @Override // X.InterfaceC38831rF
    public final List CHY() {
        List list = this.A27;
        if (list == null) {
            return this.A0P.A08(85687878, ImmutablePandoWhatsAppChannelShareToIgStoryStickerTappableObject.class);
        }
        return list;
    }

    @Override // X.InterfaceC38831rF
    public final Boolean CPU() {
        return this.A0P.getOptionalBooleanValueByHashCode(107582719);
    }

    @Override // X.InterfaceC38831rF
    public final Boolean CQ3() {
        return this.A0P.getOptionalBooleanValueByHashCode(810011268);
    }

    @Override // X.InterfaceC38831rF
    public final Boolean CQC() {
        return this.A0P.getOptionalBooleanValueByHashCode(1764375680);
    }

    @Override // X.InterfaceC38831rF
    public final Boolean CQE() {
        return this.A0P.getOptionalBooleanValueByHashCode(-1880722099);
    }

    @Override // X.InterfaceC38831rF
    public final Boolean CQR() {
        return this.A0P.getOptionalBooleanValueByHashCode(-1254240578);
    }

    @Override // X.InterfaceC38831rF
    public final Boolean CRM() {
        return this.A0P.getOptionalBooleanValueByHashCode(884528459);
    }

    @Override // X.InterfaceC38831rF
    public final Boolean CRV() {
        return this.A0P.getOptionalBooleanValueByHashCode(-1873233069);
    }

    @Override // X.InterfaceC38831rF
    public final Boolean CSD() {
        return this.A0P.getOptionalBooleanValueByHashCode(1951265512);
    }

    @Override // X.InterfaceC38831rF
    public final Integer CSN() {
        return this.A0P.getOptionalIntValueByHashCode(-181834353);
    }

    @Override // X.InterfaceC38831rF
    public final Boolean CSa() {
        return this.A0P.getOptionalBooleanValueByHashCode(-69686013);
    }

    @Override // X.InterfaceC38831rF
    public final Boolean CSf() {
        return this.A0P.getOptionalBooleanValueByHashCode(-1766270183);
    }

    @Override // X.InterfaceC38831rF
    public final Boolean CTF() {
        return this.A0P.getOptionalBooleanValueByHashCode(-301348514);
    }

    @Override // X.InterfaceC38831rF
    public final Boolean CTG() {
        return this.A0P.getOptionalBooleanValueByHashCode(177019097);
    }

    @Override // X.InterfaceC38831rF
    public final Boolean CTu() {
        return this.A0P.getOptionalBooleanValueByHashCode(-1179770777);
    }

    @Override // X.InterfaceC38831rF
    public final Boolean CUW() {
        return this.A0P.getOptionalBooleanValueByHashCode(433212218);
    }

    @Override // X.InterfaceC38831rF
    public final Boolean CUu() {
        return this.A0P.getOptionalBooleanValueByHashCode(2144572139);
    }

    @Override // X.InterfaceC38831rF
    public final Boolean CVB() {
        return this.A0P.getOptionalBooleanValueByHashCode(-1966983554);
    }

    @Override // X.InterfaceC38831rF
    public final Boolean CVH() {
        return this.A0P.getOptionalBooleanValueByHashCode(1957746194);
    }

    @Override // X.InterfaceC38831rF
    public final Boolean CWJ() {
        return this.A0P.getOptionalBooleanValueByHashCode(1159580641);
    }

    @Override // X.InterfaceC38831rF
    public final Boolean CWy() {
        return this.A0P.getOptionalBooleanValueByHashCode(546393497);
    }

    @Override // X.InterfaceC38831rF
    public final Boolean CXO() {
        return this.A0P.getOptionalBooleanValueByHashCode(-539271266);
    }

    @Override // X.InterfaceC38831rF
    public final Boolean CY5() {
        return this.A0P.getOptionalBooleanValueByHashCode(-962559095);
    }

    @Override // X.InterfaceC38831rF
    public final Boolean CZ2() {
        return this.A0P.getOptionalBooleanValueByHashCode(1451206513);
    }

    @Override // X.InterfaceC38831rF
    public final Boolean CZp() {
        return this.A0P.getOptionalBooleanValueByHashCode(-480636230);
    }

    @Override // X.InterfaceC38831rF
    public final Boolean Ca1() {
        return this.A0P.getOptionalBooleanValueByHashCode(933367942);
    }

    @Override // X.InterfaceC38831rF
    public final Boolean CaG() {
        return this.A0P.getOptionalBooleanValueByHashCode(-1297484837);
    }

    @Override // X.InterfaceC38831rF
    public final Boolean Caj() {
        return this.A0P.getOptionalBooleanValueByHashCode(691621974);
    }

    @Override // X.InterfaceC38831rF
    public final Boolean Cak() {
        return this.A0P.getOptionalBooleanValueByHashCode(1517048159);
    }

    @Override // X.InterfaceC38831rF
    public final Boolean Caz() {
        return this.A0P.getOptionalBooleanValueByHashCode(2074792632);
    }

    @Override // X.InterfaceC38831rF
    public final Boolean CbQ() {
        return this.A0P.getOptionalBooleanValueByHashCode(445113506);
    }

    @Override // X.InterfaceC38831rF
    public final Boolean CbS() {
        return this.A0P.getOptionalBooleanValueByHashCode(1722627584);
    }

    @Override // X.InterfaceC38831rF
    public final Boolean Cbg() {
        return this.A0P.getOptionalBooleanValueByHashCode(-966722636);
    }

    @Override // X.InterfaceC38831rF
    public final Boolean Cbz() {
        return this.A0P.getOptionalBooleanValueByHashCode(-1270569262);
    }

    @Override // X.InterfaceC38831rF
    public final Boolean Cc6() {
        return this.A0P.getOptionalBooleanValueByHashCode(-1847416696);
    }

    @Override // X.InterfaceC38831rF
    public final Boolean CcB() {
        return this.A0P.getOptionalBooleanValueByHashCode(1577113931);
    }

    @Override // X.InterfaceC38831rF
    public final Boolean Ccb() {
        return this.A0P.getOptionalBooleanValueByHashCode(2082219120);
    }

    @Override // X.InterfaceC38831rF
    public final Boolean Ccp() {
        return this.A0P.getOptionalBooleanValueByHashCode(138640398);
    }

    @Override // X.InterfaceC38831rF
    public final Boolean Cd6() {
        return this.A0P.getOptionalBooleanValueByHashCode(-56363563);
    }

    @Override // X.InterfaceC38831rF
    public final Boolean CdB() {
        return this.A0P.getOptionalBooleanValueByHashCode(1748769892);
    }

    @Override // X.InterfaceC38831rF
    public final Boolean CdR() {
        return this.A0P.getOptionalBooleanValueByHashCode(389843936);
    }

    @Override // X.InterfaceC38831rF
    public final Boolean CdU() {
        return this.A0P.getOptionalBooleanValueByHashCode(863677169);
    }

    @Override // X.InterfaceC38831rF
    public final Boolean Cdy() {
        return this.A0P.getOptionalBooleanValueByHashCode(1379091071);
    }

    @Override // X.InterfaceC38831rF
    public final Boolean CeB() {
        return this.A0P.getOptionalBooleanValueByHashCode(-1927920604);
    }

    @Override // X.InterfaceC38831rF
    public final Boolean CeL() {
        return this.A0P.getOptionalBooleanValueByHashCode(1226227249);
    }

    @Override // X.InterfaceC38831rF
    public final Boolean Cf5() {
        return this.A0P.getOptionalBooleanValueByHashCode(-1848057898);
    }

    @Override // X.InterfaceC38831rF
    public final Boolean Cg4() {
        return this.A0P.getOptionalBooleanValueByHashCode(-605644948);
    }

    @Override // X.InterfaceC38831rF
    public final void E6n() {
        if (this.A28) {
            this.A28 = false;
            Map map = this.A29;
            this.A0P = (ImmutablePandoMediaDict) new TreeUpdaterJNI(map, this.A0P).applyToTree(this.A0P);
            map.clear();
        }
    }

    @Override // X.InterfaceC38831rF
    public final void EPg(List list) {
        if (this.A28) {
            Map map = this.A29;
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                AndroidLink androidLink = (AndroidLink) it.next();
                if (androidLink != null) {
                    arrayList.add(androidLink.F7o());
                }
            }
            map.put("android_links", arrayList);
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            AndroidLink androidLink2 = (AndroidLink) it2.next();
            if (androidLink2 != null) {
                arrayList2.add(androidLink2.F7o());
            }
        }
        this.A0P = (ImmutablePandoMediaDict) new TreeUpdaterJNI(AbstractC16850sd.A0M(new C09530e4("android_links", arrayList2)), this.A0P).applyToTree(this.A0P);
    }

    @Override // X.InterfaceC38831rF
    public final void EPr(Boolean bool) {
        if (this.A28) {
            this.A29.put("is_artist_pick", bool);
        } else {
            TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
            this.A0P = (ImmutablePandoMediaDict) new TreeUpdaterJNI(AbstractC16850sd.A0M(new C09530e4("is_artist_pick", bool)), this.A0P).applyToTree(this.A0P);
        }
    }

    @Override // X.InterfaceC38831rF
    public final void EQ9(Boolean bool) {
        if (this.A28) {
            this.A29.put("is_ayf_media", bool);
        } else {
            TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
            this.A0P = (ImmutablePandoMediaDict) new TreeUpdaterJNI(AbstractC16850sd.A0M(new C09530e4("is_ayf_media", bool)), this.A0P).applyToTree(this.A0P);
        }
    }

    @Override // X.InterfaceC38831rF
    public final void EQN(List list) {
        if (this.A28) {
            Map map = this.A29;
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                InterfaceC37271GbO interfaceC37271GbO = (InterfaceC37271GbO) it.next();
                if (interfaceC37271GbO != null) {
                    arrayList.add(interfaceC37271GbO.F7o());
                }
            }
            map.put("blend_recommender_infos", arrayList);
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            InterfaceC37271GbO interfaceC37271GbO2 = (InterfaceC37271GbO) it2.next();
            if (interfaceC37271GbO2 != null) {
                arrayList2.add(interfaceC37271GbO2.F7o());
            }
        }
        this.A0P = (ImmutablePandoMediaDict) new TreeUpdaterJNI(AbstractC16850sd.A0M(new C09530e4("blend_recommender_infos", arrayList2)), this.A0P).applyToTree(this.A0P);
        this.A0h = list;
    }

    @Override // X.InterfaceC38831rF
    public final void EQO(Boolean bool) {
        if (this.A28) {
            this.A29.put("blur_secret_story", bool);
        } else {
            TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
            this.A0P = (ImmutablePandoMediaDict) new TreeUpdaterJNI(AbstractC16850sd.A0M(new C09530e4("blur_secret_story", bool)), this.A0P).applyToTree(this.A0P);
        }
    }

    @Override // X.InterfaceC38831rF
    public final void EQU(List list) {
        boolean z = this.A28;
        String A00 = AbstractC111324zv.A00(766);
        ArrayList arrayList = null;
        if (z) {
            Map map = this.A29;
            if (list != null) {
                arrayList = new ArrayList();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    InterfaceC43551JLl interfaceC43551JLl = (InterfaceC43551JLl) it.next();
                    if (interfaceC43551JLl != null) {
                        arrayList.add(interfaceC43551JLl.F7o());
                    }
                }
            }
            map.put(A00, arrayList);
            return;
        }
        if (list != null) {
            arrayList = new ArrayList();
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                InterfaceC43551JLl interfaceC43551JLl2 = (InterfaceC43551JLl) it2.next();
                if (interfaceC43551JLl2 != null) {
                    arrayList.add(interfaceC43551JLl2.F7o());
                }
            }
        }
        this.A0P = (ImmutablePandoMediaDict) new TreeUpdaterJNI(AbstractC16850sd.A0M(new C09530e4(A00, arrayList)), this.A0P).applyToTree(this.A0P);
        this.A0i = list;
    }

    @Override // X.InterfaceC38831rF
    public final void EQZ(BrandSafetyContentBlocklistBitmapQLObj brandSafetyContentBlocklistBitmapQLObj) {
        boolean z = this.A28;
        String A00 = AbstractC111324zv.A00(770);
        if (z) {
            this.A29.put(A00, brandSafetyContentBlocklistBitmapQLObj.F7o());
        } else {
            TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
            this.A0P = (ImmutablePandoMediaDict) new TreeUpdaterJNI(AbstractC16850sd.A0M(new C09530e4(A00, brandSafetyContentBlocklistBitmapQLObj.F7o())), this.A0P).applyToTree(this.A0P);
        }
    }

    @Override // X.InterfaceC38831rF
    public final void EQa(Long l) {
        if (this.A28) {
            this.A29.put("brs_severity", l);
        } else {
            TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
            this.A0P = (ImmutablePandoMediaDict) new TreeUpdaterJNI(AbstractC16850sd.A0M(new C09530e4("brs_severity", l)), this.A0P).applyToTree(this.A0P);
        }
    }

    @Override // X.InterfaceC38831rF
    public final void EQb(Long l) {
        if (this.A28) {
            this.A29.put("brs_threshold", l);
        } else {
            TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
            this.A0P = (ImmutablePandoMediaDict) new TreeUpdaterJNI(AbstractC16850sd.A0M(new C09530e4("brs_threshold", l)), this.A0P).applyToTree(this.A0P);
        }
    }

    @Override // X.InterfaceC38831rF
    public final void ER7(Boolean bool) {
        if (this.A28) {
            this.A29.put("can_hype", bool);
        } else {
            TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
            this.A0P = (ImmutablePandoMediaDict) new TreeUpdaterJNI(AbstractC16850sd.A0M(new C09530e4("can_hype", bool)), this.A0P).applyToTree(this.A0P);
        }
    }

    @Override // X.InterfaceC38831rF
    public final void ERC(AnonymousClass520 anonymousClass520) {
        TreeUpdaterJNI treeUpdaterJNI = null;
        if (this.A28) {
            Map map = this.A29;
            if (anonymousClass520 != null) {
                treeUpdaterJNI = anonymousClass520.F7o();
            }
            map.put("caption_add_on", treeUpdaterJNI);
            return;
        }
        TreeUpdaterJNI treeUpdaterJNI2 = TreeUpdaterJNI.$redex_init_class;
        if (anonymousClass520 != null) {
            treeUpdaterJNI = anonymousClass520.F7o();
        }
        this.A0P = (ImmutablePandoMediaDict) new TreeUpdaterJNI(AbstractC16850sd.A0M(new C09530e4("caption_add_on", treeUpdaterJNI)), this.A0P).applyToTree(this.A0P);
        this.A00 = anonymousClass520;
    }

    @Override // X.InterfaceC38831rF
    public final void ERF(List list) {
        ArrayList arrayList = null;
        if (this.A28) {
            Map map = this.A29;
            if (list != null) {
                arrayList = new ArrayList(AbstractC06950Ym.A1E(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((C38321qM) it.next()).A1D());
                }
            }
            map.put("carousel_media", arrayList);
            return;
        }
        if (list != null) {
            arrayList = new ArrayList(AbstractC06950Ym.A1E(list, 10));
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList.add(((C38321qM) it2.next()).A1D());
            }
        }
        this.A0P = (ImmutablePandoMediaDict) new TreeUpdaterJNI(AbstractC16850sd.A0M(new C09530e4("carousel_media", arrayList)), this.A0P).applyToTree(this.A0P);
        this.A0j = list;
    }

    @Override // X.InterfaceC38831rF
    public final void ERY(InterfaceC84443pn interfaceC84443pn) {
        TreeUpdaterJNI treeUpdaterJNI = null;
        if (this.A28) {
            Map map = this.A29;
            if (interfaceC84443pn != null) {
                treeUpdaterJNI = interfaceC84443pn.F7o();
            }
            map.put("clips_demotion_control", treeUpdaterJNI);
            return;
        }
        TreeUpdaterJNI treeUpdaterJNI2 = TreeUpdaterJNI.$redex_init_class;
        if (interfaceC84443pn != null) {
            treeUpdaterJNI = interfaceC84443pn.F7o();
        }
        this.A0P = (ImmutablePandoMediaDict) new TreeUpdaterJNI(AbstractC16850sd.A0M(new C09530e4("clips_demotion_control", treeUpdaterJNI)), this.A0P).applyToTree(this.A0P);
    }

    @Override // X.InterfaceC38831rF
    public final void ERZ(C3x9 c3x9) {
        if (this.A28) {
            this.A29.put("clips_metadata", c3x9.F7o());
            return;
        }
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        this.A0P = (ImmutablePandoMediaDict) new TreeUpdaterJNI(AbstractC16850sd.A0M(new C09530e4("clips_metadata", c3x9.F7o())), this.A0P).applyToTree(this.A0P);
        this.A0I = c3x9;
    }

    @Override // X.InterfaceC38831rF
    public final void ERa(List list) {
        if (this.A28) {
            this.A29.put("clips_tab_pinned_user_ids", list);
        } else {
            TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
            this.A0P = (ImmutablePandoMediaDict) new TreeUpdaterJNI(AbstractC16850sd.A0M(new C09530e4("clips_tab_pinned_user_ids", list)), this.A0P).applyToTree(this.A0P);
        }
    }

    @Override // X.InterfaceC38831rF
    public final void ERb(ClipsTrialDict clipsTrialDict) {
        if (this.A28) {
            this.A29.put("clips_trial", clipsTrialDict.F7o());
        } else {
            TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
            this.A0P = (ImmutablePandoMediaDict) new TreeUpdaterJNI(AbstractC16850sd.A0M(new C09530e4("clips_trial", clipsTrialDict.F7o())), this.A0P).applyToTree(this.A0P);
        }
    }

    @Override // X.InterfaceC38831rF
    public final void ERm(Integer num) {
        if (this.A28) {
            this.A29.put("comment_count", num);
        } else {
            TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
            this.A0P = (ImmutablePandoMediaDict) new TreeUpdaterJNI(AbstractC16850sd.A0M(new C09530e4("comment_count", num)), this.A0P).applyToTree(this.A0P);
        }
    }

    @Override // X.InterfaceC38831rF
    public final void ERp(Boolean bool) {
        if (this.A28) {
            this.A29.put("comments_disabled", bool);
        } else {
            TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
            this.A0P = (ImmutablePandoMediaDict) new TreeUpdaterJNI(AbstractC16850sd.A0M(new C09530e4("comments_disabled", bool)), this.A0P).applyToTree(this.A0P);
        }
    }

    @Override // X.InterfaceC38831rF
    public final void ES4(JKD jkd) {
        TreeUpdaterJNI treeUpdaterJNI = null;
        if (this.A28) {
            Map map = this.A29;
            if (jkd != null) {
                treeUpdaterJNI = jkd.F7o();
            }
            map.put("content_scheduling_metadata", treeUpdaterJNI);
            return;
        }
        TreeUpdaterJNI treeUpdaterJNI2 = TreeUpdaterJNI.$redex_init_class;
        if (jkd != null) {
            treeUpdaterJNI = jkd.F7o();
        }
        this.A0P = (ImmutablePandoMediaDict) new TreeUpdaterJNI(AbstractC16850sd.A0M(new C09530e4("content_scheduling_metadata", treeUpdaterJNI)), this.A0P).applyToTree(this.A0P);
    }

    @Override // X.InterfaceC38831rF
    public final void ESQ(CreativeConfigIntf creativeConfigIntf) {
        TreeUpdaterJNI treeUpdaterJNI = null;
        if (this.A28) {
            Map map = this.A29;
            if (creativeConfigIntf != null) {
                treeUpdaterJNI = creativeConfigIntf.F7o();
            }
            map.put("creative_config", treeUpdaterJNI);
            return;
        }
        TreeUpdaterJNI treeUpdaterJNI2 = TreeUpdaterJNI.$redex_init_class;
        if (creativeConfigIntf != null) {
            treeUpdaterJNI = creativeConfigIntf.F7o();
        }
        this.A0P = (ImmutablePandoMediaDict) new TreeUpdaterJNI(AbstractC16850sd.A0M(new C09530e4("creative_config", treeUpdaterJNI)), this.A0P).applyToTree(this.A0P);
        this.A0L = creativeConfigIntf;
    }

    @Override // X.InterfaceC38831rF
    public final void ESW(List list) {
        if (this.A28) {
            this.A29.put("crosspost", list);
        } else {
            TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
            this.A0P = (ImmutablePandoMediaDict) new TreeUpdaterJNI(AbstractC16850sd.A0M(new C09530e4("crosspost", list)), this.A0P).applyToTree(this.A0P);
        }
    }

    @Override // X.InterfaceC38831rF
    public final void ESq(List list) {
        ArrayList arrayList = null;
        if (this.A28) {
            Map map = this.A29;
            if (list != null) {
                arrayList = new ArrayList();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    InterfaceC1118152j interfaceC1118152j = (InterfaceC1118152j) it.next();
                    if (interfaceC1118152j != null) {
                        arrayList.add(interfaceC1118152j.F7o());
                    }
                }
            }
            map.put("cutout_stickers", arrayList);
            return;
        }
        if (list != null) {
            arrayList = new ArrayList();
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                InterfaceC1118152j interfaceC1118152j2 = (InterfaceC1118152j) it2.next();
                if (interfaceC1118152j2 != null) {
                    arrayList.add(interfaceC1118152j2.F7o());
                }
            }
        }
        this.A0P = (ImmutablePandoMediaDict) new TreeUpdaterJNI(AbstractC16850sd.A0M(new C09530e4("cutout_stickers", arrayList)), this.A0P).applyToTree(this.A0P);
    }

    @Override // X.InterfaceC38831rF
    public final void ETC(Integer num) {
        if (this.A28) {
            this.A29.put("deleted_reason", num);
        } else {
            TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
            this.A0P = (ImmutablePandoMediaDict) new TreeUpdaterJNI(AbstractC16850sd.A0M(new C09530e4("deleted_reason", num)), this.A0P).applyToTree(this.A0P);
        }
    }

    @Override // X.InterfaceC38831rF
    public final void ETH(Boolean bool) {
        if (this.A28) {
            this.A29.put("is_direct_media", bool);
        } else {
            TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
            this.A0P = (ImmutablePandoMediaDict) new TreeUpdaterJNI(AbstractC16850sd.A0M(new C09530e4("is_direct_media", bool)), this.A0P).applyToTree(this.A0P);
        }
    }

    @Override // X.InterfaceC38831rF
    public final void ETO(String str) {
        if (this.A28) {
            this.A29.put("dominant_color", str);
        } else {
            TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
            this.A0P = (ImmutablePandoMediaDict) new TreeUpdaterJNI(AbstractC16850sd.A0M(new C09530e4("dominant_color", str)), this.A0P).applyToTree(this.A0P);
        }
    }

    @Override // X.InterfaceC38831rF
    public final void ETu(Boolean bool) {
        if (this.A28) {
            this.A29.put("is_eof", bool);
        } else {
            TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
            this.A0P = (ImmutablePandoMediaDict) new TreeUpdaterJNI(AbstractC16850sd.A0M(new C09530e4("is_eof", bool)), this.A0P).applyToTree(this.A0P);
        }
    }

    @Override // X.InterfaceC38831rF
    public final void ETz(InterfaceC84443pn interfaceC84443pn) {
        if (this.A28) {
            this.A29.put("explore_demotion_control", interfaceC84443pn.F7o());
        } else {
            TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
            this.A0P = (ImmutablePandoMediaDict) new TreeUpdaterJNI(AbstractC16850sd.A0M(new C09530e4("explore_demotion_control", interfaceC84443pn.F7o())), this.A0P).applyToTree(this.A0P);
        }
    }

    @Override // X.InterfaceC38831rF
    public final void EUJ(String str) {
        if (this.A28) {
            this.A29.put("fb_page_url", str);
        } else {
            TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
            this.A0P = (ImmutablePandoMediaDict) new TreeUpdaterJNI(AbstractC16850sd.A0M(new C09530e4("fb_page_url", str)), this.A0P).applyToTree(this.A0P);
        }
    }

    @Override // X.InterfaceC38831rF
    public final void EUL(Integer num) {
        if (this.A28) {
            this.A29.put("fb_viewer_count", num);
        } else {
            TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
            this.A0P = (ImmutablePandoMediaDict) new TreeUpdaterJNI(AbstractC16850sd.A0M(new C09530e4("fb_viewer_count", num)), this.A0P).applyToTree(this.A0P);
        }
    }

    @Override // X.InterfaceC38831rF
    public final void EUM(InterfaceC84443pn interfaceC84443pn) {
        if (this.A28) {
            this.A29.put("feed_demotion_control", interfaceC84443pn.F7o());
        } else {
            TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
            this.A0P = (ImmutablePandoMediaDict) new TreeUpdaterJNI(AbstractC16850sd.A0M(new C09530e4("feed_demotion_control", interfaceC84443pn.F7o())), this.A0P).applyToTree(this.A0P);
        }
    }

    @Override // X.InterfaceC38831rF
    public final void EUN(InterfaceC104934o6 interfaceC104934o6) {
        TreeUpdaterJNI treeUpdaterJNI = null;
        if (this.A28) {
            Map map = this.A29;
            if (interfaceC104934o6 != null) {
                treeUpdaterJNI = interfaceC104934o6.F7o();
            }
            map.put("feed_on_impression_control", treeUpdaterJNI);
            return;
        }
        TreeUpdaterJNI treeUpdaterJNI2 = TreeUpdaterJNI.$redex_init_class;
        if (interfaceC104934o6 != null) {
            treeUpdaterJNI = interfaceC104934o6.F7o();
        }
        this.A0P = (ImmutablePandoMediaDict) new TreeUpdaterJNI(AbstractC16850sd.A0M(new C09530e4("feed_on_impression_control", treeUpdaterJNI)), this.A0P).applyToTree(this.A0P);
    }

    @Override // X.InterfaceC38831rF
    public final void EUP(InterfaceC84443pn interfaceC84443pn) {
        if (this.A28) {
            this.A29.put("feed_recs_demotion_control", interfaceC84443pn.F7o());
        } else {
            TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
            this.A0P = (ImmutablePandoMediaDict) new TreeUpdaterJNI(AbstractC16850sd.A0M(new C09530e4("feed_recs_demotion_control", interfaceC84443pn.F7o())), this.A0P).applyToTree(this.A0P);
        }
    }

    @Override // X.InterfaceC38831rF
    public final void EUQ(String str) {
        if (this.A28) {
            this.A29.put("feed_survey_integration_id", str);
        } else {
            TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
            this.A0P = (ImmutablePandoMediaDict) new TreeUpdaterJNI(AbstractC16850sd.A0M(new C09530e4("feed_survey_integration_id", str)), this.A0P).applyToTree(this.A0P);
        }
    }

    @Override // X.InterfaceC38831rF
    public final void EUh(Hashtag hashtag) {
        TreeUpdaterJNI treeUpdaterJNI = null;
        if (this.A28) {
            Map map = this.A29;
            if (hashtag != null) {
                treeUpdaterJNI = hashtag.F7o();
            }
            map.put("follow_hashtag_info", treeUpdaterJNI);
            return;
        }
        TreeUpdaterJNI treeUpdaterJNI2 = TreeUpdaterJNI.$redex_init_class;
        if (hashtag != null) {
            treeUpdaterJNI = hashtag.F7o();
        }
        this.A0P = (ImmutablePandoMediaDict) new TreeUpdaterJNI(AbstractC16850sd.A0M(new C09530e4("follow_hashtag_info", treeUpdaterJNI)), this.A0P).applyToTree(this.A0P);
    }

    @Override // X.InterfaceC38831rF
    public final void EUt(InterfaceC39031rc interfaceC39031rc) {
        if (this.A28) {
            this.A29.put("fundraiser_tag", null);
        } else {
            TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
            this.A0P = (ImmutablePandoMediaDict) new TreeUpdaterJNI(AbstractC16850sd.A0M(new C09530e4("fundraiser_tag", null)), this.A0P).applyToTree(this.A0P);
        }
    }

    @Override // X.InterfaceC38831rF
    public final void EVQ(Boolean bool) {
        boolean z = this.A28;
        String A00 = AbstractC111324zv.A00(970);
        if (z) {
            this.A29.put(A00, bool);
        } else {
            TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
            this.A0P = (ImmutablePandoMediaDict) new TreeUpdaterJNI(AbstractC16850sd.A0M(new C09530e4(A00, bool)), this.A0P).applyToTree(this.A0P);
        }
    }

    @Override // X.InterfaceC38831rF
    public final void EVT(Boolean bool) {
        if (this.A28) {
            this.A29.put("has_liked", bool);
        } else {
            TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
            this.A0P = (ImmutablePandoMediaDict) new TreeUpdaterJNI(AbstractC16850sd.A0M(new C09530e4("has_liked", bool)), this.A0P).applyToTree(this.A0P);
        }
    }

    @Override // X.InterfaceC38831rF
    public final void EVW(Boolean bool) {
        if (this.A28) {
            this.A29.put("has_new_likes", bool);
        } else {
            TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
            this.A0P = (ImmutablePandoMediaDict) new TreeUpdaterJNI(AbstractC16850sd.A0M(new C09530e4("has_new_likes", bool)), this.A0P).applyToTree(this.A0P);
        }
    }

    @Override // X.InterfaceC38831rF
    public final void EVf(Integer num) {
        if (this.A28) {
            this.A29.put("has_shared_to_fb", num);
        } else {
            TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
            this.A0P = (ImmutablePandoMediaDict) new TreeUpdaterJNI(AbstractC16850sd.A0M(new C09530e4("has_shared_to_fb", num)), this.A0P).applyToTree(this.A0P);
        }
    }

    @Override // X.InterfaceC38831rF
    public final void EVg(Boolean bool) {
        if (this.A28) {
            this.A29.put("has_viewer_saved", bool);
        } else {
            TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
            this.A0P = (ImmutablePandoMediaDict) new TreeUpdaterJNI(AbstractC16850sd.A0M(new C09530e4("has_viewer_saved", bool)), this.A0P).applyToTree(this.A0P);
        }
    }

    @Override // X.InterfaceC38831rF
    public final void EVr(List list) {
        if (this.A28) {
            Map map = this.A29;
            ArrayList arrayList = new ArrayList(AbstractC06950Ym.A1E(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((C38321qM) it.next()).A1D());
            }
            map.put("hscroll_items", arrayList);
            return;
        }
        ArrayList arrayList2 = new ArrayList(AbstractC06950Ym.A1E(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((C38321qM) it2.next()).A1D());
        }
        this.A0P = (ImmutablePandoMediaDict) new TreeUpdaterJNI(AbstractC16850sd.A0M(new C09530e4("hscroll_items", arrayList2)), this.A0P).applyToTree(this.A0P);
        this.A0w = list;
    }

    @Override // X.InterfaceC38831rF
    public final void EVu(String str) {
        if (this.A28) {
            this.A29.put(PublicKeyCredentialControllerUtility.JSON_KEY_ID, str);
        } else {
            TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
            this.A0P = (ImmutablePandoMediaDict) new TreeUpdaterJNI(AbstractC16850sd.A0M(new C09530e4(PublicKeyCredentialControllerUtility.JSON_KEY_ID, str)), this.A0P).applyToTree(this.A0P);
        }
    }

    @Override // X.InterfaceC38831rF
    public final void EVw(InterfaceC84473pq interfaceC84473pq) {
        if (this.A28) {
            this.A29.put("igbio_product", null);
        } else {
            TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
            this.A0P = (ImmutablePandoMediaDict) new TreeUpdaterJNI(AbstractC16850sd.A0M(new C09530e4("igbio_product", null)), this.A0P).applyToTree(this.A0P);
        }
    }

    @Override // X.InterfaceC38831rF
    public final void EVz(JLR jlr) {
        if (this.A28) {
            this.A29.put("igtv_ads_info", jlr.F7o());
        } else {
            TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
            this.A0P = (ImmutablePandoMediaDict) new TreeUpdaterJNI(AbstractC16850sd.A0M(new C09530e4("igtv_ads_info", jlr.F7o())), this.A0P).applyToTree(this.A0P);
        }
    }

    @Override // X.InterfaceC38831rF
    public final void EW0(JLS jls) {
        if (this.A28) {
            this.A29.put("igtv_series_info", null);
        } else {
            TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
            this.A0P = (ImmutablePandoMediaDict) new TreeUpdaterJNI(AbstractC16850sd.A0M(new C09530e4("igtv_series_info", null)), this.A0P).applyToTree(this.A0P);
        }
    }

    @Override // X.InterfaceC38831rF
    public final void EW3(ImageInfo imageInfo) {
        TreeUpdaterJNI treeUpdaterJNI = null;
        if (this.A28) {
            Map map = this.A29;
            if (imageInfo != null) {
                treeUpdaterJNI = imageInfo.F7o();
            }
            map.put("image_versions2", treeUpdaterJNI);
            return;
        }
        TreeUpdaterJNI treeUpdaterJNI2 = TreeUpdaterJNI.$redex_init_class;
        if (imageInfo != null) {
            treeUpdaterJNI = imageInfo.F7o();
        }
        this.A0P = (ImmutablePandoMediaDict) new TreeUpdaterJNI(AbstractC16850sd.A0M(new C09530e4("image_versions2", treeUpdaterJNI)), this.A0P).applyToTree(this.A0P);
    }

    @Override // X.InterfaceC38831rF
    public final void EW9(InterfaceC39541sb interfaceC39541sb) {
        TreeUpdaterJNI treeUpdaterJNI = null;
        if (this.A28) {
            Map map = this.A29;
            if (interfaceC39541sb != null) {
                treeUpdaterJNI = interfaceC39541sb.F7o();
            }
            map.put("injected", treeUpdaterJNI);
            return;
        }
        TreeUpdaterJNI treeUpdaterJNI2 = TreeUpdaterJNI.$redex_init_class;
        if (interfaceC39541sb != null) {
            treeUpdaterJNI = interfaceC39541sb.F7o();
        }
        this.A0P = (ImmutablePandoMediaDict) new TreeUpdaterJNI(AbstractC16850sd.A0M(new C09530e4("injected", treeUpdaterJNI)), this.A0P).applyToTree(this.A0P);
        this.A0R = interfaceC39541sb;
    }

    @Override // X.InterfaceC38831rF
    public final void EWK(String str) {
        if (this.A28) {
            this.A29.put("inventory_source", str);
        } else {
            TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
            this.A0P = (ImmutablePandoMediaDict) new TreeUpdaterJNI(AbstractC16850sd.A0M(new C09530e4("inventory_source", str)), this.A0P).applyToTree(this.A0P);
        }
    }

    @Override // X.InterfaceC38831rF
    public final void EWL(List list) {
        if (this.A28) {
            Map map = this.A29;
            ArrayList arrayList = new ArrayList(AbstractC06950Ym.A1E(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((User) it.next()).A07());
            }
            map.put("invited_coauthor_producers", arrayList);
            return;
        }
        ArrayList arrayList2 = new ArrayList(AbstractC06950Ym.A1E(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((User) it2.next()).A07());
        }
        this.A0P = (ImmutablePandoMediaDict) new TreeUpdaterJNI(AbstractC16850sd.A0M(new C09530e4("invited_coauthor_producers", arrayList2)), this.A0P).applyToTree(this.A0P);
        this.A0x = list;
    }

    @Override // X.InterfaceC38831rF
    public final void EWz(Long l) {
        if (this.A28) {
            this.A29.put("last_synced_timestamp_ms", l);
        } else {
            TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
            this.A0P = (ImmutablePandoMediaDict) new TreeUpdaterJNI(AbstractC16850sd.A0M(new C09530e4("last_synced_timestamp_ms", l)), this.A0P).applyToTree(this.A0P);
        }
    }

    @Override // X.InterfaceC38831rF
    public final void EX1(Float f) {
        if (this.A28) {
            this.A29.put("lat", AnonymousClass010.A0m(String.valueOf(f)));
        } else {
            TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
            this.A0P = (ImmutablePandoMediaDict) new TreeUpdaterJNI(AbstractC16850sd.A0M(new C09530e4("lat", AnonymousClass010.A0m(String.valueOf(f)))), this.A0P).applyToTree(this.A0P);
        }
    }

    @Override // X.InterfaceC38831rF
    public final void EY6(Boolean bool) {
        if (this.A28) {
            this.A29.put("is_lightweight_media", bool);
        } else {
            TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
            this.A0P = (ImmutablePandoMediaDict) new TreeUpdaterJNI(AbstractC16850sd.A0M(new C09530e4("is_lightweight_media", bool)), this.A0P).applyToTree(this.A0P);
        }
    }

    @Override // X.InterfaceC38831rF
    public final void EY7(Boolean bool) {
        if (this.A28) {
            this.A29.put("like_and_view_counts_disabled", bool);
        } else {
            TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
            this.A0P = (ImmutablePandoMediaDict) new TreeUpdaterJNI(AbstractC16850sd.A0M(new C09530e4("like_and_view_counts_disabled", bool)), this.A0P).applyToTree(this.A0P);
        }
    }

    @Override // X.InterfaceC38831rF
    public final void EY8(Integer num) {
        if (this.A28) {
            this.A29.put("like_count", num);
        } else {
            TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
            this.A0P = (ImmutablePandoMediaDict) new TreeUpdaterJNI(AbstractC16850sd.A0M(new C09530e4("like_count", num)), this.A0P).applyToTree(this.A0P);
        }
    }

    @Override // X.InterfaceC38831rF
    public final void EYC(String str) {
        if (this.A28) {
            this.A29.put("link_text", str);
        } else {
            TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
            this.A0P = (ImmutablePandoMediaDict) new TreeUpdaterJNI(AbstractC16850sd.A0M(new C09530e4("link_text", str)), this.A0P).applyToTree(this.A0P);
        }
    }

    @Override // X.InterfaceC38831rF
    public final void EYS(Float f) {
        if (this.A28) {
            this.A29.put("lng", AnonymousClass010.A0m(String.valueOf(f)));
        } else {
            TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
            this.A0P = (ImmutablePandoMediaDict) new TreeUpdaterJNI(AbstractC16850sd.A0M(new C09530e4("lng", AnonymousClass010.A0m(String.valueOf(f)))), this.A0P).applyToTree(this.A0P);
        }
    }

    @Override // X.InterfaceC38831rF
    public final void EYW(LocationDictIntf locationDictIntf) {
        if (this.A28) {
            this.A29.put("location", null);
        } else {
            TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
            this.A0P = (ImmutablePandoMediaDict) new TreeUpdaterJNI(AbstractC16850sd.A0M(new C09530e4("location", null)), this.A0P).applyToTree(this.A0P);
        }
    }

    @Override // X.InterfaceC38831rF
    public final void EYe(InterfaceC84163p3 interfaceC84163p3) {
        TreeUpdaterJNI treeUpdaterJNI = null;
        if (this.A28) {
            Map map = this.A29;
            if (interfaceC84163p3 != null) {
                treeUpdaterJNI = interfaceC84163p3.F7o();
            }
            map.put("mashup_info", treeUpdaterJNI);
            return;
        }
        TreeUpdaterJNI treeUpdaterJNI2 = TreeUpdaterJNI.$redex_init_class;
        if (interfaceC84163p3 != null) {
            treeUpdaterJNI = interfaceC84163p3.F7o();
        }
        this.A0P = (ImmutablePandoMediaDict) new TreeUpdaterJNI(AbstractC16850sd.A0M(new C09530e4("mashup_info", treeUpdaterJNI)), this.A0P).applyToTree(this.A0P);
        this.A0H = interfaceC84163p3;
    }

    @Override // X.InterfaceC38831rF
    public final void EYk(JKO jko) {
        if (this.A28) {
            this.A29.put("media_appreciation_settings", jko.F7o());
        } else {
            TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
            this.A0P = (ImmutablePandoMediaDict) new TreeUpdaterJNI(AbstractC16850sd.A0M(new C09530e4("media_appreciation_settings", jko.F7o())), this.A0P).applyToTree(this.A0P);
        }
    }

    @Override // X.InterfaceC38831rF
    public final void EYo(InterfaceC88303wh interfaceC88303wh) {
        if (this.A28) {
            this.A29.put("media_cropping_info", interfaceC88303wh.F7o());
        } else {
            TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
            this.A0P = (ImmutablePandoMediaDict) new TreeUpdaterJNI(AbstractC16850sd.A0M(new C09530e4("media_cropping_info", interfaceC88303wh.F7o())), this.A0P).applyToTree(this.A0P);
        }
    }

    @Override // X.InterfaceC38831rF
    public final void EYt(MediaCommentAudienceControlType mediaCommentAudienceControlType) {
        boolean z = this.A28;
        String A00 = AbstractC111324zv.A00(1097);
        if (z) {
            this.A29.put(A00, mediaCommentAudienceControlType.A00);
        } else {
            this.A0P = (ImmutablePandoMediaDict) new TreeUpdaterJNI(AbstractC16850sd.A0M(new C09530e4(A00, mediaCommentAudienceControlType.A00)), this.A0P).applyToTree(this.A0P);
        }
    }

    @Override // X.InterfaceC38831rF
    public final void EYv(InterfaceC84363pT interfaceC84363pT) {
        TreeUpdaterJNI treeUpdaterJNI = null;
        if (this.A28) {
            Map map = this.A29;
            if (interfaceC84363pT != null) {
                treeUpdaterJNI = interfaceC84363pT.F7o();
            }
            map.put("media_notes", treeUpdaterJNI);
            return;
        }
        TreeUpdaterJNI treeUpdaterJNI2 = TreeUpdaterJNI.$redex_init_class;
        if (interfaceC84363pT != null) {
            treeUpdaterJNI = interfaceC84363pT.F7o();
        }
        this.A0P = (ImmutablePandoMediaDict) new TreeUpdaterJNI(AbstractC16850sd.A0M(new C09530e4("media_notes", treeUpdaterJNI)), this.A0P).applyToTree(this.A0P);
        this.A06 = interfaceC84363pT;
    }

    @Override // X.InterfaceC38831rF
    public final void EYw(JM6 jm6) {
        if (this.A28) {
            this.A29.put("media_notice", null);
        } else {
            TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
            this.A0P = (ImmutablePandoMediaDict) new TreeUpdaterJNI(AbstractC16850sd.A0M(new C09530e4("media_notice", null)), this.A0P).applyToTree(this.A0P);
        }
    }

    @Override // X.InterfaceC38831rF
    public final void EYy(InterfaceC109094vY interfaceC109094vY) {
        TreeUpdaterJNI treeUpdaterJNI = null;
        if (this.A28) {
            Map map = this.A29;
            if (interfaceC109094vY != null) {
                treeUpdaterJNI = interfaceC109094vY.F7o();
            }
            map.put("media_overlay_info", treeUpdaterJNI);
            return;
        }
        TreeUpdaterJNI treeUpdaterJNI2 = TreeUpdaterJNI.$redex_init_class;
        if (interfaceC109094vY != null) {
            treeUpdaterJNI = interfaceC109094vY.F7o();
        }
        this.A0P = (ImmutablePandoMediaDict) new TreeUpdaterJNI(AbstractC16850sd.A0M(new C09530e4("media_overlay_info", treeUpdaterJNI)), this.A0P).applyToTree(this.A0P);
    }

    @Override // X.InterfaceC38831rF
    public final void EZ0(Integer num) {
        if (this.A28) {
            this.A29.put("media_type", num);
        } else {
            TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
            this.A0P = (ImmutablePandoMediaDict) new TreeUpdaterJNI(AbstractC16850sd.A0M(new C09530e4("media_type", num)), this.A0P).applyToTree(this.A0P);
        }
    }

    @Override // X.InterfaceC38831rF
    public final void EZE(String str) {
        if (this.A28) {
            this.A29.put("mezql_token", str);
        } else {
            TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
            this.A0P = (ImmutablePandoMediaDict) new TreeUpdaterJNI(AbstractC16850sd.A0M(new C09530e4("mezql_token", str)), this.A0P).applyToTree(this.A0P);
        }
    }

    @Override // X.InterfaceC38831rF
    public final void EZH(Boolean bool) {
        boolean z = this.A28;
        String A00 = AbstractC111324zv.A00(1115);
        if (z) {
            this.A29.put(A00, bool);
        } else {
            TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
            this.A0P = (ImmutablePandoMediaDict) new TreeUpdaterJNI(AbstractC16850sd.A0M(new C09530e4(A00, bool)), this.A0P).applyToTree(this.A0P);
        }
    }

    @Override // X.InterfaceC38831rF
    public final void EZI(JMJ jmj) {
        if (this.A28) {
            this.A29.put("multi_ads_info", jmj.F7o());
        } else {
            TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
            this.A0P = (ImmutablePandoMediaDict) new TreeUpdaterJNI(AbstractC16850sd.A0M(new C09530e4("multi_ads_info", jmj.F7o())), this.A0P).applyToTree(this.A0P);
        }
    }

    @Override // X.InterfaceC38831rF
    public final void EZJ(List list) {
        if (this.A28) {
            this.A29.put("multi_author_reel_names", list);
        } else {
            TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
            this.A0P = (ImmutablePandoMediaDict) new TreeUpdaterJNI(AbstractC16850sd.A0M(new C09530e4("multi_author_reel_names", list)), this.A0P).applyToTree(this.A0P);
        }
    }

    @Override // X.InterfaceC38831rF
    public final void EZM(C3XR c3xr) {
        TreeUpdaterJNI treeUpdaterJNI = null;
        if (this.A28) {
            Map map = this.A29;
            if (c3xr != null) {
                treeUpdaterJNI = c3xr.F7o();
            }
            map.put("music_metadata", treeUpdaterJNI);
            return;
        }
        TreeUpdaterJNI treeUpdaterJNI2 = TreeUpdaterJNI.$redex_init_class;
        if (c3xr != null) {
            treeUpdaterJNI = c3xr.F7o();
        }
        this.A0P = (ImmutablePandoMediaDict) new TreeUpdaterJNI(AbstractC16850sd.A0M(new C09530e4("music_metadata", treeUpdaterJNI)), this.A0P).applyToTree(this.A0P);
        this.A08 = c3xr;
    }

    @Override // X.InterfaceC38831rF
    public final void Ea7(InterfaceC114655Fv interfaceC114655Fv) {
        TreeUpdaterJNI treeUpdaterJNI = null;
        if (this.A28) {
            Map map = this.A29;
            if (interfaceC114655Fv != null) {
                treeUpdaterJNI = interfaceC114655Fv.F7o();
            }
            map.put("open_carousel_config", treeUpdaterJNI);
            return;
        }
        TreeUpdaterJNI treeUpdaterJNI2 = TreeUpdaterJNI.$redex_init_class;
        if (interfaceC114655Fv != null) {
            treeUpdaterJNI = interfaceC114655Fv.F7o();
        }
        this.A0P = (ImmutablePandoMediaDict) new TreeUpdaterJNI(AbstractC16850sd.A0M(new C09530e4("open_carousel_config", treeUpdaterJNI)), this.A0P).applyToTree(this.A0P);
    }

    @Override // X.InterfaceC38831rF
    public final void Ea8(OpenCarouselSubmissionState openCarouselSubmissionState) {
        boolean z = this.A28;
        String A00 = AbstractC58317Pt9.A00(123);
        if (z) {
            this.A29.put(A00, openCarouselSubmissionState.A00);
        } else {
            this.A0P = (ImmutablePandoMediaDict) new TreeUpdaterJNI(AbstractC16850sd.A0M(new C09530e4(A00, openCarouselSubmissionState.A00)), this.A0P).applyToTree(this.A0P);
        }
    }

    @Override // X.InterfaceC38831rF
    public final void EaD(String str) {
        if (this.A28) {
            this.A29.put("organic_tracking_token", str);
        } else {
            TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
            this.A0P = (ImmutablePandoMediaDict) new TreeUpdaterJNI(AbstractC16850sd.A0M(new C09530e4("organic_tracking_token", str)), this.A0P).applyToTree(this.A0P);
        }
    }

    @Override // X.InterfaceC38831rF
    public final void EaG(Integer num) {
        if (this.A28) {
            this.A29.put("original_height", num);
        } else {
            TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
            this.A0P = (ImmutablePandoMediaDict) new TreeUpdaterJNI(AbstractC16850sd.A0M(new C09530e4("original_height", num)), this.A0P).applyToTree(this.A0P);
        }
    }

    @Override // X.InterfaceC38831rF
    public final void EaI(Integer num) {
        if (this.A28) {
            this.A29.put("original_width", num);
        } else {
            TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
            this.A0P = (ImmutablePandoMediaDict) new TreeUpdaterJNI(AbstractC16850sd.A0M(new C09530e4("original_width", num)), this.A0P).applyToTree(this.A0P);
        }
    }

    @Override // X.InterfaceC38831rF
    public final void Eak(Boolean bool) {
        if (this.A28) {
            this.A29.put("photo_of_you", bool);
        } else {
            TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
            this.A0P = (ImmutablePandoMediaDict) new TreeUpdaterJNI(AbstractC16850sd.A0M(new C09530e4("photo_of_you", bool)), this.A0P).applyToTree(this.A0P);
        }
    }

    @Override // X.InterfaceC38831rF
    public final void EbE(InterfaceC31135DmI interfaceC31135DmI) {
        boolean z = this.A28;
        TreeUpdaterJNI treeUpdaterJNI = null;
        String A00 = AbstractC111324zv.A00(254);
        if (z) {
            Map map = this.A29;
            if (interfaceC31135DmI != null) {
                treeUpdaterJNI = interfaceC31135DmI.F7o();
            }
            map.put(A00, treeUpdaterJNI);
            return;
        }
        TreeUpdaterJNI treeUpdaterJNI2 = TreeUpdaterJNI.$redex_init_class;
        if (interfaceC31135DmI != null) {
            treeUpdaterJNI = interfaceC31135DmI.F7o();
        }
        this.A0P = (ImmutablePandoMediaDict) new TreeUpdaterJNI(AbstractC16850sd.A0M(new C09530e4(A00, treeUpdaterJNI)), this.A0P).applyToTree(this.A0P);
        this.A0Q = interfaceC31135DmI;
    }

    @Override // X.InterfaceC38831rF
    public final void EbL(List list) {
        ArrayList arrayList = null;
        if (this.A28) {
            Map map = this.A29;
            if (list != null) {
                arrayList = new ArrayList();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    InterfaceC38901rP interfaceC38901rP = (InterfaceC38901rP) it.next();
                    if (interfaceC38901rP != null) {
                        arrayList.add(interfaceC38901rP.F7o());
                    }
                }
            }
            map.put("preview_comments", arrayList);
            return;
        }
        if (list != null) {
            arrayList = new ArrayList();
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                InterfaceC38901rP interfaceC38901rP2 = (InterfaceC38901rP) it2.next();
                if (interfaceC38901rP2 != null) {
                    arrayList.add(interfaceC38901rP2.F7o());
                }
            }
        }
        this.A0P = (ImmutablePandoMediaDict) new TreeUpdaterJNI(AbstractC16850sd.A0M(new C09530e4("preview_comments", arrayList)), this.A0P).applyToTree(this.A0P);
        this.A0z = list;
    }

    @Override // X.InterfaceC38831rF
    public final void Ebd(InterfaceC111164zd interfaceC111164zd) {
        TreeUpdaterJNI treeUpdaterJNI = null;
        if (this.A28) {
            Map map = this.A29;
            if (interfaceC111164zd != null) {
                treeUpdaterJNI = interfaceC111164zd.F7o();
            }
            map.put("product_tags", treeUpdaterJNI);
            return;
        }
        TreeUpdaterJNI treeUpdaterJNI2 = TreeUpdaterJNI.$redex_init_class;
        if (interfaceC111164zd != null) {
            treeUpdaterJNI = interfaceC111164zd.F7o();
        }
        this.A0P = (ImmutablePandoMediaDict) new TreeUpdaterJNI(AbstractC16850sd.A0M(new C09530e4("product_tags", treeUpdaterJNI)), this.A0P).applyToTree(this.A0P);
        this.A04 = interfaceC111164zd;
    }

    @Override // X.InterfaceC38831rF
    public final void Ebf(String str) {
        if (this.A28) {
            this.A29.put("product_type", str);
        } else {
            TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
            this.A0P = (ImmutablePandoMediaDict) new TreeUpdaterJNI(AbstractC16850sd.A0M(new C09530e4("product_type", str)), this.A0P).applyToTree(this.A0P);
        }
    }

    @Override // X.InterfaceC38831rF
    public final void Ec6(String str) {
        if (this.A28) {
            this.A29.put("rank_token", str);
        } else {
            TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
            this.A0P = (ImmutablePandoMediaDict) new TreeUpdaterJNI(AbstractC16850sd.A0M(new C09530e4("rank_token", str)), this.A0P).applyToTree(this.A0P);
        }
    }

    @Override // X.InterfaceC38831rF
    public final void Ec7(Integer num) {
        if (this.A28) {
            this.A29.put("reaction_count", num);
        } else {
            TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
            this.A0P = (ImmutablePandoMediaDict) new TreeUpdaterJNI(AbstractC16850sd.A0M(new C09530e4("reaction_count", num)), this.A0P).applyToTree(this.A0P);
        }
    }

    @Override // X.InterfaceC38831rF
    public final void Ec9(List list) {
        ArrayList arrayList = null;
        if (this.A28) {
            Map map = this.A29;
            if (list != null) {
                arrayList = new ArrayList();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    JL7 jl7 = (JL7) it.next();
                    if (jl7 != null) {
                        arrayList.add(jl7.F7o());
                    }
                }
            }
            map.put("reactions", arrayList);
            return;
        }
        if (list != null) {
            arrayList = new ArrayList();
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                JL7 jl72 = (JL7) it2.next();
                if (jl72 != null) {
                    arrayList.add(jl72.F7o());
                }
            }
        }
        this.A0P = (ImmutablePandoMediaDict) new TreeUpdaterJNI(AbstractC16850sd.A0M(new C09530e4("reactions", arrayList)), this.A0P).applyToTree(this.A0P);
    }

    @Override // X.InterfaceC38831rF
    public final void EcW(MediaReminder mediaReminder) {
        TreeUpdaterJNI treeUpdaterJNI = null;
        if (this.A28) {
            Map map = this.A29;
            if (mediaReminder != null) {
                treeUpdaterJNI = mediaReminder.F7o();
            }
            map.put("reminder_info", treeUpdaterJNI);
            return;
        }
        TreeUpdaterJNI treeUpdaterJNI2 = TreeUpdaterJNI.$redex_init_class;
        if (mediaReminder != null) {
            treeUpdaterJNI = mediaReminder.F7o();
        }
        this.A0P = (ImmutablePandoMediaDict) new TreeUpdaterJNI(AbstractC16850sd.A0M(new C09530e4("reminder_info", treeUpdaterJNI)), this.A0P).applyToTree(this.A0P);
    }

    @Override // X.InterfaceC38831rF
    public final void Ecs(JLV jlv) {
        if (this.A28) {
            this.A29.put("revshare_media_ads_info", jlv.F7o());
        } else {
            TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
            this.A0P = (ImmutablePandoMediaDict) new TreeUpdaterJNI(AbstractC16850sd.A0M(new C09530e4("revshare_media_ads_info", jlv.F7o())), this.A0P).applyToTree(this.A0P);
        }
    }

    @Override // X.InterfaceC38831rF
    public final void Ed1(Integer num) {
        if (this.A28) {
            this.A29.put("save_count", num);
        } else {
            TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
            this.A0P = (ImmutablePandoMediaDict) new TreeUpdaterJNI(AbstractC16850sd.A0M(new C09530e4("save_count", num)), this.A0P).applyToTree(this.A0P);
        }
    }

    @Override // X.InterfaceC38831rF
    public final void Ed4(List list) {
        if (this.A28) {
            this.A29.put("saved_collection_ids", list);
        } else {
            TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
            this.A0P = (ImmutablePandoMediaDict) new TreeUpdaterJNI(AbstractC16850sd.A0M(new C09530e4("saved_collection_ids", list)), this.A0P).applyToTree(this.A0P);
        }
    }

    @Override // X.InterfaceC38831rF
    public final void EdD(String str) {
        if (this.A28) {
            this.A29.put("search_keyword", str);
        } else {
            TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
            this.A0P = (ImmutablePandoMediaDict) new TreeUpdaterJNI(AbstractC16850sd.A0M(new C09530e4("search_keyword", str)), this.A0P).applyToTree(this.A0P);
        }
    }

    @Override // X.InterfaceC38831rF
    public final void EdK(List list) {
        if (this.A28) {
            this.A29.put("seed_shared_album_ids", list);
        } else {
            TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
            this.A0P = (ImmutablePandoMediaDict) new TreeUpdaterJNI(AbstractC16850sd.A0M(new C09530e4("seed_shared_album_ids", list)), this.A0P).applyToTree(this.A0P);
        }
    }

    @Override // X.InterfaceC38831rF
    public final void EdM(Boolean bool) {
        if (this.A28) {
            this.A29.put("is_seen", bool);
        } else {
            TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
            this.A0P = (ImmutablePandoMediaDict) new TreeUpdaterJNI(AbstractC16850sd.A0M(new C09530e4("is_seen", bool)), this.A0P).applyToTree(this.A0P);
        }
    }

    @Override // X.InterfaceC38831rF
    public final void Edq(Boolean bool) {
        if (this.A28) {
            this.A29.put("share_count_disabled", bool);
        } else {
            TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
            this.A0P = (ImmutablePandoMediaDict) new TreeUpdaterJNI(AbstractC16850sd.A0M(new C09530e4("share_count_disabled", bool)), this.A0P).applyToTree(this.A0P);
        }
    }

    @Override // X.InterfaceC38831rF
    public final void Edt(List list) {
        if (this.A28) {
            this.A29.put("shared_with_users", list);
        } else {
            TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
            this.A0P = (ImmutablePandoMediaDict) new TreeUpdaterJNI(AbstractC16850sd.A0M(new C09530e4("shared_with_users", list)), this.A0P).applyToTree(this.A0P);
        }
    }

    @Override // X.InterfaceC38831rF
    public final void Edu(Boolean bool) {
        boolean z = this.A28;
        String A00 = AbstractC111324zv.A00(1064);
        if (z) {
            this.A29.put(A00, bool);
        } else {
            TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
            this.A0P = (ImmutablePandoMediaDict) new TreeUpdaterJNI(AbstractC16850sd.A0M(new C09530e4(A00, bool)), this.A0P).applyToTree(this.A0P);
        }
    }

    @Override // X.InterfaceC38831rF
    public final void Eeu(List list) {
        ArrayList arrayList = null;
        if (this.A28) {
            Map map = this.A29;
            if (list != null) {
                arrayList = new ArrayList();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    InterfaceC38901rP interfaceC38901rP = (InterfaceC38901rP) it.next();
                    if (interfaceC38901rP != null) {
                        arrayList.add(interfaceC38901rP.F7o());
                    }
                }
            }
            map.put("story_comments", arrayList);
            return;
        }
        if (list != null) {
            arrayList = new ArrayList();
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                InterfaceC38901rP interfaceC38901rP2 = (InterfaceC38901rP) it2.next();
                if (interfaceC38901rP2 != null) {
                    arrayList.add(interfaceC38901rP2.F7o());
                }
            }
        }
        this.A0P = (ImmutablePandoMediaDict) new TreeUpdaterJNI(AbstractC16850sd.A0M(new C09530e4("story_comments", arrayList)), this.A0P).applyToTree(this.A0P);
        this.A1F = list;
    }

    @Override // X.InterfaceC38831rF
    public final void Eev(List list) {
        ArrayList arrayList = null;
        if (this.A28) {
            Map map = this.A29;
            if (list != null) {
                arrayList = new ArrayList();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    InterfaceC73629YQr interfaceC73629YQr = (InterfaceC73629YQr) it.next();
                    if (interfaceC73629YQr != null) {
                        arrayList.add(interfaceC73629YQr.F7o());
                    }
                }
            }
            map.put("story_polls", arrayList);
            return;
        }
        if (list != null) {
            arrayList = new ArrayList();
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                InterfaceC73629YQr interfaceC73629YQr2 = (InterfaceC73629YQr) it2.next();
                if (interfaceC73629YQr2 != null) {
                    arrayList.add(interfaceC73629YQr2.F7o());
                }
            }
        }
        this.A0P = (ImmutablePandoMediaDict) new TreeUpdaterJNI(AbstractC16850sd.A0M(new C09530e4("story_polls", arrayList)), this.A0P).applyToTree(this.A0P);
        this.A1f = list;
    }

    @Override // X.InterfaceC38831rF
    public final void Eew(List list) {
        if (this.A28) {
            Map map = this.A29;
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                InterfaceC109364wL interfaceC109364wL = (InterfaceC109364wL) it.next();
                if (interfaceC109364wL != null) {
                    arrayList.add(interfaceC109364wL.F7o());
                }
            }
            map.put("story_prompts", arrayList);
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            InterfaceC109364wL interfaceC109364wL2 = (InterfaceC109364wL) it2.next();
            if (interfaceC109364wL2 != null) {
                arrayList2.add(interfaceC109364wL2.F7o());
            }
        }
        this.A0P = (ImmutablePandoMediaDict) new TreeUpdaterJNI(AbstractC16850sd.A0M(new C09530e4("story_prompts", arrayList2)), this.A0P).applyToTree(this.A0P);
        this.A1j = list;
    }

    @Override // X.InterfaceC38831rF
    public final void Ef6(String str) {
        boolean z = this.A28;
        String A00 = AbstractC111324zv.A00(1315);
        if (z) {
            this.A29.put(A00, str);
        } else {
            TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
            this.A0P = (ImmutablePandoMediaDict) new TreeUpdaterJNI(AbstractC16850sd.A0M(new C09530e4(A00, str)), this.A0P).applyToTree(this.A0P);
        }
    }

    @Override // X.InterfaceC38831rF
    public final void EfE(Boolean bool) {
        boolean z = this.A28;
        String A00 = AbstractC111324zv.A00(536);
        if (z) {
            this.A29.put(A00, bool);
        } else {
            TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
            this.A0P = (ImmutablePandoMediaDict) new TreeUpdaterJNI(AbstractC16850sd.A0M(new C09530e4(A00, bool)), this.A0P).applyToTree(this.A0P);
        }
    }

    @Override // X.InterfaceC38831rF
    public final void Efb(InterfaceC99334d2 interfaceC99334d2) {
        TreeUpdaterJNI treeUpdaterJNI = null;
        if (this.A28) {
            Map map = this.A29;
            if (interfaceC99334d2 != null) {
                treeUpdaterJNI = interfaceC99334d2.F7o();
            }
            map.put("text_post_app_info", treeUpdaterJNI);
            return;
        }
        TreeUpdaterJNI treeUpdaterJNI2 = TreeUpdaterJNI.$redex_init_class;
        if (interfaceC99334d2 != null) {
            treeUpdaterJNI = interfaceC99334d2.F7o();
        }
        this.A0P = (ImmutablePandoMediaDict) new TreeUpdaterJNI(AbstractC16850sd.A0M(new C09530e4("text_post_app_info", treeUpdaterJNI)), this.A0P).applyToTree(this.A0P);
        this.A0S = interfaceC99334d2;
    }

    @Override // X.InterfaceC38831rF
    public final void Efg(Boolean bool) {
        boolean z = this.A28;
        String A00 = AbstractC111324zv.A00(1065);
        if (z) {
            this.A29.put(A00, bool);
        } else {
            TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
            this.A0P = (ImmutablePandoMediaDict) new TreeUpdaterJNI(AbstractC16850sd.A0M(new C09530e4(A00, bool)), this.A0P).applyToTree(this.A0P);
        }
    }

    @Override // X.InterfaceC38831rF
    public final void Efr(List list) {
        if (this.A28) {
            this.A29.put("timeline_pinned_user_ids", list);
        } else {
            TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
            this.A0P = (ImmutablePandoMediaDict) new TreeUpdaterJNI(AbstractC16850sd.A0M(new C09530e4("timeline_pinned_user_ids", list)), this.A0P).applyToTree(this.A0P);
        }
    }

    @Override // X.InterfaceC38831rF
    public final void Eg4(Integer num) {
        if (this.A28) {
            this.A29.put("total_viewer_count", num);
        } else {
            TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
            this.A0P = (ImmutablePandoMediaDict) new TreeUpdaterJNI(AbstractC16850sd.A0M(new C09530e4("total_viewer_count", num)), this.A0P).applyToTree(this.A0P);
        }
    }

    @Override // X.InterfaceC38831rF
    public final void EgV(UpcomingEvent upcomingEvent) {
        TreeUpdaterJNI treeUpdaterJNI = null;
        if (this.A28) {
            Map map = this.A29;
            if (upcomingEvent != null) {
                treeUpdaterJNI = upcomingEvent.F7o();
            }
            map.put("upcoming_event", treeUpdaterJNI);
            return;
        }
        TreeUpdaterJNI treeUpdaterJNI2 = TreeUpdaterJNI.$redex_init_class;
        if (upcomingEvent != null) {
            treeUpdaterJNI = upcomingEvent.F7o();
        }
        this.A0P = (ImmutablePandoMediaDict) new TreeUpdaterJNI(AbstractC16850sd.A0M(new C09530e4("upcoming_event", treeUpdaterJNI)), this.A0P).applyToTree(this.A0P);
        this.A0W = upcomingEvent;
    }

    @Override // X.InterfaceC38831rF
    public final void EgZ(User user) {
        TreeUpdaterJNI treeUpdaterJNI = null;
        if (this.A28) {
            Map map = this.A29;
            if (user != null) {
                treeUpdaterJNI = user.A07();
            }
            map.put(PublicKeyCredentialControllerUtility.JSON_KEY_USER, treeUpdaterJNI);
            return;
        }
        TreeUpdaterJNI treeUpdaterJNI2 = TreeUpdaterJNI.$redex_init_class;
        if (user != null) {
            treeUpdaterJNI = user.A07();
        }
        this.A0P = (ImmutablePandoMediaDict) new TreeUpdaterJNI(AbstractC16850sd.A0M(new C09530e4(PublicKeyCredentialControllerUtility.JSON_KEY_USER, treeUpdaterJNI)), this.A0P).applyToTree(this.A0P);
        this.A0e = user;
    }

    @Override // X.InterfaceC38831rF
    public final void Egf(InterfaceC84523py interfaceC84523py) {
        TreeUpdaterJNI treeUpdaterJNI = null;
        if (this.A28) {
            Map map = this.A29;
            if (interfaceC84523py != null) {
                treeUpdaterJNI = interfaceC84523py.F7o();
            }
            map.put("usertags", treeUpdaterJNI);
            return;
        }
        TreeUpdaterJNI treeUpdaterJNI2 = TreeUpdaterJNI.$redex_init_class;
        if (interfaceC84523py != null) {
            treeUpdaterJNI = interfaceC84523py.F7o();
        }
        this.A0P = (ImmutablePandoMediaDict) new TreeUpdaterJNI(AbstractC16850sd.A0M(new C09530e4("usertags", treeUpdaterJNI)), this.A0P).applyToTree(this.A0P);
        this.A0E = interfaceC84523py;
    }

    @Override // X.InterfaceC38831rF
    public final void Eh0(List list) {
        if (this.A28) {
            Map map = this.A29;
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                VideoVersionIntf videoVersionIntf = (VideoVersionIntf) it.next();
                if (videoVersionIntf != null) {
                    arrayList.add(videoVersionIntf.F7o());
                }
            }
            map.put("video_versions", arrayList);
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            VideoVersionIntf videoVersionIntf2 = (VideoVersionIntf) it2.next();
            if (videoVersionIntf2 != null) {
                arrayList2.add(videoVersionIntf2.F7o());
            }
        }
        this.A0P = (ImmutablePandoMediaDict) new TreeUpdaterJNI(AbstractC16850sd.A0M(new C09530e4("video_versions", arrayList2)), this.A0P).applyToTree(this.A0P);
    }

    @Override // X.InterfaceC38831rF
    public final void Eh3(Integer num) {
        if (this.A28) {
            this.A29.put("view_count", num);
        } else {
            TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
            this.A0P = (ImmutablePandoMediaDict) new TreeUpdaterJNI(AbstractC16850sd.A0M(new C09530e4("view_count", num)), this.A0P).applyToTree(this.A0P);
        }
    }

    @Override // X.InterfaceC38831rF
    public final void Eh7(Boolean bool) {
        boolean z = this.A28;
        String A00 = AbstractC111324zv.A00(276);
        if (z) {
            this.A29.put(A00, bool);
        } else {
            TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
            this.A0P = (ImmutablePandoMediaDict) new TreeUpdaterJNI(AbstractC16850sd.A0M(new C09530e4(A00, bool)), this.A0P).applyToTree(this.A0P);
        }
    }

    @Override // X.InterfaceC38831rF
    public final void Eh8(String str) {
        if (this.A28) {
            this.A29.put("viewer_cursor", str);
        } else {
            TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
            this.A0P = (ImmutablePandoMediaDict) new TreeUpdaterJNI(AbstractC16850sd.A0M(new C09530e4("viewer_cursor", str)), this.A0P).applyToTree(this.A0P);
        }
    }

    @Override // X.InterfaceC38831rF
    public final void EhA(List list) {
        if (this.A28) {
            Map map = this.A29;
            ArrayList arrayList = new ArrayList(AbstractC06950Ym.A1E(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((User) it.next()).A07());
            }
            map.put("viewers", arrayList);
            return;
        }
        ArrayList arrayList2 = new ArrayList(AbstractC06950Ym.A1E(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((User) it2.next()).A07());
        }
        this.A0P = (ImmutablePandoMediaDict) new TreeUpdaterJNI(AbstractC16850sd.A0M(new C09530e4("viewers", arrayList2)), this.A0P).applyToTree(this.A0P);
        this.A25 = list;
    }

    @Override // X.InterfaceC38831rF
    public final void EhC(String str) {
        if (this.A28) {
            this.A29.put("visibility", str);
        } else {
            TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
            this.A0P = (ImmutablePandoMediaDict) new TreeUpdaterJNI(AbstractC16850sd.A0M(new C09530e4("visibility", str)), this.A0P).applyToTree(this.A0P);
        }
    }

    @Override // X.InterfaceC38831rF
    public final void EhL(Boolean bool) {
        if (this.A28) {
            this.A29.put("was_captured_for_view_state", bool);
        } else {
            TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
            this.A0P = (ImmutablePandoMediaDict) new TreeUpdaterJNI(AbstractC16850sd.A0M(new C09530e4("was_captured_for_view_state", bool)), this.A0P).applyToTree(this.A0P);
        }
    }

    @Override // X.InterfaceC38831rF
    public final InterfaceC76613c6 EqK() {
        return this.A0P;
    }

    @Override // X.InterfaceC38831rF
    public final String getAlgorithm() {
        return this.A0P.A0i(225490031);
    }

    @Override // X.InterfaceC38831rF
    public final String getAudience() {
        return this.A0P.A0i(975628804);
    }

    @Override // X.InterfaceC38831rF
    public final String getBoostUnavailableIdentifier() {
        return this.A0P.A0i(775105556);
    }

    @Override // X.InterfaceC38831rF
    public final String getBoostUnavailableReason() {
        return this.A0P.A0i(-732528849);
    }

    @Override // X.InterfaceC38831rF
    public final String getBoostedBySponsor() {
        return this.A0P.A0i(-945529841);
    }

    @Override // X.InterfaceC38831rF
    public final String getBoostedStatus() {
        return this.A0P.A0i(1257530191);
    }

    @Override // X.InterfaceC38831rF
    public final C3x9 getClipsMetadata() {
        C3x9 c3x9 = this.A0I;
        if (c3x9 == null) {
            return this.A0P.getClipsMetadata();
        }
        return c3x9;
    }

    @Override // X.InterfaceC38831rF
    public final List getCoauthorProducers() {
        return this.A0o;
    }

    @Override // X.InterfaceC38831rF
    public final String getCode() {
        return this.A0P.A0i(3059181);
    }

    @Override // X.InterfaceC38831rF
    public final String getConnectionId() {
        return this.A0P.getConnectionId();
    }

    @Override // X.InterfaceC38831rF
    public final String getDominantColor() {
        return this.A0P.A0i(1714924804);
    }

    @Override // X.InterfaceC38831rF
    public final String getId() {
        return this.A0P.getId();
    }

    @Override // X.InterfaceC38831rF
    public final InterfaceC39541sb getInjected() {
        InterfaceC39541sb interfaceC39541sb = this.A0R;
        if (interfaceC39541sb == null) {
            return this.A0P.getInjected();
        }
        return interfaceC39541sb;
    }

    @Override // X.InterfaceC38831rF
    public final String getLoggingInfoToken() {
        return this.A0P.getLoggingInfoToken();
    }

    @Override // X.InterfaceC38831rF
    public final String getMezqlToken() {
        return this.A0P.getMezqlToken();
    }

    @Override // X.InterfaceC38831rF
    public final C3XR getMusicMetadata() {
        C3XR c3xr = this.A08;
        if (c3xr == null) {
            return this.A0P.getMusicMetadata();
        }
        return c3xr;
    }

    @Override // X.InterfaceC38831rF
    public final String getOrganicTrackingToken() {
        return this.A0P.A0i(-1133964731);
    }

    @Override // X.InterfaceC38831rF
    public final String getPk() {
        return this.A0P.A0j(3579);
    }

    @Override // X.InterfaceC38831rF
    public final String getPreview() {
        return this.A0P.A0i(-318184504);
    }

    @Override // X.InterfaceC38831rF
    public final String getProductType() {
        return this.A0P.A0i(1014577290);
    }

    @Override // X.InterfaceC38831rF
    public final String getShopRoutingUserId() {
        return this.A0P.A0j(2072925261);
    }

    @Override // X.InterfaceC38831rF
    public final List getSponsorTags() {
        List list = this.A16;
        if (list == null) {
            return this.A0P.getSponsorTags();
        }
        return list;
    }

    @Override // X.InterfaceC38831rF
    public final String getStrongId() {
        return this.A0P.A0j(356255459);
    }

    @Override // X.InterfaceC38831rF
    public final String getSubscriptionMediaVisibility() {
        return this.A0P.A0i(2038954287);
    }

    @Override // X.InterfaceC38831rF
    public final String getTitle() {
        return this.A0P.A0i(110371416);
    }

    @Override // X.InterfaceC38831rF
    public final String getVideoCodec() {
        return this.A0P.A0i(1370685266);
    }

    @Override // X.InterfaceC38831rF
    public final String getVideoDashManifest() {
        return this.A0P.A0i(-134887560);
    }

    @Override // X.InterfaceC38831rF
    public final String getVideoSubtitlesUri() {
        return this.A0P.A0i(-189990460);
    }

    @Override // X.InterfaceC38831rF
    public final String getXpostDenyReason() {
        return this.A0P.A0i(-1654914256);
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [X.1rE, java.lang.Object] */
    @Override // X.InterfaceC38831rF
    public final C38821rE F4m(C1DY c1dy) {
        H75 h75;
        AnonymousClass923 anonymousClass923;
        ArrayList arrayList;
        H72 h72;
        ArrayList arrayList2;
        ArrayList arrayList3;
        H70 h70;
        C84513px c84513px;
        User user;
        C114625Fm c114625Fm;
        H5D h5d;
        UpcomingEventImpl upcomingEventImpl;
        ArrayList arrayList4;
        ArrayList arrayList5;
        ArrayList arrayList6;
        C99484dN c99484dN;
        SpritesheetInfoImpl spritesheetInfoImpl;
        C38801H6q c38801H6q;
        ArrayList arrayList7;
        C99324d1 c99324d1;
        C107184sP c107184sP;
        C102664k1 c102664k1;
        ArrayList arrayList8;
        ArrayList arrayList9;
        ArrayList arrayList10;
        ArrayList arrayList11;
        ArrayList arrayList12;
        StoryUnlockableStickerTappableObjectImpl storyUnlockableStickerTappableObjectImpl;
        H6D h6d;
        ArrayList arrayList13;
        ArrayList arrayList14;
        ArrayList arrayList15;
        ArrayList arrayList16;
        ArrayList arrayList17;
        ArrayList arrayList18;
        ArrayList arrayList19;
        ArrayList arrayList20;
        ArrayList arrayList21;
        ArrayList arrayList22;
        ArrayList arrayList23;
        ArrayList arrayList24;
        ArrayList arrayList25;
        C38781H5v c38781H5v;
        ArrayList arrayList26;
        ArrayList arrayList27;
        ArrayList arrayList28;
        ArrayList arrayList29;
        ArrayList arrayList30;
        ArrayList arrayList31;
        ArrayList arrayList32;
        ArrayList arrayList33;
        ArrayList arrayList34;
        ArrayList arrayList35;
        ArrayList arrayList36;
        ArrayList arrayList37;
        ArrayList arrayList38;
        ArrayList arrayList39;
        ArrayList arrayList40;
        ArrayList arrayList41;
        E8A e8a;
        ArrayList arrayList42;
        ArrayList arrayList43;
        ArrayList arrayList44;
        ArrayList arrayList45;
        ArrayList arrayList46;
        ArrayList arrayList47;
        ArrayList arrayList48;
        ArrayList arrayList49;
        ArrayList arrayList50;
        ArrayList arrayList51;
        ArrayList arrayList52;
        ArrayList arrayList53;
        ArrayList arrayList54;
        ArrayList arrayList55;
        C40H c40h;
        ArrayList arrayList56;
        ArrayList arrayList57;
        ArrayList arrayList58;
        ArrayList arrayList59;
        ArrayList arrayList60;
        ArrayList arrayList61;
        ArrayList arrayList62;
        ArrayList arrayList63;
        ArrayList arrayList64;
        ArrayList arrayList65;
        H5M h5m;
        ArrayList arrayList66;
        ArrayList arrayList67;
        C39741sx c39741sx;
        C40B c40b;
        ArrayList arrayList68;
        H46 h46;
        ArrayList arrayList69;
        ArrayList arrayList70;
        ArrayList arrayList71;
        IgShowreelCompositionImpl igShowreelCompositionImpl;
        IgShowreelNativeAnimation igShowreelNativeAnimation;
        C108344uL c108344uL;
        C39671sq c39671sq;
        User user2;
        H56 h56;
        E86 e86;
        H53 h53;
        User user3;
        User user4;
        User user5;
        H50 h50;
        MediaReminderImpl mediaReminderImpl;
        BVD bvd;
        ArrayList arrayList72;
        C102724k9 c102724k9;
        ArrayList arrayList73;
        ArrayList arrayList74;
        ArrayList arrayList75;
        C38752H4s c38752H4s;
        C111154zc c111154zc;
        ArrayList arrayList76;
        H3L h3l;
        User user6;
        ArrayList arrayList77;
        C106804rh c106804rh;
        C131045vs c131045vs;
        H7Q h7q;
        C26215Bif c26215Bif;
        H4Z h4z;
        C32074E7y c32074E7y;
        H4Q h4q;
        C114645Fu c114645Fu;
        C38733H3w c38733H3w;
        C3XQ c3xq;
        H4K h4k;
        C87793vn c87793vn;
        MetaPlaceDictImpl metaPlaceDictImpl;
        ArrayList arrayList78;
        ArrayList arrayList79;
        H57 h57;
        H4C h4c;
        C109084vX c109084vX;
        H4B h4b;
        C84353pS c84353pS;
        C52N c52n;
        BrandedContentGatingInfo brandedContentGatingInfo;
        C88293wg c88293wg;
        C102724k9 c102724k92;
        H4A h4a;
        C84153p2 c84153p2;
        H47 h47;
        LocationDict locationDict;
        H44 h44;
        C108054to c108054to;
        XVZ xvz;
        C38817H7h c38817H7h;
        C39561sd c39561sd;
        C39531sa c39531sa;
        UR6 ur6;
        H3z h3z;
        ImageInfoImpl imageInfoImpl;
        IGTVShoppingInfo iGTVShoppingInfo;
        C38735H3y c38735H3y;
        C38734H3x c38734H3x;
        C84463pp c84463pp;
        IABPostClickDataDictImpl iABPostClickDataDictImpl;
        C88243wZ c88243wZ;
        C107764tL c107764tL;
        C38891rO c38891rO;
        H3W h3w;
        H7N h7n;
        ArrayList arrayList80;
        User user7;
        GoalsToastInfoImpl goalsToastInfoImpl;
        CommentGiphyMediaInfo commentGiphyMediaInfo;
        C105344ox c105344ox;
        C39051re c39051re;
        C39021rb c39021rb;
        HashtagImpl hashtagImpl;
        ArrayList arrayList81;
        ArrayList arrayList82;
        H7M h7m;
        C84433pm c84433pm;
        C51L c51l;
        H40 h40;
        C114585Fe c114585Fe;
        C84433pm c84433pm2;
        C3XJ c3xj;
        H3K h3k;
        H59 h59;
        ArrayList arrayList83;
        C38991rY c38991rY;
        C84433pm c84433pm3;
        C88343wp c88343wp;
        H3A h3a;
        User user8;
        C38823H7r c38823H7r;
        ArrayList arrayList84;
        ArrayList arrayList85;
        C46o c46o;
        H32 h32;
        ArrayList arrayList86;
        CreatorDigestSignalInfoImpl creatorDigestSignalInfoImpl;
        C52r c52r;
        CreativeConfig creativeConfig;
        C120915dj c120915dj;
        C38712H2y c38712H2y;
        C38711H2x c38711H2x;
        C38709H2v c38709H2v;
        C38246Grp c38246Grp;
        ArrayList arrayList87;
        IGCommentSheetMoreInfoImpl iGCommentSheetMoreInfoImpl;
        C38921rR c38921rR;
        CollabFollowButtonInfoImpl collabFollowButtonInfoImpl;
        ClipsTrialDictImpl clipsTrialDictImpl;
        ArrayList arrayList88;
        C26214Bie c26214Bie;
        ArrayList arrayList89;
        ArrayList arrayList90;
        C51L c51l2;
        C88513x8 c88513x8;
        ClipsMashupFollowButtonInfoImpl clipsMashupFollowButtonInfoImpl;
        ArrayList arrayList91;
        C84433pm c84433pm4;
        C83923oc c83923oc;
        ArrayList arrayList92;
        C26159Bhk c26159Bhk;
        C38692H2d c38692H2d;
        E7s e7s;
        C44P c44p;
        ImageInfoImpl imageInfoImpl2;
        C1117351z c1117351z;
        C38891rO c38891rO2;
        H2V h2v;
        BrandSafetyContentBlocklistBitmapQLObjImpl brandSafetyContentBlocklistBitmapQLObjImpl;
        BrandedContentProjectMetadata brandedContentProjectMetadata;
        ArrayList arrayList93;
        BoostUpsellBannerPayloadSchemaImpl boostUpsellBannerPayloadSchemaImpl;
        ArrayList arrayList94;
        ArrayList arrayList95;
        ArrayList arrayList96;
        Audio audio;
        ArrayList arrayList97;
        C5L1 c5l1;
        ArrayList arrayList98;
        AppstoreMetadataDictImpl appstoreMetadataDictImpl;
        AppInstallCTAInfo appInstallCTAInfo;
        ArrayList arrayList99;
        C109894xH c109894xH;
        C87703ve c87703ve;
        ArrayList arrayList100;
        C5Fa c5Fa;
        C84433pm c84433pm5;
        H49 h49;
        if (C11T.A08()) {
            String A00 = AbstractC111324zv.A00(1343);
            EnumC12410kj enumC12410kj = EnumC12410kj.A0A;
            String A002 = AbstractC111324zv.A00(1695);
            C0w9.A01(enumC12410kj, A002, A00);
            C0K8.A0D(A002, A00);
        }
        ?? obj = new Object();
        int[] setFields = this.A0P.getSetFields();
        C14360o3.A07(setFields);
        if (AbstractC009903n.A0P(setFields, -363605003)) {
            obj.A5C = AXw();
        }
        ArrayList arrayList101 = null;
        if (AbstractC009903n.A0P(setFields, 1001495785)) {
            InterfaceC43539JKz AYF = AYF();
            if (AYF != null) {
                h49 = AYF.EwB().EwB();
            } else {
                h49 = null;
            }
            obj.A0z = h49;
        }
        if (AbstractC009903n.A0P(setFields, -1340482847)) {
            obj.A5D = AYw();
        }
        if (AbstractC009903n.A0P(setFields, 243470802)) {
            obj.A5E = AZ3();
        }
        if (AbstractC009903n.A0P(setFields, -1053684431)) {
            InterfaceC84443pn AZA = AZA();
            if (AZA != null) {
                c84433pm5 = AZA.EtX();
            } else {
                c84433pm5 = null;
            }
            obj.A0W = c84433pm5;
        }
        if (AbstractC009903n.A0P(setFields, -1593201482)) {
            InterfaceC104764ng AZB = AZB();
            if (AZB != null) {
                c5Fa = AZB.F5k().F5k();
            } else {
                c5Fa = null;
            }
            obj.A2G = c5Fa;
        }
        if (AbstractC009903n.A0P(setFields, -1041590325)) {
            List AZJ = AZJ();
            if (AZJ != null) {
                arrayList100 = new ArrayList(AbstractC06950Ym.A1E(AZJ, 10));
                Iterator it = AZJ.iterator();
                while (it.hasNext()) {
                    arrayList100.add(((InterfaceC88223wX) it.next()).Eqc());
                }
            } else {
                arrayList100 = null;
            }
            obj.A0J(arrayList100);
        }
        if (AbstractC009903n.A0P(setFields, 526468140)) {
            obj.A00 = AZK();
        }
        if (AbstractC009903n.A0P(setFields, 1992010402)) {
            obj.A4R = AZP();
        }
        if (AbstractC009903n.A0P(setFields, -1422642818)) {
            InterfaceC87713vf AZQ = AZQ();
            if (AZQ != null) {
                c87703ve = AZQ.EtZ();
            } else {
                c87703ve = null;
            }
            obj.A0c = c87703ve;
        }
        if (AbstractC009903n.A0P(setFields, -1521819552)) {
            InterfaceC109904xI AaN = AaN();
            if (AaN != null) {
                c109894xH = AaN.Eqg();
            } else {
                c109894xH = null;
            }
            obj.A01 = c109894xH;
        }
        if (AbstractC009903n.A0P(setFields, 225490031)) {
            obj.A5F = getAlgorithm();
        }
        if (AbstractC009903n.A0P(setFields, 2022281012)) {
            obj.A87 = this.A0P._allPreviousSubmitters$fbandroid_java_com_instagram_feed_media_media(c1dy);
        }
        if (AbstractC009903n.A0P(setFields, -683992599)) {
            List Abm = Abm();
            if (Abm != null) {
                arrayList99 = new ArrayList(AbstractC06950Ym.A1E(Abm, 10));
                Iterator it2 = Abm.iterator();
                while (it2.hasNext()) {
                    arrayList99.add(((AndroidLink) it2.next()).F53());
                }
            } else {
                arrayList99 = null;
            }
            obj.EPg(arrayList99);
        }
        if (AbstractC009903n.A0P(setFields, -145039873)) {
            AppInstallCTAInfoIntf AcI = AcI();
            if (AcI != null) {
                appInstallCTAInfo = AcI.Eqq().Eqq();
            } else {
                appInstallCTAInfo = null;
            }
            obj.A02 = appInstallCTAInfo;
        }
        if (AbstractC009903n.A0P(setFields, 160943406)) {
            AppstoreMetadataDict AcT = AcT();
            if (AcT != null) {
                appstoreMetadataDictImpl = AcT.Eqw();
            } else {
                appstoreMetadataDictImpl = null;
            }
            obj.A03 = appstoreMetadataDictImpl;
        }
        if (AbstractC009903n.A0P(setFields, 86950409)) {
            obj.A51 = AcY();
        }
        if (AbstractC009903n.A0P(setFields, 78024734)) {
            obj.A52 = AcZ();
        }
        if (AbstractC009903n.A0P(setFields, 1801790983)) {
            obj.A2Z = Acc();
        }
        if (AbstractC009903n.A0P(setFields, -738997328)) {
            List Ad8 = Ad8();
            if (Ad8 != null) {
                arrayList98 = new ArrayList(AbstractC06950Ym.A1E(Ad8, 10));
                Iterator it3 = Ad8.iterator();
                while (it3.hasNext()) {
                    arrayList98.add(((InterfaceC43514JKa) it3.next()).F2h());
                }
            } else {
                arrayList98 = null;
            }
            obj.A0K(arrayList98);
        }
        if (AbstractC009903n.A0P(setFields, -309882753)) {
            C5L2 AdA = AdA();
            if (AdA != null) {
                c5l1 = AdA.EwD().EwD();
            } else {
                c5l1 = null;
            }
            obj.A11 = c5l1;
        }
        if (AbstractC009903n.A0P(setFields, -1519424279)) {
            obj.A5G = AdE();
        }
        if (AbstractC009903n.A0P(setFields, 975628804)) {
            obj.A5H = getAudience();
        }
        if (AbstractC009903n.A0P(setFields, 1940397466)) {
            List AdX = AdX();
            if (AdX != null) {
                arrayList97 = new ArrayList(AbstractC06950Ym.A1E(AdX, 10));
                Iterator it4 = AdX.iterator();
                while (it4.hasNext()) {
                    arrayList97.add(((AudienceListIntf) it4.next()).Er0());
                }
            } else {
                arrayList97 = null;
            }
            obj.A0L(arrayList97);
        }
        if (AbstractC009903n.A0P(setFields, 93166550)) {
            AudioIntf Add = Add();
            if (Add != null) {
                audio = Add.F4S();
            } else {
                audio = null;
            }
            obj.A1x = audio;
        }
        if (AbstractC009903n.A0P(setFields, -122941262)) {
            obj.A2F = AeF();
        }
        if (AbstractC009903n.A0P(setFields, 50050287)) {
            List AeH = AeH();
            if (AeH != null) {
                arrayList96 = new ArrayList(AbstractC06950Ym.A1E(AeH, 10));
                Iterator it5 = AeH.iterator();
                while (it5.hasNext()) {
                    arrayList96.add(((JK9) it5.next()).Er7());
                }
            } else {
                arrayList96 = null;
            }
            obj.A0M(arrayList96);
        }
        if (AbstractC009903n.A0P(setFields, -1735392516)) {
            List Aeh = Aeh();
            if (Aeh != null) {
                arrayList95 = new ArrayList(AbstractC06950Ym.A1E(Aeh, 10));
                Iterator it6 = Aeh.iterator();
                while (it6.hasNext()) {
                    arrayList95.add(((InterfaceC102164im) it6.next()).F00(c1dy));
                }
            } else {
                arrayList95 = null;
            }
            obj.A0N(arrayList95);
        }
        if (AbstractC009903n.A0P(setFields, -1528215024)) {
            obj.A4S = Afm();
        }
        if (AbstractC009903n.A0P(setFields, 815249345)) {
            List AgH = AgH();
            if (AgH != null) {
                arrayList94 = new ArrayList(AbstractC06950Ym.A1E(AgH, 10));
                Iterator it7 = AgH.iterator();
                while (it7.hasNext()) {
                    arrayList94.add(((InterfaceC37271GbO) it7.next()).ErF(c1dy));
                }
            } else {
                arrayList94 = null;
            }
            obj.EQN(arrayList94);
        }
        if (AbstractC009903n.A0P(setFields, -2048758110)) {
            obj.A2a = Agh();
        }
        if (AbstractC009903n.A0P(setFields, -2114699394)) {
            obj.A2b = Agj();
        }
        if (AbstractC009903n.A0P(setFields, -1627152477)) {
            obj.A88 = Agk();
        }
        if (AbstractC009903n.A0P(setFields, 775105556)) {
            obj.A5I = getBoostUnavailableIdentifier();
        }
        if (AbstractC009903n.A0P(setFields, -732528849)) {
            obj.A5J = getBoostUnavailableReason();
        }
        if (AbstractC009903n.A0P(setFields, 1169465841)) {
            BoostUpsellBannerPayloadSchema AhI = AhI();
            if (AhI != null) {
                boostUpsellBannerPayloadSchemaImpl = AhI.ErK().ErK();
            } else {
                boostUpsellBannerPayloadSchemaImpl = null;
            }
            obj.A04 = boostUpsellBannerPayloadSchemaImpl;
        }
        if (AbstractC009903n.A0P(setFields, -945529841)) {
            obj.A5K = getBoostedBySponsor();
        }
        if (AbstractC009903n.A0P(setFields, 1834642781)) {
            obj.A5L = AhJ();
        }
        if (AbstractC009903n.A0P(setFields, 1257530191)) {
            obj.A5M = getBoostedStatus();
        }
        if (AbstractC009903n.A0P(setFields, 1974739535)) {
            List Ai3 = Ai3();
            if (Ai3 != null) {
                arrayList93 = new ArrayList(AbstractC06950Ym.A1E(Ai3, 10));
                Iterator it8 = Ai3.iterator();
                while (it8.hasNext()) {
                    arrayList93.add(((InterfaceC43551JLl) it8.next()).ErB(c1dy));
                }
            } else {
                arrayList93 = null;
            }
            obj.EQU(arrayList93);
        }
        if (AbstractC009903n.A0P(setFields, 1841151060)) {
            BrandedContentProjectMetadataIntf Ai4 = Ai4();
            if (Ai4 != null) {
                brandedContentProjectMetadata = Ai4.ErO().ErO();
            } else {
                brandedContentProjectMetadata = null;
            }
            obj.A07 = brandedContentProjectMetadata;
        }
        if (AbstractC009903n.A0P(setFields, -612473699)) {
            BrandSafetyContentBlocklistBitmapQLObj AiW = AiW();
            if (AiW != null) {
                brandSafetyContentBlocklistBitmapQLObjImpl = AiW.ErL();
            } else {
                brandSafetyContentBlocklistBitmapQLObjImpl = null;
            }
            obj.EQZ(brandSafetyContentBlocklistBitmapQLObjImpl);
        }
        if (AbstractC009903n.A0P(setFields, 1515781529)) {
            obj.A53 = AiX();
        }
        if (AbstractC009903n.A0P(setFields, -383562417)) {
            obj.A54 = AiY();
        }
        if (AbstractC009903n.A0P(setFields, -26036274)) {
            JM2 AjO = AjO();
            if (AjO != null) {
                h2v = AjO.ErU().ErU();
            } else {
                h2v = null;
            }
            obj.A08 = h2v;
        }
        if (AbstractC009903n.A0P(setFields, -126765611)) {
            obj.A2c = AkV();
        }
        if (AbstractC009903n.A0P(setFields, -1740988645)) {
            obj.A2d = AkX();
        }
        if (AbstractC009903n.A0P(setFields, 373873083)) {
            obj.A2e = Aki();
        }
        if (AbstractC009903n.A0P(setFields, -1482588131)) {
            obj.A2f = Akk();
        }
        if (AbstractC009903n.A0P(setFields, -1503770365)) {
            obj.A2g = Akp();
        }
        if (AbstractC009903n.A0P(setFields, 1051141294)) {
            obj.A2h = AlH();
        }
        if (AbstractC009903n.A0P(setFields, -283088485)) {
            obj.A2i = AlI();
        }
        if (AbstractC009903n.A0P(setFields, 552573414)) {
            InterfaceC38901rP Alb = Alb();
            if (Alb != null) {
                c38891rO2 = Alb.F4U(c1dy);
            } else {
                c38891rO2 = null;
            }
            obj.A0B(c38891rO2);
        }
        if (AbstractC009903n.A0P(setFields, -118047050)) {
            AnonymousClass520 Ald = Ald();
            if (Ald != null) {
                c1117351z = Ald.Erb(c1dy);
            } else {
                c1117351z = null;
            }
            obj.ERC(c1117351z);
        }
        if (AbstractC009903n.A0P(setFields, -344802875)) {
            obj.A2j = Alo();
        }
        if (AbstractC009903n.A0P(setFields, -364794811)) {
            obj.A89 = this.A0P._carouselMedia$fbandroid_java_com_instagram_feed_media_media(c1dy);
        }
        if (AbstractC009903n.A0P(setFields, 253909141)) {
            obj.A4T = AmC();
        }
        if (AbstractC009903n.A0P(setFields, -2015236462)) {
            obj.A4U = AmE();
        }
        if (AbstractC009903n.A0P(setFields, 1498535089)) {
            obj.A5N = AmI();
        }
        if (AbstractC009903n.A0P(setFields, -1451270920)) {
            obj.A5O = AmM();
        }
        if (AbstractC009903n.A0P(setFields, 758740173)) {
            ImageInfo AmQ = AmQ();
            if (AmQ != null) {
                imageInfoImpl2 = AmQ.F5B().F5B();
            } else {
                imageInfoImpl2 = null;
            }
            obj.A2A = imageInfoImpl2;
        }
        if (AbstractC009903n.A0P(setFields, -1052491541)) {
            C44Q An4 = An4();
            if (An4 != null) {
                c44p = An4.Erk();
            } else {
                c44p = null;
            }
            obj.A0A = c44p;
        }
        if (AbstractC009903n.A0P(setFields, 1542269256)) {
            obj.A8A = this.A0P._chicletStorefronts$fbandroid_java_com_instagram_feed_media_media(c1dy);
        }
        if (AbstractC009903n.A0P(setFields, 906452786)) {
            obj.A5P = Anl();
        }
        if (AbstractC009903n.A0P(setFields, -1410844203)) {
            InterfaceC37265GbI Ano = Ano();
            if (Ano != null) {
                e7s = Ano.Eub().Eub();
            } else {
                e7s = null;
            }
            obj.A0l = e7s;
        }
        if (AbstractC009903n.A0P(setFields, -906308293)) {
            obj.A5Q = Ant();
        }
        if (AbstractC009903n.A0P(setFields, 2112594119)) {
            obj.A4J = Ao2();
        }
        if (AbstractC009903n.A0P(setFields, -1332305988)) {
            InterfaceC43530JKq Ao5 = Ao5();
            if (Ao5 != null) {
                c38692H2d = Ao5.Erp().Erp();
            } else {
                c38692H2d = null;
            }
            obj.A0B = c38692H2d;
        }
        if (AbstractC009903n.A0P(setFields, -1785566710)) {
            InterfaceC31131DmE AoB = AoB();
            if (AoB != null) {
                c26159Bhk = AoB.F48(c1dy);
            } else {
                c26159Bhk = null;
            }
            obj.A0A(c26159Bhk);
        }
        if (AbstractC009903n.A0P(setFields, 1362025471)) {
            List AoD = AoD();
            if (AoD != null) {
                arrayList92 = new ArrayList(AbstractC06950Ym.A1E(AoD, 10));
                Iterator it9 = AoD.iterator();
                while (it9.hasNext()) {
                    arrayList92.add(((InterfaceC73614YQc) it9.next()).F0C(c1dy));
                }
            } else {
                arrayList92 = null;
            }
            obj.A0O(arrayList92);
        }
        if (AbstractC009903n.A0P(setFields, -2085085191)) {
            InterfaceC83933od AoF = AoF();
            if (AoF != null) {
                c83923oc = AoF.Erv();
            } else {
                c83923oc = null;
            }
            obj.A0C = c83923oc;
        }
        if (AbstractC009903n.A0P(setFields, -1436962255)) {
            InterfaceC84443pn AoG = AoG();
            if (AoG != null) {
                c84433pm4 = AoG.EtX();
            } else {
                c84433pm4 = null;
            }
            obj.ERY(c84433pm4);
        }
        if (AbstractC009903n.A0P(setFields, -28006033)) {
            List AoQ = AoQ();
            if (AoQ != null) {
                arrayList91 = new ArrayList(AbstractC06950Ym.A1E(AoQ, 10));
                Iterator it10 = AoQ.iterator();
                while (it10.hasNext()) {
                    arrayList91.add(((YQW) it10.next()).Evo(c1dy));
                }
            } else {
                arrayList91 = null;
            }
            obj.A0P(arrayList91);
        }
        if (AbstractC009903n.A0P(setFields, -472432436)) {
            ClipsMashupFollowButtonInfo AoR = AoR();
            if (AoR != null) {
                clipsMashupFollowButtonInfoImpl = AoR.Erz();
            } else {
                clipsMashupFollowButtonInfoImpl = null;
            }
            obj.A0D = clipsMashupFollowButtonInfoImpl;
        }
        if (AbstractC009903n.A0P(setFields, -343458613)) {
            C3x9 clipsMetadata = getClipsMetadata();
            if (clipsMetadata != null) {
                c88513x8 = clipsMetadata.F4I(c1dy);
            } else {
                c88513x8 = null;
            }
            obj.ERZ(c88513x8);
        }
        if (AbstractC009903n.A0P(setFields, -726460565)) {
            InterfaceC104934o6 AoT = AoT();
            if (AoT != null) {
                c51l2 = AoT.ExV().ExV();
            } else {
                c51l2 = null;
            }
            obj.A1H = c51l2;
        }
        if (AbstractC009903n.A0P(setFields, -356109792)) {
            List AoX = AoX();
            if (AoX != null) {
                arrayList90 = new ArrayList(AbstractC06950Ym.A1E(AoX, 10));
                Iterator it11 = AoX.iterator();
                while (it11.hasNext()) {
                    arrayList90.add(((InterfaceC43531JKr) it11.next()).Es5());
                }
            } else {
                arrayList90 = null;
            }
            obj.A0Q(arrayList90);
        }
        if (AbstractC009903n.A0P(setFields, -540293)) {
            List AoY = AoY();
            if (AoY != null) {
                arrayList89 = new ArrayList(AbstractC06950Ym.A1E(AoY, 10));
                Iterator it12 = AoY.iterator();
                while (it12.hasNext()) {
                    arrayList89.add(((InterfaceC43532JKs) it12.next()).Es7());
                }
            } else {
                arrayList89 = null;
            }
            obj.A0R(arrayList89);
        }
        if (AbstractC009903n.A0P(setFields, 1377047637)) {
            InterfaceC31132DmF AoZ = AoZ();
            if (AoZ != null) {
                c26214Bie = AoZ.F4d(c1dy);
            } else {
                c26214Bie = null;
            }
            obj.A0E(c26214Bie);
        }
        if (AbstractC009903n.A0P(setFields, -1471805179)) {
            obj.A4V = Aob();
        }
        if (AbstractC009903n.A0P(setFields, 2007135493)) {
            obj.A8B = Aoc();
        }
        if (AbstractC009903n.A0P(setFields, -1895222071)) {
            List Aod = Aod();
            if (Aod != null) {
                arrayList88 = new ArrayList(AbstractC06950Ym.A1E(Aod, 10));
                Iterator it13 = Aod.iterator();
                while (it13.hasNext()) {
                    arrayList88.add(((YR3) it13.next()).F3G(c1dy));
                }
            } else {
                arrayList88 = null;
            }
            obj.A0S(arrayList88);
        }
        if (AbstractC009903n.A0P(setFields, 1378030330)) {
            ClipsTrialDict Aog = Aog();
            if (Aog != null) {
                clipsTrialDictImpl = Aog.EsH();
            } else {
                clipsTrialDictImpl = null;
            }
            obj.ERb(clipsTrialDictImpl);
        }
        if (AbstractC009903n.A0P(setFields, 6469871)) {
            obj.A2k = Aoo();
        }
        if (AbstractC009903n.A0P(setFields, -775568935)) {
            obj.A8C = this.A0P._coauthorProducers$fbandroid_java_com_instagram_feed_media_media(c1dy);
        }
        if (AbstractC009903n.A0P(setFields, 3059181)) {
            obj.A5R = getCode();
        }
        if (AbstractC009903n.A0P(setFields, -757942401)) {
            CollabFollowButtonInfo Aos = Aos();
            if (Aos != null) {
                collabFollowButtonInfoImpl = Aos.EsI();
            } else {
                collabFollowButtonInfoImpl = null;
            }
            obj.A0F = collabFollowButtonInfoImpl;
        }
        if (AbstractC009903n.A0P(setFields, -1133898784)) {
            obj.A5S = Ap2();
        }
        if (AbstractC009903n.A0P(setFields, -1491102973)) {
            obj.A8D = this.A0P._collectionMedia$fbandroid_java_com_instagram_feed_media_media(c1dy);
        }
        if (AbstractC009903n.A0P(setFields, -684519374)) {
            obj.A0G = Ap7();
        }
        if (AbstractC009903n.A0P(setFields, -684450058)) {
            obj.A4W = Ap8();
        }
        if (AbstractC009903n.A0P(setFields, 323103855)) {
            obj.A5T = ApA();
        }
        if (AbstractC009903n.A0P(setFields, -1120985297)) {
            obj.A4X = ApY();
        }
        if (AbstractC009903n.A0P(setFields, 127934722)) {
            InterfaceC38941rT Apc = Apc();
            if (Apc != null) {
                c38921rR = Apc.EsR().EsR();
            } else {
                c38921rR = null;
            }
            obj.A0I = c38921rR;
        }
        if (AbstractC009903n.A0P(setFields, -1399143784)) {
            IGCommentSheetMoreInfo Apg = Apg();
            if (Apg != null) {
                iGCommentSheetMoreInfoImpl = Apg.Euc().Euc();
            } else {
                iGCommentSheetMoreInfoImpl = null;
            }
            obj.A0m = iGCommentSheetMoreInfoImpl;
        }
        if (AbstractC009903n.A0P(setFields, 536742607)) {
            obj.A2l = Apl();
        }
        if (AbstractC009903n.A0P(setFields, -602415628)) {
            List Apm = Apm();
            if (Apm != null) {
                arrayList87 = new ArrayList(AbstractC06950Ym.A1E(Apm, 10));
                Iterator it14 = Apm.iterator();
                while (it14.hasNext()) {
                    arrayList87.add(((InterfaceC38901rP) it14.next()).F4U(c1dy));
                }
            } else {
                arrayList87 = null;
            }
            obj.A0T(arrayList87);
        }
        if (AbstractC009903n.A0P(setFields, 536608871)) {
            obj.A2m = Apn();
        }
        if (AbstractC009903n.A0P(setFields, -2041258099)) {
            obj.A5U = App();
        }
        if (AbstractC009903n.A0P(setFields, -513204708)) {
            obj.A5V = this.A0P.getConnectionId();
        }
        if (AbstractC009903n.A0P(setFields, -1248396905)) {
            InterfaceC43506JJs AqQ = AqQ();
            if (AqQ != null) {
                c38246Grp = AqQ.Eud().Eud();
            } else {
                c38246Grp = null;
            }
            obj.A0n = c38246Grp;
        }
        if (AbstractC009903n.A0P(setFields, 663558324)) {
            JKD Ar6 = Ar6();
            if (Ar6 != null) {
                c38709H2v = Ar6.EsW();
            } else {
                c38709H2v = null;
            }
            obj.ES4(c38709H2v);
        }
        if (AbstractC009903n.A0P(setFields, -1068340300)) {
            JMR ArZ = ArZ();
            if (ArZ != null) {
                c38711H2x = ArZ.Esa(c1dy);
            } else {
                c38711H2x = null;
            }
            obj.A00(c38711H2x);
        }
        if (AbstractC009903n.A0P(setFields, 867506662)) {
            JM3 Arn = Arn();
            if (Arn != null) {
                c38712H2y = Arn.Esc(c1dy);
            } else {
                c38712H2y = null;
            }
            obj.A01(c38712H2y);
        }
        if (AbstractC009903n.A0P(setFields, 557393094)) {
            InterfaceC120925dk AsX = AsX();
            if (AsX != null) {
                c120915dj = AsX.Ese(c1dy);
            } else {
                c120915dj = null;
            }
            obj.A02(c120915dj);
        }
        if (AbstractC009903n.A0P(setFields, -195982014)) {
            obj.A2n = Asd();
        }
        if (AbstractC009903n.A0P(setFields, -1502552622)) {
            CreativeConfigIntf Asm = Asm();
            if (Asm != null) {
                creativeConfig = Asm.F4X(c1dy);
            } else {
                creativeConfig = null;
            }
            obj.ESQ(creativeConfig);
        }
        if (AbstractC009903n.A0P(setFields, 1963095235)) {
            InterfaceC104804nl Aso = Aso();
            if (Aso != null) {
                c52r = Aso.Esh().Esh();
            } else {
                c52r = null;
            }
            obj.A0N = c52r;
        }
        if (AbstractC009903n.A0P(setFields, -1575179043)) {
            CreatorDigestSignalInfo Asu = Asu();
            if (Asu != null) {
                creatorDigestSignalInfoImpl = Asu.Esj().Esj();
            } else {
                creatorDigestSignalInfoImpl = null;
            }
            obj.A0O = creatorDigestSignalInfoImpl;
        }
        if (AbstractC009903n.A0P(setFields, -875271851)) {
            List At7 = At7();
            if (At7 != null) {
                arrayList86 = new ArrayList(AbstractC06950Ym.A1E(At7, 10));
                Iterator it15 = At7.iterator();
                while (it15.hasNext()) {
                    arrayList86.add(((JLM) it15.next()).Esn());
                }
            } else {
                arrayList86 = null;
            }
            obj.A0U(arrayList86);
        }
        if (AbstractC009903n.A0P(setFields, 1398214880)) {
            obj.A8E = AtP();
        }
        if (AbstractC009903n.A0P(setFields, -1066362962)) {
            JLN AtQ = AtQ();
            if (AtQ != null) {
                h32 = AtQ.Et1().Et1();
            } else {
                h32 = null;
            }
            obj.A0P = h32;
        }
        if (AbstractC009903n.A0P(setFields, -1198606503)) {
            obj.A8F = Atw();
        }
        if (AbstractC009903n.A0P(setFields, 1239998880)) {
            C46p Atz = Atz();
            if (Atz != null) {
                c46o = Atz.Et2();
            } else {
                c46o = null;
            }
            obj.A0Q = c46o;
        }
        if (AbstractC009903n.A0P(setFields, 30735651)) {
            obj.A5W = Au2();
        }
        if (AbstractC009903n.A0P(setFields, 773495299)) {
            List AvR = AvR();
            if (AvR != null) {
                arrayList85 = new ArrayList(AbstractC06950Ym.A1E(AvR, 10));
                Iterator it16 = AvR.iterator();
                while (it16.hasNext()) {
                    arrayList85.add(((JKF) it16.next()).Et4());
                }
            } else {
                arrayList85 = null;
            }
            obj.A0V(arrayList85);
        }
        if (AbstractC009903n.A0P(setFields, -2112149527)) {
            List AvS = AvS();
            if (AvS != null) {
                arrayList84 = new ArrayList(AbstractC06950Ym.A1E(AvS, 10));
                Iterator it17 = AvS.iterator();
                while (it17.hasNext()) {
                    arrayList84.add(((InterfaceC1118152j) it17.next()).Et3());
                }
            } else {
                arrayList84 = null;
            }
            obj.ESq(arrayList84);
        }
        if (AbstractC009903n.A0P(setFields, 2138226986)) {
            obj.A4Y = Awg();
        }
        if (AbstractC009903n.A0P(setFields, -338558095)) {
            obj.A5X = AxV();
        }
        if (AbstractC009903n.A0P(setFields, -778586043)) {
            obj.A55 = Axc();
        }
        if (AbstractC009903n.A0P(setFields, -1640928317)) {
            obj.A5Y = Axf();
        }
        if (AbstractC009903n.A0P(setFields, 1367641622)) {
            obj.A2o = Axw();
        }
        if (AbstractC009903n.A0P(setFields, 432371099)) {
            obj.A5Z = AyB();
        }
        if (AbstractC009903n.A0P(setFields, 1714924804)) {
            obj.A5a = getDominantColor();
        }
        if (AbstractC009903n.A0P(setFields, -1412160885)) {
            InterfaceC43547JLh Ayz = Ayz();
            if (Ayz != null) {
                c38823H7r = Ayz.F6o(c1dy);
            } else {
                c38823H7r = null;
            }
            obj.A0I(c38823H7r);
        }
        if (AbstractC009903n.A0P(setFields, -1455474081)) {
            obj.A4Z = Azw();
        }
        if (AbstractC009903n.A0P(setFields, -101001172)) {
            ImmutablePandoUserDict immutablePandoUserDict = (ImmutablePandoUserDict) this.A0P.A05(-101001172, ImmutablePandoUserDict.class);
            if (immutablePandoUserDict != null) {
                Parcelable.Creator creator = User.CREATOR;
                user8 = AbstractC38851rI.A01(c1dy, immutablePandoUserDict);
            } else {
                user8 = null;
            }
            obj.A2R = user8;
        }
        if (AbstractC009903n.A0P(setFields, -1541911372)) {
            obj.A5b = Azz();
        }
        if (AbstractC009903n.A0P(setFields, 986649031)) {
            obj.A5c = B01();
        }
        if (AbstractC009903n.A0P(setFields, 1975633250)) {
            obj.A4a = B03();
        }
        if (AbstractC009903n.A0P(setFields, 486741610)) {
            obj.A8G = this.A0P._e2eeMentionedUserList$fbandroid_java_com_instagram_feed_media_media(c1dy);
        }
        if (AbstractC009903n.A0P(setFields, -416533547)) {
            obj.A2p = B1W();
        }
        if (AbstractC009903n.A0P(setFields, -545107410)) {
            obj.A2q = B1Z();
        }
        if (AbstractC009903n.A0P(setFields, -1341343804)) {
            obj.A2r = B1l();
        }
        if (AbstractC009903n.A0P(setFields, 433558974)) {
            JKG B2f = B2f();
            if (B2f != null) {
                h3a = B2f.EtD().EtD();
            } else {
                h3a = null;
            }
            obj.A0R = h3a;
        }
        if (AbstractC009903n.A0P(setFields, 31792438)) {
            obj.A56 = B3E();
        }
        if (AbstractC009903n.A0P(setFields, -1309148525)) {
            InterfaceC88353wq B3J = B3J();
            if (B3J != null) {
                c88343wp = B3J.EtF();
            } else {
                c88343wp = null;
            }
            obj.A0S = c88343wp;
        }
        if (AbstractC009903n.A0P(setFields, -2014276605)) {
            obj.A5d = B3K();
        }
        if (AbstractC009903n.A0P(setFields, -64566079)) {
            InterfaceC84443pn B3L = B3L();
            if (B3L != null) {
                c84433pm3 = B3L.EtX();
            } else {
                c84433pm3 = null;
            }
            obj.ETz(c84433pm3);
        }
        if (AbstractC009903n.A0P(setFields, -1494861055)) {
            obj.A5e = B3P();
        }
        if (AbstractC009903n.A0P(setFields, 1204075378)) {
            obj.A8H = this.A0P._facepileTopLikers$fbandroid_java_com_instagram_feed_media_media(c1dy);
        }
        if (AbstractC009903n.A0P(setFields, -728103700)) {
            obj.A4b = B4a();
        }
        if (AbstractC009903n.A0P(setFields, 198726090)) {
            obj.A4c = B4k();
        }
        if (AbstractC009903n.A0P(setFields, 266416098)) {
            obj.A5f = B4v();
        }
        if (AbstractC009903n.A0P(setFields, -1392753753)) {
            obj.A4d = B4w();
        }
        if (AbstractC009903n.A0P(setFields, -875432886)) {
            InterfaceC39001rZ B57 = B57();
            if (B57 != null) {
                c38991rY = B57.EtO().EtO();
            } else {
                c38991rY = null;
            }
            obj.A0T = c38991rY;
        }
        if (AbstractC009903n.A0P(setFields, -477331643)) {
            obj.A4e = B58();
        }
        if (AbstractC009903n.A0P(setFields, 3136215)) {
            obj.A5g = B5E();
        }
        if (AbstractC009903n.A0P(setFields, -363400619)) {
            List B5P = B5P();
            if (B5P != null) {
                arrayList83 = new ArrayList(AbstractC06950Ym.A1E(B5P, 10));
                Iterator it18 = B5P.iterator();
                while (it18.hasNext()) {
                    arrayList83.add(((InterfaceC43546JLg) it18.next()).F63(c1dy));
                }
            } else {
                arrayList83 = null;
            }
            obj.A0W(arrayList83);
        }
        if (AbstractC009903n.A0P(setFields, 644378918)) {
            JLW B5Q = B5Q();
            if (B5Q != null) {
                h59 = B5Q.EzW().EzW();
            } else {
                h59 = null;
            }
            obj.A1c = h59;
        }
        if (AbstractC009903n.A0P(setFields, -597943359)) {
            JKH B5e = B5e();
            if (B5e != null) {
                h3k = B5e.EtU().EtU();
            } else {
                h3k = null;
            }
            obj.A0U = h3k;
        }
        if (AbstractC009903n.A0P(setFields, -813354252)) {
            C3XK B5f = B5f();
            if (B5f != null) {
                c3xj = B5f.EtW();
            } else {
                c3xj = null;
            }
            obj.A0V = c3xj;
        }
        if (AbstractC009903n.A0P(setFields, 1604778262)) {
            InterfaceC84443pn B5g = B5g();
            if (B5g != null) {
                c84433pm2 = B5g.EtX();
            } else {
                c84433pm2 = null;
            }
            obj.EUM(c84433pm2);
        }
        if (AbstractC009903n.A0P(setFields, 518596130)) {
            InterfaceC104834np B5i = B5i();
            if (B5i != null) {
                c114585Fe = B5i.EtY().EtY();
            } else {
                c114585Fe = null;
            }
            obj.A0b = c114585Fe;
        }
        if (AbstractC009903n.A0P(setFields, -1249826898)) {
            InterfaceC43558JLs B5l = B5l();
            if (B5l != null) {
                h40 = B5l.Evk().Evk();
            } else {
                h40 = null;
            }
            obj.A0v = h40;
        }
        if (AbstractC009903n.A0P(setFields, 1636259750)) {
            InterfaceC104934o6 B5q = B5q();
            if (B5q != null) {
                c51l = B5q.ExV();
            } else {
                c51l = null;
            }
            obj.EUN(c51l);
        }
        if (AbstractC009903n.A0P(setFields, 390919056)) {
            InterfaceC84443pn B5w = B5w();
            if (B5w != null) {
                c84433pm = B5w.EtX();
            } else {
                c84433pm = null;
            }
            obj.EUP(c84433pm);
        }
        if (AbstractC009903n.A0P(setFields, -2018769517)) {
            JMF B5y = B5y();
            if (B5y != null) {
                h7m = B5y.F4b(c1dy);
            } else {
                h7m = null;
            }
            obj.A0D(h7m);
        }
        if (AbstractC009903n.A0P(setFields, 1888886538)) {
            obj.A5h = B5z();
        }
        if (AbstractC009903n.A0P(setFields, -258333186)) {
            List B6I = B6I();
            if (B6I != null) {
                arrayList82 = new ArrayList(AbstractC06950Ym.A1E(B6I, 10));
                Iterator it19 = B6I.iterator();
                while (it19.hasNext()) {
                    arrayList82.add(((FileCandidate) it19.next()).Ete());
                }
            } else {
                arrayList82 = null;
            }
            obj.A0X(arrayList82);
        }
        if (AbstractC009903n.A0P(setFields, 1657575607)) {
            List B74 = B74();
            if (B74 != null) {
                arrayList81 = new ArrayList(AbstractC06950Ym.A1E(B74, 10));
                Iterator it20 = B74.iterator();
                while (it20.hasNext()) {
                    arrayList81.add(((XDTLazyFloatingContextItem) it20.next()).F41(c1dy));
                }
            } else {
                arrayList81 = null;
            }
            obj.A0Y(arrayList81);
        }
        if (AbstractC009903n.A0P(setFields, 725899023)) {
            Hashtag B7K = B7K();
            if (B7K != null) {
                hashtagImpl = B7K.F59();
            } else {
                hashtagImpl = null;
            }
            obj.EUh(hashtagImpl);
        }
        if (AbstractC009903n.A0P(setFields, -2145222042)) {
            InterfaceC39031rc B99 = B99();
            if (B99 != null) {
                c39021rb = B99.Ezr();
            } else {
                c39021rb = null;
            }
            obj.EUt(c39021rb);
        }
        if (AbstractC009903n.A0P(setFields, -1145007197)) {
            InterfaceC39061rf B9X = B9X();
            if (B9X != null) {
                c39051re = B9X.Ev8().Ev8();
            } else {
                c39051re = null;
            }
            obj.A0p = c39051re;
        }
        if (AbstractC009903n.A0P(setFields, -1225461739)) {
            InterfaceC105354oy B9d = B9d();
            if (B9d != null) {
                c105344ox = B9d.F5g();
            } else {
                c105344ox = null;
            }
            obj.A2D = c105344ox;
        }
        if (AbstractC009903n.A0P(setFields, -1436406007)) {
            CommentGiphyMediaInfoIntf B9s = B9s();
            if (B9s != null) {
                commentGiphyMediaInfo = B9s.EsP().EsP();
            } else {
                commentGiphyMediaInfo = null;
            }
            obj.A0H = commentGiphyMediaInfo;
        }
        if (AbstractC009903n.A0P(setFields, -2015403611)) {
            GoalsToastInfo BAB = BAB();
            if (BAB != null) {
                goalsToastInfoImpl = BAB.Etu().Etu();
            } else {
                goalsToastInfoImpl = null;
            }
            obj.A0f = goalsToastInfoImpl;
        }
        if (AbstractC009903n.A0P(setFields, 98629247)) {
            ImmutablePandoUserDict immutablePandoUserDict2 = (ImmutablePandoUserDict) this.A0P.A05(98629247, ImmutablePandoUserDict.class);
            if (immutablePandoUserDict2 != null) {
                Parcelable.Creator creator2 = User.CREATOR;
                user7 = AbstractC38851rI.A01(c1dy, immutablePandoUserDict2);
            } else {
                user7 = null;
            }
            obj.A2S = user7;
        }
        if (AbstractC009903n.A0P(setFields, 984005001)) {
            List BAb = BAb();
            if (BAb != null) {
                arrayList80 = new ArrayList(AbstractC06950Ym.A1E(BAb, 10));
                Iterator it21 = BAb.iterator();
                while (it21.hasNext()) {
                    arrayList80.add(((InterfaceC73622YQk) it21.next()).F0g(c1dy));
                }
            } else {
                arrayList80 = null;
            }
            obj.A0Z(arrayList80);
        }
        if (AbstractC009903n.A0P(setFields, 2128416018)) {
            JMX BAo = BAo();
            if (BAo != null) {
                h7n = BAo.F4f(c1dy);
            } else {
                h7n = null;
            }
            obj.A0F(h7n);
        }
        if (AbstractC009903n.A0P(setFields, -47685686)) {
            InterfaceC1816483t BAr = BAr();
            if (BAr != null) {
                h3w = BAr.Eu5().Eu5();
            } else {
                h3w = null;
            }
            obj.A0g = h3w;
        }
        if (AbstractC009903n.A0P(setFields, 53851633)) {
            obj.A2s = BB7();
        }
        if (AbstractC009903n.A0P(setFields, 1995222060)) {
            obj.A2t = BBC();
        }
        if (AbstractC009903n.A0P(setFields, 907460721)) {
            obj.A2u = BBQ();
        }
        if (AbstractC009903n.A0P(setFields, 1880618633)) {
            obj.A2v = BBg();
        }
        if (AbstractC009903n.A0P(setFields, -648860137)) {
            obj.A2w = BBi();
        }
        if (AbstractC009903n.A0P(setFields, 494877882)) {
            obj.A2x = BBn();
        }
        if (AbstractC009903n.A0P(setFields, -488463036)) {
            obj.A2y = BBq();
        }
        if (AbstractC009903n.A0P(setFields, 185864850)) {
            obj.A2z = BBr();
        }
        if (AbstractC009903n.A0P(setFields, 63659464)) {
            obj.A30 = BC1();
        }
        if (AbstractC009903n.A0P(setFields, 1242246392)) {
            obj.A31 = BCD();
        }
        if (AbstractC009903n.A0P(setFields, 947254380)) {
            obj.A32 = BCa();
        }
        if (AbstractC009903n.A0P(setFields, 2132958763)) {
            obj.A4f = BCe();
        }
        if (AbstractC009903n.A0P(setFields, 160186751)) {
            obj.A4g = BCf();
        }
        if (AbstractC009903n.A0P(setFields, 1572653997)) {
            obj.A33 = BCq();
        }
        if (AbstractC009903n.A0P(setFields, -1472279412)) {
            obj.A34 = BCr();
        }
        if (AbstractC009903n.A0P(setFields, -971305057)) {
            obj.A35 = BCz();
        }
        if (AbstractC009903n.A0P(setFields, 410543582)) {
            obj.A36 = BD0();
        }
        if (AbstractC009903n.A0P(setFields, -1115058732)) {
            InterfaceC38901rP BDL = BDL();
            if (BDL != null) {
                c38891rO = BDL.F4U(c1dy);
            } else {
                c38891rO = null;
            }
            obj.A0C(c38891rO);
        }
        if (AbstractC009903n.A0P(setFields, 1469007609)) {
            obj.A37 = BDv();
        }
        if (AbstractC009903n.A0P(setFields, 1890857534)) {
            obj.A8I = BE4();
        }
        if (AbstractC009903n.A0P(setFields, -610819410)) {
            InterfaceC107774tM BEB = BEB();
            if (BEB != null) {
                c107764tL = BEB.EuA();
            } else {
                c107764tL = null;
            }
            obj.A0h = c107764tL;
        }
        if (AbstractC009903n.A0P(setFields, -854341578)) {
            obj.A8J = this.A0P._hscrollItems$fbandroid_java_com_instagram_feed_media_media(c1dy);
        }
        if (AbstractC009903n.A0P(setFields, -132744907)) {
            obj.A5i = BEO();
        }
        if (AbstractC009903n.A0P(setFields, -1799481222)) {
            InterfaceC88253wa BEY = BEY();
            if (BEY != null) {
                c88243wZ = BEY.EwJ();
            } else {
                c88243wZ = null;
            }
            obj.A14 = c88243wZ;
        }
        if (AbstractC009903n.A0P(setFields, 3355)) {
            obj.A5j = this.A0P.getId();
        }
        if (AbstractC009903n.A0P(setFields, -1831851926)) {
            IABPostClickDataDict BFg = BFg();
            if (BFg != null) {
                iABPostClickDataDictImpl = BFg.EuD().EuD();
            } else {
                iABPostClickDataDictImpl = null;
            }
            obj.A0i = iABPostClickDataDictImpl;
        }
        if (AbstractC009903n.A0P(setFields, -36069336)) {
            obj.A4h = BFk();
        }
        if (AbstractC009903n.A0P(setFields, -959391301)) {
            obj.A38 = BG2();
        }
        if (AbstractC009903n.A0P(setFields, -1627549179)) {
            obj.A4i = BG9();
        }
        if (AbstractC009903n.A0P(setFields, -508781350)) {
            InterfaceC84473pq BGH = BGH();
            if (BGH != null) {
                c84463pp = BGH.EuU();
            } else {
                c84463pp = null;
            }
            obj.EVw(c84463pp);
        }
        if (AbstractC009903n.A0P(setFields, -754836452)) {
            JLR BGK = BGK();
            if (BGK != null) {
                c38734H3x = BGK.EvZ();
            } else {
                c38734H3x = null;
            }
            obj.EVz(c38734H3x);
        }
        if (AbstractC009903n.A0P(setFields, 1576405975)) {
            JLS BGO = BGO();
            if (BGO != null) {
                c38735H3y = BGO.Eva();
            } else {
                c38735H3y = null;
            }
            obj.EW0(c38735H3y);
        }
        if (AbstractC009903n.A0P(setFields, 611464006)) {
            IGTVShoppingInfoIntf BGP = BGP();
            if (BGP != null) {
                iGTVShoppingInfo = BGP.F60(c1dy);
            } else {
                iGTVShoppingInfo = null;
            }
            obj.A0H(iGTVShoppingInfo);
        }
        if (AbstractC009903n.A0P(setFields, -1876344045)) {
            ImageInfo BGx = BGx();
            if (BGx != null) {
                imageInfoImpl = BGx.F5B();
            } else {
                imageInfoImpl = null;
            }
            obj.EW3(imageInfoImpl);
        }
        if (AbstractC009903n.A0P(setFields, -1267043538)) {
            InterfaceC43507JJt BH4 = BH4();
            if (BH4 != null) {
                h3z = BH4.Evg().Evg();
            } else {
                h3z = null;
            }
            obj.A0u = h3z;
        }
        if (AbstractC009903n.A0P(setFields, -1245297597)) {
            obj.A5k = BHD();
        }
        if (AbstractC009903n.A0P(setFields, -143133398)) {
            C5H8 BHc = BHc();
            if (BHc != null) {
                ur6 = BHc.Ex5().Ex5();
            } else {
                ur6 = null;
            }
            obj.A1G = ur6;
        }
        if (AbstractC009903n.A0P(setFields, 283678192)) {
            InterfaceC39541sb injected = getInjected();
            if (injected != null) {
                c39531sa = injected.F4u(c1dy);
            } else {
                c39531sa = null;
            }
            obj.EW9(c39531sa);
        }
        if (AbstractC009903n.A0P(setFields, -2006428187)) {
            obj.A5l = BHp();
        }
        if (AbstractC009903n.A0P(setFields, -9999968)) {
            obj.A4K = BHq();
        }
        if (AbstractC009903n.A0P(setFields, -993672649)) {
            obj.A5m = BIK();
        }
        if (AbstractC009903n.A0P(setFields, -1142947031)) {
            obj.A5n = BIt();
        }
        if (AbstractC009903n.A0P(setFields, -1799467938)) {
            obj.A5o = BJN();
        }
        if (AbstractC009903n.A0P(setFields, -1306716643)) {
            obj.A8K = this.A0P._invitedCoauthorProducers$fbandroid_java_com_instagram_feed_media_media(c1dy);
        }
        if (AbstractC009903n.A0P(setFields, 107582719)) {
            obj.A39 = CPU();
        }
        if (AbstractC009903n.A0P(setFields, 810011268)) {
            obj.A3A = CQ3();
        }
        if (AbstractC009903n.A0P(setFields, 1764375680)) {
            obj.A3B = CQC();
        }
        if (AbstractC009903n.A0P(setFields, -1880722099)) {
            obj.A3C = CQE();
        }
        if (AbstractC009903n.A0P(setFields, -1254240578)) {
            obj.A3D = CQR();
        }
        if (AbstractC009903n.A0P(setFields, 884528459)) {
            obj.A3E = CRM();
        }
        if (AbstractC009903n.A0P(setFields, -1873233069)) {
            obj.A3F = CRV();
        }
        if (AbstractC009903n.A0P(setFields, 1951265512)) {
            obj.A3G = CSD();
        }
        if (AbstractC009903n.A0P(setFields, -181834353)) {
            obj.A4j = CSN();
        }
        if (AbstractC009903n.A0P(setFields, -69686013)) {
            obj.A3H = CSa();
        }
        if (AbstractC009903n.A0P(setFields, -1766270183)) {
            obj.A3I = CSf();
        }
        if (AbstractC009903n.A0P(setFields, -301348514)) {
            obj.A3J = CTF();
        }
        if (AbstractC009903n.A0P(setFields, 177019097)) {
            obj.A3K = CTG();
        }
        if (AbstractC009903n.A0P(setFields, -1179770777)) {
            obj.A3L = CTu();
        }
        if (AbstractC009903n.A0P(setFields, 433212218)) {
            obj.A3M = CUW();
        }
        if (AbstractC009903n.A0P(setFields, 2144572139)) {
            obj.A3N = CUu();
        }
        if (AbstractC009903n.A0P(setFields, -1966983554)) {
            obj.A3O = CVB();
        }
        if (AbstractC009903n.A0P(setFields, 1957746194)) {
            obj.A3P = CVH();
        }
        if (AbstractC009903n.A0P(setFields, 1159580641)) {
            obj.A3Q = CWJ();
        }
        if (AbstractC009903n.A0P(setFields, 546393497)) {
            obj.A3R = CWy();
        }
        if (AbstractC009903n.A0P(setFields, -539271266)) {
            obj.A3S = CXO();
        }
        if (AbstractC009903n.A0P(setFields, -962559095)) {
            obj.A3T = CY5();
        }
        if (AbstractC009903n.A0P(setFields, 1451206513)) {
            obj.A3U = CZ2();
        }
        if (AbstractC009903n.A0P(setFields, -480636230)) {
            obj.A3V = CZp();
        }
        if (AbstractC009903n.A0P(setFields, 933367942)) {
            obj.A3W = Ca1();
        }
        if (AbstractC009903n.A0P(setFields, -1297484837)) {
            obj.A3X = CaG();
        }
        if (AbstractC009903n.A0P(setFields, 691621974)) {
            obj.A3Y = Caj();
        }
        if (AbstractC009903n.A0P(setFields, 1517048159)) {
            obj.A3Z = Cak();
        }
        if (AbstractC009903n.A0P(setFields, 2074792632)) {
            obj.A3a = Caz();
        }
        if (AbstractC009903n.A0P(setFields, 445113506)) {
            obj.A3b = CbQ();
        }
        if (AbstractC009903n.A0P(setFields, 1722627584)) {
            obj.A3c = CbS();
        }
        if (AbstractC009903n.A0P(setFields, -966722636)) {
            obj.A3d = Cbg();
        }
        if (AbstractC009903n.A0P(setFields, -1270569262)) {
            obj.A3e = Cbz();
        }
        if (AbstractC009903n.A0P(setFields, -1847416696)) {
            obj.A3f = Cc6();
        }
        if (AbstractC009903n.A0P(setFields, 1577113931)) {
            obj.A3g = CcB();
        }
        if (AbstractC009903n.A0P(setFields, 2082219120)) {
            obj.A3h = Ccb();
        }
        if (AbstractC009903n.A0P(setFields, 138640398)) {
            obj.A3i = Ccp();
        }
        if (AbstractC009903n.A0P(setFields, -56363563)) {
            obj.A3j = Cd6();
        }
        if (AbstractC009903n.A0P(setFields, 1748769892)) {
            obj.A3k = CdB();
        }
        if (AbstractC009903n.A0P(setFields, 389843936)) {
            obj.A3l = CdR();
        }
        if (AbstractC009903n.A0P(setFields, 863677169)) {
            obj.A3m = CdU();
        }
        if (AbstractC009903n.A0P(setFields, 1379091071)) {
            obj.A3n = Cdy();
        }
        if (AbstractC009903n.A0P(setFields, -1927920604)) {
            obj.A3o = CeB();
        }
        if (AbstractC009903n.A0P(setFields, 1226227249)) {
            obj.A3p = CeL();
        }
        if (AbstractC009903n.A0P(setFields, -1848057898)) {
            obj.A3q = Cf5();
        }
        if (AbstractC009903n.A0P(setFields, -605644948)) {
            obj.A3r = Cg4();
        }
        if (AbstractC009903n.A0P(setFields, 91831942)) {
            InterfaceC39571se BJz = BJz();
            if (BJz != null) {
                c39561sd = BJz.Eyq().Eyq();
            } else {
                c39561sd = null;
            }
            obj.A1Q = c39561sd;
        }
        if (AbstractC009903n.A0P(setFields, -2027308811)) {
            JM0 BL5 = BL5();
            if (BL5 != null) {
                c38817H7h = BL5.F5n().F5n();
            } else {
                c38817H7h = null;
            }
            obj.A2H = c38817H7h;
        }
        if (AbstractC009903n.A0P(setFields, 1180743147)) {
            obj.A57 = BLz();
        }
        if (AbstractC009903n.A0P(setFields, 106911)) {
            obj.A4L = BM8();
        }
        if (AbstractC009903n.A0P(setFields, -1232334165)) {
            YQS BMk = BMk();
            if (BMk != null) {
                xvz = BMk.F5h().F5h();
            } else {
                xvz = null;
            }
            obj.A2E = xvz;
        }
        if (AbstractC009903n.A0P(setFields, 1810752271)) {
            InterfaceC108064tp BMr = BMr();
            if (BMr != null) {
                c108054to = BMr.Euo();
            } else {
                c108054to = null;
            }
            obj.A0o = c108054to;
        }
        if (AbstractC009903n.A0P(setFields, -1301662067)) {
            obj.A3s = BNB();
        }
        if (AbstractC009903n.A0P(setFields, -792455577)) {
            obj.A4k = BNC();
        }
        if (AbstractC009903n.A0P(setFields, 2103878726)) {
            InterfaceC43570JMe BNF = BNF();
            if (BNF != null) {
                h44 = BNF.Evr().Evr();
            } else {
                h44 = null;
            }
            obj.A0w = h44;
        }
        if (AbstractC009903n.A0P(setFields, 3321850)) {
            obj.A5p = BNL();
        }
        if (AbstractC009903n.A0P(setFields, -1410034208)) {
            obj.A5q = BNP();
        }
        if (AbstractC009903n.A0P(setFields, -2090459114)) {
            obj.A8L = BNS();
        }
        if (AbstractC009903n.A0P(setFields, -1624294830)) {
            obj.A5r = BNT();
        }
        if (AbstractC009903n.A0P(setFields, 107301)) {
            obj.A4M = BO9();
        }
        if (AbstractC009903n.A0P(setFields, 1901043637)) {
            LocationDictIntf BOL = BOL();
            if (BOL != null) {
                locationDict = BOL.F6g();
            } else {
                locationDict = null;
            }
            obj.EYW(locationDict);
        }
        if (AbstractC009903n.A0P(setFields, 764203016)) {
            obj.A5s = this.A0P.getLoggingInfoToken();
        }
        if (AbstractC009903n.A0P(setFields, -1536237344)) {
            InterfaceC43508JJu BPR = BPR();
            if (BPR != null) {
                h47 = BPR.Ew9().Ew9();
            } else {
                h47 = null;
            }
            obj.A0y = h47;
        }
        if (AbstractC009903n.A0P(setFields, 840689681)) {
            obj.A5t = BPW();
        }
        if (AbstractC009903n.A0P(setFields, -1255143223)) {
            InterfaceC84163p3 BPh = BPh();
            if (BPh != null) {
                c84153p2 = BPh.F4G(c1dy);
            } else {
                c84153p2 = null;
            }
            obj.EYe(c84153p2);
        }
        if (AbstractC009903n.A0P(setFields, 1707368972)) {
            JKO BQQ = BQQ();
            if (BQQ != null) {
                h4a = BQQ.EwC();
            } else {
                h4a = null;
            }
            obj.EYk(h4a);
        }
        if (AbstractC009903n.A0P(setFields, 1758667881)) {
            C46j BQT = BQT();
            if (BQT != null) {
                c102724k92 = BQT.Ez3();
            } else {
                c102724k92 = null;
            }
            obj.A1S = c102724k92;
        }
        if (AbstractC009903n.A0P(setFields, 104103344)) {
            InterfaceC88303wh BQc = BQc();
            if (BQc != null) {
                c88293wg = BQc.EwG();
            } else {
                c88293wg = null;
            }
            obj.EYo(c88293wg);
        }
        if (AbstractC009903n.A0P(setFields, 1250316885)) {
            obj.A1w = null;
        }
        if (AbstractC009903n.A0P(setFields, 24203242)) {
            BrandedContentGatingInfoIntf BQl = BQl();
            if (BQl != null) {
                brandedContentGatingInfo = BQl.ErN().ErN();
            } else {
                brandedContentGatingInfo = null;
            }
            obj.A06 = brandedContentGatingInfo;
        }
        if (AbstractC009903n.A0P(setFields, 1079361543)) {
            obj.A4l = BR9();
        }
        if (AbstractC009903n.A0P(setFields, 484037292)) {
            obj.A12 = BRD();
        }
        if (AbstractC009903n.A0P(setFields, 1853785056)) {
            C52O BRH = BRH();
            if (BRH != null) {
                c52n = BRH.EwK().EwK();
            } else {
                c52n = null;
            }
            obj.A15 = c52n;
        }
        if (AbstractC009903n.A0P(setFields, 763558)) {
            InterfaceC84363pT BRI = BRI();
            if (BRI != null) {
                c84353pS = BRI.EwM(c1dy);
            } else {
                c84353pS = null;
            }
            obj.EYv(c84353pS);
        }
        if (AbstractC009903n.A0P(setFields, 23673747)) {
            JM6 BRJ = BRJ();
            if (BRJ != null) {
                h4b = BRJ.EwO();
            } else {
                h4b = null;
            }
            obj.EYw(h4b);
        }
        if (AbstractC009903n.A0P(setFields, -1513490504)) {
            InterfaceC109094vY BRN = BRN();
            if (BRN != null) {
                c109084vX = BRN.EwP();
            } else {
                c109084vX = null;
            }
            obj.EYy(c109084vX);
        }
        if (AbstractC009903n.A0P(setFields, -1333549622)) {
            InterfaceC31134DmH BRQ = BRQ();
            if (BRQ != null) {
                h4c = BRQ.EwR(c1dy);
            } else {
                h4c = null;
            }
            obj.A04(h4c);
        }
        if (AbstractC009903n.A0P(setFields, 1939875509)) {
            obj.A4m = BRq();
        }
        if (AbstractC009903n.A0P(setFields, 1939898463)) {
            JKU BS1 = BS1();
            if (BS1 != null) {
                h57 = BS1.EzN().EzN();
            } else {
                h57 = null;
            }
            obj.A1Z = h57;
        }
        if (AbstractC009903n.A0P(setFields, -954145143)) {
            obj.A3t = BSN();
        }
        if (AbstractC009903n.A0P(setFields, -1214754393)) {
            List BT5 = BT5();
            if (BT5 != null) {
                arrayList79 = new ArrayList(AbstractC06950Ym.A1E(BT5, 10));
                Iterator it22 = BT5.iterator();
                while (it22.hasNext()) {
                    arrayList79.add(((InterfaceC73614YQc) it22.next()).F0C(c1dy));
                }
            } else {
                arrayList79 = null;
            }
            obj.A0a(arrayList79);
        }
        if (AbstractC009903n.A0P(setFields, 836827158)) {
            List BTE = BTE();
            if (BTE != null) {
                arrayList78 = new ArrayList(AbstractC06950Ym.A1E(BTE, 10));
                Iterator it23 = BTE.iterator();
                while (it23.hasNext()) {
                    arrayList78.add(((XDTMetaAIMediaSuggestedPromptInfo) it23.next()).F43());
                }
            } else {
                arrayList78 = null;
            }
            obj.A0b(arrayList78);
        }
        if (AbstractC009903n.A0P(setFields, 1208154701)) {
            MetaPlaceDict BTL = BTL();
            if (BTL != null) {
                metaPlaceDictImpl = BTL.Ewg().Ewg();
            } else {
                metaPlaceDictImpl = null;
            }
            obj.A1B = metaPlaceDictImpl;
        }
        if (AbstractC009903n.A0P(setFields, 1127190199)) {
            obj.A5u = this.A0P.getMezqlToken();
        }
        if (AbstractC009903n.A0P(setFields, 1230482632)) {
            obj.A1C = BUm();
        }
        if (AbstractC009903n.A0P(setFields, 1655419129)) {
            obj.A3u = BUu();
        }
        if (AbstractC009903n.A0P(setFields, 1813098328)) {
            InterfaceC87803vo BUx = BUx();
            if (BUx != null) {
                c87793vn = BUx.Ewr();
            } else {
                c87793vn = null;
            }
            obj.A1D = c87793vn;
        }
        if (AbstractC009903n.A0P(setFields, -346898653)) {
            JMJ BVD = BVD();
            if (BVD != null) {
                h4k = BVD.Ewv();
            } else {
                h4k = null;
            }
            obj.EZI(h4k);
        }
        if (AbstractC009903n.A0P(setFields, 477739665)) {
            obj.A8M = BVM();
        }
        if (AbstractC009903n.A0P(setFields, 384096265)) {
            C3XR musicMetadata = getMusicMetadata();
            if (musicMetadata != null) {
                c3xq = musicMetadata.Ex0(c1dy);
            } else {
                c3xq = null;
            }
            obj.EZM(c3xq);
        }
        if (AbstractC009903n.A0P(setFields, 1422949584)) {
            obj.A5v = BW0();
        }
        if (AbstractC009903n.A0P(setFields, -940244591)) {
            obj.A3v = BWK();
        }
        if (AbstractC009903n.A0P(setFields, -438213353)) {
            JKM BYh = BYh();
            if (BYh != null) {
                c38733H3w = BYh.EvY().EvY();
            } else {
                c38733H3w = null;
            }
            obj.A0r = c38733H3w;
        }
        if (AbstractC009903n.A0P(setFields, -1562871028)) {
            InterfaceC114655Fv BYz = BYz();
            if (BYz != null) {
                c114645Fu = BYz.F50();
            } else {
                c114645Fu = null;
            }
            obj.Ea7(c114645Fu);
        }
        if (AbstractC009903n.A0P(setFields, -2051778936)) {
            obj.A3w = BZ2();
        }
        if (AbstractC009903n.A0P(setFields, -1087068107)) {
            obj.A5w = BZ4();
        }
        if (AbstractC009903n.A0P(setFields, -354157272)) {
            obj.A1J = BZ5();
        }
        if (AbstractC009903n.A0P(setFields, -1704258212)) {
            obj.A5x = BZD();
        }
        if (AbstractC009903n.A0P(setFields, -1088565167)) {
            JLT BZV = BZV();
            if (BZV != null) {
                h4q = BZV.Exf().Exf();
            } else {
                h4q = null;
            }
            obj.A1K = h4q;
        }
        if (AbstractC009903n.A0P(setFields, -1088226595)) {
            obj.A1L = BZW();
        }
        if (AbstractC009903n.A0P(setFields, 1678213062)) {
            obj.A5y = BZb();
        }
        if (AbstractC009903n.A0P(setFields, -1133964731)) {
            obj.A5z = getOrganicTrackingToken();
        }
        if (AbstractC009903n.A0P(setFields, -1174104782)) {
            obj.A60 = BZn();
        }
        if (AbstractC009903n.A0P(setFields, -636516523)) {
            obj.A4n = BZo();
        }
        if (AbstractC009903n.A0P(setFields, -750990338)) {
            obj.A3x = BZt();
        }
        if (AbstractC009903n.A0P(setFields, 1933097432)) {
            obj.A4o = Ba2();
        }
        if (AbstractC009903n.A0P(setFields, 924848935)) {
            obj.A61 = Baa();
        }
        if (AbstractC009903n.A0P(setFields, 285928380)) {
            obj.A62 = Bab();
        }
        if (AbstractC009903n.A0P(setFields, 2109037186)) {
            InterfaceC37266GbJ Bar = Bar();
            if (Bar != null) {
                c32074E7y = Bar.Exr().Exr();
            } else {
                c32074E7y = null;
            }
            obj.A1M = c32074E7y;
        }
        if (AbstractC009903n.A0P(setFields, 668433131)) {
            obj.A63 = BcQ();
        }
        if (AbstractC009903n.A0P(setFields, 1690439780)) {
            obj.A3y = Bcr();
        }
        if (AbstractC009903n.A0P(setFields, 3579)) {
            obj.A64 = getPk();
        }
        if (AbstractC009903n.A0P(setFields, 1911031876)) {
            obj.A4p = Bdm();
        }
        if (AbstractC009903n.A0P(setFields, -1729694999)) {
            obj.A58 = Bdu();
        }
        if (AbstractC009903n.A0P(setFields, 1065866756)) {
            obj.A65 = Bed();
        }
        if (AbstractC009903n.A0P(setFields, 1368503668)) {
            JKR Beu = Beu();
            if (Beu != null) {
                h4z = Beu.Ey5().Ey5();
            } else {
                h4z = null;
            }
            obj.A1N = h4z;
        }
        if (AbstractC009903n.A0P(setFields, 194771224)) {
            obj.A4q = Bey();
        }
        if (AbstractC009903n.A0P(setFields, 1092231610)) {
            obj.A66 = Bf7();
        }
        if (AbstractC009903n.A0P(setFields, -2060318524)) {
            InterfaceC31135DmI BfC = BfC();
            if (BfC != null) {
                c26215Bif = BfC.F4o(c1dy);
            } else {
                c26215Bif = null;
            }
            obj.EbE(c26215Bif);
        }
        if (AbstractC009903n.A0P(setFields, -1856112574)) {
            JK3 BfE = BfE();
            if (BfE != null) {
                h7q = BfE.F4q().F4q();
            } else {
                h7q = null;
            }
            obj.A25 = h7q;
        }
        if (AbstractC009903n.A0P(setFields, 1512748781)) {
            InterfaceC131055vt BfV = BfV();
            if (BfV != null) {
                c131045vs = BfV.Ey7().Ey7();
            } else {
                c131045vs = null;
            }
            obj.A1O = c131045vs;
        }
        if (AbstractC009903n.A0P(setFields, 413243079)) {
            InterfaceC106814ri BfZ = BfZ();
            if (BfZ != null) {
                c106804rh = BfZ.Ey8(c1dy);
            } else {
                c106804rh = null;
            }
            obj.A05(c106804rh);
        }
        if (AbstractC009903n.A0P(setFields, -318184504)) {
            obj.A67 = getPreview();
        }
        if (AbstractC009903n.A0P(setFields, 371453067)) {
            List Bfl = Bfl();
            if (Bfl != null) {
                arrayList77 = new ArrayList(AbstractC06950Ym.A1E(Bfl, 10));
                Iterator it24 = Bfl.iterator();
                while (it24.hasNext()) {
                    arrayList77.add(((InterfaceC38901rP) it24.next()).F4U(c1dy));
                }
            } else {
                arrayList77 = null;
            }
            obj.EbL(arrayList77);
        }
        if (AbstractC009903n.A0P(setFields, -2031807039)) {
            ImmutablePandoUserDict immutablePandoUserDict3 = (ImmutablePandoUserDict) this.A0P.A05(-2031807039, ImmutablePandoUserDict.class);
            if (immutablePandoUserDict3 != null) {
                Parcelable.Creator creator3 = User.CREATOR;
                user6 = AbstractC38851rI.A01(c1dy, immutablePandoUserDict3);
            } else {
                user6 = null;
            }
            obj.A2T = user6;
        }
        if (AbstractC009903n.A0P(setFields, -439786551)) {
            JMT Bgt = Bgt();
            if (Bgt != null) {
                h3l = Bgt.Etc(c1dy);
            } else {
                h3l = null;
            }
            obj.A03(h3l);
        }
        if (AbstractC009903n.A0P(setFields, -1752124513)) {
            List BhK = BhK();
            if (BhK != null) {
                arrayList76 = new ArrayList(AbstractC06950Ym.A1E(BhK, 10));
                Iterator it25 = BhK.iterator();
                while (it25.hasNext()) {
                    arrayList76.add(((JL5) it25.next()).EyP(c1dy));
                }
            } else {
                arrayList76 = null;
            }
            obj.A0c(arrayList76);
        }
        if (AbstractC009903n.A0P(setFields, 1014553961)) {
            InterfaceC111164zd BhM = BhM();
            if (BhM != null) {
                c111154zc = BhM.Eta(c1dy);
            } else {
                c111154zc = null;
            }
            obj.Ebd(c111154zc);
        }
        if (AbstractC009903n.A0P(setFields, 1014577290)) {
            obj.A68 = getProductType();
        }
        if (AbstractC009903n.A0P(setFields, -43457476)) {
            obj.A3z = Bhl();
        }
        if (AbstractC009903n.A0P(setFields, 1166266867)) {
            JKS BjJ = BjJ();
            if (BjJ != null) {
                c38752H4s = BjJ.Eyr().Eyr();
            } else {
                c38752H4s = null;
            }
            obj.A1R = c38752H4s;
        }
        if (AbstractC009903n.A0P(setFields, -958861155)) {
            List Bjd = Bjd();
            if (Bjd != null) {
                arrayList75 = new ArrayList(AbstractC06950Ym.A1E(Bjd, 10));
                Iterator it26 = Bjd.iterator();
                while (it26.hasNext()) {
                    arrayList75.add(((JL6) it26.next()).Eyt());
                }
            } else {
                arrayList75 = null;
            }
            obj.A0d(arrayList75);
        }
        if (AbstractC009903n.A0P(setFields, 1582405670)) {
            obj.A69 = Bk6();
        }
        if (AbstractC009903n.A0P(setFields, -636642521)) {
            obj.A59 = Bk8();
        }
        if (AbstractC009903n.A0P(setFields, -1548326239)) {
            obj.A4N = BkJ();
        }
        if (AbstractC009903n.A0P(setFields, 467831673)) {
            obj.A4r = Bke();
        }
        if (AbstractC009903n.A0P(setFields, -1122997398)) {
            List Bkk = Bkk();
            if (Bkk != null) {
                arrayList74 = new ArrayList(AbstractC06950Ym.A1E(Bkk, 10));
                Iterator it27 = Bkk.iterator();
                while (it27.hasNext()) {
                    arrayList74.add(((JL7) it27.next()).Eyz());
                }
            } else {
                arrayList74 = null;
            }
            obj.Ec9(arrayList74);
        }
        if (AbstractC009903n.A0P(setFields, -1876959521)) {
            List Bl2 = Bl2();
            if (Bl2 != null) {
                arrayList73 = new ArrayList(AbstractC06950Ym.A1E(Bl2, 10));
                Iterator it28 = Bl2.iterator();
                while (it28.hasNext()) {
                    arrayList73.add(((JMS) it28.next()).Esp(c1dy));
                }
            } else {
                arrayList73 = null;
            }
            obj.A0e(arrayList73);
        }
        if (AbstractC009903n.A0P(setFields, 767120496)) {
            obj.A6A = Bl8();
        }
        if (AbstractC009903n.A0P(setFields, 1754751982)) {
            C46j Ble = Ble();
            if (Ble != null) {
                c102724k9 = Ble.Ez3();
            } else {
                c102724k9 = null;
            }
            obj.A1T = c102724k9;
        }
        if (AbstractC009903n.A0P(setFields, -301386674)) {
            List Blj = Blj();
            if (Blj != null) {
                arrayList72 = new ArrayList(AbstractC06950Ym.A1E(Blj, 10));
                Iterator it29 = Blj.iterator();
                while (it29.hasNext()) {
                    arrayList72.add(((AnonymousClass447) it29.next()).Ewb(c1dy));
                }
            } else {
                arrayList72 = null;
            }
            obj.A0f(arrayList72);
        }
        if (AbstractC009903n.A0P(setFields, 1883023793)) {
            InterfaceC31130DmD Bm3 = Bm3();
            if (Bm3 != null) {
                bvd = Bm3.Ez8().Ez8();
            } else {
                bvd = null;
            }
            obj.A1U = bvd;
        }
        if (AbstractC009903n.A0P(setFields, -954870693)) {
            MediaReminder BmO = BmO();
            if (BmO != null) {
                mediaReminderImpl = BmO.EwT();
            } else {
                mediaReminderImpl = null;
            }
            obj.EcW(mediaReminderImpl);
        }
        if (AbstractC009903n.A0P(setFields, 640623642)) {
            JML Bns = Bns();
            if (Bns != null) {
                h50 = Bns.Ez9(c1dy);
            } else {
                h50 = null;
            }
            obj.Eck(h50);
        }
        if (AbstractC009903n.A0P(setFields, 1456374940)) {
            obj.A4s = BoO();
        }
        if (AbstractC009903n.A0P(setFields, -1810364042)) {
            ImmutablePandoUserDict immutablePandoUserDict4 = (ImmutablePandoUserDict) this.A0P.A05(-1810364042, ImmutablePandoUserDict.class);
            if (immutablePandoUserDict4 != null) {
                Parcelable.Creator creator4 = User.CREATOR;
                user5 = AbstractC38851rI.A01(c1dy, immutablePandoUserDict4);
            } else {
                user5 = null;
            }
            obj.A2U = user5;
        }
        if (AbstractC009903n.A0P(setFields, 1625671202)) {
            ImmutablePandoUserDict immutablePandoUserDict5 = (ImmutablePandoUserDict) this.A0P.A05(1625671202, ImmutablePandoUserDict.class);
            if (immutablePandoUserDict5 != null) {
                Parcelable.Creator creator5 = User.CREATOR;
                user4 = AbstractC38851rI.A01(c1dy, immutablePandoUserDict5);
            } else {
                user4 = null;
            }
            obj.A2V = user4;
        }
        if (AbstractC009903n.A0P(setFields, -1446568809)) {
            ImmutablePandoUserDict immutablePandoUserDict6 = (ImmutablePandoUserDict) this.A0P.A05(-1446568809, ImmutablePandoUserDict.class);
            if (immutablePandoUserDict6 != null) {
                Parcelable.Creator creator6 = User.CREATOR;
                user3 = AbstractC38851rI.A01(c1dy, immutablePandoUserDict6);
            } else {
                user3 = null;
            }
            obj.A2W = user3;
        }
        if (AbstractC009903n.A0P(setFields, 27230811)) {
            JLV BpH = BpH();
            if (BpH != null) {
                h53 = BpH.EzD();
            } else {
                h53 = null;
            }
            obj.Ecs(h53);
        }
        if (AbstractC009903n.A0P(setFields, -847496409)) {
            InterfaceC37274GbR BpQ = BpQ();
            if (BpQ != null) {
                e86 = BpQ.EzE().EzE();
            } else {
                e86 = null;
            }
            obj.A1X = e86;
        }
        if (AbstractC009903n.A0P(setFields, 1397728205)) {
            obj.A4t = BqH();
        }
        if (AbstractC009903n.A0P(setFields, -243648945)) {
            obj.A8N = BqM();
        }
        if (AbstractC009903n.A0P(setFields, -659357102)) {
            obj.A6B = Br9();
        }
        if (AbstractC009903n.A0P(setFields, -776209025)) {
            C5H7 Brw = Brw();
            if (Brw != null) {
                h56 = Brw.EzM().EzM();
            } else {
                h56 = null;
            }
            obj.A1Y = h56;
        }
        if (AbstractC009903n.A0P(setFields, 1902822812)) {
            obj.A8O = Bs0();
        }
        if (AbstractC009903n.A0P(setFields, -616714632)) {
            obj.A6C = BsX();
        }
        if (AbstractC009903n.A0P(setFields, 1979919582)) {
            obj.A8P = this.A0P._senders$fbandroid_java_com_instagram_feed_media_media(c1dy);
        }
        if (AbstractC009903n.A0P(setFields, -1980443649)) {
            obj.A6D = Bu3();
        }
        if (AbstractC009903n.A0P(setFields, 1638686732)) {
            obj.A40 = Bu7();
        }
        if (AbstractC009903n.A0P(setFields, 1066223914)) {
            ImmutablePandoUserDict immutablePandoUserDict7 = (ImmutablePandoUserDict) this.A0P.A05(1066223914, ImmutablePandoUserDict.class);
            if (immutablePandoUserDict7 != null) {
                Parcelable.Creator creator7 = User.CREATOR;
                user2 = AbstractC38851rI.A01(c1dy, immutablePandoUserDict7);
            } else {
                user2 = null;
            }
            obj.A2X = user2;
        }
        if (AbstractC009903n.A0P(setFields, 1928650089)) {
            obj.A8Q = BuR();
        }
        if (AbstractC009903n.A0P(setFields, -1363086160)) {
            InterfaceC39681sr BuT = BuT();
            if (BuT != null) {
                c39671sq = BuT.EzR().EzR();
            } else {
                c39671sq = null;
            }
            obj.A1a = c39671sq;
        }
        if (AbstractC009903n.A0P(setFields, -863963772)) {
            obj.A6E = Bua();
        }
        if (AbstractC009903n.A0P(setFields, 2072925261)) {
            obj.A6F = getShopRoutingUserId();
        }
        if (AbstractC009903n.A0P(setFields, 1710237709)) {
            InterfaceC104964oB But = But();
            if (But != null) {
                c108344uL = But.EvX();
            } else {
                c108344uL = null;
            }
            obj.A0q = c108344uL;
        }
        if (AbstractC009903n.A0P(setFields, 749011199)) {
            obj.A41 = BvE();
        }
        if (AbstractC009903n.A0P(setFields, -2041628044)) {
            obj.A42 = BvR();
        }
        if (AbstractC009903n.A0P(setFields, 2024939549)) {
            obj.A43 = BwC();
        }
        if (AbstractC009903n.A0P(setFields, -1782008060)) {
            obj.A44 = BwO();
        }
        if (AbstractC009903n.A0P(setFields, 1102388088)) {
            obj.A45 = BwY();
        }
        if (AbstractC009903n.A0P(setFields, 915636663)) {
            obj.A46 = Bwf();
        }
        if (AbstractC009903n.A0P(setFields, -151750197)) {
            obj.A47 = Bwv();
        }
        if (AbstractC009903n.A0P(setFields, -1076941614)) {
            obj.A8R = this.A0P._showcaseMedia$fbandroid_java_com_instagram_feed_media_media(c1dy);
        }
        if (AbstractC009903n.A0P(setFields, -824538620)) {
            IgShowreelNativeAnimationIntf Bx7 = Bx7();
            if (Bx7 != null) {
                igShowreelNativeAnimation = Bx7.F6Z().F6Z();
            } else {
                igShowreelNativeAnimation = null;
            }
            obj.A2N = igShowreelNativeAnimation;
        }
        if (AbstractC009903n.A0P(setFields, 1494713099)) {
            IgShowreelComposition Bx8 = Bx8();
            if (Bx8 != null) {
                igShowreelCompositionImpl = Bx8.F6Y();
            } else {
                igShowreelCompositionImpl = null;
            }
            obj.A2M = igShowreelCompositionImpl;
        }
        if (AbstractC009903n.A0P(setFields, -823445795)) {
            List ByK = ByK();
            if (ByK != null) {
                arrayList71 = new ArrayList(AbstractC06950Ym.A1E(ByK, 10));
                Iterator it30 = ByK.iterator();
                while (it30.hasNext()) {
                    arrayList71.add(((InterfaceC87503vI) it30.next()).Ezd(c1dy));
                }
            } else {
                arrayList71 = null;
            }
            obj.A0g(arrayList71);
        }
        if (AbstractC009903n.A0P(setFields, -84625186)) {
            obj.A4u = Byu();
        }
        if (AbstractC009903n.A0P(setFields, -1676707298)) {
            List sponsorTags = getSponsorTags();
            if (sponsorTags != null) {
                arrayList70 = new ArrayList(AbstractC06950Ym.A1E(sponsorTags, 10));
                Iterator it31 = sponsorTags.iterator();
                while (it31.hasNext()) {
                    arrayList70.add(((InterfaceC102194ip) it31.next()).Ezk(c1dy));
                }
            } else {
                arrayList70 = null;
            }
            obj.A0h(arrayList70);
        }
        if (AbstractC009903n.A0P(setFields, 1088798118)) {
            obj.A48 = C0k();
        }
        if (AbstractC009903n.A0P(setFields, -1407490688)) {
            List C0s = C0s();
            if (C0s != null) {
                arrayList69 = new ArrayList(AbstractC06950Ym.A1E(C0s, 10));
                Iterator it32 = C0s.iterator();
                while (it32.hasNext()) {
                    arrayList69.add(((InterfaceC43566JMa) it32.next()).Ew6());
                }
            } else {
                arrayList69 = null;
            }
            obj.A0i(arrayList69);
        }
        if (AbstractC009903n.A0P(setFields, 1866750646)) {
            InterfaceC43566JMa C0t = C0t();
            if (C0t != null) {
                h46 = C0t.Ew6().Ew6();
            } else {
                h46 = null;
            }
            obj.A0x = h46;
        }
        if (AbstractC009903n.A0P(setFields, -737858055)) {
            obj.A4v = C0u();
        }
        if (AbstractC009903n.A0P(setFields, -1296948496)) {
            List C15 = C15();
            if (C15 != null) {
                arrayList68 = new ArrayList(AbstractC06950Ym.A1E(C15, 10));
                Iterator it33 = C15.iterator();
                while (it33.hasNext()) {
                    arrayList68.add(((YQU) it33.next()).Ezs(c1dy));
                }
            } else {
                arrayList68 = null;
            }
            obj.A0j(arrayList68);
        }
        if (AbstractC009903n.A0P(setFields, -2032452484)) {
            C40C C16 = C16();
            if (C16 != null) {
                c40b = C16.EuN();
            } else {
                c40b = null;
            }
            obj.A0j = c40b;
        }
        if (AbstractC009903n.A0P(setFields, 779041318)) {
            InterfaceC39751sy C17 = C17();
            if (C17 != null) {
                c39741sx = C17.F5q(c1dy);
            } else {
                c39741sx = null;
            }
            obj.A0G(c39741sx);
        }
        if (AbstractC009903n.A0P(setFields, 1486703590)) {
            List C18 = C18();
            if (C18 != null) {
                arrayList67 = new ArrayList(AbstractC06950Ym.A1E(C18, 10));
                Iterator it34 = C18.iterator();
                while (it34.hasNext()) {
                    arrayList67.add(((YQY) it34.next()).Ezu(c1dy));
                }
            } else {
                arrayList67 = null;
            }
            obj.A0k(arrayList67);
        }
        if (AbstractC009903n.A0P(setFields, -1125789342)) {
            List C19 = C19();
            if (C19 != null) {
                arrayList66 = new ArrayList(AbstractC06950Ym.A1E(C19, 10));
                Iterator it35 = C19.iterator();
                while (it35.hasNext()) {
                    arrayList66.add(((YQZ) it35.next()).Ezx(c1dy));
                }
            } else {
                arrayList66 = null;
            }
            obj.A0l(arrayList66);
        }
        if (AbstractC009903n.A0P(setFields, 675283991)) {
            JMM C1A = C1A();
            if (C1A != null) {
                h5m = C1A.Ezz().Ezz();
            } else {
                h5m = null;
            }
            obj.A1f = h5m;
        }
        if (AbstractC009903n.A0P(setFields, 2006132535)) {
            List C1D = C1D();
            if (C1D != null) {
                arrayList65 = new ArrayList(AbstractC06950Ym.A1E(C1D, 10));
                Iterator it36 = C1D.iterator();
                while (it36.hasNext()) {
                    arrayList65.add(((YR1) it36.next()).F2G(c1dy));
                }
            } else {
                arrayList65 = null;
            }
            obj.A0m(arrayList65);
        }
        if (AbstractC009903n.A0P(setFields, -232732464)) {
            List C1E = C1E();
            if (C1E != null) {
                arrayList64 = new ArrayList(AbstractC06950Ym.A1E(C1E, 10));
                Iterator it37 = C1E.iterator();
                while (it37.hasNext()) {
                    arrayList64.add(((JLZ) it37.next()).F02());
                }
            } else {
                arrayList64 = null;
            }
            obj.A0n(arrayList64);
        }
        if (AbstractC009903n.A0P(setFields, 564544978)) {
            List C1F = C1F();
            if (C1F != null) {
                arrayList63 = new ArrayList(AbstractC06950Ym.A1E(C1F, 10));
                Iterator it38 = C1F.iterator();
                while (it38.hasNext()) {
                    arrayList63.add(((InterfaceC43581JMp) it38.next()).F03(c1dy));
                }
            } else {
                arrayList63 = null;
            }
            obj.A0o(arrayList63);
        }
        if (AbstractC009903n.A0P(setFields, 2040319440)) {
            List C1G = C1G();
            if (C1G != null) {
                arrayList62 = new ArrayList(AbstractC06950Ym.A1E(C1G, 10));
                Iterator it39 = C1G.iterator();
                while (it39.hasNext()) {
                    arrayList62.add(((InterfaceC73612YQa) it39.next()).F05(c1dy));
                }
            } else {
                arrayList62 = null;
            }
            obj.A0p(arrayList62);
        }
        if (AbstractC009903n.A0P(setFields, 169939895)) {
            List C1I = C1I();
            if (C1I != null) {
                arrayList61 = new ArrayList(AbstractC06950Ym.A1E(C1I, 10));
                Iterator it40 = C1I.iterator();
                while (it40.hasNext()) {
                    arrayList61.add(((InterfaceC73613YQb) it40.next()).F09(c1dy));
                }
            } else {
                arrayList61 = null;
            }
            obj.A0q(arrayList61);
        }
        if (AbstractC009903n.A0P(setFields, -930617263)) {
            List C1K = C1K();
            if (C1K != null) {
                arrayList60 = new ArrayList(AbstractC06950Ym.A1E(C1K, 10));
                Iterator it41 = C1K.iterator();
                while (it41.hasNext()) {
                    arrayList60.add(((InterfaceC73614YQc) it41.next()).F0C(c1dy));
                }
            } else {
                arrayList60 = null;
            }
            obj.A0r(arrayList60);
        }
        if (AbstractC009903n.A0P(setFields, -2045617666)) {
            List C1L = C1L();
            if (C1L != null) {
                arrayList59 = new ArrayList(AbstractC06950Ym.A1E(C1L, 10));
                Iterator it42 = C1L.iterator();
                while (it42.hasNext()) {
                    arrayList59.add(((InterfaceC38901rP) it42.next()).F4U(c1dy));
                }
            } else {
                arrayList59 = null;
            }
            obj.Eeu(arrayList59);
        }
        if (AbstractC009903n.A0P(setFields, -673377812)) {
            List C1M = C1M();
            if (C1M != null) {
                arrayList58 = new ArrayList(AbstractC06950Ym.A1E(C1M, 10));
                Iterator it43 = C1M.iterator();
                while (it43.hasNext()) {
                    arrayList58.add(((InterfaceC73615YQd) it43.next()).F0G(c1dy));
                }
            } else {
                arrayList58 = null;
            }
            obj.A0s(arrayList58);
        }
        if (AbstractC009903n.A0P(setFields, 1710761926)) {
            List C1N = C1N();
            if (C1N != null) {
                arrayList57 = new ArrayList(AbstractC06950Ym.A1E(C1N, 10));
                Iterator it44 = C1N.iterator();
                while (it44.hasNext()) {
                    arrayList57.add(((ReelCTAIntf) it44.next()).F4r(c1dy));
                }
            } else {
                arrayList57 = null;
            }
            obj.A0t(arrayList57);
        }
        if (AbstractC009903n.A0P(setFields, -126306446)) {
            List C1R = C1R();
            if (C1R != null) {
                arrayList56 = new ArrayList(AbstractC06950Ym.A1E(C1R, 10));
                Iterator it45 = C1R.iterator();
                while (it45.hasNext()) {
                    arrayList56.add(((InterfaceC73616YQe) it45.next()).F0J(c1dy));
                }
            } else {
                arrayList56 = null;
            }
            obj.A0u(arrayList56);
        }
        if (AbstractC009903n.A0P(setFields, 161790302)) {
            C40I C1S = C1S();
            if (C1S != null) {
                c40h = C1S.F5p();
            } else {
                c40h = null;
            }
            obj.A2I = c40h;
        }
        if (AbstractC009903n.A0P(setFields, -208973886)) {
            List C1T = C1T();
            if (C1T != null) {
                arrayList55 = new ArrayList(AbstractC06950Ym.A1E(C1T, 10));
                Iterator it46 = C1T.iterator();
                while (it46.hasNext()) {
                    arrayList55.add(((YQV) it46.next()).EtH(c1dy));
                }
            } else {
                arrayList55 = null;
            }
            obj.A0v(arrayList55);
        }
        if (AbstractC009903n.A0P(setFields, 1322756046)) {
            List C1U = C1U();
            if (C1U != null) {
                arrayList54 = new ArrayList(AbstractC06950Ym.A1E(C1U, 10));
                Iterator it47 = C1U.iterator();
                while (it47.hasNext()) {
                    arrayList54.add(((InterfaceC73617YQf) it47.next()).F0M(c1dy));
                }
            } else {
                arrayList54 = null;
            }
            obj.A0w(arrayList54);
        }
        if (AbstractC009903n.A0P(setFields, -4846001)) {
            List C1V = C1V();
            if (C1V != null) {
                arrayList53 = new ArrayList(AbstractC06950Ym.A1E(C1V, 10));
                Iterator it48 = C1V.iterator();
                while (it48.hasNext()) {
                    arrayList53.add(((YR5) it48.next()).F0O(c1dy));
                }
            } else {
                arrayList53 = null;
            }
            obj.A0x(arrayList53);
        }
        if (AbstractC009903n.A0P(setFields, 1518882930)) {
            List C1W = C1W();
            if (C1W != null) {
                arrayList52 = new ArrayList(AbstractC06950Ym.A1E(C1W, 10));
                Iterator it49 = C1W.iterator();
                while (it49.hasNext()) {
                    arrayList52.add(((InterfaceC73618YQg) it49.next()).F0R(c1dy));
                }
            } else {
                arrayList52 = null;
            }
            obj.A0y(arrayList52);
        }
        if (AbstractC009903n.A0P(setFields, -1095329344)) {
            List C1X = C1X();
            if (C1X != null) {
                arrayList51 = new ArrayList(AbstractC06950Ym.A1E(C1X, 10));
                Iterator it50 = C1X.iterator();
                while (it50.hasNext()) {
                    arrayList51.add(((InterfaceC73619YQh) it50.next()).F0T(c1dy));
                }
            } else {
                arrayList51 = null;
            }
            obj.A0z(arrayList51);
        }
        if (AbstractC009903n.A0P(setFields, 933243789)) {
            List C1Y = C1Y();
            if (C1Y != null) {
                arrayList50 = new ArrayList(AbstractC06950Ym.A1E(C1Y, 10));
                Iterator it51 = C1Y.iterator();
                while (it51.hasNext()) {
                    arrayList50.add(((InterfaceC84683qH) it51.next()).F0Y(c1dy));
                }
            } else {
                arrayList50 = null;
            }
            obj.A10(arrayList50);
        }
        if (AbstractC009903n.A0P(setFields, -847098274)) {
            List C1Z = C1Z();
            if (C1Z != null) {
                arrayList49 = new ArrayList(AbstractC06950Ym.A1E(C1Z, 10));
                Iterator it52 = C1Z.iterator();
                while (it52.hasNext()) {
                    arrayList49.add(((InterfaceC73620YQi) it52.next()).F0W(c1dy));
                }
            } else {
                arrayList49 = null;
            }
            obj.A11(arrayList49);
        }
        if (AbstractC009903n.A0P(setFields, -625916542)) {
            List C1a = C1a();
            if (C1a != null) {
                arrayList48 = new ArrayList(AbstractC06950Ym.A1E(C1a, 10));
                Iterator it53 = C1a.iterator();
                while (it53.hasNext()) {
                    arrayList48.add(((JMA) it53.next()).F0a(c1dy));
                }
            } else {
                arrayList48 = null;
            }
            obj.A12(arrayList48);
        }
        if (AbstractC009903n.A0P(setFields, 272605310)) {
            List C1b = C1b();
            if (C1b != null) {
                arrayList47 = new ArrayList(AbstractC06950Ym.A1E(C1b, 10));
                Iterator it54 = C1b.iterator();
                while (it54.hasNext()) {
                    arrayList47.add(((InterfaceC73621YQj) it54.next()).F0c(c1dy));
                }
            } else {
                arrayList47 = null;
            }
            obj.A13(arrayList47);
        }
        if (AbstractC009903n.A0P(setFields, -1725930739)) {
            obj.A49 = C1c();
        }
        if (AbstractC009903n.A0P(setFields, -1294058959)) {
            List C1d = C1d();
            if (C1d != null) {
                arrayList46 = new ArrayList(AbstractC06950Ym.A1E(C1d, 10));
                Iterator it55 = C1d.iterator();
                while (it55.hasNext()) {
                    arrayList46.add(((C5KP) it55.next()).F0j(c1dy));
                }
            } else {
                arrayList46 = null;
            }
            obj.A14(arrayList46);
        }
        if (AbstractC009903n.A0P(setFields, 1561034635)) {
            List C1e = C1e();
            if (C1e != null) {
                arrayList45 = new ArrayList(AbstractC06950Ym.A1E(C1e, 10));
                Iterator it56 = C1e.iterator();
                while (it56.hasNext()) {
                    arrayList45.add(((YR6) it56.next()).F0l(c1dy));
                }
            } else {
                arrayList45 = null;
            }
            obj.A15(arrayList45);
        }
        if (AbstractC009903n.A0P(setFields, 1110981966)) {
            List C1f = C1f();
            if (C1f != null) {
                arrayList44 = new ArrayList(AbstractC06950Ym.A1E(C1f, 10));
                Iterator it57 = C1f.iterator();
                while (it57.hasNext()) {
                    arrayList44.add(((InterfaceC73623YQl) it57.next()).F0n(c1dy));
                }
            } else {
                arrayList44 = null;
            }
            obj.A16(arrayList44);
        }
        if (AbstractC009903n.A0P(setFields, 1510592481)) {
            obj.A4A = C1g();
        }
        if (AbstractC009903n.A0P(setFields, 1762620337)) {
            List C1i = C1i();
            if (C1i != null) {
                arrayList43 = new ArrayList(AbstractC06950Ym.A1E(C1i, 10));
                Iterator it58 = C1i.iterator();
                while (it58.hasNext()) {
                    arrayList43.add(((InterfaceC108154u0) it58.next()).F0q(c1dy));
                }
            } else {
                arrayList43 = null;
            }
            obj.A17(arrayList43);
        }
        if (AbstractC009903n.A0P(setFields, 1308187796)) {
            List C1j = C1j();
            if (C1j != null) {
                arrayList42 = new ArrayList(AbstractC06950Ym.A1E(C1j, 10));
                Iterator it59 = C1j.iterator();
                while (it59.hasNext()) {
                    arrayList42.add(((InterfaceC1123955r) it59.next()).F4w(c1dy));
                }
            } else {
                arrayList42 = null;
            }
            obj.A18(arrayList42);
        }
        if (AbstractC009903n.A0P(setFields, 1804853661)) {
            InterfaceC37269GbM C1k = C1k();
            if (C1k != null) {
                e8a = C1k.F0s(c1dy);
            } else {
                e8a = null;
            }
            obj.A07(e8a);
        }
        if (AbstractC009903n.A0P(setFields, 858223008)) {
            List C1l = C1l();
            if (C1l != null) {
                arrayList41 = new ArrayList(AbstractC06950Ym.A1E(C1l, 10));
                Iterator it60 = C1l.iterator();
                while (it60.hasNext()) {
                    arrayList41.add(((InterfaceC73624YQm) it60.next()).F0w(c1dy));
                }
            } else {
                arrayList41 = null;
            }
            obj.A19(arrayList41);
        }
        if (AbstractC009903n.A0P(setFields, 1049605402)) {
            List C1m = C1m();
            if (C1m != null) {
                arrayList40 = new ArrayList(AbstractC06950Ym.A1E(C1m, 10));
                Iterator it61 = C1m.iterator();
                while (it61.hasNext()) {
                    arrayList40.add(((InterfaceC109274vt) it61.next()).Ez4(c1dy));
                }
            } else {
                arrayList40 = null;
            }
            obj.A1A(arrayList40);
        }
        if (AbstractC009903n.A0P(setFields, -631801264)) {
            List C1n = C1n();
            if (C1n != null) {
                arrayList39 = new ArrayList(AbstractC06950Ym.A1E(C1n, 10));
                Iterator it62 = C1n.iterator();
                while (it62.hasNext()) {
                    arrayList39.add(((InterfaceC73625YQn) it62.next()).F11(c1dy));
                }
            } else {
                arrayList39 = null;
            }
            obj.A1B(arrayList39);
        }
        if (AbstractC009903n.A0P(setFields, -382777286)) {
            List C1o = C1o();
            if (C1o != null) {
                arrayList38 = new ArrayList(AbstractC06950Ym.A1E(C1o, 10));
                Iterator it63 = C1o.iterator();
                while (it63.hasNext()) {
                    arrayList38.add(((C4A3) it63.next()).F13(c1dy));
                }
            } else {
                arrayList38 = null;
            }
            obj.A1C(arrayList38);
        }
        if (AbstractC009903n.A0P(setFields, -827337423)) {
            List C1p = C1p();
            if (C1p != null) {
                arrayList37 = new ArrayList(AbstractC06950Ym.A1E(C1p, 10));
                Iterator it64 = C1p.iterator();
                while (it64.hasNext()) {
                    arrayList37.add(((InterfaceC73626YQo) it64.next()).F16(c1dy));
                }
            } else {
                arrayList37 = null;
            }
            obj.A1D(arrayList37);
        }
        if (AbstractC009903n.A0P(setFields, 981516677)) {
            List C1q = C1q();
            if (C1q != null) {
                arrayList36 = new ArrayList(AbstractC06950Ym.A1E(C1q, 10));
                Iterator it65 = C1q.iterator();
                while (it65.hasNext()) {
                    arrayList36.add(((InterfaceC73627YQp) it65.next()).F18(c1dy));
                }
            } else {
                arrayList36 = null;
            }
            obj.A1E(arrayList36);
        }
        if (AbstractC009903n.A0P(setFields, 245917471)) {
            List C1r = C1r();
            if (C1r != null) {
                arrayList35 = new ArrayList(AbstractC06950Ym.A1E(C1r, 10));
                Iterator it66 = C1r.iterator();
                while (it66.hasNext()) {
                    arrayList35.add(((InterfaceC73628YQq) it66.next()).F1A(c1dy));
                }
            } else {
                arrayList35 = null;
            }
            obj.A1F(arrayList35);
        }
        if (AbstractC009903n.A0P(setFields, 1490848472)) {
            List C1s = C1s();
            if (C1s != null) {
                arrayList34 = new ArrayList(AbstractC06950Ym.A1E(C1s, 10));
                Iterator it67 = C1s.iterator();
                while (it67.hasNext()) {
                    arrayList34.add(((InterfaceC37276GbT) it67.next()).F6x(c1dy));
                }
            } else {
                arrayList34 = null;
            }
            obj.A1G(arrayList34);
        }
        if (AbstractC009903n.A0P(setFields, -918392630)) {
            List C1t = C1t();
            if (C1t != null) {
                arrayList33 = new ArrayList(AbstractC06950Ym.A1E(C1t, 10));
                Iterator it68 = C1t.iterator();
                while (it68.hasNext()) {
                    arrayList33.add(((InterfaceC73629YQr) it68.next()).F1C(c1dy));
                }
            } else {
                arrayList33 = null;
            }
            obj.Eev(arrayList33);
        }
        if (AbstractC009903n.A0P(setFields, 2119426726)) {
            List C1u = C1u();
            if (C1u != null) {
                arrayList32 = new ArrayList(AbstractC06950Ym.A1E(C1u, 10));
                Iterator it69 = C1u.iterator();
                while (it69.hasNext()) {
                    arrayList32.add(((InterfaceC73630YQs) it69.next()).F1F(c1dy));
                }
            } else {
                arrayList32 = null;
            }
            obj.A1H(arrayList32);
        }
        if (AbstractC009903n.A0P(setFields, 2128300741)) {
            List C1v = C1v();
            if (C1v != null) {
                arrayList31 = new ArrayList(AbstractC06950Ym.A1E(C1v, 10));
                Iterator it70 = C1v.iterator();
                while (it70.hasNext()) {
                    arrayList31.add(((InterfaceC73631YQt) it70.next()).F1H(c1dy));
                }
            } else {
                arrayList31 = null;
            }
            obj.A1I(arrayList31);
        }
        if (AbstractC009903n.A0P(setFields, 757656494)) {
            List C1x = C1x();
            if (C1x != null) {
                arrayList30 = new ArrayList(AbstractC06950Ym.A1E(C1x, 10));
                Iterator it71 = C1x.iterator();
                while (it71.hasNext()) {
                    arrayList30.add(((YR8) it71.next()).F1P(c1dy));
                }
            } else {
                arrayList30 = null;
            }
            obj.A1J(arrayList30);
        }
        if (AbstractC009903n.A0P(setFields, -2018333115)) {
            List C1y = C1y();
            if (C1y != null) {
                arrayList29 = new ArrayList(AbstractC06950Ym.A1E(C1y, 10));
                Iterator it72 = C1y.iterator();
                while (it72.hasNext()) {
                    arrayList29.add(((InterfaceC109364wL) it72.next()).F1N(c1dy));
                }
            } else {
                arrayList29 = null;
            }
            obj.Eew(arrayList29);
        }
        if (AbstractC009903n.A0P(setFields, -989899414)) {
            List C1z = C1z();
            if (C1z != null) {
                arrayList28 = new ArrayList(AbstractC06950Ym.A1E(C1z, 10));
                Iterator it73 = C1z.iterator();
                while (it73.hasNext()) {
                    arrayList28.add(((YQX) it73.next()).Eyo(c1dy));
                }
            } else {
                arrayList28 = null;
            }
            obj.A1K(arrayList28);
        }
        if (AbstractC009903n.A0P(setFields, -180194119)) {
            List C20 = C20();
            if (C20 != null) {
                arrayList27 = new ArrayList(AbstractC06950Ym.A1E(C20, 10));
                Iterator it74 = C20.iterator();
                while (it74.hasNext()) {
                    arrayList27.add(((QuestionResponsesModelIntf) it74.next()).F72(c1dy));
                }
            } else {
                arrayList27 = null;
            }
            obj.A1L(arrayList27);
        }
        if (AbstractC009903n.A0P(setFields, 723142275)) {
            List C21 = C21();
            if (C21 != null) {
                arrayList26 = new ArrayList(AbstractC06950Ym.A1E(C21, 10));
                Iterator it75 = C21.iterator();
                while (it75.hasNext()) {
                    arrayList26.add(((InterfaceC73632YQu) it75.next()).F1R(c1dy));
                }
            } else {
                arrayList26 = null;
            }
            obj.A1M(arrayList26);
        }
        if (AbstractC009903n.A0P(setFields, 681026506)) {
            JKW C22 = C22();
            if (C22 != null) {
                c38781H5v = C22.F1T().F1T();
            } else {
                c38781H5v = null;
            }
            obj.A1h = c38781H5v;
        }
        if (AbstractC009903n.A0P(setFields, -546458471)) {
            List C23 = C23();
            if (C23 != null) {
                arrayList25 = new ArrayList(AbstractC06950Ym.A1E(C23, 10));
                Iterator it76 = C23.iterator();
                while (it76.hasNext()) {
                    arrayList25.add(((JMB) it76.next()).F1X(c1dy));
                }
            } else {
                arrayList25 = null;
            }
            obj.A1N(arrayList25);
        }
        if (AbstractC009903n.A0P(setFields, -917292812)) {
            List C24 = C24();
            if (C24 != null) {
                arrayList24 = new ArrayList(AbstractC06950Ym.A1E(C24, 10));
                Iterator it77 = C24.iterator();
                while (it77.hasNext()) {
                    arrayList24.add(((InterfaceC73633YQv) it77.next()).F1a(c1dy));
                }
            } else {
                arrayList24 = null;
            }
            obj.A1O(arrayList24);
        }
        if (AbstractC009903n.A0P(setFields, -757070241)) {
            List C26 = C26();
            if (C26 != null) {
                arrayList23 = new ArrayList(AbstractC06950Ym.A1E(C26, 10));
                Iterator it78 = C26.iterator();
                while (it78.hasNext()) {
                    arrayList23.add(((InterfaceC37272GbP) it78.next()).F1c(c1dy));
                }
            } else {
                arrayList23 = null;
            }
            obj.A1P(arrayList23);
        }
        if (AbstractC009903n.A0P(setFields, 2125349730)) {
            List C27 = C27();
            if (C27 != null) {
                arrayList22 = new ArrayList(AbstractC06950Ym.A1E(C27, 10));
                Iterator it79 = C27.iterator();
                while (it79.hasNext()) {
                    arrayList22.add(((InterfaceC106104qQ) it79.next()).F1e(c1dy));
                }
            } else {
                arrayList22 = null;
            }
            obj.A1Q(arrayList22);
        }
        if (AbstractC009903n.A0P(setFields, -133989276)) {
            List C2B = C2B();
            if (C2B != null) {
                arrayList21 = new ArrayList(AbstractC06950Ym.A1E(C2B, 10));
                Iterator it80 = C2B.iterator();
                while (it80.hasNext()) {
                    arrayList21.add(((YR7) it80.next()).EzB(c1dy));
                }
            } else {
                arrayList21 = null;
            }
            obj.A1R(arrayList21);
        }
        if (AbstractC009903n.A0P(setFields, 492391483)) {
            List C2C = C2C();
            if (C2C != null) {
                arrayList20 = new ArrayList(AbstractC06950Ym.A1E(C2C, 10));
                Iterator it81 = C2C.iterator();
                while (it81.hasNext()) {
                    arrayList20.add(((InterfaceC73634YQw) it81.next()).F1g(c1dy));
                }
            } else {
                arrayList20 = null;
            }
            obj.A1S(arrayList20);
        }
        if (AbstractC009903n.A0P(setFields, -640823660)) {
            List C2D = C2D();
            if (C2D != null) {
                arrayList19 = new ArrayList(AbstractC06950Ym.A1E(C2D, 10));
                Iterator it82 = C2D.iterator();
                while (it82.hasNext()) {
                    arrayList19.add(((InterfaceC73635YQx) it82.next()).F1j(c1dy));
                }
            } else {
                arrayList19 = null;
            }
            obj.A1T(arrayList19);
        }
        if (AbstractC009903n.A0P(setFields, -1590071686)) {
            List C2F = C2F();
            if (C2F != null) {
                arrayList18 = new ArrayList(AbstractC06950Ym.A1E(C2F, 10));
                Iterator it83 = C2F.iterator();
                while (it83.hasNext()) {
                    arrayList18.add(((JMN) it83.next()).F1o(c1dy));
                }
            } else {
                arrayList18 = null;
            }
            obj.A1U(arrayList18);
        }
        if (AbstractC009903n.A0P(setFields, 466583144)) {
            List C2G = C2G();
            if (C2G != null) {
                arrayList17 = new ArrayList(AbstractC06950Ym.A1E(C2G, 10));
                Iterator it84 = C2G.iterator();
                while (it84.hasNext()) {
                    arrayList17.add(((InterfaceC73636YQy) it84.next()).F1m(c1dy));
                }
            } else {
                arrayList17 = null;
            }
            obj.A1V(arrayList17);
        }
        if (AbstractC009903n.A0P(setFields, 1600111719)) {
            List C2H = C2H();
            if (C2H != null) {
                arrayList16 = new ArrayList(AbstractC06950Ym.A1E(C2H, 10));
                Iterator it85 = C2H.iterator();
                while (it85.hasNext()) {
                    arrayList16.add(((StorySmbSupportStickerObject) it85.next()).F1q(c1dy));
                }
            } else {
                arrayList16 = null;
            }
            obj.A1W(arrayList16);
        }
        if (AbstractC009903n.A0P(setFields, 299456281)) {
            List C2I = C2I();
            if (C2I != null) {
                arrayList15 = new ArrayList(AbstractC06950Ym.A1E(C2I, 10));
                Iterator it86 = C2I.iterator();
                while (it86.hasNext()) {
                    arrayList15.add(((InterfaceC109274vt) it86.next()).Ez4(c1dy));
                }
            } else {
                arrayList15 = null;
            }
            obj.A1X(arrayList15);
        }
        if (AbstractC009903n.A0P(setFields, 1285614450)) {
            List C2L = C2L();
            if (C2L != null) {
                arrayList14 = new ArrayList(AbstractC06950Ym.A1E(C2L, 10));
                Iterator it87 = C2L.iterator();
                while (it87.hasNext()) {
                    arrayList14.add(((InterfaceC73637YQz) it87.next()).F1t(c1dy));
                }
            } else {
                arrayList14 = null;
            }
            obj.A1Y(arrayList14);
        }
        if (AbstractC009903n.A0P(setFields, 353770633)) {
            List C2M = C2M();
            if (C2M != null) {
                arrayList13 = new ArrayList(AbstractC06950Ym.A1E(C2M, 10));
                Iterator it88 = C2M.iterator();
                while (it88.hasNext()) {
                    arrayList13.add(((InterfaceC109274vt) it88.next()).Ez4(c1dy));
                }
            } else {
                arrayList13 = null;
            }
            obj.A1Z(arrayList13);
        }
        if (AbstractC009903n.A0P(setFields, 1440195804)) {
            InterfaceC43513JJz C2O = C2O();
            if (C2O != null) {
                h6d = C2O.F2E().F2E();
            } else {
                h6d = null;
            }
            obj.A1i = h6d;
        }
        if (AbstractC009903n.A0P(setFields, 2054416679)) {
            StoryUnlockableStickerTappableObject C2P = C2P();
            if (C2P != null) {
                storyUnlockableStickerTappableObjectImpl = C2P.F2N().F2N();
            } else {
                storyUnlockableStickerTappableObjectImpl = null;
            }
            obj.A1j = storyUnlockableStickerTappableObjectImpl;
        }
        if (AbstractC009903n.A0P(setFields, 189260370)) {
            List C2Q = C2Q();
            if (C2Q != null) {
                arrayList12 = new ArrayList(AbstractC06950Ym.A1E(C2Q, 10));
                Iterator it89 = C2Q.iterator();
                while (it89.hasNext()) {
                    arrayList12.add(((InterfaceC43582JMq) it89.next()).F2O(c1dy));
                }
            } else {
                arrayList12 = null;
            }
            obj.A1a(arrayList12);
        }
        if (AbstractC009903n.A0P(setFields, -1931276005)) {
            List C2S = C2S();
            if (C2S != null) {
                arrayList11 = new ArrayList(AbstractC06950Ym.A1E(C2S, 10));
                Iterator it90 = C2S.iterator();
                while (it90.hasNext()) {
                    arrayList11.add(((YR4) it90.next()).F3r(c1dy));
                }
            } else {
                arrayList11 = null;
            }
            obj.A1b(arrayList11);
        }
        if (AbstractC009903n.A0P(setFields, -952835651)) {
            List C2T = C2T();
            if (C2T != null) {
                arrayList10 = new ArrayList(AbstractC06950Ym.A1E(C2T, 10));
                Iterator it91 = C2T.iterator();
                while (it91.hasNext()) {
                    arrayList10.add(((YR2) it91.next()).F2R(c1dy));
                }
            } else {
                arrayList10 = null;
            }
            obj.A1c(arrayList10);
        }
        if (AbstractC009903n.A0P(setFields, 131529241)) {
            List C2V = C2V();
            if (C2V != null) {
                arrayList9 = new ArrayList(AbstractC06950Ym.A1E(C2V, 10));
                Iterator it92 = C2V.iterator();
                while (it92.hasNext()) {
                    arrayList9.add(((InterfaceC43577JMl) it92.next()).F2U());
                }
            } else {
                arrayList9 = null;
            }
            obj.A1d(arrayList9);
        }
        if (AbstractC009903n.A0P(setFields, 356255459)) {
            obj.A6G = getStrongId();
        }
        if (AbstractC009903n.A0P(setFields, -1784633906)) {
            obj.A4B = C3P();
        }
        if (AbstractC009903n.A0P(setFields, 2038954287)) {
            obj.A6H = getSubscriptionMediaVisibility();
        }
        if (AbstractC009903n.A0P(setFields, 2112460369)) {
            List C3X = C3X();
            if (C3X != null) {
                arrayList8 = new ArrayList(AbstractC06950Ym.A1E(C3X, 10));
                Iterator it93 = C3X.iterator();
                while (it93.hasNext()) {
                    arrayList8.add(((YR0) it93.next()).F1x(c1dy));
                }
            } else {
                arrayList8 = null;
            }
            obj.A1e(arrayList8);
        }
        if (AbstractC009903n.A0P(setFields, -2059763040)) {
            obj.A4C = C4G();
        }
        if (AbstractC009903n.A0P(setFields, -643954005)) {
            obj.A5A = C5A();
        }
        if (AbstractC009903n.A0P(setFields, 458041893)) {
            obj.A4O = C5C();
        }
        if (AbstractC009903n.A0P(setFields, 1318038232)) {
            InterfaceC102674k2 C5N = C5N();
            if (C5N != null) {
                c102664k1 = C5N.EzS(c1dy);
            } else {
                c102664k1 = null;
            }
            obj.A06(c102664k1);
        }
        if (AbstractC009903n.A0P(setFields, 1590396334)) {
            InterfaceC107194sQ C6O = C6O();
            if (C6O != null) {
                c107184sP = C6O.F5s();
            } else {
                c107184sP = null;
            }
            obj.A2K = c107184sP;
        }
        if (AbstractC009903n.A0P(setFields, -1198382791)) {
            InterfaceC99334d2 C6Y = C6Y();
            if (C6Y != null) {
                c99324d1 = C6Y.F4y(c1dy);
            } else {
                c99324d1 = null;
            }
            obj.Efb(c99324d1);
        }
        if (AbstractC009903n.A0P(setFields, -235485270)) {
            List C6g = C6g();
            if (C6g != null) {
                arrayList7 = new ArrayList(AbstractC06950Ym.A1E(C6g, 10));
                Iterator it94 = C6g.iterator();
                while (it94.hasNext()) {
                    arrayList7.add(((InterfaceC114635Ft) it94.next()).F3D(c1dy));
                }
            } else {
                arrayList7 = null;
            }
            obj.A1f(arrayList7);
        }
        if (AbstractC009903n.A0P(setFields, 1809512549)) {
            obj.A8S = C6n();
        }
        if (AbstractC009903n.A0P(setFields, 1854819208)) {
            InterfaceC43520JKg C6q = C6q();
            if (C6q != null) {
                c38801H6q = C6q.F3J().F3J();
            } else {
                c38801H6q = null;
            }
            obj.A1l = c38801H6q;
        }
        if (AbstractC009903n.A0P(setFields, -1854931910)) {
            obj.A1m = C86();
        }
        if (AbstractC009903n.A0P(setFields, -1703162617)) {
            SpritesheetInfo C8E = C8E();
            if (C8E != null) {
                spritesheetInfoImpl = C8E.F5D();
            } else {
                spritesheetInfoImpl = null;
            }
            obj.A2C = spritesheetInfoImpl;
        }
        if (AbstractC009903n.A0P(setFields, -2083703389)) {
            InterfaceC99494dO C8I = C8I();
            if (C8I != null) {
                c99484dN = C8I.F2o();
            } else {
                c99484dN = null;
            }
            obj.A1k = c99484dN;
        }
        if (AbstractC009903n.A0P(setFields, -815903539)) {
            obj.A8T = C8a();
        }
        if (AbstractC009903n.A0P(setFields, 110371416)) {
            obj.A6I = getTitle();
        }
        if (AbstractC009903n.A0P(setFields, -852740542)) {
            obj.A8U = C9Y();
        }
        if (AbstractC009903n.A0P(setFields, -868034268)) {
            List C9g = C9g();
            if (C9g != null) {
                arrayList6 = new ArrayList(AbstractC06950Ym.A1E(C9g, 10));
                Iterator it95 = C9g.iterator();
                while (it95.hasNext()) {
                    arrayList6.add(((TopicIntf) it95.next()).F3O());
                }
            } else {
                arrayList6 = null;
            }
            obj.A1g(arrayList6);
        }
        if (AbstractC009903n.A0P(setFields, -247788880)) {
            obj.A4w = C9l();
        }
        if (AbstractC009903n.A0P(setFields, 919047613)) {
            obj.A4x = C9z();
        }
        if (AbstractC009903n.A0P(setFields, -1611417801)) {
            List CAU = CAU();
            if (CAU != null) {
                arrayList5 = new ArrayList(AbstractC06950Ym.A1E(CAU, 10));
                Iterator it96 = CAU.iterator();
                while (it96.hasNext()) {
                    arrayList5.add(((JL8) it96.next()).Eza());
                }
            } else {
                arrayList5 = null;
            }
            obj.A1h(arrayList5);
        }
        if (AbstractC009903n.A0P(setFields, 630344494)) {
            List CAf = CAf();
            if (CAf != null) {
                arrayList4 = new ArrayList(AbstractC06950Ym.A1E(CAf, 10));
                Iterator it97 = CAf.iterator();
                while (it97.hasNext()) {
                    arrayList4.add(((InterfaceC105674pe) it97.next()).F3l());
                }
            } else {
                arrayList4 = null;
            }
            obj.A1i(arrayList4);
        }
        if (AbstractC009903n.A0P(setFields, -2064382341)) {
            obj.A6J = CBA();
        }
        if (AbstractC009903n.A0P(setFields, 403610603)) {
            obj.A6K = CBB();
        }
        if (AbstractC009903n.A0P(setFields, -153997515)) {
            obj.A4D = CCK();
        }
        if (AbstractC009903n.A0P(setFields, -2094458441)) {
            UpcomingEvent CD4 = CD4();
            if (CD4 != null) {
                upcomingEventImpl = CD4.F7a(c1dy);
            } else {
                upcomingEventImpl = null;
            }
            obj.EgV(upcomingEventImpl);
        }
        if (AbstractC009903n.A0P(setFields, 1218147454)) {
            obj.A5B = CDR();
        }
        if (AbstractC009903n.A0P(setFields, 116083)) {
            JM9 CDS = CDS();
            if (CDS != null) {
                h5d = CDS.EzZ().EzZ();
            } else {
                h5d = null;
            }
            obj.A1d = h5d;
        }
        if (AbstractC009903n.A0P(setFields, 1238212428)) {
            InterfaceC105004oG CDT = CDT();
            if (CDT != null) {
                c114625Fm = CDT.F3U(c1dy);
            } else {
                c114625Fm = null;
            }
            obj.A08(c114625Fm);
        }
        if (AbstractC009903n.A0P(setFields, 3599307)) {
            ImmutablePandoUserDict immutablePandoUserDict8 = (ImmutablePandoUserDict) this.A0P.A05(3599307, ImmutablePandoUserDict.class);
            if (immutablePandoUserDict8 != null) {
                Parcelable.Creator creator8 = User.CREATOR;
                user = AbstractC38851rI.A01(c1dy, immutablePandoUserDict8);
            } else {
                user = null;
            }
            obj.A2Y = user;
        }
        if (AbstractC009903n.A0P(setFields, -265534876)) {
            InterfaceC84523py CEF = CEF();
            if (CEF != null) {
                c84513px = CEF.F3h(c1dy);
            } else {
                c84513px = null;
            }
            obj.Egf(c84513px);
        }
        if (AbstractC009903n.A0P(setFields, -1220809526)) {
            InterfaceC43523JKj CF0 = CF0();
            if (CF0 != null) {
                h70 = CF0.F3j().F3j();
            } else {
                h70 = null;
            }
            obj.A1p = h70;
        }
        if (AbstractC009903n.A0P(setFields, 1370685266)) {
            obj.A6L = getVideoCodec();
        }
        if (AbstractC009903n.A0P(setFields, -134887560)) {
            obj.A6M = getVideoDashManifest();
        }
        if (AbstractC009903n.A0P(setFields, 706299096)) {
            obj.A4P = CF6();
        }
        if (AbstractC009903n.A0P(setFields, -1921505591)) {
            List CF8 = CF8();
            if (CF8 != null) {
                arrayList3 = new ArrayList(AbstractC06950Ym.A1E(CF8, 10));
                Iterator it98 = CF8.iterator();
                while (it98.hasNext()) {
                    arrayList3.add(((JLC) it98.next()).F3k());
                }
            } else {
                arrayList3 = null;
            }
            obj.A1j(arrayList3);
        }
        if (AbstractC009903n.A0P(setFields, 1974901084)) {
            obj.A6N = CFB();
        }
        if (AbstractC009903n.A0P(setFields, 705492115)) {
            obj.A8V = CFT();
        }
        if (AbstractC009903n.A0P(setFields, 686233394)) {
            obj.A4Q = CFU();
        }
        if (AbstractC009903n.A0P(setFields, 685298585)) {
            obj.A4E = CFV();
        }
        if (AbstractC009903n.A0P(setFields, 2147173644)) {
            obj.A4F = CFW();
        }
        if (AbstractC009903n.A0P(setFields, 500587266)) {
            obj.A6O = CFX();
        }
        if (AbstractC009903n.A0P(setFields, -709649780)) {
            obj.A4G = CFY();
        }
        if (AbstractC009903n.A0P(setFields, -189990460)) {
            obj.A6P = getVideoSubtitlesUri();
        }
        if (AbstractC009903n.A0P(setFields, 713258463)) {
            List CFe = CFe();
            if (CFe != null) {
                arrayList2 = new ArrayList(AbstractC06950Ym.A1E(CFe, 10));
                Iterator it99 = CFe.iterator();
                while (it99.hasNext()) {
                    arrayList2.add(((VideoVersionIntf) it99.next()).F5E());
                }
            } else {
                arrayList2 = null;
            }
            obj.Eh0(arrayList2);
        }
        if (AbstractC009903n.A0P(setFields, -1534353675)) {
            obj.A4y = CFm();
        }
        if (AbstractC009903n.A0P(setFields, 1496409374)) {
            obj.A4z = CFr();
        }
        if (AbstractC009903n.A0P(setFields, 1569386526)) {
            obj.A4H = CG2();
        }
        if (AbstractC009903n.A0P(setFields, 479826082)) {
            obj.A50 = CG5();
        }
        if (AbstractC009903n.A0P(setFields, 1995163171)) {
            obj.A6Q = CG7();
        }
        if (AbstractC009903n.A0P(setFields, 352259510)) {
            InterfaceC43524JKk CGF = CGF();
            if (CGF != null) {
                h72 = CGF.F3m().F3m();
            } else {
                h72 = null;
            }
            obj.A1q = h72;
        }
        if (AbstractC009903n.A0P(setFields, 454234273)) {
            obj.A8W = this.A0P._viewers$fbandroid_java_com_instagram_feed_media_media(c1dy);
        }
        if (AbstractC009903n.A0P(setFields, 1941332754)) {
            obj.A6R = CGd();
        }
        if (AbstractC009903n.A0P(setFields, -2066840604)) {
            List CGm = CGm();
            if (CGm != null) {
                arrayList = new ArrayList(AbstractC06950Ym.A1E(CGm, 10));
                Iterator it100 = CGm.iterator();
                while (it100.hasNext()) {
                    arrayList.add(((InterfaceC2042391v) it100.next()).EwZ(c1dy));
                }
            } else {
                arrayList = null;
            }
            obj.A1k(arrayList);
        }
        if (AbstractC009903n.A0P(setFields, 1960598564)) {
            AnonymousClass924 CGu = CGu();
            if (CGu != null) {
                anonymousClass923 = CGu.F3o().F3o();
            } else {
                anonymousClass923 = null;
            }
            obj.A1r = anonymousClass923;
        }
        if (AbstractC009903n.A0P(setFields, -432702711)) {
            obj.A6S = CHB();
        }
        if (AbstractC009903n.A0P(setFields, -314528552)) {
            obj.A4I = CHD();
        }
        if (AbstractC009903n.A0P(setFields, -1667152236)) {
            InterfaceC43580JMo CHL = CHL();
            if (CHL != null) {
                h75 = CHL.F3t(c1dy);
            } else {
                h75 = null;
            }
            obj.A09(h75);
        }
        if (AbstractC009903n.A0P(setFields, 85687878)) {
            List CHY = CHY();
            if (CHY != null) {
                arrayList101 = new ArrayList(AbstractC06950Ym.A1E(CHY, 10));
                Iterator it101 = CHY.iterator();
                while (it101.hasNext()) {
                    arrayList101.add(((WhatsAppChannelShareToIgStoryStickerTappableObject) it101.next()).F3x(c1dy));
                }
            }
            obj.A1l(arrayList101);
        }
        if (AbstractC009903n.A0P(setFields, -1654914256)) {
            obj.A6T = getXpostDenyReason();
        }
        return obj;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: CFG modification limit reached, blocks count: 4366
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:64)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:44)
        */
    @Override // X.InterfaceC38831rF
    public final com.facebook.pando.TreeUpdaterJNI F7o() {
        /*
            Method dump skipped, instructions count: 18754
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C84483pr.F7o():com.facebook.pando.TreeUpdaterJNI");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: CFG modification limit reached, blocks count: 4141
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:64)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:44)
        */
    @Override // X.InterfaceC38831rF
    public final void FAz(X.InterfaceC38831rF r7) {
        /*
            Method dump skipped, instructions count: 18693
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C84483pr.FAz(X.1rF):void");
    }
}
