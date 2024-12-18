package X;

import com.instagram.showreelnative.ui.reels.IgShowreelNativeProgressView;

/* renamed from: X.Cs0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C29073Cs0 implements InterfaceC31148Dmr {
    public final /* synthetic */ C41181vS A00;
    public final /* synthetic */ C41551w4 A01;
    public final /* synthetic */ InterfaceC145446h3 A02;
    public final /* synthetic */ C6RZ A03;
    public final /* synthetic */ IgShowreelNativeProgressView A04;

    public C29073Cs0(C41181vS c41181vS, C41551w4 c41551w4, InterfaceC145446h3 interfaceC145446h3, C6RZ c6rz, IgShowreelNativeProgressView igShowreelNativeProgressView) {
        this.A02 = interfaceC145446h3;
        this.A01 = c41551w4;
        this.A00 = c41181vS;
        this.A03 = c6rz;
        this.A04 = igShowreelNativeProgressView;
    }

    @Override // X.InterfaceC31148Dmr
    public final void Dm9() {
        this.A02.D2B(this.A01.A0H, this.A00, "tap_less");
    }

    @Override // X.InterfaceC31148Dmr
    public final void DmA() {
        this.A02.D2A(this.A00, this.A01, this.A03);
    }

    @Override // X.InterfaceC30928Dii
    public final /* bridge */ /* synthetic */ void DmB(InterfaceC84843qY interfaceC84843qY) {
        C84823qW c84823qW = (C84823qW) interfaceC84843qY;
        C14360o3.A0B(c84823qW, 0);
        int ordinal = c84823qW.A12.ordinal();
        if (ordinal != 23 && ordinal != 15) {
            if (ordinal == 10) {
                this.A02.DbT(AbstractC166997dE.A0L(this.A04), c84823qW, C05F.A00);
                return;
            }
            return;
        }
        this.A02.D4b(c84823qW);
    }
}
