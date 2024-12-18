package X;

import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.quicksnap.util.QuickSnapMediaSaver;
import com.instagram.react.modules.base.IgReactQEModule;
import go.Seq;
import java.util.List;

/* renamed from: X.PZj, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C57165PZj extends AbstractC23611Dp implements InterfaceC16620sF {
    public int A00;
    public Object A01;
    public Object A02;
    public final int A03;
    public final Object A04;

    public static PZI A01(Object obj, C57165PZj c57165PZj, int i) {
        PZI pzi = new PZI(obj, null, i);
        c57165PZj.A00 = 1;
        return pzi;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57165PZj(QuickSnapMediaSaver quickSnapMediaSaver, List list, InterfaceC23621Ds interfaceC23621Ds, int i) {
        super(2, interfaceC23621Ds);
        this.A03 = 29;
        this.A01 = list;
        this.A04 = quickSnapMediaSaver;
        this.A00 = i;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0003. Please report as an issue. */
    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        C57165PZj c57165PZj;
        Object obj2;
        Object obj3;
        int i;
        Object obj4;
        Object obj5;
        int i2;
        Object obj6;
        Object obj7;
        Object obj8;
        int i3;
        switch (this.A03) {
            case 0:
                obj8 = this.A04;
                obj7 = this.A01;
                obj6 = this.A02;
                i3 = 0;
                return new C57165PZj(obj7, obj8, obj6, interfaceC23621Ds, i3);
            case 1:
                obj8 = this.A04;
                obj7 = this.A01;
                obj6 = this.A02;
                i3 = 1;
                return new C57165PZj(obj7, obj8, obj6, interfaceC23621Ds, i3);
            case 2:
                obj2 = this.A04;
                obj3 = this.A01;
                i = 2;
                c57165PZj = new C57165PZj(obj2, obj3, interfaceC23621Ds, i);
                c57165PZj.A02 = obj;
                return c57165PZj;
            case 3:
                obj6 = this.A02;
                obj7 = this.A01;
                obj8 = this.A04;
                i3 = 3;
                return new C57165PZj(obj7, obj8, obj6, interfaceC23621Ds, i3);
            case 4:
                obj6 = this.A02;
                obj7 = this.A01;
                obj8 = this.A04;
                i3 = 4;
                return new C57165PZj(obj7, obj8, obj6, interfaceC23621Ds, i3);
            case 5:
                obj6 = this.A02;
                obj7 = this.A01;
                obj8 = this.A04;
                i3 = 5;
                return new C57165PZj(obj7, obj8, obj6, interfaceC23621Ds, i3);
            case 6:
                obj6 = this.A02;
                obj7 = this.A01;
                obj8 = this.A04;
                i3 = 6;
                return new C57165PZj(obj7, obj8, obj6, interfaceC23621Ds, i3);
            case 7:
                obj6 = this.A02;
                obj7 = this.A01;
                obj8 = this.A04;
                i3 = 7;
                return new C57165PZj(obj7, obj8, obj6, interfaceC23621Ds, i3);
            case 8:
                obj6 = this.A02;
                obj7 = this.A01;
                obj8 = this.A04;
                i3 = 8;
                return new C57165PZj(obj7, obj8, obj6, interfaceC23621Ds, i3);
            case 9:
                obj6 = this.A02;
                obj7 = this.A01;
                obj8 = this.A04;
                i3 = 9;
                return new C57165PZj(obj7, obj8, obj6, interfaceC23621Ds, i3);
            case 10:
                obj7 = this.A01;
                obj8 = this.A04;
                obj6 = this.A02;
                i3 = 10;
                return new C57165PZj(obj7, obj8, obj6, interfaceC23621Ds, i3);
            case 11:
                obj6 = this.A02;
                obj7 = this.A01;
                obj8 = this.A04;
                i3 = 11;
                return new C57165PZj(obj7, obj8, obj6, interfaceC23621Ds, i3);
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                obj6 = this.A02;
                obj7 = this.A01;
                obj8 = this.A04;
                i3 = 12;
                return new C57165PZj(obj7, obj8, obj6, interfaceC23621Ds, i3);
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                obj6 = this.A02;
                obj7 = this.A01;
                obj8 = this.A04;
                i3 = 13;
                return new C57165PZj(obj7, obj8, obj6, interfaceC23621Ds, i3);
            case 14:
                obj2 = this.A04;
                obj3 = this.A01;
                i = 14;
                c57165PZj = new C57165PZj(obj2, obj3, interfaceC23621Ds, i);
                c57165PZj.A02 = obj;
                return c57165PZj;
            case Process.SIGTERM /* 15 */:
                obj2 = this.A04;
                obj3 = this.A01;
                i = 15;
                c57165PZj = new C57165PZj(obj2, obj3, interfaceC23621Ds, i);
                c57165PZj.A02 = obj;
                return c57165PZj;
            case 16:
                obj4 = this.A04;
                obj5 = this.A01;
                i2 = 16;
                return new C57165PZj(obj4, obj5, interfaceC23621Ds, i2);
            case 17:
                C57165PZj c57165PZj2 = new C57165PZj((EK0) this.A04, interfaceC23621Ds);
                c57165PZj2.A01 = obj;
                return c57165PZj2;
            case 18:
                obj6 = this.A02;
                obj7 = this.A01;
                obj8 = this.A04;
                i3 = 18;
                return new C57165PZj(obj7, obj8, obj6, interfaceC23621Ds, i3);
            case Process.SIGSTOP /* 19 */:
                obj2 = this.A04;
                obj3 = this.A01;
                i = 19;
                c57165PZj = new C57165PZj(obj2, obj3, interfaceC23621Ds, i);
                c57165PZj.A02 = obj;
                return c57165PZj;
            case 20:
                obj6 = this.A02;
                obj7 = this.A01;
                obj8 = this.A04;
                i3 = 20;
                return new C57165PZj(obj7, obj8, obj6, interfaceC23621Ds, i3);
            case 21:
                obj6 = this.A02;
                obj7 = this.A01;
                obj8 = this.A04;
                i3 = 21;
                return new C57165PZj(obj7, obj8, obj6, interfaceC23621Ds, i3);
            case 22:
                obj6 = this.A02;
                obj7 = this.A01;
                obj8 = this.A04;
                i3 = 22;
                return new C57165PZj(obj7, obj8, obj6, interfaceC23621Ds, i3);
            case 23:
                obj4 = this.A04;
                obj5 = this.A01;
                i2 = 23;
                return new C57165PZj(obj4, obj5, interfaceC23621Ds, i2);
            case 24:
                obj6 = this.A02;
                obj7 = this.A01;
                obj8 = this.A04;
                i3 = 24;
                return new C57165PZj(obj7, obj8, obj6, interfaceC23621Ds, i3);
            case 25:
                obj6 = this.A02;
                obj7 = this.A01;
                obj8 = this.A04;
                i3 = 25;
                return new C57165PZj(obj7, obj8, obj6, interfaceC23621Ds, i3);
            case 26:
                obj6 = this.A02;
                obj7 = this.A01;
                obj8 = this.A04;
                i3 = 26;
                return new C57165PZj(obj7, obj8, obj6, interfaceC23621Ds, i3);
            case 27:
                obj6 = this.A02;
                obj7 = this.A01;
                obj8 = this.A04;
                i3 = 27;
                return new C57165PZj(obj7, obj8, obj6, interfaceC23621Ds, i3);
            case 28:
                obj4 = this.A04;
                obj5 = this.A01;
                i2 = 28;
                return new C57165PZj(obj4, obj5, interfaceC23621Ds, i2);
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                c57165PZj = new C57165PZj((QuickSnapMediaSaver) this.A04, (List) this.A01, interfaceC23621Ds, this.A00);
                c57165PZj.A02 = obj;
                return c57165PZj;
            case 30:
                obj2 = this.A04;
                obj3 = this.A01;
                i = 30;
                c57165PZj = new C57165PZj(obj2, obj3, interfaceC23621Ds, i);
                c57165PZj.A02 = obj;
                return c57165PZj;
            case 31:
                obj2 = this.A04;
                obj3 = this.A01;
                i = 31;
                c57165PZj = new C57165PZj(obj2, obj3, interfaceC23621Ds, i);
                c57165PZj.A02 = obj;
                return c57165PZj;
            case 32:
                obj6 = this.A02;
                obj7 = this.A01;
                obj8 = this.A04;
                i3 = 32;
                return new C57165PZj(obj7, obj8, obj6, interfaceC23621Ds, i3);
            case 33:
                c57165PZj = new C57165PZj(this.A04, this.A01, interfaceC23621Ds, 33);
                c57165PZj.A02 = obj;
                return c57165PZj;
            case 34:
                obj6 = this.A02;
                obj7 = this.A01;
                obj8 = this.A04;
                i3 = 34;
                return new C57165PZj(obj7, obj8, obj6, interfaceC23621Ds, i3);
            case 35:
                obj6 = this.A02;
                obj7 = this.A01;
                obj8 = this.A04;
                i3 = 35;
                return new C57165PZj(obj7, obj8, obj6, interfaceC23621Ds, i3);
            case 36:
                obj8 = this.A04;
                obj6 = this.A02;
                obj7 = this.A01;
                i3 = 36;
                return new C57165PZj(obj7, obj8, obj6, interfaceC23621Ds, i3);
            case 37:
                obj8 = this.A04;
                obj6 = this.A02;
                obj7 = this.A01;
                i3 = 37;
                return new C57165PZj(obj7, obj8, obj6, interfaceC23621Ds, i3);
            case 38:
                obj6 = this.A02;
                obj7 = this.A01;
                obj8 = this.A04;
                i3 = 38;
                return new C57165PZj(obj7, obj8, obj6, interfaceC23621Ds, i3);
            case 39:
                obj6 = this.A02;
                obj7 = this.A01;
                obj8 = this.A04;
                i3 = 39;
                return new C57165PZj(obj7, obj8, obj6, interfaceC23621Ds, i3);
            case 40:
                obj6 = this.A02;
                obj7 = this.A01;
                obj8 = this.A04;
                i3 = 40;
                return new C57165PZj(obj7, obj8, obj6, interfaceC23621Ds, i3);
            case Seq.NULL_REFNUM /* 41 */:
                obj6 = this.A02;
                obj7 = this.A01;
                obj8 = this.A04;
                i3 = 41;
                return new C57165PZj(obj7, obj8, obj6, interfaceC23621Ds, i3);
            case Seq.RefTracker.REF_OFFSET /* 42 */:
                obj6 = this.A02;
                obj7 = this.A01;
                obj8 = this.A04;
                i3 = 42;
                return new C57165PZj(obj7, obj8, obj6, interfaceC23621Ds, i3);
            case 43:
                obj6 = this.A02;
                obj7 = this.A01;
                obj8 = this.A04;
                i3 = 43;
                return new C57165PZj(obj7, obj8, obj6, interfaceC23621Ds, i3);
            case 44:
                obj6 = this.A02;
                obj7 = this.A01;
                obj8 = this.A04;
                i3 = 44;
                return new C57165PZj(obj7, obj8, obj6, interfaceC23621Ds, i3);
            case 45:
                obj6 = this.A02;
                obj7 = this.A01;
                obj8 = this.A04;
                i3 = 45;
                return new C57165PZj(obj7, obj8, obj6, interfaceC23621Ds, i3);
            case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN /* 46 */:
                obj7 = this.A01;
                obj8 = this.A04;
                obj6 = this.A02;
                i3 = 46;
                return new C57165PZj(obj7, obj8, obj6, interfaceC23621Ds, i3);
            case 47:
                obj7 = this.A01;
                obj8 = this.A04;
                obj6 = this.A02;
                i3 = 47;
                return new C57165PZj(obj7, obj8, obj6, interfaceC23621Ds, i3);
            case 48:
                obj6 = this.A02;
                obj7 = this.A01;
                obj8 = this.A04;
                i3 = 48;
                return new C57165PZj(obj7, obj8, obj6, interfaceC23621Ds, i3);
            default:
                obj7 = this.A01;
                obj8 = this.A04;
                obj6 = this.A02;
                i3 = 49;
                return new C57165PZj(obj7, obj8, obj6, interfaceC23621Ds, i3);
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0b1a A[RETURN] */
    /* JADX WARN: Type inference failed for: r7v19, types: [X.1rF, java.lang.Object] */
    @Override // X.C1Dr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r20) {
        /*
            Method dump skipped, instructions count: 3022
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C57165PZj.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public static C07T A00(Object obj, C57165PZj c57165PZj) {
        AbstractC09560e7.A00(obj);
        return ((C07X) c57165PZj.A02).getLifecycle();
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((C57165PZj) AbstractC166987dD.A1M(obj2, obj, this)).invokeSuspend(C0eB.A00);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57165PZj(EK0 ek0, InterfaceC23621Ds interfaceC23621Ds) {
        super(2, interfaceC23621Ds);
        this.A03 = 17;
        this.A04 = ek0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57165PZj(Object obj, Object obj2, InterfaceC23621Ds interfaceC23621Ds, int i) {
        super(2, interfaceC23621Ds);
        this.A03 = i;
        this.A04 = obj;
        this.A01 = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57165PZj(Object obj, Object obj2, Object obj3, InterfaceC23621Ds interfaceC23621Ds, int i) {
        super(2, interfaceC23621Ds);
        this.A03 = i;
        this.A01 = obj;
        this.A04 = obj2;
        this.A02 = obj3;
    }
}
