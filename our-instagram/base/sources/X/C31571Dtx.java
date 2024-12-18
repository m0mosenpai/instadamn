package X;

import com.instagram.ui.widget.typeahead.TypeaheadHeader;

/* renamed from: X.Dtx, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31571Dtx extends C1I2 {
    public final /* synthetic */ TypeaheadHeader A00;

    public C31571Dtx(TypeaheadHeader typeaheadHeader) {
        this.A00 = typeaheadHeader;
    }

    @Override // X.C1I2
    public final void onScroll(C3FQ c3fq, int i, int i2, int i3, int i4, int i5) {
        C0f9.A0A(881645198, C0f9.A03(1098539262));
    }

    @Override // X.C1I2
    public final void onScrollStateChanged(C3FQ c3fq, int i) {
        int A03 = C0f9.A03(-1488286068);
        TypeaheadHeader typeaheadHeader = this.A00;
        if (i == 1) {
            typeaheadHeader.A01();
        }
        C0f9.A0A(-984398801, A03);
    }
}
