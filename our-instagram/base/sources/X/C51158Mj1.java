package X;

import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Mj1, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51158Mj1 extends C2UU {
    public final C65422xe A00;
    public final C51090Mhp A01;
    public final InterfaceC11380iw A02;
    public final UserSession A03;
    public final InterfaceC58059Pok A04;

    public C51158Mj1(InterfaceC11380iw interfaceC11380iw, UserSession userSession, InterfaceC58059Pok interfaceC58059Pok) {
        int A07 = AbstractC25230BEn.A07(1, userSession, interfaceC58059Pok);
        this.A03 = userSession;
        this.A02 = interfaceC11380iw;
        this.A04 = interfaceC58059Pok;
        C51090Mhp c51090Mhp = new C51090Mhp(A07);
        this.A01 = c51090Mhp;
        this.A00 = new C65422xe(c51090Mhp, this);
    }

    @Override // X.C2UU
    public final void onBindViewHolder(C3OO c3oo, int i) {
        UserSession userSession;
        C51322Mlj c51322Mlj;
        InterfaceC58059Pok interfaceC58059Pok;
        Reel reel;
        InterfaceC11380iw interfaceC11380iw;
        boolean z = false;
        C14360o3.A0B(c3oo, 0);
        InterfaceC57848PlE interfaceC57848PlE = (InterfaceC57848PlE) this.A00.A02.get(i);
        int itemViewType = getItemViewType(i);
        if (itemViewType != 0) {
            if (itemViewType == 2) {
                userSession = this.A03;
                c51322Mlj = (C51322Mlj) c3oo;
                interfaceC58059Pok = this.A04;
                C14360o3.A0C(interfaceC57848PlE, "null cannot be cast to non-null type com.instagram.reels.prompt.mvvm.data.PromptStickerViewerItem.TemplateAuthorReel");
                reel = (Reel) ((C51854Mvy) interfaceC57848PlE).A01;
                interfaceC11380iw = this.A02;
                z = true;
            } else {
                return;
            }
        } else {
            userSession = this.A03;
            c51322Mlj = (C51322Mlj) c3oo;
            interfaceC58059Pok = this.A04;
            C14360o3.A0C(interfaceC57848PlE, "null cannot be cast to non-null type com.instagram.reels.prompt.mvvm.data.PromptStickerViewerItem.ParticipantReel");
            reel = (Reel) ((C51854Mvy) interfaceC57848PlE).A01;
            interfaceC11380iw = this.A02;
        }
        AbstractC54132NwU.A00(interfaceC11380iw, userSession, reel, interfaceC58059Pok, c51322Mlj, z);
    }

    @Override // X.C2UU
    public final C3OO onCreateViewHolder(ViewGroup viewGroup, int i) {
        C14360o3.A0B(viewGroup, 0);
        if (i != 0 && i != 2) {
            int i2 = C3OO.FLAG_ADAPTER_FULLUPDATE;
            return new C3OO(AbstractC25226BEj.A0R(AbstractC25228BEl.A0P(viewGroup), viewGroup, R.layout.prompt_sticker_viewer_pagination_spinner, false));
        }
        int i3 = C3OO.FLAG_ADAPTER_FULLUPDATE;
        return new C51322Mlj(AbstractC25226BEj.A0R(AbstractC25228BEl.A0P(viewGroup), viewGroup, R.layout.prompt_participant_grid_item, false));
    }

    public final List A00() {
        C51854Mvy c51854Mvy;
        Object obj;
        C51854Mvy c51854Mvy2;
        List<InterfaceC57848PlE> list = this.A00.A02;
        ArrayList A10 = AbstractC31174DnI.A10(list);
        for (InterfaceC57848PlE interfaceC57848PlE : list) {
            if ((C51854Mvy.A00(interfaceC57848PlE, 1) && (c51854Mvy2 = (C51854Mvy) interfaceC57848PlE) != null && (obj = c51854Mvy2.A01) != null) || (C51854Mvy.A00(interfaceC57848PlE, 0) && (c51854Mvy = (C51854Mvy) interfaceC57848PlE) != null && (obj = c51854Mvy.A01) != null)) {
                A10.add(obj);
            }
        }
        return A10;
    }

    @Override // X.C2UU
    public final int getItemCount() {
        int A03 = C0f9.A03(1409010273);
        int size = this.A00.A02.size();
        C0f9.A0A(-1132726087, A03);
        return size;
    }

    @Override // X.C2UU, android.widget.Adapter
    public final int getItemViewType(int i) {
        int i2;
        int A03 = C0f9.A03(1167454811);
        Object obj = this.A00.A02.get(i);
        if (obj instanceof C56547P8t) {
            i2 = 1;
        } else if (C51854Mvy.A00(obj, 0)) {
            i2 = 0;
        } else if (C51854Mvy.A00(obj, 1)) {
            i2 = 2;
        } else {
            B4Z A00 = B4Z.A00();
            C0f9.A0A(379160536, A03);
            throw A00;
        }
        C0f9.A0A(1454456073, A03);
        return i2;
    }
}
