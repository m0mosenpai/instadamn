package X;

import android.content.Context;

/* renamed from: X.Olv, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55561Olv implements InterfaceC58362lv {
    public InterfaceC16820sZ A00;
    public InterfaceC16820sZ A01;
    public final Context A02;

    @Override // X.InterfaceC58362lv
    public final /* bridge */ /* synthetic */ void onChanged(Object obj) {
        InterfaceC16820sZ interfaceC16820sZ;
        int A05 = AbstractC25227BEk.A05((EnumC53151Nf6) obj, 0);
        if (A05 != 1) {
            if (A05 != 2) {
                if (A05 == 3) {
                    C9GR.A0B(this.A02, "video_upload_error");
                    return;
                }
                return;
            }
            interfaceC16820sZ = this.A01;
        } else {
            interfaceC16820sZ = this.A00;
        }
        if (interfaceC16820sZ == null) {
            return;
        }
        interfaceC16820sZ.invoke();
    }

    public C55561Olv(Context context) {
        this.A02 = context;
    }
}
