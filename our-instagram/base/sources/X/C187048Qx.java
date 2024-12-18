package X;

import java.util.Collections;
import java.util.HashSet;
import java.util.List;

/* renamed from: X.8Qx, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final /* synthetic */ class C187048Qx implements InterfaceC16820sZ {
    public final /* synthetic */ C187028Qv A00;

    public /* synthetic */ C187048Qx(C187028Qv c187028Qv) {
        this.A00 = c187028Qv;
    }

    @Override // X.InterfaceC16820sZ
    public final Object invoke() {
        AGS ags;
        List<C84823qW> list = this.A00.A0E;
        HashSet hashSet = new HashSet();
        if (list != null) {
            for (C84823qW c84823qW : list) {
                if (c84823qW != null && (ags = c84823qW.A13) != null) {
                    ags.A09 = Float.valueOf(c84823qW.A03);
                    ags.A0A = Float.valueOf(c84823qW.A04);
                    ags.A0F = Integer.valueOf(c84823qW.A09);
                    ags.A08 = Float.valueOf(c84823qW.A02);
                    ags.A06 = Float.valueOf(c84823qW.A00);
                    ags.A07 = Float.valueOf(c84823qW.A01);
                    hashSet.add(ags);
                }
            }
        }
        return Collections.unmodifiableSet(hashSet);
    }
}
