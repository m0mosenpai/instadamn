package X;

import com.google.common.collect.ImmutableList;
import com.instagram.api.schemas.MusicProduct;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: X.Mh9, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51055Mh9 extends AbstractC52922bZ implements InterfaceC62602sz {
    public static final ImmutableList A0G;
    public final C8BN A00;
    public final ImmutableList A01;
    public final ImmutableList A02;
    public final MusicProduct A03;
    public final AbstractC59962oe A04;
    public final UserSession A05;
    public final C50669MYn A06;
    public final InterfaceC24731Iq A07;
    public final InterfaceC19390xP A08;
    public final InterfaceC19390xP A09;
    public final InterfaceC19390xP A0A;
    public final C05A A0B;
    public final C05A A0C;
    public final C05A A0D;
    public final C0UO A0E;
    public final ImmutableList A0F;

    public final void A01(EnumC53226NgO enumC53226NgO) {
        C14360o3.A0B(enumC53226NgO, 0);
        AbstractC51054Mh8 A00 = A00(enumC53226NgO, this);
        this.A0D.Egh(enumC53226NgO);
        C05A c05a = this.A0C;
        C05A c05a2 = A00.A09;
        c05a.Egh(c05a2.getValue());
        this.A0B.Egh(A00.A08.getValue());
        if (c05a.getValue() == EnumC53173NfU.A07) {
            c05a2.Egh(EnumC53173NfU.A05);
            A00.A03.A00(null, true);
        }
        if (c05a.getValue() == EnumC53173NfU.A04) {
            A00.A02();
        }
    }

    @Override // X.InterfaceC62602sz
    public final boolean CLJ() {
        return false;
    }

    static {
        ImmutableList of = ImmutableList.of((Object) EnumC53226NgO.A03, (Object) EnumC53226NgO.A06, (Object) EnumC53226NgO.A04, (Object) EnumC53226NgO.A05);
        C14360o3.A07(of);
        A0G = of;
    }

    public C51055Mh9(C8BN c8bn, ImmutableList immutableList, ImmutableList immutableList2, MusicProduct musicProduct, AbstractC59962oe abstractC59962oe, UserSession userSession, C50669MYn c50669MYn) {
        InterfaceC58197Pr3 nqu;
        JQ0.A1O(abstractC59962oe, userSession, musicProduct, immutableList, immutableList2);
        C14360o3.A0B(c50669MYn, 7);
        this.A04 = abstractC59962oe;
        this.A05 = userSession;
        this.A03 = musicProduct;
        this.A02 = immutableList;
        this.A01 = immutableList2;
        this.A00 = c8bn;
        this.A06 = c50669MYn;
        ImmutableList immutableList3 = A0G;
        C008002u A00 = C10E.A00(immutableList3.get(0));
        this.A0D = A00;
        this.A0E = AbstractC208910l.A02(A00);
        C008002u A1H = AbstractC25225BEi.A1H(EnumC53173NfU.A07);
        this.A0C = A1H;
        this.A09 = A1H;
        C008002u A0o = AbstractC31171DnF.A0o();
        this.A0B = A0o;
        this.A08 = A0o;
        C24721Ip A12 = AbstractC25229BEm.A12();
        this.A07 = A12;
        this.A0A = AbstractC07080Za.A03(A12);
        ArrayList A0q = AbstractC167017dG.A0q(immutableList3);
        Iterator<E> it = immutableList3.iterator();
        while (it.hasNext()) {
            EnumC53226NgO enumC53226NgO = (EnumC53226NgO) it.next();
            C14360o3.A0A(enumC53226NgO);
            int ordinal = enumC53226NgO.ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal != 3) {
                        if (ordinal == 2) {
                            AbstractC59962oe abstractC59962oe2 = this.A04;
                            UserSession userSession2 = this.A05;
                            nqu = new NQT(this.A02, this.A03, abstractC59962oe2, userSession2, this.A06);
                        } else {
                            throw AbstractC37303Gc4.A0M(enumC53226NgO, "Unsupported tab type: ", AbstractC166987dD.A1C());
                        }
                    } else {
                        AbstractC59962oe abstractC59962oe3 = this.A04;
                        UserSession userSession3 = this.A05;
                        nqu = new NQR(this.A02, this.A03, abstractC59962oe3, userSession3);
                    }
                } else {
                    AbstractC59962oe abstractC59962oe4 = this.A04;
                    UserSession userSession4 = this.A05;
                    nqu = new NQS(this.A02, this.A03, abstractC59962oe4, userSession4);
                }
            } else {
                AbstractC59962oe abstractC59962oe5 = this.A04;
                UserSession userSession5 = this.A05;
                MusicProduct musicProduct2 = this.A03;
                nqu = new NQU(this.A00, this.A02, this.A01, musicProduct2, abstractC59962oe5, userSession5);
            }
            A0q.add(nqu);
        }
        ImmutableList copyOf = ImmutableList.copyOf((Collection) A0q);
        this.A0F = copyOf;
        Iterator<E> it2 = copyOf.iterator();
        while (it2.hasNext()) {
            AbstractC51054Mh8 abstractC51054Mh8 = (AbstractC51054Mh8) it2.next();
            C14360o3.A0A(abstractC51054Mh8);
            AbstractC25232BEp.A1J(this, new C50119MBt(this, abstractC51054Mh8, null, 38), abstractC51054Mh8.A06);
            AbstractC25232BEp.A1J(this, new C50119MBt(this, abstractC51054Mh8, null, 39), abstractC51054Mh8.A05);
            AbstractC25232BEp.A1J(this, new PZM(this, null, 41), abstractC51054Mh8.A07);
        }
        A01((EnumC53226NgO) this.A0E.getValue());
    }

    public static final AbstractC51054Mh8 A00(EnumC53226NgO enumC53226NgO, C51055Mh9 c51055Mh9) {
        Iterator<E> it = c51055Mh9.A0F.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            AbstractC51054Mh8 abstractC51054Mh8 = (AbstractC51054Mh8) next;
            if (abstractC51054Mh8.A01() == enumC53226NgO) {
                C14360o3.A07(next);
                return abstractC51054Mh8;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @Override // X.InterfaceC62602sz
    public final boolean CL7() {
        return MSX.A1X(this.A0B.getValue());
    }

    @Override // X.InterfaceC62602sz
    public final boolean CUG() {
        return AbstractC167007dF.A1X(this.A0C.getValue(), EnumC53173NfU.A03);
    }

    @Override // X.InterfaceC62602sz
    public final boolean CXf() {
        A00((EnumC53226NgO) this.A0D.getValue(), this);
        return AbstractC167007dF.A1M(isLoading() ? 1 : 0);
    }

    @Override // X.InterfaceC62602sz
    public final void Chd() {
        AbstractC51054Mh8 A00 = A00((EnumC53226NgO) this.A0D.getValue(), this);
        C50668MYm c50668MYm = A00.A03;
        if (c50668MYm.A01.A06()) {
            A00.A09.Egh(EnumC53173NfU.A06);
            c50668MYm.A00(null, false);
        }
    }

    @Override // X.InterfaceC62602sz
    public final boolean isLoading() {
        C05A c05a = this.A0C;
        if (c05a.getValue() != EnumC53173NfU.A05 && c05a.getValue() != EnumC53173NfU.A06) {
            return false;
        }
        return true;
    }
}
