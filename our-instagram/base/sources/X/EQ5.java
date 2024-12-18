package X;

import android.content.Context;
import android.os.Handler;
import com.instagram.user.model.User;
import java.util.List;
import java.util.Map;

/* loaded from: classes6.dex */
public final class EQ5 extends C2US {
    public boolean A00;
    public boolean A01;
    public final Handler A02;
    public final ELQ A03;
    public final Runnable A04;
    public final List A05;
    public final List A06;
    public final Map A07;
    public final Map A08;
    public final C8SI A09;
    public final ERM A0A;
    public final C31545DtV A0B;
    public final String A0C;

    public EQ5(Context context, InterfaceC11380iw interfaceC11380iw, ELQ elq) {
        super(false);
        this.A06 = AbstractC166987dD.A1E();
        this.A07 = AbstractC166987dD.A1G();
        this.A05 = AbstractC166987dD.A1E();
        this.A08 = AbstractC166987dD.A1G();
        this.A09 = new C8SI(1L);
        this.A02 = new Handler();
        this.A04 = new Runnable() { // from class: X.GMQ
            @Override // java.lang.Runnable
            public final void run() {
                EQ5.A00(EQ5.this);
            }
        };
        this.A00 = false;
        this.A01 = true;
        this.A03 = elq;
        this.A0C = context.getResources().getString(2131968660);
        ERM erm = new ERM(interfaceC11380iw, this);
        this.A0A = erm;
        C31545DtV c31545DtV = new C31545DtV(context);
        this.A0B = c31545DtV;
        init(erm, c31545DtV);
    }

    public static void A00(EQ5 eq5) {
        boolean contains;
        List list;
        boolean contains2;
        eq5.clear();
        if (!eq5.A00 && eq5.A06.isEmpty() && eq5.A05.isEmpty()) {
            eq5.addModel(eq5.A0C, eq5.A0B);
        } else {
            int i = 0;
            if (!eq5.A01) {
                while (true) {
                    List list2 = eq5.A06;
                    if (i >= list2.size()) {
                        break;
                    }
                    User user = (User) list2.get(i);
                    if (user != null) {
                        Map map = eq5.A08;
                        C34516FJc c34516FJc = (C34516FJc) map.get(user);
                        if (c34516FJc == null) {
                            c34516FJc = new C34516FJc(user);
                            map.put(user, c34516FJc);
                        }
                        Map map2 = eq5.A07;
                        if (map2.containsKey(user)) {
                            contains = AbstractC166987dD.A1a(map2.get(user));
                        } else {
                            contains = eq5.A05.contains(user);
                        }
                        c34516FJc.A00 = contains;
                        eq5.addModel(c34516FJc, eq5.A0A);
                    }
                    i++;
                }
            } else {
                int i2 = 0;
                while (true) {
                    list = eq5.A05;
                    if (i2 >= list.size()) {
                        break;
                    }
                    User user2 = (User) list.get(i2);
                    if (user2 != null) {
                        Map map3 = eq5.A08;
                        C34516FJc c34516FJc2 = (C34516FJc) map3.get(user2);
                        if (c34516FJc2 == null) {
                            c34516FJc2 = new C34516FJc(user2);
                            map3.put(user2, c34516FJc2);
                        }
                        c34516FJc2.A00 = true;
                        eq5.addModel(c34516FJc2, eq5.A0A);
                    }
                    i2++;
                }
                while (true) {
                    List list3 = eq5.A06;
                    if (i >= list3.size()) {
                        break;
                    }
                    User user3 = (User) list3.get(i);
                    if (user3 != null && !list.contains(user3)) {
                        Map map4 = eq5.A08;
                        C34516FJc c34516FJc3 = (C34516FJc) map4.get(user3);
                        if (c34516FJc3 == null) {
                            c34516FJc3 = new C34516FJc(user3);
                            map4.put(user3, c34516FJc3);
                        }
                        Map map5 = eq5.A07;
                        if (map5.containsKey(user3)) {
                            contains2 = AbstractC166987dD.A1a(map5.get(user3));
                        } else {
                            contains2 = list.contains(user3);
                        }
                        c34516FJc3.A00 = contains2;
                        eq5.addModel(c34516FJc3, eq5.A0A);
                    }
                    i++;
                }
            }
        }
        eq5.notifyDataSetChanged();
    }

    @Override // X.C2US, X.C2UT, X.C2UU, android.widget.Adapter
    public final long getItemId(int i) {
        long A00;
        int i2;
        int A03 = C0f9.A03(-1323814876);
        Object item = getItem(i);
        if (this.A0C.equals(item)) {
            A00 = 0;
            i2 = 1284517121;
        } else if (item instanceof C34516FJc) {
            A00 = this.A09.A00(((C34516FJc) item).A01.getId());
            i2 = 1423887594;
        } else {
            IllegalStateException A14 = AbstractC166987dD.A14("unexpected model type");
            C0f9.A0A(458595055, A03);
            throw A14;
        }
        C0f9.A0A(i2, A03);
        return A00;
    }
}
