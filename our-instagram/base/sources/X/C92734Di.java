package X;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.4Di, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C92734Di extends AbstractC92744Dj {
    public int A00;
    public final RecyclerView A01;
    public final InterfaceC69543Ao A02;
    public final String A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C92734Di(RecyclerView recyclerView, InterfaceC11380iw interfaceC11380iw, UserSession userSession, final C92724Dh c92724Dh, String str) {
        super(interfaceC11380iw, userSession);
        C14360o3.A0B(interfaceC11380iw, 4);
        this.A01 = recyclerView;
        this.A03 = str;
        this.A02 = (InterfaceC69543Ao) recyclerView.A0A;
        recyclerView.A14(new C1I4() { // from class: X.4Dk
            @Override // X.C1I4
            public final void onScrollStateChanged(RecyclerView recyclerView2, int i) {
                int A03 = C0f9.A03(982493728);
                C92734Di c92734Di = C92734Di.this;
                c92734Di.A00 = i;
                C92734Di.A00(c92734Di, c92724Dh);
                C0f9.A0A(1614750045, A03);
            }

            @Override // X.C1I4
            public final void onScrolled(RecyclerView recyclerView2, int i, int i2) {
                int A03 = C0f9.A03(-562912238);
                C92734Di.A00(C92734Di.this, c92724Dh);
                C0f9.A0A(585624219, A03);
            }
        });
    }

    public static final void A00(C92734Di c92734Di, C92724Dh c92724Dh) {
        int i;
        int itemCount;
        RecyclerView recyclerView = c92734Di.A01;
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerView.A0D;
        int i2 = -1;
        if (linearLayoutManager != null) {
            i = linearLayoutManager.A1a() - 4;
        } else {
            i = -1;
        }
        int max = Math.max(0, i);
        C2UU c2uu = recyclerView.A0A;
        if (c2uu == null) {
            itemCount = -1;
        } else {
            itemCount = c2uu.getItemCount() - 1;
        }
        if (linearLayoutManager != null) {
            i2 = linearLayoutManager.A1b() + 4;
        }
        int min = Math.min(itemCount, i2);
        InterfaceC69543Ao interfaceC69543Ao = c92734Di.A02;
        if (interfaceC69543Ao != null) {
            String str = c92734Di.A03;
            if (max >= 0 && max <= min) {
                C17u c17u = new C17u(max, min);
                ArrayList arrayList = new ArrayList();
                Iterator it = c17u.iterator();
                while (it.hasNext()) {
                    Object Bla = interfaceC69543Ao.Bla(((AbstractC16880sg) it).A00());
                    if ((Bla instanceof Reel) && Bla != null) {
                        arrayList.add(Bla);
                    }
                }
                if (!arrayList.isEmpty()) {
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        Object next = it2.next();
                        Reel reel = (Reel) next;
                        if (!reel.A0z(((AbstractC92744Dj) c92734Di).A02) && !reel.A1P) {
                            arrayList2.add(next);
                        }
                    }
                    Iterator it3 = arrayList2.iterator();
                    while (it3.hasNext()) {
                        String id = ((Reel) it3.next()).getId();
                        C14360o3.A07(id);
                        java.util.Set set = c92734Di.A05;
                        if (!set.contains(id) && !c92734Di.A04.contains(id)) {
                            set.add(id);
                            c92734Di.A06.push(id);
                        }
                    }
                    AbstractC92744Dj.A01(c92734Di, c92724Dh, str);
                    return;
                }
                return;
            }
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }
}
