package X;

import android.content.Context;
import android.text.SpannableString;
import android.view.View;
import com.facebook.R;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes6.dex */
public final class EQ8 extends C2US {
    public C34624FNh A00;
    public C195918ld A01;
    public C31543DtT A02;
    public boolean A03;
    public boolean A04;
    public C1571273r A05;
    public boolean A06;
    public final Context A07;
    public final C32457ERj A08;
    public final C32449ERb A09;
    public final C32428EQd A0A;
    public final C31545DtV A0B;
    public final ERQ A0C;
    public final List A0D;
    public final List A0E;
    public final InterfaceC09390do A0F;
    public final InterfaceC09390do A0G;
    public final boolean A0H;
    public final ERN A0I;
    public final ERO A0J;
    public final C152996uT A0K;
    public final C168737g7 A0L;
    public final C65842yM A0M;
    public final Integer A0N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EQ8(Context context, InterfaceC11380iw interfaceC11380iw, ELn eLn, ELn eLn2, ELn eLn3, GYQ gyq, Integer num, boolean z, boolean z2) {
        super(false);
        C14360o3.A0B(num, 7);
        this.A07 = context;
        this.A0N = num;
        this.A0H = z;
        this.A0D = AbstractC166987dD.A1E();
        this.A0E = AbstractC166987dD.A1E();
        ERO ero = new ERO(context, eLn3);
        this.A0J = ero;
        C32457ERj c32457ERj = new C32457ERj(context, interfaceC11380iw, eLn, z2);
        this.A08 = c32457ERj;
        C32449ERb c32449ERb = new C32449ERb(context, interfaceC11380iw, eLn2);
        this.A09 = c32449ERb;
        C65842yM c65842yM = new C65842yM(context);
        this.A0M = c65842yM;
        ERN ern = new ERN(context, gyq);
        this.A0I = ern;
        C168737g7 c168737g7 = new C168737g7(context);
        this.A0L = c168737g7;
        C32428EQd c32428EQd = new C32428EQd(context);
        this.A0A = c32428EQd;
        C31545DtV c31545DtV = new C31545DtV(context);
        this.A0B = c31545DtV;
        ERQ erq = new ERQ(context, C36740GHj.A00);
        this.A0C = erq;
        this.A0G = C1XM.A00(GUL.A00);
        this.A0F = C1XM.A00(C37061GUv.A01(this, 6));
        C152996uT c152996uT = new C152996uT(context);
        this.A0K = c152996uT;
        this.A04 = true;
        init(ero, c32457ERj, c32449ERb, c65842yM, ern, c168737g7, c32428EQd, c31545DtV, erq, c152996uT);
    }

    public final void A03(Context context, View.OnClickListener onClickListener, EnumC153216up enumC153216up) {
        CharSequence charSequence;
        C14360o3.A0B(context, 0);
        clear();
        C34624FNh c34624FNh = this.A00;
        if (c34624FNh != null) {
            EnumC153216up enumC153216up2 = enumC153216up;
            if (c34624FNh.A05 && enumC153216up == EnumC153216up.A02) {
                enumC153216up2 = EnumC153216up.A04;
            }
            C1571273r c1571273r = new C1571273r();
            c1571273r.A00 = AbstractC167027dH.A01(c34624FNh.A04);
            int ordinal = enumC153216up2.ordinal();
            if (ordinal != 2) {
                if (ordinal != 3) {
                    if (ordinal != 0) {
                        C0w9.A03("Private Story Empty State Bindings", "Tried to bind to an invalid empty state in Private Story adapter.");
                    } else {
                        c1571273r.A02 = c34624FNh.A00;
                        c1571273r.A0D = c34624FNh.A03;
                        charSequence = c34624FNh.A02;
                    }
                } else {
                    c1571273r.A05 = onClickListener;
                    StringBuilder A1C = AbstractC166987dD.A1C();
                    String A0p = AbstractC166997dE.A0p(context, 2131972568);
                    String string = context.getString(2131956273);
                    A1C.append(string);
                    A1C.append(" ");
                    A1C.append(A0p);
                    SpannableString spannableString = new SpannableString(AnonymousClass001.A0g(string, " ", A0p));
                    AbstractC31178DnM.A0u(spannableString, new AnonymousClass772(Integer.valueOf(AbstractC31174DnI.A02(context))), A0p, A1C.lastIndexOf(A0p));
                    charSequence = spannableString;
                }
                c1571273r.A07 = charSequence;
            }
            this.A05 = c1571273r;
            addModel(c1571273r, enumC153216up, this.A0K);
            notifyDataSetChangedSmart();
            return;
        }
        C14360o3.A0F("emptyStateController");
        throw C00O.createAndThrow();
    }

    public final void A04(List list, List list2) {
        C14360o3.A0B(list2, 1);
        List list3 = this.A0D;
        list3.clear();
        list3.addAll(list);
        List list4 = this.A0E;
        list4.clear();
        list4.addAll(list2);
    }

    private final void A00(String str, String str2) {
        Object obj;
        InterfaceC65642y0 interfaceC65642y0;
        C31335Dq0 c31335Dq0 = new C31335Dq0(str);
        if (str2 != null) {
            c31335Dq0.A0G = str2;
            obj = null;
            interfaceC65642y0 = this.A0I;
        } else {
            obj = new Object();
            interfaceC65642y0 = this.A0L;
        }
        addModel(c31335Dq0, obj, interfaceC65642y0);
    }

    public final void A02(int i) {
        C31335Dq0 c31335Dq0;
        String A0k;
        if (this.A06 && (c31335Dq0 = (C31335Dq0) getModel(C31335Dq0.class, 0)) != null) {
            int intValue = this.A0N.intValue();
            if (intValue != 0) {
                if (intValue != 1 && intValue != 2) {
                    throw B4Z.A00();
                }
                A0k = AbstractC166997dE.A0r(this.A07.getResources(), Integer.valueOf(i), 2131953291);
            } else {
                A0k = AbstractC167017dG.A0k(this.A07.getResources(), i, R.plurals.audience_picker_members_section_title);
            }
            C14360o3.A07(A0k);
            c31335Dq0.A0E = A0k;
            notifyItemChanged(0);
        }
    }

    public final void A01() {
        String string;
        String string2;
        clear();
        List list = this.A0D;
        if (list.isEmpty() && this.A0E.isEmpty()) {
            A03(this.A07, null, EnumC153216up.A02);
        } else {
            if (!list.isEmpty()) {
                Integer num = this.A0N;
                if (num == C05F.A00) {
                    int size = list.size();
                    if (this.A0H) {
                        string2 = null;
                    } else {
                        string2 = this.A07.getString(2131955188);
                    }
                    String A0k = AbstractC167017dG.A0k(this.A07.getResources(), size, R.plurals.audience_picker_members_section_title);
                    C14360o3.A07(A0k);
                    A00(A0k, string2);
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        C32069E6v.A00(this, it);
                    }
                } else if (num == C05F.A01) {
                    String A0r = AbstractC166997dE.A0r(this.A07.getResources(), Integer.valueOf(list.size()), 2131953291);
                    C14360o3.A07(A0r);
                    A00(A0r, null);
                    ArrayList A0q = AbstractC167017dG.A0q(list);
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        C32069E6v.A01(A0q, it2);
                    }
                    addModel(new C51750MtZ((List) A0q, 0), this.A09);
                } else if (num == C05F.A0C) {
                    int size2 = list.size();
                    if (this.A0H) {
                        string = null;
                    } else {
                        string = this.A07.getString(2131955188);
                    }
                    Context context = this.A07;
                    String A0r2 = AbstractC166997dE.A0r(context.getResources(), Integer.valueOf(size2), 2131953291);
                    C14360o3.A07(A0r2);
                    A00(A0r2, string);
                    if (!this.A03) {
                        list = AbstractC001800i.A0d(list, 3);
                    }
                    Iterator it3 = list.iterator();
                    while (it3.hasNext()) {
                        C32069E6v.A00(this, it3);
                    }
                    if (!this.A03 && size2 > 3) {
                        addModel(new C38687GzS(new FHX(this), AbstractC166997dE.A0q(context.getResources(), 2131973198)), this.A0A);
                    }
                }
                this.A06 = true;
            }
            List<C32069E6v> list2 = this.A0E;
            if (AbstractC166987dD.A1b(list2)) {
                A00(AbstractC166997dE.A0p(this.A07, 2131974901), null);
                for (C32069E6v c32069E6v : list2) {
                    boolean z = this.A04;
                    User user = c32069E6v.A02;
                    boolean z2 = c32069E6v.A01;
                    C14360o3.A0B(user, 0);
                    addModel(new C32069E6v(user, z2, z), this.A08);
                }
                C31543DtT c31543DtT = this.A02;
                if (c31543DtT != null && AbstractC167007dF.A1W(c31543DtT.A00)) {
                    addModel(c31543DtT, this.A0M);
                }
            }
        }
        notifyDataSetChangedSmart();
    }
}
