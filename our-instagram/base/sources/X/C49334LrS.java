package X;

import java.util.ArrayList;
import java.util.Map;

/* renamed from: X.LrS, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49334LrS implements GZ5 {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C49334LrS(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A02 = obj;
        this.A01 = obj2;
    }

    @Override // X.GZ5
    public final /* synthetic */ void D1p() {
        if (this.A00 != 0) {
            LLk.A0O((LLk) this.A01, "direct_request_allow_folder_dialog_cancel", (ArrayList) this.A02);
            return;
        }
        throw C00O.createAndThrow();
    }

    @Override // X.GZ5
    public final void DWw(C32071E6x c32071E6x) {
        if (this.A00 != 0) {
            LLk lLk = (LLk) this.A01;
            ArrayList arrayList = (ArrayList) this.A02;
            LLk.A09(c32071E6x, lLk, arrayList, LLk.A00(lLk, arrayList));
        } else {
            C31665DvV c31665DvV = (C31665DvV) this.A02;
            c31665DvV.A0B.Cpw(c32071E6x, (Map) this.A01);
            C31665DvV.A07(c31665DvV, false);
        }
    }
}
