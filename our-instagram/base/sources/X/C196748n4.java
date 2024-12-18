package X;

import android.graphics.Bitmap;
import android.graphics.Rect;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.react.modules.base.IgReactQEModule;

/* renamed from: X.8n4, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C196748n4 {
    public final int A00;
    public final int A01;
    public final Bitmap A02;
    public final Rect A03;
    public final Rect A04;
    public final Rect A05;
    public final C196708n0 A06;
    public final C196748n4 A07;
    public final Boolean A08;
    public final Float A09;
    public final Float A0A;
    public final Integer A0B;
    public final Integer A0C;
    public final Integer A0D;
    public final Integer A0E;
    public final Integer A0F;
    public final Integer A0G;
    public final Long A0H;
    public final byte[] A0I;
    public final byte[] A0J;
    public static final C196758n5 A0M = new C196758n5(4);
    public static final C196758n5 A0N = new C196758n5(3);
    public static final C196758n5 A0L = new C196758n5(5);
    public static final C196758n5 A0K = new C196758n5(6);
    public static final C196768n6 A0X = new C196768n6(0);
    public static final C196768n6 A0b = new C196768n6(19);
    public static final C196768n6 A0Y = new C196768n6(1);
    public static final C196768n6 A0d = new C196768n6(2);
    public static final C196768n6 A0T = new C196768n6(7);
    public static final C196768n6 A0Z = new C196768n6(8);
    public static final C196768n6 A0O = new C196768n6(9);
    public static final C196768n6 A0P = new C196768n6(10);
    public static final C196768n6 A0V = new C196768n6(11);
    public static final C196768n6 A0R = new C196768n6(13);
    public static final C196768n6 A0Q = new C196768n6(14);
    public static final C196768n6 A0a = new C196768n6(15);
    public static final C196768n6 A0e = new C196768n6(16);
    public static final C196768n6 A0S = new C196768n6(17);
    public static final C196768n6 A0c = new C196768n6(18);
    public static final C196768n6 A0U = new C196768n6(20);
    public static final C196768n6 A0W = new C196768n6(21);

    public static void A01(Rect rect, int i) {
        if (i == 90 || i == 270) {
            rect.set(0, 0, rect.height(), rect.width());
        }
    }

    public final Rect A02(int i) {
        Rect rect = this.A05;
        rect.getClass();
        if (i != 0) {
            A01(this.A04, i);
            A01(this.A03, i);
            A01(rect, i);
        }
        float width = rect.width() / rect.height();
        Rect A00 = A00(this.A04, width);
        return A00(A00(this.A03, r2.width() / r2.height()), A00.width() / A00.height());
    }

    public final Object A03(C196758n5 c196758n5) {
        int i;
        int i2 = c196758n5.A00;
        if (i2 != 3) {
            if (i2 != 4) {
                if (i2 != 5) {
                    i = this.A00;
                } else {
                    i = this.A01;
                }
                return Integer.valueOf(i);
            }
            return this.A03;
        }
        return this.A04;
    }

    public final Object A04(C196768n6 c196768n6) {
        int i = c196768n6.A00;
        switch (i) {
            case 0:
                return this.A0I;
            case 1:
                return this.A06;
            case 2:
                return this.A05;
            case 3:
                return this.A04;
            case 4:
            case 5:
            case 6:
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
            default:
                throw new RuntimeException(AnonymousClass001.A0O("Invalid photo capture result key: ", i));
            case 7:
                return this.A0H;
            case 8:
                return this.A0D;
            case 9:
                return this.A09;
            case 10:
                return this.A0B;
            case 11:
                return this.A0A;
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                return null;
            case 14:
                return this.A07;
            case Process.SIGTERM /* 15 */:
                return this.A0E;
            case 16:
                return this.A0G;
            case 17:
                return this.A08;
            case 18:
                return this.A0F;
            case Process.SIGSTOP /* 19 */:
                return this.A0J;
            case 20:
                return this.A0C;
            case 21:
                return this.A02;
        }
    }

    public C196748n4(C196738n3 c196738n3) {
        this.A03 = c196738n3.A01;
        this.A04 = c196738n3.A0J;
        this.A01 = c196738n3.A0I;
        this.A00 = c196738n3.A0H;
        this.A0I = c196738n3.A0F;
        this.A0J = c196738n3.A0G;
        this.A06 = c196738n3.A03;
        this.A05 = c196738n3.A02;
        this.A0H = c196738n3.A0E;
        this.A0D = c196738n3.A0A;
        this.A09 = c196738n3.A06;
        this.A0B = c196738n3.A08;
        this.A0A = c196738n3.A07;
        this.A07 = c196738n3.A04;
        this.A0E = c196738n3.A0B;
        this.A0G = c196738n3.A0D;
        this.A08 = c196738n3.A05;
        this.A0F = c196738n3.A0C;
        this.A0C = c196738n3.A09;
        this.A02 = c196738n3.A00;
    }

    public static Rect A00(Rect rect, float f) {
        int round;
        int i;
        int i2;
        int height;
        float width = rect.width() / rect.height();
        if (width < f) {
            height = Math.round((width / f) * rect.height());
            round = rect.left;
            i = rect.top + Math.round((rect.height() - height) / 2.0f);
            i2 = rect.width() + round;
        } else {
            int round2 = Math.round((f / width) * rect.width());
            round = rect.left + Math.round((rect.width() - round2) / 2.0f);
            i = rect.top;
            i2 = round2 + round;
            height = rect.height();
        }
        return new Rect(round, i, i2, height + i);
    }
}
