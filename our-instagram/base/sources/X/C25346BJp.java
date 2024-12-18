package X;

import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import com.facebook.R;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.ui.widget.audiobar.AudioBar;
import java.util.List;

/* renamed from: X.BJp, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25346BJp implements C1NJ {
    public final int A00;
    public final Object A01;

    public C25346BJp(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.C1NJ
    public final void Cza(InterfaceC59502nt interfaceC59502nt, C73033Pe c73033Pe) {
        Object C4x;
        BOM bom;
        List list;
        switch (this.A00) {
            case 0:
                C14360o3.A0B(c73033Pe, 1);
                ((C73163Pr) this.A01).A0W(new C27230Bzp(c73033Pe));
                return;
            case 1:
                C14360o3.A0B(interfaceC59502nt, 0);
                C14360o3.A0B(c73033Pe, 1);
                Bitmap bitmap = c73033Pe.A01;
                if (bitmap == null) {
                    Object value = ((BOM) this.A01).A0C.getValue();
                    C14360o3.A07(value);
                    bitmap = (Bitmap) value;
                }
                BOM bom2 = (BOM) this.A01;
                JFY jfy = bom2.A02;
                if (jfy != null) {
                    C65888Tvs A00 = new C65887Tvr(bitmap).A00();
                    ImageUrl BGt = interfaceC59502nt.BGt();
                    C14360o3.A07(BGt);
                    AudioBar audioBar = (AudioBar) jfy;
                    if (C14360o3.A0K(audioBar.A00, BGt)) {
                        int color = audioBar.getContext().getColor(R.color.audio_bar_default_background_color);
                        int A002 = A00.A00(color);
                        if (A002 == color) {
                            C65890Tvu c65890Tvu = A00.A01;
                            if (c65890Tvu != null) {
                                color = c65890Tvu.A05;
                            }
                            A002 = color;
                        }
                        audioBar.A07.setImageTintList(ColorStateList.valueOf(A002));
                    }
                }
                BOM.A02(bitmap, bom2);
                return;
            default:
                C14360o3.A0B(interfaceC59502nt, 0);
                C14360o3.A0B(c73033Pe, 1);
                Bitmap bitmap2 = c73033Pe.A01;
                if (bitmap2 != null && (C4x = interfaceC59502nt.C4x()) != null && (list = (bom = (BOM) this.A01).A03) != null) {
                    C14360o3.A0C(C4x, "null cannot be cast to non-null type kotlin.Int");
                    list.set(((Number) C4x).intValue(), bitmap2);
                    bom.invalidateSelf();
                    return;
                }
                return;
        }
    }

    @Override // X.C1NJ
    public final void DLP(InterfaceC59502nt interfaceC59502nt, C82183lf c82183lf) {
        int i = this.A00;
        Object obj = this.A01;
        if (i != 0) {
            BOM bom = (BOM) obj;
            BOM.A02((Bitmap) AbstractC166987dD.A17(bom.A0C), bom);
        } else {
            ((C73163Pr) obj).A0W(new C27229Bzo(c82183lf));
        }
    }

    @Override // X.C1NJ
    public final void DLW(InterfaceC59502nt interfaceC59502nt, int i) {
    }
}
