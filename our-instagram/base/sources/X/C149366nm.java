package X;

import android.content.Context;
import com.facebook.gltf.jni.GLTFCameraOrientation;
import com.facebook.spherical.util.Quaternion;
import java.util.concurrent.TimeUnit;

/* renamed from: X.6nm, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C149366nm {
    public static final float A0A = (float) Math.sqrt(0.5d);
    public static final float A0B;
    public static final float A0C;
    public InterfaceC141866b4 A00;
    public boolean A01;
    public boolean A02;
    public boolean A03;
    public long A04;
    public Quaternion A05;
    public final Context A06;
    public final GLTFCameraOrientation A07;
    public final C149376no A08;
    public final C141846b1 A09;

    static {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        A0C = (float) timeUnit.toNanos(5L);
        A0B = (float) timeUnit.toNanos(1L);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0060, code lost:
    
        if (r0 == null) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0062, code lost:
    
        r0 = java.lang.Integer.valueOf(r0.getRotation());
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0049, code lost:
    
        if ((r1 instanceof android.view.WindowManager) == false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0056, code lost:
    
        if ((r1 instanceof android.view.WindowManager) != false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0058, code lost:
    
        r1 = (android.view.WindowManager) r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x005a, code lost:
    
        if (r1 == null) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x005c, code lost:
    
        r0 = r1.getDefaultDisplay();
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0092  */
    /* JADX WARN: Type inference failed for: r3v3, types: [com.facebook.spherical.util.Quaternion, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v0, types: [com.facebook.spherical.util.Quaternion, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A00(com.facebook.spherical.util.Quaternion r19, long r20) {
        /*
            Method dump skipped, instructions count: 413
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C149366nm.A00(com.facebook.spherical.util.Quaternion, long):void");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.6b1, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v1, types: [com.facebook.gltf.jni.GLTFCameraOrientation, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, X.6b4] */
    public C149366nm(Context context) {
        this.A06 = context;
        ?? obj = new Object();
        obj.A00 = 0.0f;
        obj.A01 = 0.0f;
        obj.A02 = 0.0f;
        this.A09 = obj;
        this.A07 = new Object();
        this.A05 = new Quaternion();
        this.A00 = new Object();
        this.A08 = new C149376no();
    }
}
