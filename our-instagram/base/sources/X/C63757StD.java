package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import java.security.MessageDigest;

/* renamed from: X.StD, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63757StD implements InterfaceC65632Tpt {
    public final InterfaceC65632Tpt A00;
    public final boolean A01;

    @Override // X.InterfaceC65617To8
    public final void FAj(MessageDigest messageDigest) {
        this.A00.FAj(messageDigest);
    }

    @Override // X.InterfaceC65617To8
    public final boolean equals(Object obj) {
        if (obj instanceof C63757StD) {
            return this.A00.equals(((C63757StD) obj).A00);
        }
        return false;
    }

    @Override // X.InterfaceC65617To8
    public final int hashCode() {
        return this.A00.hashCode();
    }

    public C63757StD(InterfaceC65632Tpt interfaceC65632Tpt, boolean z) {
        this.A00 = interfaceC65632Tpt;
        this.A01 = z;
    }

    @Override // X.InterfaceC65632Tpt
    public final InterfaceC65558Tme F8G(Context context, InterfaceC65558Tme interfaceC65558Tme, int i, int i2) {
        InterfaceC65571Tn4 interfaceC65571Tn4 = ComponentCallbacks2C63416Sju.A00(context).A01;
        Drawable drawable = (Drawable) interfaceC65558Tme.get();
        C63791Stl A00 = STB.A00(drawable, interfaceC65571Tn4, i, i2);
        if (A00 == null) {
            if (this.A01) {
                StringBuilder A1C = AbstractC166987dD.A1C();
                A1C.append("Unable to convert ");
                A1C.append(drawable);
                throw AbstractC58320PtC.A0m(" to a Bitmap", A1C);
            }
            return interfaceC65558Tme;
        }
        InterfaceC65558Tme F8G = this.A00.F8G(context, A00, i, i2);
        if (F8G.equals(A00)) {
            F8G.recycle();
            return interfaceC65558Tme;
        }
        return new C63792Stm(context.getResources(), F8G);
    }
}
