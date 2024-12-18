package com.instagram.creation.ml;

import X.AbstractC166987dD;
import X.AbstractC223599u2;
import X.AbstractC72460Xe6;
import X.C05A;
import X.C0fK;
import X.C10E;
import X.C14360o3;
import X.C193118gr;
import X.C51730MtA;
import X.C57744PjX;
import X.C8E4;
import X.C8E7;
import X.C8ED;
import X.C9VH;
import X.C9VJ;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import com.aiplatform.modelloaders.nativemodelloader.ig.IgVoltronModelLoader;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes4.dex */
public final class VisualFeatureStore {
    public static VisualFeatureStore A04;
    public final Context A02;
    public final UserSession A03;
    public final HashMap A01 = AbstractC166987dD.A1G();
    public C193118gr A00 = A01(this);

    /* JADX WARN: Removed duplicated region for block: B:17:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A03(java.lang.Long r12, java.lang.String r13, X.InterfaceC23621Ds r14, boolean r15, boolean r16) {
        /*
            r11 = this;
            r7 = r13
            r4 = 0
            boolean r0 = X.MAK.A01(r14, r4)
            r6 = r11
            if (r0 == 0) goto L2b
            r3 = r14
            X.MAK r3 = (X.MAK) r3
            int r2 = r3.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L2b
            int r2 = r2 - r1
            r3.A00 = r2
        L17:
            java.lang.Object r1 = r3.A03
            X.1JX r4 = X.C1JX.A02
            int r0 = r3.A00
            r2 = 2
            r5 = 1
            r8 = 0
            if (r0 == 0) goto L3c
            if (r0 == r5) goto L31
            if (r0 == r2) goto L31
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        L2b:
            X.MAK r3 = new X.MAK
            r3.<init>(r11, r14, r4)
            goto L17
        L31:
            java.lang.Object r7 = r3.A02
            java.lang.Object r0 = r3.A01
            com.instagram.creation.ml.VisualFeatureStore r0 = (com.instagram.creation.ml.VisualFeatureStore) r0
            X.AbstractC09560e7.A00(r1)
            goto Lc7
        L3c:
            X.AbstractC09560e7.A00(r1)
            java.util.HashMap r1 = r11.A01
            java.lang.Object r0 = r1.get(r13)
            X.05A r0 = (X.C05A) r0
            if (r0 == 0) goto L4f
            java.lang.Object r0 = r0.getValue()
            if (r0 != 0) goto Lc1
        L4f:
            if (r16 != 0) goto Lc1
            X.1KH r0 = X.AbstractC25061Kk.A00()
            boolean r0 = r0.A0E()
            if (r0 != 0) goto Ld5
            if (r15 == 0) goto L8e
            r3.A01 = r11
            r3.A02 = r13
            r3.A00 = r5
            java.lang.Object r0 = r1.get(r13)
            X.05A r0 = (X.C05A) r0
            if (r0 == 0) goto L76
            java.lang.Object r0 = r0.getValue()
            if (r0 == 0) goto L76
        L71:
            X.0eB r0 = X.C0eB.A00
        L73:
            if (r0 != r4) goto Lc6
            return r4
        L76:
            X.12L r2 = X.C12L.A00
            r1 = 1632833315(0x61530f23, float:2.433346E20)
            r0 = 3
            X.0nZ r2 = r2.AOT(r1, r0)
            r1 = 18
            X.MCF r0 = new X.MCF
            r0.<init>(r11, r13, r8, r1)
            java.lang.Object r0 = X.AbstractC23641Du.A00(r3, r2, r0)
            if (r0 != r4) goto L71
            goto L73
        L8e:
            if (r12 == 0) goto Lc6
            long r9 = r12.longValue()
            r3.A01 = r11
            r3.A02 = r13
            r3.A00 = r2
            java.lang.Object r0 = r1.get(r13)
            X.05A r0 = (X.C05A) r0
            if (r0 == 0) goto Lab
            java.lang.Object r0 = r0.getValue()
            if (r0 == 0) goto Lab
        La8:
            X.0eB r0 = X.C0eB.A00
            goto L73
        Lab:
            X.12L r2 = X.C12L.A00
            r1 = 1632833315(0x61530f23, float:2.433346E20)
            r0 = 3
            X.0nZ r0 = r2.AOT(r1, r0)
            com.instagram.creation.ml.VisualFeatureStore$extractSceneConceptsFromCenterVideoFrame$2 r5 = new com.instagram.creation.ml.VisualFeatureStore$extractSceneConceptsFromCenterVideoFrame$2
            r5.<init>(r6, r7, r8, r9)
            java.lang.Object r0 = X.AbstractC23641Du.A00(r3, r0, r5)
            if (r0 != r4) goto La8
            goto L73
        Lc1:
            java.lang.Object r0 = r1.get(r13)
            goto Lcd
        Lc6:
            r0 = r11
        Lc7:
            java.util.HashMap r0 = r0.A01
            java.lang.Object r0 = r0.get(r7)
        Lcd:
            X.05A r0 = (X.C05A) r0
            if (r0 == 0) goto Ld5
            java.lang.Object r8 = r0.getValue()
        Ld5:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creation.ml.VisualFeatureStore.A03(java.lang.Long, java.lang.String, X.1Ds, boolean, boolean):java.lang.Object");
    }

    public static final C193118gr A01(VisualFeatureStore visualFeatureStore) {
        C193118gr c193118gr = visualFeatureStore.A00;
        if (c193118gr == null) {
            C8E7 c8e7 = IgVoltronModelLoader.Companion;
            UserSession userSession = visualFeatureStore.A03;
            IgVoltronModelLoader A00 = c8e7.A00(userSession);
            if (A00.arePytorchLibrariesLoaded.get()) {
                c193118gr = new C193118gr(new C8ED(userSession, AbstractC166987dD.A1J(C8E4.A0H.A00())), false);
            } else {
                A00.fetchPytorchVoltronModule(new C57744PjX(visualFeatureStore, 32));
                c193118gr = null;
            }
            visualFeatureStore.A00 = c193118gr;
        }
        return c193118gr;
    }

    public static final void A02(AbstractC223599u2 abstractC223599u2, VisualFeatureStore visualFeatureStore, String str) {
        Float f;
        String str2;
        if (abstractC223599u2 instanceof C9VJ) {
            ArrayList A1E = AbstractC166987dD.A1E();
            for (AbstractC72460Xe6 abstractC72460Xe6 : ((C9VJ) abstractC223599u2).A00) {
                C14360o3.A0C(abstractC72460Xe6, "null cannot be cast to non-null type com.aiplatform.processors.scenerecognizer.model.SceneRecognizerOutputModel");
                C9VH c9vh = (C9VH) abstractC72460Xe6;
                String str3 = c9vh.A01;
                if (str3 != null && (f = c9vh.A00) != null) {
                    float floatValue = f.floatValue();
                    int ordinal = c9vh.A03.ordinal();
                    if (ordinal != 0) {
                        if (ordinal != 1) {
                            str2 = "";
                        } else {
                            str2 = "vizardx";
                        }
                    } else {
                        str2 = "xray";
                    }
                    A1E.add(new C51730MtA(str3, str2, floatValue));
                }
            }
            HashMap hashMap = visualFeatureStore.A01;
            Object obj = hashMap.get(str);
            if (obj == null) {
                obj = C10E.A00(null);
                hashMap.put(str, obj);
            }
            C05A c05a = (C05A) obj;
            do {
            } while (!c05a.AIi(c05a.getValue(), A1E));
        }
    }

    public VisualFeatureStore(Context context, UserSession userSession) {
        this.A02 = context;
        this.A03 = userSession;
    }

    public static final Bitmap A00(Bitmap bitmap, float f) {
        Matrix A0Q = AbstractC166987dD.A0Q();
        A0Q.postRotate(f);
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        C0fK.A03(bitmap);
        Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, width, height, A0Q, true);
        C14360o3.A07(createBitmap);
        return createBitmap;
    }
}
