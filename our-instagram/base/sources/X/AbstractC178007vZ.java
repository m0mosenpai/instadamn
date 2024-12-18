package X;

import android.content.Context;
import android.database.Cursor;
import android.provider.MediaStore;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import com.instagram.common.gallery.Medium;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.sandboxselector.DevServerEntity;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;

/* renamed from: X.7vZ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC178007vZ {
    /* JADX WARN: Type inference failed for: r0v4, types: [X.0bW, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v5, types: [X.0bW, java.lang.Object] */
    public static final AbstractC224309vG A00(Context context, UserSession userSession, String str, boolean z) {
        String str2;
        String str3;
        Cursor A01;
        C14360o3.A0B(userSession, 2);
        if (str != null && str.length() != 0) {
            if (z) {
                String A07 = C197098ne.A07(str);
                if (A07.length() <= 0) {
                    A07 = C197098ne.A06(str);
                }
                return A01(userSession, A07, C16930sl.A00);
            }
            android.net.Uri A00 = AbstractC08820cl.A00(new Object(), str);
            if (A00 != null) {
                try {
                    MYB AUI = new C66013Ty9(VYI.A00).AUI(A00);
                    C14360o3.A07(AUI);
                    str2 = AUI.A0E;
                } catch (IOException e) {
                    C0K8.A0F("MediaMetadataUtils", "exception occurred when reading video metadata", e);
                    str2 = null;
                }
            } else {
                str2 = null;
            }
            android.net.Uri A002 = AbstractC08820cl.A00(new Object(), str);
            if (A002 != null) {
                str3 = C9NG.A00(A002);
            } else {
                str3 = null;
            }
            String str4 = "";
            if (context != null) {
                try {
                    android.net.Uri contentUri = MediaStore.Video.Media.getContentUri("external");
                    String str5 = null;
                    if (contentUri != null && (A01 = C0fI.A01(context.getContentResolver(), contentUri, "_data=?", null, AbstractC209219Nd.A00, new String[]{str}, -1427303013)) != null) {
                        try {
                            if (A01.getCount() == 0) {
                                A01.close();
                            } else {
                                A01.moveToFirst();
                                int columnIndex = A01.getColumnIndex(DevServerEntity.COLUMN_DESCRIPTION);
                                if (columnIndex > 0) {
                                    str5 = A01.getString(columnIndex);
                                }
                                A01.close();
                                if (str5 != null) {
                                    str4 = str5;
                                }
                            }
                        } catch (Throwable th) {
                            try {
                                throw th;
                            } catch (Throwable th2) {
                                C20I.A00(A01, th);
                                throw th2;
                            }
                        }
                    }
                } catch (IllegalStateException | SecurityException | UnsupportedOperationException unused) {
                }
            }
            String[] strArr = {str4, str2, str3};
            C14360o3.A0B(strArr, 0);
            return A01(userSession, "", AbstractC009903n.A0I(strArr));
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:103:0x00ee, code lost:
    
        if (r3 == false) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x007b, code lost:
    
        r5 = r11.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0083, code lost:
    
        if (r5.hasNext() == false) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0085, code lost:
    
        r2 = (java.lang.String) r5.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x008b, code lost:
    
        if (r2 == null) goto L138;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0093, code lost:
    
        if (X.AbstractC001900j.A0a(r2, "greatwhite", true) == true) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x009c, code lost:
    
        if (X.AbstractC001900j.A0a(r2, "com.facebook.greatwhite", false) != true) goto L139;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x00a0, code lost:
    
        return X.C221659qU.A00;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0021, code lost:
    
        if (r11.isEmpty() != false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x00a1, code lost:
    
        if (r3 == false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x005f, code lost:
    
        r1 = r11.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0067, code lost:
    
        if (r1.hasNext() == false) goto L141;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x0073, code lost:
    
        if (X.C9NU.A00(r9, (java.lang.String) r1.next()) == false) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x0077, code lost:
    
        return X.C9NU.A02;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x0078, code lost:
    
        if (r3 == false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0027, code lost:
    
        if (r11.isEmpty() == false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x005c, code lost:
    
        if (r3 != false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002d, code lost:
    
        if (r11.isEmpty() == false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0033, code lost:
    
        if (r11.isEmpty() == false) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0039, code lost:
    
        if (r11.isEmpty() == false) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x003f, code lost:
    
        if (r11.isEmpty() == false) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0041, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0152, code lost:
    
        r3 = r11.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x015a, code lost:
    
        if (r3.hasNext() == false) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x015c, code lost:
    
        r2 = (java.lang.String) r3.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0162, code lost:
    
        if (r2 == null) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x016b, code lost:
    
        if (X.AbstractC001900j.A0a(r2, "com.facebook.horizon", false) != true) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x016f, code lost:
    
        return X.C221669qV.A00;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x010f, code lost:
    
        r7 = r11.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0117, code lost:
    
        if (r7.hasNext() == false) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0119, code lost:
    
        r5 = (java.lang.String) r7.next();
        r2 = X.C221679qW.A00;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x012d, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, r9, 36316310719697129L) == false) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x012f, code lost:
    
        if (r5 == null) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0137, code lost:
    
        if (X.AbstractC001900j.A0a(r5, "mos_version", false) != false) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:?, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x013f, code lost:
    
        if (X.C14360o3.A0K(r5, "Merlot") != false) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x014b, code lost:
    
        if (X.C14360o3.A0K(r5, X.MSV.A00(416)) == false) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x014d, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:?, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x014e, code lost:
    
        if (r3 == false) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00f2, code lost:
    
        r1 = r11.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00fa, code lost:
    
        if (r1.hasNext() == false) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0106, code lost:
    
        if (X.C9NT.A00((java.lang.String) r1.next()) == false) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x010a, code lost:
    
        return X.C9NT.A01;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x010b, code lost:
    
        if (r3 == false) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x00a4, code lost:
    
        r8 = r11.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x00ac, code lost:
    
        if (r8.hasNext() == false) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x00ae, code lost:
    
        r5 = (java.lang.String) r8.next();
        r2 = X.C221689qX.A00;
        r6 = X.C06090Tz.A05;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x00c2, code lost:
    
        if (X.C18U.A06(r6, r9, 36331162716685509L) == false) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x00c4, code lost:
    
        if (r5 == null) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x00cc, code lost:
    
        if (X.AbstractC001900j.A0a(r5, "com.facebook.mako", false) == true) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x00d4, code lost:
    
        if (X.AbstractC001900j.A0a(r5, "Mako", true) == true) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x00dc, code lost:
    
        if (X.AbstractC001900j.A0a(r5, "Mako | Meta", true) == true) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x00eb, code lost:
    
        if (X.AbstractC001900j.A0a(r5, X.C18U.A04(r6, r9, 36894112670024681L), false) != true) goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x00ed, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:?, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:?, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:?, code lost:
    
        return r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.AbstractC224309vG A01(X.AbstractC12990ll r9, java.lang.String r10, java.util.List r11) {
        /*
            Method dump skipped, instructions count: 368
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC178007vZ.A01(X.0ll, java.lang.String, java.util.List):X.9vG");
    }

    public static final String A02(AbstractC12990ll abstractC12990ll, String str, List list) {
        C14360o3.A0B(list, 1);
        AbstractC224309vG A01 = A01(abstractC12990ll, str, list);
        if (A01 != null) {
            return A01.A02();
        }
        return "";
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.0bW, java.lang.Object] */
    public static final String A03(String str) {
        String str2;
        C14360o3.A0B(str, 0);
        android.net.Uri A00 = AbstractC08820cl.A00(new Object(), str);
        if (A00 != null) {
            str2 = C9NG.A00(A00);
        } else {
            str2 = null;
        }
        return A04(str2);
    }

    public static final boolean A06(UserSession userSession, String str) {
        C14360o3.A0B(userSession, 0);
        AbstractC224309vG A01 = A01(userSession, str, C16930sl.A00);
        if (A01 != null && A01.A04() && C18U.A06(C06090Tz.A05, userSession, 36329191326695547L)) {
            return true;
        }
        return false;
    }

    public static final String A04(String str) {
        List A1Q;
        if (str != null) {
            List<String> A0R = AbstractC001900j.A0R(str, new String[]{"&"}, 0);
            int A0L = AbstractC16850sd.A0L(AbstractC06950Ym.A1E(A0R, 10));
            if (A0L < 16) {
                A0L = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(A0L);
            for (String str2 : A0R) {
                if (AbstractC001900j.A0R(str2, new String[]{InbandTelemetryBweEstimate.KEY_VALUE_SEPARATOR}, 0).size() == 2) {
                    A1Q = AbstractC001900j.A0R(str2, new String[]{InbandTelemetryBweEstimate.KEY_VALUE_SEPARATOR}, 0);
                } else {
                    A1Q = AbstractC16960so.A1Q("", "");
                }
                linkedHashMap.put(A1Q.get(0), A1Q.get(1));
            }
            String str3 = (String) linkedHashMap.get("gid");
            if (str3 != null) {
                return str3;
            }
        }
        return "";
    }

    public static final void A05(final Medium medium, final UserSession userSession, final InterfaceC16660sJ interfaceC16660sJ) {
        try {
            C14120nc.A00().ATO(new AbstractRunnableC14200nk() { // from class: X.9jG
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(112306439, 3, false, false);
                }

                /* JADX WARN: Code restructure failed: missing block: B:4:0x0011, code lost:
                
                    if (r0.A05() == true) goto L6;
                 */
                /* JADX WARN: Type inference failed for: r4v0, types: [X.0ps, java.lang.Object] */
                @Override // java.lang.Runnable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void run() {
                    /*
                        r5 = this;
                        X.0ps r4 = new X.0ps
                        r4.<init>()
                        com.instagram.common.gallery.Medium r0 = com.instagram.common.gallery.Medium.this
                        r3 = 0
                        if (r0 == 0) goto L2c
                        java.lang.String r2 = r0.A0X
                        r1 = 1
                        boolean r0 = r0.A05()
                        if (r0 != r1) goto L2d
                    L13:
                        com.instagram.common.session.UserSession r0 = r5
                        X.9vG r0 = X.AbstractC178007vZ.A00(r3, r0, r2, r1)
                        if (r0 == 0) goto L1f
                        java.lang.String r3 = r0.A02()
                    L1f:
                        r4.A00 = r3
                        X.0sJ r1 = r6
                        X.Awp r0 = new X.Awp
                        r0.<init>(r1, r4)
                        X.C11T.A02(r0)
                        return
                    L2c:
                        r2 = r3
                    L2d:
                        r1 = 0
                        goto L13
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C217219jG.run():void");
                }
            });
        } catch (OutOfMemoryError unused) {
            interfaceC16660sJ.invoke(null);
        }
    }
}
