package X;

import android.opengl.Matrix;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: X.Vms, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69408Vms {
    public C180337zN A00;
    public C81H A01;
    public final WDI A02;
    public final float[] A03;
    public final float[] A04;
    public final float[] A05;
    public final C179877yd A06;
    public final C180327zM A07;

    public C69408Vms(C179877yd c179877yd, WDI wdi) {
        C180327zM c180327zM = new C180327zM(new float[]{-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f});
        this.A07 = c180327zM;
        float[] fArr = new float[16];
        this.A05 = fArr;
        float[] fArr2 = new float[16];
        this.A03 = fArr2;
        float[] fArr3 = new float[16];
        this.A04 = fArr3;
        this.A06 = c179877yd;
        this.A02 = wdi;
        Matrix.setIdentityM(fArr, 0);
        Matrix.setIdentityM(fArr2, 0);
        Matrix.setIdentityM(fArr3, 0);
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        hashMap.put("aPosition", c180327zM);
        arrayList.add("aPosition");
        this.A00 = AbstractC65703TsZ.A0B(hashMap, arrayList, new float[]{0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f});
        AbstractC69834VwK.A01(wdi, fArr2, fArr3);
        this.A01 = c179877yd.A03("attribute vec4 aPosition;\nattribute vec4 aTextureCoord;\n\nuniform mat4 uSTMatrix;\nuniform mat4 uConstMatrix;\nuniform mat4 uContentTransform;\n\nvarying vec2 vTextureCoord;\n\nvoid main() {\n  gl_Position = uContentTransform * aPosition;\n  vTextureCoord = (uSTMatrix * uConstMatrix * aTextureCoord).xy;\n}\n", "#extension GL_OES_EGL_image_external : require\nprecision mediump float; // highp here doesn't seem to matter\n\nuniform sampler2D sTexture;\n\nvarying vec2 vTextureCoord;\n\nvoid main() {\n  gl_FragColor = texture2D(sTexture, vTextureCoord).rgba;\n}", false);
    }
}
