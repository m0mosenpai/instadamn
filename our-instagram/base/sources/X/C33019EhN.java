package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.model.hashtag.Hashtag;
import com.instagram.model.hashtag.HashtagImpl;
import com.instagram.model.hashtag.ImmutablePandoHashtag;

/* renamed from: X.EhN, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C33019EhN extends C17T implements InterfaceC81933lD {
    @Override // X.InterfaceC81933lD
    public final Hashtag BD4() {
        return (Hashtag) A05(697547724, ImmutablePandoHashtag.class);
    }

    @Override // X.InterfaceC81933lD
    public final InterfaceC81913lB CDh() {
        return (InterfaceC81913lB) A07(C33020EhO.class);
    }

    @Override // X.InterfaceC81933lD
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, AbstractC31241DoP.A00(this));
    }

    @Override // X.InterfaceC81933lD
    public final C81923lC Evu() {
        HashtagImpl hashtagImpl;
        Hashtag BD4 = BD4();
        C81903lA c81903lA = null;
        if (BD4 != null) {
            hashtagImpl = BD4.F59();
        } else {
            hashtagImpl = null;
        }
        InterfaceC81913lB CDh = CDh();
        if (CDh != null) {
            c81903lA = CDh.Evv();
        }
        return new C81923lC(c81903lA, hashtagImpl);
    }
}
