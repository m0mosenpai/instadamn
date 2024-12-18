package X;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.opengl.GLES20;
import android.opengl.Matrix;
import com.facebook.R;
import com.instagram.react.modules.base.IgReactQEModule;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.WFt, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70190WFt {
    public C179877yd A00;
    public final C71190Wpc A01;
    public final Map A02;
    public final C180337zN A03;

    public final void A05(C9K4 c9k4, C201278vB c201278vB) {
        GLES20.glDisable(3042);
        GLES20.glDisable(2929);
        GLES20.glDisable(2884);
        c9k4.A04(AbstractC111324zv.A00(5520), c201278vB.A04);
        c9k4.A04(AbstractC111324zv.A00(5521), c201278vB.A05);
        c9k4.A04(AbstractC111324zv.A00(5519), c201278vB.A03);
        c9k4.A01(this.A03);
        AbstractC180237zD.A02("PosesFramesGLRenderer::draw", new Object[0]);
    }

    public static final C200688uB A00(C200688uB c200688uB, C201278vB c201278vB, C70190WFt c70190WFt) {
        int i = c200688uB.A02;
        int i2 = c200688uB.A01;
        C200688uB c200688uB2 = new C200688uB(i / 2, i2 / 2);
        GLES20.glBindFramebuffer(36160, c200688uB2.A00);
        int i3 = c200688uB2.A02;
        int i4 = c200688uB2.A01;
        GLES20.glViewport(0, 0, i3, i4);
        Integer num = C05F.A01;
        C9K4 A01 = A01(c70190WFt, num);
        A01.A03("u_Texture", c200688uB.A03);
        GLES20.glUniform2f(C9K4.A00(A01, "u_TextureSize"), i, i2);
        c70190WFt.A05(A01, c201278vB);
        GLES20.glBindFramebuffer(36160, 0);
        GLES20.glBindTexture(3553, 0);
        C200688uB c200688uB3 = new C200688uB(i / 4, i2 / 4);
        GLES20.glBindFramebuffer(36160, c200688uB3.A00);
        int i5 = c200688uB3.A02;
        int i6 = c200688uB3.A01;
        GLES20.glViewport(0, 0, i5, i6);
        C9K4 A012 = A01(c70190WFt, num);
        A012.A03("u_Texture", c200688uB2.A03);
        GLES20.glUniform2f(C9K4.A00(A012, "u_TextureSize"), i3, i4);
        c70190WFt.A05(A012, c201278vB);
        GLES20.glBindFramebuffer(36160, 0);
        GLES20.glBindTexture(3553, 0);
        c200688uB2.A01();
        C200688uB c200688uB4 = new C200688uB(i5, i6);
        GLES20.glBindFramebuffer(36160, c200688uB4.A00);
        int i7 = c200688uB4.A02;
        int i8 = c200688uB4.A01;
        GLES20.glViewport(0, 0, i7, i8);
        Integer num2 = C05F.A0C;
        C9K4 A013 = A01(c70190WFt, num2);
        GLES20.glUniform1i(C9K4.A00(A013, "u_DirX"), 1);
        GLES20.glUniform1i(C9K4.A00(A013, "u_DirY"), 0);
        A013.A02("u_BlurAmount", 5.0f);
        A013.A02("u_VignetteAmount", 1.0f);
        A013.A03("u_Texture", c200688uB3.A03);
        GLES20.glUniform2f(C9K4.A00(A013, "u_RenderSize"), i7, i8);
        c70190WFt.A05(A013, c201278vB);
        GLES20.glBindFramebuffer(36160, 0);
        GLES20.glBindTexture(3553, 0);
        c200688uB3.A01();
        C200688uB c200688uB5 = new C200688uB(i7, i8);
        GLES20.glBindFramebuffer(36160, c200688uB5.A00);
        int i9 = c200688uB5.A02;
        int i10 = c200688uB5.A01;
        GLES20.glViewport(0, 0, i9, i10);
        C9K4 A014 = A01(c70190WFt, num2);
        GLES20.glUniform1i(C9K4.A00(A014, "u_DirX"), 0);
        GLES20.glUniform1i(C9K4.A00(A014, "u_DirY"), 1);
        A014.A02("u_BlurAmount", 5.0f);
        A014.A02("u_VignetteAmount", 1.0f);
        A014.A03("u_Texture", c200688uB4.A03);
        GLES20.glUniform2f(C9K4.A00(A014, "u_RenderSize"), i9, i10);
        c70190WFt.A05(A014, c201278vB);
        GLES20.glBindFramebuffer(36160, 0);
        GLES20.glBindTexture(3553, 0);
        c200688uB4.A01();
        return c200688uB5;
    }

    public static final C9K4 A01(C70190WFt c70190WFt, Integer num) {
        int i;
        int i2;
        C71190Wpc c71190Wpc = c70190WFt.A01;
        c71190Wpc.A00 = num;
        Map map = c70190WFt.A02;
        C81H c81h = (C81H) map.get(c71190Wpc);
        if (c81h == null) {
            C179877yd c179877yd = c70190WFt.A00;
            if (c179877yd != null) {
                switch (num.intValue()) {
                    case 0:
                        i = R.raw.copy_vs;
                        i2 = R.raw.copy_fs;
                        break;
                    case 1:
                        i = R.raw.box_vs;
                        i2 = R.raw.box_fs;
                        break;
                    case 2:
                        i = R.raw.gaussian_blur_a_vs;
                        i2 = R.raw.gaussian_blur_a_fs;
                        break;
                    case 3:
                        i = R.raw.copy_vs;
                        i2 = R.raw.flash_fs;
                        break;
                    case 4:
                        i = R.raw.leak_vs;
                        i2 = R.raw.leak_fs;
                        break;
                    case 5:
                        i = R.raw.box_vs;
                        i2 = R.raw.leak_composite_fs;
                        break;
                    case 6:
                        i = R.raw.ps_vs;
                        i2 = R.raw.ps_fs;
                        break;
                    case 7:
                        i = R.raw.box_vs;
                        i2 = R.raw.ps_composite_fs;
                        break;
                    case 8:
                        i = R.raw.fr_vs;
                        i2 = R.raw.fr_fs;
                        break;
                    case 9:
                        i = R.raw.box_vs;
                        i2 = R.raw.fr_composite_fs;
                        break;
                    case 10:
                        i = R.raw.frbw_vs;
                        i2 = R.raw.frbw_fs;
                        break;
                    case 11:
                        i = R.raw.frbw_composite_vs;
                        i2 = R.raw.frbw_composite_fs;
                        break;
                    case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                        i = R.raw.vhs_vs;
                        i2 = R.raw.vhs_fs;
                        break;
                    default:
                        i = R.raw.vhs_composite_vs;
                        i2 = R.raw.vhs_composite_fs;
                        break;
                }
                c81h = c179877yd.A02(i, i2, c71190Wpc.A01);
                map.put(c71190Wpc.clone(), c81h);
                C14360o3.A0A(c81h);
            } else {
                throw AbstractC166997dE.A0g();
            }
        }
        C9K4 A01 = c81h.A01();
        C14360o3.A07(A01);
        return A01;
    }

    public static final AnonymousClass810 A02(C70190WFt c70190WFt, int i) {
        C179877yd c179877yd = c70190WFt.A00;
        if (c179877yd != null) {
            Drawable A00 = AbstractC56412ia.A00(c179877yd.A00, i);
            A00.setVisible(true, false);
            if (A00 instanceof C3PR) {
                C3PR c3pr = (C3PR) A00;
                do {
                } while (c3pr.A00.A01.A06 == null);
                Bitmap bitmap = c3pr.A00.A01.A06;
                AnonymousClass811 anonymousClass811 = new AnonymousClass811("TextureDrawable");
                anonymousClass811.A05 = bitmap;
                anonymousClass811.A07 = false;
                return new AnonymousClass810(anonymousClass811);
            }
            throw new ClassCastException("External textures required for effects unavailable");
        }
        throw AbstractC166997dE.A0g();
    }

    public static final ArrayList A03(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((C200688uB) it.next()).A03);
        }
        return arrayList;
    }

    public static final void A04(C201278vB c201278vB, C70190WFt c70190WFt) {
        C71190Wpc c71190Wpc = c70190WFt.A01;
        if (c71190Wpc.A01 != c201278vB.A05()) {
            Map map = c70190WFt.A02;
            Iterator A16 = AbstractC166997dE.A16(map);
            while (A16.hasNext()) {
                C81H c81h = (C81H) A16.next();
                if (c81h != null) {
                    c81h.A02();
                }
            }
            map.clear();
            c71190Wpc.A01 = c201278vB.A05();
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, X.Wpc] */
    public C70190WFt() {
        Integer num = C05F.A0N;
        ?? obj = new Object();
        obj.A00 = num;
        obj.A01 = true;
        this.A01 = obj;
        this.A02 = new HashMap();
        Matrix.setIdentityM(new float[16], 0);
        C180327zM c180327zM = new C180327zM(new float[]{-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f});
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        hashMap.put("aPosition", c180327zM);
        arrayList.add("aPosition");
        this.A03 = AbstractC65703TsZ.A0B(hashMap, arrayList, new float[]{0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f});
    }
}
