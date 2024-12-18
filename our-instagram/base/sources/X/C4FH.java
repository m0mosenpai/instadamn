package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.4FH, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4FH extends AbstractC66422zJ {
    public final InterfaceC11380iw A00;
    public final UserSession A01;
    public final C57112jm A02;
    public final C4F8 A03;
    public final C23031Ai A04;
    public final boolean A05;
    public final boolean A06;

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        C14360o3.A0B(viewGroup, 0);
        C14360o3.A0B(layoutInflater, 1);
        int i = C3OO.FLAG_ADAPTER_FULLUPDATE;
        View inflate = layoutInflater.inflate(R.layout.friend_map_item_pog, viewGroup, false);
        C14360o3.A07(inflate);
        return new C25613BUa(inflate, this);
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void unbind(C3OO c3oo) {
        C14360o3.A0B(c3oo, 0);
        this.A02.A04(c3oo.itemView);
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x0136, code lost:
    
        if (r1.A06 == false) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00fd A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x018f A[LOOP:1: B:44:0x0189->B:46:0x018f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x013b  */
    @Override // X.AbstractC66422zJ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ void bind(X.InterfaceC66482zP r21, X.C3OO r22) {
        /*
            Method dump skipped, instructions count: 445
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C4FH.bind(X.2zP, X.3OO):void");
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C4F3.class;
    }

    public C4FH(InterfaceC11380iw interfaceC11380iw, UserSession userSession, C57112jm c57112jm, C4F8 c4f8) {
        this.A01 = userSession;
        this.A00 = interfaceC11380iw;
        this.A02 = c57112jm;
        this.A03 = c4f8;
        C23031Ai A00 = AbstractC23021Ah.A00(userSession);
        this.A04 = A00;
        this.A05 = ((Boolean) A00.A1Q.CES(A00, C23031Ai.A8c[505])).booleanValue();
        this.A06 = C23031Ai.A07(A00, "friend_map_notes_tray_badge_shown_timestamp", 3L);
    }
}
