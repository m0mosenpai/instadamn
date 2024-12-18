package X;

import android.graphics.Bitmap;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.react.modules.base.IgReactQEModule;
import go.Seq;

/* renamed from: X.PZp, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C57171PZp extends AbstractC23611Dp implements InterfaceC16620sF {
    public int A00;
    public Object A01;
    public Object A02;
    public final int A03;

    public static Object A01(Object obj, C57171PZp c57171PZp, InterfaceC19390xP interfaceC19390xP, int i) {
        MTK mtk = new MTK(obj, i);
        c57171PZp.A00 = 1;
        return interfaceC19390xP.collect(mtk, c57171PZp);
    }

    public static Object A02(Object obj, C57171PZp c57171PZp, InterfaceC15070pN interfaceC15070pN, int i) {
        MTK mtk = new MTK(obj, i);
        c57171PZp.A00 = 1;
        return interfaceC15070pN.collect(mtk, c57171PZp);
    }

    public static void A03(Object obj, Object obj2, C19L c19l, int i) {
        AbstractC23641Du.A05(AnonymousClass191.A00, new C57171PZp(obj, obj2, (InterfaceC23621Ds) null, i), c19l);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57171PZp(Object obj, InterfaceC23621Ds interfaceC23621Ds, int i) {
        super(2, interfaceC23621Ds);
        this.A03 = i;
        this.A02 = obj;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        Object obj2;
        Object obj3;
        int i;
        Object obj4;
        Object obj5;
        int i2;
        Object obj6;
        int i3;
        switch (this.A03) {
            case 0:
                obj6 = this.A02;
                i3 = 0;
                C57171PZp c57171PZp = new C57171PZp(obj6, interfaceC23621Ds, i3);
                c57171PZp.A01 = obj;
                return c57171PZp;
            case 1:
                obj6 = this.A02;
                i3 = 1;
                C57171PZp c57171PZp2 = new C57171PZp(obj6, interfaceC23621Ds, i3);
                c57171PZp2.A01 = obj;
                return c57171PZp2;
            case 2:
                obj6 = this.A02;
                i3 = 2;
                C57171PZp c57171PZp22 = new C57171PZp(obj6, interfaceC23621Ds, i3);
                c57171PZp22.A01 = obj;
                return c57171PZp22;
            case 3:
                obj6 = this.A02;
                i3 = 3;
                C57171PZp c57171PZp222 = new C57171PZp(obj6, interfaceC23621Ds, i3);
                c57171PZp222.A01 = obj;
                return c57171PZp222;
            case 4:
                obj6 = this.A02;
                i3 = 4;
                C57171PZp c57171PZp2222 = new C57171PZp(obj6, interfaceC23621Ds, i3);
                c57171PZp2222.A01 = obj;
                return c57171PZp2222;
            case 5:
                obj2 = this.A02;
                obj3 = this.A01;
                i = 5;
                return new C57171PZp(obj3, obj2, interfaceC23621Ds, i);
            case 6:
                obj6 = this.A02;
                i3 = 6;
                C57171PZp c57171PZp22222 = new C57171PZp(obj6, interfaceC23621Ds, i3);
                c57171PZp22222.A01 = obj;
                return c57171PZp22222;
            case 7:
                obj6 = this.A02;
                i3 = 7;
                C57171PZp c57171PZp222222 = new C57171PZp(obj6, interfaceC23621Ds, i3);
                c57171PZp222222.A01 = obj;
                return c57171PZp222222;
            case 8:
                return new C57171PZp((Bitmap) this.A01, interfaceC23621Ds, (InterfaceC16620sF) this.A02, this.A00);
            case 9:
                obj2 = this.A02;
                obj3 = this.A01;
                i = 9;
                return new C57171PZp(obj3, obj2, interfaceC23621Ds, i);
            case 10:
                obj2 = this.A02;
                obj3 = this.A01;
                i = 10;
                return new C57171PZp(obj3, obj2, interfaceC23621Ds, i);
            case 11:
                obj2 = this.A02;
                obj3 = this.A01;
                i = 11;
                return new C57171PZp(obj3, obj2, interfaceC23621Ds, i);
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                obj2 = this.A02;
                obj3 = this.A01;
                i = 12;
                return new C57171PZp(obj3, obj2, interfaceC23621Ds, i);
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                obj2 = this.A02;
                obj3 = this.A01;
                i = 13;
                return new C57171PZp(obj3, obj2, interfaceC23621Ds, i);
            case 14:
                obj2 = this.A02;
                obj3 = this.A01;
                i = 14;
                return new C57171PZp(obj3, obj2, interfaceC23621Ds, i);
            case Process.SIGTERM /* 15 */:
                obj2 = this.A02;
                obj3 = this.A01;
                i = 15;
                return new C57171PZp(obj3, obj2, interfaceC23621Ds, i);
            case 16:
                obj2 = this.A02;
                obj3 = this.A01;
                i = 16;
                return new C57171PZp(obj3, obj2, interfaceC23621Ds, i);
            case 17:
                obj6 = this.A02;
                i3 = 17;
                C57171PZp c57171PZp2222222 = new C57171PZp(obj6, interfaceC23621Ds, i3);
                c57171PZp2222222.A01 = obj;
                return c57171PZp2222222;
            case 18:
                obj2 = this.A02;
                obj3 = this.A01;
                i = 18;
                return new C57171PZp(obj3, obj2, interfaceC23621Ds, i);
            case Process.SIGSTOP /* 19 */:
                obj2 = this.A02;
                obj3 = this.A01;
                i = 19;
                return new C57171PZp(obj3, obj2, interfaceC23621Ds, i);
            case 20:
                return new C57171PZp(this.A02, interfaceC23621Ds, 20);
            case 21:
                obj2 = this.A02;
                obj3 = this.A01;
                i = 21;
                return new C57171PZp(obj3, obj2, interfaceC23621Ds, i);
            case 22:
                obj2 = this.A02;
                obj3 = this.A01;
                i = 22;
                return new C57171PZp(obj3, obj2, interfaceC23621Ds, i);
            case 23:
                obj6 = this.A02;
                i3 = 23;
                C57171PZp c57171PZp22222222 = new C57171PZp(obj6, interfaceC23621Ds, i3);
                c57171PZp22222222.A01 = obj;
                return c57171PZp22222222;
            case 24:
                C57171PZp c57171PZp3 = new C57171PZp((InterfaceC74953Yl) this.A01, interfaceC23621Ds);
                c57171PZp3.A02 = obj;
                return c57171PZp3;
            case 25:
                obj4 = this.A01;
                obj5 = this.A02;
                i2 = 25;
                return new C57171PZp(obj4, obj5, interfaceC23621Ds, i2);
            case 26:
                obj2 = this.A02;
                obj3 = this.A01;
                i = 26;
                return new C57171PZp(obj3, obj2, interfaceC23621Ds, i);
            case 27:
                obj4 = this.A01;
                obj5 = this.A02;
                i2 = 27;
                return new C57171PZp(obj4, obj5, interfaceC23621Ds, i2);
            case 28:
                obj2 = this.A02;
                obj3 = this.A01;
                i = 28;
                return new C57171PZp(obj3, obj2, interfaceC23621Ds, i);
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                obj2 = this.A02;
                obj3 = this.A01;
                i = 29;
                return new C57171PZp(obj3, obj2, interfaceC23621Ds, i);
            case 30:
                obj4 = this.A01;
                obj5 = this.A02;
                i2 = 30;
                return new C57171PZp(obj4, obj5, interfaceC23621Ds, i2);
            case 31:
                obj2 = this.A02;
                obj3 = this.A01;
                i = 31;
                return new C57171PZp(obj3, obj2, interfaceC23621Ds, i);
            case 32:
                obj6 = this.A02;
                i3 = 32;
                C57171PZp c57171PZp222222222 = new C57171PZp(obj6, interfaceC23621Ds, i3);
                c57171PZp222222222.A01 = obj;
                return c57171PZp222222222;
            case 33:
                obj2 = this.A02;
                obj3 = this.A01;
                i = 33;
                return new C57171PZp(obj3, obj2, interfaceC23621Ds, i);
            case 34:
                obj6 = this.A02;
                i3 = 34;
                C57171PZp c57171PZp2222222222 = new C57171PZp(obj6, interfaceC23621Ds, i3);
                c57171PZp2222222222.A01 = obj;
                return c57171PZp2222222222;
            case 35:
                obj6 = this.A02;
                i3 = 35;
                C57171PZp c57171PZp22222222222 = new C57171PZp(obj6, interfaceC23621Ds, i3);
                c57171PZp22222222222.A01 = obj;
                return c57171PZp22222222222;
            case 36:
                obj2 = this.A02;
                obj3 = this.A01;
                i = 36;
                return new C57171PZp(obj3, obj2, interfaceC23621Ds, i);
            case 37:
                obj6 = this.A02;
                i3 = 37;
                C57171PZp c57171PZp222222222222 = new C57171PZp(obj6, interfaceC23621Ds, i3);
                c57171PZp222222222222.A01 = obj;
                return c57171PZp222222222222;
            case 38:
                obj6 = this.A02;
                i3 = 38;
                C57171PZp c57171PZp2222222222222 = new C57171PZp(obj6, interfaceC23621Ds, i3);
                c57171PZp2222222222222.A01 = obj;
                return c57171PZp2222222222222;
            case 39:
                obj6 = this.A02;
                i3 = 39;
                C57171PZp c57171PZp22222222222222 = new C57171PZp(obj6, interfaceC23621Ds, i3);
                c57171PZp22222222222222.A01 = obj;
                return c57171PZp22222222222222;
            case 40:
                obj6 = this.A02;
                i3 = 40;
                C57171PZp c57171PZp222222222222222 = new C57171PZp(obj6, interfaceC23621Ds, i3);
                c57171PZp222222222222222.A01 = obj;
                return c57171PZp222222222222222;
            case Seq.NULL_REFNUM /* 41 */:
                obj6 = this.A02;
                i3 = 41;
                C57171PZp c57171PZp2222222222222222 = new C57171PZp(obj6, interfaceC23621Ds, i3);
                c57171PZp2222222222222222.A01 = obj;
                return c57171PZp2222222222222222;
            case Seq.RefTracker.REF_OFFSET /* 42 */:
                obj6 = this.A02;
                i3 = 42;
                C57171PZp c57171PZp22222222222222222 = new C57171PZp(obj6, interfaceC23621Ds, i3);
                c57171PZp22222222222222222.A01 = obj;
                return c57171PZp22222222222222222;
            case 43:
                obj6 = this.A02;
                i3 = 43;
                C57171PZp c57171PZp222222222222222222 = new C57171PZp(obj6, interfaceC23621Ds, i3);
                c57171PZp222222222222222222.A01 = obj;
                return c57171PZp222222222222222222;
            case 44:
                obj6 = this.A02;
                i3 = 44;
                C57171PZp c57171PZp2222222222222222222 = new C57171PZp(obj6, interfaceC23621Ds, i3);
                c57171PZp2222222222222222222.A01 = obj;
                return c57171PZp2222222222222222222;
            case 45:
                obj4 = this.A01;
                obj5 = this.A02;
                i2 = 45;
                return new C57171PZp(obj4, obj5, interfaceC23621Ds, i2);
            case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN /* 46 */:
                obj2 = this.A02;
                obj3 = this.A01;
                i = 46;
                return new C57171PZp(obj3, obj2, interfaceC23621Ds, i);
            case 47:
                obj6 = this.A02;
                i3 = 47;
                C57171PZp c57171PZp22222222222222222222 = new C57171PZp(obj6, interfaceC23621Ds, i3);
                c57171PZp22222222222222222222.A01 = obj;
                return c57171PZp22222222222222222222;
            case 48:
                obj6 = this.A02;
                i3 = 48;
                C57171PZp c57171PZp222222222222222222222 = new C57171PZp(obj6, interfaceC23621Ds, i3);
                c57171PZp222222222222222222222.A01 = obj;
                return c57171PZp222222222222222222222;
            default:
                obj6 = this.A02;
                i3 = 49;
                C57171PZp c57171PZp2222222222222222222222 = new C57171PZp(obj6, interfaceC23621Ds, i3);
                c57171PZp2222222222222222222222.A01 = obj;
                return c57171PZp2222222222222222222222;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:441:0x08ec, code lost:
    
        if (androidx.compose.animation.core.SuspendAnimationKt.A03(r12, r18, r2, 2.0f, 0.5f, 0.0f) == r1) goto L396;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0cb9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:236:0x047d  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0496  */
    /* JADX WARN: Removed duplicated region for block: B:337:0x0756 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:370:0x080e  */
    /* JADX WARN: Removed duplicated region for block: B:382:0x0882  */
    /* JADX WARN: Type inference failed for: r5v28, types: [X.5HZ] */
    /* JADX WARN: Type inference failed for: r5v30, types: [java.util.AbstractCollection, java.util.ArrayList] */
    @Override // X.C1Dr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            Method dump skipped, instructions count: 3606
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C57171PZp.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public static Object A00(Object obj, C57171PZp c57171PZp) {
        AbstractC09560e7.A00(obj);
        return c57171PZp.A02;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((C57171PZp) AbstractC166987dD.A1M(obj2, obj, this)).invokeSuspend(C0eB.A00);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57171PZp(InterfaceC74953Yl interfaceC74953Yl, InterfaceC23621Ds interfaceC23621Ds) {
        super(2, interfaceC23621Ds);
        this.A03 = 24;
        this.A01 = interfaceC74953Yl;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57171PZp(Bitmap bitmap, InterfaceC23621Ds interfaceC23621Ds, InterfaceC16620sF interfaceC16620sF, int i) {
        super(2, interfaceC23621Ds);
        this.A03 = 8;
        this.A02 = interfaceC16620sF;
        this.A00 = i;
        this.A01 = bitmap;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57171PZp(Object obj, Object obj2, InterfaceC23621Ds interfaceC23621Ds, int i) {
        super(2, interfaceC23621Ds);
        this.A03 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }
}
