package com.instagram.direct.wellbeing.safetyecosystem.contentfilter.dictionary.sync;

import X.C12L;
import X.C12N;
import X.C14090nZ;
import X.C14360o3;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class ContentFilterDictionarySyncManager {
    public final C14090nZ A00;
    public final ContentFilterDictionaryListLoader A01;
    public final ContentFilterDictionaryPatternsLoader A02;

    /* JADX WARN: Multi-variable type inference failed */
    public ContentFilterDictionarySyncManager() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 7);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A01(com.instagram.common.session.UserSession r15, java.lang.String r16, java.lang.String r17, X.InterfaceC23621Ds r18) {
        /*
            Method dump skipped, instructions count: 284
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.direct.wellbeing.safetyecosystem.contentfilter.dictionary.sync.ContentFilterDictionarySyncManager.A01(com.instagram.common.session.UserSession, java.lang.String, java.lang.String, X.1Ds):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.instagram.direct.wellbeing.safetyecosystem.contentfilter.dictionary.sync.ContentFilterDictionaryPatternsLoader, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [com.instagram.direct.wellbeing.safetyecosystem.contentfilter.dictionary.sync.ContentFilterDictionaryListLoader, java.lang.Object] */
    public /* synthetic */ ContentFilterDictionarySyncManager(C12N c12n, ContentFilterDictionaryListLoader contentFilterDictionaryListLoader, ContentFilterDictionaryPatternsLoader contentFilterDictionaryPatternsLoader, DefaultConstructorMarker defaultConstructorMarker, int i) {
        ?? obj = new Object();
        ?? obj2 = new Object();
        C12L c12l = C12L.A00;
        C14360o3.A0B(c12l, 3);
        this.A01 = obj;
        this.A02 = obj2;
        this.A00 = c12l.CPG(1880389522, 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A00(com.instagram.common.session.UserSession r8, com.instagram.direct.wellbeing.safetyecosystem.contentfilter.dictionary.sync.ContentFilterDictionarySyncManager r9, X.InterfaceC23621Ds r10) {
        /*
            r3 = 15
            boolean r0 = X.C9CX.A00(r10, r3)
            if (r0 == 0) goto L69
            r4 = r10
            X.9CX r4 = (X.C9CX) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L69
            int r2 = r2 - r1
            r4.A00 = r2
        L16:
            java.lang.Object r0 = r4.A01
            X.1JX r6 = X.C1JX.A02
            int r1 = r4.A00
            r7 = 1
            if (r1 == 0) goto L38
            if (r1 != r7) goto L77
            X.AbstractC09560e7.A00(r0)
        L24:
            r6 = r0
            boolean r1 = r0 instanceof X.C3NX
            if (r1 != 0) goto L37
            boolean r0 = r0 instanceof X.C194848jk
            if (r0 == 0) goto L71
            X.A0r r0 = new X.A0r
            r0.<init>()
            X.8jk r6 = new X.8jk
            r6.<init>(r0)
        L37:
            return r6
        L38:
            X.AbstractC09560e7.A00(r0)
            r5 = 0
            r0 = -2
            X.1Ms r2 = new X.1Ms
            r2.<init>(r8, r0)
            java.lang.Integer r0 = X.C05F.A0N
            r2.A09(r0)
            r0 = 1882(0x75a, float:2.637E-42)
            java.lang.String r0 = X.AbstractC111324zv.A00(r0)
            r2.A0B(r0)
            java.lang.Class<X.9eb> r1 = X.C214379eb.class
            java.lang.Class<X.ADy> r0 = X.C23042ADy.class
            r3 = 0
            r2.A0P(r5, r1, r0, r3)
            X.1ON r2 = r2.A0N()
            r4.A00 = r7
            r1 = 1880389522(0x70147792, float:1.8379333E29)
            r0 = 3
            java.lang.Object r0 = r2.A02(r4, r1, r0, r3)
            if (r0 != r6) goto L24
            return r6
        L69:
            r0 = 42
            X.9CX r4 = new X.9CX
            r4.<init>(r9, r10, r3, r0)
            goto L16
        L71:
            X.B4Z r1 = new X.B4Z
            r1.<init>()
            throw r1
        L77:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.direct.wellbeing.safetyecosystem.contentfilter.dictionary.sync.ContentFilterDictionarySyncManager.A00(com.instagram.common.session.UserSession, com.instagram.direct.wellbeing.safetyecosystem.contentfilter.dictionary.sync.ContentFilterDictionarySyncManager, X.1Ds):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A02(com.instagram.common.session.UserSession r9, java.lang.String r10, java.util.List r11, X.InterfaceC23621Ds r12) {
        /*
            r8 = this;
            r4 = 37
            boolean r0 = X.MAT.A03(r12, r4)
            if (r0 == 0) goto Lc9
            r3 = r12
            X.MAT r3 = (X.MAT) r3
            int r2 = r3.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto Lc9
            int r2 = r2 - r1
            r3.A00 = r2
        L16:
            java.lang.Object r1 = r3.A01
            X.1JX r4 = X.C1JX.A02
            int r0 = r3.A00
            r7 = 2
            r6 = 1
            if (r0 == 0) goto L28
            if (r0 == r6) goto L94
            if (r0 != r7) goto Ld2
            X.AbstractC09560e7.A00(r1)
        L27:
            return r1
        L28:
            X.AbstractC09560e7.A00(r1)
            java.lang.String r0 = "user_custom_dictionary_key"
            boolean r0 = r10.contentEquals(r0)
            r5 = 0
            if (r0 == 0) goto Lb7
            boolean r0 = X.AbstractC43805JYs.A03(r9)
            if (r0 == 0) goto L51
            r0 = 0
            X.C14360o3.A0B(r9, r0)
            X.C14360o3.A0B(r11, r6)
            X.5wJ r0 = new X.5wJ
            r0.<init>(r9)
            r0.A01(r11)
        L49:
            X.0eB r0 = X.C0eB.A00
            X.3NX r1 = new X.3NX
            r1.<init>(r0)
            return r1
        L51:
            r0 = -2
            X.1Ms r7 = new X.1Ms
            r7.<init>(r9, r0)
            r7.A05()
            r0 = 664(0x298, float:9.3E-43)
            java.lang.String r0 = X.AbstractC58317Pt9.A00(r0)
            r7.A0B(r0)
            java.lang.String r0 = "disable_during_creation"
            java.lang.String r1 = "true"
            r7.A9s(r0, r1)
            java.lang.String r0 = "soft_delete"
            r7.A9s(r0, r1)
            java.lang.String r1 = ", "
            java.lang.String r0 = ""
            java.lang.String r1 = X.AbstractC001800i.A0P(r1, r0, r0, r11, r5)
            java.lang.String r0 = "keywords"
            r7.A9s(r0, r1)
            java.lang.Class<X.1ul> r2 = X.C40781ul.class
            java.lang.Class<X.2hA> r1 = X.C55702hA.class
            r0 = 0
            r7.A0P(r5, r2, r1, r0)
            X.1ON r1 = r7.A0N()
            r3.A00 = r6
            r0 = 1880389522(0x70147792, float:1.8379333E29)
            java.lang.Object r1 = r1.A00(r0, r3)
            if (r1 != r4) goto L97
            return r4
        L94:
            X.AbstractC09560e7.A00(r1)
        L97:
            boolean r0 = r1 instanceof X.C3NX
            if (r0 != 0) goto La9
            boolean r0 = r1 instanceof X.C194848jk
            if (r0 == 0) goto Lda
            X.A0r r0 = new X.A0r
            r0.<init>()
            X.8jk r1 = new X.8jk
            r1.<init>(r0)
        La9:
            boolean r0 = r1 instanceof X.C3NX
            if (r0 != 0) goto L49
            boolean r0 = r1 instanceof X.C194848jk
            if (r0 != 0) goto L27
            X.B4Z r0 = new X.B4Z
            r0.<init>()
            throw r0
        Lb7:
            X.0nZ r2 = r8.A00
            r1 = 14
            X.GSB r0 = new X.GSB
            r0.<init>(r1, r5)
            r3.A00 = r7
            java.lang.Object r1 = X.AbstractC23641Du.A00(r3, r2, r0)
            if (r1 != r4) goto L27
            return r4
        Lc9:
            r0 = 42
            X.MAT r3 = new X.MAT
            r3.<init>(r8, r12, r4, r0)
            goto L16
        Ld2:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        Lda:
            X.B4Z r0 = new X.B4Z
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.direct.wellbeing.safetyecosystem.contentfilter.dictionary.sync.ContentFilterDictionarySyncManager.A02(com.instagram.common.session.UserSession, java.lang.String, java.util.List, X.1Ds):java.lang.Object");
    }
}
