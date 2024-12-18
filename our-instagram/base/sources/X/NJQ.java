package X;

import android.app.Application;
import com.instagram.common.session.UserSession;
import com.instagram.creation.sharesheet.rowitems.model.PublishScreenCategoryType;

/* loaded from: classes9.dex */
public final class NJQ extends AbstractC50867Mdy {
    public final C07X A00;
    public final UserSession A01;
    public final C44547Jmr A02;
    public final C52458NJc A03;
    public final NJN A04;
    public final NK6 A05;
    public final C52467NJl A06;
    public final NKD A07;
    public final NKA A08;
    public final C52462NJg A09;
    public final NKI A0A;
    public final C52468NJm A0B;
    public final C52479NJx A0C;
    public final C52480NJy A0D;
    public final C52463NJh A0E;
    public final C50991Mfy A0F;
    public final C52481NJz A0G;
    public final NKB A0H;
    public final NK3 A0I;
    public final C52473NJr A0J;
    public final NKE A0K;
    public final C52477NJv A0L;
    public final NKO A0M;
    public final C52478NJw A0N;
    public final NKK A0O;
    public final C52470NJo A0P;
    public final NKC A0Q;
    public final Application A0R;

    public final boolean A0H(PublishScreenCategoryType publishScreenCategoryType, AbstractC53462Nkp abstractC53462Nkp) {
        C14360o3.A0B(publishScreenCategoryType, 1);
        NJN njn = this.A04;
        C51754Mtd A03 = A03(this);
        if (abstractC53462Nkp instanceof NJV) {
            return njn.A08(publishScreenCategoryType, A03, ((NJV) abstractC53462Nkp).A00);
        }
        if (abstractC53462Nkp instanceof NJU) {
            PublishScreenCategoryType publishScreenCategoryType2 = ((NJU) abstractC53462Nkp).A00;
            if (publishScreenCategoryType2.ordinal() == 4) {
                return C18U.A06(C06090Tz.A05, njn.A00, 36328547082190458L);
            }
            return njn.A07(publishScreenCategoryType2, publishScreenCategoryType2, A03);
        }
        return false;
    }

    public static final C51754Mtd A03(NJQ njq) {
        return (C51754Mtd) ((AbstractC193598he) njq.A03.A06.getValue()).A01;
    }

    public final void A0F(Runnable runnable) {
        C57171PZp.A03(runnable, this, AbstractC141776au.A00(this), 46);
    }

    public final boolean A0G() {
        EnumC76383bi enumC76383bi;
        C51754Mtd A03 = A03(this);
        if (A03 != null) {
            enumC76383bi = A03.A0C;
        } else {
            enumC76383bi = null;
        }
        return AbstractC167007dF.A1X(enumC76383bi, EnumC76383bi.A04);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NJQ(Application application, C07X c07x, UserSession userSession, C44547Jmr c44547Jmr, C52458NJc c52458NJc, NJN njn, NK6 nk6, C52467NJl c52467NJl, NKD nkd, NKA nka, C52462NJg c52462NJg, NKI nki, C52468NJm c52468NJm, C52479NJx c52479NJx, C52480NJy c52480NJy, C52463NJh c52463NJh, C50991Mfy c50991Mfy, C52481NJz c52481NJz, NKB nkb, NK3 nk3, C52473NJr c52473NJr, NKE nke, C52477NJv c52477NJv, NKO nko, C52478NJw c52478NJw, NKK nkk, C52470NJo c52470NJo, NKC nkc) {
        super(application, njn);
        AbstractC25234BEr.A0j(2, c52458NJc, userSession, c07x, c50991Mfy);
        this.A0R = application;
        this.A03 = c52458NJc;
        this.A01 = userSession;
        this.A00 = c07x;
        this.A0F = c50991Mfy;
        this.A02 = c44547Jmr;
        this.A04 = njn;
        this.A0B = c52468NJm;
        this.A08 = nka;
        this.A0M = nko;
        this.A06 = c52467NJl;
        this.A0G = c52481NJz;
        this.A0H = nkb;
        this.A0I = nk3;
        this.A0N = c52478NJw;
        this.A0C = c52479NJx;
        this.A0J = c52473NJr;
        this.A0O = nkk;
        this.A0A = nki;
        this.A0P = c52470NJo;
        this.A0Q = nkc;
        this.A09 = c52462NJg;
        this.A05 = nk6;
        this.A07 = nkd;
        this.A0D = c52480NJy;
        this.A0E = c52463NJh;
        this.A0L = c52477NJv;
        this.A0K = nke;
        PZT.A03(this, AbstractC141776au.A00(this), 2);
        A0F(new PMY(this));
    }
}
