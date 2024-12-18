package X;

import com.facebook.odin.model.FeatureData;
import com.facebook.odin.model.OdinContext;
import com.facebook.odin.model.Type;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.AYd, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23379AYd implements InterfaceC73623Ro {
    public final C50627MWo A00;
    public final C4QF A01;

    public C23379AYd(C50627MWo c50627MWo, C4QF c4qf) {
        C14360o3.A0B(c4qf, 1);
        this.A01 = c4qf;
        this.A00 = c50627MWo;
    }

    @Override // X.InterfaceC73623Ro
    public final String getId() {
        return "RelaxedSharedPrefs";
    }

    @Override // X.InterfaceC73623Ro
    public final C3SN ATr(OdinContext odinContext) {
        ArrayList A1E = AbstractC166987dD.A1E();
        C50627MWo c50627MWo = this.A00;
        for (String str : (List) c50627MWo.A01) {
            long A00 = this.A01.A00(str, Long.MAX_VALUE);
            if (A00 != Long.MAX_VALUE) {
                A1E.add(new FeatureData(Type.A09, str, null, null, 0.0d, 16376, A00));
            }
        }
        for (String str2 : (List) c50627MWo.A00) {
            C4QF c4qf = this.A01;
            C14360o3.A0B(str2, 0);
            float f = c4qf.A00.getFloat(AnonymousClass001.A0T("scroll_speed", str2, '_'), Float.MAX_VALUE);
            if (AbstractC166987dD.A01(Float.MAX_VALUE, f) >= 1.0E-4f) {
                A1E.add(new FeatureData(Type.A06, str2, null, null, f, 16372, 0L));
            }
        }
        return new C3SN(A1E, null, true);
    }
}
