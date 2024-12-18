package X;

import com.instagram.friendmap.data.MapText;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.quicksnap.emitter.QuickSnapReactionEmitterView;

/* renamed from: X.Lsl, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49411Lsl implements InterfaceC31150Dmu {
    public final /* synthetic */ KCU A00;

    @Override // X.InterfaceC31150Dmu
    public final void Dd5(C45128JyU c45128JyU, String str) {
        C14360o3.A0B(str, 0);
        KCU kcu = this.A00;
        C45999KXn A0e = AbstractC43593JPy.A0e(kcu);
        DirectShareTarget A00 = AbstractC47888LDi.A00(EnumC152186t3.FRIEND_MAP, A0e.A02, c45128JyU, str);
        if (A00 != null) {
            InterfaceC83713oG A01 = A00.A01();
            A0e.A0M(new C49449LtN(c45128JyU.A06.Bhu(), new MapText.Res(2131962906, new String[0]), new MapText.Res(2131962907, new String[0]), A01));
        }
        A0e.A0M(C49458LtW.A00);
        AbstractC43592JPx.A0i(kcu.A0n).A0E(str, true);
    }

    public C49411Lsl(KCU kcu) {
        this.A00 = kcu;
    }

    @Override // X.InterfaceC58270PsO
    public final QuickSnapReactionEmitterView Bkf() {
        return this.A00.A0h;
    }

    @Override // X.C07X
    public final C07T getLifecycle() {
        C0eR c0eR = this.A00.mLifecycleRegistry;
        C14360o3.A07(c0eR);
        return c0eR;
    }
}
