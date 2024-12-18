package X;

import android.os.SystemClock;
import com.facebook.react.views.webview.ReactWebViewManager;
import com.instagram.react.modules.base.IgNetworkingModule;
import java.nio.charset.Charset;

/* renamed from: X.Gkb, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37821Gkb extends C1P1 {
    public final int A00;
    public final int A01;
    public final Object A02;
    public final String A03;

    public C37821Gkb(Object obj, String str, int i, int i2) {
        this.A00 = i2;
        this.A02 = obj;
        this.A01 = i;
        this.A03 = str;
    }

    @Override // X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        int A03;
        int i;
        int i2;
        String str;
        String str2;
        Object obj;
        switch (this.A00) {
            case 0:
                A03 = C0f9.A03(-708097763);
                IgNetworkingModule igNetworkingModule = (IgNetworkingModule) this.A02;
                int i3 = this.A01;
                igNetworkingModule.removeRequest(i3);
                Class cls = IgNetworkingModule.TAG;
                Throwable A01 = abstractC115105If.A01();
                String str3 = "Error while invoking request";
                C0K8.A05(cls, "Error while invoking request", A01);
                TFD tfd = (TFD) abstractC115105If.A00();
                if (A01 != null) {
                    str3 = A01.getMessage();
                } else if (tfd != null) {
                    str3 = new String(tfd.A01, Charset.forName(ReactWebViewManager.HTML_ENCODING));
                }
                igNetworkingModule.onRequestError(i3, str3);
                i = 237345394;
                break;
            case 1:
                A03 = AbstractC167017dG.A0N(abstractC115105If, 1284913533);
                super.onFail(abstractC115105If);
                EIx eIx = (EIx) this.A02;
                EIx.A02(eIx);
                EIx.A05(eIx, new D8Q(eIx, this.A03, this.A01, 2));
                i = 305649274;
                break;
            default:
                A03 = C0f9.A03(1050291199);
                C14360o3.A0B(abstractC115105If, 0);
                C37701Gic c37701Gic = (C37701Gic) this.A02;
                C37477Gev c37477Gev = c37701Gic.A02;
                Object A00 = abstractC115105If.A00();
                C40791um c40791um = (C40791um) A00;
                if (c40791um != null) {
                    i2 = c40791um.mStatusCode;
                } else {
                    i2 = 0;
                }
                long elapsedRealtime = SystemClock.elapsedRealtime() - c37701Gic.A00;
                if (C18U.A06(C06090Tz.A05, c37701Gic.A03, 36322224889669691L)) {
                    String A002 = AbstractC111324zv.A00(952);
                    C40781ul c40781ul = (C40781ul) A00;
                    if (c40781ul != null) {
                        str2 = c40781ul.getErrorMessage();
                    } else {
                        str2 = null;
                    }
                    if (str2 == null) {
                        str2 = "n/a";
                    }
                    String A0R = AnonymousClass001.A0R(A002, str2);
                    StringBuilder A1C = AbstractC166987dD.A1C();
                    A1C.append(AbstractC111324zv.A00(951));
                    Throwable A012 = abstractC115105If.A01();
                    if (A012 == null || (obj = A012.getCause()) == null) {
                        obj = "n/a";
                    }
                    str = AnonymousClass001.A0g(A0R, " | ", AbstractC166997dE.A0v(obj, A1C));
                } else {
                    str = null;
                }
                C37700Gib c37700Gib = (C37700Gib) c37477Gev.A01;
                c37700Gib.A0T.CiE(str, i2, elapsedRealtime, c37700Gib.A0F);
                c37700Gib.A0F = false;
                EnumC74603Ws enumC74603Ws = EnumC74603Ws.A04;
                java.util.Set set = c37700Gib.A08;
                if (set != null) {
                    c37700Gib.A0O.FCF(enumC74603Ws, set);
                    c37700Gib.A08 = null;
                }
                C37700Gib.A02(c37700Gib, null);
                C37702Gid.A0C = false;
                i = 933545432;
                break;
        }
        C0f9.A0A(i, A03);
    }

    @Override // X.C1P1
    public final void onFinish() {
        int A03;
        int i;
        switch (this.A00) {
            case 0:
                A03 = C0f9.A03(-1201602048);
                i = 38508202;
                break;
            case 1:
            default:
                super.onFinish();
                return;
            case 2:
                A03 = C0f9.A03(548433677);
                ((C37700Gib) ((C37701Gic) this.A02).A02.A01).A06 = C05F.A00;
                i = 1574850199;
                break;
        }
        C0f9.A0A(i, A03);
    }

    @Override // X.C1P1
    public final void onStart() {
        int A03;
        int i;
        switch (this.A00) {
            case 1:
                A03 = C0f9.A03(1809772276);
                EIx.A03((EIx) this.A02);
                i = 718207245;
                break;
            case 2:
                A03 = C0f9.A03(-1871890608);
                C37701Gic c37701Gic = (C37701Gic) this.A02;
                c37701Gic.A00 = SystemClock.elapsedRealtime();
                c37701Gic.A02.CtX(this.A01);
                i = -1444773364;
                break;
            default:
                super.onStart();
                return;
        }
        C0f9.A0A(i, A03);
    }

    /* JADX WARN: Code restructure failed: missing block: B:71:0x02cf, code lost:
    
        r0 = "trackingToken";
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v32, types: [X.1ux, X.Gem] */
    /* JADX WARN: Type inference failed for: r53v0, types: [X.1P1, X.Gkb] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.util.List] */
    @Override // X.C1P1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ void onSuccess(java.lang.Object r54) {
        /*
            Method dump skipped, instructions count: 1400
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C37821Gkb.onSuccess(java.lang.Object):void");
    }
}
