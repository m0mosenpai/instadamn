package X;

import android.app.Activity;
import android.graphics.RectF;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.google.common.collect.SingletonImmutableSet;
import com.instagram.api.schemas.ACRType;
import com.instagram.api.schemas.ClipsCameraCommandAction;
import com.instagram.api.schemas.GenAIToolInfoDict;
import com.instagram.api.schemas.MusicProduct;
import com.instagram.common.gallery.Medium;
import com.instagram.common.session.UserSession;
import com.instagram.creation.base.CropInfo;
import com.instagram.creation.cameraconfiguration.CameraConfiguration;
import com.instagram.creation.capture.assetpicker.shareplatform.model.SharePlatformStickerClientModel;
import com.instagram.creation.capture.opencarousel.configuration.OpenCarouselCaptureConfig;
import com.instagram.creation.capture.quickcapture.commentreply.model.ReelsVisualRepliesModel;
import com.instagram.creation.capture.quickcapture.model.FundraiserSharedToLive;
import com.instagram.creation.capture.quickcapture.sundial.reshare.model.ClipsCelebrationReshareViewModel;
import com.instagram.creation.capture.quickcapture.superlativesticker.model.SuperlativeStickerClientModel;
import com.instagram.infocenter.intf.InfoCenterFactShareInfoIntf;
import com.instagram.infocenter.intf.InfoCenterShareInfoIntf;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.model.direct.camera.DirectCameraViewModel;
import com.instagram.model.mediasize.ImageInfo;
import com.instagram.model.shopping.reels.ProductShareConfig;
import com.instagram.music.common.config.MusicAttributionConfig;
import com.instagram.music.common.model.AudioOverlayTrack;
import com.instagram.music.common.model.InstagramAudioApplySource;
import com.instagram.music.common.model.MusicOverlayStickerModel;
import com.instagram.pendingmedia.model.recipients.PendingRecipient;
import com.instagram.reels.musicpick.model.MusicPickStickerModel;
import com.instagram.reels.profilecard.model.ProfileCardStickerModel;
import com.instagram.reels.prompt.model.PromptStickerModel;
import com.instagram.reels.question.constants.QuestionStickerType;
import com.instagram.reels.question.model.QuestionResponseReshareModel;
import com.instagram.reels.smb.model.ProfileStickerModel;
import com.instagram.shopping.model.collection.ProductCollectionShareInfo;
import com.instagram.shopping.model.share.ShopShareInfo;
import com.instagram.user.model.Product;
import com.instagram.user.model.UpcomingEvent;
import com.instagram.user.model.User;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;

/* renamed from: X.81J, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C81J {
    public int A00;
    public int A01;
    public long A04;
    public Activity A05;
    public RectF A06;
    public RectF A07;
    public RectF A08;
    public ViewGroup A09;
    public C5GJ A0A;
    public C8JW A0C;
    public C31200Dnj A0D;
    public C50679MYx A0E;
    public ACRType A0G;
    public ClipsCameraCommandAction A0H;
    public InterfaceC1816483t A0J;
    public MusicProduct A0K;
    public C85B A0L;
    public AbstractC59962oe A0M;
    public C88X A0N;
    public InterfaceC11380iw A0O;
    public Medium A0P;
    public Medium A0Q;
    public C60762q0 A0R;
    public UserSession A0S;
    public CropInfo A0T;
    public CameraConfiguration A0V;
    public C81O A0W;
    public C81W A0X;
    public C217879kK A0Y;
    public C217839kG A0Z;
    public SharePlatformStickerClientModel A0a;
    public OpenCarouselCaptureConfig A0b;
    public C172017lW A0c;
    public C23476Aap A0d;
    public C172007lV A0e;
    public InterfaceC171997lU A0f;
    public InterfaceC25173BBt A0g;
    public BBu A0h;
    public InterfaceC25179BCc A0i;
    public ReelsVisualRepliesModel A0j;
    public ReelsVisualRepliesModel A0k;
    public InterfaceC25214BDm A0l;
    public C171057jw A0m;
    public C207549Gh A0n;
    public C1815983m A0o;
    public C171977lS A0p;
    public BBw A0q;
    public InterfaceC25175BBx A0r;
    public EnumC172837mv A0s;
    public C81I A0t;
    public C1815783k A0u;
    public FundraiserSharedToLive A0v;
    public C1815683j A0x;
    public C1816583x A0z;
    public C1816183p A10;
    public C1816083n A11;
    public C1816683y A12;
    public C9LQ A13;
    public ClipsCelebrationReshareViewModel A14;
    public C83o A15;
    public SuperlativeStickerClientModel A16;
    public C1816283r A18;
    public C1815883l A19;
    public InterfaceC25192BCp A1A;
    public C9ZH A1B;
    public C38321qM A1C;
    public C38321qM A1D;
    public C132825z5 A1E;
    public InfoCenterFactShareInfoIntf A1F;
    public InfoCenterShareInfoIntf A1G;
    public DirectShareTarget A1H;
    public DirectCameraViewModel A1I;
    public C3o9 A1J;
    public ImageInfo A1K;
    public InterfaceC84833qX A1L;
    public ProductShareConfig A1M;
    public MusicAttributionConfig A1N;
    public AudioOverlayTrack A1O;
    public AudioOverlayTrack A1P;
    public InstagramAudioApplySource A1Q;
    public MusicOverlayStickerModel A1R;
    public PendingRecipient A1S;
    public C8F8 A1T;
    public AFz A1U;
    public Al9 A1V;
    public C24012Akq A1W;
    public C24012Akq A1X;
    public AlC A1Y;
    public C24021Akz A1Z;
    public ACH A1a;
    public AlB A1b;
    public C217859kI A1c;
    public C5NL A1d;
    public C8F9 A1e;
    public ProfileCardStickerModel A1f;
    public PromptStickerModel A1g;
    public PromptStickerModel A1h;
    public QuestionResponseReshareModel A1i;
    public AlD A1j;
    public C9ZL A1k;
    public ProfileStickerModel A1l;
    public C41629IbK A1m;
    public C24010Ako A1n;
    public C51853Mvx A1o;
    public C1821585z A1p;
    public C1821585z A1q;
    public ProductCollectionShareInfo A1r;
    public ShopShareInfo A1s;
    public Product A1t;
    public UpcomingEvent A1u;
    public User A1v;
    public C3PO A1w;
    public C8F7 A1x;
    public C1816383s A1y;
    public C8XE A1z;
    public Boolean A20;
    public Boolean A21;
    public Boolean A24;
    public Boolean A25;
    public Integer A26;
    public Long A2A;
    public Long A2B;
    public String A2D;
    public String A2E;
    public String A2F;
    public String A2G;
    public String A2H;
    public String A2I;
    public String A2J;
    public String A2K;
    public String A2L;
    public String A2M;
    public String A2N;
    public String A2O;
    public String A2P;
    public String A2Q;
    public String A2R;
    public String A2S;
    public String A2T;
    public String A2V;
    public String A2Y;
    public String A2Z;
    public String A2a;
    public String A2b;
    public String A2c;
    public String A2d;
    public String A2e;
    public String A2f;
    public String A2g;
    public String A2h;
    public String A2i;
    public String A2j;
    public String A2k;
    public String A2l;
    public String A2m;
    public String A2n;
    public String A2o;
    public String A2p;
    public String A2q;
    public ArrayList A2r;
    public ArrayList A2s;
    public ArrayList A2t;
    public ArrayList A2u;
    public ArrayList A2v;
    public List A2x;
    public List A2z;
    public List A30;
    public boolean A33;
    public boolean A34;
    public boolean A38;
    public boolean A3A;
    public boolean A3E;
    public boolean A3F;
    public boolean A3H;
    public boolean A3I;
    public boolean A3J;
    public boolean A3K;
    public boolean A3L;
    public boolean A3M;
    public boolean A3N;
    public boolean A3O;
    public boolean A3Q;
    public boolean A3S;
    public boolean A3W;
    public boolean A3X;
    public boolean A3Z;
    public boolean A3a;
    public boolean A3b;
    public boolean A3c;
    public boolean A3d;
    public boolean A3g;
    public boolean A3h;
    public boolean A3i;
    public boolean A3k;
    public boolean A3m;
    public boolean A3o;
    public boolean A3p;
    public boolean A3r;
    public boolean A3u;
    public boolean A3v;
    public boolean A3x;
    public boolean A3y;
    public boolean A40;
    public boolean A41;
    public boolean A42;
    public boolean A43;
    public boolean A47;
    public C22P A0B = C22P.A5N;
    public String A2U = null;
    public boolean A3P = true;
    public C81K A0y = C81K.A08;
    public boolean A44 = true;
    public boolean A37 = true;
    public Integer A28 = C05F.A00;
    public int A03 = 0;
    public C81L A17 = C81L.A06;
    public C81M A0w = null;
    public Long A2C = -1L;
    public List A2y = Collections.emptyList();
    public boolean A3R = false;
    public GenAIToolInfoDict A0I = null;
    public boolean A3n = true;
    public boolean A3C = true;
    public boolean A35 = true;
    public boolean A3q = true;
    public boolean A3t = true;
    public boolean A3s = true;
    public boolean A36 = true;
    public boolean A3j = true;
    public boolean A3G = true;
    public boolean A3D = true;
    public boolean A3f = false;
    public boolean A3l = false;
    public boolean A3U = true;
    public boolean A3w = false;
    public boolean A45 = false;
    public boolean A39 = false;
    public boolean A3V = false;
    public List A2w = Collections.emptyList();
    public boolean A3B = false;
    public boolean A3Y = false;
    public boolean A48 = false;
    public Boolean A22 = false;
    public Boolean A23 = false;
    public boolean A3T = false;
    public C81N A0U = null;
    public boolean A32 = false;
    public QJ0 A0F = null;
    public boolean A46 = false;
    public boolean A31 = false;
    public boolean A3z = true;
    public Integer A27 = null;
    public int A02 = 0;
    public Integer A29 = 0;
    public String A2X = "";
    public String A2W = "";
    public boolean A3e = false;

    public static C128535rM A00(ViewGroup viewGroup, C60762q0 c60762q0, C81J c81j, C81I c81i) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        C128535rM c128535rM = C128535rM.A00;
        linkedHashSet2.add(c128535rM);
        C81O c81o = new C81O(linkedHashSet, linkedHashSet2);
        c81o.getClass();
        c81j.A0W = c81o;
        c81j.A3h = false;
        c81j.A0R = c60762q0;
        c81i.getClass();
        c81j.A0t = c81i;
        c81j.A09 = viewGroup;
        return c128535rM;
    }

    public static void A04(RectF rectF, RectF rectF2, C81J c81j) {
        c81j.A06 = rectF;
        c81j.A07 = rectF2;
        c81j.A3r = true;
        c81j.A3v = false;
        c81j.A33 = false;
        c81j.A04 = 0L;
        c81j.A3H = true;
    }

    public static void A05(RectF rectF, RectF rectF2, C81J c81j) {
        c81j.A06 = rectF;
        c81j.A07 = rectF2;
        c81j.A3r = true;
        c81j.A3v = false;
        c81j.A33 = false;
        c81j.A04 = 150L;
        c81j.A3H = true;
    }

    public static void A06(RectF rectF, C81J c81j) {
        c81j.A06 = rectF;
        c81j.A07 = rectF;
        c81j.A3r = true;
        c81j.A3v = false;
        c81j.A33 = false;
        c81j.A04 = 0L;
        c81j.A3H = true;
        c81j.A0y = C81K.A02;
        c81j.A3g = true;
    }

    public static void A09(Fragment fragment, C81J c81j, User user) {
        QuestionStickerType questionStickerType = QuestionStickerType.A08;
        FragmentActivity requireActivity = fragment.requireActivity();
        int A00 = AlD.A00(requireActivity);
        int A01 = AlD.A01(requireActivity);
        c81j.A1j = new AlD(user.Bhu(), questionStickerType, fragment.getString(2131962198), fragment.getString(2131962199), A00, A01, false, false, false);
    }

    public static void A0A(C22P c22p, InterfaceC11380iw interfaceC11380iw, C81J c81j) {
        c81j.A0B = c22p;
        c81j.A0O = interfaceC11380iw;
        c81j.A3F = true;
    }

    public static void A0B(Medium medium, C81J c81j) {
        c81j.A0P = medium;
        c81j.A0w = null;
    }

    public static void A0D(UserSession userSession, C81P c81p, C81J c81j, AbstractC67881V0m abstractC67881V0m) {
        C81O A00 = c81p.A00(userSession, C208509Kk.A00);
        A00.getClass();
        c81j.A0W = A00;
        c81j.A3h = true;
        c81j.A0R = abstractC67881V0m.volumeKeyPressController;
        C81I c81i = abstractC67881V0m.A02;
        c81i.getClass();
        c81j.A0t = c81i;
    }

    public static void A0E(C81J c81j) {
        c81j.A0y = C81K.A02;
        c81j.A3g = true;
    }

    public static void A0F(C81J c81j) {
        c81j.A17 = new C81L(2131975357, 2131975358, false, true, true, true);
    }

    public static void A0I(C81J c81j, C81M c81m, String str) {
        c81j.A0P = C8IU.A03(new File(str), 1, 0);
        c81j.A0w = c81m;
    }

    public static C81J A01() {
        return new C81J();
    }

    public static void A07(RectF rectF, C81J c81j, boolean z, boolean z2) {
        c81j.A06 = rectF;
        c81j.A07 = rectF;
        c81j.A3r = z;
        c81j.A3v = z2;
        c81j.A33 = z;
        c81j.A04 = 0L;
    }

    public static void A08(ViewGroup viewGroup, C81J c81j, AbstractC67881V0m abstractC67881V0m, boolean z) {
        c81j.A3h = z;
        c81j.A0R = abstractC67881V0m.volumeKeyPressController;
        C81I c81i = abstractC67881V0m.A02;
        c81i.getClass();
        c81j.A0t = c81i;
        c81j.A09 = viewGroup;
    }

    public static void A0J(C81J c81j, AbstractC67881V0m abstractC67881V0m) {
        InterfaceC25214BDm interfaceC25214BDm = abstractC67881V0m.A03;
        interfaceC25214BDm.getClass();
        c81j.A0l = interfaceC25214BDm;
        UserSession userSession = abstractC67881V0m.A00;
        userSession.getClass();
        c81j.A0S = userSession;
        c81j.A05 = abstractC67881V0m.requireActivity();
        c81j.A0M = abstractC67881V0m;
    }

    public static void A0K(C81J c81j, Object obj, java.util.Set set) {
        C81O c81o = new C81O(set, new SingletonImmutableSet(obj));
        c81o.getClass();
        c81j.A0W = c81o;
    }

    public final AbstractC59962oe A0M() {
        this.A0M.getClass();
        return this.A0M;
    }

    public final C5JK A0N() {
        C9LQ c9lq = this.A13;
        if (c9lq != null) {
            return c9lq.A06;
        }
        return C5JK.A05;
    }

    public final boolean A0O() {
        C5NL c5nl;
        if (this.A1i != null || this.A12 != null || this.A1h != null || this.A1U != null || this.A0a != null || this.A1c != null || this.A1v != null || this.A1R != null || this.A1Y != null || this.A1y != null || this.A1j != null || this.A1b != null || this.A1a != null || this.A1m != null || this.A1l != null || this.A1f != null || this.A0D != null || this.A1Z != null || this.A0k != null || this.A0j != null || this.A1o != null || this.A1X != null || this.A1n != null || this.A1u != null || this.A0E != null || this.A1g != null || this.A0Y != null || this.A1W != null || this.A1V != null || this.A16 != null || this.A39 || (((c5nl = this.A1d) != null && (c5nl instanceof MusicPickStickerModel) && ((MusicPickStickerModel) c5nl).A02.isEmpty()) || this.A0Z != null || this.A2C.longValue() > 0)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x002e, code lost:
    
        if (r1.A1z() == com.instagram.model.mediatype.ProductType.A05) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0016, code lost:
    
        if (r2.A1z() == com.instagram.model.mediatype.ProductType.A05) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A0P() {
        /*
            r5 = this;
            X.1qM r2 = r5.A1C
            r4 = 0
            if (r2 == 0) goto L36
            com.instagram.common.gallery.Medium r0 = r5.A0Q
            if (r0 == 0) goto L36
            boolean r0 = r2.Cff()
            if (r0 == 0) goto L18
            com.instagram.model.mediatype.ProductType r1 = r2.A1z()
            com.instagram.model.mediatype.ProductType r0 = com.instagram.model.mediatype.ProductType.CLIPS
            r3 = 1
            if (r1 != r0) goto L19
        L18:
            r3 = 0
        L19:
            int r0 = r5.A00
            X.1qM r1 = r2.A1e(r0)
            if (r1 == 0) goto L30
            boolean r0 = r1.Cff()
            if (r0 == 0) goto L30
            com.instagram.model.mediatype.ProductType r2 = r1.A1z()
            com.instagram.model.mediatype.ProductType r1 = com.instagram.model.mediatype.ProductType.CLIPS
            r0 = 1
            if (r2 != r1) goto L31
        L30:
            r0 = 0
        L31:
            if (r3 != 0) goto L35
            if (r0 == 0) goto L36
        L35:
            r4 = 1
        L36:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C81J.A0P():boolean");
    }

    public final boolean A0Q() {
        C1816683y c1816683y = this.A12;
        if (c1816683y != null) {
            return c1816683y.A04;
        }
        C83o c83o = this.A15;
        if (c83o != null) {
            return c83o.A0D;
        }
        C1815783k c1815783k = this.A0u;
        if (c1815783k != null) {
            return c1815783k.A0G;
        }
        return false;
    }

    public static C81J A02(Object obj, int i) {
        C14360o3.A0B(obj, i);
        return new C81J();
    }

    public static void A03(Activity activity, AbstractC59962oe abstractC59962oe, C81J c81j) {
        activity.getClass();
        c81j.A05 = activity;
        c81j.A0M = abstractC59962oe;
    }

    public static void A0C(UserSession userSession, C81P c81p, C55U c55u, C81J c81j) {
        C81O A00 = c81p.A00(userSession, c55u);
        A00.getClass();
        c81j.A0W = A00;
    }

    public static void A0G(C81J c81j, InterfaceC25214BDm interfaceC25214BDm, AbstractC67881V0m abstractC67881V0m) {
        interfaceC25214BDm.getClass();
        c81j.A0l = interfaceC25214BDm;
        UserSession userSession = abstractC67881V0m.A00;
        userSession.getClass();
        c81j.A0S = userSession;
        FragmentActivity activity = abstractC67881V0m.getActivity();
        activity.getClass();
        c81j.A05 = activity;
        c81j.A0M = abstractC67881V0m;
    }

    public static void A0H(C81J c81j, InterfaceC25214BDm interfaceC25214BDm, AbstractC67881V0m abstractC67881V0m) {
        interfaceC25214BDm.getClass();
        c81j.A0l = interfaceC25214BDm;
        UserSession userSession = abstractC67881V0m.A00;
        userSession.getClass();
        c81j.A0S = userSession;
        c81j.A05 = abstractC67881V0m.requireActivity();
        c81j.A0M = abstractC67881V0m;
    }

    public static void A0L(C81J c81j, InterfaceC09390do interfaceC09390do) {
        UserSession userSession = (UserSession) interfaceC09390do.getValue();
        userSession.getClass();
        c81j.A0S = userSession;
    }
}
