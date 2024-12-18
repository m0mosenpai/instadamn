package com.facebook.quickpromotion.sdk.fetcher.ondemand;

import X.AnonymousClass496;
import X.AnonymousClass497;
import X.C05F;
import X.C14360o3;
import X.C918349l;
import X.C9CB;
import com.google.common.collect.ImmutableList;
import com.instagram.quickpromotion.intf.QuickPromotionSurface;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class OnDemandSurfaceTriggerCache {
    public boolean A02;
    public long A03;
    public final C9CB A05;
    public final AnonymousClass497 A06;
    public final C918349l A07;
    public final String A08;
    public ImmutableList A00 = ImmutableList.of();
    public final ArrayList A04 = new ArrayList();
    public Integer A01 = C05F.A00;

    /* JADX WARN: Can't wrap try/catch for region: R(12:1|(2:3|(12:5|6|7|(1:(2:10|11)(2:48|49))(3:50|51|(1:53))|12|13|(1:15)|16|(3:18|(1:23)|22)|ab|36|37))|56|6|7|(0)(0)|12|13|(0)|16|(0)|ab) */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0070, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0071, code lost:
    
        r6 = new X.C09540e5(r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00ac A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A01(X.C918449m r12, com.facebook.quickpromotion.sdk.fetcher.ondemand.OnDemandSurfaceTriggerCache r13, java.lang.Object r14, X.InterfaceC23621Ds r15, boolean r16) {
        /*
            Method dump skipped, instructions count: 249
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.quickpromotion.sdk.fetcher.ondemand.OnDemandSurfaceTriggerCache.A01(X.49m, com.facebook.quickpromotion.sdk.fetcher.ondemand.OnDemandSurfaceTriggerCache, java.lang.Object, X.1Ds, boolean):java.lang.Object");
    }

    public static final boolean A02(OnDemandSurfaceTriggerCache onDemandSurfaceTriggerCache, boolean z) {
        long j;
        if (z) {
            return true;
        }
        long j2 = onDemandSurfaceTriggerCache.A03;
        if (j2 == 0) {
            return true;
        }
        long now = onDemandSurfaceTriggerCache.A06.A01.now();
        String str = onDemandSurfaceTriggerCache.A05.A02;
        C14360o3.A0B(str, 0);
        if (str.equals(String.valueOf(QuickPromotionSurface.A0B.A00))) {
            j = AnonymousClass496.A01;
        } else {
            j = AnonymousClass496.A00;
        }
        return now > j2 + j;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(15:1|(1:3)|91|(2:6|(11:8|9|10|(1:(1:(8:14|15|16|17|18|(1:20)|17f|37)(2:46|47))(2:48|49))(11:65|66|(1:68)|69|70|71|(2:73|74)|76|(1:78)|79|(2:81|(1:83))(2:84|85))|50|51|(1:53)|54|(1:56)(1:64)|(6:58|59|(1:61)|17|18|(0))|17f))|90|9|10|(0)(0)|50|51|(0)|54|(0)(0)|(0)|17f) */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0013, code lost:
    
        if (((X.C206499Cg) r19).A06 != 0) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x00ec, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x00ed, code lost:
    
        r7 = new X.C09540e5(r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0180 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x012b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A00(X.C918449m r16, com.facebook.quickpromotion.sdk.fetcher.ondemand.OnDemandSurfaceTriggerCache r17, java.lang.Object r18, X.InterfaceC23621Ds r19, boolean r20) {
        /*
            Method dump skipped, instructions count: 449
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.quickpromotion.sdk.fetcher.ondemand.OnDemandSurfaceTriggerCache.A00(X.49m, com.facebook.quickpromotion.sdk.fetcher.ondemand.OnDemandSurfaceTriggerCache, java.lang.Object, X.1Ds, boolean):java.lang.Object");
    }

    public OnDemandSurfaceTriggerCache(C9CB c9cb, AnonymousClass497 anonymousClass497, C918349l c918349l, String str) {
        this.A05 = c9cb;
        this.A07 = c918349l;
        this.A06 = anonymousClass497;
        this.A08 = str;
    }
}
