package X;

import android.text.TextUtils;
import android.widget.TextView;
import com.facebook.R;

/* renamed from: X.GIy, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36775GIy implements InterfaceC58091PpG {
    public final /* synthetic */ C31721DwQ A00;

    public C36775GIy(C31721DwQ c31721DwQ) {
        this.A00 = c31721DwQ;
    }

    @Override // X.InterfaceC58091PpG
    public final void Dpw(C59644QjO c59644QjO) {
        int i;
        int i2;
        if (c59644QjO != null) {
            C31721DwQ c31721DwQ = this.A00;
            if (c31721DwQ.getActivity() != null && c31721DwQ.isAdded()) {
                if (AbstractC31178DnM.A1X(C06090Tz.A05, c31721DwQ.A0V, 36312690062591191L)) {
                    i = 3;
                    i2 = 890;
                } else {
                    i = 2;
                    i2 = 49;
                }
                String optionalStringField = c59644QjO.getOptionalStringField(i, AbstractC58317Pt9.A00(i2));
                if (!TextUtils.isEmpty(optionalStringField)) {
                    c31721DwQ.A11 = true;
                    TextView A0T = AbstractC166997dE.A0T(c31721DwQ.A03, R.id.diversity_designation);
                    c31721DwQ.A0J = A0T;
                    A0T.setText(optionalStringField);
                }
            }
        }
    }

    @Override // X.InterfaceC58091PpG
    public final void onFailure() {
        C31721DwQ c31721DwQ = this.A00;
        if (c31721DwQ.getActivity() != null && c31721DwQ.isAdded()) {
            C0w9.A03(C31721DwQ.__redex_internal_original_name, "Failed to load profile diversity info");
        }
    }
}
