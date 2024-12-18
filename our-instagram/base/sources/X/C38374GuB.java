package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.feed.ui.state.IntentAwareAdPivotState;
import java.util.List;

/* renamed from: X.GuB, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38374GuB extends C2UU implements JGD, JGE {
    public IntentAwareAdPivotState A00;
    public HBC A01;
    public List A02;
    public RecyclerView A03;
    public final UserSession A04;
    public final Context A05;
    public final InterfaceC11380iw A06;
    public final InterfaceC61782rf A07;
    public final C64062vR A08;
    public final C60662pp A09;

    @Override // X.C2UU
    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        C14360o3.A0B(recyclerView, 0);
        this.A03 = recyclerView;
    }

    @Override // X.C2UU
    public final C3OO onCreateViewHolder(ViewGroup viewGroup, int i) {
        C14360o3.A0B(viewGroup, 0);
        Context context = this.A05;
        View A0D = AbstractC25227BEk.A0D(LayoutInflater.from(context), viewGroup, R.layout.intent_aware_ad_rifu_card_view, false);
        C38520Gwg c38520Gwg = new C38520Gwg(A0D, context);
        A0D.setTag(c38520Gwg);
        return c38520Gwg;
    }

    @Override // X.JGD
    public final void EEp(int i) {
        if (i < this.A02.size()) {
            this.A02.remove(i);
            notifyItemRemoved(i);
            notifyItemRangeChanged(i, this.A02.size());
            if (this.A02.isEmpty()) {
                C60662pp c60662pp = this.A09;
                HBC hbc = this.A01;
                String str = "intentAwareAdPivot";
                if (hbc != null) {
                    c60662pp.A0S(hbc.getId());
                    C64042vP c64042vP = this.A08.A08;
                    HBC hbc2 = this.A01;
                    if (hbc2 != null) {
                        IntentAwareAdPivotState intentAwareAdPivotState = this.A00;
                        if (intentAwareAdPivotState == null) {
                            str = "intentAwareAdPivotState";
                        } else {
                            c64042vP.A0D(intentAwareAdPivotState, hbc2);
                            return;
                        }
                    }
                }
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:75:0x02fe, code lost:
    
        if (r5 == null) goto L79;
     */
    @Override // X.C2UU
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onBindViewHolder(X.C3OO r41, int r42) {
        /*
            Method dump skipped, instructions count: 869
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C38374GuB.onBindViewHolder(X.3OO, int):void");
    }

    public C38374GuB(Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession, InterfaceC61782rf interfaceC61782rf, C64062vR c64062vR, C60662pp c60662pp) {
        boolean A1V = AbstractC167007dF.A1V(context);
        this.A04 = userSession;
        this.A05 = context;
        this.A06 = interfaceC11380iw;
        this.A08 = c64062vR;
        this.A09 = c60662pp;
        this.A07 = interfaceC61782rf;
        this.A02 = AbstractC166987dD.A1E();
        setHasStableIds(A1V);
    }

    @Override // X.JGE
    public final void Ekj() {
        C38520Gwg c38520Gwg;
        int itemCount = getItemCount();
        if (itemCount >= 0) {
            int i = 0;
            while (true) {
                RecyclerView recyclerView = this.A03;
                C3OO c3oo = null;
                if (recyclerView != null) {
                    c3oo = recyclerView.A0V(i);
                }
                if ((c3oo instanceof C38520Gwg) && (c38520Gwg = (C38520Gwg) c3oo) != null) {
                    if (this.A01 == null) {
                        C14360o3.A0F("intentAwareAdPivot");
                        throw C00O.createAndThrow();
                    }
                    AbstractC47062KrJ.A00(c38520Gwg.A09);
                }
                if (i != itemCount) {
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    @Override // X.C2UU
    public final int getItemCount() {
        int A03 = C0f9.A03(667652370);
        int size = this.A02.size();
        C0f9.A0A(1215558779, A03);
        return size;
    }

    @Override // X.C2UU, android.widget.Adapter
    public final long getItemId(int i) {
        int A03 = C0f9.A03(1379124617);
        String A2u = AbstractC25225BEi.A0x(this.A02, i).A2u();
        if (A2u != null) {
            long parseLong = Long.parseLong(A2u);
            C0f9.A0A(1666335238, A03);
            return parseLong;
        }
        IllegalStateException A0g = AbstractC166997dE.A0g();
        C0f9.A0A(-1342345955, A03);
        throw A0g;
    }
}
