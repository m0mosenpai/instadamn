package X;

import android.os.Bundle;

/* renamed from: X.GLp, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class RunnableC36842GLp implements Runnable {
    public final /* synthetic */ EK3 A00;

    public RunnableC36842GLp(EK3 ek3) {
        this.A00 = ek3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Integer num;
        EK3 ek3 = this.A00;
        Bundle requireArguments = ek3.requireArguments();
        if (ek3.A03) {
            requireArguments.putBoolean(AbstractC31180DnO.A0Z(), true);
        }
        FRQ A00 = AbstractC35179FfW.A00();
        C14360o3.A0A(requireArguments);
        String str = ek3.A02;
        if (str == null) {
            C14360o3.A0F("currPhoneNumber");
            throw C00O.createAndThrow();
        }
        if (ek3.A04) {
            num = C05F.A0C;
        } else {
            num = C05F.A00;
        }
        AbstractC31179DnN.A0y(A00.A01(requireArguments, num, C05F.A00, str, false), ek3.requireActivity(), ek3.A08);
    }
}
