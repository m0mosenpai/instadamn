package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.ImmutablePandoNotePogImageDict;
import com.instagram.api.schemas.ImmutablePandoNotePogVideoDict;
import com.instagram.api.schemas.NotePogImageDict;
import com.instagram.api.schemas.NotePogImageDictIntf;
import com.instagram.api.schemas.NotePogVideoDict;
import com.instagram.api.schemas.NotePogVideoDictIntf;

/* renamed from: X.67k, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1347467k extends C17T implements InterfaceC1347567l {
    @Override // X.InterfaceC1347567l
    public final NotePogImageDictIntf BGd() {
        return (NotePogImageDictIntf) A05(-1443251174, ImmutablePandoNotePogImageDict.class);
    }

    @Override // X.InterfaceC1347567l
    public final NotePogVideoDictIntf CF3() {
        return (NotePogVideoDictIntf) A05(-1618328326, ImmutablePandoNotePogVideoDict.class);
    }

    @Override // X.InterfaceC1347567l
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI(AbstractC40115Hqi.A00(this), this);
    }

    @Override // X.InterfaceC1347567l
    public final C67x ExP() {
        NotePogImageDict notePogImageDict;
        NotePogImageDictIntf BGd = BGd();
        NotePogVideoDict notePogVideoDict = null;
        if (BGd != null) {
            notePogImageDict = BGd.ExN();
        } else {
            notePogImageDict = null;
        }
        NotePogVideoDictIntf CF3 = CF3();
        if (CF3 != null) {
            notePogVideoDict = CF3.ExO();
        }
        return new C67x(notePogImageDict, notePogVideoDict);
    }
}
