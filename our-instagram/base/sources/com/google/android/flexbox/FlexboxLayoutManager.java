package com.google.android.flexbox;

import X.AbstractC110824yu;
import X.AbstractC58323PtF;
import X.AbstractC70663Fe;
import X.AbstractC70763Fo;
import X.AnonymousClass001;
import X.C110814yt;
import X.C2UU;
import X.C3F5;
import X.C3FM;
import X.C3H6;
import X.C3OP;
import X.C63470SlB;
import X.C65775Ttq;
import X.C65776Ttr;
import X.C65777Tts;
import X.C68705Vah;
import X.C70593Ew;
import X.C70773Fp;
import X.InterfaceC70673Ff;
import X.InterfaceC87383uy;
import X.L89;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class FlexboxLayoutManager extends AbstractC70663Fe implements InterfaceC87383uy, InterfaceC70673Ff {
    public static final Rect A0P = new Rect();
    public int A00;
    public int A02;
    public int A03;
    public int A04;
    public AbstractC70763Fo A0B;
    public AbstractC70763Fo A0C;
    public C70593Ew A0D;
    public C3F5 A0E;
    public L89 A0H;
    public SavedState A0I;
    public boolean A0K;
    public boolean A0L;
    public View A0M;
    public final Context A0N;
    public int A07 = -1;
    public List A0J = new ArrayList();
    public final C65776Ttr A0O = new C65776Ttr(this);
    public C65775Ttq A0G = new C65775Ttq(this);
    public int A08 = -1;
    public int A09 = Integer.MIN_VALUE;
    public int A06 = Integer.MIN_VALUE;
    public int A05 = Integer.MIN_VALUE;
    public SparseArray A0A = new SparseArray();
    public int A01 = -1;
    public C68705Vah A0F = new Object();

    /* loaded from: classes10.dex */
    public class LayoutParams extends C3OP implements FlexItem {
        public static final Parcelable.Creator CREATOR = C63470SlB.A00(86);
        public float A00;
        public float A01;
        public float A02;
        public int A03;
        public int A04;
        public int A05;
        public int A06;
        public int A07;
        public boolean A08;

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int Aaq() {
            return this.A03;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final float B6z() {
            return this.A00;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final float B70() {
            return this.A01;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final float B71() {
            return this.A02;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int BPo() {
            return this.A04;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int BQB() {
            return this.A05;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int BTr() {
            return this.A06;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int BU3() {
            return this.A07;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final boolean CgA() {
            return this.A08;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeFloat(this.A01);
            parcel.writeFloat(this.A02);
            parcel.writeInt(this.A03);
            parcel.writeFloat(this.A00);
            parcel.writeInt(this.A07);
            parcel.writeInt(this.A06);
            parcel.writeInt(this.A05);
            parcel.writeInt(this.A04);
            AbstractC58323PtF.A1B(parcel, this, this.A08 ? (byte) 1 : (byte) 0);
        }
    }

    /* loaded from: classes10.dex */
    public class SavedState implements Parcelable {
        public static final Parcelable.Creator CREATOR = C63470SlB.A00(87);
        public int A00;
        public int A01;

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final String toString() {
            return AnonymousClass001.A0X("SavedState{mAnchorPosition=", ", mAnchorOffset=", '}', this.A01, this.A00);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.A01);
            parcel.writeInt(this.A00);
        }
    }

    private View A08(int i) {
        View A0J = A0J(0, A0T(), i);
        if (A0J == null) {
            return null;
        }
        int i2 = this.A0O.A00[AbstractC70663Fe.A0C(A0J)];
        if (i2 == -1) {
            return null;
        }
        return A0K(A0J, (C65777Tts) this.A0J.get(i2));
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0067, code lost:
    
        if (r2 >= r6) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0061, code lost:
    
        if (r3 >= r8) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.view.View A0M(com.google.android.flexbox.FlexboxLayoutManager r11, int r12, int r13) {
        /*
            r10 = -1
            if (r13 <= r12) goto L4
            r10 = 1
        L4:
            if (r12 == r13) goto L71
            android.view.View r7 = r11.A0e(r12)
            int r8 = r11.Bau()
            int r6 = r11.Bax()
            int r9 = r11.A03
            int r0 = r11.Baw()
            int r9 = r9 - r0
            int r5 = r11.A00
            int r0 = r11.Bat()
            int r5 = r5 - r0
            android.view.ViewGroup$LayoutParams r2 = r7.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r2 = (android.view.ViewGroup.MarginLayoutParams) r2
            int r1 = r7.getLeft()
            int r0 = X.AbstractC70663Fe.A0B(r7)
            int r1 = r1 - r0
            int r0 = r2.leftMargin
            int r1 = r1 - r0
            android.view.ViewGroup$LayoutParams r0 = r7.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r0 = (android.view.ViewGroup.MarginLayoutParams) r0
            int r4 = r11.A0W(r7)
            int r0 = r0.topMargin
            int r4 = r4 - r0
            android.view.ViewGroup$LayoutParams r2 = r7.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r2 = (android.view.ViewGroup.MarginLayoutParams) r2
            int r3 = r7.getRight()
            int r0 = X.AbstractC70663Fe.A0D(r7)
            int r3 = r3 + r0
            int r0 = r2.rightMargin
            int r3 = r3 + r0
            android.view.ViewGroup$LayoutParams r0 = r7.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r0 = (android.view.ViewGroup.MarginLayoutParams) r0
            int r2 = r11.A0V(r7)
            int r0 = r0.bottomMargin
            int r2 = r2 + r0
            if (r1 >= r9) goto L63
            r1 = 0
            if (r3 < r8) goto L64
        L63:
            r1 = 1
        L64:
            if (r4 >= r5) goto L69
            r0 = 0
            if (r2 < r6) goto L6a
        L69:
            r0 = 1
        L6a:
            if (r1 == 0) goto L6f
            if (r0 == 0) goto L6f
            return r7
        L6f:
            int r12 = r12 + r10
            goto L4
        L71:
            r7 = 0
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.FlexboxLayoutManager.A0M(com.google.android.flexbox.FlexboxLayoutManager, int, int):android.view.View");
    }

    @Override // X.AbstractC70663Fe
    public final void A1S(C3F5 c3f5) {
        this.A0I = null;
        this.A08 = -1;
        this.A09 = Integer.MIN_VALUE;
        this.A01 = -1;
        C65775Ttq.A01(this.A0G);
        this.A0A.clear();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0023, code lost:
    
        r4 = java.lang.Math.abs(r2);
        r1.A03 = r6;
        r10 = android.view.View.MeasureSpec.makeMeasureSpec(r25.A03, r25.A04);
        r9 = android.view.View.MeasureSpec.makeMeasureSpec(r25.A00, r25.A01);
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x003b, code lost:
    
        if (r18 != false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x003d, code lost:
    
        r16 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0041, code lost:
    
        if (r25.A0L != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0046, code lost:
    
        if (r6 != 1) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0048, code lost:
    
        r13 = A0e(A0T() - 1);
        r25.A0H.A04 = r25.A0B.A08(r13);
        r14 = X.AbstractC70663Fe.A0C(r13);
        r8 = r25.A0O;
        r1 = A0L(r13, (X.C65777Tts) r25.A0J.get(r8.A00[r14]));
        r13 = r25.A0H;
        r15 = r14 + 1;
        r13.A05 = r15;
        r14 = r8.A00;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x007a, code lost:
    
        if (r14.length > r15) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x007c, code lost:
    
        r13.A01 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x007e, code lost:
    
        r0 = r25.A0B;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0080, code lost:
    
        if (r16 == false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0082, code lost:
    
        r13.A04 = r0.A0D(r1);
        r25.A0H.A06 = (-r25.A0B.A0D(r1)) + r25.A0B.A06();
        r1 = r25.A0H;
        r0 = r1.A06;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x009e, code lost:
    
        if (r0 < 0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00a0, code lost:
    
        r3 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00a1, code lost:
    
        r1.A06 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00a3, code lost:
    
        r1 = r25.A0H.A01;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00a7, code lost:
    
        if (r1 == (-1)) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00b0, code lost:
    
        if (r1 <= (r25.A0J.size() - 1)) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00ea, code lost:
    
        r3 = r25.A0H;
        r1 = r3.A06;
        r3.A00 = r4 - r1;
        r1 = r1 + A04(r26, r27, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00fb, code lost:
    
        if (r1 < 0) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00fd, code lost:
    
        if (r17 == false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00ff, code lost:
    
        if (r4 <= r1) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0101, code lost:
    
        r2 = (-r6) * r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0103, code lost:
    
        r25.A0B.A0E(-r2);
        r25.A0H.A02 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x010d, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x010e, code lost:
    
        if (r4 <= r1) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0110, code lost:
    
        r2 = r6 * r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00b2, code lost:
    
        r1 = r25.A0H;
        r3 = r1.A05;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00bc, code lost:
    
        if (r3 > r25.A0E.A00()) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00be, code lost:
    
        r22 = r4 - r1.A06;
        r1 = r25.A0F;
        r1.A00 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00c7, code lost:
    
        if (r22 <= 0) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00c9, code lost:
    
        r0 = r25.A0J;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00cb, code lost:
    
        if (r18 == false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00cd, code lost:
    
        r21 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00cf, code lost:
    
        r8.A0F(r1, r0, r21, r22, r3, -1);
        r8.A0C(r10, r9, r25.A0H.A05);
        r8.A0B(r25.A0H.A05);
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0113, code lost:
    
        r21 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0116, code lost:
    
        r13.A04 = r0.A08(r1);
        r25.A0H.A06 = r25.A0B.A08(r1) - r25.A0B.A03();
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x012f, code lost:
    
        r13.A01 = r14[r15];
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0135, code lost:
    
        r9 = A0e(0);
        r25.A0H.A04 = r25.A0B.A0D(r9);
        r10 = X.AbstractC70663Fe.A0C(r9);
        r8 = r25.A0O;
        r9 = A0K(r9, (X.C65777Tts) r25.A0J.get(r8.A00[r10]));
        r1 = r25.A0H;
        r8 = r8.A00[r10];
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x015f, code lost:
    
        if (r8 == (-1)) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0161, code lost:
    
        if (r8 <= 0) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0163, code lost:
    
        r0 = (X.C65777Tts) r25.A0J.get(r8 - 1);
        r1 = r25.A0H;
        r1.A05 = r10 - r0.A06;
        r8 = r8 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0175, code lost:
    
        r1.A01 = r8;
        r0 = r25.A0B;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0179, code lost:
    
        if (r16 == false) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x017b, code lost:
    
        r1.A04 = r0.A08(r9);
        r25.A0H.A06 = r25.A0B.A08(r9) - r25.A0B.A03();
        r1 = r25.A0H;
        r0 = r1.A06;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0196, code lost:
    
        if (r0 < 0) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0198, code lost:
    
        r3 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0199, code lost:
    
        r1.A06 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x01a1, code lost:
    
        r1.A04 = r0.A0D(r9);
        r25.A0H.A06 = (-r25.A0B.A0D(r9)) + r25.A0B.A06();
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x019d, code lost:
    
        r1.A05 = -1;
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0043, code lost:
    
        r16 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x01c1, code lost:
    
        r6 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x01bd, code lost:
    
        if (r28 > 0) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0021, code lost:
    
        if (r28 < 0) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int A01(X.C70593Ew r26, X.C3F5 r27, int r28) {
        /*
            Method dump skipped, instructions count: 453
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.FlexboxLayoutManager.A01(X.3Ew, X.3F5, int):int");
    }

    private int A04(C70593Ew c70593Ew, C3F5 c3f5, L89 l89) {
        int i;
        float f;
        float f2;
        int round;
        int round2;
        int i2;
        float f3;
        float f4;
        int round3;
        int measuredWidth;
        int i3 = l89.A06;
        if (i3 != Integer.MIN_VALUE) {
            int i4 = l89.A00;
            if (i4 < 0) {
                l89.A06 = i3 + i4;
            }
            A0O(c70593Ew, l89);
        }
        int i5 = l89.A00;
        int i6 = i5;
        int i7 = 0;
        boolean CXy = CXy();
        while (true) {
            if (i6 <= 0 && !this.A0H.A07) {
                break;
            }
            List list = this.A0J;
            int i8 = l89.A05;
            if (i8 < 0 || i8 >= c3f5.A00() || (i = l89.A01) < 0 || i >= list.size()) {
                break;
            }
            C65777Tts c65777Tts = (C65777Tts) this.A0J.get(l89.A01);
            l89.A05 = c65777Tts.A04;
            if (CXy()) {
                int Bau = Bau();
                int Baw = Baw();
                int i9 = super.A03;
                int i10 = l89.A04;
                if (l89.A03 == -1) {
                    i10 -= c65777Tts.A02;
                }
                int i11 = l89.A05;
                int i12 = this.A04;
                if (i12 != 0) {
                    if (i12 != 1) {
                        float f5 = (i9 - c65777Tts.A08) / 2.0f;
                        f3 = Bau + f5;
                        f4 = (i9 - Baw) - f5;
                    } else {
                        int i13 = c65777Tts.A08;
                        f3 = (i9 - i13) + Baw;
                        f4 = i13 - Bau;
                    }
                } else {
                    f3 = Bau;
                    f4 = i9 - Baw;
                }
                float f6 = this.A0G.A02;
                float f7 = f3 - f6;
                float f8 = f4 - f6;
                float max = Math.max(0.0f, 0.0f);
                int i14 = 0;
                int i15 = c65777Tts.A06;
                for (int i16 = i11; i16 < i11 + i15; i16++) {
                    View view = (View) this.A0A.get(i16);
                    if (view != null || (view = this.A0D.A04(i16)) != null) {
                        int i17 = l89.A03;
                        Rect rect = A0P;
                        if (i17 == 1) {
                            A0r(view, rect);
                            A0o(view, -1);
                        } else {
                            A0r(view, rect);
                            A0o(view, i14);
                            i14++;
                        }
                        C65776Ttr c65776Ttr = this.A0O;
                        long j = c65776Ttr.A01[i16];
                        int i18 = (int) j;
                        int i19 = (int) (j >> 32);
                        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                        if (view.isLayoutRequested() || !super.A0D || !A0S(view.getWidth(), i18, ((ViewGroup.LayoutParams) marginLayoutParams).width) || !A0S(view.getHeight(), i19, ((ViewGroup.LayoutParams) marginLayoutParams).height)) {
                            view.measure(i18, i19);
                        }
                        float A0B = f7 + marginLayoutParams.leftMargin + AbstractC70663Fe.A0B(view);
                        float A0D = f8 - (marginLayoutParams.rightMargin + AbstractC70663Fe.A0D(view));
                        int i20 = i10 + ((C3OP) view.getLayoutParams()).A02.top;
                        if (this.A0L) {
                            measuredWidth = Math.round(A0D);
                            round3 = measuredWidth - view.getMeasuredWidth();
                        } else {
                            round3 = Math.round(A0B);
                            measuredWidth = round3 + view.getMeasuredWidth();
                        }
                        c65776Ttr.A0D(view, c65777Tts, round3, i20, measuredWidth, i20 + view.getMeasuredHeight());
                        f7 = A0B + view.getMeasuredWidth() + marginLayoutParams.rightMargin + AbstractC70663Fe.A0D(view) + max;
                        f8 = A0D - (((view.getMeasuredWidth() + marginLayoutParams.leftMargin) + AbstractC70663Fe.A0B(view)) + max);
                    }
                }
            } else {
                int Bax = Bax();
                int Bat = Bat();
                int i21 = super.A00;
                int i22 = l89.A04;
                int i23 = i22;
                if (l89.A03 == -1) {
                    int i24 = c65777Tts.A02;
                    i23 = i22 - i24;
                    i22 += i24;
                }
                int i25 = l89.A05;
                int i26 = this.A04;
                if (i26 != 0) {
                    if (i26 != 1) {
                        float f9 = (i21 - c65777Tts.A08) / 2.0f;
                        f = Bax + f9;
                        f2 = (i21 - Bat) - f9;
                    } else {
                        int i27 = c65777Tts.A08;
                        f = (i21 - i27) + Bat;
                        f2 = i27 - Bax;
                    }
                } else {
                    f = Bax;
                    f2 = i21 - Bat;
                }
                float f10 = this.A0G.A02;
                float f11 = f - f10;
                float f12 = f2 - f10;
                float max2 = Math.max(0.0f, 0.0f);
                int i28 = 0;
                int i29 = c65777Tts.A06;
                for (int i30 = i25; i30 < i25 + i29; i30++) {
                    View view2 = (View) this.A0A.get(i30);
                    if (view2 != null || (view2 = this.A0D.A04(i30)) != null) {
                        C65776Ttr c65776Ttr2 = this.A0O;
                        long j2 = c65776Ttr2.A01[i30];
                        int i31 = (int) j2;
                        int i32 = (int) (j2 >> 32);
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view2.getLayoutParams();
                        if (view2.isLayoutRequested() || !super.A0D || !A0S(view2.getWidth(), i31, ((ViewGroup.LayoutParams) marginLayoutParams2).width) || !A0S(view2.getHeight(), i32, ((ViewGroup.LayoutParams) marginLayoutParams2).height)) {
                            view2.measure(i31, i32);
                        }
                        float f13 = f11 + marginLayoutParams2.topMargin + ((C3OP) view2.getLayoutParams()).A02.top;
                        float f14 = f12 - (marginLayoutParams2.rightMargin + ((C3OP) view2.getLayoutParams()).A02.bottom);
                        int i33 = l89.A03;
                        Rect rect2 = A0P;
                        if (i33 == 1) {
                            A0r(view2, rect2);
                            A0o(view2, -1);
                        } else {
                            A0r(view2, rect2);
                            A0o(view2, i28);
                            i28++;
                        }
                        int A0B2 = i23 + AbstractC70663Fe.A0B(view2);
                        int A0D2 = i22 - AbstractC70663Fe.A0D(view2);
                        boolean z = this.A0L;
                        boolean z2 = this.A0K;
                        if (z) {
                            A0B2 = A0D2 - view2.getMeasuredWidth();
                            if (z2) {
                                round2 = Math.round(f14);
                                round = round2 - view2.getMeasuredHeight();
                                c65776Ttr2.A0E(view2, c65777Tts, A0B2, round, A0D2, round2, z);
                                f11 = f13 + view2.getMeasuredHeight() + marginLayoutParams2.topMargin + ((C3OP) view2.getLayoutParams()).A02.bottom + max2;
                                f12 = f14 - (((view2.getMeasuredHeight() + marginLayoutParams2.bottomMargin) + ((C3OP) view2.getLayoutParams()).A02.top) + max2);
                            } else {
                                round = Math.round(f13);
                                round2 = round + view2.getMeasuredHeight();
                                c65776Ttr2.A0E(view2, c65777Tts, A0B2, round, A0D2, round2, z);
                                f11 = f13 + view2.getMeasuredHeight() + marginLayoutParams2.topMargin + ((C3OP) view2.getLayoutParams()).A02.bottom + max2;
                                f12 = f14 - (((view2.getMeasuredHeight() + marginLayoutParams2.bottomMargin) + ((C3OP) view2.getLayoutParams()).A02.top) + max2);
                            }
                        } else if (z2) {
                            round2 = Math.round(f14);
                            round = round2 - view2.getMeasuredHeight();
                            A0D2 = A0B2 + view2.getMeasuredWidth();
                            c65776Ttr2.A0E(view2, c65777Tts, A0B2, round, A0D2, round2, z);
                            f11 = f13 + view2.getMeasuredHeight() + marginLayoutParams2.topMargin + ((C3OP) view2.getLayoutParams()).A02.bottom + max2;
                            f12 = f14 - (((view2.getMeasuredHeight() + marginLayoutParams2.bottomMargin) + ((C3OP) view2.getLayoutParams()).A02.top) + max2);
                        } else {
                            round = Math.round(f13);
                            A0D2 = A0B2 + view2.getMeasuredWidth();
                            round2 = round + view2.getMeasuredHeight();
                            c65776Ttr2.A0E(view2, c65777Tts, A0B2, round, A0D2, round2, z);
                            f11 = f13 + view2.getMeasuredHeight() + marginLayoutParams2.topMargin + ((C3OP) view2.getLayoutParams()).A02.bottom + max2;
                            f12 = f14 - (((view2.getMeasuredHeight() + marginLayoutParams2.bottomMargin) + ((C3OP) view2.getLayoutParams()).A02.top) + max2);
                        }
                    }
                }
            }
            l89.A01 += this.A0H.A03;
            int i34 = c65777Tts.A02;
            i7 += i34;
            if (!CXy && this.A0L) {
                i2 = l89.A04 - (l89.A03 * i34);
            } else {
                i2 = l89.A04 + (l89.A03 * i34);
            }
            l89.A04 = i2;
            i6 -= i34;
        }
        int i35 = l89.A00 - i7;
        l89.A00 = i35;
        int i36 = l89.A06;
        if (i36 != Integer.MIN_VALUE) {
            int i37 = i36 + i7;
            l89.A06 = i37;
            if (i35 < 0) {
                l89.A06 = i37 + i35;
            }
            A0O(c70593Ew, l89);
        }
        return i5 - l89.A00;
    }

    private void A0N() {
        AbstractC70763Fo c70773Fp;
        if (this.A0B == null) {
            boolean CXy = CXy();
            int i = this.A03;
            if (!CXy ? i != 0 : i == 0) {
                this.A0B = new C70773Fp(this);
                c70773Fp = new C3H6(this);
            } else {
                this.A0B = new C3H6(this);
                c70773Fp = new C70773Fp(this);
            }
            this.A0C = c70773Fp;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0067 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void A0O(X.C70593Ew r11, X.L89 r12) {
        /*
            Method dump skipped, instructions count: 238
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.FlexboxLayoutManager.A0O(X.3Ew, X.L89):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0011, code lost:
    
        if (r3 == Integer.MIN_VALUE) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void A0P(X.C65775Ttq r5, boolean r6, boolean r7) {
        /*
            r4 = this;
            if (r7 == 0) goto L7f
            boolean r0 = r4.CXy()
            if (r0 == 0) goto L7c
            int r3 = r4.A01
        La:
            X.L89 r2 = r4.A0H
            if (r3 == 0) goto L13
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = 0
            if (r3 != r1) goto L14
        L13:
            r0 = 1
        L14:
            r2.A07 = r0
            boolean r0 = r4.CXy()
            if (r0 != 0) goto L71
            boolean r0 = r4.A0L
            if (r0 == 0) goto L71
            X.L89 r2 = r4.A0H
            int r1 = r5.A00
            int r0 = r4.Baw()
        L28:
            int r1 = r1 - r0
            r2.A00 = r1
            X.L89 r1 = r4.A0H
            int r0 = r5.A03
            r1.A05 = r0
            r2 = 1
            r1.A03 = r2
            int r0 = r5.A00
            r1.A04 = r0
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r1.A06 = r0
            int r0 = r5.A01
            r1.A01 = r0
            if (r6 == 0) goto L70
            java.util.List r0 = r4.A0J
            int r0 = r0.size()
            if (r0 <= r2) goto L70
            int r1 = r5.A01
            if (r1 < 0) goto L70
            java.util.List r0 = r4.A0J
            int r0 = r0.size()
            int r0 = r0 - r2
            if (r1 >= r0) goto L70
            java.util.List r1 = r4.A0J
            int r0 = r5.A01
            java.lang.Object r3 = r1.get(r0)
            X.Tts r3 = (X.C65777Tts) r3
            X.L89 r2 = r4.A0H
            int r0 = r2.A01
            int r0 = r0 + 1
            r2.A01 = r0
            int r1 = r2.A05
            int r0 = r3.A06
            int r1 = r1 + r0
            r2.A05 = r1
        L70:
            return
        L71:
            X.L89 r2 = r4.A0H
            X.3Fo r0 = r4.A0B
            int r1 = r0.A03()
            int r0 = r5.A00
            goto L28
        L7c:
            int r3 = r4.A04
            goto La
        L7f:
            X.L89 r2 = r4.A0H
            r0 = 0
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.FlexboxLayoutManager.A0P(X.Ttq, boolean, boolean):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0011, code lost:
    
        if (r3 == Integer.MIN_VALUE) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void A0Q(X.C65775Ttq r5, boolean r6, boolean r7) {
        /*
            r4 = this;
            if (r7 == 0) goto L77
            boolean r0 = r4.CXy()
            if (r0 == 0) goto L74
            int r3 = r4.A01
        La:
            X.L89 r2 = r4.A0H
            if (r3 == 0) goto L13
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = 0
            if (r3 != r1) goto L14
        L13:
            r0 = 1
        L14:
            r2.A07 = r0
            boolean r0 = r4.CXy()
            if (r0 != 0) goto L6f
            boolean r0 = r4.A0L
            if (r0 == 0) goto L6f
            X.L89 r2 = r4.A0H
            android.view.View r0 = r4.A0M
            int r1 = r0.getWidth()
            int r0 = r5.A00
            int r1 = r1 - r0
        L2b:
            X.3Fo r0 = r4.A0B
            int r0 = r0.A06()
            int r1 = r1 - r0
            r2.A00 = r1
            X.L89 r1 = r4.A0H
            int r0 = r5.A03
            r1.A05 = r0
            r0 = -1
            r1.A03 = r0
            int r0 = r5.A00
            r1.A04 = r0
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r1.A06 = r0
            int r0 = r5.A01
            r1.A01 = r0
            if (r6 == 0) goto L6e
            if (r0 <= 0) goto L6e
            java.util.List r0 = r4.A0J
            int r0 = r0.size()
            int r1 = r5.A01
            if (r0 <= r1) goto L6e
            java.util.List r0 = r4.A0J
            java.lang.Object r3 = r0.get(r1)
            X.Tts r3 = (X.C65777Tts) r3
            X.L89 r2 = r4.A0H
            int r0 = r2.A01
            int r0 = r0 + (-1)
            r2.A01 = r0
            int r1 = r2.A05
            int r0 = r3.A06
            int r1 = r1 - r0
            r2.A05 = r1
        L6e:
            return
        L6f:
            X.L89 r2 = r4.A0H
            int r1 = r5.A00
            goto L2b
        L74:
            int r3 = r4.A04
            goto La
        L77:
            X.L89 r2 = r4.A0H
            r0 = 0
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.FlexboxLayoutManager.A0Q(X.Ttq, boolean, boolean):void");
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [com.google.android.flexbox.FlexboxLayoutManager$SavedState, android.os.Parcelable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v2, types: [com.google.android.flexbox.FlexboxLayoutManager$SavedState, java.lang.Object] */
    @Override // X.AbstractC70663Fe
    public final Parcelable A1M() {
        int A0D;
        SavedState savedState;
        SavedState savedState2 = this.A0I;
        if (savedState2 != null) {
            ?? obj = new Object();
            obj.A01 = savedState2.A01;
            A0D = savedState2.A00;
            savedState = obj;
        } else {
            ?? obj2 = new Object();
            if (A0T() > 0) {
                View A0e = A0e(0);
                obj2.A01 = AbstractC70663Fe.A0C(A0e);
                A0D = this.A0B.A0D(A0e) - this.A0B.A06();
                savedState = obj2;
            } else {
                obj2.A01 = -1;
                return obj2;
            }
        }
        savedState.A00 = A0D;
        return savedState;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [X.3OP, com.google.android.flexbox.FlexboxLayoutManager$LayoutParams] */
    @Override // X.AbstractC70663Fe
    public final C3OP A1N(Context context, AttributeSet attributeSet) {
        ?? c3op = new C3OP(context, attributeSet);
        c3op.A01 = 0.0f;
        c3op.A02 = 1.0f;
        c3op.A03 = -1;
        c3op.A00 = -1.0f;
        c3op.A05 = 16777215;
        c3op.A04 = 16777215;
        return c3op;
    }

    @Override // X.AbstractC70663Fe
    public final void A1O(int i) {
        this.A08 = i;
        this.A09 = Integer.MIN_VALUE;
        SavedState savedState = this.A0I;
        if (savedState != null) {
            savedState.A01 = -1;
        }
        A0i();
    }

    @Override // X.AbstractC70663Fe
    public final void A1P(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            this.A0I = (SavedState) parcelable;
            A0i();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:176:0x036c, code lost:
    
        if (r8 != 1) goto L177;
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x036a, code lost:
    
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x036f, code lost:
    
        r22.A0L = r0;
        r22.A0K = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x036e, code lost:
    
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x0367, code lost:
    
        if (r8 == 1) goto L177;
     */
    /* JADX WARN: Removed duplicated region for block: B:150:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x02d5  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x02e2  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x031a  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x033a  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:63:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x014d  */
    @Override // X.AbstractC70663Fe
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A1R(X.C70593Ew r23, X.C3F5 r24) {
        /*
            Method dump skipped, instructions count: 894
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.FlexboxLayoutManager.A1R(X.3Ew, X.3F5):void");
    }

    public final void A1a(int i) {
        if (this.A02 != i) {
            A0h();
            this.A02 = i;
            this.A0B = null;
            this.A0C = null;
            this.A0J.clear();
            C65775Ttq c65775Ttq = this.A0G;
            C65775Ttq.A01(c65775Ttq);
            c65775Ttq.A02 = 0;
            A0i();
        }
    }

    @Override // X.InterfaceC87383uy
    public final int BLA() {
        if (this.A0J.size() == 0) {
            return 0;
        }
        int i = Integer.MIN_VALUE;
        int size = this.A0J.size();
        for (int i2 = 0; i2 < size; i2++) {
            i = Math.max(i, ((C65777Tts) this.A0J.get(i2)).A08);
        }
        return i;
    }

    @Override // X.InterfaceC87383uy
    public final View Bmv(int i) {
        View view = (View) this.A0A.get(i);
        if (view == null) {
            return this.A0D.A04(i);
        }
        return view;
    }

    @Override // X.InterfaceC87383uy
    public final boolean CXy() {
        int i = this.A02;
        if (i == 0 || i == 1) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [X.Vah, java.lang.Object] */
    public FlexboxLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        int i3;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C3FM.A00, i, i2);
        int i4 = obtainStyledAttributes.getInt(0, 1);
        obtainStyledAttributes.getInt(10, 1);
        boolean z = obtainStyledAttributes.getBoolean(9, false);
        obtainStyledAttributes.getBoolean(11, false);
        obtainStyledAttributes.recycle();
        if (i4 != 0) {
            if (i4 == 1) {
                i3 = 2;
                if (z) {
                    i3 = 3;
                }
                A1a(i3);
            }
        } else if (z) {
            A1a(1);
        } else {
            i3 = 0;
            A1a(i3);
        }
        if (this.A03 != 1) {
            A0h();
            this.A0J.clear();
            C65775Ttq c65775Ttq = this.A0G;
            C65775Ttq.A01(c65775Ttq);
            c65775Ttq.A02 = 0;
            this.A03 = 1;
            this.A0B = null;
            this.A0C = null;
            A0i();
        }
        if (this.A00 != 4) {
            A0h();
            this.A0J.clear();
            C65775Ttq c65775Ttq2 = this.A0G;
            C65775Ttq.A01(c65775Ttq2);
            c65775Ttq2.A02 = 0;
            this.A00 = 4;
            A0i();
        }
        A12(true);
        this.A0N = context;
    }

    private int A00(int i) {
        int height;
        int i2;
        int i3;
        if (A0T() == 0 || i == 0) {
            return 0;
        }
        A0N();
        boolean CXy = CXy();
        View view = this.A0M;
        if (CXy) {
            height = view.getWidth();
            i2 = super.A03;
        } else {
            height = view.getHeight();
            i2 = super.A00;
        }
        if (super.A07.getLayoutDirection() == 1) {
            int abs = Math.abs(i);
            C65775Ttq c65775Ttq = this.A0G;
            if (i < 0) {
                i3 = Math.min((i2 + c65775Ttq.A02) - height, abs);
            } else {
                i3 = c65775Ttq.A02;
                if (i3 + i <= 0) {
                    return i;
                }
            }
        } else {
            C65775Ttq c65775Ttq2 = this.A0G;
            if (i > 0) {
                return Math.min((i2 - c65775Ttq2.A02) - height, i);
            }
            i3 = c65775Ttq2.A02;
            if (i3 + i >= 0) {
                return i;
            }
        }
        return -i3;
    }

    private int A02(C70593Ew c70593Ew, C3F5 c3f5, int i, boolean z) {
        int i2;
        int A03;
        if (!CXy() && this.A0L) {
            int A06 = i - this.A0B.A06();
            if (A06 <= 0) {
                return 0;
            }
            i2 = A01(c70593Ew, c3f5, A06);
        } else {
            int A032 = this.A0B.A03() - i;
            if (A032 <= 0) {
                return 0;
            }
            i2 = -A01(c70593Ew, c3f5, -A032);
        }
        int i3 = i + i2;
        if (z && (A03 = this.A0B.A03() - i3) > 0) {
            this.A0B.A0E(A03);
            return A03 + i2;
        }
        return i2;
    }

    private int A03(C70593Ew c70593Ew, C3F5 c3f5, int i, boolean z) {
        int i2;
        int A06;
        if (!CXy() && this.A0L) {
            int A03 = this.A0B.A03() - i;
            if (A03 > 0) {
                i2 = A01(c70593Ew, c3f5, -A03);
                int i3 = i + i2;
                return !z ? i2 : i2;
            }
            return 0;
        }
        int A062 = i - this.A0B.A06();
        if (A062 > 0) {
            i2 = -A01(c70593Ew, c3f5, A062);
            int i32 = i + i2;
            if (!z && (A06 = i32 - this.A0B.A06()) > 0) {
                this.A0B.A0E(-A06);
                return i2 - A06;
            }
        }
        return 0;
    }

    public static int A05(C3F5 c3f5, FlexboxLayoutManager flexboxLayoutManager) {
        if (flexboxLayoutManager.A0T() == 0) {
            return 0;
        }
        int A00 = c3f5.A00();
        flexboxLayoutManager.A0N();
        View A08 = flexboxLayoutManager.A08(A00);
        View A0I = flexboxLayoutManager.A0I(A00);
        if (c3f5.A00() == 0 || A08 == null || A0I == null) {
            return 0;
        }
        return Math.min(flexboxLayoutManager.A0B.A07(), flexboxLayoutManager.A0B.A08(A0I) - flexboxLayoutManager.A0B.A0D(A08));
    }

    public static int A06(C3F5 c3f5, FlexboxLayoutManager flexboxLayoutManager) {
        if (flexboxLayoutManager.A0T() == 0) {
            return 0;
        }
        int A00 = c3f5.A00();
        View A08 = flexboxLayoutManager.A08(A00);
        View A0I = flexboxLayoutManager.A0I(A00);
        if (c3f5.A00() == 0 || A08 == null || A0I == null) {
            return 0;
        }
        int A0C = AbstractC70663Fe.A0C(A08);
        int A0C2 = AbstractC70663Fe.A0C(A0I);
        int abs = Math.abs(flexboxLayoutManager.A0B.A08(A0I) - flexboxLayoutManager.A0B.A0D(A08));
        int[] iArr = flexboxLayoutManager.A0O.A00;
        int i = iArr[A0C];
        if (i == 0 || i == -1) {
            return 0;
        }
        return Math.round((i * (abs / ((iArr[A0C2] - i) + 1))) + (flexboxLayoutManager.A0B.A06() - flexboxLayoutManager.A0B.A0D(A08)));
    }

    public static int A07(C3F5 c3f5, FlexboxLayoutManager flexboxLayoutManager) {
        int A0C;
        if (flexboxLayoutManager.A0T() == 0) {
            return 0;
        }
        int A00 = c3f5.A00();
        View A08 = flexboxLayoutManager.A08(A00);
        View A0I = flexboxLayoutManager.A0I(A00);
        if (c3f5.A00() == 0 || A08 == null || A0I == null) {
            return 0;
        }
        View A0M = A0M(flexboxLayoutManager, 0, flexboxLayoutManager.A0T());
        if (A0M == null) {
            A0C = -1;
        } else {
            A0C = AbstractC70663Fe.A0C(A0M);
        }
        int i = -1;
        View A0M2 = A0M(flexboxLayoutManager, flexboxLayoutManager.A0T() - 1, -1);
        if (A0M2 != null) {
            i = AbstractC70663Fe.A0C(A0M2);
        }
        return (int) ((Math.abs(flexboxLayoutManager.A0B.A08(A0I) - flexboxLayoutManager.A0B.A0D(A08)) / ((i - A0C) + 1)) * c3f5.A00());
    }

    private View A0I(int i) {
        View A0J = A0J(A0T() - 1, -1, i);
        if (A0J == null) {
            return null;
        }
        return A0L(A0J, (C65777Tts) this.A0J.get(this.A0O.A00[AbstractC70663Fe.A0C(A0J)]));
    }

    private View A0J(int i, int i2, int i3) {
        A0N();
        if (this.A0H == null) {
            this.A0H = new L89();
        }
        int A06 = this.A0B.A06();
        int A03 = this.A0B.A03();
        int i4 = -1;
        if (i2 > i) {
            i4 = 1;
        }
        View view = null;
        View view2 = null;
        while (i != i2) {
            View A0e = A0e(i);
            int A0C = AbstractC70663Fe.A0C(A0e);
            if (A0C >= 0 && A0C < i3) {
                if (((C3OP) A0e.getLayoutParams()).mViewHolder.isRemoved()) {
                    if (view2 == null) {
                        view2 = A0e;
                    }
                } else {
                    if (this.A0B.A0D(A0e) >= A06 && this.A0B.A08(A0e) <= A03) {
                        return A0e;
                    }
                    if (view == null) {
                        view = A0e;
                    }
                }
            }
            i += i4;
        }
        if (view == null) {
            return view2;
        }
        return view;
    }

    private View A0K(View view, C65777Tts c65777Tts) {
        boolean CXy = CXy();
        int i = c65777Tts.A06;
        for (int i2 = 1; i2 < i; i2++) {
            View A0e = A0e(i2);
            if (A0e != null && A0e.getVisibility() != 8) {
                if (this.A0L && !CXy) {
                    if (this.A0B.A08(view) >= this.A0B.A08(A0e)) {
                    }
                    view = A0e;
                } else {
                    if (this.A0B.A0D(view) <= this.A0B.A0D(A0e)) {
                    }
                    view = A0e;
                }
            }
        }
        return view;
    }

    private View A0L(View view, C65777Tts c65777Tts) {
        boolean CXy = CXy();
        int A0T = (A0T() - c65777Tts.A06) - 1;
        for (int A0T2 = A0T() - 2; A0T2 > A0T; A0T2--) {
            View A0e = A0e(A0T2);
            if (A0e != null && A0e.getVisibility() != 8) {
                if (this.A0L && !CXy) {
                    if (this.A0B.A0D(view) <= this.A0B.A0D(A0e)) {
                    }
                    view = A0e;
                } else {
                    if (this.A0B.A08(view) >= this.A0B.A08(A0e)) {
                    }
                    view = A0e;
                }
            }
        }
        return view;
    }

    public static void A0R(FlexboxLayoutManager flexboxLayoutManager, int i) {
        int A0D;
        int i2 = -1;
        View A0M = A0M(flexboxLayoutManager, flexboxLayoutManager.A0T() - 1, -1);
        if (A0M != null) {
            i2 = AbstractC70663Fe.A0C(A0M);
        }
        if (i < i2) {
            int A0T = flexboxLayoutManager.A0T();
            C65776Ttr c65776Ttr = flexboxLayoutManager.A0O;
            c65776Ttr.A09(A0T);
            c65776Ttr.A0A(A0T);
            c65776Ttr.A08(A0T);
            if (i < c65776Ttr.A00.length) {
                flexboxLayoutManager.A01 = i;
                View A0e = flexboxLayoutManager.A0e(0);
                if (A0e != null) {
                    flexboxLayoutManager.A08 = AbstractC70663Fe.A0C(A0e);
                    if (!flexboxLayoutManager.CXy() && flexboxLayoutManager.A0L) {
                        A0D = flexboxLayoutManager.A0B.A08(A0e) + flexboxLayoutManager.A0B.A04();
                    } else {
                        A0D = flexboxLayoutManager.A0B.A0D(A0e) - flexboxLayoutManager.A0B.A06();
                    }
                    flexboxLayoutManager.A09 = A0D;
                }
            }
        }
    }

    public static boolean A0S(int i, int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (i3 <= 0 || i == i3) {
            if (mode != Integer.MIN_VALUE) {
                if (mode == 0) {
                    return true;
                }
                if (mode == 1073741824 && size == i) {
                    return true;
                }
            } else if (size >= i) {
                return true;
            }
        }
        return false;
    }

    @Override // X.AbstractC70663Fe
    public final int A1K(C70593Ew c70593Ew, C3F5 c3f5, int i) {
        if (!CXy()) {
            int A01 = A01(c70593Ew, c3f5, i);
            this.A0A.clear();
            return A01;
        }
        int A00 = A00(i);
        this.A0G.A02 += A00;
        this.A0C.A0E(-A00);
        return A00;
    }

    @Override // X.AbstractC70663Fe
    public final int A1L(C70593Ew c70593Ew, C3F5 c3f5, int i) {
        if (CXy()) {
            int A01 = A01(c70593Ew, c3f5, i);
            this.A0A.clear();
            return A01;
        }
        int A00 = A00(i);
        this.A0G.A02 += A00;
        this.A0C.A0E(-A00);
        return A00;
    }

    @Override // X.AbstractC70663Fe
    public final void A1T(C3F5 c3f5, RecyclerView recyclerView, int i) {
        C110814yt c110814yt = new C110814yt(recyclerView.getContext());
        ((AbstractC110824yu) c110814yt).A00 = i;
        A10(c110814yt);
    }

    @Override // X.AbstractC70663Fe
    public final void A1U(RecyclerView recyclerView) {
        this.A0M = (View) recyclerView.getParent();
    }

    @Override // X.AbstractC70663Fe
    public final boolean A1X() {
        if (CXy() && super.A03 <= this.A0M.getWidth()) {
            return false;
        }
        return true;
    }

    @Override // X.AbstractC70663Fe
    public final boolean A1Y() {
        if (!CXy() && super.A00 <= this.A0M.getHeight()) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC70673Ff
    public final PointF AIz(int i) {
        if (A0T() == 0) {
            return null;
        }
        int i2 = 1;
        if (i < AbstractC70663Fe.A0C(A0e(0))) {
            i2 = -1;
        }
        float f = i2;
        if (CXy()) {
            return new PointF(0.0f, f);
        }
        return new PointF(f, 0.0f);
    }

    @Override // X.InterfaceC87383uy
    public final int Aw5(View view) {
        int A0B;
        int A0D;
        if (CXy()) {
            A0B = ((C3OP) view.getLayoutParams()).A02.top;
            A0D = ((C3OP) view.getLayoutParams()).A02.bottom;
        } else {
            A0B = AbstractC70663Fe.A0B(view);
            A0D = AbstractC70663Fe.A0D(view);
        }
        return A0B + A0D;
    }

    @Override // X.AbstractC70663Fe
    public final void A1Q(C2UU c2uu, C2UU c2uu2) {
        A0h();
    }

    @Override // X.AbstractC70663Fe
    public final boolean A1Z(C3OP c3op) {
        return c3op instanceof LayoutParams;
    }

    @Override // X.AbstractC70663Fe
    public final void A1V(RecyclerView recyclerView, int i, int i2) {
        A0R(this, i);
    }

    @Override // X.AbstractC70663Fe
    public final void A1W(RecyclerView recyclerView, int i, int i2) {
        A0R(this, i);
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [X.Vah, java.lang.Object] */
    public FlexboxLayoutManager(Context context) {
        A1a(0);
        if (this.A03 != 1) {
            A0h();
            this.A0J.clear();
            C65775Ttq c65775Ttq = this.A0G;
            C65775Ttq.A01(c65775Ttq);
            c65775Ttq.A02 = 0;
            this.A03 = 1;
            this.A0B = null;
            this.A0C = null;
            A0i();
        }
        if (this.A00 != 4) {
            A0h();
            this.A0J.clear();
            C65775Ttq c65775Ttq2 = this.A0G;
            C65775Ttq.A01(c65775Ttq2);
            c65775Ttq2.A02 = 0;
            this.A00 = 4;
            A0i();
        }
        A12(true);
        this.A0N = context;
    }
}
