package X;

import android.view.View;
import java.util.List;

/* renamed from: X.OwQ, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56158OwQ implements C3PE {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C51374MmZ A01;
    public final /* synthetic */ InterfaceC64002vL A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ List A04;

    public C56158OwQ(C51374MmZ c51374MmZ, InterfaceC64002vL interfaceC64002vL, String str, List list, int i) {
        this.A02 = interfaceC64002vL;
        this.A03 = str;
        this.A00 = i;
        this.A04 = list;
        this.A01 = c51374MmZ;
    }

    @Override // X.C3PE
    public final void DQY(View view) {
        InterfaceC64002vL interfaceC64002vL = this.A02;
        String str = this.A03;
        interfaceC64002vL.DeC(this.A04, this.A00, str);
    }

    @Override // X.C3PE
    public final boolean DsE(View view) {
        InterfaceC64002vL interfaceC64002vL = this.A02;
        String str = this.A03;
        int i = this.A00;
        interfaceC64002vL.De7(this.A01, null, null, str, null, this.A04, i, false);
        return true;
    }
}
