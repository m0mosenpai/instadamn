package X;

import android.view.View;
import com.instagram.common.gallery.model.GalleryItem;

/* renamed from: X.Jat, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43886Jat implements InterfaceC195388ke {
    public final /* synthetic */ C43834JZx A00;

    @Override // X.InterfaceC195388ke
    public final void DNQ(GalleryItem galleryItem, BBC bbc, int i) {
        C14360o3.A0B(bbc, 1);
        C43834JZx c43834JZx = this.A00;
        if (C18U.A06(C06090Tz.A05, c43834JZx.A08, 36331167011587270L)) {
            C43830JZt.A01(galleryItem, c43834JZx.A0A.A00, true);
        } else {
            A00(galleryItem, bbc);
        }
    }

    @Override // X.InterfaceC195388ke
    public final /* synthetic */ void DNr(GalleryItem galleryItem, boolean z) {
    }

    @Override // X.InterfaceC195388ke
    public final /* synthetic */ void DU5() {
    }

    @Override // X.InterfaceC195388ke
    public final /* synthetic */ void Dem(String str) {
    }

    public C43886Jat(C43834JZx c43834JZx) {
        this.A00 = c43834JZx;
    }

    private final void A00(GalleryItem galleryItem, BBC bbc) {
        if (!(bbc instanceof C9NP)) {
            if (!C18U.A06(C06090Tz.A05, this.A00.A08, 36321022299546683L)) {
                return;
            }
        }
        C43830JZt.A01(galleryItem, this.A00.A0A.A00, false);
    }

    @Override // X.InterfaceC195388ke
    public final void DNa(View view, GalleryItem galleryItem, BBC bbc, int i) {
        AbstractC167017dG.A1N(galleryItem, bbc);
        C43834JZx c43834JZx = this.A00;
        if (!C18U.A06(C06090Tz.A05, c43834JZx.A08, 36321022300136516L)) {
            A00(galleryItem, bbc);
        } else {
            if (!(bbc instanceof C9NP)) {
                return;
            }
            c43834JZx.A0A.A01(galleryItem);
        }
    }

    @Override // X.InterfaceC195388ke
    public final void DNu(GalleryItem galleryItem, BBC bbc, int i, boolean z) {
        AbstractC167017dG.A1N(galleryItem, bbc);
        A00(galleryItem, bbc);
    }
}
