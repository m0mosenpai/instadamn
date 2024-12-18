package X;

import android.text.TextUtils;
import com.facebook.videolite.transcoder.base.composition.MediaEffect;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.56m, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1125856m {
    public static final AtomicInteger A08 = new AtomicInteger();
    public final long A00;
    public final EnumC1125356h A01;
    public final String A02;
    public final HashMap A03;
    public final List A04;
    public final List A05;
    public final List A06;
    public final List A07;

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001b, code lost:
    
        if (r7.A02(r5) < 0) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A01(X.C1125456i r7, float r8) {
        /*
            r6 = this;
            r1 = 0
            int r0 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r0 > 0) goto L1d
            int r0 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r0 >= 0) goto L2e
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.MILLISECONDS
            long r1 = r7.A03(r5)
            r3 = 0
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 > 0) goto L2e
            long r1 = r7.A02(r5)
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 >= 0) goto L2e
        L1d:
            r1 = 1
        L1e:
            java.lang.String r0 = "Not supported"
            X.AbstractC1126356r.A07(r1, r0)
            java.util.List r1 = r6.A07
            X.5JJ r0 = new X.5JJ
            r0.<init>(r7, r8)
            r1.add(r0)
            return
        L2e:
            r1 = 0
            goto L1e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1125856m.A01(X.56i, float):void");
    }

    public C1125856m(EnumC1125356h enumC1125356h) {
        this(enumC1125356h, "", 0L);
    }

    public final void A00(float f) {
        this.A07.add(new C5JJ(new C1125456i(TimeUnit.SECONDS, -1L, -1L), f));
    }

    public final void A02(C1125756l c1125756l) {
        this.A04.add(c1125756l);
    }

    public final void A03(C69688VtY c69688VtY, String str) {
        try {
            MediaEffect mediaEffect = c69688VtY.A01;
            if (str != null) {
                HashMap hashMap = this.A03;
                hashMap.containsKey(str);
                hashMap.put(str, mediaEffect);
            }
            this.A05.add(c69688VtY);
        } catch (IllegalArgumentException e) {
            throw new RuntimeException(e);
        }
    }

    public C1125856m(EnumC1125356h enumC1125356h, String str, long j) {
        this.A01 = enumC1125356h;
        this.A04 = new ArrayList();
        this.A06 = new ArrayList();
        this.A07 = new ArrayList();
        this.A00 = j;
        this.A02 = TextUtils.isEmpty(str) ? Integer.toString(A08.getAndIncrement()) : str;
        this.A05 = new ArrayList();
        this.A03 = new HashMap();
    }
}
