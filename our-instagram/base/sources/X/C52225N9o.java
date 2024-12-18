package X;

import android.content.Context;
import com.instagram.bugreporter.model.BugReport;
import java.io.File;
import java.util.concurrent.CountDownLatch;

/* renamed from: X.N9o, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52225N9o extends C1P1 {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ long A02;
    public final /* synthetic */ Context A03;
    public final /* synthetic */ OIM A04;
    public final /* synthetic */ BugReport A05;
    public final /* synthetic */ AbstractC12990ll A06;
    public final /* synthetic */ File A07;
    public final /* synthetic */ String A08;
    public final /* synthetic */ String A09;
    public final /* synthetic */ CountDownLatch A0A;
    public final /* synthetic */ InterfaceC16820sZ A0B;

    public C52225N9o(Context context, OIM oim, BugReport bugReport, AbstractC12990ll abstractC12990ll, File file, String str, String str2, CountDownLatch countDownLatch, InterfaceC16820sZ interfaceC16820sZ, int i, int i2, long j) {
        this.A0B = interfaceC16820sZ;
        this.A04 = oim;
        this.A09 = str;
        this.A01 = i;
        this.A08 = str2;
        this.A02 = j;
        this.A03 = context;
        this.A06 = abstractC12990ll;
        this.A05 = bugReport;
        this.A07 = file;
        this.A0A = countDownLatch;
        this.A00 = i2;
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = C0f9.A03(1802395578);
        N3O n3o = (N3O) obj;
        int A032 = C0f9.A03(1945553698);
        C14360o3.A0B(n3o, 0);
        if (C14360o3.A0K(n3o.A01, true)) {
            this.A0B.invoke();
            OIM oim = this.A04;
            String str = this.A09;
            C14360o3.A0A(str);
            oim.A01.markerEnd(396371619, AnonymousClass001.A0A(oim.A00, str).hashCode() + (this.A01 * 31), (short) 2);
        } else {
            boolean A0K = C14360o3.A0K(n3o.A00, true);
            long j = this.A02;
            Object[] objArr = {this.A08, Long.valueOf(j)};
            if (A0K) {
                C0K8.A0P("BugReporterUploader", "Received a 200 non-success, retriable response", objArr);
                OIM oim2 = this.A04;
                String str2 = this.A09;
                C14360o3.A0A(str2);
                Integer num = C05F.A00;
                int i = this.A01;
                oim2.A00(str2, n3o.A02, i, n3o.mStatusCode, num);
                C55203OeE.A04(this.A03, oim2, this.A05, this.A06, this.A07, this.A0A, i + 1, j);
            } else {
                C0K8.A0P("BugReporterUploader", "Received a 200 non-success, non-retriable response", objArr);
                OIM oim3 = this.A04;
                String str3 = this.A09;
                C14360o3.A0A(str3);
                oim3.A00(str3, n3o.A02, this.A01, n3o.mStatusCode, C05F.A0C);
                this.A0B.invoke();
            }
        }
        C0f9.A0A(465786257, A032);
        C0f9.A0A(939870968, A03);
    }

    @Override // X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        boolean z;
        String A0k;
        int i;
        int statusCode;
        int A0N = AbstractC167017dG.A0N(abstractC115105If, -947078467);
        C19L c19l = C55203OeE.A01;
        AbstractC12990ll abstractC12990ll = this.A06;
        if (C18U.A06(C06090Tz.A05, abstractC12990ll, 36324295065022546L)) {
            InterfaceC40801un interfaceC40801un = (InterfaceC40801un) abstractC115105If.A00();
            boolean z2 = false;
            if (interfaceC40801un != null && 400 <= (statusCode = interfaceC40801un.getStatusCode()) && statusCode < 500) {
                z2 = true;
            }
            z = !z2;
        } else {
            z = true;
        }
        Object A00 = abstractC115105If.A00();
        InterfaceC40821up interfaceC40821up = (InterfaceC40821up) A00;
        if (interfaceC40821up == null || (A0k = interfaceC40821up.getErrorMessage()) == null) {
            A0k = AbstractC31180DnO.A0k(abstractC115105If.A01());
        }
        InterfaceC40801un interfaceC40801un2 = (InterfaceC40801un) A00;
        if (interfaceC40801un2 != null) {
            i = interfaceC40801un2.getStatusCode();
        } else {
            i = 0;
        }
        if (!z) {
            C0K8.A0P("BugReporterUploader", "Upload of attachment %s for bug id %d isn't eligible for retries.", this.A08, Long.valueOf(this.A02));
            OIM oim = this.A04;
            String str = this.A09;
            C14360o3.A0A(str);
            oim.A00(str, A0k, this.A01, i, C05F.A0C);
        } else {
            int i2 = this.A01;
            if (i2 >= this.A00) {
                C0K8.A0P("BugReporterUploader", "Ran out of retry attempt to upload attachment %s for bug id %d", this.A08, Long.valueOf(this.A02));
                OIM oim2 = this.A04;
                String str2 = this.A09;
                C14360o3.A0A(str2);
                oim2.A00(str2, A0k, i2, i, C05F.A01);
            } else {
                OIM oim3 = this.A04;
                String str3 = this.A09;
                C14360o3.A0A(str3);
                oim3.A00(str3, A0k, i2, i, C05F.A00);
                C55203OeE.A04(this.A03, oim3, this.A05, abstractC12990ll, this.A07, this.A0A, i2 + 1, this.A02);
                C0f9.A0A(-1007487929, A0N);
            }
        }
        this.A0B.invoke();
        C0f9.A0A(-1007487929, A0N);
    }
}
