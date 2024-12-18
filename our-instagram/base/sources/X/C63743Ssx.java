package X;

import android.graphics.ImageDecoder;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.nio.ByteBuffer;

/* renamed from: X.Ssx, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63743Ssx implements InterfaceC65470Tkn {
    public final SDG A00;

    @Override // X.InterfaceC65470Tkn
    public final /* bridge */ /* synthetic */ InterfaceC65558Tme ANo(C63729Ssj c63729Ssj, Object obj, int i, int i2) {
        Drawable decodeDrawable = ImageDecoder.decodeDrawable(ImageDecoder.createSource((ByteBuffer) obj), new C63449SkS(c63729Ssj, i, i2));
        if (decodeDrawable instanceof AnimatedImageDrawable) {
            return new C63787Sth((AnimatedImageDrawable) decodeDrawable);
        }
        throw MSW.A0y(AbstractC167017dG.A0n(decodeDrawable, "Received unexpected drawable type for animated webp, failing: ", AbstractC166987dD.A1C()));
    }

    @Override // X.InterfaceC65470Tkn
    public final /* bridge */ /* synthetic */ boolean CKc(C63729Ssj c63729Ssj, Object obj) {
        return AbstractC167007dF.A1X(AbstractC63044SbN.A02((ByteBuffer) obj, this.A00.A01), ImageHeaderParser$ImageType.ANIMATED_WEBP);
    }

    public C63743Ssx(SDG sdg) {
        this.A00 = sdg;
    }
}
