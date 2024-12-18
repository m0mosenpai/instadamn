package X;

import android.content.res.Resources;
import android.os.Bundle;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* renamed from: X.Ekt, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C33206Ekt extends AbstractC33235ElU implements InterfaceC60122ou {
    public static final String __redex_internal_original_name = "TakeABreakMenuFragment";
    public long A00;
    public UserSession A01;
    public long A02;
    public String A03 = "off";

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "time_spent";
    }

    @Override // X.AbstractC59962oe
    public final AbstractC18680vv getSession() {
        UserSession userSession = this.A01;
        if (userSession == null) {
            AbstractC31171DnF.A0y();
            throw C00O.createAndThrow();
        }
        return userSession;
    }

    @Override // X.AbstractC33235ElU, X.AbstractC60672pq, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(500657806);
        super.onCreate(bundle);
        this.A01 = AbstractC31176DnK.A0S(this);
        C0f9.A09(-489661974, A02);
    }

    @Override // X.AbstractC60672pq, X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        long j;
        Iterable iterable;
        int A02 = C0f9.A02(1032344701);
        super.onResume();
        UserSession userSession = this.A01;
        if (userSession != null) {
            C06090Tz c06090Tz = C06090Tz.A05;
            if (AbstractC31178DnM.A1X(c06090Tz, userSession, 36313712264546513L)) {
                j = 1;
            } else {
                j = 60;
            }
            ArrayList A1E = AbstractC166987dD.A1E();
            UserSession userSession2 = this.A01;
            if (userSession2 != null) {
                List A0h = AbstractC31175DnJ.A0h(C18U.A04(c06090Tz, userSession2, 36876662218096756L), InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1);
                if (!A0h.isEmpty()) {
                    ListIterator listIterator = A0h.listIterator(A0h.size());
                    while (listIterator.hasPrevious()) {
                        if (AbstractC31176DnK.A02(listIterator) != 0) {
                            iterable = AbstractC31177DnL.A0k(A0h, listIterator);
                            break;
                        }
                    }
                }
                iterable = C16930sl.A00;
                ArrayList A1E2 = AbstractC166987dD.A1E();
                AbstractC001800i.A0r(iterable, A1E2);
                C35246Fgf.A02(A1E, 2131975199);
                ArrayList A1E3 = AbstractC166987dD.A1E();
                Iterator A13 = AbstractC166997dE.A13(A1E2);
                while (true) {
                    if (A13.hasNext()) {
                        String str = (String) AbstractC166997dE.A0l(A13);
                        int parseInt = Integer.parseInt(str);
                        if (parseInt > 0) {
                            Resources A09 = AbstractC31177DnL.A09(this);
                            UserSession userSession3 = this.A01;
                            if (userSession3 == null) {
                                break;
                            } else {
                                C35124FeR.A00(str, AbstractC35189Ffh.A01(A09, parseInt, AbstractC31178DnM.A1X(c06090Tz, userSession3, 36313712264546513L), true), A1E3);
                            }
                        }
                    } else {
                        UserSession userSession4 = this.A01;
                        if (userSession4 != null) {
                            C29W c29w = new C29W(userSession4);
                            long A01 = c29w.A01();
                            this.A02 = A01;
                            this.A00 = A01;
                            if (A01 > 0) {
                                C35124FeR.A00("off", AbstractC166997dE.A0N(this).getString(2131975201), A1E3);
                                long j2 = this.A02 / j;
                                if (j2 > 0 && A1E2.contains(String.valueOf(j2))) {
                                    this.A03 = String.valueOf(j2);
                                } else {
                                    c29w.A03(this, 0L);
                                }
                            }
                            A1E.add(new C34960Fak(new C35749Fqh(this, A1E3, j), this.A03, A1E3));
                            setItems(A1E);
                            C0f9.A09(1955538403, A02);
                            return;
                        }
                    }
                }
            }
        }
        AbstractC31171DnF.A0y();
        throw C00O.createAndThrow();
    }
}
