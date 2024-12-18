package X;

import android.content.Context;
import android.os.SystemClock;
import android.util.SparseIntArray;
import com.facebook.quicklog.QuickPerformanceLogger;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: X.7wC, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC178387wC extends AbstractC178397wD {
    public static final SparseIntArray A05;
    public boolean A00;
    public final InterfaceC178427wG A01;
    public final Context A02;
    public volatile long A03;
    public volatile InterfaceC201488vd A04;

    @Override // X.InterfaceC178407wE
    public final void Ckt(int i, int i2) {
        long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        this.A01.onPostCaptureEvent(i, super.A03, ((AbstractC178397wD) this).A01, ((AbstractC178397wD) this).A00, 0);
        this.A03 += SystemClock.elapsedRealtimeNanos() - elapsedRealtimeNanos;
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray(12);
        sparseIntArray.put(7, 11272208);
        sparseIntArray.put(16, 11272224);
        sparseIntArray.put(17, 11272227);
        sparseIntArray.put(18, 11272228);
        sparseIntArray.put(19, 11272235);
        sparseIntArray.put(20, 11272236);
        sparseIntArray.put(21, 11276595);
        sparseIntArray.put(22, 11287468);
        sparseIntArray.put(24, 11283980);
        sparseIntArray.put(25, 11287836);
        sparseIntArray.put(26, 11275520);
        sparseIntArray.put(27, 11280956);
        sparseIntArray.put(28, 11276921);
        A05 = sparseIntArray;
    }

    public static int A02(int i) {
        int i2 = A05.get(i);
        if (i2 != 0) {
            return i2;
        }
        throw new IllegalArgumentException(AnonymousClass001.A0c("Event ", " is not part of FbCameraLogger.FbCameraEvent", 0));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x002e. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:5:0x0031 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int A03(java.lang.String r22, java.lang.String r23) {
        /*
            Method dump skipped, instructions count: 420
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC178387wC.A03(java.lang.String, java.lang.String):int");
    }

    @Override // X.InterfaceC178407wE
    public final InterfaceC201488vd BYr() {
        if (this.A04 == null) {
            synchronized (AbstractC178387wC.class) {
                if (this.A04 == null) {
                    this.A04 = this.A01.createOneCameraARXLogger();
                }
            }
        }
        return this.A04;
    }

    @Override // X.InterfaceC178407wE
    public final void Cwo(int i, String str, String str2) {
        this.A05.BjH().markerAnnotate(A02(i), str, str2);
    }

    @Override // X.InterfaceC178407wE
    public final void DEV(int i) {
        this.A05.BjH().markerEnd(A02(i), (short) 3);
    }

    @Override // X.InterfaceC178407wE
    public final void DEW(int i) {
        this.A05.BjH().markerEnd(A02(i), (short) 2);
    }

    @Override // X.InterfaceC178407wE
    public final void DEX(Map map, int i, long j) {
        map.put("product_name", ((AbstractC178397wD) this).A00);
        this.A05.BjH().markerGenerateWithAnnotations(A02(27), (short) 2, j, TimeUnit.NANOSECONDS, map);
    }

    @Override // X.InterfaceC178407wE
    public final void DEZ(int i, String str) {
        this.A05.BjH().markerPoint(A02(i), str);
    }

    @Override // X.InterfaceC178407wE
    public final void destroy() {
        if (this.A03 > 0) {
            this.A05.BjH().markerGenerate(11279864, (short) 2, this.A03, TimeUnit.NANOSECONDS);
            this.A03 = 0L;
        }
    }

    @Override // X.InterfaceC178407wE
    public final String getActiveSessionId() {
        return this.A01.getActiveSessionId();
    }

    @Deprecated
    public AbstractC178387wC(InterfaceC178367wA interfaceC178367wA, InterfaceC178427wG interfaceC178427wG, String str, String str2) {
        super(interfaceC178367wA, str, str2);
        Context context;
        try {
            context = ((AbstractC178277w1) this).A00.getContext();
        } catch (RuntimeException unused) {
            context = null;
        }
        this.A02 = context;
        this.A03 = 0L;
        this.A00 = false;
        this.A01 = interfaceC178427wG;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0073, code lost:
    
        if (java.lang.Boolean.parseBoolean((java.lang.String) r44.get("is_cold_start")) == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x008a, code lost:
    
        if (r40.equals("recording_finished") == false) goto L5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x013e, code lost:
    
        if (r39.A02 == null) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0140, code lost:
    
        r16 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0144, code lost:
    
        if (r39.A00 == false) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0148, code lost:
    
        r0 = r39.A01;
        r0 = r39.A03;
        r15 = ((X.AbstractC178397wD) r39).A01;
        r14 = ((X.AbstractC178397wD) r39).A00;
        r13 = r39.A04;
        r0 = r39.A06;
        r7 = r0.A00;
        r6 = r0.A05;
        r5 = r0.A06;
        r4 = r0.A07;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0160, code lost:
    
        if (r16 == false) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0162, code lost:
    
        r2 = X.AbstractC176637tL.A00(((X.AbstractC178277w1) r39).A00.getContext(), false);
        r0 = X.AbstractC176637tL.A00(((X.AbstractC178277w1) r39).A00.getContext(), true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0178, code lost:
    
        if (r12 == null) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x017e, code lost:
    
        switch(r12.hashCode()) {
            case -779044650: goto L100;
            case -85671418: goto L101;
            case 371328422: goto L102;
            case 440515259: goto L103;
            case 1266396786: goto L104;
            default: goto L94;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x01b1, code lost:
    
        r11 = r12.equals("NATIVE_LOW_LIGHT_PHOTO");
        r35 = 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x01dd, code lost:
    
        if (r11 != false) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0183, code lost:
    
        if (r16 == false) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0185, code lost:
    
        r38 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0191, code lost:
    
        if (X.AbstractC176637tL.A01(((X.AbstractC178277w1) r39).A00.getContext()) != false) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0195, code lost:
    
        r11 = r0.onEvent(r9, r0, r15, r14, r13, r7, r6, r5, r4, r29, r2, r0, r35, r36, false, r38);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0193, code lost:
    
        r38 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x01ba, code lost:
    
        r11 = r12.equals("NATIVE_VIEW_SIZE_PHOTO");
        r35 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x01c3, code lost:
    
        r11 = r12.equals("PREVIEW_BITMAP");
        r35 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x01cc, code lost:
    
        r11 = r12.equals("PREVIEW_PHOTO");
        r35 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x01d5, code lost:
    
        r11 = r12.equals("NATIVE_FULL_SIZE_FILE");
        r35 = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0181, code lost:
    
        r35 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x01e0, code lost:
    
        r2 = -1;
        r0 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0146, code lost:
    
        r16 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0093, code lost:
    
        if (r40.equals("recording_started") == false) goto L5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x009c, code lost:
    
        if (r40.equals("camera_connect_failed") == false) goto L5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x012a, code lost:
    
        r11 = r39.A01.onFailureEvent(r9, r45, r42, r43);
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00a5, code lost:
    
        if (r40.equals("recording_stop_requested") == false) goto L5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00ae, code lost:
    
        if (r40.equals("camera_connect_requested") == false) goto L5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00b8, code lost:
    
        if (r40.equals("camera_evicted") == false) goto L5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00c2, code lost:
    
        if (r40.equals("camera_update_failed") == false) goto L5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00cc, code lost:
    
        if (r40.equals("photo_capture_requested") == false) goto L5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00d6, code lost:
    
        if (r40.equals("photo_capture_finished") == false) goto L5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00e0, code lost:
    
        if (r40.equals("camera_first_frame_rendered") == false) goto L5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00ea, code lost:
    
        if (r40.equals("camera_update_finished") == false) goto L5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00f4, code lost:
    
        if (r40.equals("recording_requested") == false) goto L5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x00fe, code lost:
    
        if (r40.equals("recording_failed") == false) goto L5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0108, code lost:
    
        if (r40.equals("camera_connect_finished") == false) goto L5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0112, code lost:
    
        if (r40.equals("camera_swipe_to_open_finished") == false) goto L5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x011c, code lost:
    
        if (r40.equals("camera_connect_started") == false) goto L5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0126, code lost:
    
        if (r40.equals("photo_capture_failed") == false) goto L5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0138, code lost:
    
        if (r40.equals("camera_update_requested") == false) goto L5;
     */
    @Override // X.AbstractC178397wD
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String A07(java.lang.String r40, java.lang.String r41, java.lang.String r42, java.lang.String r43, java.util.Map r44, int r45) {
        /*
            Method dump skipped, instructions count: 582
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC178387wC.A07(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.Map, int):java.lang.String");
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0034, code lost:
    
        if (r30.A00 != false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x006d, code lost:
    
        if (X.AbstractC176637tL.A01(((X.AbstractC178277w1) r30).A00.getContext()) == false) goto L18;
     */
    @Override // X.AbstractC178397wD
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0E(java.lang.String r31, java.util.Map r32, java.lang.String r33) {
        /*
            r30 = this;
            long r8 = android.os.SystemClock.elapsedRealtimeNanos()
            r2 = r30
            r7 = r31
            r3 = r32
            r4 = r33
            super.A0E(r7, r3, r4)
            java.lang.String r0 = "camera_disconnect_finished"
            boolean r0 = r0.equals(r7)
            if (r0 == 0) goto L84
            r5 = 0
            if (r32 == 0) goto L92
            java.lang.String r1 = "evicted_during_disconnect"
            boolean r0 = r3.containsKey(r1)
            if (r0 == 0) goto L92
            java.lang.Object r0 = r3.get(r1)
            java.lang.String r0 = (java.lang.String) r0
            boolean r28 = java.lang.Boolean.parseBoolean(r0)
        L2c:
            android.content.Context r0 = r2.A02
            r6 = 1
            if (r0 == 0) goto L36
            boolean r0 = r2.A00
            r3 = 1
            if (r0 == 0) goto L37
        L36:
            r3 = 0
        L37:
            X.7wG r10 = r2.A01
            int r11 = A03(r7, r4)
            int r12 = r2.A03
            java.lang.String r13 = r2.A01
            java.lang.String r14 = r2.A00
            java.lang.String r15 = r2.A04
            r17 = 0
            r0 = -1
            if (r3 == 0) goto L8f
            X.7vu r0 = r2.A00
            android.content.Context r0 = r0.getContext()
            int r0 = X.AbstractC176637tL.A00(r0, r5)
            long r3 = (long) r0
            X.7vu r0 = r2.A00
            android.content.Context r0 = r0.getContext()
            int r0 = X.AbstractC176637tL.A00(r0, r6)
            long r0 = (long) r0
            X.7vu r6 = r2.A00
            android.content.Context r6 = r6.getContext()
            boolean r6 = X.AbstractC176637tL.A01(r6)
            r29 = 1
            if (r6 != 0) goto L71
        L6f:
            r29 = 0
        L71:
            r16 = -1
            r20 = -1
            r18 = r17
            r19 = r17
            r22 = r3
            r24 = r0
            r26 = r16
            r27 = r5
            r10.onEvent(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r22, r24, r26, r27, r28, r29)
        L84:
            long r3 = r2.A03
            long r0 = android.os.SystemClock.elapsedRealtimeNanos()
            long r0 = r0 - r8
            long r3 = r3 + r0
            r2.A03 = r3
            return
        L8f:
            r3 = -1
            goto L6f
        L92:
            r28 = 0
            goto L2c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC178387wC.A0E(java.lang.String, java.util.Map, java.lang.String):void");
    }

    @Override // X.InterfaceC178407wE
    public final void DEb(int i) {
        int A02 = A02(i);
        InterfaceC178367wA interfaceC178367wA = this.A05;
        interfaceC178367wA.BjH().markerStart(A02);
        QuickPerformanceLogger BjH = interfaceC178367wA.BjH();
        BjH.markerTag(A02, AnonymousClass001.A0R("product_name:", ((AbstractC178397wD) this).A00));
        BjH.markerAnnotate(A02, "product_name", ((AbstractC178397wD) this).A00);
        String str = ((AbstractC178397wD) this).A01;
        if (str != null && !str.isEmpty()) {
            BjH.markerTag(A02, AnonymousClass001.A0R("product_session_id:", str));
            BjH.markerAnnotate(A02, "product_session_id", ((AbstractC178397wD) this).A01);
        }
        C178467wK c178467wK = this.A06;
        boolean z = !c178467wK.A05.isEmpty();
        BjH.markerTag(A02, AnonymousClass001.A1D("enabled_effects:", z));
        BjH.markerAnnotate(A02, "enabled_effects", z);
        String str2 = (String) this.A07.A00.get(EnumC178507wO.A01);
        if (str2 != null) {
            BjH.markerTag(A02, AnonymousClass001.A0R("media_pipeline_session_id:", str2));
            BjH.markerAnnotate(A02, "media_pipeline_session_id", str2);
        }
        BjH.markerAnnotate(A02, "enabled_effect_ids", C71473Il.A00(',').A02(c178467wK.A05));
    }

    public AbstractC178387wC(InterfaceC178207vu interfaceC178207vu, InterfaceC178367wA interfaceC178367wA, InterfaceC178427wG interfaceC178427wG) {
        super(interfaceC178207vu, interfaceC178367wA);
        Context context;
        try {
            context = ((AbstractC178277w1) this).A00.getContext();
        } catch (RuntimeException unused) {
            context = null;
        }
        this.A02 = context;
        this.A03 = 0L;
        this.A00 = false;
        this.A01 = interfaceC178427wG;
    }
}
