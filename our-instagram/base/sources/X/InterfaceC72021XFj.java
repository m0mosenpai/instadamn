package X;

import androidx.fragment.app.Fragment;
import com.instagram.business.promote.model.PromoteData;
import java.util.ArrayList;

/* renamed from: X.XFj, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public interface InterfaceC72021XFj {
    ArrayList BIR();

    PromoteData BiY();

    static PromoteData A00(Fragment fragment) {
        C1UC requireActivity = fragment.requireActivity();
        C14360o3.A0C(requireActivity, AbstractC43591JPw.A00(13));
        return ((InterfaceC72021XFj) requireActivity).BiY();
    }
}
