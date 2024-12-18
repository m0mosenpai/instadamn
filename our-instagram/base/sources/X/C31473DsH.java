package X;

import com.instagram.profile.fragment.UserDetailFragment;

/* renamed from: X.DsH, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final /* synthetic */ class C31473DsH implements InterfaceC16660sJ {
    public final /* synthetic */ UserDetailFragment A00;
    public final /* synthetic */ boolean A01;

    public /* synthetic */ C31473DsH(UserDetailFragment userDetailFragment, boolean z) {
        this.A00 = userDetailFragment;
        this.A01 = z;
    }

    @Override // X.InterfaceC16660sJ
    public final Object invoke(Object obj) {
        UserDetailFragment userDetailFragment = this.A00;
        boolean z = this.A01;
        if (obj == C125535lz.A00) {
            userDetailFragment.A0k.A02(null, Boolean.valueOf(z));
        } else {
            userDetailFragment.A0n();
        }
        return C0eB.A00;
    }
}
