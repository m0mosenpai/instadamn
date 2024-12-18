package X;

import android.graphics.Bitmap;
import android.graphics.RectF;
import android.opengl.Matrix;
import com.facebook.R;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: X.WYf, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70474WYf implements C81B {
    public int A00;
    public int A01;
    public Bitmap.Config A02;
    public android.net.Uri A03;
    public C1VO A04;
    public AnonymousClass810 A05;
    public C201528vh A06;
    public XC9 A07;
    public C69696Vtr A08;
    public Integer A09;
    public boolean A0A;
    public boolean A0B;
    public C81H A0C;
    public C81H A0D;
    public final RectF A0E;
    public final C180337zN A0F;
    public final C180327zM A0G;
    public final float[] A0H;
    public volatile X9R A0I;

    public static void A00(C70474WYf c70474WYf, boolean z) {
        AnonymousClass810 anonymousClass810;
        c70474WYf.A0A = true;
        if (z && (anonymousClass810 = c70474WYf.A05) != null) {
            anonymousClass810.A01();
            c70474WYf.A05 = null;
        }
        C1VO c1vo = c70474WYf.A04;
        if (c1vo != null) {
            c1vo.close();
        }
        c70474WYf.A04 = null;
        c70474WYf.A09 = null;
    }

    @Override // X.C81B
    public final boolean CZ1() {
        return true;
    }

    @Override // X.C81A
    public final void Dr7(C179877yd c179877yd) {
        A00(this, true);
        this.A0D = c179877yd.A01(R.raw.lite_overlay_vs, R.raw.lite_overlay_fs);
        try {
            int[] iArr = {R.raw.inverse_tonemap_hlg_lib};
            String A00 = C179877yd.A00(c179877yd, R.raw.overlay_hdr_fs);
            String A002 = C179877yd.A00(c179877yd, R.raw.overlay_300_vs);
            String A003 = C179877yd.A00(c179877yd, iArr[0]);
            this.A0C = c179877yd.A03(AnonymousClass001.A0g(A002, "\n", A003), AnonymousClass001.A0g(A00, "\n", A003), false);
        } catch (RuntimeException e) {
            C0K8.A0G("LiteOverlayRenderer", "Could not compile HDR shader", e);
        }
    }

    @Override // X.C81A
    public final void DrA() {
        A00(this, true);
        C81H c81h = this.A0D;
        if (c81h != null) {
            c81h.A02();
            this.A0D = null;
        }
        C81H c81h2 = this.A0C;
        if (c81h2 != null) {
            c81h2.A02();
            this.A0C = null;
        }
    }

    @Override // X.C81A
    @Deprecated
    public final boolean Ejv() {
        return false;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [X.Vtr, java.lang.Object] */
    public C70474WYf(android.net.Uri uri, XC9 xc9) {
        ?? obj = new Object();
        obj.A00 = uri;
        obj.A01 = null;
        obj.A02 = new float[]{-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f};
        float[] fArr = new float[16];
        this.A0H = fArr;
        this.A0B = false;
        this.A0E = new RectF(0.0f, 0.0f, 1.0f, 1.0f);
        this.A06 = null;
        this.A07 = xc9;
        this.A08 = obj;
        float[] fArr2 = obj.A02;
        fArr2.getClass();
        C180327zM c180327zM = new C180327zM(fArr2);
        this.A0G = c180327zM;
        Matrix.setIdentityM(fArr, 0);
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        hashMap.put("aPosition", c180327zM);
        arrayList.add("aPosition");
        this.A0F = AbstractC65703TsZ.A0B(hashMap, arrayList, new float[]{0.0f, 1.0f, 1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f});
        this.A03 = uri;
        this.A0A = true;
    }

    @Override // X.C81A
    public final Integer BIA() {
        return C05F.A0N;
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x0128, code lost:
    
        if (r1 != null) goto L23;
     */
    @Override // X.C81A
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean DCH(X.C201278vB r9, long r10) {
        /*
            Method dump skipped, instructions count: 338
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C70474WYf.DCH(X.8vB, long):boolean");
    }

    @Override // X.C81A
    public final void Dr8(RectF rectF) {
        this.A0E.set(rectF);
    }

    @Override // X.C81A
    public final boolean isEnabled() {
        C69696Vtr c69696Vtr = this.A08;
        if (c69696Vtr.A01 == null && c69696Vtr.A00 == null) {
            return false;
        }
        return true;
    }

    @Override // X.C81A
    public final void Dr3(int i, int i2) {
    }

    @Override // X.C81A
    public final void EPl(X9R x9r) {
        this.A0I = x9r;
    }

    @Override // X.C81B
    public final void ETG(C201528vh c201528vh) {
        this.A06 = c201528vh;
    }
}
