package X;

import androidx.fragment.app.Fragment;
import java.util.ArrayList;

/* renamed from: X.0hW, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10620hW implements C06O {
    public final int A00;
    public final int A01;
    public final String A02;
    public final /* synthetic */ AbstractC10360h2 A03;

    public C10620hW(AbstractC10360h2 abstractC10360h2, String str, int i, int i2) {
        this.A03 = abstractC10360h2;
        this.A02 = str;
        this.A01 = i;
        this.A00 = i2;
    }

    @Override // X.C06O
    public final boolean AWw(ArrayList arrayList, ArrayList arrayList2) {
        AbstractC10360h2 abstractC10360h2 = this.A03;
        Fragment fragment = abstractC10360h2.A07;
        if (fragment != null && this.A01 < 0 && this.A02 == null && fragment.getChildFragmentManager().A12()) {
            return false;
        }
        return abstractC10360h2.A19(this.A02, arrayList, arrayList2, this.A01, this.A00);
    }
}
