package X;

import android.view.View;
import android.widget.Magnifier;
import androidx.compose.runtime.ParcelableSnapshotMutableState;

/* renamed from: X.5EC, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5EC extends C58J implements C58L, InterfaceC113445Ag, InterfaceC114155Db, InterfaceC1129358c {
    public float A00;
    public float A01;
    public float A02;
    public long A03;
    public long A04;
    public View A05;
    public InterfaceC30900DiD A06;
    public InterfaceC31112Dlu A07;
    public InterfaceC74963Ym A08;
    public InterfaceC1128957x A09;
    public InterfaceC16660sJ A0A;
    public InterfaceC16660sJ A0B;
    public InterfaceC24731Iq A0C;
    public boolean A0D;
    public boolean A0E;
    public C119055aN A0F;
    public final InterfaceC74953Yl A0G;

    @Override // X.InterfaceC113445Ag
    public final /* synthetic */ void DRD() {
    }

    @Override // X.InterfaceC1129358c
    public final void DWO() {
        AbstractC137676Lo.A00(this, new DGT(this, 6));
    }

    private final void A00() {
        InterfaceC1128957x interfaceC1128957x;
        InterfaceC30900DiD interfaceC30900DiD = this.A06;
        if (interfaceC30900DiD != null && (interfaceC1128957x = this.A09) != null) {
            Magnifier magnifier = ((C28721CmD) interfaceC30900DiD).A00;
            long A00 = AbstractC119215ad.A00(magnifier.getWidth(), magnifier.getHeight());
            C119055aN c119055aN = this.A0F;
            if (c119055aN == null || A00 != c119055aN.A00) {
                InterfaceC16660sJ interfaceC16660sJ = this.A0A;
                if (interfaceC16660sJ != null) {
                    Magnifier magnifier2 = ((C28721CmD) interfaceC30900DiD).A00;
                    interfaceC16660sJ.invoke(new C27976CUy(interfaceC1128957x.EqJ(AbstractC119215ad.A01(AbstractC119215ad.A00(magnifier2.getWidth(), magnifier2.getHeight())))));
                }
                Magnifier magnifier3 = ((C28721CmD) interfaceC30900DiD).A00;
                this.A0F = new C119055aN(AbstractC119215ad.A00(magnifier3.getWidth(), magnifier3.getHeight()));
            }
        }
    }

    public static final void A01(C5EC c5ec) {
        InterfaceC30900DiD interfaceC30900DiD = c5ec.A06;
        if (interfaceC30900DiD != null) {
            ((C28721CmD) interfaceC30900DiD).A00.dismiss();
        }
        View view = c5ec.A05;
        if (view == null) {
            view = CBO.A00(c5ec);
        }
        c5ec.A05 = view;
        InterfaceC1128957x interfaceC1128957x = c5ec.A09;
        if (interfaceC1128957x == null) {
            interfaceC1128957x = AbstractC114335Dx.A02(c5ec).A0C;
        }
        c5ec.A09 = interfaceC1128957x;
        InterfaceC31112Dlu interfaceC31112Dlu = c5ec.A07;
        boolean z = c5ec.A0E;
        long j = c5ec.A03;
        c5ec.A06 = interfaceC31112Dlu.ALZ(view, interfaceC1128957x, c5ec.A00, c5ec.A01, c5ec.A02, j, z, c5ec.A0D);
        c5ec.A00();
    }

    public static final void A02(C5EC c5ec) {
        InterfaceC1128957x interfaceC1128957x = c5ec.A09;
        if (interfaceC1128957x == null) {
            interfaceC1128957x = AbstractC114335Dx.A02(c5ec).A0C;
            c5ec.A09 = interfaceC1128957x;
        }
        long j = ((C119365at) c5ec.A0B.invoke(interfaceC1128957x)).A00;
        if (AbstractC119395aw.A02(j)) {
            InterfaceC74963Ym interfaceC74963Ym = c5ec.A08;
            if (interfaceC74963Ym == null) {
                interfaceC74963Ym = new C113775Bp(null, new DGT(c5ec, 4));
                c5ec.A08 = interfaceC74963Ym;
            }
            if (AbstractC119395aw.A02(((C119365at) interfaceC74963Ym.getValue()).A00)) {
                InterfaceC74963Ym interfaceC74963Ym2 = c5ec.A08;
                if (interfaceC74963Ym2 == null) {
                    interfaceC74963Ym2 = new C113775Bp(null, new DGT(c5ec, 4));
                    c5ec.A08 = interfaceC74963Ym2;
                }
                c5ec.A04 = C119365at.A07(((C119365at) interfaceC74963Ym2.getValue()).A00, j);
                if (c5ec.A06 == null) {
                    A01(c5ec);
                }
                InterfaceC30900DiD interfaceC30900DiD = c5ec.A06;
                if (interfaceC30900DiD != null) {
                    interfaceC30900DiD.FA9(c5ec.A02, c5ec.A04, 9205357640488583168L);
                }
                c5ec.A00();
                return;
            }
        }
        c5ec.A04 = 9205357640488583168L;
        InterfaceC30900DiD interfaceC30900DiD2 = c5ec.A06;
        if (interfaceC30900DiD2 == null) {
            return;
        }
        ((C28721CmD) interfaceC30900DiD2).A00.dismiss();
    }

    @Override // X.C58L
    public final void ACC(InterfaceC113515Ao interfaceC113515Ao) {
        interfaceC113515Ao.EOx(AbstractC47131KsQ.A00, new DGT(this, 5));
    }

    @Override // X.C58L
    public final /* synthetic */ boolean Buw() {
        return false;
    }

    @Override // X.C58L
    public final /* synthetic */ boolean BvB() {
        return false;
    }

    @Override // X.InterfaceC114155Db
    public final void DJc(InterfaceC1131459c interfaceC1131459c) {
        this.A0G.Egh(interfaceC1131459c);
    }

    public C5EC(InterfaceC31112Dlu interfaceC31112Dlu, InterfaceC16660sJ interfaceC16660sJ, InterfaceC16660sJ interfaceC16660sJ2, float f, float f2, float f3, long j, boolean z, boolean z2) {
        this.A0B = interfaceC16660sJ;
        this.A0A = interfaceC16660sJ2;
        this.A02 = f;
        this.A0E = z;
        this.A03 = j;
        this.A00 = f2;
        this.A01 = f3;
        this.A0D = z2;
        this.A07 = interfaceC31112Dlu;
        C6M9 c6m9 = C6M9.A00;
        C14360o3.A0C(c6m9, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.neverEqualPolicy>");
        InterfaceC09390do interfaceC09390do = AbstractC74903Yf.A01;
        this.A0G = new ParcelableSnapshotMutableState(c6m9, null);
        this.A04 = 9205357640488583168L;
    }

    @Override // X.InterfaceC113445Ag
    public final void AQV(InterfaceC1129057z interfaceC1129057z) {
        interfaceC1129057z.AQf();
        InterfaceC24731Iq interfaceC24731Iq = this.A0C;
        if (interfaceC24731Iq != null) {
            interfaceC24731Iq.F8s(C0eB.A00);
        }
    }
}
