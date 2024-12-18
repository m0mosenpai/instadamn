package X;

import android.content.Context;
import com.instagram.model.mediasize.ExtendedImageUrl;

/* renamed from: X.Iou, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42332Iou implements InterfaceC66482zP {
    public final C38632GyZ A00;
    public final IDQ A01;
    public final String A02;

    public final ExtendedImageUrl A00(Context context) {
        C41630IbL c41630IbL = this.A00.A01;
        if (c41630IbL != null) {
            ExtendedImageUrl extendedImageUrl = c41630IbL.A00;
            if (extendedImageUrl == null) {
                ExtendedImageUrl extendedImageUrl2 = (ExtendedImageUrl) c41630IbL.A02.invoke(context);
                c41630IbL.A00 = extendedImageUrl2;
                return extendedImageUrl2;
            }
            return extendedImageUrl;
        }
        return null;
    }

    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A02;
    }

    public C42332Iou(C38632GyZ c38632GyZ, IDQ idq, String str) {
        this.A02 = str;
        this.A00 = c38632GyZ;
        this.A01 = idq;
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return equals(obj);
    }
}
