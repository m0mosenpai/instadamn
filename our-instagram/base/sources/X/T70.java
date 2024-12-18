package X;

import com.facebook.proxygen.TraceFieldType;
import com.instagram.acp.igacpsecuritykey.IGACPSecurityKeySignInActivity;
import java.util.LinkedHashMap;

/* loaded from: classes10.dex */
public final class T70 implements InterfaceC65424Tjv {
    public final int A00;
    public final Object A01;

    public T70(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.InterfaceC65424Tjv
    public final void onFailure(Exception exc) {
        String str;
        switch (this.A00) {
            case 0:
                AbstractC167017dG.A1N(this.A01, exc);
                if (!(exc instanceof Rk3) && !(exc instanceof IllegalStateException)) {
                    return;
                }
                android.util.Log.e("PlayServicesDevicePerformance", "Error saving mediaPerformanceClass", exc);
                return;
            case 1:
                C14360o3.A0B(exc, 0);
                IGACPSecurityKeySignInActivity.A01((IGACPSecurityKeySignInActivity) this.A01, null, exc.getLocalizedMessage());
                return;
            case 2:
                C14360o3.A0B(exc, 0);
                C006802i c006802i = C006802i.A0p;
                C14360o3.A07(c006802i);
                LinkedHashMap A06 = AbstractC06930Yk.A06(AbstractC166987dD.A1L("blocks", 0), AbstractC166987dD.A1L("lines", 0), AbstractC166987dD.A1L("elements", 0));
                C14360o3.A0B(A06, 2);
                if (exc instanceof RkG) {
                    AbstractC44184Jfn.A00(c006802i, AbstractC167007dF.A0n(TraceFieldType.ErrorCode, Integer.valueOf(((RkG) exc).A00)), 391259957);
                }
                AbstractC44184Jfn.A00(c006802i, A06, 391259957);
                c006802i.markerAnnotate(391259957, 0, "error", exc.getMessage());
                c006802i.markerEnd(391259957, 0, (short) 3);
                AbstractC25225BEi.A1U(this.A01, null);
                return;
            default:
                C31736Dwp c31736Dwp = (C31736Dwp) this.A01;
                if (exc instanceof Rk3) {
                    str = "unsupported";
                } else {
                    str = "unknown";
                }
                C31736Dwp.A01(c31736Dwp, str);
                return;
        }
    }
}
