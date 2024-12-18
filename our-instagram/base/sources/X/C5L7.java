package X;

import com.instagram.api.schemas.IGFormatLiquidityUseCaseEnum;
import java.io.IOException;

/* renamed from: X.5L7, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C5L7 {
    public static C5L8 parseFromJson(C16L c16l) {
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            IGFormatLiquidityUseCaseEnum iGFormatLiquidityUseCaseEnum = null;
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("format_liquidity_use_case".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    iGFormatLiquidityUseCaseEnum = (IGFormatLiquidityUseCaseEnum) IGFormatLiquidityUseCaseEnum.A01.get(A1P);
                    if (iGFormatLiquidityUseCaseEnum == null) {
                        iGFormatLiquidityUseCaseEnum = IGFormatLiquidityUseCaseEnum.A0B;
                    }
                }
                c16l.A0z();
            }
            return new C5L8(iGFormatLiquidityUseCaseEnum);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
