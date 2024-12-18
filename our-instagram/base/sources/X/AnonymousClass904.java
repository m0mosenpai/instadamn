package X;

import android.content.Context;
import com.facebook.cameracore.mediapipeline.featureconfig.ProductFeatureConfig;
import com.facebook.cameracore.mediapipeline.services.networking.interfaces.NetworkPolicyConfiguration;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.904, reason: invalid class name */
/* loaded from: classes4.dex */
public final class AnonymousClass904 {
    public Map A00;
    public final AnonymousClass910 A01;
    public final AnonymousClass911 A02;
    public final C2039190d A03;
    public final C2040490t A04;
    public final ProductFeatureConfig A05;
    public final AnonymousClass906 A06;
    public final NetworkPolicyConfiguration A07;
    public final HashMap A08;

    public static AnonymousClass905 A00(Context context, boolean z) {
        AnonymousClass905 anonymousClass905 = new AnonymousClass905();
        if (z) {
            anonymousClass905.A05 = new AnonymousClass906(context, null, null, false);
        }
        return anonymousClass905;
    }

    public static boolean A01(AnonymousClass904 anonymousClass904, Object obj) {
        return anonymousClass904.A08.containsKey(obj);
    }

    public final AbstractC203838zs A02(C203848zt c203848zt) {
        AbstractC203838zs abstractC203838zs = (AbstractC203838zs) this.A08.get(c203848zt);
        if (abstractC203838zs != null) {
            return abstractC203838zs;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Invalid configuration key: ");
        sb.append(c203848zt);
        sb.append(" Please use hasConfiguration() to check if the configuration is available.");
        throw new IllegalArgumentException(sb.toString());
    }

    public final ArrayList A03(List list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            HashMap hashMap = this.A08;
            if (hashMap.containsKey(obj)) {
                arrayList.add(((AbstractC203838zs) hashMap.get(obj)).A00());
            }
        }
        return arrayList;
    }

    public AnonymousClass904(AnonymousClass905 anonymousClass905) {
        HashMap hashMap = new HashMap();
        this.A08 = hashMap;
        hashMap.putAll(anonymousClass905.A08);
        this.A01 = anonymousClass905.A00;
        this.A00 = anonymousClass905.A07;
        this.A04 = anonymousClass905.A03;
        this.A02 = anonymousClass905.A01;
        this.A05 = anonymousClass905.A04;
        this.A03 = anonymousClass905.A02;
        this.A06 = anonymousClass905.A05;
        this.A07 = anonymousClass905.A06;
    }
}
