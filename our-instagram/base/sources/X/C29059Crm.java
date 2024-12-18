package X;

import android.view.View;
import com.facebook.R;

/* renamed from: X.Crm, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C29059Crm implements C2YT {
    public static final C29059Crm A00 = new Object();

    @Override // X.C2YT
    public final C2YU Cgz(C2YR c2yr, long j) {
        C14360o3.A0B(c2yr, 0);
        View A0Q = AbstractC25228BEl.A0Q(c2yr, C26650Bpl.A04);
        AbstractC25231BEo.A0z(A0Q, j);
        return AbstractC25232BEp.A19(Math.max(C78613fT.A03(j), A0Q.getMeasuredWidth()), C2Z3.A00(c2yr.BoZ(), AbstractC77623dm.A0D(c2yr, R.dimen.ai_sticker_creation_suggested_prompt_pill_height)));
    }

    @Override // X.C2VB
    public final /* bridge */ /* synthetic */ boolean CTz(Object obj) {
        return AbstractC25235BEs.A1b(obj, this);
    }
}
