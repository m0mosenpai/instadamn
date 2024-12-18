package X;

import androidx.fragment.app.Fragment;

/* renamed from: X.LwW, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49639LwW implements MSU {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ InterfaceC08830cm A03;

    public C49639LwW(String str, InterfaceC08830cm interfaceC08830cm, int i, int i2) {
        this.A02 = str;
        this.A01 = i;
        this.A00 = i2;
        this.A03 = interfaceC08830cm;
    }

    public static Fragment A00(C45499KCo c45499KCo) {
        AbstractC10360h2 childFragmentManager = c45499KCo.getChildFragmentManager();
        MSU msu = c45499KCo.A0C;
        msu.getClass();
        return childFragmentManager.A0Q(((C49639LwW) msu).A02);
    }
}
