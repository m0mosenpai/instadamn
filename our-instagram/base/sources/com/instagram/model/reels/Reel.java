package com.instagram.model.reels;

import X.AbstractC109224vo;
import X.AbstractC152686tv;
import X.AbstractC25651Mw;
import X.AbstractC41071vF;
import X.AbstractC50102Ry;
import X.AbstractC73343Qk;
import X.AbstractC74053Tw;
import X.AbstractC81033jX;
import X.AnonymousClass001;
import X.C00O;
import X.C05F;
import X.C06090Tz;
import X.C0w9;
import X.C104294ms;
import X.C105774po;
import X.C105794pq;
import X.C105804pr;
import X.C105814ps;
import X.C105824pt;
import X.C105844pv;
import X.C105854pw;
import X.C105864px;
import X.C105874py;
import X.C109894xH;
import X.C109954xP;
import X.C11500j9;
import X.C11520jB;
import X.C130565v1;
import X.C18C;
import X.C18U;
import X.C1NB;
import X.C1NI;
import X.C1NM;
import X.C37771pE;
import X.C37881pR;
import X.C38091pt;
import X.C38161q3;
import X.C38211qB;
import X.C38321qM;
import X.C38491qd;
import X.C38541qi;
import X.C38561qk;
import X.C38641qv;
import X.C38681qz;
import X.C3DH;
import X.C3PO;
import X.C40861ut;
import X.C40971v4;
import X.C41181vS;
import X.C41661wG;
import X.C41691wJ;
import X.C41751wP;
import X.C42557Isb;
import X.C5G5;
import X.C5I8;
import X.EnumC76383bi;
import X.InterfaceC105354oy;
import X.InterfaceC38121pw;
import android.os.SystemClock;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.common.stringformat.StringFormatUtil;
import com.facebook.forker.Process;
import com.instagram.api.schemas.CarouselRenderingType;
import com.instagram.api.schemas.FanClubStoriesTeaserType;
import com.instagram.api.schemas.HallpassDetailsDict;
import com.instagram.api.schemas.HighlightReelTypeStr;
import com.instagram.api.schemas.IGAdsCardStickerCTATypeEnum;
import com.instagram.api.schemas.IntentAwareAdsInfo;
import com.instagram.api.schemas.RingSpec;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.typedurl.SimpleImageUrl;
import com.instagram.model.effect.AttributedAREffect;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.user.model.FollowStatus;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class Reel implements C1NI {
    public int A00;
    public int A02;
    public long A03;
    public CarouselRenderingType A06;
    public HighlightReelTypeStr A09;
    public C38161q3 A0A;
    public IntentAwareAdsInfo A0B;
    public C42557Isb A0E;
    public C38321qM A0F;
    public AttributedAREffect A0G;
    public C105824pt A0H;
    public C38541qi A0I;
    public C105864px A0K;
    public C38091pt A0L;
    public C38491qd A0M;
    public C37771pE A0N;
    public C5G5 A0O;
    public ReelType A0P;
    public C104294ms A0Q;
    public C105844pv A0R;
    public C105874py A0S;
    public C105774po A0T;
    public C105804pr A0U;
    public C105794pq A0V;
    public C1NB A0W;
    public C37881pR A0X;
    public InterfaceC105354oy A0Y;
    public C38211qB A0Z;
    public C105854pw A0a;
    public C40861ut A0b;
    public Boolean A0c;
    public Integer A0d;
    public Integer A0e;
    public Integer A0f;
    public Integer A0g;
    public Integer A0h;
    public Integer A0i;
    public Long A0j;
    public Long A0k;
    public Long A0l;
    public Long A0m;
    public String A0n;
    public String A0p;
    public String A0q;
    public String A0r;
    public String A0s;
    public ArrayList A0t;
    public ArrayList A0u;
    public List A0w;
    public List A0x;
    public List A10;
    public List A11;
    public List A12;
    public List A17;
    public List A18;
    public boolean A1C;
    public boolean A1F;
    public boolean A1G;
    public boolean A1H;
    public boolean A1K;
    public boolean A1L;
    public boolean A1M;
    public boolean A1N;
    public boolean A1P;
    public boolean A1R;
    public boolean A1S;
    public boolean A1V;
    public boolean A1W;
    public boolean A1X;
    public boolean A1Y;
    public boolean A1Z;
    public boolean A1a;
    public boolean A1c;
    public boolean A1d;
    public boolean A1e;
    public RingSpec A1g;
    public C38561qk A1h;
    public boolean A1l;
    public boolean A1m;
    public final String A1o;
    public static final C1NM A1s = new Object();
    public static final Integer A1r = 10;
    public boolean A1U = false;
    public Set A19 = Collections.emptySet();
    public List A15 = Collections.emptyList();
    public List A0v = Collections.emptyList();
    public List A13 = Collections.emptyList();
    public List A1j = Collections.emptyList();
    public List A0y = Collections.emptyList();
    public Set A1A = Collections.emptySet();
    public volatile boolean A1q = true;
    public long A04 = -9223372036854775807L;
    public long A05 = -9223372036854775807L;
    public int A01 = -1;
    public boolean A1b = false;
    public boolean A1B = true;
    public final Object A1n = new Object();
    public Map A1k = new HashMap();
    public HallpassDetailsDict A08 = null;
    public boolean A1Q = true;
    public boolean A1T = true;
    public boolean A1I = false;
    public List A14 = null;
    public C38681qz A0D = null;
    public C38641qv A0C = null;
    public boolean A1E = false;
    public List A0z = null;
    public final List A1p = new ArrayList();
    public boolean A1f = false;
    public FanClubStoriesTeaserType A07 = FanClubStoriesTeaserType.A05;
    public InterfaceC38121pw A0J = null;
    public boolean A1J = false;
    public Boolean A1i = null;
    public String A0o = null;
    public List A16 = null;
    public boolean A1D = false;
    public boolean A1O = false;

    public Reel(Integer num, List list, List list2) {
        String str;
        switch (num.intValue()) {
            case 0:
                str = "story_interstitial_chaining";
                break;
            case 1:
                str = "story_interstitial_roll_call";
                break;
            case 2:
                str = "story_interstitial_fan_club_teaser";
                break;
            default:
                str = "story_interstitial_pog_garden_chaining";
                break;
        }
        this.A1o = str;
        this.A0W = null;
        this.A1a = false;
        this.A0h = num;
        this.A1W = true;
        this.A0k = Long.valueOf(System.currentTimeMillis());
        this.A0g = A1r;
        if (num == C05F.A00 || num == C05F.A0N) {
            this.A11 = list;
            this.A12 = list2;
        }
    }

    public final synchronized List A0N() {
        return Collections.unmodifiableList(this.A13);
    }

    @Override // X.C1NI
    public final boolean CW9() {
        return true;
    }

    @Override // X.C1NI
    public final boolean CZq() {
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x009a A[LOOP:1: B:35:0x0094->B:37:0x009a, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x002a A[ADDED_TO_REGION, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0137  */
    /* JADX WARN: Type inference failed for: r0v1, types: [X.1O9] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C1O9 A00(com.instagram.common.session.UserSession r21, java.util.List r22) {
        /*
            Method dump skipped, instructions count: 324
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.model.reels.Reel.A00(com.instagram.common.session.UserSession, java.util.List):X.1O9");
    }

    public static void A01(Reel reel, Set set) {
        synchronized (reel.A1n) {
            if (!reel.A19.isEmpty()) {
                HashSet hashSet = new HashSet(reel.A19);
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    C38321qM c38321qM = (C38321qM) it.next();
                    if (!set.contains(c38321qM.A38()) || (c38321qM.A5V() && !reel.A0k() && reel.A0P != ReelType.A0Q && !reel.A0h())) {
                        it.remove();
                    }
                }
                reel.A1q = true;
                reel.A19 = Collections.unmodifiableSet(hashSet);
            }
        }
    }

    private boolean A02() {
        Integer CBs;
        C1NB c1nb = this.A0W;
        if (c1nb == null) {
            CBs = null;
        } else {
            CBs = c1nb.CBs();
        }
        if (CBs != C05F.A04) {
            return false;
        }
        return true;
    }

    public final long A04() {
        return this.A04;
    }

    public final C11520jB A06() {
        String str;
        InterfaceC105354oy interfaceC105354oy = this.A0Y;
        String str2 = null;
        if (interfaceC105354oy == null) {
            return null;
        }
        C11520jB c11520jB = new C11520jB();
        C11500j9 c11500j9 = C5I8.A3A;
        List BHb = interfaceC105354oy.BHb();
        if (BHb != null) {
            str = BHb.toString();
        } else {
            str = null;
        }
        c11520jB.A04(c11500j9, str);
        C11500j9 c11500j92 = C5I8.A38;
        IGAdsCardStickerCTATypeEnum Atq = interfaceC105354oy.Atq();
        if (Atq != null) {
            str2 = Atq.toString();
        }
        c11520jB.A04(c11500j92, str2);
        c11520jB.A04(C5I8.A3B, interfaceC105354oy.BKK());
        c11520jB.A04(C5I8.A3C, interfaceC105354oy.BYE());
        c11520jB.A04(C5I8.A3D, interfaceC105354oy.Bur());
        c11520jB.A04(C5I8.A39, interfaceC105354oy.BDM());
        c11520jB.A04(C5I8.A3E, interfaceC105354oy.CHS());
        return c11520jB;
    }

    public final ImageUrl A07() {
        C38091pt c38091pt = this.A0L;
        if (c38091pt != null && A0i()) {
            return AbstractC152686tv.A00(c38091pt.A00);
        }
        C1NB c1nb = this.A0W;
        if (c1nb == null) {
            return null;
        }
        return c1nb.AsM();
    }

    public final SimpleImageUrl A08() {
        C130565v1 c130565v1;
        C38091pt c38091pt = this.A0L;
        if (c38091pt != null && (c130565v1 = c38091pt.A01) != null) {
            return AbstractC152686tv.A00(c130565v1);
        }
        return null;
    }

    public final C41181vS A09(UserSession userSession) {
        C41181vS c41181vS;
        synchronized (this.A1n) {
            if (A15(userSession)) {
                c41181vS = null;
            } else {
                c41181vS = (C41181vS) A0O(userSession).get(A03(userSession));
            }
        }
        return c41181vS;
    }

    public final C41181vS A0B(UserSession userSession, int i) {
        C41181vS c41181vS;
        synchronized (this.A1n) {
            List A0O = A0O(userSession);
            if (i >= 0 && i < A0O.size()) {
                c41181vS = (C41181vS) A0O.get(i);
            } else {
                c41181vS = null;
            }
        }
        return c41181vS;
    }

    public final User A0D() {
        C1NB c1nb = this.A0W;
        if (c1nb == null) {
            return null;
        }
        return c1nb.CDj();
    }

    public final C3PO A0E() {
        C3PO c3po;
        C105824pt c105824pt = this.A0H;
        if (c105824pt != null && A0d() && (c3po = c105824pt.A0A) != null) {
            return c3po;
        }
        return C3PO.A08;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x000d. Please report as an issue. */
    public final String A0G() {
        Object obj;
        String str;
        C105854pw c105854pw;
        String str2;
        C18C.A07(this.A0f, "Trying to get the netego ID without netego type");
        switch (this.A0f.intValue()) {
            case 0:
                c105854pw = this.A0a;
                str2 = "Bakeoff netego should have simple action";
                C18C.A07(c105854pw, str2);
                return this.A0a.getId();
            case 1:
                C18C.A07(this.A0R, "Ad4ad netego should have ad4ad object");
                return this.A0R.getId();
            case 2:
                C18C.A07(this.A0Q, "Suggested Users netego should have suggested user object");
                return this.A0Q.getId();
            case 3:
                c105854pw = this.A0a;
                str2 = "Quality survey netego should have simple action";
                C18C.A07(c105854pw, str2);
                return this.A0a.getId();
            case 4:
                c105854pw = this.A0a;
                str2 = "Story creation upsell netego should have simple action";
                C18C.A07(c105854pw, str2);
                return this.A0a.getId();
            case 5:
                obj = null;
                str = "Suggested clips netego should have suggested clips object";
                C18C.A07(obj, str);
                throw C00O.createAndThrow();
            case 6:
            case 7:
            default:
                throw new UnsupportedOperationException("Trying to get the netego ID of a non-netego unit");
            case 8:
                obj = null;
                str = "Suggested shops netego should have suggested shops object";
                C18C.A07(obj, str);
                throw C00O.createAndThrow();
            case 9:
                c105854pw = this.A0a;
                str2 = "Ads content growth story netego should have simple action";
                C18C.A07(c105854pw, str2);
                return this.A0a.getId();
            case 10:
                C18C.A07(this.A0S, "Bloks netego should have Bloks object");
                return this.A0S.A01.A05;
            case 11:
                C18C.A07(this.A0K, "Trending prompts netego should have prompts in story object");
                return this.A0K.getId();
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                c105854pw = this.A0a;
                str2 = "Insights story netego should have simple action";
                C18C.A07(c105854pw, str2);
                return this.A0a.getId();
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                C18C.A07(this.A0T, "Share comment to story netego should have CommentShareNetego object");
                return this.A0T.getId();
            case 14:
                C18C.A07(this.A0U, "Meta Gallery stories netego Reel objects should have a mmetaGalleryNetegoInfo");
                return this.A0U.getId();
            case Process.SIGTERM /* 15 */:
                C18C.A07(this.A0V, "Threads in stories unit netego should have a ThreadsInStoriesUnitNetego object");
                return this.A0V.getId();
        }
    }

    public final String A0H(UserSession userSession) {
        if (this.A0H != null && AbstractC109224vo.A05(userSession) && AbstractC109224vo.A05(userSession) && A0d() && this.A1U) {
            return "live_preview";
        }
        if (A0d()) {
            C105824pt c105824pt = this.A0H;
            c105824pt.getClass();
            if (!c105824pt.A06().isEmpty()) {
                return "live_with";
            }
        }
        if (A0d()) {
            return "live";
        }
        if (A0n()) {
            return "highlight";
        }
        if (A0p()) {
            return "suggested_highlight";
        }
        if (A0j()) {
            return "live_question_and_answer";
        }
        if (!getId().equals("election:rollcall_v2") && !A0o()) {
            if (A0k()) {
                return "memory_reel";
            }
            if (A0t()) {
                return "superlative_reel";
            }
            if (A0s()) {
                return "suggested_user";
            }
            if (A0q()) {
                return "suggested_reel";
            }
            if (A0u()) {
                return "trending_prompts";
            }
            if (this.A0P == ReelType.A0Q) {
                return "highlight_rewind_reel";
            }
            return "story";
        }
        return "rollcall_v2";
    }

    public final ArrayList A0I(UserSession userSession) {
        ArrayList arrayList;
        synchronized (this.A1n) {
            C41661wG A00 = C41661wG.A00(userSession);
            arrayList = new ArrayList();
            for (C41181vS c41181vS : A0O(userSession)) {
                if (!A00.Cbf(this, c41181vS)) {
                    arrayList.add(c41181vS);
                }
            }
        }
        return arrayList;
    }

    public final List A0J() {
        List unmodifiableList;
        synchronized (this.A1n) {
            unmodifiableList = Collections.unmodifiableList(this.A0v);
        }
        return unmodifiableList;
    }

    public final List A0K() {
        List emptyList;
        synchronized (this.A1n) {
            ArrayList arrayList = this.A0t;
            if (arrayList != null) {
                emptyList = Collections.unmodifiableList(arrayList);
            } else {
                emptyList = Collections.emptyList();
            }
        }
        return emptyList;
    }

    public final List A0L() {
        synchronized (this.A1n) {
            ArrayList arrayList = this.A0t;
            if (arrayList != null && this.A0u != null) {
                ArrayList arrayList2 = new ArrayList(arrayList);
                arrayList2.removeAll(this.A0u);
                return Collections.unmodifiableList(arrayList2);
            }
            return Collections.emptyList();
        }
    }

    public final List A0M() {
        List emptyList;
        synchronized (this.A1n) {
            ArrayList arrayList = this.A0u;
            if (arrayList != null) {
                emptyList = Collections.unmodifiableList(arrayList);
            } else {
                emptyList = Collections.emptyList();
            }
        }
        return emptyList;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x03b0, code lost:
    
        if (((java.lang.Boolean) r10.A2d.CES(r10, X.C17280tP.A4G[181(0xb5, float:2.54E-43)])).booleanValue() == false) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x03be, code lost:
    
        if (r6.A5H() != false) goto L123;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:11:0x003a. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:145:0x03db A[Catch: all -> 0x05e8, TryCatch #0 {, blocks: (B:6:0x0009, B:8:0x000d, B:10:0x002b, B:11:0x003a, B:12:0x003d, B:13:0x004c, B:15:0x004d, B:16:0x008a, B:17:0x05d4, B:18:0x0059, B:19:0x007e, B:20:0x0083, B:21:0x0088, B:22:0x00ad, B:23:0x00d1, B:24:0x00f6, B:25:0x011b, B:26:0x0140, B:27:0x0166, B:28:0x05a1, B:30:0x05a5, B:31:0x05d7, B:32:0x018c, B:34:0x0192, B:36:0x0198, B:38:0x019c, B:39:0x01a5, B:41:0x01a9, B:43:0x01b8, B:44:0x01ba, B:47:0x01c7, B:49:0x01de, B:53:0x0269, B:54:0x01ea, B:55:0x0221, B:57:0x022b, B:59:0x022f, B:61:0x0235, B:63:0x0243, B:65:0x0251, B:67:0x025d, B:69:0x0261, B:70:0x0266, B:72:0x01f6, B:74:0x0204, B:78:0x020f, B:80:0x01c0, B:81:0x026d, B:83:0x0273, B:84:0x0283, B:86:0x0287, B:88:0x0291, B:91:0x029b, B:92:0x0297, B:93:0x02a2, B:95:0x02a8, B:97:0x02b5, B:98:0x02ee, B:100:0x02f4, B:107:0x0313, B:103:0x0329, B:110:0x0334, B:111:0x0339, B:115:0x0343, B:117:0x0347, B:119:0x034d, B:120:0x0357, B:122:0x035d, B:124:0x0372, B:125:0x0378, B:127:0x037e, B:130:0x038b, B:132:0x0399, B:137:0x03b9, B:139:0x03c1, B:161:0x0438, B:143:0x03d5, B:145:0x03db, B:146:0x03ef, B:148:0x03f3, B:149:0x03f6, B:152:0x0405, B:154:0x0409, B:156:0x0418, B:157:0x041a, B:158:0x0429, B:163:0x03c8, B:165:0x03d0, B:173:0x0445, B:175:0x044d, B:177:0x045a, B:178:0x0460, B:180:0x0466, B:182:0x0477, B:183:0x047e, B:185:0x0482, B:187:0x048c, B:189:0x0492, B:190:0x0494, B:191:0x04b0, B:192:0x049c, B:194:0x04a4, B:196:0x04b5, B:197:0x0506, B:199:0x050a, B:200:0x050f, B:202:0x0513, B:204:0x0517, B:206:0x051d, B:208:0x053d, B:211:0x0556, B:212:0x0546, B:213:0x052a, B:215:0x0530, B:217:0x056f, B:219:0x0575, B:221:0x057b, B:222:0x057e, B:224:0x058a, B:226:0x0590, B:227:0x05e6), top: B:5:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:148:0x03f3 A[Catch: all -> 0x05e8, TryCatch #0 {, blocks: (B:6:0x0009, B:8:0x000d, B:10:0x002b, B:11:0x003a, B:12:0x003d, B:13:0x004c, B:15:0x004d, B:16:0x008a, B:17:0x05d4, B:18:0x0059, B:19:0x007e, B:20:0x0083, B:21:0x0088, B:22:0x00ad, B:23:0x00d1, B:24:0x00f6, B:25:0x011b, B:26:0x0140, B:27:0x0166, B:28:0x05a1, B:30:0x05a5, B:31:0x05d7, B:32:0x018c, B:34:0x0192, B:36:0x0198, B:38:0x019c, B:39:0x01a5, B:41:0x01a9, B:43:0x01b8, B:44:0x01ba, B:47:0x01c7, B:49:0x01de, B:53:0x0269, B:54:0x01ea, B:55:0x0221, B:57:0x022b, B:59:0x022f, B:61:0x0235, B:63:0x0243, B:65:0x0251, B:67:0x025d, B:69:0x0261, B:70:0x0266, B:72:0x01f6, B:74:0x0204, B:78:0x020f, B:80:0x01c0, B:81:0x026d, B:83:0x0273, B:84:0x0283, B:86:0x0287, B:88:0x0291, B:91:0x029b, B:92:0x0297, B:93:0x02a2, B:95:0x02a8, B:97:0x02b5, B:98:0x02ee, B:100:0x02f4, B:107:0x0313, B:103:0x0329, B:110:0x0334, B:111:0x0339, B:115:0x0343, B:117:0x0347, B:119:0x034d, B:120:0x0357, B:122:0x035d, B:124:0x0372, B:125:0x0378, B:127:0x037e, B:130:0x038b, B:132:0x0399, B:137:0x03b9, B:139:0x03c1, B:161:0x0438, B:143:0x03d5, B:145:0x03db, B:146:0x03ef, B:148:0x03f3, B:149:0x03f6, B:152:0x0405, B:154:0x0409, B:156:0x0418, B:157:0x041a, B:158:0x0429, B:163:0x03c8, B:165:0x03d0, B:173:0x0445, B:175:0x044d, B:177:0x045a, B:178:0x0460, B:180:0x0466, B:182:0x0477, B:183:0x047e, B:185:0x0482, B:187:0x048c, B:189:0x0492, B:190:0x0494, B:191:0x04b0, B:192:0x049c, B:194:0x04a4, B:196:0x04b5, B:197:0x0506, B:199:0x050a, B:200:0x050f, B:202:0x0513, B:204:0x0517, B:206:0x051d, B:208:0x053d, B:211:0x0556, B:212:0x0546, B:213:0x052a, B:215:0x0530, B:217:0x056f, B:219:0x0575, B:221:0x057b, B:222:0x057e, B:224:0x058a, B:226:0x0590, B:227:0x05e6), top: B:5:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0405 A[Catch: all -> 0x05e8, TryCatch #0 {, blocks: (B:6:0x0009, B:8:0x000d, B:10:0x002b, B:11:0x003a, B:12:0x003d, B:13:0x004c, B:15:0x004d, B:16:0x008a, B:17:0x05d4, B:18:0x0059, B:19:0x007e, B:20:0x0083, B:21:0x0088, B:22:0x00ad, B:23:0x00d1, B:24:0x00f6, B:25:0x011b, B:26:0x0140, B:27:0x0166, B:28:0x05a1, B:30:0x05a5, B:31:0x05d7, B:32:0x018c, B:34:0x0192, B:36:0x0198, B:38:0x019c, B:39:0x01a5, B:41:0x01a9, B:43:0x01b8, B:44:0x01ba, B:47:0x01c7, B:49:0x01de, B:53:0x0269, B:54:0x01ea, B:55:0x0221, B:57:0x022b, B:59:0x022f, B:61:0x0235, B:63:0x0243, B:65:0x0251, B:67:0x025d, B:69:0x0261, B:70:0x0266, B:72:0x01f6, B:74:0x0204, B:78:0x020f, B:80:0x01c0, B:81:0x026d, B:83:0x0273, B:84:0x0283, B:86:0x0287, B:88:0x0291, B:91:0x029b, B:92:0x0297, B:93:0x02a2, B:95:0x02a8, B:97:0x02b5, B:98:0x02ee, B:100:0x02f4, B:107:0x0313, B:103:0x0329, B:110:0x0334, B:111:0x0339, B:115:0x0343, B:117:0x0347, B:119:0x034d, B:120:0x0357, B:122:0x035d, B:124:0x0372, B:125:0x0378, B:127:0x037e, B:130:0x038b, B:132:0x0399, B:137:0x03b9, B:139:0x03c1, B:161:0x0438, B:143:0x03d5, B:145:0x03db, B:146:0x03ef, B:148:0x03f3, B:149:0x03f6, B:152:0x0405, B:154:0x0409, B:156:0x0418, B:157:0x041a, B:158:0x0429, B:163:0x03c8, B:165:0x03d0, B:173:0x0445, B:175:0x044d, B:177:0x045a, B:178:0x0460, B:180:0x0466, B:182:0x0477, B:183:0x047e, B:185:0x0482, B:187:0x048c, B:189:0x0492, B:190:0x0494, B:191:0x04b0, B:192:0x049c, B:194:0x04a4, B:196:0x04b5, B:197:0x0506, B:199:0x050a, B:200:0x050f, B:202:0x0513, B:204:0x0517, B:206:0x051d, B:208:0x053d, B:211:0x0556, B:212:0x0546, B:213:0x052a, B:215:0x0530, B:217:0x056f, B:219:0x0575, B:221:0x057b, B:222:0x057e, B:224:0x058a, B:226:0x0590, B:227:0x05e6), top: B:5:0x0009 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List A0O(com.instagram.common.session.UserSession r23) {
        /*
            Method dump skipped, instructions count: 1554
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.model.reels.Reel.A0O(com.instagram.common.session.UserSession):java.util.List");
    }

    public final Map A0P(int i) {
        List list = this.A10;
        if (list != null && i >= 0 && i < list.size()) {
            return (Map) this.A10.get(i);
        }
        return this.A1k;
    }

    public final Set A0Q() {
        Set unmodifiableSet;
        synchronized (this.A1n) {
            unmodifiableSet = Collections.unmodifiableSet(this.A19);
        }
        return unmodifiableSet;
    }

    /* JADX WARN: Code restructure failed: missing block: B:214:0x045f, code lost:
    
        if (r4.contains("story_remix_reply") == false) goto L222;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x01b0, code lost:
    
        r7.add(r5);
     */
    /* JADX WARN: Type inference failed for: r0v225, types: [X.4ms, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v14, types: [X.5G5, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0T(com.instagram.common.session.UserSession r12, X.C37771pE r13, java.lang.Boolean r14) {
        /*
            Method dump skipped, instructions count: 1266
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.model.reels.Reel.A0T(com.instagram.common.session.UserSession, X.1pE, java.lang.Boolean):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void A0U(UserSession userSession, List list) {
        String id;
        C06090Tz c06090Tz = C06090Tz.A05;
        if ((C18U.A06(c06090Tz, userSession, 36324801870049766L) && !A0l()) || !C18U.A06(c06090Tz, userSession, 36322233480259656L)) {
            return;
        }
        C41661wG A00 = C41661wG.A00(userSession);
        synchronized (A00) {
            C41691wJ c41691wJ = A00.A00;
            synchronized (c41691wJ) {
                C41751wP c41751wP = c41691wJ.A03;
                if (this.A1P) {
                    id = "NUX";
                } else {
                    id = getId();
                }
                synchronized (c41751wP) {
                    ArrayList A01 = C41751wP.A01(list);
                    HashMap hashMap = c41751wP.A04;
                    if (hashMap.containsKey(id)) {
                        List list2 = (List) hashMap.get(id);
                        if (!list2.containsAll(A01)) {
                            list2.addAll(A01);
                            if (list2.size() > 1000) {
                                list2.subList(0, list2.size() - 1000).clear();
                            }
                            A01 = list2;
                        }
                    } else {
                        while (c41751wP.A03.size() >= 1000) {
                            List list3 = c41751wP.A03;
                            String str = (String) list3.remove(list3.size() - 1);
                            hashMap.remove(str);
                            c41751wP.A00.remove(str);
                        }
                    }
                    c41751wP.A03.remove(id);
                    c41751wP.A03.add(0, id);
                    hashMap.put(id, A01);
                    c41691wJ.A01.A01(Long.valueOf(System.currentTimeMillis()));
                }
            }
        }
    }

    public final void A0V(C38321qM c38321qM) {
        synchronized (this.A1n) {
            HashSet hashSet = new HashSet(this.A19);
            hashSet.add(c38321qM);
            if (c38321qM.A1B() > this.A03) {
                this.A03 = c38321qM.A1B();
            }
            this.A1q = true;
            this.A19 = Collections.unmodifiableSet(hashSet);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void A0W(C105824pt c105824pt) {
        long longValue;
        long longValue2;
        boolean z;
        boolean booleanValue;
        Boolean bool = c105824pt.A0L;
        if (bool != null && (booleanValue = bool.booleanValue()) != -1) {
            boolean z2 = true;
            if (booleanValue != 1) {
                z2 = false;
            }
            this.A1Y = z2;
        }
        C105824pt c105824pt2 = this.A0H;
        if (c105824pt2 == null) {
            this.A0H = c105824pt;
        } else {
            long A01 = c105824pt.A01();
            long A012 = c105824pt2.A01();
            if (A01 != A012) {
                C0w9.A03("reel_broadcast_item_publish_error", AnonymousClass001.A0f("previous: ", " new: ", A012, A01));
            }
            C105824pt c105824pt3 = this.A0H;
            c105824pt3.A0X.getClass();
            String str = c105824pt3.A0X;
            String str2 = c105824pt.A0X;
            str2.getClass();
            C18C.A0F(str.equals(str2));
            User user = c105824pt3.A09;
            user.getClass();
            User user2 = c105824pt.A09;
            user2.getClass();
            C18C.A0E(user.equals(user2));
            String str3 = c105824pt3.A0e;
            str3.getClass();
            String str4 = c105824pt.A0e;
            str4.getClass();
            C18C.A0E(str3.equals(str4));
            ImageUrl A02 = c105824pt.A02();
            if (!AbstractC81033jX.A03(A02)) {
                c105824pt3.A05 = A02;
                SystemClock.elapsedRealtime();
            }
            c105824pt3.A02 = c105824pt.A02;
            c105824pt3.A0b = c105824pt.A0b;
            c105824pt3.A0Z = c105824pt.A0Z;
            c105824pt3.A0a = c105824pt.A0a;
            c105824pt3.A0i = c105824pt.A0i;
            c105824pt3.A08 = c105824pt.A08;
            c105824pt3.A0R = c105824pt.A0R;
            c105824pt3.A0m = c105824pt.A0m;
            c105824pt3.A0Q = c105824pt.A0Q;
            c105824pt3.A0T = c105824pt.A0T;
            c105824pt3.A0S = c105824pt.A0S;
            c105824pt3.A0L = c105824pt.A0L;
            c105824pt3.A0C = c105824pt.A0C;
            c105824pt3.A06 = c105824pt.A06;
            c105824pt3.A0V = c105824pt.A0V;
            c105824pt3.A0W = c105824pt.A0W;
            c105824pt3.A0h = c105824pt.A0h;
            c105824pt3.A0c = c105824pt.A0c;
            c105824pt3.A0P = c105824pt.A0P;
            c105824pt3.A0B = c105824pt.A0B;
            Set set = c105824pt.A0n;
            if (set != null) {
                Set set2 = c105824pt3.A0n;
                if (set2 == null) {
                    c105824pt3.A0n = new HashSet();
                } else {
                    set2.clear();
                }
                c105824pt3.A0n.addAll(set);
            }
            List list = c105824pt.A0l;
            if (list != null) {
                List list2 = c105824pt3.A0l;
                if (list2 == null) {
                    c105824pt3.A0l = new ArrayList();
                } else {
                    list2.clear();
                }
                c105824pt3.A0l.addAll(list);
            }
            c105824pt3.A0U = c105824pt.A0U;
            c105824pt3.A0H = c105824pt.A0H;
            c105824pt3.A01 = c105824pt.A01;
            c105824pt3.A03 = c105824pt.A03;
            c105824pt3.A0j = c105824pt.A0j;
            c105824pt3.A0Y = c105824pt.A0Y;
            c105824pt3.A0d = c105824pt.A0d;
            C109954xP c109954xP = c105824pt.A07;
            if (c109954xP != null) {
                c105824pt3.A07 = c109954xP;
            }
            C109894xH c109894xH = c105824pt.A00;
            if (c109894xH == null) {
                c109894xH = null;
            }
            c105824pt3.A00 = c109894xH;
            c105824pt3.A0k = c105824pt.A0k;
            c105824pt3.A0M = c105824pt.A0M;
            c105824pt3.A0D = c105824pt.A0D;
            c105824pt3.A0N = c105824pt.A0N;
            c105824pt3.A0J = c105824pt.A0J;
            c105824pt3.A0O = c105824pt.A0O;
        }
        Long l = c105824pt.A0V;
        if (l == null) {
            longValue = -9223372036854775807L;
        } else {
            longValue = l.longValue();
        }
        if (longValue != -9223372036854775807L) {
            this.A04 = longValue;
        }
        Long l2 = c105824pt.A0W;
        if (l2 != null) {
            long longValue3 = l2.longValue();
            if (longValue3 != -9223372036854775807L) {
                this.A05 = longValue3;
            }
        }
        this.A03 = c105824pt.A01();
        Long l3 = c105824pt.A0S;
        if (l3 == null) {
            longValue2 = 0;
        } else {
            longValue2 = l3.longValue();
        }
        this.A0l = Long.valueOf(longValue2);
        Boolean bool2 = c105824pt.A0E;
        if (bool2 != null) {
            z = bool2.booleanValue();
        } else {
            z = false;
        }
        this.A1K = z;
    }

    public final void A0X(List list) {
        synchronized (this.A1n) {
            this.A1q = true;
            if (CdW()) {
                this.A15 = Collections.unmodifiableList(list);
            } else {
                this.A19 = Collections.unmodifiableSet(new HashSet(list));
            }
        }
    }

    public final void A0Y(boolean z) {
        if (this.A1i == null || !z) {
            this.A1i = Boolean.valueOf(z);
        }
        if (A0l() && !z) {
            this.A13 = Collections.emptyList();
            this.A1q = true;
        }
    }

    public final boolean A0Z() {
        Iterator it = this.A13.iterator();
        while (it.hasNext()) {
            if (!((C105814ps) it.next()).A00.A0m()) {
                return true;
            }
        }
        return false;
    }

    public final boolean A0a() {
        String str = this.A1o;
        if (str != null && str.equals("add_to_story")) {
            return true;
        }
        return false;
    }

    public final boolean A0b() {
        ReelType reelType = this.A0P;
        if (reelType != ReelType.A06 && reelType != ReelType.A08 && reelType != ReelType.A0L) {
            return false;
        }
        return true;
    }

    public final boolean A0c() {
        C105824pt c105824pt = this.A0H;
        if (c105824pt != null && c105824pt.A07 != null) {
            return true;
        }
        return false;
    }

    public final boolean A0d() {
        C105824pt c105824pt = this.A0H;
        if (c105824pt != null && c105824pt.A07 == null) {
            return true;
        }
        return false;
    }

    public final boolean A0e() {
        if (this.A1a && this.A0P == ReelType.A0n) {
            return true;
        }
        return false;
    }

    public final boolean A0f() {
        Long l = this.A0l;
        if (l == null) {
            return false;
        }
        if (l.longValue() + (AbstractC73343Qk.A00 / 1000) > System.currentTimeMillis() / 1000) {
            return false;
        }
        return true;
    }

    public final boolean A0g() {
        String str = this.A1o;
        if (str != null && str.startsWith("election:hallpass")) {
            return true;
        }
        return false;
    }

    public final boolean A0h() {
        if (this.A0P != ReelType.A0P) {
            return false;
        }
        return true;
    }

    public final boolean A0k() {
        if (this.A0P != ReelType.A0U) {
            return false;
        }
        return true;
    }

    public final boolean A0m() {
        if (this.A0P != ReelType.A0W) {
            return false;
        }
        return true;
    }

    public final boolean A0n() {
        ReelType reelType = this.A0P;
        if (reelType != ReelType.A0P && reelType != ReelType.A0b) {
            return false;
        }
        return true;
    }

    public final boolean A0o() {
        if (this.A1W && this.A0h == C05F.A01) {
            return true;
        }
        return false;
    }

    public final boolean A0p() {
        ReelType reelType = this.A0P;
        if (reelType != ReelType.A0e && reelType != ReelType.A0J && reelType != ReelType.A0D && reelType != ReelType.A0d) {
            return false;
        }
        return true;
    }

    public final boolean A0q() {
        C1NB c1nb;
        User CDj;
        if (this.A0P == ReelType.A0i && (c1nb = this.A0W) != null && !this.A1a && c1nb.CBs() == C05F.A01 && (CDj = c1nb.CDj()) != null && CDj.B7L() == FollowStatus.A06) {
            return true;
        }
        return false;
    }

    public final boolean A0s() {
        C1NB c1nb;
        User CDj;
        if (this.A0P == ReelType.A0h && (c1nb = this.A0W) != null && !this.A1a && c1nb.CBs() == C05F.A01 && (CDj = c1nb.CDj()) != null && CDj.B7L() == FollowStatus.A06 && A0K().isEmpty()) {
            return true;
        }
        return false;
    }

    public final boolean A0t() {
        if (this.A0P != ReelType.A0j) {
            return false;
        }
        return true;
    }

    public final boolean A0u() {
        if (this.A0P != ReelType.A0k) {
            return false;
        }
        return true;
    }

    public final boolean A0v(int i) {
        List list = this.A0z;
        if (A02() && list != null) {
            if (i >= 0 && i < list.size()) {
                return Boolean.TRUE.equals(((C37771pE) list.get(i)).A0u);
            }
            return false;
        }
        return this.A1m;
    }

    public final boolean A0x(UserSession userSession) {
        if (this.A1a) {
            synchronized (this.A1n) {
                List A0O = A0O(userSession);
                for (int A03 = A03(userSession); A03 < A0O.size(); A03++) {
                    C41181vS c41181vS = (C41181vS) A0O.get(A03);
                    if (!C41661wG.A00(userSession).Cbf(this, c41181vS) && c41181vS.A0B() == EnumC76383bi.A04) {
                        return true;
                    }
                }
                return false;
            }
        }
        return this.A1F;
    }

    public final boolean A0y(UserSession userSession) {
        if (this.A1a) {
            synchronized (this.A1n) {
                List A0O = A0O(userSession);
                for (int A03 = A03(userSession); A03 < A0O.size(); A03++) {
                    C41181vS c41181vS = (C41181vS) A0O.get(A03);
                    if (!C41661wG.A00(userSession).Cbf(this, c41181vS) && c41181vS.A1E()) {
                        return true;
                    }
                }
                return false;
            }
        }
        return this.A1G;
    }

    public final boolean A10(UserSession userSession) {
        synchronized (this.A1n) {
            List A0O = A0O(userSession);
            for (int A03 = A03(userSession); A03 < A0O.size(); A03++) {
                C41181vS c41181vS = (C41181vS) A0O.get(A03);
                if (!C41661wG.A00(userSession).Cbf(this, c41181vS) && c41181vS.A0B() == EnumC76383bi.A0A) {
                    return true;
                }
            }
            return false;
        }
    }

    public final boolean A11(UserSession userSession) {
        if (this.A1a) {
            synchronized (this.A1n) {
                List A0O = A0O(userSession);
                for (int A03 = A03(userSession); A03 < A0O.size(); A03++) {
                    C41181vS c41181vS = (C41181vS) A0O.get(A03);
                    if (!C41661wG.A00(userSession).Cbf(this, c41181vS) && c41181vS.A0i()) {
                        return true;
                    }
                }
                return false;
            }
        }
        return this.A1l;
    }

    public final boolean A12(UserSession userSession) {
        if (this.A1a) {
            synchronized (this.A1n) {
                List A0O = A0O(userSession);
                for (int A03 = A03(userSession); A03 < A0O.size(); A03++) {
                    C41181vS c41181vS = (C41181vS) A0O.get(A03);
                    if (!C41661wG.A00(userSession).Cbf(this, c41181vS) && c41181vS.A0B() == EnumC76383bi.A05) {
                        return true;
                    }
                }
                return false;
            }
        }
        return this.A1F;
    }

    public final boolean A13(UserSession userSession) {
        boolean A06 = C18U.A06(C06090Tz.A05, userSession, 36318080246421381L);
        if (this.A0I != null && A06) {
            return true;
        }
        return false;
    }

    public final boolean A14(UserSession userSession) {
        if (!this.A0y.isEmpty() && A15(userSession)) {
            return true;
        }
        return false;
    }

    public final boolean A17(UserSession userSession) {
        CarouselRenderingType carouselRenderingType = CarouselRenderingType.A06;
        CarouselRenderingType carouselRenderingType2 = this.A06;
        if ((carouselRenderingType.equals(carouselRenderingType2) || CarouselRenderingType.A04.equals(carouselRenderingType2)) && A0O(userSession).size() > 1) {
            return true;
        }
        return false;
    }

    public final boolean A18(UserSession userSession) {
        if (C18U.A06(C06090Tz.A05, userSession, 36319394506218908L) && A0t()) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x001b, code lost:
    
        if (r5.A1a != false) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A19(com.instagram.common.session.UserSession r6) {
        /*
            r5 = this;
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36317491839964417(0x81069100411501, double:3.0306663061706384E-306)
            boolean r4 = X.C18U.A06(r2, r6, r0)
            r3 = 1
            com.instagram.model.reels.ReelType r2 = r5.A0P
            com.instagram.model.reels.ReelType r0 = com.instagram.model.reels.ReelType.A0n
            r1 = 0
            if (r2 != r0) goto L14
            r1 = 1
        L14:
            if (r4 != 0) goto L1e
            if (r1 == 0) goto L1d
            boolean r0 = r5.A1a
            r1 = 1
            if (r0 == 0) goto L1e
        L1d:
            r1 = 0
        L1e:
            java.lang.String r0 = r5.A1o
            if (r0 == 0) goto L31
            if (r1 != 0) goto L30
            boolean r0 = r5.A0h()
            if (r0 != 0) goto L30
            boolean r0 = r5.A0b()
            if (r0 == 0) goto L31
        L30:
            return r3
        L31:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.model.reels.Reel.A19(com.instagram.common.session.UserSession):boolean");
    }

    public final boolean A1B(C38321qM c38321qM) {
        if (!this.A19.contains(c38321qM) && !this.A15.contains(c38321qM)) {
            return false;
        }
        return true;
    }

    @Override // X.C1NI
    public final boolean CdW() {
        if (this.A0P != ReelType.A04) {
            return false;
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof Reel) && AbstractC50102Ry.A00(((Reel) obj).A1o, this.A1o)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A1o});
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("{id: ");
        sb.append(this.A1o);
        sb.append(" owner: ");
        C1NB c1nb = this.A0W;
        if (c1nb != null) {
            str = c1nb.toString();
        } else {
            str = "null";
        }
        sb.append(str);
        sb.append(" reel type: ");
        sb.append(this.A0P);
        sb.append("}");
        return sb.toString();
    }

    public final int A03(UserSession userSession) {
        if (!A16(userSession) && !A0d()) {
            if ((!A0i() || this.A1R) && !A0b() && !A0a() && !CdW()) {
                C41661wG A00 = C41661wG.A00(userSession);
                List A0O = A0O(userSession);
                if (A0O.size() == 0 && A0l()) {
                    List A0M = A0M();
                    for (int i = 0; i < A0M.size(); i++) {
                        if (!A00.A07(this, (String) A0M.get(i))) {
                            return A0K().indexOf(A0M.get(i));
                        }
                    }
                    return 0;
                }
                for (int i2 = 0; i2 < A0O.size(); i2++) {
                    if (!A00.Cbf(this, (C41181vS) A0O.get(i2))) {
                        return i2;
                    }
                }
                return 0;
            }
            return 0;
        }
        return 0;
    }

    public final RingSpec A05(UserSession userSession) {
        if (!A0y(userSession) && A0x(userSession)) {
            return null;
        }
        return this.A1g;
    }

    public final C41181vS A0A(UserSession userSession, int i) {
        return (C41181vS) A0O(userSession).get(i);
    }

    public final C38561qk A0C(UserSession userSession) {
        if (A0x(userSession)) {
            return null;
        }
        return this.A1h;
    }

    public final String A0F() {
        boolean z = true;
        if (A0a()) {
            z = false;
        }
        if (!z) {
            return null;
        }
        String str = this.A0s;
        if (str != null) {
            return str;
        }
        if (AbstractC74053Tw.A04(getId())) {
            return getId();
        }
        C0w9.A03("Ad$ Revenue Impacted: FIX IMMEDIATELY!", StringFormatUtil.formatStrLocaleSafe("Non Numeric Reel ID found in Ads Injection. ReelID: %s \r\nThis affects (reduces) ads revenue.\r\nRefer https://fb.facebook.com/groups/214085649094210/permalink/250107518825356/ and roll a fix ASAP.\r\nExperiments that cause non numeric IDs in tray inventory cannot ship until this is fixed.", getId()));
        return null;
    }

    public final void A0R(UserSession userSession) {
        AbstractC25651Mw.A00(userSession).A05(new C3DH(this));
    }

    public final void A0S(UserSession userSession, long j) {
        if (!A0d() && !CdW() && !A0m() && !A0b() && !A0a()) {
            C41661wG.A00(userSession).A04(this, Long.valueOf(j));
        }
    }

    public final boolean A0i() {
        if (!A0n() && !A0p()) {
            return false;
        }
        return true;
    }

    public final boolean A0j() {
        if (A0d()) {
            C105824pt c105824pt = this.A0H;
            c105824pt.getClass();
            if (c105824pt.A0U != null) {
                return true;
            }
        }
        return false;
    }

    public final boolean A0l() {
        return getId().contains("myWeek");
    }

    public final boolean A0r() {
        if (!A0q() && !A0s()) {
            return false;
        }
        return true;
    }

    public final boolean A0w(int i) {
        List list;
        if (A02() && (list = this.A0z) != null && list.size() > i) {
            if (((C37771pE) this.A0z.get(i)).A01 != CarouselRenderingType.A04) {
                return false;
            }
            return true;
        }
        return CarouselRenderingType.A04.equals(this.A06);
    }

    public final boolean A0z(UserSession userSession) {
        Boolean bool;
        List A0O = A0O(userSession);
        if (!A0b() || (A0O.isEmpty() && this.A1A.size() <= 0)) {
            if (A0t() && ((C41181vS) A0O.get(A0O.size() - 1)).A03() != this.A03) {
                this.A1q = true;
            }
            long j = -1;
            if (!this.A0y.isEmpty()) {
                j = ((Number) Collections.max(this.A0y)).longValue();
            }
            if (A0h() && ((bool = this.A1i) == null || bool.booleanValue())) {
                return false;
            }
            if (!A0O.isEmpty()) {
                j = Math.max(((C41181vS) A0O.get(A0O.size() - 1)).A03(), j);
            }
            if (j < this.A03) {
                return false;
            }
        }
        return true;
    }

    public final boolean A15(UserSession userSession) {
        if (A0O(userSession).isEmpty() && !(!this.A1A.isEmpty())) {
            return true;
        }
        return false;
    }

    public final boolean A16(UserSession userSession) {
        long max;
        if (A0d()) {
            return false;
        }
        if (this.A1P) {
            if (C41661wG.A00(userSession).A05(this)) {
                return true;
            }
            return false;
        }
        if (A0a() || this.A0P == ReelType.A0I) {
            return false;
        }
        List A0O = A0O(userSession);
        if (A0O.isEmpty()) {
            max = this.A03;
        } else {
            max = Math.max(((C41181vS) A0O.get(A0O.size() - 1)).A03(), this.A03);
        }
        HashSet hashSet = new HashSet(A0K());
        Iterator it = A0N().iterator();
        while (it.hasNext()) {
            hashSet.add(((C1NI) it.next()).getId());
        }
        return C41661wG.A00(userSession).A06(this, Long.valueOf(max));
    }

    public final boolean A1A(UserSession userSession) {
        if (A19(userSession) && this.A1N) {
            return true;
        }
        return false;
    }

    @Override // X.C1NI
    public final String BzL(UserSession userSession) {
        if (A02()) {
            synchronized (this.A1n) {
                if ((!C18U.A06(C06090Tz.A05, userSession, 36313450271868945L)) && !this.A0v.isEmpty()) {
                    C38321qM c38321qM = ((C40971v4) this.A0v.get(0)).A0K;
                    c38321qM.getClass();
                    return AbstractC41071vF.A0F(userSession, c38321qM);
                }
                if (this.A15.isEmpty()) {
                    return null;
                }
                return AbstractC41071vF.A0F(userSession, (C38321qM) this.A15.get(0));
            }
        }
        List list = this.A1j;
        if (!list.isEmpty() && ((C41181vS) list.get(0)).CY4()) {
            C38321qM c38321qM2 = ((C41181vS) list.get(0)).A0b;
            c38321qM2.getClass();
            return AbstractC41071vF.A0F(userSession, c38321qM2);
        }
        if (list.isEmpty() || !((C41181vS) list.get(0)).A1q(userSession) || ((C41181vS) list.get(0)).mBrandResearchSurvey == null) {
            return null;
        }
        return ((C41181vS) list.get(0)).mBrandResearchSurvey.A08;
    }

    @Override // X.C1NI, X.InterfaceC38381qS, X.InterfaceC38411qV
    public final String getId() {
        if (A0a()) {
            C0w9.A03("reel", "Add to story reel cannot be referenced directly by ID");
        }
        return this.A1o;
    }

    public Reel(C1NB c1nb, String str, boolean z) {
        boolean z2 = true;
        if (z && (c1nb == null || c1nb.CBs() != C05F.A01)) {
            z2 = false;
        }
        C18C.A0F(z2);
        this.A1o = str;
        this.A0W = c1nb;
        this.A1a = z;
        this.A1W = false;
        this.A0k = Long.valueOf(System.currentTimeMillis());
    }
}
