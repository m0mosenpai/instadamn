package X;

import android.widget.ProgressBar;
import java.util.List;

/* renamed from: X.OxC, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56203OxC implements InterfaceC58142Pq7 {
    public final /* synthetic */ C51380Mmf A00;

    @Override // X.InterfaceC58142Pq7
    public final void DzX(InterfaceC58104PpT interfaceC58104PpT) {
        OHM ohm = this.A00.A01;
        if (ohm != null) {
            C52689NTa c52689NTa = ohm.A00;
            if (c52689NTa.A0C) {
                c52689NTa.A0C = false;
            } else {
                c52689NTa.A0W.A04(interfaceC58104PpT);
            }
        }
    }

    public C56203OxC(C51380Mmf c51380Mmf) {
        this.A00 = c51380Mmf;
    }

    @Override // X.InterfaceC58142Pq7
    public final void Dbw(int i, int i2) {
        C51380Mmf c51380Mmf = this.A00;
        String A02 = C23831Eq.A02(i2 - i);
        InterfaceC09390do interfaceC09390do = c51380Mmf.A09;
        PCH pch = (PCH) interfaceC09390do.getValue();
        if (pch.A01.CWW()) {
            MSY.A1H(A02, pch.A0F);
        }
        if (!c51380Mmf.A04) {
            PCH pch2 = (PCH) interfaceC09390do.getValue();
            if (pch2.A01.CWW()) {
                InterfaceC09390do interfaceC09390do2 = pch2.A0C;
                ((ProgressBar) interfaceC09390do2.getValue()).setProgress(i);
                ((ProgressBar) interfaceC09390do2.getValue()).setMax(i2);
            }
        }
    }

    @Override // X.InterfaceC58142Pq7
    public final void E0J(boolean z) {
        String str;
        C51630MrN c51630MrN;
        Long l;
        C51906Mwo c51906Mwo;
        C51380Mmf c51380Mmf = this.A00;
        OHM ohm = c51380Mmf.A01;
        if (ohm != null) {
            C51906Mwo c51906Mwo2 = c51380Mmf.A02;
            if (c51906Mwo2 != null) {
                str = c51906Mwo2.A0D;
            } else {
                str = null;
            }
            C52689NTa c52689NTa = ohm.A00;
            int i = 0;
            if (c52689NTa.A0D) {
                c52689NTa.A0D = false;
            } else {
                InterfaceC58295Psn interfaceC58295Psn = c52689NTa.A0U;
                C51865Mw9 c51865Mw9 = c52689NTa.A00;
                if (c51865Mw9 != null && (c51630MrN = c51865Mw9.A00) != null && (l = c51630MrN.A03) != null) {
                    i = (int) l.longValue();
                }
                interfaceC58295Psn.ESh(i);
            }
            c52689NTa.A01 = str;
            C51906Mwo c51906Mwo3 = (C51906Mwo) ((AbstractC55206OeJ) c52689NTa).A01;
            if (c51906Mwo3 != null) {
                c51906Mwo = C51906Mwo.A00(null, null, c51906Mwo3, EnumC74373Vt.A05, null, null, null, 0.0f, 0, -4195841, 2047, false, z, false, false, false, false, false, false);
            } else {
                c51906Mwo = null;
            }
            c52689NTa.A0J(c51906Mwo);
        }
    }

    @Override // X.InterfaceC58142Pq7
    public final void onCues(List list) {
        C51380Mmf c51380Mmf = this.A00;
        int i = C3OO.FLAG_ADAPTER_FULLUPDATE;
        C51906Mwo c51906Mwo = c51380Mmf.A02;
        if (c51906Mwo != null && c51906Mwo.A0b) {
            if (!list.isEmpty()) {
                AbstractC86533tR.A02((C86013sY) ((C51379Mme) c51380Mmf.A0D.getValue()).A0H.getValue(), list, true);
                return;
            }
            return;
        }
        AbstractC86533tR.A00((C86013sY) ((C51379Mme) c51380Mmf.A0D.getValue()).A0H.getValue());
    }
}
