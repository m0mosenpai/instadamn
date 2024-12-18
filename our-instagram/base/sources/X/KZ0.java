package X;

import com.instagram.reels.common.ui.StoryTypeSelectorView;

/* loaded from: classes8.dex */
public final class KZ0 extends StoryTypeSelectorView {
    public InterfaceC148186lo A00;
    public Boolean A01;

    public final void setSelectedQuickReactionsType(EnumC46193KcV enumC46193KcV) {
        EnumC184458Gk enumC184458Gk;
        C14360o3.A0B(enumC46193KcV, 0);
        if (enumC46193KcV == EnumC46193KcV.A05) {
            enumC184458Gk = EnumC184458Gk.A02;
        } else {
            enumC184458Gk = EnumC184458Gk.A03;
        }
        setSelectedType(enumC184458Gk);
    }

    public final InterfaceC148186lo getListener() {
        return this.A00;
    }

    public final EnumC46193KcV getSelectedQuickReactionsType() {
        if (this.A02 == EnumC184458Gk.A02) {
            return EnumC46193KcV.A05;
        }
        return EnumC46193KcV.A04;
    }

    public final void setAvatarQRAvailable(Boolean bool) {
        this.A01 = bool;
    }

    public final void setListener(InterfaceC148186lo interfaceC148186lo) {
        this.A00 = interfaceC148186lo;
    }
}
