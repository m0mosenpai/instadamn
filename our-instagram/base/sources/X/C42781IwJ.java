package X;

import android.content.Context;

/* renamed from: X.IwJ, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42781IwJ implements InterfaceC58312Pt4 {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ C41181vS A01;
    public final /* synthetic */ C145176gc A02;

    @Override // X.InterfaceC43428JGs
    public final void DKc(EnumC75193Zm enumC75193Zm) {
        C14360o3.A0B(enumC75193Zm, 0);
        InterfaceC1118853a interfaceC1118853a = this.A02.A18;
        String str = this.A01.A0j;
        C14360o3.A07(str);
        interfaceC1118853a.CMj(enumC75193Zm, str);
    }

    public C42781IwJ(Context context, C41181vS c41181vS, C145176gc c145176gc) {
        this.A02 = c145176gc;
        this.A01 = c41181vS;
        this.A00 = context;
    }

    @Override // X.InterfaceC58312Pt4
    public final void DKe() {
        C9GR.A06(this.A00, 2131974495);
        this.A02.A18.De0();
    }
}
