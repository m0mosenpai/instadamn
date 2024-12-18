package X;

import android.content.Context;
import android.content.res.Resources;
import android.widget.EditText;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.TzO, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C66087TzO implements InterfaceC64682wS {
    public long A00;
    public EditText A01;
    public final Integer A02 = C05F.A00;

    @Override // X.InterfaceC64682wS
    public final int CI5(Context context, UserSession userSession) {
        C14360o3.A0B(context, 0);
        EditText editText = this.A01;
        int i = 0;
        if (editText == null) {
            return 0;
        }
        Resources resources = context.getResources();
        if (resources != null) {
            i = resources.getDimensionPixelOffset(R.dimen.abc_select_dialog_padding_start_material) / 2;
        }
        return editText.getPaddingStart() + i;
    }

    @Override // X.InterfaceC64682wS
    public final Integer AwQ() {
        return this.A02;
    }

    @Override // X.InterfaceC64682wS
    public final int CIc(Context context) {
        EditText editText = this.A01;
        if (editText != null) {
            return editText.getHeight() + (editText.getPaddingBottom() / 2);
        }
        return 0;
    }

    @Override // X.InterfaceC64682wS
    public final boolean CV9() {
        return false;
    }

    @Override // X.InterfaceC64682wS
    public final long EM4() {
        return this.A00;
    }
}
