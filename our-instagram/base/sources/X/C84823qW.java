package X;

import android.text.TextUtils;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.api.schemas.BusinessProfileDict;
import com.instagram.api.schemas.ClipsCreationEntryPoint;
import com.instagram.api.schemas.MediaVCRTappableData;
import com.instagram.api.schemas.PollType;
import com.instagram.api.schemas.SMBSupportStickerDict;
import com.instagram.api.schemas.StoryGroupMentionTappableData;
import com.instagram.api.schemas.StoryLinkInfoDict;
import com.instagram.api.schemas.StoryMusicPickTappableData;
import com.instagram.api.schemas.StoryPollColorType;
import com.instagram.api.schemas.StoryPromptTappableData;
import com.instagram.api.schemas.StoryThenAndNowStickerDict;
import com.instagram.api.schemas.SubscriptionStickerDict;
import com.instagram.api.schemas.TextReviewStatus;
import com.instagram.api.schemas.UpcomingEventStickerSource;
import com.instagram.api.schemas.WhatsAppChannelShareToIgStoryStickerTappableObjectImpl;
import com.instagram.common.session.UserSession;
import com.instagram.model.hashtag.Hashtag;
import com.instagram.model.hashtag.HashtagImpl;
import com.instagram.model.mediatype.ProductType;
import com.instagram.model.shopping.drops.DropsLaunchAnimation;
import com.instagram.model.shopping.reels.MultiProductSticker;
import com.instagram.model.shopping.reels.ProductSticker;
import com.instagram.model.upcomingeventsmetadata.UpcomingEventMediaImpl;
import com.instagram.model.venue.LocationDict;
import com.instagram.model.venue.Venue;
import com.instagram.music.common.model.MusicOverlayStickerModel;
import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;
import com.instagram.reels.prompt.model.PromptStickerModel;
import com.instagram.user.model.Product;
import com.instagram.user.model.ProductDetailsProductItemDict;
import com.instagram.user.model.UpcomingEventImpl;
import com.instagram.user.model.User;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.3qW, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C84823qW implements InterfaceC84833qX, InterfaceC84843qY {
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public float A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public int A09;
    public C31200Dnj A0A;
    public C45116Jxl A0B;
    public C102134ij A0C;
    public C102134ij A0D;
    public ClipsCreationEntryPoint A0E;
    public InterfaceC43579JMn A0F;
    public H3B A0G;
    public H3C A0H;
    public C9Z9 A0I;
    public H41 A0J;
    public MediaVCRTappableData A0K;
    public H4U A0L;
    public C38750H4q A0M;
    public C38751H4r A0N;
    public URE A0O;
    public SMBSupportStickerDict A0P;
    public H5I A0Q;
    public URL A0R;
    public H5X A0S;
    public C38760H5a A0T;
    public C38763H5d A0U;
    public StoryGroupMentionTappableData A0V;
    public StoryLinkInfoDict A0W;
    public StoryMusicPickTappableData A0X;
    public C211789a3 A0Y;
    public StoryPromptTappableData A0Z;
    public URM A0a;
    public URN A0b;
    public H68 A0c;
    public StoryThenAndNowStickerDict A0d;
    public SubscriptionStickerDict A0e;
    public C38797H6m A0f;
    public C38798H6n A0g;
    public UpcomingEventStickerSource A0h;
    public WhatsAppChannelShareToIgStoryStickerTappableObjectImpl A0i;
    public C66646URk A0j;
    public H7X A0k;
    public HashtagImpl A0l;
    public EnumC40111tc A0m;
    public ProductType A0n;
    public MultiProductSticker A0o;
    public C38820H7m A0p;
    public C38821H7n A0q;
    public ProductSticker A0r;
    public C38822H7p A0s;
    public UpcomingEventMediaImpl A0t;
    public LocationDict A0u;
    public MusicOverlayStickerModel A0v;
    public MusicOverlayStickerModel A0w;
    public Al9 A0x;
    public C66645URj A0y;
    public C189138Ze A0z;
    public C24018Akw A10;
    public EnumC75383a5 A11;
    public EnumC75383a5 A12;
    public AGS A13;
    public C8F9 A14;
    public C101394gx A15;
    public C22932A9c A16;
    public C106074qN A17;
    public C38561qk A18;
    public C51853Mvx A19;
    public C6RB A1A;
    public UpcomingEventImpl A1B;
    public User A1C;
    public C41743IeH A1D;
    public C41743IeH A1E;
    public C41743IeH A1F;
    public C41743IeH A1G;
    public C41743IeH A1H;
    public Boolean A1I;
    public Boolean A1J;
    public Float A1K;
    public Float A1L;
    public Integer A1M;
    public String A1N;
    public String A1O;
    public String A1P;
    public String A1Q;
    public String A1R;
    public String A1S;
    public String A1T;
    public String A1U;
    public String A1V;
    public String A1W;
    public String A1X;
    public String A1Y;
    public String A1Z;
    public String A1a;
    public String A1b;
    public String A1c;
    public String A1d;
    public String A1e;
    public String A1f;
    public String A1g;
    public String A1h;
    public String A1i;
    public String A1j;
    public String A1k;
    public String A1l;
    public String A1m;
    public String A1n;
    public String A1o;
    public List A1p;
    public boolean A1q;
    public boolean A1r;
    public boolean A1s;
    public boolean A1t;
    public boolean A1u;
    public boolean A1v;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C84823qW c84823qW = (C84823qW) obj;
            if (Float.compare(c84823qW.A03, this.A03) != 0 || Float.compare(c84823qW.A04, this.A04) != 0 || this.A09 != c84823qW.A09 || this.A1s != c84823qW.A1s || Float.compare(c84823qW.A02, this.A02) != 0 || Float.compare(c84823qW.A00, this.A00) != 0 || Float.compare(c84823qW.A01, this.A01) != 0 || Float.compare(c84823qW.A08, this.A08) != 0 || !C2I7.A00(this.A1L, c84823qW.A1L) || !C2I7.A00(this.A1K, c84823qW.A1K) || this.A1u != c84823qW.A1u || this.A1v != c84823qW.A1v || this.A1t != c84823qW.A1t || this.A12 != c84823qW.A12 || this.A07 != c84823qW.A07 || !C2I7.A00(this.A1m, c84823qW.A1m) || !C2I7.A00(this.A1C, c84823qW.A1C) || !C2I7.A00(A09(), c84823qW.A09()) || !C2I7.A00(this.A0l, c84823qW.A0l) || !C2I7.A00(this.A0r, c84823qW.A0r) || !C2I7.A00(this.A0o, c84823qW.A0o) || !C2I7.A00(this.A0p, c84823qW.A0p) || !C2I7.A00(this.A0s, c84823qW.A0s) || !C2I7.A00(this.A0q, c84823qW.A0q) || !C2I7.A00(this.A0R, c84823qW.A0R) || !C2I7.A00(this.A0z, c84823qW.A0z) || !C2I7.A00(this.A1T, c84823qW.A1T) || !C2I7.A00(this.A15, c84823qW.A15) || !C2I7.A00(this.A1M, c84823qW.A1M) || !C2I7.A00(this.A0O, c84823qW.A0O) || !C2I7.A00(this.A16, c84823qW.A16) || !C2I7.A00(this.A0Z, c84823qW.A0Z) || !C2I7.A00(this.A0X, c84823qW.A0X) || !C2I7.A00(this.A0y, c84823qW.A0y) || !C2I7.A00(this.A14, c84823qW.A14) || !C2I7.A00(this.A0x, c84823qW.A0x) || !C2I7.A00(this.A0B, c84823qW.A0B) || !C2I7.A00(this.A0a, c84823qW.A0a) || !C2I7.A00(this.A0b, c84823qW.A0b) || !C2I7.A00(this.A0v, c84823qW.A0v) || !C2I7.A00(this.A0w, c84823qW.A0w) || !C2I7.A00(this.A0k, c84823qW.A0k) || !C2I7.A00(this.A17, c84823qW.A17) || !C2I7.A00(this.A0D, c84823qW.A0D) || !C2I7.A00(this.A0C, c84823qW.A0C) || !C2I7.A00(this.A1Y, c84823qW.A1Y) || !C2I7.A00(this.A1b, c84823qW.A1b) || !C2I7.A00(this.A1a, c84823qW.A1a) || !C2I7.A00(this.A1P, c84823qW.A1P) || !C2I7.A00(this.A1c, c84823qW.A1c) || this.A0n != c84823qW.A0n || this.A0m != c84823qW.A0m || !C2I7.A00(this.A0E, c84823qW.A0E) || !C2I7.A00(this.A1O, c84823qW.A1O) || !C2I7.A00(this.A1S, c84823qW.A1S) || !C2I7.A00(this.A1h, c84823qW.A1h) || !C2I7.A00(this.A1J, c84823qW.A1J) || !C2I7.A00(this.A1Q, c84823qW.A1Q) || !C2I7.A00(this.A1X, c84823qW.A1X) || !C2I7.A00(this.A1D, c84823qW.A1D) || !C2I7.A00(this.A1E, c84823qW.A1E) || !C2I7.A00(this.A1F, c84823qW.A1F) || !C2I7.A00(this.A1G, c84823qW.A1G) || !C2I7.A00(this.A1H, c84823qW.A1H) || !C2I7.A00(this.A0W, c84823qW.A0W) || !C2I7.A00(this.A1l, c84823qW.A1l) || !C2I7.A00(this.A1j, c84823qW.A1j) || !C2I7.A00(this.A1i, c84823qW.A1i) || !C2I7.A00(this.A11, c84823qW.A11) || !C2I7.A00(this.A1Z, c84823qW.A1Z) || !C2I7.A00(this.A19, c84823qW.A19) || !C2I7.A00(this.A0e, c84823qW.A0e) || !C2I7.A00(this.A0c, c84823qW.A0c) || !C2I7.A00(this.A0S, c84823qW.A0S) || !C2I7.A00(this.A0T, c84823qW.A0T) || !C2I7.A00(this.A0K, c84823qW.A0K) || !C2I7.A00(this.A1d, c84823qW.A1d) || !C2I7.A00(this.A1p, c84823qW.A1p) || !C2I7.A00(this.A13, c84823qW.A13) || !C2I7.A00(this.A0V, c84823qW.A0V) || !C2I7.A00(this.A0d, c84823qW.A0d) || !C2I7.A00(this.A0f, c84823qW.A0f) || !C2I7.A00(this.A0G, c84823qW.A0G) || !C2I7.A00(this.A0H, c84823qW.A0H) || !C2I7.A00(this.A0M, c84823qW.A0M) || !C2I7.A00(this.A0N, c84823qW.A0N) || !C2I7.A00(this.A0Q, c84823qW.A0Q) || !C2I7.A00(this.A0Y, c84823qW.A0Y) || !C2I7.A00(this.A1U, c84823qW.A1U) || !C2I7.A00(this.A1V, c84823qW.A1V) || !C2I7.A00(this.A0i, c84823qW.A0i)) {
                return false;
            }
        }
        return true;
    }

    public static String A00(UserSession userSession, List list) {
        StringWriter stringWriter = new StringWriter();
        C17z A0A = AbstractC221915u.A00.A0A(stringWriter);
        A0A.A0c();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            A01(A0A, userSession, (C84823qW) it.next(), false);
        }
        A0A.A0Z();
        A0A.close();
        return stringWriter.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:257:0x0477, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A06, r28, 36323075293326241L) == false) goto L219;
     */
    /* JADX WARN: Code restructure failed: missing block: B:398:0x0711, code lost:
    
        if (X.C14360o3.A0K(r1.A06, true) == false) goto L343;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0149, code lost:
    
        if (r4 != 2) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01ad, code lost:
    
        if (r4 != 0) goto L60;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0049. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:82:0x019a  */
    /* JADX WARN: Type inference failed for: r2v132, types: [X.9kE, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A02(X.AnonymousClass182 r27, com.instagram.common.session.UserSession r28, X.C84823qW r29, boolean r30) {
        /*
            Method dump skipped, instructions count: 2568
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C84823qW.A02(X.182, com.instagram.common.session.UserSession, X.3qW, boolean):void");
    }

    public static void A03(AnonymousClass182 anonymousClass182, C84823qW c84823qW) {
        anonymousClass182.A0P("x", c84823qW.A03);
        anonymousClass182.A0P("y", c84823qW.A04);
        anonymousClass182.A0Q("z", c84823qW.A09);
        anonymousClass182.A0P(IgReactMediaPickerNativeModule.WIDTH, c84823qW.A02);
        anonymousClass182.A0P(IgReactMediaPickerNativeModule.HEIGHT, c84823qW.A00);
        anonymousClass182.A0P("rotation", c84823qW.A01);
    }

    public static void A04(AnonymousClass182 anonymousClass182, C84823qW c84823qW) {
        if (!TextUtils.isEmpty(c84823qW.A1O)) {
            anonymousClass182.A0S("attribution", c84823qW.A1O);
        }
        anonymousClass182.A0T("is_sticker", c84823qW.A1u);
        boolean z = c84823qW.A1v;
        if (z) {
            anonymousClass182.A0T("use_custom_title", z);
        }
        if (!TextUtils.isEmpty(c84823qW.A1h)) {
            anonymousClass182.A0S("display_type", c84823qW.A1h);
        }
        if (!TextUtils.isEmpty(c84823qW.A1X)) {
            anonymousClass182.A0S(AbstractC111324zv.A00(4572), c84823qW.A1X);
        }
    }

    public static void A05(AnonymousClass182 anonymousClass182, C84823qW c84823qW) {
        if (!TextUtils.isEmpty(c84823qW.A1m)) {
            anonymousClass182.A0S(AbstractC111324zv.A00(1329), c84823qW.A1m);
        }
        if (!TextUtils.isEmpty(c84823qW.A1Q)) {
            anonymousClass182.A0S("color", c84823qW.A1Q);
        }
        if (!TextUtils.isEmpty(c84823qW.A1U)) {
            anonymousClass182.A0S(AbstractC111324zv.A00(4459), c84823qW.A1U);
        }
    }

    public static void A06(C84823qW c84823qW) {
        String id;
        if (c84823qW.A0r == null) {
            DropsLaunchAnimation dropsLaunchAnimation = new DropsLaunchAnimation(true);
            String str = c84823qW.A1b;
            if (str == null) {
                str = null;
            }
            ProductDetailsProductItemDict A02 = AbstractC38048Gob.A02();
            List emptyList = Collections.emptyList();
            TextReviewStatus textReviewStatus = TextReviewStatus.A04;
            User user = c84823qW.A1C;
            if (user == null) {
                id = null;
            } else {
                id = user.getId();
            }
            c84823qW.A0r = new ProductSticker(null, textReviewStatus, dropsLaunchAnimation, A02, false, false, null, null, null, str, "", null, id, null, emptyList);
        }
    }

    public final TextReviewStatus A07() {
        ProductSticker productSticker = this.A0r;
        if (productSticker != null) {
            TextReviewStatus textReviewStatus = productSticker.A01;
            if (textReviewStatus == null) {
                return TextReviewStatus.A04;
            }
            return textReviewStatus;
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.6RN, java.lang.Object] */
    public final C6RN A08() {
        StoryLinkInfoDict storyLinkInfoDict = this.A0W;
        if (storyLinkInfoDict == null) {
            return null;
        }
        ?? obj = new Object();
        obj.A00 = storyLinkInfoDict;
        return obj;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.instagram.model.venue.Venue, java.lang.Object] */
    public final Venue A09() {
        LocationDict locationDict = this.A0u;
        if (locationDict != null) {
            ?? obj = new Object();
            obj.A00 = locationDict;
            return obj;
        }
        return null;
    }

    public final C24012Akq A0A() {
        C66645URj c66645URj = this.A0y;
        if (c66645URj == null) {
            return null;
        }
        return AbstractC69977Vyu.A01(c66645URj);
    }

    public final AlB A0B() {
        C189138Ze c189138Ze = this.A0z;
        if (c189138Ze != null) {
            return new AlB(c189138Ze);
        }
        return null;
    }

    public final C217859kI A0C() {
        StoryGroupMentionTappableData storyGroupMentionTappableData = this.A0V;
        if (storyGroupMentionTappableData == null) {
            return null;
        }
        String str = this.A1W;
        C217859kI c217859kI = new C217859kI(storyGroupMentionTappableData);
        c217859kI.A02 = str;
        return c217859kI;
    }

    public final C101394gx A0D() {
        if (this.A1M != null) {
            C101394gx c101394gx = this.A15;
            c101394gx.getClass();
            if (c101394gx.A0A == null) {
                List A01 = AbstractC37865GlK.A01(this.A15);
                ArrayList arrayList = new ArrayList(A01.size());
                boolean z = false;
                for (int i = 0; i < A01.size(); i++) {
                    InterfaceC101384gv interfaceC101384gv = (InterfaceC101384gv) A01.get(i);
                    int intValue = this.A1M.intValue();
                    int A012 = AbstractC41657Ibp.A01(interfaceC101384gv);
                    if (i == intValue) {
                        A012++;
                    }
                    arrayList.add(new C101374gu(interfaceC101384gv.B7g(), Integer.valueOf(A012), interfaceC101384gv.getText()));
                }
                new C1DY(new C37761pD(null), 6, z);
                C101394gx c101394gx2 = this.A15;
                StoryPollColorType storyPollColorType = c101394gx2.A02;
                Boolean bool = c101394gx2.A04;
                Boolean bool2 = c101394gx2.A05;
                String str = c101394gx2.A0C;
                PollType pollType = PollType.A05;
                List list = c101394gx2.A0E;
                return AbstractC34282FAc.A00(pollType, null, storyPollColorType, false, bool, bool2, false, c101394gx2.A07, null, null, this.A1M, null, str, c101394gx2.A0D, list, arrayList);
            }
        }
        return this.A15;
    }

    public final PromptStickerModel A0E() {
        StoryPromptTappableData storyPromptTappableData = this.A0Z;
        if (storyPromptTappableData == null) {
            return null;
        }
        return new PromptStickerModel(storyPromptTappableData);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.Wm2, java.lang.Object] */
    public final Wm2 A0F() {
        URN urn = this.A0b;
        if (urn == null) {
            return null;
        }
        ?? obj = new Object();
        obj.A00 = urn;
        return obj;
    }

    public final Product A0I() {
        ProductDetailsProductItemDict productDetailsProductItemDict;
        C38821H7n c38821H7n = this.A0q;
        if (c38821H7n == null || (productDetailsProductItemDict = c38821H7n.A00) == null) {
            return null;
        }
        return new Product(null, productDetailsProductItemDict);
    }

    public final String A0J() {
        ProductSticker productSticker = this.A0r;
        if (productSticker != null) {
            List list = productSticker.A0E;
            if (list == null) {
                list = C16930sl.A00;
            }
            if (!list.isEmpty()) {
                return I48.A00(this.A0r);
            }
            return null;
        }
        return null;
    }

    public final String A0K() {
        String str;
        ProductSticker productSticker = this.A0r;
        productSticker.getClass();
        String str2 = productSticker.A0A;
        if (A0H().A0J != null) {
            str = A0H().A0J;
        } else {
            str = "";
        }
        if (TextUtils.isEmpty(str2)) {
            return str.toUpperCase(C1Q2.A02());
        }
        return str2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:100:0x010a, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, r5, 36328452592254501L) == false) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0118, code lost:
    
        if (java.lang.Boolean.valueOf(r0).booleanValue() != false) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x007f, code lost:
    
        if (r0 != null) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x018b, code lost:
    
        if (r0 != false) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x015e, code lost:
    
        if (android.text.TextUtils.isEmpty(r3.A1S) == false) goto L120;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:123:0x0171. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:37:0x004d. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:38:0x0050. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:39:0x0053. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0158  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String A0L(android.content.res.Resources r4, com.instagram.common.session.UserSession r5) {
        /*
            Method dump skipped, instructions count: 504
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C84823qW.A0L(android.content.res.Resources, com.instagram.common.session.UserSession):java.lang.String");
    }

    public final List A0M() {
        MultiProductSticker multiProductSticker = this.A0o;
        multiProductSticker.getClass();
        return AbstractC38048Gob.A04(multiProductSticker.A09);
    }

    public final boolean A0N() {
        C41743IeH c41743IeH = this.A1G;
        if (c41743IeH != null) {
            String str = c41743IeH.A09;
            if (str != null && str.startsWith(AbstractC111324zv.A00(1990))) {
                return true;
            }
            if (str != null && str.startsWith(AbstractC111324zv.A00(1989))) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // X.InterfaceC84833qX
    public final float BDQ() {
        return this.A00;
    }

    @Override // X.InterfaceC84833qX
    public final float BpY() {
        return this.A01;
    }

    @Override // X.InterfaceC84833qX
    public final float CHe() {
        return this.A02;
    }

    @Override // X.InterfaceC84833qX
    public final float CI0() {
        return this.A03;
    }

    @Override // X.InterfaceC84833qX
    public final float CIZ() {
        return this.A04;
    }

    public final int hashCode() {
        Object[] objArr = new Object[93];
        System.arraycopy(new Object[]{this.A12, Float.valueOf(this.A03), Float.valueOf(this.A04), Integer.valueOf(this.A09), Float.valueOf(this.A02), Float.valueOf(this.A00), Float.valueOf(this.A01), Integer.valueOf(this.A08), this.A1L, this.A1K, this.A1m, this.A1U, this.A1V, this.A1C, A09(), this.A0l, this.A0r, this.A0o, this.A0p, this.A0s, this.A0q, this.A0R, this.A0z, this.A1T, this.A0P, this.A15, this.A1M}, 0, objArr, 0, 27);
        System.arraycopy(new Object[]{this.A0O, this.A16, this.A0Z, this.A0X, this.A0y, this.A14, this.A0x, this.A0B, this.A0a, this.A0b, this.A0v, this.A0w, this.A0k, this.A17, this.A0D, this.A0C, this.A1Y, this.A1b, this.A1a, this.A1P, this.A1c, this.A0n, this.A0m, this.A0E, this.A1O, Boolean.valueOf(this.A1u), Boolean.valueOf(this.A1v)}, 0, objArr, 27, 27);
        System.arraycopy(new Object[]{this.A1S, this.A1h, this.A1J, this.A1Q, this.A1X, Boolean.valueOf(this.A1t), this.A1D, this.A1E, this.A1H, this.A0W, this.A1F, this.A1G, Boolean.valueOf(this.A1s), Integer.valueOf(this.A07), this.A1l, this.A1j, this.A1i, this.A11, this.A1Z, this.A19, this.A0e, this.A0c, this.A0S, this.A0T, this.A0K, this.A1d, this.A1p}, 0, objArr, 54, 27);
        System.arraycopy(new Object[]{Integer.valueOf(this.A05), this.A13, this.A0V, this.A0d, this.A0f, this.A0G, this.A0H, this.A0N, this.A0M, this.A0Y, this.A0Q, this.A0i}, 0, objArr, 81, 12);
        return Arrays.hashCode(objArr);
    }

    public final String toString() {
        String str;
        String str2;
        BusinessProfileDict businessProfileDict;
        StringBuilder sb = new StringBuilder("ReelInteractiveType: ");
        sb.append(this.A12.A00);
        sb.append("\tx: ");
        sb.append(this.A03);
        sb.append("\ty: ");
        sb.append(this.A04);
        sb.append("\tz: ");
        sb.append(this.A09);
        sb.append("\twidth: ");
        sb.append(this.A02);
        sb.append("\theight: ");
        sb.append(this.A00);
        sb.append("\trotation: ");
        sb.append(this.A01);
        String str3 = this.A1m;
        if (str3 != null) {
            sb.append("\ntemplate_sticker_id: ");
            sb.append(str3);
        }
        String str4 = this.A1U;
        if (str4 != null) {
            sb.append("\nfillable_element_type: ");
            sb.append(str4);
        }
        String str5 = this.A1V;
        if (str5 != null) {
            sb.append("\ngallery_fillable_type: ");
            sb.append(str5);
        }
        User user = this.A1C;
        if (user != null) {
            sb.append("\nuser: ");
            sb.append(user.getId());
        }
        if (this.A0u != null) {
            sb.append("\nlocation: ");
            Venue A09 = A09();
            A09.getClass();
            sb.append(A09.A00.getName());
        }
        HashtagImpl hashtagImpl = this.A0l;
        if (hashtagImpl != null) {
            sb.append("\nhashtag: ");
            sb.append(hashtagImpl.A0D);
        }
        ProductSticker productSticker = this.A0r;
        if (productSticker != null) {
            sb.append("\nproduct_sticker: ");
            String str6 = productSticker.A0A;
            if (str6 == null) {
                str6 = "";
            }
            sb.append(str6);
        }
        MultiProductSticker multiProductSticker = this.A0o;
        if (multiProductSticker != null) {
            sb.append("\nmulti_product_sticker: ");
            String str7 = multiProductSticker.A03;
            if (str7 == null) {
                str7 = "";
            }
            sb.append(str7);
        }
        C38820H7m c38820H7m = this.A0p;
        if (c38820H7m != null) {
            sb.append("\nseller_collection_sticker: ");
            sb.append(c38820H7m.A06);
        }
        C38822H7p c38822H7p = this.A0s;
        if (c38822H7p != null) {
            sb.append("\nstorefront_sticker: ");
            sb.append(c38822H7p.A03);
        }
        C38821H7n c38821H7n = this.A0q;
        if (c38821H7n != null) {
            sb.append("\nproduct_share_sticker: ");
            sb.append(c38821H7n.A00);
        }
        URL url = this.A0R;
        if (url != null) {
            sb.append("\ncountdown_sticker: ");
            sb.append(url.A06);
        }
        C189138Ze c189138Ze = this.A0z;
        if (c189138Ze != null) {
            sb.append("\nfundraiser_sticker: ");
            sb.append(c189138Ze.A08);
        }
        String str8 = this.A1T;
        if (str8 != null) {
            sb.append("\nfb_fundraiser_sticker: ");
            sb.append(str8);
        }
        SMBSupportStickerDict sMBSupportStickerDict = this.A0P;
        if (sMBSupportStickerDict != null && (businessProfileDict = sMBSupportStickerDict.A00) != null) {
            sb.append("\nsmb_support_sticker: ");
            sb.append(businessProfileDict.getId());
        }
        C101394gx c101394gx = this.A15;
        if (c101394gx != null) {
            sb.append("\npoll_sticker: ");
            sb.append(AbstractC37865GlK.A00(c101394gx));
        }
        Integer num = this.A1M;
        if (num != null) {
            sb.append("\npending_viewer_vote: ");
            sb.append(num);
        }
        URE ure = this.A0O;
        if (ure != null) {
            sb.append("\nquestion_sticker: ");
            sb.append(ure.A08);
        }
        C22932A9c c22932A9c = this.A16;
        if (c22932A9c != null) {
            sb.append("\nquestion_response: ");
            sb.append(c22932A9c.A04);
        }
        StoryPromptTappableData storyPromptTappableData = this.A0Z;
        if (storyPromptTappableData != null) {
            sb.append("\nprompt_sticker: ");
            sb.append(storyPromptTappableData.A0Q);
        }
        StoryMusicPickTappableData storyMusicPickTappableData = this.A0X;
        if (storyMusicPickTappableData != null) {
            sb.append("\nmusic_pick_sticker: ");
            sb.append(storyMusicPickTappableData.A06);
        }
        C66645URj c66645URj = this.A0y;
        if (c66645URj != null) {
            sb.append("\nchat_sticker: ");
            sb.append(c66645URj.A0M);
        }
        C8F9 c8f9 = this.A14;
        if (c8f9 != null) {
            sb.append("\nmessage_share_sticker: ");
            sb.append(c8f9.A07);
        }
        Al9 al9 = this.A0x;
        if (al9 != null) {
            sb.append("\nchallenge_chat_sticker: ");
            sb.append(al9.A00.A03);
        }
        C45116Jxl c45116Jxl = this.A0B;
        if (c45116Jxl != null) {
            sb.append("\nprompt_v2_shareable_sticker: ");
            sb.append(c45116Jxl.A00);
        }
        URM urm = this.A0a;
        if (urm != null) {
            sb.append("\nquiz_sticker: ");
            sb.append(urm.A06);
        }
        URN urn = this.A0b;
        if (urn != null) {
            sb.append("\nslider_sticker: ");
            sb.append(urn.A08);
        }
        MusicOverlayStickerModel musicOverlayStickerModel = this.A0v;
        if (musicOverlayStickerModel != null || (musicOverlayStickerModel = this.A0w) != null) {
            sb.append("\nmusic_overlay_sticker: ");
            sb.append(musicOverlayStickerModel.A0m);
        }
        H7X h7x = this.A0k;
        if (h7x != null) {
            sb.append("\nelection_sticker: ");
            sb.append(h7x.A00);
        }
        C106074qN c106074qN = this.A17;
        if (c106074qN != null) {
            sb.append("\nreaction_sticker: ");
            sb.append(c106074qN.A00);
        }
        C102134ij c102134ij = this.A0C;
        if (c102134ij != null) {
            sb.append("\navatar_sticker: ");
            sb.append(c102134ij.A04);
        }
        C41743IeH c41743IeH = this.A1D;
        if (c41743IeH != null) {
            sb.append("\nanti_bully_eng_only: ");
            sb.append(c41743IeH.A09);
        }
        C41743IeH c41743IeH2 = this.A1E;
        if (c41743IeH2 != null) {
            sb.append("\nanti_bully_global: ");
            sb.append(c41743IeH2.A09);
        }
        C41743IeH c41743IeH3 = this.A1H;
        if (c41743IeH3 != null) {
            sb.append("\nvoter_registration: ");
            sb.append(c41743IeH3.A09);
        }
        StoryLinkInfoDict storyLinkInfoDict = this.A0W;
        if (storyLinkInfoDict != null) {
            sb.append("\nstory_link: ");
            sb.append(storyLinkInfoDict.A0A);
        }
        H5X h5x = this.A0S;
        if (h5x != null) {
            sb.append("\nfb_entity_type: ");
            sb.append(h5x.A03);
            sb.append("\nfb_entity_id: ");
            sb.append(h5x.A01);
        }
        C38760H5a c38760H5a = this.A0T;
        if (c38760H5a != null) {
            sb.append("\nfb_tag_sticker: tagId: ");
            sb.append(c38760H5a.A00);
            sb.append("\nfb_tag_sticker: tagType: ");
            sb.append(c38760H5a.A02);
        }
        C41743IeH c41743IeH4 = this.A1F;
        if (c41743IeH4 != null) {
            sb.append("\nbloks_sticker: ");
            sb.append(c41743IeH4.A09);
        }
        C41743IeH c41743IeH5 = this.A1G;
        if (c41743IeH5 != null) {
            sb.append("\nbloks_tappable: ");
            sb.append(c41743IeH5.A09);
        }
        String str9 = this.A1Y;
        if (str9 != null) {
            sb.append("\nsound_on: ");
            sb.append(str9);
        }
        String str10 = this.A1b;
        if (str10 != null) {
            sb.append("\nmedia_id: ");
            sb.append(str10);
        }
        String str11 = this.A1a;
        if (str11 != null) {
            sb.append("\nmedia_compound_id: ");
            sb.append(str11);
        }
        String str12 = this.A1P;
        if (str12 != null) {
            sb.append("\ncarousel_share_child_media_id: ");
            sb.append(str12);
        }
        String str13 = this.A1c;
        if (str13 != null) {
            sb.append("\nmedia_owner_id: ");
            sb.append(str13);
        }
        ProductType productType = this.A0n;
        if (productType != null) {
            sb.append("\nproduct_type: ");
            sb.append(productType.A00);
        }
        EnumC40111tc enumC40111tc = this.A0m;
        if (enumC40111tc != null) {
            sb.append("\nmedia_type: ");
            sb.append(enumC40111tc.A00);
        }
        ClipsCreationEntryPoint clipsCreationEntryPoint = this.A0E;
        if (clipsCreationEntryPoint != null) {
            sb.append("\nclips_creation_entry_point: ");
            sb.append(clipsCreationEntryPoint);
        }
        String str14 = this.A1O;
        if (str14 != null) {
            sb.append("\nattribution: ");
            sb.append(str14);
        }
        String str15 = this.A1S;
        if (str15 != null) {
            sb.append("\nproduct_type: ");
            sb.append(str15);
        }
        String str16 = this.A1h;
        if (str16 != null) {
            sb.append("\nsticker_display_type: ");
            sb.append(str16);
        }
        Boolean bool = this.A1J;
        if (bool != null) {
            sb.append("\nshould_render_soundwave: ");
            sb.append(bool);
        }
        String str17 = this.A1Q;
        if (str17 != null) {
            sb.append("\ncolor_string: ");
            sb.append(str17);
        }
        String str18 = this.A1X;
        if (str18 != null) {
            sb.append("\nhighlighted_media_ids: ");
            sb.append(str18);
        }
        if (this.A1u) {
            sb.append("\nis_sticker");
        }
        if (this.A1v) {
            sb.append("\nuse_custom_title");
        }
        if (this.A1t) {
            sb.append("\nis_hidden");
        }
        if (this.A1s) {
            sb.append("\nis_fb_sticker");
        }
        String str19 = this.A1j;
        if (str19 != null) {
            sb.append("\nstr_id: ");
            sb.append(str19);
        }
        String str20 = this.A1i;
        if (str20 != null) {
            sb.append("\nsticker_type: ");
            sb.append(str20);
        }
        EnumC75383a5 enumC75383a5 = this.A11;
        if (enumC75383a5 != null) {
            sb.append("\nobject_type: ");
            sb.append(enumC75383a5);
        }
        String str21 = this.A1Z;
        if (str21 != null) {
            sb.append("\nimage_id: ");
            sb.append(str21);
        }
        C51853Mvx c51853Mvx = this.A19;
        if (c51853Mvx != null) {
            sb.append("\nbadges_supporter_thank_you_sticker: ");
            sb.append(c51853Mvx.A06);
        }
        MediaVCRTappableData mediaVCRTappableData = this.A0K;
        if (mediaVCRTappableData != null) {
            sb.append("\nvisual_comment_reply_sticker: ");
            sb.append(mediaVCRTappableData.A04);
        }
        String str22 = this.A1d;
        if (str22 != null) {
            sb.append("\nmerchant_id: ");
            sb.append(str22);
        }
        List list = this.A1p;
        if (list != null) {
            sb.append("\nproduct_ids: ");
            sb.append(list);
        }
        StoryGroupMentionTappableData storyGroupMentionTappableData = this.A0V;
        if (storyGroupMentionTappableData != null) {
            sb.append("\ngroup_mention_sticker: ");
            sb.append(storyGroupMentionTappableData.A03);
        }
        C38797H6m c38797H6m = this.A0f;
        if (c38797H6m != null && (str2 = c38797H6m.A0H) != null) {
            sb.append("\ntext_post_attribution_url: ");
            sb.append(str2);
        }
        WhatsAppChannelShareToIgStoryStickerTappableObjectImpl whatsAppChannelShareToIgStoryStickerTappableObjectImpl = this.A0i;
        if (whatsAppChannelShareToIgStoryStickerTappableObjectImpl != null && (str = whatsAppChannelShareToIgStoryStickerTappableObjectImpl.A0H) != null) {
            sb.append("\nwhatsapp_channel_attribution_url: ");
            sb.append(str);
        }
        return sb.toString();
    }

    public C84823qW(Hashtag hashtag) {
        this.A06 = -1;
        this.A1J = false;
        this.A1l = "";
        this.A1j = "";
        this.A1i = "";
        this.A1g = "view";
        this.A1I = false;
        this.A1q = false;
        this.A08 = 0;
        this.A0l = hashtag.F59();
        this.A12 = EnumC75383a5.A0d;
    }

    public static void A01(AnonymousClass182 anonymousClass182, UserSession userSession, C84823qW c84823qW, boolean z) {
        anonymousClass182.A0d();
        A03(anonymousClass182, c84823qW);
        A05(anonymousClass182, c84823qW);
        anonymousClass182.A0S(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, c84823qW.A12.A00);
        A02(anonymousClass182, userSession, c84823qW, z);
        A04(anonymousClass182, c84823qW);
        anonymousClass182.A0Q("tap_state", c84823qW.A07);
        anonymousClass182.A0S(AbstractC111324zv.A00(539), c84823qW.A1l);
        anonymousClass182.A0a();
    }

    public final Product A0G() {
        A06(this);
        ProductSticker productSticker = this.A0r;
        productSticker.getClass();
        ProductDetailsProductItemDict productDetailsProductItemDict = productSticker.A03;
        if (productDetailsProductItemDict != null) {
            return AbstractC38048Gob.A01(productDetailsProductItemDict);
        }
        return null;
    }

    public final Product A0H() {
        A06(this);
        ProductSticker productSticker = this.A0r;
        productSticker.getClass();
        ProductDetailsProductItemDict productDetailsProductItemDict = productSticker.A03;
        if (productDetailsProductItemDict == null) {
            productDetailsProductItemDict = AbstractC38048Gob.A02();
        }
        return AbstractC38048Gob.A01(productDetailsProductItemDict);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0049, code lost:
    
        if (r13.intValue() != 1) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0055, code lost:
    
        if (r14.intValue() != 1) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C84823qW(X.EnumC75383a5 r6, java.lang.Float r7, java.lang.Float r8, java.lang.Float r9, java.lang.Float r10, java.lang.Float r11, java.lang.Float r12, java.lang.Integer r13, java.lang.Integer r14, java.lang.Integer r15, java.lang.String r16, java.lang.String r17, java.lang.String r18) {
        /*
            r5 = this;
            r5.<init>()
            r0 = -1
            r5.A06 = r0
            r2 = 0
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r2)
            r5.A1J = r3
            java.lang.String r1 = ""
            r5.A1l = r1
            r5.A1j = r1
            r5.A1i = r1
            java.lang.String r0 = "view"
            r5.A1g = r0
            r5.A1I = r3
            r5.A1q = r2
            r5.A08 = r2
            r3 = 0
            if (r7 != 0) goto L8a
            r0 = 0
        L23:
            r5.A03 = r0
            if (r8 != 0) goto L85
            r0 = 0
        L28:
            r5.A04 = r0
            if (r9 != 0) goto L80
            r0 = 0
        L2d:
            r5.A09 = r0
            if (r10 != 0) goto L7b
            r0 = 0
        L32:
            r5.A02 = r0
            if (r11 != 0) goto L76
            r0 = 0
        L37:
            r5.A00 = r0
            if (r12 == 0) goto L3f
            float r3 = r12.floatValue()
        L3f:
            r5.A01 = r3
            r4 = 1
            if (r13 == 0) goto L4b
            int r0 = r13.intValue()
            r3 = 1
            if (r0 == r4) goto L4c
        L4b:
            r3 = 0
        L4c:
            r5.A1t = r3
            if (r14 == 0) goto L57
            int r0 = r14.intValue()
            r3 = 1
            if (r0 == r4) goto L58
        L57:
            r3 = 0
        L58:
            r5.A1u = r3
            if (r15 == 0) goto L63
            int r0 = r15.intValue()
            if (r0 != r4) goto L63
            r2 = 1
        L63:
            r5.A1s = r2
            r0 = r16
            r5.A1h = r0
            r0 = r17
            r5.A1O = r0
            if (r18 == 0) goto L71
            r1 = r18
        L71:
            r5.A1Y = r1
            r5.A12 = r6
            return
        L76:
            float r0 = r11.floatValue()
            goto L37
        L7b:
            float r0 = r10.floatValue()
            goto L32
        L80:
            int r0 = r9.intValue()
            goto L2d
        L85:
            float r0 = r8.floatValue()
            goto L28
        L8a:
            float r0 = r7.floatValue()
            goto L23
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C84823qW.<init>(X.3a5, java.lang.Float, java.lang.Float, java.lang.Float, java.lang.Float, java.lang.Float, java.lang.Float, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String):void");
    }

    public C84823qW(User user) {
        this.A06 = -1;
        this.A1J = false;
        this.A1l = "";
        this.A1j = "";
        this.A1i = "";
        this.A1g = "view";
        this.A1I = false;
        this.A1q = false;
        this.A08 = 0;
        this.A1C = user;
        this.A12 = EnumC75383a5.A0n;
    }

    public C84823qW() {
        this.A06 = -1;
        this.A1J = false;
        this.A1l = "";
        this.A1j = "";
        this.A1i = "";
        this.A1g = "view";
        this.A1I = false;
        this.A1q = false;
        this.A08 = 0;
        this.A12 = EnumC75383a5.A1J;
    }
}
