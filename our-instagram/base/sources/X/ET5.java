package X;

import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.facebook.common.callercontext.CallerContext;
import com.instagram.common.session.UserSession;
import com.instagram.nux.cal.activity.CalActivity;
import com.instagram.nux.cal.model.ConnectContent;

/* loaded from: classes6.dex */
public final class ET5 extends C1P1 {
    public final String A00;
    public final /* synthetic */ ELU A01;

    public ET5(ELU elu, String str) {
        this.A01 = elu;
        this.A00 = str;
    }

    @Override // X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        C0f9.A0A(-766108777, C0f9.A03(-1094002553));
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = C0f9.A03(-1026592139);
        ConnectContent connectContent = (ConnectContent) obj;
        int A0N = AbstractC167017dG.A0N(connectContent, -203295133);
        ELU elu = this.A01;
        if (elu.getActivity() != null) {
            CallerContext callerContext = ELU.A0B;
            if (elu.A01 == null) {
                C14360o3.A0F("calHelper");
                throw C00O.createAndThrow();
            }
            FragmentActivity requireActivity = elu.requireActivity();
            String str = this.A00;
            EnumC33360Eot enumC33360Eot = EnumC33360Eot.A03;
            UserSession A0r = AbstractC166987dD.A0r(elu.A06);
            C14360o3.A0B(A0r, 5);
            Intent intent = new Intent(requireActivity, (Class<?>) CalActivity.class);
            FWK.A01(intent, connectContent, C05F.A01, str, 3233);
            intent.putExtra("argument_entry_point", enumC33360Eot);
            AbstractC31173DnH.A18(intent, A0r);
            Bundle A0b = AbstractC166987dD.A0b();
            A0b.putParcelable("extra_cal_nux_content", connectContent);
            AbstractC31181DnP.A0K(requireActivity, intent, A0b, 3233);
        }
        C0f9.A0A(-1371348043, A0N);
        C0f9.A0A(-146085279, A03);
    }
}
