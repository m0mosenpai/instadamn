package X;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;
import java.util.Date;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

/* renamed from: X.7Fz, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C160137Fz implements InterfaceC160047Fq {
    public Date A00;
    public boolean A01;
    public final Activity A02;
    public final Context A03;
    public final View A04;
    public final UserSession A05;
    public final InterfaceC160037Fp A06;
    public final C159947Fg A07;
    public final C7G0 A08;
    public final C148396m9 A09;
    public final InterfaceC16820sZ A0A;
    public final C7FM A0B;
    public final boolean A0C;

    public final String A00(Date date) {
        Context context;
        int i;
        Object[] objArr;
        long time = date.getTime();
        Date date2 = new Date();
        TimeZone timeZone = MX0.A03;
        int intValue = AbstractC53877Ns9.A00(date2, time).intValue();
        if (intValue != 2) {
            if (intValue != 3) {
                if (intValue != 4 && intValue != 5 && intValue != 6) {
                    C18950wb.A01.AEp(AnonymousClass001.A0Q("Invalid scheduled send time: ", time), 20134884).report();
                    return "";
                }
                context = this.A03;
                i = 2131972865;
                objArr = new Object[]{MX0.A04("MMM d", time), MX0.A01(context, time)};
                String string = context.getString(i, objArr);
                C14360o3.A07(string);
                return string;
            }
            context = this.A03;
            i = 2131972887;
        } else {
            context = this.A03;
            i = 2131972886;
        }
        objArr = new Object[]{MX0.A01(context, time)};
        String string2 = context.getString(i, objArr);
        C14360o3.A07(string2);
        return string2;
    }

    public final void A01(int i) {
        C146106i8 c146106i8 = new C146106i8();
        Context context = this.A03;
        c146106i8.A0D = context.getString(i);
        Drawable drawable = context.getDrawable(R.drawable.instagram_info_pano_outline_24);
        if (drawable != null) {
            c146106i8.A0B(EnumC142006bJ.A03);
            c146106i8.A08(drawable, context.getColor(AbstractC53242c7.A05(context)));
        }
        C41451vu.A01.E4s(new C3KD(c146106i8.A00()));
    }

    @Override // X.InterfaceC160047Fq
    public final void Edc(final boolean z) {
        View view = this.A04;
        C0fQ.A00(new View.OnClickListener() { // from class: X.7G1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int A05 = C0f9.A05(907330916);
                C160137Fz c160137Fz = C160137Fz.this;
                C148396m9 c148396m9 = c160137Fz.A09;
                if (c148396m9 != null) {
                    c148396m9.A01(null, false, false);
                }
                boolean z2 = z;
                C159947Fg c159947Fg = c160137Fz.A07;
                if (z2) {
                    String Auv = c160137Fz.A06.Auv();
                    C159737El c159737El = c159947Fg.A04.A01;
                    L8B l8b = c159737El.A0g;
                    if (l8b != null) {
                        InterfaceC83713oG interfaceC83713oG = c159737El.A1z;
                        C14360o3.A0B(interfaceC83713oG, 0);
                        if (!(interfaceC83713oG instanceof InterfaceC2056098k)) {
                            Context context = c159737El.A1R;
                            C14360o3.A0B(context, 0);
                            if (TimeUnit.MILLISECONDS.toMinutes(System.currentTimeMillis() - l8b.A00) >= 15) {
                                C146106i8 c146106i8 = new C146106i8();
                                c146106i8.A05();
                                c146106i8.A0H = "Attempted to edit message after the time limit";
                                c146106i8.A0D = context.getString(2131959317);
                                c146106i8.A0I = context.getString(2131959316);
                                C41451vu.A01.E4s(new C3KD(c146106i8.A00()));
                                c159737El.A18();
                            }
                        }
                        String str = l8b.A02;
                        if (str != null) {
                            C18920wW c18920wW = c159737El.A1c.A00;
                            InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "direct_edit_message");
                            if (A00.isSampled()) {
                                A00.AAP("action", "done");
                                A00.AAP("message_type", C2EY.A1i.toString());
                                A00.AAP("message_id", str);
                                A00.A7v("is_e2ee", Boolean.valueOf(AbstractC140946Yw.A07(interfaceC83713oG)));
                                A00.AAP("open_thread_id", AbstractC92784Dr.A02(interfaceC83713oG));
                                A00.A9K("occamadillo_thread_id", AbstractC92784Dr.A01(interfaceC83713oG));
                                A00.Cht();
                            }
                            C7IT c7it = AnonymousClass983.A01(c159737El.A1i.A00).A0j.A03;
                            if (c7it != null) {
                                C7IR c7ir = c7it.A05;
                                c7ir.A03.ENK((InterfaceC83713oG) c7ir.A08.invoke(), str, Auv, c7it.A03.A00());
                                c159737El.A18();
                            } else {
                                C14360o3.A0F("directSendHelper");
                                throw C00O.createAndThrow();
                            }
                        }
                    }
                } else {
                    InterfaceC160037Fp interfaceC160037Fp = c160137Fz.A06;
                    c159947Fg.A01(interfaceC160037Fp.B0K(), null, AbstractC001900j.A0B(interfaceC160037Fp.Auv()).toString());
                    c160137Fz.A01 = true;
                }
                C0f9.A0C(-244295350, A05);
            }
        }, view);
        C2EE c2ee = (C2EE) this.A0A.invoke();
        if (c2ee != null && C7C5.A00(this.A05, c2ee)) {
            view.setOnLongClickListener(new LQG(c2ee, this, z));
        }
    }

    @Override // X.InterfaceC160047Fq
    public final void Edd(boolean z) {
        TextView textView;
        View view = this.A04;
        if ((view instanceof IgTextView) && (textView = (TextView) view) != null) {
            Context context = this.A03;
            int i = 2131973280;
            if (z) {
                i = 2131961124;
            }
            textView.setText(context.getString(i));
        }
    }

    @Override // X.InterfaceC160047Fq
    public final void FC6(boolean z, boolean z2) {
        if (this.A0C) {
            C148396m9 c148396m9 = this.A09;
            if (c148396m9 != null) {
                c148396m9.A01(Boolean.valueOf(z2), z, C18U.A06(C06090Tz.A05, this.A05, 36320476838371870L));
            }
        } else {
            View view = this.A04;
            int i = 8;
            if (z) {
                i = 0;
            }
            view.setVisibility(i);
            view.setEnabled(z2);
            float f = 0.25f;
            if (z2) {
                f = 1.0f;
            }
            view.setAlpha(f);
        }
        this.A0B.A00(C7GY.A07, C7GX.A0N, z);
    }

    public C160137Fz(Activity activity, View view, UserSession userSession, InterfaceC160037Fp interfaceC160037Fp, C7FM c7fm, C159947Fg c159947Fg, C148396m9 c148396m9, InterfaceC16820sZ interfaceC16820sZ) {
        View findViewById;
        String str;
        this.A05 = userSession;
        this.A02 = activity;
        this.A09 = c148396m9;
        this.A07 = c159947Fg;
        this.A06 = interfaceC160037Fp;
        this.A0B = c7fm;
        this.A0A = interfaceC16820sZ;
        this.A03 = view.getContext();
        C06090Tz c06090Tz = C06090Tz.A05;
        boolean A06 = C18U.A06(c06090Tz, userSession, 36320476837978649L);
        this.A0C = A06;
        if (A06) {
            findViewById = view.findViewById(R.id.row_thread_composer_send_button_container);
        } else {
            findViewById = view.findViewById(R.id.row_thread_composer_button_send);
            if (C18U.A06(c06090Tz, userSession, 36320476838240796L)) {
                ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
                layoutParams.height = -2;
                findViewById.setLayoutParams(layoutParams);
            }
        }
        C14360o3.A0A(findViewById);
        this.A04 = findViewById;
        C2EE c2ee = (C2EE) interfaceC16820sZ.invoke();
        if (c2ee != null) {
            str = c2ee.C7I();
        } else {
            str = null;
        }
        this.A08 = new C7G0(userSession, str);
        Edc(false);
    }
}
