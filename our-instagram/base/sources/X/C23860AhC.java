package X;

import com.instagram.api.schemas.StoryTemplateFillableGalleryStickerDict;
import com.instagram.api.schemas.StoryTemplateFillableGalleryStickerDictImpl;
import com.instagram.api.schemas.StoryTemplateFillableGalleryStickerShapes;
import java.util.List;

/* renamed from: X.AhC, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23860AhC implements BEZ {
    public StoryTemplateFillableGalleryStickerDict A00 = new StoryTemplateFillableGalleryStickerDictImpl(ADT.A00(C8OK.A0A), null, null, null, null, null, null);
    public boolean A01 = true;

    @Override // X.C5NL
    public final /* synthetic */ List B6F() {
        return C16930sl.A00;
    }

    @Override // X.BEZ
    public final C8OK C0e() {
        StoryTemplateFillableGalleryStickerShapes B9Q = this.A00.B9Q();
        if (B9Q != null) {
            return ADT.A01(B9Q);
        }
        return null;
    }

    @Override // X.C5NL
    public final Integer CBq() {
        return C05F.A18;
    }

    @Override // X.BEZ
    public final boolean CZv() {
        return this.A01;
    }

    @Override // X.BEZ
    public final void Eep(C8OK c8ok) {
        C22953A9x AKc = this.A00.AKc();
        StoryTemplateFillableGalleryStickerShapes storyTemplateFillableGalleryStickerShapes = null;
        if (c8ok != null) {
            storyTemplateFillableGalleryStickerShapes = ADT.A00(c8ok);
        }
        this.A00 = new StoryTemplateFillableGalleryStickerDictImpl(storyTemplateFillableGalleryStickerShapes, AKc.A00, AKc.A01, AKc.A02, AKc.A03, AKc.A04, AKc.A05);
    }

    @Override // X.C5NL
    public final C5NG BlQ() {
        C5NG A0V = AbstractC167007dF.A0V();
        AbstractC166987dD.A1V(C148276lx.A0m, A0V);
        return A0V;
    }

    @Override // X.BEZ
    public final void EaH(boolean z) {
        this.A01 = z;
    }
}
