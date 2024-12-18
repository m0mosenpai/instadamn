package X;

import com.facebook.cameracore.ardelivery.model.ARCapabilityMinVersionModeling;
import java.io.StringWriter;

/* renamed from: X.7pQ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C174347pQ extends C0YY implements InterfaceC16660sJ {
    public static final C174347pQ A00 = new C174347pQ();

    public C174347pQ() {
        super(1);
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        ARCapabilityMinVersionModeling aRCapabilityMinVersionModeling = (ARCapabilityMinVersionModeling) obj;
        C14360o3.A0B(aRCapabilityMinVersionModeling, 0);
        StringWriter stringWriter = new StringWriter();
        C17z A0A = AbstractC221915u.A00.A0A(stringWriter);
        AbstractC120345ca.A00(aRCapabilityMinVersionModeling, A0A);
        A0A.close();
        String obj2 = stringWriter.toString();
        C14360o3.A07(obj2);
        return obj2;
    }
}
