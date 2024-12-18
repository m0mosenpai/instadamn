package X;

import java.security.SecureRandom;

/* renamed from: X.SJj, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C62626SJj {
    public final C51u A00(EnumC61063Rec enumC61063Rec, long j) {
        char c;
        long nextLong = new SecureRandom().nextLong();
        if (enumC61063Rec instanceof QEZ) {
            c = 3;
        } else if (enumC61063Rec instanceof QEY) {
            c = 20;
        } else if (enumC61063Rec instanceof QEX) {
            c = '@';
        } else {
            c = '\b';
        }
        long j2 = (1 << c) - 1;
        long j3 = nextLong & j2;
        long nextLong2 = new SecureRandom().nextLong() & j2;
        long j4 = (j3 ^ nextLong2) ^ j;
        return new C51u(new C63170SeV(enumC61063Rec, j3, nextLong2), new C63170SeV(enumC61063Rec, nextLong2, j4), new C63170SeV(enumC61063Rec, j4, j3));
    }
}
