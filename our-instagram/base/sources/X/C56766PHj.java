package X;

import android.view.View;
import com.facebook.forker.Process;

/* renamed from: X.PHj, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56766PHj implements InterfaceC1119153d {
    public final int A00;
    public final Object A01;

    public C56766PHj(AbstractC52562NNi abstractC52562NNi, int i) {
        this.A00 = i;
        this.A01 = abstractC52562NNi;
    }

    public static void A00(C189448aO c189448aO, Object obj, int i) {
        c189448aO.A0U = new C56766PHj(obj, i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:74:0x0150, code lost:
    
        if (r0 != null) goto L59;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, X.1vN] */
    @Override // X.InterfaceC1119153d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Czx() {
        /*
            Method dump skipped, instructions count: 494
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56766PHj.Czx():void");
    }

    @Override // X.InterfaceC1119153d
    public final void D00() {
        C141796aw A00;
        InterfaceC16620sF mBs;
        switch (this.A00) {
            case 4:
                ((P0F) this.A01).A01.A07.Egh(null);
                return;
            case 17:
                AbstractC13880nE.A0O((View) this.A01);
                return;
            case 18:
            case Process.SIGSTOP /* 19 */:
                InterfaceC09390do interfaceC09390do = ((N7N) this.A01).A06;
                OUV ouv = (OUV) ((C50896MeR) interfaceC09390do.getValue()).A00.getValue();
                if (ouv == null || !ouv.A08) {
                    return;
                }
                C9GR.A07(AbstractC12290kX.A00, 2131965188);
                AbstractC52922bZ A0Z = AbstractC25225BEi.A0Z(interfaceC09390do);
                A00 = AbstractC141776au.A00(A0Z);
                mBs = new PZK(A0Z, null, 17, false);
                break;
            case 20:
                N7N n7n = (N7N) this.A01;
                long j = n7n.A00;
                AbstractC52922bZ A0Z2 = AbstractC25225BEi.A0Z(n7n.A06);
                A00 = AbstractC141776au.A00(A0Z2);
                mBs = new MBs(A0Z2, (InterfaceC23621Ds) null, 26, j);
                break;
            default:
                return;
        }
        AbstractC166987dD.A1Z(mBs, A00);
    }

    public C56766PHj(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }
}
