package X;

import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;

/* renamed from: X.Exc, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC33874Exc {
    public static final Object A00(C6FQ c6fq) {
        AbstractC59962oe abstractC59962oe;
        FragmentActivity A04 = C6BQ.A04(c6fq);
        UserSession A0K = AbstractC31179DnN.A0K(c6fq);
        AbstractC10360h2 A0D = AbstractC31172DnG.A0D(A04);
        Fragment A02 = C6BQ.A02(c6fq);
        if (A02 != null && (A02 instanceof AbstractC59962oe)) {
            abstractC59962oe = (AbstractC59962oe) A02;
        } else {
            abstractC59962oe = null;
        }
        InterfaceC11380iw A08 = C6BQ.A08(c6fq);
        boolean A1X = AbstractC31177DnL.A1X(A0K);
        U7K u7k = U7H.A04;
        Context context = C1LZ.A00().A00;
        ArrayList A1E = AbstractC166987dD.A1E();
        EnumC33353Eom enumC33353Eom = EnumC33353Eom.A05;
        if (abstractC59962oe != null) {
            A08 = abstractC59962oe;
        }
        AbstractC31174DnI.A1N(new EV5(context, abstractC59962oe, A04, A0D, A08, A0K, enumC33353Eom, A1E, true, A1X));
        return null;
    }
}
