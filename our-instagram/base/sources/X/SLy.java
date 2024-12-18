package X;

import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes10.dex */
public final class SLy {
    public final /* synthetic */ SCI A00;
    public final /* synthetic */ List A01;
    public final /* synthetic */ AtomicBoolean A02;

    public SLy(SCI sci, List list, AtomicBoolean atomicBoolean) {
        this.A01 = list;
        this.A02 = atomicBoolean;
        this.A00 = sci;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x005c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0044 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A00() {
        /*
            r8 = this;
            java.util.List r0 = r8.A01
            java.util.Iterator r7 = r0.iterator()
            r6 = 0
        L7:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L71
            java.lang.Object r3 = r7.next()
            X.TkO r3 = (X.InterfaceC65452TkO) r3
            X.SLL r4 = r3.C07()
            X.C14360o3.A07(r4)
            boolean r5 = r4 instanceof X.C60897RbC
            if (r5 == 0) goto L69
            r0 = r4
            X.RbC r0 = (X.C60897RbC) r0
            X.TEr r0 = r0.A00
            com.instagram.business.instantexperiences.ui.InstantExperiencesSaveAutofillDialog r2 = r0.A00
        L25:
            if (r2 == 0) goto L7
            java.util.concurrent.atomic.AtomicBoolean r0 = r8.A02
            boolean r1 = r0.get()
            boolean r0 = r4.A01
            if (r0 == 0) goto L5c
            if (r5 == 0) goto L52
            r0 = r4
            X.RbC r0 = (X.C60897RbC) r0
            X.TEr r0 = r0.A00
            com.instagram.business.instantexperiences.ui.InstantExperiencesSaveAutofillDialog r0 = r0.A00
        L3a:
            if (r0 == 0) goto L5c
            boolean r0 = r4 instanceof X.C60896RbB
            if (r1 == 0) goto L5a
            if (r0 == 0) goto L5c
        L42:
            if (r6 != 0) goto L5c
            X.SCI r0 = r8.A00
            java.util.concurrent.Executor r1 = r0.A00
            X.TLZ r0 = new X.TLZ
            r0.<init>(r2)
            r1.execute(r0)
            r6 = r3
            goto L7
        L52:
            r0 = r4
            X.RbB r0 = (X.C60896RbB) r0
            X.TEq r0 = r0.A00
            com.instagram.business.instantexperiences.ui.InstantExperiencesAutofillBar r0 = r0.A00
            goto L3a
        L5a:
            if (r0 == 0) goto L42
        L5c:
            X.SCI r0 = r8.A00
            java.util.concurrent.Executor r1 = r0.A00
            X.TLY r0 = new X.TLY
            r0.<init>(r2)
            r1.execute(r0)
            goto L7
        L69:
            r0 = r4
            X.RbB r0 = (X.C60896RbB) r0
            X.TEq r0 = r0.A00
            com.instagram.business.instantexperiences.ui.InstantExperiencesAutofillBar r2 = r0.A00
            goto L25
        L71:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.SLy.A00():void");
    }
}
