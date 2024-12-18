package X;

import android.view.ViewStub;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.ui.widget.balloonsview.BalloonsView;

/* renamed from: X.6ld, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C148076ld {
    public final InterfaceC56392iX A00;

    public C148076ld(ViewStub viewStub) {
        C14360o3.A0B(viewStub, 1);
        this.A00 = AbstractC56372iV.A01(viewStub, false, false);
    }

    public final void A02(MPI mpi, String str) {
        C14360o3.A0B(str, 0);
        if (C168157fA.A03(str)) {
            A00(this, mpi, EnumC46153Kbr.A02, false);
            ((BalloonsView) this.A00.getView()).A01(C168157fA.A00(C168157fA.A02(str), str));
        }
    }

    public static final void A00(C148076ld c148076ld, MPI mpi, EnumC46153Kbr enumC46153Kbr, boolean z) {
        InterfaceC56392iX interfaceC56392iX = c148076ld.A00;
        if (!interfaceC56392iX.CWW()) {
            interfaceC56392iX.getView().setOnTouchListener(ATX.A00);
        }
        BalloonsView balloonsView = (BalloonsView) interfaceC56392iX.getView();
        balloonsView.setVisibility(0);
        balloonsView.setOnTouchListener(ATY.A00);
        balloonsView.setBalloonType(enumC46153Kbr);
        balloonsView.A02 = z;
        balloonsView.A00 = new C49647Lwe(mpi, balloonsView);
    }

    public final void A01(ImageUrl imageUrl, MPI mpi) {
        A00(this, mpi, EnumC46153Kbr.A04, false);
        ((BalloonsView) this.A00.getView()).A01(imageUrl);
    }
}
