package X;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.Gtw, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38360Gtw extends C2UU {
    public final Activity A00;
    public final C07X A01;
    public final InterfaceC11380iw A02;
    public final UserSession A03;
    public final C38321qM A04;
    public final List A05;
    public final InterfaceC16660sJ A06;
    public final boolean A07;

    public C38360Gtw(Activity activity, C07X c07x, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C38321qM c38321qM, List list, InterfaceC16660sJ interfaceC16660sJ, boolean z) {
        AbstractC167007dF.A1H(userSession, 2, list);
        this.A00 = activity;
        this.A03 = userSession;
        this.A04 = c38321qM;
        this.A02 = interfaceC11380iw;
        this.A01 = c07x;
        this.A07 = z;
        this.A05 = list;
        this.A06 = interfaceC16660sJ;
    }

    @Override // X.C2UU
    public final void onBindViewHolder(C3OO c3oo, int i) {
        AbstractC25917BdK abstractC25917BdK;
        C14360o3.A0B(c3oo, 0);
        AbstractC29162CtT abstractC29162CtT = (AbstractC29162CtT) AbstractC001800i.A0O(this.A05, i);
        if (abstractC29162CtT != null && (c3oo instanceof C39485HcD) && (abstractC25917BdK = (AbstractC25917BdK) c3oo) != null) {
            abstractC25917BdK.A01(abstractC29162CtT);
        }
    }

    @Override // X.C2UU
    public final C3OO onCreateViewHolder(ViewGroup viewGroup, int i) {
        View inflate = AbstractC31177DnL.A0E(viewGroup, 0).inflate(R.layout.recipe_item_cutout_sticker, viewGroup, false);
        Activity activity = this.A00;
        UserSession userSession = this.A03;
        C38321qM c38321qM = this.A04;
        InterfaceC11380iw interfaceC11380iw = this.A02;
        C07X c07x = this.A01;
        boolean z = this.A07;
        InterfaceC16660sJ interfaceC16660sJ = this.A06;
        AbstractC167007dF.A1H(inflate, 0, interfaceC16660sJ);
        return new C39485HcD(activity, inflate, c07x, interfaceC11380iw, userSession, c38321qM, interfaceC16660sJ, z);
    }

    @Override // X.C2UU
    public final int getItemCount() {
        int A03 = C0f9.A03(619382886);
        int size = this.A05.size();
        C0f9.A0A(1120668420, A03);
        return size;
    }
}
