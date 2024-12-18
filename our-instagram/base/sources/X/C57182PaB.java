package X;

import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.react.modules.base.IgReactQEModule;
import go.Seq;

/* renamed from: X.PaB, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C57182PaB extends AbstractC23611Dp implements InterfaceC16610sE {
    public Object A00;
    public Object A01;
    public final int A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57182PaB(Object obj, InterfaceC23621Ds interfaceC23621Ds, int i) {
        super(3, interfaceC23621Ds);
        this.A02 = i;
        this.A00 = obj;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // X.InterfaceC16610sE
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        InterfaceC23621Ds interfaceC23621Ds;
        Object obj4;
        int i;
        InterfaceC23621Ds interfaceC23621Ds2;
        Object obj5;
        Object obj6;
        int i2;
        C57182PaB c57182PaB;
        InterfaceC23621Ds interfaceC23621Ds3;
        Object obj7;
        Object obj8;
        int i3;
        InterfaceC23621Ds interfaceC23621Ds4;
        int i4;
        InterfaceC23621Ds interfaceC23621Ds5;
        Object obj9;
        int i5;
        switch (this.A02) {
            case 0:
                interfaceC23621Ds4 = (InterfaceC23621Ds) obj3;
                i4 = 0;
                C57182PaB c57182PaB2 = new C57182PaB(i4, interfaceC23621Ds4);
                c57182PaB2.A00 = obj;
                c57182PaB2.A01 = obj2;
                return c57182PaB2.invokeSuspend(C0eB.A00);
            case 1:
                c57182PaB = new C57182PaB(this.A00, (InterfaceC23621Ds) obj3, 1);
                c57182PaB.A01 = obj;
                return c57182PaB.invokeSuspend(C0eB.A00);
            case 2:
                interfaceC23621Ds4 = (InterfaceC23621Ds) obj3;
                i4 = 2;
                C57182PaB c57182PaB22 = new C57182PaB(i4, interfaceC23621Ds4);
                c57182PaB22.A00 = obj;
                c57182PaB22.A01 = obj2;
                return c57182PaB22.invokeSuspend(C0eB.A00);
            case 3:
                interfaceC23621Ds4 = (InterfaceC23621Ds) obj3;
                i4 = 3;
                C57182PaB c57182PaB222 = new C57182PaB(i4, interfaceC23621Ds4);
                c57182PaB222.A00 = obj;
                c57182PaB222.A01 = obj2;
                return c57182PaB222.invokeSuspend(C0eB.A00);
            case 4:
                interfaceC23621Ds = (InterfaceC23621Ds) obj3;
                obj4 = this.A01;
                i = 4;
                c57182PaB = new C57182PaB(obj4, interfaceC23621Ds, i, 42);
                c57182PaB.A00 = obj2;
                return c57182PaB.invokeSuspend(C0eB.A00);
            case 5:
                interfaceC23621Ds3 = (InterfaceC23621Ds) obj3;
                obj7 = this.A00;
                obj8 = this.A01;
                i3 = 5;
                c57182PaB = new C57182PaB(obj8, obj7, interfaceC23621Ds3, i3);
                return c57182PaB.invokeSuspend(C0eB.A00);
            case 6:
                interfaceC23621Ds4 = (InterfaceC23621Ds) obj3;
                i4 = 6;
                C57182PaB c57182PaB2222 = new C57182PaB(i4, interfaceC23621Ds4);
                c57182PaB2222.A00 = obj;
                c57182PaB2222.A01 = obj2;
                return c57182PaB2222.invokeSuspend(C0eB.A00);
            case 7:
                c57182PaB = new C57182PaB(this.A00, (InterfaceC23621Ds) obj3, 7);
                c57182PaB.A01 = obj2;
                return c57182PaB.invokeSuspend(C0eB.A00);
            case 8:
                interfaceC23621Ds4 = (InterfaceC23621Ds) obj3;
                i4 = 8;
                C57182PaB c57182PaB22222 = new C57182PaB(i4, interfaceC23621Ds4);
                c57182PaB22222.A00 = obj;
                c57182PaB22222.A01 = obj2;
                return c57182PaB22222.invokeSuspend(C0eB.A00);
            case 9:
                interfaceC23621Ds4 = (InterfaceC23621Ds) obj3;
                i4 = 9;
                C57182PaB c57182PaB222222 = new C57182PaB(i4, interfaceC23621Ds4);
                c57182PaB222222.A00 = obj;
                c57182PaB222222.A01 = obj2;
                return c57182PaB222222.invokeSuspend(C0eB.A00);
            case 10:
                interfaceC23621Ds4 = (InterfaceC23621Ds) obj3;
                i4 = 10;
                C57182PaB c57182PaB2222222 = new C57182PaB(i4, interfaceC23621Ds4);
                c57182PaB2222222.A00 = obj;
                c57182PaB2222222.A01 = obj2;
                return c57182PaB2222222.invokeSuspend(C0eB.A00);
            case 11:
                obj2 = obj;
                interfaceC23621Ds = (InterfaceC23621Ds) obj3;
                obj4 = this.A01;
                i = 11;
                c57182PaB = new C57182PaB(obj4, interfaceC23621Ds, i, 42);
                c57182PaB.A00 = obj2;
                return c57182PaB.invokeSuspend(C0eB.A00);
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                interfaceC23621Ds4 = (InterfaceC23621Ds) obj3;
                i4 = 12;
                C57182PaB c57182PaB22222222 = new C57182PaB(i4, interfaceC23621Ds4);
                c57182PaB22222222.A00 = obj;
                c57182PaB22222222.A01 = obj2;
                return c57182PaB22222222.invokeSuspend(C0eB.A00);
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                interfaceC23621Ds4 = (InterfaceC23621Ds) obj3;
                i4 = 13;
                C57182PaB c57182PaB222222222 = new C57182PaB(i4, interfaceC23621Ds4);
                c57182PaB222222222.A00 = obj;
                c57182PaB222222222.A01 = obj2;
                return c57182PaB222222222.invokeSuspend(C0eB.A00);
            case 14:
                interfaceC23621Ds4 = (InterfaceC23621Ds) obj3;
                i4 = 14;
                C57182PaB c57182PaB2222222222 = new C57182PaB(i4, interfaceC23621Ds4);
                c57182PaB2222222222.A00 = obj;
                c57182PaB2222222222.A01 = obj2;
                return c57182PaB2222222222.invokeSuspend(C0eB.A00);
            case Process.SIGTERM /* 15 */:
                interfaceC23621Ds4 = (InterfaceC23621Ds) obj3;
                i4 = 15;
                C57182PaB c57182PaB22222222222 = new C57182PaB(i4, interfaceC23621Ds4);
                c57182PaB22222222222.A00 = obj;
                c57182PaB22222222222.A01 = obj2;
                return c57182PaB22222222222.invokeSuspend(C0eB.A00);
            case 16:
                interfaceC23621Ds4 = (InterfaceC23621Ds) obj3;
                i4 = 16;
                C57182PaB c57182PaB222222222222 = new C57182PaB(i4, interfaceC23621Ds4);
                c57182PaB222222222222.A00 = obj;
                c57182PaB222222222222.A01 = obj2;
                return c57182PaB222222222222.invokeSuspend(C0eB.A00);
            case 17:
                interfaceC23621Ds4 = (InterfaceC23621Ds) obj3;
                i4 = 17;
                C57182PaB c57182PaB2222222222222 = new C57182PaB(i4, interfaceC23621Ds4);
                c57182PaB2222222222222.A00 = obj;
                c57182PaB2222222222222.A01 = obj2;
                return c57182PaB2222222222222.invokeSuspend(C0eB.A00);
            case 18:
                interfaceC23621Ds4 = (InterfaceC23621Ds) obj3;
                i4 = 18;
                C57182PaB c57182PaB22222222222222 = new C57182PaB(i4, interfaceC23621Ds4);
                c57182PaB22222222222222.A00 = obj;
                c57182PaB22222222222222.A01 = obj2;
                return c57182PaB22222222222222.invokeSuspend(C0eB.A00);
            case Process.SIGSTOP /* 19 */:
                interfaceC23621Ds4 = (InterfaceC23621Ds) obj3;
                i4 = 19;
                C57182PaB c57182PaB222222222222222 = new C57182PaB(i4, interfaceC23621Ds4);
                c57182PaB222222222222222.A00 = obj;
                c57182PaB222222222222222.A01 = obj2;
                return c57182PaB222222222222222.invokeSuspend(C0eB.A00);
            case 20:
                interfaceC23621Ds4 = (InterfaceC23621Ds) obj3;
                i4 = 20;
                C57182PaB c57182PaB2222222222222222 = new C57182PaB(i4, interfaceC23621Ds4);
                c57182PaB2222222222222222.A00 = obj;
                c57182PaB2222222222222222.A01 = obj2;
                return c57182PaB2222222222222222.invokeSuspend(C0eB.A00);
            case 21:
                interfaceC23621Ds4 = (InterfaceC23621Ds) obj3;
                i4 = 21;
                C57182PaB c57182PaB22222222222222222 = new C57182PaB(i4, interfaceC23621Ds4);
                c57182PaB22222222222222222.A00 = obj;
                c57182PaB22222222222222222.A01 = obj2;
                return c57182PaB22222222222222222.invokeSuspend(C0eB.A00);
            case 22:
                interfaceC23621Ds4 = (InterfaceC23621Ds) obj3;
                i4 = 22;
                C57182PaB c57182PaB222222222222222222 = new C57182PaB(i4, interfaceC23621Ds4);
                c57182PaB222222222222222222.A00 = obj;
                c57182PaB222222222222222222.A01 = obj2;
                return c57182PaB222222222222222222.invokeSuspend(C0eB.A00);
            case 23:
                interfaceC23621Ds4 = (InterfaceC23621Ds) obj3;
                i4 = 23;
                C57182PaB c57182PaB2222222222222222222 = new C57182PaB(i4, interfaceC23621Ds4);
                c57182PaB2222222222222222222.A00 = obj;
                c57182PaB2222222222222222222.A01 = obj2;
                return c57182PaB2222222222222222222.invokeSuspend(C0eB.A00);
            case 24:
                interfaceC23621Ds4 = (InterfaceC23621Ds) obj3;
                i4 = 24;
                C57182PaB c57182PaB22222222222222222222 = new C57182PaB(i4, interfaceC23621Ds4);
                c57182PaB22222222222222222222.A00 = obj;
                c57182PaB22222222222222222222.A01 = obj2;
                return c57182PaB22222222222222222222.invokeSuspend(C0eB.A00);
            case 25:
                interfaceC23621Ds4 = (InterfaceC23621Ds) obj3;
                i4 = 25;
                C57182PaB c57182PaB222222222222222222222 = new C57182PaB(i4, interfaceC23621Ds4);
                c57182PaB222222222222222222222.A00 = obj;
                c57182PaB222222222222222222222.A01 = obj2;
                return c57182PaB222222222222222222222.invokeSuspend(C0eB.A00);
            case 26:
                interfaceC23621Ds = (InterfaceC23621Ds) obj3;
                obj4 = this.A01;
                i = 26;
                c57182PaB = new C57182PaB(obj4, interfaceC23621Ds, i, 42);
                c57182PaB.A00 = obj2;
                return c57182PaB.invokeSuspend(C0eB.A00);
            case 27:
                interfaceC23621Ds4 = (InterfaceC23621Ds) obj3;
                i4 = 27;
                C57182PaB c57182PaB2222222222222222222222 = new C57182PaB(i4, interfaceC23621Ds4);
                c57182PaB2222222222222222222222.A00 = obj;
                c57182PaB2222222222222222222222.A01 = obj2;
                return c57182PaB2222222222222222222222.invokeSuspend(C0eB.A00);
            case 28:
                interfaceC23621Ds4 = (InterfaceC23621Ds) obj3;
                i4 = 28;
                C57182PaB c57182PaB22222222222222222222222 = new C57182PaB(i4, interfaceC23621Ds4);
                c57182PaB22222222222222222222222.A00 = obj;
                c57182PaB22222222222222222222222.A01 = obj2;
                return c57182PaB22222222222222222222222.invokeSuspend(C0eB.A00);
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                interfaceC23621Ds = (InterfaceC23621Ds) obj3;
                obj4 = this.A01;
                i = 29;
                c57182PaB = new C57182PaB(obj4, interfaceC23621Ds, i, 42);
                c57182PaB.A00 = obj2;
                return c57182PaB.invokeSuspend(C0eB.A00);
            case 30:
                interfaceC23621Ds = (InterfaceC23621Ds) obj3;
                obj4 = this.A01;
                i = 30;
                c57182PaB = new C57182PaB(obj4, interfaceC23621Ds, i, 42);
                c57182PaB.A00 = obj2;
                return c57182PaB.invokeSuspend(C0eB.A00);
            case 31:
                obj2 = obj;
                interfaceC23621Ds = (InterfaceC23621Ds) obj3;
                obj4 = this.A01;
                i = 31;
                c57182PaB = new C57182PaB(obj4, interfaceC23621Ds, i, 42);
                c57182PaB.A00 = obj2;
                return c57182PaB.invokeSuspend(C0eB.A00);
            case 32:
                obj2 = obj;
                interfaceC23621Ds = (InterfaceC23621Ds) obj3;
                obj4 = this.A01;
                i = 32;
                c57182PaB = new C57182PaB(obj4, interfaceC23621Ds, i, 42);
                c57182PaB.A00 = obj2;
                return c57182PaB.invokeSuspend(C0eB.A00);
            case 33:
                interfaceC23621Ds4 = (InterfaceC23621Ds) obj3;
                i4 = 33;
                C57182PaB c57182PaB222222222222222222222222 = new C57182PaB(i4, interfaceC23621Ds4);
                c57182PaB222222222222222222222222.A00 = obj;
                c57182PaB222222222222222222222222.A01 = obj2;
                return c57182PaB222222222222222222222222.invokeSuspend(C0eB.A00);
            case 34:
                interfaceC23621Ds4 = (InterfaceC23621Ds) obj3;
                i4 = 34;
                C57182PaB c57182PaB2222222222222222222222222 = new C57182PaB(i4, interfaceC23621Ds4);
                c57182PaB2222222222222222222222222.A00 = obj;
                c57182PaB2222222222222222222222222.A01 = obj2;
                return c57182PaB2222222222222222222222222.invokeSuspend(C0eB.A00);
            case 35:
                interfaceC23621Ds4 = (InterfaceC23621Ds) obj3;
                i4 = 35;
                C57182PaB c57182PaB22222222222222222222222222 = new C57182PaB(i4, interfaceC23621Ds4);
                c57182PaB22222222222222222222222222.A00 = obj;
                c57182PaB22222222222222222222222222.A01 = obj2;
                return c57182PaB22222222222222222222222222.invokeSuspend(C0eB.A00);
            case 36:
                interfaceC23621Ds4 = (InterfaceC23621Ds) obj3;
                i4 = 36;
                C57182PaB c57182PaB222222222222222222222222222 = new C57182PaB(i4, interfaceC23621Ds4);
                c57182PaB222222222222222222222222222.A00 = obj;
                c57182PaB222222222222222222222222222.A01 = obj2;
                return c57182PaB222222222222222222222222222.invokeSuspend(C0eB.A00);
            case 37:
                obj2 = obj;
                interfaceC23621Ds = (InterfaceC23621Ds) obj3;
                obj4 = this.A01;
                i = 37;
                c57182PaB = new C57182PaB(obj4, interfaceC23621Ds, i, 42);
                c57182PaB.A00 = obj2;
                return c57182PaB.invokeSuspend(C0eB.A00);
            case 38:
                interfaceC23621Ds4 = (InterfaceC23621Ds) obj3;
                i4 = 38;
                C57182PaB c57182PaB2222222222222222222222222222 = new C57182PaB(i4, interfaceC23621Ds4);
                c57182PaB2222222222222222222222222222.A00 = obj;
                c57182PaB2222222222222222222222222222.A01 = obj2;
                return c57182PaB2222222222222222222222222222.invokeSuspend(C0eB.A00);
            case 39:
                interfaceC23621Ds4 = (InterfaceC23621Ds) obj3;
                i4 = 39;
                C57182PaB c57182PaB22222222222222222222222222222 = new C57182PaB(i4, interfaceC23621Ds4);
                c57182PaB22222222222222222222222222222.A00 = obj;
                c57182PaB22222222222222222222222222222.A01 = obj2;
                return c57182PaB22222222222222222222222222222.invokeSuspend(C0eB.A00);
            case 40:
                interfaceC23621Ds3 = (InterfaceC23621Ds) obj3;
                obj7 = this.A00;
                obj8 = this.A01;
                i3 = 40;
                c57182PaB = new C57182PaB(obj8, obj7, interfaceC23621Ds3, i3);
                return c57182PaB.invokeSuspend(C0eB.A00);
            case Seq.NULL_REFNUM /* 41 */:
                interfaceC23621Ds2 = (InterfaceC23621Ds) obj3;
                obj5 = this.A01;
                obj6 = this.A00;
                i2 = 41;
                c57182PaB = new C57182PaB(obj5, obj6, interfaceC23621Ds2, i2);
                return c57182PaB.invokeSuspend(C0eB.A00);
            case Seq.RefTracker.REF_OFFSET /* 42 */:
                interfaceC23621Ds2 = (InterfaceC23621Ds) obj3;
                obj5 = this.A01;
                obj6 = this.A00;
                i2 = 42;
                c57182PaB = new C57182PaB(obj5, obj6, interfaceC23621Ds2, i2);
                return c57182PaB.invokeSuspend(C0eB.A00);
            case 43:
                interfaceC23621Ds4 = (InterfaceC23621Ds) obj3;
                i4 = 43;
                C57182PaB c57182PaB222222222222222222222222222222 = new C57182PaB(i4, interfaceC23621Ds4);
                c57182PaB222222222222222222222222222222.A00 = obj;
                c57182PaB222222222222222222222222222222.A01 = obj2;
                return c57182PaB222222222222222222222222222222.invokeSuspend(C0eB.A00);
            case 44:
                interfaceC23621Ds = (InterfaceC23621Ds) obj3;
                obj4 = this.A01;
                i = 44;
                c57182PaB = new C57182PaB(obj4, interfaceC23621Ds, i, 42);
                c57182PaB.A00 = obj2;
                return c57182PaB.invokeSuspend(C0eB.A00);
            case 45:
                interfaceC23621Ds = (InterfaceC23621Ds) obj3;
                obj4 = this.A01;
                i = 45;
                c57182PaB = new C57182PaB(obj4, interfaceC23621Ds, i, 42);
                c57182PaB.A00 = obj2;
                return c57182PaB.invokeSuspend(C0eB.A00);
            case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN /* 46 */:
                interfaceC23621Ds4 = (InterfaceC23621Ds) obj3;
                i4 = 46;
                C57182PaB c57182PaB2222222222222222222222222222222 = new C57182PaB(i4, interfaceC23621Ds4);
                c57182PaB2222222222222222222222222222222.A00 = obj;
                c57182PaB2222222222222222222222222222222.A01 = obj2;
                return c57182PaB2222222222222222222222222222222.invokeSuspend(C0eB.A00);
            case 47:
                interfaceC23621Ds4 = (InterfaceC23621Ds) obj3;
                i4 = 47;
                C57182PaB c57182PaB22222222222222222222222222222222 = new C57182PaB(i4, interfaceC23621Ds4);
                c57182PaB22222222222222222222222222222222.A00 = obj;
                c57182PaB22222222222222222222222222222222.A01 = obj2;
                return c57182PaB22222222222222222222222222222222.invokeSuspend(C0eB.A00);
            case 48:
                interfaceC23621Ds5 = (InterfaceC23621Ds) obj3;
                obj9 = this.A01;
                i5 = 48;
                C57182PaB c57182PaB3 = new C57182PaB(obj9, interfaceC23621Ds5, i5, 42);
                c57182PaB3.A00 = obj2;
                c57182PaB3.invokeSuspend(C0eB.A00);
                throw null;
            default:
                interfaceC23621Ds5 = (InterfaceC23621Ds) obj3;
                obj9 = this.A01;
                i5 = 49;
                C57182PaB c57182PaB32 = new C57182PaB(obj9, interfaceC23621Ds5, i5, 42);
                c57182PaB32.A00 = obj2;
                c57182PaB32.invokeSuspend(C0eB.A00);
                throw null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:323:0x0621, code lost:
    
        if (((X.C114775Gk) r36.A01).A01 != false) goto L253;
     */
    /* JADX WARN: Code restructure failed: missing block: B:339:0x067f, code lost:
    
        if (r3.size() < 2) goto L340;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:329:0x0779 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:330:0x0935 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:336:0x066c  */
    /* JADX WARN: Removed duplicated region for block: B:380:0x07c9 A[RETURN] */
    @Override // X.C1Dr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r37) {
        /*
            Method dump skipped, instructions count: 2508
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C57182PaB.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public static Object A00(Object obj, C57182PaB c57182PaB) {
        AbstractC09560e7.A00(obj);
        return c57182PaB.A00;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57182PaB(int i, InterfaceC23621Ds interfaceC23621Ds) {
        super(3, interfaceC23621Ds);
        this.A02 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57182PaB(Object obj, Object obj2, InterfaceC23621Ds interfaceC23621Ds, int i) {
        super(3, interfaceC23621Ds);
        this.A02 = i;
        this.A01 = obj;
        this.A00 = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57182PaB(Object obj, InterfaceC23621Ds interfaceC23621Ds, int i, int i2) {
        super(3, interfaceC23621Ds);
        this.A02 = i;
        this.A01 = obj;
    }
}
