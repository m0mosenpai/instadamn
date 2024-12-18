package X;

import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.instagram.actionbar.ActionButton;
import com.instagram.common.session.UserSession;
import com.instagram.model.hashtag.Hashtag;
import com.instagram.user.model.User;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* loaded from: classes11.dex */
public final class WFL {
    public C67910V2a A00;
    public C155506yf A01;
    public C169337h7 A02;
    public boolean A03;
    public final Handler A04;
    public final TextWatcher A05;
    public final EditText A06;
    public final TextView A07;
    public final TextView A08;
    public final AbstractC59962oe A09;
    public final InterfaceC11380iw A0A;
    public final C25671My A0B;
    public final C61972ry A0C;
    public final UserSession A0D;
    public final C69029Vg5 A0E;
    public final C7OQ A0F;
    public final String A0G;
    public final List A0H;
    public final int A0I;
    public final ListView A0J;
    public final TextView A0K;
    public final FHD A0L;
    public final XLQ A0M;
    public final XLU A0N;

    public static final void A01(WFL wfl) {
        List list = wfl.A0H;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            wfl.A06.getText().removeSpan(it.next());
            it.remove();
        }
        EditText editText = wfl.A06;
        String A0g = AbstractC167007dF.A0g(editText);
        int A0F = AbstractC53242c7.A0F(wfl.A09.requireContext(), R.attr.igds_color_link);
        Iterator it2 = AbstractC85433rY.A05(A0g, false).iterator();
        while (it2.hasNext()) {
            C89393yf c89393yf = (C89393yf) it2.next();
            Editable text = editText.getText();
            C14360o3.A07(text);
            U9X u9x = new U9X(A0F);
            list.add(u9x);
            text.setSpan(u9x, c89393yf.A01, c89393yf.A00, 33);
        }
        Iterator it3 = AbstractC85433rY.A03(A0g).iterator();
        while (it3.hasNext()) {
            C89393yf c89393yf2 = (C89393yf) it3.next();
            Editable text2 = editText.getText();
            C14360o3.A07(text2);
            U9X u9x2 = new U9X(A0F);
            list.add(u9x2);
            text2.setSpan(u9x2, c89393yf2.A01, c89393yf2.A00, 33);
        }
    }

    public static final void A02(WFL wfl, User user) {
        AbstractC59962oe abstractC59962oe = wfl.A09;
        Context requireContext = abstractC59962oe.requireContext();
        UserSession userSession = wfl.A0D;
        AbstractC35239FgY.A03(requireContext, userSession, user, new C167707eQ(abstractC59962oe.getActivity(), userSession, "profile_bio"), "profile_bio", null, null);
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [X.TwV, X.V9z] */
    public static final void A03(WFL wfl, String str, List list, boolean z) {
        Tx0 tx0;
        InterfaceC65642y0 interfaceC65642y0;
        C65741TtG c65741TtG;
        C67910V2a c67910V2a = wfl.A00;
        if (c67910V2a == null) {
            C14360o3.A0F("suggestionsAdapter");
            throw C00O.createAndThrow();
        }
        C14360o3.A0B(list, 0);
        List<VJH> list2 = c67910V2a.A06;
        list2.clear();
        list2.addAll(list);
        c67910V2a.A01 = z;
        c67910V2a.A00 = str;
        c67910V2a.A06();
        int i = 0;
        for (VJH vjh : list2) {
            User user = vjh.A01;
            Hashtag hashtag = vjh.A00;
            if (user != null) {
                C65954Twz c65954Twz = new C65954Twz();
                c65954Twz.A01 = i;
                c65954Twz.A00 = i;
                tx0 = new Tx0(c65954Twz);
                C65741TtG c65741TtG2 = new C65741TtG(user);
                interfaceC65642y0 = c67910V2a.A03;
                c65741TtG = c65741TtG2;
            } else if (hashtag != null) {
                C65954Twz c65954Twz2 = new C65954Twz();
                c65954Twz2.A01 = i;
                c65954Twz2.A00 = i;
                tx0 = new Tx0(c65954Twz2);
                ?? abstractC65924TwV = new AbstractC65924TwV(1);
                abstractC65924TwV.A00 = hashtag.F59();
                interfaceC65642y0 = c67910V2a.A02;
                c65741TtG = abstractC65924TwV;
            }
            c67910V2a.A09(interfaceC65642y0, c65741TtG, tx0);
            i++;
        }
        if (c67910V2a.A01) {
            c67910V2a.A09(c67910V2a.A05, c67910V2a.A04, null);
        }
        c67910V2a.A07();
    }

    public static final void A00(Editable editable, WFL wfl) {
        int codePointCount;
        String obj = editable.toString();
        if (C18U.A06(C06090Tz.A05, wfl.A0D, 36326562806642655L)) {
            codePointCount = obj.length();
        } else {
            codePointCount = obj.codePointCount(0, obj.length());
        }
        int i = wfl.A0I - codePointCount;
        boolean A1P = AbstractC25230BEn.A1P(i);
        TextView textView = wfl.A0K;
        AbstractC59962oe abstractC59962oe = wfl.A09;
        FragmentActivity requireActivity = abstractC59962oe.requireActivity();
        Context requireContext = abstractC59962oe.requireContext();
        int i2 = R.attr.igds_color_primary_text;
        if (A1P) {
            i2 = R.attr.igds_color_error_or_destructive;
        }
        AbstractC166987dD.A1O(requireActivity, textView, AbstractC53242c7.A0H(requireContext, i2));
        textView.setText(NumberFormat.getInstance(Locale.getDefault()).format(i));
        Resources A0N = AbstractC166997dE.A0N(abstractC59962oe);
        int i3 = R.plurals.n_characters_remaining;
        if (A1P) {
            i3 = R.plurals.n_characters_over_the_limit;
            i = -i;
        }
        textView.setContentDescription(AbstractC167017dG.A0k(A0N, i, i3));
        ActionButton actionButton = wfl.A0L.A00.A08;
        if (actionButton != null) {
            actionButton.setEnabled(!A1P);
        }
    }

    public WFL(EditText editText, ListView listView, TextView textView, TextView textView2, TextView textView3, AbstractC59962oe abstractC59962oe, InterfaceC11380iw interfaceC11380iw, UserSession userSession, FHD fhd, String str) {
        C14360o3.A0B(userSession, 3);
        AbstractC167007dF.A1I(textView3, 7, listView);
        C14360o3.A0B(fhd, 10);
        this.A09 = abstractC59962oe;
        this.A0A = interfaceC11380iw;
        this.A0D = userSession;
        this.A06 = editText;
        this.A08 = textView;
        this.A07 = textView2;
        this.A0K = textView3;
        this.A0J = listView;
        this.A0G = str;
        this.A0L = fhd;
        this.A0B = AbstractC25651Mw.A00(userSession);
        this.A0H = new ArrayList();
        this.A0F = C7OQ.A05;
        this.A04 = AbstractC167007dF.A0J();
        this.A0E = new C69029Vg5();
        this.A0C = new C61972ry(abstractC59962oe.requireActivity(), AbstractC018607g.A00(abstractC59962oe), null);
        this.A0I = AbstractC166997dE.A0N(abstractC59962oe).getInteger(R.integer.abc_config_activityShortDur);
        VAE vae = new VAE(this, 0);
        this.A0N = vae;
        C71024Wmf c71024Wmf = new C71024Wmf(this);
        this.A0M = c71024Wmf;
        this.A05 = new WKU(this, 14);
        C67910V2a c67910V2a = new C67910V2a(abstractC59962oe.requireActivity(), interfaceC11380iw, userSession, c71024Wmf, vae);
        this.A00 = c67910V2a;
        listView.setAdapter((ListAdapter) c67910V2a);
        C169337h7 c169337h7 = new C169337h7((C1GL) this.A0C, (InterfaceC169327h6) new C36695GFq(this, 4), true);
        this.A02 = c169337h7;
        c169337h7.EYJ(new C71022Wmd(this, 2));
        C08730cb c08730cb = C17060sy.A01;
        UserSession userSession2 = this.A0D;
        User A01 = c08730cb.A01(userSession2);
        EditText editText2 = this.A06;
        editText2.setText(A01.A0N());
        A01(this);
        editText2.addTextChangedListener(this.A05);
        editText2.addTextChangedListener(new WKU(this, 13));
        if (AbstractC154816xW.A01(userSession2)) {
            Integer num = C05F.A01;
            TextView textView4 = this.A08;
            if (textView4 != null) {
                C0fQ.A00(new WNX(44, editText2, num, textView4), textView4);
            }
            Integer num2 = C05F.A00;
            TextView textView5 = this.A07;
            if (textView5 != null) {
                C0fQ.A00(new WNX(44, editText2, num2, textView5), textView5);
            }
        }
        editText2.requestFocus();
        AbstractC13880nE.A0S(editText2);
        Editable text = editText.getText();
        C14360o3.A07(text);
        A00(text, this);
        FA7.A00(userSession).A02(EnumC33422Ept.A05, C05F.A00);
        this.A01 = AbstractC155496ye.A00(userSession);
    }
}
