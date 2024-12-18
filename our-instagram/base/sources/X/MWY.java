package X;

import com.instagram.profile.fragment.UserDetailFragment;
import com.instagram.user.model.User;
import java.lang.ref.WeakReference;

/* loaded from: classes9.dex */
public final class MWY implements C53M {
    public WeakReference A00;

    @Override // X.C53M
    public final void CmM() {
        UserDetailFragment userDetailFragment;
        WeakReference weakReference = this.A00;
        if (weakReference != null && (userDetailFragment = (UserDetailFragment) weakReference.get()) != null) {
            userDetailFragment.CmM();
        }
    }

    @Override // X.C53M
    public final void DGu(boolean z, boolean z2, String str) {
        UserDetailFragment userDetailFragment;
        WeakReference weakReference = this.A00;
        if (weakReference != null && (userDetailFragment = (UserDetailFragment) weakReference.get()) != null) {
            userDetailFragment.DGu(z, z2, str);
        }
    }

    @Override // X.C53M
    public final void Dxm() {
        WeakReference weakReference = this.A00;
        if (weakReference != null) {
            weakReference.get();
        }
    }

    @Override // X.C53M
    public final void DyF(C72X c72x, User user, String str, long j, boolean z) {
        UserDetailFragment userDetailFragment;
        WeakReference weakReference = this.A00;
        if (weakReference != null && (userDetailFragment = (UserDetailFragment) weakReference.get()) != null) {
            userDetailFragment.DyF(c72x, user, str, j, z);
        }
    }

    @Override // X.C53M
    public final void EWZ(boolean z) {
        UserDetailFragment userDetailFragment;
        WeakReference weakReference = this.A00;
        if (weakReference != null && (userDetailFragment = (UserDetailFragment) weakReference.get()) != null) {
            userDetailFragment.EWZ(z);
        }
    }

    @Override // X.C53M
    public final void EcE(InterfaceC58263Ps7 interfaceC58263Ps7) {
        UserDetailFragment userDetailFragment;
        WeakReference weakReference = this.A00;
        if (weakReference != null && (userDetailFragment = (UserDetailFragment) weakReference.get()) != null) {
            userDetailFragment.EcE(interfaceC58263Ps7);
        }
    }

    @Override // X.C53M
    public final boolean isValid() {
        UserDetailFragment userDetailFragment;
        WeakReference weakReference = this.A00;
        if (weakReference != null && (userDetailFragment = (UserDetailFragment) weakReference.get()) != null) {
            return userDetailFragment.isValid();
        }
        return true;
    }
}
