package X;

import android.graphics.drawable.Drawable;
import java.util.List;

/* renamed from: X.P8x, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56551P8x implements InterfaceC58289Psh {
    public final Drawable A00;
    public final String A01;
    public final String A02;
    public final List A03;

    @Override // X.InterfaceC58289Psh
    public final EnumC53202Nfy Aix() {
        return null;
    }

    @Override // X.InterfaceC58289Psh
    public final String Aj7() {
        return this.A01;
    }

    @Override // X.InterfaceC58289Psh
    public final List B46() {
        return this.A03;
    }

    @Override // X.InterfaceC58289Psh
    public final Drawable BGS() {
        return this.A00;
    }

    @Override // X.InterfaceC124075jM
    public final int CFw() {
        return 1;
    }

    @Override // X.InterfaceC58289Psh
    public final String getDescription() {
        return this.A02;
    }

    public C56551P8x(Drawable drawable, String str, String str2, List list) {
        this.A00 = drawable;
        this.A02 = str;
        this.A01 = str2;
        this.A03 = list;
    }
}
