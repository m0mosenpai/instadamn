package X;

import com.aiplatform.modelloaders.nativemodelloader.ig.IgVoltronModelLoader;
import com.facebook.cameracore.ardelivery.model.VersionedCapability;
import com.instagram.common.clips.model.ClipSegment;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.84o, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1817984o {
    public C193118gr A00;
    public final UserSession A01;
    public final C84G A02;
    public final C1818084p A03;
    public final HashMap A04;
    public final InterfaceC09390do A05;

    public final List A05(String str, int i) {
        C14360o3.A0B(str, 0);
        long A00 = this.A03.A00();
        if (i > 0) {
            A03(this, str, i, A00);
        } else {
            A02(this, str, A00);
        }
        return (List) this.A04.get(str);
    }

    public /* synthetic */ C1817984o(C12N c12n, UserSession userSession, C84G c84g, C19L c19l) {
        C1818084p c1818084p = new C1818084p(userSession);
        this.A01 = userSession;
        this.A02 = c84g;
        this.A03 = c1818084p;
        this.A04 = new HashMap();
        this.A05 = AbstractC09440dt.A01(new C9ES(c12n, 35));
        UserSession userSession2 = this.A01;
        C06090Tz c06090Tz = C06090Tz.A06;
        if (C18U.A06(c06090Tz, userSession2, 36319325786938547L) || C18U.A06(c06090Tz, userSession2, 36319325786873010L)) {
            C1818084p c1818084p2 = this.A03;
            long A00 = c1818084p2.A00();
            A01(this, A00);
            if (this.A00 != null) {
                c1818084p2.A01(A00);
            } else {
                c1818084p2.A02(A00, "processor_not_ready");
            }
        }
        AbstractC18560vj.A03(c19l, AbstractC011604e.A01((C14090nZ) this.A05.getValue(), new C15340po(new C9D0(this, null, 38), c84g.A03)));
    }

    private final void A00(AbstractC223599u2 abstractC223599u2, String str, long j) {
        Float f;
        String str2;
        if (abstractC223599u2 instanceof C9VJ) {
            ArrayList arrayList = new ArrayList();
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
                    arrayList.add(new C9ZC(str3, str2, floatValue));
                }
            }
            this.A04.put(str, arrayList);
            this.A03.A01(j);
            return;
        }
        this.A03.A02(j, "inference_failed");
    }

    public static final void A01(C1817984o c1817984o, long j) {
        C193118gr c193118gr;
        C8EB c8eb;
        boolean z;
        C8E7 c8e7 = IgVoltronModelLoader.Companion;
        UserSession userSession = c1817984o.A01;
        IgVoltronModelLoader A00 = c8e7.A00(userSession);
        if (C18U.A06(C06090Tz.A05, userSession, 36319325787200695L)) {
            boolean z2 = A00.areExecuTorchLibrariesLoaded.get();
            c193118gr = null;
            C1818084p c1818084p = c1817984o.A03;
            if (z2) {
                c1818084p.A03(j, "voltron_ready_initializing_model_et");
                List singletonList = Collections.singletonList(VersionedCapability.SceneUnderstanding);
                C14360o3.A07(singletonList);
                List singletonList2 = Collections.singletonList(C8E4.A0G.A00());
                C14360o3.A07(singletonList2);
                c8eb = new C8EB(null, userSession, singletonList, singletonList2);
                z = true;
                c193118gr = new C193118gr(c8eb, z);
            } else {
                c1818084p.A03(j, "voltron_not_ready_fetching_et");
                A00.fetchExecuTorchVoltronModule(new C57747Pja(c1817984o, 42));
            }
        } else {
            boolean z3 = A00.arePytorchLibrariesLoaded.get();
            c193118gr = null;
            C1818084p c1818084p2 = c1817984o.A03;
            if (z3) {
                c1818084p2.A03(j, "voltron_ready_initializing_model");
                List singletonList3 = Collections.singletonList(VersionedCapability.SceneUnderstanding);
                C14360o3.A07(singletonList3);
                List singletonList4 = Collections.singletonList(C8E4.A0H.A00());
                C14360o3.A07(singletonList4);
                c8eb = new C8EB(null, userSession, singletonList3, singletonList4);
                z = false;
                c193118gr = new C193118gr(c8eb, z);
            } else {
                c1818084p2.A03(j, "voltron_not_ready_fetching");
                A00.fetchPytorchVoltronModule(new C9EL(c1817984o, 0));
            }
        }
        c1817984o.A00 = c193118gr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0068, code lost:
    
        if (r4 != 8) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A02(X.C1817984o r14, java.lang.String r15, long r16) {
        /*
            java.util.HashMap r0 = r14.A04
            boolean r0 = r0.containsKey(r15)
            java.lang.String r10 = ""
            r12 = r16
            if (r0 == 0) goto L1e
            X.84p r0 = r14.A03
            java.lang.String r9 = "photo_already_cached"
            X.24Q r8 = r0.A00
            monitor-enter(r8)
            r11 = 17640443(0x10d2bfb, float:2.5929164E-38)
            r8.A06(r9, r10, r11, r12)     // Catch: java.lang.Throwable -> L1b
            monitor-exit(r8)
            return
        L1b:
            r0 = move-exception
            monitor-exit(r8)
            throw r0
        L1e:
            X.8gr r0 = r14.A00
            if (r0 != 0) goto L25
            A01(r14, r12)
        L25:
            X.8gr r2 = r14.A00
            X.84p r3 = r14.A03
            if (r2 != 0) goto L31
            java.lang.String r0 = "processor_not_ready"
        L2d:
            r3.A02(r12, r0)
            return
        L31:
            java.lang.String r0 = "decoding_photo"
            r3.A03(r12, r0)
            android.graphics.Bitmap r1 = android.graphics.BitmapFactory.decodeFile(r15)
            if (r1 == 0) goto L98
            java.lang.String r0 = "pre_processing_photo"
            r3.A03(r12, r0)
            android.graphics.Bitmap r4 = X.AbstractC224389vP.A00(r1)
            X.AGi r1 = X.C23098AGi.A02
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.RGB_565
            android.graphics.Bitmap r5 = r1.A00(r0, r4)
            android.media.ExifInterface r1 = new android.media.ExifInterface
            r1.<init>(r15)
            java.lang.String r0 = "Orientation"
            r11 = 1
            int r4 = r1.getAttributeInt(r0, r11)
            r0 = 3
            if (r4 == r0) goto L79
            r0 = 6
            r1 = 1119092736(0x42b40000, float:90.0)
            if (r4 == r0) goto L7b
            r0 = 7
            r1 = 1132920832(0x43870000, float:270.0)
            if (r4 == r0) goto L7b
            r0 = 8
            if (r4 == r0) goto L7b
        L6a:
            java.lang.String r0 = "processing_photo"
            r3.A03(r12, r0)
            X.8oy r0 = X.C197878oy.A00
            X.9u2 r0 = r2.A02(r5, r0)
            r14.A00(r0, r15, r12)
            return
        L79:
            r1 = 1127481344(0x43340000, float:180.0)
        L7b:
            android.graphics.Matrix r10 = new android.graphics.Matrix
            r10.<init>()
            r10.postRotate(r1)
            int r8 = r5.getWidth()
            int r9 = r5.getHeight()
            r6 = 0
            X.C0fK.A03(r5)
            r7 = r6
            android.graphics.Bitmap r5 = android.graphics.Bitmap.createBitmap(r5, r6, r7, r8, r9, r10, r11)
            X.C14360o3.A07(r5)
            goto L6a
        L98:
            java.lang.String r0 = "bitmap_not_ready"
            goto L2d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1817984o.A02(X.84o, java.lang.String, long):void");
    }

    public static final void A03(C1817984o c1817984o, String str, long j, long j2) {
        if (c1817984o.A04.containsKey(str)) {
            C24Q c24q = c1817984o.A03.A00;
            synchronized (c24q) {
                c24q.A06("video_already_cached", "", 17640443, j2);
            }
            return;
        }
        if (c1817984o.A00 == null) {
            A01(c1817984o, j2);
        }
        C193118gr c193118gr = c1817984o.A00;
        C1818084p c1818084p = c1817984o.A03;
        if (c193118gr == null) {
            c1818084p.A02(j2, "processor_not_ready");
            return;
        }
        c1818084p.A03(j2, "processing_center_frame");
        List A1Q = AbstractC16960so.A1Q(new C9VE(str), new C9VD(j));
        List singletonList = Collections.singletonList("CONCEPT_SCORES");
        C14360o3.A07(singletonList);
        c1817984o.A00(c193118gr.A03(new ACP(singletonList), A1Q, new C207049Ej(j2, c1817984o, 0)), str, j2);
    }

    public final List A04() {
        String str;
        ArrayList A05 = ((C84B) this.A02.A03.getValue()).A05();
        if (!A05.isEmpty()) {
            HashMap hashMap = this.A04;
            ClipSegment A03 = AbstractC115515Kl.A03((AbstractC115485Ki) A05.get(0));
            if (A03 instanceof ClipSegment.PhotoSegment) {
                str = ((ClipSegment.PhotoSegment) A03).A05;
            } else {
                str = ((ClipSegment.VideoSegment) A03).A0E;
            }
            List list = (List) hashMap.get(str);
            if (list != null) {
                return list;
            }
            return null;
        }
        return null;
    }
}
