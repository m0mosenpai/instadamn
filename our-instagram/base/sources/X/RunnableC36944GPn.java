package X;

import com.facebook.common.callercontext.CallerContext;

/* renamed from: X.GPn, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class RunnableC36944GPn implements Runnable {
    public final /* synthetic */ C35002FbZ A00;
    public final /* synthetic */ C34643FOa A01;
    public final /* synthetic */ EVQ A02;

    public RunnableC36944GPn(C35002FbZ c35002FbZ, C34643FOa c34643FOa, EVQ evq) {
        this.A02 = evq;
        this.A01 = c34643FOa;
        this.A00 = c35002FbZ;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C34717FRd A0R = AbstractC31175DnJ.A0R();
        EVQ evq = this.A02;
        CallerContext callerContext = EVQ.A0B;
        C07270a1 c07270a1 = evq.A08;
        C34643FOa c34643FOa = this.A01;
        String str = c34643FOa.A05;
        String str2 = c34643FOa.A06;
        String str3 = c34643FOa.A01;
        String str4 = c34643FOa.A00;
        boolean z = c34643FOa.A0D;
        boolean z2 = c34643FOa.A0A;
        boolean z3 = c34643FOa.A0E;
        boolean z4 = c34643FOa.A0F;
        boolean z5 = c34643FOa.A0B;
        AbstractC31177DnL.A15(A0R.A02(C35002FbZ.A00(this.A00), str, str2, str3, str4, c34643FOa.A02, z, z2, z3, z4, z5, false, c34643FOa.A09, c34643FOa.A07, c34643FOa.A08), evq.A06.getActivity(), c07270a1);
    }
}
