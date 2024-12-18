package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.facebook.R;

/* renamed from: X.Afi, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23771Afi implements C8FV {
    public final Drawable A00;
    public final String A01;
    public final InterfaceC16820sZ A02;

    @Override // X.C8FV
    public final boolean EiV() {
        return false;
    }

    @Override // X.C8FV
    public final boolean Eiu() {
        return true;
    }

    @Override // X.C8FV
    public final int B1J() {
        return 0;
    }

    @Override // X.C8FV
    public final String B1K() {
        return this.A01;
    }

    @Override // X.C8FV
    public final Drawable B1L() {
        return this.A00;
    }

    @Override // X.C8FV
    public final String Bsb() {
        return (String) this.A02.invoke();
    }

    public C23771Afi(Context context, InterfaceC16820sZ interfaceC16820sZ) {
        this.A02 = interfaceC16820sZ;
        Drawable drawable = context.getDrawable(R.drawable.instagram_circle_x_pano_outline_24);
        C14360o3.A0A(drawable);
        Drawable mutate = drawable.mutate();
        mutate.setTint(-1);
        this.A00 = mutate;
        this.A01 = AbstractC166997dE.A0p(context, 2131956011);
    }
}
