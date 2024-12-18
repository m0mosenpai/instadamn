package X;

import java.io.File;

/* renamed from: X.Adt, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23658Adt implements InterfaceC25601Mq {
    public final int A00;
    public final Object A01;

    public C23658Adt(C47Z c47z, int i) {
        this.A00 = i;
        if (i != 0) {
            this.A01 = c47z;
        } else {
            this.A01 = c47z;
        }
    }

    @Override // X.InterfaceC25601Mq
    public final /* bridge */ /* synthetic */ Object then(Object obj) {
        File file;
        if (this.A00 != 0) {
            C47Z c47z = (C47Z) this.A01;
            file = (File) ((AbstractC24481Hr) obj).A07();
            if (file != null) {
                c47z.A2k = file.getAbsolutePath();
            }
        } else {
            AbstractC24481Hr abstractC24481Hr = (AbstractC24481Hr) obj;
            C14360o3.A0B(abstractC24481Hr, 0);
            file = (File) abstractC24481Hr.A07();
            if (file != null) {
                ((C47Z) this.A01).A2k = file.getAbsolutePath();
                return file;
            }
        }
        return file;
    }
}
