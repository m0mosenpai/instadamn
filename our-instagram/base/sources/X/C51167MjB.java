package X;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.model.mediasize.ExtendedImageUrl;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;

/* renamed from: X.MjB, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51167MjB extends C2UU {
    public List A00;
    public List A01;
    public InterfaceC41501vz A02;
    public InterfaceC41501vz A03;
    public final Context A04;
    public final FragmentActivity A05;
    public final EnumC60792q3 A06;
    public final OXR A07;
    public final InterfaceC11380iw A08;
    public final UserSession A09;

    public C51167MjB(Context context, FragmentActivity fragmentActivity, EnumC60792q3 enumC60792q3, OXR oxr, InterfaceC11380iw interfaceC11380iw, UserSession userSession) {
        AbstractC25233BEq.A0w(1, context, enumC60792q3, userSession);
        this.A04 = context;
        this.A05 = fragmentActivity;
        this.A06 = enumC60792q3;
        this.A09 = userSession;
        this.A08 = interfaceC11380iw;
        this.A07 = oxr;
        this.A00 = AbstractC166987dD.A1E();
        this.A01 = AbstractC166987dD.A1E();
    }

    public static final void A00(C51326Mln c51326Mln, C51167MjB c51167MjB, int i) {
        long j = i * 1000;
        TextView textView = c51326Mln.A03;
        Context context = c51167MjB.A04;
        AbstractC31177DnL.A0r(context, textView, AbstractC43593JPy.A10(new SimpleDateFormat("LLL d, h:mm a", Locale.US), j), 2131972885);
        if (Calendar.getInstance().getTimeInMillis() > j) {
            AbstractC166987dD.A1O(context, textView, AbstractC53242c7.A03(context));
        }
    }

    @Override // X.C2UU
    public final /* bridge */ /* synthetic */ C3OO onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C51326Mln(AbstractC25226BEj.A0R(AbstractC25231BEo.A0O(viewGroup), viewGroup, R.layout.scheduled_content_list_item, false));
    }

    public final void A02() {
        if (this.A02 != null) {
            C25671My A00 = AbstractC25651Mw.A00(this.A09);
            InterfaceC41501vz interfaceC41501vz = this.A02;
            C14360o3.A0A(interfaceC41501vz);
            A00.A02(interfaceC41501vz, C55981OtE.class);
            this.A02 = null;
        }
        if (this.A03 != null) {
            C25671My A002 = AbstractC25651Mw.A00(this.A09);
            InterfaceC41501vz interfaceC41501vz2 = this.A03;
            C14360o3.A0A(interfaceC41501vz2);
            A002.A02(interfaceC41501vz2, C56007Ote.class);
            this.A03 = null;
        }
    }

    @Override // X.C2UU
    public final /* bridge */ /* synthetic */ void onBindViewHolder(C3OO c3oo, int i) {
        ExtendedImageUrl A1o;
        C84923qg A1V;
        JKD Ar6;
        Integer BqX;
        String str;
        C38321qM c38321qM;
        C51326Mln c51326Mln = (C51326Mln) c3oo;
        C14360o3.A0B(c51326Mln, 0);
        this.A01.set(i, c51326Mln);
        C38321qM A0x = AbstractC25225BEi.A0x(this.A00, i);
        int dimensionPixelSize = this.A04.getResources().getDimensionPixelSize(R.dimen.action_bar_immersive_gradient_height);
        if (A0x.A0q() > 0) {
            List AmB = A0x.A0C.AmB();
            if (AmB != null && (c38321qM = (C38321qM) AbstractC001800i.A0O(AmB, 0)) != null) {
                A1o = c38321qM.A1o(dimensionPixelSize);
            }
            A1V = A0x.A1V();
            if (A1V != null && (str = A1V.A0e) != null && str.length() > 0) {
                TextView textView = c51326Mln.A02;
                textView.setText(str);
                textView.setVisibility(0);
            }
            Ar6 = A0x.A0C.Ar6();
            if (Ar6 != null && (BqX = Ar6.BqX()) != null) {
                A00(c51326Mln, this, BqX.intValue());
            }
            ViewOnClickListenerC55464OkJ.A01(c51326Mln.A01, 22, this, A0x);
            ViewOnClickListenerC55464OkJ.A01(c51326Mln.A00, 23, this, A0x);
        }
        A1o = A0x.A1o(dimensionPixelSize);
        if (A1o != null) {
            c51326Mln.A04.setUrl(this.A09, A1o, this.A08);
        }
        A1V = A0x.A1V();
        if (A1V != null) {
            TextView textView2 = c51326Mln.A02;
            textView2.setText(str);
            textView2.setVisibility(0);
        }
        Ar6 = A0x.A0C.Ar6();
        if (Ar6 != null) {
            A00(c51326Mln, this, BqX.intValue());
        }
        ViewOnClickListenerC55464OkJ.A01(c51326Mln.A01, 22, this, A0x);
        ViewOnClickListenerC55464OkJ.A01(c51326Mln.A00, 23, this, A0x);
    }

    public final void A01() {
        A02();
        this.A02 = C56035Ou7.A00(this, 14);
        this.A03 = C56035Ou7.A00(this, 15);
        UserSession userSession = this.A09;
        C25671My A00 = AbstractC25651Mw.A00(userSession);
        InterfaceC41501vz interfaceC41501vz = this.A02;
        C14360o3.A0A(interfaceC41501vz);
        A00.A01(interfaceC41501vz, C55981OtE.class);
        C25671My A002 = AbstractC25651Mw.A00(userSession);
        InterfaceC41501vz interfaceC41501vz2 = this.A03;
        C14360o3.A0A(interfaceC41501vz2);
        A002.A01(interfaceC41501vz2, C56007Ote.class);
    }

    public final void A03(List list) {
        ArrayList A1F = AbstractC166987dD.A1F(list);
        this.A00 = A1F;
        int size = A1F.size();
        ArrayList A17 = AbstractC25225BEi.A17(size);
        for (int i = 0; i < size; i++) {
            A17.add(null);
        }
        this.A01 = A17;
        notifyDataSetChanged();
    }

    @Override // X.C2UU
    public final int getItemCount() {
        int A03 = C0f9.A03(-173751447);
        int size = this.A00.size();
        C0f9.A0A(-122784362, A03);
        return size;
    }
}
