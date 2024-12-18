package X;

import androidx.paging.PagingConfig;
import androidx.paging.PagingSource;
import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import kotlin.Deprecated;

@Deprecated(message = "PagedList is deprecated and has been replaced by PagingData")
/* loaded from: classes9.dex */
public abstract class PW7<T> extends AbstractList<T> {
    public Runnable A00;
    public final C53652Nnx A01;
    public final PW8 A02;
    public final PagingSource A03;
    public final List A04;
    public final List A05;
    public final C12T A06;
    public final C19L A07;

    public final void A05(AbstractC53629Nna abstractC53629Nna) {
        C14360o3.A0B(abstractC53629Nna, 0);
        List list = this.A04;
        AnonymousClass016.A1A(list, C57585Pgx.A00);
        list.add(AbstractC25225BEi.A16(abstractC53629Nna));
    }

    public final void A06(AbstractC53629Nna abstractC53629Nna) {
        C14360o3.A0B(abstractC53629Nna, 0);
        AnonymousClass016.A1A(this.A04, new C57560PgY(abstractC53629Nna, 8));
    }

    public final Object A00() {
        if (this instanceof C51068MhO) {
            return ((C51068MhO) this).A00.A00();
        }
        C51069MhP c51069MhP = (C51069MhP) this;
        PW8 pw8 = ((PW7) c51069MhP).A02;
        C14360o3.A0B(((PW7) c51069MhP).A01, 0);
        List list = pw8.A06;
        if (!list.isEmpty()) {
            List A0a = AbstractC001800i.A0a(list);
            C14360o3.A0C(A0a, "null cannot be cast to non-null type kotlin.collections.List<androidx.paging.PagingSource.LoadResult.Page<kotlin.Any, T of androidx.paging.PagedStorage>>");
            int i = pw8.A02;
            c51069MhP.A05.A05(new C54827OLm(new PagingConfig(15, 15, 45, true), Integer.valueOf(pw8.A00 + i), A0a, i));
        }
        return c51069MhP.A06;
    }

    public final void A01(int i) {
        if (i >= 0 && i < size()) {
            PW8 pw8 = this.A02;
            pw8.A00 = C17s.A03(i - pw8.A02, 0, pw8.A04 - 1);
            if (!(this instanceof C51068MhO)) {
                C51069MhP c51069MhP = (C51069MhP) this;
                PW8 pw82 = ((PW7) c51069MhP).A02;
                int i2 = pw82.A02;
                int i3 = ((i + 15) + 1) - (i2 + pw82.A04);
                int max = Math.max(15 - (i - i2), c51069MhP.A03);
                c51069MhP.A03 = max;
                if (max > 0) {
                    C55125Obm c55125Obm = c51069MhP.A04;
                    O1E o1e = c55125Obm.A00.A02;
                    if ((o1e instanceof C51057MhB) && !o1e.A00) {
                        C55125Obm.A01(c55125Obm);
                    }
                }
                int max2 = Math.max(i3, c51069MhP.A00);
                c51069MhP.A00 = max2;
                if (max2 > 0) {
                    C55125Obm c55125Obm2 = c51069MhP.A04;
                    O1E o1e2 = c55125Obm2.A00.A00;
                    if ((o1e2 instanceof C51057MhB) && !o1e2.A00) {
                        C55125Obm.A00(c55125Obm2);
                    }
                }
                c51069MhP.A02 = Math.min(c51069MhP.A02, i);
                c51069MhP.A01 = Math.max(c51069MhP.A01, i);
                return;
            }
            return;
        }
        throw AbstractC25229BEm.A0l("Index: ", ", Size: ", i, size());
    }

    public final void A02(int i, int i2) {
        if (i2 != 0) {
            Iterator it = AbstractC001800i.A0Y(this.A04).iterator();
            while (it.hasNext()) {
                AbstractC53629Nna abstractC53629Nna = (AbstractC53629Nna) MSZ.A0n(it);
                if (abstractC53629Nna != null) {
                    abstractC53629Nna.A00(i, i2);
                }
            }
        }
    }

    public final void A03(int i, int i2) {
        if (i2 != 0) {
            Iterator it = AbstractC001800i.A0Y(this.A04).iterator();
            while (it.hasNext()) {
                AbstractC53629Nna abstractC53629Nna = (AbstractC53629Nna) MSZ.A0n(it);
                if (abstractC53629Nna != null) {
                    abstractC53629Nna.A01(i, i2);
                }
            }
        }
    }

    public final void A04(O1E o1e, EnumC53109NeM enumC53109NeM) {
        if (this instanceof C51069MhP) {
            C14360o3.A0B(enumC53109NeM, 0);
            ((C51069MhP) this).A04.A00.A00(o1e, enumC53109NeM);
        }
    }

    public final void A07(InterfaceC16620sF interfaceC16620sF) {
        if (!(this instanceof C51068MhO)) {
            OIE oie = ((C51069MhP) this).A04.A00;
            interfaceC16620sF.invoke(EnumC53109NeM.REFRESH, oie.A01);
            interfaceC16620sF.invoke(EnumC53109NeM.PREPEND, oie.A02);
            interfaceC16620sF.invoke(EnumC53109NeM.APPEND, oie.A00);
        }
    }

    public final boolean A08() {
        if (this instanceof C51068MhO) {
            return true;
        }
        return ((C51069MhP) this).A04.A03.get();
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        return this.A02.get(i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
        return this.A02.size();
    }

    public PW7(C53652Nnx c53652Nnx, PW8 pw8, PagingSource pagingSource, C12T c12t, C19L c19l) {
        AbstractC167027dH.A13(pagingSource, c19l, c12t);
        C14360o3.A0B(c53652Nnx, 5);
        this.A03 = pagingSource;
        this.A07 = c19l;
        this.A06 = c12t;
        this.A02 = pw8;
        this.A01 = c53652Nnx;
        this.A04 = AbstractC166987dD.A1E();
        this.A05 = AbstractC166987dD.A1E();
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ Object remove(int i) {
        return super.remove(i);
    }
}
