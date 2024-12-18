package X;

import java.util.List;

/* renamed from: X.SvL, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63887SvL implements InterfaceC65610To1 {
    public boolean A00;
    public final /* synthetic */ ComponentCallbacks2C63416Sju A01;
    public final /* synthetic */ List A02;

    public C63887SvL(ComponentCallbacks2C63416Sju componentCallbacks2C63416Sju, List list) {
        this.A01 = componentCallbacks2C63416Sju;
        this.A02 = list;
    }

    @Override // X.InterfaceC65610To1
    public final /* bridge */ /* synthetic */ Object get() {
        if (!this.A00) {
            this.A00 = true;
            AbstractC020908f.A00("Glide registry");
            try {
                return AbstractC61680Rru.A00(this.A01, this.A02);
            } finally {
                AbstractC021008g.A00();
            }
        }
        throw AbstractC166987dD.A14("Recursive Registry initialization! In your AppGlideModule and LibraryGlideModules, Make sure you're using the provided Registry rather calling glide.getRegistry()!");
    }
}
