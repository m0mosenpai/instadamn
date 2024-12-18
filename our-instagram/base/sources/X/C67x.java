package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.NotePogImageDict;
import com.instagram.api.schemas.NotePogImageDictIntf;
import com.instagram.api.schemas.NotePogVideoDict;
import com.instagram.api.schemas.NotePogVideoDictIntf;

/* renamed from: X.67x, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C67x extends C0T6 implements InterfaceC1347567l {
    public final NotePogImageDict A00;
    public final NotePogVideoDict A01;

    @Override // X.InterfaceC1347567l
    public final C67x ExP() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C67x) {
                C67x c67x = (C67x) obj;
                if (!C14360o3.A0K(this.A00, c67x.A00) || !C14360o3.A0K(this.A01, c67x.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        NotePogImageDict notePogImageDict = this.A00;
        int hashCode = (notePogImageDict == null ? 0 : notePogImageDict.hashCode()) * 31;
        NotePogVideoDict notePogVideoDict = this.A01;
        return hashCode + (notePogVideoDict != null ? notePogVideoDict.hashCode() : 0);
    }

    @Override // X.InterfaceC1347567l
    public final /* bridge */ /* synthetic */ NotePogImageDictIntf BGd() {
        return this.A00;
    }

    @Override // X.InterfaceC1347567l
    public final /* bridge */ /* synthetic */ NotePogVideoDictIntf CF3() {
        return this.A01;
    }

    @Override // X.InterfaceC1347567l
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTNotePogVideoResponseInfo", AbstractC40115Hqi.A00(this));
    }

    public C67x(NotePogImageDict notePogImageDict, NotePogVideoDict notePogVideoDict) {
        this.A00 = notePogImageDict;
        this.A01 = notePogVideoDict;
    }
}
