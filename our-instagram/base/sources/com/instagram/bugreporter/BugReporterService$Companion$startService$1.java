package com.instagram.bugreporter;

import X.AbstractC09560e7;
import X.AbstractC12990ll;
import X.AbstractC167007dF;
import X.AbstractC23611Dp;
import X.C0K8;
import X.C0eB;
import X.C18950wb;
import X.C55203OeE;
import X.InterfaceC16660sJ;
import X.InterfaceC23621Ds;
import X.InterfaceC58266PsA;
import android.content.Context;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.bugreporter.model.BugReport;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.bugreporter.BugReporterService$Companion$startService$1", f = "BugReporterService.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes9.dex */
public final class BugReporterService$Companion$startService$1 extends AbstractC23611Dp implements InterfaceC16660sJ {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ BugReportComposerViewModel A01;
    public final /* synthetic */ InterfaceC58266PsA A02;
    public final /* synthetic */ BugReport A03;
    public final /* synthetic */ AbstractC12990ll A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BugReporterService$Companion$startService$1(Context context, BugReportComposerViewModel bugReportComposerViewModel, InterfaceC58266PsA interfaceC58266PsA, BugReport bugReport, AbstractC12990ll abstractC12990ll, InterfaceC23621Ds interfaceC23621Ds) {
        super(1, interfaceC23621Ds);
        this.A00 = context;
        this.A03 = bugReport;
        this.A01 = bugReportComposerViewModel;
        this.A02 = interfaceC58266PsA;
        this.A04 = abstractC12990ll;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(InterfaceC23621Ds interfaceC23621Ds) {
        return new BugReporterService$Companion$startService$1(this.A00, this.A01, this.A02, this.A03, this.A04, interfaceC23621Ds);
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return ((BugReporterService$Companion$startService$1) create((InterfaceC23621Ds) obj)).invokeSuspend(C0eB.A00);
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        AbstractC09560e7.A00(obj);
        Context context = this.A00;
        BugReport bugReport = this.A03;
        BugReportComposerViewModel bugReportComposerViewModel = this.A01;
        InterfaceC58266PsA interfaceC58266PsA = this.A02;
        try {
            C55203OeE.A00.A05(context, bugReportComposerViewModel, interfaceC58266PsA, bugReport, this.A04);
        } catch (Exception e) {
            C0K8.A0F("BugReporterService", "Failed to upload bug report.", e);
            AbstractC167007dF.A15(C18950wb.A01.AEp("BugReporterService", 817892340), DialogModule.KEY_MESSAGE, "Failed to upload bug report.", e);
            interfaceC58266PsA.AW5("upload_service_error", "Failed to upload bug report.");
        }
        return C0eB.A00;
    }
}
