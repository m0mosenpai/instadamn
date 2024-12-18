package X;

import android.text.SpannableString;
import android.text.style.CharacterStyle;
import java.util.List;

/* renamed from: X.RDi, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C60613RDi extends SLH {
    public final List A00;

    @Override // X.SLH
    public final SpannableString A00(InterfaceC65383TjG interfaceC65383TjG, boolean z) {
        CharacterStyle characterStyle;
        C14360o3.A0B(interfaceC65383TjG, 1);
        SpannableString A00 = super.A00(interfaceC65383TjG, z);
        C14360o3.A0C(A00, "null cannot be cast to non-null type android.text.SpannableString");
        for (SGC sgc : this.A00) {
            int i = sgc.A02;
            if (i >= 0 && (characterStyle = sgc.A00) != null) {
                A00.setSpan(characterStyle, i, i + sgc.A01, 33);
            }
        }
        return A00;
    }

    public C60613RDi(CharSequence charSequence, List list, List list2) {
        super(charSequence, list);
        this.A00 = list2;
    }
}
