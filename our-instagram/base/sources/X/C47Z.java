package X;

import android.graphics.Rect;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import com.facebook.videolite.transcoder.base.composition.MediaComposition;
import com.instagram.api.schemas.BrandedContentGatingInfo;
import com.instagram.api.schemas.BrandedContentProjectMetadata;
import com.instagram.api.schemas.MediaGenAIDetectionMethod;
import com.instagram.api.schemas.RingSpecImpl;
import com.instagram.camera.effect.models.CameraAREffect;
import com.instagram.clips.model.metadata.ClipsFanClubMetadata;
import com.instagram.common.gallery.metadata.MediaUploadMetadata;
import com.instagram.common.session.UserSession;
import com.instagram.common.util.gradient.BackgroundGradientColors;
import com.instagram.creation.capture.quickcapture.freetransform.transformmatrix.TransformMatrixConfig;
import com.instagram.creation.capture.quickcapture.gallery.gallerygrid.suggestions.model.GallerySuggestionsInfo;
import com.instagram.filterkit.filtergroup.model.intf.FilterGroupModel;
import com.instagram.model.fundraiser.NewFundraiserInfo;
import com.instagram.model.mediatype.ProductType;
import com.instagram.model.shopping.ProductTag;
import com.instagram.model.venue.LocationDict;
import com.instagram.model.venue.Venue;
import com.instagram.music.common.model.InstagramAudioApplySource;
import com.instagram.music.common.model.MusicOverlayStickerModel;
import com.instagram.pendingmedia.model.BrandedContentTag;
import com.instagram.pendingmedia.model.ClipInfo;
import com.instagram.pendingmedia.model.constants.ShareType;
import com.instagram.share.facebook.model.FBReelsAudienceType;
import com.instagram.shopping.model.taggingfeed.ProductCollectionFeedTaggingMeta;
import com.instagram.user.model.Product;
import com.instagram.user.model.UpcomingEventImpl;
import com.instagram.wellbeing.fundraiser.model.ExistingStandaloneFundraiserForFeedModel;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.enums.EnumEntries;
import org.json.JSONObject;
import org.webrtc.HardwareVideoEncoderFactory;

/* renamed from: X.47Z, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C47Z implements C1NI, InterfaceC914447a {
    public double A00;
    public double A01;
    public float A02;
    public float A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public int A09;
    public int A0A;
    public int A0B;
    public int A0C;
    public int A0D;
    public int A0E;
    public int A0F;
    public int A0G;
    public int A0H;
    public int A0I;
    public int A0J;
    public int A0K;
    public int A0L;
    public int A0M;
    public int A0N;
    public int A0O;
    public int A0P;
    public int A0Q;
    public int A0R;
    public int A0S;
    public int A0T;
    public int A0U;
    public long A0V;
    public long A0W;
    public long A0X;
    public long A0Y;
    public long A0Z;
    public long A0a;
    public long A0b;
    public long A0c;
    public long A0d;
    public long A0e;
    public long A0f;
    public long A0g;
    public EnumC114925Hg A0h;
    public C22P A0i;
    public C9BS A0j;
    public C9C9 A0k;
    public C51756Mtf A0l;
    public E72 A0m;
    public C51760Mtj A0n;
    public MUD A0o;
    public C45116Jxl A0p;
    public C38686GzR A0q;
    public MediaComposition A0r;
    public BrandedContentGatingInfo A0s;
    public BrandedContentProjectMetadata A0t;
    public C1117351z A0u;
    public C38709H2v A0v;
    public MediaGenAIDetectionMethod A0w;
    public H4C A0x;
    public RingSpecImpl A0y;
    public C38801H6q A0z;
    public CameraAREffect A10;
    public ClipsFanClubMetadata A11;
    public C185368Kc A12;
    public MediaUploadMetadata A13;
    public BackgroundGradientColors A14;
    public C5L6 A15;
    public TransformMatrixConfig A16;
    public GallerySuggestionsInfo A17;
    public C5QB A18;
    public A8E A19;
    public C5JK A1A;
    public C51685MsG A1B;
    public C38321qM A1C;
    public FilterGroupModel A1D;
    public NewFundraiserInfo A1E;
    public EnumC76383bi A1F;
    public EnumC40111tc A1G;
    public LocationDict A1H;
    public InstagramAudioApplySource A1I;
    public MusicOverlayStickerModel A1J;
    public C1125256f A1K;
    public C52W A1L;
    public BrandedContentTag A1M;
    public ClipInfo A1N;
    public C5Kv A1O;
    public C115595Kt A1P;
    public C54968OSz A1Q;
    public C55h A1R;
    public FH9 A1S;
    public C915547l A1T;
    public C1124756a A1U;
    public C47v A1V;
    public C56W A1W;
    public C47u A1X;
    public C188538Ws A1Y;
    public A64 A1Z;
    public C55W A1a;
    public C184758Hq A1b;
    public A7Z A1c;
    public C916047t A1d;
    public EnumC915447k A1e;
    public EnumC915447k A1f;
    public C56Y A1g;
    public EnumC914547b A1h;
    public C915647m A1i;
    public C47s A1j;
    public ShareType A1k;
    public C9ZL A1l;
    public C38561qk A1m;
    public FBReelsAudienceType A1n;
    public ProductCollectionFeedTaggingMeta A1o;
    public UpcomingEventImpl A1p;
    public ExistingStandaloneFundraiserForFeedModel A1q;
    public Boolean A1r;
    public Boolean A1s;
    public Boolean A1t;
    public Boolean A1u;
    public Boolean A1v;
    public Boolean A1w;
    public Boolean A1x;
    public Boolean A1y;
    public Boolean A1z;
    public Boolean A20;
    public Boolean A21;
    public Boolean A22;
    public Boolean A23;
    public Double A24;
    public Double A25;
    public Integer A26;
    public Integer A27;
    public Integer A28;
    public Integer A29;
    public Integer A2A;
    public Integer A2B;
    public Integer A2C;
    public Integer A2D;
    public Integer A2E;
    public Integer A2F;
    public Integer A2G;
    public Integer A2H;
    public Long A2I;
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
    public String A2U;
    public String A2V;
    public String A2W;
    public String A2X;
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
    public String A2r;
    public String A2s;
    public String A2t;
    public String A2u;
    public String A2v;
    public String A2w;
    public String A2x;
    public String A2y;
    public String A2z;
    public String A30;
    public String A31;
    public String A32;
    public String A33;
    public String A34;
    public String A35;
    public String A36;
    public String A37;
    public String A38;
    public String A39;
    public String A3A;
    public String A3B;
    public String A3C;
    public String A3D;
    public String A3E;
    public String A3F;
    public String A3G;
    public String A3H;
    public String A3I;
    public String A3J;
    public String A3K;
    public String A3L;
    public String A3M;
    public String A3N;
    public String A3O;
    public String A3P;
    public String A3Q;
    public String A3R;
    public String A3S;
    public String A3T;
    public String A3U;
    public String A3V;
    public String A3W;
    public String A3X;
    public String A3Y;
    public String A3Z;
    public String A3a;
    public String A3b;
    public String A3c;
    public String A3d;
    public String A3e;
    public String A3f;
    public String A3g;
    public String A3h;
    public String A3i;
    public String A3j;
    public String A3k;
    public String A3l;
    public String A3m;
    public String A3n;
    public String A3o;
    public String A3p;
    public String A3q;
    public String A3r;
    public String A3s;
    public String A3t;
    public String A3u;
    public String A3v;
    public String A3w;
    public String A3x;
    public String A3y;
    public String A3z;
    public ArrayList A40;
    public ArrayList A41;
    public ArrayList A42;
    public ArrayList A43;
    public HashMap A44;
    public HashMap A45;
    public HashMap A46;
    public List A47;
    public List A48;
    public List A49;
    public List A4A;
    public List A4B;
    public List A4C;
    public List A4D;
    public List A4E;
    public List A4F;
    public List A4G;
    public List A4H;
    public List A4I;
    public List A4J;
    public List A4K;
    public List A4L;
    public List A4M;
    public List A4N;
    public List A4O;
    public List A4P;
    public List A4Q;
    public List A4R;
    public List A4S;
    public List A4T;
    public List A4U;
    public List A4V;
    public List A4W;
    public List A4X;
    public List A4Y;
    public List A4Z;
    public List A4a;
    public List A4b;
    public List A4c;
    public List A4d;
    public List A4e;
    public List A4f;
    public List A4g;
    public List A4h;
    public List A4i;
    public List A4j;
    public List A4k;
    public List A4l;
    public List A4m;
    public List A4n;
    public List A4o;
    public List A4p;
    public List A4q;
    public List A4r;
    public java.util.Set A4s;
    public java.util.Set A4t;
    public java.util.Set A4u;
    public boolean A4v;
    public boolean A4w;
    public boolean A4x;
    public boolean A4y;
    public boolean A4z;
    public boolean A50;
    public boolean A51;
    public boolean A52;
    public boolean A53;
    public boolean A54;
    public boolean A55;
    public boolean A56;
    public boolean A57;
    public boolean A58;
    public boolean A59;
    public boolean A5A;
    public boolean A5B;
    public boolean A5C;
    public boolean A5D;
    public boolean A5E;
    public boolean A5F;
    public boolean A5G;
    public boolean A5H;
    public boolean A5I;
    public boolean A5J;
    public boolean A5K;
    public boolean A5L;
    public boolean A5M;
    public boolean A5N;
    public boolean A5O;
    public boolean A5P;
    public boolean A5Q;
    public boolean A5R;
    public boolean A5S;
    public boolean A5T;
    public boolean A5U;
    public boolean A5V;
    public boolean A5W;
    public boolean A5X;
    public boolean A5Y;
    public boolean A5Z;
    public boolean A5a;
    public boolean A5b;
    public boolean A5c;
    public boolean A5d;
    public boolean A5e;
    public boolean A5f;
    public boolean A5g;
    public boolean A5h;
    public boolean A5i;
    public boolean A5j;
    public boolean A5k;
    public boolean A5l;
    public boolean A5m;
    public boolean A5n;
    public boolean A5o;
    public boolean A5p;
    public boolean A5q;
    public boolean A5r;
    public boolean A5s;
    public boolean A5t;
    public boolean A5u;
    public boolean A5v;
    public boolean A5w;
    public boolean A5x;
    public boolean A5y;
    public boolean A5z;
    public boolean A60;
    public boolean A61;
    public boolean A62;
    public boolean A63;
    public boolean A64;
    public boolean A65;
    public boolean A66;
    public boolean A67;
    public boolean A68;
    public boolean A69;
    public boolean A6A;
    public boolean A6B;
    public boolean A6C;
    public boolean A6D;
    public boolean A6E;
    public List A6F;
    public final C915247i A6G;
    public final Object A6H;
    public volatile C115435Kd A6I;
    public volatile EnumC915447k A6J;
    public transient Runnable A6K;

    /* JADX WARN: Type inference failed for: r11v0, types: [X.47s, java.lang.Object] */
    public C47Z(String str) {
        C14360o3.A0B(str, 1);
        this.A1h = EnumC914547b.A05;
        this.A6G = new C915247i(this);
        EnumC915447k enumC915447k = EnumC915447k.A08;
        this.A1f = enumC915447k;
        this.A6J = enumC915447k;
        this.A5b = true;
        this.A5K = true;
        this.A1T = new C915547l();
        this.A1G = EnumC40111tc.A0Z;
        this.A35 = "";
        this.A2a = "";
        this.A3x = "";
        C16930sl c16930sl = C16930sl.A00;
        this.A4O = c16930sl;
        this.A3t = "";
        this.A40 = new ArrayList();
        this.A41 = new ArrayList();
        this.A45 = new HashMap();
        this.A20 = false;
        this.A4T = c16930sl;
        this.A1i = new C915647m();
        this.A0d = -1L;
        this.A03 = -1.0f;
        this.A4G = c16930sl;
        this.A1N = (ClipInfo) ClipInfo.A0Q.getValue();
        this.A0T = 100;
        this.A4E = c16930sl;
        this.A4D = c16930sl;
        this.A13 = new MediaUploadMetadata(null, null, null, null, null, null, null, null, null, null, null, false);
        this.A1k = ShareType.A0a;
        this.A0g = System.currentTimeMillis();
        this.A0L = 0;
        this.A4Y = c16930sl;
        this.A4b = c16930sl;
        this.A5P = true;
        this.A4h = c16930sl;
        this.A6H = new Object();
        this.A4c = c16930sl;
        this.A4u = new LinkedHashSet();
        this.A1F = EnumC76383bi.A06;
        this.A6F = c16930sl;
        this.A4i = c16930sl;
        this.A0j = new C9BS(null, null, 7, 3, false, false);
        ArrayList arrayList = new ArrayList();
        ?? obj = new Object();
        obj.A06 = arrayList;
        obj.A04 = null;
        obj.A02 = 0;
        obj.A01 = 0;
        obj.A03 = 0L;
        obj.A07 = false;
        obj.A00 = -1.0d;
        obj.A05 = "NO_INIT";
        this.A1j = obj;
        this.A4s = new LinkedHashSet();
        this.A1d = new C916047t();
        this.A1X = new C47u();
        this.A0W = -1L;
        this.A0V = -1L;
        this.A0J = -1;
        this.A4B = new ArrayList();
        this.A4A = c16930sl;
        this.A4m = c16930sl;
        this.A4n = c16930sl;
        this.A1V = new C47v(0.0f, 31);
        this.A48 = new ArrayList();
        this.A4t = new LinkedHashSet();
        this.A04 = 0;
        this.A1h = EnumC914547b.values()[EnumC914547b.values().length - 1];
        this.A35 = str;
        this.A3t = str;
        EnumC915447k enumC915447k2 = EnumC915447k.A07;
        A0Z(enumC915447k2);
        this.A6J = enumC915447k2;
        this.A1e = null;
        this.A0g = System.currentTimeMillis();
    }

    public final synchronized long A04() {
        return this.A0Y;
    }

    public final synchronized long A05() {
        return this.A0b;
    }

    public final ClipInfo A08() {
        Integer A0j;
        ClipInfo clipInfo = new ClipInfo(null, 16777215);
        int i = 0;
        clipInfo.A0C = 0;
        clipInfo.A07 = 0;
        String str = this.A3j;
        if (str != null && new File(str).exists()) {
            clipInfo.A0F = this.A3j;
            MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
            String str2 = clipInfo.A0F;
            if (str2 != null) {
                mediaMetadataRetriever.setDataSource(str2);
                String extractMetadata = mediaMetadataRetriever.extractMetadata(18);
                if (extractMetadata != null) {
                    int parseInt = Integer.parseInt(extractMetadata);
                    String extractMetadata2 = mediaMetadataRetriever.extractMetadata(19);
                    if (extractMetadata2 != null) {
                        int parseInt2 = Integer.parseInt(extractMetadata2);
                        int i2 = 3;
                        if (Build.VERSION.SDK_INT >= 30) {
                            String extractMetadata3 = mediaMetadataRetriever.extractMetadata(36);
                            if (extractMetadata3 != null) {
                                i2 = Integer.parseInt(extractMetadata3);
                            } else {
                                throw new IllegalStateException("Required value was null.");
                            }
                        } else {
                            String str3 = clipInfo.A0F;
                            if (str3 != null) {
                                i2 = AbstractC50720MaJ.A00(str3);
                            }
                        }
                        clipInfo.A01(parseInt, parseInt2);
                        clipInfo.A04 = i2;
                        String extractMetadata4 = mediaMetadataRetriever.extractMetadata(9);
                        if (extractMetadata4 != null && (A0j = AbstractC003100w.A0j(extractMetadata4, 10)) != null) {
                            i = A0j.intValue();
                        }
                        clipInfo.A05 = i;
                        try {
                            mediaMetadataRetriever.release();
                        } catch (Exception unused) {
                        }
                    } else {
                        throw new IllegalStateException("Required value was null.");
                    }
                } else {
                    throw new IllegalStateException("Required value was null.");
                }
            } else {
                throw new IllegalStateException("Required value was null.");
            }
        }
        Integer num = this.A28;
        if (num != null) {
            clipInfo.A03 = num.intValue();
        }
        return clipInfo;
    }

    public final synchronized EnumC915447k A0C() {
        return this.A1e;
    }

    public final synchronized List A0K() {
        return this.A6F;
    }

    public final synchronized List A0L() {
        return this.A4i;
    }

    public final synchronized void A0P(long j) {
        this.A0Z = j;
    }

    public final synchronized void A0Q(long j) {
        this.A0b = j;
        this.A6G.A00();
    }

    public final void A0R(Rect rect) {
        C14360o3.A0B(rect, 0);
        this.A4V = AbstractC16960so.A1Q(Integer.valueOf(rect.left), Integer.valueOf(rect.top), Integer.valueOf(rect.right), Integer.valueOf(rect.bottom));
    }

    public final void A0T(EnumC40111tc enumC40111tc) {
        C14360o3.A0B(enumC40111tc, 0);
        this.A1G = enumC40111tc;
    }

    public final void A0W(InterfaceC65982ya interfaceC65982ya) {
        C14360o3.A0B(interfaceC65982ya, 0);
        java.util.Set set = this.A6G.A04;
        synchronized (set) {
            set.add(interfaceC65982ya);
        }
    }

    public final void A0X(InterfaceC65982ya interfaceC65982ya) {
        C14360o3.A0B(interfaceC65982ya, 0);
        java.util.Set set = this.A6G.A04;
        synchronized (set) {
            set.remove(interfaceC65982ya);
        }
    }

    public final void A0Y(InterfaceC40171tl interfaceC40171tl) {
        synchronized (this.A6H) {
            ArrayList A0T = AbstractC001800i.A0T(interfaceC40171tl, this.A4c);
            C14360o3.A0B(A0T, 0);
            this.A4c = A0T;
        }
    }

    public final void A0Z(EnumC915447k enumC915447k) {
        C14360o3.A0B(enumC915447k, 0);
        this.A1f = enumC915447k;
        if (enumC915447k == EnumC915447k.A02) {
            this.A0W = System.currentTimeMillis();
        }
        this.A6G.A00();
    }

    public final void A0a(EnumC915447k enumC915447k) {
        C14360o3.A0B(enumC915447k, 0);
        this.A6J = enumC915447k;
    }

    public final synchronized void A0b(EnumC915447k enumC915447k) {
        EnumC915447k enumC915447k2 = this.A1e;
        if (enumC915447k2 == null || enumC915447k.A00(enumC915447k2)) {
            this.A1e = enumC915447k;
        }
    }

    public final void A0c(ShareType shareType) {
        C14360o3.A0B(shareType, 0);
        this.A1k = shareType;
    }

    public final void A0d(EnumC223259tC enumC223259tC) {
        C14360o3.A0B(enumC223259tC, 0);
        this.A4u.add(enumC223259tC.toString());
    }

    public final void A0i(List list) {
        C14360o3.A0B(list, 0);
        this.A4G = list;
    }

    public final synchronized boolean A12() {
        boolean z;
        z = false;
        if (this.A0b > 0) {
            z = true;
        }
        return z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x007b, code lost:
    
        if (r4.A1f != X.EnumC915447k.A09) goto L45;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized boolean A13() {
        /*
            r4 = this;
            monitor-enter(r4)
            X.5Kd r0 = r4.A6I     // Catch: java.lang.Throwable -> L80
            if (r0 == 0) goto La
            X.5Kb r1 = r0.A01     // Catch: java.lang.Throwable -> L80
        L7:
            X.5Kb r0 = X.EnumC115415Kb.A0J     // Catch: java.lang.Throwable -> L80
            goto Lc
        La:
            r1 = 0
            goto L7
        Lc:
            r3 = 0
            if (r1 == r0) goto L7e
            boolean r0 = r4.A0t()     // Catch: java.lang.Throwable -> L80
            r2 = 1
            if (r0 != 0) goto L1a
            boolean r0 = r4.A5w     // Catch: java.lang.Throwable -> L80
            if (r0 == 0) goto L36
        L1a:
            java.util.List r0 = r4.A0K()     // Catch: java.lang.Throwable -> L80
            java.util.Iterator r1 = r0.iterator()     // Catch: java.lang.Throwable -> L80
        L22:
            boolean r0 = r1.hasNext()     // Catch: java.lang.Throwable -> L80
            if (r0 == 0) goto L36
            java.lang.Object r0 = r1.next()     // Catch: java.lang.Throwable -> L80
            X.47Z r0 = (X.C47Z) r0     // Catch: java.lang.Throwable -> L80
            boolean r0 = r0.A13()     // Catch: java.lang.Throwable -> L80
            if (r0 == 0) goto L22
            monitor-exit(r4)
            return r2
        L36:
            boolean r0 = r4.A10()     // Catch: java.lang.Throwable -> L80
            if (r0 == 0) goto L55
            java.util.List r0 = r4.A4m     // Catch: java.lang.Throwable -> L80
            java.util.Iterator r1 = r0.iterator()     // Catch: java.lang.Throwable -> L80
        L42:
            boolean r0 = r1.hasNext()     // Catch: java.lang.Throwable -> L80
            if (r0 == 0) goto L55
            java.lang.Object r0 = r1.next()     // Catch: java.lang.Throwable -> L80
            X.47Z r0 = (X.C47Z) r0     // Catch: java.lang.Throwable -> L80
            boolean r0 = r0.A13()     // Catch: java.lang.Throwable -> L80
            if (r0 == 0) goto L42
            goto L7d
        L55:
            X.47k r1 = r4.A1f     // Catch: java.lang.Throwable -> L80
            X.47k r0 = r4.A6J     // Catch: java.lang.Throwable -> L80
            if (r1 != r0) goto L5f
            X.47k r0 = r4.A1e     // Catch: java.lang.Throwable -> L80
            if (r0 == 0) goto L7e
        L5f:
            boolean r0 = r4.A4w     // Catch: java.lang.Throwable -> L80
            if (r0 == 0) goto L73
            X.47k r1 = r4.A6J     // Catch: java.lang.Throwable -> L80
            X.47k r0 = X.EnumC915447k.A02     // Catch: java.lang.Throwable -> L80
            if (r1 != r0) goto L73
            boolean r0 = r4.A0r()     // Catch: java.lang.Throwable -> L80
            if (r0 != 0) goto L73
            boolean r0 = r4.A5Q     // Catch: java.lang.Throwable -> L80
            if (r0 == 0) goto L7e
        L73:
            boolean r0 = r4.A53     // Catch: java.lang.Throwable -> L80
            if (r0 == 0) goto L7d
            X.47k r1 = r4.A1f     // Catch: java.lang.Throwable -> L80
            X.47k r0 = X.EnumC915447k.A09     // Catch: java.lang.Throwable -> L80
            if (r1 == r0) goto L7e
        L7d:
            r3 = 1
        L7e:
            monitor-exit(r4)
            return r3
        L80:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C47Z.A13():boolean");
    }

    public final boolean A14(java.util.Set set) {
        ArrayList arrayList;
        ShareType shareType;
        C14360o3.A0B(set, 0);
        if (this.A4w) {
            synchronized (this.A6H) {
                arrayList = new ArrayList();
                for (InterfaceC40171tl interfaceC40171tl : this.A4c) {
                    if (InterfaceC40171tl.class.isAssignableFrom(interfaceC40171tl.getClass())) {
                        InterfaceC40171tl interfaceC40171tl2 = (InterfaceC40171tl) InterfaceC40171tl.class.cast(interfaceC40171tl);
                        if (interfaceC40171tl2 != null) {
                            shareType = interfaceC40171tl2.BuN();
                        } else {
                            shareType = null;
                        }
                        if (set.contains(shareType)) {
                            C14360o3.A0A(interfaceC40171tl2);
                            arrayList.add(interfaceC40171tl2);
                        }
                    }
                }
            }
            if (arrayList.isEmpty()) {
                return false;
            }
            return true;
        }
        return set.contains(A0D());
    }

    @Override // X.C1NI
    public final String BzL(UserSession userSession) {
        return null;
    }

    @Override // X.C1NI
    public final boolean CW9() {
        return false;
    }

    @Override // X.C1NI
    public final boolean CZq() {
        return false;
    }

    @Override // X.C1NI
    public final boolean CdW() {
        return false;
    }

    public final float A00() {
        C190178bb c190178bb;
        C115595Kt c115595Kt = this.A1P;
        if (c115595Kt != null) {
            List list = c115595Kt.A03;
            Object obj = null;
            if (list != null) {
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    if (next instanceof C219779nP) {
                        obj = next;
                        break;
                    }
                }
                obj = (C115585Ks) obj;
            }
            C219779nP c219779nP = (C219779nP) obj;
            if (c219779nP != null && (c190178bb = c219779nP.A00) != null) {
                return c190178bb.A00;
            }
            return 0.0f;
        }
        return 0.0f;
    }

    public final int A02() {
        int i;
        synchronized (this.A6H) {
            List list = this.A4c;
            i = 0;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    if (((InterfaceC40171tl) it.next()).CRc() && (i = i + 1) < 0) {
                        AbstractC16960so.A1T();
                        throw C00O.createAndThrow();
                    }
                }
            }
        }
        return i;
    }

    public final int A03() {
        List A0K;
        C915247i c915247i = this.A6G;
        C47Z c47z = c915247i.A02;
        if (!c47z.A0t() && c47z.A1G != EnumC40111tc.A0A) {
            if (c47z.A10()) {
                A0K = c47z.A4m;
            } else {
                return c915247i.A00.A00();
            }
        } else {
            A0K = c47z.A0K();
        }
        int i = 0;
        if (A0K.isEmpty()) {
            return 0;
        }
        Iterator it = A0K.iterator();
        while (it.hasNext()) {
            i += ((C47Z) it.next()).A03();
        }
        return i / A0K.size();
    }

    public final Rect A06() {
        List list = this.A4M;
        if (list != null) {
            return new Rect(((Number) list.get(0)).intValue(), ((Number) list.get(1)).intValue(), ((Number) list.get(2)).intValue(), ((Number) list.get(3)).intValue());
        }
        return new Rect(0, 0, this.A0H, this.A0G);
    }

    public final BrandedContentTag A07() {
        BrandedContentTag brandedContentTag = this.A1M;
        if (brandedContentTag == null) {
            List list = this.A4C;
            if (list != null) {
                return (BrandedContentTag) AbstractC001800i.A0J(list);
            }
            return null;
        }
        return brandedContentTag;
    }

    public final AbstractC1125056d A09() {
        C1124756a c1124756a = this.A1U;
        if (c1124756a != null) {
            C1124956c c1124956c = c1124756a.A01;
            if (c1124956c == null) {
                NRI nri = c1124756a.A02;
                if (nri == null) {
                    NRH nrh = c1124756a.A00;
                    if (nrh == null) {
                        throw new IllegalStateException("No configuration set");
                    }
                    return nrh;
                }
                return nri;
            }
            return c1124956c;
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0027, code lost:
    
        r0 = (X.InterfaceC40171tl) X.InterfaceC40171tl.class.cast(r1);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.InterfaceC40171tl A0A() {
        /*
            r5 = this;
            java.lang.Class<X.1tl> r4 = X.InterfaceC40171tl.class
            java.lang.Object r3 = r5.A6H
            monitor-enter(r3)
            java.util.List r0 = r5.A4c     // Catch: java.lang.Throwable -> L31
            java.util.Iterator r2 = r0.iterator()     // Catch: java.lang.Throwable -> L31
        Lb:
            boolean r0 = r2.hasNext()     // Catch: java.lang.Throwable -> L31
            if (r0 == 0) goto L2e
            java.lang.Object r1 = r2.next()     // Catch: java.lang.Throwable -> L31
            X.1tl r1 = (X.InterfaceC40171tl) r1     // Catch: java.lang.Throwable -> L31
            boolean r0 = r1.CRc()     // Catch: java.lang.Throwable -> L31
            if (r0 != 0) goto Lb
            java.lang.Class r0 = r1.getClass()     // Catch: java.lang.Throwable -> L31
            boolean r0 = r4.isAssignableFrom(r0)     // Catch: java.lang.Throwable -> L31
            if (r0 == 0) goto Lb
            java.lang.Object r0 = r4.cast(r1)     // Catch: java.lang.Throwable -> L31
            X.1tl r0 = (X.InterfaceC40171tl) r0     // Catch: java.lang.Throwable -> L31
            goto L2f
        L2e:
            r0 = 0
        L2f:
            monitor-exit(r3)
            return r0
        L31:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C47Z.A0A():X.1tl");
    }

    public final InterfaceC40171tl A0B(InterfaceC28041Xi interfaceC28041Xi, String str) {
        InterfaceC40171tl interfaceC40171tl;
        synchronized (this.A6H) {
            Iterator it = A0J(null, C122005fs.class).iterator();
            while (it.hasNext()) {
                interfaceC40171tl = (InterfaceC40171tl) it.next();
                if (interfaceC28041Xi.apply(interfaceC40171tl)) {
                }
            }
            throw new IllegalStateException(str);
        }
        return interfaceC40171tl;
    }

    public final ShareType A0D() {
        if (this.A1k == ShareType.A0a) {
            EnumEntries enumEntries = EnumC914547b.A00;
            AbstractC50709Ma4.A00(this);
            C0w9.A04("sharetype_null", AbstractC13670mt.A06("uploadid:%s,new mShareType:%s,waterfall:%s", this.A3t, this.A1k, A0E()), HardwareVideoEncoderFactory.QCOM_VP8_KEY_FRAME_INTERVAL_ANDROID_M_MS);
        }
        return this.A1k;
    }

    public final String A0E() {
        String str = this.A2a;
        if (str.length() == 0) {
            String A02 = C6WI.A02();
            C14360o3.A07(A02);
            this.A2a = A02;
            return A02;
        }
        return str;
    }

    public final String A0F() {
        HashMap hashMap;
        String str;
        HashMap hashMap2 = this.A44;
        String A00 = AbstractC111324zv.A00(776);
        if (hashMap2 != null && (str = (String) hashMap2.get(A00)) != null && str.length() != 0) {
            hashMap = this.A44;
            if (hashMap == null) {
                return null;
            }
        } else {
            hashMap = this.A44;
            if (hashMap == null) {
                return null;
            }
            A00 = "maker_note";
        }
        return (String) hashMap.get(A00);
    }

    public final String A0G() {
        int i;
        int i2;
        C916047t c916047t = this.A1d;
        EnumC915447k enumC915447k = this.A1f;
        boolean A11 = A11();
        C14360o3.A0B(enumC915447k, 0);
        Integer A00 = AbstractC54081Nvf.A00(enumC915447k, A11);
        C09530e4 c09530e4 = new C09530e4("num_reupload", Integer.valueOf(c916047t.A01));
        Map map = c916047t.A03;
        String A002 = AbstractC54082Nvg.A00(A00);
        Number number = (Number) map.get(A002);
        if (number != null) {
            i = number.intValue();
        } else {
            i = 0;
        }
        C09530e4 c09530e42 = new C09530e4("num_step_manual_retry", Integer.valueOf(i));
        Number number2 = (Number) c916047t.A02.get(A002);
        if (number2 != null) {
            i2 = number2.intValue();
        } else {
            i2 = 0;
        }
        String obj = new JSONObject(AbstractC06930Yk.A07(c09530e4, c09530e42, new C09530e4("num_step_auto_retry", Integer.valueOf(i2)))).toString();
        C14360o3.A07(obj);
        return obj;
    }

    public final String A0H() {
        String str = this.A3x;
        if (str.length() == 0) {
            String obj = C0HM.A00().toString();
            C14360o3.A07(obj);
            this.A3x = obj;
            return obj;
        }
        return str;
    }

    public final ArrayList A0I() {
        if (this.A4H == null && this.A10 == null) {
            return null;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        List list = this.A4H;
        if (list != null) {
            linkedHashSet.addAll(list);
        }
        CameraAREffect cameraAREffect = this.A10;
        if (cameraAREffect != null) {
            linkedHashSet.add(cameraAREffect.A0K);
        }
        return AbstractC001800i.A0U(linkedHashSet);
    }

    public final ArrayList A0J(InterfaceC28041Xi interfaceC28041Xi, Class cls) {
        ArrayList arrayList;
        synchronized (this.A6H) {
            arrayList = new ArrayList();
            for (InterfaceC40171tl interfaceC40171tl : this.A4c) {
                if (cls.isAssignableFrom(interfaceC40171tl.getClass())) {
                    InterfaceC40171tl interfaceC40171tl2 = (InterfaceC40171tl) cls.cast(interfaceC40171tl);
                    if (interfaceC28041Xi == null || interfaceC28041Xi.apply(interfaceC40171tl2)) {
                        C14360o3.A0A(interfaceC40171tl2);
                        arrayList.add(interfaceC40171tl2);
                    }
                }
            }
        }
        return arrayList;
    }

    public final void A0M() {
        synchronized (this.A6H) {
            C16930sl c16930sl = C16930sl.A00;
            C14360o3.A0B(c16930sl, 0);
            this.A4c = c16930sl;
        }
    }

    public final void A0N() {
        C915247i c915247i = this.A6G;
        synchronized (c915247i.A03) {
            if (c915247i.A01) {
                c915247i.A01 = false;
                c915247i.A00();
            }
        }
    }

    public final void A0O() {
        Runnable runnable = this.A6K;
        if (runnable != null) {
            runnable.run();
        } else {
            C0w9.A03("pendingmedia_no_serializer", "PendingMedia.serialize was invoked without a serializer set.");
        }
    }

    public final void A0S(InterfaceC28041Xi interfaceC28041Xi, Class cls) {
        synchronized (this.A6H) {
            List A0e = AbstractC001800i.A0e(this.A4c, AbstractC001800i.A0k(A0J(interfaceC28041Xi, cls)));
            C14360o3.A0B(A0e, 0);
            this.A4c = A0e;
        }
    }

    public final void A0U(Venue venue) {
        LocationDict locationDict;
        if (venue != null) {
            locationDict = venue.A00.F6g();
        } else {
            locationDict = null;
        }
        this.A1H = locationDict;
    }

    public final void A0e(Integer num, double d) {
        C915247i c915247i = this.A6G;
        double min = Math.min(Math.max(d, 0.0d), 1.0d);
        C915347j c915347j = c915247i.A00;
        int A00 = c915347j.A00();
        synchronized (c915347j) {
            int intValue = num.intValue();
            if (intValue != 2) {
                if (intValue != 1) {
                    c915347j.A02 = min;
                } else {
                    c915347j.A01 = min;
                }
            } else {
                c915347j.A00 = min;
            }
            C915347j.A03 = (C915347j.A03 + 1) % 5;
        }
        if (c915347j.A00() != A00) {
            c915247i.A00();
        }
    }

    public final void A0f(String str) {
        if (!this.A5p) {
            if (str == null) {
                this.A1j.A04 = null;
                return;
            }
            C47s c47s = this.A1j;
            String str2 = c47s.A04;
            if (str2 != null && !str2.equals(str)) {
                C0w9.A03("overwriting_ssim_compare_video_path", AnonymousClass001.A0u("old ", str2, " new ", str));
            }
            c47s.A04 = str;
        }
    }

    public final void A0g(String str) {
        long A03;
        if (!this.A5p) {
            this.A3V = str;
            if (str == null) {
                A03 = -1;
            } else {
                A03 = AbstractC13530mf.A03(str);
            }
            this.A0d = A03;
        }
    }

    public final void A0h(String str, int i, boolean z) {
        float f;
        if (this.A1G == EnumC40111tc.A0Q) {
            A0T(EnumC40111tc.A0a);
            if (this.A10 == null) {
                f = this.A0H / this.A0G;
            } else {
                f = this.A1N.A00;
            }
            this.A3w = str;
            this.A02 = f;
            if (this.A1V.A00(C5JI.A09) == null) {
                this.A5F = true;
            }
            ClipInfo clipInfo = new ClipInfo(null, 16777215);
            clipInfo.A03 = -1;
            int i2 = this.A0H;
            int i3 = this.A0G;
            clipInfo.A09 = i2;
            clipInfo.A06 = i3;
            clipInfo.A0C = 0;
            clipInfo.A00 = f;
            clipInfo.A07 = 0;
            clipInfo.A05 = i;
            long j = i;
            clipInfo.A0A = j;
            clipInfo.A0F = str;
            List singletonList = Collections.singletonList(clipInfo);
            C14360o3.A07(singletonList);
            this.A4G = singletonList;
            if (this.A10 == null) {
                C14360o3.A0B(clipInfo, 0);
                this.A1N = clipInfo;
            } else {
                clipInfo = this.A1N;
                clipInfo.A03 = -1;
                clipInfo.A0C = 0;
                clipInfo.A07 = 0;
                clipInfo.A05 = i;
                clipInfo.A0A = j;
                clipInfo.A0F = str;
            }
            if (z) {
                clipInfo.A0D = this.A33;
                clipInfo.A0M = true;
            } else {
                this.A5j = true;
            }
            this.A33 = null;
            return;
        }
        throw new IllegalStateException("convertPhotoToVideo can only be called on PHOTO pending media");
    }

    public final void A0j(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C47Z c47z = (C47Z) it.next();
            arrayList.add(c47z.A35);
            c47z.A0W(new P6J(this));
        }
        synchronized (this) {
            this.A6F = AbstractC001800i.A0a(list);
            this.A4i = AbstractC001800i.A0a(arrayList);
        }
    }

    public final void A0k(boolean z) {
        C915247i c915247i = this.A6G;
        c915247i.A05 = z;
        C47Z c47z = c915247i.A02;
        if (c47z.A5w) {
            Iterator it = c47z.A0K().iterator();
            while (it.hasNext()) {
                ((C47Z) it.next()).A0k(z);
            }
        }
        c915247i.A00();
    }

    public final boolean A0l() {
        List A01 = C48r.A01(EnumC75383a5.A0k, this.A4b);
        if (A01 == null) {
            return false;
        }
        Iterator it = A01.iterator();
        while (it.hasNext()) {
            if (((C84823qW) it.next()).A0n == ProductType.CLIPS) {
                return true;
            }
        }
        return false;
    }

    public final boolean A0m() {
        C915247i c915247i = this.A6G;
        if (!c915247i.A05 && !c915247i.A02.A5g) {
            return false;
        }
        return true;
    }

    public final boolean A0n() {
        boolean z;
        BrandedContentTag brandedContentTag;
        List list = this.A4C;
        if (list != null && (brandedContentTag = (BrandedContentTag) AbstractC001800i.A0J(list)) != null) {
            z = brandedContentTag.A04;
        } else {
            z = false;
        }
        if (!this.A65 && !z) {
            return false;
        }
        return true;
    }

    public final boolean A0o() {
        Iterator it = this.A41.iterator();
        while (it.hasNext()) {
            if (AbstractC38048Gob.A01(((ProductTag) it.next()).A02).A04 != null) {
                return true;
            }
        }
        Iterator it2 = this.A4b.iterator();
        while (it2.hasNext()) {
            Product A0G = ((C84823qW) it2.next()).A0G();
            if (A0G != null && A0G.A04 != null) {
                return true;
            }
        }
        return false;
    }

    public final boolean A0q() {
        C9C9 c9c9;
        String str = this.A2Z;
        if ((str != null && str.length() != 0) || this.A0u != null) {
            return true;
        }
        if ((this.A00 != 0.0d && this.A01 != 0.0d) || this.A1H != null || (!this.A40.isEmpty()) || A0s() || CKm() || this.A1p != null || this.A2j != null || this.A3G != null || this.A1B != null || this.A1J != null) {
            return true;
        }
        if (A0t() && (!A0K().isEmpty())) {
            c9c9 = ((C47Z) A0K().get(0)).A0k;
        } else {
            c9c9 = this.A0k;
        }
        if (c9c9 != null) {
            return true;
        }
        return false;
    }

    public final boolean A0r() {
        boolean z;
        synchronized (this.A6H) {
            z = false;
            if (A0A() != null) {
                z = true;
            }
        }
        return z;
    }

    public final boolean A0t() {
        if (this.A1G != EnumC40111tc.A09) {
            return false;
        }
        return true;
    }

    public final boolean A0x() {
        if (this.A1G != EnumC40111tc.A0Q) {
            return false;
        }
        return true;
    }

    public final boolean A0y() {
        C115435Kd c115435Kd = this.A6I;
        if (c115435Kd != null) {
            return c115435Kd.A01.A04;
        }
        return true;
    }

    public final boolean A0z() {
        if (this.A1G == EnumC40111tc.A0Q) {
            if (this.A57 || AbstractC50707Ma2.A00(this) || this.A10 != null || (!this.A4t.isEmpty())) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean A10() {
        if (this.A1G != EnumC40111tc.A0R) {
            return false;
        }
        return true;
    }

    public final boolean A11() {
        if (this.A1G != EnumC40111tc.A0a) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC914447a
    public final EnumC76383bi AdS() {
        return this.A1F;
    }

    @Override // X.InterfaceC914447a
    public final MediaUploadMetadata BRy() {
        return this.A13;
    }

    @Override // X.InterfaceC914447a
    public final boolean BuB() {
        return this.A67;
    }

    @Override // X.InterfaceC914447a
    public final boolean CL0() {
        Iterator it = this.A4c.iterator();
        while (it.hasNext()) {
            if (((InterfaceC40171tl) it.next()).CVX()) {
                return true;
            }
        }
        return false;
    }

    @Override // X.InterfaceC914447a
    public final boolean CUC() {
        return this.A5T;
    }

    @Override // X.C1NI, X.InterfaceC38381qS, X.InterfaceC38411qV
    public final String getId() {
        return this.A3t;
    }

    public final String toString() {
        String str;
        int i;
        StringBuilder sb = new StringBuilder("Media type:");
        sb.append(this.A1G);
        sb.append("\tkey: ");
        sb.append(this.A35);
        sb.append("\nServer Status: ");
        sb.append(this.A1f);
        sb.append("\nTarget Status: ");
        sb.append(this.A6J);
        if (this.A1G == EnumC40111tc.A0a) {
            sb.append("\nSession name: ");
            sb.append(this.A3w);
            sb.append("\nRendered Video Path: ");
            sb.append(this.A3V);
        }
        C115435Kd c115435Kd = this.A6I;
        if (c115435Kd != null && c115435Kd.A02 != null) {
            sb.append("\nLast uploaded error: ");
            C115435Kd c115435Kd2 = this.A6I;
            if (c115435Kd2 != null) {
                str = c115435Kd2.A02;
            } else {
                str = null;
            }
            sb.append(str);
            sb.append("\nLast uploaded error code: ");
            C115435Kd c115435Kd3 = this.A6I;
            if (c115435Kd3 != null) {
                i = c115435Kd3.A00;
            } else {
                i = 0;
            }
            sb.append(i);
        }
        String obj = sb.toString();
        C14360o3.A07(obj);
        return obj;
    }

    public final float A01() {
        float height;
        int width;
        Rect A06 = A06();
        if (this.A08 % 180 == 0) {
            height = A06.width();
            width = A06.height();
        } else {
            height = A06.height();
            width = A06.width();
        }
        return height / width;
    }

    public final void A0V(C47Z c47z) {
        A0j(AbstractC001800i.A0T(c47z, AbstractC001800i.A0U(A0K())));
    }

    public final boolean A0p() {
        if (A0z() || this.A33 == null) {
            return false;
        }
        return true;
    }

    public final boolean A0s() {
        if (A0t()) {
            Iterator it = A0K().iterator();
            while (it.hasNext()) {
                if (((C47Z) it.next()).A0s()) {
                    return true;
                }
            }
            return false;
        }
        if (!this.A41.isEmpty()) {
            return true;
        }
        return false;
    }

    public final boolean A0u() {
        if (A0D() != ShareType.A08) {
            return false;
        }
        return true;
    }

    public final boolean A0v() {
        if (A0D() == ShareType.A0H) {
            if (A0x() || A11() || A0t()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean A0w() {
        if (A0D() != ShareType.A0J) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC914447a
    public final boolean CKm() {
        List list;
        if (A07() != null || ((list = this.A4C) != null && !list.isEmpty())) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC914447a
    public final boolean CKo() {
        Iterator it = A0K().iterator();
        while (it.hasNext()) {
            if (((C47Z) it.next()).A11()) {
                return true;
            }
        }
        return false;
    }

    @Override // X.InterfaceC914447a
    public final boolean Cq2() {
        return A0w();
    }

    @Override // X.InterfaceC914447a
    public final void EU4(boolean z) {
        this.A5T = z;
    }

    /* JADX WARN: Type inference failed for: r0v21, types: [X.47s, java.lang.Object] */
    public C47Z() {
        this.A1h = EnumC914547b.A05;
        this.A6G = new C915247i(this);
        EnumC915447k enumC915447k = EnumC915447k.A08;
        this.A1f = enumC915447k;
        this.A6J = enumC915447k;
        this.A5b = true;
        this.A5K = true;
        this.A1T = new C915547l();
        this.A1G = EnumC40111tc.A0Z;
        this.A35 = "";
        this.A2a = "";
        this.A3x = "";
        C16930sl c16930sl = C16930sl.A00;
        this.A4O = c16930sl;
        this.A3t = "";
        this.A40 = new ArrayList();
        this.A41 = new ArrayList();
        this.A45 = new HashMap();
        this.A20 = false;
        this.A4T = c16930sl;
        this.A1i = new C915647m();
        this.A0d = -1L;
        this.A03 = -1.0f;
        this.A4G = c16930sl;
        this.A1N = (ClipInfo) ClipInfo.A0Q.getValue();
        this.A0T = 100;
        this.A4E = c16930sl;
        this.A4D = c16930sl;
        this.A13 = new MediaUploadMetadata(null, null, null, null, null, null, null, null, null, null, null, false);
        this.A1k = ShareType.A0a;
        this.A0g = System.currentTimeMillis();
        this.A0L = 0;
        this.A4Y = c16930sl;
        this.A4b = c16930sl;
        this.A5P = true;
        this.A4h = c16930sl;
        this.A6H = new Object();
        this.A4c = c16930sl;
        this.A4u = new LinkedHashSet();
        this.A1F = EnumC76383bi.A06;
        this.A6F = c16930sl;
        this.A4i = c16930sl;
        this.A0j = new C9BS(null, null, 7, 3, false, false);
        ArrayList arrayList = new ArrayList();
        ?? obj = new Object();
        obj.A06 = arrayList;
        obj.A04 = null;
        obj.A02 = 0;
        obj.A01 = 0;
        obj.A03 = 0L;
        obj.A07 = false;
        obj.A00 = -1.0d;
        obj.A05 = "NO_INIT";
        this.A1j = obj;
        this.A4s = new LinkedHashSet();
        this.A1d = new C916047t();
        this.A1X = new C47u();
        this.A0W = -1L;
        this.A0V = -1L;
        this.A0J = -1;
        this.A4B = new ArrayList();
        this.A4A = c16930sl;
        this.A4m = c16930sl;
        this.A4n = c16930sl;
        this.A1V = new C47v(0.0f, 31);
        this.A48 = new ArrayList();
        this.A4t = new LinkedHashSet();
        this.A04 = 0;
    }
}
