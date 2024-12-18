package X;

import android.graphics.Bitmap;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.common.session.UserSession;
import com.instagram.react.modules.base.IgReactQEModule;
import go.Seq;

/* renamed from: X.PZr, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C57173PZr extends AbstractC23611Dp implements InterfaceC16620sF {
    public int A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public final int A04;

    public static PZZ A01(Object obj, C57173PZr c57173PZr, int i) {
        PZZ pzz = new PZZ(obj, null, i);
        c57173PZr.A00 = 1;
        return pzz;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57173PZr(UserSession userSession, A6C a6c, InterfaceC23621Ds interfaceC23621Ds) {
        super(2, interfaceC23621Ds);
        this.A04 = 17;
        this.A02 = userSession;
        this.A01 = a6c;
    }

    public static C57173PZr A02(Object obj, Object obj2, Object obj3, InterfaceC23621Ds interfaceC23621Ds, int i) {
        return new C57173PZr(obj, obj2, obj3, interfaceC23621Ds, i);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0003. Please report as an issue. */
    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        Object obj2;
        Object obj3;
        Object obj4;
        int i;
        switch (this.A04) {
            case 0:
                OWX owx = (OWX) this.A03;
                return new C57173PZr((Bitmap) this.A01, (UserSession) this.A02, owx, interfaceC23621Ds, this.A00);
            case 1:
                C57173PZr c57173PZr = new C57173PZr((N6J) this.A03, interfaceC23621Ds);
                c57173PZr.A01 = obj;
                return c57173PZr;
            case 2:
                obj2 = this.A02;
                obj3 = this.A01;
                obj4 = this.A03;
                i = 2;
                return A02(obj2, obj3, obj4, interfaceC23621Ds, i);
            case 3:
                C57173PZr c57173PZr2 = new C57173PZr((N6J) this.A03, (OF9) this.A01, interfaceC23621Ds);
                c57173PZr2.A02 = obj;
                return c57173PZr2;
            case 4:
                obj2 = this.A02;
                obj3 = this.A01;
                obj4 = this.A03;
                i = 4;
                return A02(obj2, obj3, obj4, interfaceC23621Ds, i);
            case 5:
                obj2 = this.A02;
                obj3 = this.A01;
                obj4 = this.A03;
                i = 5;
                return A02(obj2, obj3, obj4, interfaceC23621Ds, i);
            case 6:
                obj2 = this.A02;
                obj3 = this.A01;
                obj4 = this.A03;
                i = 6;
                return A02(obj2, obj3, obj4, interfaceC23621Ds, i);
            case 7:
                obj2 = this.A02;
                obj3 = this.A01;
                obj4 = this.A03;
                i = 7;
                return A02(obj2, obj3, obj4, interfaceC23621Ds, i);
            case 8:
                obj2 = this.A02;
                obj3 = this.A01;
                obj4 = this.A03;
                i = 8;
                return A02(obj2, obj3, obj4, interfaceC23621Ds, i);
            case 9:
                obj2 = this.A02;
                obj3 = this.A01;
                obj4 = this.A03;
                i = 9;
                return A02(obj2, obj3, obj4, interfaceC23621Ds, i);
            case 10:
                obj2 = this.A02;
                obj3 = this.A01;
                obj4 = this.A03;
                i = 10;
                return A02(obj2, obj3, obj4, interfaceC23621Ds, i);
            case 11:
                obj2 = this.A02;
                obj3 = this.A01;
                obj4 = this.A03;
                i = 11;
                return A02(obj2, obj3, obj4, interfaceC23621Ds, i);
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                obj2 = this.A02;
                obj3 = this.A01;
                obj4 = this.A03;
                i = 12;
                return A02(obj2, obj3, obj4, interfaceC23621Ds, i);
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                obj2 = this.A02;
                obj3 = this.A01;
                obj4 = this.A03;
                i = 13;
                return A02(obj2, obj3, obj4, interfaceC23621Ds, i);
            case 14:
                obj2 = this.A02;
                obj3 = this.A01;
                obj4 = this.A03;
                i = 14;
                return A02(obj2, obj3, obj4, interfaceC23621Ds, i);
            case Process.SIGTERM /* 15 */:
                obj2 = this.A02;
                obj3 = this.A01;
                obj4 = this.A03;
                i = 15;
                return A02(obj2, obj3, obj4, interfaceC23621Ds, i);
            case 16:
                obj2 = this.A02;
                obj3 = this.A01;
                obj4 = this.A03;
                i = 16;
                return A02(obj2, obj3, obj4, interfaceC23621Ds, i);
            case 17:
                C57173PZr c57173PZr3 = new C57173PZr((UserSession) this.A02, (A6C) this.A01, interfaceC23621Ds);
                c57173PZr3.A03 = obj;
                return c57173PZr3;
            case 18:
                obj2 = this.A02;
                obj3 = this.A01;
                obj4 = this.A03;
                i = 18;
                return A02(obj2, obj3, obj4, interfaceC23621Ds, i);
            case Process.SIGSTOP /* 19 */:
                obj2 = this.A02;
                obj3 = this.A01;
                obj4 = this.A03;
                i = 19;
                return A02(obj2, obj3, obj4, interfaceC23621Ds, i);
            case 20:
                obj2 = this.A02;
                obj3 = this.A01;
                obj4 = this.A03;
                i = 20;
                return A02(obj2, obj3, obj4, interfaceC23621Ds, i);
            case 21:
                obj2 = this.A02;
                obj3 = this.A01;
                obj4 = this.A03;
                i = 21;
                return A02(obj2, obj3, obj4, interfaceC23621Ds, i);
            case 22:
                obj2 = this.A02;
                obj3 = this.A01;
                obj4 = this.A03;
                i = 22;
                return A02(obj2, obj3, obj4, interfaceC23621Ds, i);
            case 23:
                obj2 = this.A02;
                obj3 = this.A01;
                obj4 = this.A03;
                i = 23;
                return A02(obj2, obj3, obj4, interfaceC23621Ds, i);
            case 24:
                obj2 = this.A02;
                obj3 = this.A01;
                obj4 = this.A03;
                i = 24;
                return A02(obj2, obj3, obj4, interfaceC23621Ds, i);
            case 25:
                obj2 = this.A02;
                obj3 = this.A01;
                obj4 = this.A03;
                i = 25;
                return A02(obj2, obj3, obj4, interfaceC23621Ds, i);
            case 26:
                obj2 = this.A02;
                obj3 = this.A01;
                obj4 = this.A03;
                i = 26;
                return A02(obj2, obj3, obj4, interfaceC23621Ds, i);
            case 27:
                obj2 = this.A02;
                obj3 = this.A01;
                obj4 = this.A03;
                i = 27;
                return A02(obj2, obj3, obj4, interfaceC23621Ds, i);
            case 28:
                obj2 = this.A02;
                obj3 = this.A01;
                obj4 = this.A03;
                i = 28;
                return A02(obj2, obj3, obj4, interfaceC23621Ds, i);
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                obj2 = this.A02;
                obj3 = this.A01;
                obj4 = this.A03;
                i = 29;
                return A02(obj2, obj3, obj4, interfaceC23621Ds, i);
            case 30:
                obj2 = this.A02;
                obj3 = this.A01;
                obj4 = this.A03;
                i = 30;
                return A02(obj2, obj3, obj4, interfaceC23621Ds, i);
            case 31:
                obj2 = this.A02;
                obj3 = this.A01;
                obj4 = this.A03;
                i = 31;
                return A02(obj2, obj3, obj4, interfaceC23621Ds, i);
            case 32:
                obj2 = this.A02;
                obj3 = this.A01;
                obj4 = this.A03;
                i = 32;
                return A02(obj2, obj3, obj4, interfaceC23621Ds, i);
            case 33:
                obj2 = this.A02;
                obj3 = this.A01;
                obj4 = this.A03;
                i = 33;
                return A02(obj2, obj3, obj4, interfaceC23621Ds, i);
            case 34:
                obj2 = this.A02;
                obj3 = this.A01;
                obj4 = this.A03;
                i = 34;
                return A02(obj2, obj3, obj4, interfaceC23621Ds, i);
            case 35:
                obj2 = this.A02;
                obj3 = this.A01;
                obj4 = this.A03;
                i = 35;
                return A02(obj2, obj3, obj4, interfaceC23621Ds, i);
            case 36:
                obj2 = this.A02;
                obj3 = this.A01;
                obj4 = this.A03;
                i = 36;
                return A02(obj2, obj3, obj4, interfaceC23621Ds, i);
            case 37:
                obj2 = this.A02;
                obj3 = this.A01;
                obj4 = this.A03;
                i = 37;
                return A02(obj2, obj3, obj4, interfaceC23621Ds, i);
            case 38:
                obj2 = this.A02;
                obj3 = this.A01;
                obj4 = this.A03;
                i = 38;
                return A02(obj2, obj3, obj4, interfaceC23621Ds, i);
            case 39:
                obj2 = this.A02;
                obj3 = this.A01;
                obj4 = this.A03;
                i = 39;
                return A02(obj2, obj3, obj4, interfaceC23621Ds, i);
            case 40:
                obj2 = this.A02;
                obj3 = this.A01;
                obj4 = this.A03;
                i = 40;
                return A02(obj2, obj3, obj4, interfaceC23621Ds, i);
            case Seq.NULL_REFNUM /* 41 */:
                obj2 = this.A02;
                obj3 = this.A01;
                obj4 = this.A03;
                i = 41;
                return A02(obj2, obj3, obj4, interfaceC23621Ds, i);
            case Seq.RefTracker.REF_OFFSET /* 42 */:
                obj2 = this.A02;
                obj3 = this.A01;
                obj4 = this.A03;
                i = 42;
                return A02(obj2, obj3, obj4, interfaceC23621Ds, i);
            case 43:
                obj2 = this.A02;
                obj3 = this.A01;
                obj4 = this.A03;
                i = 43;
                return A02(obj2, obj3, obj4, interfaceC23621Ds, i);
            case 44:
                obj2 = this.A02;
                obj3 = this.A01;
                obj4 = this.A03;
                i = 44;
                return A02(obj2, obj3, obj4, interfaceC23621Ds, i);
            case 45:
                obj2 = this.A02;
                obj3 = this.A01;
                obj4 = this.A03;
                i = 45;
                return A02(obj2, obj3, obj4, interfaceC23621Ds, i);
            case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN /* 46 */:
                obj2 = this.A02;
                obj3 = this.A01;
                obj4 = this.A03;
                i = 46;
                return A02(obj2, obj3, obj4, interfaceC23621Ds, i);
            case 47:
                obj2 = this.A02;
                obj3 = this.A01;
                obj4 = this.A03;
                i = 47;
                return A02(obj2, obj3, obj4, interfaceC23621Ds, i);
            case 48:
                obj2 = this.A02;
                obj3 = this.A01;
                obj4 = this.A03;
                i = 48;
                return A02(obj2, obj3, obj4, interfaceC23621Ds, i);
            default:
                obj2 = this.A02;
                obj3 = this.A01;
                obj4 = this.A03;
                i = 49;
                return A02(obj2, obj3, obj4, interfaceC23621Ds, i);
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:14:0x072a A[RETURN] */
    @Override // X.C1Dr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r28) {
        /*
            Method dump skipped, instructions count: 2286
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C57173PZr.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public static C07T A00(Object obj, C57173PZr c57173PZr) {
        AbstractC09560e7.A00(obj);
        return ((C07X) c57173PZr.A02).getLifecycle();
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((C57173PZr) AbstractC166987dD.A1M(obj2, obj, this)).invokeSuspend(C0eB.A00);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57173PZr(N6J n6j, InterfaceC23621Ds interfaceC23621Ds) {
        super(2, interfaceC23621Ds);
        this.A04 = 1;
        this.A03 = n6j;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57173PZr(Object obj, Object obj2, Object obj3, InterfaceC23621Ds interfaceC23621Ds, int i) {
        super(2, interfaceC23621Ds);
        this.A04 = i;
        this.A02 = obj;
        this.A01 = obj2;
        this.A03 = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57173PZr(Bitmap bitmap, UserSession userSession, OWX owx, InterfaceC23621Ds interfaceC23621Ds, int i) {
        super(2, interfaceC23621Ds);
        this.A04 = 0;
        this.A03 = owx;
        this.A01 = bitmap;
        this.A00 = i;
        this.A02 = userSession;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57173PZr(N6J n6j, OF9 of9, InterfaceC23621Ds interfaceC23621Ds) {
        super(2, interfaceC23621Ds);
        this.A04 = 3;
        this.A03 = n6j;
        this.A01 = of9;
    }
}
