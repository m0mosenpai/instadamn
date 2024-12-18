package X;

import com.facebook.rsys.callmanager.callclient.gen.CallEndedApi;

/* renamed from: X.Pih, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C57692Pih extends C0YY implements InterfaceC16660sJ {
    public static final C57692Pih A00 = new C57692Pih();

    public C57692Pih() {
        super(1);
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        CallEndedApi callEndedApi = MSX.A0T(obj).A01.A01;
        if (callEndedApi != null) {
            callEndedApi.removeCall();
        }
        return C0eB.A00;
    }
}
