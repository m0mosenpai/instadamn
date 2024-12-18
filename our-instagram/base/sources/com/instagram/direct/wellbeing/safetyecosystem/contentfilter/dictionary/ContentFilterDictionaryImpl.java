package com.instagram.direct.wellbeing.safetyecosystem.contentfilter.dictionary;

import X.AbstractC001800i;
import X.AbstractC23641Du;
import X.AbstractC25651Mw;
import X.AnonymousClass139;
import X.AnonymousClass194;
import X.C125685mF;
import X.C12N;
import X.C14090nZ;
import X.C14360o3;
import X.C16910sj;
import X.C194848jk;
import X.C19L;
import X.C25671My;
import X.EnumC124815km;
import X.EnumC124825kn;
import X.InterfaceC125665mD;
import X.InterfaceC2044192x;
import X.InterfaceC23621Ds;
import X.InterfaceC41501vz;
import com.instagram.common.session.UserSession;
import com.instagram.direct.wellbeing.safetyecosystem.contentfilter.dictionary.ContentFilterDictionaryImpl;
import com.instagram.direct.wellbeing.safetyecosystem.contentfilter.dictionary.database.ContentFilterDictionaryDatabase;
import com.instagram.direct.wellbeing.safetyecosystem.contentfilter.dictionary.sync.ContentFilterDictionarySyncManager;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* loaded from: classes3.dex */
public final class ContentFilterDictionaryImpl implements InterfaceC125665mD {
    public EnumC124825kn A00;
    public String A01;
    public boolean A02;
    public final C25671My A03;
    public final InterfaceC41501vz A04;
    public final UserSession A05;
    public final C14090nZ A06;
    public final ContentFilterDictionaryDatabase A07;
    public final ContentFilterDictionarySyncManager A08;
    public final EnumC124815km A09;
    public final String A0A;
    public final Set A0B;
    public final C19L A0C;
    public final AnonymousClass139 A0D;
    public final AnonymousClass139 A0E;
    public final boolean A0F;
    public volatile Set A0G;
    public volatile boolean A0H;

    public static final Set A00(Set set) {
        Set A0j;
        synchronized (set) {
            A0j = AbstractC001800i.A0j(set);
        }
        return A0j;
    }

    public final void A04(InterfaceC2044192x interfaceC2044192x) {
        C14360o3.A0B(interfaceC2044192x, 0);
        synchronized (this) {
            Set A0j = AbstractC001800i.A0j(this.A0G);
            A0j.add(interfaceC2044192x);
            this.A0G = A0j;
        }
    }

    public final void A05(InterfaceC2044192x interfaceC2044192x) {
        C14360o3.A0B(interfaceC2044192x, 0);
        synchronized (this) {
            Set A0j = AbstractC001800i.A0j(this.A0G);
            A0j.remove(interfaceC2044192x);
            this.A0G = A0j;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0064  */
    @Override // X.InterfaceC125665mD
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object Bbf(X.InterfaceC23621Ds r10, boolean r11) {
        /*
            r9 = this;
            r3 = 0
            boolean r0 = r10 instanceof X.C206529Cj
            if (r0 == 0) goto Lb9
            r4 = r10
            X.9Cj r4 = (X.C206529Cj) r4
            int r0 = r4.A06
            if (r0 != r3) goto Lb9
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto Lb9
            int r2 = r2 - r1
            r4.A00 = r2
        L17:
            java.lang.Object r1 = r4.A05
            X.1JX r5 = X.C1JX.A02
            int r0 = r4.A00
            r3 = 2
            r2 = 1
            if (r0 == 0) goto L64
            if (r0 == r2) goto L58
            if (r0 != r3) goto Lc0
            java.lang.Object r8 = r4.A04
            java.util.Iterator r8 = (java.util.Iterator) r8
            java.lang.Object r6 = r4.A03
            java.util.List r6 = (java.util.List) r6
            java.lang.Object r7 = r4.A02
            java.util.List r7 = (java.util.List) r7
            java.lang.Object r2 = r4.A01
            com.instagram.direct.wellbeing.safetyecosystem.contentfilter.dictionary.ContentFilterDictionaryImpl r2 = (com.instagram.direct.wellbeing.safetyecosystem.contentfilter.dictionary.ContentFilterDictionaryImpl) r2
            X.AbstractC09560e7.A00(r1)
        L38:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L55
            java.lang.Object r0 = r8.next()
            X.92x r0 = (X.InterfaceC2044192x) r0
            r4.A01 = r2
            r4.A02 = r7
            r4.A03 = r6
            r4.A04 = r8
            r4.A00 = r3
            java.lang.Object r0 = r0.DXp(r2, r7, r6, r4)
            if (r0 != r5) goto L38
        L54:
            return r5
        L55:
            java.util.Set r0 = r2.A0B
            goto L6f
        L58:
            java.lang.Object r6 = r4.A02
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.lang.Object r2 = r4.A01
            com.instagram.direct.wellbeing.safetyecosystem.contentfilter.dictionary.ContentFilterDictionaryImpl r2 = (com.instagram.direct.wellbeing.safetyecosystem.contentfilter.dictionary.ContentFilterDictionaryImpl) r2
            X.AbstractC09560e7.A00(r1)
            goto L94
        L64:
            X.AbstractC09560e7.A00(r1)
            boolean r0 = r9.A0H
            if (r0 == 0) goto L79
            if (r11 != 0) goto L79
            java.util.Set r0 = r9.A0B
        L6f:
            java.util.Set r0 = A00(r0)
            X.3NX r1 = new X.3NX
            r1.<init>(r0)
        L78:
            return r1
        L79:
            java.util.Set r0 = r9.A0B
            java.util.Set r6 = A00(r0)
            r4.A01 = r9
            r4.A02 = r6
            r4.A00 = r2
            X.0nZ r2 = r9.A06
            r1 = 0
            X.9DU r0 = new X.9DU
            r0.<init>(r9, r1, r3)
            java.lang.Object r1 = X.AbstractC23641Du.A00(r4, r2, r0)
            if (r1 == r5) goto L54
            r2 = r9
        L94:
            boolean r0 = r1 instanceof X.C194848jk
            if (r0 != 0) goto L78
            boolean r0 = r1 instanceof X.C3NX
            if (r0 == 0) goto Lc8
            java.util.Set r0 = r2.A0B
            java.util.Set r1 = A00(r0)
            java.util.Set r0 = X.AbstractC001800i.A0m(r1, r6)
            java.util.List r7 = X.AbstractC001800i.A0a(r0)
            java.util.Set r0 = X.AbstractC001800i.A0m(r6, r1)
            java.util.List r6 = X.AbstractC001800i.A0a(r0)
            java.util.Set r0 = r2.A0G
            java.util.Iterator r8 = r0.iterator()
            goto L38
        Lb9:
            X.9Cj r4 = new X.9Cj
            r4.<init>(r9, r10, r3)
            goto L17
        Lc0:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            throw r1
        Lc8:
            X.B4Z r1 = new X.B4Z
            r1.<init>()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.direct.wellbeing.safetyecosystem.contentfilter.dictionary.ContentFilterDictionaryImpl.Bbf(X.1Ds, boolean):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A01(X.InterfaceC23621Ds r8) {
        /*
            r7 = this;
            r3 = 24
            boolean r0 = X.MAK.A01(r8, r3)
            if (r0 == 0) goto L50
            r6 = r8
            X.MAK r6 = (X.MAK) r6
            int r2 = r6.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L50
            int r2 = r2 - r1
            r6.A00 = r2
        L16:
            java.lang.Object r5 = r6.A03
            X.1JX r4 = X.C1JX.A02
            int r0 = r6.A00
            r3 = 1
            if (r0 == 0) goto L45
            if (r0 != r3) goto L59
            java.lang.Object r2 = r6.A02
            java.util.Iterator r2 = (java.util.Iterator) r2
            java.lang.Object r1 = r6.A01
            com.instagram.direct.wellbeing.safetyecosystem.contentfilter.dictionary.ContentFilterDictionaryImpl r1 = (com.instagram.direct.wellbeing.safetyecosystem.contentfilter.dictionary.ContentFilterDictionaryImpl) r1
            X.AbstractC09560e7.A00(r5)
        L2c:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L56
            java.lang.Object r0 = r2.next()
            X.92x r0 = (X.InterfaceC2044192x) r0
            r6.A01 = r1
            r6.A02 = r2
            r6.A00 = r3
            java.lang.Object r0 = r0.DAB(r1, r6)
            if (r0 != r4) goto L2c
            return r4
        L45:
            X.AbstractC09560e7.A00(r5)
            java.util.Set r0 = r7.A0G
            java.util.Iterator r2 = r0.iterator()
            r1 = r7
            goto L2c
        L50:
            X.MAK r6 = new X.MAK
            r6.<init>(r7, r8, r3)
            goto L16
        L56:
            X.0eB r4 = X.C0eB.A00
            return r4
        L59:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.direct.wellbeing.safetyecosystem.contentfilter.dictionary.ContentFilterDictionaryImpl.A01(X.1Ds):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A02(X.InterfaceC23621Ds r8) {
        /*
            r7 = this;
            r3 = 24
            boolean r0 = X.C206459Cc.A00(r8, r3)
            if (r0 == 0) goto L50
            r6 = r8
            X.9Cc r6 = (X.C206459Cc) r6
            int r2 = r6.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L50
            int r2 = r2 - r1
            r6.A00 = r2
        L16:
            java.lang.Object r5 = r6.A03
            X.1JX r4 = X.C1JX.A02
            int r0 = r6.A00
            r3 = 1
            if (r0 == 0) goto L45
            if (r0 != r3) goto L59
            java.lang.Object r2 = r6.A02
            java.util.Iterator r2 = (java.util.Iterator) r2
            java.lang.Object r1 = r6.A01
            com.instagram.direct.wellbeing.safetyecosystem.contentfilter.dictionary.ContentFilterDictionaryImpl r1 = (com.instagram.direct.wellbeing.safetyecosystem.contentfilter.dictionary.ContentFilterDictionaryImpl) r1
            X.AbstractC09560e7.A00(r5)
        L2c:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L56
            java.lang.Object r0 = r2.next()
            X.92x r0 = (X.InterfaceC2044192x) r0
            r6.A01 = r1
            r6.A02 = r2
            r6.A00 = r3
            java.lang.Object r0 = r0.DAD(r1, r6)
            if (r0 != r4) goto L2c
            return r4
        L45:
            X.AbstractC09560e7.A00(r5)
            java.util.Set r0 = r7.A0G
            java.util.Iterator r2 = r0.iterator()
            r1 = r7
            goto L2c
        L50:
            X.9Cc r6 = new X.9Cc
            r6.<init>(r7, r8, r3)
            goto L16
        L56:
            X.0eB r4 = X.C0eB.A00
            return r4
        L59:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.direct.wellbeing.safetyecosystem.contentfilter.dictionary.ContentFilterDictionaryImpl.A02(X.1Ds):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A03(X.InterfaceC23621Ds r8) {
        /*
            r7 = this;
            r3 = 25
            boolean r0 = X.C206459Cc.A00(r8, r3)
            if (r0 == 0) goto L50
            r6 = r8
            X.9Cc r6 = (X.C206459Cc) r6
            int r2 = r6.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L50
            int r2 = r2 - r1
            r6.A00 = r2
        L16:
            java.lang.Object r5 = r6.A03
            X.1JX r4 = X.C1JX.A02
            int r0 = r6.A00
            r2 = 1
            if (r0 == 0) goto L45
            if (r0 != r2) goto L62
            java.lang.Object r1 = r6.A02
            java.util.Iterator r1 = (java.util.Iterator) r1
            java.lang.Object r3 = r6.A01
            com.instagram.direct.wellbeing.safetyecosystem.contentfilter.dictionary.ContentFilterDictionaryImpl r3 = (com.instagram.direct.wellbeing.safetyecosystem.contentfilter.dictionary.ContentFilterDictionaryImpl) r3
            X.AbstractC09560e7.A00(r5)
        L2c:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L56
            java.lang.Object r0 = r1.next()
            X.92x r0 = (X.InterfaceC2044192x) r0
            r6.A01 = r3
            r6.A02 = r1
            r6.A00 = r2
            java.lang.Object r0 = r0.DAH(r3, r6)
            if (r0 != r4) goto L2c
            return r4
        L45:
            X.AbstractC09560e7.A00(r5)
            java.util.Set r0 = r7.A0G
            java.util.Iterator r1 = r0.iterator()
            r3 = r7
            goto L2c
        L50:
            X.9Cc r6 = new X.9Cc
            r6.<init>(r7, r8, r3)
            goto L16
        L56:
            X.1My r2 = r3.A03
            java.lang.Class<X.5mF> r1 = X.C125685mF.class
            X.1vz r0 = r3.A04
            r2.A02(r0, r1)
            X.0eB r4 = X.C0eB.A00
            return r4
        L62:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.direct.wellbeing.safetyecosystem.contentfilter.dictionary.ContentFilterDictionaryImpl.A03(X.1Ds):java.lang.Object");
    }

    @Override // X.InterfaceC125665mD
    public final Object FBh(List list, List list2, InterfaceC23621Ds interfaceC23621Ds) {
        if (this.A02 && !this.A0F) {
            return AbstractC23641Du.A00(interfaceC23621Ds, this.A06, new ContentFilterDictionaryImpl$updatePatternsForNonVersionedDictionary$2(this, list, list2, null));
        }
        return new C194848jk(new Object());
    }

    public /* synthetic */ ContentFilterDictionaryImpl(C12N c12n, UserSession userSession, ContentFilterDictionaryDatabase contentFilterDictionaryDatabase, ContentFilterDictionarySyncManager contentFilterDictionarySyncManager, EnumC124825kn enumC124825kn, EnumC124815km enumC124815km, String str, String str2, boolean z, boolean z2) {
        C25671My A00 = AbstractC25651Mw.A00(userSession);
        C14360o3.A0B(userSession, 1);
        C14360o3.A0B(contentFilterDictionarySyncManager, 2);
        C14360o3.A0B(str, 3);
        C14360o3.A0B(str2, 4);
        C14360o3.A0B(enumC124815km, 6);
        C14360o3.A0B(enumC124825kn, 7);
        C14360o3.A0B(contentFilterDictionaryDatabase, 9);
        C14360o3.A0B(c12n, 10);
        C14360o3.A0B(A00, 11);
        this.A05 = userSession;
        this.A08 = contentFilterDictionarySyncManager;
        this.A0A = str;
        this.A01 = str2;
        this.A02 = z;
        this.A09 = enumC124815km;
        this.A00 = enumC124825kn;
        this.A0F = z2;
        this.A07 = contentFilterDictionaryDatabase;
        this.A03 = A00;
        this.A0G = C16910sj.A00;
        this.A0B = new LinkedHashSet();
        C14090nZ CPG = c12n.CPG(548458267, 3);
        this.A06 = CPG;
        this.A0C = AnonymousClass194.A02(CPG);
        this.A0E = new AnonymousClass139();
        this.A0D = new AnonymousClass139();
        InterfaceC41501vz interfaceC41501vz = new InterfaceC41501vz() { // from class: X.5mE
            @Override // X.InterfaceC41501vz
            public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
                int A03 = C0f9.A03(618042768);
                int A032 = C0f9.A03(-1905659829);
                C14360o3.A0B(obj, 0);
                ContentFilterDictionaryImpl contentFilterDictionaryImpl = ContentFilterDictionaryImpl.this;
                C19L c19l = contentFilterDictionaryImpl.A0C;
                AbstractC23641Du.A05(AnonymousClass191.A00, new MC6(contentFilterDictionaryImpl, obj, (InterfaceC23621Ds) null, 40), c19l);
                C0f9.A0A(-1124983403, A032);
                C0f9.A0A(-1690292468, A03);
            }
        };
        this.A04 = interfaceC41501vz;
        A00.A01(interfaceC41501vz, C125685mF.class);
    }
}
