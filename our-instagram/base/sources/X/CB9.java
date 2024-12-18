package X;

import androidx.compose.ui.Modifier;

/* loaded from: classes5.dex */
public abstract class CB9 {
    public static final Modifier A00(Modifier modifier, C5AH c5ah, float f, float f2) {
        int i = 3;
        boolean z = false;
        if (c5ah != null) {
            i = 0;
            z = true;
        }
        if ((Float.compare(f, 0.0f) > 0 && Float.compare(f2, 0.0f) > 0) || z) {
            return AbstractC25230BEn.A0Y(modifier, new C29914DHc(c5ah, f, f2, i, z));
        }
        return modifier;
    }
}
