package X;

import android.os.Bundle;
import com.facebook.xanalytics.XAnalyticsAdapter;
import com.facebook.xanalytics.XAnalyticsAdapterHolder;
import com.facebook.xanalytics.XAnalyticsHolder;
import com.meta.arfx.engine.interfaces.IARAnalyticsLoggerHost;
import java.util.List;

/* renamed from: X.AWf, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23336AWf implements InterfaceC150566q9 {
    public IARAnalyticsLoggerHost A00;
    public C83U A01;
    public String A02;
    public final List A03 = AbstractC166987dD.A1E();
    public final XAnalyticsAdapter A04;
    public final XAnalyticsAdapterHolder A05;

    public final void A00() {
        IARAnalyticsLoggerHost iARAnalyticsLoggerHost = this.A00;
        if (iARAnalyticsLoggerHost != null) {
            List list = this.A03;
            if (AbstractC166987dD.A1b(list)) {
                iARAnalyticsLoggerHost.CjE(list);
                list.clear();
            }
        }
    }

    @Override // X.InterfaceC150566q9
    public final String BhE() {
        String str = this.A02;
        if (str == null) {
            return "";
        }
        return str;
    }

    @Override // X.InterfaceC150566q9
    public final XAnalyticsHolder CI2() {
        return this.A05;
    }

    @Override // X.InterfaceC150566q9
    public final void DQM(String str, String str2) {
        C14360o3.A0B(str, 0);
        Bundle A0T = AbstractC167017dG.A0T("eventName", str, AbstractC166987dD.A1L("eventType", C05F.A0C));
        if (str2 != null) {
            A0T.putString("jsonExtras", str2);
        }
        this.A03.add(A0T);
    }

    @Override // X.InterfaceC150566q9
    public final void DQN(boolean z) {
        this.A03.add(AbstractC167017dG.A0T("isStart", Boolean.valueOf(z), AbstractC166987dD.A1L("eventType", C05F.A01)));
    }

    @Override // X.InterfaceC150566q9
    public final void EW7(EnumC150616qF enumC150616qF, String str, String str2, String str3, String str4, String str5, String str6, boolean z) {
        this.A02 = str;
        C83U c83u = this.A01;
        if (c83u != null) {
            c83u.CuF(str5);
        }
    }

    public C23336AWf() {
        C23521Abb c23521Abb = new C23521Abb(this);
        this.A04 = c23521Abb;
        this.A05 = new XAnalyticsAdapterHolder(c23521Abb);
    }

    @Override // X.InterfaceC150566q9
    public final void Edm(C83U c83u) {
        this.A01 = c83u;
    }
}
