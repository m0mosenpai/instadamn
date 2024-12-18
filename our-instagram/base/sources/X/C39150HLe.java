package X;

import android.content.Context;
import android.widget.ImageView;
import androidx.fragment.app.FragmentActivity;

/* renamed from: X.HLe, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39150HLe extends C33H {
    public final /* synthetic */ ImageView A00;
    public final /* synthetic */ C1564070k A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;

    @Override // X.C33H, X.C33I
    public final boolean Dtk(C5SW c5sw) {
        C14360o3.A0B(c5sw, 0);
        C1XJ c1xj = C1XJ.A00;
        Context context = this.A00.getContext();
        AbstractC31171DnF.A1P(context);
        String str = this.A03;
        C14360o3.A0A(str);
        C1564070k c1564070k = this.A01;
        c1xj.A0m((FragmentActivity) context, EnumC39651Hig.A0I, EnumC39644HiZ.UNKNOWN, EnumC39650Hif.A0I, EnumC39649Hie.A0C, c1564070k.A00, null, str, c1564070k.A03, c1564070k.A02, "global_cart_icon_tooltip", null, null, null, null, this.A02, this.A05, null, null, this.A04, null, false);
        return true;
    }

    public C39150HLe(ImageView imageView, C1564070k c1564070k, String str, String str2, String str3, String str4) {
        this.A00 = imageView;
        this.A03 = str;
        this.A01 = c1564070k;
        this.A02 = str2;
        this.A05 = str3;
        this.A04 = str4;
    }
}
