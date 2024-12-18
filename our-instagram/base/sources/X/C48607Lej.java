package X;

import com.instagram.common.session.UserSession;
import com.instagram.creation.fragment.AlbumEditFragment;
import com.instagram.creation.photo.edit.ui.FilterFragmentLayout;

/* renamed from: X.Lej, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48607Lej implements InterfaceC25206BDe {
    public final /* synthetic */ AlbumEditFragment A00;
    public final /* synthetic */ FilterFragmentLayout A01;
    public final /* synthetic */ C37964Gn6 A02;

    public C48607Lej(AlbumEditFragment albumEditFragment, FilterFragmentLayout filterFragmentLayout, C37964Gn6 c37964Gn6) {
        this.A00 = albumEditFragment;
        this.A02 = c37964Gn6;
        this.A01 = filterFragmentLayout;
    }

    @Override // X.InterfaceC25206BDe
    public final void Doo() {
        AlbumEditFragment albumEditFragment = this.A00;
        albumEditFragment.A0V = true;
        InterfaceC678133v interfaceC678133v = albumEditFragment.A0P;
        if (interfaceC678133v != null) {
            interfaceC678133v.release();
        }
    }

    @Override // X.InterfaceC25206BDe
    public final void Dop() {
        AbstractC55030OXn.A00(this.A00.A0L());
    }

    @Override // X.InterfaceC25206BDe
    public final void Doq() {
        FilterFragmentLayout filterFragmentLayout = this.A01;
        AlbumEditFragment albumEditFragment = this.A00;
        filterFragmentLayout.A00 = albumEditFragment.A0I;
        UserSession A0L = albumEditFragment.A0L();
        C37964Gn6 c37964Gn6 = this.A02;
        String str = AbstractC50666MYj.A00(albumEditFragment.A0L()).A02;
        if (str == null) {
            str = "";
        }
        AbstractC55030OXn.A01(A0L, c37964Gn6, str);
    }

    @Override // X.InterfaceC25206BDe
    public final void Dor() {
        AlbumEditFragment albumEditFragment = this.A00;
        C47811L9t c47811L9t = albumEditFragment.A0K;
        if (c47811L9t != null) {
            c47811L9t.A01(EnumC46263Kdv.A02, this.A02);
        }
        C8Z9 c8z9 = albumEditFragment.A0I;
        if (c8z9 != null) {
            c8z9.A04(false);
        }
        UserSession A0L = albumEditFragment.A0L();
        C37964Gn6 c37964Gn6 = this.A02;
        String str = AbstractC50666MYj.A00(albumEditFragment.A0L()).A02;
        if (str == null) {
            str = "";
        }
        AbstractC55030OXn.A02(A0L, c37964Gn6, str, albumEditFragment.A0Z, C36A.A0F(albumEditFragment.A0L()));
    }
}
