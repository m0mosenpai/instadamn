package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.PointF;
import android.text.TextUtils;
import android.util.SparseArray;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.common.dextricks.StringTreeSet;
import com.facebook.forker.Process;
import com.facebook.pando.TreeJNI;
import com.facebook.pando.TreeUpdaterJNI;
import com.facebook.systrace.Systrace;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import com.google.common.collect.ImmutableList;
import com.instagram.api.schemas.ClipsCreationEntryPoint;
import com.instagram.api.schemas.CollectionMediaRole;
import com.instagram.api.schemas.CommentGiphyMediaFixedHeightImages;
import com.instagram.api.schemas.CommentGiphyMediaImagesIntf;
import com.instagram.api.schemas.CommentGiphyMediaInfoIntf;
import com.instagram.api.schemas.FBTagType;
import com.instagram.api.schemas.IGCTMessagingAdsInfoDictIntf;
import com.instagram.api.schemas.IGPostTriggerExperience;
import com.instagram.api.schemas.ImmutablePandoUserTagInfoDict;
import com.instagram.api.schemas.InstapalCharacterType;
import com.instagram.api.schemas.MediaGenAIDetectionMethod;
import com.instagram.api.schemas.MediaReminder;
import com.instagram.api.schemas.MediaVCRTappableData;
import com.instagram.api.schemas.MediaVCRTappableDataIntf;
import com.instagram.api.schemas.MusicInfo;
import com.instagram.api.schemas.OpenCarouselSubmissionState;
import com.instagram.api.schemas.OriginalSoundData;
import com.instagram.api.schemas.OriginalSoundDataIntf;
import com.instagram.api.schemas.OriginalityInfo;
import com.instagram.api.schemas.ReplyControlStr;
import com.instagram.api.schemas.SMBSupportStickerDict;
import com.instagram.api.schemas.SMBSupportStickerDictIntf;
import com.instagram.api.schemas.SocialProofInfo;
import com.instagram.api.schemas.StoryGroupMentionTappableData;
import com.instagram.api.schemas.StoryGroupMentionTappableDataIntf;
import com.instagram.api.schemas.StoryLinkInfoDict;
import com.instagram.api.schemas.StoryLinkInfoDictIntf;
import com.instagram.api.schemas.StoryMusicPickTappableData;
import com.instagram.api.schemas.StoryMusicPickTappableDataIntf;
import com.instagram.api.schemas.StoryPromptTappableData;
import com.instagram.api.schemas.StoryPromptTappableDataIntf;
import com.instagram.api.schemas.StoryPromptType;
import com.instagram.api.schemas.StorySmbSupportStickerObject;
import com.instagram.api.schemas.StoryThenAndNowStickerDict;
import com.instagram.api.schemas.StoryThenAndNowStickerDictIntf;
import com.instagram.api.schemas.SubscriptionStickerDict;
import com.instagram.api.schemas.SubscriptionStickerDictIntf;
import com.instagram.api.schemas.TestimonialDict;
import com.instagram.api.schemas.UserTagInfoDictIntf;
import com.instagram.api.schemas.WearablesAppAttributionType;
import com.instagram.api.schemas.WhatsAppChannelShareToIgStoryStickerTappableObject;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.typedurl.SimpleImageUrl;
import com.instagram.debug.devoptions.direct.burner.BurnerSendSettingsHelper;
import com.instagram.feed.media.CameraToolInfoIntf;
import com.instagram.feed.media.CreativeConfigIntf;
import com.instagram.feed.media.ReelCTAIntf;
import com.instagram.model.androidlink.AndroidLink;
import com.instagram.model.fbusertag.FBUserTag;
import com.instagram.model.fundraiser.FundraiserCampaignTypeEnum;
import com.instagram.model.mediasize.AdditionalCandidates;
import com.instagram.model.mediasize.ExtendedImageUrl;
import com.instagram.model.mediasize.GifUrlImpl;
import com.instagram.model.mediasize.ImageInfo;
import com.instagram.model.mediasize.SpriteSheetInfoCandidates;
import com.instagram.model.mediasize.SpritesheetInfo;
import com.instagram.model.mediasize.VideoUrlImpl;
import com.instagram.model.mediatype.ProductType;
import com.instagram.model.people.PeopleTag;
import com.instagram.model.shopping.ProductTag;
import com.instagram.model.shopping.ProductTagDictIntf;
import com.instagram.model.shopping.clips.ClipsShoppingInfoIntf;
import com.instagram.model.shopping.clips.IGTVShoppingInfoIntf;
import com.instagram.model.shopping.reels.MultiProductSticker;
import com.instagram.model.shopping.reels.MultiProductStickerIntf;
import com.instagram.model.shopping.reels.ProductCollectionLinkIntf;
import com.instagram.model.shopping.reels.ProductSticker;
import com.instagram.model.shopping.reels.ProductStickerIntf;
import com.instagram.model.shopping.reels.ProfileShopLinkIntf;
import com.instagram.model.shopping.reels.ReelMultiProductLinkIntf;
import com.instagram.model.shopping.reels.ReelProductLink;
import com.instagram.model.shopping.reels.ReelProductLinkIntf;
import com.instagram.model.showreel.IgShowreelComposition;
import com.instagram.model.showreelnative.IgShowreelNativeAnimationIntf;
import com.instagram.model.upcomingeventsmetadata.UpcomingEventMedia;
import com.instagram.model.upcomingeventsmetadata.UpcomingEventMediaImpl;
import com.instagram.model.venue.LocationDict;
import com.instagram.model.venue.LocationDictIntf;
import com.instagram.model.venue.Venue;
import com.instagram.music.common.model.MusicAssetModel;
import com.instagram.music.common.model.MusicOverlayStickerModel;
import com.instagram.music.common.model.MusicOverlayStickerModelIntf;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.user.model.Product;
import com.instagram.user.model.ProductDetailsProductItemDict;
import com.instagram.user.model.UpcomingEvent;
import com.instagram.user.model.UpcomingEventImpl;
import com.instagram.user.model.User;
import go.Seq;
import java.io.File;
import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Deprecated;

/* renamed from: X.1qM, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C38321qM implements InterfaceC38371qR, InterfaceC38381qS, InterfaceC38391qT, C1NI, InterfaceC38401qU, InterfaceC38411qV, InterfaceC38421qW, C17L, C17M {
    public static final C38801rC A0h = new Object();
    public static final AtomicBoolean A0i = new AtomicBoolean();
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public long A04;
    public android.net.Uri A05;
    public C114665Fw A06;
    public C114665Fw A07;
    public C114665Fw A08;
    public ImageUrl A09;
    public C38668Gz9 A0A;
    public C38576Gxf A0B;
    public InterfaceC38831rF A0C;
    public C1EN A0D;
    public ExtendedImageUrl A0E;
    public C5Fk A0F;
    public Boolean A0G;
    public Integer A0H;
    public Integer A0I;
    public Integer A0J;
    public Integer A0K;
    public Integer A0L;
    public String A0M;
    public String A0N;
    public String A0O;
    public String A0P;
    public String A0Q;
    public String A0R;
    public List A0S;
    public List A0T;
    public List A0U;
    public List A0V;
    public List A0W;
    public boolean A0X;
    public C0f6 A0Y;
    public C96444Vc A0Z;
    public String A0a;
    public final InterfaceC114635Ft A0b;
    public final C40031tU A0c;
    public final C40041tV A0d;
    public final List A0e;
    public final boolean A0f;
    public final C1DV A0g;

    /* JADX WARN: Type inference failed for: r0v2, types: [X.1tU, java.lang.Object] */
    public C38321qM(C1DV c1dv, InterfaceC38831rF interfaceC38831rF) {
        InterfaceC114635Ft interfaceC114635Ft;
        SocialProofInfo ByW;
        C14360o3.A0B(interfaceC38831rF, 1);
        C14360o3.A0B(c1dv, 2);
        this.A0C = interfaceC38831rF;
        this.A0g = c1dv;
        this.A01 = -1;
        this.A02 = -1;
        this.A0c = new Object();
        this.A0U = new ArrayList();
        this.A0T = new ArrayList();
        List synchronizedList = Collections.synchronizedList(new ArrayList());
        C14360o3.A07(synchronizedList);
        this.A0e = synchronizedList;
        this.A0d = new C40041tV();
        this.A0D = C1EN.A0G;
        this.A0J = C05F.A00;
        this.A04 = -1L;
        List C6g = this.A0C.C6g();
        Integer num = null;
        if (C6g != null) {
            interfaceC114635Ft = (InterfaceC114635Ft) AbstractC001800i.A0J(C6g);
        } else {
            interfaceC114635Ft = null;
        }
        this.A0b = interfaceC114635Ft;
        IGCTMessagingAdsInfoDictIntf A1I = A1I();
        if (A1I != null && (ByW = A1I.ByW()) != null) {
            num = ByW.BXn();
        }
        this.A0I = num;
        this.A0f = C14360o3.A0K(this.A0C.CdR(), true);
    }

    public final int A16(UserSession userSession) {
        List Ap5;
        C14360o3.A0B(userSession, 0);
        C38321qM A1g = A1g(userSession);
        if (A1g.A5M()) {
            Ap5 = A1g.A0C.AmB();
            if (Ap5 == null) {
                throw new IllegalStateException("Required value was null.");
            }
        } else if (A1g.A5Q()) {
            Ap5 = A1g.A0C.Ap5();
            if (Ap5 == null) {
                throw new IllegalStateException("Required value was null.");
            }
        } else {
            return -1;
        }
        return Ap5.indexOf(this);
    }

    public final C38321qM A1g(UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        C38321qM A02 = C1DW.A00(userSession).A02(this.A0C.AmI());
        if (A02 == null && (A02 = C1DW.A00(userSession).A02(this.A0C.ApA())) == null) {
            return this;
        }
        return A02;
    }

    public final C38321qM A1h(String str) {
        List AmB;
        C14360o3.A0B(str, 0);
        Object obj = null;
        if (!A5O() || (AmB = this.A0C.AmB()) == null) {
            return null;
        }
        Iterator it = AmB.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (C14360o3.A0K(((C38321qM) next).getId(), str)) {
                obj = next;
                break;
            }
        }
        return (C38321qM) obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x00e8, code lost:
    
        if (X.C14360o3.A0K(r0.CbI(), true) != false) goto L49;
     */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x016d  */
    /* JADX WARN: Type inference failed for: r9v1, types: [X.1rF, X.1rE, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C114645Fu A1l(com.instagram.common.session.UserSession r22) {
        /*
            Method dump skipped, instructions count: 732
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C38321qM.A1l(com.instagram.common.session.UserSession):X.5Fu");
    }

    @Deprecated(message = "use getSizedImageTypedUrlWithFullWidthPixels instead")
    public final ExtendedImageUrl A1q(Context context) {
        C14360o3.A0B(context, 0);
        return A1p(AbstractC13880nE.A0A(context));
    }

    public final UpcomingEvent A2B(UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        UpcomingEvent CD4 = A1g(userSession).A0C.CD4();
        if (CD4 == null) {
            return null;
        }
        return AbstractC146056i3.A00(userSession).A00(CD4.getId());
    }

    public final User A2E(UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        User CDj = this.A0C.CDj();
        if (CDj == null && (CDj = A1g(userSession).A0C.CDj()) == null) {
            C0w9.A03("media_user_null", AnonymousClass001.A0u("Media user was null for mediaId=", getId(), " feed_session_id=", this.A0R));
        }
        return CDj;
    }

    public final String A3A() {
        A44(null);
        try {
            C38821rE F4n = this.A0C.F4n(this.A0g);
            StringWriter stringWriter = new StringWriter();
            C17z A0A = AbstractC221915u.A00.A0A(stringWriter);
            AbstractC38811rD.A00(A0A, F4n);
            A0A.close();
            return stringWriter.toString();
        } catch (IOException unused) {
            return null;
        }
    }

    public final String A3C(Context context) {
        C14360o3.A0B(context, 0);
        Resources resources = context.getResources();
        C14360o3.A07(resources);
        return C23831Eq.A09(resources, A1B());
    }

    public final String A3D(Context context) {
        C14360o3.A0B(context, 0);
        ExtendedImageUrl A1p = A1p(AbstractC13880nE.A0A(context));
        if (A1p != null) {
            return A1p.A0A;
        }
        return null;
    }

    public final List A3o() {
        ArrayList A3S = A3S(true);
        if (A3S != null && !A3S.isEmpty()) {
            return AbstractC34845FXd.A01(A3S);
        }
        return null;
    }

    public final List A3t(UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        List coauthorProducers = this.A0C.getCoauthorProducers();
        if (coauthorProducers != null && !coauthorProducers.isEmpty()) {
            linkedHashSet.add(A2E(userSession));
            linkedHashSet.addAll(coauthorProducers);
        }
        return AbstractC001800i.A0a(linkedHashSet);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void A47(UserSession userSession, User user) {
        InterfaceC84523py CEF;
        Object A00;
        String str;
        boolean z = false;
        if (A5M()) {
            List<C38321qM> AmB = this.A0C.AmB();
            if (AmB != null) {
                for (C38321qM c38321qM : AmB) {
                    c38321qM.A47(userSession, user);
                    c38321qM.AEH(userSession);
                }
                return;
            }
            return;
        }
        if (A51() && (CEF = this.A0C.CEF()) != 0) {
            InterfaceC38831rF interfaceC38831rF = this.A0C;
            CEF.CIr();
            List CIr = CEF.CIr();
            ArrayList<UserTagInfoDictIntf> arrayList = new ArrayList();
            for (Object obj : CIr) {
                User CDj = ((UserTagInfoDictIntf) obj).CDj();
                if (CDj != null) {
                    str = CDj.getId();
                } else {
                    str = null;
                }
                if (!C14360o3.A0K(str, user.getId())) {
                    arrayList.add(obj);
                }
            }
            new C1DY(new C37761pD(null), 6, z);
            if (CEF instanceof C38005Gnq) {
                ArrayList arrayList2 = new ArrayList();
                for (UserTagInfoDictIntf userTagInfoDictIntf : arrayList) {
                    if (userTagInfoDictIntf != null) {
                        arrayList2.add(userTagInfoDictIntf.F7o());
                    }
                }
                TreeJNI treeJNI = (TreeJNI) CEF;
                A00 = new TreeUpdaterJNI(AbstractC16850sd.A0M(new C09530e4("in", arrayList2)), treeJNI).applyToTree(treeJNI);
                C14360o3.A07(A00);
            } else {
                A00 = AbstractC40442HwX.A00(arrayList);
            }
            interfaceC38831rF.Egf((InterfaceC84523py) A00);
        }
    }

    public final void A4A(C41005IEa c41005IEa) {
        C14360o3.A0B(c41005IEa, 0);
        this.A0C.EbL(c41005IEa.A01);
        this.A0C.ERm(c41005IEa.A00);
        this.A0d.A02(this, A3f(), A3n());
    }

    public final void A4B(EnumC84933qh enumC84933qh, String str) {
        String str2;
        C14360o3.A0B(str, 0);
        C84923qg A1V = A1V();
        if (A1V != null) {
            str2 = A1V.A0G;
        } else {
            str2 = null;
        }
        if (C14360o3.A0K(str2, str)) {
            A1V.A06 = enumC84933qh;
            return;
        }
        C40041tV c40041tV = this.A0d;
        C84923qg A00 = C40051tW.A00(c40041tV.A05, str, true);
        C84923qg A002 = C40051tW.A00(c40041tV.A06, str, true);
        if (A00 != null) {
            A00.A06 = enumC84933qh;
            C40051tW.A02(c40041tV.A05);
        }
        if (A002 == null) {
            return;
        }
        A002.A06 = enumC84933qh;
        C40051tW.A02(c40041tV.A06);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void A4J(User user) {
        List<UserTagInfoDictIntf> CIr;
        String str;
        ArrayList arrayList;
        boolean z = false;
        if (A5M()) {
            List A3c = A3c();
            if (A3c != null) {
                Iterator it = A3c.iterator();
                while (it.hasNext()) {
                    ((C38321qM) it.next()).A4J(user);
                }
                return;
            }
            return;
        }
        InterfaceC84523py CEF = this.A0C.CEF();
        if (CEF != null && (CIr = CEF.CIr()) != null) {
            for (UserTagInfoDictIntf userTagInfoDictIntf : CIr) {
                User CDj = userTagInfoDictIntf.CDj();
                if (CDj != null) {
                    str = CDj.getId();
                } else {
                    str = null;
                }
                if (C14360o3.A0K(str, user.getId())) {
                    List AmW = userTagInfoDictIntf.AmW();
                    Float Azj = userTagInfoDictIntf.Azj();
                    List Bec = userTagInfoDictIntf.Bec();
                    userTagInfoDictIntf.Bw5();
                    Float Bzn = userTagInfoDictIntf.Bzn();
                    User CDj2 = userTagInfoDictIntf.CDj();
                    TreeUpdaterJNI treeUpdaterJNI = null;
                    int i = 6;
                    new C1DY(new C37761pD(null), i, z);
                    if (userTagInfoDictIntf instanceof ImmutablePandoUserTagInfoDict) {
                        C09530e4 c09530e4 = new C09530e4("categories", AmW);
                        C09530e4 c09530e42 = new C09530e4("duration_in_video_in_sec", AnonymousClass010.A0m(String.valueOf(Azj)));
                        if (Bec != null) {
                            arrayList = new ArrayList();
                            Iterator it2 = Bec.iterator();
                            while (it2.hasNext()) {
                                Double A0m = AnonymousClass010.A0m(String.valueOf(((Number) it2.next()).floatValue()));
                                if (A0m != null) {
                                    arrayList.add(A0m);
                                }
                            }
                        } else {
                            arrayList = null;
                        }
                        C09530e4 c09530e43 = new C09530e4("position", arrayList);
                        C09530e4 c09530e44 = new C09530e4("show_category_of_user", false);
                        C09530e4 c09530e45 = new C09530e4("start_time_in_video_in_sec", AnonymousClass010.A0m(String.valueOf(Bzn)));
                        if (CDj2 != null) {
                            treeUpdaterJNI = CDj2.A07();
                        }
                        TreeJNI treeJNI = (TreeJNI) userTagInfoDictIntf;
                        C14360o3.A07(new TreeUpdaterJNI(AbstractC06930Yk.A06(c09530e4, c09530e42, c09530e43, c09530e44, c09530e45, new C09530e4(PublicKeyCredentialControllerUtility.JSON_KEY_USER, treeUpdaterJNI)), treeJNI).applyToTree(treeJNI));
                    } else {
                        new C1DY(new C37761pD(null), i, z);
                    }
                }
            }
        }
    }

    public final void A4N(String str) {
        C14360o3.A0B(str, 0);
        List BE4 = this.A0C.BE4();
        if (BE4 != null && !BE4.contains(str)) {
            C15500q5.A02(BE4).add(str);
        }
    }

    public final void A4O(String str) {
        C14360o3.A0B(str, 0);
        List BE4 = this.A0C.BE4();
        if (C15500q5.A09(BE4) && BE4 != null) {
            BE4.remove(str);
        }
    }

    public final boolean A6Y(UserSession userSession) {
        OriginalityInfo Ba3;
        C14360o3.A0B(userSession, 0);
        C3x9 clipsMetadata = this.A0C.getClipsMetadata();
        if (clipsMetadata != null && (Ba3 = clipsMetadata.Ba3()) != null && Ba3.BZp() != null && C18U.A06(C06090Tz.A06, userSession, 36325630798935262L)) {
            return true;
        }
        return false;
    }

    public final boolean A6Z(UserSession userSession) {
        String str;
        User CDj;
        String A00;
        List AmB = this.A0C.AmB();
        if (AmB != null) {
            ArrayList arrayList = new ArrayList(AmB);
            if (!arrayList.isEmpty()) {
                String id = C17060sy.A01.A01(userSession).getId();
                Iterator it = arrayList.iterator();
                int i = 0;
                while (it.hasNext()) {
                    C38321qM c38321qM = (C38321qM) it.next();
                    if (!c38321qM.A5s()) {
                        if (!c38321qM.A5u()) {
                            User Bg6 = c38321qM.A0C.Bg6();
                            if (Bg6 != null) {
                                str = Bg6.getId();
                            } else {
                                str = null;
                            }
                            if (!C14360o3.A0K(id, str)) {
                                if (c38321qM.A0C.Bg6() == null && (CDj = this.A0C.CDj()) != null && (A00 = AbstractC76433bn.A00(CDj)) != null && A00.equals(id)) {
                                }
                            }
                        }
                        i++;
                        if (i == 10) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final boolean A6a(UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        return A2B(userSession) != null;
    }

    public final boolean A6c(UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        if (OpenCarouselSubmissionState.A07 == this.A0C.BZ5() && C18U.A06(C06090Tz.A05, userSession, 36320244910203048L)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0022, code lost:
    
        if (X.C36A.A0G(r5) == false) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A6d(com.instagram.common.session.UserSession r5) {
        /*
            r4 = this;
            r0 = 0
            X.C14360o3.A0B(r5, r0)
            boolean r0 = r4.A5N()
            com.instagram.user.model.User r1 = r4.A2E(r5)
            if (r0 == 0) goto L3c
            X.1qM r0 = r4.A1g(r5)
            boolean r0 = r0.A4i()
            boolean r3 = X.C36A.A0J(r5, r1, r0)
        L1a:
            r2 = 1
            if (r3 == 0) goto L24
            boolean r0 = X.C36A.A0G(r5)
            r1 = 1
            if (r0 != 0) goto L25
        L24:
            r1 = 0
        L25:
            boolean r0 = r4.Cff()
            if (r0 != 0) goto L3b
            boolean r0 = r4.A4y()
            if (r0 == 0) goto L33
            if (r3 != 0) goto L3b
        L33:
            boolean r0 = r4.A50()
            if (r0 == 0) goto L41
            if (r1 == 0) goto L41
        L3b:
            return r2
        L3c:
            boolean r3 = X.C36A.A0I(r5, r1)
            goto L1a
        L41:
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C38321qM.A6d(com.instagram.common.session.UserSession):boolean");
    }

    public final boolean A6e(UserSession userSession) {
        String str;
        C14360o3.A0B(userSession, 0);
        Boolean CdB = this.A0C.CdB();
        if (CdB != null) {
            return CdB.booleanValue();
        }
        boolean z = false;
        ArrayList A3S = A3S(false);
        User A2E = A2E(userSession);
        if (A3S != null && (!(A3S instanceof Collection) || !A3S.isEmpty())) {
            Iterator it = A3S.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Product product = (Product) it.next();
                if (A2E != null) {
                    User user = product.A0B;
                    if (user != null) {
                        str = AbstractC76433bn.A00(user);
                    } else {
                        str = null;
                    }
                    if (!C14360o3.A0K(str, A2E.getId())) {
                        z = true;
                        break;
                    }
                }
            }
        }
        this.A0C.Edu(Boolean.valueOf(z));
        return z;
    }

    public final boolean A6f(UserSession userSession) {
        CreativeConfigIntf Asm;
        List B9a;
        C14360o3.A0B(userSession, 0);
        C06090Tz c06090Tz = C06090Tz.A05;
        if (C18U.A06(c06090Tz, userSession, 36324411028025500L) && !C14360o3.A0K(this.A0C.BBn(), true) && ((Asm = this.A0C.Asm()) == null || (B9a = Asm.B9a()) == null || B9a.isEmpty() || !C18U.A06(c06090Tz, userSession, 36319888427589353L))) {
            MediaGenAIDetectionMethod A1J = A1J();
            if (C18U.A06(c06090Tz, userSession, 36324411028222111L) && A1J != null && (A1J == MediaGenAIDetectionMethod.A07 || A1J == MediaGenAIDetectionMethod.A05)) {
                return false;
            }
            return A4q();
        }
        return false;
    }

    public final boolean A6m(User user) {
        List<UserTagInfoDictIntf> CIr;
        String str;
        List AmW;
        Boolean Bw5;
        if (A5M()) {
            List A3c = A3c();
            if (A3c != null) {
                if ((A3c instanceof Collection) && A3c.isEmpty()) {
                    return false;
                }
                Iterator it = A3c.iterator();
                while (it.hasNext()) {
                    if (((C38321qM) it.next()).A6m(user)) {
                        return true;
                    }
                }
                return false;
            }
            return false;
        }
        InterfaceC84523py CEF = this.A0C.CEF();
        if (CEF != null && (CIr = CEF.CIr()) != null) {
            for (UserTagInfoDictIntf userTagInfoDictIntf : CIr) {
                User CDj = userTagInfoDictIntf.CDj();
                if (CDj != null) {
                    str = CDj.getId();
                } else {
                    str = null;
                }
                if (C14360o3.A0K(str, user.getId()) && (AmW = userTagInfoDictIntf.AmW()) != null && (Bw5 = userTagInfoDictIntf.Bw5()) != null) {
                    boolean booleanValue = Bw5.booleanValue();
                    CharSequence charSequence = (CharSequence) AmW.get(0);
                    if (charSequence != null && !AbstractC001900j.A0T(charSequence) && booleanValue) {
                        return true;
                    }
                    return false;
                }
            }
        }
        return false;
    }

    public final boolean A6n(String str) {
        C14360o3.A0B(str, 0);
        List Aoc = this.A0C.Aoc();
        if (Aoc != null) {
            if ((Aoc instanceof Collection) && Aoc.isEmpty()) {
                return false;
            }
            Iterator it = Aoc.iterator();
            while (it.hasNext()) {
                if (C14360o3.A0K(it.next(), str)) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public final boolean A6o(String str) {
        C14360o3.A0B(str, 0);
        List C8a = this.A0C.C8a();
        if (C8a != null) {
            if ((C8a instanceof Collection) && C8a.isEmpty()) {
                return false;
            }
            Iterator it = C8a.iterator();
            while (it.hasNext()) {
                if (C14360o3.A0K(it.next(), str)) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    @Override // X.InterfaceC38391qT
    public final void AEH(AbstractC12990ll abstractC12990ll) {
        C14360o3.A0B(abstractC12990ll, 0);
        AbstractC25651Mw.A00(abstractC12990ll).E4s(new C57452kK(this, true));
    }

    @Override // X.InterfaceC38371qR
    public final C38321qM BQN() {
        return this;
    }

    @Override // X.InterfaceC38411qV
    public final List BSa() {
        String A00;
        ArrayList A3S = A3S(true);
        if (A3S != null && !A3S.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            Iterator it = A3S.iterator();
            while (it.hasNext()) {
                User user = ((Product) it.next()).A0B;
                if (user != null && (A00 = AbstractC76433bn.A00(user)) != null) {
                    arrayList.add(A00);
                }
            }
            return arrayList;
        }
        return null;
    }

    @Override // X.InterfaceC38411qV
    public final List Bh4() {
        ArrayList A3S = A3S(true);
        if (A3S != null && !A3S.isEmpty()) {
            return AbstractC34845FXd.A00(A3S);
        }
        return null;
    }

    @Override // X.InterfaceC38391qT
    public final void Ed3(EnumC77213d7 enumC77213d7) {
        C14360o3.A0B(enumC77213d7, 0);
        this.A0C.EVg(Boolean.valueOf(enumC77213d7 == EnumC77213d7.A04));
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C38321qM) && C14360o3.A0K(getClass(), obj.getClass()) && C14360o3.A0K(getId(), ((C38321qM) obj).getId()));
    }

    public static final C38321qM A00(C16L c16l) {
        return A0h.A0C(c16l, true, false);
    }

    private final ArrayList A02() {
        StoryThenAndNowStickerDict storyThenAndNowStickerDict;
        List<YR1> C1D = this.A0C.C1D();
        if (C1D != null) {
            ArrayList arrayList = new ArrayList(AbstractC06950Ym.A1E(C1D, 10));
            for (YR1 yr1 : C1D) {
                C14360o3.A0B(yr1, 0);
                C84823qW c84823qW = new C84823qW(EnumC75383a5.A0B, yr1.CI1(), yr1.CIa(), yr1.CIh(), yr1.CHf(), yr1.BDR(), yr1.Bpa(), yr1.CVk(), yr1.Cdh(), yr1.CUY(), yr1.Ayd(), yr1.AdC(), yr1.getId());
                StoryThenAndNowStickerDictIntf Afs = yr1.Afs();
                if (Afs != null) {
                    storyThenAndNowStickerDict = Afs.F2F();
                } else {
                    storyThenAndNowStickerDict = null;
                }
                c84823qW.A0d = storyThenAndNowStickerDict;
                arrayList.add(c84823qW);
            }
            return new ArrayList(arrayList);
        }
        return null;
    }

    private final ArrayList A03() {
        H7X h7x;
        List<InterfaceC73616YQe> C1R = this.A0C.C1R();
        if (C1R != null) {
            ArrayList arrayList = new ArrayList(AbstractC06950Ym.A1E(C1R, 10));
            for (InterfaceC73616YQe interfaceC73616YQe : C1R) {
                C14360o3.A0B(interfaceC73616YQe, 0);
                C84823qW c84823qW = new C84823qW(EnumC75383a5.A0U, interfaceC73616YQe.CI1(), interfaceC73616YQe.CIa(), interfaceC73616YQe.CIh(), interfaceC73616YQe.CHf(), interfaceC73616YQe.BDR(), interfaceC73616YQe.Bpa(), interfaceC73616YQe.CVk(), interfaceC73616YQe.Cdh(), interfaceC73616YQe.CUY(), interfaceC73616YQe.Ayd(), interfaceC73616YQe.AdC(), interfaceC73616YQe.getId());
                InterfaceC43525JKl B0o = interfaceC73616YQe.B0o();
                if (B0o != null) {
                    h7x = B0o.F54();
                } else {
                    h7x = null;
                }
                c84823qW.A0k = h7x;
                arrayList.add(c84823qW);
            }
            return new ArrayList(arrayList);
        }
        return null;
    }

    private final ArrayList A04() {
        C38760H5a c38760H5a;
        List<InterfaceC73618YQg> C1W = this.A0C.C1W();
        if (C1W != null) {
            ArrayList arrayList = new ArrayList(AbstractC06950Ym.A1E(C1W, 10));
            for (InterfaceC73618YQg interfaceC73618YQg : C1W) {
                C14360o3.A0B(interfaceC73618YQg, 0);
                C84823qW c84823qW = new C84823qW(EnumC75383a5.A0Y, interfaceC73618YQg.CI1(), interfaceC73618YQg.CIa(), interfaceC73618YQg.CIh(), interfaceC73618YQg.CHf(), interfaceC73618YQg.BDR(), interfaceC73618YQg.Bpa(), interfaceC73618YQg.CVk(), interfaceC73618YQg.Cdh(), interfaceC73618YQg.CUY(), interfaceC73618YQg.Ayd(), interfaceC73618YQg.AdC(), interfaceC73618YQg.getId());
                InterfaceC43560JLu B51 = interfaceC73618YQg.B51();
                if (B51 != null) {
                    c38760H5a = B51.F0Q();
                } else {
                    c38760H5a = null;
                }
                c84823qW.A0T = c38760H5a;
                arrayList.add(c84823qW);
            }
            return new ArrayList(arrayList);
        }
        return null;
    }

    private final ArrayList A05() {
        C8F9 c8f9;
        List<InterfaceC73614YQc> BT5 = this.A0C.BT5();
        if (BT5 != null) {
            C1DV c1dv = this.A0g;
            ArrayList arrayList = new ArrayList(AbstractC06950Ym.A1E(BT5, 10));
            for (InterfaceC73614YQc interfaceC73614YQc : BT5) {
                C14360o3.A0B(interfaceC73614YQc, 0);
                C84823qW c84823qW = new C84823qW(EnumC75383a5.A0p, interfaceC73614YQc.CI1(), interfaceC73614YQc.CIa(), interfaceC73614YQc.CIh(), interfaceC73614YQc.CHf(), interfaceC73614YQc.BDR(), interfaceC73614YQc.Bpa(), interfaceC73614YQc.CVk(), interfaceC73614YQc.Cdh(), interfaceC73614YQc.CUY(), interfaceC73614YQc.Ayd(), interfaceC73614YQc.AdC(), interfaceC73614YQc.getId());
                XGL BKJ = interfaceC73614YQc.BKJ();
                if (BKJ != null) {
                    c8f9 = new C8F9(null, null, null, null, null, BKJ.F6n(c1dv), "", "", null, null, null, false, false, false, false);
                } else {
                    c8f9 = null;
                }
                c84823qW.A14 = c8f9;
                arrayList.add(c84823qW);
            }
            return new ArrayList(arrayList);
        }
        return null;
    }

    private final ArrayList A06() {
        List<AnonymousClass447> Blj = this.A0C.Blj();
        if (Blj != null) {
            ArrayList arrayList = new ArrayList(AbstractC06950Ym.A1E(Blj, 10));
            for (AnonymousClass447 anonymousClass447 : Blj) {
                C14360o3.A0B(anonymousClass447, 0);
                C84823qW c84823qW = new C84823qW(EnumC75383a5.A0n, anonymousClass447.CI1(), anonymousClass447.CIa(), anonymousClass447.CIh(), anonymousClass447.CHf(), anonymousClass447.BDR(), anonymousClass447.Bpa(), anonymousClass447.CVk(), anonymousClass447.Cdh(), anonymousClass447.CUY(), anonymousClass447.Ayd(), anonymousClass447.AdC(), anonymousClass447.getId());
                c84823qW.A1C = anonymousClass447.CDj();
                arrayList.add(c84823qW);
            }
            return new ArrayList(arrayList);
        }
        return null;
    }

    private final ArrayList A07() {
        C41743IeH c41743IeH;
        List<YQY> C18 = this.A0C.C18();
        if (C18 != null) {
            ArrayList arrayList = new ArrayList(AbstractC06950Ym.A1E(C18, 10));
            for (YQY yqy : C18) {
                C14360o3.A0B(yqy, 0);
                C84823qW c84823qW = new C84823qW(EnumC75383a5.A07, yqy.CI1(), yqy.CIa(), yqy.CIh(), yqy.CHf(), yqy.BDR(), yqy.Bpa(), yqy.CVk(), yqy.Cdh(), yqy.CUY(), yqy.Ayd(), yqy.AdC(), yqy.getId());
                JLY Ac7 = yqy.Ac7();
                if (Ac7 != null) {
                    c41743IeH = new C41743IeH(Ac7);
                } else {
                    c41743IeH = null;
                }
                c84823qW.A1E = c41743IeH;
                arrayList.add(c84823qW);
            }
            return new ArrayList(arrayList);
        }
        return null;
    }

    private final ArrayList A08() {
        C41743IeH c41743IeH;
        List<YQZ> C19 = this.A0C.C19();
        if (C19 != null) {
            ArrayList arrayList = new ArrayList(AbstractC06950Ym.A1E(C19, 10));
            for (YQZ yqz : C19) {
                C14360o3.A0B(yqz, 0);
                C84823qW c84823qW = new C84823qW(EnumC75383a5.A06, yqz.CI1(), yqz.CIa(), yqz.CIh(), yqz.CHf(), yqz.BDR(), yqz.Bpa(), yqz.CVk(), yqz.Cdh(), yqz.CUY(), yqz.Ayd(), yqz.AdC(), yqz.getId());
                JLY Ac8 = yqz.Ac8();
                if (Ac8 != null) {
                    c41743IeH = new C41743IeH(Ac8);
                } else {
                    c41743IeH = null;
                }
                c84823qW.A1D = c41743IeH;
                arrayList.add(c84823qW);
            }
            return new ArrayList(arrayList);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v2, types: [X.IeH, java.lang.Object] */
    private final ArrayList A09() {
        C41743IeH c41743IeH;
        int i;
        List<InterfaceC73612YQa> C1G = this.A0C.C1G();
        if (C1G != null) {
            ArrayList arrayList = new ArrayList(AbstractC06950Ym.A1E(C1G, 10));
            for (InterfaceC73612YQa interfaceC73612YQa : C1G) {
                C14360o3.A0B(interfaceC73612YQa, 0);
                C84823qW c84823qW = new C84823qW(EnumC75383a5.A0E, interfaceC73612YQa.CI1(), interfaceC73612YQa.CIa(), interfaceC73612YQa.CIh(), interfaceC73612YQa.CHf(), interfaceC73612YQa.BDR(), interfaceC73612YQa.Bpa(), interfaceC73612YQa.CVk(), interfaceC73612YQa.Cdh(), interfaceC73612YQa.CUY(), interfaceC73612YQa.Ayd(), interfaceC73612YQa.AdC(), interfaceC73612YQa.getId());
                JMU Agg = interfaceC73612YQa.Agg();
                if (Agg != null) {
                    c41743IeH = new Object();
                    c41743IeH.A0A = new HashMap();
                    c41743IeH.A0B = new HashMap();
                    c41743IeH.A0C = new HashMap();
                    c41743IeH.A06 = Agg.AgO();
                    c41743IeH.A09 = Agg.getId();
                    Map AgZ = Agg.AgZ();
                    if (AgZ != null) {
                        c41743IeH.A0A = new HashMap(AgZ);
                    }
                    Integer Bx0 = Agg.Bx0();
                    boolean z = false;
                    if (Bx0 != null) {
                        i = Bx0.intValue();
                    } else {
                        i = 0;
                    }
                    c41743IeH.A00 = i;
                    c41743IeH.A08 = Agg.BYQ();
                    c41743IeH.A05 = Agg.AYf();
                    Boolean BvJ = Agg.BvJ();
                    if (BvJ != null) {
                        z = BvJ.booleanValue();
                    }
                    c41743IeH.A0D = z;
                } else {
                    c41743IeH = 0;
                }
                c84823qW.A1G = c41743IeH;
                arrayList.add(c84823qW);
            }
            return new ArrayList(arrayList);
        }
        return null;
    }

    private final ArrayList A0A() {
        URL url;
        List<InterfaceC73615YQd> C1M = this.A0C.C1M();
        if (C1M != null) {
            C1DV c1dv = this.A0g;
            ArrayList arrayList = new ArrayList(AbstractC06950Ym.A1E(C1M, 10));
            for (InterfaceC73615YQd interfaceC73615YQd : C1M) {
                C14360o3.A0B(interfaceC73615YQd, 0);
                C84823qW c84823qW = new C84823qW(EnumC75383a5.A0O, interfaceC73615YQd.CI1(), interfaceC73615YQd.CIa(), interfaceC73615YQd.CIh(), interfaceC73615YQd.CHf(), interfaceC73615YQd.BDR(), interfaceC73615YQd.Bpa(), interfaceC73615YQd.CVk(), interfaceC73615YQd.Cdh(), interfaceC73615YQd.CUY(), interfaceC73615YQd.Ayd(), interfaceC73615YQd.AdC(), interfaceC73615YQd.getId());
                XGK As4 = interfaceC73615YQd.As4();
                if (As4 != null) {
                    url = As4.F0F(c1dv);
                } else {
                    url = null;
                }
                c84823qW.A0R = url;
                arrayList.add(c84823qW);
            }
            return new ArrayList(arrayList);
        }
        return null;
    }

    private final ArrayList A0B() {
        C38763H5d c38763H5d;
        List<InterfaceC73619YQh> C1X = this.A0C.C1X();
        if (C1X != null) {
            ArrayList arrayList = new ArrayList(AbstractC06950Ym.A1E(C1X, 10));
            for (InterfaceC73619YQh interfaceC73619YQh : C1X) {
                C14360o3.A0B(interfaceC73619YQh, 0);
                C84823qW c84823qW = new C84823qW(EnumC75383a5.A0Z, interfaceC73619YQh.CI1(), interfaceC73619YQh.CIa(), interfaceC73619YQh.CIh(), interfaceC73619YQh.CHf(), interfaceC73619YQh.BDR(), interfaceC73619YQh.Bpa(), interfaceC73619YQh.CVk(), interfaceC73619YQh.Cdh(), interfaceC73619YQh.CUY(), interfaceC73619YQh.Ayd(), interfaceC73619YQh.AdC(), interfaceC73619YQh.getId());
                JKV B5J = interfaceC73619YQh.B5J();
                if (B5J != null) {
                    c38763H5d = B5J.F0V();
                } else {
                    c38763H5d = null;
                }
                c84823qW.A0U = c38763H5d;
                arrayList.add(c84823qW);
            }
            return new ArrayList(arrayList);
        }
        return null;
    }

    private final ArrayList A0C() {
        List<InterfaceC84683qH> C1Y = this.A0C.C1Y();
        if (C1Y != null) {
            ArrayList arrayList = new ArrayList();
            for (InterfaceC84683qH interfaceC84683qH : C1Y) {
                C14360o3.A0B(interfaceC84683qH, 0);
                C84823qW c84823qW = new C84823qW(EnumC75383a5.A0k, interfaceC84683qH.CI1(), interfaceC84683qH.CIa(), interfaceC84683qH.CIh(), interfaceC84683qH.CHf(), interfaceC84683qH.BDR(), interfaceC84683qH.Bpa(), interfaceC84683qH.CVk(), interfaceC84683qH.Cdh(), interfaceC84683qH.CUY(), interfaceC84683qH.Ayd(), interfaceC84683qH.AdC(), interfaceC84683qH.getId());
                ClipsCreationEntryPoint clipsCreationEntryPoint = (ClipsCreationEntryPoint) ClipsCreationEntryPoint.A01.get(interfaceC84683qH.getClipsCreationEntryPoint());
                if (clipsCreationEntryPoint == null) {
                    clipsCreationEntryPoint = ClipsCreationEntryPoint.A06;
                }
                c84823qW.A0E = clipsCreationEntryPoint;
                String productType = interfaceC84683qH.getProductType();
                String str = "";
                if (productType == null) {
                    productType = "";
                }
                c84823qW.A0n = (ProductType) ProductType.A01.get(productType);
                String mediaType = interfaceC84683qH.getMediaType();
                if (mediaType != null) {
                    str = mediaType;
                }
                c84823qW.A0m = AbstractC40091ta.A01(str);
                c84823qW.A1b = interfaceC84683qH.getMediaId();
                c84823qW.A1a = interfaceC84683qH.BQY();
                arrayList.add(c84823qW);
            }
            return new ArrayList(arrayList);
        }
        return null;
    }

    private final ArrayList A0D() {
        C189138Ze c189138Ze;
        List<InterfaceC73621YQj> C1b = this.A0C.C1b();
        if (C1b != null) {
            C1DV c1dv = this.A0g;
            ArrayList arrayList = new ArrayList(AbstractC06950Ym.A1E(C1b, 10));
            for (InterfaceC73621YQj interfaceC73621YQj : C1b) {
                C14360o3.A0B(interfaceC73621YQj, 0);
                C84823qW c84823qW = new C84823qW(EnumC75383a5.A0b, interfaceC73621YQj.CI1(), interfaceC73621YQj.CIa(), interfaceC73621YQj.CIh(), interfaceC73621YQj.CHf(), interfaceC73621YQj.BDR(), interfaceC73621YQj.Bpa(), interfaceC73621YQj.CVk(), interfaceC73621YQj.Cdh(), interfaceC73621YQj.CUY(), interfaceC73621YQj.Ayd(), interfaceC73621YQj.AdC(), interfaceC73621YQj.getId());
                Integer CUY = interfaceC73621YQj.CUY();
                boolean z = true;
                if (CUY == null || CUY.intValue() != 1) {
                    z = false;
                }
                c84823qW.A1s = z;
                c84823qW.A1T = interfaceC73621YQj.getId();
                InterfaceC189148Zf B96 = interfaceC73621YQj.B96();
                if (B96 != null) {
                    c189138Ze = B96.F6t(c1dv);
                } else {
                    c189138Ze = null;
                }
                c84823qW.A0z = c189138Ze;
                arrayList.add(c84823qW);
            }
            return new ArrayList(arrayList);
        }
        return null;
    }

    private final ArrayList A0E() {
        String name;
        List<C5KP> C1d = this.A0C.C1d();
        if (C1d != null) {
            ArrayList arrayList = new ArrayList(AbstractC06950Ym.A1E(C1d, 10));
            for (C5KP c5kp : C1d) {
                C14360o3.A0B(c5kp, 0);
                C84823qW c84823qW = new C84823qW(EnumC75383a5.A0d, c5kp.CI1(), c5kp.CIa(), c5kp.CIh(), c5kp.CHf(), c5kp.BDR(), c5kp.Bpa(), c5kp.CVk(), c5kp.Cdh(), c5kp.CUY(), c5kp.Ayd(), c5kp.AdC(), c5kp.getId());
                C5KN BD3 = c5kp.BD3();
                String str = null;
                if (BD3 != null) {
                    str = BD3.getId();
                }
                String str2 = "";
                if (str == null) {
                    str = "";
                }
                C5KN BD32 = c5kp.BD3();
                if (BD32 != null && (name = BD32.getName()) != null) {
                    str2 = name;
                }
                c84823qW.A0l = AbstractC1120253r.A01(str, str2);
                arrayList.add(c84823qW);
            }
            return new ArrayList(arrayList);
        }
        return null;
    }

    private final ArrayList A0F() {
        List<InterfaceC73623YQl> C1f = this.A0C.C1f();
        if (C1f != null) {
            ArrayList arrayList = new ArrayList(AbstractC06950Ym.A1E(C1f, 10));
            for (InterfaceC73623YQl interfaceC73623YQl : C1f) {
                C14360o3.A0B(interfaceC73623YQl, 0);
                arrayList.add(new C84823qW(EnumC75383a5.A0f, interfaceC73623YQl.CI1(), interfaceC73623YQl.CIa(), interfaceC73623YQl.CIh(), interfaceC73623YQl.CHf(), interfaceC73623YQl.BDR(), interfaceC73623YQl.Bpa(), interfaceC73623YQl.CVk(), interfaceC73623YQl.Cdh(), interfaceC73623YQl.CUY(), interfaceC73623YQl.Ayd(), interfaceC73623YQl.AdC(), interfaceC73623YQl.getId()));
            }
            return new ArrayList(arrayList);
        }
        return null;
    }

    private final ArrayList A0G() {
        LocationDict locationDict;
        List<InterfaceC1123955r> C1j = this.A0C.C1j();
        if (C1j != null) {
            ArrayList arrayList = new ArrayList(AbstractC06950Ym.A1E(C1j, 10));
            for (InterfaceC1123955r interfaceC1123955r : C1j) {
                C14360o3.A0B(interfaceC1123955r, 0);
                C84823qW c84823qW = new C84823qW(EnumC75383a5.A0j, interfaceC1123955r.CI1(), interfaceC1123955r.CIa(), interfaceC1123955r.CIh(), interfaceC1123955r.CHf(), interfaceC1123955r.BDR(), interfaceC1123955r.Bpa(), interfaceC1123955r.CVk(), interfaceC1123955r.Cdh(), interfaceC1123955r.CUY(), interfaceC1123955r.Ayd(), interfaceC1123955r.AdC(), interfaceC1123955r.getId());
                LocationDictIntf BOL = interfaceC1123955r.BOL();
                if (BOL != null) {
                    locationDict = BOL.F6g();
                } else {
                    locationDict = null;
                }
                c84823qW.A0u = locationDict;
                arrayList.add(c84823qW);
            }
            return new ArrayList(arrayList);
        }
        return null;
    }

    private final ArrayList A0H() {
        List<InterfaceC73624YQm> C1l = this.A0C.C1l();
        if (C1l != null) {
            ArrayList arrayList = new ArrayList(AbstractC06950Ym.A1E(C1l, 10));
            for (InterfaceC73624YQm interfaceC73624YQm : C1l) {
                C14360o3.A0B(interfaceC73624YQm, 0);
                C84823qW c84823qW = new C84823qW(EnumC75383a5.A0q, interfaceC73624YQm.CI1(), interfaceC73624YQm.CIa(), interfaceC73624YQm.CIh(), interfaceC73624YQm.CHf(), interfaceC73624YQm.BDR(), interfaceC73624YQm.Bpa(), interfaceC73624YQm.CVk(), interfaceC73624YQm.Cdh(), interfaceC73624YQm.CUY(), interfaceC73624YQm.Ayd(), interfaceC73624YQm.AdC(), interfaceC73624YQm.getId());
                MultiProductStickerIntf BVP = interfaceC73624YQm.BVP();
                MultiProductSticker multiProductSticker = null;
                if (BVP != null) {
                    multiProductSticker = BVP.F6G(null);
                }
                c84823qW.A0o = multiProductSticker;
                arrayList.add(c84823qW);
            }
            return new ArrayList(arrayList);
        }
        return null;
    }

    private final ArrayList A0I() {
        OriginalSoundData originalSoundData;
        Integer num;
        List<C4A3> C1o = this.A0C.C1o();
        if (C1o != null) {
            C1DV c1dv = this.A0g;
            ArrayList arrayList = new ArrayList();
            for (C4A3 c4a3 : C1o) {
                if (c4a3 != null) {
                    C84823qW c84823qW = new C84823qW(EnumC75383a5.A0s, c4a3.CI1(), c4a3.CIa(), c4a3.CIh(), c4a3.CHf(), c4a3.BDR(), c4a3.Bpa(), c4a3.CVk(), c4a3.Cdh(), c4a3.CUY(), c4a3.Ayd(), c4a3.AdC(), c4a3.getId());
                    MusicOverlayStickerModel musicOverlayStickerModel = null;
                    Integer num2 = null;
                    if (c4a3.BZw() != null) {
                        OriginalSoundDataIntf BZw = c4a3.BZw();
                        if (BZw != null) {
                            originalSoundData = BZw.Exj(c1dv);
                        } else {
                            originalSoundData = null;
                        }
                        MusicAssetModel A00 = MusicAssetModel.A00(originalSoundData, false);
                        C14360o3.A0A(A00);
                        if (originalSoundData != null) {
                            num = originalSoundData.A0C;
                            num2 = originalSoundData.A0E;
                        } else {
                            num = null;
                        }
                        musicOverlayStickerModel = AbstractC23129AMi.A01(null, A00, num2, null, num, null, null, null, null);
                    } else {
                        MusicOverlayStickerModelIntf BVW = c4a3.BVW();
                        if (BVW != null) {
                            musicOverlayStickerModel = BVW.F6k(c1dv);
                        }
                    }
                    c84823qW.A0v = musicOverlayStickerModel;
                    arrayList.add(c84823qW);
                }
            }
            return new ArrayList(arrayList);
        }
        return null;
    }

    private final ArrayList A0J() {
        List<InterfaceC73631YQt> C1v = this.A0C.C1v();
        if (C1v != null) {
            ArrayList arrayList = new ArrayList(AbstractC06950Ym.A1E(C1v, 10));
            for (InterfaceC73631YQt interfaceC73631YQt : C1v) {
                C14360o3.A0B(interfaceC73631YQt, 0);
                C84823qW c84823qW = new C84823qW(EnumC75383a5.A10, interfaceC73631YQt.CI1(), interfaceC73631YQt.CIa(), interfaceC73631YQt.CIh(), interfaceC73631YQt.CHf(), interfaceC73631YQt.BDR(), interfaceC73631YQt.Bpa(), interfaceC73631YQt.CVk(), interfaceC73631YQt.Cdh(), interfaceC73631YQt.CUY(), interfaceC73631YQt.Ayd(), interfaceC73631YQt.AdC(), interfaceC73631YQt.getId());
                JLI BhI = interfaceC73631YQt.BhI();
                C38821H7n c38821H7n = null;
                if (BhI != null) {
                    c38821H7n = BhI.F6M(null);
                }
                c84823qW.A0q = c38821H7n;
                arrayList.add(c84823qW);
            }
            return new ArrayList(arrayList);
        }
        return null;
    }

    private final ArrayList A0K() {
        URE ure;
        List<InterfaceC73632YQu> C21 = this.A0C.C21();
        if (C21 != null) {
            ArrayList arrayList = new ArrayList(AbstractC06950Ym.A1E(C21, 10));
            for (InterfaceC73632YQu interfaceC73632YQu : C21) {
                C14360o3.A0B(interfaceC73632YQu, 0);
                C84823qW c84823qW = new C84823qW(EnumC75383a5.A14, interfaceC73632YQu.CI1(), interfaceC73632YQu.CIa(), interfaceC73632YQu.CIh(), interfaceC73632YQu.CHf(), interfaceC73632YQu.BDR(), interfaceC73632YQu.Bpa(), interfaceC73632YQu.CVk(), interfaceC73632YQu.Cdh(), interfaceC73632YQu.CUY(), interfaceC73632YQu.Ayd(), interfaceC73632YQu.AdC(), interfaceC73632YQu.getId());
                XGI Bje = interfaceC73632YQu.Bje();
                if (Bje != null) {
                    ure = Bje.Eys();
                } else {
                    ure = null;
                }
                c84823qW.A0O = ure;
                arrayList.add(c84823qW);
            }
            return new ArrayList(arrayList);
        }
        return null;
    }

    private final ArrayList A0L() {
        URM urm;
        List<InterfaceC73633YQv> C24 = this.A0C.C24();
        if (C24 != null) {
            ArrayList arrayList = new ArrayList(AbstractC06950Ym.A1E(C24, 10));
            for (InterfaceC73633YQv interfaceC73633YQv : C24) {
                C14360o3.A0B(interfaceC73633YQv, 0);
                C84823qW c84823qW = new C84823qW(EnumC75383a5.A16, interfaceC73633YQv.CI1(), interfaceC73633YQv.CIa(), interfaceC73633YQv.CIh(), interfaceC73633YQv.CHf(), interfaceC73633YQv.BDR(), interfaceC73633YQv.Bpa(), interfaceC73633YQv.CVk(), interfaceC73633YQv.Cdh(), interfaceC73633YQv.CUY(), interfaceC73633YQv.Ayd(), interfaceC73633YQv.AdC(), interfaceC73633YQv.getId());
                InterfaceC43574JMi Bjp = interfaceC73633YQv.Bjp();
                if (Bjp != null) {
                    urm = Bjp.F1U();
                } else {
                    urm = null;
                }
                c84823qW.A0a = urm;
                arrayList.add(c84823qW);
            }
            return new ArrayList(arrayList);
        }
        return null;
    }

    private final ArrayList A0M() {
        C106074qN c106074qN;
        List<InterfaceC106104qQ> C27 = this.A0C.C27();
        if (C27 != null) {
            ArrayList arrayList = new ArrayList(AbstractC06950Ym.A1E(C27, 10));
            for (InterfaceC106104qQ interfaceC106104qQ : C27) {
                C14360o3.A0B(interfaceC106104qQ, 0);
                C84823qW c84823qW = new C84823qW(EnumC75383a5.A17, interfaceC106104qQ.CI1(), interfaceC106104qQ.CIa(), interfaceC106104qQ.CIh(), interfaceC106104qQ.CHf(), interfaceC106104qQ.BDR(), interfaceC106104qQ.Bpa(), interfaceC106104qQ.CVk(), interfaceC106104qQ.Cdh(), interfaceC106104qQ.CUY(), interfaceC106104qQ.Ayd(), interfaceC106104qQ.AdC(), interfaceC106104qQ.getId());
                InterfaceC106084qO Bki = interfaceC106104qQ.Bki();
                if (Bki != null) {
                    c106074qN = Bki.F75();
                } else {
                    c106074qN = null;
                }
                c84823qW.A17 = c106074qN;
                arrayList.add(c84823qW);
            }
            return new ArrayList(arrayList);
        }
        return null;
    }

    private final ArrayList A0N() {
        List<YR7> C2B = this.A0C.C2B();
        if (C2B != null) {
            ArrayList arrayList = new ArrayList(AbstractC06950Ym.A1E(C2B, 10));
            for (YR7 yr7 : C2B) {
                C14360o3.A0B(yr7, 0);
                C84823qW c84823qW = new C84823qW(EnumC75383a5.A19, yr7.CI1(), yr7.CIa(), yr7.CIh(), yr7.CHf(), yr7.BDR(), yr7.Bpa(), yr7.CVk(), yr7.Cdh(), yr7.CUY(), yr7.Ayd(), yr7.AdC(), yr7.getId());
                String BSZ = yr7.BSZ();
                ArrayList arrayList2 = null;
                if (BSZ == null) {
                    BSZ = null;
                }
                c84823qW.A1d = BSZ;
                List Bh4 = yr7.Bh4();
                if (Bh4 != null) {
                    arrayList2 = new ArrayList(AbstractC06950Ym.A1E(Bh4, 10));
                    Iterator it = Bh4.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(it.next());
                    }
                }
                c84823qW.A1p = arrayList2;
                arrayList.add(c84823qW);
            }
            return new ArrayList(arrayList);
        }
        return null;
    }

    private final ArrayList A0O() {
        SMBSupportStickerDict sMBSupportStickerDict;
        List<StorySmbSupportStickerObject> C2H = this.A0C.C2H();
        if (C2H != null) {
            ArrayList arrayList = new ArrayList(AbstractC06950Ym.A1E(C2H, 10));
            for (StorySmbSupportStickerObject storySmbSupportStickerObject : C2H) {
                C14360o3.A0B(storySmbSupportStickerObject, 0);
                C84823qW c84823qW = new C84823qW(EnumC75383a5.A0d, storySmbSupportStickerObject.CI1(), storySmbSupportStickerObject.CIa(), storySmbSupportStickerObject.CIh(), storySmbSupportStickerObject.CHf(), storySmbSupportStickerObject.BDR(), storySmbSupportStickerObject.Bpa(), storySmbSupportStickerObject.CVk(), storySmbSupportStickerObject.Cdh(), storySmbSupportStickerObject.CUY(), storySmbSupportStickerObject.Ayd(), storySmbSupportStickerObject.AdC(), storySmbSupportStickerObject.getId());
                SMBSupportStickerDictIntf Bxz = storySmbSupportStickerObject.Bxz();
                if (Bxz != null) {
                    sMBSupportStickerDict = Bxz.EzH();
                } else {
                    sMBSupportStickerDict = null;
                }
                c84823qW.A0P = sMBSupportStickerDict;
                arrayList.add(c84823qW);
            }
            return new ArrayList(arrayList);
        }
        return null;
    }

    private final ArrayList A0P() {
        List<InterfaceC73635YQx> C2D = this.A0C.C2D();
        if (C2D != null) {
            ArrayList arrayList = new ArrayList(AbstractC06950Ym.A1E(C2D, 10));
            for (InterfaceC73635YQx interfaceC73635YQx : C2D) {
                C14360o3.A0B(interfaceC73635YQx, 0);
                C84823qW c84823qW = new C84823qW(EnumC75383a5.A0z, interfaceC73635YQx.CI1(), interfaceC73635YQx.CIa(), interfaceC73635YQx.CIh(), interfaceC73635YQx.CHf(), interfaceC73635YQx.BDR(), interfaceC73635YQx.Bpa(), interfaceC73635YQx.CVk(), interfaceC73635YQx.Cdh(), interfaceC73635YQx.CUY(), interfaceC73635YQx.Ayd(), interfaceC73635YQx.AdC(), interfaceC73635YQx.getId());
                InterfaceC43575JMj Bt5 = interfaceC73635YQx.Bt5();
                C38820H7m c38820H7m = null;
                if (Bt5 != null) {
                    c38820H7m = Bt5.F6K(null);
                }
                c84823qW.A0p = c38820H7m;
                arrayList.add(c84823qW);
            }
            return new ArrayList(arrayList);
        }
        return null;
    }

    private final ArrayList A0Q() {
        List<InterfaceC109274vt> C2I = this.A0C.C2I();
        if (C2I != null) {
            ArrayList arrayList = new ArrayList(AbstractC06950Ym.A1E(C2I, 10));
            for (InterfaceC109274vt interfaceC109274vt : C2I) {
                C14360o3.A0B(interfaceC109274vt, 0);
                arrayList.add(new C84823qW(EnumC75383a5.A1E, interfaceC109274vt.CI1(), interfaceC109274vt.CIa(), interfaceC109274vt.CIh(), interfaceC109274vt.CHf(), interfaceC109274vt.BDR(), interfaceC109274vt.Bpa(), interfaceC109274vt.CVk(), interfaceC109274vt.Cdh(), interfaceC109274vt.CUY(), interfaceC109274vt.Ayd(), interfaceC109274vt.AdC(), interfaceC109274vt.getId()));
            }
            return new ArrayList(arrayList);
        }
        return null;
    }

    private final ArrayList A0R() {
        List<InterfaceC73637YQz> C2L = this.A0C.C2L();
        if (C2L != null) {
            ArrayList arrayList = new ArrayList(AbstractC06950Ym.A1E(C2L, 10));
            for (InterfaceC73637YQz interfaceC73637YQz : C2L) {
                C14360o3.A0B(interfaceC73637YQz, 0);
                C84823qW c84823qW = new C84823qW(EnumC75383a5.A1F, interfaceC73637YQz.CI1(), interfaceC73637YQz.CIa(), interfaceC73637YQz.CIh(), interfaceC73637YQz.CHf(), interfaceC73637YQz.BDR(), interfaceC73637YQz.Bpa(), interfaceC73637YQz.CVk(), interfaceC73637YQz.Cdh(), interfaceC73637YQz.CUY(), interfaceC73637YQz.Ayd(), interfaceC73637YQz.AdC(), interfaceC73637YQz.getId());
                InterfaceC43569JMd C0v = interfaceC73637YQz.C0v();
                C38822H7p c38822H7p = null;
                if (C0v != null) {
                    c38822H7p = C0v.F6W(null);
                }
                c84823qW.A0s = c38822H7p;
                arrayList.add(c84823qW);
            }
            return new ArrayList(arrayList);
        }
        return null;
    }

    private final ArrayList A0S() {
        UpcomingEventImpl upcomingEventImpl;
        List<InterfaceC43582JMq> C2Q = this.A0C.C2Q();
        if (C2Q != null) {
            ArrayList arrayList = new ArrayList(AbstractC06950Ym.A1E(C2Q, 10));
            for (InterfaceC43582JMq interfaceC43582JMq : C2Q) {
                C14360o3.A0B(interfaceC43582JMq, 0);
                C84823qW c84823qW = new C84823qW(EnumC75383a5.A1K, interfaceC43582JMq.CI1(), interfaceC43582JMq.CIa(), interfaceC43582JMq.CIh(), interfaceC43582JMq.CHf(), interfaceC43582JMq.BDR(), interfaceC43582JMq.Bpa(), interfaceC43582JMq.CVk(), interfaceC43582JMq.Cdh(), interfaceC43582JMq.CUY(), interfaceC43582JMq.Ayd(), interfaceC43582JMq.AdC(), interfaceC43582JMq.getId());
                c84823qW.A1n = interfaceC43582JMq.getId();
                UpcomingEvent CD4 = interfaceC43582JMq.CD4();
                UpcomingEventMediaImpl upcomingEventMediaImpl = null;
                if (CD4 != null) {
                    upcomingEventImpl = CD4.F7b(null);
                } else {
                    upcomingEventImpl = null;
                }
                c84823qW.A1B = upcomingEventImpl;
                UpcomingEventMedia CD6 = interfaceC43582JMq.CD6();
                if (CD6 != null) {
                    upcomingEventMediaImpl = CD6.F6f();
                }
                c84823qW.A0t = upcomingEventMediaImpl;
                c84823qW.A0h = interfaceC43582JMq.Byd();
                c84823qW.A1r = C14360o3.A0K(interfaceC43582JMq.CRh(), true);
                c84823qW.A1R = interfaceC43582JMq.AqW();
                arrayList.add(c84823qW);
            }
            return new ArrayList(arrayList);
        }
        return null;
    }

    private final ArrayList A0T() {
        MediaVCRTappableData mediaVCRTappableData;
        List<InterfaceC2042391v> CGm = this.A0C.CGm();
        if (CGm != null) {
            C1DV c1dv = this.A0g;
            ArrayList arrayList = new ArrayList(AbstractC06950Ym.A1E(CGm, 10));
            for (InterfaceC2042391v interfaceC2042391v : CGm) {
                C14360o3.A0B(interfaceC2042391v, 0);
                C84823qW c84823qW = new C84823qW(EnumC75383a5.A18, interfaceC2042391v.CI1(), interfaceC2042391v.CIa(), interfaceC2042391v.CIh(), interfaceC2042391v.CHf(), interfaceC2042391v.BDR(), interfaceC2042391v.Bpa(), interfaceC2042391v.CVk(), interfaceC2042391v.Cdh(), interfaceC2042391v.CUY(), interfaceC2042391v.Ayd(), interfaceC2042391v.AdC(), interfaceC2042391v.getId());
                MediaVCRTappableDataIntf CEg = interfaceC2042391v.CEg();
                if (CEg != null) {
                    mediaVCRTappableData = CEg.EwY(c1dv);
                } else {
                    mediaVCRTappableData = null;
                }
                c84823qW.A0K = mediaVCRTappableData;
                arrayList.add(c84823qW);
            }
            return new ArrayList(arrayList);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v2, types: [X.IeH, java.lang.Object] */
    private final ArrayList A0U() {
        C41743IeH c41743IeH;
        boolean z;
        List<YR4> C2S = this.A0C.C2S();
        if (C2S != null) {
            ArrayList arrayList = new ArrayList(AbstractC06950Ym.A1E(C2S, 10));
            for (YR4 yr4 : C2S) {
                C14360o3.A0B(yr4, 0);
                C84823qW c84823qW = new C84823qW(EnumC75383a5.A1L, yr4.CI1(), yr4.CIa(), yr4.CIh(), yr4.CHf(), yr4.BDR(), yr4.Bpa(), yr4.CVk(), yr4.Cdh(), yr4.CUY(), yr4.Ayd(), yr4.AdC(), yr4.getId());
                JME CH5 = yr4.CH5();
                if (CH5 != null) {
                    c41743IeH = new Object();
                    c41743IeH.A0A = new HashMap();
                    c41743IeH.A0B = new HashMap();
                    c41743IeH.A0C = new HashMap();
                    c41743IeH.A06 = CH5.AgO();
                    c41743IeH.A09 = CH5.getId();
                    Map AgZ = CH5.AgZ();
                    if (AgZ != null) {
                        c41743IeH.A0A = new HashMap(AgZ);
                    }
                    Boolean BvJ = CH5.BvJ();
                    int i = 0;
                    if (BvJ != null) {
                        z = BvJ.booleanValue();
                    } else {
                        z = false;
                    }
                    c41743IeH.A0D = z;
                    Integer Bx0 = CH5.Bx0();
                    if (Bx0 != null) {
                        i = Bx0.intValue();
                    }
                    c41743IeH.A00 = i;
                    c41743IeH.A08 = CH5.BYQ();
                } else {
                    c41743IeH = 0;
                }
                c84823qW.A1H = c41743IeH;
                arrayList.add(c84823qW);
            }
            return new ArrayList(arrayList);
        }
        return null;
    }

    private final ArrayList A0V() {
        List<YR2> C2T = this.A0C.C2T();
        if (C2T != null) {
            ArrayList arrayList = new ArrayList(AbstractC06950Ym.A1E(C2T, 10));
            for (YR2 yr2 : C2T) {
                C14360o3.A0B(yr2, 0);
                arrayList.add(new C84823qW(EnumC75383a5.A1M, yr2.CI1(), yr2.CIa(), yr2.CIh(), yr2.CHf(), yr2.BDR(), yr2.Bpa(), yr2.CVk(), yr2.Cdh(), yr2.CUY(), yr2.Ayd(), yr2.AdC(), yr2.getId()));
            }
            return new ArrayList(arrayList);
        }
        return null;
    }

    private final ArrayList A0W() {
        List<InterfaceC43577JMl> C2V = this.A0C.C2V();
        if (C2V != null) {
            String A2u = A2u();
            ArrayList arrayList = new ArrayList(AbstractC06950Ym.A1E(C2V, 10));
            for (InterfaceC43577JMl interfaceC43577JMl : C2V) {
                C14360o3.A0B(interfaceC43577JMl, 0);
                C84823qW c84823qW = new C84823qW(EnumC75383a5.A1O, interfaceC43577JMl.CI1(), interfaceC43577JMl.CIa(), interfaceC43577JMl.CIh(), interfaceC43577JMl.CHf(), interfaceC43577JMl.BDR(), interfaceC43577JMl.Bpa(), interfaceC43577JMl.CVk(), interfaceC43577JMl.Cdh(), interfaceC43577JMl.CUY(), interfaceC43577JMl.AdC(), A2u, null);
                c84823qW.A1b = A2u;
                arrayList.add(c84823qW);
            }
            return new ArrayList(arrayList);
        }
        return null;
    }

    public static final ArrayList A0X(C38321qM c38321qM) {
        List<InterfaceC73620YQi> C1Z = c38321qM.A0C.C1Z();
        if (C1Z != null) {
            ArrayList arrayList = new ArrayList(AbstractC06950Ym.A1E(C1Z, 10));
            for (InterfaceC73620YQi interfaceC73620YQi : C1Z) {
                C14360o3.A0B(interfaceC73620YQi, 0);
                C84823qW c84823qW = new C84823qW(EnumC75383a5.A0l, interfaceC73620YQi.CI1(), interfaceC73620YQi.CIa(), interfaceC73620YQi.CIh(), interfaceC73620YQi.CHf(), interfaceC73620YQi.BDR(), interfaceC73620YQi.Bpa(), interfaceC73620YQi.CVk(), interfaceC73620YQi.Cdh(), interfaceC73620YQi.CUY(), interfaceC73620YQi.Ayd(), interfaceC73620YQi.AdC(), interfaceC73620YQi.getId());
                c84823qW.A1b = interfaceC73620YQi.getMediaId();
                arrayList.add(c84823qW);
            }
            return new ArrayList(arrayList);
        }
        return null;
    }

    public static final ArrayList A0Y(C38321qM c38321qM) {
        List<InterfaceC73630YQs> C1u = c38321qM.A0C.C1u();
        if (C1u != null) {
            ArrayList arrayList = new ArrayList(AbstractC06950Ym.A1E(C1u, 10));
            for (InterfaceC73630YQs interfaceC73630YQs : C1u) {
                C14360o3.A0B(interfaceC73630YQs, 0);
                C84823qW c84823qW = new C84823qW(EnumC75383a5.A0y, interfaceC73630YQs.CI1(), interfaceC73630YQs.CIa(), interfaceC73630YQs.CIh(), interfaceC73630YQs.CHf(), interfaceC73630YQs.BDR(), interfaceC73630YQs.Bpa(), interfaceC73630YQs.CVk(), interfaceC73630YQs.Cdh(), interfaceC73630YQs.CUY(), interfaceC73630YQs.Ayd(), interfaceC73630YQs.AdC(), interfaceC73630YQs.getId());
                ProductStickerIntf BhJ = interfaceC73630YQs.BhJ();
                ProductSticker productSticker = null;
                if (BhJ != null) {
                    productSticker = BhJ.F6O(null);
                }
                c84823qW.A0r = productSticker;
                arrayList.add(c84823qW);
            }
            return new ArrayList(arrayList);
        }
        return null;
    }

    private final List A0Z() {
        StoryGroupMentionTappableData storyGroupMentionTappableData;
        List<InterfaceC73622YQk> BAb = this.A0C.BAb();
        if (BAb != null) {
            C1DV c1dv = this.A0g;
            ArrayList arrayList = new ArrayList(AbstractC06950Ym.A1E(BAb, 10));
            for (InterfaceC73622YQk interfaceC73622YQk : BAb) {
                C14360o3.A0B(interfaceC73622YQk, 0);
                C84823qW c84823qW = new C84823qW(EnumC75383a5.A0c, interfaceC73622YQk.CI1(), interfaceC73622YQk.CIa(), interfaceC73622YQk.CIh(), interfaceC73622YQk.CHf(), interfaceC73622YQk.BDR(), interfaceC73622YQk.Bpa(), interfaceC73622YQk.CVk(), interfaceC73622YQk.Cdh(), interfaceC73622YQk.CUY(), interfaceC73622YQk.Ayd(), interfaceC73622YQk.AdC(), interfaceC73622YQk.getId());
                StoryGroupMentionTappableDataIntf BAa = interfaceC73622YQk.BAa();
                if (BAa != null) {
                    storyGroupMentionTappableData = BAa.F0f(c1dv);
                } else {
                    storyGroupMentionTappableData = null;
                }
                c84823qW.A0V = storyGroupMentionTappableData;
                arrayList.add(c84823qW);
            }
            return AbstractC001800i.A0a(arrayList);
        }
        return null;
    }

    private final List A0a() {
        StoryMusicPickTappableData storyMusicPickTappableData;
        List<InterfaceC73625YQn> C1n = this.A0C.C1n();
        if (C1n != null) {
            C1DV c1dv = this.A0g;
            ArrayList arrayList = new ArrayList(AbstractC06950Ym.A1E(C1n, 10));
            for (InterfaceC73625YQn interfaceC73625YQn : C1n) {
                C14360o3.A0B(interfaceC73625YQn, 0);
                C84823qW c84823qW = new C84823qW(EnumC75383a5.A0t, interfaceC73625YQn.CI1(), interfaceC73625YQn.CIa(), interfaceC73625YQn.CIh(), interfaceC73625YQn.CHf(), interfaceC73625YQn.BDR(), interfaceC73625YQn.Bpa(), interfaceC73625YQn.CVk(), interfaceC73625YQn.Cdh(), interfaceC73625YQn.CUY(), interfaceC73625YQn.Ayd(), interfaceC73625YQn.AdC(), interfaceC73625YQn.getId());
                StoryMusicPickTappableDataIntf BVg = interfaceC73625YQn.BVg();
                if (BVg != null) {
                    storyMusicPickTappableData = BVg.F10(c1dv);
                } else {
                    storyMusicPickTappableData = null;
                }
                c84823qW.A0X = storyMusicPickTappableData;
                arrayList.add(c84823qW);
            }
            return AbstractC001800i.A0a(arrayList);
        }
        return null;
    }

    private final List A0b() {
        StoryLinkInfoDict storyLinkInfoDict;
        List<InterfaceC108154u0> C1i = this.A0C.C1i();
        if (C1i != null) {
            ArrayList arrayList = new ArrayList(AbstractC06950Ym.A1E(C1i, 10));
            for (InterfaceC108154u0 interfaceC108154u0 : C1i) {
                C14360o3.A0B(interfaceC108154u0, 0);
                C84823qW c84823qW = new C84823qW(EnumC75383a5.A0i, interfaceC108154u0.CI1(), interfaceC108154u0.CIa(), interfaceC108154u0.CIh(), interfaceC108154u0.CHf(), interfaceC108154u0.BDR(), interfaceC108154u0.Bpa(), interfaceC108154u0.CVk(), interfaceC108154u0.Cdh(), interfaceC108154u0.CUY(), interfaceC108154u0.Ayd(), interfaceC108154u0.AdC(), interfaceC108154u0.getId());
                StoryLinkInfoDictIntf C1h = interfaceC108154u0.C1h();
                if (C1h != null) {
                    storyLinkInfoDict = C1h.F0p();
                } else {
                    storyLinkInfoDict = null;
                }
                c84823qW.A0W = storyLinkInfoDict;
                arrayList.add(c84823qW);
            }
            return AbstractC001800i.A0a(arrayList);
        }
        return null;
    }

    private final List A0c() {
        List C1m = this.A0C.C1m();
        if (C1m != null && !C1m.isEmpty()) {
            InterfaceC109274vt interfaceC109274vt = (InterfaceC109274vt) C1m.get(0);
            C14360o3.A0B(interfaceC109274vt, 0);
            Float CI1 = interfaceC109274vt.CI1();
            Float CIa = interfaceC109274vt.CIa();
            Float CIh = interfaceC109274vt.CIh();
            Float CHf = interfaceC109274vt.CHf();
            Float BDR = interfaceC109274vt.BDR();
            Float Bpa = interfaceC109274vt.Bpa();
            Integer CVk = interfaceC109274vt.CVk();
            Integer Cdh = interfaceC109274vt.Cdh();
            Integer CUY = interfaceC109274vt.CUY();
            String Ayd = interfaceC109274vt.Ayd();
            String AdC = interfaceC109274vt.AdC();
            String id = interfaceC109274vt.getId();
            EnumC75383a5 enumC75383a5 = EnumC75383a5.A0r;
            C84823qW c84823qW = new C84823qW(enumC75383a5, CI1, CIa, CIh, CHf, BDR, Bpa, CVk, Cdh, CUY, Ayd, AdC, id);
            ArrayList A0I = A0I();
            if (A0I != null && !A0I.isEmpty()) {
                c84823qW.A12 = enumC75383a5;
                c84823qW.A0v = ((C84823qW) A0I.get(0)).A0v;
            } else {
                C0w9.A03("Music Overlay Not Found", "Reel item with lyrics should also contain music overlay");
            }
            List singletonList = Collections.singletonList(c84823qW);
            C14360o3.A07(singletonList);
            return singletonList;
        }
        return null;
    }

    private final List A0d() {
        C101394gx c101394gx;
        List<InterfaceC73629YQr> C1t = this.A0C.C1t();
        if (C1t != null) {
            C1DV c1dv = this.A0g;
            ArrayList arrayList = new ArrayList(AbstractC06950Ym.A1E(C1t, 10));
            for (InterfaceC73629YQr interfaceC73629YQr : C1t) {
                C14360o3.A0B(interfaceC73629YQr, 0);
                C84823qW c84823qW = new C84823qW(EnumC75383a5.A0x, interfaceC73629YQr.CI1(), interfaceC73629YQr.CIa(), interfaceC73629YQr.CIh(), interfaceC73629YQr.CHf(), interfaceC73629YQr.BDR(), interfaceC73629YQr.Bpa(), interfaceC73629YQr.CVk(), interfaceC73629YQr.Cdh(), interfaceC73629YQr.CUY(), interfaceC73629YQr.Ayd(), interfaceC73629YQr.AdC(), interfaceC73629YQr.getId());
                InterfaceC101404gy BeL = interfaceC73629YQr.BeL();
                if (BeL != null) {
                    c101394gx = BeL.F6v(c1dv);
                } else {
                    c101394gx = null;
                }
                c84823qW.A15 = c101394gx;
                arrayList.add(c84823qW);
            }
            return AbstractC001800i.A0a(arrayList);
        }
        return null;
    }

    private final List A0e() {
        EnumC75383a5 enumC75383a5;
        StoryPromptTappableData storyPromptTappableData;
        List<InterfaceC109364wL> C1y = this.A0C.C1y();
        if (C1y != null) {
            C1DV c1dv = this.A0g;
            ArrayList arrayList = new ArrayList();
            for (InterfaceC109364wL interfaceC109364wL : C1y) {
                if (interfaceC109364wL != null) {
                    Float CI1 = interfaceC109364wL.CI1();
                    Float CIa = interfaceC109364wL.CIa();
                    Float CIh = interfaceC109364wL.CIh();
                    Float CHf = interfaceC109364wL.CHf();
                    Float BDR = interfaceC109364wL.BDR();
                    Float Bpa = interfaceC109364wL.Bpa();
                    Integer CVk = interfaceC109364wL.CVk();
                    Integer Cdh = interfaceC109364wL.Cdh();
                    Integer CUY = interfaceC109364wL.CUY();
                    String Ayd = interfaceC109364wL.Ayd();
                    String AdC = interfaceC109364wL.AdC();
                    String id = interfaceC109364wL.getId();
                    StoryPromptTappableDataIntf Bii = interfaceC109364wL.Bii();
                    if (Bii != null && C14360o3.A0K(Bii.CRP(), true)) {
                        enumC75383a5 = EnumC75383a5.A0I;
                    } else {
                        enumC75383a5 = EnumC75383a5.A11;
                    }
                    C84823qW c84823qW = new C84823qW(enumC75383a5, CI1, CIa, CIh, CHf, BDR, Bpa, CVk, Cdh, CUY, Ayd, AdC, id);
                    StoryPromptTappableDataIntf Bii2 = interfaceC109364wL.Bii();
                    if (Bii2 != null) {
                        storyPromptTappableData = Bii2.F1M(c1dv);
                    } else {
                        storyPromptTappableData = null;
                    }
                    c84823qW.A0Z = storyPromptTappableData;
                    arrayList.add(c84823qW);
                }
            }
            return AbstractC001800i.A0a(arrayList);
        }
        return null;
    }

    private final List A0f() {
        URN urn;
        List<InterfaceC73636YQy> C2G = this.A0C.C2G();
        if (C2G != null) {
            ArrayList arrayList = new ArrayList(AbstractC06950Ym.A1E(C2G, 10));
            for (InterfaceC73636YQy interfaceC73636YQy : C2G) {
                C14360o3.A0B(interfaceC73636YQy, 0);
                C84823qW c84823qW = new C84823qW(EnumC75383a5.A1C, interfaceC73636YQy.CI1(), interfaceC73636YQy.CIa(), interfaceC73636YQy.CIh(), interfaceC73636YQy.CHf(), interfaceC73636YQy.BDR(), interfaceC73636YQy.Bpa(), interfaceC73636YQy.CVk(), interfaceC73636YQy.Cdh(), interfaceC73636YQy.CUY(), interfaceC73636YQy.Ayd(), interfaceC73636YQy.AdC(), interfaceC73636YQy.getId());
                XGH Bxm = interfaceC73636YQy.Bxm();
                if (Bxm != null) {
                    urn = Bxm.F1l();
                } else {
                    urn = null;
                }
                c84823qW.A0b = urn;
                arrayList.add(c84823qW);
            }
            return AbstractC001800i.A0a(arrayList);
        }
        return null;
    }

    private final List A0g() {
        H68 h68;
        List<YR0> C3X = this.A0C.C3X();
        if (C3X != null) {
            C1DV c1dv = this.A0g;
            ArrayList arrayList = new ArrayList(AbstractC06950Ym.A1E(C3X, 10));
            for (YR0 yr0 : C3X) {
                C14360o3.A0B(yr0, 0);
                C84823qW c84823qW = new C84823qW(EnumC75383a5.A1H, yr0.CI1(), yr0.CIa(), yr0.CIh(), yr0.CHf(), yr0.BDR(), yr0.Bpa(), yr0.CVk(), yr0.Cdh(), yr0.CUY(), yr0.Ayd(), yr0.AdC(), yr0.getId());
                JMC C3W = yr0.C3W();
                if (C3W != null) {
                    h68 = C3W.F1w(c1dv);
                } else {
                    h68 = null;
                }
                c84823qW.A0c = h68;
                arrayList.add(c84823qW);
            }
            return AbstractC001800i.A0a(arrayList);
        }
        return null;
    }

    private final List A0h() {
        SubscriptionStickerDict subscriptionStickerDict;
        List<InterfaceC109274vt> C2M = this.A0C.C2M();
        if (C2M != null) {
            C1DV c1dv = this.A0g;
            ArrayList arrayList = new ArrayList(AbstractC06950Ym.A1E(C2M, 10));
            for (InterfaceC109274vt interfaceC109274vt : C2M) {
                C14360o3.A0B(interfaceC109274vt, 0);
                C84823qW c84823qW = new C84823qW(EnumC75383a5.A1G, interfaceC109274vt.CI1(), interfaceC109274vt.CIa(), interfaceC109274vt.CIh(), interfaceC109274vt.CHf(), interfaceC109274vt.BDR(), interfaceC109274vt.Bpa(), interfaceC109274vt.CVk(), interfaceC109274vt.Cdh(), interfaceC109274vt.CUY(), interfaceC109274vt.Ayd(), interfaceC109274vt.AdC(), interfaceC109274vt.getId());
                SubscriptionStickerDictIntf C3Y = interfaceC109274vt.C3Y();
                if (C3Y != null) {
                    subscriptionStickerDict = C3Y.F2X(c1dv);
                } else {
                    subscriptionStickerDict = null;
                }
                c84823qW.A0e = subscriptionStickerDict;
                arrayList.add(c84823qW);
            }
            return AbstractC001800i.A0a(arrayList);
        }
        return null;
    }

    private final List A0i() {
        List<InterfaceC114635Ft> C6g = this.A0C.C6g();
        if (C6g != null) {
            C1DV c1dv = this.A0g;
            ArrayList arrayList = new ArrayList(AbstractC06950Ym.A1E(C6g, 10));
            for (InterfaceC114635Ft interfaceC114635Ft : C6g) {
                C14360o3.A0B(interfaceC114635Ft, 0);
                C84823qW c84823qW = new C84823qW(EnumC75383a5.A1I, interfaceC114635Ft.CI1(), interfaceC114635Ft.CIa(), interfaceC114635Ft.CIh(), interfaceC114635Ft.CHf(), interfaceC114635Ft.BDR(), interfaceC114635Ft.Bpa(), interfaceC114635Ft.CVk(), interfaceC114635Ft.Cdh(), interfaceC114635Ft.CUY(), interfaceC114635Ft.Ayd(), interfaceC114635Ft.AdC(), interfaceC114635Ft.getId());
                c84823qW.A0f = interfaceC114635Ft.F3E(c1dv);
                arrayList.add(c84823qW);
            }
            return AbstractC001800i.A0a(arrayList);
        }
        return null;
    }

    private final List A0j() {
        List<WhatsAppChannelShareToIgStoryStickerTappableObject> CHY = this.A0C.CHY();
        if (CHY != null) {
            C1DV c1dv = this.A0g;
            ArrayList arrayList = new ArrayList(AbstractC06950Ym.A1E(CHY, 10));
            for (WhatsAppChannelShareToIgStoryStickerTappableObject whatsAppChannelShareToIgStoryStickerTappableObject : CHY) {
                C14360o3.A0B(whatsAppChannelShareToIgStoryStickerTappableObject, 0);
                C84823qW c84823qW = new C84823qW(EnumC75383a5.A1N, whatsAppChannelShareToIgStoryStickerTappableObject.CI1(), whatsAppChannelShareToIgStoryStickerTappableObject.CIa(), whatsAppChannelShareToIgStoryStickerTappableObject.CIh(), whatsAppChannelShareToIgStoryStickerTappableObject.CHf(), whatsAppChannelShareToIgStoryStickerTappableObject.BDR(), whatsAppChannelShareToIgStoryStickerTappableObject.Bpa(), whatsAppChannelShareToIgStoryStickerTappableObject.CVk(), whatsAppChannelShareToIgStoryStickerTappableObject.Cdh(), whatsAppChannelShareToIgStoryStickerTappableObject.CUY(), whatsAppChannelShareToIgStoryStickerTappableObject.Ayd(), whatsAppChannelShareToIgStoryStickerTappableObject.AdC(), whatsAppChannelShareToIgStoryStickerTappableObject.getId());
                c84823qW.A0i = whatsAppChannelShareToIgStoryStickerTappableObject.F3y(c1dv);
                arrayList.add(c84823qW);
            }
            return AbstractC001800i.A0a(arrayList);
        }
        return null;
    }

    public static final List A0k(C38321qM c38321qM) {
        C66645URj c66645URj;
        List<InterfaceC73614YQc> C1K = c38321qM.A0C.C1K();
        if (C1K == null && (C1K = c38321qM.A0C.AoD()) == null) {
            return null;
        }
        C1DV c1dv = c38321qM.A0g;
        ArrayList arrayList = new ArrayList(AbstractC06950Ym.A1E(C1K, 10));
        for (InterfaceC73614YQc interfaceC73614YQc : C1K) {
            C14360o3.A0B(interfaceC73614YQc, 0);
            C84823qW c84823qW = new C84823qW(EnumC75383a5.A0g, interfaceC73614YQc.CI1(), interfaceC73614YQc.CIa(), interfaceC73614YQc.CIh(), interfaceC73614YQc.CHf(), interfaceC73614YQc.BDR(), interfaceC73614YQc.Bpa(), interfaceC73614YQc.CVk(), interfaceC73614YQc.Cdh(), interfaceC73614YQc.CUY(), interfaceC73614YQc.Ayd(), interfaceC73614YQc.AdC(), interfaceC73614YQc.getId());
            XGL BKJ = interfaceC73614YQc.BKJ();
            if (BKJ != null) {
                c66645URj = BKJ.F6n(c1dv);
            } else {
                c66645URj = null;
            }
            c84823qW.A0y = c66645URj;
            arrayList.add(c84823qW);
        }
        return AbstractC001800i.A0a(arrayList);
    }

    public final double A0l() {
        if (this.A0C.CF6() != null) {
            return r0.floatValue();
        }
        return 0.0d;
    }

    public final int A0n() {
        Integer AZL;
        InterfaceC39541sb injected = this.A0C.getInjected();
        if (injected != null && (AZL = injected.AZL()) != null) {
            return AZL.intValue();
        }
        return -1;
    }

    public final int A0o() {
        String text;
        InterfaceC38901rP Alb = this.A0C.Alb();
        if (Alb != null && (text = Alb.getText()) != null) {
            return text.length();
        }
        return 0;
    }

    public final int A0q() {
        Integer AmC = this.A0C.AmC();
        if (AmC != null) {
            return AmC.intValue();
        }
        return 0;
    }

    public final int A0r() {
        Integer AmE = this.A0C.AmE();
        if (AmE != null) {
            return AmE.intValue();
        }
        return 0;
    }

    public final int A0s() {
        Integer ApY = this.A0C.ApY();
        if (ApY != null) {
            return ApY.intValue();
        }
        return 0;
    }

    public final int A0u() {
        Integer B4k = this.A0C.B4k();
        if (B4k != null) {
            return B4k.intValue();
        }
        return 0;
    }

    public final int A0v() {
        Integer B4w = this.A0C.B4w();
        if (B4w != null) {
            return B4w.intValue();
        }
        return 0;
    }

    public final int A0w() {
        boolean z;
        Integer BNC;
        Boolean CXO = this.A0C.CXO();
        if (CXO != null) {
            z = CXO.booleanValue();
        } else {
            z = false;
        }
        if (z || (BNC = this.A0C.BNC()) == null) {
            return 0;
        }
        return BNC.intValue();
    }

    public final int A0x() {
        String BPW = this.A0C.BPW();
        List<C38321qM> AmB = this.A0C.AmB();
        Integer Azw = this.A0C.Azw();
        if (CdW() && AmB != null && !AmB.isEmpty() && Azw != null) {
            return Azw.intValue();
        }
        if (BPW != null && AmB != null) {
            int i = 0;
            for (C38321qM c38321qM : AmB) {
                if (!C14360o3.A0K(c38321qM.getId(), BPW) && !C14360o3.A0K(c38321qM.A38(), BPW)) {
                    i++;
                } else {
                    if (i != -1) {
                        return i;
                    }
                    C0w9.A04("Media#CarouselIndex", "mCarouselSelectedMediaID should be one of the carouselMedia %d", AmB.size());
                }
            }
            C0w9.A04("Media#CarouselIndex", "mCarouselSelectedMediaID should be one of the carouselMedia %d", AmB.size());
        }
        return 0;
    }

    public final int A0y() {
        Integer BZo = this.A0C.BZo();
        if (BZo != null) {
            return BZo.intValue();
        }
        return 0;
    }

    public final int A0z() {
        Integer Ba2 = this.A0C.Ba2();
        if (Ba2 != null) {
            return Ba2.intValue();
        }
        return 0;
    }

    public final int A10() {
        List CIr;
        InterfaceC84523py CEF = this.A0C.CEF();
        if (CEF != null && (CIr = CEF.CIr()) != null) {
            return CIr.size();
        }
        return 0;
    }

    public final int A11() {
        Integer C9z = this.A0C.C9z();
        if (C9z != null) {
            return C9z.intValue();
        }
        return 0;
    }

    public final int A12() {
        Integer BoO = this.A0C.BoO();
        if (BoO != null) {
            return BoO.intValue();
        }
        return 0;
    }

    public final int A13() {
        Integer Byu = this.A0C.Byu();
        if (Byu != null) {
            return Byu.intValue();
        }
        return 0;
    }

    public final int A14() {
        Integer C9l = this.A0C.C9l();
        if (C9l != null) {
            return C9l.intValue();
        }
        return A0p();
    }

    public final int A15() {
        List AmB = this.A0C.AmB();
        if (AmB != null) {
            int i = 0;
            for (C38321qM c38321qM : AbstractC001800i.A0a(AmB)) {
                if (c38321qM != null && c38321qM.A5s()) {
                    return i;
                }
                i++;
            }
        }
        return -1;
    }

    public final long A18() {
        long j = AbstractC73343Qk.A00 / 1000;
        Long B3E = this.A0C.B3E();
        if (B3E != null) {
            return (B3E.longValue() + j) * 1000;
        }
        return Long.MAX_VALUE;
    }

    public final long A19() {
        C40041tV c40041tV = this.A0d;
        C40061tX c40061tX = c40041tV.A01;
        if (c40061tX == null) {
            c40061tX = C40051tW.A01(c40041tV.A05);
            c40041tV.A01 = c40061tX;
        }
        List list = c40061tX.A00;
        if (list.isEmpty()) {
            return 0L;
        }
        return ((C84923qg) list.get(list.size() - 1)).A03;
    }

    public final long A1A() {
        Long Bk8 = this.A0C.Bk8();
        if (Bk8 != null) {
            return Bk8.longValue();
        }
        return 0L;
    }

    public final long A1B() {
        Long C5A = this.A0C.C5A();
        if (C5A != null) {
            return C5A.longValue();
        }
        return 0L;
    }

    public final TreeUpdaterJNI A1D() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        C09530e4 c09530e4 = new C09530e4("__typename", "XDTMediaDict");
        String id = getId();
        if (id == null) {
            id = "";
        }
        return new TreeUpdaterJNI("XDTMediaDict", AbstractC06930Yk.A06(c09530e4, new C09530e4("strong_id__", id)));
    }

    public final ImmutableList A1E() {
        ImmutableList copyOf;
        List BEL = this.A0C.BEL();
        if (BEL == null || (copyOf = ImmutableList.copyOf((Collection) BEL)) == null) {
            ImmutableList of = ImmutableList.of();
            C14360o3.A07(of);
            return of;
        }
        return copyOf;
    }

    public final InterfaceC43551JLl A1F() {
        List Ai3 = this.A0C.Ai3();
        if (Ai3 != null) {
            return (InterfaceC43551JLl) AbstractC001800i.A0J(Ai3);
        }
        return null;
    }

    public final InterfaceC104784ni A1G() {
        InterfaceC39541sb injected = this.A0C.getInjected();
        if (injected != null) {
            return injected.AjP();
        }
        return null;
    }

    public final InterfaceC87713vf A1H() {
        InterfaceC87713vf AZQ = this.A0C.AZQ();
        if (AZQ == null) {
            InterfaceC39541sb injected = this.A0C.getInjected();
            if (injected != null) {
                return injected.AZQ();
            }
            return null;
        }
        return AZQ;
    }

    public final IGCTMessagingAdsInfoDictIntf A1I() {
        InterfaceC39541sb injected = this.A0C.getInjected();
        if (injected != null) {
            return injected.Au0();
        }
        return null;
    }

    public final MediaGenAIDetectionMethod A1J() {
        String AxC;
        InterfaceC39061rf B9X = this.A0C.B9X();
        if (B9X == null || (AxC = B9X.AxC()) == null) {
            return null;
        }
        return AbstractC85933sM.A00(AxC);
    }

    public final OriginalSoundDataIntf A1K() {
        C3x9 clipsMetadata = this.A0C.getClipsMetadata();
        if (clipsMetadata != null) {
            return clipsMetadata.BZw();
        }
        C3XR musicMetadata = this.A0C.getMusicMetadata();
        if (musicMetadata != null) {
            return musicMetadata.BZw();
        }
        return null;
    }

    public final JL6 A1L() {
        List Bjd = this.A0C.Bjd();
        if (Bjd != null) {
            return (JL6) AbstractC001800i.A0J(Bjd);
        }
        return null;
    }

    public final InterfaceC87503vI A1M() {
        InterfaceC37271GbO interfaceC37271GbO;
        List AgH = this.A0C.AgH();
        if (AgH != null && (interfaceC37271GbO = (InterfaceC37271GbO) AbstractC001800i.A0J(AgH)) != null) {
            return interfaceC37271GbO.BlA();
        }
        return null;
    }

    public final TestimonialDict A1N() {
        InterfaceC39541sb injected = this.A0C.getInjected();
        if (injected != null) {
            return injected.C5q();
        }
        return null;
    }

    public final InterfaceC84133oz A1O() {
        if (this.A0C.ArZ() != null) {
            JMR ArZ = this.A0C.ArZ();
            if (ArZ == null) {
                return null;
            }
            return ArZ.Aqs();
        }
        C3x9 clipsMetadata = this.A0C.getClipsMetadata();
        if (clipsMetadata == null) {
            return null;
        }
        return clipsMetadata.Aqs();
    }

    public final InterfaceC84163p3 A1P() {
        if (this.A0C.ArZ() != null) {
            JMR ArZ = this.A0C.ArZ();
            if (ArZ == null) {
                return null;
            }
            return ArZ.BPh();
        }
        C3x9 clipsMetadata = this.A0C.getClipsMetadata();
        if (clipsMetadata == null) {
            return null;
        }
        return clipsMetadata.BPh();
    }

    public final C88543xC A1Q() {
        C3XR musicMetadata;
        MusicInfo BVc;
        C3x9 clipsMetadata = this.A0C.getClipsMetadata();
        if ((clipsMetadata != null && (BVc = clipsMetadata.BVc()) != null) || ((musicMetadata = this.A0C.getMusicMetadata()) != null && (BVc = musicMetadata.BVc()) != null)) {
            return new C88543xC(BVc);
        }
        return null;
    }

    public final InterfaceC110214xq A1R() {
        if (this.A0C.ArZ() != null) {
            JMR ArZ = this.A0C.ArZ();
            if (ArZ == null) {
                return null;
            }
            return ArZ.C5g();
        }
        C3x9 clipsMetadata = this.A0C.getClipsMetadata();
        if (clipsMetadata == null) {
            return null;
        }
        return clipsMetadata.C5g();
    }

    public final SimpleImageUrl A1T() {
        JKU BS1 = this.A0C.BS1();
        if (BS1 != null) {
            return new SimpleImageUrl(BS1.Bcz());
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x005b, code lost:
    
        if (r3 > 0) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C96444Vc A1U() {
        /*
            r4 = this;
            X.4Vc r0 = r4.A0Z
            r1 = 1
            r3 = 0
            if (r0 == 0) goto Ld
            boolean r0 = r0.A03
            if (r0 != r1) goto Ld
        La:
            X.4Vc r0 = r4.A0Z
            return r0
        Ld:
            boolean r0 = r4.Cff()
            if (r0 == 0) goto La
            X.1rF r0 = r4.A0C
            java.util.List r0 = r0.CFe()
            if (r0 == 0) goto L41
            java.lang.Object r2 = X.AbstractC001800i.A0J(r0)
            com.instagram.model.mediasize.VideoVersionIntf r2 = (com.instagram.model.mediasize.VideoVersionIntf) r2
            if (r2 == 0) goto L41
            java.lang.Integer r0 = r2.CHg()
            java.lang.String r1 = "Required value was null."
            if (r0 == 0) goto L66
            int r3 = r0.intValue()
            java.lang.Integer r0 = r2.BDS()
            if (r0 == 0) goto L60
            int r1 = r0.intValue()
        L39:
            X.4Vc r0 = new X.4Vc
            r0.<init>(r3, r1)
            r4.A0Z = r0
            goto La
        L41:
            X.1rF r0 = r4.A0C
            java.lang.Integer r0 = r0.BZo()
            if (r0 == 0) goto L5e
            int r1 = r0.intValue()
        L4d:
            X.1rF r0 = r4.A0C
            java.lang.Integer r0 = r0.Ba2()
            if (r0 == 0) goto L59
            int r3 = r0.intValue()
        L59:
            if (r1 <= 0) goto La
            if (r3 <= 0) goto La
            goto L39
        L5e:
            r1 = 0
            goto L4d
        L60:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L66:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C38321qM.A1U():X.4Vc");
    }

    public final C84923qg A1V() {
        InterfaceC38901rP Alb = this.A0C.Alb();
        if (Alb != null) {
            C84923qg c84923qg = new C84923qg(Alb);
            c84923qg.A01(this);
            if (c84923qg.A08 == null) {
                c84923qg.A08 = this.A0C.CDj();
            }
            return c84923qg;
        }
        return null;
    }

    public final C84923qg A1W() {
        InterfaceC38901rP BDL = this.A0C.BDL();
        if (BDL != null) {
            C84923qg c84923qg = new C84923qg(BDL);
            c84923qg.A01(this);
            return c84923qg;
        }
        return null;
    }

    public final C84923qg A1Y() {
        InterfaceC38901rP C5p;
        InterfaceC39541sb injected = this.A0C.getInjected();
        if (injected != null && (C5p = injected.C5p()) != null) {
            C84923qg c84923qg = new C84923qg(C5p);
            c84923qg.A01(this);
            return c84923qg;
        }
        return null;
    }

    public final C40061tX A1Z() {
        C40041tV c40041tV = this.A0d;
        C84923qg A1X = A1X();
        C40061tX c40061tX = c40041tV.A03;
        if (c40061tX == null) {
            C40061tX c40061tX2 = c40041tV.A06;
            c40061tX = new C40061tX();
            if (A1X != null && A1X.A06.A00()) {
                c40061tX.A02(A1X);
            }
            for (C84923qg c84923qg : c40061tX2.A00) {
                if (c84923qg.A06.A00() && c84923qg.A0T == null && c84923qg.A05 == null) {
                    c40061tX.A02(c84923qg);
                }
            }
            c40041tV.A03 = c40061tX;
        }
        return c40061tX;
    }

    public final C76623c7 A1a() {
        return new C76623c7(this.A0C.EqK(), this);
    }

    public final EnumC39597He7 A1b() {
        if (this.A0C.getBoostedStatus() == null) {
            return EnumC39597He7.A0D;
        }
        return AbstractC37479Gex.A00(this.A0C.getBoostedStatus());
    }

    public final EnumC77173d3 A1c() {
        if (this.A0C.BC1() != null) {
            Boolean BC1 = this.A0C.BC1();
            if (BC1 != null) {
                if (BC1.booleanValue()) {
                    return EnumC77173d3.A02;
                }
            } else {
                throw new IllegalStateException("Required value was null.");
            }
        }
        return EnumC77173d3.A03;
    }

    public final C38321qM A1f(C1DY c1dy) {
        C38821rE F4m;
        InterfaceC38831rF interfaceC38831rF = this.A0C;
        if (interfaceC38831rF instanceof C38821rE) {
            return this;
        }
        if (interfaceC38831rF instanceof C42553IsX) {
            F4m = ((C42553IsX) interfaceC38831rF).F4m(c1dy);
        } else if (interfaceC38831rF instanceof C84483pr) {
            F4m = interfaceC38831rF.F4m(c1dy);
        } else {
            Class<?> cls = interfaceC38831rF.getClass();
            Map map = C0YZ.A03;
            C14360o3.A0B(cls, 1);
            throw new Exception(AnonymousClass001.A0R("data is an unknown type: ", AbstractC13230m9.A01(cls)));
        }
        return new C38321qM(c1dy.A00, F4m);
    }

    public final C38321qM A1i(String str) {
        List Bx3 = this.A0C.Bx3();
        Object obj = null;
        if (Bx3 == null) {
            return null;
        }
        Iterator it = Bx3.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (str.equals(((C38321qM) next).getId())) {
                obj = next;
                break;
            }
        }
        return (C38321qM) obj;
    }

    public final ReelCTAIntf A1j() {
        List C1N = this.A0C.C1N();
        Object obj = null;
        if (C1N == null) {
            return null;
        }
        Iterator it = C1N.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (C6T4.A00((ReelCTAIntf) next) != null) {
                obj = next;
                break;
            }
        }
        return (ReelCTAIntf) obj;
    }

    public final InterfaceC114655Fv A1k(UserSession userSession) {
        if (this.A0C.BYz() == null && OpenCarouselSubmissionState.A07 == this.A0C.BZ5()) {
            this.A0C.Ea7(A1l(userSession));
        }
        return this.A0C.BYz();
    }

    public final EnumC76753cN A1m() {
        Integer BCe = this.A0C.BCe();
        if (BCe != null) {
            Object obj = EnumC76753cN.A01.get(BCe.intValue(), EnumC76753cN.A04);
            C14360o3.A07(obj);
            return (EnumC76753cN) obj;
        }
        return null;
    }

    public final EnumC138786Qj A1w() {
        Integer Ap8 = this.A0C.Ap8();
        if (Ap8 != null) {
            EnumC138786Qj enumC138786Qj = (EnumC138786Qj) EnumC138786Qj.A01.get(Integer.valueOf(Ap8.intValue()));
            if (enumC138786Qj != null) {
                return enumC138786Qj;
            }
        }
        return EnumC138786Qj.A07;
    }

    public final EnumC76383bi A1x() {
        EnumC76383bi enumC76383bi;
        String audience = this.A0C.getAudience();
        if (audience == null || (enumC76383bi = (EnumC76383bi) EnumC76383bi.A01.get(audience)) == null) {
            return EnumC76383bi.A06;
        }
        return enumC76383bi;
    }

    public final C3YU A1y() {
        C3YU c3yu;
        String CGd = this.A0C.CGd();
        if (CGd == null || (c3yu = (C3YU) C3YU.A01.get(CGd)) == null) {
            return C3YU.A05;
        }
        return c3yu;
    }

    public final ProductType A1z() {
        String productType = this.A0C.getProductType();
        if (productType != null) {
            return (ProductType) ProductType.A01.get(productType);
        }
        return null;
    }

    public final EnumC75663aX A20() {
        EnumC75663aX enumC75663aX;
        String subscriptionMediaVisibility = this.A0C.getSubscriptionMediaVisibility();
        if (subscriptionMediaVisibility == null || (enumC75663aX = (EnumC75663aX) EnumC75663aX.A01.get(subscriptionMediaVisibility)) == null) {
            return EnumC75663aX.A04;
        }
        return enumC75663aX;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, X.6QX] */
    public final C6QX A21() {
        InterfaceC39751sy C17 = this.A0C.C17();
        HashMap hashMap = null;
        if (C17 == null) {
            return null;
        }
        ?? obj = new Object();
        obj.A06 = C17.getText();
        obj.A03 = C17.getBackgroundColor();
        obj.A04 = C17.Aeu();
        obj.A07 = C17.getTextColor();
        Integer C6j = C17.C6j();
        if (C6j != null) {
            obj.A02 = C6j;
        }
        Boolean BwS = C17.BwS();
        if (BwS != null) {
            obj.A09 = BwS.booleanValue();
        }
        obj.A05 = C17.getDescription();
        Map BSP = C17.BSP();
        if (BSP != null) {
            hashMap = new HashMap(BSP);
        }
        obj.A08 = hashMap;
        return obj;
    }

    public final ProductCollectionLinkIntf A22() {
        ReelCTAIntf reelCTAIntf;
        List C1N = this.A0C.C1N();
        if (C1N != null && (reelCTAIntf = (ReelCTAIntf) AbstractC001800i.A0J(C1N)) != null) {
            return reelCTAIntf.Bgs();
        }
        return null;
    }

    public final ProfileShopLinkIntf A23() {
        ReelCTAIntf reelCTAIntf;
        List C1N = this.A0C.C1N();
        if (C1N != null && (reelCTAIntf = (ReelCTAIntf) AbstractC001800i.A0J(C1N)) != null) {
            return reelCTAIntf.Bi5();
        }
        return null;
    }

    public final ReelMultiProductLinkIntf A24() {
        ReelCTAIntf reelCTAIntf;
        List C1N = this.A0C.C1N();
        if (C1N != null && (reelCTAIntf = (ReelCTAIntf) AbstractC001800i.A0J(C1N)) != null) {
            return reelCTAIntf.BVO();
        }
        return null;
    }

    public final ReelProductLink A25() {
        ReelCTAIntf reelCTAIntf;
        ReelProductLinkIntf BhC;
        List C1N = this.A0C.C1N();
        if (C1N != null && (reelCTAIntf = (ReelCTAIntf) AbstractC001800i.A0J(C1N)) != null && (BhC = reelCTAIntf.BhC()) != null) {
            return BhC.F6S(this.A0g);
        }
        return null;
    }

    public final InterfaceC38221qC A26() {
        InterfaceC39541sb injected = this.A0C.getInjected();
        if (injected != null) {
            return injected.BJK();
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [com.instagram.model.venue.Venue, java.lang.Object] */
    public final Venue A27() {
        LocationDictIntf BOL = this.A0C.BOL();
        if (BOL != null) {
            ?? obj = new Object();
            obj.A00 = BOL;
            return obj;
        }
        return null;
    }

    public final Venue A28() {
        Object obj;
        List A3w = A3w(EnumC75383a5.A0j);
        if (A3w == null) {
            return null;
        }
        Iterator it = A3w.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (((C84823qW) obj).A09() != null) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        C84823qW c84823qW = (C84823qW) obj;
        if (c84823qW == null) {
            return null;
        }
        return c84823qW.A09();
    }

    public final EnumC39572Hdi A29() {
        EnumC39572Hdi enumC39572Hdi;
        Integer AZP = this.A0C.AZP();
        if (AZP == null || (enumC39572Hdi = (EnumC39572Hdi) EnumC39572Hdi.A01.get(AZP)) == null) {
            return EnumC39572Hdi.A06;
        }
        return enumC39572Hdi;
    }

    public final Product A2A() {
        C84823qW c84823qW;
        List A3w = A3w(EnumC75383a5.A10);
        if (A3w != null && (c84823qW = (C84823qW) AbstractC001800i.A0J(A3w)) != null) {
            return c84823qW.A0I();
        }
        return null;
    }

    public final User A2C() {
        JM3 Arn = this.A0C.Arn();
        if (Arn != null) {
            return Arn.AdJ();
        }
        return null;
    }

    public final User A2D() {
        InterfaceC102194ip interfaceC102194ip;
        List sponsorTags = this.A0C.getSponsorTags();
        if (sponsorTags != null && (interfaceC102194ip = (InterfaceC102194ip) AbstractC001800i.A0J(sponsorTags)) != null) {
            return interfaceC102194ip.BzF();
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0076, code lost:
    
        if (r0 != null) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x007c, code lost:
    
        if (r0.length() == 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x007f, code lost:
    
        r2.A0I = !r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0087, code lost:
    
        return r2.A00();
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x007e, code lost:
    
        r9 = true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C75363a3 A2G() {
        /*
            r10 = this;
            X.1rF r0 = r10.A0C
            java.lang.String r8 = r0.getProductType()
            r9 = 0
            r7 = 1
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r7)
            if (r8 == 0) goto Ld7
            java.util.Map r6 = com.instagram.model.mediatype.ProductType.A01
            java.lang.Object r1 = r6.get(r8)
            com.instagram.model.mediatype.ProductType r0 = com.instagram.model.mediatype.ProductType.DIRECT_AUDIO
            if (r1 == r0) goto L20
            X.1rF r0 = r10.A0C
            X.4d2 r0 = r0.C6Y()
            if (r0 == 0) goto Ld7
        L20:
            X.1tc r1 = r10.BRp()
            X.1tc r0 = X.EnumC40111tc.A07
            if (r1 != r0) goto Lcf
            X.1rF r0 = r10.A0C
            com.instagram.feed.audio.AudioIntf r3 = r0.Add()
            if (r3 == 0) goto Lc7
            java.lang.String r1 = r10.getId()
            r4 = 0
            if (r1 != 0) goto L88
            java.lang.Integer r1 = X.C05F.A0u
            java.util.UUID r0 = java.util.UUID.randomUUID()
            java.lang.String r0 = r0.toString()
            X.C14360o3.A07(r0)
            X.4hZ r2 = new X.4hZ
            r2.<init>(r1, r0)
            java.lang.Object r0 = r6.get(r8)
            com.instagram.model.mediatype.ProductType r0 = (com.instagram.model.mediatype.ProductType) r0
            r2.A04 = r0
            java.lang.String r0 = r3.Ae1()
            r2.A0B = r0
            r2.A0G = r7
            r0 = -1
            r2.A02 = r0
            r2.A05 = r5
            X.1rF r0 = r10.A0C
            java.lang.Float r0 = r0.CF6()
            if (r0 == 0) goto L70
            float r0 = r0.floatValue()
            double r0 = (double) r0
            java.lang.Double r4 = java.lang.Double.valueOf(r0)
        L70:
            r2.A06 = r4
            java.lang.String r0 = r3.Ae1()
            if (r0 == 0) goto L7e
        L78:
            int r0 = r0.length()
            if (r0 != 0) goto L7f
        L7e:
            r9 = 1
        L7f:
            r0 = r9 ^ 1
            r2.A0I = r0
            X.3a3 r0 = r2.A00()
            return r0
        L88:
            java.lang.Integer r0 = X.C05F.A0u
            X.4hZ r2 = new X.4hZ
            r2.<init>(r0, r1)
            java.lang.Object r0 = r6.get(r8)
            com.instagram.model.mediatype.ProductType r0 = (com.instagram.model.mediatype.ProductType) r0
            r2.A04 = r0
            X.Ge8 r0 = new X.Ge8
            r0.<init>(r3)
            r2.A03 = r0
            boolean r0 = r10.CdW()
            r2.A0H = r0
            long r0 = r10.A18()
            r2.A02 = r0
            r2.A05 = r5
            X.1rF r0 = r10.A0C
            java.lang.Float r0 = r0.CF6()
            if (r0 == 0) goto Lbd
            float r0 = r0.floatValue()
            double r0 = (double) r0
            java.lang.Double r4 = java.lang.Double.valueOf(r0)
        Lbd:
            r2.A06 = r4
            java.lang.String r0 = r3.Ae1()
            X.C14360o3.A07(r0)
            goto L78
        Lc7:
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        Lcf:
            java.lang.String r1 = "Check failed."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        Ld7:
            java.lang.String r1 = "attempted to get audio VideoSource for non-audio-only product type"
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C38321qM.A2G():X.3a3");
    }

    public final Boolean A2I() {
        JLV BpH = this.A0C.BpH();
        if (BpH == null || BpH.Ai0() == null) {
            return null;
        }
        Integer Ai0 = BpH.Ai0();
        int i = EnumC53224NgM.A06.A00;
        if (Ai0 == null || Ai0.intValue() != i) {
            return null;
        }
        return BpH.AaG();
    }

    public final Integer A2M() {
        Long AiX = this.A0C.AiX();
        if (AiX != null) {
            return Integer.valueOf((int) AiX.longValue());
        }
        return null;
    }

    public final Integer A2N() {
        InterfaceC39541sb injected;
        Long AiY = this.A0C.AiY();
        if (AiY != null || ((injected = this.A0C.getInjected()) != null && (AiY = injected.AiY()) != null)) {
            return Integer.valueOf((int) AiY.longValue());
        }
        return null;
    }

    public final Integer A2O() {
        int i;
        if (this.A0C.Awg() != null) {
            Integer Awg = this.A0C.Awg();
            if (Awg != null) {
                for (Integer num : C05F.A00(3)) {
                    switch (num.intValue()) {
                        case 1:
                            i = 0;
                            break;
                        case 2:
                            i = 1;
                            break;
                        default:
                            i = -1;
                            break;
                    }
                    if (i == Awg.intValue()) {
                        return num;
                    }
                }
            }
            return C05F.A00;
        }
        return null;
    }

    public final Integer A2R() {
        CommentGiphyMediaImagesIntf BH0;
        CommentGiphyMediaFixedHeightImages B6v;
        CommentGiphyMediaInfoIntf B9s = this.A0C.B9s();
        if (B9s != null && (BH0 = B9s.BH0()) != null && (B6v = BH0.B6v()) != null) {
            return B6v.BDS();
        }
        return null;
    }

    public final Integer A2S() {
        CommentGiphyMediaImagesIntf BH0;
        CommentGiphyMediaFixedHeightImages B6v;
        CommentGiphyMediaInfoIntf B9s = this.A0C.B9s();
        if (B9s != null && (BH0 = B9s.BH0()) != null && (B6v = BH0.B6v()) != null) {
            return B6v.CHg();
        }
        return null;
    }

    public final Integer A2T() {
        InterfaceC39541sb injected = this.A0C.getInjected();
        if (injected != null) {
            return injected.BH5();
        }
        return null;
    }

    public final Integer A2U() {
        if (this.A0C.Bf7() != null) {
            String Bf7 = this.A0C.Bf7();
            for (Integer num : C05F.A00(2)) {
                if (C14360o3.A0K(F7T.A00(num), Bf7)) {
                    return num;
                }
            }
        }
        return null;
    }

    public final String A2V() {
        String AYx;
        InterfaceC39541sb injected = this.A0C.getInjected();
        if (injected != null && (AYx = injected.AYx()) != null) {
            return AYx;
        }
        return null;
    }

    public final String A2W() {
        String AZE;
        InterfaceC39541sb injected = this.A0C.getInjected();
        if (injected != null && (AZE = injected.AZE()) != null) {
            return AZE;
        }
        return null;
    }

    public final String A2X() {
        InterfaceC39541sb injected = this.A0C.getInjected();
        if (injected != null) {
            return injected.AZR();
        }
        return null;
    }

    public final String A2Y() {
        InterfaceC39541sb injected = this.A0C.getInjected();
        if (injected != null) {
            return injected.AaI();
        }
        return null;
    }

    public final String A2Z() {
        String AcH;
        InterfaceC39541sb injected = this.A0C.getInjected();
        if (injected != null && (AcH = injected.AcH()) != null) {
            return AcH;
        }
        return null;
    }

    public final String A2b() {
        String AkD;
        InterfaceC39541sb injected = this.A0C.getInjected();
        if (injected != null && (AkD = injected.AkD()) != null) {
            return AkD;
        }
        return null;
    }

    public final String A2c() {
        ReelCTAIntf reelCTAIntf;
        List BNi;
        Object obj;
        List C1N = this.A0C.C1N();
        if (C1N == null || (reelCTAIntf = (ReelCTAIntf) AbstractC001800i.A0J(C1N)) == null || (BNi = reelCTAIntf.BNi()) == null) {
            return null;
        }
        Iterator it = BNi.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (AbstractC114965Hm.A01((AndroidLink) obj) == EnumC906041v.AD_DESTINATION_CANVAS) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        AndroidLink androidLink = (AndroidLink) obj;
        if (androidLink == null) {
            return null;
        }
        return androidLink.AlR();
    }

    public final String A2d() {
        InterfaceC102714k8 AhS;
        C46j BQT = this.A0C.BQT();
        if (BQT != null && (AhS = BQT.AhS()) != null) {
            return AhS.getBackgroundColor();
        }
        return null;
    }

    public final String A2e() {
        InterfaceC102714k8 C9R;
        C46j BQT = this.A0C.BQT();
        if (BQT != null && (C9R = BQT.C9R()) != null) {
            return C9R.getBackgroundColor();
        }
        return null;
    }

    public final String A2f() {
        if (this.A0C.getCode() == null || C14360o3.A0K(this.A0C.getCode(), "")) {
            C0w9.A04("Media#getCode", "Media code is null or empty", 1);
        }
        return this.A0C.getCode();
    }

    public final String A2i() {
        InterfaceC104764ng AZB;
        InterfaceC39541sb injected = this.A0C.getInjected();
        if ((injected == null || (AZB = injected.AZB()) == null) && (AZB = this.A0C.AZB()) == null) {
            return null;
        }
        return AZB.getText();
    }

    public final String A2j() {
        InterfaceC104764ng AZB;
        InterfaceC39541sb injected = this.A0C.getInjected();
        if ((injected == null || (AZB = injected.AZB()) == null) && (AZB = this.A0C.AZB()) == null) {
            return null;
        }
        return AZB.getTitle();
    }

    public final String A2k() {
        InterfaceC104764ng AZB;
        InterfaceC39541sb injected = this.A0C.getInjected();
        if ((injected == null || (AZB = injected.AZB()) == null) && (AZB = this.A0C.AZB()) == null) {
            return null;
        }
        return AZB.getUrl();
    }

    public final String A2l() {
        String B3K = this.A0C.B3K();
        if (B3K == null) {
            InterfaceC88353wq B3J = this.A0C.B3J();
            if (B3J != null) {
                return B3J.B3H();
            }
            return null;
        }
        return B3K;
    }

    public final String A2m() {
        InterfaceC88353wq B3J = this.A0C.B3J();
        if (B3J != null) {
            return B3J.B3H();
        }
        return null;
    }

    public final String A2n() {
        InterfaceC88353wq B3J = this.A0C.B3J();
        if (B3J != null) {
            return B3J.BIx();
        }
        return null;
    }

    public final String A2o() {
        String title;
        String str;
        InterfaceC88353wq B3J = this.A0C.B3J();
        if (B3J != null && (title = B3J.getTitle()) != null) {
            StringBuilder sb = new StringBuilder();
            int length = title.length();
            boolean z = true;
            for (int i = 0; i < length; i++) {
                if (title.charAt(i) == '*') {
                    if (z) {
                        str = "<b>";
                    } else {
                        str = "</b>";
                    }
                    sb.append(str);
                    z = !z;
                } else {
                    sb.append(title.charAt(i));
                }
            }
            return sb.toString();
        }
        return null;
    }

    public final String A2p() {
        CommentGiphyMediaImagesIntf BH0;
        CommentGiphyMediaFixedHeightImages B6v;
        CommentGiphyMediaInfoIntf B9s = this.A0C.B9s();
        if (B9s != null && (BH0 = B9s.BH0()) != null && (B6v = BH0.B6v()) != null) {
            return B6v.getUrl();
        }
        return null;
    }

    public final String A2q() {
        ReelCTAIntf reelCTAIntf;
        String B64;
        List C1N = this.A0C.C1N();
        if (C1N != null && (reelCTAIntf = (ReelCTAIntf) AbstractC001800i.A0J(C1N)) != null && (B64 = reelCTAIntf.B64()) != null) {
            android.net.Uri A03 = AbstractC08820cl.A03(AnonymousClass001.A0R("ig://", B64));
            C14360o3.A07(A03);
            return A03.getQueryParameter(PublicKeyCredentialControllerUtility.JSON_KEY_ID);
        }
        return null;
    }

    public final String A2r() {
        List AZh;
        InterfaceC107754tK interfaceC107754tK;
        InterfaceC107774tM BEB = this.A0C.BEB();
        if (BEB != null && (AZh = BEB.AZh()) != null && (interfaceC107754tK = (InterfaceC107754tK) AbstractC001800i.A0O(AZh, 0)) != null) {
            return interfaceC107754tK.BlW();
        }
        return null;
    }

    public final String A2s() {
        InterfaceC107114sH AtW;
        InterfaceC87803vo BUx = this.A0C.BUx();
        if (BUx != null && (AtW = BUx.AtW()) != null) {
            return AtW.Aya();
        }
        return null;
    }

    public final String A2t() {
        InterfaceC73625YQn interfaceC73625YQn;
        StoryMusicPickTappableDataIntf BVg;
        String id;
        List C1n = this.A0C.C1n();
        if (C1n == null || (interfaceC73625YQn = (InterfaceC73625YQn) AbstractC001800i.A0J(C1n)) == null || (BVg = interfaceC73625YQn.BVg()) == null || (id = BVg.getId()) == null) {
            return "";
        }
        return id;
    }

    public final String A2v() {
        String BZD = this.A0C.BZD();
        if (BZD == null || BZD.length() <= 0) {
            return null;
        }
        return BZD;
    }

    public final String A2w() {
        String BZH;
        InterfaceC39541sb injected = this.A0C.getInjected();
        if (injected == null || (BZH = injected.BZH()) == null) {
            return "";
        }
        return BZH;
    }

    public final String A2x() {
        String BZb = this.A0C.BZb();
        if (BZb == null) {
            return null;
        }
        return BZb;
    }

    public final String A2y() {
        String Baz;
        InterfaceC39541sb injected = this.A0C.getInjected();
        if (injected != null && (Baz = injected.Baz()) != null) {
            return Baz;
        }
        return null;
    }

    public final String A2z() {
        if (this.A0a == null && this.A0C.AmI() != null) {
            this.A0a = AnonymousClass001.A0T(this.A0C.AmI(), getId(), '-');
        }
        return this.A0a;
    }

    public final String A30() {
        InterfaceC102714k8 AhS;
        C46j Ble = this.A0C.Ble();
        if (Ble != null && (AhS = Ble.AhS()) != null) {
            return AhS.getBackgroundColor();
        }
        return null;
    }

    public final String A31() {
        InterfaceC102714k8 C9R;
        C46j Ble = this.A0C.Ble();
        if (Ble != null && (C9R = Ble.C9R()) != null) {
            return C9R.getBackgroundColor();
        }
        return null;
    }

    public final String A32() {
        InterfaceC39541sb injected = this.A0C.getInjected();
        if (injected != null) {
            return injected.BKx();
        }
        return null;
    }

    public final String A33() {
        String CAR;
        InterfaceC39541sb injected = this.A0C.getInjected();
        if (injected != null && (CAR = injected.CAR()) != null && CdW()) {
            return CAR;
        }
        return this.A0C.getOrganicTrackingToken();
    }

    public final String A34() {
        String fundraiserId;
        InterfaceC39031rc B99 = this.A0C.B99();
        if (B99 != null && (fundraiserId = B99.getFundraiserId()) != null) {
            return fundraiserId;
        }
        return null;
    }

    public final String A35() {
        JMM C1A = this.A0C.C1A();
        if (C1A != null) {
            return C1A.getName();
        }
        return null;
    }

    public final String A36() {
        JMM C1A = this.A0C.C1A();
        if (C1A != null) {
            return C1A.BNL();
        }
        return null;
    }

    public final String A37() {
        JLZ jlz;
        List C1E = this.A0C.C1E();
        if (C1E != null && (jlz = (JLZ) AbstractC001800i.A0J(C1E)) != null) {
            return jlz.AgR();
        }
        return null;
    }

    public final String A39() {
        AnonymousClass924 CGu = this.A0C.CGu();
        if (CGu != null) {
            return CGu.Apb().getCommenterUsername();
        }
        return null;
    }

    public final String A3F(Integer num) {
        JMF B5y;
        List BhH;
        if (num != null && (B5y = this.A0C.B5y()) != null && (BhH = B5y.BhH()) != null) {
            return ((JL4) BhH.get(num.intValue())).getProductId();
        }
        return null;
    }

    public final ArrayList A3G() {
        List<YQU> C15 = this.A0C.C15();
        if (C15 != null) {
            ArrayList arrayList = new ArrayList(AbstractC06950Ym.A1E(C15, 10));
            for (YQU yqu : C15) {
                C14360o3.A0B(yqu, 0);
                arrayList.add(new C84823qW(EnumC75383a5.A04, yqu.CI1(), yqu.CIa(), yqu.CIh(), yqu.CHf(), yqu.BDR(), yqu.Bpa(), yqu.CVk(), yqu.Cdh(), yqu.CUY(), yqu.Ayd(), yqu.AdC(), yqu.getId()));
            }
            return new ArrayList(arrayList);
        }
        return null;
    }

    public final ArrayList A3H() {
        InterfaceC39001rZ B57 = this.A0C.B57();
        if (B57 != null) {
            return new ArrayList(AbstractC85023qq.A00(B57));
        }
        return null;
    }

    public final ArrayList A3J() {
        ArrayList arrayList = new ArrayList();
        ArrayList A3I = A3I();
        if (A3I != null) {
            Iterator it = A3I.iterator();
            while (it.hasNext()) {
                arrayList.add(AbstractC38048Gob.A01(((ProductTag) it.next()).A02));
            }
        }
        return arrayList;
    }

    public final ArrayList A3L() {
        List<InterfaceC73626YQo> C1p = this.A0C.C1p();
        if (C1p != null) {
            C1DV c1dv = this.A0g;
            ArrayList arrayList = new ArrayList(AbstractC06950Ym.A1E(C1p, 10));
            for (InterfaceC73626YQo interfaceC73626YQo : C1p) {
                C14360o3.A0B(interfaceC73626YQo, 0);
                C84823qW c84823qW = new C84823qW(EnumC75383a5.A0u, interfaceC73626YQo.CI1(), interfaceC73626YQo.CIa(), interfaceC73626YQo.CIh(), interfaceC73626YQo.CHf(), interfaceC73626YQo.BDR(), interfaceC73626YQo.Bpa(), interfaceC73626YQo.CVk(), interfaceC73626YQo.Cdh(), interfaceC73626YQo.CUY(), interfaceC73626YQo.Ayd(), interfaceC73626YQo.AdC(), interfaceC73626YQo.getId());
                c84823qW.A0Y = interfaceC73626YQo.F17(c1dv);
                arrayList.add(c84823qW);
            }
            return new ArrayList(arrayList);
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, com.instagram.model.people.PeopleTag, com.instagram.tagging.model.Tag] */
    public final ArrayList A3M() {
        boolean z;
        InterfaceC84523py CEF = this.A0C.CEF();
        if (CEF != null) {
            List CIr = CEF.CIr();
            ArrayList<UserTagInfoDictIntf> arrayList = new ArrayList();
            for (Object obj : CIr) {
                if (((UserTagInfoDictIntf) obj).CDj() != null) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList(AbstractC06950Ym.A1E(arrayList, 10));
            for (UserTagInfoDictIntf userTagInfoDictIntf : arrayList) {
                ?? obj2 = new Object();
                obj2.A03 = false;
                obj2.A00 = new PeopleTag.UserInfo(userTagInfoDictIntf.CDj());
                if (userTagInfoDictIntf.Bw5() != null) {
                    z = userTagInfoDictIntf.Bw5().booleanValue();
                } else {
                    z = false;
                }
                obj2.A02 = z;
                obj2.A01 = userTagInfoDictIntf.AmW();
                if (userTagInfoDictIntf.Bec() != null && userTagInfoDictIntf.Bec().size() >= 2) {
                    obj2.A00 = new PointF(((Number) userTagInfoDictIntf.Bec().get(0)).floatValue(), ((Number) userTagInfoDictIntf.Bec().get(1)).floatValue());
                }
                arrayList2.add(obj2);
            }
            return new ArrayList(arrayList2);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:137:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x032d  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0336  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0341  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x03b7  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x03c2  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x03cf  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x03d8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.ArrayList A3N() {
        /*
            Method dump skipped, instructions count: 988
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C38321qM.A3N():java.util.ArrayList");
    }

    public final ArrayList A3O() {
        List CIr;
        ArrayList arrayList;
        InterfaceC111164zd BhM = this.A0C.BhM();
        if (BhM == null || (CIr = BhM.CIr()) == null || CIr.isEmpty()) {
            return null;
        }
        List CIr2 = BhM.CIr();
        if (CIr2 != null) {
            arrayList = new ArrayList(AbstractC06950Ym.A1E(CIr2, 10));
            Iterator it = CIr2.iterator();
            while (it.hasNext()) {
                arrayList.add(AbstractC38046GoZ.A00((ProductTagDictIntf) it.next()));
            }
        } else {
            arrayList = null;
        }
        return new ArrayList(arrayList);
    }

    public final ArrayList A3P() {
        H4U h4u;
        List<InterfaceC73627YQp> C1q = this.A0C.C1q();
        if (C1q != null) {
            C1DV c1dv = this.A0g;
            ArrayList arrayList = new ArrayList(AbstractC06950Ym.A1E(C1q, 10));
            for (InterfaceC73627YQp interfaceC73627YQp : C1q) {
                C14360o3.A0B(interfaceC73627YQp, 0);
                C84823qW c84823qW = new C84823qW(EnumC75383a5.A0v, interfaceC73627YQp.CI1(), interfaceC73627YQp.CIa(), interfaceC73627YQp.CIh(), interfaceC73627YQp.CHf(), interfaceC73627YQp.BDR(), interfaceC73627YQp.Bpa(), interfaceC73627YQp.CVk(), interfaceC73627YQp.Cdh(), interfaceC73627YQp.CUY(), interfaceC73627YQp.Ayd(), interfaceC73627YQp.AdC(), interfaceC73627YQp.getId());
                JKQ Bco = interfaceC73627YQp.Bco();
                if (Bco != null) {
                    h4u = Bco.Exy(c1dv);
                } else {
                    h4u = null;
                }
                c84823qW.A0L = h4u;
                arrayList.add(c84823qW);
            }
            return new ArrayList(arrayList);
        }
        return null;
    }

    public final ArrayList A3Q() {
        InterfaceC39001rZ B57 = this.A0C.B57();
        if (B57 != null) {
            ArrayList A00 = AbstractC85023qq.A00(B57);
            ArrayList arrayList = new ArrayList();
            Iterator it = A00.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                FBTagType fBTagType = ((FBUserTag) next).A01;
                if (fBTagType == FBTagType.A05 || fBTagType == FBTagType.A07 || fBTagType == FBTagType.A04) {
                    arrayList.add(next);
                }
            }
            return new ArrayList(arrayList);
        }
        return null;
    }

    public final HashMap A3T() {
        HashMap hashMap = new HashMap();
        List<C38321qM> AmB = this.A0C.AmB();
        if (AmB != null) {
            for (C38321qM c38321qM : AmB) {
                ArrayList A3H = c38321qM.A3H();
                if (A3H == null) {
                    A3H = new ArrayList();
                }
                String id = c38321qM.getId();
                if (id != null) {
                    hashMap.put(id, A3H);
                }
            }
        }
        return hashMap;
    }

    public final HashMap A3U() {
        HashMap hashMap = new HashMap();
        List<C38321qM> AmB = this.A0C.AmB();
        if (AmB != null) {
            for (C38321qM c38321qM : AmB) {
                ArrayList A3M = c38321qM.A3M();
                if (A3M == null) {
                    A3M = new ArrayList();
                }
                String id = c38321qM.getId();
                if (id != null) {
                    hashMap.put(id, A3M);
                }
            }
        }
        return hashMap;
    }

    public final HashMap A3V() {
        ArrayList arrayList;
        HashMap hashMap = new HashMap();
        List AmB = this.A0C.AmB();
        if (AmB != null) {
            arrayList = new ArrayList(AmB);
        } else {
            arrayList = null;
        }
        if (A5M() && arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                C38321qM c38321qM = (C38321qM) it.next();
                ArrayList A3O = c38321qM.A3O();
                if (A3O == null) {
                    A3O = new ArrayList();
                }
                String id = c38321qM.getId();
                if (id != null) {
                    hashMap.put(id, A3O);
                } else if (A3O.isEmpty()) {
                    continue;
                } else {
                    int size = A3O.size();
                    int i = 0;
                    if (!(arrayList instanceof Collection) || !arrayList.isEmpty()) {
                        Iterator it2 = arrayList.iterator();
                        while (it2.hasNext()) {
                            if (((C38321qM) it2.next()).getId() == null && (i = i + 1) < 0) {
                                AbstractC16960so.A1T();
                                throw C00O.createAndThrow();
                            }
                        }
                    }
                    C0K8.A0E("NULL_CHILD_ID", AnonymousClass001.A02(size, i, "child id null, childTags.size = ", ", carouselMedia.count { it.id == null } = "));
                }
            }
        }
        return hashMap;
    }

    public final LinkedHashMap A3W() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        List<C38321qM> AmB = this.A0C.AmB();
        if (AmB != null) {
            for (C38321qM c38321qM : AmB) {
                if (!c38321qM.Cff()) {
                    String AXw = c38321qM.A0C.AXw();
                    if (AXw == null) {
                        AXw = "";
                    }
                    String id = c38321qM.getId();
                    if (id != null) {
                        linkedHashMap.put(id, AXw);
                    } else {
                        throw new IllegalStateException("Required value was null.");
                    }
                }
            }
        }
        return linkedHashMap;
    }

    public final List A3X() {
        InterfaceC39541sb injected = this.A0C.getInjected();
        if (injected != null) {
            return injected.getCookies();
        }
        return null;
    }

    public final List A3Y() {
        List Abm = this.A0C.Abm();
        if (Abm == null) {
            return new ArrayList();
        }
        return Abm;
    }

    public final List A3Z() {
        User BzF;
        List<InterfaceC102194ip> sponsorTags = this.A0C.getSponsorTags();
        if (sponsorTags != null) {
            ArrayList arrayList = new ArrayList();
            for (InterfaceC102194ip interfaceC102194ip : sponsorTags) {
                if (!C14360o3.A0K(interfaceC102194ip.Ca9(), true) && (BzF = interfaceC102194ip.BzF()) != null) {
                    arrayList.add(BzF);
                }
            }
            return arrayList;
        }
        return C16930sl.A00;
    }

    public final List A3b() {
        InterfaceC39541sb injected = this.A0C.getInjected();
        if (injected != null) {
            return injected.AiV();
        }
        return null;
    }

    public final List A3d() {
        List coauthorProducers = this.A0C.getCoauthorProducers();
        if (coauthorProducers != null) {
            ArrayList arrayList = new ArrayList(AbstractC06950Ym.A1E(coauthorProducers, 10));
            Iterator it = coauthorProducers.iterator();
            while (it.hasNext()) {
                arrayList.add(((User) it.next()).getId());
            }
            return arrayList;
        }
        return null;
    }

    public final List A3f() {
        List Apm = this.A0C.Apm();
        if (Apm != null) {
            ArrayList arrayList = new ArrayList(AbstractC06950Ym.A1E(Apm, 10));
            Iterator it = Apm.iterator();
            while (it.hasNext()) {
                arrayList.add(new C84923qg((InterfaceC38901rP) it.next()));
            }
            return arrayList;
        }
        return null;
    }

    public final List A3g() {
        List B07 = this.A0C.B07();
        if (B07 == null) {
            return new ArrayList();
        }
        return B07;
    }

    public final List A3h() {
        JMF B5y = this.A0C.B5y();
        if (B5y != null) {
            return B5y.BhB();
        }
        return null;
    }

    public final List A3i() {
        List BJQ = this.A0C.BJQ();
        if (BJQ == null) {
            ArrayList arrayList = new ArrayList();
            this.A0C.EWL(arrayList);
            return arrayList;
        }
        return BJQ;
    }

    public final List A3j() {
        InterfaceC84363pT BRI = this.A0C.BRI();
        if (BRI != null) {
            return BRI.getItems();
        }
        return null;
    }

    public final List A3m() {
        InterfaceC39541sb injected = this.A0C.getInjected();
        if (injected != null) {
            return injected.Bf8();
        }
        return null;
    }

    public final List A3n() {
        List Bfl = this.A0C.Bfl();
        if (Bfl != null) {
            ArrayList arrayList = new ArrayList(AbstractC06950Ym.A1E(Bfl, 10));
            Iterator it = Bfl.iterator();
            while (it.hasNext()) {
                arrayList.add(new C84923qg((InterfaceC38901rP) it.next()));
            }
            return arrayList;
        }
        return null;
    }

    public final List A3p() {
        ReelCTAIntf reelCTAIntf;
        List C1N = this.A0C.C1N();
        if (C1N != null && (reelCTAIntf = (ReelCTAIntf) AbstractC001800i.A0J(C1N)) != null) {
            return reelCTAIntf.BNi();
        }
        return null;
    }

    @Override // X.InterfaceC38391qT
    /* renamed from: A3q, reason: merged with bridge method [inline-methods] */
    public final List BqL() {
        List BqM = this.A0C.BqM();
        if (BqM == null) {
            return new ArrayList();
        }
        return BqM;
    }

    public final List A3r() {
        List sponsorTags = this.A0C.getSponsorTags();
        if (sponsorTags == null) {
            return C16930sl.A00;
        }
        return sponsorTags;
    }

    public final List A3s() {
        InterfaceC39541sb injected = this.A0C.getInjected();
        if (injected != null) {
            return injected.BDm();
        }
        return null;
    }

    public final List A3u(UserSession userSession) {
        List Aoa;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        User A2E = A2E(userSession);
        if (A2E != null) {
            linkedHashSet.add(A2E);
        }
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        InterfaceC31132DmF AoZ = this.A0C.AoZ();
        if (AoZ != null && (Aoa = AoZ.Aoa()) != null) {
            ArrayList arrayList = new ArrayList();
            Iterator it = Aoa.iterator();
            while (it.hasNext()) {
                User A2E2 = ((C38321qM) it.next()).A2E(userSession);
                if (A2E2 != null) {
                    arrayList.add(A2E2);
                }
            }
            if (!arrayList.isEmpty()) {
                linkedHashSet2.addAll(arrayList);
            }
        }
        List A0a = AbstractC001800i.A0a(linkedHashSet2);
        if (!A0a.isEmpty()) {
            linkedHashSet.addAll(A0a);
        }
        return AbstractC001800i.A0a(linkedHashSet);
    }

    public final List A3v(UserSession userSession) {
        if (this.A0C.BhK() != null) {
            List BhK = this.A0C.BhK();
            if (BhK != null) {
                ArrayList arrayList = new ArrayList(AbstractC06950Ym.A1E(BhK, 10));
                Iterator it = BhK.iterator();
                while (it.hasNext()) {
                    arrayList.add(((JL5) it.next()).EyQ(C1DS.A00(userSession)));
                }
                return arrayList;
            }
            return C16930sl.A00;
        }
        return new ArrayList();
    }

    public final void A3x() {
        List Ad8 = this.A0C.Ad8();
        if (Ad8 != null) {
            Iterator it = Ad8.iterator();
            while (it.hasNext() && !"reels_inline_quality_survey".equals(((InterfaceC43514JKa) it.next()).CBn())) {
            }
        }
    }

    public final void A3y() {
        List Ad8 = this.A0C.Ad8();
        if (Ad8 != null) {
            Iterator it = Ad8.iterator();
            while (it.hasNext() && !"explore_inline_survey".equals(((InterfaceC43514JKa) it.next()).CBn())) {
            }
        }
    }

    public final void A3z() {
        List Ad8 = this.A0C.Ad8();
        if (Ad8 != null) {
            Iterator it = Ad8.iterator();
            while (it.hasNext() && !"inline_survey".equals(((InterfaceC43514JKa) it.next()).CBn())) {
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void A40() {
        Object c114645Fu;
        InterfaceC114655Fv BYz = this.A0C.BYz();
        if (BYz != 0) {
            InterfaceC38831rF interfaceC38831rF = this.A0C;
            BYz.BCb();
            Boolean CZi = BYz.CZi();
            Boolean Ca3 = BYz.Ca3();
            Boolean CbI = BYz.CbI();
            Boolean BWL = BYz.BWL();
            if (BYz instanceof HW5) {
                TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
                TreeJNI treeJNI = (TreeJNI) BYz;
                c114645Fu = new TreeUpdaterJNI(AbstractC06930Yk.A06(new C09530e4("has_reviewed_all_pending_media", true), new C09530e4("is_open_carousel", CZi), new C09530e4("is_parent_media", Ca3), new C09530e4("is_prompt_page", CbI), new C09530e4("need_last_post_impression", BWL)), treeJNI).applyToTree(treeJNI);
                C14360o3.A07(c114645Fu);
            } else {
                c114645Fu = new C114645Fu(true, CZi, Ca3, CbI, BWL);
            }
            interfaceC38831rF.Ea7((InterfaceC114655Fv) c114645Fu);
        }
    }

    public final void A41(int i) {
        this.A0C.ERm(Integer.valueOf(A0s() - i));
        if (A0s() < 0) {
            this.A0C.ERm(0);
        }
    }

    public final void A42(int i) {
        this.A0C.EY8(Integer.valueOf(i));
    }

    public final void A43(C3x9 c3x9) {
        InterfaceC38831rF interfaceC38831rF = this.A0C;
        if (c3x9 != null) {
            interfaceC38831rF.ERZ(c3x9);
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public final void A44(UserSession userSession) {
        int i;
        int i2;
        AtomicBoolean atomicBoolean = A0i;
        if (!atomicBoolean.get()) {
            C0f6 c0f6 = this.A0Y;
            if (c0f6 == null) {
                if (userSession != null && A5O() && C18U.A06(C06090Tz.A05, userSession, 36325987281024555L)) {
                    c0f6 = C18950wb.A01;
                    this.A0Y = c0f6;
                } else {
                    return;
                }
            }
            List<C38321qM> AmB = this.A0C.AmB();
            if (AmB != null) {
                for (C38321qM c38321qM : AmB) {
                    List AmB2 = c38321qM.A0C.AmB();
                    int i3 = 0;
                    if (AmB2 != null && !AmB2.isEmpty()) {
                        atomicBoolean.set(true);
                        C0f5 AEp = c0f6.AEp("postprocess_infinite_carousel", 817894408);
                        AEp.ABX("is_child_media_carousel", c38321qM.A5O());
                        List AmB3 = c38321qM.A0C.AmB();
                        if (AmB3 != null) {
                            i = AmB3.size();
                        } else {
                            i = 0;
                        }
                        AEp.ABU("child_carousel_media_size", i);
                        List AmB4 = this.A0C.AmB();
                        if (AmB4 != null) {
                            i3 = AmB4.size();
                        }
                        AEp.ABU("carousel_media_size", i3);
                        AEp.ABW("parent_media_id", this.A0C.AmI());
                        Integer BRq = this.A0C.BRq();
                        int i4 = -1;
                        if (BRq != null) {
                            i2 = BRq.intValue();
                        } else {
                            i2 = -1;
                        }
                        AEp.ABU("parent_media_type", i2);
                        AEp.ABW("recurred_media_id", getId());
                        AEp.ABW("child_media_id", c38321qM.getId());
                        Integer BRq2 = c38321qM.A0C.BRq();
                        if (BRq2 != null) {
                            i4 = BRq2.intValue();
                        }
                        AEp.ABU("child_media_type", i4);
                        IdentityHashMap identityHashMap = new IdentityHashMap();
                        ArrayList arrayList = new ArrayList();
                        C38801rC.A08(this, identityHashMap, arrayList);
                        AEp.ABW("media_id_graph", AbstractC001800i.A0P(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1, "", "", arrayList, null));
                        AEp.ABW("delivery_data_types", AbstractC77343dK.A01(this.A0e));
                        AEp.report();
                        if (C18U.A06(C06090Tz.A05, userSession, 36325987281090092L)) {
                            throw new IllegalStateException("Carousel with a carousel child detected");
                        }
                    }
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00d0 A[Catch: all -> 0x0173, TryCatch #0 {all -> 0x0173, blocks: (B:5:0x0010, B:7:0x001d, B:8:0x0022, B:10:0x002b, B:11:0x0038, B:13:0x004d, B:14:0x006c, B:16:0x0072, B:18:0x0080, B:19:0x0084, B:21:0x008a, B:23:0x0096, B:26:0x00a0, B:27:0x00a7, B:29:0x00af, B:34:0x00bc, B:35:0x00c0, B:37:0x00d0, B:38:0x00d2, B:40:0x00e4, B:41:0x014f, B:43:0x0155, B:44:0x0159, B:47:0x0162, B:49:0x00eb, B:51:0x00fd, B:52:0x0101, B:54:0x010b, B:56:0x0111, B:57:0x0115, B:59:0x011f, B:61:0x0125, B:62:0x0129, B:64:0x0133, B:66:0x0139, B:67:0x013e), top: B:4:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00e4 A[Catch: all -> 0x0173, TryCatch #0 {all -> 0x0173, blocks: (B:5:0x0010, B:7:0x001d, B:8:0x0022, B:10:0x002b, B:11:0x0038, B:13:0x004d, B:14:0x006c, B:16:0x0072, B:18:0x0080, B:19:0x0084, B:21:0x008a, B:23:0x0096, B:26:0x00a0, B:27:0x00a7, B:29:0x00af, B:34:0x00bc, B:35:0x00c0, B:37:0x00d0, B:38:0x00d2, B:40:0x00e4, B:41:0x014f, B:43:0x0155, B:44:0x0159, B:47:0x0162, B:49:0x00eb, B:51:0x00fd, B:52:0x0101, B:54:0x010b, B:56:0x0111, B:57:0x0115, B:59:0x011f, B:61:0x0125, B:62:0x0129, B:64:0x0133, B:66:0x0139, B:67:0x013e), top: B:4:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x014f A[Catch: all -> 0x0173, TryCatch #0 {all -> 0x0173, blocks: (B:5:0x0010, B:7:0x001d, B:8:0x0022, B:10:0x002b, B:11:0x0038, B:13:0x004d, B:14:0x006c, B:16:0x0072, B:18:0x0080, B:19:0x0084, B:21:0x008a, B:23:0x0096, B:26:0x00a0, B:27:0x00a7, B:29:0x00af, B:34:0x00bc, B:35:0x00c0, B:37:0x00d0, B:38:0x00d2, B:40:0x00e4, B:41:0x014f, B:43:0x0155, B:44:0x0159, B:47:0x0162, B:49:0x00eb, B:51:0x00fd, B:52:0x0101, B:54:0x010b, B:56:0x0111, B:57:0x0115, B:59:0x011f, B:61:0x0125, B:62:0x0129, B:64:0x0133, B:66:0x0139, B:67:0x013e), top: B:4:0x0010 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A45(com.instagram.common.session.UserSession r14) {
        /*
            Method dump skipped, instructions count: 385
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C38321qM.A45(com.instagram.common.session.UserSession):void");
    }

    public final void A46(UserSession userSession, C38321qM c38321qM, boolean z) {
        InterfaceC99334d2 interfaceC99334d2;
        AnonymousClass520 anonymousClass520;
        InterfaceC109094vY interfaceC109094vY;
        boolean z2;
        Integer Ba2;
        Integer BZo;
        InterfaceC109094vY BRN;
        AnonymousClass520 Ald;
        InterfaceC99334d2 C6Y;
        if (Systrace.A0E(1L)) {
            C0fO.A01("Media#updateFields", 1301640947);
        }
        try {
            C06090Tz c06090Tz = C06090Tz.A05;
            if (C18U.A06(c06090Tz, userSession, 36327164104489305L)) {
                this.A0C.En4();
            }
            InterfaceC38831rF interfaceC38831rF = c38321qM.A0C;
            List AmB = this.A0C.AmB();
            if (c38321qM.A5M() && (AmB == null || !c38321qM.A5i())) {
                AmB = interfaceC38831rF.AmB();
            }
            InterfaceC99334d2 C6Y2 = interfaceC38831rF.C6Y();
            if (C6Y2 != null && (C6Y = this.A0C.C6Y()) != null) {
                interfaceC99334d2 = AbstractC72892XqR.A00(C6Y, C6Y2);
            } else {
                interfaceC99334d2 = null;
            }
            AnonymousClass520 Ald2 = interfaceC38831rF.Ald();
            if (Ald2 != null && (Ald = this.A0C.Ald()) != null) {
                anonymousClass520 = AnonymousClass532.A00(Ald, Ald2);
            } else {
                anonymousClass520 = null;
            }
            InterfaceC109094vY BRN2 = interfaceC38831rF.BRN();
            if (BRN2 != null && (BRN = this.A0C.BRN()) != null) {
                interfaceC109094vY = AbstractC69869Vwu.A00(BRN, BRN2);
            } else {
                interfaceC109094vY = null;
            }
            if (C18U.A06(c06090Tz, userSession, 36327005188274423L)) {
                Integer Ba22 = interfaceC38831rF.Ba2();
                if (Ba22 != null && Ba22.intValue() == 0) {
                    Ba2 = this.A0C.Ba2();
                } else {
                    Ba2 = interfaceC38831rF.Ba2();
                }
                interfaceC38831rF.EaI(Ba2);
                Integer BZo2 = interfaceC38831rF.BZo();
                if (BZo2 != null && BZo2.intValue() == 0) {
                    BZo = this.A0C.BZo();
                } else {
                    BZo = interfaceC38831rF.BZo();
                }
                interfaceC38831rF.EaG(BZo);
                ImageInfo BGx = interfaceC38831rF.BGx();
                if (BGx == null) {
                    BGx = this.A0C.BGx();
                }
                interfaceC38831rF.EW3(BGx);
            }
            if (!z || !(this.A0C instanceof C42553IsX)) {
                this.A0C.FAz(interfaceC38831rF);
            }
            A44(userSession);
            this.A0C.ERF(AmB);
            A44(userSession);
            if (interfaceC99334d2 != null) {
                this.A0C.Efb(interfaceC99334d2);
            }
            if (anonymousClass520 != null) {
                this.A0C.ERC(anonymousClass520);
            }
            if (interfaceC109094vY != null) {
                this.A0C.EYy(interfaceC109094vY);
            }
            InterfaceC38831rF interfaceC38831rF2 = this.A0C;
            Boolean CXO = c38321qM.A0C.CXO();
            if (CXO != null) {
                z2 = CXO.booleanValue();
            } else {
                z2 = false;
            }
            interfaceC38831rF2.EY6(Boolean.valueOf(z2));
            if (C18U.A06(c06090Tz, userSession, 36324673023652208L)) {
                this.A0C.Efr(interfaceC38831rF.C8a());
            }
            if (C18U.A06(c06090Tz, userSession, 36324673023914356L)) {
                this.A0C.EY7(interfaceC38831rF.BNB());
            }
            C40041tV c40041tV = this.A0d;
            C40041tV c40041tV2 = c38321qM.A0d;
            C14360o3.A0B(c40041tV2, 1);
            c40041tV.A01();
            if (c40041tV2.A05.A00.size() > 0) {
                c40041tV.A05 = c40041tV2.A05;
            }
            if (c40041tV2.A06.A00.size() > 0) {
                C40061tX c40061tX = c40041tV2.A06;
                c40041tV.A06 = c40061tX;
                C40051tW.A02(c40061tX);
            }
            C40061tX c40061tX2 = c40041tV.A0A;
            List<C84923qg> list = c40061tX2.A00;
            for (C84923qg c84923qg : list) {
                C14360o3.A0B(c84923qg, 0);
                c40061tX2.A02(c84923qg);
                C40051tW.A04(c40041tV.A05, c84923qg.A0G);
                C40051tW.A04(c40041tV.A06, c84923qg.A0G);
                C40051tW.A04(c40041tV.A01, c84923qg.A0G);
                C40051tW.A04(c40041tV.A04, c84923qg.A0G);
                C40051tW.A04(c40041tV.A03, c84923qg.A0G);
            }
            C40061tX c40061tX3 = c40041tV.A05;
            if (c40061tX3 != null) {
                C40051tW.A05(this, c40061tX3.A00);
            }
            C40061tX c40061tX4 = c40041tV.A06;
            if (c40061tX4 != null) {
                C40051tW.A05(this, c40061tX4.A00);
            }
            C40061tX c40061tX5 = c40041tV.A01;
            if (c40061tX5 != null) {
                C40051tW.A05(this, c40061tX5.A00);
            }
            C40061tX c40061tX6 = c40041tV.A04;
            if (c40061tX6 != null) {
                C40051tW.A05(this, c40061tX6.A00);
            }
            C40061tX c40061tX7 = c40041tV.A03;
            if (c40061tX7 != null) {
                C40051tW.A05(this, c40061tX7.A00);
            }
            C40051tW.A05(this, list);
            A4E(c38321qM.A0C.getInjected());
            C84923qg A1W = A1W();
            if (A1W != null) {
                A1W.A01(this);
            }
            String str = c38321qM.A0R;
            if (str != null) {
                this.A0R = str;
            }
            this.A09 = null;
            this.A0K = null;
            this.A0L = null;
            this.A0E = null;
            this.A06 = c38321qM.A06;
            this.A07 = c38321qM.A07;
            this.A08 = c38321qM.A08;
            this.A0V = c38321qM.A0V;
            this.A0C.E6n();
            if (Systrace.A0E(1L)) {
                C0fO.A00(-319187830);
            }
        } catch (Throwable th) {
            if (Systrace.A0E(1L)) {
                C0fO.A00(-1274306438);
            }
            throw th;
        }
    }

    public final void A48(C84923qg c84923qg) {
        C40041tV c40041tV = this.A0d;
        c84923qg.A0B = String.valueOf(c40041tV.A06.A00.size());
        c40041tV.A06.A02(c84923qg);
        c40041tV.A01();
        c40041tV.A01();
        String str = c84923qg.A0F;
        if (str == null) {
            c40041tV.A0B.A02(c84923qg);
            return;
        }
        C84923qg A00 = C40051tW.A00(c40041tV.A05, str, false);
        if (A00 == null && (A00 = C40051tW.A00(c40041tV.A0B, c84923qg.A0F, false)) == null) {
            C0w9.A07("Couldn't find parent for new comment while associating with local parent.", new IllegalStateException(AnonymousClass001.A0R("Couldn't find parent ", c84923qg.A0F)));
            return;
        }
        A00.A0L = AbstractC001800i.A0T(c84923qg, A00.A0L);
        A00.A01++;
        String str2 = A00.A0F;
        if (str2 == null) {
            str2 = A00.A0G;
        }
        c84923qg.A0F = str2;
        c84923qg.A01(A00.A07);
        List list = A00.A0L;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (C14360o3.A0K(((C84923qg) it.next()).A0G, c84923qg.A0G)) {
                    return;
                }
            }
        }
        c84923qg.A0A = String.valueOf(A00.A0L.size());
        c84923qg.A0B = A00.A0B;
        A00.A0L = AbstractC001800i.A0T(c84923qg, A00.A0L);
    }

    public final void A49(C84923qg c84923qg, EnumC166477cG enumC166477cG, Integer num, String str, String str2, List list, List list2, int i, boolean z, boolean z2, boolean z3, boolean z4) {
        C14360o3.A0B(enumC166477cG, 10);
        this.A0C.ERm(Integer.valueOf(i));
        this.A0H = num;
        C40041tV c40041tV = this.A0d;
        c40041tV.A01();
        EnumC166477cG enumC166477cG2 = EnumC166477cG.A04;
        if (enumC166477cG == enumC166477cG2 || enumC166477cG == EnumC166477cG.A05) {
            c40041tV.A07 = str;
        }
        if (enumC166477cG == enumC166477cG2 || enumC166477cG == EnumC166477cG.A03) {
            c40041tV.A08 = str2;
        }
        C40061tX c40061tX = c40041tV.A02;
        if (c40061tX == null) {
            c40061tX = C40051tW.A01(c40041tV.A0B);
            c40041tV.A02 = c40061tX;
        }
        boolean z5 = true;
        if (enumC166477cG == EnumC166477cG.A03) {
            List list3 = c40061tX.A00;
            if (!list3.isEmpty()) {
                String str3 = ((C84923qg) list3.get(0)).A0G;
                int size = list.size();
                int i2 = 0;
                while (true) {
                    if (i2 >= size) {
                        break;
                    }
                    if (C14360o3.A0K(((C84923qg) list.get(i2)).A0G, str3)) {
                        list = list.subList(0, i2);
                        break;
                    }
                    i2++;
                }
            }
        }
        C40061tX c40061tX2 = c40041tV.A0A;
        if (!c40061tX2.A00.isEmpty() && list != null) {
            for (C84923qg c84923qg2 : list) {
                String str4 = c84923qg2.A0G;
                C14360o3.A0B(str4, 0);
                if (c40061tX2.A02.contains(str4)) {
                    c84923qg2.A06 = EnumC84933qh.A05;
                }
            }
        }
        if (enumC166477cG != enumC166477cG2 || (z2 && !z3)) {
            z5 = false;
        }
        C40051tW.A03(c40041tV.A05, enumC166477cG, this, list, z5);
        C40051tW.A03(c40041tV.A06, enumC166477cG, this, list2, z5);
        if (z4) {
            c40041tV.A09 = z4;
        }
        if (c84923qg != null) {
            c84923qg.A01(this);
        }
        c40041tV.A00 = c84923qg;
        A4R(z);
    }

    public final void A4C(EnumC77173d3 enumC77173d3) {
        InterfaceC38831rF interfaceC38831rF = this.A0C;
        boolean z = false;
        if (enumC77173d3 == EnumC77173d3.A02) {
            z = true;
        }
        interfaceC38831rF.EVT(Boolean.valueOf(z));
    }

    public final void A4D(InterfaceC39541sb interfaceC39541sb) {
        InterfaceC38831rF interfaceC38831rF = this.A0C;
        if (interfaceC39541sb != null) {
            interfaceC38831rF.EW9(interfaceC39541sb);
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public final void A4E(InterfaceC39541sb interfaceC39541sb) {
        if (interfaceC39541sb != null) {
            InterfaceC39541sb injected = this.A0C.getInjected();
            if (injected == null) {
                C0w9.A04("organic_media_updated_with_sponsored_info", AnonymousClass001.A0u("m_pk: ", getId(), " ad_id: ", interfaceC39541sb.AZE()), 1);
                this.A0C.EW9(interfaceC39541sb);
                return;
            }
            C87853vt AKj = injected.AKj();
            AKj.A0r = interfaceC39541sb.BKx();
            AKj.A0b = interfaceC39541sb.BA3();
            AKj.A13 = interfaceC39541sb.BDm();
            AKj.A0P = interfaceC39541sb.CSW();
            AKj.A0Q = interfaceC39541sb.CVu();
            AKj.A0Z = interfaceC39541sb.Bvw();
            AKj.A0i = interfaceC39541sb.AZR();
            if (interfaceC39541sb.Aa6() != null) {
                AKj.A0I = interfaceC39541sb.Aa6();
            }
            if (interfaceC39541sb.AaD() != null) {
                AKj.A0J = interfaceC39541sb.AaD();
            }
            if (interfaceC39541sb.AaF() != null) {
                AKj.A00 = interfaceC39541sb.AaF();
            }
            AKj.A0j = interfaceC39541sb.AaI();
            if (interfaceC39541sb.BFJ() != null) {
                AKj.A0H = interfaceC39541sb.BFJ();
            }
            if (interfaceC39541sb.BFK() != null) {
                AKj.A0K = interfaceC39541sb.BFK();
            }
            AKj.A10 = interfaceC39541sb.getCookies();
            AKj.A0L = interfaceC39541sb.Axd();
            AKj.A0N = interfaceC39541sb.Ayi();
            AKj.A0h = interfaceC39541sb.AZE();
            AKj.A0V = interfaceC39541sb.Caw();
            AKj.A07 = interfaceC39541sb.BeI();
            AKj.A0E = interfaceC39541sb.AZB();
            AKj.A0M = interfaceC39541sb.AyV();
            AKj.A0O = interfaceC39541sb.CQK();
            AKj.A0B = interfaceC39541sb.Atm();
            AKj.A0Y = interfaceC39541sb.Bvg();
            AKj.A0m = interfaceC39541sb.Asj();
            AKj.A11 = interfaceC39541sb.Ark();
            AKj.A0S = interfaceC39541sb.CYx();
            AKj.A0z = interfaceC39541sb.Ame();
            AKj.A01 = interfaceC39541sb.AjP();
            AKj.A0k = interfaceC39541sb.AcH();
            AKj.A0l = interfaceC39541sb.AkD();
            AKj.A0f = interfaceC39541sb.AYx();
            AKj.A0x = interfaceC39541sb.Baz();
            AKj.A0F = interfaceC39541sb.BJK();
            if (interfaceC39541sb.CAR() != null) {
                AKj.A0y = interfaceC39541sb.CAR();
            }
            if (interfaceC39541sb.Au0() != null) {
                AKj.A05 = interfaceC39541sb.Au0();
            }
            if (interfaceC39541sb.Ann() != null) {
                AKj.A06 = interfaceC39541sb.Ann();
            }
            if (interfaceC39541sb.Atv() != null) {
                AKj.A02 = interfaceC39541sb.Atv();
            }
            if (interfaceC39541sb.BiD() != null) {
                AKj.A08 = interfaceC39541sb.BiD();
            }
            if (interfaceC39541sb.Au1() != null) {
                AKj.A03 = interfaceC39541sb.Au1();
            }
            if (interfaceC39541sb.CXw() != null) {
                AKj.A0R = interfaceC39541sb.CXw();
            }
            if (interfaceC39541sb.CaE() != null) {
                AKj.A0U = interfaceC39541sb.CaE();
            }
            if (interfaceC39541sb.CaD() != null) {
                AKj.A0T = interfaceC39541sb.CaD();
            }
            AKj.A0d = interfaceC39541sb.BH5();
            this.A0C.EW9(AKj.A01());
        }
    }

    public final void A4F(C1EN c1en) {
        this.A0D = c1en;
        this.A0J = C05F.A00;
        List A3c = A3c();
        if (A3c != null) {
            Iterator it = A3c.iterator();
            while (it.hasNext()) {
                ((C38321qM) it.next()).A4F(c1en);
            }
        }
    }

    public final void A4G(EnumC73363Qm enumC73363Qm) {
        List AmB;
        List list = this.A0e;
        list.remove(enumC73363Qm);
        list.add(enumC73363Qm);
        if (A5O() && (AmB = this.A0C.AmB()) != null) {
            Iterator it = AmB.iterator();
            while (it.hasNext()) {
                ((C38321qM) it.next()).A4G(enumC73363Qm);
            }
        }
    }

    public final void A4H(EnumC76753cN enumC76753cN) {
        this.A0C.EVf(Integer.valueOf(enumC76753cN.A00));
    }

    public final void A4I(EnumC40111tc enumC40111tc) {
        this.A0C.EZ0(Integer.valueOf(enumC40111tc.A00));
    }

    public final void A4L(Integer num) {
        int i;
        InterfaceC38831rF interfaceC38831rF = this.A0C;
        switch (num.intValue()) {
            case 0:
                i = -1;
                break;
            case 1:
                i = 0;
                break;
            default:
                i = 1;
                break;
        }
        interfaceC38831rF.ETC(Integer.valueOf(i));
    }

    public final void A4M(Long l) {
        this.A0C.EWz(l);
        List A3c = A3c();
        if (A3c != null) {
            Iterator it = A3c.iterator();
            while (it.hasNext()) {
                ((C38321qM) it.next()).A4M(l);
            }
        }
    }

    public final void A4P(String str) {
        this.A0C.EVu(str);
        A44(null);
    }

    public final void A4Q(List list) {
        C84353pS c84353pS;
        InterfaceC38831rF interfaceC38831rF = this.A0C;
        if (list == null) {
            c84353pS = null;
        } else {
            boolean z = false;
            int i = 6;
            new C1DY(new C37761pD(null), i, z);
            new C1DY(new C37761pD(null), i, z);
            C1DY c1dy = new C1DY(new C37761pD(null), i, z);
            ArrayList arrayList = new ArrayList(AbstractC06950Ym.A1E(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((InterfaceC103524lS) it.next()).EwL(c1dy));
            }
            c84353pS = new C84353pS(arrayList);
        }
        interfaceC38831rF.EYv(c84353pS);
    }

    public final void A4R(boolean z) {
        this.A0C.ERp(Boolean.valueOf(z));
    }

    public final boolean A4T() {
        return C14360o3.A0K(this.A0C.CFV(), true);
    }

    public final boolean A4U() {
        Boolean AlI = this.A0C.AlI();
        if (AlI == null || !AlI.booleanValue() || A1y() == C3YU.A04) {
            return false;
        }
        return true;
    }

    public final boolean A4V() {
        return C14360o3.A0K(this.A0C.Akp(), true);
    }

    public final boolean A4W() {
        InterfaceC39031rc B99 = this.A0C.B99();
        if (B99 != null && B99.getFundraiserId() != null && C14360o3.A0K(B99.AlG(), true)) {
            return true;
        }
        return false;
    }

    public final boolean A4X() {
        Boolean AlH = this.A0C.AlH();
        if (AlH != null) {
            return AlH.booleanValue();
        }
        return false;
    }

    public final boolean A4Y() {
        return C14360o3.A0K(this.A0C.Axw(), true);
    }

    public final boolean A4Z() {
        Boolean BBQ = this.A0C.BBQ();
        if (BBQ != null) {
            return BBQ.booleanValue();
        }
        return false;
    }

    public final boolean A4a() {
        Boolean BD0 = this.A0C.BD0();
        if (BD0 != null) {
            return BD0.booleanValue();
        }
        return false;
    }

    public final boolean A4b() {
        OpenCarouselSubmissionState BZ5 = this.A0C.BZ5();
        if (BZ5 == null) {
            return false;
        }
        if (BZ5 != OpenCarouselSubmissionState.A05 && BZ5 != OpenCarouselSubmissionState.A06) {
            return false;
        }
        return true;
    }

    public final boolean A4c() {
        return C14360o3.A0K(this.A0C.B1Z(), true);
    }

    public final boolean A4d() {
        return C14360o3.A0K(this.A0C.BUu(), true);
    }

    public final boolean A4e() {
        InterfaceC102194ip interfaceC102194ip;
        List sponsorTags = this.A0C.getSponsorTags();
        if (sponsorTags != null && (interfaceC102194ip = (InterfaceC102194ip) AbstractC001800i.A0J(sponsorTags)) != null) {
            return C14360o3.A0K(interfaceC102194ip.BcT(), true);
        }
        return false;
    }

    public final boolean A4f() {
        Boolean C1c = this.A0C.C1c();
        if (C1c != null) {
            return C1c.booleanValue();
        }
        return false;
    }

    public final boolean A4g() {
        Boolean BB7 = this.A0C.BB7();
        if (BB7 != null) {
            return BB7.booleanValue();
        }
        return true;
    }

    public final boolean A4h() {
        if (this.A0C.getBoostedStatus() != null) {
            if (AbstractC37479Gex.A00(this.A0C.getBoostedStatus()) == EnumC39597He7.A0A || AbstractC37479Gex.A00(this.A0C.getBoostedStatus()) == EnumC39597He7.A02 || AbstractC37479Gex.A00(this.A0C.getBoostedStatus()) == EnumC39597He7.A03 || AbstractC37479Gex.A00(this.A0C.getBoostedStatus()) == EnumC39597He7.A06 || AbstractC37479Gex.A00(this.A0C.getBoostedStatus()) == EnumC39597He7.A05 || AbstractC37479Gex.A00(this.A0C.getBoostedStatus()) == EnumC39597He7.A08 || AbstractC37479Gex.A00(this.A0C.getBoostedStatus()) == EnumC39597He7.A09) {
                return true;
            }
            return false;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000d, code lost:
    
        if (r1 != false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A4j() {
        /*
            r2 = this;
            X.1rF r0 = r2.A0C
            java.util.List r0 = r0.getCoauthorProducers()
            if (r0 == 0) goto Lf
            boolean r1 = r0.isEmpty()
            r0 = 0
            if (r1 == 0) goto L10
        Lf:
            r0 = 1
        L10:
            r0 = r0 ^ 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C38321qM.A4j():boolean");
    }

    public final boolean A4k() {
        return C14360o3.A0K(this.A0C.Apn(), true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0013, code lost:
    
        if (r1 != false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A4l() {
        /*
            r2 = this;
            X.1rF r0 = r2.A0C
            com.instagram.feed.media.CreativeConfigIntf r0 = r0.Asm()
            if (r0 == 0) goto L15
            java.util.List r0 = r0.B0S()
            if (r0 == 0) goto L15
            boolean r1 = r0.isEmpty()
            r0 = 0
            if (r1 == 0) goto L16
        L15:
            r0 = 1
        L16:
            r0 = r0 ^ 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C38321qM.A4l():boolean");
    }

    public final boolean A4m() {
        C38321qM c38321qM;
        List AmB = this.A0C.AmB();
        if (AmB != null && (c38321qM = (C38321qM) AbstractC001800i.A0O(AmB, 0)) != null && c38321qM.A5a()) {
            return true;
        }
        return false;
    }

    public final boolean A4n() {
        InterfaceC104804nl Aso = this.A0C.Aso();
        if (Aso != null && Aso.Bx7() != null) {
            return true;
        }
        return false;
    }

    public final boolean A4o() {
        InterfaceC39031rc B99 = this.A0C.B99();
        if (B99 != null && B99.getFundraiserId() != null) {
            return true;
        }
        return false;
    }

    public final boolean A4p() {
        InterfaceC39031rc B99 = this.A0C.B99();
        if (B99 != null && B99.getFundraiserId() != null && B99.B9C() == FundraiserCampaignTypeEnum.A0C) {
            return true;
        }
        return false;
    }

    public final boolean A4r() {
        if (this.A0C.BAR() == null) {
            return false;
        }
        return true;
    }

    public final boolean A4t() {
        return C14360o3.A0K(this.A0C.BBq(), true);
    }

    public final boolean A4v() {
        List AZh;
        InterfaceC107774tM BEB = this.A0C.BEB();
        if (BEB == null || (AZh = BEB.AZh()) == null || !(!AZh.isEmpty())) {
            return false;
        }
        return true;
    }

    public final boolean A4w() {
        android.net.Uri uri = this.A05;
        if (uri != null && new File(uri.getPath()).exists()) {
            return true;
        }
        return false;
    }

    public final boolean A4x() {
        String id;
        String str;
        if (this.A0M == null && (id = getId()) != null) {
            try {
                str = (String) C1Q3.A02.get(id);
            } catch (Exception e) {
                EnumC12410kj enumC12410kj = EnumC12410kj.A03;
                String message = e.getMessage();
                if (message == null) {
                    message = "null";
                }
                C0w9.A02(enumC12410kj, "VideoOutputLocalFileUtil::getRenderedVideoFilePathFromMediaId", message, e);
                C0K8.A0G("VideoOutputLocalFileUtil", "error in file search.", e);
                str = null;
            }
            this.A0M = str;
        }
        if (this.A0M == null) {
            return false;
        }
        return true;
    }

    public final boolean A51() {
        List CIr;
        InterfaceC84523py CEF = this.A0C.CEF();
        if (CEF == null || (CIr = CEF.CIr()) == null || !(!CIr.isEmpty())) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000d, code lost:
    
        if (r1 != false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A52() {
        /*
            r2 = this;
            X.1rF r0 = r2.A0C
            java.util.List r0 = r0.Ab8()
            if (r0 == 0) goto Lf
            boolean r1 = r0.isEmpty()
            r0 = 0
            if (r1 == 0) goto L10
        Lf:
            r0 = 1
        L10:
            r0 = r0 ^ 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C38321qM.A52():boolean");
    }

    public final boolean A56() {
        Integer BCf = this.A0C.BCf();
        if (BCf != null) {
            int intValue = BCf.intValue();
            SparseArray sparseArray = EnumC68141VDe.A01;
            EnumC68141VDe enumC68141VDe = EnumC68141VDe.A04;
            Object obj = sparseArray.get(intValue, enumC68141VDe);
            C14360o3.A07(obj);
            if (obj != enumC68141VDe) {
                return true;
            }
        }
        return false;
    }

    public final boolean A57() {
        InterfaceC39681sr BuT = this.A0C.BuT();
        if (BuT != null && BuT.getShouldHaveSharingFriction() && !TextUtils.isEmpty(BuT.AgQ())) {
            return true;
        }
        return false;
    }

    public final boolean A58() {
        InterfaceC102194ip interfaceC102194ip;
        List sponsorTags = this.A0C.getSponsorTags();
        if (sponsorTags != null && (interfaceC102194ip = (InterfaceC102194ip) AbstractC001800i.A0J(sponsorTags)) != null && interfaceC102194ip.BzF() != null) {
            return true;
        }
        return false;
    }

    public final boolean A5A() {
        if (this.A0C.getVideoSubtitlesUri() == null) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000d, code lost:
    
        if (r1 != false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A5B() {
        /*
            r2 = this;
            X.1rF r0 = r2.A0C
            java.util.List r0 = r0.CFe()
            if (r0 == 0) goto Lf
            boolean r1 = r0.isEmpty()
            r0 = 0
            if (r1 == 0) goto L10
        Lf:
            r0 = 1
        L10:
            r0 = r0 ^ 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C38321qM.A5B():boolean");
    }

    public final boolean A5C() {
        Object obj;
        String productType = this.A0C.getProductType();
        if (productType != null) {
            obj = ProductType.A01.get(productType);
        } else {
            obj = null;
        }
        if (obj != ProductType.AR_EFFECT_PREVIEW) {
            return false;
        }
        return true;
    }

    public final boolean A5D() {
        Boolean CPU = this.A0C.CPU();
        if (CPU != null) {
            return CPU.booleanValue();
        }
        return false;
    }

    public final boolean A5G() {
        InterfaceC114655Fv BYz = this.A0C.BYz();
        if (BYz != null) {
            return C14360o3.A0K(BYz.BCb(), true);
        }
        return false;
    }

    public final boolean A5L() {
        return C14360o3.A0K(this.A0C.Alo(), true);
    }

    public final boolean A5N() {
        if (this.A0C.AmI() == null) {
            return false;
        }
        return true;
    }

    public final boolean A5P() {
        Object obj;
        String productType = this.A0C.getProductType();
        if (productType != null) {
            obj = ProductType.A01.get(productType);
        } else {
            obj = null;
        }
        if (obj != ProductType.CLIPS) {
            return false;
        }
        return true;
    }

    public final boolean A5S() {
        Boolean CTF = this.A0C.CTF();
        if (CTF != null) {
            return CTF.booleanValue();
        }
        return false;
    }

    public final boolean A5T() {
        if (this.A0C.BmO() == null) {
            return false;
        }
        return true;
    }

    public final boolean A5W() {
        Object obj;
        Integer BCe = this.A0C.BCe();
        if (BCe != null) {
            obj = EnumC76753cN.A01.get(BCe.intValue(), EnumC76753cN.A04);
            C14360o3.A07(obj);
        } else {
            obj = null;
        }
        if (obj != EnumC76753cN.A06 && obj != EnumC76753cN.A05) {
            return false;
        }
        return true;
    }

    public final boolean A5X() {
        if (C1AD.A06(C06090Tz.A05, 18301585792700267L)) {
            if (A20() != EnumC75663aX.A04) {
                return true;
            }
            return false;
        }
        if (A1x() == EnumC76383bi.A07) {
            return true;
        }
        return false;
    }

    public final boolean A5Y() {
        return C14360o3.A0K(this.A0C.CUW(), true);
    }

    public final boolean A5Z() {
        Object obj;
        String productType = this.A0C.getProductType();
        if (productType != null) {
            obj = ProductType.A01.get(productType);
        } else {
            obj = null;
        }
        if (obj != ProductType.FEED_CAROUSEL) {
            return false;
        }
        return true;
    }

    public final boolean A5a() {
        if (this.A0C.B5y() == null) {
            return false;
        }
        return true;
    }

    public final boolean A5b() {
        Object obj;
        String productType = this.A0C.getProductType();
        if (productType != null) {
            obj = ProductType.A01.get(productType);
        } else {
            obj = null;
        }
        if (obj != ProductType.FEED) {
            return false;
        }
        return true;
    }

    public final boolean A5e() {
        InterfaceC39541sb injected = this.A0C.getInjected();
        if (injected != null) {
            return C14360o3.A0K(injected.CV6(), true);
        }
        return false;
    }

    public final boolean A5f() {
        String str;
        IgShowreelComposition Bx8 = this.A0C.Bx8();
        if (Bx8 != null) {
            str = Bx8.C5i();
        } else {
            str = null;
        }
        return C14360o3.A0K(str, "showreel_bloks_frida_layout_component");
    }

    public final boolean A5g() {
        Object obj;
        String productType = this.A0C.getProductType();
        if (productType != null) {
            obj = ProductType.A01.get(productType);
        } else {
            obj = null;
        }
        if (obj != ProductType.IGTV) {
            return false;
        }
        return true;
    }

    public final boolean A5h() {
        Boolean BG2 = this.A0C.BG2();
        if (BG2 != null) {
            return BG2.booleanValue();
        }
        return false;
    }

    public final boolean A5j() {
        Boolean CWy = this.A0C.CWy();
        if (CWy != null) {
            return CWy.booleanValue();
        }
        return false;
    }

    public final boolean A5k() {
        return C14360o3.A0K(this.A0C.BNB(), true);
    }

    public final boolean A5l() {
        if (this.A0C.BC1() != null && C14360o3.A0K(this.A0C.BC1(), true)) {
            return true;
        }
        return false;
    }

    public final boolean A5m() {
        Boolean CXw;
        InterfaceC39541sb injected = this.A0C.getInjected();
        if (injected != null && (CXw = injected.CXw()) != null && CXw.booleanValue()) {
            return true;
        }
        return false;
    }

    public final boolean A5n() {
        InterfaceC109094vY BRN = this.A0C.BRN();
        if (BRN != null && BFB.A04(BRN)) {
            return true;
        }
        InterfaceC109094vY BRN2 = this.A0C.BRN();
        if (BRN2 != null && BFB.A03(BRN2) == C05F.A0N) {
            return true;
        }
        return false;
    }

    public final boolean A5o() {
        InterfaceC39031rc B99 = this.A0C.B99();
        if (B99 != null && B99.getFundraiserId() != null && C14360o3.A0K(B99.CYG(), true)) {
            return true;
        }
        return false;
    }

    public final boolean A5q() {
        List BE4 = this.A0C.BE4();
        if (BE4 != null) {
            for (Object obj : BE4) {
                if (!AbstractC002300n.A0h((String) obj, "myWeek", false)) {
                    if (obj != null) {
                        return true;
                    }
                    return false;
                }
            }
            return false;
        }
        return false;
    }

    public final boolean A5r() {
        return C14360o3.A0K(this.A0C.CZp(), true);
    }

    public final boolean A5t() {
        Boolean Ca1 = this.A0C.Ca1();
        if (Ca1 != null) {
            return Ca1.booleanValue();
        }
        return false;
    }

    public final boolean A5v() {
        Boolean CaD;
        InterfaceC39541sb injected = this.A0C.getInjected();
        if (injected != null && (CaD = injected.CaD()) != null && CaD.booleanValue()) {
            return true;
        }
        return false;
    }

    public final boolean A5w() {
        Boolean CaE;
        InterfaceC39541sb injected = this.A0C.getInjected();
        if (injected != null && (CaE = injected.CaE()) != null && CaE.booleanValue()) {
            return true;
        }
        return false;
    }

    public final boolean A5y() {
        ReplyControlStr replyControlStr;
        InterfaceC99334d2 C6Y = this.A0C.C6Y();
        if (C6Y != null) {
            replyControlStr = C6Y.BnB();
        } else {
            replyControlStr = null;
        }
        if (replyControlStr == ReplyControlStr.A07 && A1x() == EnumC76383bi.A0E) {
            return true;
        }
        return false;
    }

    public final boolean A5z() {
        Boolean Bhl = this.A0C.Bhl();
        if (Bhl != null) {
            return Bhl.booleanValue();
        }
        return false;
    }

    public final boolean A60() {
        String profilePicId;
        User CDj = this.A0C.CDj();
        if (CDj != null && (profilePicId = CDj.A03.getProfilePicId()) != null && C14360o3.A0K(getId(), profilePicId)) {
            return true;
        }
        return false;
    }

    public final boolean A61() {
        if (this.A0C.BZb() == null) {
            return false;
        }
        return true;
    }

    public final boolean A62() {
        return C14360o3.A0K(this.A0C.CbS(), true);
    }

    public final boolean A63() {
        return C14360o3.A0K(this.A0C.Cbg(), true);
    }

    public final boolean A64() {
        MediaReminder BmO = this.A0C.BmO();
        if (BmO != null) {
            return C14360o3.A0K(BmO.Cbn(), true);
        }
        return false;
    }

    public final boolean A65() {
        return C14360o3.A0K(this.A0C.Cc6(), true);
    }

    public final boolean A66() {
        return C14360o3.A0K(this.A0C.Ccb(), true);
    }

    public final boolean A67() {
        Boolean Ccp = this.A0C.Ccp();
        if (Ccp != null) {
            return Ccp.booleanValue();
        }
        return false;
    }

    public final boolean A68() {
        return C14360o3.A0K(this.A0C.Bu7(), true);
    }

    public final boolean A6A() {
        C3x9 clipsMetadata = this.A0C.getClipsMetadata();
        if (clipsMetadata != null) {
            return C14360o3.A0K(clipsMetadata.Cd0(), true);
        }
        return false;
    }

    public final boolean A6C() {
        Boolean CWJ = this.A0C.CWJ();
        if (CWJ != null) {
            return CWJ.booleanValue();
        }
        return false;
    }

    public final boolean A6D() {
        if (this.A0C.Bx8() == null) {
            return false;
        }
        return true;
    }

    public final boolean A6E() {
        if (this.A0C.Bx7() == null) {
            return false;
        }
        return true;
    }

    public final boolean A6F() {
        Object obj;
        String productType = this.A0C.getProductType();
        if (productType != null) {
            obj = ProductType.A01.get(productType);
        } else {
            obj = null;
        }
        if (obj != ProductType.STORY) {
            return false;
        }
        return true;
    }

    public final boolean A6G() {
        StoryPromptType storyPromptType;
        List C1y = this.A0C.C1y();
        if (C1y != null) {
            if ((C1y instanceof Collection) && C1y.isEmpty()) {
                return false;
            }
            Iterator it = C1y.iterator();
            while (it.hasNext()) {
                StoryPromptTappableDataIntf Bii = ((InterfaceC109364wL) it.next()).Bii();
                if (Bii != null) {
                    storyPromptType = Bii.Bio();
                } else {
                    storyPromptType = null;
                }
                if (storyPromptType == StoryPromptType.A0G) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public final boolean A6H() {
        return C14360o3.A0K(this.A0C.CQR(), true);
    }

    public final boolean A6J() {
        InterfaceC110214xq C5g;
        List BsT;
        InterfaceC110214xq C5g2;
        C3x9 clipsMetadata = this.A0C.getClipsMetadata();
        List list = null;
        if (clipsMetadata != null && (C5g2 = clipsMetadata.C5g()) != null) {
            list = C5g2.BsT();
        }
        if (list == null || list.isEmpty()) {
            JMR ArZ = this.A0C.ArZ();
            if (ArZ == null || (C5g = ArZ.C5g()) == null || (BsT = C5g.BsT()) == null || BsT.isEmpty()) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final boolean A6K() {
        String str;
        IgShowreelNativeAnimationIntf Bx7 = this.A0C.Bx7();
        if (Bx7 != null) {
            str = Bx7.C5i();
        } else {
            str = null;
        }
        return C14360o3.A0K(str, "glados_tesla_1");
    }

    public final boolean A6M() {
        InterfaceC39541sb injected = this.A0C.getInjected();
        if (injected != null) {
            return C14360o3.A0K(injected.BMh(), true);
        }
        return false;
    }

    public final boolean A6N() {
        return C14360o3.A0K(this.A0C.Agj(), true);
    }

    public final boolean A6O() {
        InterfaceC39541sb injected = this.A0C.getInjected();
        if (injected != null) {
            return C14360o3.A0K(injected.BMl(), true);
        }
        return false;
    }

    public final boolean A6P() {
        if (this.A0C.BZ5() != OpenCarouselSubmissionState.A07 && this.A0C.BZ5() != OpenCarouselSubmissionState.A09 && this.A0C.BZ5() != OpenCarouselSubmissionState.A06) {
            return false;
        }
        return true;
    }

    public final boolean A6Q() {
        if (this.A0C.AdE() != null && C14360o3.A0K(this.A0C.Cbz(), true)) {
            return true;
        }
        return false;
    }

    public final boolean A6R() {
        Boolean BwC = this.A0C.BwC();
        if (BwC != null) {
            return BwC.booleanValue();
        }
        return false;
    }

    public final boolean A6S() {
        InterfaceC39541sb injected = this.A0C.getInjected();
        if (injected != null) {
            return C14360o3.A0K(injected.Bwg(), true);
        }
        return false;
    }

    public final boolean A6T() {
        InterfaceC109094vY BRN;
        InterfaceC109094vY BRN2 = this.A0C.BRN();
        if (BRN2 == null) {
            return false;
        }
        Integer A03 = BFB.A03(BRN2);
        if (A03 != C05F.A00 && A03 != C05F.A0C && ((BRN = this.A0C.BRN()) == null || BFB.A02(BRN) == null)) {
            return false;
        }
        return true;
    }

    public final boolean A6U() {
        WearablesAppAttributionType wearablesAppAttributionType;
        java.util.Set A0K = AbstractC009903n.A0K(new WearablesAppAttributionType[]{WearablesAppAttributionType.A0A, WearablesAppAttributionType.A05, WearablesAppAttributionType.A04});
        InterfaceC43580JMo CHL = this.A0C.CHL();
        if (CHL != null) {
            wearablesAppAttributionType = CHL.AdN();
        } else {
            wearablesAppAttributionType = null;
        }
        return AbstractC001800i.A0u(A0K, wearablesAppAttributionType);
    }

    public final boolean A6W(IGPostTriggerExperience iGPostTriggerExperience) {
        List Bf8;
        InterfaceC39541sb injected = this.A0C.getInjected();
        if (injected != null && (Bf8 = injected.Bf8()) != null && Bf8.contains(iGPostTriggerExperience)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0078, code lost:
    
        if (X.AbstractC001800i.A0u(r1, r0) == false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0034, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, r5, 36316645727408701L) != false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0036, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:?, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0026, code lost:
    
        if (r1 == com.instagram.api.schemas.WearablesAppAttributionType.A06) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A6g(com.instagram.common.session.UserSession r5) {
        /*
            r4 = this;
            X.1rF r0 = r4.A0C
            com.instagram.feed.media.CreativeConfigIntf r0 = r0.Asm()
            if (r0 == 0) goto L18
            java.util.List r1 = r0.Asl()
            if (r1 == 0) goto L18
            boolean r0 = r1 instanceof java.util.Collection
            if (r0 == 0) goto L3a
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L3a
        L18:
            X.1rF r0 = r4.A0C
            X.JMo r0 = r0.CHL()
            if (r0 == 0) goto L38
            com.instagram.api.schemas.WearablesAppAttributionType r1 = r0.AdN()
        L24:
            com.instagram.api.schemas.WearablesAppAttributionType r0 = com.instagram.api.schemas.WearablesAppAttributionType.A06
            if (r1 != r0) goto L36
        L28:
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36316645727408701(0x8105cc0004123d, double:3.030131221183382E-306)
            boolean r1 = X.C18U.A06(r2, r5, r0)
            r0 = 1
            if (r1 != 0) goto L37
        L36:
            r0 = 0
        L37:
            return r0
        L38:
            r1 = 0
            goto L24
        L3a:
            java.util.Iterator r2 = r1.iterator()
        L3e:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L18
            java.lang.Object r0 = r2.next()
            com.instagram.feed.media.CameraToolInfoIntf r0 = (com.instagram.feed.media.CameraToolInfoIntf) r0
            com.instagram.api.schemas.CameraTool r0 = r0.Ak6()
            java.lang.String r1 = r0.A00
            java.lang.String r0 = "43"
            boolean r0 = X.C14360o3.A0K(r1, r0)
            if (r0 == 0) goto L3e
            com.instagram.api.schemas.WearablesAppAttributionType r3 = com.instagram.api.schemas.WearablesAppAttributionType.A09
            com.instagram.api.schemas.WearablesAppAttributionType r2 = com.instagram.api.schemas.WearablesAppAttributionType.A07
            com.instagram.api.schemas.WearablesAppAttributionType r1 = com.instagram.api.schemas.WearablesAppAttributionType.A08
            com.instagram.api.schemas.WearablesAppAttributionType r0 = com.instagram.api.schemas.WearablesAppAttributionType.A0C
            com.instagram.api.schemas.WearablesAppAttributionType[] r0 = new com.instagram.api.schemas.WearablesAppAttributionType[]{r3, r2, r1, r0}
            java.util.Set r1 = X.AbstractC009903n.A0K(r0)
            X.1rF r0 = r4.A0C
            X.JMo r0 = r0.CHL()
            if (r0 == 0) goto L7b
            com.instagram.api.schemas.WearablesAppAttributionType r0 = r0.AdN()
        L74:
            boolean r0 = X.AbstractC001800i.A0u(r1, r0)
            if (r0 != 0) goto L18
            goto L28
        L7b:
            r0 = 0
            goto L74
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C38321qM.A6g(com.instagram.common.session.UserSession):boolean");
    }

    public final boolean A6h(UserSession userSession) {
        WearablesAppAttributionType wearablesAppAttributionType;
        InterfaceC43580JMo CHL;
        java.util.Set A0K = AbstractC009903n.A0K(new WearablesAppAttributionType[]{WearablesAppAttributionType.A07, WearablesAppAttributionType.A08});
        InterfaceC43580JMo CHL2 = this.A0C.CHL();
        if (CHL2 != null) {
            wearablesAppAttributionType = CHL2.AdN();
        } else {
            wearablesAppAttributionType = null;
        }
        if (AbstractC001800i.A0u(A0K, wearablesAppAttributionType) && C18U.A06(C06090Tz.A05, userSession, 36316645728784972L) && (CHL = this.A0C.CHL()) != null && CHL.getIconicHorizonWorldDeeplink() != null) {
            return true;
        }
        return false;
    }

    public final boolean A6i(UserSession userSession) {
        if (C14360o3.A0K(this.A0C.Bwv(), true) && C18U.A06(C06090Tz.A05, userSession, 36327151217162561L)) {
            return true;
        }
        return false;
    }

    public final boolean A6j(UserSession userSession) {
        WearablesAppAttributionType wearablesAppAttributionType;
        CreativeConfigIntf Asm;
        List Asl;
        InterfaceC43580JMo CHL = this.A0C.CHL();
        if (CHL != null) {
            wearablesAppAttributionType = CHL.AdN();
        } else {
            wearablesAppAttributionType = null;
        }
        if (wearablesAppAttributionType != WearablesAppAttributionType.A09) {
            if (this.A0C.CHL() != null && (Asm = this.A0C.Asm()) != null && (Asl = Asm.Asl()) != null && (!(Asl instanceof Collection) || !Asl.isEmpty())) {
                Iterator it = Asl.iterator();
                while (it.hasNext()) {
                    if (C14360o3.A0K(((CameraToolInfoIntf) it.next()).Ak6().A00, "65")) {
                    }
                }
            }
            return false;
        }
        if (!C18U.A06(C06090Tz.A05, userSession, 36316645728195141L)) {
            return false;
        }
        return true;
    }

    public final boolean A6k(UserSession userSession) {
        WearablesAppAttributionType wearablesAppAttributionType;
        java.util.Set A0K = AbstractC009903n.A0K(new WearablesAppAttributionType[]{WearablesAppAttributionType.A0C, WearablesAppAttributionType.A08});
        InterfaceC43580JMo CHL = this.A0C.CHL();
        if (CHL != null) {
            wearablesAppAttributionType = CHL.AdN();
        } else {
            wearablesAppAttributionType = null;
        }
        if (AbstractC001800i.A0u(A0K, wearablesAppAttributionType) && C18U.A06(C06090Tz.A05, userSession, 36328989463166893L)) {
            return true;
        }
        return false;
    }

    public final String[] A6p() {
        List sponsorTags = this.A0C.getSponsorTags();
        if (A58() && sponsorTags != null) {
            ArrayList arrayList = new ArrayList(AbstractC06950Ym.A1E(sponsorTags, 10));
            Iterator it = sponsorTags.iterator();
            while (it.hasNext()) {
                arrayList.add(((InterfaceC102194ip) it.next()).BzF().getId());
            }
            return (String[]) arrayList.toArray(new String[0]);
        }
        return new String[0];
    }

    @Override // X.InterfaceC38401qU
    public final void AHs() {
        InterfaceC109094vY interfaceC109094vY;
        InterfaceC38831rF interfaceC38831rF = this.A0C;
        InterfaceC109094vY BRN = interfaceC38831rF.BRN();
        if (BRN != null) {
            C69728VuN AKQ = BRN.AKQ();
            AKQ.A07 = 0;
            interfaceC109094vY = AKQ.A01();
        } else {
            interfaceC109094vY = null;
        }
        interfaceC38831rF.EYy(interfaceC109094vY);
    }

    @Override // X.InterfaceC38381qS
    public final C1XV B5n() {
        List BEL = this.A0C.BEL();
        if (BEL != null && !BEL.isEmpty()) {
            return C1XV.A0l;
        }
        return C1XV.A0Y;
    }

    @Override // X.InterfaceC38381qS
    public final Integer BA3() {
        InterfaceC39541sb injected = this.A0C.getInjected();
        if (injected != null) {
            return injected.BA3();
        }
        return null;
    }

    @Override // X.InterfaceC38381qS
    public final InterfaceC39571se BK1() {
        return this.A0C.BJz();
    }

    @Override // X.InterfaceC38401qU
    public final InterfaceC109094vY BRN() {
        return this.A0C.BRN();
    }

    @Override // X.InterfaceC38411qV
    public final EnumC40111tc BRp() {
        EnumC40111tc A00;
        Integer BRq = this.A0C.BRq();
        if (BRq == null || (A00 = AbstractC40091ta.A00(Integer.valueOf(BRq.intValue()))) == null) {
            if (this.A0C.AmB() != null) {
                return EnumC40111tc.A09;
            }
            return EnumC40111tc.A0Q;
        }
        return A00;
    }

    @Override // X.InterfaceC38401qU
    public final String BU6() {
        return this.A0C.getPreview();
    }

    @Override // X.InterfaceC38391qT
    public final EnumC77213d7 BqJ() {
        Boolean BCz = this.A0C.BCz();
        if (BCz != null && BCz.booleanValue()) {
            return EnumC77213d7.A04;
        }
        return EnumC77213d7.A03;
    }

    @Override // X.InterfaceC38391qT
    public final Integer BqO() {
        return C05F.A00;
    }

    /* JADX WARN: Code restructure failed: missing block: B:65:0x0122, code lost:
    
        if (r23 <= 0) goto L66;
     */
    @Override // X.InterfaceC38421qW
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C75363a3 CFR() {
        /*
            Method dump skipped, instructions count: 743
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C38321qM.CFR():X.3a3");
    }

    @Override // X.InterfaceC38381qS
    public final Integer CFr() {
        return this.A0C.CFr();
    }

    @Override // X.C1NI
    public final boolean CW9() {
        if (this.A0C.BHD() == null) {
            return false;
        }
        return true;
    }

    @Override // X.C1NI
    public final boolean CZq() {
        if (this.A0C.getOrganicTrackingToken() == null) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC38391qT
    public final boolean CcN() {
        EnumC77213d7 enumC77213d7;
        Boolean BCz = this.A0C.BCz();
        if (BCz != null) {
            if (BCz.booleanValue()) {
                enumC77213d7 = EnumC77213d7.A04;
            } else {
                enumC77213d7 = EnumC77213d7.A03;
            }
        } else {
            enumC77213d7 = null;
        }
        if (enumC77213d7 != EnumC77213d7.A04) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC38371qR, X.C1NI
    public final boolean CdW() {
        if (this.A0C.getInjected() == null) {
            return false;
        }
        return true;
    }

    @Override // X.C17L
    public final TreeUpdaterJNI F7o() {
        return this.A0C.F7o();
    }

    @Override // X.InterfaceC38371qR, X.C1NI, X.InterfaceC38381qS, X.InterfaceC38411qV
    public final String getId() {
        String id = this.A0C.getId();
        if (id == null) {
            return this.A0C.getStrongId();
        }
        return id;
    }

    private final ExtendedImageUrl A01() {
        ExtendedImageUrl A1n;
        if (A5P() && (A1n = A1n()) != null) {
            String str = A1n.A0A;
            C14360o3.A07(str);
            return new ExtendedImageUrl(str, A1n.getWidth(), A1n.getHeight());
        }
        return null;
    }

    public final float A0m() {
        StringBuilder sb;
        C38321qM A1d;
        String id;
        C38321qM A1d2;
        if (A5Q() && (A1d2 = A1d()) != this) {
            return A1d2.A0m();
        }
        if (A0y() > 0 && A0z() > 0) {
            return A0z() / A0y();
        }
        ImageInfo A1t = A1t();
        if (A1t != null) {
            return AbstractC40161tk.A00(A1t);
        }
        String A0R = AnonymousClass001.A0R("Null Image Info when calculating aspect ratio: Media Id: ", getId());
        if (A5M() && A1e(0) != null) {
            sb = new StringBuilder();
            sb.append(A0R);
            sb.append(" | Carousel Media Id: ");
            A1d = A1e(0);
            if (A1d == null) {
                id = null;
                sb.append(id);
                A0R = sb.toString();
                C0w9.A03("MediaImageInfo", A0R);
                return 1.0f;
            }
        } else {
            if (A5Q()) {
                sb = new StringBuilder();
                sb.append(A0R);
                sb.append(" | Collection Media Id: ");
                A1d = A1d();
            }
            C0w9.A03("MediaImageInfo", A0R);
            return 1.0f;
        }
        id = A1d.getId();
        sb.append(id);
        A0R = sb.toString();
        C0w9.A03("MediaImageInfo", A0R);
        return 1.0f;
    }

    public final int A0p() {
        List AmB;
        if (!A5O() || (AmB = this.A0C.AmB()) == null) {
            return 0;
        }
        return AmB.size();
    }

    public final int A0t() {
        if (A5i()) {
            return A0q();
        }
        return A0p();
    }

    public final int A17(String str) {
        List AmB;
        if (A5O() && (AmB = this.A0C.AmB()) != null) {
            int i = 0;
            Iterator it = AmB.iterator();
            while (it.hasNext()) {
                if (C14360o3.A0K(((C38321qM) it.next()).getId(), str)) {
                    return i;
                }
                i++;
            }
        }
        return -1;
    }

    public final long A1C() {
        return (long) (A0l() * 1000.0d);
    }

    public final C84923qg A1X() {
        int i;
        String str;
        String str2;
        C84923qg A1V = A1V();
        if (A5g()) {
            String title = this.A0C.getTitle();
            if (title == null) {
                title = "";
            }
            if (A1V != null && (str2 = A1V.A0e) != null) {
                i = str2.length();
            } else {
                i = 0;
            }
            if (i > 0) {
                if (title.length() != 0) {
                    title = AnonymousClass001.A0R(title, " • ");
                }
                if (A1V != null) {
                    str = A1V.A0e;
                } else {
                    str = null;
                }
                title = AnonymousClass001.A0R(title, str);
            }
            User CDj = this.A0C.CDj();
            if (CDj == null) {
                return null;
            }
            long A1B = A1B();
            C32955Eem A00 = InterfaceC38901rP.A00.A00();
            if (title == null) {
                title = "";
            }
            A00.A0t = title;
            A00.A09 = CDj;
            A00.A0f = 1;
            A00.A0g = Long.valueOf(A1B);
            C84923qg c84923qg = new C84923qg(A00.A01());
            c84923qg.A01(this);
            c84923qg.A06 = EnumC84933qh.A09;
            return c84923qg;
        }
        return A1V;
    }

    public final C38321qM A1d() {
        List Ap5;
        Object obj;
        if (A5Q() && (Ap5 = this.A0C.Ap5()) != null) {
            Iterator it = Ap5.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    if (((C38321qM) obj).A0C.Ap7() == CollectionMediaRole.A04) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            C38321qM c38321qM = (C38321qM) obj;
            if (c38321qM != null) {
                return c38321qM;
            }
        }
        return this;
    }

    public final C38321qM A1e(int i) {
        List AmB;
        if (!A5O() || (AmB = this.A0C.AmB()) == null) {
            return null;
        }
        return (C38321qM) AbstractC001800i.A0O(AmB, i);
    }

    public final ExtendedImageUrl A1n() {
        AdditionalCandidates AZl;
        ImageInfo A1t = A1t();
        if (A1t != null && (AZl = A1t.AZl()) != null) {
            return AZl.B6a();
        }
        return null;
    }

    public final ExtendedImageUrl A1r(Long l) {
        List list;
        Object next;
        ImageInfo A1t = A1t();
        if (A1t != null) {
            List AlQ = A1t.AlQ();
            Object obj = null;
            if (AlQ != null) {
                list = AbstractC001800i.A0g(AlQ, new M7X());
            } else {
                list = null;
            }
            if (l == null) {
                if (list == null) {
                    return null;
                }
                next = AbstractC001800i.A0O(list, 0);
            } else {
                if (list == null) {
                    return null;
                }
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    next = it.next();
                    ExtendedImageUrl extendedImageUrl = (ExtendedImageUrl) next;
                    if (extendedImageUrl.getWidth() * extendedImageUrl.getHeight() <= l.longValue()) {
                    }
                }
                return (ExtendedImageUrl) obj;
            }
            obj = next;
            return (ExtendedImageUrl) obj;
        }
        return null;
    }

    public final GifUrlImpl A1s() {
        Integer A2S;
        CommentGiphyMediaImagesIntf BH0;
        CommentGiphyMediaFixedHeightImages B6v;
        String CHQ;
        String A2p = A2p();
        if (A2p == null || (A2S = A2S()) == null) {
            return null;
        }
        int intValue = A2S.intValue();
        Integer A2R = A2R();
        if (A2R == null) {
            return null;
        }
        int intValue2 = A2R.intValue();
        CommentGiphyMediaInfoIntf B9s = this.A0C.B9s();
        if (B9s == null || (BH0 = B9s.BH0()) == null || (B6v = BH0.B6v()) == null || (CHQ = B6v.CHQ()) == null) {
            return null;
        }
        return new GifUrlImpl(A2p, CHQ, intValue, intValue2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x003a, code lost:
    
        if (X.C14360o3.A0K(r1, r2) == false) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.instagram.model.mediasize.ImageInfo A1t() {
        /*
            r2 = this;
            boolean r0 = r2.A5M()
            if (r0 == 0) goto L1a
            r0 = 0
            X.1qM r1 = r2.A1e(r0)
            if (r1 == r2) goto L1a
            if (r1 == 0) goto L1a
            boolean r0 = r1.A5M()
            if (r0 != 0) goto L1a
        L15:
            com.instagram.model.mediasize.ImageInfo r0 = r1.A1t()
            return r0
        L1a:
            boolean r0 = r2.A5Q()
            if (r0 == 0) goto L42
            X.1qM r1 = r2.A1d()
            boolean r0 = r1.A6E()
            if (r0 == 0) goto L3d
            java.util.List r0 = r1.A3e()
            java.lang.Object r1 = X.AbstractC001800i.A0J(r0)
            X.1qM r1 = (X.C38321qM) r1
            if (r1 == 0) goto L3d
        L36:
            boolean r0 = X.C14360o3.A0K(r1, r2)
            if (r0 != 0) goto L42
            goto L15
        L3d:
            X.1qM r1 = r2.A1d()
            goto L36
        L42:
            X.1rF r0 = r2.A0C
            com.instagram.model.mediasize.ImageInfo r0 = r0.BGx()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C38321qM.A1t():com.instagram.model.mediasize.ImageInfo");
    }

    public final SpritesheetInfo A1u() {
        SpriteSheetInfoCandidates Abq;
        ImageInfo A1t = A1t();
        if (A1t != null && (Abq = A1t.Abq()) != null) {
            return Abq.CIq();
        }
        return null;
    }

    public final SpritesheetInfo A1v() {
        SpriteSheetInfoCandidates Br7;
        ImageInfo A1t = A1t();
        if (A1t != null && (Br7 = A1t.Br7()) != null) {
            return Br7.CIq();
        }
        return null;
    }

    public final EnumC222416a A2F(UserSession userSession) {
        EnumC222416a A0I;
        User A2E = A2E(userSession);
        if (A2E == null || (A0I = A2E.A0I()) == null) {
            return EnumC222416a.A08;
        }
        return A0I;
    }

    public final C75363a3 A2H() {
        if (A5Q()) {
            return A1d().A2H();
        }
        return CFR();
    }

    public final Double A2J() {
        Double A00;
        Venue A27 = A27();
        if (A27 != null && (A00 = A27.A00()) != null) {
            return A00;
        }
        if (this.A0C.BM8() == null) {
            return null;
        }
        return Double.valueOf(r0.floatValue());
    }

    public final Double A2K() {
        Double A01;
        Venue A27 = A27();
        if (A27 != null && (A01 = A27.A01()) != null) {
            return A01;
        }
        if (this.A0C.BO9() == null) {
            return null;
        }
        return Double.valueOf(r0.floatValue());
    }

    public final Integer A2L() {
        if (A0y() > 0 && A0z() > 0 && A0z() == A0y()) {
            return C05F.A0C;
        }
        return C05F.A01;
    }

    public final Integer A2P() {
        if (CdW()) {
            return C05F.A00;
        }
        return C05F.A01;
    }

    public final Integer A2Q() {
        if (A2J() != null) {
            return C05F.A0C;
        }
        return C05F.A01;
    }

    public final String A2a() {
        VideoUrlImpl A01 = AbstractC88593xJ.A01(getId(), AbstractC75353a2.A00(this.A0C.CFe()));
        if (A01 != null) {
            return A01.A06;
        }
        return null;
    }

    public final String A2g() {
        List AlQ;
        ExtendedImageUrl extendedImageUrl;
        String str;
        ImageInfo A1t = A1t();
        if (A1t == null || (AlQ = A1t.AlQ()) == null || (extendedImageUrl = (ExtendedImageUrl) AbstractC001800i.A0O(AlQ, 0)) == null || (str = extendedImageUrl.A06) == null) {
            return null;
        }
        return AnonymousClass001.A0D(str, '#');
    }

    public final String A2h() {
        ReelCTAIntf A1j = A1j();
        if (A1j != null) {
            return C6T4.A00(A1j);
        }
        return null;
    }

    public final String A2u() {
        String id = getId();
        if (id != null) {
            return C38801rC.A06(id);
        }
        return null;
    }

    public final String A38() {
        String id = getId();
        if (id == null) {
            return null;
        }
        int A04 = AbstractC001900j.A04(id, '_', 0);
        if (A04 == -1) {
            return id;
        }
        String substring = id.substring(0, A04);
        C14360o3.A07(substring);
        return substring;
    }

    public final String A3B(int i) {
        InterfaceC38831rF interfaceC38831rF;
        C38321qM A1e = A1e(i);
        if (A5M() && A1e != null) {
            interfaceC38831rF = A1e.A0C;
        } else {
            interfaceC38831rF = this.A0C;
        }
        String B01 = interfaceC38831rF.B01();
        if (B01 == null) {
            return null;
        }
        return B01;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00b3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00b4 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String A3E(com.instagram.common.session.UserSession r7, boolean r8) {
        /*
            r6 = this;
            boolean r0 = r6.A6P()
            r5 = 46
            java.lang.String r4 = ""
            java.lang.String r3 = "Required value was null."
            if (r0 == 0) goto L44
            X.1rF r0 = r6.A0C
            java.lang.String r0 = r0.BPW()
            if (r0 == 0) goto L38
            int r0 = r0.length()
            if (r0 == 0) goto L38
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36329496269308277(0x81117c00004175, double:3.0382579556256526E-306)
            boolean r0 = X.C18U.A06(r2, r7, r0)
            if (r0 == 0) goto Lab
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = r6.getId()
            if (r0 != 0) goto L94
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r3)
            throw r0
        L38:
            java.lang.String r0 = r6.getId()
            if (r0 != 0) goto Lc1
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r3)
            throw r0
        L44:
            boolean r0 = r6.A5M()
            if (r8 == 0) goto L66
            if (r0 == 0) goto L5a
            X.1rF r0 = r6.A0C
            java.lang.String r0 = r0.BPW()
            if (r0 == 0) goto L5a
            int r0 = r0.length()
            if (r0 != 0) goto Lab
        L5a:
            java.lang.String r0 = r6.getId()
            if (r0 != 0) goto Lc1
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r3)
            throw r0
        L66:
            if (r0 == 0) goto Lb5
            X.1rF r0 = r6.A0C
            java.lang.String r0 = r0.BPW()
            if (r0 == 0) goto Lb5
            int r0 = r0.length()
            if (r0 == 0) goto Lb5
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36329496269373814(0x81117c00014176, double:3.0382579556670985E-306)
            boolean r0 = X.C18U.A06(r2, r7, r0)
            if (r0 == 0) goto Lab
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = r6.getId()
            if (r0 != 0) goto L94
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r3)
            throw r0
        L94:
            r1.append(r0)
            r1.append(r5)
            X.1rF r0 = r6.A0C
            java.lang.String r0 = r0.BPW()
            if (r0 == 0) goto La3
            r4 = r0
        La3:
            r1.append(r4)
            java.lang.String r0 = r1.toString()
            return r0
        Lab:
            X.1rF r0 = r6.A0C
            java.lang.String r0 = r0.BPW()
            if (r0 == 0) goto Lb4
            return r0
        Lb4:
            return r4
        Lb5:
            java.lang.String r0 = r6.getId()
            if (r0 != 0) goto Lc1
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r3)
            throw r0
        Lc1:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C38321qM.A3E(com.instagram.common.session.UserSession, boolean):java.lang.String");
    }

    public final ArrayList A3I() {
        if (A5M()) {
            ArrayList arrayList = new ArrayList();
            Collection values = A3V().values();
            C14360o3.A07(values);
            for (Object obj : values) {
                C14360o3.A07(obj);
                arrayList.addAll((ArrayList) obj);
            }
            if (arrayList.isEmpty()) {
                return null;
            }
            return arrayList;
        }
        return A3O();
    }

    public final ArrayList A3K() {
        List BSa = BSa();
        if (BSa == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = BSa.iterator();
        while (it.hasNext()) {
            arrayList.add(C4SX.A00((String) it.next()));
        }
        return arrayList;
    }

    public final ArrayList A3R(Integer num) {
        if (A5M() && this.A0C.AmB() != null && num != null) {
            C38321qM A1e = A1e(num.intValue());
            if (A1e != null) {
                return A1e.A3I();
            }
            return null;
        }
        return A3I();
    }

    public final ArrayList A3S(boolean z) {
        ArrayList arrayList;
        ClipsShoppingInfoIntf Buh;
        List A00;
        ProductDetailsProductItemDict productDetailsProductItemDict;
        Product A2A;
        if (A63()) {
            arrayList = new ArrayList();
            List A3w = A3w(EnumC75383a5.A0y);
            if (A3w != null && !A3w.isEmpty()) {
                Iterator it = A3w.iterator();
                while (it.hasNext()) {
                    arrayList.add(((C84823qW) it.next()).A0H());
                }
            }
            List A3w2 = A3w(EnumC75383a5.A0q);
            if (A3w2 != null) {
                Iterator it2 = A3w2.iterator();
                while (it2.hasNext()) {
                    List A0M = ((C84823qW) it2.next()).A0M();
                    if (A0M != null) {
                        arrayList.addAll(A0M);
                    }
                }
            }
            if (z && (A2A = A2A()) != null) {
                arrayList.add(A2A);
            }
            ReelProductLink A25 = A25();
            if (A25 != null && (productDetailsProductItemDict = A25.A00) != null) {
                arrayList.add(new Product(null, productDetailsProductItemDict));
            }
            ReelMultiProductLinkIntf A24 = A24();
            if (A24 != null) {
                List BhR = A24.BhR();
                if (BhR != null) {
                    arrayList.addAll(AbstractC38048Gob.A03(BhR));
                } else {
                    throw new IllegalStateException("Required value was null.");
                }
            }
        } else {
            if (A5g()) {
                IGTVShoppingInfoIntf BGP = this.A0C.BGP();
                if (BGP == null) {
                    return null;
                }
                return I3S.A00(BGP);
            }
            if (A5P()) {
                C3x9 clipsMetadata = this.A0C.getClipsMetadata();
                if (clipsMetadata == null || (Buh = clipsMetadata.Buh()) == null || (A00 = I3Q.A00(Buh)) == null) {
                    return null;
                }
                return new ArrayList(A00);
            }
            arrayList = new ArrayList();
            ArrayList A3I = A3I();
            if (A3I != null) {
                Iterator it3 = A3I.iterator();
                C14360o3.A07(it3);
                while (it3.hasNext()) {
                    Object next = it3.next();
                    C14360o3.A07(next);
                    arrayList.add(AbstractC38048Gob.A01(((ProductTag) next).A02));
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return arrayList;
    }

    public final List A3a() {
        List A3i = A3i();
        ArrayList arrayList = new ArrayList(AbstractC06950Ym.A1E(A3i, 10));
        Iterator it = A3i.iterator();
        while (it.hasNext()) {
            arrayList.add(((User) it.next()).getId());
        }
        return arrayList;
    }

    public final List A3c() {
        if (!A5O()) {
            return null;
        }
        return this.A0C.AmB();
    }

    public final List A3e() {
        List Ap5;
        if (A5Q() && (Ap5 = this.A0C.Ap5()) != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : Ap5) {
                if (((C38321qM) obj).A0C.Ap7() == CollectionMediaRole.A05) {
                    arrayList.add(obj);
                }
            }
            return arrayList;
        }
        return C16930sl.A00;
    }

    public final List A3k() {
        ArrayList A06 = A06();
        if (A06 != null) {
            ArrayList arrayList = new ArrayList(AbstractC06950Ym.A1E(A06, 10));
            Iterator it = A06.iterator();
            while (it.hasNext()) {
                User user = ((C84823qW) it.next()).A1C;
                if (user != null) {
                    arrayList.add(user.getId());
                } else {
                    throw new IllegalStateException("Required value was null.");
                }
            }
            return arrayList;
        }
        return null;
    }

    public final List A3l() {
        ArrayList A06 = A06();
        if (A06 != null) {
            ArrayList arrayList = new ArrayList(AbstractC06950Ym.A1E(A06, 10));
            Iterator it = A06.iterator();
            while (it.hasNext()) {
                User user = ((C84823qW) it.next()).A1C;
                if (user != null) {
                    arrayList.add(user);
                } else {
                    throw new IllegalStateException("Required value was null.");
                }
            }
            return arrayList;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v17, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r1v18, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.util.AbstractCollection, java.util.ArrayList] */
    public final List A3w(EnumC75383a5 enumC75383a5) {
        Float BYe;
        Float BYg;
        Float CHf;
        float f;
        float f2;
        ?? A01;
        H5X h5x;
        H41 h41;
        C38798H6n c38798H6n;
        String str;
        switch (enumC75383a5.ordinal()) {
            case 0:
                return A08();
            case 1:
                return A07();
            case 2:
            case 5:
            case 7:
            case 10:
            case 11:
            case 17:
            case 32:
            case 34:
            case 40:
            case 49:
            case 56:
            case 60:
            case 66:
            case 67:
            case 68:
            case 71:
            case 73:
            case 74:
            case 80:
            case 81:
            default:
                throw new UnsupportedOperationException("Unknown interactive type");
            case 3:
                List list = this.A0V;
                if (list == null) {
                    List C1F = this.A0C.C1F();
                    if (C1F == null || (A01 = AbstractC37408Gdo.A01(C1F)) == 0) {
                        return null;
                    }
                } else {
                    return list;
                }
                break;
            case 4:
                return A09();
            case 6:
            case 9:
                return null;
            case 8:
                return A0A();
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                return A03();
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                List<YR5> C1V = this.A0C.C1V();
                if (C1V != null) {
                    A01 = new ArrayList(AbstractC06950Ym.A1E(C1V, 10));
                    for (YR5 yr5 : C1V) {
                        C14360o3.A0B(yr5, 0);
                        C84823qW c84823qW = new C84823qW(EnumC75383a5.A0X, yr5.CI1(), yr5.CIa(), yr5.CIh(), yr5.CHf(), yr5.BDR(), yr5.Bpa(), yr5.CVk(), yr5.Cdh(), yr5.CUY(), yr5.Ayd(), yr5.AdC(), yr5.getId());
                        Integer CUY = yr5.CUY();
                        boolean z = true;
                        if (CUY == null || CUY.intValue() != 1) {
                            z = false;
                        }
                        c84823qW.A1s = z;
                        c84823qW.A1T = yr5.B4j();
                        A01.add(c84823qW);
                    }
                    break;
                } else {
                    return null;
                }
                break;
            case 14:
                return A0D();
            case Process.SIGTERM /* 15 */:
                return A0E();
            case 16:
                return A0B();
            case 18:
                return A0b();
            case Process.SIGSTOP /* 19 */:
                return A0G();
            case 20:
                List<YR6> C1e = this.A0C.C1e();
                if (C1e != null) {
                    A01 = new ArrayList(AbstractC06950Ym.A1E(C1e, 10));
                    for (YR6 yr6 : C1e) {
                        C14360o3.A0B(yr6, 0);
                        C84823qW c84823qW2 = new C84823qW(EnumC75383a5.A0e, yr6.CI1(), yr6.CIa(), yr6.CIh(), yr6.CHf(), yr6.BDR(), yr6.Bpa(), yr6.CVk(), yr6.Cdh(), yr6.CUY(), yr6.Ayd(), yr6.AdC(), yr6.getId());
                        InstapalCharacterType AnA = yr6.AnA();
                        if (AnA != null) {
                            str = AnA.A00;
                        } else {
                            str = null;
                        }
                        c84823qW2.A10 = new C24018Akw(AbstractC47091Krm.A00(str), yr6.getText());
                        A01.add(c84823qW2);
                    }
                    break;
                } else {
                    return null;
                }
            case 21:
                return A0C();
            case 22:
                return A0X(this);
            case 23:
            case 24:
                return A06();
            case 25:
                return A0Z();
            case 26:
                return A05();
            case 27:
                return A0c();
            case 28:
                return A0I();
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                return A0d();
            case 30:
                return A0Y(this);
            case 31:
            case 35:
                return A0e();
            case 33:
                return A0k(this);
            case 36:
                return A0H();
            case 37:
                return A0P();
            case 38:
                return A0J();
            case 39:
            case Seq.NULL_REFNUM /* 41 */:
                return A0K();
            case Seq.RefTracker.REF_OFFSET /* 42 */:
                return A0L();
            case 43:
                return A0T();
            case 44:
                return A0N();
            case 45:
                return A0f();
            case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN /* 46 */:
                return A0O();
            case 47:
                return A0Q();
            case 48:
                return A0R();
            case BurnerSendSettingsHelper.MESSAGE_SEND_BATCH_SIZE /* 50 */:
                return A0S();
            case 51:
                return A0U();
            case 52:
                return A0V();
            case 53:
                return A0h();
            case 54:
                return A0g();
            case 55:
                return A0M();
            case 57:
                List Aeh = this.A0C.Aeh();
                if (Aeh != null) {
                    return AbstractC001800i.A0a(AbstractC37408Gdo.A00(Aeh));
                }
                return null;
            case 58:
                List<InterfaceC73617YQf> C1U = this.A0C.C1U();
                if (C1U != null) {
                    A01 = new ArrayList(AbstractC06950Ym.A1E(C1U, 10));
                    for (InterfaceC73617YQf interfaceC73617YQf : C1U) {
                        C14360o3.A0B(interfaceC73617YQf, 0);
                        C84823qW c84823qW3 = new C84823qW(EnumC75383a5.A0W, interfaceC73617YQf.CI1(), interfaceC73617YQf.CIa(), interfaceC73617YQf.CIh(), interfaceC73617YQf.CHf(), interfaceC73617YQf.BDR(), interfaceC73617YQf.Bpa(), interfaceC73617YQf.CVk(), interfaceC73617YQf.Cdh(), interfaceC73617YQf.CUY(), interfaceC73617YQf.Ayd(), interfaceC73617YQf.AdC(), interfaceC73617YQf.getId());
                        JMV B4b = interfaceC73617YQf.B4b();
                        if (B4b != null) {
                            h5x = B4b.F0L();
                        } else {
                            h5x = null;
                        }
                        c84823qW3.A0S = h5x;
                        A01.add(c84823qW3);
                    }
                    break;
                } else {
                    return null;
                }
            case 59:
                return A04();
            case 61:
                return A0a();
            case 62:
                return A02();
            case StringTreeSet.PAYLOAD_MASK /* 63 */:
                return A0i();
            case 64:
                List<InterfaceC73628YQq> C1r = this.A0C.C1r();
                if (C1r != null) {
                    A01 = new ArrayList(AbstractC06950Ym.A1E(C1r, 10));
                    for (InterfaceC73628YQq interfaceC73628YQq : C1r) {
                        C14360o3.A0B(interfaceC73628YQq, 0);
                        A01.add(new C84823qW(EnumC75383a5.A0w, interfaceC73628YQq.CI1(), interfaceC73628YQq.CIa(), interfaceC73628YQq.CIh(), interfaceC73628YQq.CHf(), interfaceC73628YQq.BDR(), interfaceC73628YQq.Bpa(), interfaceC73628YQq.CVk(), interfaceC73628YQq.Cdh(), interfaceC73628YQq.CUY(), interfaceC73628YQq.Ayd(), interfaceC73628YQq.AdC(), interfaceC73628YQq.getId()));
                    }
                    break;
                } else {
                    return null;
                }
            case 65:
                return A3P();
            case 69:
                return A3L();
            case 70:
                return A0W();
            case 72:
                List<InterfaceC73634YQw> C2C = this.A0C.C2C();
                if (C2C != null) {
                    A01 = new ArrayList(AbstractC06950Ym.A1E(C2C, 10));
                    for (InterfaceC73634YQw interfaceC73634YQw : C2C) {
                        C14360o3.A0B(interfaceC73634YQw, 0);
                        C84823qW c84823qW4 = new C84823qW(EnumC75383a5.A1B, interfaceC73634YQw.CI1(), interfaceC73634YQw.CIa(), interfaceC73634YQw.CIh(), interfaceC73634YQw.CHf(), interfaceC73634YQw.BDR(), interfaceC73634YQw.Bpa(), interfaceC73634YQw.CVk(), interfaceC73634YQw.Cdh(), interfaceC73634YQw.CUY(), interfaceC73634YQw.Ayd(), interfaceC73634YQw.AdC(), interfaceC73634YQw.getId());
                        c84823qW4.A1f = interfaceC73634YQw.Alc();
                        A01.add(c84823qW4);
                    }
                    break;
                } else {
                    return null;
                }
            case 75:
                List<YQW> AoQ = this.A0C.AoQ();
                if (AoQ != null) {
                    ArrayList arrayList = new ArrayList(AbstractC06950Ym.A1E(AoQ, 10));
                    for (YQW yqw : AoQ) {
                        C14360o3.A0B(yqw, 0);
                        C84823qW c84823qW5 = new C84823qW(EnumC75383a5.A0H, yqw.CI1(), yqw.CIa(), yqw.CIh(), yqw.CHf(), yqw.BDR(), yqw.Bpa(), yqw.CVk(), yqw.Cdh(), yqw.CUY(), yqw.Ayd(), yqw.AdC(), yqw.getId());
                        JMI BKQ = yqw.BKQ();
                        if (BKQ != null) {
                            h41 = BKQ.Evn();
                        } else {
                            h41 = null;
                        }
                        c84823qW5.A0J = h41;
                        c84823qW5.A1L = yqw.Bzq();
                        c84823qW5.A1K = yqw.B29();
                        arrayList.add(c84823qW5);
                    }
                    return arrayList;
                }
                return null;
            case 76:
                List<YR3> Aod = this.A0C.Aod();
                if (Aod != null) {
                    ArrayList arrayList2 = new ArrayList(AbstractC06950Ym.A1E(Aod, 10));
                    for (YR3 yr3 : Aod) {
                        C14360o3.A0B(yr3, 0);
                        C84823qW c84823qW6 = new C84823qW(EnumC75383a5.A0L, yr3.CI1(), yr3.CIa(), yr3.CIh(), yr3.CHf(), yr3.BDR(), yr3.Bpa(), yr3.CVk(), yr3.Cdh(), yr3.CUY(), yr3.Ayd(), yr3.AdC(), yr3.getId());
                        InterfaceC43568JMc C6m = yr3.C6m();
                        if (C6m != null) {
                            c38798H6n = C6m.F3F();
                        } else {
                            c38798H6n = null;
                        }
                        c84823qW6.A0g = c38798H6n;
                        c84823qW6.A1L = yr3.Bzq();
                        c84823qW6.A1K = yr3.B29();
                        arrayList2.add(c84823qW6);
                    }
                    return arrayList2;
                }
                return null;
            case 77:
                return A3G();
            case 78:
                return A0F();
            case 79:
                List AoX = this.A0C.AoX();
                if (AoX != null) {
                    InterfaceC43531JKr interfaceC43531JKr = (InterfaceC43531JKr) AbstractC001800i.A0J(AoX);
                    if (interfaceC43531JKr != null) {
                        InterfaceC43579JMn C4W = interfaceC43531JKr.C4W();
                        Float f3 = null;
                        if (C4W != null && (BYe = C4W.BYe()) != null && (BYg = C4W.BYg()) != null && (CHf = C4W.CHf()) != null) {
                            float floatValue = CHf.floatValue();
                            Float BDR = C4W.BDR();
                            if (BDR != null) {
                                float floatValue2 = BDR.floatValue();
                                Float BqQ = C4W.BqQ();
                                if (BqQ != null) {
                                    f = BqQ.floatValue();
                                } else {
                                    f = 1.0f;
                                }
                                Float Bpc = C4W.Bpc();
                                if (Bpc != null) {
                                    f2 = Bpc.floatValue();
                                } else {
                                    f2 = 0.0f;
                                }
                                if (C4W.CIi() != null) {
                                    f3 = Float.valueOf(r0.intValue());
                                }
                                C84823qW c84823qW7 = new C84823qW(EnumC75383a5.A0K, BYe, BYg, f3, Float.valueOf(floatValue * f), Float.valueOf(floatValue2 * f), Float.valueOf(f2 / 360.0f), null, 1, null, null, null, interfaceC43531JKr.B0s());
                                c84823qW7.A0F = C4W;
                                List singletonList = Collections.singletonList(c84823qW7);
                                C14360o3.A07(singletonList);
                                return singletonList;
                            }
                        }
                    }
                    return C16930sl.A00;
                }
                return null;
            case 82:
                return A0j();
        }
        return new ArrayList((Collection) A01);
    }

    public final void A4K(Float f) {
        List A3c = A3c();
        if (A3c != null) {
            Iterator it = A3c.iterator();
            while (it.hasNext()) {
                ((C38321qM) it.next()).A4K(f);
            }
        }
    }

    public final boolean A4S() {
        if (A3n() == null && A3f() == null) {
            return false;
        }
        return true;
    }

    public final boolean A4i() {
        List A3c = A3c();
        if (A3c != null) {
            List A0a = AbstractC001800i.A0a(A3c);
            if ((A0a instanceof Collection) && A0a.isEmpty()) {
                return false;
            }
            Iterator it = A0a.iterator();
            while (it.hasNext()) {
                if (((C38321qM) it.next()).Cff()) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public final boolean A4q() {
        MediaGenAIDetectionMethod A1J = A1J();
        if (A1J != null && A1J != MediaGenAIDetectionMethod.A0B && A1J != MediaGenAIDetectionMethod.A08) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x000f, code lost:
    
        if (r1 == 0) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A4s() {
        /*
            r2 = this;
            X.3qg r0 = r2.A1W()
            if (r0 == 0) goto L11
            java.lang.String r0 = r0.A0e
            if (r0 == 0) goto L11
            int r1 = r0.length()
            r0 = 0
            if (r1 != 0) goto L12
        L11:
            r0 = 1
        L12:
            r0 = r0 ^ 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C38321qM.A4s():boolean");
    }

    public final boolean A4u() {
        if (A2J() != null && A2K() != null) {
            return true;
        }
        return false;
    }

    public final boolean A4y() {
        if (A1Q() == null) {
            return false;
        }
        return true;
    }

    public final boolean A4z() {
        if (!A4y() && !A50()) {
            return false;
        }
        return true;
    }

    public final boolean A50() {
        if (A1K() == null) {
            return false;
        }
        return true;
    }

    public final boolean A53() {
        ClipsShoppingInfoIntf Buh;
        List BhR;
        boolean z = true;
        if (A5P()) {
            C3x9 clipsMetadata = this.A0C.getClipsMetadata();
            if (clipsMetadata == null || (Buh = clipsMetadata.Buh()) == null || (BhR = Buh.BhR()) == null || !(!BhR.isEmpty())) {
                return false;
            }
        } else if (A63()) {
            List A3w = A3w(EnumC75383a5.A0y);
            if (A3w == null || A3w.isEmpty()) {
                return false;
            }
        } else {
            if (A5M() && this.A0C.AmB() != null) {
                List<C38321qM> AmB = this.A0C.AmB();
                if (AmB == null) {
                    return false;
                }
                if ((AmB instanceof Collection) && AmB.isEmpty()) {
                    return false;
                }
                for (C38321qM c38321qM : AmB) {
                    if (!c38321qM.A5M() && c38321qM.A53()) {
                        return true;
                    }
                }
                return false;
            }
            z = false;
            if (A3O() != null) {
                return true;
            }
        }
        return z;
    }

    public final boolean A54() {
        String A2q;
        List A3p = A3p();
        if (A3p != null) {
            if (!A3p.isEmpty() || (((A2q = A2q()) != null && A2q.length() != 0) || A2h() != null)) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Deprecated(message = "")
    public final boolean A55() {
        if (BRp() != EnumC40111tc.A0Q && !A6L() && !A5O()) {
            return false;
        }
        return true;
    }

    public final boolean A59() {
        if (!Cff() && !A5J() && !A5p()) {
            return false;
        }
        return true;
    }

    public final boolean A5E() {
        if (CdW() && A6L()) {
            return true;
        }
        return false;
    }

    public final boolean A5F() {
        if (A5M() && !CdW()) {
            return true;
        }
        return false;
    }

    public final boolean A5H() {
        if (A1y() != C3YU.A04) {
            return false;
        }
        return true;
    }

    public final boolean A5I() {
        User Ade;
        C3x9 clipsMetadata;
        InterfaceC110214xq C5g;
        InterfaceC110104xf AdG;
        C88543xC A1Q = A1Q();
        if (A1Q == null || (Ade = A1Q.Ade()) == null || (clipsMetadata = this.A0C.getClipsMetadata()) == null || (C5g = clipsMetadata.C5g()) == null || (AdG = C5g.AdG()) == null) {
            return false;
        }
        return C14360o3.A0K(Ade.getUsername(), AdG.getOwnerUsername());
    }

    public final boolean A5J() {
        if (BRp() != EnumC40111tc.A07) {
            return false;
        }
        return true;
    }

    public final boolean A5K() {
        if (A61() && A4h()) {
            return true;
        }
        return false;
    }

    public final boolean A5M() {
        List AmB;
        if (A5O() && (AmB = this.A0C.AmB()) != null && !AmB.isEmpty()) {
            return true;
        }
        return false;
    }

    public final boolean A5O() {
        if (BRp() != EnumC40111tc.A09) {
            return false;
        }
        return true;
    }

    public final boolean A5Q() {
        if (BRp() != EnumC40111tc.A0B && this.A0C.Ap5() == null) {
            return false;
        }
        return true;
    }

    public final boolean A5R() {
        if (!A5g() && !A5d()) {
            return false;
        }
        return true;
    }

    public final boolean A5U() {
        if (A1x() != EnumC76383bi.A07) {
            return false;
        }
        return true;
    }

    public final boolean A5V() {
        if (A18() >= System.currentTimeMillis()) {
            return false;
        }
        return true;
    }

    public final boolean A5c() {
        if (!A5b() && !A5g() && !A5O() && !A5N()) {
            return false;
        }
        return true;
    }

    public final boolean A5d() {
        if (A6L() && A5b()) {
            return true;
        }
        return false;
    }

    public final boolean A5i() {
        List AmB;
        if (!A5O() || (AmB = this.A0C.AmB()) == null || AmB.isEmpty() || AmB.size() >= A0q()) {
            return false;
        }
        return true;
    }

    public final boolean A5p() {
        if ((BRp() == EnumC40111tc.A0Q || A5O()) && A4z()) {
            return true;
        }
        return false;
    }

    public final boolean A5s() {
        String id = getId();
        if (id != null && true == id.endsWith("open_carousel_prompt")) {
            return true;
        }
        return false;
    }

    public final boolean A5u() {
        if (A1z() != ProductType.PENDING_CAROUSEL_ITEM) {
            return false;
        }
        return true;
    }

    public final boolean A5x() {
        EnumC40111tc BRp;
        if (A5Q()) {
            BRp = A1d().BRp();
        } else {
            BRp = BRp();
        }
        if (BRp != EnumC40111tc.A0Q) {
            return false;
        }
        return true;
    }

    public final boolean A69() {
        if (A1x() != EnumC76383bi.A04) {
            return false;
        }
        return true;
    }

    public final boolean A6B() {
        if (CdW()) {
            if (A53() || A24() != null) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean A6I() {
        C96444Vc A1U = A1U();
        if (A1U != null && AbstractC96454Vd.A00(A1U)) {
            return true;
        }
        return false;
    }

    public final boolean A6L() {
        if (BRp() != EnumC40111tc.A0a) {
            return false;
        }
        return true;
    }

    public final boolean A6V(int i) {
        C38321qM A1e;
        if (A5O() && (A1e = A1e(i)) != null && A1e.Cff()) {
            return true;
        }
        return false;
    }

    public final boolean A6X(UserSession userSession) {
        OriginalityInfo Ba3;
        if (A6Y(userSession)) {
            C06090Tz c06090Tz = C06090Tz.A06;
            if (C18U.A06(c06090Tz, userSession, 36325630798869725L)) {
                C3x9 clipsMetadata = this.A0C.getClipsMetadata();
                if ((clipsMetadata != null && (Ba3 = clipsMetadata.Ba3()) != null && C14360o3.A0K(Ba3.Akh(), true)) || C18U.A06(c06090Tz, userSession, 36325630799000799L)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public final boolean A6b(UserSession userSession) {
        C3x9 clipsMetadata;
        if (A5P() && (clipsMetadata = this.A0C.getClipsMetadata()) != null && clipsMetadata.AoE() == ClipsCreationEntryPoint.A04 && A1U() != null) {
            if (A1U() != null) {
                if (r2.A01 / r2.A00 >= 0.5725f && C18U.A06(C06090Tz.A05, userSession, 36328663045717712L)) {
                    return true;
                }
                return false;
            }
            throw new IllegalStateException("Required value was null.");
        }
        return false;
    }

    public final boolean A6l(User user) {
        List CIr;
        String str;
        if (A5M()) {
            List A3c = A3c();
            if (A3c != null) {
                if ((A3c instanceof Collection) && A3c.isEmpty()) {
                    return false;
                }
                Iterator it = A3c.iterator();
                while (it.hasNext()) {
                    if (((C38321qM) it.next()).A6l(user)) {
                        return true;
                    }
                }
                return false;
            }
            return false;
        }
        InterfaceC84523py CEF = this.A0C.CEF();
        if (CEF == null || (CIr = CEF.CIr()) == null) {
            return false;
        }
        if ((CIr instanceof Collection) && CIr.isEmpty()) {
            return false;
        }
        Iterator it2 = CIr.iterator();
        while (it2.hasNext()) {
            User CDj = ((UserTagInfoDictIntf) it2.next()).CDj();
            if (CDj != null) {
                str = CDj.getId();
            } else {
                str = null;
            }
            if (C14360o3.A0K(str, user.getId())) {
                return true;
            }
        }
        return false;
    }

    @Override // X.InterfaceC38401qU
    public final String Biv() {
        String id = getId();
        if (id != null) {
            return C38801rC.A04(id);
        }
        throw new IllegalStateException("Required value was null.");
    }

    @Override // X.InterfaceC38401qU
    public final String Biw() {
        String A2u = A2u();
        if (A2u != null) {
            return A2u;
        }
        throw new IllegalStateException("Required value was null.");
    }

    @Override // X.InterfaceC38391qT
    public final String BqK() {
        String id = getId();
        if (id == null) {
            return "";
        }
        return id;
    }

    @Override // X.InterfaceC38371qR, X.C1NI
    public final String BzL(UserSession userSession) {
        return A33();
    }

    @Override // X.InterfaceC38381qS
    public final String CAR() {
        if (CdW()) {
            return A33();
        }
        return this.A0C.getOrganicTrackingToken();
    }

    @Override // X.InterfaceC38381qS
    public final Integer CCj() {
        if (CdW()) {
            return C05F.A0C;
        }
        return C05F.A01;
    }

    @Override // X.InterfaceC38421qW
    public final boolean Cff() {
        C38321qM A1d;
        if (A5Q() && this != (A1d = A1d())) {
            return A1d.Cff();
        }
        return A6L();
    }

    public final int hashCode() {
        String id = getId();
        if (id != null) {
            return id.hashCode();
        }
        return 0;
    }

    public final ImageUrl A1S() {
        ImageInfo A1t;
        ExtendedImageUrl A01;
        if (C20150ym.A07(AbstractC20100yh.A00(36324316538810469L)) && (A01 = A01()) != null) {
            return A01;
        }
        if (this.A09 == null && (A1t = A1t()) != null) {
            this.A09 = AbstractC40161tk.A03(A1t, C05F.A01);
        }
        return this.A09;
    }

    public final ExtendedImageUrl A1o(int i) {
        ExtendedImageUrl A01;
        if (C20150ym.A07(AbstractC20100yh.A00(36324316538876006L)) && (A01 = A01()) != null) {
            return A01;
        }
        ImageInfo A1t = A1t();
        if (A1t != null) {
            return AbstractC40161tk.A04(A1t, A2L(), i);
        }
        return null;
    }

    public final ExtendedImageUrl A1p(int i) {
        ExtendedImageUrl extendedImageUrl;
        List BzD;
        if ((C20150ym.A07(AbstractC20100yh.A00(36324316538744932L)) && (extendedImageUrl = A01()) != null) || (extendedImageUrl = this.A0E) != null) {
            return extendedImageUrl;
        }
        Object obj = null;
        ImageInfo BGx = this.A0C.BGx();
        if (BGx != null && (BzD = BGx.BzD()) != null && (!BzD.isEmpty())) {
            obj = BzD.get(0);
        }
        ExtendedImageUrl A03 = C38801rC.A03(A1T(), (ExtendedImageUrl) obj, A1t(), A2L(), i);
        this.A0E = A03;
        return A03;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [X.1rF, java.lang.Object] */
    public C38321qM() {
        this(new C37761pD(null), new Object());
    }
}
