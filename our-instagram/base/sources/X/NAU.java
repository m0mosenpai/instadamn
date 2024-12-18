package X;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import com.instagram.bugreporter.BugReportComposerViewModel;
import com.instagram.bugreporter.model.BugReport;

/* loaded from: classes9.dex */
public final class NAU extends U7H {
    public InterfaceC58266PsA A00;
    public BugReport A01;
    public C6WQ A02;
    public final Activity A03;
    public final Bitmap A04;
    public final BugReportComposerViewModel A05;
    public final InterfaceC58266PsA A06;
    public final C54762OHr A07;
    public final AbstractC12990ll A08;

    /* JADX WARN: Removed duplicated region for block: B:18:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0219  */
    @Override // X.U7H
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ java.lang.Object A03(java.lang.Object[] r22) {
        /*
            Method dump skipped, instructions count: 553
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.NAU.A03(java.lang.Object[]):java.lang.Object");
    }

    @Override // X.U7H
    public final void A04() {
        Activity activity = this.A03;
        if (!activity.isDestroyed()) {
            C6WQ A0i = AbstractC31174DnI.A0i(activity);
            this.A02 = A0i;
            MSX.A0w(activity, A0i, 2131954374);
            C6WQ c6wq = this.A02;
            if (c6wq != null) {
                C0fJ.A00(c6wq);
                return;
            }
            throw AbstractC166997dE.A0g();
        }
    }

    @Override // X.U7H
    public final /* bridge */ /* synthetic */ void A05(Object obj) {
        Intent intent = (Intent) obj;
        C14360o3.A0B(intent, 0);
        Activity activity = this.A03;
        A06();
        AbstractC12990ll abstractC12990ll = this.A08;
        InterfaceC58266PsA interfaceC58266PsA = this.A00;
        if (interfaceC58266PsA == null) {
            C14360o3.A0F("userFlowLoggerV2");
            throw C00O.createAndThrow();
        }
        C14360o3.A0B(abstractC12990ll, 0);
        OuS ouS = (OuS) abstractC12990ll.A01(OuS.class, new C50163MDq(abstractC12990ll, 25));
        ouS.A04 = interfaceC58266PsA;
        AbstractC12860lY.A07(ouS);
        C12260kU.A0C(activity, intent);
    }

    public final void A06() {
        if (this.A02 != null && !this.A03.isDestroyed()) {
            C6WQ c6wq = this.A02;
            if (c6wq != null) {
                c6wq.dismiss();
            }
            this.A02 = null;
        }
    }

    public NAU(Activity activity, Bitmap bitmap, BugReportComposerViewModel bugReportComposerViewModel, InterfaceC58266PsA interfaceC58266PsA, BugReport bugReport, AbstractC12990ll abstractC12990ll) {
        AbstractC167017dG.A1P(abstractC12990ll, activity);
        this.A08 = abstractC12990ll;
        this.A03 = activity;
        this.A01 = bugReport;
        this.A04 = bitmap;
        this.A05 = bugReportComposerViewModel;
        this.A06 = interfaceC58266PsA;
        this.A07 = new C54762OHr(bugReport, abstractC12990ll);
    }
}
