package X;

import com.instagram.common.session.UserSession;
import com.instagram.creation.photo.edit.ui.FilterFragmentLayout;

/* renamed from: X.Lek, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48608Lek implements InterfaceC25206BDe {
    public final /* synthetic */ FilterFragmentLayout A00;
    public final /* synthetic */ C50724MaP A01;
    public final /* synthetic */ C37964Gn6 A02;

    public C48608Lek(FilterFragmentLayout filterFragmentLayout, C50724MaP c50724MaP, C37964Gn6 c37964Gn6) {
        this.A01 = c50724MaP;
        this.A02 = c37964Gn6;
        this.A00 = filterFragmentLayout;
    }

    @Override // X.InterfaceC25206BDe
    public final void Doo() {
        C50724MaP c50724MaP = this.A01;
        c50724MaP.A0Z = true;
        InterfaceC678133v interfaceC678133v = c50724MaP.A0R;
        if (interfaceC678133v != null) {
            interfaceC678133v.release();
        }
    }

    @Override // X.InterfaceC25206BDe
    public final void Dop() {
        AbstractC55030OXn.A00(this.A01.A0C());
    }

    @Override // X.InterfaceC25206BDe
    public final void Doq() {
        FilterFragmentLayout filterFragmentLayout = this.A00;
        C50724MaP c50724MaP = this.A01;
        filterFragmentLayout.A00 = c50724MaP.A0H;
        UserSession A0C = c50724MaP.A0C();
        C37964Gn6 c37964Gn6 = this.A02;
        String str = AbstractC50666MYj.A00(c50724MaP.A0C()).A02;
        if (str == null) {
            str = "";
        }
        AbstractC55030OXn.A01(A0C, c37964Gn6, str);
    }

    @Override // X.InterfaceC25206BDe
    public final void Dor() {
        C50724MaP c50724MaP = this.A01;
        C47811L9t c47811L9t = c50724MaP.A0L;
        if (c47811L9t != null) {
            c47811L9t.A01(EnumC46263Kdv.A02, this.A02);
        }
        C8Z9 c8z9 = c50724MaP.A0H;
        if (c8z9 != null) {
            c8z9.A04(false);
        }
        UserSession A0C = c50724MaP.A0C();
        C37964Gn6 c37964Gn6 = this.A02;
        String str = AbstractC50666MYj.A00(c50724MaP.A0C()).A02;
        if (str == null) {
            str = "";
        }
        AbstractC55030OXn.A02(A0C, c37964Gn6, str, "photo_filter", false);
    }
}
