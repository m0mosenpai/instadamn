package X;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.instagram.common.gallery.Medium;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;

/* renamed from: X.LeP, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48587LeP implements InterfaceC186098Nd {
    public final /* synthetic */ KC9 A00;

    @Override // X.InterfaceC186098Nd
    public final void D93(Medium medium, Integer num) {
        String str;
        C140966Yy A0r;
        Fragment A00;
        C14240no c14240no;
        int id;
        String str2;
        C14360o3.A0B(medium, 0);
        if (medium.A05()) {
            KC9 kc9 = this.A00;
            kc9.requireActivity();
            AbstractC12990ll A0o = AbstractC166987dD.A0o(kc9.A04);
            C14360o3.A0B(A0o, 1);
            str = "entryPoint";
            if (kc9.A01) {
                A00 = new KC8();
                String str3 = medium.A0X;
                Integer num2 = kc9.A00;
                if (num2 != null) {
                    C14360o3.A0B(str3, 0);
                    Bundle A0b = AbstractC166987dD.A0b();
                    A0b.putString("file_path", str3);
                    A0b.putString("source_media_id", null);
                    A0b.putString(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, AbstractC46682Kkz.A00(num2));
                    A0b.putBoolean("from_create_btn", true);
                    A00.setArguments(A0b);
                    View view = kc9.mView;
                    if (view != null) {
                        c14240no = new C14240no(kc9.getParentFragmentManager());
                        id = view.getId();
                        str2 = KC8.__redex_internal_original_name;
                        c14240no.A0D(A00, str2, id);
                        c14240no.A00();
                        return;
                    }
                    return;
                }
            } else {
                String str4 = medium.A0X;
                Integer num3 = kc9.A00;
                if (num3 != null) {
                    KC8 A002 = LD7.A00(num3, str4, null);
                    A0r = AbstractC25225BEi.A0r(kc9.requireActivity(), A0o);
                    A0r.A09();
                    A0r.A0B(null, A002);
                    A0r.A04();
                    return;
                }
            }
            C14360o3.A0F(str);
            throw C00O.createAndThrow();
        }
        if (!medium.Cff()) {
            return;
        }
        KC9 kc92 = this.A00;
        ((C44447JlF) kc92.A03.getValue()).A00.Egh(medium);
        kc92.requireActivity();
        AbstractC12990ll A0o2 = AbstractC166987dD.A0o(kc92.A04);
        C14360o3.A0B(A0o2, 1);
        str = "entryPoint";
        if (kc92.A01) {
            Integer num4 = kc92.A00;
            if (num4 != null) {
                A00 = AbstractC46680Kkx.A00(num4, null, true);
                View view2 = kc92.mView;
                if (view2 == null) {
                    return;
                }
                c14240no = new C14240no(kc92.getParentFragmentManager());
                id = view2.getId();
                str2 = KCA.__redex_internal_original_name;
                c14240no.A0D(A00, str2, id);
                c14240no.A00();
                return;
            }
        } else {
            Integer num5 = kc92.A00;
            if (num5 != null) {
                KCA A003 = AbstractC46680Kkx.A00(num5, null, false);
                A0r = AbstractC25225BEi.A0r(kc92.requireActivity(), A0o2);
                A0r.A09();
                A0r.A0B(null, A003);
                A0r.A04();
                return;
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC186098Nd
    public final void DSY(Medium medium) {
    }

    public C48587LeP(KC9 kc9) {
        this.A00 = kc9;
    }

    @Override // X.InterfaceC186098Nd
    public final void D92() {
        KC9 kc9 = this.A00;
        if (kc9.A01) {
            AbstractC43594JPz.A19(kc9, kc9.getParentFragmentManager());
        } else {
            AbstractC25226BEj.A1Q(kc9);
        }
    }
}
