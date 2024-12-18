package X;

import com.facebook.odin.model.Example;
import com.facebook.odin.model.FeatureData;
import java.util.Collections;
import java.util.List;

/* renamed from: X.94P, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C94P extends C0YY implements InterfaceC16660sJ {
    public static final C94P A00 = new C94P();

    public C94P() {
        super(1);
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        List list = (List) obj;
        C14360o3.A0B(list, 0);
        double d = 1.0d;
        List singletonList = Collections.singletonList(Double.valueOf(1.0d));
        C14360o3.A07(singletonList);
        if ((!list.isEmpty()) && list.size() == 1) {
            FeatureData featureData = (FeatureData) ((Example) list.get(0)).A02.get("3660");
            if (featureData != null) {
                d = featureData.A00;
            }
            singletonList = Collections.singletonList(Double.valueOf(d));
            C14360o3.A07(singletonList);
        }
        singletonList.toString();
        return singletonList;
    }
}
