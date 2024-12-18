package X;

import android.view.View;
import com.instagram.aistudio.editor.AiSettingsRepository;

/* renamed from: X.Lu4, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49491Lu4 implements InterfaceC58152PqH {
    public final int A00;
    public final Object A01;
    public final String A02;

    public C49491Lu4(String str, Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = str;
    }

    @Override // X.InterfaceC58152PqH
    public final void onButtonClick(View view) {
        switch (this.A00) {
            case 0:
                ((AiSettingsRepository) this.A01).A09(this.A02);
                return;
            case 1:
                V16.A0C((V16) this.A01, this.A02, "ads_manager", "promotion_list", "promote_row_button");
                return;
            default:
                HDL hdl = (HDL) this.A01;
                String str = ((C38333GtS) hdl.A0D.getValue()).A03;
                if (str != null) {
                    HDL.A05(hdl, str, this.A02, false);
                    return;
                }
                return;
        }
    }

    @Override // X.InterfaceC58152PqH
    public final void onDismiss() {
    }

    @Override // X.InterfaceC58152PqH
    public final void onShow() {
    }

    @Override // X.InterfaceC58152PqH
    public final /* synthetic */ void onTextClick(View view) {
    }
}
