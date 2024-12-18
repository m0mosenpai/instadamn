package X;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes4.dex */
public final class AYM implements InterfaceC170457iy {
    public C2Z5 A00;
    public final GridLayoutManager A01;
    public final C9UB A02;

    /* JADX WARN: Type inference failed for: r0v1, types: [X.6wP, X.9UB] */
    public AYM(Context context, int i, int i2) {
        GridLayoutManager gridLayoutManager = new GridLayoutManager(context, i, i2, false);
        this.A01 = gridLayoutManager;
        ?? r0 = new AbstractC154146wP() { // from class: X.9UB
            @Override // X.AbstractC154146wP
            public final int A03(int i3) {
                InterfaceC170717jO A02;
                AYM aym = AYM.this;
                C2Z5 c2z5 = aym.A00;
                if (c2z5 == null) {
                    return 1;
                }
                synchronized (c2z5) {
                    C2XV.A00();
                    A02 = ((C124005jE) c2z5.A0i.get(i3)).A02();
                }
                if (A02.CVF()) {
                    return aym.A01.A00;
                }
                return A02.Bz2();
            }
        };
        this.A02 = r0;
        gridLayoutManager.A01 = r0;
    }

    public static int A00(GridLayoutManager gridLayoutManager, InterfaceC170717jO interfaceC170717jO, int i) {
        Number number = (Number) interfaceC170717jO.AvD("OVERRIDE_SIZE");
        if (number != null) {
            return number.intValue();
        }
        if (interfaceC170717jO.CVF()) {
            return View.MeasureSpec.getSize(i);
        }
        return interfaceC170717jO.Bz2() * (View.MeasureSpec.getSize(i) / gridLayoutManager.A00);
    }

    @Override // X.InterfaceC170457iy
    public final int ACM(int i, int i2, int i3, int i4) {
        double d;
        double d2;
        GridLayoutManager gridLayoutManager = this.A01;
        int i5 = gridLayoutManager.A00;
        if (((LinearLayoutManager) gridLayoutManager).A01 != 0) {
            d = i4;
            d2 = i2;
        } else {
            d = i3;
            d2 = i;
        }
        return ((int) Math.ceil(d / d2)) * i5;
    }

    @Override // X.InterfaceC170457iy
    public final /* bridge */ /* synthetic */ BDE ANW(int i, int i2) {
        GridLayoutManager gridLayoutManager = this.A01;
        return new AYL(i, i2, ((LinearLayoutManager) gridLayoutManager).A01, gridLayoutManager.A00);
    }

    @Override // X.C2Z6
    public final int AVQ() {
        return this.A01.A1c();
    }

    @Override // X.C2Z6
    public final int AVR() {
        return this.A01.A1a();
    }

    @Override // X.C2Z6
    public final int AVU() {
        return this.A01.A1d();
    }

    @Override // X.C2Z6
    public final int AVV() {
        return this.A01.A1b();
    }

    @Override // X.InterfaceC170457iy
    public final int Anb(InterfaceC170717jO interfaceC170717jO, int i) {
        GridLayoutManager gridLayoutManager = this.A01;
        if (((LinearLayoutManager) gridLayoutManager).A01 != 0) {
            return View.MeasureSpec.makeMeasureSpec(0, 0);
        }
        return View.MeasureSpec.makeMeasureSpec(A00(gridLayoutManager, interfaceC170717jO, i), AbstractC63123SdR.MAX_SIGNED_POWER_OF_TWO);
    }

    @Override // X.InterfaceC170457iy
    public final int Ane(InterfaceC170717jO interfaceC170717jO, int i) {
        GridLayoutManager gridLayoutManager = this.A01;
        if (((LinearLayoutManager) gridLayoutManager).A01 != 0) {
            return View.MeasureSpec.makeMeasureSpec(A00(gridLayoutManager, interfaceC170717jO, i), AbstractC63123SdR.MAX_SIGNED_POWER_OF_TWO);
        }
        return View.MeasureSpec.makeMeasureSpec(0, 0);
    }

    @Override // X.InterfaceC170457iy
    public final AbstractC70663Fe BMW() {
        return this.A01;
    }

    @Override // X.InterfaceC170457iy
    public final int Bqz() {
        return ((LinearLayoutManager) this.A01).A01;
    }

    @Override // X.InterfaceC170457iy
    public final void EMQ(int i, int i2) {
        this.A01.A1p(i, i2);
    }

    @Override // X.C2Z6
    public final int getItemCount() {
        return this.A01.A0U();
    }

    @Override // X.InterfaceC170457iy
    public final void EcZ(C2Z5 c2z5) {
        this.A00 = c2z5;
    }
}
