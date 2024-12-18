package X;

import android.app.NotificationManager;
import android.content.Context;
import com.instagram.common.gallery.metadata.MediaUploadMetadata;
import com.instagram.common.session.UserSession;
import com.instagram.model.mediasize.ExtendedImageUrl;
import com.instagram.music.common.model.MusicOverlayStickerModel;
import com.instagram.pendingmedia.model.constants.ShareType;
import com.instagram.pendingmedia.service.impl.ConcurrentUploadQueueProcessor;
import com.instagram.pendingmedia.store.PendingMediaStore;
import com.instagram.pendingmedia.store.PendingMediaStoreSerializer;
import com.instagram.user.model.User;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.1td, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C40121td implements InterfaceC13050lr {
    public static boolean A0E;
    public static boolean A0F;
    public static final ConcurrentHashMap A0H;
    public static final InterfaceC09390do A0K;
    public static final InterfaceC06180Ui A0L;
    public static final InterfaceC19390xP A0M;
    public final Context A00;
    public final UserSession A01;
    public final InterfaceC70363Du A02;
    public final ConcurrentUploadQueueProcessor A03;
    public final PendingMediaStore A04;
    public final PendingMediaStoreSerializer A05;
    public final java.util.Set A06;
    public final InterfaceC09390do A07;
    public final InterfaceC09390do A08;
    public final InterfaceC09390do A09;
    public final C19L A0A;
    public final C20030yX A0B;
    public final C13920nI A0C;
    public final C3E1 A0D;
    public static final C40131tg A0G = new Object();
    public static final AtomicInteger A0J = new AtomicInteger();
    public static final ConcurrentHashMap A0I = new ConcurrentHashMap();

    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x005c. Please report as an issue. */
    /* JADX WARN: Type inference failed for: r11v0, types: [X.01p, X.0yX, java.util.Map] */
    public C40121td(Context context, C12N c12n, UserSession userSession) {
        ConcurrentUploadQueueProcessor concurrentUploadQueueProcessor;
        C005001p c005001p;
        ShareType shareType;
        Object c40371u5;
        C14360o3.A0B(context, 1);
        C14360o3.A0B(userSession, 2);
        C14360o3.A0B(c12n, 3);
        this.A00 = context;
        this.A01 = userSession;
        this.A08 = AbstractC09440dt.A01(new C9EQ(this, 6));
        this.A06 = new LinkedHashSet();
        this.A0C = C13920nI.A00;
        this.A02 = C70343Ds.A00(context, userSession);
        this.A05 = AnonymousClass257.A00(userSession);
        this.A04 = C25A.A00(userSession);
        this.A0D = new C3E1(this);
        ?? c005001p2 = new C005001p(0);
        Object value = A0K.getValue();
        C14360o3.A07(value);
        for (int i : (int[]) value) {
            switch (i) {
                case 0:
                    c005001p = new C005001p(1);
                    shareType = ShareType.A0D;
                    c40371u5 = new Object();
                    c005001p.put(shareType, c40371u5);
                    c005001p2.A09(c005001p);
                case 1:
                    c005001p = new C005001p(1);
                    shareType = ShareType.A0Y;
                    c40371u5 = new Object();
                    c005001p.put(shareType, c40371u5);
                    c005001p2.A09(c005001p);
                case 2:
                    c005001p = new C005001p(1);
                    shareType = ShareType.A0S;
                    c40371u5 = new C40221tq();
                    c005001p.put(shareType, c40371u5);
                    c005001p2.A09(c005001p);
                case 3:
                case 9:
                    c005001p = new C005001p(0);
                    c005001p2.A09(c005001p);
                case 4:
                    c005001p = new C005001p(1);
                    shareType = ShareType.A0L;
                    c40371u5 = new C40261tu();
                    c005001p.put(shareType, c40371u5);
                    c005001p2.A09(c005001p);
                case 5:
                    c005001p = new C005001p(1);
                    shareType = ShareType.A0V;
                    c40371u5 = new Object();
                    c005001p.put(shareType, c40371u5);
                    c005001p2.A09(c005001p);
                case 6:
                    c005001p = new C005001p(3);
                    c005001p.put(ShareType.A0H, new C40321u0());
                    final ShareType shareType2 = ShareType.A0N;
                    c005001p.put(shareType2, new InterfaceC40181tm(shareType2) { // from class: X.3E4
                        public final ShareType A00;

                        @Override // X.InterfaceC40181tm
                        public final /* bridge */ /* synthetic */ C26461Qb AEa(Context context2, C22P c22p, MediaUploadMetadata mediaUploadMetadata, UserSession userSession2, ShareType shareType3, Object obj, String str, String str2, String str3, String str4, String str5, String str6, String str7, List list, long j, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
                            C14360o3.A0B(context2, 0);
                            C14360o3.A0B(userSession2, 1);
                            C14360o3.A0B(str, 4);
                            C14360o3.A0B(str2, 5);
                            C14360o3.A0B(str3, 6);
                            C14360o3.A0B(shareType3, 9);
                            C14360o3.A0B(mediaUploadMetadata, 12);
                            if (shareType3 != ShareType.A0N && shareType3 != ShareType.A0M) {
                                throw new IllegalStateException("Check failed.");
                            }
                            EnumC53323Ni0 enumC53323Ni0 = EnumC53323Ni0.A0E;
                            String A00 = C16030qx.A00(context2);
                            C14360o3.A07(A00);
                            C25621Ms A01 = C55230Of1.A01(c22p, mediaUploadMetadata, userSession2, enumC53323Ni0, str, str4, A00, str6, null, list, z, z2, z3, false);
                            A01.A9s("upload_id", str);
                            if (shareType3 == ShareType.A0M) {
                                A01.A0D("is_background_image", 1);
                            }
                            return A01.A0O();
                        }

                        @Override // X.InterfaceC40181tm
                        public final /* bridge */ /* synthetic */ Object AEm(C47Z c47z) {
                            return null;
                        }

                        @Override // X.InterfaceC40181tm
                        public final /* synthetic */ void DEN(InterfaceC40821up interfaceC40821up, UserSession userSession2, C47Z c47z) {
                        }

                        @Override // X.InterfaceC40181tm
                        public final N3A E3U(C3JY c3jy, UserSession userSession2) {
                            C14360o3.A0B(userSession2, 0);
                            C14360o3.A0B(c3jy, 1);
                            return (N3A) new C56150OwG(new C07510aQ(userSession2), new C55921OsD()).A00(c3jy);
                        }

                        @Override // X.InterfaceC40181tm
                        public final void E4y(UserSession userSession2, C47Z c47z, C54783OIx c54783OIx) {
                            C14360o3.A0B(c47z, 1);
                            C14360o3.A0B(c54783OIx, 2);
                            c54783OIx.A00(c47z.A1C, c47z, true);
                        }

                        @Override // X.InterfaceC40181tm
                        public final C38321qM DqT(Context context2, InterfaceC40821up interfaceC40821up, UserSession userSession2, C47Z c47z) {
                            User A2E;
                            L9E AKY;
                            C14360o3.A0B(userSession2, 0);
                            C14360o3.A0B(context2, 3);
                            C14360o3.A0C(interfaceC40821up, AbstractC111324zv.A00(2791));
                            C38321qM c38321qM = ((N3A) interfaceC40821up).A00;
                            if (c38321qM != null && (A2E = c38321qM.A2E(userSession2)) != null) {
                                User A02 = AnonymousClass189.A00(userSession2).A02(A2E.getId());
                                if (A02 != null) {
                                    InterfaceC223316m BW9 = A02.A03.BW9();
                                    ExtendedImageUrl A1q = c38321qM.A1q(context2);
                                    if (BW9 == null) {
                                        BW9 = new C223216l(null, null, null, null, null, null, null, null, null, null);
                                    } else {
                                        ShareType shareType3 = this.A00;
                                        if (shareType3 == ShareType.A0M) {
                                            AKY = BW9.AKY();
                                            AKY.A00 = A1q;
                                        } else if (shareType3 == ShareType.A0N) {
                                            AKY = BW9.AKY();
                                            AKY.A01 = A1q;
                                        }
                                        BW9 = AKY.A00();
                                    }
                                    A02.A03.EZY(BW9);
                                    AnonymousClass189.A00(userSession2).A03(A02);
                                    if (A1q != null) {
                                        C25821No.A00().A0P(A1q);
                                    }
                                }
                            }
                            return c38321qM;
                        }

                        {
                            this.A00 = shareType2;
                        }
                    });
                    final ShareType shareType3 = ShareType.A0M;
                    c005001p.put(shareType3, new InterfaceC40181tm(shareType3) { // from class: X.3E4
                        public final ShareType A00;

                        @Override // X.InterfaceC40181tm
                        public final /* bridge */ /* synthetic */ C26461Qb AEa(Context context2, C22P c22p, MediaUploadMetadata mediaUploadMetadata, UserSession userSession2, ShareType shareType32, Object obj, String str, String str2, String str3, String str4, String str5, String str6, String str7, List list, long j, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
                            C14360o3.A0B(context2, 0);
                            C14360o3.A0B(userSession2, 1);
                            C14360o3.A0B(str, 4);
                            C14360o3.A0B(str2, 5);
                            C14360o3.A0B(str3, 6);
                            C14360o3.A0B(shareType32, 9);
                            C14360o3.A0B(mediaUploadMetadata, 12);
                            if (shareType32 != ShareType.A0N && shareType32 != ShareType.A0M) {
                                throw new IllegalStateException("Check failed.");
                            }
                            EnumC53323Ni0 enumC53323Ni0 = EnumC53323Ni0.A0E;
                            String A00 = C16030qx.A00(context2);
                            C14360o3.A07(A00);
                            C25621Ms A01 = C55230Of1.A01(c22p, mediaUploadMetadata, userSession2, enumC53323Ni0, str, str4, A00, str6, null, list, z, z2, z3, false);
                            A01.A9s("upload_id", str);
                            if (shareType32 == ShareType.A0M) {
                                A01.A0D("is_background_image", 1);
                            }
                            return A01.A0O();
                        }

                        @Override // X.InterfaceC40181tm
                        public final /* bridge */ /* synthetic */ Object AEm(C47Z c47z) {
                            return null;
                        }

                        @Override // X.InterfaceC40181tm
                        public final /* synthetic */ void DEN(InterfaceC40821up interfaceC40821up, UserSession userSession2, C47Z c47z) {
                        }

                        @Override // X.InterfaceC40181tm
                        public final N3A E3U(C3JY c3jy, UserSession userSession2) {
                            C14360o3.A0B(userSession2, 0);
                            C14360o3.A0B(c3jy, 1);
                            return (N3A) new C56150OwG(new C07510aQ(userSession2), new C55921OsD()).A00(c3jy);
                        }

                        @Override // X.InterfaceC40181tm
                        public final void E4y(UserSession userSession2, C47Z c47z, C54783OIx c54783OIx) {
                            C14360o3.A0B(c47z, 1);
                            C14360o3.A0B(c54783OIx, 2);
                            c54783OIx.A00(c47z.A1C, c47z, true);
                        }

                        @Override // X.InterfaceC40181tm
                        public final C38321qM DqT(Context context2, InterfaceC40821up interfaceC40821up, UserSession userSession2, C47Z c47z) {
                            User A2E;
                            L9E AKY;
                            C14360o3.A0B(userSession2, 0);
                            C14360o3.A0B(context2, 3);
                            C14360o3.A0C(interfaceC40821up, AbstractC111324zv.A00(2791));
                            C38321qM c38321qM = ((N3A) interfaceC40821up).A00;
                            if (c38321qM != null && (A2E = c38321qM.A2E(userSession2)) != null) {
                                User A02 = AnonymousClass189.A00(userSession2).A02(A2E.getId());
                                if (A02 != null) {
                                    InterfaceC223316m BW9 = A02.A03.BW9();
                                    ExtendedImageUrl A1q = c38321qM.A1q(context2);
                                    if (BW9 == null) {
                                        BW9 = new C223216l(null, null, null, null, null, null, null, null, null, null);
                                    } else {
                                        ShareType shareType32 = this.A00;
                                        if (shareType32 == ShareType.A0M) {
                                            AKY = BW9.AKY();
                                            AKY.A00 = A1q;
                                        } else if (shareType32 == ShareType.A0N) {
                                            AKY = BW9.AKY();
                                            AKY.A01 = A1q;
                                        }
                                        BW9 = AKY.A00();
                                    }
                                    A02.A03.EZY(BW9);
                                    AnonymousClass189.A00(userSession2).A03(A02);
                                    if (A1q != null) {
                                        C25821No.A00().A0P(A1q);
                                    }
                                }
                            }
                            return c38321qM;
                        }

                        {
                            this.A00 = shareType3;
                        }
                    });
                    shareType = ShareType.A0c;
                    c40371u5 = new C40341u2();
                    c005001p.put(shareType, c40371u5);
                    c005001p2.A09(c005001p);
                case 7:
                    c005001p = new C005001p(1);
                    shareType = ShareType.A0U;
                    c40371u5 = new C40351u3();
                    c005001p.put(shareType, c40371u5);
                    c005001p2.A09(c005001p);
                case 8:
                    c005001p = new C005001p(1);
                    shareType = ShareType.A0d;
                    c40371u5 = new C40371u5();
                    c005001p.put(shareType, c40371u5);
                    c005001p2.A09(c005001p);
                default:
                    throw new IllegalArgumentException(String.format("No implementation bound to key: %s", Integer.valueOf(i)));
            }
        }
        this.A0B = c005001p2;
        C3E6 c3e6 = ConcurrentUploadQueueProcessor.A0F;
        Context context2 = this.A00;
        InterfaceC70363Du interfaceC70363Du = this.A02;
        PendingMediaStore pendingMediaStore = this.A04;
        C3E1 c3e1 = this.A0D;
        UserSession userSession2 = this.A01;
        C12L c12l = C12L.A00;
        synchronized (c3e6) {
            C14360o3.A0B(interfaceC70363Du, 1);
            C14360o3.A0B(pendingMediaStore, 2);
            C14360o3.A0B(c12l, 6);
            concurrentUploadQueueProcessor = (ConcurrentUploadQueueProcessor) userSession2.A01(ConcurrentUploadQueueProcessor.class, new C3E7(context2.getApplicationContext(), c12l, userSession2, interfaceC70363Du, c3e1, pendingMediaStore, c005001p2, AbstractC14490oL.A0C(context2) ? 3 : 10));
        }
        this.A03 = concurrentUploadQueueProcessor;
        this.A0A = AnonymousClass194.A02(c12n.AOT(319, 2));
        this.A09 = AbstractC09440dt.A01(new C9EQ(this, 7));
        this.A07 = AbstractC09440dt.A01(new C9EQ(this, 5));
    }

    public final void A07(C47Z c47z) {
        c47z.A5Q = true;
        if (c47z.A1f == EnumC915447k.A04) {
            A02(c47z);
            ((C70353Dt) this.A02).A07(c47z, c47z.A3t, "target_added", c47z.A1T.A00());
            A04(c47z, this, "user post");
        }
        if (C18U.A06(C06090Tz.A05, this.A01, 36320841910657974L) && c47z.A6J != EnumC915447k.A02) {
            A0K(c47z.A35, null, false, true, true);
        }
    }

    public final void A08(C47Z c47z) {
        int i;
        C14360o3.A0B(c47z, 0);
        c47z.A0Q++;
        c47z.A0E += c47z.A0D;
        c47z.A0D = 0;
        C916047t c916047t = c47z.A1d;
        EnumC915447k enumC915447k = c47z.A1f;
        boolean A11 = c47z.A11();
        C14360o3.A0B(enumC915447k, 0);
        Integer A00 = AbstractC54081Nvf.A00(enumC915447k, A11);
        Map map = c916047t.A03;
        String A002 = AbstractC54082Nvg.A00(A00);
        Number number = (Number) map.get(A002);
        if (number != null) {
            i = number.intValue();
        } else {
            i = 0;
        }
        c916047t.A03.put(A002, Integer.valueOf(i + 1));
        ((C70353Dt) this.A02).A07(c47z, c47z.A3t, "manual_retry", c47z.A1T.A00());
        A02(c47z);
        A04(c47z, this, "manual post");
    }

    public final void A09(C47Z c47z) {
        A0E(c47z, null, null);
    }

    public final void A0C(C47Z c47z) {
        C14360o3.A0B(c47z, 0);
        PendingMediaStore pendingMediaStore = this.A04;
        EnumC40111tc enumC40111tc = EnumC40111tc.A0Q;
        java.util.Set singleton = Collections.singleton(c47z.A35);
        C14360o3.A07(singleton);
        pendingMediaStore.A0C(enumC40111tc, singleton);
        pendingMediaStore.A0D(c47z, c47z.A35);
        this.A05.A04();
    }

    public final void A0D(C47Z c47z) {
        C14360o3.A0B(c47z, 0);
        PendingMediaStore pendingMediaStore = this.A04;
        EnumC40111tc enumC40111tc = EnumC40111tc.A0a;
        java.util.Set singleton = Collections.singleton(c47z.A35);
        C14360o3.A07(singleton);
        pendingMediaStore.A0C(enumC40111tc, singleton);
        pendingMediaStore.A0D(c47z, c47z.A35);
        this.A05.A04();
    }

    public final void A0F(C47Z c47z, List list) {
        C14360o3.A0B(list, 1);
        java.util.Set singleton = Collections.singleton(c47z.A35);
        C14360o3.A07(singleton);
        ArrayList arrayList = new ArrayList(AbstractC06950Ym.A1E(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((C47Z) it.next()).A35);
        }
        LinkedHashSet A00 = AnonymousClass090.A00(arrayList, singleton);
        Iterator it2 = AbstractC16960so.A1Q(EnumC40111tc.A0Q, EnumC40111tc.A0a).iterator();
        while (it2.hasNext()) {
            this.A04.A0C((EnumC40111tc) it2.next(), A00);
        }
        PendingMediaStore pendingMediaStore = this.A04;
        pendingMediaStore.A0D(c47z, c47z.A35);
        Iterator it3 = list.iterator();
        while (it3.hasNext()) {
            C47Z c47z2 = (C47Z) it3.next();
            pendingMediaStore.A0D(c47z2, c47z2.A35);
        }
        this.A05.A04();
    }

    public final void A0H(InterfaceC53852dP interfaceC53852dP) {
        C14360o3.A0B(interfaceC53852dP, 0);
        this.A06.add(new WeakReference(interfaceC53852dP));
    }

    public final void A0I(InterfaceC53852dP interfaceC53852dP) {
        C14360o3.A0B(interfaceC53852dP, 0);
        AnonymousClass016.A17(this.A06, new C206969Eb(interfaceC53852dP, 39));
    }

    public final void A0J(String str) {
        A0K(str, null, false, false, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x005c, code lost:
    
        if (r9 != null) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0014, code lost:
    
        if (r9.A0m() != true) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0K(java.lang.String r14, java.lang.String r15, boolean r16, boolean r17, boolean r18) {
        /*
            r13 = this;
            r0 = 0
            r10 = r14
            X.C14360o3.A0B(r14, r0)
            r8 = r13
            com.instagram.pendingmedia.store.PendingMediaStore r4 = r13.A04
            X.47Z r9 = r4.A03(r14)
            r1 = 1
            if (r9 == 0) goto L16
            boolean r0 = r9.A0m()
            r6 = 1
            if (r0 == r1) goto L17
        L16:
            r6 = 0
        L17:
            r11 = 0
            if (r17 == 0) goto L4c
            if (r16 == 0) goto L5c
            if (r9 == 0) goto L5a
            X.47k r1 = r9.A6J
        L20:
            X.47k r0 = X.EnumC915447k.A02
            if (r1 == r0) goto L5c
            if (r9 == 0) goto L31
            X.47k r0 = X.EnumC915447k.A07
            r9.A0a(r0)
        L2b:
            int r0 = r9.A0M
            int r0 = r0 + 1
            r9.A0M = r0
        L31:
            com.instagram.pendingmedia.service.impl.ConcurrentUploadQueueProcessor r0 = r13.A03
            X.KYw r1 = new X.KYw
            r1.<init>(r14)
            X.1Iq r0 = r0.A0D
            X.AbstractC129685tX.A00(r1, r0)
            X.19L r2 = r13.A0A
            r12 = 2
            X.9Da r7 = new X.9Da
            r7.<init>(r8, r9, r10, r11, r12)
            X.191 r1 = X.AnonymousClass191.A00
            java.lang.Integer r0 = X.C05F.A00
            X.AbstractC23641Du.A03(r0, r1, r7, r2)
        L4c:
            if (r9 != 0) goto L5f
            java.lang.String r0 = "Can't find the media in store with key="
            java.lang.String r1 = X.AnonymousClass001.A0R(r0, r14)
            java.lang.String r0 = "PendingMediaManager_cancelUpload_notFound"
            X.C0w9.A03(r0, r1)
            return
        L5a:
            r1 = r11
            goto L20
        L5c:
            if (r9 == 0) goto L31
            goto L2b
        L5f:
            r13.A06(r9)
            if (r15 != 0) goto L66
            java.lang.String r15 = "cancelUpload"
        L66:
            if (r18 != 0) goto Lb5
            X.3Du r5 = r13.A02
            X.3Dt r5 = (X.C70353Dt) r5
            r5.EHd(r9, r15)
            X.47l r3 = r9.A1T
            java.util.List r0 = r3.A03()
            java.util.Iterator r2 = r0.iterator()
        L79:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L9b
            java.lang.Object r0 = r2.next()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            r5.EHe(r9, r15, r0)
            monitor-enter(r3)
            java.util.Set r1 = r3.A0C     // Catch: java.lang.Throwable -> L98
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> L98
            r1.add(r0)     // Catch: java.lang.Throwable -> L98
            monitor-exit(r3)
            goto L79
        L98:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        L9b:
            if (r6 == 0) goto Lb5
            X.3E0 r1 = r5.A03
            boolean r0 = r9.A5D
            if (r0 != 0) goto Lb5
            boolean r0 = X.AbstractC210079Qv.A03(r9)
            if (r0 == 0) goto Lb5
            com.facebook.quicklog.reliability.UserFlowLogger r3 = r1.A00
            long r0 = X.C3E0.A00(r9, r1)
            java.lang.String r2 = "user_cancelled"
            r3.flowEndCancel(r0, r2)
        Lb5:
            if (r16 != 0) goto Lc1
            X.47k r0 = X.EnumC915447k.A07
            r9.A0a(r0)
            java.lang.String r0 = r9.A35
            r4.A04(r0, r15)
        Lc1:
            X.19L r3 = r13.A0A
            r0 = 37
            X.9Ct r2 = new X.9Ct
            r2.<init>(r13, r11, r0)
            X.191 r1 = X.AnonymousClass191.A00
            java.lang.Integer r0 = X.C05F.A00
            X.AbstractC23641Du.A03(r0, r1, r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C40121td.A0K(java.lang.String, java.lang.String, boolean, boolean, boolean):void");
    }

    public final boolean A0L(String str) {
        C47Z A03 = this.A04.A03(str);
        if (A03 == null) {
            C0w9.A03("PendingMediaManager_manualUploadRetry_notFound", AnonymousClass001.A0R("Can't find the media in store with key=", str));
            return false;
        }
        A08(A03);
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.1tg, java.lang.Object] */
    static {
        AnonymousClass057 A00 = C10M.A00(C05F.A01, 0, 10);
        A0L = A00;
        A0M = A00;
        A0H = new ConcurrentHashMap();
        A0K = AbstractC09440dt.A01(C40141th.A00);
    }

    public static final synchronized C40121td A00(Context context, UserSession userSession) {
        C40121td A01;
        synchronized (C40121td.class) {
            A01 = A0G.A01(context, userSession);
        }
        return A01;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0018, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, r15.A01, 36328671635652311L) != false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A04(X.C47Z r14, X.C40121td r15, java.lang.String r16) {
        /*
            android.content.Context r0 = X.AbstractC12290kX.A00
            boolean r0 = X.AbstractC14490oL.A0C(r0)
            r4 = r14
            r5 = r16
            if (r0 != 0) goto L1a
            com.instagram.common.session.UserSession r3 = r15.A01
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36328671635652311(0x8110bc00013ed7, double:3.0377364539810865E-306)
            boolean r0 = X.C18U.A06(r2, r3, r0)
            if (r0 == 0) goto L33
        L1a:
            android.content.Context r0 = r15.A00
            boolean r0 = X.AbstractC15820qc.A0F(r0)
            if (r0 != 0) goto L33
            com.instagram.pendingmedia.model.constants.ShareType r1 = r14.A0D()
            com.instagram.pendingmedia.model.constants.ShareType r0 = com.instagram.pendingmedia.model.constants.ShareType.A0E
            if (r1 != r0) goto L8c
            java.lang.String r0 = "pre-upload"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L8c
        L33:
            java.lang.String r0 = r14.A3C
            if (r0 == 0) goto L3d
            boolean r0 = X.AbstractC001900j.A0T(r0)
            if (r0 == 0) goto L45
        L3d:
            X.1QN r0 = X.C1QM.A00
            X.1QQ r0 = r0.A02
            java.lang.String r0 = r0.A00
            r14.A3C = r0
        L45:
            com.instagram.pendingmedia.service.impl.ConcurrentUploadQueueProcessor r0 = r15.A03
            r7 = 0
            r8 = 0
            X.3Pr r6 = new X.3Pr
            r6.<init>()
            X.KYx r3 = new X.KYx
            r9 = r8
            r3.<init>(r4, r5, r6, r7, r8, r9)
            r0.A00(r3)
            java.lang.String r0 = "pre-upload"
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L8b
            X.1tg r9 = X.C40121td.A0G
            X.0do r0 = r15.A09
            java.lang.Object r10 = r0.getValue()
            X.2L1 r10 = (X.C2L1) r10
            com.instagram.common.session.UserSession r0 = r15.A01
            java.lang.String r1 = r0.token
            r0 = -1
            X.Jxb r11 = new X.Jxb
            r11.<init>(r14, r1, r5, r0)
            java.lang.Integer r12 = X.C05F.A01
            X.0do r0 = r15.A07
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r13 = r0.booleanValue()
            r14 = r8
            r9.A03(r10, r11, r12, r13, r14)
            com.instagram.pendingmedia.store.PendingMediaStoreSerializer r0 = r15.A05
            r0.A04()
        L8b:
            return
        L8c:
            r0 = 0
            r14.A5K = r0
            goto L33
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C40121td.A04(X.47Z, X.1td, java.lang.String):void");
    }

    public final void A0A(C47Z c47z) {
        PendingMediaStore pendingMediaStore = this.A04;
        EnumC40111tc enumC40111tc = EnumC40111tc.A06;
        java.util.Set singleton = Collections.singleton(c47z.A35);
        C14360o3.A07(singleton);
        pendingMediaStore.A0C(enumC40111tc, singleton);
        pendingMediaStore.A0D(c47z, c47z.A35);
        this.A05.A04();
    }

    public final void A0B(C47Z c47z) {
        for (EnumC40111tc enumC40111tc : AbstractC16960so.A1Q(EnumC40111tc.A0a, EnumC40111tc.A0A)) {
            PendingMediaStore pendingMediaStore = this.A04;
            java.util.Set singleton = Collections.singleton(c47z.A35);
            C14360o3.A07(singleton);
            pendingMediaStore.A0C(enumC40111tc, singleton);
        }
        PendingMediaStore pendingMediaStore2 = this.A04;
        pendingMediaStore2.A0D(c47z, c47z.A35);
        for (C47Z c47z2 : c47z.A0K()) {
            pendingMediaStore2.A0D(c47z2, c47z2.A35);
        }
        this.A05.A04();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00f2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0E(X.C47Z r26, X.InterfaceC40171tl r27, com.instagram.pendingmedia.model.constants.ShareType r28) {
        /*
            Method dump skipped, instructions count: 524
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C40121td.A0E(X.47Z, X.1tl, com.instagram.pendingmedia.model.constants.ShareType):void");
    }

    public final void A0G(C47Z c47z, boolean z, boolean z2) {
        String str;
        String str2;
        String str3;
        EnumC915447k enumC915447k;
        Iterator it = c47z.A4b.iterator();
        MusicOverlayStickerModel musicOverlayStickerModel = null;
        int i = 0;
        while (it.hasNext()) {
            MusicOverlayStickerModel musicOverlayStickerModel2 = ((C84823qW) it.next()).A0v;
            if (C50702MZx.A08(musicOverlayStickerModel2)) {
                musicOverlayStickerModel = musicOverlayStickerModel2;
                i++;
            }
        }
        MusicOverlayStickerModel musicOverlayStickerModel3 = c47z.A1J;
        if (C50702MZx.A08(musicOverlayStickerModel3)) {
            musicOverlayStickerModel = musicOverlayStickerModel3;
            i += 100;
        }
        List list = c47z.A4g;
        if (list != null) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                MusicOverlayStickerModel musicOverlayStickerModel4 = ((C84823qW) it2.next()).A0v;
                if (C50702MZx.A08(musicOverlayStickerModel4)) {
                    musicOverlayStickerModel = musicOverlayStickerModel4;
                    i += 1000;
                }
            }
        }
        List<MusicOverlayStickerModel> list2 = c47z.A4W;
        if (list2 != null) {
            for (MusicOverlayStickerModel musicOverlayStickerModel5 : list2) {
                if (C50702MZx.A08(musicOverlayStickerModel5)) {
                    i += 10000;
                    musicOverlayStickerModel = musicOverlayStickerModel5;
                }
            }
        }
        C447024a c447024a = AnonymousClass229.A01(this.A01).A02;
        String str4 = c47z.A3t;
        String A01 = C70343Ds.A01(c47z);
        C5Kv c5Kv = c47z.A1O;
        String str5 = null;
        if (c5Kv != null) {
            str = c5Kv.A03;
        } else {
            str = null;
        }
        if (musicOverlayStickerModel != null) {
            str2 = musicOverlayStickerModel.A0S;
            str3 = musicOverlayStickerModel.A0T;
            str5 = musicOverlayStickerModel.A0m;
        } else {
            str2 = null;
            str3 = null;
        }
        C24P c24p = c447024a.A00;
        String.valueOf(c24p.A00.A0J());
        String.valueOf(c24p.A00());
        if (i != 1) {
            str2 = String.valueOf(-i);
            str3 = str2;
            str5 = "";
        }
        C447024a.A01(c447024a, "uploading_post_capture", str2, str3, str5, null, str, str4, A01, null);
        AbstractC70055W0p.A00(c47z);
        if (c47z.A1G != EnumC40111tc.A0Q && !z) {
            enumC915447k = EnumC915447k.A0B;
        } else {
            enumC915447k = EnumC915447k.A09;
        }
        c47z.A6J = enumC915447k;
        if (z2) {
            c47z.A0b(EnumC915447k.A07);
        }
        A02(c47z);
        A04(c47z, this, "pre-upload");
    }

    @Override // X.InterfaceC13050lr
    public final void onUserSessionWillEnd(boolean z) {
        AnonymousClass194.A04(AnonymousClass001.A1D("onUserSessionWillEnd isLoggedOut=", z), this.A0A);
        C40131tg.A00(this.A00);
    }

    public static final void A01(C47Z c47z) {
        if (c47z.A0t()) {
            Iterator it = c47z.A0K().iterator();
            while (it.hasNext()) {
                ((C47Z) it.next()).A0a(EnumC915447k.A09);
            }
        }
    }

    public static final void A02(C47Z c47z) {
        c47z.A0P(System.currentTimeMillis());
        c47z.A0Q(c47z.A0Z + 180000);
    }

    public static final void A03(C47Z c47z, C40121td c40121td) {
        Iterator it = c47z.A0L().iterator();
        while (it.hasNext()) {
            C47Z A03 = c40121td.A04.A03((String) it.next());
            if (A03 != null) {
                A03.A3O = null;
                A03.A5U = false;
                A03.A5S = false;
                A03.A5R = false;
            }
        }
    }

    public final void A05(C47Z c47z) {
        if (c47z.A0t()) {
            A03(c47z, this);
        }
        c47z.A5U = false;
        c47z.A5S = false;
        this.A05.A04();
    }

    public final void A06(C47Z c47z) {
        if (AbstractC55111ObU.A03(c47z.A0D())) {
            Object systemService = this.A00.getSystemService("notification");
            C14360o3.A0C(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
            ((NotificationManager) systemService).cancel(c47z.A35.hashCode());
        }
    }
}
