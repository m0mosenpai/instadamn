package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import java.util.List;

/* loaded from: classes8.dex */
public final class KJP extends AbstractC66422zJ {
    public final InterfaceC11380iw A00;
    public final InterfaceC16620sF A01;

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC167007dF.A1K(viewGroup, layoutInflater);
        return new C44684JqT(AbstractC25227BEk.A0D(layoutInflater, viewGroup, R.layout.avatar_mentionable_friends_tray_layout, false));
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        C45180JzM c45180JzM = (C45180JzM) interfaceC66482zP;
        C44684JqT c44684JqT = (C44684JqT) c3oo;
        AbstractC167007dF.A1K(c45180JzM, c44684JqT);
        AbstractC46386Kg8 abstractC46386Kg8 = c45180JzM.A00;
        if (abstractC46386Kg8 instanceof KAT) {
            AbstractC31171DnF.A1M(c44684JqT.A02);
            return;
        }
        if (abstractC46386Kg8 instanceof KAR) {
            RecyclerView recyclerView = c44684JqT.A00;
            recyclerView.setVisibility(0);
            AbstractC43592JPx.A1S(c44684JqT.A02);
            C2UU c2uu = recyclerView.A0A;
            if (c2uu == null) {
                AbstractC31174DnI.A17(AbstractC31172DnG.A05(c44684JqT), recyclerView, false);
                C44558Jne c44558Jne = new C44558Jne(this.A00, this.A01);
                List list = ((KAR) abstractC46386Kg8).A00;
                C14360o3.A0B(list, 0);
                AbstractC31175DnJ.A0x(c44558Jne, list, c44558Jne.A00);
                recyclerView.setAdapter(c44558Jne);
                return;
            }
            List list2 = ((C44558Jne) c2uu).A00;
            List list3 = ((KAR) abstractC46386Kg8).A00;
            if (C14360o3.A0K(list2, list3)) {
                return;
            }
            C2UU c2uu2 = recyclerView.A0A;
            C14360o3.A0C(c2uu2, "null cannot be cast to non-null type com.instagram.avatars.mentions.adapter.AvatarsMentionableFriendsTrayAdapter");
            C44558Jne c44558Jne2 = (C44558Jne) c2uu2;
            C14360o3.A0B(list3, 0);
            AbstractC31175DnJ.A0x(c44558Jne2, list3, c44558Jne2.A00);
            recyclerView.A0n(0);
            return;
        }
        if (abstractC46386Kg8 instanceof KAS) {
            AbstractC43592JPx.A1S(c44684JqT.A02);
            c44684JqT.A01.setVisibility(0);
            return;
        }
        throw B4Z.A00();
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C45180JzM.class;
    }

    public KJP(InterfaceC11380iw interfaceC11380iw, InterfaceC16620sF interfaceC16620sF) {
        this.A00 = interfaceC11380iw;
        this.A01 = interfaceC16620sF;
    }
}
