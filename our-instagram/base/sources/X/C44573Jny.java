package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.direct.thread.analytics.DirectThreadAnalyticsParams;
import java.util.List;

/* renamed from: X.Jny, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44573Jny extends C2UU {
    public int A00;
    public List A01;
    public List A02;
    public final Context A03;
    public final C65422xe A04;
    public final UserSession A05;
    public final InterfaceC50422MOc A06;
    public final InterfaceC83713oG A07;
    public final AbstractC65412xd A08;
    public final InterfaceC11380iw A09;
    public final DirectThreadAnalyticsParams A0A;

    public C44573Jny(Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession, InterfaceC50422MOc interfaceC50422MOc, InterfaceC83713oG interfaceC83713oG) {
        InterfaceC83703oF A02;
        C14360o3.A0B(userSession, 2);
        this.A03 = context;
        this.A05 = userSession;
        this.A09 = interfaceC11380iw;
        this.A06 = interfaceC50422MOc;
        this.A07 = interfaceC83713oG;
        this.A00 = (AbstractC13880nE.A0A(context) - (this.A03.getResources().getDimensionPixelSize(R.dimen.afi_indicator_arrow_margin_top) * 2)) / 3;
        C16930sl c16930sl = C16930sl.A00;
        this.A01 = c16930sl;
        this.A02 = c16930sl;
        InterfaceC83713oG interfaceC83713oG2 = this.A07;
        DirectThreadAnalyticsParams directThreadAnalyticsParams = null;
        if (interfaceC83713oG2 != null && (A02 = AbstractC140946Yw.A02(interfaceC83713oG2)) != null) {
            C81663kb A0c = AbstractC43594JPz.A0c(this.A05, AbstractC140956Yx.A01(A02));
            if (A0c != null) {
                directThreadAnalyticsParams = AbstractC1578876x.A01(A0c, false);
            }
        }
        this.A0A = directThreadAnalyticsParams;
        JnK jnK = new JnK(0);
        this.A08 = jnK;
        this.A04 = new C65422xe(jnK, this);
    }

    @Override // X.C2UU
    public final C3OO onCreateViewHolder(ViewGroup viewGroup, int i) {
        C14360o3.A0B(viewGroup, 0);
        if (i != 0) {
            if (i == 1) {
                View A0D = AbstractC25227BEk.A0D(LayoutInflater.from(this.A03), viewGroup, R.layout.layout_thread_detail_shared_loading_indicator, false);
                C14360o3.A0B(A0D, 1);
                return new C3OO(A0D);
            }
            throw AbstractC166987dD.A12("invalid type");
        }
        View inflate = LayoutInflater.from(this.A03).inflate(R.layout.layout_thread_detail_shared_photos_and_videos_item, viewGroup, false);
        AbstractC43593JPy.A1B(inflate, this.A00);
        int i2 = C3OO.FLAG_ADAPTER_FULLUPDATE;
        C50363MLp c50363MLp = new C50363MLp(22, inflate, this);
        return new C44750JrX(inflate, this.A09, this.A05, c50363MLp);
    }

    @Override // X.C2UU
    public final void onViewAttachedToWindow(C3OO c3oo) {
        C44750JrX c44750JrX;
        C57112jm c57112jm;
        C14360o3.A0B(c3oo, 0);
        if ((c3oo instanceof C44750JrX) && (c57112jm = (c44750JrX = (C44750JrX) c3oo).A04) != null) {
            C59072n8 A00 = C59062n7.A00("", "", c44750JrX.toString());
            A00.A00(new C37421Ge1(c44750JrX, 0));
            c57112jm.A05(c44750JrX.A07, A00.A01());
        }
    }

    @Override // X.C2UU
    public final void onViewDetachedFromWindow(C3OO c3oo) {
        C44750JrX c44750JrX;
        C57112jm c57112jm;
        C14360o3.A0B(c3oo, 0);
        if ((c3oo instanceof C44750JrX) && (c57112jm = (c44750JrX = (C44750JrX) c3oo).A04) != null) {
            c57112jm.A04(c44750JrX.A07);
        }
    }

    @Override // X.C2UU
    public final void onViewRecycled(C3OO c3oo) {
        MRJ mrj;
        C14360o3.A0B(c3oo, 0);
        if ((c3oo instanceof C44750JrX) && (mrj = ((C44750JrX) c3oo).A00) != null) {
            mrj.DfP();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A00(java.util.List r30) {
        /*
            Method dump skipped, instructions count: 277
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C44573Jny.A00(java.util.List):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x012f, code lost:
    
        if (r11.ordinal() == 1) goto L55;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C2UU
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onBindViewHolder(X.C3OO r19, int r20) {
        /*
            Method dump skipped, instructions count: 534
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C44573Jny.onBindViewHolder(X.3OO, int):void");
    }

    @Override // X.C2UU
    public final int getItemCount() {
        int A03 = C0f9.A03(-1349536907);
        int size = this.A04.A02.size();
        C0f9.A0A(-772628291, A03);
        return size;
    }

    @Override // X.C2UU, android.widget.Adapter
    public final int getItemViewType(int i) {
        int i2;
        int A03 = C0f9.A03(-768597781);
        Object obj = this.A04.A02.get(i);
        if (obj instanceof K2N) {
            i2 = 0;
        } else if (obj instanceof G3N) {
            i2 = 1;
        } else {
            B4Z A00 = B4Z.A00();
            C0f9.A0A(371880590, A03);
            throw A00;
        }
        C0f9.A0A(1835203783, A03);
        return i2;
    }
}
