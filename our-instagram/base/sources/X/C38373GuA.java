package X;

import android.content.Context;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.feed.ui.state.IntentAwareAdPivotState;
import java.util.List;

/* renamed from: X.GuA, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38373GuA extends C2UU implements JGD {
    public RecyclerView A00;
    public IntentAwareAdPivotState A01;
    public HBC A02;
    public C38394GuV A03;
    public List A04;
    public final Context A05;
    public final Handler A06;
    public final ViewPager2 A07;
    public final UserSession A08;
    public final C64062vR A09;
    public final boolean A0A;
    public final InterfaceC11380iw A0B;
    public final InterfaceC61782rf A0C;
    public final C60662pp A0D;

    @Override // X.C2UU
    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        C14360o3.A0B(recyclerView, 0);
        this.A00 = recyclerView;
    }

    @Override // X.C2UU
    public final C3OO onCreateViewHolder(ViewGroup viewGroup, int i) {
        C14360o3.A0B(viewGroup, 0);
        UserSession userSession = this.A08;
        Context context = this.A05;
        View A0D = AbstractC25227BEk.A0D(LayoutInflater.from(context), viewGroup, R.layout.intent_aware_ad_pivot_card_view, false);
        C38521Gwh c38521Gwh = new C38521Gwh(context, A0D, userSession);
        A0D.setTag(c38521Gwh);
        return c38521Gwh;
    }

    @Override // X.JGD
    public final void EEp(int i) {
        List list = this.A04;
        C14360o3.A0B(list, 0);
        int A05 = AbstractC25226BEj.A05(list);
        this.A04.remove(i);
        notifyItemRemoved(i);
        notifyItemRangeChanged(i, this.A04.size());
        if (this.A04.isEmpty()) {
            C60662pp c60662pp = this.A0D;
            HBC hbc = this.A02;
            if (hbc != null) {
                c60662pp.A0S(hbc.getId());
                C64042vP c64042vP = this.A09.A08;
                HBC hbc2 = this.A02;
                if (hbc2 != null) {
                    IntentAwareAdPivotState intentAwareAdPivotState = this.A01;
                    if (intentAwareAdPivotState != null) {
                        c64042vP.A0D(intentAwareAdPivotState, hbc2);
                    }
                    C14360o3.A0F("intentAwareAdPivotState");
                    throw C00O.createAndThrow();
                }
            }
            C14360o3.A0F("intentAwareAdPivot");
            throw C00O.createAndThrow();
        }
        C38394GuV c38394GuV = this.A03;
        if (c38394GuV != null) {
            if (i == A05) {
                IntentAwareAdPivotState intentAwareAdPivotState2 = this.A01;
                if (intentAwareAdPivotState2 != null) {
                    List list2 = this.A04;
                    C14360o3.A0B(list2, 0);
                    intentAwareAdPivotState2.A01 = AbstractC25226BEj.A05(list2);
                }
                C14360o3.A0F("intentAwareAdPivotState");
                throw C00O.createAndThrow();
            }
            Context context = this.A05;
            int size = this.A04.size();
            IntentAwareAdPivotState intentAwareAdPivotState3 = this.A01;
            if (intentAwareAdPivotState3 != null) {
                I27.A00(context, c38394GuV, size, intentAwareAdPivotState3.A01);
                return;
            }
            C14360o3.A0F("intentAwareAdPivotState");
            throw C00O.createAndThrow();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x03de  */
    @Override // X.C2UU
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onBindViewHolder(X.C3OO r43, int r44) {
        /*
            Method dump skipped, instructions count: 1012
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C38373GuA.onBindViewHolder(X.3OO, int):void");
    }

    public C38373GuA(Context context, ViewPager2 viewPager2, InterfaceC11380iw interfaceC11380iw, UserSession userSession, InterfaceC61782rf interfaceC61782rf, C64062vR c64062vR, C60662pp c60662pp, boolean z) {
        boolean A1V = AbstractC167007dF.A1V(context);
        this.A08 = userSession;
        this.A05 = context;
        this.A0B = interfaceC11380iw;
        this.A09 = c64062vR;
        this.A0D = c60662pp;
        this.A0C = interfaceC61782rf;
        this.A0A = z;
        this.A07 = viewPager2;
        this.A04 = AbstractC166987dD.A1E();
        this.A06 = AbstractC167007dF.A0J();
        setHasStableIds(A1V);
    }

    @Override // X.C2UU
    public final int getItemCount() {
        int A03 = C0f9.A03(552940490);
        int size = this.A04.size();
        C0f9.A0A(-1036635730, A03);
        return size;
    }

    @Override // X.C2UU, android.widget.Adapter
    public final long getItemId(int i) {
        int A03 = C0f9.A03(1247257804);
        String A2u = AbstractC25225BEi.A0x(this.A04, i).A2u();
        if (A2u != null) {
            long parseLong = Long.parseLong(A2u);
            C0f9.A0A(531378848, A03);
            return parseLong;
        }
        IllegalStateException A0g = AbstractC166997dE.A0g();
        C0f9.A0A(557582587, A03);
        throw A0g;
    }
}
