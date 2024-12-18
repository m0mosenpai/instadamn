package X;

import com.facebook.common.dextricks.StringTreeSet;

/* renamed from: X.180, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class AnonymousClass180 extends AnonymousClass181 {
    public int A00;
    public AnonymousClass165 A01;
    public boolean A02;
    public int[] A03;
    public final C16H A04;
    public static final int[] A06 = AnonymousClass167.A07;
    public static final C16N A05 = AnonymousClass182.A02;

    @Override // X.AnonymousClass182
    public final AnonymousClass182 A0B(int i) {
        this.A00 = i;
        return this;
    }

    public final void A14(String str) {
        A0L(String.format("Can not %s, expecting field name (context: %s)", str, super.A02.A02()));
        throw C00O.createAndThrow();
    }

    public final void A15(String str, int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 5) {
                            throw new RuntimeException("Internal error: this code path should never get executed");
                        }
                        A14(str);
                        throw C00O.createAndThrow();
                    }
                    ((AnonymousClass182) this).A00.FEg(this);
                    return;
                }
                ((AnonymousClass182) this).A00.FEd(this);
                return;
            }
            ((AnonymousClass182) this).A00.FEN(this);
            return;
        }
        int i2 = ((C16Q) super.A02).A01;
        if (i2 == 1) {
            ((AnonymousClass182) this).A00.ADH(this);
        } else if (i2 == 2) {
            ((AnonymousClass182) this).A00.ADJ(this);
        }
    }

    public AnonymousClass180(C44T c44t, C16H c16h, int i) {
        C5F1 c5f1;
        ((AnonymousClass181) this).A00 = i;
        super.A01 = c44t;
        if ((AnonymousClass160.STRICT_DUPLICATE_DETECTION.A00 & i) != 0) {
            c5f1 = new C5F1(this);
        } else {
            c5f1 = null;
        }
        super.A02 = new AnonymousClass184(c5f1, null, 0);
        super.A03 = (i & AnonymousClass160.WRITE_NUMBERS_AS_STRINGS.A00) != 0;
        this.A03 = A06;
        this.A01 = AnonymousClass161.A07;
        this.A04 = c16h;
        if ((AnonymousClass160.ESCAPE_NON_ASCII.A00 & i) != 0) {
            this.A00 = StringTreeSet.MAX_SYMBOL_COUNT;
        }
        this.A02 = !((i & AnonymousClass160.QUOTE_FIELD_NAMES.A00) != 0);
    }

    @Override // X.AnonymousClass181
    public final void A12(int i, int i2) {
        super.A12(i, i2);
        boolean z = false;
        if ((i & AnonymousClass160.QUOTE_FIELD_NAMES.A00) != 0) {
            z = true;
        }
        this.A02 = !z;
    }

    @Override // X.AnonymousClass181, X.AnonymousClass182
    public final AnonymousClass182 A0C(AnonymousClass160 anonymousClass160) {
        super.A0C(anonymousClass160);
        return this;
    }
}
