package X;

import android.content.Context;
import android.graphics.Bitmap;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* loaded from: classes8.dex */
public final class MEE extends C0YY implements InterfaceC16820sZ {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final String A04;
    public final String A05;
    public final String A06;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MEE(Object obj, Object obj2, Object obj3, String str, String str2, String str3, int i) {
        super(0);
        this.A00 = i;
        this.A02 = obj;
        this.A03 = obj2;
        this.A05 = str;
        this.A04 = str2;
        this.A06 = str3;
        this.A01 = obj3;
    }

    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        C2d5 c2d5;
        switch (this.A00) {
            case 0:
                LKb.A01((Context) this.A02, (Bitmap) this.A01, (UserSession) this.A03, this.A05, this.A04, this.A06);
                break;
            case 1:
                Context context = (Context) this.A02;
                MEE mee = new MEE(context, this.A03, this.A01, this.A05, this.A04, this.A06, 0);
                C146106i8 A0j = AbstractC25229BEm.A0j();
                A0j.A02 = context.getResources().getDimensionPixelOffset(R.dimen.audio_page_audio_filter_tooltip_vertical_offset);
                A0j.A0R = true;
                A0j.A0H = "collage_send_failure";
                AbstractC25226BEj.A1N(context, A0j, 2131965865);
                AbstractC31175DnJ.A0l(context, A0j, 2131965864);
                A0j.A0A(new KYJ(mee, 0));
                A0j.A0L = true;
                A0j.A06();
                InterfaceC53722dB A00 = AbstractC54852fj.A00();
                if ((A00 instanceof C2d5) && (c2d5 = (C2d5) A00) != null) {
                    c2d5.By1().A0A(A0j.A00());
                    break;
                } else {
                    AbstractC31178DnM.A1S(A0j);
                    break;
                }
                break;
            default:
                C45504KCt c45504KCt = (C45504KCt) this.A03;
                ((L6Y) c45504KCt.A08.getValue()).A00((C47944LFy) this.A02, this.A05, this.A06, new C57262Pbk(this.A01, c45504KCt, this.A04, 21));
                break;
        }
        return C0eB.A00;
    }
}
