package X;

import android.content.Context;
import android.util.Pair;
import com.facebook.exoplayer.formatevaluator.configuration.AbrContextAwareConfiguration;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.2BE, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2BE {
    public C98154au A00;
    public final C2B4 A01;
    public final C2B2 A02;
    public final C2BJ A03;
    public final C2B1 A04;
    public final C2BM A05;
    public final C2BN A06;
    public final C2BN A07;
    public final C2BK A08;
    public final AbrContextAwareConfiguration A09;
    public final C2BH A0A;
    public final C2A4 A0B;
    public final C2BE A0C;
    public volatile C4B6 A0D;
    public volatile String A0E;
    public volatile C4B6[] A0F;

    public static int A00(C2BE c2be, boolean z) {
        C4B6 c4b6;
        if (z) {
            C2BE c2be2 = c2be.A0C;
            if (c2be2 != null) {
                c4b6 = c2be2.A0D;
            } else {
                c4b6 = c2be.A0D;
            }
            if (c4b6 != null) {
                return c4b6.A05;
            }
            AbstractC459729h.A01("StitchAbrEvaluator", "Didn't find a video bitrate for this audio selection", c2be.A02.A02());
        }
        return 0;
    }

    public static void A01(C98484bR c98484bR, C2BH c2bh) {
        Iterator it = c98484bR.A02.iterator();
        while (it.hasNext()) {
            c2bh.A7q((EnumC92204Ba) it.next());
        }
        for (Pair pair : c98484bR.A01) {
            c2bh.A7r((EnumC96564Vr) pair.first, (String) pair.second);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x004c, code lost:
    
        if ("inline".equals(r1) != false) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A02(X.C2BE r6, X.C4B6[] r7) {
        /*
            Method dump skipped, instructions count: 184
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2BE.A02(X.2BE, X.4B6[]):void");
    }

    public final ArrayList A03() {
        if (this.A0F == null) {
            synchronized (this.A02) {
            }
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (C4B6 c4b6 : this.A0F) {
            if (c4b6.A0N.A07 != null) {
                arrayList.add(c4b6.A0N.A07);
            }
        }
        synchronized (this.A02) {
        }
        arrayList.size();
        return arrayList;
    }

    public C2BE(Context context, C2B4 c2b4, C2B2 c2b2, C2B1 c2b1, C2BE c2be, AbrContextAwareConfiguration abrContextAwareConfiguration, C2BH c2bh, C2A4 c2a4) {
        c2b4.getClass();
        this.A01 = c2b4;
        this.A02 = c2b2;
        this.A0B = c2a4;
        c2bh = c2bh == null ? new C2BG() : c2bh;
        this.A0A = c2bh;
        this.A04 = c2b1;
        this.A0C = c2be;
        this.A03 = new C2BJ(context, c2b2, abrContextAwareConfiguration, c2a4);
        this.A09 = abrContextAwareConfiguration;
        this.A08 = new C2BK(c2b4, abrContextAwareConfiguration, c2bh, c2b2.A00());
        this.A05 = new C2BM(abrContextAwareConfiguration, c2bh);
        this.A06 = new C2BN(c2b4, abrContextAwareConfiguration, c2bh);
        this.A07 = new C2BN(c2b4, abrContextAwareConfiguration, new C2BG());
    }
}
