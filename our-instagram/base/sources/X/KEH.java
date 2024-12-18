package X;

import android.content.Context;
import com.google.gson.Gson;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes8.dex */
public final class KEH extends C2US implements InterfaceC65242xM {
    public boolean A00;
    public boolean A01;
    public boolean A02;
    public long A03;
    public final Context A04;
    public final UserSession A05;
    public final KEQ A06;
    public final KER A07;
    public final C32473ERz A08;
    public final ArrayList A09;
    public final ArrayList A0A;
    public final ArrayList A0B;
    public final ArrayList A0C;
    public final ArrayList A0D;
    public final ArrayList A0E;
    public final List A0F;
    public final boolean A0G;
    public final boolean A0H;
    public final C1810981l A0I;
    public final KEW A0J;
    public final MOQ A0K;
    public final boolean A0L;

    public KEH(Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C1810981l c1810981l, InterfaceC150196pR interfaceC150196pR, MOQ moq, InterfaceC16660sJ interfaceC16660sJ, boolean z, boolean z2) {
        ArrayList A1E;
        C14360o3.A0B(context, 1);
        this.A04 = context;
        this.A05 = userSession;
        this.A0K = moq;
        this.A0L = z;
        this.A0H = z2;
        this.A0I = c1810981l;
        KEQ keq = new KEQ(context, new C50156MDj(this, 49), new BAO(22, interfaceC16660sJ, this));
        this.A06 = keq;
        KER ker = new KER(context, null);
        this.A07 = ker;
        KEW kew = new KEW(context, interfaceC11380iw, userSession, c1810981l, interfaceC150196pR, null, false, false);
        this.A0J = kew;
        C32473ERz c32473ERz = new C32473ERz(context, AbstractC25227BEk.A0o());
        this.A08 = c32473ERz;
        this.A0D = AbstractC166987dD.A1E();
        this.A0E = AbstractC166987dD.A1E();
        this.A0B = AbstractC166987dD.A1E();
        this.A0C = AbstractC166987dD.A1E();
        this.A09 = AbstractC166987dD.A1E();
        this.A0A = AbstractC166987dD.A1E();
        this.A0G = AbstractC166987dD.A10(userSession).A2I();
        C23031Ai A00 = AbstractC23021Ah.A00(userSession);
        Collection collection = (Collection) new Gson().A07(new RW2(), A00.A01.getString("sticker_tray_search_history", null));
        if (collection != null) {
            A1E = AbstractC166987dD.A1F(collection);
        } else {
            A1E = AbstractC166987dD.A1E();
        }
        this.A0F = A1E;
        this.A03 = -1L;
        init(kew, keq, ker, c32473ERz);
    }

    public static void A00(Context context, KEH keh, int i) {
        String string = context.getString(i);
        C14360o3.A07(string);
        keh.addModel(new C45127Jxw((C45127Jxw) null, string), keh.A07);
    }

    public final void A03() {
        this.A01 = false;
        this.A0E.clear();
        this.A0C.clear();
        this.A09.clear();
        A01(this);
    }

    public final void A04(String str, long j) {
        String str2;
        List list = this.A0F;
        if (!list.remove(str) && j - this.A03 < 1000 && (str2 = (String) AbstractC001800i.A0J(list)) != null && (AbstractC13670mt.A0H(str, str2) || AbstractC13670mt.A0H(str2, str))) {
            list.remove(str2);
        }
        list.add(0, str);
        if (list.size() > 20) {
            AnonymousClass016.A15(list);
        }
        AbstractC23021Ah.A00(this.A05).A18(list);
        this.A03 = System.currentTimeMillis();
        A01(this);
    }

    public final void A05(List list) {
        this.A01 = true;
        ArrayList arrayList = this.A0B;
        arrayList.clear();
        ArrayList arrayList2 = this.A0E;
        arrayList2.clear();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            InterfaceC148316m1 interfaceC148316m1 = (InterfaceC148316m1) it.next();
            int ordinal = interfaceC148316m1.CBc().ordinal();
            if (ordinal != 1) {
                if (ordinal == 0) {
                    arrayList2.add(interfaceC148316m1);
                }
            } else {
                arrayList.add(interfaceC148316m1);
            }
        }
        A01(this);
    }

    private final void A02(List list) {
        int i;
        Integer Acu = this.A0K.Acu();
        int i2 = 3;
        if (Acu.intValue() != 2) {
            i2 = 4;
        }
        if (Acu != C05F.A0Y && Acu != C05F.A0j) {
            i = Integer.MAX_VALUE;
        } else {
            UserSession userSession = this.A05;
            i = 44;
            if (C18U.A06(AbstractC166997dE.A0U(userSession), userSession, 36323741013192254L)) {
                i = 88;
            }
        }
        for (int i3 = 0; i3 < list.size() && i3 <= i; i3 += i2) {
            addModel(new C47537Kz4(new C153126ug(list, i3, i2), i2), null, this.A0J);
        }
    }

    @Override // X.InterfaceC65242xM
    public final /* bridge */ /* synthetic */ Object getAdapter() {
        return this;
    }

    public static final void A01(KEH keh) {
        C45127Jxw c45127Jxw;
        ArrayList arrayList;
        Object c45127Jxw2;
        keh.clear();
        UserSession userSession = keh.A05;
        C06090Tz A0U = AbstractC166997dE.A0U(userSession);
        if (C18U.A06(A0U, userSession, 36323741013192254L)) {
            keh.addModel(new C51756Mtf(keh.A0F, 33), keh.A06);
        }
        Integer Acu = keh.A0K.Acu();
        switch (Acu.intValue()) {
            case 2:
                c45127Jxw = null;
                if (!keh.A01 || !keh.A0C.isEmpty()) {
                    arrayList = keh.A0C;
                    if (AbstractC25226BEj.A1b(arrayList)) {
                        if (keh.A02) {
                            A00(keh.A04, keh, 2131975741);
                        }
                        keh.A02(arrayList);
                        break;
                    }
                }
                c45127Jxw2 = new C45127Jxw(c45127Jxw, AbstractC166997dE.A0p(keh.A04, 2131968594));
                keh.addModel(c45127Jxw2, keh.A07);
                break;
            case 3:
                c45127Jxw = null;
                if (keh.A01) {
                    ArrayList arrayList2 = keh.A0E;
                    if (!arrayList2.isEmpty() || !keh.A0B.isEmpty()) {
                        keh.A02(arrayList2);
                        arrayList = keh.A0B;
                    }
                    c45127Jxw2 = new C45127Jxw(c45127Jxw, AbstractC166997dE.A0p(keh.A04, 2131968594));
                    keh.addModel(c45127Jxw2, keh.A07);
                    break;
                } else {
                    ArrayList arrayList3 = keh.A0D;
                    if (AbstractC25226BEj.A1b(arrayList3)) {
                        A00(keh.A04, keh, 2131971550);
                        keh.A02(arrayList3);
                    }
                    if (keh.A0G && keh.A0H) {
                        arrayList = keh.A0A;
                        if (AbstractC25226BEj.A1b(arrayList) && C18U.A06(A0U, userSession, 36319115333409732L)) {
                            A00(keh.A04, keh, 2131954070);
                        }
                    }
                }
                keh.A02(arrayList);
                break;
            case 4:
            case 5:
                if (keh.A01) {
                    ArrayList arrayList4 = keh.A0E;
                    if (arrayList4.isEmpty() && keh.A0C.isEmpty() && keh.A0B.isEmpty() && ((Acu != C05F.A0j || keh.A09.isEmpty()) && !keh.A00)) {
                        c45127Jxw2 = new C45127Jxw((C45127Jxw) null, AbstractC166997dE.A0p(keh.A04, 2131968594));
                        keh.addModel(c45127Jxw2, keh.A07);
                        break;
                    } else {
                        if (AbstractC25226BEj.A1b(arrayList4)) {
                            A00(keh.A04, keh, 2131974424);
                            keh.A02(arrayList4);
                        }
                        if (Acu == C05F.A0j) {
                            ArrayList arrayList5 = keh.A09;
                            if (AbstractC25226BEj.A1b(arrayList5)) {
                                A00(keh.A04, keh, 2131953571);
                                keh.A02(arrayList5);
                            }
                        }
                        ArrayList arrayList6 = keh.A0B;
                        if (AbstractC25226BEj.A1b(arrayList6)) {
                            A00(keh.A04, keh, 2131961743);
                            keh.A02(arrayList6);
                        }
                        arrayList = keh.A0C;
                        if (AbstractC25226BEj.A1b(arrayList)) {
                            A00(keh.A04, keh, 2131963256);
                            keh.A02(arrayList);
                            break;
                        } else if (keh.A00) {
                            A00(keh.A04, keh, 2131963256);
                            keh.addModel(null, keh.A08);
                            break;
                        }
                    }
                } else {
                    ArrayList arrayList7 = keh.A0D;
                    if (AbstractC25226BEj.A1b(arrayList7)) {
                        A00(keh.A04, keh, 2131971550);
                        keh.A02(arrayList7);
                    }
                    if (keh.A0G && keh.A0H) {
                        ArrayList arrayList8 = keh.A0A;
                        if (AbstractC25226BEj.A1b(arrayList8) && C18U.A06(A0U, userSession, 36319115333409732L)) {
                            A00(keh.A04, keh, 2131954070);
                            keh.A02(arrayList8);
                        }
                    }
                    ArrayList arrayList9 = keh.A09;
                    if (AbstractC25226BEj.A1b(arrayList9)) {
                        A00(keh.A04, keh, 2131975740);
                        keh.A02(arrayList9);
                    }
                    arrayList = keh.A0C;
                    if (AbstractC25226BEj.A1b(arrayList)) {
                        A00(keh.A04, keh, 2131975739);
                        keh.A02(arrayList);
                    } else if (keh.A00) {
                        A00(keh.A04, keh, 2131975739);
                        keh.addModel(null, keh.A08);
                        break;
                    }
                }
                break;
            case 6:
                if (keh.A01) {
                    ArrayList arrayList10 = keh.A0E;
                    if (arrayList10.isEmpty() && keh.A0C.isEmpty() && keh.A0B.isEmpty()) {
                        c45127Jxw2 = new C45127Jxw((C45127Jxw) null, AbstractC166997dE.A0p(keh.A04, 2131968594));
                        keh.addModel(c45127Jxw2, keh.A07);
                        break;
                    } else {
                        if (AbstractC25226BEj.A1b(arrayList10)) {
                            A00(keh.A04, keh, 2131974424);
                            keh.A02(arrayList10);
                        }
                        ArrayList arrayList11 = keh.A0B;
                        if (AbstractC25226BEj.A1b(arrayList11)) {
                            A00(keh.A04, keh, 2131961743);
                            keh.A02(arrayList11);
                        }
                        arrayList = keh.A0C;
                        if (AbstractC25226BEj.A1b(arrayList)) {
                            A00(keh.A04, keh, 2131963256);
                            keh.A02(arrayList);
                            break;
                        }
                    }
                } else {
                    ArrayList arrayList12 = keh.A0D;
                    if (AbstractC25226BEj.A1b(arrayList12)) {
                        A00(keh.A04, keh, 2131971550);
                        keh.A02(arrayList12);
                    }
                    if (keh.A0G && keh.A0H) {
                        ArrayList arrayList13 = keh.A0A;
                        if (AbstractC25226BEj.A1b(arrayList13) && C18U.A06(A0U, userSession, 36319115333409732L)) {
                            A00(keh.A04, keh, 2131954070);
                            keh.A02(arrayList13);
                        }
                    }
                    arrayList = keh.A0C;
                    if (AbstractC25226BEj.A1b(arrayList)) {
                        A00(keh.A04, keh, 2131975739);
                        keh.A02(arrayList);
                    }
                }
                break;
            case 7:
                if (keh.A01) {
                    ArrayList arrayList14 = keh.A0E;
                    if (arrayList14.isEmpty() && keh.A0B.isEmpty()) {
                        c45127Jxw2 = new C45127Jxw((C45127Jxw) null, AbstractC166997dE.A0p(keh.A04, 2131968594));
                        keh.addModel(c45127Jxw2, keh.A07);
                        break;
                    } else {
                        if (AbstractC25226BEj.A1b(arrayList14)) {
                            A00(keh.A04, keh, 2131974424);
                            keh.A02(arrayList14);
                        }
                        arrayList = keh.A0B;
                        if (AbstractC25226BEj.A1b(arrayList)) {
                            A00(keh.A04, keh, 2131961743);
                            keh.A02(arrayList);
                            break;
                        }
                    }
                } else {
                    ArrayList arrayList15 = keh.A0D;
                    if (AbstractC25226BEj.A1b(arrayList15)) {
                        A00(keh.A04, keh, 2131971550);
                        keh.A02(arrayList15);
                    }
                    if (keh.A0G && keh.A0H) {
                        arrayList = keh.A0A;
                        if (AbstractC25226BEj.A1b(arrayList) && C18U.A06(A0U, userSession, 36319115333409732L)) {
                            A00(keh.A04, keh, 2131954070);
                            keh.A02(arrayList);
                        }
                    }
                }
                break;
        }
        if (keh.A0L) {
            keh.notifyDataSetChangedSmart();
        } else {
            keh.updateListView();
        }
    }
}
