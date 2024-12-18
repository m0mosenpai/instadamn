package X;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.style.StyleSpan;
import com.google.common.collect.ImmutableList;
import com.instagram.common.recyclerview.ViewModelListUpdate;
import com.instagram.common.session.UserSession;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;

/* renamed from: X.Fex, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C35155Fex {
    public int A00;
    public boolean A04;
    public final Context A05;
    public final InterfaceC11380iw A06;
    public final UserSession A07;
    public final C34947FaX A09;
    public final C34708FQt A0A;
    public final FPU A0B;
    public final C34483FHv A08 = new C34483FHv(this);
    public String A01 = AbstractC166997dE.A0n();
    public List A02 = AbstractC166987dD.A1E();
    public List A03 = AbstractC166987dD.A1E();

    /* JADX WARN: Type inference failed for: r1v2, types: [X.1P1, X.ESN, java.lang.Object] */
    public final void A02() {
        C34947FaX c34947FaX = this.A09;
        c34947FaX.A01.clear();
        c34947FaX.A02.clear();
        C25621Ms A0D = AbstractC31179DnN.A0D(this.A07);
        A0D.A0B("direct_v2/suggested_blocks/");
        C1ON A0e = AbstractC25227BEk.A0e(A0D, ECD.class, FYB.class);
        ?? obj = new Object();
        obj.A00 = AbstractC25225BEi.A16(this);
        A0e.A00 = obj;
        C1GJ.A03(A0e);
    }

    public C35155Fex(Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C34708FQt c34708FQt) {
        this.A05 = context;
        this.A07 = userSession;
        this.A09 = C36289Fzj.A00(userSession);
        this.A0A = c34708FQt;
        this.A06 = interfaceC11380iw;
        this.A0B = new FPU(context);
    }

    public static ViewModelListUpdate A00(C35155Fex c35155Fex, List list) {
        SpannableStringBuilder A07;
        ImmutableList.Builder builder = ImmutableList.builder();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            builder.add((Object) c35155Fex.A0B.A00((EB0) it.next()));
        }
        ViewModelListUpdate A0E = AbstractC31171DnF.A0E();
        AbstractC166987dD.A10(c35155Fex.A07).getUsername();
        if (AbstractC31173DnH.A0L(c35155Fex.A09.A01).isEmpty()) {
            A07 = new SpannableStringBuilder();
            Context context = c35155Fex.A05;
            String string = context.getResources().getString(2131974873);
            SpannableStringBuilder append = A07.append((CharSequence) context.getResources().getString(2131974873));
            StyleSpan styleSpan = new StyleSpan(1);
            Pattern pattern = AbstractC13670mt.A01;
            append.setSpan(styleSpan, 0, AbstractC167007dF.A0A(string), 33);
            String property = System.getProperty(AbstractC111324zv.A00(230));
            property.getClass();
            A07.append((CharSequence) property).append((CharSequence) context.getResources().getString(2131974875));
        } else {
            Context context2 = c35155Fex.A05;
            Em1 em1 = new Em1(Integer.valueOf(AbstractC31174DnI.A02(context2)), c35155Fex, 42);
            String string2 = context2.getString(2131963030);
            A07 = AbstractC31178DnM.A07(context2, string2, 2131974874);
            AnonymousClass773.A04(A07, em1, string2);
        }
        A0E.A00(new C32621EXv(A07));
        A0E.A01(builder.build());
        return A0E;
    }

    public static HashMap A01(List list) {
        HashMap hashMap = new HashMap(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            EB0 eb0 = (EB0) it.next();
            hashMap.put(AbstractC25228BEl.A13(eb0.A04), AbstractC31171DnF.A0V(eb0.A00));
        }
        return hashMap;
    }
}
