package X;

import android.app.Activity;
import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.7No, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC162047No extends AbstractC159137Bz {
    public final Integer A00;

    public AbstractC162047No(Context context, UserSession userSession, C7FY c7fy, String str, C7FZ c7fz, Integer num, int i, C7C2 c7c2, Integer num2) {
        super(context, userSession, c7fy, str, c7fz, num, i, c7c2, null);
        this.A00 = num2;
    }

    public final void A00() {
        C37211oK A00;
        UserSession userSession;
        Activity activity;
        C37211oK A002;
        UserSession userSession2;
        Activity activity2;
        if (this instanceof C162037Nn) {
            C162037Nn c162037Nn = (C162037Nn) this;
            if (!AbstractC31268Doq.A08(c162037Nn.userSession)) {
                A002 = AbstractC31265Don.A00();
                userSession2 = c162037Nn.userSession;
                activity2 = c162037Nn.A01;
                A002.A00(activity2, EnumC33519Ers.A05, userSession2);
                return;
            }
            if (c162037Nn.A00) {
                return;
            }
            boolean A02 = AbstractC162267Oo.A02(c162037Nn.userSession);
            c162037Nn.A00 = A02;
            if (A02) {
                return;
            }
            A00 = AbstractC31265Don.A00();
            userSession = c162037Nn.userSession;
            activity = c162037Nn.A01;
            A00.A01(activity, EnumC33519Ers.A05, userSession, null, false, false);
        }
        if (this instanceof C162077Nr) {
            C162077Nr c162077Nr = (C162077Nr) this;
            if (!AbstractC31268Doq.A08(c162077Nr.userSession)) {
                A002 = AbstractC31265Don.A00();
                userSession2 = c162077Nr.userSession;
                activity2 = c162077Nr.A01;
                A002.A00(activity2, EnumC33519Ers.A05, userSession2);
                return;
            }
            if (c162077Nr.A00) {
                return;
            }
            boolean A022 = AbstractC162267Oo.A02(c162077Nr.userSession);
            c162077Nr.A00 = A022;
            if (A022) {
                return;
            }
            A00 = AbstractC31265Don.A00();
            userSession = c162077Nr.userSession;
            activity = c162077Nr.A01;
            A00.A01(activity, EnumC33519Ers.A05, userSession, null, false, false);
        }
        C162097Nt c162097Nt = (C162097Nt) this;
        if (!AbstractC31268Doq.A08(c162097Nt.userSession)) {
            A002 = AbstractC31265Don.A00();
            userSession2 = c162097Nt.userSession;
            activity2 = c162097Nt.A01;
            A002.A00(activity2, EnumC33519Ers.A05, userSession2);
            return;
        }
        if (c162097Nt.A00) {
            return;
        }
        boolean A023 = AbstractC162267Oo.A02(c162097Nt.userSession);
        c162097Nt.A00 = A023;
        if (A023) {
            return;
        }
        UserSession userSession3 = c162097Nt.userSession;
        C06090Tz c06090Tz = C06090Tz.A05;
        if (Boolean.valueOf(C18U.A06(c06090Tz, userSession3, 36320403826287065L)).booleanValue()) {
            AbstractC31265Don.A00().A02(c162097Nt.A01, EnumC33519Ers.A05, c162097Nt.userSession, null, c162097Nt.A02);
            return;
        }
        boolean booleanValue = Boolean.valueOf(C18U.A06(c06090Tz, c162097Nt.userSession, 36329272931139816L)).booleanValue();
        A00 = AbstractC31265Don.A00();
        if (booleanValue) {
            A00.A03(c162097Nt.A01, c162097Nt.userSession, EnumC33519Ers.A05.toString(), null);
            return;
        }
        userSession = c162097Nt.userSession;
        activity = c162097Nt.A01;
        A00.A01(activity, EnumC33519Ers.A05, userSession, null, false, false);
    }
}
