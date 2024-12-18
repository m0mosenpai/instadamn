package X;

import androidx.fragment.app.FragmentActivity;
import java.util.List;

/* renamed from: X.Aoz, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C24233Aoz implements InterfaceC42241xE {
    public final /* synthetic */ C7YE A00;

    public C24233Aoz(C7YE c7ye) {
        this.A00 = c7ye;
    }

    @Override // X.InterfaceC42241xE
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        C7YE c7ye = this.A00;
        C7YG c7yg = c7ye.A05;
        AbstractC59962oe abstractC59962oe = c7ye.A01;
        FragmentActivity activity = abstractC59962oe.getActivity();
        InterfaceC83703oF A01 = AbstractC140946Yw.A01(c7ye.A06);
        c7yg.A01(activity, abstractC59962oe, c7ye.A02, c7ye.A04, A01, (List) c7ye.A07.get());
        c7ye.A03.A01();
    }
}
