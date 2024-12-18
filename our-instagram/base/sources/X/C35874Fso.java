package X;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.instagram.common.session.UserSession;
import com.instagram.modal.TransparentModalActivity;
import com.instagram.model.venue.Venue;
import com.instagram.user.model.User;

/* renamed from: X.Fso, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C35874Fso implements C2n2 {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final String A05;
    public final boolean A06;

    public C35874Fso(Object obj, Object obj2, Object obj3, Object obj4, String str, int i, boolean z) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj3;
        this.A03 = obj2;
        this.A04 = obj4;
        this.A05 = str;
        this.A06 = z;
    }

    @Override // X.C2n2
    public final Object apply(Object obj) {
        if (this.A00 != 0) {
            Context context = (Context) this.A01;
            UserSession userSession = (UserSession) this.A02;
            InterfaceC11380iw interfaceC11380iw = (InterfaceC11380iw) this.A03;
            Venue venue = (Venue) this.A04;
            String str = this.A05;
            boolean z = this.A06;
            String str2 = (String) obj;
            new LLI(context, interfaceC11380iw, userSession, new C36748GHr(interfaceC11380iw, userSession, venue, str2, 2, z), str2, venue.A05(), context.getResources().getString(2131971186), str, null, false).A05();
            return null;
        }
        UserSession userSession2 = (UserSession) this.A01;
        User user = (User) this.A02;
        Activity activity = (Activity) this.A03;
        InterfaceC11380iw interfaceC11380iw2 = (InterfaceC11380iw) this.A04;
        String str3 = this.A05;
        boolean z2 = this.A06;
        String str4 = (String) obj;
        C06090Tz c06090Tz = C06090Tz.A05;
        if (!C18U.A06(c06090Tz, userSession2, 36314837548665690L) && !C18U.A06(c06090Tz, userSession2, 36314837549648739L)) {
            new LLI(activity, interfaceC11380iw2, userSession2, new C36748GHr(user, userSession2, interfaceC11380iw2, str4, 0, z2), str4, C3YV.A03(user.getId()), activity.getResources().getString(2131971188), str3, null, false).A05();
            return null;
        }
        EnumC33405Epc enumC33405Epc = EnumC33405Epc.A09;
        String username = user.getUsername();
        String fullName = user.getFullName();
        String A03 = C3YV.A03(user.getId());
        Bundle A00 = AbstractC177607uu.A00(null, enumC33405Epc, false);
        A00.putString(AbstractC43591JPw.A00(269), username);
        A00.putString(AbstractC43591JPw.A00(268), fullName);
        A00.putString(AbstractC43591JPw.A00(270), A03);
        A00.putBoolean(AbstractC111324zv.A00(657), false);
        AbstractC31177DnL.A0n(activity, A00, userSession2, TransparentModalActivity.class, "nametag");
        return null;
    }
}
