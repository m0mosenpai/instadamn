package X;

import android.content.Context;
import android.database.DataSetObserver;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.JZx, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43834JZx implements InterfaceC195528ks {
    public InterfaceC16660sJ A00;
    public DataSetObserver A01;
    public final Context A02;
    public final C9BW A03;
    public final InterfaceC11380iw A04;
    public final C189038Yt A05;
    public final C8SF A06;
    public final C66362zD A07;
    public final UserSession A08;
    public final C43835JZy A09;
    public final C43858JaO A0A;
    public final boolean A0B;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v5, types: [X.2zJ, java.lang.Object] */
    public C43834JZx(Context context, C9BW c9bw, InterfaceC11380iw interfaceC11380iw, C189038Yt c189038Yt, C8SF c8sf, UserSession userSession, C43835JZy c43835JZy, C43858JaO c43858JaO, boolean z) {
        C9BW c9bw2;
        AbstractC66422zJ c44050Jdb;
        this.A09 = c43835JZy;
        this.A03 = c9bw;
        this.A0B = z;
        this.A06 = c8sf;
        this.A05 = c189038Yt;
        this.A0A = c43858JaO;
        this.A08 = userSession;
        this.A02 = context;
        this.A04 = interfaceC11380iw;
        if (C18U.A06(C06090Tz.A05, userSession, 36321022299153461L)) {
            C43886Jat c43886Jat = new C43886Jat(this);
            c9bw2 = this.A03;
            c44050Jdb = new C195568kw(c9bw2, null, this.A06, userSession, c43886Jat, null, C208519Kl.A00);
        } else {
            C8SF c8sf2 = this.A06;
            c9bw2 = this.A03;
            C206279Bk c206279Bk = (C206279Bk) c9bw2.A01;
            C43858JaO c43858JaO2 = this.A0A;
            c44050Jdb = new C44050Jdb(c206279Bk, c8sf2, userSession, AbstractC43592JPx.A18(c43858JaO2, 10), AbstractC43592JPx.A18(c43858JaO2, 11));
        }
        Context context2 = this.A02;
        C66392zG A00 = C66362zD.A00(context2);
        A00.A01(c44050Jdb);
        C206279Bk c206279Bk2 = (C206279Bk) c9bw2.A01;
        C189038Yt c189038Yt2 = this.A05;
        C43858JaO c43858JaO3 = this.A0A;
        A00.A01(new C43860JaQ(c206279Bk2, c189038Yt2, userSession, AbstractC43592JPx.A18(c43858JaO3, 4), AbstractC43592JPx.A18(c43858JaO3, 5)));
        C9BW c9bw3 = c9bw2;
        A00.A01(new C195588ky(c9bw3, this.A04, userSession, new C43859JaP(this), C43883Jan.A00));
        A00.A01(new C43862JaS(c206279Bk2, userSession, AbstractC43592JPx.A18(c43858JaO3, 6), AbstractC43592JPx.A18(c43858JaO3, 7), this.A00, new C43887Jau(c43858JaO3, 2)));
        A00.A01(new C43863JaT(c206279Bk2, AbstractC43592JPx.A18(c43858JaO3, 8), AbstractC43592JPx.A18(c43858JaO3, 9)));
        A00.A01(new C43861JaR(new C43888Jav(c43858JaO3, 2)));
        A00.A01(new C43864JaU(userSession, context2));
        A00.A01(new C43865JaV(userSession, this.A09, this.A0B));
        A00.A01(new Object());
        A00.A09 = true;
        A00.A06 = "GalleryPickerIgRecyclerAdapter";
        C66362zD A002 = A00.A00();
        A002.setHasStableIds(true);
        this.A07 = A002;
    }

    @Override // X.InterfaceC195538kt
    public final int AK4(int i) {
        return AbstractC37302Gc3.A02((Number) AbstractC166997dE.A0m(this.A09.A04, i));
    }

    @Override // X.InterfaceC195538kt
    public final int AK8(int i) {
        return AbstractC37302Gc3.A02((Number) AbstractC166997dE.A0m(this.A09.A05, i));
    }

    @Override // X.InterfaceC195538kt
    public final int Bph() {
        return this.A09.A01;
    }

    @Override // X.InterfaceC195528ks
    public final int getItemCount() {
        return this.A09.A03.size();
    }

    @Override // X.InterfaceC195538kt
    public final void registerDataSetObserver(DataSetObserver dataSetObserver) {
        this.A01 = dataSetObserver;
    }

    @Override // X.InterfaceC195528ks
    public final void DoX(List list) {
        this.A07.A05(AbstractC43593JPy.A0L(list));
        DataSetObserver dataSetObserver = this.A01;
        if (dataSetObserver != null) {
            dataSetObserver.onChanged();
        }
    }
}
