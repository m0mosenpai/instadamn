package X;

import android.content.res.Resources;
import android.view.View;
import com.facebook.R;

/* loaded from: classes7.dex */
public final class J5X implements Runnable {
    public final /* synthetic */ View A00;
    public final /* synthetic */ EnumC39595He5 A01;
    public final /* synthetic */ C41697IdQ A02;

    public J5X(View view, EnumC39595He5 enumC39595He5, C41697IdQ c41697IdQ) {
        this.A02 = c41697IdQ;
        this.A00 = view;
        this.A01 = enumC39595He5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i;
        CharSequence string;
        int dimensionPixelSize;
        C41697IdQ c41697IdQ = this.A02;
        View view = this.A00;
        EnumC39595He5 enumC39595He5 = this.A01;
        int ordinal = enumC39595He5.ordinal();
        Resources resources = c41697IdQ.A01;
        switch (ordinal) {
            case 0:
                i = 2131972343;
                string = resources.getString(i);
                break;
            case 1:
                i = 2131967998;
                string = resources.getString(i);
                break;
            case 2:
                i = 2131967963;
                string = resources.getString(i);
                break;
            case 3:
                i = 2131975770;
                string = resources.getString(i);
                break;
            case 4:
                i = 2131973791;
                string = resources.getString(i);
                break;
            default:
                string = resources.getText(2131962020);
                break;
        }
        C14360o3.A07(string);
        C5SU c5su = new C5SU(c41697IdQ.A00, new C149686oL(string));
        if (ordinal == 3) {
            c5su.A04(view, (int) resources.getDimension(R.dimen.account_group_management_clickable_width), (int) resources.getDimension(R.dimen.audio_page_audio_filter_tooltip_vertical_offset), false);
        } else {
            if (C41697IdQ.A00(enumC39595He5, c41697IdQ) == EnumC58132lV.A02) {
                dimensionPixelSize = -resources.getDimensionPixelSize(R.dimen.account_discovery_bottom_gap);
            } else {
                dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.abc_select_dialog_padding_start_material);
            }
            c5su.A04(view, 0, dimensionPixelSize, true);
        }
        c5su.A06(C41697IdQ.A00(enumC39595He5, c41697IdQ));
        c5su.A00().A06();
        InterfaceC19630xq A03 = C1AT.A01(c41697IdQ.A02).A03(C1AV.A0J);
        String str = enumC39595He5.A02;
        int i2 = A03.getInt(str, 0);
        InterfaceC19610xo ARD = A03.ARD();
        switch (ordinal) {
            case 0:
            case 5:
                ARD.E7G(enumC39595He5.A01, System.currentTimeMillis());
                break;
        }
        ARD.E7D(str, i2 + 1);
        ARD.apply();
    }
}
