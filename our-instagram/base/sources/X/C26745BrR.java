package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import com.facebook.common.dextricks.OptSvcAnalyticsStore;
import java.util.LinkedHashMap;

/* renamed from: X.BrR, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26745BrR extends AbstractC59962oe {
    public static final String __redex_internal_original_name = "EmpathyNudgeFragment";
    public CSZ A00;
    public final InterfaceC1333460b A01 = new C1333560c(32.0f, 0.0f, 32.0f, 16.0f);
    public final InterfaceC09390do A02 = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "media_owner_empathy_nudge_v1";
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        CSZ csz = this.A00;
        if (csz != null) {
            C38321qM c38321qM = csz.A01;
            boolean z = csz.A03;
            C18920wW c18920wW = csz.A00;
            LinkedHashMap A07 = AbstractC06930Yk.A07(AbstractC25230BEn.A1b(MSV.A00(1343), String.valueOf(z)));
            InterfaceC02590Ai A0f = AbstractC166987dD.A0f(c18920wW, MSV.A00(1317));
            A0f.AAP("source_of_action", "heated_thread_empathy");
            A0f.A9M("extra_values", A07);
            A0f.AAP("media_id", c38321qM.getId());
            A0f.AAP(OptSvcAnalyticsStore.LOGGING_KEY_STEP, "impression");
            A0f.Cht();
        }
    }

    public static final void A00(C26745BrR c26745BrR) {
        C3DN A00 = C3DN.A00.A00(c26745BrR.getActivity());
        CSZ csz = c26745BrR.A00;
        if (csz != null && csz.A03) {
            C189478aR A002 = F86.A00(A00);
            if (A002 != null) {
                A002.A0T();
            }
        } else if (A00 != null) {
            A00.A0B();
        }
        CSZ csz2 = c26745BrR.A00;
        if (csz2 != null) {
            csz2.A02.Czu();
        }
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-1032262258);
        ComposeView A00 = AbstractC25319BIo.A00(this, C30482DbR.A00(this, 22), 1734306101);
        C0f9.A09(-1575260093, A02);
        return A00;
    }
}
