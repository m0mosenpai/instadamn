package X;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.common.ui.base.IgTextView;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Iv7, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42712Iv7 implements InterfaceC81453kF {
    public final RecyclerView A00;
    public final IgTextView A01;
    public final IgTextView A02;

    public C42712Iv7(View view) {
        C14360o3.A0B(view, 1);
        this.A01 = AbstractC25231BEo.A0d(view, R.id.intent_aware_ad_rifu_header_title);
        this.A02 = AbstractC25231BEo.A0d(view, R.id.intent_aware_ad_rifu_see_all_button);
        this.A00 = (RecyclerView) AbstractC166997dE.A0R(view, R.id.intent_aware_ad_rifu_recycler_view);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x004f A[RETURN] */
    @Override // X.InterfaceC81443kE
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object BEG(X.C38321qM r7) {
        /*
            r6 = this;
            androidx.recyclerview.widget.RecyclerView r0 = r6.A00
            X.2UU r5 = r0.A0A
            X.3Fe r4 = r0.A0D
            boolean r0 = r5 instanceof X.C38374GuB
            r3 = 0
            if (r0 == 0) goto L55
            if (r4 == 0) goto L55
            boolean r0 = r4 instanceof androidx.recyclerview.widget.LinearLayoutManager
            if (r0 == 0) goto L55
            X.GuB r5 = (X.C38374GuB) r5
            r2 = r7
            boolean r0 = r7.A5N()
            java.util.List r1 = r5.A02
            if (r0 == 0) goto L22
            com.instagram.common.session.UserSession r0 = r5.A04
            X.1qM r2 = r7.A1g(r0)
        L22:
            int r1 = r1.indexOf(r2)
            androidx.recyclerview.widget.LinearLayoutManager r4 = (androidx.recyclerview.widget.LinearLayoutManager) r4
            int r0 = r4.A1a()
            int r1 = r1 - r0
            if (r1 < 0) goto L55
            int r0 = r4.A0T()
            if (r1 >= r0) goto L55
            android.view.View r0 = r4.A0e(r1)
            if (r0 == 0) goto L53
            java.lang.Object r1 = r0.getTag()
        L3f:
            boolean r0 = r1 instanceof X.C38520Gwg
            if (r0 == 0) goto L50
            X.Gwg r1 = (X.C38520Gwg) r1
            if (r1 == 0) goto L51
            X.1qM r0 = r1.A00
        L49:
            boolean r0 = X.C14360o3.A0K(r0, r7)
            if (r0 == 0) goto L55
            return r1
        L50:
            r1 = r3
        L51:
            r0 = r3
            goto L49
        L53:
            r1 = r3
            goto L3f
        L55:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C42712Iv7.BEG(X.1qM):java.lang.Object");
    }

    @Override // X.InterfaceC81443kE
    public final Map BRm() {
        RecyclerView recyclerView = this.A00;
        C2UU c2uu = recyclerView.A0A;
        AbstractC70663Fe abstractC70663Fe = recyclerView.A0D;
        if ((c2uu instanceof C38374GuB) && abstractC70663Fe != null && (abstractC70663Fe instanceof LinearLayoutManager)) {
            LinkedHashMap A1I = AbstractC166987dD.A1I();
            C38374GuB c38374GuB = (C38374GuB) c2uu;
            int itemCount = c38374GuB.getItemCount();
            for (int i = 0; i < itemCount; i++) {
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) abstractC70663Fe;
                Object A0X = AbstractC37302Gc3.A0X(linearLayoutManager.A0d(linearLayoutManager.A1a() + i));
                Object A0O = AbstractC001800i.A0O(c38374GuB.A02, i);
                if (A0X != null && A0O != null) {
                    A1I.put(A0O, A0X);
                }
            }
            return A1I;
        }
        return AbstractC166987dD.A1I();
    }
}
