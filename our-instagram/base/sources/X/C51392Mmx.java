package X;

import androidx.fragment.app.Fragment;
import java.util.List;

/* renamed from: X.Mmx, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51392Mmx extends AbstractC65952Twx {
    public final List A00;
    public final InterfaceC16660sJ A01;

    @Override // X.AbstractC65952Twx
    public final Fragment A03(int i) {
        return (Fragment) this.A01.invoke(this.A00.get(i));
    }

    public C51392Mmx(Fragment fragment, List list, InterfaceC16660sJ interfaceC16660sJ) {
        super(fragment);
        this.A00 = list;
        this.A01 = interfaceC16660sJ;
    }

    @Override // X.C2UU
    public final int getItemCount() {
        int A03 = C0f9.A03(239042370);
        int size = this.A00.size();
        C0f9.A0A(1511156136, A03);
        return size;
    }
}
