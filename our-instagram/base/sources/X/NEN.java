package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.archive.fragment.ArchiveReelPeopleFragment;
import com.instagram.user.model.User;

/* loaded from: classes9.dex */
public final class NEN extends AbstractC66412zI {
    public final ArchiveReelPeopleFragment A00;
    public final InterfaceC11380iw A01;

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        C56078Ouv c56078Ouv = (C56078Ouv) interfaceC66482zP;
        C51377Mmc c51377Mmc = (C51377Mmc) c3oo;
        InterfaceC11380iw interfaceC11380iw = this.A01;
        c51377Mmc.A00 = c56078Ouv;
        User user = c56078Ouv.A00;
        AbstractC31173DnH.A1T(interfaceC11380iw, c51377Mmc.A06, user);
        AbstractC31173DnH.A1F(c51377Mmc.A04, user);
        c51377Mmc.A02.stop();
        c51377Mmc.A01.setVisibility(8);
        c51377Mmc.A05.setVisibility(8);
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C56078Ouv.class;
    }

    public NEN(ArchiveReelPeopleFragment archiveReelPeopleFragment, InterfaceC11380iw interfaceC11380iw) {
        this.A01 = interfaceC11380iw;
        this.A00 = archiveReelPeopleFragment;
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        return new C51377Mmc(AbstractC31172DnG.A0A(layoutInflater, viewGroup, R.layout.layout_people_grid_item), this.A00);
    }
}
