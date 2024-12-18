package X;

import android.os.Parcelable;
import android.text.TextUtils;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.proxygen.TraceFieldType;
import com.facebook.systrace.Systrace;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment;
import com.instagram.direct.messagethread.reactions.datamodel.DirectCountBasedReaction;
import com.instagram.direct.model.DirectAREffectShare;
import com.instagram.direct.model.DirectMessageEditHistory;
import com.instagram.direct.model.comments.DirectMessageComments;
import com.instagram.direct.model.mentions.MentionedEntity;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.model.direct.gifs.DirectAnimatedMedia;
import com.instagram.model.direct.messageid.DirectMessageIdentifier;
import com.instagram.model.direct.stickerstore.DirectStoreSticker;
import com.instagram.model.direct.stickerstore.DirectStoreStickerResponseItem;
import com.instagram.model.mediasize.ExtendedImageUrl;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import com.instagram.realtimeclient.GraphQLSubscriptionID;
import com.instagram.user.model.User;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: X.3nh, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C83403nh implements InterfaceC83433nk {

    @Deprecated
    public long A03;
    public C9B5 A04;
    public C206209Bd A05;
    public C206409Bx A06;
    public C206409Bx A07;
    public C9C9 A08;
    public C9CK A09;
    public C9CL A0A;

    @Deprecated
    public C51755Mte A0B;
    public C51753Mtc A0C;
    public C45120Jxp A0D;
    public C45127Jxw A0E;
    public E71 A0F;
    public C45117Jxm A0G;
    public ImmutableList A0H;
    public C148276lx A0I;
    public C47813L9v A0J;
    public FG7 A0K;
    public C7SU A0L;
    public E6F A0M;
    public C83553nw A0N;
    public C62519SEv A0O;
    public DirectAREffectShare A0P;
    public C7BW A0Q;
    public IEQ A0R;
    public C1575375n A0S;
    public L3X A0T;
    public IKN A0U;
    public AnonymousClass544 A0V;
    public C125805mV A0W;
    public C910443z A0X;
    public C47948LGd A0Y;
    public C7QR A0Z;
    public AnonymousClass442 A0a;
    public C7QP A0b;
    public C101864hx A0c;
    public C101584hT A0d;
    public C101584hT A0e;

    @Deprecated
    public C101674hc A0f;
    public C4G2 A0g;
    public C46852Knl A0h;
    public C910143t A0i;
    public C910143t A0j;
    public C111254zn A0k;
    public C67640Utv A0l;
    public AnonymousClass570 A0n;
    public C45076Jx5 A0o;
    public L93 A0p;
    public DirectMessageComments A0q;
    public C114675Fx A0r;
    public C38321qM A0s;
    public C38321qM A0t;

    @Deprecated
    public C38321qM A0u;
    public C7Q4 A0v;
    public C7Q5 A0w;
    public C83693oE A0x;
    public DirectThreadKey A0y;
    public C2EY A0z;
    public C2EY A10;
    public DirectAnimatedMedia A11;
    public C1120954b A12;
    public DirectStoreSticker A14;
    public DirectStoreStickerResponseItem A15;
    public ExtendedImageUrl A16;

    @Deprecated
    public User A17;
    public Boolean A18;
    public Boolean A19;
    public Boolean A1A;
    public Boolean A1B;
    public Integer A1D;
    public Integer A1E;
    public Integer A1G;

    @Deprecated
    public Integer A1I;
    public Long A1J;
    public Long A1K;
    public Long A1L;
    public Long A1M;
    public Long A1N;
    public Long A1O;
    public Long A1P;
    public Long A1Q;
    public Long A1R;
    public Long A1S;
    public Object A1T;
    public Object A1U;
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
    public String A1k;
    public String A1l;
    public String A1m;
    public String A1n;
    public String A1o;
    public String A1p;
    public String A1q;
    public String A1s;
    public String A1t;
    public String A1u;
    public String A1v;
    public String A1w;

    @Deprecated
    public String A1x;
    public LinkedHashMap A1y;
    public LinkedHashMap A1z;
    public List A20;
    public List A21;
    public List A22;

    @Deprecated
    public List A23;
    public List A24;
    public List A26;
    public List A28;
    public List A29;
    public List A2A;

    @Deprecated
    public List A2B;
    public boolean A2D;
    public boolean A2F;
    public boolean A2H;
    public boolean A2I;
    public boolean A2J;

    @Deprecated
    public boolean A2K;
    public boolean A2N;
    public boolean A2O;
    public boolean A2P;
    public boolean A2R;
    public boolean A2S;
    public AnonymousClass442 A2T;
    public final List A2V = new ArrayList();
    public final List A2W = new ArrayList();
    public boolean A2C = true;
    public final LinkedHashMap A2U = new LinkedHashMap();
    public Integer A1F = C05F.A00;
    public List A27 = new ArrayList();
    public List A25 = new ArrayList();
    public String A1r = "";
    public int A00 = 0;

    @Deprecated
    public int A02 = 0;
    public boolean A2L = false;
    public boolean A2M = false;
    public boolean A2G = false;
    public boolean A2E = false;
    public int A01 = 0;
    public boolean A2Q = false;
    public String A1j = null;
    public Integer A1H = null;
    public Boolean A1C = false;
    public DirectMessageIdentifier A13 = null;
    public C83473no A0m = new C83473no();

    public static synchronized void A04(UserSession userSession, C83403nh c83403nh, List list) {
        int i;
        synchronized (c83403nh) {
            if (Systrace.A0E(32L)) {
                AbstractC09800fd.A01("DirectMessage.updateCountBasedReactions", -786069796);
            }
            try {
                if (AbstractC83893oY.A00(list)) {
                    c83403nh.A22 = list;
                    c83403nh.A2U.clear();
                    if (Systrace.A0E(32L)) {
                        i = 790082210;
                        AbstractC09800fd.A00(i);
                    }
                } else if (list.equals(c83403nh.A22) && !c83403nh.A2U.isEmpty()) {
                    if (Systrace.A0E(32L)) {
                        i = -773379773;
                        AbstractC09800fd.A00(i);
                    }
                } else {
                    c83403nh.A22 = list;
                    LinkedHashMap linkedHashMap = c83403nh.A2U;
                    linkedHashMap.clear();
                    if (C18U.A06(C06090Tz.A06, userSession, 36320232024842389L)) {
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            DirectCountBasedReaction directCountBasedReaction = (DirectCountBasedReaction) it.next();
                            linkedHashMap.put(directCountBasedReaction.A01, directCountBasedReaction);
                        }
                    }
                    if (Systrace.A0E(32L)) {
                        i = 430582170;
                        AbstractC09800fd.A00(i);
                    }
                }
            } catch (Throwable th) {
                if (Systrace.A0E(32L)) {
                    AbstractC09800fd.A00(1227363379);
                }
                throw th;
            }
        }
    }

    private void A07(ExtendedImageUrl extendedImageUrl) {
        String str;
        if (extendedImageUrl == null) {
            if (this.A16 == null) {
                return;
            }
        } else {
            String str2 = extendedImageUrl.A0A;
            ExtendedImageUrl extendedImageUrl2 = this.A16;
            if (extendedImageUrl2 == null) {
                str = null;
            } else {
                str = extendedImageUrl2.A0A;
            }
            if (str2.equals(str)) {
                return;
            }
        }
        this.A2C = true;
        this.A16 = extendedImageUrl;
    }

    private synchronized void A08(Long l) {
        if (l != null) {
            long longValue = l.longValue();
            if (longValue > 0) {
                Long valueOf = Long.valueOf(TimeUnit.SECONDS.toMillis(longValue));
                this.A1K = valueOf;
                this.A1L = Long.valueOf(valueOf.longValue() + TimeUnit.MICROSECONDS.toMillis(C8i()));
            }
        }
    }

    public static synchronized boolean A0C(C83403nh c83403nh, Long l, Long l2) {
        boolean z;
        Long l3;
        synchronized (c83403nh) {
            z = false;
            boolean z2 = false;
            if (!AbstractC50102Ry.A00(l, c83403nh.A1O)) {
                z2 = true;
            }
            boolean z3 = !AbstractC50102Ry.A00(l2, c83403nh.A1M);
            if (z2) {
                c83403nh.A1O = l;
            }
            if (z3) {
                c83403nh.A1M = l2;
            }
            if (z2 || z3) {
                Long l4 = c83403nh.A1O;
                if (l4 != null && (l3 = c83403nh.A1M) != null) {
                    c83403nh.A1N = Long.valueOf(l4.longValue() + TimeUnit.SECONDS.toMillis(l3.longValue()));
                }
                if (z2 || z3) {
                    z = true;
                }
            }
        }
        return z;
    }

    public final synchronized C206409Bx A0E() {
        return this.A07;
    }

    public final synchronized C9CK A0F() {
        return this.A09;
    }

    public final synchronized ImmutableList A0I() {
        ImmutableList immutableList;
        List list = this.A20;
        immutableList = null;
        if (list != null && list.size() != 0) {
            immutableList = ImmutableList.copyOf((Collection) this.A20);
        }
        return immutableList;
    }

    public final synchronized ImmutableList A0J() {
        ImmutableList immutableList;
        List list = this.A22;
        if (list != null) {
            immutableList = ImmutableList.copyOf((Collection) list);
        } else {
            immutableList = null;
        }
        return immutableList;
    }

    public final synchronized ImmutableMap A0K() {
        ImmutableMap immutableMap;
        LinkedHashMap linkedHashMap = this.A1z;
        if (linkedHashMap != null) {
            immutableMap = ImmutableMap.copyOf((Map) linkedHashMap);
        } else {
            immutableMap = null;
        }
        return immutableMap;
    }

    public final synchronized E6F A0L() {
        return this.A0M;
    }

    public final synchronized C7O9 A0O() {
        C7O9 c7o9;
        C7QR c7qr = this.A0Z;
        if (c7qr != null) {
            c7o9 = c7qr.A01;
            c7o9.getClass();
        } else {
            c7o9 = null;
        }
        return c7o9;
    }

    public final synchronized C101584hT A0Q() {
        return this.A0d;
    }

    public final synchronized C83693oE A0U() {
        return this.A0x;
    }

    public final synchronized Boolean A0X() {
        Boolean valueOf;
        Integer num = this.A1H;
        if (num != null) {
            int intValue = num.intValue();
            boolean z = true;
            if (intValue != 1) {
                z = false;
            }
            valueOf = Boolean.valueOf(z);
        } else {
            valueOf = null;
        }
        return valueOf;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x000c, code lost:
    
        if (r3.A10 != X.C2EY.A1C) goto L7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized java.lang.Boolean A0Y() {
        /*
            r3 = this;
            monitor-enter(r3)
            java.lang.Object r0 = r3.A1T     // Catch: java.lang.Throwable -> L15
            boolean r0 = r0 instanceof X.C38321qM     // Catch: java.lang.Throwable -> L15
            if (r0 == 0) goto Le
            X.2EY r2 = r3.A10     // Catch: java.lang.Throwable -> L15
            X.2EY r1 = X.C2EY.A1C     // Catch: java.lang.Throwable -> L15
            r0 = 1
            if (r2 == r1) goto Lf
        Le:
            r0 = 0
        Lf:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch: java.lang.Throwable -> L15
            monitor-exit(r3)
            return r0
        L15:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C83403nh.A0Y():java.lang.Boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x001d, code lost:
    
        if (r4.A10 != X.C2EY.A1m) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x002b, code lost:
    
        if (java.lang.Boolean.valueOf(r0).booleanValue() != false) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Boolean A0Z(com.instagram.common.session.UserSession r5, java.lang.Integer r6) {
        /*
            r4 = this;
            r3 = r4
            monitor-enter(r3)
            boolean r0 = r4.A1c()     // Catch: java.lang.Throwable -> L59
            if (r0 != 0) goto L3b
            java.lang.Boolean r0 = r4.A0Y()     // Catch: java.lang.Throwable -> L59
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L59
            if (r0 != 0) goto L2d
            java.lang.Object r0 = r4.A1T     // Catch: java.lang.Throwable -> L25
            boolean r0 = r0 instanceof X.C4G2     // Catch: java.lang.Throwable -> L25
            if (r0 == 0) goto L1f
            X.2EY r2 = r4.A10     // Catch: java.lang.Throwable -> L25
            X.2EY r1 = X.C2EY.A1m     // Catch: java.lang.Throwable -> L25
            r0 = 1
            if (r2 == r1) goto L20
        L1f:
            r0 = 0
        L20:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch: java.lang.Throwable -> L25
            goto L27
        L25:
            r0 = move-exception
            throw r0     // Catch: java.lang.Throwable -> L59
        L27:
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L59
            if (r0 == 0) goto L3b
        L2d:
            int r1 = r6.intValue()     // Catch: java.lang.Throwable -> L59
            r0 = 1003(0x3eb, float:1.406E-42)
            if (r1 == r0) goto L39
            r0 = 47
            if (r1 != r0) goto L3b
        L39:
            r0 = 1
            goto L3c
        L3b:
            r0 = 0
        L3c:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch: java.lang.Throwable -> L59
            monitor-exit(r3)
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L57
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36328572851535504(0x8110a500033e90, double:3.037673982507846E-306)
            boolean r0 = X.C18U.A06(r2, r5, r0)
        L52:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L57:
            r0 = 0
            goto L52
        L59:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C83403nh.A0Z(com.instagram.common.session.UserSession, java.lang.Integer):java.lang.Boolean");
    }

    public final synchronized Integer A0b() {
        Integer num;
        List list = this.A26;
        if (list != null && !list.isEmpty()) {
            num = ((C910143t) this.A26.get(0)).A0k;
        } else {
            num = this.A1G;
        }
        return num;
    }

    public final synchronized Integer A0c(String str) {
        int i;
        LinkedHashMap linkedHashMap = this.A1z;
        if (linkedHashMap != null && !linkedHashMap.isEmpty() && linkedHashMap.containsKey(str)) {
            i = (Integer) this.A1z.get(str);
        } else {
            i = -1;
        }
        return i;
    }

    public final synchronized Long A0e() {
        return this.A1N;
    }

    public final synchronized String A0l() {
        return this.A1X;
    }

    public final synchronized String A0m() {
        return this.A1l;
    }

    public final synchronized String A0n() {
        return this.A1m;
    }

    public final synchronized String A0o() {
        return this.A1n;
    }

    public final synchronized String A0p() {
        return this.A1t;
    }

    public final synchronized List A0u() {
        return this.A21;
    }

    public final synchronized List A0v() {
        return this.A24;
    }

    public final synchronized List A0w() {
        if (this.A25.isEmpty() && !this.A27.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            Iterator it = this.A27.iterator();
            while (it.hasNext()) {
                String id = ((User) it.next()).getId();
                ImmutableList immutableList = C83863oV.A07;
                arrayList.add(new AnonymousClass441(null, null, id, "❤", null));
            }
            this.A25 = arrayList;
        }
        return this.A25;
    }

    public final synchronized void A0y(UserSession userSession) {
        Object obj;
        C2EY c2ey = this.A10;
        Object obj2 = this.A1T;
        boolean z = this.A2P;
        Boolean bool = this.A18;
        Long l = this.A1L;
        AbstractC83843oT.A00(userSession, A0U(), c2ey, bool, l, obj2, this.A1n, this.A1l, A0g(), this.A26, z);
        AnonymousClass442 A0P = A0P();
        if (A0P != null) {
            C83693oE A0U = A0U();
            synchronized (A0P) {
                AnonymousClass443 anonymousClass443 = AnonymousClass443.$redex_init_class;
                C2EY c2ey2 = A0P.A0F;
                switch (c2ey2.ordinal()) {
                    case 3:
                        obj = A0P.A0C;
                        break;
                    case 14:
                        obj = A0P.A08;
                        break;
                    case 20:
                        obj = A0P.A01;
                        break;
                    case 22:
                        obj = A0P.A03;
                        break;
                    case 28:
                        obj = A0P.A04;
                        break;
                    case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN /* 46 */:
                        obj = A0P.A02;
                        break;
                    case 54:
                        obj = A0P.A07;
                        break;
                    default:
                        obj = null;
                        break;
                }
                AbstractC83843oT.A00(userSession, A0U, c2ey2, A0P.A0J, A0P.A0L, obj, null, null, A0P.A0R, A0P.A0Y, false);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [X.43z, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v7, types: [X.43z, java.lang.Object] */
    public final synchronized void A0z(UserSession userSession, AnonymousClass441 anonymousClass441, String str, String str2) {
        Long l;
        ExtendedImageUrl extendedImageUrl;
        List arrayList;
        LinkedHashMap linkedHashMap;
        AnonymousClass444 anonymousClass444;
        C910443z c910443z;
        List emptyList;
        ImmutableList immutableList = C83863oV.A07;
        String str3 = "❤";
        String str4 = null;
        if (anonymousClass441 != null) {
            str4 = anonymousClass441.A04;
            l = anonymousClass441.A01;
            String str5 = anonymousClass441.A02;
            if (str5 != null) {
                str3 = str5;
            }
            extendedImageUrl = anonymousClass441.A00;
        } else {
            l = null;
            extendedImageUrl = null;
        }
        boolean equals = str3.equals("❤");
        AnonymousClass441 anonymousClass4412 = new AnonymousClass441(extendedImageUrl, l, str, str3, str4);
        LinkedHashMap linkedHashMap2 = this.A1y;
        if (linkedHashMap2 == null) {
            linkedHashMap = new LinkedHashMap();
            this.A1y = linkedHashMap;
            anonymousClass444 = new AnonymousClass444(new ArrayList(Collections.singletonList(anonymousClass4412)));
        } else {
            if (linkedHashMap2.get(str3) != null) {
                arrayList = ((AnonymousClass444) this.A1y.get(str3)).A00;
            } else {
                arrayList = new ArrayList();
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                if (A0A((AnonymousClass441) obj, str, str3)) {
                    arrayList2.add(obj);
                }
            }
            arrayList2.add(anonymousClass4412);
            linkedHashMap = this.A1y;
            anonymousClass444 = new AnonymousClass444(arrayList2);
        }
        linkedHashMap.put(str3, anonymousClass444);
        C910443z c910443z2 = this.A0X;
        if (c910443z2 == null) {
            if (equals) {
                emptyList = Collections.singletonList(anonymousClass4412);
            } else {
                emptyList = Collections.emptyList();
            }
            List singletonList = Collections.singletonList(anonymousClass4412);
            ?? obj2 = new Object();
            obj2.A01 = Collections.unmodifiableList(emptyList);
            obj2.A00 = Collections.unmodifiableList(singletonList);
            c910443z = obj2;
        } else {
            List list = c910443z2.A00;
            C14360o3.A0B(list, 0);
            ArrayList arrayList3 = new ArrayList();
            for (Object obj3 : list) {
                if (A0A((AnonymousClass441) obj3, str, str3)) {
                    arrayList3.add(obj3);
                }
            }
            arrayList3.add(anonymousClass4412);
            ArrayList arrayList4 = new ArrayList(this.A0X.A01);
            if (equals) {
                List list2 = this.A0X.A01;
                C14360o3.A0B(list2, 0);
                arrayList4 = new ArrayList();
                for (Object obj4 : list2) {
                    if (A0A((AnonymousClass441) obj4, str, str3)) {
                        arrayList4.add(obj4);
                    }
                }
                arrayList4.add(anonymousClass4412);
            }
            ?? obj5 = new Object();
            obj5.A01 = Collections.unmodifiableList(arrayList4);
            obj5.A00 = Collections.unmodifiableList(arrayList3);
            c910443z = obj5;
        }
        this.A0X = c910443z;
        if (str2 != null) {
            A13(userSession, str2);
        }
        A05(userSession, this, false);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [X.43z, java.lang.Object] */
    public final synchronized void A10(UserSession userSession, AnonymousClass441 anonymousClass441, String str, String str2) {
        C910443z c910443z;
        List arrayList;
        ImmutableList immutableList = C83863oV.A07;
        String str3 = "❤";
        if (anonymousClass441 != null) {
            String str4 = anonymousClass441.A02;
            if (str4 != null) {
                str3 = str4;
            }
            LinkedHashMap linkedHashMap = this.A1y;
            if (linkedHashMap != null) {
                if (linkedHashMap.get(str3) != null) {
                    arrayList = ((AnonymousClass444) this.A1y.get(str3)).A00;
                } else {
                    arrayList = new ArrayList();
                }
                Iterator it = arrayList.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (str.equals(((AnonymousClass441) it.next()).A03)) {
                            it.remove();
                            break;
                        }
                    } else {
                        break;
                    }
                }
                if (arrayList.isEmpty()) {
                    this.A1y.remove(str3);
                }
            }
        }
        C910443z c910443z2 = this.A0X;
        if (c910443z2 != null) {
            List list = c910443z2.A01;
            C14360o3.A0B(list, 0);
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : list) {
                if (A0A((AnonymousClass441) obj, str, str3)) {
                    arrayList2.add(obj);
                }
            }
            List list2 = this.A0X.A00;
            C14360o3.A0B(list2, 0);
            ArrayList arrayList3 = new ArrayList();
            for (Object obj2 : list2) {
                if (A0A((AnonymousClass441) obj2, str, str3)) {
                    arrayList3.add(obj2);
                }
            }
            if (arrayList2.isEmpty() && arrayList3.isEmpty()) {
                c910443z = null;
            } else {
                ?? obj3 = new Object();
                obj3.A01 = Collections.unmodifiableList(arrayList2);
                obj3.A00 = Collections.unmodifiableList(arrayList3);
                c910443z = obj3;
            }
            this.A0X = c910443z;
        }
        if (str2 != null) {
            A13(userSession, str2);
        }
        A05(userSession, this, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:138:0x01e1, code lost:
    
        if (r1.equals(r0) != false) goto L136;
     */
    /* JADX WARN: Removed duplicated region for block: B:531:0x0366 A[Catch: all -> 0x0770, TryCatch #0 {, blocks: (B:4:0x0002, B:6:0x000b, B:8:0x0015, B:9:0x0019, B:15:0x0025, B:17:0x0029, B:19:0x002d, B:21:0x0037, B:23:0x0063, B:29:0x00a2, B:31:0x00a8, B:33:0x00ac, B:35:0x00b6, B:37:0x00c0, B:39:0x00cd, B:41:0x00d1, B:42:0x0044, B:44:0x0048, B:46:0x004e, B:48:0x005d, B:50:0x006e, B:52:0x0074, B:54:0x007f, B:56:0x008b, B:57:0x008f, B:58:0x0092, B:59:0x0077, B:61:0x007b, B:62:0x00d9, B:64:0x00dd, B:66:0x00e1, B:67:0x00e8, B:69:0x00ec, B:71:0x00f4, B:72:0x00fc, B:74:0x0104, B:76:0x010e, B:77:0x0112, B:79:0x011c, B:80:0x0120, B:82:0x0128, B:84:0x0132, B:85:0x0136, B:87:0x013e, B:89:0x0148, B:90:0x014c, B:92:0x0150, B:93:0x0153, B:95:0x0157, B:97:0x015f, B:98:0x0165, B:100:0x0169, B:102:0x0171, B:103:0x0177, B:105:0x017b, B:107:0x0183, B:108:0x0189, B:110:0x0192, B:112:0x0196, B:113:0x019a, B:115:0x019e, B:117:0x01a2, B:118:0x01a6, B:120:0x01ae, B:122:0x01b6, B:123:0x01b9, B:125:0x01bd, B:127:0x01c5, B:128:0x01c8, B:130:0x01cc, B:132:0x01d4, B:136:0x0321, B:137:0x01dd, B:139:0x01e3, B:141:0x01e7, B:143:0x01eb, B:144:0x01ef, B:146:0x01f3, B:148:0x01f7, B:149:0x01fb, B:151:0x01ff, B:153:0x0203, B:154:0x0207, B:156:0x020b, B:158:0x020f, B:159:0x0213, B:161:0x0217, B:163:0x021b, B:164:0x021f, B:166:0x0223, B:168:0x0227, B:169:0x022b, B:171:0x022f, B:173:0x0233, B:174:0x0237, B:176:0x023b, B:178:0x023f, B:179:0x0243, B:181:0x0247, B:183:0x024b, B:184:0x024f, B:186:0x0253, B:188:0x0257, B:189:0x025b, B:191:0x025f, B:193:0x0263, B:194:0x0267, B:196:0x026b, B:198:0x026f, B:199:0x0273, B:201:0x0279, B:202:0x027d, B:204:0x0281, B:206:0x0285, B:207:0x0289, B:209:0x028d, B:211:0x0291, B:212:0x0295, B:214:0x0299, B:216:0x029d, B:217:0x02a1, B:219:0x02a5, B:221:0x02a9, B:222:0x02ae, B:224:0x02b2, B:226:0x02b6, B:227:0x02ba, B:229:0x02c0, B:230:0x02c4, B:232:0x02ca, B:233:0x02ce, B:235:0x02d8, B:236:0x02e1, B:238:0x02eb, B:239:0x02ed, B:242:0x038a, B:244:0x038e, B:246:0x0393, B:248:0x039b, B:250:0x039f, B:252:0x03a7, B:262:0x03dd, B:264:0x03e1, B:266:0x03e5, B:267:0x03e9, B:269:0x03ed, B:271:0x03f1, B:272:0x03f5, B:274:0x03fb, B:276:0x03ff, B:279:0x0405, B:280:0x0407, B:283:0x0419, B:285:0x041d, B:286:0x041f, B:288:0x0423, B:289:0x0425, B:291:0x0429, B:292:0x042b, B:294:0x042f, B:295:0x0437, B:297:0x043b, B:300:0x044b, B:302:0x044f, B:303:0x0451, B:304:0x0455, B:306:0x045b, B:307:0x046f, B:309:0x0460, B:310:0x046d, B:311:0x0471, B:313:0x0475, B:315:0x047d, B:316:0x0483, B:318:0x0487, B:320:0x048f, B:321:0x0495, B:323:0x049b, B:325:0x04a7, B:327:0x04ad, B:329:0x04b9, B:331:0x04c0, B:333:0x04c8, B:334:0x04ce, B:336:0x04d4, B:337:0x04d8, B:339:0x04de, B:340:0x04e5, B:342:0x04eb, B:343:0x04ef, B:345:0x04f5, B:346:0x04f9, B:348:0x04ff, B:349:0x0503, B:351:0x0509, B:352:0x050d, B:354:0x0511, B:356:0x0519, B:357:0x051f, B:359:0x0523, B:361:0x052b, B:362:0x0531, B:364:0x0535, B:366:0x053d, B:367:0x0543, B:369:0x0547, B:371:0x0555, B:373:0x0559, B:375:0x0561, B:376:0x0567, B:378:0x056d, B:379:0x0571, B:381:0x0575, B:383:0x057d, B:384:0x0583, B:386:0x0589, B:387:0x058d, B:389:0x0591, B:391:0x0599, B:392:0x059d, B:394:0x05a3, B:395:0x05a7, B:397:0x05b0, B:399:0x05b8, B:400:0x05bc, B:402:0x05c2, B:403:0x05c6, B:405:0x05ca, B:406:0x05cd, B:408:0x05d1, B:410:0x05d5, B:411:0x05d9, B:413:0x05e3, B:414:0x05e9, B:416:0x05f3, B:417:0x05f9, B:419:0x05fd, B:421:0x0605, B:422:0x060b, B:424:0x061d, B:425:0x0623, B:427:0x062d, B:428:0x0633, B:430:0x063d, B:431:0x0643, B:433:0x064d, B:434:0x0653, B:436:0x065d, B:437:0x0663, B:439:0x066d, B:440:0x0673, B:442:0x067d, B:443:0x0683, B:445:0x068d, B:446:0x0693, B:448:0x069d, B:449:0x06a3, B:451:0x06a7, B:453:0x06af, B:454:0x06b5, B:456:0x06bb, B:457:0x06bf, B:459:0x06c3, B:461:0x06c9, B:462:0x06cd, B:464:0x06d3, B:465:0x06d7, B:467:0x06db, B:469:0x06e3, B:470:0x06e9, B:472:0x06ed, B:474:0x06f5, B:475:0x06fb, B:477:0x06ff, B:479:0x0707, B:480:0x070d, B:482:0x0711, B:484:0x0719, B:485:0x071f, B:487:0x0723, B:489:0x072b, B:490:0x0731, B:492:0x0737, B:493:0x073b, B:495:0x073f, B:497:0x0747, B:498:0x074b, B:500:0x0751, B:501:0x0755, B:503:0x0759, B:505:0x0761, B:506:0x0767, B:510:0x054f, B:511:0x04b3, B:512:0x04a1, B:550:0x076f, B:515:0x032a, B:519:0x0334, B:521:0x033e, B:522:0x0346, B:524:0x034c, B:529:0x0362, B:531:0x0366, B:532:0x036e, B:534:0x0374, B:538:0x02f0, B:540:0x02fa, B:541:0x0300, B:543:0x030a, B:544:0x0310, B:546:0x031a, B:253:0x03b4, B:255:0x03c0, B:256:0x03c4, B:258:0x03d0, B:513:0x03da, B:548:0x076d), top: B:3:0x0002, inners: #2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void A11(com.instagram.common.session.UserSession r8, X.C83403nh r9, X.C83693oE r10) {
        /*
            Method dump skipped, instructions count: 1907
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C83403nh.A11(com.instagram.common.session.UserSession, X.3nh, X.3oE):void");
    }

    public final void A12(UserSession userSession, C83693oE c83693oE) {
        synchronized (this) {
            A16(c83693oE);
        }
        A0y(userSession);
    }

    public final synchronized void A13(UserSession userSession, String str) {
        C47948LGd c47948LGd;
        if (str.equals(this.A1e) && (c47948LGd = this.A0Y) != null) {
            String str2 = c47948LGd.A07;
            boolean equals = "created".equals(str2);
            if ("deleted".equals(str2)) {
                this.A1k = null;
            }
            this.A1e = null;
            this.A0Y = null;
            A05(userSession, this, equals);
        }
    }

    public synchronized void A14(AnonymousClass442 anonymousClass442) {
        if (this.A0a != anonymousClass442) {
            this.A0a = anonymousClass442;
            this.A2C = true;
        }
    }

    public final synchronized void A15(C38321qM c38321qM) {
        this.A0s = c38321qM;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x000f, code lost:
    
        if (r3.equals(r2.A0x) == false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void A16(X.C83693oE r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            r1 = 1
            if (r3 != 0) goto L9
            X.3oE r0 = r2.A0x     // Catch: java.lang.Throwable -> L1b
            if (r0 != 0) goto L11
            goto L19
        L9:
            X.3oE r0 = r2.A0x     // Catch: java.lang.Throwable -> L1b
            boolean r0 = r3.equals(r0)     // Catch: java.lang.Throwable -> L1b
            if (r0 != 0) goto L19
        L11:
            X.3oE r0 = r2.A0x     // Catch: java.lang.Throwable -> L1b
            if (r0 != 0) goto L19
            r2.A2C = r1     // Catch: java.lang.Throwable -> L1b
            r2.A0x = r3     // Catch: java.lang.Throwable -> L1b
        L19:
            monitor-exit(r2)
            return
        L1b:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C83403nh.A16(X.3oE):void");
    }

    @Deprecated
    public final void A17(DirectThreadKey directThreadKey) {
        DirectThreadKey directThreadKey2 = this.A0y;
        if (directThreadKey == null) {
            if (directThreadKey2 == null) {
                return;
            }
        } else if (directThreadKey.equals(directThreadKey2)) {
            return;
        }
        this.A2C = true;
        this.A0y = directThreadKey;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0007. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0129 A[Catch: all -> 0x0144, TryCatch #1 {, blocks: (B:4:0x0001, B:5:0x0007, B:6:0x000a, B:8:0x0010, B:10:0x0014, B:11:0x001d, B:12:0x0024, B:13:0x003a, B:15:0x003b, B:16:0x0042, B:17:0x0049, B:18:0x0051, B:20:0x0055, B:21:0x005c, B:23:0x0060, B:24:0x0067, B:25:0x007f, B:26:0x006f, B:28:0x0073, B:31:0x007d, B:33:0x0083, B:34:0x008a, B:35:0x0091, B:36:0x0098, B:37:0x009f, B:38:0x00a6, B:39:0x00ac, B:40:0x00b2, B:41:0x00b8, B:42:0x00be, B:43:0x00c4, B:44:0x00ca, B:45:0x00d0, B:46:0x00d6, B:47:0x00dc, B:48:0x00e2, B:49:0x00e8, B:50:0x00ee, B:51:0x00f4, B:52:0x00fa, B:53:0x0100, B:54:0x0106, B:56:0x010a, B:57:0x0110, B:58:0x0116, B:59:0x0120, B:60:0x0125, B:62:0x0129, B:63:0x0131, B:67:0x0136, B:68:0x0143), top: B:2:0x0001, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void A18(X.C2EY r4, java.lang.Object r5) {
        /*
            Method dump skipped, instructions count: 458
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C83403nh.A18(X.2EY, java.lang.Object):void");
    }

    public final synchronized void A19(C2EY c2ey, Object obj) {
        AbstractC83833oS abstractC83833oS = AbstractC83833oS.$redex_init_class;
        int ordinal = c2ey.ordinal();
        if (ordinal != 2) {
            if (ordinal != 3) {
                if (ordinal != 14) {
                    if (ordinal != 12) {
                        if (ordinal != 13) {
                            switch (ordinal) {
                                case 9:
                                    break;
                                case 10:
                                    A07((ExtendedImageUrl) obj);
                                    break;
                                case 81:
                                    if (obj != null) {
                                        this.A0i = AbstractC47996LLi.A0A(new ExtendedImageUrl(((C148286ly) obj).A0H), AbstractC43591JPw.A00(1084));
                                        break;
                                    }
                                    break;
                                default:
                                    StringBuilder sb = new StringBuilder();
                                    sb.append("unsupported message type: ");
                                    sb.append(c2ey);
                                    throw new UnsupportedOperationException(sb.toString());
                            }
                        } else {
                            this.A15 = (DirectStoreStickerResponseItem) obj;
                        }
                    } else {
                        this.A12 = (C1120954b) obj;
                    }
                } else {
                    this.A0g = (C4G2) obj;
                    this.A1v = "replayable";
                }
            } else {
                this.A1U = obj;
                if (obj instanceof C7Q4) {
                    this.A0v = (C7Q4) obj;
                } else if (obj instanceof C38321qM) {
                    this.A0s = (C38321qM) obj;
                }
                this.A1v = "permanent";
            }
            this.A0z = c2ey;
        }
        A09((String) obj);
        this.A0z = c2ey;
    }

    public final void A1A(Long l) {
        Long l2 = this.A1P;
        if (l == null) {
            if (l2 == null) {
                return;
            }
        } else if (l.equals(l2)) {
            return;
        }
        this.A1P = l;
        this.A2C = true;
    }

    public synchronized void A1C(Long l) {
        this.A1L = l;
    }

    public final void A1F(String str) {
        String str2 = this.A1c;
        if (str == null) {
            if (str2 == null) {
                return;
            }
        } else if (str.equals(str2)) {
            return;
        }
        this.A1c = str;
        this.A2C = true;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [X.570, java.lang.Object] */
    public final synchronized void A1G(String str) {
        if (!AbstractC50102Ry.A00(str, this.A1X)) {
            this.A1X = str;
            this.A2C = true;
            ?? obj = new Object();
            obj.A01 = "";
            obj.A02 = "undecrypted_encrypted_message";
            obj.A00 = str;
            this.A1T = obj;
        }
    }

    public final synchronized void A1H(String str) {
        if (str == null) {
            if (this.A1s == null) {
            }
            this.A1s = str;
            this.A2C = true;
        } else {
            if (str.equals(this.A1s)) {
            }
            this.A1s = str;
            this.A2C = true;
        }
    }

    public final synchronized void A1I(String str) {
        if (str == null) {
            if (this.A1t == null) {
            }
            this.A1t = str;
            this.A2C = true;
        } else {
            if (str.equals(this.A1t)) {
            }
            this.A1t = str;
            this.A2C = true;
        }
    }

    public final synchronized void A1J(String str, Integer num) {
        LinkedHashMap linkedHashMap = this.A1z;
        if (linkedHashMap == null) {
            linkedHashMap = new LinkedHashMap();
            this.A1z = linkedHashMap;
        }
        if (!linkedHashMap.containsKey(str) || this.A1z.get(str) != num) {
            this.A1z.put(str, num);
            this.A2C = true;
        }
    }

    public final synchronized void A1K(List list) {
        ArrayList arrayList = new ArrayList(list);
        if (this.A24 != arrayList) {
            this.A24 = arrayList;
            this.A2C = true;
        }
    }

    public final synchronized void A1L(List list) {
        if (!AbstractC50102Ry.A00(this.A29, list)) {
            this.A2C = true;
            this.A29 = list;
        }
    }

    public final synchronized boolean A1b() {
        boolean z;
        LinkedHashMap linkedHashMap = this.A1z;
        if (linkedHashMap != null) {
            Iterator it = linkedHashMap.entrySet().iterator();
            while (it.hasNext()) {
                z = true;
                if (((Integer) ((Map.Entry) it.next()).getValue()).intValue() == 1) {
                    break;
                }
            }
        }
        z = false;
        return z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x000e, code lost:
    
        if (r1 != false) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized boolean A1c() {
        /*
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.A1S()     // Catch: java.lang.Throwable -> L13
            if (r0 == 0) goto L10
            X.Jxp r0 = r2.A0D     // Catch: java.lang.Throwable -> L13
            if (r0 == 0) goto L10
            boolean r1 = r0.A06     // Catch: java.lang.Throwable -> L13
            r0 = 1
            if (r1 == 0) goto L11
        L10:
            r0 = 0
        L11:
            monitor-exit(r2)
            return r0
        L13:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C83403nh.A1c():boolean");
    }

    public final synchronized boolean A1d() {
        return this.A2Q;
    }

    public final synchronized boolean A1h(UserSession userSession, Collection collection) {
        HashSet hashSet;
        boolean z;
        List list = this.A22;
        if (list == null) {
            hashSet = new HashSet();
        } else {
            hashSet = new HashSet(list);
        }
        if (hashSet.equals(new HashSet(collection))) {
            z = false;
        } else {
            A04(userSession, this, ImmutableList.copyOf(collection));
            z = true;
            this.A2C = true;
            A06(this);
        }
        return z;
    }

    public final boolean A1k(User user) {
        List list;
        synchronized (this) {
            list = this.A27;
        }
        if (!list.contains(user)) {
            ImmutableList A0J = A0J();
            if (A0J != null) {
                Iterator<E> it = A0J.iterator();
                while (it.hasNext()) {
                    if (((DirectCountBasedReaction) it.next()).A02) {
                        return true;
                    }
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final boolean A1n(Long l) {
        Long l2;
        if (l == null || !A1T() || (l2 = this.A1L) == null) {
            return false;
        }
        Long l3 = this.A1N;
        long longValue = l2.longValue();
        if (l3 != null) {
            longValue = Math.min(longValue, l3.longValue());
        }
        return longValue < l.longValue();
    }

    public static C83403nh A01(C83553nw c83553nw, AnonymousClass544 anonymousClass544, AnonymousClass442 anonymousClass442, C83693oE c83693oE, C2EY c2ey, C2EY c2ey2, User user, Boolean bool, Long l, Long l2, Long l3, Long l4, Object obj, Object obj2, String str, String str2, List list, List list2, long j, boolean z, boolean z2, boolean z3) {
        C83403nh c83403nh = new C83403nh();
        c83403nh.A18(c2ey, obj);
        c83403nh.A02();
        if (str2 != null) {
            c83403nh.A1V = str2;
        }
        if (user != null) {
            c83403nh.A1u = user.getId();
        }
        if (c83403nh.A1u == null) {
            C0w9.A03("Direct Message user id is null", "DirectMessage.createPendingMessage");
        }
        c83403nh.A1W = str;
        c83403nh.A1B(Long.valueOf(j));
        c83403nh.A1A(l);
        c83403nh.A1m(C05F.A01);
        c83403nh.A2T = anonymousClass442;
        if (l4 != null && !l4.equals(c83403nh.A1Q)) {
            c83403nh.A2C = true;
            c83403nh.A1Q = l4;
            c83403nh.A2D = true;
        }
        if (c2ey2 != null && obj2 != null) {
            c83403nh.A19(c2ey2, obj2);
        }
        c83403nh.A0N = c83553nw;
        c83403nh.A2P = z;
        c83403nh.A1K = l2;
        c83403nh.A1M = l3;
        c83403nh.A0V = anonymousClass544;
        c83403nh.A2F = z2;
        c83403nh.A28 = list;
        c83403nh.A2O = z3;
        c83403nh.A21 = list2;
        c83403nh.A0x = c83693oE;
        if (bool != null) {
            c83403nh.A1C = bool;
        }
        return c83403nh;
    }

    private void A02() {
        String str;
        if (Systrace.A0E(32L)) {
            AbstractC09800fd.A01("DirectMessage.updateIsMessageEmoji", 1365118592);
        }
        try {
            C2EY c2ey = this.A10;
            boolean z = true;
            if (c2ey == C2EY.A1i) {
                String str2 = this.A1q;
                if (str2 == null || !AbstractC13670mt.A0E(str2)) {
                    z = false;
                }
                this.A1A = Boolean.valueOf(z);
            } else if (c2ey == C2EY.A1e) {
                this.A0p.getClass();
                L93 l93 = this.A0p;
                String str3 = l93.A05;
                if (l93.A03 != C05F.A01 && (((str = l93.A04) == null || str.isEmpty() || !str.equals("❤")) && (str3 == null || !AbstractC13670mt.A0E(str3)))) {
                    z = false;
                }
                this.A1A = Boolean.valueOf(z);
            } else {
                this.A1A = false;
            }
            if (Systrace.A0E(32L)) {
                AbstractC09800fd.A00(187263478);
            }
        } catch (Throwable th) {
            if (Systrace.A0E(32L)) {
                AbstractC09800fd.A00(1884815889);
            }
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0034, code lost:
    
        if (X.C18U.A06(r3, r9, 36314627092777717L) != false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void A03(com.instagram.common.session.UserSession r9) {
        /*
            r8 = this;
            r6 = 32
            boolean r0 = com.facebook.systrace.Systrace.A0E(r6)
            if (r0 == 0) goto L10
            r1 = -1131320761(0xffffffffbc916a47, float:-0.017750872)
            java.lang.String r0 = "DirectMessage.updateShouldShowHFI"
            X.AbstractC09800fd.A01(r0, r1)
        L10:
            java.lang.Integer r0 = r8.A1E     // Catch: java.lang.Throwable -> L48
            r5 = 1
            if (r0 == 0) goto L39
            int r4 = r0.intValue()     // Catch: java.lang.Throwable -> L48
            r0 = 0
            X.C14360o3.A0B(r9, r0)     // Catch: java.lang.Throwable -> L48
            X.0Tz r3 = X.C06090Tz.A05     // Catch: java.lang.Throwable -> L48
            r0 = 36596102069356870(0x8203f600020946, double:3.2068605371117714E-306)
            long r1 = X.C18U.A01(r3, r9, r0)     // Catch: java.lang.Throwable -> L48
            int r0 = (int) r1     // Catch: java.lang.Throwable -> L48
            if (r4 < r0) goto L39
            r0 = 36314627092777717(0x8103f600040af5, double:3.0288546285143583E-306)
            boolean r0 = X.C18U.A06(r3, r9, r0)     // Catch: java.lang.Throwable -> L48
            if (r0 == 0) goto L39
        L36:
            r8.A2S = r5     // Catch: java.lang.Throwable -> L48
            goto L3b
        L39:
            r5 = 0
            goto L36
        L3b:
            boolean r0 = com.facebook.systrace.Systrace.A0E(r6)
            if (r0 == 0) goto L47
            r0 = 1906293029(0x719fb925, float:1.5818222E30)
            X.AbstractC09800fd.A00(r0)
        L47:
            return
        L48:
            r1 = move-exception
            boolean r0 = com.facebook.systrace.Systrace.A0E(r6)
            if (r0 == 0) goto L55
            r0 = 1092083021(0x4117dd4d, float:9.4915285)
            X.AbstractC09800fd.A00(r0)
        L55:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C83403nh.A03(com.instagram.common.session.UserSession):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x007c, code lost:
    
        if (r11.equals("❤") != false) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static synchronized void A05(com.instagram.common.session.UserSession r19, X.C83403nh r20, boolean r21) {
        /*
            Method dump skipped, instructions count: 538
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C83403nh.A05(com.instagram.common.session.UserSession, X.3nh, boolean):void");
    }

    public static void A06(C83403nh c83403nh) {
        Iterator it = c83403nh.A2W.iterator();
        if (it.hasNext()) {
            it.next();
            c83403nh.A0i();
            throw new NullPointerException("onReactionsStateChange");
        }
    }

    private void A09(String str) {
        if (!AbstractC50102Ry.A00(str, this.A1q)) {
            this.A1q = str;
            this.A1A = null;
            this.A2C = true;
        }
    }

    public final long A0D() {
        Long l = this.A1P;
        if (l != null) {
            return l.longValue();
        }
        return C8i();
    }

    public final AnonymousClass541 A0G() {
        AnonymousClass541 anonymousClass541;
        AnonymousClass544 anonymousClass544 = this.A0V;
        if (anonymousClass544 == null || (anonymousClass541 = anonymousClass544.A00) == null) {
            return AnonymousClass541.A0J;
        }
        return anonymousClass541;
    }

    public final ImmutableList A0H() {
        List list = this.A26;
        if (list == null) {
            return null;
        }
        return ImmutableList.copyOf((Collection) list);
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0330, code lost:
    
        if (r6 == 0) goto L181;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:27:0x0173. Please report as an issue. */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0491  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x03a9  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0336 A[Catch: all -> 0x04a0, TryCatch #1 {all -> 0x04a0, blocks: (B:7:0x001b, B:9:0x0027, B:10:0x0034, B:12:0x0039, B:17:0x0049, B:24:0x0054, B:208:0x005c, B:210:0x0060, B:212:0x006a, B:214:0x0070, B:217:0x0088, B:219:0x0092, B:221:0x0096, B:222:0x0098, B:224:0x009e, B:226:0x00a2, B:228:0x00a6, B:230:0x00ac, B:231:0x00b0, B:233:0x00b4, B:235:0x00b8, B:238:0x00c4, B:241:0x010a, B:243:0x010e, B:245:0x0118, B:247:0x011c, B:248:0x011e, B:250:0x0122, B:253:0x012d, B:256:0x0144, B:258:0x014e, B:261:0x0159, B:264:0x0164, B:265:0x0086, B:26:0x016b, B:27:0x0173, B:28:0x0176, B:30:0x017c, B:40:0x0332, B:42:0x0336, B:46:0x0391, B:48:0x0395, B:49:0x039d, B:51:0x03a1, B:56:0x03b0, B:58:0x03bd, B:60:0x03ca, B:61:0x03ce, B:82:0x0432, B:90:0x049e, B:91:0x049f, B:92:0x0433, B:94:0x0453, B:95:0x0457, B:97:0x045d, B:99:0x0461, B:101:0x0465, B:105:0x0477, B:124:0x01ba, B:126:0x01be, B:127:0x01c0, B:129:0x01c4, B:131:0x01eb, B:133:0x0212, B:134:0x0216, B:136:0x021e, B:137:0x0224, B:138:0x0226, B:154:0x0244, B:155:0x0248, B:157:0x024c, B:159:0x0254, B:160:0x025f, B:161:0x026b, B:163:0x026f, B:166:0x0279, B:167:0x0284, B:168:0x028c, B:169:0x0294, B:170:0x0298, B:171:0x029c, B:172:0x02a0, B:174:0x02a4, B:176:0x02a8, B:178:0x02cc, B:179:0x02ce, B:181:0x02d2, B:183:0x02d6, B:184:0x02fa, B:186:0x02fe, B:187:0x0304, B:188:0x0307, B:189:0x030a, B:190:0x030d, B:191:0x0310, B:192:0x0313, B:193:0x0316, B:194:0x0319, B:195:0x031c, B:196:0x031f, B:197:0x0322, B:198:0x0325, B:199:0x0328, B:200:0x032b, B:201:0x032e, B:202:0x0357, B:205:0x0377, B:206:0x037a, B:63:0x03cf, B:65:0x03d5, B:79:0x0417, B:81:0x041d, B:85:0x0425, B:87:0x042b, B:88:0x0431), top: B:6:0x001b, inners: #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0395 A[Catch: all -> 0x04a0, TryCatch #1 {all -> 0x04a0, blocks: (B:7:0x001b, B:9:0x0027, B:10:0x0034, B:12:0x0039, B:17:0x0049, B:24:0x0054, B:208:0x005c, B:210:0x0060, B:212:0x006a, B:214:0x0070, B:217:0x0088, B:219:0x0092, B:221:0x0096, B:222:0x0098, B:224:0x009e, B:226:0x00a2, B:228:0x00a6, B:230:0x00ac, B:231:0x00b0, B:233:0x00b4, B:235:0x00b8, B:238:0x00c4, B:241:0x010a, B:243:0x010e, B:245:0x0118, B:247:0x011c, B:248:0x011e, B:250:0x0122, B:253:0x012d, B:256:0x0144, B:258:0x014e, B:261:0x0159, B:264:0x0164, B:265:0x0086, B:26:0x016b, B:27:0x0173, B:28:0x0176, B:30:0x017c, B:40:0x0332, B:42:0x0336, B:46:0x0391, B:48:0x0395, B:49:0x039d, B:51:0x03a1, B:56:0x03b0, B:58:0x03bd, B:60:0x03ca, B:61:0x03ce, B:82:0x0432, B:90:0x049e, B:91:0x049f, B:92:0x0433, B:94:0x0453, B:95:0x0457, B:97:0x045d, B:99:0x0461, B:101:0x0465, B:105:0x0477, B:124:0x01ba, B:126:0x01be, B:127:0x01c0, B:129:0x01c4, B:131:0x01eb, B:133:0x0212, B:134:0x0216, B:136:0x021e, B:137:0x0224, B:138:0x0226, B:154:0x0244, B:155:0x0248, B:157:0x024c, B:159:0x0254, B:160:0x025f, B:161:0x026b, B:163:0x026f, B:166:0x0279, B:167:0x0284, B:168:0x028c, B:169:0x0294, B:170:0x0298, B:171:0x029c, B:172:0x02a0, B:174:0x02a4, B:176:0x02a8, B:178:0x02cc, B:179:0x02ce, B:181:0x02d2, B:183:0x02d6, B:184:0x02fa, B:186:0x02fe, B:187:0x0304, B:188:0x0307, B:189:0x030a, B:190:0x030d, B:191:0x0310, B:192:0x0313, B:193:0x0316, B:194:0x0319, B:195:0x031c, B:196:0x031f, B:197:0x0322, B:198:0x0325, B:199:0x0328, B:200:0x032b, B:201:0x032e, B:202:0x0357, B:205:0x0377, B:206:0x037a, B:63:0x03cf, B:65:0x03d5, B:79:0x0417, B:81:0x041d, B:85:0x0425, B:87:0x042b, B:88:0x0431), top: B:6:0x001b, inners: #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x03a1 A[Catch: all -> 0x04a0, TryCatch #1 {all -> 0x04a0, blocks: (B:7:0x001b, B:9:0x0027, B:10:0x0034, B:12:0x0039, B:17:0x0049, B:24:0x0054, B:208:0x005c, B:210:0x0060, B:212:0x006a, B:214:0x0070, B:217:0x0088, B:219:0x0092, B:221:0x0096, B:222:0x0098, B:224:0x009e, B:226:0x00a2, B:228:0x00a6, B:230:0x00ac, B:231:0x00b0, B:233:0x00b4, B:235:0x00b8, B:238:0x00c4, B:241:0x010a, B:243:0x010e, B:245:0x0118, B:247:0x011c, B:248:0x011e, B:250:0x0122, B:253:0x012d, B:256:0x0144, B:258:0x014e, B:261:0x0159, B:264:0x0164, B:265:0x0086, B:26:0x016b, B:27:0x0173, B:28:0x0176, B:30:0x017c, B:40:0x0332, B:42:0x0336, B:46:0x0391, B:48:0x0395, B:49:0x039d, B:51:0x03a1, B:56:0x03b0, B:58:0x03bd, B:60:0x03ca, B:61:0x03ce, B:82:0x0432, B:90:0x049e, B:91:0x049f, B:92:0x0433, B:94:0x0453, B:95:0x0457, B:97:0x045d, B:99:0x0461, B:101:0x0465, B:105:0x0477, B:124:0x01ba, B:126:0x01be, B:127:0x01c0, B:129:0x01c4, B:131:0x01eb, B:133:0x0212, B:134:0x0216, B:136:0x021e, B:137:0x0224, B:138:0x0226, B:154:0x0244, B:155:0x0248, B:157:0x024c, B:159:0x0254, B:160:0x025f, B:161:0x026b, B:163:0x026f, B:166:0x0279, B:167:0x0284, B:168:0x028c, B:169:0x0294, B:170:0x0298, B:171:0x029c, B:172:0x02a0, B:174:0x02a4, B:176:0x02a8, B:178:0x02cc, B:179:0x02ce, B:181:0x02d2, B:183:0x02d6, B:184:0x02fa, B:186:0x02fe, B:187:0x0304, B:188:0x0307, B:189:0x030a, B:190:0x030d, B:191:0x0310, B:192:0x0313, B:193:0x0316, B:194:0x0319, B:195:0x031c, B:196:0x031f, B:197:0x0322, B:198:0x0325, B:199:0x0328, B:200:0x032b, B:201:0x032e, B:202:0x0357, B:205:0x0377, B:206:0x037a, B:63:0x03cf, B:65:0x03d5, B:79:0x0417, B:81:0x041d, B:85:0x0425, B:87:0x042b, B:88:0x0431), top: B:6:0x001b, inners: #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x03ae A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x03ca A[Catch: all -> 0x04a0, TryCatch #1 {all -> 0x04a0, blocks: (B:7:0x001b, B:9:0x0027, B:10:0x0034, B:12:0x0039, B:17:0x0049, B:24:0x0054, B:208:0x005c, B:210:0x0060, B:212:0x006a, B:214:0x0070, B:217:0x0088, B:219:0x0092, B:221:0x0096, B:222:0x0098, B:224:0x009e, B:226:0x00a2, B:228:0x00a6, B:230:0x00ac, B:231:0x00b0, B:233:0x00b4, B:235:0x00b8, B:238:0x00c4, B:241:0x010a, B:243:0x010e, B:245:0x0118, B:247:0x011c, B:248:0x011e, B:250:0x0122, B:253:0x012d, B:256:0x0144, B:258:0x014e, B:261:0x0159, B:264:0x0164, B:265:0x0086, B:26:0x016b, B:27:0x0173, B:28:0x0176, B:30:0x017c, B:40:0x0332, B:42:0x0336, B:46:0x0391, B:48:0x0395, B:49:0x039d, B:51:0x03a1, B:56:0x03b0, B:58:0x03bd, B:60:0x03ca, B:61:0x03ce, B:82:0x0432, B:90:0x049e, B:91:0x049f, B:92:0x0433, B:94:0x0453, B:95:0x0457, B:97:0x045d, B:99:0x0461, B:101:0x0465, B:105:0x0477, B:124:0x01ba, B:126:0x01be, B:127:0x01c0, B:129:0x01c4, B:131:0x01eb, B:133:0x0212, B:134:0x0216, B:136:0x021e, B:137:0x0224, B:138:0x0226, B:154:0x0244, B:155:0x0248, B:157:0x024c, B:159:0x0254, B:160:0x025f, B:161:0x026b, B:163:0x026f, B:166:0x0279, B:167:0x0284, B:168:0x028c, B:169:0x0294, B:170:0x0298, B:171:0x029c, B:172:0x02a0, B:174:0x02a4, B:176:0x02a8, B:178:0x02cc, B:179:0x02ce, B:181:0x02d2, B:183:0x02d6, B:184:0x02fa, B:186:0x02fe, B:187:0x0304, B:188:0x0307, B:189:0x030a, B:190:0x030d, B:191:0x0310, B:192:0x0313, B:193:0x0316, B:194:0x0319, B:195:0x031c, B:196:0x031f, B:197:0x0322, B:198:0x0325, B:199:0x0328, B:200:0x032b, B:201:0x032e, B:202:0x0357, B:205:0x0377, B:206:0x037a, B:63:0x03cf, B:65:0x03d5, B:79:0x0417, B:81:0x041d, B:85:0x0425, B:87:0x042b, B:88:0x0431), top: B:6:0x001b, inners: #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0453 A[Catch: all -> 0x04a0, TryCatch #1 {all -> 0x04a0, blocks: (B:7:0x001b, B:9:0x0027, B:10:0x0034, B:12:0x0039, B:17:0x0049, B:24:0x0054, B:208:0x005c, B:210:0x0060, B:212:0x006a, B:214:0x0070, B:217:0x0088, B:219:0x0092, B:221:0x0096, B:222:0x0098, B:224:0x009e, B:226:0x00a2, B:228:0x00a6, B:230:0x00ac, B:231:0x00b0, B:233:0x00b4, B:235:0x00b8, B:238:0x00c4, B:241:0x010a, B:243:0x010e, B:245:0x0118, B:247:0x011c, B:248:0x011e, B:250:0x0122, B:253:0x012d, B:256:0x0144, B:258:0x014e, B:261:0x0159, B:264:0x0164, B:265:0x0086, B:26:0x016b, B:27:0x0173, B:28:0x0176, B:30:0x017c, B:40:0x0332, B:42:0x0336, B:46:0x0391, B:48:0x0395, B:49:0x039d, B:51:0x03a1, B:56:0x03b0, B:58:0x03bd, B:60:0x03ca, B:61:0x03ce, B:82:0x0432, B:90:0x049e, B:91:0x049f, B:92:0x0433, B:94:0x0453, B:95:0x0457, B:97:0x045d, B:99:0x0461, B:101:0x0465, B:105:0x0477, B:124:0x01ba, B:126:0x01be, B:127:0x01c0, B:129:0x01c4, B:131:0x01eb, B:133:0x0212, B:134:0x0216, B:136:0x021e, B:137:0x0224, B:138:0x0226, B:154:0x0244, B:155:0x0248, B:157:0x024c, B:159:0x0254, B:160:0x025f, B:161:0x026b, B:163:0x026f, B:166:0x0279, B:167:0x0284, B:168:0x028c, B:169:0x0294, B:170:0x0298, B:171:0x029c, B:172:0x02a0, B:174:0x02a4, B:176:0x02a8, B:178:0x02cc, B:179:0x02ce, B:181:0x02d2, B:183:0x02d6, B:184:0x02fa, B:186:0x02fe, B:187:0x0304, B:188:0x0307, B:189:0x030a, B:190:0x030d, B:191:0x0310, B:192:0x0313, B:193:0x0316, B:194:0x0319, B:195:0x031c, B:196:0x031f, B:197:0x0322, B:198:0x0325, B:199:0x0328, B:200:0x032b, B:201:0x032e, B:202:0x0357, B:205:0x0377, B:206:0x037a, B:63:0x03cf, B:65:0x03d5, B:79:0x0417, B:81:0x041d, B:85:0x0425, B:87:0x042b, B:88:0x0431), top: B:6:0x001b, inners: #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x046b  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0461 A[Catch: all -> 0x04a0, TryCatch #1 {all -> 0x04a0, blocks: (B:7:0x001b, B:9:0x0027, B:10:0x0034, B:12:0x0039, B:17:0x0049, B:24:0x0054, B:208:0x005c, B:210:0x0060, B:212:0x006a, B:214:0x0070, B:217:0x0088, B:219:0x0092, B:221:0x0096, B:222:0x0098, B:224:0x009e, B:226:0x00a2, B:228:0x00a6, B:230:0x00ac, B:231:0x00b0, B:233:0x00b4, B:235:0x00b8, B:238:0x00c4, B:241:0x010a, B:243:0x010e, B:245:0x0118, B:247:0x011c, B:248:0x011e, B:250:0x0122, B:253:0x012d, B:256:0x0144, B:258:0x014e, B:261:0x0159, B:264:0x0164, B:265:0x0086, B:26:0x016b, B:27:0x0173, B:28:0x0176, B:30:0x017c, B:40:0x0332, B:42:0x0336, B:46:0x0391, B:48:0x0395, B:49:0x039d, B:51:0x03a1, B:56:0x03b0, B:58:0x03bd, B:60:0x03ca, B:61:0x03ce, B:82:0x0432, B:90:0x049e, B:91:0x049f, B:92:0x0433, B:94:0x0453, B:95:0x0457, B:97:0x045d, B:99:0x0461, B:101:0x0465, B:105:0x0477, B:124:0x01ba, B:126:0x01be, B:127:0x01c0, B:129:0x01c4, B:131:0x01eb, B:133:0x0212, B:134:0x0216, B:136:0x021e, B:137:0x0224, B:138:0x0226, B:154:0x0244, B:155:0x0248, B:157:0x024c, B:159:0x0254, B:160:0x025f, B:161:0x026b, B:163:0x026f, B:166:0x0279, B:167:0x0284, B:168:0x028c, B:169:0x0294, B:170:0x0298, B:171:0x029c, B:172:0x02a0, B:174:0x02a4, B:176:0x02a8, B:178:0x02cc, B:179:0x02ce, B:181:0x02d2, B:183:0x02d6, B:184:0x02fa, B:186:0x02fe, B:187:0x0304, B:188:0x0307, B:189:0x030a, B:190:0x030d, B:191:0x0310, B:192:0x0313, B:193:0x0316, B:194:0x0319, B:195:0x031c, B:196:0x031f, B:197:0x0322, B:198:0x0325, B:199:0x0328, B:200:0x032b, B:201:0x032e, B:202:0x0357, B:205:0x0377, B:206:0x037a, B:63:0x03cf, B:65:0x03d5, B:79:0x0417, B:81:0x041d, B:85:0x0425, B:87:0x042b, B:88:0x0431), top: B:6:0x001b, inners: #6 }] */
    /* JADX WARN: Type inference failed for: r6v24, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v25, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v34, types: [X.7QR] */
    /* JADX WARN: Type inference failed for: r6v40, types: [X.9CL] */
    /* JADX WARN: Type inference failed for: r6v41, types: [X.9CL] */
    /* JADX WARN: Type inference failed for: r6v42 */
    /* JADX WARN: Type inference failed for: r6v44 */
    /* JADX WARN: Type inference failed for: r6v45 */
    /* JADX WARN: Type inference failed for: r6v53 */
    /* JADX WARN: Type inference failed for: r6v54 */
    /* JADX WARN: Type inference failed for: r6v55 */
    /* JADX WARN: Type inference failed for: r6v56 */
    /* JADX WARN: Type inference failed for: r6v57 */
    /* JADX WARN: Type inference failed for: r6v58 */
    /* JADX WARN: Type inference failed for: r6v59 */
    /* JADX WARN: Type inference failed for: r6v60 */
    /* JADX WARN: Type inference failed for: r6v61 */
    /* JADX WARN: Type inference failed for: r6v62 */
    /* JADX WARN: Type inference failed for: r6v63 */
    /* JADX WARN: Type inference failed for: r6v64 */
    /* JADX WARN: Type inference failed for: r6v65 */
    /* JADX WARN: Type inference failed for: r6v66 */
    /* JADX WARN: Type inference failed for: r6v67 */
    /* JADX WARN: Type inference failed for: r6v68 */
    /* JADX WARN: Type inference failed for: r6v69 */
    /* JADX WARN: Type inference failed for: r6v7, types: [X.570, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v70 */
    /* JADX WARN: Type inference failed for: r6v71 */
    /* JADX WARN: Type inference failed for: r6v72 */
    /* JADX WARN: Type inference failed for: r6v73 */
    /* JADX WARN: Type inference failed for: r6v74 */
    /* JADX WARN: Type inference failed for: r6v75 */
    /* JADX WARN: Type inference failed for: r6v76 */
    /* JADX WARN: Type inference failed for: r6v77 */
    /* JADX WARN: Type inference failed for: r6v78 */
    /* JADX WARN: Type inference failed for: r6v79 */
    /* JADX WARN: Type inference failed for: r6v8, types: [X.570, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v80 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C83403nh A0N(com.instagram.common.session.UserSession r45, X.C83693oE r46) {
        /*
            Method dump skipped, instructions count: 1320
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C83403nh.A0N(com.instagram.common.session.UserSession, X.3oE):X.3nh");
    }

    public final AnonymousClass442 A0P() {
        AnonymousClass442 anonymousClass442 = this.A2T;
        if (anonymousClass442 == null) {
            return this.A0a;
        }
        return anonymousClass442;
    }

    public final C38321qM A0R() {
        String str;
        C38321qM A1e;
        boolean z = false;
        if (this.A10 == C2EY.A1F) {
            z = true;
        }
        C18C.A0E(z);
        Object obj = this.A1T;
        obj.getClass();
        C9CL c9cl = (C9CL) obj;
        C14360o3.A0B(c9cl, 0);
        C38321qM c38321qM = (C38321qM) c9cl.A00;
        if (!c38321qM.A5F() || (((str = c9cl.A02) == null || (A1e = c38321qM.A1h(str)) == null) && (A1e = c38321qM.A1e(0)) == null)) {
            return c38321qM;
        }
        return A1e;
    }

    public final C38321qM A0S() {
        Object obj = this.A1T;
        if (!(obj instanceof C38321qM)) {
            if (C9CL.A00(obj, 2)) {
                obj = ((C9CL) obj).A00;
            } else {
                return null;
            }
        }
        return (C38321qM) obj;
    }

    public final C38321qM A0T() {
        Object obj = this.A1T;
        if (!(obj instanceof C38321qM)) {
            if (C9CL.A00(obj, 2)) {
                obj = ((C9CL) obj).A00;
            } else {
                return null;
            }
        }
        return (C38321qM) obj;
    }

    public final DirectMessageIdentifier A0V() {
        return new DirectMessageIdentifier(this.A10, this.A1c, this.A1W);
    }

    public final EnumC40111tc A0W() {
        C101584hT c101584hT;
        C101594hU c101594hU;
        Object obj = this.A1T;
        if (obj instanceof C7Q4) {
            return ((C7Q4) obj).A01;
        }
        if (obj instanceof C7Q5) {
            return ((C7Q5) obj).A01;
        }
        if (obj instanceof C38321qM) {
            return ((C38321qM) obj).BRp();
        }
        if (!(obj instanceof C101584hT) || (c101584hT = this.A0e) == null || (c101594hU = c101584hT.A04) == null) {
            return null;
        }
        return c101594hU.A07;
    }

    public final Integer A0a() {
        Long l;
        Long l2;
        Long l3 = this.A1K;
        if ((l3 != null && l3.longValue() > 0) || ((l = this.A1L) != null && l.longValue() > 0)) {
            Long l4 = this.A1M;
            if ((l4 != null && l4.longValue() >= 0) || ((l2 = this.A1N) != null && l2.longValue() > 0)) {
                return C05F.A01;
            }
            return C05F.A00;
        }
        return C05F.A0C;
    }

    public final Long A0d() {
        Long l = this.A1M;
        if (l == null) {
            return null;
        }
        return Long.valueOf(TimeUnit.SECONDS.toMillis(l.longValue()));
    }

    public final String A0g() {
        if (this.A1W == null && this.A1c == null) {
            C0w9.A03("DirectMessage_getClientContext_null", "both mClientContext and mId are null.");
        }
        return this.A1W;
    }

    public final String A0h() {
        if (this.A1c == null && this.A1W == null) {
            C0w9.A03("DirectMessage_getId_null_client_context", "both mId and mClientContext are null.");
        }
        return this.A1c;
    }

    public final String A0i() {
        String str = this.A1c;
        if (str == null && (str = this.A1W) == null) {
            throw new IllegalStateException(AbstractC111324zv.A00(2716));
        }
        return str;
    }

    public final String A0j() {
        String str = this.A1W;
        if (str == null && (str = this.A1c) == null) {
            throw new IllegalStateException(AbstractC111324zv.A00(2716));
        }
        return str;
    }

    public final String A0k() {
        C101584hT c101584hT = this.A0e;
        if (c101584hT != null) {
            return c101584hT.A09;
        }
        return this.A1v;
    }

    public final ArrayList A0r() {
        List<DirectCountBasedReaction> list = this.A22;
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            for (DirectCountBasedReaction directCountBasedReaction : list) {
                if (directCountBasedReaction.A02) {
                    arrayList.add(directCountBasedReaction.A01);
                }
            }
            return arrayList;
        }
        return null;
    }

    public final List A0t() {
        List<InterfaceC38251qF> list = this.A2A;
        if (list != null) {
            ArrayList arrayList = new ArrayList(AbstractC06950Ym.A1E(list, 10));
            for (InterfaceC38251qF interfaceC38251qF : list) {
                C14360o3.A0B(interfaceC38251qF, 0);
                arrayList.add(new C42557Isb(interfaceC38251qF));
            }
            return arrayList;
        }
        return null;
    }

    public final void A0x(C45120Jxp c45120Jxp) {
        if (!AbstractC50102Ry.A00(this.A0D, c45120Jxp)) {
            this.A0D = c45120Jxp;
            this.A2C = true;
        }
    }

    public final void A1B(Long l) {
        String obj;
        Long l2 = this.A1S;
        if (l2 != null && l2.equals(l)) {
            return;
        }
        this.A2C = true;
        this.A1S = l;
        if (l == null) {
            obj = "";
        } else {
            obj = l.toString();
        }
        this.A1r = obj;
    }

    public void A1D(String str) {
        if (str != null && !TextUtils.isEmpty(str) && !str.equals(this.A1W)) {
            this.A2C = true;
            this.A1W = str;
        }
    }

    public final void A1M(boolean z) {
        boolean booleanValue;
        Boolean bool = this.A18;
        if (bool == null) {
            booleanValue = false;
        } else {
            booleanValue = bool.booleanValue();
        }
        if (z != booleanValue) {
            this.A18 = Boolean.valueOf(z);
            this.A2C = true;
        }
    }

    public final boolean A1N() {
        ExtendedImageUrl extendedImageUrl = this.A16;
        if (extendedImageUrl != null && extendedImageUrl.A0A != null) {
            return true;
        }
        return false;
    }

    public final boolean A1P() {
        Integer num = this.A1F;
        if (num != C05F.A0N && num != C05F.A0Y) {
            return false;
        }
        return true;
    }

    public final boolean A1Q() {
        List list = this.A29;
        if (list == null || list.isEmpty()) {
            return false;
        }
        return ((C9CP) list.get(0)).A05.equals("xma_gen_ai_search_plugin_response_sources");
    }

    public final boolean A1S() {
        Boolean bool = this.A18;
        if (bool != null && bool.booleanValue()) {
            return true;
        }
        return false;
    }

    public final boolean A1V() {
        C2EY c2ey = C2EY.A0q;
        C2EY c2ey2 = this.A10;
        if (!c2ey.equals(c2ey2) || !"permanent".equals(A0k())) {
            if (C2EY.A0z.equals(c2ey2) && A1W()) {
                return true;
            }
            return false;
        }
        return true;
    }

    public final boolean A1W() {
        C38321qM c38321qM = this.A0s;
        if (c38321qM != null && c38321qM.getId() != null && this.A0s.A1t() != null) {
            if (this.A0s.Cff()) {
                this.A0s.CFR();
                return true;
            }
            return true;
        }
        return false;
    }

    public final boolean A1X() {
        Object obj;
        C2EY c2ey = this.A10;
        if (c2ey == C2EY.A1F || c2ey == C2EY.A0Y || c2ey == C2EY.A0X) {
            C9CL c9cl = this.A0A;
            if (c9cl != null) {
                obj = c9cl.A01;
            } else {
                obj = null;
            }
            if (obj == C05F.A01) {
                return true;
            }
        }
        return false;
    }

    public final boolean A1Y() {
        Object obj;
        if (this.A10 == C2EY.A1F) {
            C9CL c9cl = this.A0A;
            if (c9cl != null) {
                obj = c9cl.A01;
            } else {
                obj = null;
            }
            if (obj == C05F.A00) {
                return true;
            }
        }
        return false;
    }

    public final boolean A1Z() {
        if (this.A1A == null) {
            A02();
        }
        if (this.A1A == null) {
            C0w9.A03("Direct Message mIsMessageEmoji is null", "DirectMessage.isMessageEmoji");
        }
        Boolean bool = this.A1A;
        if (bool != null && bool.booleanValue()) {
            return true;
        }
        return false;
    }

    public final boolean A1a() {
        if (this.A10 != C2EY.A0z) {
            return false;
        }
        Object obj = this.A1T;
        if (!(obj instanceof List)) {
            return false;
        }
        List list = (List) obj;
        if (list.isEmpty()) {
            return false;
        }
        Object obj2 = list.get(0);
        if (!(obj2 instanceof C910143t) || ((C910143t) obj2).A02 != 9) {
            return false;
        }
        return true;
    }

    public final boolean A1e(UserSession userSession) {
        C101594hU c101594hU;
        Object obj = this.A1T;
        if (this.A10 == C2EY.A0q) {
            C101584hT c101584hT = this.A0e;
            if ((c101584hT == null || c101584hT.A05 == null) && this.A0w != null) {
                return true;
            }
            if ((obj instanceof C101584hT) && c101584hT != null && (c101594hU = c101584hT.A04) != null && c101594hU.A0H != null && A1f(userSession)) {
                return true;
            }
            return false;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0017, code lost:
    
        if (r3 != null) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A1f(com.instagram.common.session.UserSession r6) {
        /*
            r5 = this;
            X.4hT r3 = r5.A0e
            r1 = 0
            if (r3 == 0) goto L91
            X.4hU r4 = r3.A04
        L7:
            X.2EY r2 = r5.A10
            X.2EY r0 = X.C2EY.A0q
            if (r2 != r0) goto L94
            if (r3 == 0) goto L13
            X.1qM r0 = r3.A05
            if (r0 != 0) goto L19
        L13:
            X.7Q5 r0 = r5.A0w
            if (r0 != 0) goto L94
            if (r3 == 0) goto L2b
        L19:
            if (r4 == 0) goto L2b
            boolean r0 = r4.A0T
            if (r0 == 0) goto L23
            com.instagram.model.mediasize.ImageInfo r0 = r4.A06
            if (r0 == 0) goto L2b
        L23:
            boolean r0 = r4.A0V
            if (r0 == 0) goto L94
            X.3a3 r0 = r4.A09
            if (r0 != 0) goto L94
        L2b:
            java.lang.String r0 = "direct_invalid_visual_media"
            r0.getClass()
            X.0xC r3 = X.C19280xC.A01(r0, r1)
            com.instagram.model.direct.DirectThreadKey r0 = r5.A0y
            if (r0 == 0) goto L8f
            java.lang.String r2 = r0.A00
        L3a:
            java.lang.String r0 = "threadId"
            r3.A0C(r0, r2)
            java.lang.String r2 = r5.A1c
            java.lang.String r0 = "messageId"
            r3.A0C(r0, r2)
            java.lang.String r2 = r5.A1u
            java.lang.String r0 = "userId"
            r3.A0C(r0, r2)
            if (r4 == 0) goto L8d
            java.lang.String r2 = r4.A0H
        L51:
            java.lang.String r0 = "mediaId"
            r3.A0C(r0, r2)
            if (r4 == 0) goto L60
            X.13n r0 = r4.A03
            java.lang.Object r1 = r0.get()
            java.lang.String r1 = (java.lang.String) r1
        L60:
            java.lang.String r0 = "mediaUserId"
            r3.A0C(r0, r1)
            java.lang.Exception r0 = new java.lang.Exception
            r0.<init>()
            java.lang.String r1 = android.util.Log.getStackTraceString(r0)
            r0 = 583(0x247, float:8.17E-43)
            java.lang.String r0 = X.MSV.A00(r0)
            r3.A0C(r0, r1)
            if (r4 == 0) goto L84
            boolean r0 = r4.A0V
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            java.lang.String r0 = "isVideo"
            r3.A09(r0, r1)
        L84:
            X.0xH r0 = X.AbstractC11060iN.A00(r6)
            r0.EHW(r3)
            r0 = 0
            return r0
        L8d:
            r2 = r1
            goto L51
        L8f:
            r2 = r1
            goto L3a
        L91:
            r4 = r1
            goto L7
        L94:
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C83403nh.A1f(com.instagram.common.session.UserSession):boolean");
    }

    public final boolean A1i(User user) {
        if (this.A1c != null && !C14360o3.A0K(user.getId(), BtE())) {
            C2EY c2ey = C2EY.A0G;
            C2EY c2ey2 = this.A10;
            if (!c2ey.equals(c2ey2) && !C2EY.A15.equals(c2ey2) && !C2EY.A0m.equals(c2ey2) && !C2EY.A0N.equals(c2ey2) && !C2EY.A1k.equals(c2ey2)) {
                return true;
            }
        }
        return false;
    }

    public final boolean A1l(User user) {
        C101584hT c101584hT;
        C101594hU c101594hU;
        if (this.A10 == C2EY.A0q && !C14360o3.A0K(user.getId(), BtE()) && (c101584hT = this.A0e) != null && c101584hT.A00 == 0 && (c101594hU = c101584hT.A04) != null && c101594hU.A0H != null) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0031, code lost:
    
        if (r0 != 2) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x006e, code lost:
    
        throw new java.lang.IllegalArgumentException(X.AnonymousClass001.A0u("Illegal transition from ", X.C4GU.A00(r6), " to ", X.C4GU.A00(r10)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003a, code lost:
    
        if (r0 != 5) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0045, code lost:
    
        if (r0 != 2) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004c, code lost:
    
        if (r0 != 5) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0057, code lost:
    
        if (r0 == 3) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0059, code lost:
    
        if (r0 == 4) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0055, code lost:
    
        if (r0 != 2) goto L27;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x0014. Please report as an issue. */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A1m(java.lang.Integer r10) {
        /*
            r9 = this;
            java.lang.Integer r6 = r9.A1F
            r8 = 0
            if (r6 == r10) goto L72
            r7 = 1
            r9.A2C = r7
            X.3oS r0 = X.AbstractC83833oS.$redex_init_class
            int r0 = r6.intValue()
            r5 = 4
            r4 = 3
            java.lang.String r3 = " to "
            r2 = 2
            r1 = 5
            switch(r0) {
                case 0: goto L34;
                case 1: goto L4f;
                case 2: goto L48;
                case 3: goto L3d;
                case 4: goto L72;
                case 5: goto L2b;
                default: goto L17;
            }
        L17:
            java.lang.String r2 = "Unhandled status: transition from "
            java.lang.String r1 = X.C4GU.A00(r6)
            java.lang.String r0 = X.C4GU.A00(r10)
            java.lang.String r1 = X.AnonymousClass001.A0u(r2, r1, r3, r0)
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L2b:
            int r0 = r10.intValue()
            if (r0 == r1) goto L6f
            if (r0 == r2) goto L72
            goto L5b
        L34:
            int r0 = r10.intValue()
            if (r0 == r7) goto L6f
            if (r0 == r1) goto L6f
            goto L5b
        L3d:
            int r0 = r10.intValue()
            if (r0 == r7) goto L6f
            if (r0 == r1) goto L6f
            if (r0 == r2) goto L6f
            goto L5b
        L48:
            int r0 = r10.intValue()
            if (r0 == r1) goto L6f
            goto L57
        L4f:
            int r0 = r10.intValue()
            if (r0 == r1) goto L6f
            if (r0 == r2) goto L6f
        L57:
            if (r0 == r4) goto L6f
            if (r0 == r5) goto L6f
        L5b:
            java.lang.String r2 = "Illegal transition from "
            java.lang.String r1 = X.C4GU.A00(r6)
            java.lang.String r0 = X.C4GU.A00(r10)
            java.lang.String r1 = X.AnonymousClass001.A0u(r2, r1, r3, r0)
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L6f:
            r9.A1F = r10
            return r7
        L72:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C83403nh.A1m(java.lang.Integer):boolean");
    }

    public final boolean A1o(String str) {
        Comparator comparator = C93404Gt.A01;
        String A0h = A0h();
        A0h.getClass();
        if (comparator.compare(A0h, str) <= 0) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC83433nk
    public final String BtE() {
        return this.A1u;
    }

    @Override // X.InterfaceC83433nk
    public final long C8i() {
        Long l = this.A1S;
        if (l != null) {
            return l.longValue();
        }
        return 0L;
    }

    @Override // X.InterfaceC83433nk
    public final C2EY CBg() {
        return this.A10;
    }

    @Override // X.InterfaceC83433nk
    public final boolean Cd1() {
        return this.A2P;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x001c, code lost:
    
        if (r6.equals(r4.A02) != false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean A0A(X.AnonymousClass441 r4, java.lang.String r5, java.lang.String r6) {
        /*
            java.lang.String r0 = r4.A00()
            boolean r0 = r0.equals(r5)
            r3 = 1
            r2 = r0 ^ 1
            java.lang.String r0 = r4.A00()
            boolean r0 = r0.equals(r5)
            if (r0 == 0) goto L1e
            java.lang.String r0 = r4.A02
            boolean r1 = r6.equals(r0)
            r0 = 1
            if (r1 == 0) goto L1f
        L1e:
            r0 = 0
        L1f:
            if (r2 != 0) goto L24
            if (r0 != 0) goto L24
            r3 = 0
        L24:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C83403nh.A0A(X.441, java.lang.String, java.lang.String):boolean");
    }

    public static boolean A0B(C83403nh c83403nh, C83403nh c83403nh2) {
        String A0h = c83403nh.A0h();
        String A0g = c83403nh.A0g();
        String A0h2 = c83403nh2.A0h();
        String A0g2 = c83403nh2.A0g();
        if (A0h != null && A0h.equals(A0h2)) {
            return true;
        }
        if (A0g != null && A0g.equals(A0g2)) {
            return true;
        }
        return false;
    }

    public final L1W A0M() {
        Long valueOf;
        if (A1T()) {
            Long l = this.A1K;
            if (l == null) {
                valueOf = null;
            } else {
                valueOf = Long.valueOf(TimeUnit.MILLISECONDS.toSeconds(l.longValue()));
            }
            return LC9.A01(valueOf, this.A1M);
        }
        if (this.A2P) {
            return LC9.A00();
        }
        return new L1W();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String A0f() {
        ImmutableList A0H = A0H();
        if (A0H != null && !A0H.isEmpty()) {
            return ((C910143t) A0H.get(0)).A0u;
        }
        return null;
    }

    public final String A0q(User user) {
        for (AnonymousClass441 anonymousClass441 : A0w()) {
            if (anonymousClass441.A00().equals(user.getId())) {
                return anonymousClass441.A02;
            }
        }
        return null;
    }

    public final ArrayList A0s(User user) {
        ArrayList arrayList = null;
        for (AnonymousClass441 anonymousClass441 : A0w()) {
            if (anonymousClass441.A00().equals(user.getId())) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(anonymousClass441.A02);
            }
        }
        return arrayList;
    }

    public void A1E(String str) {
        if (!TextUtils.isEmpty(str) && !str.equals(this.A1u)) {
            this.A2C = true;
            this.A1u = str;
        }
    }

    public final boolean A1O() {
        List list;
        if (!(!A0w().isEmpty())) {
            synchronized (this) {
                list = this.A27;
            }
            if (!(!list.isEmpty())) {
                ImmutableList A0J = A0J();
                if (A0J != null && !A0J.isEmpty()) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean A1R() {
        String str;
        ImmutableList A0H = A0H();
        if (A0H == null || A0H.isEmpty() || (str = ((C910143t) A0H.get(0)).A0w) == null || !str.startsWith("instagram://generated_sticker_action")) {
            return false;
        }
        return true;
    }

    public final boolean A1T() {
        if (A0a() == C05F.A0C) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean A1U() {
        ImmutableList A0H = A0H();
        if (A0H == null || A0H.isEmpty() || ((C910143t) A0H.get(0)).A02 != 13) {
            return false;
        }
        return true;
    }

    public final boolean A1g(UserSession userSession, String str) {
        C101584hT c101584hT;
        C101584hT c101584hT2;
        if (A1e(userSession) && (c101584hT = this.A0e) != null && c101584hT.A00 >= 1 && str.equals(this.A1w) && !C14360o3.A0K(userSession.userId, BtE()) && A1f(userSession) && !"once".equals(A0k()) && A1f(userSession) && (c101584hT2 = this.A0e) != null && c101584hT2.A00 == 1) {
            return true;
        }
        return false;
    }

    public final boolean A1j(User user) {
        return C14360o3.A0K(user.getId(), BtE());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC83433nk
    public final boolean CSo() {
        ImmutableList A0H = A0H();
        if (A0H != null && A0H.size() >= 1) {
            if (((C910143t) A0H.get(0)).A02 == 8 || ((C910143t) A0H.get(0)).A02 == 13 || ((C910143t) A0H.get(0)).A02 == 12 || ((C910143t) A0H.get(0)).A02 == 18 || ((C910143t) A0H.get(0)).A02 == 10) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static C83403nh A00(C16L c16l, DirectThreadKey directThreadKey, boolean z) {
        String A1P;
        Integer num;
        try {
            C83403nh c83403nh = new C83403nh();
            C16R A11 = c16l.A11();
            C16R c16r = C16R.A0D;
            if (A11 != c16r) {
                c16l.A0z();
                return null;
            }
            while (true) {
                C16R A1J = c16l.A1J();
                C16R c16r2 = C16R.A09;
                if (A1J != c16r2) {
                    String A0q = c16l.A0q();
                    c16l.A1J();
                    if (IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATUS.equals(A0q)) {
                        String A1P2 = c16l.A1P();
                        if (A1P2.equals("UNSET")) {
                            num = C05F.A00;
                        } else if (A1P2.equals("READY_TO_UPLOAD")) {
                            num = C05F.A01;
                        } else if (A1P2.equals("UPLOADING")) {
                            num = C05F.A0C;
                        } else if (A1P2.equals("UPLOAD_FAILED")) {
                            num = C05F.A0N;
                        } else if (A1P2.equals("WILL_NOT_UPLOAD")) {
                            num = C05F.A0Y;
                        } else {
                            if (!A1P2.equals("UPLOADED")) {
                                throw new IllegalArgumentException(A1P2);
                            }
                            num = C05F.A0j;
                        }
                        c83403nh.A1F = num;
                    } else if ("item_type".equals(A0q) || TraceFieldType.ContentType.equals(A0q)) {
                        c83403nh.A10 = C2EY.A0A.A00(c16l.A1P());
                    } else {
                        ArrayList arrayList = null;
                        ArrayList arrayList2 = null;
                        ArrayList arrayList3 = null;
                        LinkedHashMap linkedHashMap = null;
                        LinkedHashMap linkedHashMap2 = null;
                        ArrayList arrayList4 = null;
                        ArrayList arrayList5 = null;
                        ArrayList arrayList6 = null;
                        ArrayList arrayList7 = null;
                        ArrayList arrayList8 = null;
                        ArrayList arrayList9 = null;
                        ArrayList arrayList10 = null;
                        if ("item_id".equals(A0q)) {
                            c83403nh.A1c = c16l.A11() != C16R.A0G ? c16l.A1P() : null;
                        } else if ("client_context".equals(A0q)) {
                            c83403nh.A1W = c16l.A11() != C16R.A0G ? c16l.A1P() : null;
                        } else if ("timestamp".equals(A0q)) {
                            c83403nh.A1r = c16l.A11() != C16R.A0G ? c16l.A1P() : null;
                        } else if ("timestamp_in_micro".equals(A0q)) {
                            c83403nh.A1B(Long.valueOf(c16l.A0y()));
                        } else if (CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID.equals(A0q)) {
                            c83403nh.A1u = c16l.A11() != C16R.A0G ? c16l.A1P() : null;
                        } else if ("auxiliary_text".equals(A0q)) {
                            c83403nh.A1V = c16l.A11() != C16R.A0G ? c16l.A1P() : null;
                        } else if ("auxiliary_text_source_type".equals(A0q)) {
                            c83403nh.A00 = c16l.A1D();
                        } else if ("placeholder".equals(A0q)) {
                            c83403nh.A0n = AbstractC1126956z.parseFromJson(c16l);
                        } else if ("expired_placeholder".equals(A0q)) {
                            c83403nh.A08 = AbstractC101924i7.parseFromJson(c16l);
                        } else if (!"text".equals(A0q) && !"reaction".equals(A0q)) {
                            if ("message_dialect".equals(A0q)) {
                                c83403nh.A1g = c16l.A11() != C16R.A0G ? c16l.A1P() : null;
                            } else if ("translated_message".equals(A0q)) {
                                c83403nh.A1t = c16l.A11() != C16R.A0G ? c16l.A1P() : null;
                            } else if ("translated_locale".equals(A0q)) {
                                c83403nh.A1s = c16l.A11() != C16R.A0G ? c16l.A1P() : null;
                            } else if ("link".equals(A0q)) {
                                c83403nh.A07 = AbstractC1122154p.parseFromJson(c16l);
                            } else if ("action_log".equals(A0q)) {
                                c83403nh.A0N = AbstractC83533nu.parseFromJson(c16l);
                            } else if ("instamadillo_action_log".equals(A0q)) {
                                c83403nh.A0C = F4L.parseFromJson(c16l);
                            } else if ("video_call_event".equals(A0q)) {
                                c83403nh.A0c = AbstractC101854hw.parseFromJson(c16l);
                            } else if ("profile".equals(A0q)) {
                                Parcelable.Creator creator = User.CREATOR;
                                c83403nh.A17 = AbstractC38851rI.A00(c16l, false);
                            } else if ("product_share".equals(A0q)) {
                                c83403nh.A0B = F4A.parseFromJson(c16l);
                            } else if ("preview_medias".equals(A0q)) {
                                if (c16l.A11() == C16R.A0C) {
                                    arrayList = new ArrayList();
                                    while (c16l.A1J() != C16R.A08) {
                                        C38231qD parseFromJson = IOX.parseFromJson(c16l);
                                        if (parseFromJson != null) {
                                            arrayList.add(parseFromJson);
                                        }
                                    }
                                }
                                c83403nh.A2A = arrayList;
                            } else if ("media".equals(A0q)) {
                                c83403nh.A0s = C38321qM.A0h.A0C(c16l, true, false);
                            } else if ("media_share".equals(A0q)) {
                                c83403nh.A0t = C38321qM.A0h.A0C(c16l, true, true);
                            } else if ("direct_media_share".equals(A0q)) {
                                c83403nh.A0A = FUV.parseFromJson(c16l);
                            } else if ("raven_media".equals(A0q)) {
                                c83403nh.A0u = C38321qM.A0h.A0C(c16l, true, false);
                            } else if ("visual_media".equals(A0q)) {
                                c83403nh.A0e = AbstractC101574hS.parseFromJson(c16l);
                            } else if ("message_item_dict".equals(A0q)) {
                                c83403nh.A0d = AbstractC101574hS.parseFromJson(c16l);
                            } else if ("voice_media".equals(A0q)) {
                                c83403nh.A0g = C4G1.parseFromJson(c16l);
                            } else if ("seen_user_ids".equals(A0q)) {
                                if (c16l.A11() == C16R.A0C) {
                                    arrayList2 = new ArrayList();
                                    while (c16l.A1J() != C16R.A08) {
                                        if (c16l.A11() != C16R.A0G && (A1P = c16l.A1P()) != null) {
                                            arrayList2.add(A1P);
                                        }
                                    }
                                }
                                c83403nh.A23 = arrayList2;
                            } else if ("reel_share".equals(A0q)) {
                                c83403nh.A0Z = LCB.parseFromJson(c16l);
                            } else if ("story_share".equals(A0q)) {
                                c83403nh.A0b = LCC.parseFromJson(c16l);
                            } else if ("live_video_share".equals(A0q)) {
                                c83403nh.A0F = FUW.parseFromJson(c16l);
                            } else if ("live_viewer_invite".equals(A0q)) {
                                c83403nh.A0U = IQH.parseFromJson(c16l);
                            } else if (GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_COMMENT.equals(A0q)) {
                                c83403nh.A0T = LC8.parseFromJson(c16l);
                            } else if ("felix_share".equals(A0q)) {
                                c83403nh.A06 = FUU.parseFromJson(c16l);
                            } else if ("clip".equals(A0q)) {
                                c83403nh.A0S = IQG.parseFromJson(c16l);
                            } else if ("voting_info_center".equals(A0q)) {
                                c83403nh.A0h = AbstractC46853Knm.parseFromJson(c16l);
                            } else if ("ar_effect".equals(A0q)) {
                                c83403nh.A0P = LC6.parseFromJson(c16l);
                            } else if ("like".equals(A0q)) {
                                c83403nh.A1d = c16l.A11() != C16R.A0G ? c16l.A1P() : null;
                            } else if ("xma".equals(A0q)) {
                                c83403nh.A0j = AbstractC910043s.parseFromJson(c16l);
                            } else if ("clip_watched_action_logs".equals(A0q)) {
                                if (c16l.A11() == C16R.A0C) {
                                    arrayList3 = new ArrayList();
                                    while (c16l.A1J() != C16R.A08) {
                                        C34501FIn parseFromJson2 = AbstractC34123F3z.parseFromJson(c16l);
                                        if (parseFromJson2 != null) {
                                            arrayList3.add(parseFromJson2);
                                        }
                                    }
                                }
                                c83403nh.A20 = arrayList3;
                            } else if ("avatar_note_reply".equals(A0q)) {
                                c83403nh.A0i = AbstractC910043s.parseFromJson(c16l);
                            } else if (!"hscroll_share".equals(A0q) && !"xma_profile".equals(A0q) && !"xma_media_share".equals(A0q) && !"xma_link".equals(A0q) && !"xma_reel_share".equals(A0q) && !"xma_reel_mention".equals(A0q) && !"xma_story_share".equals(A0q) && !"xma_story_mention".equals(A0q) && !"xma_live_viewer_invite".equals(A0q) && !"xma_product_share".equals(A0q) && !"xma_felix_share".equals(A0q) && !"xma_clip".equals(A0q) && !"xma_ar_effect".equals(A0q) && !"shops_collection_share".equals(A0q) && !"shop_share".equals(A0q) && !"reels_audio_share".equals(A0q) && !"ig_rooms_xma".equals(A0q) && !"appointment_booking".equals(A0q) && !"info_center".equals(A0q) && !"info_center_fact".equals(A0q) && !"generic_template".equals(A0q) && !"generic_xma".equals(A0q) && !"direct_group_poll_v1".equals(A0q) && !"direct_group_prompt".equals(A0q) && !"p2p_payment".equals(A0q) && !"fbpay_referral".equals(A0q) && !"music".equals(A0q) && !"p2b_order".equals(A0q) && !"book_now_link_share".equals(A0q) && !"comment_reshare".equals(A0q) && !"location_share_xma".equals(A0q) && !"fundraiser".equals(A0q) && !"ai_sticker".equals(A0q) && !"avatar_sticker".equals(A0q) && !"animated_avatar_sticker".equals(A0q) && !"destination".equals(A0q) && !"collections_share".equals(A0q) && !"public_collections_share".equals(A0q) && !"cutout_sticker".equals(A0q) && !"ify_content".equals(A0q)) {
                                if ("message_item_type".equals(A0q)) {
                                    c83403nh.A0z = C2EY.A0A.A00(c16l.A1P());
                                } else if ("reactions".equals(A0q)) {
                                    c83403nh.A0X = C43y.parseFromJson(c16l);
                                } else if ("user_based_emoji_reactions".equals(A0q)) {
                                    if (c16l.A11() == c16r) {
                                        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                                        while (c16l.A1J() != c16r2) {
                                            String A1P3 = c16l.A1P();
                                            c16l.A1J();
                                            C16R A112 = c16l.A11();
                                            if (A112 == C16R.A0G) {
                                                linkedHashMap3.put(A1P3, null);
                                            } else {
                                                ArrayList arrayList11 = new ArrayList();
                                                if (A112 != C16R.A0C) {
                                                    c16l.A0z();
                                                } else {
                                                    while (c16l.A1J() != C16R.A08) {
                                                        AnonymousClass441 parseFromJson3 = AnonymousClass440.parseFromJson(c16l);
                                                        if (parseFromJson3 != null) {
                                                            arrayList11.add(parseFromJson3);
                                                        }
                                                    }
                                                }
                                                linkedHashMap3.put(A1P3, new AnonymousClass444(arrayList11));
                                            }
                                        }
                                        linkedHashMap = linkedHashMap3;
                                    }
                                    c83403nh.A1y = linkedHashMap;
                                } else if ("media_interventions".equals(A0q)) {
                                    if (c16l.A11() == c16r) {
                                        LinkedHashMap linkedHashMap4 = new LinkedHashMap();
                                        while (c16l.A1J() != c16r2) {
                                            String A1P4 = c16l.A1P();
                                            c16l.A1J();
                                            if (c16l.A11() == C16R.A0G) {
                                                linkedHashMap4.put(A1P4, null);
                                            } else {
                                                Integer valueOf = Integer.valueOf(c16l.A1D());
                                                if (valueOf != null) {
                                                    linkedHashMap4.put(A1P4, valueOf);
                                                }
                                            }
                                        }
                                        linkedHashMap2 = linkedHashMap4;
                                    }
                                    c83403nh.A1z = linkedHashMap2;
                                } else if ("count_based_emoji_reactions".equals(A0q)) {
                                    if (c16l.A11() == C16R.A0C) {
                                        arrayList4 = new ArrayList();
                                        while (c16l.A1J() != C16R.A08) {
                                            DirectCountBasedReaction parseFromJson4 = AbstractC102004iG.parseFromJson(c16l);
                                            if (parseFromJson4 != null) {
                                                arrayList4.add(parseFromJson4);
                                            }
                                        }
                                    }
                                    c83403nh.A22 = arrayList4;
                                } else if ("edit_history".equals(A0q)) {
                                    if (c16l.A11() == C16R.A0C) {
                                        arrayList5 = new ArrayList();
                                        while (c16l.A1J() != C16R.A08) {
                                            DirectMessageEditHistory parseFromJson5 = AbstractC110044xY.parseFromJson(c16l);
                                            if (parseFromJson5 != null) {
                                                arrayList5.add(parseFromJson5);
                                            }
                                        }
                                    }
                                    c83403nh.A24 = arrayList5;
                                } else if ("hide_in_thread".equals(A0q)) {
                                    c83403nh.A2D = c16l.A0d();
                                } else if ("thread_key".equals(A0q)) {
                                    c83403nh.A0y = AbstractC83623o5.parseFromJson(c16l);
                                } else if ("direct_thread_id".equals(A0q)) {
                                    c83403nh.A0x = AbstractC83673oC.parseFromJson(c16l);
                                } else if ("expiring_media_client_seen_count".equals(A0q)) {
                                    c83403nh.A1I = Integer.valueOf(c16l.A1D());
                                } else if ("seen_count".equals(A0q)) {
                                    c83403nh.A02 = c16l.A1D();
                                } else if ("expiring_media_action_summary".equals(A0q)) {
                                    c83403nh.A0f = AbstractC101654ha.parseFromJson(c16l);
                                } else if ("reply_type".equals(A0q)) {
                                    c83403nh.A1x = c16l.A11() != C16R.A0G ? c16l.A1P() : null;
                                } else if ("view_mode".equals(A0q)) {
                                    c83403nh.A1v = c16l.A11() != C16R.A0G ? c16l.A1P() : null;
                                } else if ("replay_expiring_at_us".equals(A0q)) {
                                    c83403nh.A03 = c16l.A0y();
                                } else if ("cta_link".equals(A0q)) {
                                    c83403nh.A0R = AbstractC40583Hz3.parseFromJson(c16l);
                                } else if ("animated_media".equals(A0q)) {
                                    c83403nh.A12 = C54V.parseFromJson(c16l);
                                } else if ("store_sticker".equals(A0q)) {
                                    c83403nh.A15 = AbstractC47869LCp.parseFromJson(c16l);
                                } else if ("static_sticker".equals(A0q)) {
                                    c83403nh.A0I = AbstractC201078up.parseFromJson(c16l);
                                } else if ("status_reply".equals(A0q)) {
                                    c83403nh.A0p = LCE.parseFromJson(c16l);
                                } else if ("note_text_reply".equals(A0q)) {
                                    c83403nh.A0J = AbstractC47852LBv.parseFromJson(c16l);
                                } else if ("replied_to_message".equals(A0q)) {
                                    c83403nh.A0a = AnonymousClass442.A00(c16l);
                                } else if ("show_forward_attribution".equals(A0q)) {
                                    c83403nh.A2F = c16l.A0d();
                                } else if ("forward_score".equals(A0q)) {
                                    c83403nh.A1E = Integer.valueOf(c16l.A1D());
                                } else if ("forward_source_invite_link".equals(A0q)) {
                                    c83403nh.A1Z = c16l.A11() != C16R.A0G ? c16l.A1P() : null;
                                } else if ("forward_source_item_id".equals(A0q)) {
                                    c83403nh.A1a = c16l.A11() != C16R.A0G ? c16l.A1P() : null;
                                } else if ("forward_source_name".equals(A0q)) {
                                    c83403nh.A1b = c16l.A11() != C16R.A0G ? c16l.A1P() : null;
                                } else if ("highly_forwarded_message".equals(A0q)) {
                                    c83403nh.A2S = c16l.A0d();
                                } else if ("send_silently".equals(A0q)) {
                                    c83403nh.A2O = c16l.A0d();
                                } else if ("policy_violation".equals(A0q)) {
                                    c83403nh.A0W = AbstractC31321Dpj.parseFromJson(c16l);
                                } else if ("is_shh_mode".equals(A0q)) {
                                    c83403nh.A2P = c16l.A0d();
                                } else if ("instant_reply_info".equals(A0q)) {
                                    c83403nh.A0K = AbstractC34101F3d.parseFromJson(c16l);
                                } else if ("is_visual_item_seen".equals(A0q)) {
                                    c83403nh.A1B = Boolean.valueOf(c16l.A0d());
                                } else if ("message_power_up".equals(A0q)) {
                                    c83403nh.A0V = AnonymousClass540.parseFromJson(c16l);
                                } else if ("mentioned_entities".equals(A0q)) {
                                    if (c16l.A11() == C16R.A0C) {
                                        arrayList6 = new ArrayList();
                                        while (c16l.A1J() != C16R.A08) {
                                            MentionedEntity parseFromJson6 = AnonymousClass545.parseFromJson(c16l);
                                            if (parseFromJson6 != null) {
                                                arrayList6.add(parseFromJson6);
                                            }
                                        }
                                    }
                                    c83403nh.A28 = arrayList6;
                                } else if ("reaction_image_url_info".equals(A0q)) {
                                    c83403nh.A16 = C17Y.parseFromJson(c16l);
                                } else if ("save_icon_state".equals(A0q)) {
                                    c83403nh.A1G = Integer.valueOf(c16l.A1D());
                                } else if ("processed_business_suggestion".equals(A0q)) {
                                    c83403nh.A2I = c16l.A0d();
                                } else if ("commands".equals(A0q)) {
                                    if (c16l.A11() == C16R.A0C) {
                                        arrayList7 = new ArrayList();
                                        while (c16l.A1J() != C16R.A08) {
                                            C206179Ba parseFromJson7 = LCF.parseFromJson(c16l);
                                            if (parseFromJson7 != null) {
                                                arrayList7.add(parseFromJson7);
                                            }
                                        }
                                    }
                                    c83403nh.A21 = arrayList7;
                                } else if ("serialized_receiver_fetch_params".equals(A0q)) {
                                    c83403nh.A1o = c16l.A11() != C16R.A0G ? c16l.A1P() : null;
                                } else if ("is_sent_by_viewer".equals(A0q)) {
                                    c83403nh.A2N = c16l.A0d();
                                } else if ("tq_seq_id".equals(A0q)) {
                                    c83403nh.A1R = Long.valueOf(c16l.A0y());
                                } else if ("is_ae".equals(A0q)) {
                                    c83403nh.A18 = Boolean.valueOf(c16l.A0d());
                                } else if ("armadillo_express_data".equals(A0q)) {
                                    c83403nh.A0D = AbstractC46829KnO.parseFromJson(c16l);
                                } else if ("is_ae_dual_send".equals(A0q)) {
                                    c83403nh.A19 = Boolean.valueOf(c16l.A0d());
                                } else if ("comments_info".equals(A0q)) {
                                    c83403nh.A0q = AbstractC102014iI.parseFromJson(c16l);
                                } else if ("is_replyable_in_bc".equals(A0q)) {
                                    c83403nh.A2L = c16l.A0d();
                                } else if ("channel_message_seen_count".equals(A0q)) {
                                    c83403nh.A1D = Integer.valueOf(c16l.A1D());
                                } else if ("send_attribution".equals(A0q)) {
                                    c83403nh.A1p = c16l.A11() != C16R.A0G ? c16l.A1P() : null;
                                } else if ("is_saved_sticker".equals(A0q)) {
                                    c83403nh.A2M = c16l.A0d();
                                } else if ("is_from_msys".equals(A0q)) {
                                    c83403nh.A2G = c16l.A0d();
                                } else if ("message_expiration_timestamp_ms".equals(A0q)) {
                                    c83403nh.A1L = c16l.A11() == C16R.A0I ? Long.valueOf(c16l.A0y()) : null;
                                } else if ("message_ephemeral_lifetime_ms".equals(A0q)) {
                                    c83403nh.A1K = c16l.A11() == C16R.A0I ? Long.valueOf(c16l.A0y()) : null;
                                } else if ("ephemeral_duration_sec".equals(A0q)) {
                                    c83403nh.A1J = c16l.A11() == C16R.A0I ? Long.valueOf(c16l.A0y()) : null;
                                } else if ("ephemeral_view_timestamp_ms".equals(A0q)) {
                                    c83403nh.A1O = c16l.A11() == C16R.A0I ? Long.valueOf(c16l.A0y()) : null;
                                } else if ("ephemeral_view_duration_sec".equals(A0q)) {
                                    c83403nh.A1M = c16l.A11() == C16R.A0I ? Long.valueOf(c16l.A0y()) : null;
                                } else if ("ephemeral_after_view_expiration_timestamp_ms".equals(A0q)) {
                                    c83403nh.A1N = c16l.A11() == C16R.A0I ? Long.valueOf(c16l.A0y()) : null;
                                } else if ("is_ephemeral_exception".equals(A0q)) {
                                    c83403nh.A2E = c16l.A0d();
                                } else if ("receiver_fetch_preview_data".equals(A0q)) {
                                    if (c16l.A11() == C16R.A0C) {
                                        arrayList8 = new ArrayList();
                                        while (c16l.A1J() != C16R.A08) {
                                            C910143t parseFromJson8 = AbstractC910043s.parseFromJson(c16l);
                                            if (parseFromJson8 != null) {
                                                arrayList8.add(parseFromJson8);
                                            }
                                        }
                                    }
                                    c83403nh.A2B = arrayList8;
                                } else if ("is_receiver_fetch_pending".equals(A0q)) {
                                    c83403nh.A2K = c16l.A0d();
                                } else if ("is_receiver_fetch_copy_message".equals(A0q)) {
                                    c83403nh.A2J = c16l.A0d();
                                } else if ("receiver_fetch_action_type".equals(A0q)) {
                                    c83403nh.A1l = c16l.A11() != C16R.A0G ? c16l.A1P() : null;
                                } else if ("receiver_fetch_content_type".equals(A0q)) {
                                    c83403nh.A1n = c16l.A11() != C16R.A0G ? c16l.A1P() : null;
                                } else if ("receiver_fetch_content_owner".equals(A0q)) {
                                    c83403nh.A1m = c16l.A11() != C16R.A0G ? c16l.A1P() : null;
                                } else if ("bot_metadata".equals(A0q)) {
                                    c83403nh.A0Q = F43.parseFromJson(c16l);
                                } else if ("paid_partnership_info".equals(A0q)) {
                                    c83403nh.A04 = AbstractC83773oM.parseFromJson(c16l);
                                } else if ("genai_params".equals(A0q)) {
                                    c83403nh.A09 = AbstractC83783oN.parseFromJson(c16l);
                                } else if ("ai_consumption_params".equals(A0q)) {
                                    c83403nh.A0M = AbstractC34121F3x.parseFromJson(c16l);
                                } else if ("image_glyphs".equals(A0q)) {
                                    c83403nh.A0l = AbstractC69935Vy6.parseFromJson(c16l);
                                } else if ("mustache_ctas".equals(A0q)) {
                                    if (c16l.A11() == C16R.A0C) {
                                        arrayList9 = new ArrayList();
                                        while (c16l.A1J() != C16R.A08) {
                                            C9CP parseFromJson9 = C4G0.parseFromJson(c16l);
                                            if (parseFromJson9 != null) {
                                                arrayList9.add(parseFromJson9);
                                            }
                                        }
                                    }
                                    c83403nh.A29 = arrayList9;
                                } else if ("message_trace_id".equals(A0q)) {
                                    c83403nh.A1h = c16l.A11() != C16R.A0G ? c16l.A1P() : null;
                                } else if ("edit_count".equals(A0q)) {
                                    c83403nh.A01 = c16l.A1D();
                                } else if ("ctx_ad_conversation_starter_info".equals(A0q)) {
                                    c83403nh.A0k = AbstractC111244zm.parseFromJson(c16l);
                                } else if ("encrypted".equals(A0q)) {
                                    c83403nh.A1Y = c16l.A11() != C16R.A0G ? c16l.A1P() : null;
                                } else if ("opaque_message".equals(A0q)) {
                                    c83403nh.A1i = c16l.A11() != C16R.A0G ? c16l.A1P() : null;
                                } else if ("decryption_merge_error".equals(A0q)) {
                                    c83403nh.A1X = c16l.A11() != C16R.A0G ? c16l.A1P() : null;
                                } else if ("bloks_xma".equals(A0q)) {
                                    c83403nh.A0O = AbstractC62270S4p.parseFromJson(c16l);
                                } else if ("in_app_notification_info".equals(A0q)) {
                                    c83403nh.A0E = AbstractC46855Kno.parseFromJson(c16l);
                                } else if ("is_taken_down".equals(A0q)) {
                                    c83403nh.A2Q = c16l.A0d();
                                } else if ("otid".equals(A0q)) {
                                    c83403nh.A1j = c16l.A11() != C16R.A0G ? c16l.A1P() : null;
                                } else if ("thread_locked_status".equals(A0q)) {
                                    c83403nh.A1H = Integer.valueOf(c16l.A1D());
                                } else if ("scheduled_timestamp".equals(A0q)) {
                                    c83403nh.A1Q = c16l.A11() == C16R.A0I ? Long.valueOf(c16l.A0y()) : null;
                                } else if ("is_pinned".equals(A0q)) {
                                    c83403nh.A2H = c16l.A0d();
                                } else if ("one_click_upsell".equals(A0q)) {
                                    c83403nh.A05 = AbstractC126465nh.parseFromJson(c16l);
                                } else if ("media_reaction_group".equals(A0q)) {
                                    c83403nh.A0m = AbstractC83813oQ.parseFromJson(c16l);
                                }
                            } else {
                                if (c16l.A11() == C16R.A0C) {
                                    arrayList10 = new ArrayList();
                                    while (c16l.A1J() != C16R.A08) {
                                        C910143t parseFromJson10 = AbstractC910043s.parseFromJson(c16l);
                                        if (parseFromJson10 != null) {
                                            arrayList10.add(parseFromJson10);
                                        }
                                    }
                                }
                                c83403nh.A26 = arrayList10;
                            }
                        } else {
                            c83403nh.A1q = c16l.A11() != C16R.A0G ? c16l.A1P() : null;
                        }
                    }
                    c16l.A0z();
                } else {
                    if (!z) {
                        if (c16l instanceof C07950bF) {
                            UserSession userSession = ((C07950bF) c16l).A01;
                            C83693oE A00 = AbstractC83823oR.A00(directThreadKey);
                            return c83403nh.A0N(userSession, A00 != null ? AbstractC1345466e.A02(A00) : null);
                        }
                        C0w9.A03("direct_message_missing_session", "DirectMessage JSON needs to be parsed using SessionAwareJsonParser");
                        return c83403nh;
                    }
                    return c83403nh;
                }
            }
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
