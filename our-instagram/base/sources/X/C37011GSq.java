package X;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import java.io.Serializable;

/* renamed from: X.GSq, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C37011GSq extends C0YY implements InterfaceC16820sZ {
    public final /* synthetic */ Fragment A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C37011GSq(Fragment fragment) {
        super(0);
        this.A00 = fragment;
    }

    @Override // X.InterfaceC16820sZ
    public final Object invoke() {
        Object A0m;
        if (Serializable.class.isAssignableFrom(Boolean.class)) {
            Fragment fragment = this.A00;
            int i = Build.VERSION.SDK_INT;
            Bundle requireArguments = fragment.requireArguments();
            if (i >= 33) {
                A0m = requireArguments.getSerializable("should_pin_to_profile", Object.class);
            } else {
                A0m = requireArguments.getSerializable("should_pin_to_profile");
                if (A0m == null) {
                    A0m = null;
                }
            }
        } else if (Parcelable.class.isAssignableFrom(Boolean.class)) {
            A0m = AbstractC25231BEo.A0m(this.A00, "should_pin_to_profile");
        } else {
            throw AbstractC25231BEo.A0i("should_pin_to_profile");
        }
        if (!(A0m instanceof Boolean)) {
            return null;
        }
        return A0m;
    }
}
