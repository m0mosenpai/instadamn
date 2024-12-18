package X;

import android.app.ActivityThread;
import android.os.Binder;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.common.activitythreadhook.ActivityThreadBinderHooker$ApplicationThreadBinderHook;
import com.facebook.common.activitythreadhook.IApplicationThreadFactory;
import com.facebook.common.binderhooker.BinderHook;
import java.lang.ref.WeakReference;

/* renamed from: X.0Cy, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0Cy {
    public static ActivityThread A0A;
    public static Binder A0B;
    public static C0Cy A0C;
    public static C0IZ A0D;
    public static final C03720In A0E;
    public static final Object A0F;
    public static volatile boolean A0G;
    public static volatile boolean A0H;
    public BinderHook A00;
    public final ActivityThreadBinderHooker$ApplicationThreadBinderHook A02;
    public final C05390Qn A03;
    public final IApplicationThreadFactory A04;
    public final C0Cz A05;
    public final C0D6 A06;
    public final C0D8 A07;
    public final C0H5 A08;
    public final Object A09 = new Object();
    public boolean A01 = false;

    /* JADX WARN: Type inference failed for: r1v0, types: [X.0Qn] */
    public C0Cy(C0Cz c0Cz, C0D6 c0d6, C0H5 c0h5) {
        this.A08 = c0h5;
        this.A05 = c0Cz;
        this.A06 = c0d6;
        C0D8 c0d8 = new C0D8(c0Cz, c0h5);
        this.A07 = c0d8;
        IApplicationThreadFactory iApplicationThreadFactory = IApplicationThreadFactory.A05;
        if (iApplicationThreadFactory == null) {
            synchronized (IApplicationThreadFactory.A04) {
                if (IApplicationThreadFactory.A05 != null) {
                    iApplicationThreadFactory = IApplicationThreadFactory.A05;
                } else {
                    IApplicationThreadFactory.A05 = new IApplicationThreadFactory(c0h5);
                    iApplicationThreadFactory = IApplicationThreadFactory.A05;
                }
            }
        }
        iApplicationThreadFactory.getClass();
        this.A04 = iApplicationThreadFactory;
        ?? r1 = new C0DC(this, c0Cz, c0d6, c0d8, c0h5) { // from class: X.0Qn
            public final C0Cy A00;
            public final C0D6 A01;

            {
                this.A00 = this;
                this.A01 = c0d6;
            }

            @Override // X.C0DC
            public final /* bridge */ /* synthetic */ Parcelable A00(Object obj) {
                Parcel parcel = (Parcel) obj;
                C0D6 c0d62 = this.A01;
                if (c0d62 == null) {
                    return null;
                }
                return c0d62.A01(parcel);
            }

            @Override // X.C0DC
            public final /* bridge */ /* synthetic */ boolean A02(AbstractC05460Qv abstractC05460Qv, EnumC05430Qs enumC05430Qs, int i) {
                return this.A00.A01();
            }

            @Override // X.C0DC
            public final /* bridge */ /* synthetic */ boolean A04(AbstractC05380Qm abstractC05380Qm, Object obj) {
                WeakReference weakReference;
                C0J8.A06(!abstractC05380Qm.A0A);
                if (obj != null) {
                    weakReference = new WeakReference(obj);
                } else {
                    weakReference = null;
                }
                abstractC05380Qm.A09 = weakReference;
                abstractC05380Qm.A0B = true;
                return true;
            }
        };
        this.A03 = r1;
        this.A02 = new ActivityThreadBinderHooker$ApplicationThreadBinderHook(r1);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0082  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C0Cy A00(int r8, boolean r9) {
        /*
            r3 = 0
            boolean r0 = X.C0Cy.A0H
            if (r0 == 0) goto L8
            X.0Cy r0 = X.C0Cy.A0C
            return r0
        L8:
            X.0H5 r7 = X.C0H5.A01(r3, r8, r9)
            r8 = 0
            X.0Cz r6 = X.C0Cz.A00(r7)
            X.0D6 r5 = X.C0D6.A00(r7)
            java.lang.Object r9 = X.C0Cy.A0F
            monitor-enter(r9)
            boolean r0 = X.C0Cy.A0H     // Catch: java.lang.Throwable -> L94
            if (r0 != 0) goto L90
            r0 = 1
            if (r5 != 0) goto L20
            r0 = 0
        L20:
            r4 = 1
            if (r0 == 0) goto L84
            if (r6 == 0) goto L84
            boolean r0 = X.C0D2.A00     // Catch: java.lang.Throwable -> L94
            if (r0 != 0) goto L3b
            X.0In r2 = X.C0Cy.A0E     // Catch: java.lang.Throwable -> L94
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L94
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> L94
            java.lang.Object[] r1 = new java.lang.Object[]{r0}     // Catch: java.lang.Throwable -> L94
            java.lang.String r0 = "Android %d is not currently supported"
        L37:
            r2.A08(r0, r1)     // Catch: java.lang.Throwable -> L94
            goto L7b
        L3b:
            android.app.ActivityThread r2 = X.C0Cu.A00()     // Catch: java.lang.Throwable -> L94
            X.C0Cy.A0A = r2     // Catch: java.lang.Throwable -> L94
            if (r2 != 0) goto L4a
            X.0In r2 = X.C0Cy.A0E     // Catch: java.lang.Throwable -> L94
            java.lang.Object[] r1 = new java.lang.Object[r8]     // Catch: java.lang.Throwable -> L94
            java.lang.String r0 = "Could not find ActivityThread"
            goto L37
        L4a:
            java.lang.Class r1 = r2.getClass()     // Catch: java.lang.Throwable -> L94
            java.lang.String r0 = "mAppThread"
            java.lang.reflect.Field r0 = X.C0H5.A05(r3, r1, r3, r0)     // Catch: java.lang.Exception -> L71 java.lang.Throwable -> L94
            if (r0 == 0) goto L5a
            r0.setAccessible(r4)     // Catch: java.lang.Exception -> L71 java.lang.Throwable -> L94
        L5a:
            java.lang.Object r0 = r0.get(r2)     // Catch: java.lang.Exception -> L71 java.lang.Throwable -> L94
            android.os.Binder r0 = (android.os.Binder) r0     // Catch: java.lang.Exception -> L71 java.lang.Throwable -> L94
            if (r0 != 0) goto L6c
            X.0In r2 = X.C0Cy.A0E     // Catch: java.lang.Exception -> L71 java.lang.Throwable -> L94
            java.lang.String r1 = "Got a null ActivityThread Binder mAppThread."
            java.lang.Object[] r0 = new java.lang.Object[r8]     // Catch: java.lang.Exception -> L71 java.lang.Throwable -> L94
            r2.A08(r1, r0)     // Catch: java.lang.Exception -> L71 java.lang.Throwable -> L94
            goto L7b
        L6c:
            X.C0Cy.A0B = r0     // Catch: java.lang.Exception -> L71 java.lang.Throwable -> L94
            r1 = 1
            r0 = 0
            goto L7d
        L71:
            r3 = move-exception
            X.0In r2 = X.C0Cy.A0E     // Catch: java.lang.Throwable -> L94
            java.lang.Object[] r1 = new java.lang.Object[r8]     // Catch: java.lang.Throwable -> L94
            java.lang.String r0 = "Could not get ActivityThread Binder mAppThread"
            r2.A0C(r3, r0, r1)     // Catch: java.lang.Throwable -> L94
        L7b:
            r1 = 0
            r0 = 1
        L7d:
            X.C0Cy.A0G = r0     // Catch: java.lang.Throwable -> L94
            if (r1 == 0) goto L82
            goto L87
        L82:
            r0 = 0
            goto L8c
        L84:
            X.C0Cy.A0G = r4     // Catch: java.lang.Throwable -> L94
            goto L8e
        L87:
            X.0Cy r0 = new X.0Cy     // Catch: java.lang.Throwable -> L94
            r0.<init>(r6, r5, r7)     // Catch: java.lang.Throwable -> L94
        L8c:
            X.C0Cy.A0C = r0     // Catch: java.lang.Throwable -> L94
        L8e:
            X.C0Cy.A0H = r4     // Catch: java.lang.Throwable -> L94
        L90:
            X.0Cy r0 = X.C0Cy.A0C     // Catch: java.lang.Throwable -> L94
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L94
            return r0
        L94:
            r0 = move-exception
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L94
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0Cy.A00(int, boolean):X.0Cy");
    }

    static {
        C03720In c03720In = new C03720In("ActivityThreadBinderHooker");
        A0E = c03720In;
        A0F = new Object();
        C0IZ c0iz = c03720In.A00;
        if (c0iz == null) {
            synchronized (c03720In) {
                c0iz = c03720In.A00;
                if (c0iz == null) {
                    c0iz = new C0IZ(c03720In.A01);
                    c03720In.A00 = c0iz;
                }
            }
        }
        A0D = c0iz;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0021, code lost:
    
        if (r0.isHooked() == false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0080, code lost:
    
        if (r0 != null) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x016f, code lost:
    
        if (r0.isHooked() == false) goto L76;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:49:0x015a A[Catch: all -> 0x01a5, TryCatch #0 {, blocks: (B:13:0x0014, B:15:0x0018, B:17:0x001c, B:19:0x018b, B:22:0x0026, B:24:0x002d, B:26:0x0031, B:29:0x003c, B:31:0x0051, B:33:0x005b, B:35:0x0069, B:37:0x0076, B:39:0x0082, B:40:0x0195, B:41:0x01a4, B:45:0x0140, B:46:0x014d, B:47:0x0154, B:49:0x015a, B:50:0x0166, B:52:0x016a, B:55:0x0174, B:57:0x0183, B:62:0x008d, B:64:0x00a5, B:66:0x00ad, B:68:0x00b3, B:70:0x00b8, B:71:0x00c1, B:73:0x00cf, B:74:0x00d3, B:77:0x00eb, B:79:0x00fb, B:80:0x010e, B:83:0x0121, B:84:0x0130, B:85:0x0111, B:88:0x0132, B:89:0x015e, B:90:0x018d), top: B:12:0x0014, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x016a A[Catch: all -> 0x01a5, TryCatch #0 {, blocks: (B:13:0x0014, B:15:0x0018, B:17:0x001c, B:19:0x018b, B:22:0x0026, B:24:0x002d, B:26:0x0031, B:29:0x003c, B:31:0x0051, B:33:0x005b, B:35:0x0069, B:37:0x0076, B:39:0x0082, B:40:0x0195, B:41:0x01a4, B:45:0x0140, B:46:0x014d, B:47:0x0154, B:49:0x015a, B:50:0x0166, B:52:0x016a, B:55:0x0174, B:57:0x0183, B:62:0x008d, B:64:0x00a5, B:66:0x00ad, B:68:0x00b3, B:70:0x00b8, B:71:0x00c1, B:73:0x00cf, B:74:0x00d3, B:77:0x00eb, B:79:0x00fb, B:80:0x010e, B:83:0x0121, B:84:0x0130, B:85:0x0111, B:88:0x0132, B:89:0x015e, B:90:0x018d), top: B:12:0x0014, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0174 A[Catch: all -> 0x01a5, TryCatch #0 {, blocks: (B:13:0x0014, B:15:0x0018, B:17:0x001c, B:19:0x018b, B:22:0x0026, B:24:0x002d, B:26:0x0031, B:29:0x003c, B:31:0x0051, B:33:0x005b, B:35:0x0069, B:37:0x0076, B:39:0x0082, B:40:0x0195, B:41:0x01a4, B:45:0x0140, B:46:0x014d, B:47:0x0154, B:49:0x015a, B:50:0x0166, B:52:0x016a, B:55:0x0174, B:57:0x0183, B:62:0x008d, B:64:0x00a5, B:66:0x00ad, B:68:0x00b3, B:70:0x00b8, B:71:0x00c1, B:73:0x00cf, B:74:0x00d3, B:77:0x00eb, B:79:0x00fb, B:80:0x010e, B:83:0x0121, B:84:0x0130, B:85:0x0111, B:88:0x0132, B:89:0x015e, B:90:0x018d), top: B:12:0x0014, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0183 A[Catch: all -> 0x01a5, TryCatch #0 {, blocks: (B:13:0x0014, B:15:0x0018, B:17:0x001c, B:19:0x018b, B:22:0x0026, B:24:0x002d, B:26:0x0031, B:29:0x003c, B:31:0x0051, B:33:0x005b, B:35:0x0069, B:37:0x0076, B:39:0x0082, B:40:0x0195, B:41:0x01a4, B:45:0x0140, B:46:0x014d, B:47:0x0154, B:49:0x015a, B:50:0x0166, B:52:0x016a, B:55:0x0174, B:57:0x0183, B:62:0x008d, B:64:0x00a5, B:66:0x00ad, B:68:0x00b3, B:70:0x00b8, B:71:0x00c1, B:73:0x00cf, B:74:0x00d3, B:77:0x00eb, B:79:0x00fb, B:80:0x010e, B:83:0x0121, B:84:0x0130, B:85:0x0111, B:88:0x0132, B:89:0x015e, B:90:0x018d), top: B:12:0x0014, inners: #1 }] */
    /* JADX WARN: Type inference failed for: r3v7, types: [com.facebook.common.binderhooker.BinderHook, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A01() {
        /*
            Method dump skipped, instructions count: 424
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0Cy.A01():boolean");
    }
}
