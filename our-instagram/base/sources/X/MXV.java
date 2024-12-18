package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes9.dex */
public final class MXV extends Handler {
    public final int A00;
    public final Object A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MXV(Looper looper, Object obj, int i) {
        super(looper);
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        InterfaceC58117Ppg interfaceC58117Ppg;
        C66362zD c66362zD;
        AbstractC70663Fe abstractC70663Fe;
        int A03;
        View childAt;
        C66362zD c66362zD2;
        switch (this.A00) {
            case 0:
                C14360o3.A0B(message, 0);
                MXB mxb = (MXB) this.A01;
                int i = message.what;
                for (Integer num : C05F.A00(26)) {
                    if (OXm.A00(num) == i) {
                        mxb.A0A(null, num);
                        return;
                    }
                }
                throw AbstractC25230BEn.A0n("Unknown type id ", i);
            case 1:
                N5Z n5z = (N5Z) this.A01;
                if (!n5z.isResumed()) {
                    return;
                }
                int i2 = message.what;
                if (i2 == 0) {
                    N5Z.A07(n5z);
                    if (n5z.A02 == null) {
                        return;
                    }
                } else {
                    if (i2 != 1) {
                        return;
                    }
                    if (n5z.A0Q) {
                        n5z.A0Q = false;
                        removeMessages(1);
                        removeMessages(0);
                        N5Z.A06(n5z);
                        return;
                    }
                    N5Z.A0C(n5z, true);
                }
                N5Z.A05(n5z);
                return;
            default:
                C14360o3.A0B(message, 0);
                if (message.what == 0) {
                    C55123Obk c55123Obk = (C55123Obk) this.A01;
                    MZA mza = c55123Obk.A03;
                    if (mza.A0G() && c55123Obk.A02.isResumed()) {
                        if (!c55123Obk.A06.isEmpty()) {
                            C55123Obk.A01(c55123Obk);
                            Iterator it = c55123Obk.A05.iterator();
                            while (it.hasNext()) {
                                Map.Entry A1K = AbstractC166987dD.A1K(it);
                                OKu oKu = (OKu) A1K.getKey();
                                if (((L31) A1K.getValue()).A00 > 0.25f) {
                                    O8C o8c = c55123Obk.A04;
                                    C14360o3.A0B(oKu, 0);
                                    String str = oKu.A01;
                                    if (C14360o3.A0K(str, "header_media_section")) {
                                        interfaceC58117Ppg = o8c.A01;
                                    } else {
                                        RecyclerView recyclerView = o8c.A00;
                                        if (recyclerView != null && (abstractC70663Fe = recyclerView.A0D) != null) {
                                            int i3 = -1;
                                            if (!str.equals("header_media_section")) {
                                                C2UU c2uu = recyclerView.A0A;
                                                if ((c2uu instanceof C66362zD) && (c66362zD2 = (C66362zD) c2uu) != null) {
                                                    i3 = c66362zD2.A02(str);
                                                }
                                            }
                                            Integer valueOf = Integer.valueOf(i3);
                                            if (i3 != -1 && valueOf != null && (A03 = AbstractC72193Ls.A03(abstractC70663Fe, recyclerView, i3)) != -1 && (childAt = recyclerView.getChildAt(A03)) != null && (childAt.getTag() instanceof C52612NPh)) {
                                                Object tag = childAt.getTag();
                                                C14360o3.A0C(tag, "null cannot be cast to non-null type com.instagram.mediakit.ui.holder.MediaKitPostsSectionHolder");
                                                RecyclerView recyclerView2 = (RecyclerView) AbstractC166987dD.A17(((C52612NPh) tag).A01);
                                                AbstractC70663Fe abstractC70663Fe2 = recyclerView2.A0D;
                                                if (abstractC70663Fe2 != null) {
                                                    C2UU c2uu2 = recyclerView2.A0A;
                                                    C14360o3.A0C(c2uu2, "null cannot be cast to non-null type com.instagram.common.recyclerview.IgRecyclerViewAdapter");
                                                    View childAt2 = recyclerView2.getChildAt(AbstractC72193Ls.A03(abstractC70663Fe2, recyclerView2, ((C66362zD) c2uu2).A02(oKu.A02)));
                                                    if (childAt2 != null && (childAt2.getTag() instanceof JFS)) {
                                                        Object tag2 = childAt2.getTag();
                                                        C14360o3.A0C(tag2, "null cannot be cast to non-null type com.instagram.discovery.video.binder.HasDiscoveryVideoViewHolder");
                                                        interfaceC58117Ppg = (InterfaceC58117Ppg) ((JFS) tag2);
                                                    }
                                                } else {
                                                    continue;
                                                }
                                            }
                                        }
                                    }
                                    if (interfaceC58117Ppg != null && oKu.A03) {
                                        C38321qM c38321qM = oKu.A00;
                                        int i4 = -1;
                                        if (!str.equals("header_media_section")) {
                                            RecyclerView recyclerView3 = o8c.A00;
                                            C2UU c2uu3 = null;
                                            if (recyclerView3 != null) {
                                                c2uu3 = recyclerView3.A0A;
                                            }
                                            if ((c2uu3 instanceof C66362zD) && (c66362zD = (C66362zD) c2uu3) != null) {
                                                i4 = c66362zD.A02(str);
                                            }
                                        }
                                        C14360o3.A0B(c38321qM, 1);
                                        MZB mzb = new MZB(null, interfaceC58117Ppg, c38321qM, i4, 0, true);
                                        if (oKu.A01()) {
                                            mza.A06 = true;
                                        } else {
                                            mza.A06 = false;
                                        }
                                        mza.A0C(mzb);
                                        if (c55123Obk.A00) {
                                            MZB mzb2 = mza.A04;
                                            if (mza.A06 && mzb2 != null) {
                                                ((C4S7) mzb2).A00 = true;
                                            }
                                        }
                                        c55123Obk.A00 = false;
                                        return;
                                    }
                                }
                            }
                            return;
                        }
                        return;
                    }
                    if (!mza.A0H()) {
                        return;
                    }
                    C55123Obk.A00(c55123Obk);
                    return;
                }
                return;
        }
    }

    public MXV(N5Z n5z) {
        this.A00 = 1;
        this.A01 = n5z;
    }
}
