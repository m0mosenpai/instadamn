package X;

import com.instagram.profile.fragment.UserDetailFragment;

/* loaded from: classes6.dex */
public final /* synthetic */ class GSk extends C03E implements InterfaceC16600sD {
    public GSk(Object obj) {
        super(4, obj, C53K.class, "onAvatarCoinFlipSettingChanged", "onAvatarCoinFlipSettingChanged(Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", 0);
    }

    @Override // X.InterfaceC16600sD
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        Boolean bool = (Boolean) obj;
        String str = (String) obj2;
        String str2 = (String) obj3;
        String str3 = (String) obj4;
        C31370Dqa c31370Dqa = ((UserDetailFragment) this.receiver).A0k;
        if (c31370Dqa != null) {
            c31370Dqa.A04(bool.booleanValue(), str, str2, str3);
        }
        return C0eB.A00;
    }
}
