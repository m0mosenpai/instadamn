package X;

import com.instagram.api.schemas.RingSpecImpl;
import com.instagram.api.schemas.RingSpecPointImpl;
import java.util.List;

/* renamed from: X.3Ok, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C72863Ok extends C0YY implements InterfaceC16820sZ {
    public static final C72863Ok A00 = new C72863Ok();

    public C72863Ok() {
        super(0);
    }

    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        List A1Q = AbstractC16960so.A1Q(C3Oc.A09, C3Oc.A07, C3Oc.A08, C3Oc.A06);
        double radians = Math.toRadians(35.0d);
        double cos = Math.cos(radians);
        double sin = Math.sin(radians);
        return new RingSpecImpl(new RingSpecPointImpl((float) ((cos * 0.7d) + 0.5d), (float) (0.5d - (sin * 0.7d))), new RingSpecPointImpl((float) (0.5d - (cos * 0.75d)), (float) ((sin * 0.75d) + 0.5d)), "default_brand_update", A1Q, AbstractC16960so.A1Q(Float.valueOf(0.1435f), Float.valueOf(0.3779f), Float.valueOf(0.6071f), Float.valueOf(0.831f)));
    }
}
