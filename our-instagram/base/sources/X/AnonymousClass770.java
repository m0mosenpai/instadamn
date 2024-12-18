package X;

import android.content.Context;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.view.View;
import com.instagram.common.session.UserSession;

/* renamed from: X.770, reason: invalid class name */
/* loaded from: classes3.dex */
public final class AnonymousClass770 implements InterfaceC165197a8 {
    public final C7FS A00;
    public final InterfaceC08830cm A01;
    public final InterfaceC08830cm A02;
    public final UserSession A03;

    public AnonymousClass770(UserSession userSession, InterfaceC08830cm interfaceC08830cm, InterfaceC08830cm interfaceC08830cm2) {
        C14360o3.A0B(interfaceC08830cm, 2);
        C14360o3.A0B(interfaceC08830cm2, 3);
        this.A03 = userSession;
        this.A01 = interfaceC08830cm;
        this.A02 = interfaceC08830cm2;
        this.A00 = new C7FS(userSession);
    }

    @Override // X.InterfaceC165197a8
    public final Spannable CoX(Context context, CharSequence charSequence, final String str, int i, final boolean z) {
        Boolean bool;
        C14360o3.A0B(charSequence, 0);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
        if (str != null) {
            if (((C7U0) this.A01.get()).CYS(str)) {
                bool = Boolean.valueOf(C18U.A06(C06090Tz.A05, this.A03, 36321632184772255L));
            } else {
                bool = true;
            }
            C14360o3.A0A(bool);
            if (bool.booleanValue()) {
                int i2 = 2131959873;
                if (z) {
                    i2 = 2131959883;
                }
                String string = context.getString(i2);
                C14360o3.A07(string);
                AnonymousClass773.A06(spannableStringBuilder, new AnonymousClass772() { // from class: X.771
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(null);
                    }

                    @Override // X.AnonymousClass772, android.text.style.ClickableSpan
                    public final void onClick(View view) {
                        String str2;
                        String str3;
                        AnonymousClass770 anonymousClass770 = AnonymousClass770.this;
                        InterfaceC163557Ts BT6 = ((C7U0) anonymousClass770.A01.get()).BT6();
                        String str4 = str;
                        boolean z2 = !z;
                        BT6.Ejb(str4, z2);
                        C7FS c7fs = anonymousClass770.A00;
                        C3o9 c3o9 = (C3o9) anonymousClass770.A02.get();
                        C18920wW c18920wW = c7fs.A00;
                        InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "direct_edit_message");
                        if (A00.isSampled()) {
                            if (z2) {
                                str2 = "show_edit_history";
                            } else {
                                str2 = "hide_edit_history";
                            }
                            A00.AAP("action", str2);
                            A00.AAP("message_type", C2EY.A1i.toString());
                            A00.AAP("message_id", str4);
                            A00.A7v("is_e2ee", false);
                            Long l = null;
                            if (c3o9 != null) {
                                str3 = AbstractC43827JZq.A01(c3o9);
                            } else {
                                str3 = null;
                            }
                            A00.AAP("open_thread_id", str3);
                            if (c3o9 != null) {
                                l = AbstractC43827JZq.A00(c3o9);
                            }
                            A00.A9K("occamadillo_thread_id", l);
                            A00.Cht();
                        }
                    }
                }, string, i);
            }
        }
        return spannableStringBuilder;
    }
}
