package com.instagram.direct.wellbeing.safetyecosystem.contentfilter.dictionary;

import X.AbstractC12290kX;
import X.AbstractC23641Du;
import X.AbstractC28241Yh;
import X.AnonymousClass139;
import X.AnonymousClass191;
import X.AnonymousClass194;
import X.C05F;
import X.C12L;
import X.C12N;
import X.C14090nZ;
import X.C14360o3;
import X.C19L;
import X.C1YZ;
import X.C1Yc;
import X.C1Ye;
import X.C2043692r;
import X.C2044092w;
import X.C9DH;
import X.InterfaceC13000lm;
import X.InterfaceC2044192x;
import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.direct.wellbeing.safetyecosystem.contentfilter.dictionary.ContentFilterDictionaryImpl;
import com.instagram.direct.wellbeing.safetyecosystem.contentfilter.dictionary.ContentFilterDictionaryRegistrar;
import com.instagram.direct.wellbeing.safetyecosystem.contentfilter.dictionary.database.ContentFilterDictionaryDatabase;
import com.instagram.direct.wellbeing.safetyecosystem.contentfilter.dictionary.sync.ContentFilterDictionarySyncManager;
import com.instagram.roomdb.IgRoomDatabase;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes4.dex */
public final class ContentFilterDictionaryRegistrar implements InterfaceC13000lm {
    public final C12N A00;
    public final UserSession A01;
    public final C14090nZ A02;
    public final C14090nZ A03;
    public final C2044092w A04;
    public final ContentFilterDictionaryDatabase A05;
    public final ContentFilterDictionarySyncManager A06;
    public final Map A07;
    public final Map A08;
    public final Set A09;
    public final Set A0A;
    public final ConcurrentHashMap A0B;
    public final ConcurrentHashMap A0C;
    public final ConcurrentHashMap A0D;
    public final ConcurrentHashMap A0E;
    public final C19L A0F;
    public final AnonymousClass139 A0G;
    public final AnonymousClass139 A0H;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v8, types: [X.92w, java.lang.Object] */
    public /* synthetic */ ContentFilterDictionaryRegistrar(UserSession userSession) {
        ContentFilterDictionarySyncManager contentFilterDictionarySyncManager = new ContentFilterDictionarySyncManager(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 7);
        C2043692r c2043692r = ContentFilterDictionaryDatabase.A00;
        IgRoomDatabase igRoomDatabase = (IgRoomDatabase) userSession.A00(ContentFilterDictionaryDatabase.class);
        if (igRoomDatabase == null) {
            synchronized (c2043692r) {
                igRoomDatabase = (IgRoomDatabase) userSession.A00(ContentFilterDictionaryDatabase.class);
                if (igRoomDatabase == null) {
                    Context context = AbstractC12290kX.A00;
                    C14360o3.A07(context);
                    C1Ye A00 = C1Yc.A00(context, ContentFilterDictionaryDatabase.class, C1YZ.A00(userSession, c2043692r));
                    AbstractC28241Yh.A00(A00, 266555918, 1438706234, false);
                    A00.A01();
                    igRoomDatabase = (IgRoomDatabase) A00.A00();
                    userSession.A04(ContentFilterDictionaryDatabase.class, igRoomDatabase);
                }
            }
        }
        ContentFilterDictionaryDatabase contentFilterDictionaryDatabase = (ContentFilterDictionaryDatabase) igRoomDatabase;
        C12L c12l = C12L.A00;
        C14360o3.A0B(contentFilterDictionaryDatabase, 3);
        C14360o3.A0B(c12l, 4);
        this.A01 = userSession;
        this.A06 = contentFilterDictionarySyncManager;
        this.A05 = contentFilterDictionaryDatabase;
        this.A00 = c12l;
        this.A08 = new LinkedHashMap();
        this.A07 = new LinkedHashMap();
        this.A0A = new LinkedHashSet();
        this.A0D = new ConcurrentHashMap();
        this.A0B = new ConcurrentHashMap();
        this.A0E = new ConcurrentHashMap();
        this.A0C = new ConcurrentHashMap();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        this.A09 = linkedHashSet;
        ?? r0 = new InterfaceC2044192x() { // from class: X.92w
            @Override // X.InterfaceC2044192x
            public final Object DXp(ContentFilterDictionaryImpl contentFilterDictionaryImpl, List list, List list2, InterfaceC23621Ds interfaceC23621Ds) {
                ContentFilterDictionaryRegistrar contentFilterDictionaryRegistrar = ContentFilterDictionaryRegistrar.this;
                C19L c19l = contentFilterDictionaryRegistrar.A0F;
                C9DW c9dw = new C9DW(contentFilterDictionaryImpl, contentFilterDictionaryRegistrar, list, list2, null, 1);
                AbstractC23641Du.A03(C05F.A00, AnonymousClass191.A00, c9dw, c19l);
                return C0eB.A00;
            }

            @Override // X.InterfaceC2044192x
            public final Object DAB(ContentFilterDictionaryImpl contentFilterDictionaryImpl, InterfaceC23621Ds interfaceC23621Ds) {
                return C0eB.A00;
            }

            @Override // X.InterfaceC2044192x
            public final Object DAD(ContentFilterDictionaryImpl contentFilterDictionaryImpl, InterfaceC23621Ds interfaceC23621Ds) {
                return C0eB.A00;
            }

            @Override // X.InterfaceC2044192x
            public final Object DAH(ContentFilterDictionaryImpl contentFilterDictionaryImpl, InterfaceC23621Ds interfaceC23621Ds) {
                return C0eB.A00;
            }
        };
        this.A04 = r0;
        linkedHashSet.add(r0);
        this.A0F = AnonymousClass194.A02(c12l.AOT(1304292585, 3));
        this.A02 = c12l.AOT(1304292585, 3);
        this.A03 = c12l.AOT(1055497132, 3);
        this.A0H = new AnonymousClass139();
        this.A0G = new AnonymousClass139();
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x004c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A00(com.instagram.direct.wellbeing.safetyecosystem.contentfilter.dictionary.ContentFilterDictionaryRegistrar r6, java.util.List r7, X.InterfaceC23621Ds r8) {
        /*
            r3 = 33
            boolean r0 = X.C9CY.A00(r8, r3)
            if (r0 == 0) goto L4d
            r5 = r8
            X.9CY r5 = (X.C9CY) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L4d
            int r2 = r2 - r1
            r5.A00 = r2
        L16:
            java.lang.Object r4 = r5.A02
            X.1JX r3 = X.C1JX.A02
            int r2 = r5.A00
            r1 = 2
            r0 = 1
            if (r2 == 0) goto L2a
            if (r2 == r0) goto L38
            if (r2 != r1) goto L53
            X.AbstractC09560e7.A00(r4)
        L27:
            X.0eB r3 = X.C0eB.A00
            return r3
        L2a:
            X.AbstractC09560e7.A00(r4)
            r5.A01 = r6
            r5.A00 = r0
            java.lang.Object r4 = A01(r6, r7, r5)
            if (r4 != r3) goto L3f
            return r3
        L38:
            java.lang.Object r6 = r5.A01
            com.instagram.direct.wellbeing.safetyecosystem.contentfilter.dictionary.ContentFilterDictionaryRegistrar r6 = (com.instagram.direct.wellbeing.safetyecosystem.contentfilter.dictionary.ContentFilterDictionaryRegistrar) r6
            X.AbstractC09560e7.A00(r4)
        L3f:
            java.util.Map r4 = (java.util.Map) r4
            r0 = 0
            r5.A01 = r0
            r5.A00 = r1
            java.lang.Object r0 = A02(r6, r4, r5)
            if (r0 != r3) goto L27
            return r3
        L4d:
            X.9CY r5 = new X.9CY
            r5.<init>(r6, r8, r3)
            goto L16
        L53:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.direct.wellbeing.safetyecosystem.contentfilter.dictionary.ContentFilterDictionaryRegistrar.A00(com.instagram.direct.wellbeing.safetyecosystem.contentfilter.dictionary.ContentFilterDictionaryRegistrar, java.util.List, X.1Ds):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000f, code lost:
    
        if (((X.C206529Cj) r29).A06 != 1) goto L6;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00b5 A[Catch: all -> 0x01aa, TryCatch #0 {all -> 0x01aa, blocks: (B:14:0x0085, B:15:0x00af, B:17:0x00b5, B:20:0x00c3, B:25:0x0101, B:26:0x0105, B:28:0x010b, B:31:0x0119, B:36:0x011f, B:37:0x0123, B:39:0x0129, B:42:0x0137, B:45:0x013f, B:47:0x014e, B:48:0x0152, B:50:0x0158, B:52:0x0166, B:54:0x016c, B:56:0x0172, B:58:0x017c, B:64:0x019b, B:68:0x0185), top: B:13:0x0085 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x010b A[Catch: all -> 0x01aa, TryCatch #0 {all -> 0x01aa, blocks: (B:14:0x0085, B:15:0x00af, B:17:0x00b5, B:20:0x00c3, B:25:0x0101, B:26:0x0105, B:28:0x010b, B:31:0x0119, B:36:0x011f, B:37:0x0123, B:39:0x0129, B:42:0x0137, B:45:0x013f, B:47:0x014e, B:48:0x0152, B:50:0x0158, B:52:0x0166, B:54:0x016c, B:56:0x0172, B:58:0x017c, B:64:0x019b, B:68:0x0185), top: B:13:0x0085 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0129 A[Catch: all -> 0x01aa, TryCatch #0 {all -> 0x01aa, blocks: (B:14:0x0085, B:15:0x00af, B:17:0x00b5, B:20:0x00c3, B:25:0x0101, B:26:0x0105, B:28:0x010b, B:31:0x0119, B:36:0x011f, B:37:0x0123, B:39:0x0129, B:42:0x0137, B:45:0x013f, B:47:0x014e, B:48:0x0152, B:50:0x0158, B:52:0x0166, B:54:0x016c, B:56:0x0172, B:58:0x017c, B:64:0x019b, B:68:0x0185), top: B:13:0x0085 }] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A01(com.instagram.direct.wellbeing.safetyecosystem.contentfilter.dictionary.ContentFilterDictionaryRegistrar r27, java.util.List r28, X.InterfaceC23621Ds r29) {
        /*
            Method dump skipped, instructions count: 432
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.direct.wellbeing.safetyecosystem.contentfilter.dictionary.ContentFilterDictionaryRegistrar.A01(com.instagram.direct.wellbeing.safetyecosystem.contentfilter.dictionary.ContentFilterDictionaryRegistrar, java.util.List, X.1Ds):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0126 A[Catch: all -> 0x01a2, TryCatch #0 {all -> 0x01a2, blocks: (B:11:0x011c, B:13:0x0126, B:15:0x012f, B:18:0x0139), top: B:10:0x011c }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v3, types: [java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:69:0x0119 -> B:10:0x011c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A02(com.instagram.direct.wellbeing.safetyecosystem.contentfilter.dictionary.ContentFilterDictionaryRegistrar r14, java.util.Map r15, X.InterfaceC23621Ds r16) {
        /*
            Method dump skipped, instructions count: 427
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.direct.wellbeing.safetyecosystem.contentfilter.dictionary.ContentFilterDictionaryRegistrar.A02(com.instagram.direct.wellbeing.safetyecosystem.contentfilter.dictionary.ContentFilterDictionaryRegistrar, java.util.Map, X.1Ds):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A03(com.instagram.direct.wellbeing.safetyecosystem.contentfilter.dictionary.ContentFilterDictionaryImpl r7, X.InterfaceC2043492k r8, X.InterfaceC23621Ds r9) {
        /*
            r6 = this;
            r3 = 14
            boolean r0 = X.C9CX.A00(r9, r3)
            if (r0 == 0) goto L69
            r4 = r9
            X.9CX r4 = (X.C9CX) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L69
            int r2 = r2 - r1
            r4.A00 = r2
        L16:
            java.lang.Object r1 = r4.A01
            X.1JX r3 = X.C1JX.A02
            int r0 = r4.A00
            r5 = 1
            if (r0 == 0) goto L2c
            if (r0 != r5) goto L71
            X.AbstractC09560e7.A00(r1)
        L24:
            X.0eB r0 = X.C0eB.A00
            X.3NX r3 = new X.3NX
            r3.<init>(r0)
            return r3
        L2c:
            X.AbstractC09560e7.A00(r1)
            java.util.Map r1 = r6.A07
            X.92h r0 = r8.Anx()
            boolean r0 = r1.containsKey(r0)
            if (r0 == 0) goto L4d
            if (r7 == 0) goto L4d
            java.util.concurrent.ConcurrentHashMap r0 = r6.A0C
            java.lang.Object r0 = r0.get(r8)
            java.util.Set r0 = (java.util.Set) r0
            if (r0 == 0) goto L58
            boolean r0 = r0.contains(r7)
            if (r0 != 0) goto L58
        L4d:
            X.A0r r0 = new X.A0r
            r0.<init>()
            X.8jk r3 = new X.8jk
            r3.<init>(r0)
            return r3
        L58:
            X.0nZ r2 = r6.A03
            r1 = 0
            X.9DW r0 = new X.9DW
            r0.<init>(r7, r6, r8, r1)
            r4.A00 = r5
            java.lang.Object r0 = X.AbstractC23641Du.A00(r4, r2, r0)
            if (r0 != r3) goto L24
            return r3
        L69:
            r0 = 42
            X.9CX r4 = new X.9CX
            r4.<init>(r6, r9, r3, r0)
            goto L16
        L71:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.direct.wellbeing.safetyecosystem.contentfilter.dictionary.ContentFilterDictionaryRegistrar.A03(com.instagram.direct.wellbeing.safetyecosystem.contentfilter.dictionary.ContentFilterDictionaryImpl, X.92k, X.1Ds):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A04(X.InterfaceC2043492k r8, X.InterfaceC23621Ds r9, boolean r10) {
        /*
            r7 = this;
            r3 = 26
            boolean r0 = X.C206459Cc.A00(r9, r3)
            if (r0 == 0) goto L87
            r6 = r9
            X.9Cc r6 = (X.C206459Cc) r6
            int r2 = r6.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L87
            int r2 = r2 - r1
            r6.A00 = r2
        L16:
            java.lang.Object r1 = r6.A03
            X.1JX r5 = X.C1JX.A02
            int r0 = r6.A00
            r4 = 1
            if (r0 == 0) goto L3a
            if (r0 != r4) goto L8d
            java.lang.Object r8 = r6.A02
            java.lang.Object r0 = r6.A01
            com.instagram.direct.wellbeing.safetyecosystem.contentfilter.dictionary.ContentFilterDictionaryRegistrar r0 = (com.instagram.direct.wellbeing.safetyecosystem.contentfilter.dictionary.ContentFilterDictionaryRegistrar) r0
            X.AbstractC09560e7.A00(r1)
        L2a:
            java.util.concurrent.ConcurrentHashMap r0 = r0.A0C
            java.lang.Object r1 = r0.get(r8)
            if (r1 != 0) goto L34
            X.0sj r1 = X.C16910sj.A00
        L34:
            X.3NX r0 = new X.3NX
            r0.<init>(r1)
            return r0
        L3a:
            X.AbstractC09560e7.A00(r1)
            java.util.Map r1 = r7.A07
            X.92h r0 = r8.Anx()
            boolean r0 = r1.containsKey(r0)
            if (r0 != 0) goto L54
            X.A0r r1 = new X.A0r
            r1.<init>()
            X.8jk r0 = new X.8jk
            r0.<init>(r1)
            return r0
        L54:
            java.util.Set r0 = r7.A0A
            boolean r0 = r0.contains(r8)
            if (r0 == 0) goto L6e
            if (r10 != 0) goto L6e
            java.util.concurrent.ConcurrentHashMap r0 = r7.A0C
            java.lang.Object r1 = r0.get(r8)
            if (r1 != 0) goto L68
            X.0sj r1 = X.C16910sj.A00
        L68:
            X.3NX r0 = new X.3NX
            r0.<init>(r1)
            return r0
        L6e:
            X.0nZ r3 = r7.A02
            r2 = 0
            r1 = 43
            X.9DH r0 = new X.9DH
            r0.<init>(r7, r2, r1)
            r6.A01 = r7
            r6.A02 = r8
            r6.A00 = r4
            java.lang.Object r0 = X.AbstractC23641Du.A00(r6, r3, r0)
            if (r0 != r5) goto L85
            return r5
        L85:
            r0 = r7
            goto L2a
        L87:
            X.9Cc r6 = new X.9Cc
            r6.<init>(r7, r9, r3)
            goto L16
        L8d:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.direct.wellbeing.safetyecosystem.contentfilter.dictionary.ContentFilterDictionaryRegistrar.A04(X.92k, X.1Ds, boolean):java.lang.Object");
    }

    @Override // X.InterfaceC13000lm
    public final void onSessionWillEnd() {
        C19L c19l = this.A0F;
        C9DH c9dh = new C9DH(this, null, 44);
        AbstractC23641Du.A03(C05F.A00, AnonymousClass191.A00, c9dh, c19l);
    }
}
