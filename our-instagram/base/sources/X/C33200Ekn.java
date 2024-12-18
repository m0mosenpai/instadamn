package X;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.Ekn, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C33200Ekn extends AbstractC33235ElU implements InterfaceC60122ou {
    public static final String __redex_internal_original_name = "DailyReminderMenuFragment";
    public long A00;
    public final InterfaceC09390do A01 = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "time_spent";
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A01);
    }

    @Override // X.AbstractC33235ElU, X.AbstractC60672pq, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(-193679784);
        super.onCreate(bundle);
        C0f9.A09(94070202, A02);
    }

    @Override // X.AbstractC60672pq, X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        long j;
        int A02 = C0f9.A02(327873861);
        super.onResume();
        InterfaceC09390do interfaceC09390do = this.A01;
        AbstractC12990ll A0o = AbstractC166987dD.A0o(interfaceC09390do);
        C06090Tz c06090Tz = C06090Tz.A05;
        if (C18U.A06(c06090Tz, A0o, 36313712264546513L)) {
            j = 1;
        } else {
            j = 60;
        }
        C29W c29w = new C29W(AbstractC166987dD.A0r(interfaceC09390do));
        this.A00 = c29w.A00();
        ArrayList A1E = AbstractC166987dD.A1E();
        ArrayList A022 = AbstractC35219FgC.A02(AbstractC166987dD.A0r(interfaceC09390do));
        ArrayList A1E2 = AbstractC166987dD.A1E();
        Iterator A13 = AbstractC166997dE.A13(A022);
        while (A13.hasNext()) {
            String str = (String) AbstractC166997dE.A0l(A13);
            int parseInt = Integer.parseInt(str);
            if (parseInt > 0) {
                C35124FeR.A00(str, AbstractC35189Ffh.A01(AbstractC31177DnL.A09(this), parseInt, C18U.A06(c06090Tz, AbstractC166987dD.A0o(interfaceC09390do), 36313712264546513L), false), A1E2);
            }
        }
        String str2 = "off";
        if (this.A00 > 0) {
            C35124FeR.A00("off", AbstractC166997dE.A0N(this).getString(2131957455), A1E2);
        }
        long j2 = this.A00;
        if (j2 >= 0) {
            long j3 = j2 / j;
            if (A022.contains(String.valueOf(j3))) {
                if (j3 != 0) {
                    str2 = String.valueOf(j3);
                }
                A1E.add(new C34960Fak(new C35750Fqi(c29w, this, A1E2, j), str2, A1E2));
                C35246Fgf.A02(A1E, 2131957469);
                setItems(A1E);
                C0f9.A09(1346007920, A02);
            }
        }
        str2 = " ";
        A1E.add(new C34960Fak(new C35750Fqi(c29w, this, A1E2, j), str2, A1E2));
        C35246Fgf.A02(A1E, 2131957469);
        setItems(A1E);
        C0f9.A09(1346007920, A02);
    }
}
