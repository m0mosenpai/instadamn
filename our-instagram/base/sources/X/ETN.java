package X;

import com.facebook.proxygen.TraceFieldType;
import com.instagram.common.session.UserSession;
import java.util.concurrent.TimeUnit;

/* loaded from: classes6.dex */
public final class ETN extends C1P1 {
    public final /* synthetic */ C1k5 A00;
    public final /* synthetic */ C34651k3 A01;
    public final /* synthetic */ Integer A02;
    public final /* synthetic */ Long A03;
    public final /* synthetic */ String A04;

    public ETN(C1k5 c1k5, C34651k3 c34651k3, Integer num, Long l, String str) {
        this.A00 = c1k5;
        this.A01 = c34651k3;
        this.A02 = num;
        this.A03 = l;
        this.A04 = str;
    }

    @Override // X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        Long l;
        int A0N = AbstractC167017dG.A0N(abstractC115105If, 2096728601);
        super.onFail(abstractC115105If);
        UserSession userSession = this.A00.A00;
        String A03 = this.A01.A03();
        Integer num = this.A02;
        Long l2 = this.A03;
        String str = this.A04;
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A02(userSession), "direct_disappearing_messages_toggle_error");
        AbstractC31171DnF.A1H(A0f, A03);
        EnumC33469Er4 enumC33469Er4 = null;
        if (num != null) {
            l = Long.valueOf(TimeUnit.SECONDS.toMillis(num.intValue()));
        } else {
            l = null;
        }
        A0f.A9K("ephemeral_lifetime_ms", l);
        A0f.A9K("after_view_lifetime_ms", l2);
        if (str != null) {
            enumC33469Er4 = C35138Fef.A00(str);
        }
        A0f.A8R(enumC33469Er4, TraceFieldType.TransportType);
        A0f.Cht();
        C0f9.A0A(-55683731, A0N);
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        Long l;
        InterfaceC02590Ai A0f;
        String str;
        String str2;
        int A03 = C0f9.A03(-146766358);
        int A0N = AbstractC167017dG.A0N(obj, 861950269);
        super.onSuccess(obj);
        UserSession userSession = this.A00.A00;
        C34651k3 c34651k3 = this.A01;
        Object obj2 = null;
        if (C6X6.A0E(userSession, c34651k3.A01)) {
            C1118752z c1118752z = c34651k3.A03;
            if (c1118752z != null) {
                obj2 = c1118752z.A00;
            }
            obj2 = Boolean.valueOf(AbstractC25225BEi.A1a(obj2, c34651k3.A04));
        }
        int i = c34651k3.A00;
        String A032 = c34651k3.A03();
        boolean z = c34651k3.A07;
        Integer num = this.A02;
        Long l2 = this.A03;
        String str3 = this.A04;
        EnumC33413Epk enumC33413Epk = (EnumC33413Epk) AbstractC166997dE.A0m(EnumC33413Epk.A02, i);
        if (enumC33413Epk != null) {
            if (num != null) {
                l = Long.valueOf(TimeUnit.SECONDS.toMillis(num.intValue()));
            } else {
                l = null;
            }
            C18920wW A02 = AbstractC12220kQ.A02(userSession);
            Integer num2 = enumC33413Epk.A00;
            Integer num3 = enumC33413Epk.A01;
            if (z) {
                A0f = AbstractC166987dD.A0f(A02, "direct_disappearing_messages_toggle_on");
                AbstractC31171DnF.A1H(A0f, A032);
                EnumC33469Er4 enumC33469Er4 = null;
                if (num3 != null) {
                    str2 = F25.A00(num3);
                } else {
                    str2 = null;
                }
                AbstractC31171DnF.A1G(A0f, str2);
                AbstractC31171DnF.A1C(A0f, F24.A00(num2));
                A0f.A9K("ephemeral_lifetime_ms", l);
                A0f.A9K("after_view_lifetime_ms", l2);
                if (str3 != null) {
                    enumC33469Er4 = C35138Fef.A00(str3);
                }
                A0f.A8R(enumC33469Er4, TraceFieldType.TransportType);
                Boolean A0b = AbstractC166997dE.A0b();
                if (C14360o3.A0K(obj2, A0b)) {
                    A0f.A7v("is_duration_updated", A0b);
                }
            } else {
                A0f = AbstractC166987dD.A0f(A02, "direct_disappearing_messages_toggle_off");
                AbstractC31171DnF.A1H(A0f, A032);
                EnumC33469Er4 enumC33469Er42 = null;
                if (num3 != null) {
                    str = F25.A00(num3);
                } else {
                    str = null;
                }
                AbstractC31171DnF.A1G(A0f, str);
                AbstractC31171DnF.A1C(A0f, F24.A00(num2));
                A0f.A9K("ephemeral_lifetime_ms", l);
                if (str3 != null) {
                    enumC33469Er42 = C35138Fef.A00(str3);
                }
                A0f.A8R(enumC33469Er42, TraceFieldType.TransportType);
                A0f.A9K("after_view_lifetime_ms", l2);
            }
            A0f.Cht();
        }
        C0f9.A0A(-1951670978, A0N);
        C0f9.A0A(2071392903, A03);
    }
}
