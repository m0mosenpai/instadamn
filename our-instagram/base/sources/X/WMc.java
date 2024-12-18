package X;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import com.instagram.user.model.User;

/* loaded from: classes11.dex */
public final class WMc implements View.OnClickListener {
    public final int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;

    public WMc(int i, int i2, Object obj, Object obj2) {
        this.A00 = i2;
        this.A02 = obj2;
        this.A01 = i;
        this.A03 = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05;
        int i;
        switch (this.A00) {
            case 0:
                A05 = C0f9.A05(2064599320);
                UGe uGe = (UGe) this.A02;
                int i2 = uGe.A00;
                int i3 = this.A01;
                if (i2 == i3) {
                    i = -69317;
                    break;
                } else {
                    uGe.A00 = i3;
                    if (i2 != -1) {
                        uGe.notifyItemChanged(i2);
                    }
                    uGe.notifyItemChanged(i3);
                    C66438UHo c66438UHo = (C66438UHo) this.A03;
                    ImageView imageView = c66438UHo.A00;
                    imageView.getClass();
                    Drawable drawable = imageView.getDrawable();
                    A5M a5m = uGe.A04;
                    C148276lx c148276lx = c66438UHo.A01;
                    c148276lx.getClass();
                    C148286ly c148286ly = c66438UHo.A02;
                    c148286ly.getClass();
                    drawable.getClass();
                    if (!((C74P) drawable).isLoading()) {
                        C218069ke c218069ke = a5m.A00;
                        c218069ke.A05 = false;
                        C88Y c88y = c218069ke.A0E;
                        c88y.A07();
                        c88y.A09(c218069ke.A0D);
                        C218069ke.A01(c148276lx, c148286ly, c218069ke, c218069ke.A02);
                    }
                    i = 664264455;
                    break;
                }
            case 1:
                A05 = C0f9.A05(613834763);
                C63752uw c63752uw = ((UGf) this.A03).A03;
                int i4 = this.A01;
                User user = (User) this.A02;
                String id = user.getId();
                BIM.A03(c63752uw.A01, c63752uw.A02, id, i4);
                c63752uw.A01(user.getId());
                i = 1126874848;
                break;
            case 2:
                A05 = C0f9.A05(-1594252452);
                UBD ubd = (UBD) this.A03;
                C47K c47k = ubd.A01;
                if (c47k != null) {
                    int i5 = this.A01;
                    C47O c47o = (C47O) this.A02;
                    if (i5 != -1) {
                        ubd.A07.Dqo(null, null, ubd.A06, c47o, null, c47k.A0C, "fish-eye", c47k.getId(), c47k.A0I, null, null, c47k.A01, i5, i5);
                    }
                }
                i = 1151942127;
                break;
            case 3:
                A05 = C0f9.A05(1514174453);
                UBD ubd2 = (UBD) this.A03;
                C47K c47k2 = ubd2.A01;
                if (c47k2 != null) {
                    int i6 = this.A01;
                    C47O c47o2 = (C47O) this.A02;
                    if (i6 != -1) {
                        UBD.A01(ubd2, i6);
                        ubd2.A07.Dqq(c47k2.B5n(), c47o2, c47k2.A0C, "fish-eye", c47k2.getId(), c47k2.A0I, c47k2.A01, i6);
                    }
                }
                i = 1021565462;
                break;
            case 4:
                A05 = C0f9.A05(-487068767);
                ((XEF) this.A02).Dhj((User) this.A03, this.A01);
                i = 1892805465;
                break;
            case 5:
                A05 = C0f9.A05(-643572760);
                ((XEF) this.A02).DLH((User) this.A03, this.A01);
                i = 2116614693;
                break;
            case 6:
                A05 = C0f9.A05(1395897528);
                ((XEF) this.A02).DLH((User) this.A03, this.A01);
                i = -2032266223;
                break;
            default:
                A05 = C0f9.A05(1354228395);
                ((XEF) this.A02).DXI((User) this.A03, this.A01);
                i = -154537328;
                break;
        }
        C0f9.A0C(i, A05);
    }
}
