package X;

import com.instagram.ui.widget.typeahead.TypeaheadHeader;

/* renamed from: X.GHw, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36749GHw implements GYU {
    public final int A00;
    public final Object A01;

    public C36749GHw(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.GYU
    public final void onSearchCleared(String str) {
        GYW gyw;
        switch (this.A00) {
            case 0:
                ((N5Z) this.A01).A0D("");
                return;
            case 1:
                gyw = ((E15) this.A01).A02;
                break;
            default:
                C14360o3.A0B(str, 0);
                gyw = ((TypeaheadHeader) this.A01).A02;
                break;
        }
        if (gyw != null) {
            gyw.onSearchCleared(str);
        }
    }
}
