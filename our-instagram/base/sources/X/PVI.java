package X;

import com.instagram.preferences.common.async.NuxDisabledAsyncKeyValueStore$getBoolean$$inlined$map$1$2;

/* loaded from: classes9.dex */
public final class PVI implements InterfaceC19390xP {
    public final /* synthetic */ C56494P6k A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ InterfaceC19390xP A02;
    public final /* synthetic */ boolean A03;

    public PVI(C56494P6k c56494P6k, String str, InterfaceC19390xP interfaceC19390xP, boolean z) {
        this.A02 = interfaceC19390xP;
        this.A00 = c56494P6k;
        this.A01 = str;
        this.A03 = z;
    }

    @Override // X.InterfaceC19390xP
    public final Object collect(InterfaceC19960yQ interfaceC19960yQ, InterfaceC23621Ds interfaceC23621Ds) {
        return AbstractC167017dG.A0i(interfaceC23621Ds, this.A02, new NuxDisabledAsyncKeyValueStore$getBoolean$$inlined$map$1$2(this.A00, this.A01, interfaceC19960yQ, this.A03));
    }
}
