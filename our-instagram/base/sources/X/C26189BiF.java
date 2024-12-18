package X;

import com.instagram.creation.channels.model.AddChannelsRowChannelInfo;

/* renamed from: X.BiF, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26189BiF extends C0T6 implements InterfaceC30940Diu {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C26189BiF(C51760Mtj c51760Mtj, AddChannelsRowChannelInfo addChannelsRowChannelInfo, int i) {
        this.A00 = i;
        this.A02 = addChannelsRowChannelInfo;
        this.A01 = c51760Mtj;
    }

    public static boolean A00(Object obj, int i) {
        if ((obj instanceof C26189BiF) && ((C26189BiF) obj).A00 == i) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC30940Diu
    public final C51760Mtj AYl() {
        return (C51760Mtj) this.A01;
    }

    public final boolean equals(Object obj) {
        int i;
        if (this.A00 != 0) {
            if (this != obj) {
                i = 1;
            } else {
                return true;
            }
        } else if (this != obj) {
            i = 0;
        } else {
            return true;
        }
        if (A00(obj, i)) {
            C26189BiF c26189BiF = (C26189BiF) obj;
            if (!C14360o3.A0K(this.A02, c26189BiF.A02) || !C14360o3.A0K(this.A01, c26189BiF.A01)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A01, AbstractC166987dD.A0G(this.A02));
    }
}
