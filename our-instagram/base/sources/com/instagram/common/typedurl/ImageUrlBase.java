package com.instagram.common.typedurl;

import X.AbstractC05810Sj;
import X.AnonymousClass001;
import X.C222816h;
import X.C2n4;
import X.EnumC59002my;
import X.EnumC59012mz;
import X.EnumC59022n0;
import X.InterfaceC222916i;

/* loaded from: classes.dex */
public abstract class ImageUrlBase implements ImageUrl {
    public static final InterfaceC222916i A02 = C222816h.A07;
    public ImageCacheKey A00;
    public C2n4 A01;

    public static void A00(ImageUrlBase imageUrlBase) {
        if (imageUrlBase.A01 == null || imageUrlBase.A00 == null) {
            synchronized (imageUrlBase) {
                if (imageUrlBase.A01 == null || imageUrlBase.A00 == null) {
                    C2n4 E3Q = A02.E3Q(imageUrlBase.BJa(), imageUrlBase.getUrl());
                    imageUrlBase.A01 = E3Q;
                    String str = E3Q.A04;
                    imageUrlBase.A00 = new ImageCacheKey(AnonymousClass001.A0o(str, "_", "_", imageUrlBase.getWidth(), imageUrlBase.getHeight()), str, imageUrlBase.getWidth(), imageUrlBase.getHeight());
                }
            }
        }
    }

    @Override // X.InterfaceC222716g
    public final String Afh() {
        A00(this);
        AbstractC05810Sj.A00(this.A01);
        return this.A01.A03;
    }

    @Override // X.InterfaceC222716g
    public final /* bridge */ /* synthetic */ Object AjX() {
        A00(this);
        AbstractC05810Sj.A00(this.A00);
        return this.A00;
    }

    @Override // X.InterfaceC222716g
    public final EnumC59022n0 Amf() {
        A00(this);
        AbstractC05810Sj.A00(this.A01);
        return this.A01.A00;
    }

    @Override // X.InterfaceC222716g
    public final String Ar1() {
        A00(this);
        AbstractC05810Sj.A00(this.A01);
        return this.A01.A05;
    }

    @Override // X.InterfaceC222716g
    public final EnumC59002my B2p() {
        A00(this);
        AbstractC05810Sj.A00(this.A01);
        return this.A01.A01;
    }

    @Override // X.InterfaceC222716g
    public final EnumC59012mz B55() {
        A00(this);
        AbstractC05810Sj.A00(this.A01);
        return this.A01.A02;
    }

    @Override // X.InterfaceC222716g
    public final String Ba1() {
        A00(this);
        AbstractC05810Sj.A00(this.A01);
        return this.A01.A06;
    }

    @Override // X.InterfaceC222716g
    public final String CA7() {
        A00(this);
        AbstractC05810Sj.A00(this.A01);
        return this.A01.A07;
    }

    @Override // X.InterfaceC222716g
    public final String CDP() {
        A00(this);
        AbstractC05810Sj.A00(this.A01);
        return this.A01.A08;
    }
}
