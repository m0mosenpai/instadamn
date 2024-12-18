package X;

import java.util.Iterator;

/* loaded from: classes9.dex */
public final class NY3 extends AbstractC153816vq {
    public final HKK A00;

    public NY3(HKK hkk, boolean z) {
        super(true, z);
        this.A00 = hkk;
    }

    @Override // X.AbstractC153816vq
    /* renamed from: A04, reason: merged with bridge method [inline-methods] */
    public final AbstractC52514NLh A00(InterfaceC57960Pn6 interfaceC57960Pn6) {
        C14360o3.A0B(interfaceC57960Pn6, 0);
        Iterator A04 = this.A00.A04();
        while (A04.hasNext()) {
            AbstractC127945qN abstractC127945qN = (AbstractC127945qN) A04.next();
            C14360o3.A0C(abstractC127945qN, "null cannot be cast to non-null type com.instagram.mediakit.ui.definition.picker.MediaKitGridItemModel");
            AbstractC52514NLh abstractC52514NLh = (AbstractC52514NLh) abstractC127945qN;
            if (C14360o3.A0K(abstractC52514NLh.A02.getId(), interfaceC57960Pn6.getId())) {
                return abstractC52514NLh;
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0045, code lost:
    
        if (r7 != null) goto L18;
     */
    @Override // X.AbstractC153816vq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ void A02(X.InterfaceC154036wC r7, java.lang.Object r8, java.lang.String r9) {
        /*
            r6 = this;
            X.Pn6 r8 = (X.InterfaceC57960Pn6) r8
            X.NLh r7 = (X.AbstractC52514NLh) r7
            r5 = 0
            r4 = 1
            X.C14360o3.A0B(r8, r4)
            java.util.LinkedHashMap r2 = r6.A02
            boolean r0 = r2.containsKey(r9)
            if (r0 == 0) goto L3f
            java.lang.Object r1 = r2.remove(r9)
            X.NLh r1 = (X.AbstractC52514NLh) r1
            r3 = 0
            if (r1 == 0) goto L1e
            r0 = -1
            r1.EdT(r5, r0)
        L1e:
            java.util.Iterator r2 = X.AbstractC167017dG.A0t(r2)
        L22:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L53
            java.lang.Object r1 = r2.next()
            int r0 = r3 + 1
            if (r3 >= 0) goto L38
            X.AbstractC16960so.A1U()
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        L38:
            X.NLh r1 = (X.AbstractC52514NLh) r1
            r1.EdT(r4, r0)
            r3 = r0
            goto L22
        L3f:
            X.NLh r0 = r6.A00(r8)
            if (r0 != 0) goto L5b
            if (r7 == 0) goto L53
        L47:
            int r0 = r2.size()
            int r0 = r0 + 1
            r7.EdT(r4, r0)
            r2.put(r9, r7)
        L53:
            X.6vm r0 = r6.A00
            if (r0 == 0) goto L5a
            r0.update()
        L5a:
            return
        L5b:
            r7 = r0
            goto L47
        */
        throw new UnsupportedOperationException("Method not decompiled: X.NY3.A02(X.6wC, java.lang.Object, java.lang.String):void");
    }
}
