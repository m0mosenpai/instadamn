package X;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.modal.ModalActivity;

/* renamed from: X.LhJ, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48751LhJ implements InterfaceC50465MPt {
    public final FragmentActivity A00;
    public final UserSession A01;

    public C48751LhJ(UserSession userSession, FragmentActivity fragmentActivity) {
        C14360o3.A0B(userSession, 1);
        this.A01 = userSession;
        this.A00 = fragmentActivity;
    }

    @Override // X.InterfaceC50465MPt
    public final void DW0(L5X l5x) {
    }

    @Override // X.InterfaceC50465MPt
    public final void DW3(L5X l5x) {
        EnumC46303KeZ enumC46303KeZ;
        Integer num;
        View view;
        C14360o3.A0B(l5x, 0);
        boolean z = l5x.A0I;
        C09530e4 A1L = AbstractC166987dD.A1L("replace_note", Boolean.valueOf(z));
        C09530e4 A1L2 = AbstractC166987dD.A1L("arg_prompt_note_id", l5x.A09);
        C09530e4 A1L3 = AbstractC166987dD.A1L("arg_prompt_note_text", l5x.A0A);
        C09530e4 A1L4 = AbstractC166987dD.A1L("arg_friend_map_note_latitude", l5x.A07);
        C09530e4 A1L5 = AbstractC166987dD.A1L("arg_friend_map_note_longitude", l5x.A08);
        boolean z2 = l5x.A0G;
        C09530e4 A1L6 = AbstractC166987dD.A1L("profile_creation_point", Boolean.valueOf(z2));
        boolean z3 = l5x.A0C;
        Bundle A00 = AbstractC61636Rr0.A00(A1L, A1L2, A1L3, A1L4, A1L5, A1L6, AbstractC166987dD.A1L("arg_feed_creation_point", Boolean.valueOf(z3)), AbstractC166987dD.A1L("arg_is_animated_bubble_tapped", Boolean.valueOf(l5x.A0B)));
        View view2 = l5x.A00;
        if (view2 != null && (view = l5x.A01) != null) {
            FragmentActivity fragmentActivity = this.A00;
            C3AY[] c3ayArr = {new C3AY(view2, AbstractC111324zv.A00(744)), new C3AY(view, "bubbleTransition")};
            Intent putExtra = new Intent(fragmentActivity, (Class<?>) ModalActivity.class).putExtra(AbstractC111324zv.A00(2402), "notes_creation").putExtra(AbstractC111324zv.A00(213), A00);
            putExtra.setFlags(268435456);
            C12260kU.A00.A07().A09(fragmentActivity, fragmentActivity, putExtra, c3ayArr);
        } else {
            AbstractC31177DnL.A0n(this.A00, A00, this.A01, ModalActivity.class, "notes_creation");
        }
        UserSession userSession = this.A01;
        C135976Dc A01 = AbstractC135966Db.A01(userSession);
        if (z) {
            enumC46303KeZ = EnumC46303KeZ.A0Q;
        } else {
            enumC46303KeZ = EnumC46303KeZ.A0J;
        }
        A01.A0D(enumC46303KeZ);
        if (z2) {
            num = C05F.A0Y;
        } else if (l5x.A0E) {
            num = C05F.A0C;
        } else if (z3) {
            num = C05F.A0j;
        } else {
            num = C05F.A00;
        }
        new C4AA(userSession).A00(num);
    }
}
