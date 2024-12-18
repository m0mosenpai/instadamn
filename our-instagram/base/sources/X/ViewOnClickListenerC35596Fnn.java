package X;

import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.threadkey.impl.MsysThreadId;
import java.util.BitSet;
import java.util.HashMap;

/* renamed from: X.Fnn, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class ViewOnClickListenerC35596Fnn implements View.OnClickListener {
    public final /* synthetic */ EnumC223459tc A00;
    public final /* synthetic */ C7Vn A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;

    public ViewOnClickListenerC35596Fnn(EnumC223459tc enumC223459tc, C7Vn c7Vn, String str, String str2) {
        this.A01 = c7Vn;
        this.A00 = enumC223459tc;
        this.A02 = str;
        this.A03 = str2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05 = C0f9.A05(-303565974);
        C7Vn c7Vn = this.A01;
        EnumC223459tc enumC223459tc = this.A00;
        String str = this.A02;
        String str2 = this.A03;
        C14360o3.A0B(enumC223459tc, 0);
        AnonymousClass983 anonymousClass983 = c7Vn.A00;
        UserSession userSession = anonymousClass983.A10;
        String A00 = C7Vn.A00(c7Vn);
        boolean z = anonymousClass983.A0b instanceof MsysThreadId;
        InterfaceC60442pS interfaceC60442pS = anonymousClass983.A1Q;
        C14360o3.A0B(interfaceC60442pS, 6);
        C162337Ov.A05(enumC223459tc, null, interfaceC60442pS, userSession, A00, str2, 2, z, false);
        C36002Fv0 c36002Fv0 = C36002Fv0.A00;
        FragmentActivity requireActivity = anonymousClass983.A0u.requireActivity();
        C62862tP A01 = C62862tP.A01(null, requireActivity, c36002Fv0, userSession);
        HashMap A1G = AbstractC166987dD.A1G();
        HashMap A1G2 = AbstractC166987dD.A1G();
        BitSet A0j = AbstractC31171DnF.A0j(1);
        A1G.put("appealable_entity_id", str);
        A0j.set(0);
        A1G.put("ig_thread_id", str2);
        C36026FvO c36026FvO = new C36026FvO(4);
        if (A0j.nextClearBit(0) >= 1) {
            FTe.A00(c36026FvO, "com.bloks.www.xfac.lightweight.intervention", A1G, A1G2).A00(requireActivity, A01);
            C0f9.A0C(-1010961018, A05);
            return;
        }
        throw AbstractC31173DnH.A0f();
    }
}
