package X;

import android.graphics.Bitmap;

/* renamed from: X.Adu, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23659Adu implements InterfaceC25601Mq {
    public final /* synthetic */ Bitmap A00;
    public final /* synthetic */ C8RZ A01;

    public C23659Adu(Bitmap bitmap, C8RZ c8rz) {
        this.A01 = c8rz;
        this.A00 = bitmap;
    }

    @Override // X.InterfaceC25601Mq
    public final /* bridge */ /* synthetic */ Object then(Object obj) {
        AbstractC24481Hr abstractC24481Hr = (AbstractC24481Hr) obj;
        C14360o3.A0B(abstractC24481Hr, 0);
        C8RZ c8rz = this.A01;
        Bitmap bitmap = this.A00;
        if (c8rz.A04) {
            c8rz.A0M.offer(bitmap);
        } else {
            bitmap.recycle();
        }
        Object A07 = abstractC24481Hr.A07();
        C14360o3.A0A(A07);
        return A07;
    }
}
