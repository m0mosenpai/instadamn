package X;

import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.ESh, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32481ESh extends C1P1 {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C123545iT A01;
    public final /* synthetic */ C63672uo A02;
    public final /* synthetic */ User A03;

    public C32481ESh(C123545iT c123545iT, C63672uo c63672uo, User user, int i) {
        this.A02 = c63672uo;
        this.A03 = user;
        this.A01 = c123545iT;
        this.A00 = i;
    }

    /* JADX WARN: Type inference failed for: r1v13, types: [java.lang.Object, X.47L] */
    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int i;
        C47R c47r;
        String str;
        String str2;
        List list;
        C47L A02;
        C47O A00;
        C47L A022;
        List list2;
        C47R c47r2;
        String str3;
        String str4;
        C47L A023;
        C47O A002;
        C47L A024;
        int A03 = C0f9.A03(-1533703717);
        C168027ex c168027ex = (C168027ex) obj;
        int A032 = C0f9.A03(-1415259674);
        C14360o3.A0B(c168027ex, 0);
        super.onSuccess(c168027ex);
        ArrayList A1E = AbstractC166987dD.A1E();
        Iterator it = C152576tk.A00(this.A02.A03, c168027ex.getItems()).iterator();
        while (it.hasNext()) {
            User A15 = AbstractC25226BEj.A15(it);
            C47O c47o = new C47O(null);
            C14360o3.A0B(A15, 0);
            c47o.A03 = A15;
            User user = this.A03;
            c47o.A06 = user.getId();
            c47o.A05 = user.B8y();
            c47o.A00 = user.Bhu();
            ?? obj2 = new Object();
            obj2.A08 = c47o.A0F;
            obj2.A01();
            A1E.add(obj2);
        }
        C123545iT c123545iT = this.A01;
        int i2 = this.A00;
        if (AbstractC25226BEj.A1b(A1E)) {
            C47K c47k = c123545iT.A03;
            if (c47k != null) {
                ArrayList A1E2 = AbstractC166987dD.A1E();
                Iterator it2 = A1E.iterator();
                while (it2.hasNext()) {
                    C47L c47l = (C47L) it2.next();
                    int i3 = i2 + 1;
                    int i4 = 0;
                    while (true) {
                        if (i4 < i3) {
                            C47K c47k2 = c123545iT.A03;
                            if (c47k2 != null && (A024 = c47k2.A02(i4)) != null) {
                                c47r2 = A024.A07;
                            } else {
                                c47r2 = null;
                            }
                            if (c47r2 == C47R.A0A) {
                                C47O A003 = c47l.A00();
                                if (A003 != null) {
                                    str3 = A003.getId();
                                } else {
                                    str3 = null;
                                }
                                C47K c47k3 = c123545iT.A03;
                                if (c47k3 != null && (A023 = c47k3.A02(i4)) != null && (A002 = A023.A00()) != null) {
                                    str4 = A002.getId();
                                } else {
                                    str4 = null;
                                }
                                if (C14360o3.A0K(str3, str4)) {
                                    break;
                                }
                            }
                            i4++;
                        } else {
                            A1E2.add(c47l);
                            break;
                        }
                    }
                }
                Iterator it3 = A1E2.iterator();
                while (it3.hasNext()) {
                    C47L c47l2 = (C47L) it3.next();
                    int i5 = i2 + 1;
                    while (true) {
                        C47K c47k4 = c123545iT.A03;
                        if (c47k4 != null && (list2 = c47k4.A0P) != null) {
                            i = list2.size();
                        } else {
                            i = 0;
                        }
                        if (i5 < i) {
                            C47K c47k5 = c123545iT.A03;
                            if (c47k5 != null && (A022 = c47k5.A02(i5)) != null) {
                                c47r = A022.A07;
                            } else {
                                c47r = null;
                            }
                            if (c47r == C47R.A0A) {
                                C47O A004 = c47l2.A00();
                                if (A004 != null) {
                                    str = A004.getId();
                                } else {
                                    str = null;
                                }
                                C47K c47k6 = c123545iT.A03;
                                if (c47k6 != null && (A02 = c47k6.A02(i5)) != null && (A00 = A02.A00()) != null) {
                                    str2 = A00.getId();
                                } else {
                                    str2 = null;
                                }
                                if (C14360o3.A0K(str, str2)) {
                                    C47K c47k7 = c123545iT.A03;
                                    if (c47k7 != null && (list = c47k7.A0P) != null) {
                                        list.remove(i5);
                                    }
                                    i5--;
                                }
                            }
                            i5++;
                        }
                    }
                }
                int i6 = i2 + 1;
                List list3 = c47k.A0P;
                if (list3 != null) {
                    list3.addAll(i6, A1E2);
                }
            }
            c123545iT.notifyItemRangeInserted(i2 + 1, A1E.size());
        } else {
            c123545iT.A0I.run();
        }
        C0f9.A0A(-1294365434, A032);
        C0f9.A0A(1955479476, A03);
    }
}
