package X;

import java.util.List;

/* loaded from: classes6.dex */
public final class G0E implements C11R {
    public Object A00;
    public final int A01;
    public final Object A02;

    @Override // X.C11R
    public final void onCancel() {
    }

    @Override // X.C11R
    public final void onStart() {
    }

    public G0E(int i, Object obj, Object obj2) {
        this.A01 = i;
        this.A02 = obj;
        this.A00 = obj2;
    }

    @Override // X.C11R
    public final String getName() {
        switch (this.A01) {
            case 0:
                return MSV.A00(819);
            case 1:
                return "mainChannels";
            default:
                return "IBC Chats Null State Context Lines";
        }
    }

    @Override // X.C11R
    public final int getRunnableId() {
        switch (this.A01) {
            case 0:
                return 715233643;
            case 1:
                return 567;
            default:
                return 301436582;
        }
    }

    @Override // X.C11R
    public final void onFinish() {
        C62112sC c62112sC;
        switch (this.A01) {
            case 0:
                MWH mwh = (MWH) this.A02;
                mwh.A04.A03.A00(C05F.A01);
                mwh.A06.DRX(new C115095Ie((Throwable) this.A00), mwh.A07);
                if (mwh.A08 || (c62112sC = mwh.A05) == null) {
                    return;
                }
                c62112sC.A00();
                return;
            case 1:
                C36688GFj c36688GFj = (C36688GFj) this.A02;
                c36688GFj.A01 = this.A00;
                InterfaceC169357h9 interfaceC169357h9 = c36688GFj.A04;
                interfaceC169357h9.EYJ(null);
                interfaceC169357h9.Eby(c36688GFj.A02);
                interfaceC169357h9.EYJ(c36688GFj);
                return;
            default:
                return;
        }
    }

    @Override // X.C11R
    public final void run() {
        switch (this.A01) {
            case 0:
                return;
            case 1:
                C36688GFj c36688GFj = (C36688GFj) this.A02;
                Object Bov = c36688GFj.A04.Bov();
                if (Bov == null) {
                    return;
                }
                this.A00 = c36688GFj.A03.A00(Bov);
                return;
            default:
                C36689GFk c36689GFk = (C36689GFk) this.A02;
                InterfaceC169357h9 interfaceC169357h9 = c36689GFk.A0D;
                if (!interfaceC169357h9.CXh()) {
                    interfaceC169357h9.ERL((List) this.A00);
                    interfaceC169357h9.EYJ(c36689GFk);
                }
                C36689GFk.A00(c36689GFk);
                return;
        }
    }

    public G0E(C36688GFj c36688GFj) {
        this.A01 = 1;
        this.A02 = c36688GFj;
        this.A00 = C16930sl.A00;
    }
}
