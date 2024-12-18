package X;

import androidx.compose.ui.Modifier;
import com.instagram.barcelona.feed.post.ui.PostSeparatorModifierElement;

/* renamed from: X.6HP, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C6HP {
    public static final Modifier A00(Modifier modifier, float f, boolean z) {
        C14360o3.A0B(modifier, 0);
        if (!z) {
            return modifier.Eq3(new PostSeparatorModifierElement(f));
        }
        return modifier;
    }
}
