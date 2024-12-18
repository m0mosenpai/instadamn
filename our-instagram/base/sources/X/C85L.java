package X;

import android.content.Context;
import android.graphics.Rect;
import com.instagram.common.session.UserSession;
import com.instagram.ml.imagecrop.ig.IgSmartImageCropController$predictAsync$2;
import java.util.HashMap;

/* renamed from: X.85L, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C85L {
    public final C85X A00;
    public final C85M A01;
    public final HashMap A02;

    public C85L(Context context, UserSession userSession) {
        C14360o3.A0B(context, 1);
        C14360o3.A0B(userSession, 2);
        this.A01 = new C85M(context, userSession);
        this.A00 = new C85X(new C85N(context, userSession));
        this.A02 = new HashMap();
    }

    public final Rect A00(String str) {
        C14360o3.A0B(str, 0);
        HashMap hashMap = this.A02;
        if (hashMap.containsKey(str)) {
            return (Rect) hashMap.get(str);
        }
        return null;
    }

    public final void A01(String str, InterfaceC16820sZ interfaceC16820sZ, int i, int i2, int i3) {
        C14360o3.A0B(str, 3);
        if (this.A02.containsKey(str)) {
            interfaceC16820sZ.invoke();
            return;
        }
        C19K A02 = AnonymousClass194.A02(C12L.A00.AOT(497892810, 3));
        IgSmartImageCropController$predictAsync$2 igSmartImageCropController$predictAsync$2 = new IgSmartImageCropController$predictAsync$2(this, str, null, interfaceC16820sZ, i, i2, i3);
        AbstractC23641Du.A03(C05F.A00, AnonymousClass191.A00, igSmartImageCropController$predictAsync$2, A02);
    }
}
