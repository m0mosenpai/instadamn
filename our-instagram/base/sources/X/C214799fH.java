package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;

/* renamed from: X.9fH, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C214799fH extends AbstractC59962oe implements InterfaceC60072op {
    public static final String __redex_internal_original_name = "VideoInPogCaptureFragment";
    public C81Y A00;
    public C81I A01;
    public final InterfaceC09390do A03 = AbstractC09440dt.A00(EnumC09460dv.A02, new C50246MHb(this, 42));
    public final InterfaceC25214BDm A02 = new C23766Afd(this, 3);
    public final InterfaceC09390do A04 = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return AbstractC111324zv.A00(3294);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        AbstractC167007dF.A0z(this, new RunnableC24794AyG(view, (ViewGroup) view.findViewById(R.id.video_note_in_pog_capture_fragment_container), this));
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A04);
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        C81Y c81y = this.A00;
        if (c81y != null) {
            return c81y.A06();
        }
        return false;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-147935981);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.fragment_video_pog_in_note_creation_capture, viewGroup, false);
        C81I c81i = new C81I();
        registerLifecycleListener(c81i);
        this.A01 = c81i;
        C14360o3.A0A(inflate);
        C0f9.A09(-1424305873, A02);
        return inflate;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(-1638373614);
        super.onDestroyView();
        unregisterLifecycleListener(this.A01);
        C81I c81i = this.A01;
        if (c81i != null) {
            c81i.onDestroyView();
        }
        this.A01 = null;
        C0f9.A09(-1049366461, A02);
    }
}
