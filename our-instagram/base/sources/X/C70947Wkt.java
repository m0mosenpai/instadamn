package X;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import com.facebook.R;
import com.google.common.collect.ImmutableSet;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.HashSet;

/* renamed from: X.Wkt, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70947Wkt implements InterfaceC58152PqH {
    public RunnableC36962GQf A00;
    public RunnableC56973PPo A01;
    public C38321qM A02;
    public final InterfaceC58140Pq5 A03;
    public final InterfaceC11380iw A04;
    public final UserSession A05;
    public final C67923V2n A06;
    public final OKY A07;
    public final boolean A08;
    public final Context A09;

    @Override // X.InterfaceC58152PqH
    public final void onDismiss() {
    }

    @Override // X.InterfaceC58152PqH
    public final void onShow() {
    }

    @Override // X.InterfaceC58152PqH
    public final /* synthetic */ void onTextClick(View view) {
    }

    public final void A00(C84923qg c84923qg) {
        int size;
        C67923V2n c67923V2n;
        HashSet hashSet;
        Integer num;
        if (c84923qg != null) {
            size = 1;
        } else {
            ImmutableSet A03 = ImmutableSet.A03(this.A06.A06.A00);
            C14360o3.A07(A03);
            size = A03.size();
        }
        C146106i8 c146106i8 = new C146106i8();
        Context context = this.A09;
        Resources resources = context.getResources();
        boolean z = this.A08;
        int i = R.plurals.x_comments_deleted;
        if (z) {
            i = R.plurals.x_replies_deleted;
        }
        c146106i8.A0D = AbstractC167017dG.A0k(resources, size, i);
        c146106i8.A0G = AbstractC166997dE.A0q(context.getResources(), 2131976066);
        c146106i8.A0A = this;
        c146106i8.A01();
        c146106i8.A06();
        AbstractC25233BEq.A1F(c146106i8);
        C38321qM c38321qM = this.A02;
        if (c84923qg != null) {
            if (c38321qM != null) {
                hashSet = new HashSet();
                hashSet.add(c84923qg);
                if (z) {
                    num = C05F.A0N;
                } else {
                    num = null;
                }
                c67923V2n = this.A06;
                c67923V2n.A06.A03.addAll(hashSet);
            } else {
                return;
            }
        } else {
            if (c38321qM == null) {
                return;
            }
            c67923V2n = this.A06;
            C70083W2b c70083W2b = c67923V2n.A06;
            X25 x25 = c70083W2b.A00;
            ImmutableSet A032 = ImmutableSet.A03(x25);
            C14360o3.A07(A032);
            hashSet = new HashSet(A032);
            if (z) {
                num = C05F.A0N;
            } else {
                num = null;
            }
            ImmutableSet A033 = ImmutableSet.A03(x25);
            C14360o3.A07(A033);
            c70083W2b.A03.addAll(A033);
            x25.clear();
        }
        this.A07.A01(C05F.A0C, num, hashSet);
        C38321qM c38321qM2 = this.A02;
        if (c38321qM2 != null) {
            this.A01 = C55217Oeg.A02(this.A03, this.A05, c38321qM2, hashSet);
        }
        C38321qM c38321qM3 = this.A02;
        if (c38321qM3 != null) {
            ArrayList arrayList = AbstractC47145Kse.A00;
            UserSession userSession = this.A05;
            this.A00 = C55217Oeg.A01(this.A03, userSession, c38321qM3, this.A04.getModuleName(), hashSet, AbstractC34043F0w.A00(userSession));
        }
        c67923V2n.A00();
    }

    @Override // X.InterfaceC58152PqH
    public final void onButtonClick(View view) {
        Integer num;
        if (this.A08) {
            num = C05F.A0N;
        } else {
            num = null;
        }
        if (this.A02 != null) {
            RunnableC36962GQf runnableC36962GQf = this.A00;
            if (runnableC36962GQf != null && !runnableC36962GQf.A01) {
                runnableC36962GQf.A00 = true;
                C55217Oeg.A00.removeCallbacks(runnableC36962GQf);
            }
            RunnableC56973PPo runnableC56973PPo = this.A01;
            if (runnableC56973PPo != null && !runnableC56973PPo.A00) {
                C55217Oeg.A00.removeCallbacks(runnableC56973PPo);
            }
            C67923V2n c67923V2n = this.A06;
            C70083W2b c70083W2b = c67923V2n.A06;
            java.util.Set set = c70083W2b.A03;
            ImmutableSet A03 = ImmutableSet.A03(set);
            C14360o3.A07(A03);
            X25 x25 = c70083W2b.A00;
            x25.addAll(A03);
            set.clear();
            OKY oky = this.A07;
            Integer num2 = C05F.A0N;
            ImmutableSet A032 = ImmutableSet.A03(x25);
            C14360o3.A07(A032);
            oky.A01(num2, num, A032);
            C38321qM c38321qM = this.A02;
            if (c38321qM != null) {
                ImmutableSet A033 = ImmutableSet.A03(x25);
                C14360o3.A07(A033);
                C55217Oeg.A07(this.A03, c38321qM, A033, true);
            }
            this.A00 = null;
            this.A01 = null;
            c67923V2n.A00();
        }
    }

    public C70947Wkt(Context context, InterfaceC58140Pq5 interfaceC58140Pq5, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C38321qM c38321qM, C67923V2n c67923V2n, String str, boolean z) {
        AbstractC43594JPz.A1P(userSession, c67923V2n);
        this.A09 = context;
        this.A05 = userSession;
        this.A02 = c38321qM;
        this.A06 = c67923V2n;
        this.A03 = interfaceC58140Pq5;
        this.A08 = z;
        this.A04 = interfaceC11380iw;
        this.A07 = new OKY(interfaceC11380iw, userSession, str);
    }
}
