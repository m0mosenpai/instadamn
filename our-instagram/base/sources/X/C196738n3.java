package X;

import android.graphics.Bitmap;
import android.graphics.Rect;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.react.modules.base.IgReactQEModule;

/* renamed from: X.8n3, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C196738n3 {
    public Bitmap A00;
    public Rect A01;
    public Rect A02;
    public C196708n0 A03;
    public C196748n4 A04;
    public Boolean A05;
    public Float A06;
    public Float A07;
    public Integer A08;
    public Integer A09;
    public Integer A0A;
    public Integer A0B;
    public Integer A0C;
    public Integer A0D;
    public Long A0E;
    public byte[] A0F;
    public byte[] A0G;
    public final int A0H;
    public final int A0I;
    public final Rect A0J;

    public final Object A00(C196768n6 c196768n6) {
        int i = c196768n6.A00;
        switch (i) {
            case 0:
                return this.A0F;
            case 1:
                return this.A03;
            case 2:
                return this.A02;
            case 3:
            case 4:
            case 5:
            case 6:
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
            default:
                throw new RuntimeException(AnonymousClass001.A0O("Failed to get photo capture value: ", i));
            case 7:
                return this.A0E;
            case 8:
                return this.A0A;
            case 9:
                return this.A06;
            case 10:
                return this.A08;
            case 11:
                return this.A07;
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                return null;
            case 14:
                return this.A04;
            case Process.SIGTERM /* 15 */:
                return this.A0B;
            case 16:
                return this.A0D;
            case 17:
                return this.A05;
            case 18:
                return this.A0C;
            case Process.SIGSTOP /* 19 */:
                return this.A0G;
        }
    }

    public final void A01(C196768n6 c196768n6, Object obj) {
        int i = c196768n6.A00;
        switch (i) {
            case 0:
                this.A0F = (byte[]) obj;
                return;
            case 1:
                this.A03 = (C196708n0) obj;
                return;
            case 2:
                this.A02 = (Rect) obj;
                return;
            case 3:
            case 4:
            case 5:
            case 6:
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
            default:
                throw new RuntimeException(AnonymousClass001.A0O("Failed to set photo capture value: ", i));
            case 7:
                this.A0E = (Long) obj;
                return;
            case 8:
                this.A0A = (Integer) obj;
                return;
            case 9:
                this.A06 = (Float) obj;
                return;
            case 10:
                this.A08 = (Integer) obj;
                return;
            case 11:
                this.A07 = (Float) obj;
                return;
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                return;
            case 14:
                this.A04 = (C196748n4) obj;
                return;
            case Process.SIGTERM /* 15 */:
                this.A0B = (Integer) obj;
                return;
            case 16:
                this.A0D = (Integer) obj;
                return;
            case 17:
                this.A05 = (Boolean) obj;
                return;
            case 18:
                this.A0C = (Integer) obj;
                return;
            case Process.SIGSTOP /* 19 */:
                this.A0G = (byte[]) obj;
                return;
            case 20:
                this.A09 = (Integer) obj;
                return;
            case 21:
                this.A00 = (Bitmap) obj;
                return;
        }
    }

    public C196738n3(C196748n4 c196748n4) {
        this.A01 = (Rect) c196748n4.A03(C196748n4.A0M);
        this.A0J = (Rect) c196748n4.A03(C196748n4.A0N);
        this.A0I = ((Number) c196748n4.A03(C196748n4.A0L)).intValue();
        this.A0H = ((Number) c196748n4.A03(C196748n4.A0K)).intValue();
        this.A0F = (byte[]) c196748n4.A04(C196748n4.A0X);
        this.A0G = (byte[]) c196748n4.A04(C196748n4.A0b);
        this.A03 = (C196708n0) c196748n4.A04(C196748n4.A0Y);
        this.A02 = (Rect) c196748n4.A04(C196748n4.A0d);
        this.A0E = (Long) c196748n4.A04(C196748n4.A0T);
        this.A0A = (Integer) c196748n4.A04(C196748n4.A0Z);
        this.A06 = (Float) c196748n4.A04(C196748n4.A0O);
        this.A08 = (Integer) c196748n4.A04(C196748n4.A0P);
        this.A07 = (Float) c196748n4.A04(C196748n4.A0V);
        c196748n4.A04(C196748n4.A0R);
        this.A04 = (C196748n4) c196748n4.A04(C196748n4.A0Q);
        this.A0B = (Integer) c196748n4.A04(C196748n4.A0a);
        this.A0D = (Integer) c196748n4.A04(C196748n4.A0e);
        this.A05 = (Boolean) c196748n4.A04(C196748n4.A0S);
        this.A0C = (Integer) c196748n4.A04(C196748n4.A0c);
        this.A09 = (Integer) c196748n4.A04(C196748n4.A0U);
        this.A00 = (Bitmap) c196748n4.A04(C196748n4.A0W);
    }

    public C196738n3(Rect rect, Rect rect2, int i, int i2) {
        this.A01 = rect;
        this.A0J = rect2;
        this.A0I = i;
        this.A0H = i2;
    }
}
