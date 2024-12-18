package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.api.schemas.ContainerEffectEnum;
import com.instagram.api.schemas.DynamicEffectState;
import com.instagram.common.session.UserSession;
import com.instagram.model.shopping.ProductArEffectMetadata;
import com.instagram.user.model.Product;

/* renamed from: X.HxJ, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40481HxJ {
    public static Object A00(C6FQ c6fq, C6FW c6fw) {
        Product product;
        C6FG c6fg = (C6FG) c6fw.A01();
        String str = (String) c6fw.A02();
        Object A00 = c6fw.A00();
        FragmentActivity A04 = C6BQ.A04(c6fq);
        UserSession A0K = AbstractC31179DnN.A0K(c6fq);
        C41121IIm A02 = AbstractC41652Ibk.A02(c6fg, A0K, "BKBloksActionCxfCpdpTryInARCTAImpl");
        if (A02 != null && (product = A02.A00.A06) != null) {
            ContainerEffectEnum containerEffectEnum = (ContainerEffectEnum) ContainerEffectEnum.A01.get(A00);
            if (containerEffectEnum == null) {
                containerEffectEnum = ContainerEffectEnum.A0I;
            }
            C1XJ.A00.A08(A04, C22P.A4K, A0K, new ProductArEffectMetadata(containerEffectEnum, DynamicEffectState.A05, null, str, null, null), product, A02.A02, "instagram_shopping_pdp").A01();
            return null;
        }
        C0w9.A03("BKBloksActionCxfCpdpTryInARCTAImpl", "arguments or product is null");
        return null;
    }
}
