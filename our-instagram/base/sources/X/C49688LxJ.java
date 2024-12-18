package X;

import java.util.HashMap;

/* renamed from: X.LxJ, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49688LxJ implements XEG {
    public final /* synthetic */ MRA A00;
    public final /* synthetic */ InterfaceC16660sJ A01;

    public C49688LxJ(MRA mra, InterfaceC16660sJ interfaceC16660sJ) {
        this.A00 = mra;
        this.A01 = interfaceC16660sJ;
    }

    @Override // X.XEG
    public final void DFS(String str, String str2, String str3) {
        this.A00.DpY(str, str2, str3);
    }

    @Override // X.XEG
    public final void DFT() {
        this.A00.Dfe();
    }

    @Override // X.XEG
    public final void DFU(String str) {
        this.A00.Dfh(str);
    }

    @Override // X.XEG
    public final void DFV(String str) {
        this.A00.DpZ(str);
    }

    @Override // X.XEG
    public final void FC0(HashMap hashMap) {
        this.A01.invoke(hashMap);
    }
}
