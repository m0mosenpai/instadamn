package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.CommentPrompt;
import com.instagram.api.schemas.CommentPromptImpl;
import com.instagram.api.schemas.ImmutablePandoCommentPrompt;

/* renamed from: X.533, reason: invalid class name */
/* loaded from: classes3.dex */
public final class AnonymousClass533 extends C17T implements AnonymousClass520 {
    public InterfaceC101404gy A00;

    @Override // X.AnonymousClass520
    public final C1117351z Erc(C1DV c1dv) {
        return Erb(new C1DY(c1dv, 6, false));
    }

    @Override // X.AnonymousClass520
    public final CommentPrompt Ape() {
        return (CommentPrompt) A05(-16036028, ImmutablePandoCommentPrompt.class);
    }

    @Override // X.AnonymousClass520
    public final InterfaceC101404gy BeJ() {
        InterfaceC101404gy interfaceC101404gy = this.A00;
        if (interfaceC101404gy == null) {
            return (InterfaceC101404gy) A05(3446719, C33046Eht.class);
        }
        return interfaceC101404gy;
    }

    @Override // X.AnonymousClass520
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI(AnonymousClass532.A01(this), this);
    }

    @Override // X.AnonymousClass520
    public final AnonymousClass520 E8n(C1DY c1dy) {
        InterfaceC101404gy BeJ = BeJ();
        if (BeJ != null) {
            BeJ.EC4(c1dy);
        } else {
            BeJ = null;
        }
        this.A00 = BeJ;
        return this;
    }

    @Override // X.AnonymousClass520
    public final C1117351z Erb(C1DY c1dy) {
        CommentPromptImpl commentPromptImpl;
        CommentPrompt Ape = Ape();
        C101394gx c101394gx = null;
        if (Ape != null) {
            commentPromptImpl = Ape.EsS();
        } else {
            commentPromptImpl = null;
        }
        InterfaceC101404gy BeJ = BeJ();
        if (BeJ != null) {
            c101394gx = BeJ.F6u(c1dy);
        }
        return new C1117351z(commentPromptImpl, c101394gx);
    }
}
