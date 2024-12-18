package X;

import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.grid.LazyGridState;
import androidx.compose.ui.Modifier;
import com.facebook.R;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.react.modules.base.IgReactQEModule;

/* renamed from: X.Dbk, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C30501Dbk extends C0YY implements InterfaceC16620sF {
    public final int A00;
    public final int A01;
    public final int A02;
    public final Object A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30501Dbk(Object obj, int i, int i2, int i3) {
        super(2);
        this.A00 = i3;
        this.A02 = i;
        this.A03 = obj;
        this.A01 = i2;
    }

    public static int A00(C30501Dbk c30501Dbk) {
        return AbstractC128295qy.A00(c30501Dbk.A01 | 1);
    }

    public static void A01(C5UU c5uu, Object obj, int i, int i2, int i3) {
        c5uu.A06 = new C30501Dbk(obj, i, i2, i3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v3, types: [androidx.compose.ui.Modifier] */
    /* JADX WARN: Type inference failed for: r13v2, types: [java.lang.String] */
    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i;
        boolean z;
        CWS cws;
        BZP A06;
        int i2;
        Object c30538DcL;
        C5TR A01;
        int i3;
        switch (this.A00) {
            case 0:
                AbstractC28344CeW.A01((Modifier) this.A03, AbstractC25226BEj.A0S(obj, obj2), A00(this), this.A02);
                break;
            case 1:
                AbstractC136716Ha.A06((Modifier) this.A03, AbstractC25226BEj.A0S(obj, obj2), A00(this), this.A02);
                break;
            case 2:
                AbstractC136716Ha.A07((Modifier) this.A03, AbstractC25226BEj.A0S(obj, obj2), A00(this), this.A02);
                break;
            case 3:
                AbstractC28031CXf.A01((Modifier) this.A03, AbstractC25226BEj.A0S(obj, obj2), A00(this), this.A02);
                break;
            case 4:
                AbstractC27570CEp.A00((Modifier) this.A03, AbstractC25226BEj.A0S(obj, obj2), this.A02, A00(this));
                break;
            case 5:
                BGU.A00((LazyListState) this.A03, AbstractC25226BEj.A0S(obj, obj2), this.A02, A00(this));
                break;
            case 6:
                BGU.A01((LazyGridState) this.A03, AbstractC25226BEj.A0S(obj, obj2), this.A02, A00(this));
                break;
            case 7:
                BGU.A02(AbstractC25226BEj.A0S(obj, obj2), (MRC) this.A03, this.A02, A00(this));
                break;
            case 8:
                CGP.A00((Modifier) this.A03, AbstractC25226BEj.A0S(obj, obj2), A00(this), this.A02);
                break;
            case 9:
                C5Tl A0S = AbstractC25226BEj.A0S(obj, obj2);
                Modifier modifier = (Modifier) this.A03;
                int A00 = A00(this);
                int i4 = this.A02;
                A0S.Enr(-589939686);
                int i5 = i4 & 1;
                if (i5 != 0) {
                    i = A00 | 6;
                } else if ((A00 & 6) == 0) {
                    i = AbstractC25232BEp.A0R(A0S, modifier) | A00;
                } else {
                    i = A00;
                }
                if ((i & 3) == 2 && A0S.Bxj()) {
                    A0S.Em9();
                } else {
                    if (i5 != 0) {
                        modifier = Modifier.A00;
                    }
                    if (C0fH.A02()) {
                        C0fH.A01(-2073580535, "com.instagram.compose.ui.notificationbadge.BlueBadge (BlueBadge.kt:14)");
                    }
                    C6LQ.A03(A0S, AbstractC118185Wd.A0C(modifier, 8.0f), AbstractC25227BEk.A0P(A0S, R.drawable.blue_dot_small));
                    if (C0fH.A02()) {
                        C0fH.A00(-1733505125);
                    }
                }
                C5UU ASZ = A0S.ASZ();
                if (ASZ != null) {
                    A01(ASZ, modifier, i4, A00, 9);
                    break;
                }
                break;
            case 10:
                CGT.A00((Modifier) this.A03, AbstractC25226BEj.A0S(obj, obj2), A00(this), this.A02);
                break;
            case 11:
                CGV.A00((Modifier) this.A03, AbstractC25226BEj.A0S(obj, obj2), A00(this), this.A02);
                break;
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                AbstractC27616CGm.A00(AbstractC25226BEj.A0S(obj, obj2), (InterfaceC16820sZ) this.A03, this.A02, A00(this));
                break;
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                AbstractC27617CGn.A00(AbstractC25226BEj.A0S(obj, obj2), (InterfaceC16660sJ) this.A03, this.A02, A00(this));
                break;
            case 14:
                AbstractC28438Cgm.A03(AbstractC25226BEj.A0S(obj, obj2), (InterfaceC16820sZ) this.A03, this.A02, A00(this));
                break;
            case Process.SIGTERM /* 15 */:
                AbstractC27653CHy.A00((Modifier) this.A03, AbstractC25226BEj.A0S(obj, obj2), A00(this), this.A02);
                break;
            case 16:
                CIU.A00(AbstractC25226BEj.A0S(obj, obj2), (InterfaceC16820sZ) this.A03, this.A02, A00(this));
                break;
            case 17:
                AbstractC28443Cgr.A03((Modifier) this.A03, AbstractC25226BEj.A0S(obj, obj2), this.A02, A00(this));
                break;
            case 18:
                AbstractC28398Cg4.A02(AbstractC25226BEj.A0S(obj, obj2), (InterfaceC16660sJ) this.A03, this.A02, A00(this));
                break;
            case Process.SIGSTOP /* 19 */:
                AbstractC28398Cg4.A03(AbstractC25226BEj.A0S(obj, obj2), (InterfaceC16660sJ) this.A03, this.A02, A00(this));
                break;
            case 20:
                AbstractC27689CJi.A00(AbstractC25226BEj.A0S(obj, obj2), (ImageUrl) this.A03, this.A02, A00(this));
                break;
            case 21:
                AbstractC28325CeD.A01(AbstractC25226BEj.A0S(obj, obj2), (C54695ODv) this.A03, this.A02, A00(this));
                break;
            default:
                C5Tl c5Tl = (C5Tl) obj;
                if (AbstractC25228BEl.A0B(obj2) == 2 && c5Tl.Bxj()) {
                    c5Tl.Em9();
                    break;
                } else {
                    if (C0fH.A02()) {
                        C0fH.A01(819112990, "com.instagram.rtc.presentation.connecting.RtcCallConnectingViewHolder.inflateAiConnectingComposeView.<anonymous>.<anonymous> (RtcCallConnectingViewHolder.kt:152)");
                    }
                    c5Tl.Eno(-2122462293);
                    C51894Mwc c51894Mwc = (C51894Mwc) this.A03;
                    Object EEc = c5Tl.EEc();
                    Object obj3 = C5UI.A00;
                    if (EEc == obj3) {
                        EEc = c51894Mwc.A01;
                        c5Tl.FBy(EEc);
                    }
                    String str = (String) EEc;
                    C117505Tk A0J = AbstractC25225BEi.A0J(c5Tl);
                    Object A0q = AbstractC25227BEk.A0q(c5Tl, -2122460487);
                    if (A0q == obj3) {
                        A0q = AbstractC001800i.A0J(c51894Mwc.A03);
                        c5Tl.FBy(A0q);
                    }
                    C117505Tk.A0I(A0J);
                    Object A0q2 = AbstractC25227BEk.A0q(c5Tl, -2122457932);
                    if (A0q2 == obj3) {
                        A0q2 = c51894Mwc.A02;
                        c5Tl.FBy(A0q2);
                    }
                    String str2 = (String) A0q2;
                    C117505Tk.A0I(A0J);
                    if (c51894Mwc.A07) {
                        c5Tl.Eno(-1371570913);
                        BHE A002 = BHA.A00(DP3.A00);
                        z = c51894Mwc.A05;
                        cws = null;
                        A06 = AbstractC28503Chw.A07(A002, 1.3f, C5AD.A01);
                        A01 = C5UA.A01(c5Tl, new C30547DcU(A0q, c51894Mwc, str, str2, 1), 1629349269);
                        i3 = 199680;
                    } else {
                        if (c51894Mwc.A06) {
                            c5Tl.Eno(-1370598846);
                            z = c51894Mwc.A05;
                            cws = null;
                            A06 = AbstractC28503Chw.A06(C25245BFe.A01(AbstractC25328BIx.A00, this.A02, this.A01), 0.0f);
                            i2 = 1679449292;
                            c30538DcL = new C30547DcU(A0q, c51894Mwc, str, str2, 2);
                        } else {
                            c5Tl.Eno(-1370126344);
                            z = c51894Mwc.A05;
                            cws = null;
                            A06 = AbstractC28503Chw.A06(C25245BFe.A01(AbstractC25328BIx.A00, this.A02, this.A01), 0.0f);
                            i2 = 1437876652;
                            c30538DcL = new C30538DcL(A0q, str2, str, 2);
                        }
                        A01 = C5UA.A01(c5Tl, c30538DcL, i2);
                        i3 = 196608;
                    }
                    AbstractC28495Cho.A07(cws, A06, c5Tl, cws, cws, A01, i3, 22, z);
                    if (AbstractC25227BEk.A1a(A0J)) {
                        C0fH.A00(343570900);
                        break;
                    }
                }
                break;
        }
        return C0eB.A00;
    }
}
