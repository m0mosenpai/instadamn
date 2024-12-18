package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.api.schemas.ContainerEffectEnum;
import com.instagram.api.schemas.DynamicEffectState;
import com.instagram.common.session.UserSession;
import com.instagram.model.shopping.ProductArEffectMetadata;
import com.instagram.user.model.Product;

/* renamed from: X.HxK, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40482HxK {
    public static final Object A00(C6FQ c6fq, C6FW c6fw) {
        Product product;
        Object A01 = c6fw.A01();
        C14360o3.A0C(A01, "null cannot be cast to non-null type com.instagram.common.bloks.BloksContext");
        Object A02 = c6fw.A02();
        C14360o3.A0C(A02, "null cannot be cast to non-null type kotlin.String");
        String str = (String) A02;
        Object A00 = c6fw.A00();
        C14360o3.A0C(A00, "null cannot be cast to non-null type kotlin.String");
        boolean A012 = C6DZ.A01(c6fw.A03(7));
        FragmentActivity A04 = C6BQ.A04(c6fq);
        UserSession A0W = AbstractC31172DnG.A0W(c6fq);
        C41121IIm A022 = AbstractC41652Ibk.A02((C6FG) A01, A0W, "BKBloksActionCxfCpdpTryInARCTAv3Impl");
        if (A022 != null && (product = A022.A00.A06) != null) {
            ContainerEffectEnum containerEffectEnum = (ContainerEffectEnum) ContainerEffectEnum.A01.get(A00);
            if (containerEffectEnum == null) {
                containerEffectEnum = ContainerEffectEnum.A0I;
            }
            C1XJ.A00.A07(A04, C22P.A4K, A0W, new ProductArEffectMetadata(containerEffectEnum, DynamicEffectState.A05, null, str, null, null), product, Boolean.valueOf(A012), A022.A02, "instagram_shopping_pdp").A01();
            return null;
        }
        C0w9.A03("BKBloksActionCxfCpdpTryInARCTAv3Impl", "arguments or product is null");
        return null;
    }
}
