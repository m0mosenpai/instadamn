package X;

import android.view.View;
import android.widget.LinearLayout;
import androidx.core.widget.NestedScrollView;
import com.instagram.direct.ui.polls.PollMessageOptionView;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.Lhu, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48787Lhu implements InterfaceC50478MQg {
    public String A00;
    public C47357Kw6 A01;
    public final Map A03 = AbstractC166987dD.A1I();
    public final List A02 = AbstractC166987dD.A1E();

    private final void A00(View view) {
        LinearLayout linearLayout;
        CharSequence charSequence;
        List list = this.A02;
        if (list.size() > 1) {
            if (list.indexOf(view) == AbstractC31172DnG.A03(list, 1) && (charSequence = (CharSequence) AbstractC166997dE.A0m(this.A03, view.getId())) != null && charSequence.length() == 0) {
                return;
            }
            this.A03.remove(Integer.valueOf(view.getId()));
            list.remove(view);
            C47357Kw6 c47357Kw6 = this.A01;
            if ((view instanceof PollMessageOptionView) && (linearLayout = c47357Kw6.A00.A01) != null) {
                linearLayout.removeView(view);
            }
            A01(this);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0011, code lost:
    
        if (A02(r3) == false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A01(X.C48787Lhu r3) {
        /*
            X.Kw6 r2 = r3.A01
            java.lang.String r0 = r3.A00
            if (r0 == 0) goto L13
            boolean r0 = X.AbstractC001900j.A0T(r0)
            if (r0 != 0) goto L13
            boolean r0 = A02(r3)
            r1 = 1
            if (r0 != 0) goto L14
        L13:
            r1 = 0
        L14:
            X.KD8 r0 = r2.A00
            com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout r0 = r0.A05
            if (r0 == 0) goto L1d
            r0.setPrimaryButtonEnabled(r1)
        L1d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C48787Lhu.A01(X.Lhu):void");
    }

    public static final boolean A02(C48787Lhu c48787Lhu) {
        Map map = c48787Lhu.A03;
        int size = map.size();
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        Iterator A15 = AbstractC166997dE.A15(map);
        if (size > 1) {
            while (A15.hasNext()) {
                Map.Entry A1K = AbstractC166987dD.A1K(A15);
                if (AbstractC001900j.A0T((CharSequence) A1K.getValue())) {
                    AbstractC43594JPz.A1S(A1I, A1K);
                }
            }
            if (A1I.size() > 1) {
                return false;
            }
        } else {
            while (A15.hasNext()) {
                Map.Entry A1K2 = AbstractC166987dD.A1K(A15);
                if (((CharSequence) A1K2.getValue()).length() > 0) {
                    AbstractC43594JPz.A1S(A1I, A1K2);
                }
            }
            if (A1I.isEmpty()) {
                return false;
            }
        }
        return true;
    }

    public final void A03() {
        KD8 kd8 = this.A01.A00;
        PollMessageOptionView pollMessageOptionView = new PollMessageOptionView(kd8.requireContext(), null, 0);
        pollMessageOptionView.setId(View.generateViewId());
        LinearLayout linearLayout = kd8.A01;
        if (linearLayout != null) {
            linearLayout.addView(pollMessageOptionView);
        }
        NestedScrollView nestedScrollView = kd8.A02;
        if (nestedScrollView != null) {
            nestedScrollView.postDelayed(new RunnableC49951M3s(nestedScrollView, pollMessageOptionView), kd8.A0E);
        }
        pollMessageOptionView.A01 = this;
        this.A03.put(Integer.valueOf(pollMessageOptionView.getId()), "");
        this.A02.add(pollMessageOptionView);
    }

    @Override // X.InterfaceC50478MQg
    public final void DHh(View view, boolean z) {
        if (z) {
            A00(view);
        }
    }

    @Override // X.InterfaceC50478MQg
    public final void Dsb(View view, CharSequence charSequence) {
        CharSequence charSequence2;
        if (charSequence != null) {
            Map map = this.A03;
            AbstractC25227BEk.A1O(charSequence, map, view.getId());
            List list = this.A02;
            View view2 = (View) list.get(list.size() - 1);
            if (list.size() < 100 && (charSequence2 = (CharSequence) AbstractC166997dE.A0m(map, view2.getId())) != null && AbstractC25225BEi.A1Y(charSequence2)) {
                A03();
            }
            A01(this);
        }
    }

    public C48787Lhu(C47357Kw6 c47357Kw6) {
        this.A01 = c47357Kw6;
    }

    @Override // X.InterfaceC50478MQg
    public final void Deu(View view) {
        A00(view);
    }
}
