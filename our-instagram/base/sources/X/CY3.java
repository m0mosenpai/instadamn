package X;

import androidx.compose.ui.Modifier;
import com.instagram.compose.ui.bouncy.BouncyClickableElement;
import kotlin.Deprecated;
import kotlin.ReplaceWith;

/* loaded from: classes5.dex */
public abstract class CY3 {
    public static final Modifier A01(C5Tl c5Tl, Modifier modifier, InterfaceC16820sZ interfaceC16820sZ) {
        return A00(c5Tl, modifier, null, null, null, interfaceC16820sZ, 0.0f, 0.0f, 0.0f, 0.0f, 255, false);
    }

    @Deprecated(message = "Use [BouncyIndication] on the Modifier.clickable directly.", replaceWith = @ReplaceWith(expression = "combinedClickable(interactionSource = remember { MutableInteractionSource() }, indication = BouncyIndication(pressedScale = pressedScale, pressStiffness = pressStiffness, unpressStiffness = unpressStiffness, initialClickedVelocity = initialClickedVelocity), enabled = enabled, onClickLabel = onClickLabel, role = role, onClick = onClick, onLongClick = onLongClick )", imports = {"androidx.compose.foundation.combinedClickable"}))
    public static final Modifier A00(C5Tl c5Tl, Modifier modifier, C5XQ c5xq, String str, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2, float f, float f2, float f3, float f4, int i, boolean z) {
        InterfaceC16820sZ interfaceC16820sZ3 = interfaceC16820sZ;
        C5XQ c5xq2 = c5xq;
        String str2 = str;
        float f5 = f4;
        float f6 = f3;
        float f7 = f2;
        float f8 = f;
        AbstractC167007dF.A1J(modifier, 0, interfaceC16820sZ2);
        c5Tl.Eno(-796097350);
        boolean A1V = AbstractC25226BEj.A1V(i & 1, z);
        if ((i & 2) != 0) {
            f8 = 0.9f;
        }
        if ((i & 4) != 0) {
            f7 = 400.0f;
        }
        if ((i & 8) != 0) {
            f6 = 400.0f;
        }
        if ((i & 16) != 0) {
            f5 = 0.0f;
        }
        if ((i & 32) != 0) {
            str2 = null;
        }
        if ((i & 64) != 0) {
            c5xq2 = null;
        }
        if ((i & 128) != 0) {
            interfaceC16820sZ3 = null;
        }
        if (C0fH.A02()) {
            C0fH.A01(-1022944216, "com.instagram.compose.ui.bouncy.bouncyClickable (BouncyClickable.kt:48)");
        }
        C5XO c5xo = (C5XO) AbstractC25234BEr.A0Y(c5Tl, -373679344);
        C117505Tk A0J = AbstractC25225BEi.A0J(c5Tl);
        Modifier Eq3 = AbstractC118675Yj.A00(c5xo, AbstractC118665Yh.A00(c5xo, modifier, A1V).Eq3(AbstractC118655Yf.A00), A1V).Eq3(new BouncyClickableElement(c5xo, c5xq2, str2, interfaceC16820sZ3, interfaceC16820sZ2, f8, f7, f6, f5, A1V));
        if (C0fH.A02()) {
            C0fH.A00(-1150990326);
        }
        C117505Tk.A0I(A0J);
        return Eq3;
    }
}
