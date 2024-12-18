package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Point;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.FilterChain;
import com.instagram.camera.effect.models.CameraAREffect;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.freetransform.transformmatrix.TransformMatrixConfig;
import java.io.File;
import java.io.IOException;
import java.util.LinkedHashMap;

/* renamed from: X.AGb, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23092AGb {
    public static final C23092AGb A00 = new Object();

    public final AAW A00(Context context, Bitmap bitmap, FilterChain filterChain, CameraAREffect cameraAREffect, UserSession userSession, TransformMatrixConfig transformMatrixConfig, C22925A8v c22925A8v, C183978Ee c183978Ee, String str, LinkedHashMap linkedHashMap, java.util.Set set, int i, boolean z, boolean z2, boolean z3) {
        double d;
        boolean A1U = AbstractC167007dF.A1U(c183978Ee);
        C14360o3.A0B(filterChain, 14);
        if (bitmap != null) {
            int width = bitmap.getWidth();
            Point A002 = ALe.A00(width / bitmap.getHeight(), AbstractC54249NyU.A00(context, userSession, width, AbstractC176977tt.A00(context), A1U));
            C14360o3.A07(A002);
            int i2 = A002.x;
            int i3 = A002.y;
            String str2 = c183978Ee.A0a;
            File A11 = AbstractC166987dD.A11(AbstractC916948n.A0C(AbstractC916948n.A0D(null, -1, false)));
            boolean z4 = c183978Ee.A13;
            long j = c183978Ee.A0A;
            long j2 = c183978Ee.A0B;
            if (j2 <= 0) {
                j2 = j;
            }
            C195868lW c195868lW = new C195868lW(A11, null, str2, i2, i3, A1U ? 1 : 0, j, j2, A1U, z4, A1U);
            if (z2) {
                d = 500.0d + 500.0d;
            } else {
                d = 3000.0d;
            }
            int A003 = AbstractC23131AMn.A00(cameraAREffect, userSession, set, d);
            boolean z5 = !set.isEmpty();
            boolean z6 = false;
            C47Z A01 = AbstractC209399Nx.A01(String.valueOf(System.nanoTime()));
            A01.A0K = !c183978Ee.A13 ? 1 : 0;
            File parentFile = AbstractC166987dD.A11(c195868lW.A0k).getParentFile();
            parentFile.getClass();
            A01.A3w = parentFile.getName();
            A01.A0H = c195868lW.A0K;
            A01.A0G = c195868lW.A08;
            A01.A5F = true;
            A01.A5V = true;
            A01.A02 = c195868lW.A0K / c195868lW.A08;
            A01.A10 = cameraAREffect;
            if (transformMatrixConfig != null) {
                z6 = true;
            }
            A01.A5z = z6;
            FilterChain deepCopy = filterChain.deepCopy();
            if (z5 && (cameraAREffect == null || !cameraAREffect.A0L())) {
                AbstractC23131AMn.A05(deepCopy);
            }
            AbstractC23131AMn.A03(deepCopy, A01, z3);
            if (cameraAREffect != null) {
                AbstractC23131AMn.A06(transformMatrixConfig, c22925A8v, A01, c183978Ee, i);
            }
            A01.A2k = str;
            C55068OaO c55068OaO = new C55068OaO();
            try {
                String canonicalPath = AbstractC166987dD.A11(c195868lW.A0k).getCanonicalPath();
                C14360o3.A07(canonicalPath);
                c55068OaO.A02(bitmap, canonicalPath, A003 / 1000.0f, A002.x, A002.y);
                A01.A0h(c195868lW.A0k, A003, A1U);
                LinkedHashMap A1I = AbstractC166987dD.A1I();
                if (linkedHashMap != null) {
                    A1I.putAll(linkedHashMap);
                }
                return new AAW(context, userSession, null, null, null, null, A01, A1I, A1U, A1U, z);
            } catch (Exception e) {
                String message = e.getMessage();
                if (message == null) {
                    message = "null";
                }
                AbstractC12120kG.A07("PhotoToVideoTaskFactory", message, e);
                throw new IOException(e.getMessage());
            }
        }
        throw new IOException("mediaBitmap was null when converting photo to video");
    }
}
