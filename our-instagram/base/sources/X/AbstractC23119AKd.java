package X;

import android.content.Context;
import com.facebook.videolite.transcoder.base.composition.MediaComposition;
import com.google.common.collect.ImmutableList;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.AKd, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC23119AKd {
    /* JADX WARN: Removed duplicated region for block: B:14:0x004b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002f A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.C1126256q A00(android.content.Context r16, com.instagram.common.session.UserSession r17, X.C115595Kt r18, X.C49602Pt r19, boolean r20, boolean r21, boolean r22) {
        /*
            r6 = 0
            r3 = 2
            r4 = r19
            X.C14360o3.A0B(r4, r3)
            r7 = r16
            r8 = r17
            com.instagram.creation.capture.quickcapture.cameraspec.CameraSpec r1 = X.C75I.A00(r7, r8)
            int r0 = r1.A03
            float r2 = (float) r0
            int r0 = r1.A02
            float r0 = (float) r0
            float r2 = r2 / r0
            X.0Tz r5 = X.C06090Tz.A05
            r0 = 36316233410285758(0x81056c000010be, double:3.029870470174565E-306)
            boolean r9 = X.C18U.A06(r5, r8, r0)
            java.util.ArrayList r8 = X.AbstractC166987dD.A1E()
            r5 = r18
            java.util.List r0 = r5.A03
            if (r0 == 0) goto L58
            java.util.Iterator r10 = r0.iterator()
        L2f:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L58
            java.lang.Object r1 = r10.next()
            X.5Ks r1 = (X.C115585Ks) r1
            boolean r0 = r1 instanceof X.C219789nQ
            if (r0 == 0) goto L4f
            X.9nQ r1 = (X.C219789nQ) r1
            X.8gS r0 = r1.A00
            if (r0 == 0) goto L2f
            X.AbH r0 = r0.A00(r7)
        L49:
            if (r0 == 0) goto L2f
            r8.add(r0)
            goto L2f
        L4f:
            boolean r0 = r1 instanceof X.C219779nP
            if (r0 == 0) goto L2f
            X.9nP r1 = (X.C219779nP) r1
            X.8bb r0 = r1.A00
            goto L49
        L58:
            r14 = 0
            X.8rz r10 = new X.8rz
            r10.<init>(r6)
            X.8q3 r9 = X.C198548q3.A00(r7, r9)
            X.0do r7 = r5.A06
            java.lang.Object r0 = r7.getValue()
            java.util.Collection r0 = (java.util.Collection) r0
            r1 = r21
            com.google.common.collect.ImmutableList r12 = X.AbstractC115515Kl.A02(r0, r1)
            X.47v r0 = r5.A02
            if (r0 == 0) goto Lc0
            com.google.common.collect.ImmutableList r11 = A02(r0)
            float r1 = r0.A00
        L7a:
            X.0do r0 = r5.A05
            java.lang.Object r6 = r0.getValue()
            java.util.Map r6 = (java.util.Map) r6
            if (r6 == 0) goto L9a
            java.io.File r5 = r4.C5c()
            java.lang.String r4 = "raw_karaoke_bleep.mp4"
            java.io.File r0 = new java.io.File
            r0.<init>(r5, r4)
            java.lang.String r0 = r0.getAbsolutePath()
            X.C14360o3.A07(r0)
            X.8ba r14 = A03(r0, r6)
        L9a:
            com.google.common.collect.ImmutableList r15 = com.google.common.collect.ImmutableList.copyOf(r8)
            X.C14360o3.A07(r15)
            java.lang.Object r0 = r7.getValue()
            java.util.Collection r0 = (java.util.Collection) r0
            com.google.common.collect.ImmutableList r13 = X.AbstractC115515Kl.A00(r9, r10, r0)
            r0 = 1
            X.C14360o3.A0B(r12, r0)
            X.B9C r17 = X.B9C.A00
            X.0sl r16 = X.C16930sl.A00
            r21 = r20
            r19 = r2
            r20 = r3
            r18 = r1
            X.56q r0 = X.AbstractC23120AKe.A00(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            return r0
        Lc0:
            com.google.common.collect.ImmutableList r11 = com.google.common.collect.ImmutableList.of()
            X.C14360o3.A07(r11)
            r1 = 1065353216(0x3f800000, float:1.0)
            goto L7a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC23119AKd.A00(android.content.Context, com.instagram.common.session.UserSession, X.5Kt, X.2Pt, boolean, boolean, boolean):X.56q");
    }

    public static final MediaComposition A01(Context context, UserSession userSession, C115595Kt c115595Kt, C49602Pt c49602Pt, boolean z) {
        C14360o3.A0B(userSession, 1);
        AbstractC167017dG.A1R(c49602Pt, c115595Kt);
        return new MediaComposition(A00(context, userSession, c115595Kt, c49602Pt, true, z, C18U.A06(C06090Tz.A05, userSession, 36327469044808282L)));
    }

    public static final C190168ba A03(String str, Map map) {
        C14360o3.A0B(map, 3);
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC16850sd.A0L(map.size()));
        Iterator A15 = AbstractC166997dE.A15(map);
        while (A15.hasNext()) {
            Map.Entry A1K = AbstractC166987dD.A1K(A15);
            linkedHashMap.put(AbstractC115515Kl.A03((AbstractC115485Ki) A1K.getKey()), A1K.getValue());
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(AbstractC16850sd.A0L(linkedHashMap.size()));
        Iterator A14 = AbstractC166997dE.A14(linkedHashMap);
        while (A14.hasNext()) {
            Map.Entry A1K2 = AbstractC166987dD.A1K(A14);
            Object key = A1K2.getKey();
            Iterable<C51737MtK> iterable = (Iterable) A1K2.getValue();
            ArrayList A0q = AbstractC167017dG.A0q(iterable);
            for (C51737MtK c51737MtK : iterable) {
                A0q.add(new ACZ(c51737MtK.A01, c51737MtK.A00));
            }
            linkedHashMap2.put(key, A0q);
        }
        return new C190168ba(str, linkedHashMap2);
    }

    public static final ImmutableList A02(C47v c47v) {
        C01L A1I = C0eM.A1I();
        for (C5JH c5jh : c47v.A03) {
            String str = c5jh.A05;
            float f = c5jh.A00;
            int i = c5jh.A02;
            int i2 = c5jh.A01;
            int i3 = c5jh.A03;
            C5JI c5ji = c5jh.A04;
            if (c5ji != C5JI.A09 && c5ji != C5JI.A0A) {
                C5JI c5ji2 = C5JI.A06;
                str = c5ji == c5ji2 ? c5ji2.A00 : c5jh.A06;
            }
            A1I.add(new C23013ACn(c5jh.A09, c5jh.A0A, str, str, f, c5jh.A08, i, i2, i3));
        }
        ImmutableList copyOf = ImmutableList.copyOf((Collection) C0eM.A1J(A1I));
        C14360o3.A07(copyOf);
        return copyOf;
    }
}
