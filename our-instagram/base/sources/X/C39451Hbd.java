package X;

import androidx.fragment.app.Fragment;

/* renamed from: X.Hbd, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39451Hbd extends PJX {
    public final /* synthetic */ Fragment A00;
    public final /* synthetic */ InterfaceC43428JGs A01;

    public C39451Hbd(Fragment fragment, InterfaceC43428JGs interfaceC43428JGs) {
        this.A00 = fragment;
        this.A01 = interfaceC43428JGs;
    }

    @Override // X.PJX, X.MRA
    public final void Dfe() {
        C9GR.A0E(this.A00.getActivity(), MSV.A00(61));
    }

    @Override // X.PJX, X.MRA
    public final void DpZ(String str) {
        EnumC75193Zm enumC75193Zm;
        if (str != null && str.length() != 0) {
            if ("ig_spam_v3".equals(str)) {
                enumC75193Zm = EnumC75193Zm.A0I;
            } else if ("ig_false_news".equals(str)) {
                enumC75193Zm = EnumC75193Zm.A0H;
            } else {
                enumC75193Zm = EnumC75193Zm.A0G;
            }
            this.A01.DKc(enumC75193Zm);
        }
    }
}
