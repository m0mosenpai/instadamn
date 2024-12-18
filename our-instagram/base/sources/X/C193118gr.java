package X;

import android.graphics.Bitmap;
import android.media.MediaMetadataRetriever;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.CountDownLatch;

/* renamed from: X.8gr, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C193118gr {
    public final InterfaceC193168gw A00;
    public final CountDownLatch A01;
    public final InterfaceC09390do A02;
    public final InterfaceC09390do A03;
    public final InterfaceC09390do A04;

    public C193118gr(C8EC c8ec, boolean z) {
        InterfaceC193168gw c193158gv;
        EnumC09460dv enumC09460dv = EnumC09460dv.A02;
        this.A02 = AbstractC09440dt.A00(enumC09460dv, C193128gs.A00);
        this.A03 = AbstractC09440dt.A00(enumC09460dv, C193138gt.A00);
        this.A04 = AbstractC09440dt.A00(enumC09460dv, C193148gu.A00);
        this.A01 = new CountDownLatch(1);
        if (z) {
            c193158gv = new C9VK(c8ec);
        } else {
            c193158gv = new C193158gv(c8ec);
        }
        InterfaceC193168gw interfaceC193168gw = c193158gv;
        this.A00 = interfaceC193168gw;
        interfaceC193168gw.Chb();
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [X.9vN, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v7, types: [X.9vN, java.lang.Object] */
    public final AbstractC223599u2 A03(ACP acp, List list, InterfaceC16660sJ interfaceC16660sJ) {
        AbstractC223599u2 c9vi;
        Bitmap A00;
        A01(acp, this);
        interfaceC16660sJ.invoke(EnumC222799sK.A03);
        Object obj = list.get(0);
        C14360o3.A0C(obj, "null cannot be cast to non-null type com.aiplatform.inputs.AiInputString");
        String str = ((C9VE) obj).A00;
        Object obj2 = list.get(1);
        C14360o3.A0C(obj2, "null cannot be cast to non-null type com.aiplatform.inputs.AiInputLong");
        long j = ((C9VD) obj2).A00;
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            try {
                mediaMetadataRetriever.setDataSource(str);
                A00 = A00(mediaMetadataRetriever, j / 2);
            } catch (Exception e) {
                StringBuilder sb = new StringBuilder();
                sb.append("Video processing failed ");
                sb.append(e);
                sb.toString();
                c9vi = new C9VI(new Object());
            }
            if (A00 != null) {
                interfaceC16660sJ.invoke(EnumC222799sK.A09);
                c9vi = A02(A00, interfaceC16660sJ);
                return c9vi;
            }
            mediaMetadataRetriever.release();
            return new C9VI(new Object());
        } finally {
            mediaMetadataRetriever.release();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0011, code lost:
    
        if (r0 == null) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final android.graphics.Bitmap A00(android.media.MediaMetadataRetriever r7, long r8) {
        /*
            int r2 = android.os.Build.VERSION.SDK_INT
            r1 = 0
            r0 = 30
            r3 = r7
            r4 = r8
            if (r2 < r0) goto L14
            r6 = 2
            r7 = 512(0x200, float:7.17E-43)
            r8 = r7
            android.graphics.Bitmap r0 = r3.getScaledFrameAtTime(r4, r6, r7, r8)
            if (r0 != 0) goto L4a
        L13:
            return r1
        L14:
            r0 = 2
            android.graphics.Bitmap r3 = r7.getFrameAtTime(r8, r0)
            if (r3 == 0) goto L13
            int r0 = r3.getWidth()
            float r0 = (float) r0
            r2 = 1140850688(0x44000000, float:512.0)
            float r1 = r2 / r0
            int r0 = r3.getHeight()
            float r0 = (float) r0
            float r2 = r2 / r0
            android.graphics.Matrix r8 = new android.graphics.Matrix
            r8.<init>()
            r8.postScale(r1, r2)
            int r6 = r3.getWidth()
            int r7 = r3.getHeight()
            r4 = 0
            X.C0fK.A03(r3)
            r5 = r4
            r9 = r4
            android.graphics.Bitmap r0 = android.graphics.Bitmap.createBitmap(r3, r4, r5, r6, r7, r8, r9)
            X.C14360o3.A07(r0)
            r3.recycle()
        L4a:
            android.graphics.Bitmap r2 = X.AbstractC224389vP.A00(r0)
            X.AGi r1 = X.C23098AGi.A02
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.RGB_565
            android.graphics.Bitmap r1 = r1.A00(r0, r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C193118gr.A00(android.media.MediaMetadataRetriever, long):android.graphics.Bitmap");
    }

    public static final void A01(ACP acp, C193118gr c193118gr) {
        for (Object obj : acp.A00) {
            if (C14360o3.A0K(obj, "STRINGS")) {
                ((AbstractMap) c193118gr.A02.getValue()).clear();
            } else if (C14360o3.A0K(obj, "CONCEPT_SCORES")) {
                ((Map) c193118gr.A03.getValue()).clear();
            } else {
                ((InterfaceC16660sJ) c193118gr.A04.getValue()).invoke(obj);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [X.9vN, java.lang.Object] */
    public final AbstractC223599u2 A02(Bitmap bitmap, InterfaceC16660sJ interfaceC16660sJ) {
        Float f;
        Object putIfAbsent;
        A01(new ACP(AbstractC16960so.A1Q("STRINGS", "CONCEPT_SCORES")), this);
        try {
            InterfaceC193168gw interfaceC193168gw = this.A00;
            List singletonList = Collections.singletonList(new C9VC(bitmap));
            C14360o3.A07(singletonList);
            AbstractC223599u2 E58 = interfaceC193168gw.E58(new ACP(AbstractC16960so.A1Q("XRAY", "CONCEPTS")), singletonList, interfaceC16660sJ);
            if (E58 instanceof C9VJ) {
                for (AbstractC72460Xe6 abstractC72460Xe6 : ((C9VJ) E58).A00) {
                    C14360o3.A0C(abstractC72460Xe6, "null cannot be cast to non-null type com.aiplatform.processors.scenerecognizer.model.SceneRecognizerOutputModel");
                    C9VH c9vh = (C9VH) abstractC72460Xe6;
                    String str = c9vh.A01;
                    if (str != null && (f = c9vh.A00) != null) {
                        Map map = (Map) this.A03.getValue();
                        EnumC193268h6 enumC193268h6 = c9vh.A03;
                        Object obj = map.get(enumC193268h6);
                        if (obj == null) {
                            obj = new ConcurrentHashMap();
                            map.put(enumC193268h6, obj);
                        }
                        ConcurrentMap concurrentMap = (ConcurrentMap) obj;
                        Object obj2 = concurrentMap.get(str);
                        if (obj2 == null && (putIfAbsent = concurrentMap.putIfAbsent(str, (obj2 = new ArrayList()))) != null) {
                            obj2 = putIfAbsent;
                        }
                        ((List) obj2).add(f);
                    }
                }
                Map map2 = (Map) this.A03.getValue();
                ArrayList arrayList = new ArrayList(map2.size());
                for (Map.Entry entry : map2.entrySet()) {
                    EnumC193268h6 enumC193268h62 = (EnumC193268h6) entry.getKey();
                    ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) entry.getValue();
                    ArrayList arrayList2 = new ArrayList(concurrentHashMap.size());
                    for (Map.Entry entry2 : concurrentHashMap.entrySet()) {
                        arrayList2.add(new C9VH(enumC193268h62, Float.valueOf((float) AbstractC001800i.A00((List) entry2.getValue())), (String) entry2.getKey(), null));
                    }
                    arrayList.add(arrayList2);
                }
                return new C9VJ(AbstractC06950Ym.A1F(arrayList));
            }
        } catch (Exception unused) {
            interfaceC16660sJ.invoke(EnumC222799sK.A07);
        }
        return new C9VI(new Object());
    }
}
