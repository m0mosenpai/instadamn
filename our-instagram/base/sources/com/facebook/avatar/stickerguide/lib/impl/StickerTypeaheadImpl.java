package com.facebook.avatar.stickerguide.lib.impl;

import X.AbstractC167017dG;
import X.AnonymousClass139;
import X.C16930sl;
import X.C46492Khq;
import X.C47219Kts;
import X.C47801L9j;
import X.C47951LGk;
import X.InterfaceC50510MRn;
import com.facebook.quicklog.QuickPerformanceLogger;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes8.dex */
public final class StickerTypeaheadImpl {
    public List A00;
    public final C47801L9j A01;
    public final C47951LGk A02;
    public final C46492Khq A03;
    public final InterfaceC50510MRn A04;
    public final C47219Kts A05;
    public final AtomicBoolean A06;
    public final AtomicBoolean A07;
    public final AnonymousClass139 A08;
    public volatile boolean A09;

    /* JADX WARN: Removed duplicated region for block: B:19:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A00(java.lang.String r16, java.lang.String r17, X.InterfaceC23621Ds r18) {
        /*
            Method dump skipped, instructions count: 325
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.avatar.stickerguide.lib.impl.StickerTypeaheadImpl.A00(java.lang.String, java.lang.String, X.1Ds):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006c A[Catch: all -> 0x00a2, TryCatch #1 {all -> 0x00a2, blocks: (B:36:0x0068, B:38:0x006c), top: B:35:0x0068 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A01(X.InterfaceC23621Ds r13) {
        /*
            Method dump skipped, instructions count: 218
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.avatar.stickerguide.lib.impl.StickerTypeaheadImpl.A01(X.1Ds):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.Khq, java.lang.Object] */
    public StickerTypeaheadImpl(C47801L9j c47801L9j, InterfaceC50510MRn interfaceC50510MRn, QuickPerformanceLogger quickPerformanceLogger, List list) {
        AbstractC167017dG.A1Q(interfaceC50510MRn, quickPerformanceLogger);
        this.A04 = interfaceC50510MRn;
        this.A01 = c47801L9j;
        this.A08 = new AnonymousClass139();
        C47219Kts c47219Kts = new C47219Kts();
        this.A05 = c47219Kts;
        C16930sl c16930sl = C16930sl.A00;
        this.A02 = new C47951LGk(c16930sl);
        ?? obj = new Object();
        obj.A00 = quickPerformanceLogger;
        this.A03 = obj;
        this.A06 = new AtomicBoolean(false);
        this.A07 = new AtomicBoolean(false);
        c47219Kts.A00.addAll(list == null ? c16930sl : list);
    }
}
