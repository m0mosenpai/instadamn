package X;

import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.facebook.proxygen.TraceFieldType;
import com.instagram.react.modules.base.IgReactQEModule;
import go.Seq;
import java.util.concurrent.TimeUnit;

/* renamed from: X.PZc, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C57158PZc extends AbstractC23611Dp implements InterfaceC16620sF {
    public int A00;
    public Object A01;
    public final int A02;
    public final Object A03;

    public static void A02(Object obj, Object obj2, C19L c19l, int i) {
        AbstractC23641Du.A05(AnonymousClass191.A00, new C57158PZc(obj, obj2, null, i), c19l);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57158PZc(Object obj, InterfaceC23621Ds interfaceC23621Ds, int i) {
        super(2, interfaceC23621Ds);
        this.A02 = i;
        this.A03 = obj;
    }

    public static void A01(AbstractC23721Ec abstractC23721Ec, Number number, long j) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        abstractC23721Ec.A9s(TraceFieldType.StartTime, String.valueOf(timeUnit.toSeconds(j)));
        if (number != null) {
            abstractC23721Ec.A9s("end_time", String.valueOf(timeUnit.toSeconds(number.longValue())));
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        Object obj2;
        int i;
        Object obj3;
        Object obj4;
        int i2;
        Object obj5;
        Object obj6;
        int i3;
        switch (this.A02) {
            case 0:
                obj5 = this.A03;
                obj6 = this.A01;
                i3 = 0;
                return new C57158PZc(obj6, obj5, interfaceC23621Ds, i3);
            case 1:
                obj2 = this.A03;
                i = 1;
                C57158PZc c57158PZc = new C57158PZc(obj2, interfaceC23621Ds, i);
                c57158PZc.A01 = obj;
                return c57158PZc;
            case 2:
                obj5 = this.A03;
                obj6 = this.A01;
                i3 = 2;
                return new C57158PZc(obj6, obj5, interfaceC23621Ds, i3);
            case 3:
                obj5 = this.A03;
                obj6 = this.A01;
                i3 = 3;
                return new C57158PZc(obj6, obj5, interfaceC23621Ds, i3);
            case 4:
                obj2 = this.A03;
                i = 4;
                C57158PZc c57158PZc2 = new C57158PZc(obj2, interfaceC23621Ds, i);
                c57158PZc2.A01 = obj;
                return c57158PZc2;
            case 5:
                obj5 = this.A03;
                obj6 = this.A01;
                i3 = 5;
                return new C57158PZc(obj6, obj5, interfaceC23621Ds, i3);
            case 6:
                obj5 = this.A03;
                obj6 = this.A01;
                i3 = 6;
                return new C57158PZc(obj6, obj5, interfaceC23621Ds, i3);
            case 7:
                obj5 = this.A03;
                obj6 = this.A01;
                i3 = 7;
                return new C57158PZc(obj6, obj5, interfaceC23621Ds, i3);
            case 8:
                obj5 = this.A03;
                obj6 = this.A01;
                i3 = 8;
                return new C57158PZc(obj6, obj5, interfaceC23621Ds, i3);
            case 9:
                obj2 = this.A03;
                i = 9;
                C57158PZc c57158PZc22 = new C57158PZc(obj2, interfaceC23621Ds, i);
                c57158PZc22.A01 = obj;
                return c57158PZc22;
            case 10:
                obj2 = this.A03;
                i = 10;
                C57158PZc c57158PZc222 = new C57158PZc(obj2, interfaceC23621Ds, i);
                c57158PZc222.A01 = obj;
                return c57158PZc222;
            case 11:
                obj3 = this.A01;
                obj4 = this.A03;
                i2 = 11;
                return new C57158PZc(obj3, obj4, interfaceC23621Ds, i2);
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                obj3 = this.A01;
                obj4 = this.A03;
                i2 = 12;
                return new C57158PZc(obj3, obj4, interfaceC23621Ds, i2);
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                obj5 = this.A03;
                obj6 = this.A01;
                i3 = 13;
                return new C57158PZc(obj6, obj5, interfaceC23621Ds, i3);
            case 14:
                obj5 = this.A03;
                obj6 = this.A01;
                i3 = 14;
                return new C57158PZc(obj6, obj5, interfaceC23621Ds, i3);
            case Process.SIGTERM /* 15 */:
                obj3 = this.A01;
                obj4 = this.A03;
                i2 = 15;
                return new C57158PZc(obj3, obj4, interfaceC23621Ds, i2);
            case 16:
                obj2 = this.A03;
                i = 16;
                C57158PZc c57158PZc2222 = new C57158PZc(obj2, interfaceC23621Ds, i);
                c57158PZc2222.A01 = obj;
                return c57158PZc2222;
            case 17:
                obj2 = this.A03;
                i = 17;
                C57158PZc c57158PZc22222 = new C57158PZc(obj2, interfaceC23621Ds, i);
                c57158PZc22222.A01 = obj;
                return c57158PZc22222;
            case 18:
                obj5 = this.A03;
                obj6 = this.A01;
                i3 = 18;
                return new C57158PZc(obj6, obj5, interfaceC23621Ds, i3);
            case Process.SIGSTOP /* 19 */:
                obj5 = this.A03;
                obj6 = this.A01;
                i3 = 19;
                return new C57158PZc(obj6, obj5, interfaceC23621Ds, i3);
            case 20:
                obj5 = this.A03;
                obj6 = this.A01;
                i3 = 20;
                return new C57158PZc(obj6, obj5, interfaceC23621Ds, i3);
            case 21:
                obj3 = this.A01;
                obj4 = this.A03;
                i2 = 21;
                return new C57158PZc(obj3, obj4, interfaceC23621Ds, i2);
            case 22:
                obj5 = this.A03;
                obj6 = this.A01;
                i3 = 22;
                return new C57158PZc(obj6, obj5, interfaceC23621Ds, i3);
            case 23:
                obj3 = this.A01;
                obj4 = this.A03;
                i2 = 23;
                return new C57158PZc(obj3, obj4, interfaceC23621Ds, i2);
            case 24:
                obj2 = this.A03;
                i = 24;
                C57158PZc c57158PZc222222 = new C57158PZc(obj2, interfaceC23621Ds, i);
                c57158PZc222222.A01 = obj;
                return c57158PZc222222;
            case 25:
                obj2 = this.A03;
                i = 25;
                C57158PZc c57158PZc2222222 = new C57158PZc(obj2, interfaceC23621Ds, i);
                c57158PZc2222222.A01 = obj;
                return c57158PZc2222222;
            case 26:
                obj3 = this.A01;
                obj4 = this.A03;
                i2 = 26;
                return new C57158PZc(obj3, obj4, interfaceC23621Ds, i2);
            case 27:
                obj2 = this.A03;
                i = 27;
                C57158PZc c57158PZc22222222 = new C57158PZc(obj2, interfaceC23621Ds, i);
                c57158PZc22222222.A01 = obj;
                return c57158PZc22222222;
            case 28:
                obj3 = this.A01;
                obj4 = this.A03;
                i2 = 28;
                return new C57158PZc(obj3, obj4, interfaceC23621Ds, i2);
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                obj5 = this.A03;
                obj6 = this.A01;
                i3 = 29;
                return new C57158PZc(obj6, obj5, interfaceC23621Ds, i3);
            case 30:
                obj3 = this.A01;
                obj4 = this.A03;
                i2 = 30;
                return new C57158PZc(obj3, obj4, interfaceC23621Ds, i2);
            case 31:
                obj5 = this.A03;
                obj6 = this.A01;
                i3 = 31;
                return new C57158PZc(obj6, obj5, interfaceC23621Ds, i3);
            case 32:
                obj5 = this.A03;
                obj6 = this.A01;
                i3 = 32;
                return new C57158PZc(obj6, obj5, interfaceC23621Ds, i3);
            case 33:
                obj5 = this.A03;
                obj6 = this.A01;
                i3 = 33;
                return new C57158PZc(obj6, obj5, interfaceC23621Ds, i3);
            case 34:
                obj2 = this.A03;
                i = 34;
                C57158PZc c57158PZc222222222 = new C57158PZc(obj2, interfaceC23621Ds, i);
                c57158PZc222222222.A01 = obj;
                return c57158PZc222222222;
            case 35:
                obj2 = this.A03;
                i = 35;
                C57158PZc c57158PZc2222222222 = new C57158PZc(obj2, interfaceC23621Ds, i);
                c57158PZc2222222222.A01 = obj;
                return c57158PZc2222222222;
            case 36:
                obj2 = this.A03;
                i = 36;
                C57158PZc c57158PZc22222222222 = new C57158PZc(obj2, interfaceC23621Ds, i);
                c57158PZc22222222222.A01 = obj;
                return c57158PZc22222222222;
            case 37:
                obj2 = this.A03;
                i = 37;
                C57158PZc c57158PZc222222222222 = new C57158PZc(obj2, interfaceC23621Ds, i);
                c57158PZc222222222222.A01 = obj;
                return c57158PZc222222222222;
            case 38:
                obj2 = this.A03;
                i = 38;
                C57158PZc c57158PZc2222222222222 = new C57158PZc(obj2, interfaceC23621Ds, i);
                c57158PZc2222222222222.A01 = obj;
                return c57158PZc2222222222222;
            case 39:
                obj2 = this.A03;
                i = 39;
                C57158PZc c57158PZc22222222222222 = new C57158PZc(obj2, interfaceC23621Ds, i);
                c57158PZc22222222222222.A01 = obj;
                return c57158PZc22222222222222;
            case 40:
                obj2 = this.A03;
                i = 40;
                C57158PZc c57158PZc222222222222222 = new C57158PZc(obj2, interfaceC23621Ds, i);
                c57158PZc222222222222222.A01 = obj;
                return c57158PZc222222222222222;
            case Seq.NULL_REFNUM /* 41 */:
                obj2 = this.A03;
                i = 41;
                C57158PZc c57158PZc2222222222222222 = new C57158PZc(obj2, interfaceC23621Ds, i);
                c57158PZc2222222222222222.A01 = obj;
                return c57158PZc2222222222222222;
            case Seq.RefTracker.REF_OFFSET /* 42 */:
                obj2 = this.A03;
                i = 42;
                C57158PZc c57158PZc22222222222222222 = new C57158PZc(obj2, interfaceC23621Ds, i);
                c57158PZc22222222222222222.A01 = obj;
                return c57158PZc22222222222222222;
            case 43:
                obj2 = this.A03;
                i = 43;
                C57158PZc c57158PZc222222222222222222 = new C57158PZc(obj2, interfaceC23621Ds, i);
                c57158PZc222222222222222222.A01 = obj;
                return c57158PZc222222222222222222;
            case 44:
                obj2 = this.A03;
                i = 44;
                C57158PZc c57158PZc2222222222222222222 = new C57158PZc(obj2, interfaceC23621Ds, i);
                c57158PZc2222222222222222222.A01 = obj;
                return c57158PZc2222222222222222222;
            case 45:
                obj2 = this.A03;
                i = 45;
                C57158PZc c57158PZc22222222222222222222 = new C57158PZc(obj2, interfaceC23621Ds, i);
                c57158PZc22222222222222222222.A01 = obj;
                return c57158PZc22222222222222222222;
            case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN /* 46 */:
                obj2 = this.A03;
                i = 46;
                C57158PZc c57158PZc222222222222222222222 = new C57158PZc(obj2, interfaceC23621Ds, i);
                c57158PZc222222222222222222222.A01 = obj;
                return c57158PZc222222222222222222222;
            case 47:
                obj5 = this.A03;
                obj6 = this.A01;
                i3 = 47;
                return new C57158PZc(obj6, obj5, interfaceC23621Ds, i3);
            case 48:
                obj5 = this.A03;
                obj6 = this.A01;
                i3 = 48;
                return new C57158PZc(obj6, obj5, interfaceC23621Ds, i3);
            default:
                obj5 = this.A03;
                obj6 = this.A01;
                i3 = 49;
                return new C57158PZc(obj6, obj5, interfaceC23621Ds, i3);
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0d36 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:277:0x06a5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:278:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:312:0x06f8  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x0719  */
    @Override // X.C1Dr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r21) {
        /*
            Method dump skipped, instructions count: 3526
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C57158PZc.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public static Object A00(Object obj, C57158PZc c57158PZc) {
        AbstractC09560e7.A00(obj);
        return c57158PZc.A03;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((C57158PZc) AbstractC166987dD.A1M(obj2, obj, this)).invokeSuspend(C0eB.A00);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57158PZc(Object obj, Object obj2, InterfaceC23621Ds interfaceC23621Ds, int i) {
        super(2, interfaceC23621Ds);
        this.A02 = i;
        this.A01 = obj;
        this.A03 = obj2;
    }
}
