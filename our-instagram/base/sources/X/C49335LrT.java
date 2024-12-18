package X;

import com.google.common.collect.ImmutableList;

/* renamed from: X.LrT, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49335LrT implements GZ5 {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ ImmutableList A02;
    public final /* synthetic */ LLk A03;

    public C49335LrT(ImmutableList immutableList, LLk lLk, int i, int i2) {
        this.A03 = lLk;
        this.A02 = immutableList;
        this.A01 = i;
        this.A00 = i2;
    }

    @Override // X.GZ5
    public final void D1p() {
        LLk.A0N(this.A03, "direct_request_allow_folder_dialog_cancel", "swipe", null, this.A02, this.A00);
    }

    @Override // X.GZ5
    public final void DWw(C32071E6x c32071E6x) {
        LLk.A09(c32071E6x, this.A03, this.A02, this.A01);
    }
}
