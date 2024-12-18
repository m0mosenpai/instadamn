package X;

import java.util.HashMap;
import java.util.HashSet;
import java.util.concurrent.TimeUnit;

/* renamed from: X.Duj, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31617Duj implements InterfaceC50464MPs {
    public final /* synthetic */ JR2 A00;

    @Override // X.InterfaceC50464MPs
    public final boolean Cch(C3o9 c3o9) {
        C14360o3.A0B(c3o9, 0);
        C31665DvV c31665DvV = this.A00.A0e;
        if (c31665DvV != null && c31665DvV.A0D.containsKey(c3o9)) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC50464MPs
    public final void DtU(C31228DoB c31228DoB) {
        HashSet hashSet;
        HashSet hashSet2;
        EnumC33358Eor enumC33358Eor;
        C31665DvV c31665DvV = this.A00.A0e;
        if (c31665DvV != null) {
            C44137Jf2 c44137Jf2 = c31665DvV.A01;
            if (c44137Jf2 != null) {
                C3o9 c3o9 = c31228DoB.A04;
                C14360o3.A0B(c3o9, 0);
                if (c31665DvV.A0D.containsKey(c3o9)) {
                    c44137Jf2.A0D.remove(c3o9);
                } else {
                    if (c31228DoB.A08) {
                        enumC33358Eor = EnumC33358Eor.A03;
                    } else if (c31228DoB.A0C) {
                        enumC33358Eor = EnumC33358Eor.A04;
                    } else {
                        Long l = c31228DoB.A05;
                        if (l != null) {
                            if (System.currentTimeMillis() - TimeUnit.MILLISECONDS.convert(l.longValue(), TimeUnit.MICROSECONDS) > TimeUnit.DAYS.toMillis(30L)) {
                                enumC33358Eor = EnumC33358Eor.A06;
                            }
                        }
                        enumC33358Eor = EnumC33358Eor.A05;
                    }
                    if (enumC33358Eor != EnumC33358Eor.A05) {
                        c44137Jf2.A0D.put(c3o9, enumC33358Eor);
                    }
                }
            }
            C3o9 c3o92 = c31228DoB.A04;
            C14360o3.A0B(c3o92, 0);
            HashMap hashMap = c31665DvV.A0D;
            if (hashMap.containsKey(c3o92)) {
                hashMap.remove(c3o92);
                if (c31228DoB.A0C) {
                    hashSet2 = c31665DvV.A0E;
                } else {
                    hashSet2 = c31665DvV.A0F;
                }
                hashSet2.remove(c3o92);
            } else {
                hashMap.put(c3o92, c31228DoB);
                if (c31228DoB.A0C) {
                    hashSet = c31665DvV.A0E;
                } else {
                    hashSet = c31665DvV.A0F;
                }
                hashSet.add(c3o92);
            }
            C31665DvV.A05(c31665DvV);
            c31665DvV.A0C.A01();
        }
    }

    public C31617Duj(JR2 jr2) {
        this.A00 = jr2;
    }
}
