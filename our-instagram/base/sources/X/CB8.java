package X;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.GraphicsLayerElement;

/* loaded from: classes5.dex */
public abstract class CB8 {
    public static final Modifier A00(Modifier modifier, float f) {
        if (f != 1.0f) {
            long j = C5AD.A01;
            C5AH c5ah = C5AF.A00;
            long j2 = AbstractC1132259k.A00;
            return modifier.Eq3(new GraphicsLayerElement(c5ah, 1.0f, 1.0f, f, 0.0f, j, j2, j2, true));
        }
        return modifier;
    }
}
