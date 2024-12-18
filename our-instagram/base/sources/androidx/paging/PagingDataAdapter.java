package androidx.paging;

import X.AbstractC166987dD;
import X.AbstractC25229BEm;
import X.AbstractC53592Nmz;
import X.AbstractC65412xd;
import X.AbstractC68219VIb;
import X.AnonymousClass001;
import X.AnonymousClass016;
import X.C0eB;
import X.C0f9;
import X.C12P;
import X.C12T;
import X.C14360o3;
import X.C1JX;
import X.C2UU;
import X.C54991OTz;
import X.C55090Oaw;
import X.C55581OmJ;
import X.C65442xg;
import X.D42;
import X.EnumC65362xY;
import X.GRX;
import X.InterfaceC16660sJ;
import X.InterfaceC19390xP;
import X.InterfaceC23621Ds;
import X.InterfaceC57894Ply;
import X.InterfaceC58012Pnw;
import X.MSW;
import X.OZY;
import X.PWC;
import X.UH2;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Deprecated;

/* loaded from: classes9.dex */
public abstract class PagingDataAdapter extends C2UU {
    public boolean A00;
    public final AsyncPagingDataDiffer A01;
    public final InterfaceC19390xP A02;
    public final InterfaceC19390xP A03;

    @Override // X.C2UU
    public final void setStateRestorationPolicy(EnumC65362xY enumC65362xY) {
        C14360o3.A0B(enumC65362xY, 0);
        this.A00 = true;
        super.setStateRestorationPolicy(enumC65362xY);
    }

    @Deprecated(level = AbstractC68219VIb.HIDDEN, message = "Superseded by constructors which accept CoroutineContext")
    public /* synthetic */ PagingDataAdapter(AbstractC65412xd abstractC65412xd, C12T c12t) {
        C12T c12t2 = C12P.A00;
        AsyncPagingDataDiffer asyncPagingDataDiffer = AsyncPagingDataDiffer.$redex_init_class;
        AsyncPagingDataDiffer asyncPagingDataDiffer2 = new AsyncPagingDataDiffer(abstractC65412xd, new C65442xg(this), c12t, c12t2);
        this.A01 = asyncPagingDataDiffer2;
        super.setStateRestorationPolicy(EnumC65362xY.PREVENT);
        registerAdapterDataObserver(new UH2(this, 0));
        A06(new GRX(this));
        this.A02 = asyncPagingDataDiffer2.A07;
        this.A03 = asyncPagingDataDiffer2.A08;
    }

    public final PWC A01() {
        C55581OmJ c55581OmJ = this.A01.A01.A01;
        int i = c55581OmJ.A01;
        int i2 = c55581OmJ.A00;
        List list = c55581OmJ.A03;
        ArrayList A1E = AbstractC166987dD.A1E();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AnonymousClass016.A16(((C55090Oaw) it.next()).A01, A1E);
        }
        return new PWC(A1E, i, i2);
    }

    public final Object A02(int i) {
        Object obj;
        AsyncPagingDataDiffer asyncPagingDataDiffer = this.A01;
        try {
            asyncPagingDataDiffer.A00 = true;
            AsyncPagingDataDiffer$differBase$1 asyncPagingDataDiffer$differBase$1 = asyncPagingDataDiffer.A01;
            asyncPagingDataDiffer$differBase$1.A0C = true;
            asyncPagingDataDiffer$differBase$1.A0B = i;
            if (AbstractC53592Nmz.A00 != null && MSW.A1a(2)) {
                C14360o3.A0B(AnonymousClass001.A0I("Accessing item index[", ']', i), 1);
            }
            InterfaceC57894Ply interfaceC57894Ply = asyncPagingDataDiffer$differBase$1.A00;
            if (interfaceC57894Ply != null) {
                interfaceC57894Ply.A7F(asyncPagingDataDiffer$differBase$1.A01.A02(i));
            }
            C55581OmJ c55581OmJ = asyncPagingDataDiffer$differBase$1.A01;
            if (i >= 0 && i < c55581OmJ.getSize()) {
                int i2 = i - c55581OmJ.A01;
                if (i2 >= 0 && i2 < c55581OmJ.A02) {
                    obj = c55581OmJ.B8p(i2);
                } else {
                    obj = null;
                }
                return obj;
            }
            throw AbstractC25229BEm.A0l("Index: ", ", Size: ", i, c55581OmJ.getSize());
        } finally {
            asyncPagingDataDiffer.A00 = false;
        }
    }

    public final Object A03(C54991OTz c54991OTz, InterfaceC23621Ds interfaceC23621Ds) {
        AsyncPagingDataDiffer asyncPagingDataDiffer = this.A01;
        asyncPagingDataDiffer.A05.incrementAndGet();
        AsyncPagingDataDiffer$differBase$1 asyncPagingDataDiffer$differBase$1 = asyncPagingDataDiffer.A01;
        Object A00 = asyncPagingDataDiffer$differBase$1.A06.A00(interfaceC23621Ds, new D42(asyncPagingDataDiffer$differBase$1, c54991OTz, null, 0));
        C1JX c1jx = C1JX.A02;
        if (A00 != c1jx) {
            A00 = C0eB.A00;
        }
        if (A00 != c1jx) {
            A00 = C0eB.A00;
        }
        if (A00 != c1jx) {
            return C0eB.A00;
        }
        return A00;
    }

    public final void A04() {
        AsyncPagingDataDiffer$differBase$1 asyncPagingDataDiffer$differBase$1 = this.A01.A01;
        if (AbstractC53592Nmz.A00 != null) {
            Log.isLoggable("Paging", 3);
        }
        InterfaceC58012Pnw interfaceC58012Pnw = asyncPagingDataDiffer$differBase$1.A02;
        if (interfaceC58012Pnw != null) {
            interfaceC58012Pnw.ECn();
        }
    }

    public final void A05() {
        AsyncPagingDataDiffer$differBase$1 asyncPagingDataDiffer$differBase$1 = this.A01.A01;
        if (AbstractC53592Nmz.A00 != null) {
            Log.isLoggable("Paging", 3);
        }
        InterfaceC58012Pnw interfaceC58012Pnw = asyncPagingDataDiffer$differBase$1.A02;
        if (interfaceC58012Pnw != null) {
            interfaceC58012Pnw.EKu();
        }
    }

    public final void A06(InterfaceC16660sJ interfaceC16660sJ) {
        OZY ozy = this.A01.A01.A04;
        ozy.A00.add(interfaceC16660sJ);
        Object value = ozy.A01.getValue();
        if (value != null) {
            interfaceC16660sJ.invoke(value);
        }
    }

    @Override // X.C2UU
    public final void setHasStableIds(boolean z) {
        throw AbstractC166987dD.A1D("Stable ids are unsupported on PagingDataAdapter.");
    }

    @Override // X.C2UU
    public final int getItemCount() {
        int A03 = C0f9.A03(-931894484);
        int size = this.A01.A01.A01.getSize();
        C0f9.A0A(-1013771373, A03);
        return size;
    }

    @Override // X.C2UU, android.widget.Adapter
    public final long getItemId(int i) {
        int A03 = C0f9.A03(-1405007841);
        long itemId = super.getItemId(i);
        C0f9.A0A(-1251830307, A03);
        return itemId;
    }
}
