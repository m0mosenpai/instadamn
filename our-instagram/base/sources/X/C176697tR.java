package X;

import android.graphics.Rect;
import android.hardware.camera2.params.MeteringRectangle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.facebook.react.views.progressbar.ReactProgressBarViewManager;
import java.util.List;

/* renamed from: X.7tR, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C176697tR {
    public float A00;
    public float A01;
    public int A02;
    public int A03;
    public Rect A04;
    public Rect A05;
    public C176787ta A06;
    public C176817td A07;
    public AbstractC176767tY A08;
    public List A09;
    public List A0A;
    public boolean A0B;
    public MeteringRectangle[] A0C;
    public MeteringRectangle[] A0D;
    public final C1814082s A0F = new C1814082s();
    public final Handler A0E = new Handler(Looper.getMainLooper(), new Handler.Callback() { // from class: X.7tS
        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            int i;
            C176697tR c176697tR = C176697tR.this;
            if (message.what == 1) {
                List list = c176697tR.A0A;
                List list2 = c176697tR.A09;
                int i2 = message.arg1;
                float A06 = c176697tR.A06();
                if (list != null && list2 != null && i2 < list.size()) {
                    Object obj = message.obj;
                    if (obj != null) {
                        i = ((Number) obj).intValue();
                    } else {
                        i = 0;
                    }
                    C1814082s c1814082s = c176697tR.A0F;
                    float floatValue = ((Number) list2.get(list2.size() - 1)).floatValue();
                    list.get(list.size() - 1);
                    List list3 = c1814082s.A00;
                    int size = list3.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        C184848Hz c184848Hz = (C184848Hz) list3.get(i3);
                        C174757qB A00 = C184848Hz.A00(c184848Hz, AbstractC111324zv.A00(2817));
                        if (A00 != null) {
                            if (i != 1) {
                                if (i == 2) {
                                    C184848Hz.A02(A00, c184848Hz, 800L);
                                    AbstractC23641Du.A05(c184848Hz.A0A, new MC9(c184848Hz, A00, ReactProgressBarViewManager.DEFAULT_STYLE, (InterfaceC23621Ds) null, 17), c184848Hz.A0B);
                                }
                            } else if (c184848Hz.A09.get() == C8I1.A03) {
                                AbstractC23641Du.A05(c184848Hz.A0A, new MC9(c184848Hz, A00, "Ultra Wide", (InterfaceC23621Ds) null, 17), c184848Hz.A0B);
                                if (!A00.A0V() && A06 > floatValue) {
                                    Object A03 = C174757qB.A03(AbstractC176797tb.A0t, A00);
                                    A03.getClass();
                                    C184848Hz.A01(A00, c184848Hz, ((Number) A03).floatValue());
                                }
                            }
                            AbstractC13670mt.A06(AbstractC111324zv.A00(2818), Float.valueOf(A06), Integer.valueOf(i2));
                        }
                    }
                    return true;
                }
                return true;
            }
            return false;
        }
    });

    private float A00(float f) {
        float floatValue;
        Object obj;
        List list = this.A0A;
        List list2 = this.A09;
        if (list == null || list2 == null) {
            return 0.0f;
        }
        float A01 = A01(f, -1.0f, 1.0f, this.A03, this.A02);
        double d = A01;
        int floor = (int) Math.floor(d);
        int ceil = (int) Math.ceil(d);
        if (A01 >= 0.0f) {
            floatValue = ((Number) list.get(floor)).floatValue() / 100.0f;
            obj = list.get(ceil);
        } else {
            floatValue = ((Number) list2.get(-floor)).floatValue() / 100.0f;
            obj = list2.get(-ceil);
        }
        return A01(A01, floor, ceil, floatValue, ((Number) obj).floatValue() / 100.0f);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0066, code lost:
    
        if (r2 != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0007, code lost:
    
        if (r10 < r9) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0011, code lost:
    
        if (r10 == r9) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static float A01(float r6, float r7, float r8, float r9, float r10) {
        /*
            int r0 = (r8 > r7 ? 1 : (r8 == r7 ? 0 : -1))
            if (r0 < 0) goto L9
            int r0 = (r10 > r9 ? 1 : (r10 == r9 ? 0 : -1))
            r1 = 0
            if (r0 >= 0) goto La
        L9:
            r1 = 1
        La:
            int r0 = (r8 > r7 ? 1 : (r8 == r7 ? 0 : -1))
            if (r0 != 0) goto L13
            int r0 = (r10 > r9 ? 1 : (r10 == r9 ? 0 : -1))
            r2 = 1
            if (r0 != 0) goto L14
        L13:
            r2 = 0
        L14:
            if (r1 != 0) goto L2d
            if (r2 != 0) goto L2d
            int r0 = (r9 > r10 ? 1 : (r9 == r10 ? 0 : -1))
            if (r0 == 0) goto L2c
            int r0 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r0 <= 0) goto L2c
            int r0 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r0 < 0) goto L25
            return r10
        L25:
            float r6 = r6 - r7
            float r8 = r8 - r7
            float r6 = r6 / r8
            float r10 = r10 - r9
            float r6 = r6 * r10
            float r6 = r6 + r9
            return r6
        L2c:
            return r9
        L2d:
            java.lang.String r4 = ""
            if (r1 == 0) goto L64
            java.lang.String r1 = "invalid range bounds"
            if (r2 == 0) goto L65
            java.lang.String r0 = " & "
        L37:
            java.lang.String r4 = "zero source range"
        L39:
            java.lang.String r3 = "Camera2Device"
            java.util.Locale r2 = java.util.Locale.US
            java.lang.Float r5 = java.lang.Float.valueOf(r6)
            java.lang.Float r6 = java.lang.Float.valueOf(r7)
            java.lang.Float r7 = java.lang.Float.valueOf(r8)
            java.lang.Float r8 = java.lang.Float.valueOf(r9)
            java.lang.Float r9 = java.lang.Float.valueOf(r10)
            java.lang.String r10 = X.AnonymousClass001.A0g(r1, r0, r4)
            java.lang.Object[] r1 = new java.lang.Object[]{r5, r6, r7, r8, r9, r10}
            java.lang.String r0 = "Projecting zoom value %.3f from [%.2f, %.2f] to [%.2f, %.2f] failed - %s"
            java.lang.String r0 = java.lang.String.format(r2, r0, r1)
            X.AbstractC175037qd.A02(r3, r0)
            r6 = 0
            return r6
        L64:
            r1 = r4
        L65:
            r0 = r4
            if (r2 == 0) goto L39
            goto L37
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C176697tR.A01(float, float, float, float, float):float");
    }

    public static void A03(C175057qf c175057qf, C175307r4 c175307r4) {
        float A06 = c175057qf.A07.A06();
        C176697tR c176697tR = c175057qf.A07;
        Rect rect = c176697tR.A04;
        MeteringRectangle[] A04 = A04(c176697tR, c176697tR.A0D);
        C176697tR c176697tR2 = c175057qf.A07;
        c175307r4.A07(rect, A04, A04(c176697tR2, c176697tR2.A0C), A06);
    }

    public static MeteringRectangle[] A04(C176697tR c176697tR, MeteringRectangle[] meteringRectangleArr) {
        AbstractC176767tY abstractC176767tY = c176697tR.A08;
        C176787ta c176787ta = c176697tR.A06;
        Rect rect = c176697tR.A04;
        if (abstractC176767tY == null || !c176697tR.A0B) {
            if (c176787ta != null && rect != null) {
                Object A02 = c176787ta.A02(AbstractC176797tb.A11);
                A02.getClass();
                if (((Number) A02).intValue() != 0) {
                    return new MeteringRectangle[]{new MeteringRectangle(new Rect(0, 0, rect.width(), rect.height()), 0)};
                }
            } else {
                throw new IllegalStateException("Creating Metering Rects for zoom with mCameraSettings or mCropRectangle null.");
            }
        }
        return meteringRectangleArr;
    }

    public final float A05() {
        C176787ta c176787ta = this.A06;
        if (c176787ta == null) {
            return -1.0f;
        }
        Object A02 = c176787ta.A02(AbstractC176797tb.A0t);
        A02.getClass();
        return ((Number) A02).floatValue();
    }

    public final int A07() {
        C176787ta c176787ta = this.A06;
        if (c176787ta == null) {
            return 0;
        }
        Object A02 = c176787ta.A02(AbstractC176797tb.A11);
        A02.getClass();
        return ((Number) A02).intValue();
    }

    public final Rect A08(Rect rect) {
        Rect rect2 = this.A05;
        Rect rect3 = this.A04;
        if (rect2 != null && rect3 != null) {
            float width = rect3.width() / rect2.width();
            float height = rect3.height() / rect2.height();
            int width2 = (rect2.width() - rect3.width()) / 2;
            int centerX = (int) ((rect.centerX() * width) + width2);
            int centerY = (int) ((rect.centerY() * height) + ((rect2.height() - rect3.height()) / 2));
            Rect rect4 = new Rect(centerX, centerY, centerX, centerY);
            rect4.inset((-rect.width()) / 2, (-rect.height()) / 2);
            return rect4;
        }
        return rect;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0089, code lost:
    
        if (r2 >= r1) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A09(float r10, boolean r11) {
        /*
            r9 = this;
            X.7tY r1 = r9.A08
            X.7ta r0 = r9.A06
            X.7td r7 = r9.A07
            android.graphics.Rect r5 = r9.A05
            android.graphics.Rect r4 = r9.A04
            java.util.List r3 = r9.A0A
            r2 = 0
            if (r0 == 0) goto L1d
            if (r7 == 0) goto L1d
            if (r1 == 0) goto L1d
            if (r3 == 0) goto L1d
            boolean r0 = r9.A0B
            if (r0 == 0) goto L1e
            java.util.List r0 = r9.A09
            if (r0 != 0) goto L1e
        L1d:
            return r2
        L1e:
            if (r4 == 0) goto L1d
            if (r5 == 0) goto L1d
            float r0 = r9.A05()
            float r0 = r10 - r0
            float r1 = java.lang.Math.abs(r0)
            float r0 = r9.A00
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 < 0) goto L1d
            float r2 = r9.A05()
            float r1 = r9.A01
            int r0 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r0 >= 0) goto L82
            int r0 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r0 < 0) goto L82
            r8 = 1
        L41:
            r6 = -1082130432(0xffffffffbf800000, float:-1.0)
            r2 = 1065353216(0x3f800000, float:1.0)
            r1 = 0
            int r0 = r3.size()
            r3 = 1
            int r0 = r0 - r3
            float r0 = (float) r0
            float r0 = A01(r10, r6, r2, r1, r0)
            int r6 = (int) r0
            X.7tc r2 = X.AbstractC176797tb.A11
            java.lang.Integer r1 = java.lang.Integer.valueOf(r6)
            X.7tf r0 = r7.A00
            r0.A01(r2, r1)
            r7.A00()
            X.7tc r2 = X.AbstractC176797tb.A0t
            java.lang.Float r1 = java.lang.Float.valueOf(r10)
            X.7tf r0 = r7.A00
            r0.A01(r2, r1)
            r7.A00()
            boolean r0 = r9.A0B
            if (r0 == 0) goto L8d
            if (r11 != 0) goto L81
            android.os.Handler r1 = r9.A0E
            java.lang.Integer r0 = java.lang.Integer.valueOf(r8)
            android.os.Message r0 = r1.obtainMessage(r3, r6, r3, r0)
            r1.sendMessage(r0)
        L81:
            return r3
        L82:
            int r0 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r0 < 0) goto L8b
            int r0 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            r8 = 2
            if (r0 < 0) goto L41
        L8b:
            r8 = 0
            goto L41
        L8d:
            float r0 = r9.A00(r10)
            A02(r5, r4, r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C176697tR.A09(float, boolean):boolean");
    }

    public static void A02(Rect rect, Rect rect2, float f) {
        int width = rect.width();
        int height = rect.height();
        double d = f * 2.0d;
        int i = (int) (width / d);
        int i2 = (int) (height / d);
        int i3 = width / 2;
        int i4 = height / 2;
        rect2.set(i3 - i, i4 - i2, i3 + i, i4 + i2);
    }

    public final float A06() {
        return A00(A05()) * 100.0f;
    }
}
