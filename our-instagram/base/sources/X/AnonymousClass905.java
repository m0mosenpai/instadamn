package X;

import com.facebook.cameracore.mediapipeline.featureconfig.ProductFeatureConfig;
import com.facebook.cameracore.mediapipeline.services.networking.interfaces.NetworkPolicyConfiguration;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.905, reason: invalid class name */
/* loaded from: classes4.dex */
public final class AnonymousClass905 {
    public AnonymousClass910 A00;
    public AnonymousClass911 A01;
    public C2039190d A02;
    public C2040490t A03;
    public ProductFeatureConfig A04;
    public AnonymousClass906 A05;
    public NetworkPolicyConfiguration A06;
    public Map A07;
    public final HashMap A08;

    public final void A00(C203848zt c203848zt, AbstractC203838zs abstractC203838zs) {
        HashMap hashMap = this.A08;
        if (abstractC203838zs == null) {
            hashMap.remove(c203848zt);
        } else {
            hashMap.put(c203848zt, abstractC203838zs);
        }
    }

    public final void A01(C22859A6c c22859A6c) {
        this.A07.put(c22859A6c.A00, c22859A6c);
    }

    public AnonymousClass905(AnonymousClass904 anonymousClass904) {
        HashMap hashMap = new HashMap();
        this.A08 = hashMap;
        this.A07 = new HashMap();
        hashMap.putAll(anonymousClass904.A08);
        this.A00 = anonymousClass904.A01;
        this.A07 = anonymousClass904.A00;
        this.A03 = anonymousClass904.A04;
        this.A01 = anonymousClass904.A02;
        this.A04 = anonymousClass904.A05;
        this.A02 = anonymousClass904.A03;
        this.A05 = anonymousClass904.A06;
        this.A06 = anonymousClass904.A07;
    }

    public AnonymousClass905() {
        this.A08 = new HashMap();
        this.A07 = new HashMap();
    }
}
