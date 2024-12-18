package X;

import android.content.Context;
import com.facebook.ultralight.UL;
import java.util.List;
import java.util.Map;

/* loaded from: classes12.dex */
public final class XVK extends XVR implements YPa {
    public boolean A00;
    public final Context A02;
    public final XVP A03;
    public final Map A05;
    public final C72678Xky A01 = new C72678Xky();
    public final ThreadLocal A04 = new YKJ(this);

    @Override // X.YPa
    public final XVK Bqh() {
        return this;
    }

    @Override // X.YPa
    public final C72720Xls BHn() {
        return (C72720Xls) this.A04.get();
    }

    @Override // X.YPa
    @Deprecated
    public final YRI Bqf() {
        YRI yri;
        if (this.A00) {
            List list = BHn().A01;
            if (!list.isEmpty() && (yri = (YRI) AbstractC58320PtC.A0u(list)) != null) {
                return yri;
            }
            throw AbstractC166987dD.A14("Should never call getScopeAwareInjector without an active ThreadStack");
        }
        throw AbstractC166987dD.A18("Called injector during binding");
    }

    public XVK(Context context) {
        AbstractC09800fd.A01("FbInjectorImpl.init", 2016050172);
        try {
            this.A02 = context.getApplicationContext();
            this.A03 = new XVP(context, this);
            C18C.A0E(context == context.getApplicationContext());
            this.A05 = UL.InitModule.getScopes(this);
            this.A00 = true;
            AbstractC09800fd.A00(2129765900);
        } catch (Throwable th) {
            AbstractC09800fd.A00(-150288968);
            throw th;
        }
    }

    @Override // X.YPa
    public final YPa AcN() {
        return this.A03;
    }
}
