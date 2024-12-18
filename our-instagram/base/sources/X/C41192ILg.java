package X;

import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;

/* renamed from: X.ILg, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C41192ILg {
    public final InterfaceC43419JGj A00;
    public final InterfaceC09390do A01;
    public final Fragment A02;

    public C41192ILg(Fragment fragment, UserSession userSession, InterfaceC43419JGj interfaceC43419JGj, String str, String str2, boolean z) {
        AbstractC167017dG.A1P(userSession, fragment);
        this.A02 = fragment;
        this.A00 = interfaceC43419JGj;
        D8f d8f = new D8f(userSession, str, str2, 0, z);
        InterfaceC09390do A00 = AbstractC09440dt.A00(EnumC09460dv.A02, new J8X(new J8X(fragment, 21), 22));
        this.A01 = AbstractC25225BEi.A0a(new J8X(A00, 23), d8f, new C57252Pba(45, null, A00), AbstractC25225BEi.A1D(C38324GtJ.class));
    }

    public final void A00() {
        AbstractC37301Gc2.A0w(this.A02.getViewLifecycleOwner(), ((C38324GtJ) this.A01.getValue()).A00, new JEZ(this, 43), 9);
    }
}
