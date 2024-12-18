package X;

import android.graphics.Bitmap;
import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.P2b, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56390P2b implements InterfaceC80653iu {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C56390P2b(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj;
    }

    @Override // X.InterfaceC80653iu
    public final /* synthetic */ void DFp() {
    }

    @Override // X.InterfaceC80653iu
    public final void DPX(C73083Pj c73083Pj) {
        OHM ohm;
        C52689NTa c52689NTa;
        C51865Mw9 c51865Mw9;
        C51630MrN c51630MrN;
        if (this.A00 != 0) {
            C14360o3.A0B(c73083Pj, 0);
            C51379Mme c51379Mme = (C51379Mme) this.A02;
            int i = C3OO.FLAG_ADAPTER_FULLUPDATE;
            ImageUrl imageUrl = c51379Mme.A0C.getIgImageView().A0C;
            Bitmap bitmap = c73083Pj.A02;
            if (imageUrl != null && bitmap != null && (ohm = (OHM) this.A01) != null && (c51865Mw9 = (c52689NTa = ohm.A00).A00) != null && (c51630MrN = c51865Mw9.A00) != null) {
                InterfaceC58104PpT interfaceC58104PpT = c51630MrN.A00;
                if (!interfaceC58104PpT.Cff()) {
                    c52689NTa.A0W.A04(interfaceC58104PpT);
                    return;
                }
                return;
            }
            return;
        }
        C14360o3.A0B(c73083Pj, 0);
        C75113Zb c75113Zb = (C75113Zb) this.A01;
        c75113Zb.A0U = -1;
        ((C37504GfM) this.A02).A02.DLf(c73083Pj, c75113Zb);
    }
}
