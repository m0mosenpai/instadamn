package X;

import java.io.File;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

/* renamed from: X.Ab1, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23486Ab1 implements InterfaceC43459JHx {
    public final C23111Aq A00;
    public final File A01;

    @Override // X.InterfaceC43459JHx
    public final boolean CfA(String str) {
        return false;
    }

    @Override // X.InterfaceC43459JHx
    public final long CgL(String str) {
        return 0L;
    }

    @Override // X.InterfaceC43459JHx
    public final Collection Ab5() {
        String[] list = this.A01.list();
        if (list == null) {
            return Collections.emptyList();
        }
        return Arrays.asList(list);
    }

    @Override // X.InterfaceC43459JHx
    public final long[] getItemInformation(String str) {
        File file = new File(this.A01, str);
        return new long[]{0, file.lastModified(), AbstractC73583Rk.A00(file)};
    }

    @Override // X.InterfaceC43459JHx
    public final boolean remove(String str) {
        C23111Aq c23111Aq = this.A00;
        return c23111Aq.A08.A00(new File(this.A01, str));
    }

    public C23486Ab1(C23111Aq c23111Aq, File file) {
        this.A00 = c23111Aq;
        this.A01 = file;
    }
}
