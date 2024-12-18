package X;

import com.instagram.ui.widget.nametagresultcard.impl.NametagResultCardView;
import com.instagram.user.model.FollowStatus;
import com.instagram.user.model.User;

/* renamed from: X.Dsl, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31501Dsl extends AbstractC77473dX {
    public final int A00;
    public final Object A01;

    public C31501Dsl(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.AbstractC77473dX, X.InterfaceC77483dY
    public final void D3u(FollowStatus followStatus, User user) {
        if (this.A00 != 0) {
            NametagResultCardView nametagResultCardView = (NametagResultCardView) this.A01;
            nametagResultCardView.A0C = true;
            XBN xbn = nametagResultCardView.A08;
            xbn.getClass();
            user.getUsername();
            user.getId();
            ((WXc) xbn).A0A = true;
            return;
        }
        C14360o3.A0B(user, 0);
        C31441Drl c31441Drl = (C31441Drl) this.A01;
        int bindingAdapterPosition = c31441Drl.getBindingAdapterPosition();
        if (bindingAdapterPosition == -1) {
            return;
        }
        C31440Drk c31440Drk = c31441Drl.A02.A00;
        Object A01 = c31440Drk.A01(bindingAdapterPosition);
        if (A01 instanceof C47O) {
            AbstractC31433Drd abstractC31433Drd = c31440Drk.A03;
            if (abstractC31433Drd != null) {
                abstractC31433Drd.A0E((C47O) A01, bindingAdapterPosition);
            }
        } else {
            AbstractC31433Drd abstractC31433Drd2 = c31440Drk.A03;
            if (abstractC31433Drd2 != null) {
                abstractC31433Drd2.A0A(user, bindingAdapterPosition);
            }
        }
        FollowStatus A0j = AbstractC31174DnI.A0j(c31440Drk.A08, user);
        if (A0j == FollowStatus.A05 || A0j == FollowStatus.A07) {
            c31440Drk.A0C.run();
        }
        c31440Drk.notifyItemChanged(bindingAdapterPosition);
    }

    @Override // X.AbstractC77473dX, X.InterfaceC77483dY
    public final void DHr(User user) {
        if (1 - this.A00 != 0) {
            super.DHr(user);
        }
    }

    @Override // X.AbstractC77473dX, X.InterfaceC77483dY
    public final void DHs(User user) {
        if (1 - this.A00 != 0) {
            super.DHs(user);
        }
    }

    @Override // X.AbstractC77473dX, X.InterfaceC77483dY
    public final void DHu(EnumC33402EpZ enumC33402EpZ, User user) {
        if (1 - this.A00 != 0) {
            super.DHu(enumC33402EpZ, user);
        }
    }
}
