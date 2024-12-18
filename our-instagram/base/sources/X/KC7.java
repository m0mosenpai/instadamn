package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* loaded from: classes8.dex */
public abstract class KC7 extends AbstractC59962oe implements InterfaceC60072op {
    public static final String __redex_internal_original_name = "BaseAlbumPickerFragment";
    public Jn9 A00;
    public final InterfaceC09390do A01 = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "album_picker";
    }

    public final Jn9 A01() {
        Jn9 jn9 = this.A00;
        if (jn9 != null) {
            return jn9;
        }
        C14360o3.A0F("viewModel");
        throw C00O.createAndThrow();
    }

    @Override // X.AbstractC59962oe
    public final AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A01);
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        if (this instanceof KNU) {
            KNU knu = (KNU) this;
            if (knu.A03 != null) {
                KNU.A00(knu);
                knu.A01().CwM();
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        boolean z;
        int A02 = C0f9.A02(74727009);
        super.onCreate(bundle);
        FragmentActivity requireActivity = requireActivity();
        UserSession A0r = AbstractC166987dD.A0r(this.A01);
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null) {
            z = bundle2.getBoolean("args_is_photo_only");
        } else {
            z = false;
        }
        Jn9 jn9 = (Jn9) new C52942bb(new KGH(A0r, requireActivity, z), requireActivity).A00(Jn9.class);
        C14360o3.A0B(jn9, 0);
        this.A00 = jn9;
        C0f9.A09(-239107602, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(-107779318);
        super.onDestroyView();
        if (C18U.A06(C06090Tz.A05, getSession(), 36330638731133903L)) {
            Jn9 A01 = A01();
            A01.A00 = null;
            A01.A03.A02.A08(A01.A01);
        }
        C0f9.A09(-942980740, A02);
    }
}
