package X;

import android.graphics.drawable.Drawable;
import java.util.List;

/* renamed from: X.P8w, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56550P8w implements InterfaceC58289Psh {
    public final Drawable A00;
    public final EnumC53202Nfy A01;
    public final String A02;
    public final String A03;

    @Override // X.InterfaceC58289Psh
    public final EnumC53202Nfy Aix() {
        return this.A01;
    }

    @Override // X.InterfaceC58289Psh
    public final String Aj7() {
        return this.A02;
    }

    @Override // X.InterfaceC58289Psh
    public final List B46() {
        return null;
    }

    @Override // X.InterfaceC58289Psh
    public final Drawable BGS() {
        return this.A00;
    }

    @Override // X.InterfaceC124075jM
    public final int CFw() {
        return 0;
    }

    @Override // X.InterfaceC58289Psh
    public final String getDescription() {
        return this.A03;
    }

    public C56550P8w(Drawable drawable, EnumC53202Nfy enumC53202Nfy, String str, String str2) {
        this.A00 = drawable;
        this.A03 = str;
        this.A02 = str2;
        this.A01 = enumC53202Nfy;
    }
}
