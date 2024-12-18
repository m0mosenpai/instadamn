package X;

import com.instagram.common.session.UserSession;
import com.instagram.direct.fragment.thread.threaddetail.customization.ThreadDetailCustomGroupNameAndImageViewModel$PickerItem$EmojiItem;

/* renamed from: X.Fr3, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C35766Fr3 implements InterfaceC52932ba {
    public final UserSession A00;
    public final ThreadDetailCustomGroupNameAndImageViewModel$PickerItem$EmojiItem A01;

    public C35766Fr3(UserSession userSession, ThreadDetailCustomGroupNameAndImageViewModel$PickerItem$EmojiItem threadDetailCustomGroupNameAndImageViewModel$PickerItem$EmojiItem) {
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
        this.A01 = threadDetailCustomGroupNameAndImageViewModel$PickerItem$EmojiItem;
    }

    @Override // X.InterfaceC52932ba
    public final /* synthetic */ AbstractC52922bZ create(InterfaceC16510rw interfaceC16510rw, AbstractC52972be abstractC52972be) {
        return AbstractC53002bh.A00(this, abstractC52972be, interfaceC16510rw);
    }

    @Override // X.InterfaceC52932ba
    public final /* synthetic */ AbstractC52922bZ create(Class cls, AbstractC52972be abstractC52972be) {
        return AbstractC53002bh.A01(this, cls);
    }

    @Override // X.InterfaceC52932ba
    public final AbstractC52922bZ create(Class cls) {
        return new C44502Jm8(this.A00, this.A01);
    }
}
