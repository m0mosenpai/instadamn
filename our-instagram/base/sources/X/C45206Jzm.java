package X;

import android.content.Context;
import android.graphics.drawable.Drawable;

/* renamed from: X.Jzm, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45206Jzm extends C0T6 implements InterfaceC66482zP {
    public final Context A00;
    public final Drawable A01;
    public final C35246Fgf A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C45206Jzm) {
                C45206Jzm c45206Jzm = (C45206Jzm) obj;
                if (!C14360o3.A0K(this.A00, c45206Jzm.A00) || !C14360o3.A0K(this.A02, c45206Jzm.A02) || !C14360o3.A0K(this.A01, c45206Jzm.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        return Integer.valueOf(this.A02.A08);
    }

    public final int hashCode() {
        return AbstractC166997dE.A0J(this.A02, AbstractC166987dD.A0G(this.A00)) + AbstractC167017dG.A0M(this.A01);
    }

    public C45206Jzm(Context context, Drawable drawable, C35246Fgf c35246Fgf) {
        this.A00 = context;
        this.A02 = c35246Fgf;
        this.A01 = drawable;
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return C14360o3.A0K(obj, this);
    }
}
