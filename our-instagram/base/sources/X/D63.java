package X;

import android.os.Build;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import java.io.Serializable;

/* loaded from: classes5.dex */
public final class D63 extends C0YY implements InterfaceC16820sZ {
    public final /* synthetic */ Fragment A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D63(Fragment fragment) {
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
                A0m = requireArguments.getSerializable("arg_prompt_note_id", Object.class);
            } else {
                A0m = AbstractC25228BEl.A11(requireArguments, "arg_prompt_note_id");
            }
        } else if (AbstractC25226BEj.A1a(String.class)) {
            A0m = AbstractC25231BEo.A0m(this.A00, "arg_prompt_note_id");
        } else {
            throw AbstractC25231BEo.A0i("arg_prompt_note_id");
        }
        if (!(A0m instanceof String)) {
            return null;
        }
        return A0m;
    }
}
