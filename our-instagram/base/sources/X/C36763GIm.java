package X;

import com.instagram.user.follow.FollowButtonBase;
import com.instagram.user.model.FollowStatus;
import com.instagram.user.model.User;

/* renamed from: X.GIm, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36763GIm implements InterfaceC37219GaU {
    public final /* synthetic */ FollowButtonBase A00;
    public final /* synthetic */ InterfaceC77483dY A01;
    public final /* synthetic */ FollowStatus A02;
    public final /* synthetic */ User A03;

    @Override // X.InterfaceC37219GaU
    public final void Czi() {
    }

    @Override // X.InterfaceC37219GaU
    public final void DFf() {
    }

    public C36763GIm(FollowButtonBase followButtonBase, InterfaceC77483dY interfaceC77483dY, FollowStatus followStatus, User user) {
        this.A01 = interfaceC77483dY;
        this.A03 = user;
        this.A02 = followStatus;
        this.A00 = followButtonBase;
    }

    @Override // X.InterfaceC37219GaU
    public final void D6t() {
        InterfaceC77483dY interfaceC77483dY = this.A01;
        if (interfaceC77483dY != null) {
            interfaceC77483dY.D3u(this.A02, this.A03);
        }
    }

    @Override // X.InterfaceC37219GaU
    public final void DqX() {
        InterfaceC77483dY interfaceC77483dY = this.A01;
        if (interfaceC77483dY != null) {
            interfaceC77483dY.DHu(EnumC33402EpZ.A09, this.A03);
        }
    }

    @Override // X.InterfaceC37219GaU
    public final void onCancel() {
        this.A00.setEnabled(true);
        InterfaceC77483dY interfaceC77483dY = this.A01;
        if (interfaceC77483dY != null) {
            interfaceC77483dY.DHr(this.A03);
        }
    }

    @Override // X.InterfaceC37219GaU
    public final void onSuccess() {
        InterfaceC77483dY interfaceC77483dY = this.A01;
        if (interfaceC77483dY != null) {
            interfaceC77483dY.DHr(this.A03);
        }
    }
}
