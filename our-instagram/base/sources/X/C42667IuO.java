package X;

import android.text.style.ClickableSpan;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.model.hashtag.HashtagImpl;

/* renamed from: X.IuO, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42667IuO implements InterfaceC85423rX {
    public final int A00;
    public final Object A01;

    public C42667IuO(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.InterfaceC85423rX
    public final void D40(ClickableSpan clickableSpan, View view, String str) {
        if (this.A00 != 0) {
            C14360o3.A0B(str, 0);
            HashtagImpl A00 = AbstractC1120253r.A00(str);
            C38936HCj c38936HCj = (C38936HCj) this.A01;
            C41117IIi c41117IIi = c38936HCj.A03;
            if (c41117IIi != null) {
                C143536ds c143536ds = c41117IIi.A03;
                if (((AbstractC149546o6) c143536ds).A00 != null) {
                    C84823qW c84823qW = new C84823qW(A00.F59());
                    c84823qW.A1g = "text";
                    ((AbstractC149546o6) c143536ds).A00.A00(A00, c41117IIi.A01, c84823qW);
                }
            }
            IB8.A00(c38936HCj.requireActivity(), c38936HCj, AbstractC166987dD.A0r(c38936HCj.A06), A00);
            return;
        }
        C14360o3.A0B(str, 0);
        C41646Ibe c41646Ibe = ((HFJ) this.A01).A03.A0B;
        FragmentActivity requireActivity = c41646Ibe.A02.requireActivity();
        UserSession userSession = c41646Ibe.A03;
        C140966Yy A0r = AbstractC25225BEi.A0r(requireActivity, userSession);
        A0r.A0D(WE2.A02(userSession, AbstractC1120253r.A00(str), c41646Ibe.A04.getModuleName(), "DEFAULT"));
        A0r.A04();
    }
}
