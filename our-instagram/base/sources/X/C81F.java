package X;

import java.util.List;

/* renamed from: X.81F, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C81F implements InterfaceC179087xK {
    public C81G A00;
    public C180317zL A01;
    public InterfaceC180227zC A02;
    public final C178747wm A03;

    public final void A00(InterfaceC180227zC interfaceC180227zC, InterfaceC179467xw interfaceC179467xw, InterfaceC179437xt interfaceC179437xt) {
        A01(interfaceC180227zC, interfaceC179467xw, interfaceC179437xt, null, true, true, false);
    }

    public final void A02(InterfaceC180227zC interfaceC180227zC, InterfaceC179467xw interfaceC179467xw, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            this.A03.A00(EnumC200658u8.A0C);
            return;
        }
        for (int i = 0; i < size; i++) {
            A01(interfaceC180227zC, interfaceC179467xw, (InterfaceC179437xt) list.get(i), null, true, z, false);
        }
    }

    @Override // X.InterfaceC179087xK
    public final void CNk(C178907x2 c178907x2) {
    }

    @Override // X.InterfaceC179087xK
    public final void release() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0073, code lost:
    
        if (r3.A00() != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x007d, code lost:
    
        if (r2.A00() != false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x01b0, code lost:
    
        if (r4 != false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x01a7, code lost:
    
        if (r5 != false) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x019e, code lost:
    
        if (r2 == null) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x01cc, code lost:
    
        if (r2 != false) goto L71;
     */
    /* JADX WARN: Type inference failed for: r1v16, types: [X.81G, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A01(X.InterfaceC180227zC r38, X.InterfaceC179467xw r39, X.InterfaceC179437xt r40, X.AbstractC179397xp r41, boolean r42, boolean r43, boolean r44) {
        /*
            Method dump skipped, instructions count: 488
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C81F.A01(X.7zC, X.7xw, X.7xt, X.7xp, boolean, boolean, boolean):void");
    }

    @Override // X.InterfaceC179087xK
    public final void ACv(InterfaceC180227zC interfaceC180227zC) {
        InterfaceC180227zC interfaceC180227zC2 = this.A02;
        if (interfaceC180227zC2 != null && interfaceC180227zC2 != interfaceC180227zC) {
            this.A03.A00(EnumC200658u8.A02);
        }
        this.A02 = interfaceC180227zC;
        C180307zK Bmp = interfaceC180227zC.Bmp();
        if (!Bmp.A01() && this.A01 == null) {
            C178847ww c178847ww = Bmp.A01;
            C180317zL c180317zL = new C180317zL(c178847ww);
            Object obj = false;
            Object obj2 = c178847ww.A00.get(C178847ww.A08);
            if (obj2 != null) {
                obj = obj2;
            }
            c180317zL.A01 = ((Boolean) obj).booleanValue();
            this.A01 = c180317zL;
        }
    }

    @Override // X.InterfaceC179087xK
    public final void detach() {
        C180317zL c180317zL = this.A01;
        if (c180317zL != null) {
            c180317zL.A00();
            this.A01 = null;
        }
        this.A02 = null;
    }

    public C81F(C178747wm c178747wm) {
        this.A03 = c178747wm;
    }
}
