package X;

import android.os.Build;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import java.io.Serializable;

/* renamed from: X.D5u, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C29652D5u extends C0YY implements InterfaceC16820sZ {
    public final /* synthetic */ Fragment A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29652D5u(Fragment fragment) {
        super(0);
        this.A00 = fragment;
    }

    @Override // X.InterfaceC16820sZ
    public final Object invoke() {
        Object A0m;
        if (Serializable.class.isAssignableFrom(String.class)) {
            Fragment fragment = this.A00;
            int i = Build.VERSION.SDK_INT;
            Bundle requireArguments = fragment.requireArguments();
            if (i >= 33) {
                A0m = requireArguments.getSerializable("CAROUSEL_CHILD_ID_ARGUMENT", Object.class);
            } else {
                A0m = AbstractC25228BEl.A11(requireArguments, "CAROUSEL_CHILD_ID_ARGUMENT");
            }
        } else if (AbstractC25226BEj.A1a(String.class)) {
            A0m = AbstractC25231BEo.A0m(this.A00, "CAROUSEL_CHILD_ID_ARGUMENT");
        } else {
            throw AbstractC25231BEo.A0i("CAROUSEL_CHILD_ID_ARGUMENT");
        }
        if (!(A0m instanceof String)) {
            return null;
        }
        return A0m;
    }
}