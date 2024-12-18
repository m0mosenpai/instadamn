package X;

import android.os.Build;
import com.facebook.common.dextricks.Constants;
import com.facebook.videolite.transcoder.base.composition.MediaComposition;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes11.dex */
public abstract class W6S {
    public static ArrayList A01(U7W u7w) {
        String str;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Integer num : C05F.A00(3)) {
            switch (num.intValue()) {
                case 1:
                    str = "Main";
                    break;
                case 2:
                    str = "Baseline";
                    break;
                default:
                    str = "High";
                    break;
            }
            arrayList2.add(C70124W5f.A00(str));
        }
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            C70124W5f c70124W5f = (C70124W5f) it.next();
            if (u7w.A18() && c70124W5f != null) {
                List asList = Arrays.asList(8, 2);
                int i = c70124W5f.A03;
                if (AbstractC31175DnJ.A1U(i, asList)) {
                    C70124W5f c70124W5f2 = new C70124W5f(c70124W5f.A04, i, c70124W5f.A02, true, false);
                    c70124W5f2.A00 = u7w.A0c();
                    arrayList.add(c70124W5f2);
                }
            }
            arrayList.add(c70124W5f);
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0051 A[LOOP:0: B:11:0x004b->B:13:0x0051, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.ArrayList A02(X.U7W r5, int r6, int r7, boolean r8) {
        /*
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            if (r8 == 0) goto L27
            boolean r0 = r5.A12()
            if (r0 == 0) goto L47
            boolean r0 = r5.A16()
            r2 = r0 ^ 1
            r1 = 1
            java.lang.String r4 = "EncoderCheck"
            X.VE8 r0 = X.VE8.CODEC_VIDEO_HEVC     // Catch: java.lang.RuntimeException -> L3c
            java.util.HashSet r0 = X.W8P.A00(r0, r6, r7, r2, r1)     // Catch: java.lang.RuntimeException -> L3c
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.RuntimeException -> L3c
            r1.<init>(r0)     // Catch: java.lang.RuntimeException -> L3c
            goto L47
        L27:
            boolean r0 = r5.A1D()
            r2 = r0 ^ 1
            r1 = 0
            java.lang.String r4 = "EncoderCheck"
            X.VE8 r0 = X.VE8.CODEC_VIDEO_HEVC     // Catch: java.lang.RuntimeException -> L3c
            java.util.HashSet r0 = X.W8P.A00(r0, r6, r7, r2, r1)     // Catch: java.lang.RuntimeException -> L3c
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.RuntimeException -> L3c
            r1.<init>(r0)     // Catch: java.lang.RuntimeException -> L3c
            goto L47
        L3c:
            r1 = move-exception
            java.lang.String r0 = "hevc support check error"
            X.C0K8.A0G(r4, r0, r1)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
        L47:
            java.util.Iterator r1 = r1.iterator()
        L4b:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L58
            X.AbstractC58318PtA.A1W(r3, r1)
            r5.A17()
            goto L4b
        L58:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.W6S.A02(X.U7W, int, int, boolean):java.util.ArrayList");
    }

    public static ArrayList A00(MYB myb, MediaComposition mediaComposition, U7W u7w, Boolean bool) {
        ArrayList arrayList;
        if (bool.booleanValue()) {
            return A01(u7w);
        }
        ArrayList arrayList2 = new ArrayList();
        boolean z = false;
        if (AbstractC66047Tyk.A03(myb, mediaComposition, new int[]{7})) {
            boolean z2 = true;
            if (AbstractC66047Tyk.A04(EnumC1125356h.VIDEO, mediaComposition)) {
                z2 = false;
            }
            if (z2) {
                z = true;
            }
        }
        if (z) {
            arrayList2.addAll(A02(u7w, 2, Constants.LOAD_RESULT_DEX2OAT_TRY_PERIODIC_PGO_COMP_ATTEMPTED, true));
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 29 && AbstractC66047Tyk.A03(myb, mediaComposition, new int[]{6})) {
            boolean z3 = true;
            if (AbstractC66047Tyk.A04(EnumC1125356h.VIDEO, mediaComposition)) {
                z3 = false;
            }
            if (z3 && u7w.A13()) {
                arrayList2.addAll(A02(u7w, 2, Constants.LOAD_RESULT_DEX2OAT_TRY_PERIODIC_PGO_COMP_ATTEMPTED, u7w.A14()));
            }
        }
        if (i >= 29 && u7w.A0r()) {
            Iterator it = Arrays.asList(Integer.valueOf(C3OO.FLAG_MOVED), 1024, 512, 128, 64, 32, 8).iterator();
            while (it.hasNext()) {
                try {
                    arrayList = new ArrayList(W8P.A00(VE8.CODEC_VIDEO_AV1, 1, AbstractC167007dF.A0B(it), true, false));
                } catch (RuntimeException e) {
                    C0K8.A0G("EncoderCheck", "hevc support check error", e);
                    arrayList = new ArrayList();
                }
                arrayList2.addAll(arrayList);
            }
        }
        Iterator it2 = Arrays.asList(1024, 256, 64, 16).iterator();
        while (it2.hasNext()) {
            arrayList2.addAll(A02(u7w, 1, AbstractC167007dF.A0B(it2), false));
        }
        arrayList2.addAll(A01(u7w));
        return arrayList2;
    }
}
