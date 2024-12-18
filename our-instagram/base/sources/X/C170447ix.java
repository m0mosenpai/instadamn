package X;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;

/* renamed from: X.7ix, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public class C170447ix implements InterfaceC170457iy {
    public final LinearLayoutManager A00;

    @Override // X.InterfaceC170457iy
    public final void EcZ(C2Z5 c2z5) {
    }

    @Override // X.InterfaceC170457iy
    public final int ACM(int i, int i2, int i3, int i4) {
        float f = i3;
        float f2 = i;
        if (this.A00.A01 != 0) {
            f = i4;
            f2 = i2;
        }
        int ceil = (int) Math.ceil(f / f2);
        if (ceil < 2) {
            return 2;
        }
        if (ceil <= 10) {
            return ceil;
        }
        return 10;
    }

    @Override // X.InterfaceC170457iy
    public final /* bridge */ /* synthetic */ BDE ANW(int i, int i2) {
        return new AYK(i, i2, this.A00.A01);
    }

    @Override // X.C2Z6
    public final int AVQ() {
        return this.A00.A1c();
    }

    @Override // X.C2Z6
    public final int AVR() {
        return this.A00.A1a();
    }

    @Override // X.C2Z6
    public final int AVU() {
        return this.A00.A1d();
    }

    @Override // X.C2Z6
    public final int AVV() {
        return this.A00.A1b();
    }

    @Override // X.InterfaceC170457iy
    public final int Anb(InterfaceC170717jO interfaceC170717jO, int i) {
        if (this instanceof C9ID) {
            int i2 = ((C9ID) this).A00.A06.A00;
            int i3 = AbstractC75953b0.A00;
            return View.MeasureSpec.makeMeasureSpec(i2, AbstractC63123SdR.MAX_SIGNED_POWER_OF_TWO);
        }
        if (this.A00.A01 != 0) {
            return View.MeasureSpec.makeMeasureSpec(0, 0);
        }
        return i;
    }

    @Override // X.InterfaceC170457iy
    public final int Ane(InterfaceC170717jO interfaceC170717jO, int i) {
        if (this instanceof C9ID) {
            int i2 = ((C9ID) this).A00.A06.A01;
            int i3 = AbstractC75953b0.A00;
            return View.MeasureSpec.makeMeasureSpec(i2, AbstractC63123SdR.MAX_SIGNED_POWER_OF_TWO);
        }
        if (this.A00.A01 == 0) {
            return View.MeasureSpec.makeMeasureSpec(0, 0);
        }
        return i;
    }

    @Override // X.InterfaceC170457iy
    public final AbstractC70663Fe BMW() {
        return this.A00;
    }

    @Override // X.InterfaceC170457iy
    public final int Bqz() {
        return this.A00.A01;
    }

    @Override // X.InterfaceC170457iy
    public final void EMQ(int i, int i2) {
        this.A00.A1p(i, i2);
    }

    @Override // X.C2Z6
    public final int getItemCount() {
        return this.A00.A0U();
    }

    public C170447ix(LinearLayoutManager linearLayoutManager) {
        this.A00 = linearLayoutManager;
    }

    public C170447ix(Context context, int i) {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context, i, false);
        linearLayoutManager.A1t(false);
        this.A00 = linearLayoutManager;
        ((AbstractC70663Fe) linearLayoutManager).A0D = false;
    }
}
