package X;

import android.app.Activity;
import java.util.Map;

/* renamed from: X.Ouk, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56067Ouk implements InterfaceC23471Cj {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ C55516Ol9 A01;
    public final /* synthetic */ boolean A02;

    public C56067Ouk(Activity activity, C55516Ol9 c55516Ol9, boolean z) {
        this.A01 = c55516Ol9;
        this.A02 = z;
        this.A00 = activity;
    }

    @Override // X.InterfaceC23471Cj
    public final void DYE(Map map) {
        C23031Ai c23031Ai;
        InterfaceC16530ry interfaceC16530ry;
        C0YR[] c0yrArr;
        int i;
        Object obj = map.get("android.permission.WRITE_EXTERNAL_STORAGE");
        boolean A1X = AbstractC167007dF.A1X(obj, EnumC172127lh.A05);
        C55516Ol9 c55516Ol9 = this.A01;
        int A0H = AbstractC166987dD.A0H(c55516Ol9.A02);
        if (A0H != 0) {
            if (A0H != 1) {
                C23031Ai A00 = AbstractC23021Ah.A00(((C52777NXj) c55516Ol9.A01).A00);
                AbstractC167007dF.A1L(A00, A00.A7r, C23031Ai.A8c, 31, A1X);
                if (this.A02 && obj == EnumC172127lh.A04) {
                    WGH.A02(this.A00, 2131974429);
                    return;
                }
            }
            c23031Ai = (C23031Ai) c55516Ol9.A03;
            interfaceC16530ry = c23031Ai.A7G;
            c0yrArr = C23031Ai.A8c;
            i = 33;
        } else {
            c23031Ai = (C23031Ai) c55516Ol9.A03;
            interfaceC16530ry = c23031Ai.A7F;
            c0yrArr = C23031Ai.A8c;
            i = 32;
        }
        AbstractC167007dF.A1L(c23031Ai, interfaceC16530ry, c0yrArr, i, A1X);
        if (this.A02) {
        }
    }
}
