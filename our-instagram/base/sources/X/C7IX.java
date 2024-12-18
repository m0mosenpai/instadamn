package X;

import android.app.Activity;
import android.content.Context;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.common.session.UserSession;
import com.instagram.direct.messagethread.DirectMessageListLinearLayoutManager;
import com.instagram.direct.messagethread.store.intf.MessageListLayoutManager;
import java.util.List;
import java.util.Map;

/* renamed from: X.7IX, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7IX extends C2UU implements C7IY {
    public C66362zD A00;
    public C5GW A01;
    public C163547Tr A02;
    public C7IZ A03;
    public AnonymousClass988 A04;
    public C7IM A05;
    public boolean A06;
    public final Context A07;
    public final View.OnLongClickListener A08;
    public final C55952hg A09;
    public final UserSession A0A;
    public final C160667Ia A0B;
    public final C160697Id A0C;
    public final InterfaceC163837Ux A0D;
    public final C98N A0E;
    public final Object A0F;
    public final InterfaceC16660sJ A0G;

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0105, code lost:
    
        if (r0.A2P == r7.A0U) goto L47;
     */
    @Override // X.C7IY
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void FCY(X.C7IM r29) {
        /*
            Method dump skipped, instructions count: 765
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C7IX.FCY(X.7IM):void");
    }

    @Override // X.C2UU
    public final /* bridge */ /* synthetic */ C3OO onCreateViewHolder(ViewGroup viewGroup, int i) {
        C3OO c3oo;
        InterfaceC16660sJ dho;
        C14360o3.A0B(viewGroup, 0);
        int EnB = C2UL.A00.EnB(i);
        C5GW c5gw = this.A01;
        if (c5gw == null) {
            C14360o3.A0F("viewHolderPreloader");
            throw C00O.createAndThrow();
        }
        C3OO AXD = c5gw.AXD(i);
        if (AXD == null) {
            C09530e4 c09530e4 = (C09530e4) ((Map) this.A0B.A0G.getValue()).get(Integer.valueOf(i));
            if (c09530e4 == null || (dho = (InterfaceC16660sJ) c09530e4.A00) == null) {
                dho = new DHO(i, 15, this);
            }
            c3oo = (C3OO) dho.invoke(viewGroup);
        } else {
            c3oo = AXD;
        }
        String name = c3oo.getClass().getName();
        C14360o3.A07(name);
        boolean z = false;
        if (AXD != null) {
            z = true;
        }
        C2UL.A00.ASU(AbstractC154506x0.A00(c3oo, null, name, z, ((AbstractC69603Au) this.A0E).A01), EnB);
        return c3oo;
    }

    @Override // X.C2UU
    public final /* bridge */ /* synthetic */ void onViewDetachedFromWindow(C3OO c3oo) {
        C14360o3.A0B(c3oo, 0);
        if ((c3oo instanceof C162357Ox) || (c3oo instanceof C162367Oy)) {
            c3oo.itemView.setMinimumHeight(0);
        }
    }

    public /* synthetic */ C7IX(Activity activity, Context context, View.OnLongClickListener onLongClickListener, AbstractC59962oe abstractC59962oe, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C7WA c7wa, C98K c98k, C7ZX c7zx, AnonymousClass988 anonymousClass988, C7IV c7iv, C7IM c7im, InterfaceC163837Ux interfaceC163837Ux, C98N c98n, C7DK c7dk, C7IN c7in, String str, InterfaceC16660sJ interfaceC16660sJ, boolean z, boolean z2) {
        String A0g;
        C23031Ai A00 = AbstractC23021Ah.A00(userSession);
        C7IZ c7iz = new C7IZ(new ContextThemeWrapper(context, c7im.A01));
        C14360o3.A0B(abstractC59962oe, 3);
        C14360o3.A0B(userSession, 4);
        C14360o3.A0B(c7zx, 5);
        C14360o3.A0B(c7wa, 8);
        C14360o3.A0B(interfaceC11380iw, 11);
        C14360o3.A0B(A00, 19);
        this.A07 = context;
        this.A0A = userSession;
        this.A04 = anonymousClass988;
        this.A05 = c7im;
        this.A08 = onLongClickListener;
        this.A0D = interfaceC163837Ux;
        this.A0E = c98n;
        this.A0G = interfaceC16660sJ;
        this.A03 = c7iz;
        C55952hg A002 = AbstractC13560mi.A00();
        this.A09 = A002;
        this.A0B = new C160667Ia(activity, context, A002, abstractC59962oe, interfaceC11380iw, userSession, c7wa, this.A03, c98k, c7zx, this.A04, c7iv, this.A05, interfaceC163837Ux, c98n, c7dk, c7in, str, z, z2);
        this.A0F = new Object();
        this.A06 = true;
        this.A0C = new C160697Id(userSession);
        InterfaceC19630xq interfaceC19630xq = A00.A01;
        if (interfaceC19630xq.getInt("should_show_like_direct_message_count", 0) < 2) {
            int i = 0;
            for (C2EY c2ey : C2EY.values()) {
                C14360o3.A0B(c2ey, 0);
                if (c2ey == C2EY.A1i) {
                    A0g = "should_show_like_direct_message_nux";
                } else if (c2ey == C2EY.A0q) {
                    A0g = "should_show_like_direct_vm_message_nux";
                } else {
                    A0g = AnonymousClass001.A0g("should_show_like_direct_", c2ey.name(), "_message_nux");
                    C14360o3.A07(A0g);
                }
                if (!interfaceC19630xq.getBoolean(A0g, true)) {
                    i++;
                }
            }
            InterfaceC19610xo ARD = interfaceC19630xq.ARD();
            if (i < 2) {
                ARD.E7D("should_show_like_direct_message_count", i);
            } else {
                ARD.E7D("should_show_like_direct_message_count", 2);
            }
            ARD.apply();
        }
    }

    @Override // X.C7IY
    public final C2UU AZT() {
        C2UU c2uu;
        synchronized (this.A0F) {
            c2uu = this.A00;
            if (c2uu == null) {
                c2uu = this;
            }
        }
        return c2uu;
    }

    @Override // X.C7IY
    public final MessageListLayoutManager BMX(RecyclerView recyclerView) {
        return new DirectMessageListLinearLayoutManager(this.A07, (int) C18U.A01(C06090Tz.A05, this.A0A, 36600843714826265L));
    }

    @Override // X.C7IY
    public final void E5L(List list) {
        C5GW c5gw = this.A01;
        if (c5gw == null) {
            C14360o3.A0F("viewHolderPreloader");
            throw C00O.createAndThrow();
        }
        if (c5gw instanceof C160767Ik) {
            C160767Ik c160767Ik = (C160767Ik) c5gw;
            if (C18U.A06(C06090Tz.A05, c160767Ik.A01, 36320455363207685L)) {
                C160767Ik.A01(c160767Ik, list);
                return;
            }
            return;
        }
        if (c5gw instanceof C48300LYz) {
            C48300LYz c48300LYz = (C48300LYz) c5gw;
            if (!C18U.A06(C06090Tz.A05, c48300LYz.A03, 36317809664071279L)) {
                return;
            }
            C48300LYz.A00(c48300LYz, list);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("LegacyRecyclerViewMessageThreadViewHolderPreloader but was ");
        sb.append(c5gw);
        throw new IllegalStateException(sb.toString());
    }

    @Override // X.C7IY
    public final void E5M(List list) {
        C5GW c5gw = this.A01;
        if (c5gw == null) {
            C14360o3.A0F("viewHolderPreloader");
            throw C00O.createAndThrow();
        }
        if (c5gw instanceof C160767Ik) {
            C160767Ik c160767Ik = (C160767Ik) c5gw;
            if (C18U.A06(C06090Tz.A05, c160767Ik.A01, 36320455363142148L)) {
                C160767Ik.A01(c160767Ik, list);
                return;
            }
            return;
        }
        if (c5gw instanceof C48300LYz) {
            C48300LYz c48300LYz = (C48300LYz) c5gw;
            if (!C18U.A06(C06090Tz.A05, c48300LYz.A03, 36317809664005742L)) {
                return;
            }
            C48300LYz.A00(c48300LYz, list);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("LegacyRecyclerViewMessageThreadViewHolderPreloader but was ");
        sb.append(c5gw);
        throw new IllegalStateException(sb.toString());
    }

    @Override // X.C7IY
    public final void EVD(boolean z) {
        this.A06 = z;
        C66362zD c66362zD = this.A00;
        if (c66362zD != null) {
            c66362zD.A00 = z;
        }
    }

    @Override // X.C2UU
    public final /* bridge */ /* synthetic */ void onBindViewHolder(C3OO c3oo, int i) {
        AbstractC161687Md abstractC161687Md = (AbstractC161687Md) c3oo;
        C14360o3.A0B(abstractC161687Md, 0);
        int En5 = C2UL.A00.En5(abstractC161687Md.mItemViewType);
        C163547Tr c163547Tr = this.A02;
        if (c163547Tr == null) {
            C14360o3.A0F("messageStore");
            throw C00O.createAndThrow();
        }
        C7VC A0S = c163547Tr.A0S(i);
        abstractC161687Md.itemView.setHapticFeedbackEnabled(this.A06);
        abstractC161687Md.itemView.setOnLongClickListener(this.A08);
        abstractC161687Md.A00 = A0S;
        abstractC161687Md.A03(A0S);
        String name = abstractC161687Md.getClass().getName();
        C14360o3.A07(name);
        C2UL.A00.ASR(AbstractC154506x0.A00(abstractC161687Md, A0S, name, false, false), En5);
        C160697Id c160697Id = this.A0C;
        View view = abstractC161687Md.itemView;
        C14360o3.A06(view);
        c160697Id.A00(view, A0S, this.A0D.C7W().A08);
    }

    @Override // X.C2UU
    public final /* bridge */ /* synthetic */ void onViewRecycled(C3OO c3oo) {
        AbstractC161687Md abstractC161687Md = (AbstractC161687Md) c3oo;
        C14360o3.A0B(abstractC161687Md, 0);
        abstractC161687Md.A02();
        abstractC161687Md.A00 = null;
    }

    @Override // X.C2UU
    public final int getItemCount() {
        int A03 = C0f9.A03(1856573148);
        C163547Tr c163547Tr = this.A02;
        if (c163547Tr == null) {
            C14360o3.A0F("messageStore");
            throw C00O.createAndThrow();
        }
        int i = c163547Tr.A0R().A01;
        C0f9.A0A(-2078939534, A03);
        return i;
    }

    @Override // X.C2UU, android.widget.Adapter
    public final int getItemViewType(int i) {
        int A03 = C0f9.A03(-212577595);
        C163547Tr c163547Tr = this.A02;
        if (c163547Tr == null) {
            C14360o3.A0F("messageStore");
            throw C00O.createAndThrow();
        }
        int type = ((C7VC) c163547Tr.A0R().A04(i)).getType();
        C0f9.A0A(-1244557443, A03);
        return type;
    }
}
