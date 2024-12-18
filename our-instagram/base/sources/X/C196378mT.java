package X;

import com.facebook.common.callercontext.CallerContext;
import java.util.List;

/* renamed from: X.8mT, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C196378mT {
    public final /* synthetic */ CallerContext A00;
    public final /* synthetic */ C196118m1 A01;
    public final /* synthetic */ InterfaceC196048lu A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ List A04;

    public final void A00(Throwable th) {
        C14360o3.A0B(th, 0);
        C41061vE c41061vE = this.A01.A04;
        String str = this.A03;
        String str2 = this.A00.A02;
        C14360o3.A07(str2);
        c41061vE.A05("service_manual_fetch_failure", str, this.A04, AbstractC06930Yk.A02(new C09530e4("caller_class", str2), new C09530e4("error_message", th.getMessage())));
        InterfaceC196048lu interfaceC196048lu = this.A02;
        if (interfaceC196048lu != null) {
            interfaceC196048lu.onFailure();
        }
    }

    public C196378mT(CallerContext callerContext, C196118m1 c196118m1, InterfaceC196048lu interfaceC196048lu, String str, List list) {
        this.A01 = c196118m1;
        this.A03 = str;
        this.A00 = callerContext;
        this.A04 = list;
        this.A02 = interfaceC196048lu;
    }
}
