package X;

import com.instagram.preferences.common.async.AsyncKeyValueStoreWrapper$getBoolean$$inlined$map$1$2;

/* loaded from: classes9.dex */
public final class PVE implements InterfaceC19390xP {
    public final /* synthetic */ String A00;
    public final /* synthetic */ InterfaceC19390xP A01;
    public final /* synthetic */ boolean A02;

    public PVE(String str, InterfaceC19390xP interfaceC19390xP, boolean z) {
        this.A01 = interfaceC19390xP;
        this.A00 = str;
        this.A02 = z;
    }

    @Override // X.InterfaceC19390xP
    public final Object collect(InterfaceC19960yQ interfaceC19960yQ, InterfaceC23621Ds interfaceC23621Ds) {
        return AbstractC167017dG.A0i(interfaceC23621Ds, this.A01, new AsyncKeyValueStoreWrapper$getBoolean$$inlined$map$1$2(this.A00, interfaceC19960yQ, this.A02));
    }
}
