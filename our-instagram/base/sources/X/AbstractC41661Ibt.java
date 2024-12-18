package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.shopping.ProductArEffectMetadata;
import com.instagram.model.shopping.productimagecontainer.ProductImageContainerImpl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Ibt, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC41661Ibt {
    /* JADX WARN: Code restructure failed: missing block: B:19:0x004f, code lost:
    
        if (X.C14360o3.A0K(r4.getId(), r10.userId) == false) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.IN1 A01(com.instagram.common.session.UserSession r10, X.C41078IGv r11) {
        /*
            Method dump skipped, instructions count: 339
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC41661Ibt.A01(com.instagram.common.session.UserSession, X.IGv):X.IN1");
    }

    public static final ArrayList A02(UserSession userSession, List list) {
        C14360o3.A0B(userSession, 0);
        ArrayList A0q = AbstractC25230BEn.A0q(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            IN1 A01 = A01(userSession, (C41078IGv) it.next());
            if (A01 != null) {
                A0q.add(A01);
            }
        }
        return A0q;
    }

    public static final C39354HZt A00(IJ9 ij9, String str) {
        String str2 = ij9.A04;
        String str3 = ij9.A03;
        ProductArEffectMetadata productArEffectMetadata = ij9.A00;
        C14360o3.A06(productArEffectMetadata);
        ProductImageContainerImpl productImageContainerImpl = ij9.A01;
        return new C39354HZt(productImageContainerImpl.A00, productArEffectMetadata, null, str, str2, str3, productImageContainerImpl.A01, ij9.A02);
    }
}
