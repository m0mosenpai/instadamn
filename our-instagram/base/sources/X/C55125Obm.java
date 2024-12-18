package X;

import androidx.paging.PagingSource;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.Obm, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55125Obm {
    public OIE A00;
    public final InterfaceC57788PkF A01;
    public final PagingSource A02;
    public final AtomicBoolean A03;
    public final C12T A04;
    public final C12T A05;
    public final C19L A06;
    public final InterfaceC57787PkE A07;
    public final C53652Nnx A08;

    public C55125Obm(InterfaceC57787PkE interfaceC57787PkE, InterfaceC57788PkF interfaceC57788PkF, C53652Nnx c53652Nnx, PagingSource pagingSource, C12T c12t, C12T c12t2, C19L c19l) {
        C14360o3.A0B(interfaceC57787PkE, 7);
        this.A06 = c19l;
        this.A08 = c53652Nnx;
        this.A02 = pagingSource;
        this.A05 = c12t;
        this.A04 = c12t2;
        this.A01 = interfaceC57788PkF;
        this.A07 = interfaceC57787PkE;
        this.A03 = AbstractC166997dE.A17();
        this.A00 = new C51067MhN(this);
    }

    public static final void A00(C55125Obm c55125Obm) {
        Object obj;
        PW8 pw8 = (PW8) c55125Obm.A07;
        if ((!pw8.A05 || pw8.A01 > 0) && (obj = ((C51077MhX) AbstractC001800i.A0K(pw8.A06)).A02) != null) {
            OIE oie = c55125Obm.A00;
            EnumC53109NeM enumC53109NeM = EnumC53109NeM.APPEND;
            oie.A00(C51059MhD.A00, enumC53109NeM);
            AbstractC23641Du.A05(c55125Obm.A04, new MCP((InterfaceC23621Ds) null, c55125Obm, enumC53109NeM, new C51072MhS(15, obj, true), 6), c55125Obm.A06);
            return;
        }
        EnumC53109NeM enumC53109NeM2 = EnumC53109NeM.APPEND;
        C51077MhX c51077MhX = C51077MhX.A05;
        C14360o3.A0C(c51077MhX, "null cannot be cast to non-null type androidx.paging.PagingSource.LoadResult.Page<Key of androidx.paging.PagingSource.LoadResult.Page.Companion.empty, Value of androidx.paging.PagingSource.LoadResult.Page.Companion.empty>");
        A02(c55125Obm, enumC53109NeM2, c51077MhX);
    }

    public static final void A01(C55125Obm c55125Obm) {
        Object obj;
        PW8 pw8 = (PW8) c55125Obm.A07;
        if ((!pw8.A05 || pw8.A02 + pw8.A03 > 0) && (obj = ((C51077MhX) AbstractC001800i.A0I(pw8.A06)).A03) != null) {
            OIE oie = c55125Obm.A00;
            EnumC53109NeM enumC53109NeM = EnumC53109NeM.PREPEND;
            oie.A00(C51059MhD.A00, enumC53109NeM);
            AbstractC23641Du.A05(c55125Obm.A04, new MCP((InterfaceC23621Ds) null, c55125Obm, enumC53109NeM, new C51073MhT(15, obj, true), 6), c55125Obm.A06);
            return;
        }
        EnumC53109NeM enumC53109NeM2 = EnumC53109NeM.PREPEND;
        C51077MhX c51077MhX = C51077MhX.A05;
        C14360o3.A0C(c51077MhX, "null cannot be cast to non-null type androidx.paging.PagingSource.LoadResult.Page<Key of androidx.paging.PagingSource.LoadResult.Page.Companion.empty, Value of androidx.paging.PagingSource.LoadResult.Page.Companion.empty>");
        A02(c55125Obm, enumC53109NeM2, c51077MhX);
    }

    public static final void A02(C55125Obm c55125Obm, EnumC53109NeM enumC53109NeM, C51077MhX c51077MhX) {
        int size;
        C51057MhB c51057MhB;
        if (!c55125Obm.A03.get()) {
            C51069MhP c51069MhP = (C51069MhP) c55125Obm.A01;
            boolean A1R = AbstractC167007dF.A1R(0, enumC53109NeM, c51077MhX);
            List list = c51077MhX.A04;
            PW8 pw8 = ((PW7) c51069MhP).A02;
            if (enumC53109NeM == EnumC53109NeM.APPEND) {
                int size2 = list.size();
                if (size2 != 0) {
                    pw8.A06.add(c51077MhX);
                    int i = pw8.A04 + size2;
                    pw8.A04 = i;
                    int i2 = pw8.A01;
                    int min = Math.min(i2, size2);
                    int i3 = size2 - min;
                    if (min != 0) {
                        pw8.A01 = i2 - min;
                    }
                    int i4 = (pw8.A02 + i) - size2;
                    c51069MhP.A02(i4, min);
                    c51069MhP.A03(i4 + min, i3);
                }
                size = c51069MhP.A00 - list.size();
                c51069MhP.A00 = size;
            } else if (enumC53109NeM == EnumC53109NeM.PREPEND) {
                int size3 = list.size();
                if (size3 != 0) {
                    pw8.A06.add(0, c51077MhX);
                    pw8.A04 += size3;
                    int i5 = pw8.A02;
                    int min2 = Math.min(i5, size3);
                    int i6 = size3 - min2;
                    if (min2 != 0) {
                        i5 -= min2;
                        pw8.A02 = i5;
                    }
                    pw8.A03 -= i6;
                    c51069MhP.A02(i5, min2);
                    c51069MhP.A03(0, i6);
                    c51069MhP.A02 += i6;
                    c51069MhP.A01 += i6;
                }
                size = c51069MhP.A03 - list.size();
                c51069MhP.A03 = size;
            } else {
                throw AbstractC37303Gc4.A0M(enumC53109NeM, "unexpected result type ", AbstractC166987dD.A1C());
            }
            if (size > 0 && AbstractC166987dD.A1b(list)) {
                if (enumC53109NeM.ordinal() != A1R) {
                    A00(c55125Obm);
                    return;
                } else {
                    A01(c55125Obm);
                    return;
                }
            }
            OIE oie = c55125Obm.A00;
            if (list.isEmpty()) {
                c51057MhB = C51057MhB.A00;
            } else {
                c51057MhB = C51057MhB.A01;
            }
            oie.A00(c51057MhB, enumC53109NeM);
        }
    }
}
