package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.CommentPrompt;

/* renamed from: X.51z, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1117351z extends C0T6 implements AnonymousClass520 {
    public final CommentPrompt A00;
    public final C101394gx A01;

    @Override // X.AnonymousClass520
    public final AnonymousClass520 E8n(C1DY c1dy) {
        return this;
    }

    @Override // X.AnonymousClass520
    public final C1117351z Erb(C1DY c1dy) {
        return this;
    }

    @Override // X.AnonymousClass520
    public final C1117351z Erc(C1DV c1dv) {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C1117351z) {
                C1117351z c1117351z = (C1117351z) obj;
                if (!C14360o3.A0K(this.A00, c1117351z.A00) || !C14360o3.A0K(this.A01, c1117351z.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        CommentPrompt commentPrompt = this.A00;
        int hashCode = (commentPrompt == null ? 0 : commentPrompt.hashCode()) * 31;
        C101394gx c101394gx = this.A01;
        return hashCode + (c101394gx != null ? c101394gx.hashCode() : 0);
    }

    @Override // X.AnonymousClass520
    public final CommentPrompt Ape() {
        return this.A00;
    }

    @Override // X.AnonymousClass520
    public final /* bridge */ /* synthetic */ InterfaceC101404gy BeJ() {
        return this.A01;
    }

    @Override // X.AnonymousClass520
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTCaptionAddOnData", AnonymousClass532.A01(this));
    }

    public C1117351z(CommentPrompt commentPrompt, C101394gx c101394gx) {
        this.A00 = commentPrompt;
        this.A01 = c101394gx;
    }
}
