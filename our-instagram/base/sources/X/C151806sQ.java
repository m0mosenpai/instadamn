package X;

import com.instagram.profile.fragment.UserDetailFragment;

/* renamed from: X.6sQ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C151806sQ extends C03E implements InterfaceC16620sF {
    public C151806sQ(Object obj) {
        super(2, obj, C53K.class, "onAvatarCoinFlipSettingChanged", "onAvatarCoinFlipSettingChanged(Ljava/lang/String;Ljava/lang/Boolean;)V", 0);
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        String str = (String) obj;
        Boolean bool = (Boolean) obj2;
        C31370Dqa c31370Dqa = ((UserDetailFragment) this.receiver).A0k;
        if (c31370Dqa != null) {
            c31370Dqa.A04(bool.booleanValue(), null, null, str);
        }
        return C0eB.A00;
    }
}
