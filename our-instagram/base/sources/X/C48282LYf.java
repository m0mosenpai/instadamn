package X;

import android.app.Activity;
import android.graphics.Bitmap;
import com.instagram.common.gallery.Medium;

/* renamed from: X.LYf, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48282LYf implements InterfaceC193488hT {
    public final int A00;
    public final Object A01;

    public C48282LYf(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.InterfaceC193488hT
    public final boolean CXZ(Medium medium) {
        if (this.A00 != 0) {
            return true;
        }
        C14360o3.A0B(medium, 0);
        return C14360o3.A0K(((Lf8) this.A01).A01, medium);
    }

    @Override // X.InterfaceC193488hT
    public final void DN1(Medium medium, String str) {
        if (this.A00 == 0) {
            Lf8 lf8 = (Lf8) this.A01;
            lf8.A0G.setImageDrawable(lf8.A0D);
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0003. Please report as an issue. */
    @Override // X.InterfaceC193488hT
    public final void Dt1(Bitmap bitmap, Medium medium, boolean z) {
        InterfaceC24731Iq interfaceC24731Iq;
        int i;
        switch (this.A00) {
            case 0:
                AbstractC167007dF.A1D(medium, 0, bitmap);
                Lf8 lf8 = (Lf8) this.A01;
                Activity activity = lf8.A0C;
                int i2 = lf8.A0B;
                int i3 = medium.A07;
                C14360o3.A0A(activity);
                lf8.A0G.setImageDrawable(new C193568hb(activity, bitmap, AbstractC13880nE.A00(activity, 1.5f), AbstractC13880nE.A04(activity, 4), i2, i3, false));
                return;
            case 1:
                C14360o3.A0B(bitmap, 2);
                interfaceC24731Iq = ((C50723MaO) this.A01).A0C;
                i = 38;
                interfaceC24731Iq.F8s(new C51756Mtf(bitmap, i));
                return;
            default:
                C14360o3.A0B(bitmap, 2);
                interfaceC24731Iq = ((C50725MaQ) this.A01).A0D;
                i = 42;
                interfaceC24731Iq.F8s(new C51756Mtf(bitmap, i));
                return;
        }
    }
}
