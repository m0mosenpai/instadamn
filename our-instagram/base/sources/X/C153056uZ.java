package X;

import android.content.Context;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.6uZ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C153056uZ {
    public final Context A00;
    public final C65662y2 A01;
    public final UserSession A02;
    public final C153066ua A03;
    public final C53N A04;
    public final Context A05;
    public final InterfaceC11380iw A06;
    public final UserSession A07;
    public final InterfaceC153046uY A08;
    public final C53N A09;

    /* JADX WARN: Type inference failed for: r0v2, types: [X.6ua] */
    /* JADX WARN: Type inference failed for: r2v0, types: [X.2y2, java.lang.Object] */
    public C153056uZ(final Context context, InterfaceC11380iw interfaceC11380iw, final UserSession userSession, InterfaceC153046uY interfaceC153046uY, final C53N c53n) {
        C14360o3.A0B(context, 1);
        C14360o3.A0B(userSession, 2);
        this.A00 = context;
        this.A02 = userSession;
        this.A04 = c53n;
        final int A0H = AbstractC53242c7.A0H(context, R.attr.actionBarBackgroundColor);
        this.A03 = new AbstractC65632xz(context, userSession, c53n, A0H) { // from class: X.6ua
            public final int A00;
            public final Context A01;
            public final UserSession A02;
            public final C53N A03;

            @Override // X.InterfaceC65642y0
            public final int getViewTypeCount() {
                return 2;
            }

            @Override // X.InterfaceC65642y0
            public final /* bridge */ /* synthetic */ void buildRowViewTypes(AnonymousClass306 anonymousClass306, Object obj, Object obj2) {
                C31522Dt6 c31522Dt6 = (C31522Dt6) obj;
                C14360o3.A0B(anonymousClass306, 0);
                if (c31522Dt6 != null) {
                    if (c31522Dt6.A03) {
                        anonymousClass306.A7a(0);
                    }
                    anonymousClass306.A7a(1);
                    return;
                }
                throw new IllegalStateException("Required value was null.");
            }

            {
                this.A01 = context;
                this.A02 = userSession;
                this.A00 = A0H;
                this.A03 = c53n;
            }

            @Override // X.InterfaceC65642y0
            public final void bindView(int i, View view, Object obj, Object obj2) {
                int A03 = C0f9.A03(-1906217142);
                C14360o3.A0B(view, 1);
                C14360o3.A0B(obj, 2);
                C31522Dt6 c31522Dt6 = (C31522Dt6) obj;
                if (i != 0) {
                    if (i == 1) {
                        Context context2 = this.A01;
                        UserSession userSession2 = this.A02;
                        Object tag = view.getTag();
                        C14360o3.A0C(tag, "null cannot be cast to non-null type com.instagram.user.recommended.activationcards.ActivationCardsRowViewBinder.Holder");
                        List list = c31522Dt6.A01;
                        boolean z = c31522Dt6.A02;
                        AbstractC31550Dta.A00(context2, userSession2, this.A03, (C31549DtZ) tag, list, z);
                    } else {
                        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Invalid view type supplied");
                        C0f9.A0A(-1224306151, A03);
                        throw illegalArgumentException;
                    }
                } else {
                    Context context3 = this.A01;
                    UserSession userSession3 = this.A02;
                    String str = c31522Dt6.A00;
                    List<InterfaceC37229Gae> list2 = c31522Dt6.A01;
                    C14360o3.A0B(context3, 0);
                    C14360o3.A0B(userSession3, 1);
                    Object tag2 = view.getTag();
                    C14360o3.A0C(tag2, "null cannot be cast to non-null type com.instagram.user.recommended.activationcards.ActivationCardsProgressRowViewBinder.Holder");
                    C25607BTu c25607BTu = (C25607BTu) tag2;
                    c25607BTu.A01.setText(str);
                    int i2 = 0;
                    for (InterfaceC37229Gae interfaceC37229Gae : list2) {
                        if (interfaceC37229Gae.EjK(context3, userSession3)) {
                            i2 += interfaceC37229Gae.CRX(userSession3, null) ? 1 : 0;
                        }
                    }
                    Integer valueOf = Integer.valueOf(i2);
                    Iterator it = list2.iterator();
                    int i3 = 0;
                    while (it.hasNext()) {
                        i3 += ((InterfaceC37229Gae) it.next()).EjK(context3, userSession3) ? 1 : 0;
                    }
                    String string = context3.getString(2131952192, valueOf, Integer.valueOf(i3));
                    C14360o3.A07(string);
                    String string2 = context3.getString(2131952191);
                    C14360o3.A07(string2);
                    String string3 = context3.getString(2131952190, string, string2);
                    C14360o3.A07(string3);
                    SpannableString spannableString = new SpannableString(string3);
                    int A08 = AbstractC001900j.A08(string3, string, 0, false);
                    if (A08 != -1) {
                        spannableString.setSpan(new ForegroundColorSpan(context3.getColor(AbstractC53242c7.A0H(context3, R.attr.igds_color_primary_icon))), A08, string.length() + A08, 17);
                    }
                    c25607BTu.A00.setText(spannableString);
                }
                C0f9.A0A(-855767956, A03);
            }

            @Override // X.InterfaceC65642y0
            public final View createView(int i, ViewGroup viewGroup) {
                View inflate;
                int A03 = C0f9.A03(1596381225);
                C14360o3.A0B(viewGroup, 1);
                if (i != 0) {
                    if (i == 1) {
                        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
                        C14360o3.A07(from);
                        int i2 = this.A00;
                        inflate = from.inflate(R.layout.find_people_activation_cards_row, viewGroup, false);
                        inflate.setBackgroundResource(i2);
                        inflate.setTag(new C31549DtZ(inflate, false));
                    } else {
                        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Invalid view type supplied");
                        C0f9.A0A(1650329894, A03);
                        throw illegalArgumentException;
                    }
                } else {
                    inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.find_people_activation_cards_progress_row, viewGroup, false);
                    View findViewById = inflate.findViewById(R.id.title);
                    C14360o3.A07(findViewById);
                    View findViewById2 = inflate.findViewById(R.id.progress);
                    C14360o3.A07(findViewById2);
                    inflate.setTag(new C25607BTu((TextView) findViewById, (TextView) findViewById2));
                    inflate.setBackgroundResource(this.A00);
                }
                C0f9.A0A(-2123078516, A03);
                return inflate;
            }
        };
        ?? obj = new Object();
        obj.A00 = AbstractC53242c7.A0H(context, R.attr.actionBarBackgroundColor);
        obj.A04 = false;
        obj.A03 = context.getResources().getDimensionPixelSize(R.dimen.abc_dropdownitem_icon_width);
        this.A01 = obj;
        this.A05 = context;
        this.A07 = userSession;
        this.A06 = interfaceC11380iw;
        this.A08 = interfaceC153046uY;
        this.A09 = c53n;
    }

    public final void A01(C1571273r c1571273r) {
        c1571273r.A02 = 0;
        c1571273r.A0M = true;
        c1571273r.A0N = true;
        c1571273r.A0O = true;
        Context context = this.A05;
        c1571273r.A03 = context.getColor(AbstractC53242c7.A0H(context, R.attr.igds_color_secondary_text));
        c1571273r.A00 = AbstractC53242c7.A0F(context, R.attr.igds_color_primary_background);
    }

    public final C31522Dt6 A00(InterfaceC53792dI interfaceC53792dI) {
        ArrayList A00 = AbstractC31493Dsd.A00(interfaceC53792dI, this.A07, this.A09);
        String string = this.A05.getString(2131952177);
        C14360o3.A07(string);
        return new C31522Dt6(this.A06, string, A00, true, false);
    }

    public final boolean A02(InterfaceC53792dI interfaceC53792dI) {
        Integer B7S;
        Integer BQb;
        C08730cb c08730cb = C17060sy.A01;
        UserSession userSession = this.A07;
        User A01 = c08730cb.A01(userSession);
        User E6j = this.A08.E6j();
        if (E6j != null && C2TN.A04(userSession, E6j) && (B7S = A01.A03.B7S()) != null && B7S.intValue() <= 3500 && (BQb = A01.A03.BQb()) != null && BQb.intValue() <= 6) {
            C53N c53n = this.A09;
            Context context = this.A05;
            Iterator it = AbstractC31493Dsd.A00(interfaceC53792dI, userSession, c53n).iterator();
            while (it.hasNext()) {
                InterfaceC37229Gae interfaceC37229Gae = (InterfaceC37229Gae) it.next();
                if (!interfaceC37229Gae.CRX(userSession, null) && interfaceC37229Gae.EjK(context, userSession)) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }
}
