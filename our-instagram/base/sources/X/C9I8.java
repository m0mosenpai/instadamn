package X;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;

/* renamed from: X.9I8, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9I8 implements InterfaceC170457iy {
    public LinearLayoutManager A00;
    public final C170447ix A01;
    public final /* synthetic */ BKH A02;

    public C9I8(Context context, BKH bkh) {
        this.A02 = bkh;
        this.A01 = new C170447ix(context, 1);
    }

    @Override // X.InterfaceC170457iy
    public final int ACM(int i, int i2, int i3, int i4) {
        return this.A01.ACM(i, i2, i3, i4);
    }

    @Override // X.InterfaceC170457iy
    public final /* bridge */ /* synthetic */ BDE ANW(int i, int i2) {
        return new AYK(i, i2, this.A01.A00.A01);
    }

    @Override // X.C2Z6
    public final int AVQ() {
        LinearLayoutManager linearLayoutManager = this.A00;
        if (linearLayoutManager != null) {
            return linearLayoutManager.A1c();
        }
        return -1;
    }

    @Override // X.C2Z6
    public final int AVR() {
        LinearLayoutManager linearLayoutManager = this.A00;
        if (linearLayoutManager != null) {
            return linearLayoutManager.A1a();
        }
        return -1;
    }

    @Override // X.C2Z6
    public final int AVU() {
        LinearLayoutManager linearLayoutManager = this.A00;
        if (linearLayoutManager != null) {
            return linearLayoutManager.A1d();
        }
        return -1;
    }

    @Override // X.C2Z6
    public final int AVV() {
        LinearLayoutManager linearLayoutManager = this.A00;
        if (linearLayoutManager != null) {
            return linearLayoutManager.A1b();
        }
        return -1;
    }

    @Override // X.InterfaceC170457iy
    public final int Anb(InterfaceC170717jO interfaceC170717jO, int i) {
        int i2 = this.A02.A06.A00;
        int i3 = AbstractC75953b0.A00;
        return View.MeasureSpec.makeMeasureSpec(i2, AbstractC63123SdR.MAX_SIGNED_POWER_OF_TWO);
    }

    @Override // X.InterfaceC170457iy
    public final int Ane(InterfaceC170717jO interfaceC170717jO, int i) {
        int i2 = this.A02.A06.A01;
        int i3 = AbstractC75953b0.A00;
        return View.MeasureSpec.makeMeasureSpec(i2, AbstractC63123SdR.MAX_SIGNED_POWER_OF_TWO);
    }

    @Override // X.InterfaceC170457iy
    public final AbstractC70663Fe BMW() {
        return this.A00;
    }

    @Override // X.InterfaceC170457iy
    public final int Bqz() {
        LinearLayoutManager linearLayoutManager = this.A00;
        if (linearLayoutManager != null) {
            return linearLayoutManager.A01;
        }
        return 1;
    }

    @Override // X.InterfaceC170457iy
    public final void EMQ(int i, int i2) {
        LinearLayoutManager linearLayoutManager = this.A00;
        if (linearLayoutManager != null) {
            linearLayoutManager.A1p(i, i2);
        }
    }

    @Override // X.C2Z6
    public final int getItemCount() {
        LinearLayoutManager linearLayoutManager = this.A00;
        if (linearLayoutManager != null) {
            return linearLayoutManager.A0U();
        }
        return 0;
    }

    @Override // X.InterfaceC170457iy
    public final void EcZ(C2Z5 c2z5) {
    }
}
