package X;

import android.view.View;
import android.view.Window;
import androidx.fragment.app.FragmentActivity;

/* renamed from: X.2pR, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC60432pR extends AbstractC59972of {
    @Override // androidx.fragment.app.Fragment
    public final AnonymousClass067 createFragmentContainer() {
        return new AnonymousClass067() { // from class: X.2pc
            @Override // X.AnonymousClass067
            public final View A00(int i) {
                Window window;
                AbstractC60432pR abstractC60432pR = AbstractC60432pR.this;
                FragmentActivity activity = abstractC60432pR.getActivity();
                if (activity != null && (window = activity.getWindow()) != null && window.getDecorView() != null) {
                    FragmentActivity activity2 = abstractC60432pR.getActivity();
                    if (activity2 == null) {
                        return null;
                    }
                    return activity2.findViewById(i);
                }
                throw new IllegalStateException("Fragment does not have a Activity view");
            }

            @Override // X.AnonymousClass067
            public final boolean A01() {
                Window window;
                FragmentActivity activity = AbstractC60432pR.this.getActivity();
                if (activity != null && (window = activity.getWindow()) != null && window.peekDecorView() != null) {
                    return true;
                }
                return false;
            }
        };
    }
}
