package X;

import android.content.Context;
import com.instagram.ui.widget.framelayout.MediaFrameLayout;

/* renamed from: X.6Qx, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C138916Qx extends AbstractC138926Qy {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public final Context A04;
    public final C41181vS A05;
    public final C138866Qr A06;
    public final C138896Qv A07;
    public final MediaFrameLayout A08;
    public final boolean A09;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C138916Qx(Context context, C41181vS c41181vS, C138866Qr c138866Qr, C138896Qv c138896Qv, MediaFrameLayout mediaFrameLayout, boolean z, boolean z2) {
        super(c138866Qr, EnumC138936Qz.A04);
        int i;
        int i2;
        int A0m;
        String str;
        String str2;
        int i3;
        C14360o3.A0B(context, 1);
        C14360o3.A0B(mediaFrameLayout, 2);
        C14360o3.A0B(c138866Qr, 3);
        this.A04 = context;
        this.A08 = mediaFrameLayout;
        this.A06 = c138866Qr;
        this.A05 = c41181vS;
        this.A07 = c138896Qv;
        this.A09 = z2;
        if (z2) {
            i = c138866Qr.A07;
        } else {
            i = super.A02;
        }
        this.A02 = i;
        if (z2) {
            i2 = c138866Qr.A07;
        } else {
            i2 = super.A00;
        }
        this.A00 = i2;
        if (z) {
            float f = c138866Qr.A09;
            C38321qM c38321qM = c41181vS.A0b;
            c38321qM.getClass();
            A0m = (int) (f / c38321qM.A0m());
            C6QX A21 = c38321qM.A21();
            if (A21 != null && (((str = A21.A06) != null && str.length() != 0) || ((str2 = A21.A05) != null && str2.length() != 0))) {
                if (this.A09) {
                    i3 = c138866Qr.A06;
                } else {
                    i3 = c138866Qr.A08;
                }
                A0m += i3;
            }
        } else {
            float A00 = C138866Qr.A00(context);
            C38321qM c38321qM2 = this.A05.A0b;
            c38321qM2.getClass();
            A0m = (int) (A00 / c38321qM2.A0m());
        }
        this.A01 = A0m;
        this.A03 = C138866Qr.A00(this.A04);
    }
}
