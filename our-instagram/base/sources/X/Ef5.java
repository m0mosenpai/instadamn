package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.modal.ModalActivity;

/* loaded from: classes6.dex */
public final class Ef5 extends Ef6 {
    public static final String __redex_internal_original_name = "FxCalFlowFragmentImpl";
    public final C006802i A00;

    public final void A01(Fragment fragment, AbstractC12990ll abstractC12990ll, String str, String str2, int i) {
        C14360o3.A0B(abstractC12990ll, 0);
        C14360o3.A0B(str, 2);
        if (!"ig_interop".equals(str)) {
            FVN.A01(abstractC12990ll, true);
        }
        Bundle A0F = AbstractC31174DnI.A0F("flow", str);
        A0F.putString(AbstractC111324zv.A00(1156), str2);
        C6XJ A0L = AbstractC31171DnF.A0L(fragment.getActivity(), A0F, abstractC12990ll, ModalActivity.class, "fxcal_flow");
        if (str.equals(EnumC72412Xd8.A0P.A01())) {
            A0L.A08();
        }
        A0L.A0D(fragment, i);
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "fxcal_flow";
    }

    public Ef5() {
        C006802i c006802i = C006802i.A0p;
        C14360o3.A07(c006802i);
        this.A00 = c006802i;
    }

    public static final String A00(String str, String str2) {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append('\"');
        A1C.append(str);
        A1C.append("\":\"");
        A1C.append(str2);
        A1C.append('\"');
        return A1C.toString();
    }

    @Override // X.Ef6, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(-1160679146);
        C006802i c006802i = this.A00;
        c006802i.markerStart(857807376);
        String str = ((Ef6) this).A01;
        if (str == null) {
            str = "";
        }
        c006802i.markerAnnotate(857807376, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, str);
        super.onCreate(bundle);
        C0f9.A09(4244993, A02);
    }
}
