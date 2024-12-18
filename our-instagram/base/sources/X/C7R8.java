package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;

/* renamed from: X.7R8, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7R8 implements C7QC {
    public final C55952hg A00;
    public final InterfaceC164967Zl A01;
    public final AnonymousClass988 A02;

    /* JADX WARN: Code restructure failed: missing block: B:61:0x0182, code lost:
    
        if (r2 != null) goto L52;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A00(X.InterfaceC163207Sf r17, X.C162957Rg r18, X.C7T7 r19) {
        /*
            Method dump skipped, instructions count: 392
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C7R8.A00(X.7Sf, X.7Rg, X.7T7):void");
    }

    @Override // X.C7QC
    public final /* bridge */ /* synthetic */ void ADy(C7QD c7qd, InterfaceC129555tK interfaceC129555tK) {
        A00(null, (C162957Rg) c7qd, (C7T7) interfaceC129555tK);
    }

    @Override // X.C7QC
    public final /* bridge */ /* synthetic */ C7QD ANU(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return new C162957Rg(viewGroup, this.A00, this.A02);
    }

    @Override // X.C7QC
    public final /* bridge */ /* synthetic */ void F91(C7QD c7qd) {
        C162957Rg c162957Rg = (C162957Rg) c7qd;
        c162957Rg.A0A.A01();
        c162957Rg.A06 = null;
    }

    public C7R8(InterfaceC164967Zl interfaceC164967Zl, AnonymousClass988 anonymousClass988) {
        this(AbstractC13560mi.A00(), interfaceC164967Zl, anonymousClass988);
    }

    public C7R8(C55952hg c55952hg, InterfaceC164967Zl interfaceC164967Zl, AnonymousClass988 anonymousClass988) {
        this.A01 = interfaceC164967Zl;
        this.A02 = anonymousClass988;
        this.A00 = c55952hg;
    }
}
