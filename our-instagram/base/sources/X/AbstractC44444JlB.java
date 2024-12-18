package X;

import android.content.Context;
import androidx.fragment.app.Fragment;

/* renamed from: X.JlB, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC44444JlB extends Fragment {
    public MRQ A00;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        C14360o3.A0B(context, 0);
        super.onAttach(context);
        if (context instanceof MO0) {
            this.A00 = ((MO0) context).AzR();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDetach() {
        int A02 = C0f9.A02(86582017);
        super.onDetach();
        this.A00 = null;
        C0f9.A09(456156007, A02);
    }
}
