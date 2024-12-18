package X;

import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.discovery.mediamap.fragment.LocationDetailFragment;
import com.instagram.model.hashtag.Hashtag;
import com.instagram.ui.widget.nametagresultcard.impl.NametagResultCardView;
import com.instagram.user.model.User;

/* renamed from: X.Wfi, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70717Wfi implements InterfaceC42271xH, InterfaceC41501vz {
    public final int A00;
    public final Object A01;

    public C70717Wfi(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.InterfaceC42271xH
    public final /* bridge */ /* synthetic */ boolean A79(Object obj) {
        String str;
        User user;
        switch (this.A00) {
            case 1:
                C70033Cn c70033Cn = (C70033Cn) obj;
                C14360o3.A0B(c70033Cn, 0);
                String id = c70033Cn.A00.getId();
                if (id != null) {
                    V7n v7n = ((V1R) this.A01).A0F;
                    if (v7n == null) {
                        str = "actionBarController";
                        break;
                    } else {
                        for (Object obj2 : v7n.A0B.A03.A00) {
                            if (obj2 instanceof FOC) {
                                FOC foc = (FOC) obj2;
                                if (FVZ.A00(foc) != C05F.A00) {
                                    continue;
                                } else {
                                    Hashtag hashtag = foc.A00;
                                    if (hashtag != null) {
                                        if (hashtag.getId() != null && C14360o3.A0K(hashtag.getId(), id)) {
                                            return true;
                                        }
                                    } else {
                                        throw AbstractC166997dE.A0g();
                                    }
                                }
                            }
                        }
                        return false;
                    }
                } else {
                    return false;
                }
                break;
            case 2:
            case 4:
            default:
                return true;
            case 3:
                C70073Cr c70073Cr = (C70073Cr) obj;
                C14360o3.A0B(c70073Cr, 0);
                V1R v1r = (V1R) this.A01;
                C68034V7f c68034V7f = v1r.A08;
                if (c68034V7f == null) {
                    str = "dataSource";
                    break;
                } else {
                    return c68034V7f.A0A(V1R.A00(v1r), c70073Cr.A00.getId());
                }
            case 5:
                C70073Cr c70073Cr2 = (C70073Cr) obj;
                WXc wXc = (WXc) this.A01;
                if (wXc.A02 == null && (user = wXc.A07) != null && user.getId().equals(c70073Cr2.A00.getId())) {
                    return true;
                }
                return false;
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // X.InterfaceC41501vz
    public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
        int A03;
        int i;
        String str;
        switch (this.A00) {
            case 0:
                A03 = C0f9.A03(2017879127);
                int A032 = C0f9.A03(1534489621);
                C66095TzW.A00(((LocationDetailFragment) this.A01).A01.A03);
                C0f9.A0A(-2018094160, A032);
                i = -1255989174;
                C0f9.A0A(i, A03);
                return;
            case 1:
                A03 = C0f9.A03(1136920567);
                C70033Cn c70033Cn = (C70033Cn) obj;
                int A0N = AbstractC167017dG.A0N(c70033Cn, 794077415);
                V7n v7n = ((V1R) this.A01).A0F;
                if (v7n == null) {
                    str = "actionBarController";
                    C14360o3.A0F(str);
                    throw C00O.createAndThrow();
                }
                v7n.A0B.A01(c70033Cn.A00);
                C0f9.A0A(-287202163, A0N);
                i = -646272978;
                C0f9.A0A(i, A03);
                return;
            case 2:
                A03 = C0f9.A03(2087425837);
                C42251Inb c42251Inb = (C42251Inb) obj;
                int A0N2 = AbstractC167017dG.A0N(c42251Inb, 1882660768);
                C66095TzW c66095TzW = ((V1R) this.A01).A06;
                if (c66095TzW != null) {
                    String id = c42251Inb.A00.getId();
                    if (id != null) {
                        c66095TzW.A03(id);
                        C0f9.A0A(-485216073, A0N2);
                        i = 1501493939;
                        C0f9.A0A(i, A03);
                        return;
                    }
                    IllegalStateException A0g = AbstractC166997dE.A0g();
                    C0f9.A0A(156524126, A0N2);
                    throw A0g;
                }
                str = "adapter";
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            case 3:
                A03 = C0f9.A03(1601868672);
                int A033 = C0f9.A03(-468707442);
                C66095TzW c66095TzW2 = ((V1R) this.A01).A06;
                if (c66095TzW2 != null) {
                    C66095TzW.A00(c66095TzW2);
                    C0f9.A0A(1747737287, A033);
                    i = 1154898976;
                    C0f9.A0A(i, A03);
                    return;
                }
                str = "adapter";
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            case 4:
                A03 = C0f9.A03(-1459250693);
                int A034 = C0f9.A03(1185498367);
                V1F v1f = (V1F) this.A01;
                C65960TxC c65960TxC = v1f.A03;
                if (c65960TxC == null) {
                    str = "dataSource";
                } else {
                    c65960TxC.A04();
                    C52198N8n c52198N8n = v1f.A02;
                    if (c52198N8n == null) {
                        str = "searchAdapter";
                    } else {
                        c52198N8n.A00();
                        C0f9.A0A(1489449310, A034);
                        i = -2025427555;
                        C0f9.A0A(i, A03);
                        return;
                    }
                }
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            default:
                A03 = C0f9.A03(487068664);
                C70073Cr c70073Cr = (C70073Cr) obj;
                int A035 = C0f9.A03(1883330627);
                WXc wXc = (WXc) this.A01;
                if (wXc.A03()) {
                    CircularImageView circularImageView = wXc.A05;
                    if (circularImageView != null) {
                        circularImageView.setVisibility(8);
                    }
                    CircularImageView circularImageView2 = wXc.A04;
                    if (circularImageView2 != null) {
                        circularImageView2.setVisibility(8);
                    }
                    NametagResultCardView nametagResultCardView = wXc.A06;
                    nametagResultCardView.getClass();
                    nametagResultCardView.A02(wXc.A0E, wXc.A0G, c70073Cr.A00);
                }
                C0f9.A0A(-81660715, A035);
                i = -600263738;
                C0f9.A0A(i, A03);
                return;
        }
    }
}
