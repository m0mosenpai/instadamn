package X;

import com.instagram.preferences.common.async.NuxDisabledAsyncKeyValueStore$getLong$$inlined$map$1$2;

/* loaded from: classes9.dex */
public final class PVF implements InterfaceC19390xP {
    public final /* synthetic */ long A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ InterfaceC19390xP A02;

    public PVF(String str, InterfaceC19390xP interfaceC19390xP, long j) {
        this.A02 = interfaceC19390xP;
        this.A01 = str;
        this.A00 = j;
    }

    @Override // X.InterfaceC19390xP
    public final Object collect(InterfaceC19960yQ interfaceC19960yQ, InterfaceC23621Ds interfaceC23621Ds) {
        return AbstractC167017dG.A0i(interfaceC23621Ds, this.A02, new NuxDisabledAsyncKeyValueStore$getLong$$inlined$map$1$2(this.A01, interfaceC19960yQ, this.A00));
    }
}
