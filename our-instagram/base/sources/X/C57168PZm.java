package X;

import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.user.model.User;
import go.Seq;

/* renamed from: X.PZm, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C57168PZm extends AbstractC23611Dp implements InterfaceC16620sF {
    public int A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public final int A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57168PZm(InterfaceC23621Ds interfaceC23621Ds, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16620sF interfaceC16620sF) {
        super(2, interfaceC23621Ds);
        this.A04 = 44;
        this.A02 = interfaceC16820sZ;
        this.A01 = interfaceC16620sF;
    }

    public static void A01(Object obj, Object obj2, C57168PZm c57168PZm, int i) {
        c57168PZm.A01 = obj;
        c57168PZm.A02 = obj2;
        c57168PZm.A00 = i;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0003. Please report as an issue. */
    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        Object obj2;
        Object obj3;
        int i;
        C57168PZm c57168PZm;
        Object obj4;
        int i2;
        C56806PIx c56806PIx;
        User user;
        Integer num;
        int i3;
        Object obj5;
        int i4;
        Object obj6;
        Object obj7;
        int i5;
        Object obj8;
        Object obj9;
        Object obj10;
        int i6;
        switch (this.A04) {
            case 0:
                obj6 = this.A03;
                obj7 = this.A01;
                i5 = 0;
                c57168PZm = new C57168PZm(obj6, obj7, interfaceC23621Ds, i5);
                c57168PZm.A02 = obj;
                return c57168PZm;
            case 1:
                obj8 = this.A02;
                obj9 = this.A01;
                obj10 = this.A03;
                i6 = 1;
                return new C57168PZm(obj8, obj9, obj10, interfaceC23621Ds, i6);
            case 2:
                obj8 = this.A02;
                obj9 = this.A01;
                obj10 = this.A03;
                i6 = 2;
                return new C57168PZm(obj8, obj9, obj10, interfaceC23621Ds, i6);
            case 3:
                obj6 = this.A03;
                obj7 = this.A01;
                i5 = 3;
                c57168PZm = new C57168PZm(obj6, obj7, interfaceC23621Ds, i5);
                c57168PZm.A02 = obj;
                return c57168PZm;
            case 4:
                obj6 = this.A03;
                obj7 = this.A01;
                i5 = 4;
                c57168PZm = new C57168PZm(obj6, obj7, interfaceC23621Ds, i5);
                c57168PZm.A02 = obj;
                return c57168PZm;
            case 5:
                obj8 = this.A02;
                obj9 = this.A01;
                obj10 = this.A03;
                i6 = 5;
                return new C57168PZm(obj8, obj9, obj10, interfaceC23621Ds, i6);
            case 6:
                obj8 = this.A02;
                obj9 = this.A01;
                obj10 = this.A03;
                i6 = 6;
                return new C57168PZm(obj8, obj9, obj10, interfaceC23621Ds, i6);
            case 7:
                obj6 = this.A03;
                obj7 = this.A01;
                i5 = 7;
                c57168PZm = new C57168PZm(obj6, obj7, interfaceC23621Ds, i5);
                c57168PZm.A02 = obj;
                return c57168PZm;
            case 8:
                obj8 = this.A02;
                obj9 = this.A01;
                obj10 = this.A03;
                i6 = 8;
                return new C57168PZm(obj8, obj9, obj10, interfaceC23621Ds, i6);
            case 9:
                obj8 = this.A02;
                obj9 = this.A01;
                obj10 = this.A03;
                i6 = 9;
                return new C57168PZm(obj8, obj9, obj10, interfaceC23621Ds, i6);
            case 10:
                obj5 = this.A03;
                i4 = 10;
                C57168PZm c57168PZm2 = new C57168PZm(obj5, interfaceC23621Ds, i4);
                c57168PZm2.A01 = obj;
                return c57168PZm2;
            case 11:
                obj5 = this.A03;
                i4 = 11;
                C57168PZm c57168PZm22 = new C57168PZm(obj5, interfaceC23621Ds, i4);
                c57168PZm22.A01 = obj;
                return c57168PZm22;
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                obj10 = this.A03;
                obj8 = this.A02;
                obj9 = this.A01;
                i6 = 12;
                return new C57168PZm(obj8, obj9, obj10, interfaceC23621Ds, i6);
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                obj10 = this.A03;
                obj8 = this.A02;
                obj9 = this.A01;
                i6 = 13;
                return new C57168PZm(obj8, obj9, obj10, interfaceC23621Ds, i6);
            case 14:
                obj5 = this.A03;
                i4 = 14;
                C57168PZm c57168PZm222 = new C57168PZm(obj5, interfaceC23621Ds, i4);
                c57168PZm222.A01 = obj;
                return c57168PZm222;
            case Process.SIGTERM /* 15 */:
                obj5 = this.A03;
                i4 = 15;
                C57168PZm c57168PZm2222 = new C57168PZm(obj5, interfaceC23621Ds, i4);
                c57168PZm2222.A01 = obj;
                return c57168PZm2222;
            case 16:
                obj9 = this.A01;
                obj10 = this.A03;
                obj8 = this.A02;
                i6 = 16;
                return new C57168PZm(obj8, obj9, obj10, interfaceC23621Ds, i6);
            case 17:
                obj10 = this.A03;
                obj8 = this.A02;
                obj9 = this.A01;
                i6 = 17;
                return new C57168PZm(obj8, obj9, obj10, interfaceC23621Ds, i6);
            case 18:
                obj10 = this.A03;
                obj8 = this.A02;
                obj9 = this.A01;
                i6 = 18;
                return new C57168PZm(obj8, obj9, obj10, interfaceC23621Ds, i6);
            case Process.SIGSTOP /* 19 */:
                obj5 = this.A03;
                i4 = 19;
                C57168PZm c57168PZm22222 = new C57168PZm(obj5, interfaceC23621Ds, i4);
                c57168PZm22222.A01 = obj;
                return c57168PZm22222;
            case 20:
                obj10 = this.A03;
                obj8 = this.A02;
                obj9 = this.A01;
                i6 = 20;
                return new C57168PZm(obj8, obj9, obj10, interfaceC23621Ds, i6);
            case 21:
                obj10 = this.A03;
                obj9 = this.A01;
                obj8 = this.A02;
                i6 = 21;
                return new C57168PZm(obj8, obj9, obj10, interfaceC23621Ds, i6);
            case 22:
                obj10 = this.A03;
                obj8 = this.A02;
                obj9 = this.A01;
                i6 = 22;
                return new C57168PZm(obj8, obj9, obj10, interfaceC23621Ds, i6);
            case 23:
                obj10 = this.A03;
                obj9 = this.A01;
                obj8 = this.A02;
                i6 = 23;
                return new C57168PZm(obj8, obj9, obj10, interfaceC23621Ds, i6);
            case 24:
                obj10 = this.A03;
                obj8 = this.A02;
                obj9 = this.A01;
                i6 = 24;
                return new C57168PZm(obj8, obj9, obj10, interfaceC23621Ds, i6);
            case 25:
                obj10 = this.A03;
                obj8 = this.A02;
                obj9 = this.A01;
                i6 = 25;
                return new C57168PZm(obj8, obj9, obj10, interfaceC23621Ds, i6);
            case 26:
                obj8 = this.A02;
                obj10 = this.A03;
                obj9 = this.A01;
                i6 = 26;
                return new C57168PZm(obj8, obj9, obj10, interfaceC23621Ds, i6);
            case 27:
                obj5 = this.A03;
                i4 = 27;
                C57168PZm c57168PZm222222 = new C57168PZm(obj5, interfaceC23621Ds, i4);
                c57168PZm222222.A01 = obj;
                return c57168PZm222222;
            case 28:
                obj4 = this.A03;
                i2 = 28;
                return new C57168PZm(obj4, interfaceC23621Ds, i2);
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                c56806PIx = (C56806PIx) this.A03;
                user = (User) this.A01;
                num = (Integer) this.A02;
                i3 = 29;
                return new C57168PZm(user, c56806PIx, num, interfaceC23621Ds, i3);
            case 30:
                c56806PIx = (C56806PIx) this.A03;
                user = (User) this.A02;
                num = (Integer) this.A01;
                i3 = 30;
                return new C57168PZm(user, c56806PIx, num, interfaceC23621Ds, i3);
            case 31:
                obj8 = this.A02;
                obj9 = this.A01;
                obj10 = this.A03;
                i6 = 31;
                return new C57168PZm(obj8, obj9, obj10, interfaceC23621Ds, i6);
            case 32:
                obj8 = this.A02;
                obj9 = this.A01;
                obj10 = this.A03;
                i6 = 32;
                return new C57168PZm(obj8, obj9, obj10, interfaceC23621Ds, i6);
            case 33:
                obj4 = this.A03;
                i2 = 33;
                return new C57168PZm(obj4, interfaceC23621Ds, i2);
            case 34:
                obj8 = this.A02;
                obj10 = this.A03;
                obj9 = this.A01;
                i6 = 34;
                return new C57168PZm(obj8, obj9, obj10, interfaceC23621Ds, i6);
            case 35:
                obj8 = this.A02;
                obj9 = this.A01;
                obj10 = this.A03;
                i6 = 35;
                return new C57168PZm(obj8, obj9, obj10, interfaceC23621Ds, i6);
            case 36:
                obj8 = this.A02;
                obj9 = this.A01;
                obj10 = this.A03;
                i6 = 36;
                return new C57168PZm(obj8, obj9, obj10, interfaceC23621Ds, i6);
            case 37:
                obj8 = this.A02;
                obj9 = this.A01;
                obj10 = this.A03;
                i6 = 37;
                return new C57168PZm(obj8, obj9, obj10, interfaceC23621Ds, i6);
            case 38:
                obj8 = this.A02;
                obj9 = this.A01;
                obj10 = this.A03;
                i6 = 38;
                return new C57168PZm(obj8, obj9, obj10, interfaceC23621Ds, i6);
            case 39:
                obj10 = this.A03;
                obj9 = this.A01;
                obj8 = this.A02;
                i6 = 39;
                return new C57168PZm(obj8, obj9, obj10, interfaceC23621Ds, i6);
            case 40:
                obj10 = this.A03;
                obj8 = this.A02;
                obj9 = this.A01;
                i6 = 40;
                return new C57168PZm(obj8, obj9, obj10, interfaceC23621Ds, i6);
            case Seq.NULL_REFNUM /* 41 */:
                obj10 = this.A03;
                obj8 = this.A02;
                obj9 = this.A01;
                i6 = 41;
                return new C57168PZm(obj8, obj9, obj10, interfaceC23621Ds, i6);
            case Seq.RefTracker.REF_OFFSET /* 42 */:
                obj4 = this.A03;
                i2 = 42;
                return new C57168PZm(obj4, interfaceC23621Ds, i2);
            case 43:
                obj8 = this.A02;
                obj10 = this.A03;
                obj9 = this.A01;
                i6 = 43;
                return new C57168PZm(obj8, obj9, obj10, interfaceC23621Ds, i6);
            case 44:
                C57168PZm c57168PZm3 = new C57168PZm(interfaceC23621Ds, (InterfaceC16820sZ) this.A02, (InterfaceC16620sF) this.A01);
                c57168PZm3.A03 = obj;
                return c57168PZm3;
            case 45:
                obj2 = this.A01;
                obj3 = this.A03;
                i = 45;
                c57168PZm = new C57168PZm(obj3, obj2, interfaceC23621Ds, i);
                c57168PZm.A02 = obj;
                return c57168PZm;
            case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN /* 46 */:
                obj2 = this.A01;
                obj3 = this.A03;
                i = 46;
                c57168PZm = new C57168PZm(obj3, obj2, interfaceC23621Ds, i);
                c57168PZm.A02 = obj;
                return c57168PZm;
            case 47:
                obj9 = this.A01;
                obj10 = this.A03;
                obj8 = this.A02;
                i6 = 47;
                return new C57168PZm(obj8, obj9, obj10, interfaceC23621Ds, i6);
            case 48:
                obj8 = this.A02;
                obj9 = this.A01;
                obj10 = this.A03;
                i6 = 48;
                return new C57168PZm(obj8, obj9, obj10, interfaceC23621Ds, i6);
            default:
                obj8 = this.A02;
                obj9 = this.A01;
                obj10 = this.A03;
                i6 = 49;
                return new C57168PZm(obj8, obj9, obj10, interfaceC23621Ds, i6);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x138f, code lost:
    
        if (r0 == r3) goto L817;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:147:0x031e. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:172:0x035f. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x167d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:154:0x06b2  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x05c5  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x05db A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:181:0x03b4  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x046e  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x049e  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x04ab  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x04e5  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x056a  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x05f7  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0601  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x063d A[LOOP:1: B:256:0x0637->B:258:0x063d, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:262:0x066a  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x06a9  */
    /* JADX WARN: Removed duplicated region for block: B:268:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:269:0x0647  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x0580  */
    /* JADX WARN: Removed duplicated region for block: B:420:0x0b94  */
    /* JADX WARN: Removed duplicated region for block: B:462:0x0a5d  */
    /* JADX WARN: Removed duplicated region for block: B:465:0x0a92 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:468:0x0aab  */
    /* JADX WARN: Removed duplicated region for block: B:499:0x0a93  */
    /* JADX WARN: Removed duplicated region for block: B:538:0x0c90  */
    /* JADX WARN: Removed duplicated region for block: B:612:0x0df5  */
    /* JADX WARN: Removed duplicated region for block: B:755:0x1138  */
    /* JADX WARN: Removed duplicated region for block: B:815:0x1375  */
    /* JADX WARN: Type inference failed for: r0v0, types: [X.PZm, X.1Ds, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v29, types: [X.PZm] */
    /* JADX WARN: Type inference failed for: r0v33, types: [X.OaE] */
    /* JADX WARN: Type inference failed for: r10v11, types: [com.instagram.video.live.mvvm.viewmodel.optionsdialog.IgLiveOptionsDialogViewModel] */
    /* JADX WARN: Type inference failed for: r10v21, types: [com.instagram.video.live.mvvm.model.repository.IgLiveCobroadcastRepository] */
    /* JADX WARN: Type inference failed for: r10v24, types: [com.instagram.video.live.mvvm.model.repository.IgLiveCobroadcastRepository] */
    /* JADX WARN: Type inference failed for: r11v16, types: [java.lang.Object, com.instagram.video.live.mvvm.viewmodel.optionsdialog.IgLiveOptionsDialogViewModel] */
    /* JADX WARN: Type inference failed for: r11v20, types: [com.instagram.video.live.mvvm.viewmodel.optionsdialog.IgLiveOptionsDialogViewModel] */
    /* JADX WARN: Type inference failed for: r11v25, types: [com.instagram.video.live.mvvm.viewmodel.optionsdialog.IgLiveOptionsDialogViewModel] */
    /* JADX WARN: Type inference failed for: r1v188, types: [com.instagram.video.live.mvvm.model.datasource.api.IgLiveModerationApi] */
    /* JADX WARN: Type inference failed for: r1v200, types: [com.instagram.video.live.mvvm.model.repository.IgLiveCommentsRepository] */
    /* JADX WARN: Type inference failed for: r1v404, types: [com.instagram.video.live.mvvm.model.repository.IgLiveCobroadcastRepository] */
    /* JADX WARN: Type inference failed for: r2v22, types: [X.1Ir, X.1Iq] */
    /* JADX WARN: Type inference failed for: r2v27, types: [com.instagram.video.live.mvvm.model.repository.IgLiveViewerJoinFlowRepository] */
    /* JADX WARN: Type inference failed for: r3v1, types: [X.0sF] */
    /* JADX WARN: Type inference failed for: r3v152, types: [com.instagram.video.live.mvvm.model.repository.IgLiveCobroadcastRepository] */
    /* JADX WARN: Type inference failed for: r3v18, types: [com.instagram.wonderwall.repository.WallPostRepository] */
    /* JADX WARN: Type inference failed for: r3v5, types: [X.0sD] */
    /* JADX WARN: Type inference failed for: r3v57, types: [com.instagram.video.live.mvvm.model.repository.IgLiveModerationRepository] */
    /* JADX WARN: Type inference failed for: r3v7, types: [X.0sE] */
    /* JADX WARN: Type inference failed for: r3v89, types: [X.1Ir, X.1Iq] */
    /* JADX WARN: Type inference failed for: r3v90, types: [com.instagram.video.live.mvvm.model.repository.IgLiveCobroadcastRepository] */
    /* JADX WARN: Type inference failed for: r4v105, types: [X.1Ir, X.1Iq] */
    /* JADX WARN: Type inference failed for: r4v11, types: [X.OeF] */
    /* JADX WARN: Type inference failed for: r4v12, types: [com.instagram.wonderwall.repository.WallPostRepository] */
    /* JADX WARN: Type inference failed for: r4v128, types: [com.instagram.video.live.mvvm.model.repository.IgLiveCobroadcastRepository] */
    /* JADX WARN: Type inference failed for: r4v179, types: [X.1Ir, X.1Iq] */
    /* JADX WARN: Type inference failed for: r4v183, types: [X.1Ir] */
    /* JADX WARN: Type inference failed for: r4v190, types: [X.0py] */
    /* JADX WARN: Type inference failed for: r4v203 */
    /* JADX WARN: Type inference failed for: r4v204 */
    /* JADX WARN: Type inference failed for: r4v205 */
    /* JADX WARN: Type inference failed for: r4v21, types: [X.0rm] */
    /* JADX WARN: Type inference failed for: r4v23, types: [X.PpJ] */
    /* JADX WARN: Type inference failed for: r4v38, types: [X.1Ir, X.1Iq] */
    /* JADX WARN: Type inference failed for: r4v45, types: [X.MTU] */
    /* JADX WARN: Type inference failed for: r4v51, types: [X.MTU] */
    /* JADX WARN: Type inference failed for: r4v7, types: [com.instagram.zero.main.IgZeroMain] */
    /* JADX WARN: Type inference failed for: r5v104, types: [X.0py] */
    /* JADX WARN: Type inference failed for: r5v108, types: [X.0py] */
    /* JADX WARN: Type inference failed for: r5v112, types: [X.0xP] */
    /* JADX WARN: Type inference failed for: r5v115 */
    /* JADX WARN: Type inference failed for: r5v116 */
    /* JADX WARN: Type inference failed for: r5v117 */
    /* JADX WARN: Type inference failed for: r5v118 */
    /* JADX WARN: Type inference failed for: r5v119 */
    /* JADX WARN: Type inference failed for: r5v120 */
    /* JADX WARN: Type inference failed for: r5v18, types: [X.1Ir, X.1Iq] */
    /* JADX WARN: Type inference failed for: r5v21, types: [X.MTU] */
    /* JADX WARN: Type inference failed for: r5v22, types: [X.MTU] */
    /* JADX WARN: Type inference failed for: r5v28, types: [X.1Ir, X.1Iq] */
    /* JADX WARN: Type inference failed for: r5v5, types: [X.058] */
    /* JADX WARN: Type inference failed for: r5v59, types: [X.1Ir, X.1Iq] */
    /* JADX WARN: Type inference failed for: r5v81, types: [com.instagram.video.live.mvvm.model.repository.IgLiveCobroadcastRepository] */
    /* JADX WARN: Type inference failed for: r5v87, types: [com.instagram.video.live.mvvm.model.repository.IgLiveCobroadcastRepository] */
    /* JADX WARN: Type inference failed for: r5v88, types: [X.1Ir, X.1Iq] */
    /* JADX WARN: Type inference failed for: r5v94, types: [X.1Ir] */
    /* JADX WARN: Type inference failed for: r6v1, types: [X.0xP] */
    /* JADX WARN: Type inference failed for: r6v103, types: [X.0xP] */
    /* JADX WARN: Type inference failed for: r6v104 */
    /* JADX WARN: Type inference failed for: r6v105 */
    /* JADX WARN: Type inference failed for: r6v23, types: [X.1Ir, X.1Iq] */
    /* JADX WARN: Type inference failed for: r6v3, types: [X.0xP] */
    /* JADX WARN: Type inference failed for: r6v43, types: [X.1Ir] */
    /* JADX WARN: Type inference failed for: r6v53, types: [X.1Ir, X.1Iq] */
    /* JADX WARN: Type inference failed for: r6v55, types: [com.instagram.video.live.mvvm.model.repository.IgLiveCobroadcastRepository] */
    /* JADX WARN: Type inference failed for: r7v105 */
    /* JADX WARN: Type inference failed for: r7v106 */
    /* JADX WARN: Type inference failed for: r7v107 */
    /* JADX WARN: Type inference failed for: r7v35, types: [com.instagram.video.live.mvvm.viewmodel.optionsdialog.IgLiveOptionsDialogViewModel] */
    /* JADX WARN: Type inference failed for: r7v36, types: [com.instagram.video.live.mvvm.model.datasource.api.IgLiveFollowStatusApi] */
    /* JADX WARN: Type inference failed for: r7v48, types: [X.MTU] */
    /* JADX WARN: Type inference failed for: r7v66, types: [X.1Ir, X.1Iq] */
    /* JADX WARN: Type inference failed for: r7v81, types: [X.1Ir, X.1Iq] */
    /* JADX WARN: Type inference failed for: r7v86, types: [X.1Ir, X.1Iq] */
    /* JADX WARN: Type inference failed for: r9v0, types: [X.0oO, java.lang.Object] */
    @Override // X.C1Dr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r20) {
        /*
            Method dump skipped, instructions count: 5972
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C57168PZm.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public static C07T A00(Object obj, C57168PZm c57168PZm) {
        AbstractC09560e7.A00(obj);
        return ((C07X) c57168PZm.A02).getLifecycle();
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((C57168PZm) AbstractC166987dD.A1M(obj2, obj, this)).invokeSuspend(C0eB.A00);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57168PZm(Object obj, Object obj2, Object obj3, InterfaceC23621Ds interfaceC23621Ds, int i) {
        super(2, interfaceC23621Ds);
        this.A04 = i;
        this.A02 = obj;
        this.A01 = obj2;
        this.A03 = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57168PZm(Object obj, Object obj2, InterfaceC23621Ds interfaceC23621Ds, int i) {
        super(2, interfaceC23621Ds);
        this.A04 = i;
        this.A03 = obj;
        this.A01 = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57168PZm(User user, C56806PIx c56806PIx, Integer num, InterfaceC23621Ds interfaceC23621Ds, int i) {
        super(2, interfaceC23621Ds);
        this.A04 = i;
        this.A03 = c56806PIx;
        if (29 - i != 0) {
            this.A02 = user;
            this.A01 = num;
        } else {
            this.A01 = user;
            this.A02 = num;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57168PZm(Object obj, InterfaceC23621Ds interfaceC23621Ds, int i) {
        super(2, interfaceC23621Ds);
        this.A04 = i;
        this.A03 = obj;
    }
}
