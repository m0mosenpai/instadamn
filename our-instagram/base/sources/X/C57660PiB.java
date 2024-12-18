package X;

import com.facebook.odin.model.Example;
import com.facebook.odin.model.FeatureData;
import java.util.List;

/* renamed from: X.PiB, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C57660PiB extends C0YY implements InterfaceC16660sJ {
    public static final C57660PiB A00 = new C57660PiB();

    public C57660PiB() {
        super(1);
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        FeatureData A0K;
        List list = (List) obj;
        C14360o3.A0B(list, 0);
        List A0a = AbstractC50523MSb.A0a(1.0d);
        if ((!list.isEmpty()) && list.size() == 1 && (A0K = MSW.A0K("3884", ((Example) MSZ.A0o(list, list.size())).A02)) != null) {
            double d = A0K.A00;
            if (d != -1.0d && d < 3.0d) {
                A0a = AbstractC50523MSb.A0a(0.0d);
            }
        }
        A0a.toString();
        return A0a;
    }
}
