package X;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.3B7, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3B7 {
    public Runnable A00;
    public final Activity A01;
    public final Handler A02 = new Handler(Looper.getMainLooper());
    public final UserSession A03;
    public final C69453Af A04;
    public final C69473Ah A05;
    public final AbstractC69533An A06;
    public final String A07;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [boolean, int] */
    private InterfaceC72953Ov A00() {
        Object A0W;
        AbstractC69533An abstractC69533An = this.A06;
        C69523Am c69523Am = (C69523Am) abstractC69533An;
        ?? A04 = c69523Am.A04();
        int i = A04;
        if (abstractC69533An instanceof C69523Am) {
            i = A04;
            if (c69523Am.A04()) {
                i = A04 - 1;
            }
        }
        RecyclerView recyclerView = this.A05.A03;
        if (recyclerView == 0) {
            A0W = null;
        } else {
            A0W = recyclerView.A0W(A04, false);
        }
        InterfaceC72953Ov interfaceC72953Ov = (InterfaceC72953Ov) A0W;
        List list = abstractC69533An.A04;
        if (!list.isEmpty()) {
            User A01 = C17060sy.A01.A01(this.A03);
            C1NB c1nb = ((C3G4) list.get(i)).A03.A0W;
            c1nb.getClass();
            if (A01.equals(c1nb.CDj()) && interfaceC72953Ov != null) {
                return interfaceC72953Ov;
            }
        }
        return null;
    }

    public static InterfaceC72953Ov A01(C3B7 c3b7, List list) {
        AbstractC69533An abstractC69533An = c3b7.A06;
        if (c3b7.A05.A0C.A03(list).contains(abstractC69533An.Bla(((C69523Am) abstractC69533An).A04() ? 1 : 0))) {
            return c3b7.A00();
        }
        return null;
    }

    public static void A03(C3B7 c3b7, List list) {
        ArrayList A03 = c3b7.A05.A0C.A03(list);
        if (C18U.A06(C06090Tz.A05, c3b7.A03, 36317491841340687L)) {
            c3b7.A02();
            return;
        }
        Iterator it = A03.iterator();
        while (it.hasNext()) {
            it.next();
            c3b7.A02();
        }
    }

    public C3B7(Activity activity, UserSession userSession, C69453Af c69453Af, C69473Ah c69473Ah, String str) {
        this.A01 = activity;
        this.A03 = userSession;
        this.A06 = c69473Ah.A0C;
        this.A05 = c69473Ah;
        this.A04 = c69453Af;
        this.A07 = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void A02() {
        InterfaceC72953Ov A00 = A00();
        if (A00 != 0) {
            boolean A04 = ((C69523Am) this.A06).A04();
            VSN.A00(A00.AeT()).A00(4.0f);
            C69473Ah c69473Ah = this.A05;
            Reel A01 = c69473Ah.A01(A00.BlW());
            A01.getClass();
            AbstractC34289FAj.A00(this.A03, A01, A00, 0L);
            C3OO c3oo = (C3OO) A00;
            C14360o3.A0B(c3oo, 0);
            c69473Ah.A0C.bindViewHolder(c3oo, A04 ? 1 : 0);
        }
    }
}
