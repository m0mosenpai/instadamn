package X;

import android.widget.CompoundButton;
import com.facebook.react.uimanager.UIManagerHelper;

/* renamed from: X.Soz, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63532Soz implements CompoundButton.OnCheckedChangeListener {
    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        Q21 q21 = (Q21) compoundButton.getContext();
        int id = compoundButton.getId();
        X9J A05 = UIManagerHelper.A05(q21, id);
        if (A05 != null) {
            A05.APn(new R69(UIManagerHelper.A00(q21), id, z));
        }
    }
}
