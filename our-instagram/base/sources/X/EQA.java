package X;

import android.content.Context;
import android.text.SpannableString;
import android.view.View;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes6.dex */
public final class EQA extends C2US implements InterfaceC37163GZa {
    public int A00;
    public C1571273r A01;
    public final int A02;
    public final C34531FJr A03;
    public final C168737g7 A04;
    public final C31545DtV A05;
    public final ERQ A06;
    public final C31699Dw4 A07;
    public final C34707FQs A08;
    public final C31566Dts A09;
    public final String A0A;
    public final String A0B;
    public final FF0 A0C;
    public final ERY A0D;
    public final C8SI A0E;
    public final C152996uT A0F;
    public final C31544DtU A0G;
    public final C35246Fgf A0H;
    public final Integer A0I;
    public final String A0J;

    public final void A02(String str, List list, List list2, boolean z) {
        C14360o3.A0B(list, 0);
        clear();
        this.A00 = 0;
        if (!list.isEmpty()) {
            int i = 2131962227;
            if (this.A0I == C05F.A01) {
                i = 2131956264;
            }
            String str2 = this.A0J;
            C31335Dq0 A00 = C31335Dq0.A00(i);
            if (str2 != null) {
                A00.A0G = str2;
                addModel(A00, this.A09);
            } else {
                addModel(A00, this.A03, this.A04);
            }
            this.A00++;
            if (z) {
                addModel(this.A0H, this.A0G);
                this.A00++;
            }
            A00(this, str, list);
        }
        if (!list2.isEmpty()) {
            addModel(C31335Dq0.A00(2131956275), this.A03, this.A04);
            this.A00++;
            A00(this, null, list2);
        }
        notifyDataSetChanged();
    }

    @Override // X.InterfaceC37163GZa
    public final void CzA() {
    }

    @Override // X.InterfaceC37163GZa
    public final void DPD() {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, X.FQs] */
    /* JADX WARN: Type inference failed for: r0v14, types: [X.FJr, java.lang.Object] */
    public EQA(Context context, C35210Fg2 c35210Fg2, InterfaceC11380iw interfaceC11380iw, UserSession userSession, GYQ gyq, Integer num) {
        super(false);
        boolean A1V = AbstractC167007dF.A1V(userSession);
        this.A0I = num;
        C35246Fgf c35246Fgf = new C35246Fgf(2131962468);
        this.A0H = c35246Fgf;
        this.A0A = AbstractC166997dE.A0p(context, 2131968660);
        this.A0B = AbstractC166997dE.A0p(context, 2131973064);
        this.A02 = AbstractC31174DnI.A03(context);
        this.A0E = new C8SI(7L);
        this.A0J = AbstractC166997dE.A0p(context, 2131972177);
        c35246Fgf.A01 = R.style.PrivacyTextStyle;
        ERY ery = new ERY(c35210Fg2, interfaceC11380iw, num);
        this.A0D = ery;
        C168737g7 c168737g7 = new C168737g7(context);
        this.A04 = c168737g7;
        C31544DtU c31544DtU = new C31544DtU(context);
        this.A0G = c31544DtU;
        C31545DtV c31545DtV = new C31545DtV(context);
        this.A05 = c31545DtV;
        C31566Dts c31566Dts = new C31566Dts(context, gyq);
        this.A09 = c31566Dts;
        ERQ erq = new ERQ(context, C36738GHh.A00);
        this.A06 = erq;
        this.A08 = new Object();
        this.A07 = new C31699Dw4();
        ?? obj = new Object();
        this.A03 = obj;
        obj.A00 = A1V;
        C152996uT c152996uT = new C152996uT(context);
        this.A0F = c152996uT;
        this.A01 = new C1571273r();
        this.A0C = new FF0(context);
        init(ery, c168737g7, c31544DtU, c31545DtV, erq, c152996uT, c31566Dts);
    }

    public static final void A00(EQA eqa, String str, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C34710FQv c34710FQv = (C34710FQv) it.next();
            int i = eqa.A00;
            String str2 = null;
            if (c34710FQv.A00) {
                str2 = str;
            }
            eqa.addModel(c34710FQv, new FIL(i, str2), eqa.A0D);
            eqa.A00++;
        }
    }

    public final void A01(Context context, View.OnClickListener onClickListener, EnumC153216up enumC153216up) {
        clear();
        FF0 ff0 = this.A0C;
        C1571273r c1571273r = new C1571273r();
        c1571273r.A00 = ff0.A00;
        if (enumC153216up.ordinal() != 2) {
            c1571273r.A05 = onClickListener;
            StringBuilder A1C = AbstractC166987dD.A1C();
            String A0p = AbstractC166997dE.A0p(context, 2131972568);
            String string = context.getString(2131956273);
            A1C.append(string);
            A1C.append(" ");
            A1C.append(A0p);
            SpannableString spannableString = new SpannableString(AnonymousClass001.A0g(string, " ", A0p));
            AbstractC31178DnM.A0u(spannableString, new AnonymousClass772(Integer.valueOf(AbstractC31174DnI.A02(context))), A0p, A1C.lastIndexOf(A0p));
            c1571273r.A07 = spannableString;
        }
        this.A01 = c1571273r;
        addModel(c1571273r, enumC153216up, this.A0F);
        notifyDataSetChanged();
    }

    @Override // X.C2US, X.C2UT, X.C2UU, android.widget.Adapter
    public final long getItemId(int i) {
        IllegalStateException A14;
        int i2;
        long A00;
        int i3;
        int A03 = C0f9.A03(1564027109);
        Object item = getItem(i);
        if (C14360o3.A0K(this.A0A, item)) {
            A00 = 0;
        } else if (C14360o3.A0K(this.A07, item)) {
            A00 = 1;
        } else {
            if (item instanceof C31335Dq0) {
                int i4 = ((C31335Dq0) item).A05;
                if (i4 == 2131956264) {
                    A00 = 2;
                    i3 = -749095659;
                } else if (i4 == 2131962227) {
                    A00 = 3;
                    i3 = 1644855038;
                } else if (i4 == 2131956275) {
                    A00 = 4;
                    i3 = 2140782070;
                } else {
                    A14 = AbstractC166987dD.A14("unexpected header string resource");
                    i2 = -1926575444;
                }
                C0f9.A0A(i3, A03);
                return A00;
            }
            if (item instanceof C35246Fgf) {
                A00 = 5;
            } else if (C14360o3.A0K(item, this.A01)) {
                A00 = 6;
            } else if (item instanceof C34710FQv) {
                A00 = this.A0E.A00(((C34710FQv) item).A01.getId());
            } else {
                A14 = AbstractC166987dD.A14("unexpected model type");
                i2 = 469264240;
            }
            C0f9.A0A(i2, A03);
            throw A14;
        }
        i3 = -1220195156;
        C0f9.A0A(i3, A03);
        return A00;
    }

    @Override // X.InterfaceC37163GZa
    public final void DPE(int i) {
        notifyItemChanged(i);
    }
}
