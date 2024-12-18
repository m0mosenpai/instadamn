package X;

import java.util.ArrayList;

/* renamed from: X.WWw, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70459WWw implements InterfaceC58102PpR {
    public final /* synthetic */ WIM A00;

    @Override // X.InterfaceC58102PpR
    public final void DDV() {
    }

    public C70459WWw(WIM wim) {
        this.A00 = wim;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0, types: [X.A9w, java.lang.Object] */
    @Override // X.InterfaceC58102PpR
    public final void DDT() {
        WIM wim = this.A00;
        wim.A0O.set(0);
        InterfaceC16590sC interfaceC16590sC = wim.A0P;
        EnumC185018Iq enumC185018Iq = wim.A0B;
        String str = wim.A0F;
        ArrayList arrayList = new ArrayList(wim.A0M);
        int size = wim.A0N.size();
        ?? obj = new Object();
        obj.A00 = 0.0f;
        obj.A01 = 1.0f;
        obj.A03 = 0;
        obj.A04 = str;
        obj.A06 = arrayList;
        obj.A02 = size;
        interfaceC16590sC.invoke(true, enumC185018Iq, obj, Float.valueOf(wim.A01), Float.valueOf(wim.A00));
    }

    @Override // X.InterfaceC58102PpR
    public final void DDU(Exception exc, String str) {
        C0K8.A0F("DecoderOutputSurfaceHandler", "Boomerang video encoding error", exc);
    }
}
