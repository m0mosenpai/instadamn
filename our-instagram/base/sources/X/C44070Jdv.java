package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.profile.fragment.UserDetailFragment;

/* renamed from: X.Jdv, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44070Jdv implements InterfaceC09250da, InterfaceC16820sZ {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C44070Jdv(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }

    @Override // X.InterfaceC16820sZ
    public final Object invoke() {
        switch (this.A00) {
            case 0:
                C169917i6 c169917i6 = (C169917i6) this.A02;
                InterfaceC169817hv interfaceC169817hv = CNL.A01;
                c169917i6.A0H();
                return C0eB.A00;
            case 1:
                ((C43848JaC) this.A02).A00(((ViewOnClickListenerC43832JZv) this.A01).getCombinedFolders());
                return null;
            case 2:
                return new C31641Dv7((UserSession) this.A02, ((C31600DuS) this.A01).A0E);
            case 3:
                return new TF8((Context) this.A01, (AbstractC12990ll) this.A02);
            default:
                UserDetailFragment userDetailFragment = (UserDetailFragment) this.A01;
                userDetailFragment.A1I.Dcp((C4NL) this.A02);
                return null;
        }
    }
}
