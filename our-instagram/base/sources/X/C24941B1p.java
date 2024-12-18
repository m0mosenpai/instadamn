package X;

import android.media.Image;
import java.util.function.Consumer;

/* renamed from: X.B1p, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C24941B1p implements Consumer {
    public final /* synthetic */ Image A00;
    public final /* synthetic */ C81N A01;

    public C24941B1p(Image image, C81N c81n) {
        this.A00 = image;
        this.A01 = c81n;
    }

    @Override // java.util.function.Consumer
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        this.A00.close();
        C81N.A01(this.A01);
    }
}
