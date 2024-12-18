package X;

import android.animation.LayoutTransition;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.igds.components.search.IgdsInlineSearchBox;

/* renamed from: X.FhM, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C35287FhM implements LayoutTransition.TransitionListener {
    public final /* synthetic */ IgdsInlineSearchBox A00;

    public C35287FhM(IgdsInlineSearchBox igdsInlineSearchBox) {
        this.A00 = igdsInlineSearchBox;
    }

    @Override // android.animation.LayoutTransition.TransitionListener
    public final void endTransition(LayoutTransition layoutTransition, ViewGroup viewGroup, View view, int i) {
        this.A00.A05 = false;
    }

    @Override // android.animation.LayoutTransition.TransitionListener
    public final void startTransition(LayoutTransition layoutTransition, ViewGroup viewGroup, View view, int i) {
        this.A00.A05 = true;
    }
}
