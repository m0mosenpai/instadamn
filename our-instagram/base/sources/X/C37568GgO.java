package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.IgImageView;
import java.util.List;

/* renamed from: X.GgO, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37568GgO implements InterfaceC149606oD {
    public C38321qM A02;
    public J28 A03;
    public final Context A05;
    public final InterfaceC11380iw A06;
    public final UserSession A07;
    public int A00 = -1;
    public int A01 = -1;
    public List A04 = AbstractC166987dD.A1E();

    private final void A00() {
        C39440HbS c39440HbS;
        IgImageView BGm;
        C5TA c5ta;
        J28 j28 = this.A03;
        if (j28 != null && (c5ta = j28.A01) != null) {
            c5ta.A09("paused_for_replay");
        }
        J28 j282 = this.A03;
        if (j282 != null && (c39440HbS = j282.A00) != null && (BGm = c39440HbS.A02.BGm()) != null) {
            BGm.startAnimation(j282.A02);
        }
        this.A00 = (this.A00 + 1) % this.A04.size();
        A01(this);
    }

    public static final void A01(C37568GgO c37568GgO) {
        J28 j28;
        int i = c37568GgO.A00;
        String str = null;
        String A0h = AbstractC37301Gc2.A0h(c37568GgO.A02);
        C39440HbS c39440HbS = (C39440HbS) AbstractC001800i.A0O(c37568GgO.A04, i);
        if (c39440HbS != null) {
            str = c39440HbS.A00.getId();
        }
        if (C14360o3.A0K(A0h, str)) {
            J28 j282 = c37568GgO.A03;
            if (j282 != null) {
                j282.A03(true, false);
                return;
            }
            return;
        }
        C39440HbS c39440HbS2 = (C39440HbS) AbstractC001800i.A0O(c37568GgO.A04, c37568GgO.A00);
        if (c39440HbS2 == null) {
            return;
        }
        if (!C14360o3.A0K(AbstractC37301Gc2.A0h(c37568GgO.A02), c39440HbS2.A00.getId()) && (j28 = c37568GgO.A03) != null) {
            j28.A02(c39440HbS2, false);
        }
        c37568GgO.A01 = c37568GgO.A00;
    }

    @Override // X.InterfaceC149606oD
    public final void DzY(C38321qM c38321qM) {
        if (c38321qM != null) {
            this.A02 = c38321qM;
            if (this.A00 != -1) {
                int i = this.A01;
                String str = null;
                String id = c38321qM.getId();
                C39440HbS c39440HbS = (C39440HbS) AbstractC001800i.A0O(this.A04, i);
                if (c39440HbS != null) {
                    str = c39440HbS.A00.getId();
                }
                if (C14360o3.A0K(id, str)) {
                    this.A00 = this.A01;
                    A01(this);
                    this.A01 = -1;
                }
            }
        }
    }

    @Override // X.InterfaceC149606oD
    public final void onProgressUpdate(int i, int i2, boolean z) {
        if (i > Math.min(3000, i2)) {
            A00();
        }
    }

    public C37568GgO(Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession) {
        this.A05 = context;
        this.A07 = userSession;
        this.A06 = interfaceC11380iw;
    }

    @Override // X.InterfaceC149606oD
    public final void onCompletion() {
        A00();
    }
}
