package X;

import android.app.Activity;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.contentnotes.data.immersive.params.ContentNotesImmersiveCreationUiState;
import com.instagram.modal.ModalActivity;
import com.instagram.modal.TransparentModalActivity;
import java.lang.ref.WeakReference;

/* loaded from: classes8.dex */
public final class LJe {
    public static final LJe A00 = new Object();

    public static final void A01(Fragment fragment, UserSession userSession, C45000Jvq c45000Jvq) {
        boolean z;
        Class cls;
        int[] iArr;
        C14360o3.A0B(userSession, 0);
        FragmentActivity activity = fragment.getActivity();
        if (activity != null) {
            z = C28425CgX.A01(activity);
        } else {
            z = false;
        }
        Bundle A002 = A00(userSession, c45000Jvq, z);
        new C4AA(userSession).A00(C05F.A01);
        if (C85363rR.A08(userSession)) {
            cls = TransparentModalActivity.class;
        } else {
            cls = ModalActivity.class;
        }
        C6XJ c6xj = new C6XJ(fragment.getActivity(), A002, userSession, cls, "notes_creation");
        if (!C85363rR.A08(userSession)) {
            c6xj.A07();
        } else {
            if (C28425CgX.A00.A03(userSession)) {
                iArr = ModalActivity.A08;
            } else {
                iArr = C6XJ.A0Q;
            }
            c6xj.A0J = iArr;
        }
        c6xj.A0C(fragment.getActivity());
    }

    public static final Bundle A00(UserSession userSession, C45000Jvq c45000Jvq, boolean z) {
        Bundle A002 = AbstractC61636Rr0.A00(AbstractC166987dD.A1L("replace_note", Boolean.valueOf(c45000Jvq.A0C)), AbstractC166987dD.A1L("content_container_module", c45000Jvq.A05), AbstractC166987dD.A1L("content_event_source", c45000Jvq.A00), AbstractC166987dD.A1L("content_inventory_source", c45000Jvq.A09), AbstractC166987dD.A1L("content_ranking_info_token", c45000Jvq.A0B), AbstractC166987dD.A1L("content_media_position", c45000Jvq.A04), AbstractC166987dD.A1L("content_carousel_child_id", c45000Jvq.A06), AbstractC166987dD.A1L("content_preview_url", c45000Jvq.A01), AbstractC166987dD.A1L("content_id", c45000Jvq.A07), AbstractC166987dD.A1L("content_media_code", c45000Jvq.A08), AbstractC166987dD.A1L("arg_is_in_immersive_mode", Boolean.valueOf(C85363rR.A08(userSession))), AbstractC166987dD.A1L("arg_immersive_content_notes_ui_state", new ContentNotesImmersiveCreationUiState(c45000Jvq.A02, c45000Jvq.A0A, z)));
        Integer num = c45000Jvq.A03;
        if (num != null) {
            A002.putInt("content_carousel_child_index", num.intValue());
        }
        return A002;
    }

    public final void A02(UserSession userSession, C45000Jvq c45000Jvq, WeakReference weakReference) {
        Class cls;
        Activity activity = (Activity) weakReference.get();
        if (activity != null) {
            Bundle A002 = A00(userSession, c45000Jvq, C28425CgX.A01(activity));
            if (C85363rR.A08(userSession)) {
                cls = TransparentModalActivity.class;
            } else {
                cls = ModalActivity.class;
            }
            AbstractC31177DnL.A0n(activity, A002, userSession, cls, "notes_creation");
        }
    }
}
