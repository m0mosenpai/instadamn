package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.model.mediasize.ImageInfo;
import com.instagram.model.mediasize.ImmutablePandoImageInfo;

/* renamed from: X.HQw, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39240HQw extends C17T implements InterfaceC38251qF {
    @Override // X.InterfaceC38251qF
    public final ImageInfo BGx() {
        return (ImageInfo) A04(-1876344045, ImmutablePandoImageInfo.class);
    }

    @Override // X.InterfaceC38251qF
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, AbstractC40066Hps.A00(this));
    }

    @Override // X.InterfaceC38251qF
    public final String getId() {
        return A0h(3355);
    }

    @Override // X.InterfaceC38251qF
    public final long B3D() {
        return A03(31792438);
    }

    @Override // X.InterfaceC38251qF
    public final C38231qD EwQ() {
        long A03 = A03(31792438);
        return new C38231qD(BGx().F5B(), A0h(3355), A0h(1939875509), A0i(-318184504), A03);
    }

    @Override // X.InterfaceC38251qF
    public final String getMediaType() {
        return A0h(1939875509);
    }

    @Override // X.InterfaceC38251qF
    public final String getPreview() {
        return A0i(-318184504);
    }
}
