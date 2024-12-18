package X;

import android.os.Bundle;
import com.instagram.bugreporter.BugReportComposerFragment$onClickScreenshotThumbnail$1;
import com.instagram.bugreporter.BugReporterDrawingView;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.KBl, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45473KBl extends AbstractC59962oe implements InterfaceC60122ou {
    public static final String __redex_internal_original_name = "ImageAnnotationFragment";
    public BugReportComposerFragment$onClickScreenshotThumbnail$1 A00;
    public BugReporterDrawingView A01;
    public InterfaceC58266PsA A02;
    public Q4Q A03;
    public String A04;
    public final InterfaceC09390do A06 = AbstractC60492pY.A01(this);
    public final InterfaceC09390do A05 = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "bugreporter_imageannotation";
    }

    @Override // X.AbstractC59962oe
    public final AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A06);
    }

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C35197Ffp A00 = C35197Ffp.A00(interfaceC56362iU);
        A00.A02 = AbstractC166997dE.A0N(this).getString(2131954356);
        A00.A01 = new ViewOnClickListenerC48064LPp(this, 20);
        interfaceC56362iU.Ehj(new C31722DwR(A00));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(-1238735364);
        super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        this.A04 = AbstractC153636vY.A01(requireArguments, "ImageAnnotationFragment.imagePath");
        AbstractC18680vv session = getSession();
        C14360o3.A0B(session, 1);
        InterfaceC58266PsA A00 = OO8.A00(requireArguments, session);
        if (A00 instanceof C55868OrI) {
            A00 = OO8.A01(session);
        }
        this.A02 = A00;
        C0f9.A09(-308083909, A02);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0036, code lost:
    
        if (r0 == false) goto L6;
     */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View onCreateView(android.view.LayoutInflater r14, android.view.ViewGroup r15, android.os.Bundle r16) {
        /*
            Method dump skipped, instructions count: 353
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C45473KBl.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(-1908958001);
        super.onDestroyView();
        Q4Q q4q = this.A03;
        if (q4q != null) {
            synchronized (q4q.A07) {
                List list = q4q.A08;
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((AbstractC62654SKn) it.next()).A00();
                }
                list.clear();
            }
            this.A03 = null;
        } else {
            BugReporterDrawingView bugReporterDrawingView = this.A01;
            if (bugReporterDrawingView != null) {
                bugReporterDrawingView.A01();
            }
            this.A01 = null;
        }
        C0f9.A09(-2011697828, A02);
    }
}
