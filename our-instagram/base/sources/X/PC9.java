package X;

import android.view.View;
import com.facebook.R;
import com.instagram.common.recyclerview.ViewModelListUpdate;

/* loaded from: classes9.dex */
public final class PC9 implements InterfaceC57985PnV {
    public final View A00;
    public final O5H A01;
    public final InterfaceC09390do A02 = C57543PgH.A01(this, 36);
    public final InterfaceC09390do A06 = C57543PgH.A01(this, 40);
    public final InterfaceC09390do A03 = C57543PgH.A01(this, 37);
    public final InterfaceC09390do A04 = C57543PgH.A01(this, 38);
    public final InterfaceC09390do A05 = C57543PgH.A01(this, 39);

    /* JADX WARN: Type inference failed for: r1v1, types: [X.GHa, java.lang.Object] */
    @Override // X.InterfaceC57985PnV
    public final /* bridge */ /* synthetic */ void ADV(InterfaceC57856PlM interfaceC57856PlM) {
        C51896Mwe c51896Mwe = (C51896Mwe) interfaceC57856PlM;
        C14360o3.A0B(c51896Mwe, 0);
        if (c51896Mwe.A07) {
            MSW.A0D(this.A03).setText(c51896Mwe.A00);
            AbstractC43593JPy.A1W(this.A05, 0);
            ViewModelListUpdate A0E = AbstractC31171DnF.A0E();
            if (c51896Mwe.A08) {
                C36731GHa A00 = C55519OlD.A00(this, 22, 2131972638, c51896Mwe.A03);
                A00.A03 = R.drawable.instagram_audio_crunchy_pano_outline_24;
                A0E.A00(new E8Y(A00));
            }
            if (c51896Mwe.A09) {
                C36731GHa A002 = C55519OlD.A00(this, 19, 2131972639, c51896Mwe.A04);
                A002.A03 = R.drawable.instagram_audio_enhance_pano_outline_24;
                A0E.A00(new E8Y(A002));
            }
            if (c51896Mwe.A0B) {
                C36731GHa A003 = C55519OlD.A00(this, 21, 2131972640, c51896Mwe.A06);
                A003.A03 = R.drawable.instagram_hd_pano_outline_24;
                A0E.A00(new E8Y(A003));
            }
            if (c51896Mwe.A0A) {
                boolean z = c51896Mwe.A05;
                C55519OlD c55519OlD = new C55519OlD(this, 20);
                ?? obj = new Object();
                obj.A04 = 2131954522;
                obj.A01 = 2131954521;
                obj.A0D = z;
                obj.A08 = c55519OlD;
                obj.A03 = R.drawable.instagram_closed_captions_enabled_pano_outline_24;
                A0E.A00(new E8Y(obj));
            }
            ((C66362zD) this.A04.getValue()).A05(A0E);
        }
    }

    public PC9(View view, O5H o5h) {
        this.A00 = view;
        this.A01 = o5h;
    }
}
