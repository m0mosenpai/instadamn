package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Ac7, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23553Ac7 implements C2JL {
    public final List A00;
    public final List A01;
    public final boolean A02;
    public final String A03;
    public final InterfaceC16660sJ A04;
    public final /* synthetic */ C22983ABi A05;

    @Override // X.C2JL
    public final void onFailure(Throwable th) {
        C14360o3.A0B(th, 0);
        this.A05.A03.remove(this.A03);
        if (this.A02) {
            Iterator it = this.A01.iterator();
            while (it.hasNext()) {
                ((C1P1) it.next()).onFail(new C115095Ie(th));
            }
        } else {
            Iterator it2 = this.A00.iterator();
            while (it2.hasNext()) {
                ((C2JL) it2.next()).onFailure(th);
            }
        }
    }

    public C23553Ac7(C2JL c2jl, C22983ABi c22983ABi, C1P1 c1p1, String str, InterfaceC16660sJ interfaceC16660sJ) {
        this.A05 = c22983ABi;
        this.A03 = str;
        this.A04 = interfaceC16660sJ;
        this.A00 = AbstractC16960so.A1N(c2jl);
        ArrayList A1N = AbstractC16960so.A1N(c1p1);
        this.A01 = A1N;
        this.A02 = A1N.isEmpty() ^ true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0046, code lost:
    
        if (r4 != null) goto L17;
     */
    @Override // X.C2JL
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onSuccess(X.AnonymousClass436 r6) {
        /*
            r5 = this;
            if (r6 == 0) goto L65
            X.ABi r3 = r5.A05
            boolean r0 = r6 instanceof X.AnonymousClass435
            r4 = 0
            if (r0 == 0) goto L11
            r4 = r6
            java.util.Map r1 = r3.A04
            java.lang.String r0 = r5.A03
            r1.put(r0, r6)
        L11:
            boolean r0 = r5.A02
            if (r0 == 0) goto L46
            if (r4 == 0) goto L5e
            X.0sJ r0 = r5.A04
            java.lang.Object r2 = r0.invoke(r6)
            boolean r0 = r2 instanceof X.InterfaceC55612h1
            if (r0 == 0) goto L48
            if (r2 == 0) goto L48
            java.util.Map r1 = r3.A05
            java.lang.String r0 = r5.A03
            r1.put(r0, r2)
            java.util.List r0 = r5.A01
            java.util.Iterator r1 = r0.iterator()
        L30:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L5e
            java.lang.Object r0 = r1.next()
            X.1P1 r0 = (X.C1P1) r0
            r0.onSuccessInBackground(r2)
            r0.onFinish()
            r0.onSuccess(r2)
            goto L30
        L46:
            if (r4 == 0) goto L5e
        L48:
            java.util.List r0 = r5.A00
            java.util.Iterator r1 = r0.iterator()
        L4e:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L5e
            java.lang.Object r0 = r1.next()
            X.2JL r0 = (X.C2JL) r0
            r0.onSuccess(r4)
            goto L4e
        L5e:
            java.util.Map r1 = r3.A03
            java.lang.String r0 = r5.A03
            r1.remove(r0)
        L65:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C23553Ac7.onSuccess(X.436):void");
    }
}
