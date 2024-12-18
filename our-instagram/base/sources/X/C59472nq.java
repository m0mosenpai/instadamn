package X;

import android.graphics.Bitmap;

/* renamed from: X.2nq, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C59472nq extends C1W1 implements C1NJ, InterfaceC58872ml, InterfaceC58852mj {
    public EnumC59482nr A00;
    public final AbstractC27691Vx A01;
    public final C5FF A02;
    public final InterfaceC59142nF A03;

    public C59472nq(AbstractC27691Vx abstractC27691Vx, C5FF c5ff, InterfaceC59142nF interfaceC59142nF) {
        C14360o3.A0B(abstractC27691Vx, 1);
        this.A01 = abstractC27691Vx;
        this.A02 = c5ff;
        this.A03 = interfaceC59142nF;
        this.A00 = EnumC59482nr.A05;
    }

    @Override // X.C1W1
    public final /* bridge */ /* synthetic */ Object A02() {
        C1VO c1vo;
        synchronized (this) {
            C1VO c1vo2 = (C1VO) super.A02();
            if (c1vo2 != null) {
                c1vo = c1vo2.A03();
            } else {
                c1vo = null;
            }
        }
        return c1vo;
    }

    @Override // X.InterfaceC58872ml
    public final boolean CbF(InterfaceC59502nt interfaceC59502nt) {
        return true;
    }

    @Override // X.C1NJ
    public final void Cza(InterfaceC59502nt interfaceC59502nt, C73033Pe c73033Pe) {
        Bitmap bitmap;
        C14360o3.A0B(c73033Pe, 1);
        Bitmap bitmap2 = c73033Pe.A01;
        if (bitmap2 == null) {
            A09(null, null, true);
            return;
        }
        C5FF c5ff = this.A02;
        if (c5ff != null && (bitmap = (Bitmap) c5ff.A00(bitmap2, this.A01).A04()) != null) {
            bitmap2 = bitmap;
        } else {
            InterfaceC59142nF interfaceC59142nF = this.A03;
            if (interfaceC59142nF != null) {
                bitmap2 = interfaceC59142nF.renderImage(bitmap2);
            }
        }
        int i = c73033Pe.A00;
        EnumC59482nr enumC59482nr = EnumC59482nr.A03;
        String str = c73033Pe.A04;
        A09(C1VO.A00(C1VO.A05, C1VO.A06, new C3Q8(bitmap2, enumC59482nr, str, -1, i)), AbstractC16850sd.A0M(new C09530e4("LOAD_SOURCE", str)), true);
        this.A00 = enumC59482nr;
    }

    @Override // X.C1NJ
    public final void DLW(InterfaceC59502nt interfaceC59502nt, int i) {
        A05(i / 100.0f);
    }

    @Override // X.C1W1
    public final /* bridge */ /* synthetic */ void A07(Object obj) {
        C1VO.A01((C1VO) obj);
        this.A00 = EnumC59482nr.A05;
    }

    @Override // X.C1NJ
    public final void DLP(InterfaceC59502nt interfaceC59502nt, C82183lf c82183lf) {
        int i;
        EnumC82173le enumC82173le;
        if (c82183lf != null) {
            i = c82183lf.A00;
            enumC82173le = c82183lf.A01;
        } else {
            i = 0;
            enumC82173le = null;
        }
        A0A(new C46343KfR(enumC82173le, i));
    }

    @Override // X.InterfaceC58852mj
    public final void DTb(InterfaceC59502nt interfaceC59502nt, C73033Pe c73033Pe) {
        if (this.A00 == EnumC59482nr.A05) {
            Bitmap bitmap = c73033Pe.A01;
            EnumC59482nr enumC59482nr = EnumC59482nr.A04;
            C3Q8 c3q8 = new C3Q8(bitmap, enumC59482nr, c73033Pe.A04, 0, -1);
            A09(C1VO.A00(C1VO.A05, C1VO.A06, c3q8), null, false);
            this.A00 = enumC59482nr;
        }
    }

    @Override // X.InterfaceC58872ml
    public final void Dc3(InterfaceC59502nt interfaceC59502nt, C73033Pe c73033Pe, int i) {
        Bitmap bitmap = c73033Pe.A01;
        int i2 = c73033Pe.A00;
        EnumC59482nr enumC59482nr = EnumC59482nr.A06;
        C3Q8 c3q8 = new C3Q8(bitmap, enumC59482nr, c73033Pe.A04, i, i2);
        A09(C1VO.A00(C1VO.A05, C1VO.A06, c3q8), null, false);
        this.A00 = enumC59482nr;
    }
}
