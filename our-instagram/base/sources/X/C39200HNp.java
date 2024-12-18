package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.model.mediasize.ImageInfo;
import com.instagram.model.mediasize.ImageInfoImpl;
import com.instagram.model.mediasize.ImmutablePandoImageInfo;

/* renamed from: X.HNp, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39200HNp extends C17T implements InterfaceC110104xf {
    @Override // X.InterfaceC110104xf
    public final ImageInfo BGx() {
        return (ImageInfo) A05(-1876344045, ImmutablePandoImageInfo.class);
    }

    @Override // X.InterfaceC110104xf
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, AbstractC39826Hla.A00(this));
    }

    @Override // X.InterfaceC110104xf
    public final C110094xe EsA() {
        ImageInfoImpl imageInfoImpl;
        ImageInfo BGx = BGx();
        if (BGx != null) {
            imageInfoImpl = BGx.F5B();
        } else {
            imageInfoImpl = null;
        }
        return new C110094xe(imageInfoImpl, A0h(-1729814302), A0h(-790686341));
    }

    @Override // X.InterfaceC110104xf
    public final String getOwnerUsername() {
        return A0h(-1729814302);
    }

    @Override // X.InterfaceC110104xf
    public final String getTemplateMediaId() {
        return A0h(-790686341);
    }
}
