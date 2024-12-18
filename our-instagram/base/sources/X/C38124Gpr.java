package X;

import android.content.Context;
import com.facebook.R;

/* renamed from: X.Gpr, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38124Gpr extends V5X {
    public int A00 = -1;
    public final EnumC38183Gqo A01;

    @Override // X.InterfaceC71928XAm
    public final int CFo(Context context) {
        int i;
        if (this.A00 == -1) {
            this.A00 = AbstractC13880nE.A09(context);
        }
        int A0A = AbstractC13880nE.A0A(context);
        float intBitsToFloat = Float.intBitsToFloat(context.getResources().getDimensionPixelSize(R.dimen.photo_grid_spacing));
        float f = ((A0A - (2.0f * intBitsToFloat)) / 3.0f) + intBitsToFloat;
        EnumC38183Gqo enumC38183Gqo = this.A01;
        if (enumC38183Gqo == EnumC38183Gqo.A02) {
            i = (int) f;
        } else {
            if (enumC38183Gqo == EnumC38183Gqo.A03 || enumC38183Gqo == EnumC38183Gqo.A05 || enumC38183Gqo == EnumC38183Gqo.A06 || enumC38183Gqo == EnumC38183Gqo.A04 || enumC38183Gqo == EnumC38183Gqo.A09 || enumC38183Gqo == EnumC38183Gqo.A08) {
                i = ((int) f) * 2;
            }
            return this.A00;
        }
        this.A00 = i;
        return this.A00;
    }

    @Override // X.V5X, X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        C38124Gpr c38124Gpr = (C38124Gpr) obj;
        C14360o3.A0B(c38124Gpr, 0);
        return AbstractC167007dF.A1X(c38124Gpr.A01, this.A01);
    }

    public C38124Gpr(EnumC38183Gqo enumC38183Gqo) {
        this.A01 = enumC38183Gqo;
    }
}
