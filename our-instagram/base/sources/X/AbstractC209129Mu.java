package X;

import android.os.Parcelable;
import com.instagram.common.session.UserSession;
import com.instagram.direct.capabilities.Capabilities;
import java.util.ArrayList;

/* renamed from: X.9Mu, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC209129Mu {
    public static final Capabilities A00(UserSession userSession) {
        ArrayList A12 = AbstractC166997dE.A12(userSession, 0);
        C47142Eg A00 = AbstractC47132Ef.A00(userSession);
        A12.add(EnumC2054697t.A19);
        A12.add(EnumC2054697t.A0O);
        A12.add(EnumC2054697t.A1B);
        A12.add(EnumC2054697t.A12);
        A12.add(EnumC2054697t.A04);
        A12.add(EnumC2054697t.A1E);
        A12.add(EnumC2054697t.A13);
        A12.add(EnumC2054697t.A08);
        A12.add(EnumC2054697t.A0f);
        A12.add(EnumC2054697t.A0Q);
        A12.add(EnumC2054697t.A0Z);
        A12.add(EnumC2054697t.A0u);
        A12.add(EnumC2054697t.A0G);
        A12.add(EnumC2054697t.A0F);
        A12.add(EnumC2054697t.A0t);
        A12.add(EnumC2054697t.A0L);
        A12.add(EnumC2054697t.A0K);
        A12.add(EnumC2054697t.A18);
        A12.add(EnumC2054697t.A0B);
        A12.add(EnumC2054697t.A0A);
        A12.add(EnumC2054697t.A14);
        A12.add(EnumC2054697t.A1F);
        A12.add(EnumC2054697t.A07);
        A12.add(EnumC2054697t.A0N);
        A12.add(EnumC2054697t.A1G);
        C47162Ei c47162Ei = A00.A0Z;
        if (AbstractC166987dD.A1a(c47162Ei.get())) {
            A12.add(EnumC2054697t.A11);
            A12.add(EnumC2054697t.A10);
        }
        C47162Ei c47162Ei2 = A00.A0R;
        if (AbstractC166987dD.A1a(c47162Ei2.get())) {
            A12.add(EnumC2054697t.A0z);
            A12.add(EnumC2054697t.A0y);
        }
        if (AbstractC166987dD.A1a(c47162Ei.get()) || AbstractC166987dD.A1a(c47162Ei2.get())) {
            A12.add(EnumC2054697t.A1D);
        }
        if (AbstractC166987dD.A1a(A00.A0S.get())) {
            A12.add(EnumC2054697t.A1A);
        }
        if (AbstractC166987dD.A1a(A00.A0T.get())) {
            A12.add(EnumC2054697t.A0H);
        }
        if (AbstractC166987dD.A1a(A00.A0b.get())) {
            A12.add(EnumC2054697t.A0x);
        }
        if (AbstractC166987dD.A1a(A00.A08.A00())) {
            A12.add(EnumC2054697t.A0v);
        }
        if (AbstractC137186Ix.A00(userSession) && C18U.A06(C06090Tz.A05, userSession, 36313153919387444L)) {
            A12.add(EnumC2054697t.A0M);
        }
        if ((AbstractC166997dE.A0Y(userSession).A0I() == EnumC222416a.A05 || AbstractC166997dE.A0Y(userSession).A0I() == EnumC222416a.A06) && C18U.A06(C06090Tz.A05, userSession, 36313153919846200L)) {
            A12.add(EnumC2054697t.A0E);
        }
        Parcelable.Creator creator = Capabilities.CREATOR;
        return AbstractC2054797v.A00(A12);
    }
}
