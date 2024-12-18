package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;

/* renamed from: X.9f9, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C214719f9 extends AbstractC59962oe {
    public static final String __redex_internal_original_name = "PotatoCaptureFragment";
    public C81Y A00;
    public C81I A01;
    public final InterfaceC09390do A04 = AbstractC60492pY.A02(this);
    public final String A05 = "potato_capture_fragment";
    public final InterfaceC09390do A03 = AbstractC09440dt.A00(EnumC09460dv.A02, new C57522Pfw(this, 3));
    public final InterfaceC25214BDm A02 = new C23766Afd(this, 0);

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        C57982lB.A0B.A05(requireActivity(), new RunnableC24433AsE(this));
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return this.A05;
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A04);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-799549687);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.potato_capture_fragment, viewGroup, false);
        C81I c81i = new C81I();
        this.A01 = c81i;
        registerLifecycleListener(c81i);
        C14360o3.A0A(inflate);
        C0f9.A09(-1172752024, A02);
        return inflate;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(1334522666);
        super.onDestroyView();
        unregisterLifecycleListener(this.A01);
        C81I c81i = this.A01;
        if (c81i != null) {
            c81i.onDestroyView();
        }
        this.A01 = null;
        C0f9.A09(1607014650, A02);
    }
}
