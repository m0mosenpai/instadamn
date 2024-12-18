package X;

import android.content.Context;
import android.graphics.Point;
import android.util.Pair;
import com.facebook.videolite.transcoder.base.composition.MediaComposition;
import com.instagram.common.session.UserSession;
import com.instagram.pendingmedia.model.ClipInfo;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import kotlin.Deprecated;

/* renamed from: X.Oew, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55227Oew {
    public static final C55227Oew A00 = new Object();

    /* JADX WARN: Type inference failed for: r1v0, types: [X.X9T, java.lang.Object] */
    public static final C52030N0e A02(Context context, UserSession userSession, File file, boolean z, boolean z2) {
        InterfaceC25204BDc c23508AbO;
        C14360o3.A0B(file, 1);
        if ((z || !C18U.A06(C06090Tz.A05, userSession, 36330887838778434L)) && !C18U.A06(C06090Tz.A05, userSession, 36330887838712897L)) {
            c23508AbO = new C23508AbO(context, userSession);
        } else {
            c23508AbO = new C23511AbR(context, userSession);
        }
        C23518AbY A002 = ADB.A00(context, c23508AbO, userSession);
        return new C52030N0e(new Object(), A002, new WZY(new U7T(), A002), userSession, file, true, z2);
    }

    public static final WDI A04(Context context, C54584O9l c54584O9l, ClipInfo clipInfo) {
        MYB A02;
        C14360o3.A0B(clipInfo, 0);
        String str = clipInfo.A0F;
        if (str == null || (A02 = AbstractC55147OdA.A02(context, str, false)) == null) {
            return null;
        }
        Pair A022 = AbstractC55028OXj.A02(A02, c54584O9l);
        Object obj = A022.first;
        C14360o3.A06(obj);
        int A0H = AbstractC166987dD.A0H(obj);
        Object obj2 = A022.second;
        C14360o3.A06(obj2);
        int A0H2 = AbstractC166987dD.A0H(obj2);
        int i = clipInfo.A09;
        int i2 = clipInfo.A06;
        int i3 = i;
        if (i < i2) {
            i3 = i2;
        }
        if (i3 > A0H) {
            i3 = A0H;
        }
        WDI wdi = new WDI();
        wdi.A02 = 30;
        wdi.A03 = 10;
        wdi.A01 = A0H2;
        wdi.A04 = A0H2;
        WFb.A04(wdi, i / i2, i3);
        return wdi;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001b, code lost:
    
        if (r7.A06 != true) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.C69489VoC A07(android.content.Context r6, X.C45120Jxp r7, X.XES r8, X.C54371O1d r9, com.instagram.common.session.UserSession r10, com.instagram.pendingmedia.model.ClipInfo r11, X.C55190Odw r12, java.lang.String r13, boolean r14) {
        /*
            r3 = 0
            X.C14360o3.A0B(r11, r3)
            r2 = 1
            if (r7 == 0) goto L11
            X.O9l r0 = X.AbstractC53753Nq5.A00(r7)
            X.WDI r5 = A04(r6, r0, r11)
            if (r5 != 0) goto L15
        L11:
            X.WDI r5 = A05(r12)
        L15:
            r4 = 1
            if (r7 == 0) goto L1d
            boolean r1 = r7.A06
            r0 = 1
            if (r1 == r2) goto L1e
        L1d:
            r0 = 0
        L1e:
            r5.A0M = r0
            X.W3N r2 = new X.W3N
            r2.<init>()
            r2.A0F = r13
            r2.A06 = r5
            r2.A0H = r14
            int r0 = r11.A07
            long r0 = (long) r0
            r2.A04 = r0
            int r0 = r11.A05
            long r0 = (long) r0
            r2.A00 = r0
            r2.A07 = r8
            if (r14 != 0) goto L67
            if (r9 == 0) goto L67
        L3b:
            r2.A0Q = r4
            java.lang.String r1 = r11.A0F
            java.lang.String r0 = "Required value was null."
            if (r1 == 0) goto L69
            if (r9 == 0) goto L60
            com.facebook.videolite.transcoder.base.composition.MediaComposition r1 = r9.A00
            r2.A08 = r1
            boolean r0 = X.C1LE.A0E(r10)
            java.util.HashSet r0 = X.ON2.A00(r1, r0)
            r2.A0G = r0
            X.Utu r0 = new X.Utu
            r0.<init>(r10, r3)
            r2.A0B = r0
        L5a:
            X.VoC r0 = new X.VoC
            r0.<init>(r2)
            return r0
        L60:
            java.io.File r0 = X.AbstractC1126356r.A02(r6, r1)
            r2.A0D = r0
            goto L5a
        L67:
            r4 = 0
            goto L3b
        L69:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A14(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C55227Oew.A07(android.content.Context, X.Jxp, X.XES, X.O1d, com.instagram.common.session.UserSession, com.instagram.pendingmedia.model.ClipInfo, X.Odw, java.lang.String, boolean):X.VoC");
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x006e, code lost:
    
        if (r5.isEmpty() != false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00c0, code lost:
    
        if (r8 > r10) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x000c, code lost:
    
        if (r1 != false) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x00ae, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, r11, 36326159080044247L) != false) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.C54371O1d A08(android.content.Context r10, com.instagram.common.session.UserSession r11, X.C47Z r12) {
        /*
            Method dump skipped, instructions count: 237
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C55227Oew.A08(android.content.Context, com.instagram.common.session.UserSession, X.47Z):X.O1d");
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x004c, code lost:
    
        if (r0 == false) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.C54371O1d A09(android.content.Context r18, com.instagram.common.session.UserSession r19, X.C47Z r20, java.lang.String r21) {
        /*
            r0 = 3
            r10 = r21
            X.C14360o3.A0B(r10, r0)
            r2 = r20
            com.instagram.pendingmedia.model.ClipInfo r3 = r2.A1N
            int r1 = r3.A07
            int r0 = r3.A05
            boolean r11 = r3.A0M
            X.47v r9 = r2.A1V
            long r14 = (long) r1
            long r0 = (long) r0
            java.util.concurrent.TimeUnit r13 = java.util.concurrent.TimeUnit.MILLISECONDS
            X.56i r8 = new X.56i
            r12 = r8
            r16 = r0
            r12.<init>(r13, r14, r16)
            boolean r3 = r2.A57
            com.instagram.camera.effect.models.CameraAREffect r0 = r2.A10
            r4 = 1
            boolean r1 = X.AbstractC167007dF.A1W(r0)
            com.instagram.pendingmedia.model.ClipInfo r0 = r2.A1N
            float r7 = r0.A01
            if (r3 != 0) goto L2f
            if (r1 == 0) goto L86
        L2f:
            if (r11 != 0) goto L86
            X.Oew r6 = X.C55227Oew.A00
            X.22P r1 = r2.A0i
            X.22P r0 = X.C22P.A2V
            r5 = r19
            if (r1 != r0) goto L6f
            X.0Tz r3 = X.C06090Tz.A05
            r0 = 36326159079716564(0x810e73000036d4, double:3.0361475034900694E-306)
            boolean r0 = X.C18U.A06(r3, r5, r0)
            if (r0 == 0) goto L86
            boolean r0 = r6.A0E(r5, r10, r7)
        L4c:
            if (r0 == 0) goto L86
        L4e:
            X.Oew r6 = X.C55227Oew.A00
            r7 = r18
            com.facebook.videolite.transcoder.base.composition.MediaComposition r0 = r6.A06(r7, r8, r9, r10, r11)
            X.56q r3 = r0.A03()
            X.56h r1 = X.EnumC1125356h.VIDEO
            X.Opo r0 = new X.Opo
            r0.<init>(r2, r4)
            r3.A03(r1, r0)
            com.facebook.videolite.transcoder.base.composition.MediaComposition r1 = new com.facebook.videolite.transcoder.base.composition.MediaComposition
            r1.<init>(r3)
            X.O1d r0 = new X.O1d
            r0.<init>(r1)
            return r0
        L6f:
            r0 = 0
            int r0 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r0 <= 0) goto L86
            boolean r0 = r6.A0E(r5, r10, r7)
            if (r0 == 0) goto L86
            X.0Tz r3 = X.C06090Tz.A05
            r0 = 36326159079913173(0x810e73000336d5, double:3.036147503614406E-306)
            boolean r0 = X.C18U.A06(r3, r5, r0)
            goto L4c
        L86:
            r4 = 0
            goto L4e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C55227Oew.A09(android.content.Context, com.instagram.common.session.UserSession, X.47Z, java.lang.String):X.O1d");
    }

    @Deprecated(message = "FilterKit has been deprecated, please use one camera ")
    public static final C54371O1d A0A(Context context, ClipInfo clipInfo, C47v c47v, String str) {
        AbstractC167017dG.A1R(c47v, str);
        if (clipInfo == null) {
            return null;
        }
        C1125456i c1125456i = new C1125456i(TimeUnit.MILLISECONDS, clipInfo.A07, clipInfo.A05);
        if (!AbstractC166987dD.A1b(c47v.A03) || c47v.A04) {
            return null;
        }
        return new C54371O1d(A00.A06(context, c1125456i, c47v, str, false));
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [X.OW6, java.lang.Object] */
    public static final XD7 A00(Context context, C52030N0e c52030N0e, C69489VoC c69489VoC, UserSession userSession) {
        ?? obj = new Object();
        obj.A0C = c69489VoC;
        obj.A00 = context;
        obj.A04 = c52030N0e.A00;
        obj.A05 = null;
        obj.A07 = ((OBZ) c52030N0e).A00;
        obj.A0E = Executors.newCachedThreadPool();
        obj.A0A = c52030N0e.A03;
        obj.A08 = ((OBZ) c52030N0e).A01;
        obj.A09 = ((OBZ) c52030N0e).A02;
        obj.A02 = new C70477WYi(true, 1280);
        obj.A0B = c52030N0e.A01;
        return C50665MYi.A00(obj, userSession);
    }

    public static final WDI A05(C55190Odw c55190Odw) {
        Point point = c55190Odw.A00;
        C14360o3.A07(point);
        int i = point.x;
        int i2 = point.y;
        WDI wdi = new WDI();
        wdi.A0C = i;
        wdi.A0A = i2;
        int A04 = c55190Odw.A04();
        wdi.A04 = A04;
        wdi.A01 = A04;
        wdi.A02 = 30;
        wdi.A03 = 4;
        return wdi;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final com.facebook.videolite.transcoder.base.composition.MediaComposition A06(android.content.Context r22, X.C1125456i r23, X.C47v r24, java.lang.String r25, boolean r26) {
        /*
            Method dump skipped, instructions count: 307
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C55227Oew.A06(android.content.Context, X.56i, X.47v, java.lang.String, boolean):com.facebook.videolite.transcoder.base.composition.MediaComposition");
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x027e A[Catch: IOException -> 0x0341, 8CK -> 0x034f, InterruptedException -> 0x035d, TryCatch #3 {8CK -> 0x034f, IOException -> 0x0341, InterruptedException -> 0x035d, blocks: (B:17:0x004e, B:18:0x0056, B:20:0x005c, B:23:0x0064, B:28:0x0068, B:30:0x006e, B:31:0x0076, B:33:0x007c, B:35:0x0080, B:37:0x009d, B:39:0x00c4, B:40:0x00d0, B:42:0x00e6, B:43:0x00e8, B:45:0x00ee, B:46:0x00f2, B:48:0x0107, B:49:0x010c, B:51:0x0131, B:52:0x0147, B:54:0x0182, B:57:0x01f9, B:59:0x0256, B:60:0x0278, B:62:0x027e, B:64:0x0286, B:65:0x0289, B:66:0x0294, B:68:0x0295, B:75:0x025e, B:78:0x0263, B:81:0x018a, B:82:0x0191, B:84:0x0199, B:86:0x019d, B:88:0x01a3, B:89:0x01ab, B:91:0x01b1, B:94:0x01ce, B:99:0x01d4, B:101:0x01da, B:102:0x01ea, B:103:0x026c, B:105:0x0271), top: B:16:0x004e }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0295 A[Catch: IOException -> 0x0341, 8CK -> 0x034f, InterruptedException -> 0x035d, TRY_LEAVE, TryCatch #3 {8CK -> 0x034f, IOException -> 0x0341, InterruptedException -> 0x035d, blocks: (B:17:0x004e, B:18:0x0056, B:20:0x005c, B:23:0x0064, B:28:0x0068, B:30:0x006e, B:31:0x0076, B:33:0x007c, B:35:0x0080, B:37:0x009d, B:39:0x00c4, B:40:0x00d0, B:42:0x00e6, B:43:0x00e8, B:45:0x00ee, B:46:0x00f2, B:48:0x0107, B:49:0x010c, B:51:0x0131, B:52:0x0147, B:54:0x0182, B:57:0x01f9, B:59:0x0256, B:60:0x0278, B:62:0x027e, B:64:0x0286, B:65:0x0289, B:66:0x0294, B:68:0x0295, B:75:0x025e, B:78:0x0263, B:81:0x018a, B:82:0x0191, B:84:0x0199, B:86:0x019d, B:88:0x01a3, B:89:0x01ab, B:91:0x01b1, B:94:0x01ce, B:99:0x01d4, B:101:0x01da, B:102:0x01ea, B:103:0x026c, B:105:0x0271), top: B:16:0x004e }] */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.lang.Object, com.instagram.pendingmedia.model.ClipInfo] */
    /* JADX WARN: Type inference failed for: r1v37, types: [X.XC9, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v2, types: [X.OW6, java.lang.Object] */
    @kotlin.Deprecated(message = "stitching is deprecated, use [MediaComposition] instead.")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.instagram.pendingmedia.model.ClipInfo A0B(android.content.Context r29, com.instagram.common.session.UserSession r30, X.C47Z r31) {
        /*
            Method dump skipped, instructions count: 917
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C55227Oew.A0B(android.content.Context, com.instagram.common.session.UserSession, X.47Z):com.instagram.pendingmedia.model.ClipInfo");
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [X.OW6, java.lang.Object] */
    public static final String A0C(Context context, UserSession userSession, File file, String str, List list, List list2) {
        C105764pn[] c105764pnArr = {null};
        String[] strArr = {null};
        C52034N0i c52034N0i = new C52034N0i(0, c105764pnArr, strArr);
        C1126256q c1126256q = new C1126256q();
        C1125856m c1125856m = new C1125856m(EnumC1125356h.AUDIO);
        int size = list.size();
        for (int i = 0; i < size; i++) {
            File A11 = AbstractC166987dD.A11(AbstractC31173DnH.A0s(list, i));
            C1125456i c1125456i = (C1125456i) list2.get(i);
            C1125656k c1125656k = new C1125656k(A11);
            if (c1125456i != null) {
                c1125656k.A03 = c1125456i;
            }
            c1125856m.A02(c1125656k.A00());
        }
        c1126256q.A04(new C1125956n(c1125856m));
        MediaComposition mediaComposition = new MediaComposition(c1126256q);
        OBZ obz = new OBZ(userSession, file, true, false);
        W3N w3n = new W3N();
        w3n.A08 = mediaComposition;
        w3n.A0I = true;
        w3n.A0E = AnonymousClass001.A0D(str, 'a');
        w3n.A07 = c52034N0i;
        C69489VoC c69489VoC = new C69489VoC(w3n);
        ?? obj = new Object();
        OW6.A00(context, obz, obj, c69489VoC);
        try {
            C50665MYi.A00(obj, userSession).FDu();
            String str2 = strArr[0];
            C105764pn c105764pn = c105764pnArr[0];
            if (c105764pn == null && str2 != null) {
                return str2;
            }
            throw new IOException("Failure when stitching audio", c105764pn);
        } catch (InterruptedException e) {
            throw new IOException("Failure when stitching audio", e);
        } catch (ExecutionException e2) {
            throw new IOException("Failure when stitching audio", e2);
        }
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [X.WZ3, java.lang.Object] */
    private final boolean A0E(UserSession userSession, String str, float f) {
        int i;
        int A07 = AbstractC25225BEi.A07(C06090Tz.A05, userSession, 36607634056484486L);
        boolean z = true;
        if (f > 0.0f) {
            if (A07 > 0 && f <= A07) {
                return true;
            }
            return false;
        }
        if (str == null) {
            return false;
        }
        InterfaceC58194Pr0 interfaceC58194Pr0 = null;
        try {
            C66014TyA c66014TyA = AbstractC66016TyE.A00;
            ?? obj = new Object();
            obj.A00 = c66014TyA;
            interfaceC58194Pr0 = obj.ALI();
            interfaceC58194Pr0.ESw(str);
            try {
                interfaceC58194Pr0.EMv(0);
                long j = Long.MIN_VALUE;
                i = 0;
                if (A07 > 0) {
                    while (interfaceC58194Pr0.AAz()) {
                        int Bq6 = interfaceC58194Pr0.Bq6();
                        j = Math.max(interfaceC58194Pr0.Bq8(), j);
                        if ((Bq6 & 1) != 0 || (Bq6 & 4) == 0) {
                            i++;
                        }
                        if (i > A07 || j >= 1000000) {
                            break;
                        }
                    }
                }
            } catch (Exception e) {
                C0w9.A02(EnumC12410kj.A06, "media_extractor_err", "Exception thrown", e);
                C0K8.A0G("IgTranscodeUtil", "Can't extract mediaData", e);
            }
            try {
                if (i <= A07) {
                    interfaceC58194Pr0.release();
                    return z;
                }
                interfaceC58194Pr0.release();
                return z;
            } catch (Exception e2) {
                C0w9.A02(EnumC12410kj.A06, "media_extractor_err", "Exception thrown", e2);
                C0K8.A0G("IgTranscodeUtil", "Can't release mediaExtractor", e2);
                return z;
            }
            z = false;
        } catch (Throwable th) {
            if (interfaceC58194Pr0 != null) {
                try {
                    interfaceC58194Pr0.release();
                    throw th;
                } catch (Exception e3) {
                    C0w9.A02(EnumC12410kj.A06, "media_extractor_err", "Exception thrown", e3);
                    C0K8.A0G("IgTranscodeUtil", "Can't release mediaExtractor", e3);
                    throw th;
                }
            }
            throw th;
        }
    }

    public static final C52030N0e A01(Context context, Point point, MediaComposition mediaComposition, UserSession userSession, C47Z c47z, C22892A7m c22892A7m, XOT xot, List list, boolean z, boolean z2) {
        Object obj;
        X9T x9t;
        File cacheDir = context.getCacheDir();
        C14360o3.A07(cacheDir);
        C23517AbX c23517AbX = new C23517AbX(point, userSession, c47z, c22892A7m, xot);
        String str = c47z.A3t;
        WZY wzy = new WZY(new U7T(), c23517AbX);
        if (list != null && !list.isEmpty()) {
            x9t = A03(context, mediaComposition, userSession, str, list);
        } else {
            if (z) {
                obj = new Object();
            } else {
                obj = new Object();
            }
            x9t = (X9T) obj;
        }
        return new C52030N0e(x9t, c23517AbX, wzy, userSession, cacheDir, z, z2);
    }

    public static final X9T A03(Context context, MediaComposition mediaComposition, UserSession userSession, String str, List list) {
        Object obj;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        for (Object obj2 : list) {
            if (obj2 instanceof C23501AbH) {
                z = true;
            } else if ((obj2 instanceof C190178bb) && C1LE.A0F(userSession)) {
                z2 = true;
            } else if (obj2 instanceof C23500AbG) {
                z3 = true;
            }
        }
        C09530e4 A002 = AbstractC53677NoS.A00(userSession);
        boolean A1a = AbstractC166987dD.A1a(A002.A00);
        OMT omt = (OMT) A002.A01;
        C50665MYi c50665MYi = new C50665MYi(userSession);
        if (str == null) {
            str = "null";
        }
        C54507O6k c54507O6k = new C54507O6k(c50665MYi, str, ON2.A01(context, mediaComposition, z2));
        if (z) {
            obj = new Object();
        } else {
            obj = new Object();
        }
        X9T x9t = (X9T) obj;
        ArrayList A1E = AbstractC166987dD.A1E();
        if (z2) {
            if (A1a) {
                A1E.add(new YS5(omt.A01()));
            }
            A1E.add(new C70489WYw(omt, c54507O6k));
        }
        if (z3) {
            A1E.add(new Object());
        }
        if (AbstractC25226BEj.A1b(A1E)) {
            return new C70483WYo(x9t, A1E);
        }
        return x9t;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0010 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.util.List A0D(android.content.Context r5, X.C47Z r6) {
        /*
            java.util.ArrayList r3 = X.AbstractC166987dD.A1E()
            X.5Kt r0 = r6.A1P
            if (r0 == 0) goto L3b
            java.util.List r0 = r0.A03
            if (r0 == 0) goto L3b
            java.util.Iterator r4 = r0.iterator()
        L10:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L3b
            java.lang.Object r2 = r4.next()
            X.5Ks r2 = (X.C115585Ks) r2
            java.lang.Integer r1 = r2.A00
            java.lang.Integer r0 = X.C05F.A00
            if (r1 != r0) goto L32
            X.9nQ r2 = (X.C219789nQ) r2
            X.8gS r0 = r2.A00
            if (r0 == 0) goto L10
            X.AbH r0 = r0.A00(r5)
        L2c:
            if (r0 == 0) goto L10
            r3.add(r0)
            goto L10
        L32:
            java.lang.Integer r0 = X.C05F.A01
            if (r1 != r0) goto L10
            X.9nP r2 = (X.C219779nP) r2
            X.8bb r0 = r2.A00
            goto L2c
        L3b:
            X.47v r0 = r6.A1V
            java.util.List r0 = r0.A03
            java.util.Iterator r1 = r0.iterator()
        L43:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L57
            java.lang.Object r0 = r1.next()
            X.5JH r0 = (X.C5JH) r0
            com.facebook.videolite.transcoder.base.composition.MediaEffect r0 = r0.A09
            if (r0 == 0) goto L43
            r3.add(r0)
            goto L43
        L57:
            java.util.List r0 = X.AbstractC001800i.A0a(r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C55227Oew.A0D(android.content.Context, X.47Z):java.util.List");
    }
}
