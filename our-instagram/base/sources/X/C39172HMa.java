package X;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.api.schemas.MusicProduct;
import com.instagram.common.session.UserSession;

/* renamed from: X.HMa, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39172HMa extends AbstractC38513GwY implements JGL {
    public C3PE A00;
    public C3PE A01;
    public final TextView A02;
    public final JPg A03;
    public final View A04;
    public final View A05;
    public final TextView A06;
    public final TextView A07;
    public final TextView A08;
    public final GridLayoutManager A09;
    public final LinearLayoutManager A0A;
    public final RecyclerView A0B;
    public final UserSession A0C;
    public final C38348Gtk A0D;

    /* JADX WARN: Removed duplicated region for block: B:26:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A03(com.instagram.api.schemas.AudioBrowserPlaylistType r13, X.InterfaceC43451JHp r14, int r15, boolean r16) {
        /*
            Method dump skipped, instructions count: 392
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C39172HMa.A03(com.instagram.api.schemas.AudioBrowserPlaylistType, X.JHp, int, boolean):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C39172HMa(View view, C07X c07x, MusicProduct musicProduct, UserSession userSession, C9PK c9pk, JPg jPg, C50664MYh c50664MYh, C50669MYn c50669MYn, C23031Ai c23031Ai, boolean z) {
        super(view);
        boolean A1V = AbstractC167007dF.A1V(userSession);
        AbstractC25234BEr.A0k(3, jPg, musicProduct, c23031Ai, c50669MYn);
        C14360o3.A0B(c50664MYh, 8);
        AbstractC25229BEm.A1J(c9pk, 9, c07x);
        this.A0C = userSession;
        this.A03 = jPg;
        this.A04 = AbstractC166987dD.A0c(view, R.id.preview_container);
        this.A02 = AbstractC25230BEn.A0Q(view, R.id.title);
        TextView textView = (TextView) AbstractC166997dE.A0S(view, R.id.see_all);
        this.A07 = textView;
        this.A08 = AbstractC167007dF.A0N(view, R.id.subheader);
        this.A05 = AbstractC166997dE.A0S(view, R.id.music_track_divider);
        RecyclerView recyclerView = (RecyclerView) AbstractC166997dE.A0S(view, R.id.preview_items);
        this.A0B = recyclerView;
        TextView textView2 = (TextView) AbstractC166997dE.A0S(view, R.id.bottom_see_all);
        this.A06 = textView2;
        recyclerView.setItemAnimator(new UGH());
        Context context = recyclerView.getContext();
        AbstractC166997dE.A18(context, textView, 2131968040);
        AbstractC166997dE.A18(context, textView2, 2131968040);
        this.A0D = new C38348Gtk(c07x, musicProduct, userSession, c9pk, jPg, c50664MYh, c50669MYn, c23031Ai, z);
        this.A0A = new LinearLayoutManager(context);
        this.A09 = new GridLayoutManager(AbstractC37301Gc2.A03(this), A1V ? 1 : 0, 0, false);
        C3P9 A0s = AbstractC166987dD.A0s(textView);
        A0s.A07 = A1V;
        C37846Gl0.A00(A0s, this, 4);
        C3P9 A0s2 = AbstractC166987dD.A0s(textView2);
        A0s2.A07 = A1V;
        C37846Gl0.A00(A0s2, this, 5);
    }

    private final void A01() {
        this.A04.setPadding(0, AbstractC167017dG.A06(AbstractC31172DnG.A05(this)), 0, 0);
    }

    @Override // X.JGL
    public final void FCh(JIN jin, float f) {
        Object A0V;
        int A00 = this.A0D.A00(jin);
        if (A00 >= 0 && (A0V = this.A0B.A0V(A00)) != null) {
            ((JGL) A0V).FCh(jin, f);
        }
    }
}
