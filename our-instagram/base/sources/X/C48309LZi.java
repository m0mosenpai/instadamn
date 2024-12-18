package X;

import android.graphics.Bitmap;
import com.instagram.direct.request.graphql.IGDirectMediaRemixLayoutsResponseImpl;

/* renamed from: X.LZi, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48309LZi implements InterfaceC66482zP {
    public final int A00;
    public final Bitmap A01;
    public final IGDirectMediaRemixLayoutsResponseImpl.IgdMagicRemixLayout.Response A02;
    public final String A03;

    public C48309LZi(Bitmap bitmap, IGDirectMediaRemixLayoutsResponseImpl.IgdMagicRemixLayout.Response response, String str, int i) {
        C14360o3.A0B(str, 3);
        this.A01 = bitmap;
        this.A02 = response;
        this.A03 = str;
        this.A00 = i;
    }

    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        return String.valueOf(this.A01.getGenerationId());
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return equals(obj);
    }
}
