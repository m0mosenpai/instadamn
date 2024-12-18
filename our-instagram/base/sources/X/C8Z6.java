package X;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.tigon.tigonhuc.HucClient;
import com.instagram.common.gallery.Medium;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;

/* renamed from: X.8Z6, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8Z6 implements Callable {
    public static final String[] A0E = {"_id", "image_id", "_data"};
    public static final String[] A0F = {"_id", "video_id", "_data"};
    public final int A00;
    public final int A01;
    public final int A02;
    public final long A03;
    public final long A04;
    public final ContentResolver A05;
    public final Context A06;
    public final InterfaceC189048Yu A07;
    public final EnumC188968Ym A08;
    public final C18340vL A09;
    public final C188998Yp A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final UserSession A0D;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || !C14360o3.A0K(obj.getClass(), getClass())) {
                return false;
            }
            C8Z6 c8z6 = (C8Z6) obj;
            if (!C2I7.A00(this.A08, c8z6.A08) || !C2I7.A00(Integer.valueOf(this.A01), Integer.valueOf(c8z6.A01)) || !C2I7.A00(Integer.valueOf(this.A02), Integer.valueOf(c8z6.A02)) || !C2I7.A00(Boolean.valueOf(this.A0C), Boolean.valueOf(c8z6.A0C)) || !C2I7.A00(Long.valueOf(this.A04), Long.valueOf(c8z6.A04)) || !C2I7.A00(Long.valueOf(this.A03), Long.valueOf(c8z6.A03)) || !C2I7.A00(this.A0A, c8z6.A0A) || !C2I7.A00(this.A07, c8z6.A07) || !C2I7.A00(Boolean.valueOf(this.A0B), Boolean.valueOf(c8z6.A0B))) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        C14160ng c14160ng;
        Object obj;
        ArrayList arrayList = new ArrayList();
        C14160ng c14160ng2 = new C14160ng(new Callable() { // from class: X.8Zu
            @Override // java.util.concurrent.Callable
            public final /* bridge */ /* synthetic */ Object call() {
                C8Z6 c8z6 = C8Z6.this;
                ContentResolver contentResolver = c8z6.A05;
                int i = c8z6.A01;
                boolean z = c8z6.A0C;
                EnumC188968Ym enumC188968Ym = c8z6.A08;
                int i2 = c8z6.A02;
                long j = c8z6.A04;
                long j2 = c8z6.A03;
                boolean z2 = c8z6.A0B;
                return C8a1.A01(contentResolver, enumC188968Ym, C16930sl.A00, i, -1, i2, c8z6.A00, j, j2, z, z2);
            }
        }, 830910367, 3, false, true);
        C14160ng c14160ng3 = new C14160ng(new Callable() { // from class: X.8Zv
            /* JADX WARN: Code restructure failed: missing block: B:22:0x0065, code lost:
            
                if (r9 != null) goto L28;
             */
            /* JADX WARN: Code restructure failed: missing block: B:24:0x005f, code lost:
            
                if (r9 == null) goto L31;
             */
            @Override // java.util.concurrent.Callable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final /* bridge */ /* synthetic */ java.lang.Object call() {
                /*
                    r11 = this;
                    X.8Z6 r0 = X.C8Z6.this
                    java.util.HashMap r4 = new java.util.HashMap
                    r4.<init>()
                    android.net.Uri r6 = android.provider.MediaStore.Images.Thumbnails.EXTERNAL_CONTENT_URI
                    if (r6 == 0) goto L71
                    android.content.Context r0 = r0.A06
                    android.content.ContentProviderClient r5 = X.AbstractC15910ql.A00(r0, r6)
                    if (r5 == 0) goto L70
                    java.lang.String r8 = "kind = 1"
                    java.lang.String r10 = "image_id DESC"
                    r9 = 0
                    java.lang.String[] r7 = X.C8Z6.A0E     // Catch: java.lang.Throwable -> L4c android.os.RemoteException -> L5c
                    android.database.Cursor r9 = r5.query(r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L4c android.os.RemoteException -> L5c
                    if (r9 == 0) goto L62
                    int r0 = r9.getCount()     // Catch: java.lang.Throwable -> L4c android.os.RemoteException -> L5c
                    if (r0 == 0) goto L62
                    java.lang.String r0 = "image_id"
                    int r3 = r9.getColumnIndex(r0)     // Catch: java.lang.Throwable -> L4c android.os.RemoteException -> L5c
                    java.lang.String r0 = "_data"
                    int r2 = r9.getColumnIndex(r0)     // Catch: java.lang.Throwable -> L4c android.os.RemoteException -> L5c
                L32:
                    boolean r0 = r9.moveToNext()     // Catch: java.lang.Throwable -> L4c android.os.RemoteException -> L5c
                    if (r0 == 0) goto L48
                    int r0 = r9.getInt(r3)     // Catch: java.lang.Throwable -> L4c android.os.RemoteException -> L5c
                    java.lang.Integer r1 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> L4c android.os.RemoteException -> L5c
                    java.lang.String r0 = r9.getString(r2)     // Catch: java.lang.Throwable -> L4c android.os.RemoteException -> L5c
                    r4.put(r1, r0)     // Catch: java.lang.Throwable -> L4c android.os.RemoteException -> L5c
                    goto L32
                L48:
                    r5.release()
                    goto L67
                L4c:
                    r1 = move-exception
                    r5.release()
                    if (r9 == 0) goto L5b
                    boolean r0 = r9.isClosed()
                    if (r0 != 0) goto L5b
                    r9.close()
                L5b:
                    throw r1
                L5c:
                    r5.release()
                    if (r9 == 0) goto L70
                    goto L67
                L62:
                    r5.release()
                    if (r9 == 0) goto L70
                L67:
                    boolean r0 = r9.isClosed()
                    if (r0 != 0) goto L70
                    r9.close()
                L70:
                    return r4
                L71:
                    java.lang.String r0 = "Required value was null."
                    java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                    r1.<init>(r0)
                    throw r1
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C8Zv.call():java.lang.Object");
            }
        }, 7019180, 3, false, true);
        C14160ng c14160ng4 = new C14160ng(new Callable() { // from class: X.8Zx
            /* JADX WARN: Code restructure failed: missing block: B:22:0x0065, code lost:
            
                if (r9 != null) goto L28;
             */
            /* JADX WARN: Code restructure failed: missing block: B:24:0x005f, code lost:
            
                if (r9 == null) goto L31;
             */
            @Override // java.util.concurrent.Callable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final /* bridge */ /* synthetic */ java.lang.Object call() {
                /*
                    r11 = this;
                    X.8Z6 r0 = X.C8Z6.this
                    java.util.HashMap r4 = new java.util.HashMap
                    r4.<init>()
                    android.net.Uri r6 = android.provider.MediaStore.Video.Thumbnails.EXTERNAL_CONTENT_URI
                    if (r6 == 0) goto L71
                    android.content.Context r0 = r0.A06
                    android.content.ContentProviderClient r5 = X.AbstractC15910ql.A00(r0, r6)
                    if (r5 == 0) goto L70
                    java.lang.String r8 = "kind = 1"
                    java.lang.String r10 = "video_id DESC"
                    r9 = 0
                    java.lang.String[] r7 = X.C8Z6.A0F     // Catch: java.lang.Throwable -> L4c android.os.RemoteException -> L5c
                    android.database.Cursor r9 = r5.query(r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L4c android.os.RemoteException -> L5c
                    if (r9 == 0) goto L62
                    int r0 = r9.getCount()     // Catch: java.lang.Throwable -> L4c android.os.RemoteException -> L5c
                    if (r0 == 0) goto L62
                    java.lang.String r0 = "video_id"
                    int r3 = r9.getColumnIndex(r0)     // Catch: java.lang.Throwable -> L4c android.os.RemoteException -> L5c
                    java.lang.String r0 = "_data"
                    int r2 = r9.getColumnIndex(r0)     // Catch: java.lang.Throwable -> L4c android.os.RemoteException -> L5c
                L32:
                    boolean r0 = r9.moveToNext()     // Catch: java.lang.Throwable -> L4c android.os.RemoteException -> L5c
                    if (r0 == 0) goto L48
                    int r0 = r9.getInt(r3)     // Catch: java.lang.Throwable -> L4c android.os.RemoteException -> L5c
                    java.lang.Integer r1 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> L4c android.os.RemoteException -> L5c
                    java.lang.String r0 = r9.getString(r2)     // Catch: java.lang.Throwable -> L4c android.os.RemoteException -> L5c
                    r4.put(r1, r0)     // Catch: java.lang.Throwable -> L4c android.os.RemoteException -> L5c
                    goto L32
                L48:
                    r5.release()
                    goto L67
                L4c:
                    r1 = move-exception
                    r5.release()
                    if (r9 == 0) goto L5b
                    boolean r0 = r9.isClosed()
                    if (r0 != 0) goto L5b
                    r9.close()
                L5b:
                    throw r1
                L5c:
                    r5.release()
                    if (r9 == 0) goto L70
                    goto L67
                L62:
                    r5.release()
                    if (r9 == 0) goto L70
                L67:
                    boolean r0 = r9.isClosed()
                    if (r0 != 0) goto L70
                    r9.close()
                L70:
                    return r4
                L71:
                    java.lang.String r0 = "Required value was null."
                    java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                    r1.<init>(r0)
                    throw r1
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C8Zx.call():java.lang.Object");
            }
        }, 927232334, 3, false, true);
        final C188998Yp c188998Yp = this.A0A;
        Object obj2 = null;
        if (c188998Yp != null) {
            c14160ng = new C14160ng(new Callable() { // from class: X.8Zy
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    Map A0E2;
                    C189268a2 c189268a2 = new C189268a2(C188998Yp.this.A00);
                    try {
                        try {
                            InterfaceC37481ol CHx = c189268a2.A00.CHx();
                            C14360o3.A0B(CHx, 1);
                            ArrayList arrayList2 = new ArrayList();
                            try {
                                String[] strArr = {PublicKeyCredentialControllerUtility.JSON_KEY_ID, "scanner_versions", "feature_name", "locality", "sub_admin_area", "admin_area", "country_name", "ocn_score", "ocv_score", "person_score", "food_score", "pet_score", "nature_score", "landmark_score", "aesthetic_score", "blur_score", "plant_score", "sports_score", "vehicle_score", "water_score", "outdoors_score", "event_score", "document_score"};
                                StringBuilder sb = new StringBuilder(HucClient.BODY_UPLOAD_TIMEOUT_SECONDS);
                                sb.append("SELECT ");
                                int i = 0;
                                do {
                                    String str = strArr[i];
                                    if (i > 0) {
                                        sb.append(", ");
                                    }
                                    sb.append(str);
                                    i++;
                                } while (i < 23);
                                sb.append(' ');
                                sb.append("FROM ");
                                sb.append("gallery_media_metadata");
                                String obj3 = sb.toString();
                                C14360o3.A07(obj3);
                                Cursor E7N = CHx.E7N(new C37491om(obj3, null));
                                while (E7N.moveToNext()) {
                                    try {
                                        arrayList2.add(AbstractC189318a8.A00(E7N));
                                    } finally {
                                    }
                                }
                                E7N.close();
                            } catch (RuntimeException e) {
                                C0w9.A07("GalleryMediaMetadataDatabaseAccessHelper#fetchAll", e);
                            }
                            int A0L = AbstractC16850sd.A0L(AbstractC06950Ym.A1E(arrayList2, 10));
                            if (A0L < 16) {
                                A0L = 16;
                            }
                            A0E2 = new LinkedHashMap(A0L);
                            Iterator it = arrayList2.iterator();
                            while (it.hasNext()) {
                                Object next = it.next();
                                String str2 = ((C189328a9) next).A0L;
                                if (str2 != null) {
                                    A0E2.put(str2, next);
                                } else {
                                    throw new IllegalStateException("Required value was null.");
                                }
                            }
                        } catch (Exception e2) {
                            C0K8.A0F(AbstractC111324zv.A00(1637), "Prepare failed", e2);
                            A0E2 = AbstractC06930Yk.A0E();
                        }
                        return A0E2;
                    } finally {
                        c189268a2.A00.close();
                    }
                }
            }, 852694716, 3, false, true);
        } else {
            c14160ng = null;
        }
        C18340vL c18340vL = this.A09;
        c18340vL.ATN(c14160ng2);
        c18340vL.ATN(c14160ng3);
        c18340vL.ATN(c14160ng4);
        if (c14160ng != null) {
            c18340vL.ATN(c14160ng);
        }
        try {
            Object obj3 = c14160ng2.get();
            C14360o3.A07(obj3);
            List<Medium> list = (List) obj3;
            Object obj4 = c14160ng3.get();
            C14360o3.A07(obj4);
            Map map = (Map) obj4;
            Object obj5 = c14160ng4.get();
            C14360o3.A07(obj5);
            Map map2 = (Map) obj5;
            if (c14160ng != null) {
                obj2 = c14160ng.get();
            }
            for (Medium medium : list) {
                int i = medium.A08;
                Integer valueOf = Integer.valueOf(medium.A05);
                if (i == 3) {
                    obj = map2.get(valueOf);
                } else {
                    obj = map.get(valueOf);
                }
                medium.A0a = (String) obj;
                InterfaceC189048Yu interfaceC189048Yu = this.A07;
                if (interfaceC189048Yu == null || interfaceC189048Yu.CfT(medium)) {
                    arrayList.add(medium);
                }
                if (obj2 != null) {
                    if (c188998Yp != null) {
                        C188998Yp.A00(medium, (Map) obj2);
                    } else {
                        throw new IllegalStateException("Required value was null.");
                    }
                }
            }
            return new C189368aD(arrayList, this.A01);
        } catch (InterruptedException | ExecutionException e) {
            C0w9.A06("GalleryLoaderCallable", "failed to load recent captures", e);
            throw e;
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A08, Integer.valueOf(this.A01), Integer.valueOf(this.A02), Boolean.valueOf(this.A0C), Long.valueOf(this.A04), Long.valueOf(this.A03), this.A0A, this.A07, Boolean.valueOf(this.A0B)});
    }

    public C8Z6(Context context, InterfaceC189048Yu interfaceC189048Yu, EnumC188968Ym enumC188968Ym, UserSession userSession, C188998Yp c188998Yp, int i, int i2, int i3, long j, long j2, boolean z, boolean z2) {
        this.A0D = userSession;
        this.A06 = context;
        this.A00 = i3;
        ContentResolver contentResolver = context.getContentResolver();
        C14360o3.A07(contentResolver);
        this.A05 = contentResolver;
        this.A08 = enumC188968Ym;
        this.A01 = i;
        this.A02 = i2;
        this.A0C = z;
        this.A04 = j;
        this.A03 = j2;
        this.A07 = interfaceC189048Yu;
        this.A0A = c188998Yp;
        this.A0B = z2;
        this.A09 = new C18340vL(C14120nc.A00(), 4);
    }
}
