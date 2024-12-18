package X;

import com.instagram.direct.fragment.sharesheet.DirectShareSheetFragment;

/* renamed from: X.OrS, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55878OrS implements InterfaceC57926PmW {
    public final int A00;
    public final Object A01;

    public C55878OrS(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.InterfaceC57926PmW
    public final void Dlm(EnumC76753cN enumC76753cN) {
        switch (this.A00) {
            case 0:
                ((DirectShareSheetFragment) this.A01).A0K.notifyDataSetChanged();
                return;
            case 1:
                MSY.A1E(((C54722OEz) this.A01).A05);
                return;
            default:
                ((ENZ) this.A01).A04();
                return;
        }
    }
}
