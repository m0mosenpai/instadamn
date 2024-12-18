package X;

import android.graphics.Typeface;
import android.text.TextUtils;
import java.util.BitSet;

/* renamed from: X.3dw, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C77723dw extends AbstractC77733dx {
    public C2XE A00;
    public C51682Yq A01;
    public final BitSet A02;
    public final String[] A03;

    public final void A0C() {
        this.A01.A07 = 0;
    }

    public final C51682Yq A0A() {
        AbstractC77733dx.A00(this.A02, this.A03, 1);
        C51682Yq c51682Yq = this.A01;
        c51682Yq.A0Z = r2;
        C2XI[] c2xiArr = {c51682Yq.A0Q};
        A03();
        return c51682Yq;
    }

    public final void A0B() {
        A0X(C05F.A0C);
    }

    public final void A0D() {
        A0U(TextUtils.TruncateAt.END);
    }

    public final void A0G() {
        A0L(1.0f);
    }

    public final void A0H(float f) {
        this.A01.A02 = f;
    }

    public final void A0I(float f) {
        this.A01.A03 = f;
    }

    public final void A0J(float f) {
        this.A01.A04 = f;
    }

    public final void A0K(float f) {
        this.A01.A05 = f;
    }

    public final void A0L(float f) {
        this.A01.A06 = f;
    }

    public final void A0M(int i) {
        this.A01.A0D = i;
    }

    public final void A0N(int i) {
        this.A01.A0G = i;
    }

    public final void A0O(int i) {
        this.A01.A0I = i;
    }

    public final void A0P(int i) {
        this.A01.A0J = i;
    }

    public final void A0Q(int i) {
        this.A01.A0K = i;
    }

    public final void A0R(int i) {
        this.A01.A0L = i;
    }

    public final void A0S(int i) {
        this.A01.A0M = i;
    }

    public final void A0T(Typeface typeface) {
        this.A01.A0O = typeface;
    }

    public final void A0U(TextUtils.TruncateAt truncateAt) {
        this.A01.A0P = truncateAt;
    }

    public final void A0V(C2XI c2xi) {
        this.A01.A0Q = c2xi;
    }

    public final void A0W(CharSequence charSequence) {
        this.A01.A0S = charSequence;
        this.A02.set(0);
    }

    public final void A0X(Integer num) {
        this.A01.A0T = num;
    }

    public final void A0Y(Integer num) {
        this.A01.A0U = num;
    }

    public final void A0Z(boolean z) {
        this.A01.A0V = z;
    }

    public final void A0a(boolean z) {
        this.A01.A0W = z;
    }

    public final void A0b(boolean z) {
        this.A01.A0X = z;
    }

    public final void A0c(boolean z) {
        this.A01.A0Y = z;
    }

    public C77723dw(C2XE c2xe, C51682Yq c51682Yq, int i) {
        super(c51682Yq, c2xe, i);
        this.A03 = new String[]{"text"};
        BitSet bitSet = new BitSet(1);
        this.A02 = bitSet;
        this.A01 = c51682Yq;
        this.A00 = c2xe;
        bitSet.clear();
    }

    public final void A0E() {
        A0M(Integer.MAX_VALUE);
    }

    public final void A0F() {
        A0P(-7829368);
    }
}
