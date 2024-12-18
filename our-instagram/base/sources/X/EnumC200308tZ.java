package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.8tZ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class EnumC200308tZ {
    public static final EnumC200308tZ[] A00 = {new EnumC200308tZ() { // from class: X.8ta
    }, new EnumC200308tZ() { // from class: X.8tb
    }, new EnumC200308tZ() { // from class: X.8tc
    }, new EnumC200308tZ() { // from class: X.8td
    }, new EnumC200308tZ() { // from class: X.8te
    }, new EnumC200308tZ() { // from class: X.8tf
    }, new EnumC200308tZ() { // from class: X.8tg
    }, new EnumC200308tZ() { // from class: X.8th
    }};

    /* JADX INFO: Fake field, exist only in values array */
    EnumC200308tZ EF2;

    /* JADX WARN: Type inference failed for: r2v0, types: [X.9eK, X.8wM, X.8tm] */
    /* JADX WARN: Type inference failed for: r2v2, types: [X.9eM, X.8tm, X.B4i] */
    /* JADX WARN: Type inference failed for: r2v3, types: [X.9eN, X.8tm, X.B4i] */
    /* JADX WARN: Type inference failed for: r2v4, types: [X.9eO, X.8tm, X.B4i] */
    /* JADX WARN: Type inference failed for: r2v5, types: [X.8wM, X.8tm, X.8wL] */
    /* JADX WARN: Type inference failed for: r2v7, types: [X.8wM, X.8wP, X.8tm] */
    public final InterfaceC200438tm A01(C200398ti segment, InterfaceC200438tm key, Object hash, int next) {
        if (this instanceof C200348td) {
            ?? c201898wM = new C201898wM(key, hash, next);
            c201898wM.A04 = Long.MAX_VALUE;
            EnumC201908wN enumC201908wN = EnumC201908wN.A01;
            c201898wM.A00 = enumC201908wN;
            c201898wM.A02 = enumC201908wN;
            c201898wM.A05 = Long.MAX_VALUE;
            c201898wM.A01 = enumC201908wN;
            c201898wM.A03 = enumC201908wN;
            return c201898wM;
        }
        if (this instanceof C200318ta) {
            return new C201898wM(key, hash, next);
        }
        if (this instanceof C200338tc) {
            ?? c201898wM2 = new C201898wM(key, hash, next);
            c201898wM2.A02 = Long.MAX_VALUE;
            EnumC201908wN enumC201908wN2 = EnumC201908wN.A01;
            c201898wM2.A00 = enumC201908wN2;
            c201898wM2.A01 = enumC201908wN2;
            return c201898wM2;
        }
        if (this instanceof C200388th) {
            ?? c25008B4i = new C25008B4i(key, hash, segment.A06, next);
            c25008B4i.A04 = Long.MAX_VALUE;
            EnumC201908wN enumC201908wN3 = EnumC201908wN.A01;
            c25008B4i.A00 = enumC201908wN3;
            c25008B4i.A02 = enumC201908wN3;
            c25008B4i.A05 = Long.MAX_VALUE;
            c25008B4i.A01 = enumC201908wN3;
            c25008B4i.A03 = enumC201908wN3;
            return c25008B4i;
        }
        if (this instanceof C200378tg) {
            ?? c25008B4i2 = new C25008B4i(key, hash, segment.A06, next);
            c25008B4i2.A02 = Long.MAX_VALUE;
            EnumC201908wN enumC201908wN4 = EnumC201908wN.A01;
            c25008B4i2.A00 = enumC201908wN4;
            c25008B4i2.A01 = enumC201908wN4;
            return c25008B4i2;
        }
        if (this instanceof C200368tf) {
            ?? c25008B4i3 = new C25008B4i(key, hash, segment.A06, next);
            c25008B4i3.A02 = Long.MAX_VALUE;
            EnumC201908wN enumC201908wN5 = EnumC201908wN.A01;
            c25008B4i3.A00 = enumC201908wN5;
            c25008B4i3.A01 = enumC201908wN5;
            return c25008B4i3;
        }
        if (this instanceof C200358te) {
            return new C25008B4i(key, hash, segment.A06, next);
        }
        ?? c201898wM3 = new C201898wM(key, hash, next);
        c201898wM3.A02 = Long.MAX_VALUE;
        EnumC201908wN enumC201908wN6 = EnumC201908wN.A01;
        c201898wM3.A00 = enumC201908wN6;
        c201898wM3.A01 = enumC201908wN6;
        return c201898wM3;
    }

    public static final void A00(InterfaceC200438tm original, InterfaceC200438tm newEntry) {
        newEntry.EP8(original.AXs());
        InterfaceC200438tm Bg2 = original.Bg2();
        Bg2.EZe(newEntry);
        newEntry.EbU(Bg2);
        InterfaceC200438tm BWu = original.BWu();
        newEntry.EZe(BWu);
        BWu.EbU(newEntry);
        EnumC201908wN enumC201908wN = EnumC201908wN.A01;
        original.EZe(enumC201908wN);
        original.EbU(enumC201908wN);
    }

    public EnumC200308tZ(String $enum$name, int $enum$ordinal) {
    }
}
