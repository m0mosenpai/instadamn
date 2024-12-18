package X;

import android.view.View;
import com.meta.compose.material.bottomsheet.AnchoredDraggableState;

/* renamed from: X.Cnj, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C28813Cnj implements C5E5 {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C28813Cnj(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0031  */
    @Override // X.C5E5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* synthetic */ java.lang.Object DZz(X.InterfaceC23621Ds r6, long r7, long r9) {
        /*
            r5 = this;
            int r0 = r5.A00
            if (r0 == 0) goto L52
            r3 = 2
            boolean r0 = r6 instanceof X.MA7
            if (r0 == 0) goto L47
            r4 = r6
            X.MA7 r4 = (X.MA7) r4
            int r0 = r4.A03
            if (r0 != r3) goto L47
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L47
            int r2 = r2 - r1
            r4.A00 = r2
        L1b:
            java.lang.Object r1 = r4.A02
            X.1JX r2 = X.C1JX.A02
            int r0 = r4.A00
            r3 = 1
            if (r0 == 0) goto L31
            if (r0 != r3) goto L4d
            long r9 = r4.A01
            X.AbstractC09560e7.A00(r1)
        L2b:
            X.BFb r2 = new X.BFb
            r2.<init>(r9)
            return r2
        L31:
            X.AbstractC09560e7.A00(r1)
            java.lang.Object r1 = r5.A02
            com.meta.compose.material.bottomsheet.AnchoredDraggableState r1 = (com.meta.compose.material.bottomsheet.AnchoredDraggableState) r1
            float r0 = X.AbstractC25232BEp.A00(r9)
            r4.A01 = r9
            r4.A00 = r3
            java.lang.Object r0 = r1.A07(r4, r0)
            if (r0 != r2) goto L2b
            return r2
        L47:
            X.MA7 r4 = new X.MA7
            r4.<init>(r5, r6, r3)
            goto L1b
        L4d:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        L52:
            r0 = 0
            X.BFb r2 = new X.BFb
            r2.<init>(r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C28813Cnj.DZz(X.1Ds, long, long):java.lang.Object");
    }

    @Override // X.C5E5
    public final /* synthetic */ long Da2(long j, long j2, int i) {
        if (this.A00 != 0 && i == 1) {
            AnchoredDraggableState anchoredDraggableState = (AnchoredDraggableState) this.A02;
            Object obj = this.A01;
            float A04 = anchoredDraggableState.A04(C119365at.A02(j2));
            C57F c57f = anchoredDraggableState.A03;
            float A00 = AbstractC25236BEt.A00(c57f);
            c57f.EUc(A04);
            float f = A04 - A00;
            if (obj != C6M3.Vertical) {
                f = 0.0f;
            }
            return AbstractC119395aw.A00(0.0f, f);
        }
        return 0L;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0031  */
    @Override // X.C5E5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* synthetic */ java.lang.Object Da5(X.InterfaceC23621Ds r8, long r9) {
        /*
            r7 = this;
            int r0 = r7.A00
            if (r0 == 0) goto L79
            r3 = 3
            boolean r0 = r8 instanceof X.MA7
            if (r0 == 0) goto L6e
            r4 = r8
            X.MA7 r4 = (X.MA7) r4
            int r0 = r4.A03
            if (r0 != r3) goto L6e
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L6e
            int r2 = r2 - r1
            r4.A00 = r2
        L1b:
            java.lang.Object r1 = r4.A02
            X.1JX r2 = X.C1JX.A02
            int r0 = r4.A00
            r5 = 1
            if (r0 == 0) goto L31
            if (r0 != r5) goto L74
            long r9 = r4.A01
            X.AbstractC09560e7.A00(r1)
        L2b:
            X.BFb r2 = new X.BFb
            r2.<init>(r9)
            return r2
        L31:
            X.AbstractC09560e7.A00(r1)
            float r3 = X.AbstractC25232BEp.A00(r9)
            java.lang.Object r1 = r7.A02
            com.meta.compose.material.bottomsheet.AnchoredDraggableState r1 = (com.meta.compose.material.bottomsheet.AnchoredDraggableState) r1
            float r6 = r1.A03()
            r0 = 0
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 >= 0) goto L6b
            X.CWa r0 = com.meta.compose.material.bottomsheet.AnchoredDraggableState.A01(r1)
            java.util.Map r0 = r0.A00
            java.util.Collection r0 = r0.values()
            java.lang.Float r0 = X.AbstractC001800i.A08(r0)
            if (r0 == 0) goto L68
            float r0 = r0.floatValue()
        L59:
            int r0 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r0 <= 0) goto L6b
            r4.A01 = r9
            r4.A00 = r5
            java.lang.Object r0 = r1.A07(r4, r3)
            if (r0 != r2) goto L2b
            return r2
        L68:
            r0 = -4194304(0xffffffffffc00000, float:NaN)
            goto L59
        L6b:
            r9 = 0
            goto L2b
        L6e:
            X.MA7 r4 = new X.MA7
            r4.<init>(r7, r8, r3)
            goto L1b
        L74:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        L79:
            r0 = 0
            X.BFb r2 = new X.BFb
            r2.<init>(r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C28813Cnj.Da5(X.1Ds, long):java.lang.Object");
    }

    @Override // X.C5E5
    public final long DaA(long j, int i) {
        C167637eJ c167637eJ;
        if (this.A00 != 0) {
            Object obj = this.A01;
            float A02 = C119365at.A02(j);
            if (A02 < 0.0f && i == 1) {
                AnchoredDraggableState anchoredDraggableState = (AnchoredDraggableState) this.A02;
                float A04 = anchoredDraggableState.A04(A02);
                C57F c57f = anchoredDraggableState.A03;
                float A00 = AbstractC25236BEt.A00(c57f);
                c57f.EUc(A04);
                float f = A04 - A00;
                if (obj != C6M3.Vertical) {
                    f = 0.0f;
                }
                return AbstractC119395aw.A00(0.0f, f);
            }
            return 0L;
        }
        View view = (View) this.A01;
        if (view != null) {
            AbstractC25595BTi abstractC25595BTi = (AbstractC25595BTi) this.A02;
            C011504d A002 = AbstractC009003e.A00(view);
            if (A002 != null && A002.A00.A0I(8)) {
                Object value = abstractC25595BTi.A04().A0U.getValue();
                if ((value instanceof C167637eJ) && (c167637eJ = (C167637eJ) value) != null && !c167637eJ.A0D) {
                    AbstractC13880nE.A0O(abstractC25595BTi.mView);
                    return 0L;
                }
                return 0L;
            }
            return 0L;
        }
        return 0L;
    }
}
