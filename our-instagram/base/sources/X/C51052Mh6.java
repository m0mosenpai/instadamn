package X;

import com.instagram.mediakit.repository.MediaKitRepository;
import java.util.LinkedHashMap;

/* renamed from: X.Mh6, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51052Mh6 extends AbstractC52922bZ implements InterfaceC58279PsX {
    public static final String __redex_internal_original_name = "MediaKitPickerTabsViewModel";
    public C51850Mvs A00;
    public boolean A01;
    public final EnumC53194Nfq A02;
    public final MediaKitRepository A03;
    public final OEV A04;
    public final InterfaceC06180Ui A05;
    public final InterfaceC15070pN A06;
    public final InterfaceC15070pN A07;
    public final InterfaceC11380iw A08;
    public final C54780OIu A09;
    public final InterfaceC06180Ui A0A;

    public C51052Mh6(InterfaceC11380iw interfaceC11380iw, C54780OIu c54780OIu, EnumC53194Nfq enumC53194Nfq, MediaKitRepository mediaKitRepository, OEV oev) {
        AbstractC25234BEr.A0j(2, mediaKitRepository, enumC53194Nfq, c54780OIu, interfaceC11380iw);
        this.A04 = oev;
        this.A03 = mediaKitRepository;
        this.A02 = enumC53194Nfq;
        this.A08 = interfaceC11380iw;
        this.A09 = c54780OIu;
        Integer num = C05F.A00;
        AnonymousClass057 A00 = C10M.A00(num, 1, 0);
        A00.F8m(AbstractC166987dD.A1I());
        this.A0A = A00;
        this.A06 = new C06160Ug(null, A00);
        AnonymousClass057 A002 = C10M.A00(num, 1, 0);
        this.A05 = A002;
        this.A07 = new C06160Ug(null, A002);
    }

    public static final void A01(C51052Mh6 c51052Mh6, InterfaceC16660sJ interfaceC16660sJ) {
        InterfaceC06180Ui interfaceC06180Ui = c51052Mh6.A0A;
        Object A0I = AbstractC001800i.A0I(interfaceC06180Ui.Bn0());
        interfaceC16660sJ.invoke(A0I);
        interfaceC06180Ui.F8m(A0I);
    }

    public final LinkedHashMap A02() {
        return (LinkedHashMap) AbstractC001800i.A0I(this.A0A.Bn0());
    }

    public final boolean A04() {
        int i;
        EnumC53194Nfq enumC53194Nfq = this.A02;
        int ordinal = enumC53194Nfq.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                i = this.A04.A02;
            } else {
                throw B4Z.A00();
            }
        } else {
            i = this.A04.A03;
        }
        int A00 = A00(enumC53194Nfq, this);
        int size = A02().size();
        if (i > size || size > A00) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC58279PsX
    public final C54780OIu BOh() {
        return this.A09;
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return this.A08.getModuleName();
    }

    public static final int A00(EnumC53194Nfq enumC53194Nfq, C51052Mh6 c51052Mh6) {
        int ordinal = enumC53194Nfq.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                return c51052Mh6.A04.A00;
            }
            throw B4Z.A00();
        }
        return c51052Mh6.A04.A01;
    }

    public final void A03(InterfaceC57836Pl2... interfaceC57836Pl2Arr) {
        AbstractC166987dD.A1Z(new C50534MSn(this, interfaceC57836Pl2Arr, null, 28), AbstractC141776au.A00(this));
    }
}
