package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.HBq, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38919HBq extends AbstractC59962oe {
    public static final String __redex_internal_original_name = "UpcomingEventNotFoundBottomSheetFragment";
    public C41168IKh A00;
    public IHR A01;
    public final InterfaceC09390do A02 = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "upcoming_event_bottom_sheet";
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        this.A00 = new C41168IKh(view);
        UserSession A0r = AbstractC166987dD.A0r(this.A02);
        IHR ihr = this.A01;
        if (ihr == null) {
            str = "viewModel";
        } else {
            C41168IKh c41168IKh = this.A00;
            if (c41168IKh == null) {
                str = "viewHolder";
            } else {
                C14360o3.A0B(A0r, 0);
                Context context = c41168IKh.A03.getContext();
                c41168IKh.A06.setText(ihr.A02);
                c41168IKh.A01.setVisibility(8);
                TextView textView = c41168IKh.A05;
                C14360o3.A0A(context);
                textView.setText(MX0.A02(context, A0r, ihr.A00));
                c41168IKh.A0D.setVisibility(8);
                c41168IKh.A09.setVisibility(0);
                c41168IKh.A0A.setImageResource(R.drawable.instagram_calendar_pano_outline_24);
                c41168IKh.A0B.setVisibility(8);
                TextView textView2 = c41168IKh.A04;
                textView2.setVisibility(0);
                AbstractC31177DnL.A0r(context, textView2, ihr.A01, 2131976232);
                return;
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        IllegalStateException A14;
        int i;
        int A02 = C0f9.A02(1555682146);
        super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        String string = requireArguments.getString(AbstractC111324zv.A00(5536));
        if (string != null) {
            long j = requireArguments.getLong(AbstractC111324zv.A00(5539));
            String string2 = requireArguments.getString(AbstractC111324zv.A00(5535));
            if (string2 != null) {
                this.A01 = new IHR(string, j, string2);
                C0f9.A09(1037580780, A02);
                return;
            } else {
                A14 = AbstractC166987dD.A14("event creator username required");
                i = 197118167;
            }
        } else {
            A14 = AbstractC166987dD.A14("event name required");
            i = -458001376;
        }
        C0f9.A09(i, A02);
        throw A14;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-1590322372);
        C14360o3.A0B(layoutInflater, 0);
        View A0R = AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.layout_upcoming_event_bottom_sheet, false);
        C0f9.A09(192176260, A02);
        return A0R;
    }
}
