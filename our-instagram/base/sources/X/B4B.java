package X;

import com.instagram.ar.core.discovery.minigallery.services.MiniGalleryService;
import com.instagram.ar.core.discovery.minigallery.services.MiniGalleryService$getSearchResults$$inlined$map$1$2;

/* loaded from: classes4.dex */
public final class B4B implements InterfaceC19390xP {
    public final /* synthetic */ MiniGalleryService A00;
    public final /* synthetic */ AnonymousClass859 A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ InterfaceC19390xP A04;

    public B4B(MiniGalleryService miniGalleryService, AnonymousClass859 anonymousClass859, String str, String str2, InterfaceC19390xP interfaceC19390xP) {
        this.A04 = interfaceC19390xP;
        this.A00 = miniGalleryService;
        this.A03 = str;
        this.A01 = anonymousClass859;
        this.A02 = str2;
    }

    @Override // X.InterfaceC19390xP
    public final Object collect(InterfaceC19960yQ interfaceC19960yQ, InterfaceC23621Ds interfaceC23621Ds) {
        return AbstractC167017dG.A0i(interfaceC23621Ds, this.A04, new MiniGalleryService$getSearchResults$$inlined$map$1$2(this.A00, this.A01, this.A03, this.A02, interfaceC19960yQ));
    }
}
