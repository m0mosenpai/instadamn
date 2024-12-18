package X;

import android.content.ClipboardManager;
import android.view.View;

/* renamed from: X.Fpd, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class ViewOnLongClickListenerC35703Fpd implements View.OnLongClickListener {
    public final /* synthetic */ EIA A00;
    public final /* synthetic */ String A01;

    public ViewOnLongClickListenerC35703Fpd(EIA eia, String str) {
        this.A00 = eia;
        this.A01 = str;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        String str;
        EIA eia = this.A00;
        Object A0X = AbstractC31171DnF.A0X(eia.requireContext());
        C14360o3.A0C(A0X, AbstractC111324zv.A00(68));
        ClipboardManager clipboardManager = (ClipboardManager) A0X;
        String str2 = this.A01;
        if (str2 != null) {
            str = AbstractC002300n.A0d(str2, "\"", "", false);
        } else {
            str = null;
        }
        AbstractC31173DnH.A0x(clipboardManager, "ai_generated_sticker", str);
        C9GR.A07(eia.requireContext(), 2131956830);
        return true;
    }
}
