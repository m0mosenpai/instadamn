package X;

import android.graphics.Bitmap;
import java.io.File;
import java.util.HashMap;

/* renamed from: X.Adw, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23661Adw implements InterfaceC25601Mq {
    public final /* synthetic */ Bitmap A00;
    public final /* synthetic */ C8RZ A01;
    public final /* synthetic */ C8Q1 A02;
    public final /* synthetic */ String A03;

    public C23661Adw(Bitmap bitmap, C8RZ c8rz, C8Q1 c8q1, String str) {
        this.A01 = c8rz;
        this.A00 = bitmap;
        this.A03 = str;
        this.A02 = c8q1;
    }

    @Override // X.InterfaceC25601Mq
    public final /* bridge */ /* synthetic */ Object then(Object obj) {
        AbstractC24481Hr abstractC24481Hr = (AbstractC24481Hr) obj;
        C14360o3.A0B(abstractC24481Hr, 0);
        File file = (File) abstractC24481Hr.A07();
        C8RZ c8rz = this.A01;
        Bitmap bitmap = this.A00;
        if (c8rz.A04) {
            c8rz.A0M.offer(bitmap);
        } else {
            bitmap.recycle();
        }
        String str = this.A03;
        HashMap hashMap = c8rz.A0H.A00;
        if (hashMap.containsKey(str)) {
            Object obj2 = hashMap.get(str);
            if (obj2 != null) {
                C8Q1 c8q1 = this.A02;
                C8Q0 c8q0 = ((C199008r1) obj2).A01.A01;
                if (c8q0 != null) {
                    if (C14360o3.A0K(c8q1, c8q0.A00)) {
                        c8rz.A0K.put(str, android.net.Uri.fromFile(file).toString());
                        return null;
                    }
                    return null;
                }
                throw AbstractC166997dE.A0g();
            }
            throw AbstractC166997dE.A0g();
        }
        return null;
    }
}
