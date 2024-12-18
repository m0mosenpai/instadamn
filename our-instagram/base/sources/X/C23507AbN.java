package X;

import android.content.Context;
import android.opengl.EGLContext;
import android.os.Handler;

/* renamed from: X.AbN, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23507AbN implements InterfaceC25204BDc {
    public final Context A02;
    public final AG9 A03;
    public final InterfaceC142616cN A05;
    public final C178747wm A04 = C178747wm.A01;
    public InterfaceC179117xN A00 = null;
    public WDI A01 = null;

    @Override // X.InterfaceC25204BDc
    public final /* synthetic */ void CiT() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x008f A[LOOP:1: B:14:0x0089->B:16:0x008f, LOOP_END] */
    @Override // X.InterfaceC25204BDc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean AJF(X.WDI r21, com.facebook.videolite.transcoder.base.composition.MediaComposition r22, X.InterfaceC25205BDd r23, X.U7W r24, java.util.Map r25, int r26, int r27, int r28, int r29) {
        /*
            r20 = this;
            r6 = r20
            r4 = r21
            r6.A01 = r4
            X.7wt r12 = r23.BQp()
            X.7xF r9 = r12.BQq()
            X.56h r7 = X.EnumC1125356h.VIDEO
            r8 = r22
            java.util.HashMap r11 = r8.A07(r7)
            r11.getClass()
            r3 = 1
            java.util.Iterator r10 = X.AbstractC166997dE.A14(r11)
        L1e:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L46
            java.util.Map$Entry r0 = X.AbstractC166987dD.A1K(r10)
            java.lang.Object r0 = r0.getKey()
            int r0 = X.AbstractC166987dD.A0H(r0)
            X.80w r5 = r9.BHv(r0)
            X.80v r5 = (X.C1809380v) r5
            r0 = 0
            r5.A07 = r0
            int r2 = r4.A0C
            int r1 = r4.A0A
            X.814 r0 = new X.814
            r0.<init>(r3)
            r5.A00(r0, r2, r1)
            goto L1e
        L46:
            X.7wm r5 = r6.A04
            java.util.HashMap r1 = r8.A00
            java.lang.Object r0 = r1.get(r7)
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto La9
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto La9
            X.AZB r2 = new X.AZB
            r2.<init>(r5)
            java.lang.Object r0 = r1.get(r7)
            if (r0 == 0) goto La9
            java.lang.Object r1 = r1.get(r7)
            java.util.List r1 = (java.util.List) r1
            android.content.Context r13 = r6.A02
            X.6cN r0 = r6.A05
            X.7wE r15 = r0.B4Z()
            r15.getClass()
            r17 = r24
            r14 = r12
            r18 = r1
            r19 = r3
            r16 = r2
            X.AbstractC225399x2.A00(r13, r14, r15, r16, r17, r18, r19)
            r6.A00 = r2
        L82:
            r12.EYp(r2)
            java.util.Iterator r1 = X.AbstractC166997dE.A14(r11)
        L89:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto Laf
            java.util.Map$Entry r0 = X.AbstractC166987dD.A1K(r1)
            java.lang.Object r0 = r0.getKey()
            int r13 = X.AbstractC166987dD.A0H(r0)
            int r14 = r4.A0C
            int r15 = r4.A0A
            r16 = 0
            r17 = r14
            r18 = r15
            r12.FBm(r13, r14, r15, r16, r17, r18)
            goto L89
        La9:
            X.8ro r2 = new X.8ro
            r2.<init>(r5)
            goto L82
        Laf:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C23507AbN.AJF(X.WDI, com.facebook.videolite.transcoder.base.composition.MediaComposition, X.BDd, X.U7W, java.util.Map, int, int, int, int):boolean");
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [X.7w1, java.lang.Object] */
    @Override // X.InterfaceC25204BDc
    public final InterfaceC25205BDd AMx(EGLContext eGLContext, Handler handler, InterfaceC178837wv interfaceC178837wv, InterfaceC178897x1 interfaceC178897x1, WDI wdi, U7W u7w, Object obj) {
        InterfaceC178287w2 interfaceC178287w2;
        if (wdi.A09 == 7) {
            u7w.A1N();
        }
        C178747wm c178747wm = this.A04;
        Context context = this.A02;
        AG9 ag9 = this.A03;
        boolean z = ag9.A02;
        InterfaceC178407wE B4Z = this.A05.B4Z();
        InterfaceC178287w2 interfaceC178287w22 = ag9.A01;
        C178927x4 c178927x4 = new C178927x4(obj, 3);
        int i = 1;
        if (interfaceC178897x1 != null) {
            int AqC = interfaceC178897x1.AqC();
            if ((AqC & 256) != 0) {
                i = 257;
            }
            if ((AqC & 32) != 0) {
                i = AbstractC225059wU.A00(interfaceC178897x1, i | 32);
                if ((AqC & 8192) != 0) {
                    i |= 8192;
                }
            }
            c178927x4.A0A(interfaceC178897x1, i);
        } else {
            C14360o3.A0A(eGLContext);
            c178927x4.A09(eGLContext, 1);
        }
        C178017va c178017va = new C178017va("LiteVideoProcessor");
        C178017va.A00(c178017va, InterfaceC178107vj.A08, z);
        c178017va.A02(InterfaceC178107vj.A0I, handler);
        C178017va.A01(c178017va, interfaceC178837wv, c178927x4, obj);
        c178017va.A02(InterfaceC178107vj.A00, c178747wm);
        C23385AYj A00 = C178267w0.A00(context, c178017va);
        A00.A02((InterfaceC178287w2) new C212489bH(A00, B4Z));
        if (interfaceC178287w22 != null) {
            ((AbstractC178277w1) interfaceC178287w22).A00 = A00;
            interfaceC178287w2 = interfaceC178287w22;
        } else {
            ?? obj2 = new Object();
            obj2.A00 = A00;
            interfaceC178287w2 = obj2;
        }
        A00.A02(interfaceC178287w2);
        A00.A01(new C178797wr(A00), InterfaceC178817wt.A01);
        return new C23512AbS(A00);
    }

    @Override // X.InterfaceC25204BDc
    public final InterfaceC179117xN Bmn() {
        return this.A00;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C23507AbN(Context context, AG9 ag9) {
        this.A02 = context;
        this.A03 = ag9;
        InterfaceC142616cN interfaceC142616cN = ag9.A00;
        this.A05 = interfaceC142616cN == null ? new Object() : interfaceC142616cN;
    }
}
