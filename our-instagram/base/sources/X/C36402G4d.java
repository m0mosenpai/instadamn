package X;

import android.app.Activity;
import com.instagram.model.direct.messageid.MessageIdentifier;

/* renamed from: X.G4d, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36402G4d implements InterfaceC165777b4 {
    public final int A00;
    public final Object A01;

    public C36402G4d(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC165777b4
    public final void EHs(MessageIdentifier messageIdentifier) {
        String str;
        Activity activity;
        String str2;
        String str3;
        VG2 vg2;
        EnumC65855TvH enumC65855TvH;
        InterfaceC11380iw interfaceC11380iw;
        Dz7 dz7;
        InterfaceC11380iw interfaceC11380iw2;
        Dz7 dz72;
        int i = this.A00;
        Object obj = this.A01;
        if (i != 0) {
            C34646FOd c34646FOd = (C34646FOd) obj;
            str = c34646FOd.A0G;
            C14360o3.A0K(str, "shared_stack");
            Dz7 dz73 = c34646FOd.A0A;
            activity = c34646FOd.A03;
            Object obj2 = new Object();
            str2 = c34646FOd.A01;
            str3 = c34646FOd.A02;
            dz72 = dz73;
            interfaceC11380iw2 = obj2;
        } else {
            FOg fOg = (FOg) obj;
            str = fOg.A0K;
            boolean A0K = C14360o3.A0K(str, "shared_stack");
            Dz7 dz74 = fOg.A0D;
            activity = fOg.A05;
            Object obj3 = new Object();
            str2 = fOg.A03;
            str3 = fOg.A02;
            dz72 = dz74;
            interfaceC11380iw2 = obj3;
            if (A0K) {
                vg2 = VG2.A0U;
                enumC65855TvH = EnumC65855TvH.A0l;
                dz7 = dz74;
                interfaceC11380iw = obj3;
                dz7.A09(activity, interfaceC11380iw, enumC65855TvH, vg2, str2, str3);
            }
        }
        vg2 = VG2.A0T;
        enumC65855TvH = F2E.A00(str);
        dz7 = dz72;
        interfaceC11380iw = interfaceC11380iw2;
        dz7.A09(activity, interfaceC11380iw, enumC65855TvH, vg2, str2, str3);
    }
}
